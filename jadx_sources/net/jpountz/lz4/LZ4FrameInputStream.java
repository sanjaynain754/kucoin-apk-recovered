package net.jpountz.lz4;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;
import net.jpountz.xxhash.AbstractC42824c;
import net.jpountz.xxhash.C42826e;

/* JADX INFO: loaded from: classes61.dex */
public class LZ4FrameInputStream extends FilterInputStream {
    static final String BLOCK_HASH_MISMATCH = "Block checksum mismatch";
    static final String DESCRIPTOR_HASH_MISMATCH = "Stream frame descriptor corrupted";
    static final int MAGIC_SKIPPABLE_BASE = 407710288;
    static final String NOT_SUPPORTED = "Stream unsupported";
    static final String PREMATURE_EOS = "Stream ended prematurely";
    private ByteBuffer buffer;
    private final AbstractC42824c checksum;
    private byte[] compressedBuffer;
    private final LZ4SafeDecompressor decompressor;
    private long expectedContentSize;
    private boolean firstFrameHeaderRead;
    private LZ4FrameOutputStream.FrameInfo frameInfo;
    private final byte[] headerArray;
    private final ByteBuffer headerBuffer;
    private int maxBlockSize;
    private byte[] rawBuffer;
    private final ByteBuffer readNumberBuff;
    private final boolean readSingleFrame;
    private long totalContentSize;

    public LZ4FrameInputStream(InputStream inputStream) throws IOException {
        this(inputStream, LZ4Factory.fastestInstance().safeDecompressor(), C42826e.m93891b().m93897d());
    }

    private boolean nextFrameInfo() throws IOException {
        while (true) {
            int i11 = 0;
            do {
                int i12 = ((FilterInputStream) this).in.read(this.readNumberBuff.array(), i11, 4 - i11);
                if (i12 < 0) {
                    if (!this.firstFrameHeaderRead) {
                        throw new IOException(PREMATURE_EOS);
                    }
                    if (i11 <= 0) {
                        return false;
                    }
                    throw new IOException(PREMATURE_EOS);
                }
                i11 += i12;
            } while (i11 < 4);
            int i13 = this.readNumberBuff.getInt(0);
            if (i13 == 407708164) {
                readHeader();
                return true;
            }
            if ((i13 >>> 4) != 25481893) {
                throw new IOException(NOT_SUPPORTED);
            }
            skippableFrame();
        }
    }

    private int readInt(InputStream inputStream) throws IOException {
        int i11 = 0;
        do {
            int i12 = inputStream.read(this.readNumberBuff.array(), i11, 4 - i11);
            if (i12 < 0) {
                throw new IOException(PREMATURE_EOS);
            }
            i11 += i12;
        } while (i11 < 4);
        return this.readNumberBuff.getInt(0);
    }

    private long readLong(InputStream inputStream) throws IOException {
        int i11 = 0;
        do {
            int i12 = inputStream.read(this.readNumberBuff.array(), i11, 8 - i11);
            if (i12 < 0) {
                throw new IOException(PREMATURE_EOS);
            }
            i11 += i12;
        } while (i11 < 8);
        return this.readNumberBuff.getLong(0);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i11) {
        throw new UnsupportedOperationException("mark not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        while (true) {
            if (this.firstFrameHeaderRead && this.buffer.remaining() != 0) {
                return this.buffer.get() & 255;
            }
            if ((!this.firstFrameHeaderRead || this.frameInfo.isFinished()) && ((this.firstFrameHeaderRead && this.readSingleFrame) || !nextFrameInfo())) {
                return -1;
            }
            readBlock();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        throw new UnsupportedOperationException("reset not supported");
    }

    public LZ4FrameInputStream(InputStream inputStream, boolean z11) throws IOException {
        this(inputStream, LZ4Factory.fastestInstance().safeDecompressor(), C42826e.m93891b().m93897d(), z11);
    }

    private void readBlock() throws IOException {
        int i11 = readInt(((FilterInputStream) this).in);
        boolean z11 = (Integer.MIN_VALUE & i11) == 0;
        int iDecompress = i11 & Integer.MAX_VALUE;
        if (iDecompress == 0) {
            if (this.frameInfo.isEnabled(LZ4FrameOutputStream.FLG.Bits.CONTENT_CHECKSUM) && readInt(((FilterInputStream) this).in) != this.frameInfo.currentStreamHash()) {
                throw new IOException("Content checksum mismatch");
            }
            if (this.frameInfo.isEnabled(LZ4FrameOutputStream.FLG.Bits.CONTENT_SIZE) && this.expectedContentSize != this.totalContentSize) {
                throw new IOException("Size check mismatch");
            }
            this.frameInfo.finish();
            return;
        }
        byte[] bArr = z11 ? this.compressedBuffer : this.rawBuffer;
        if (iDecompress > this.maxBlockSize) {
            throw new IOException(String.format(Locale.ROOT, "Block size %s exceeded max: %s", Integer.valueOf(iDecompress), Integer.valueOf(this.maxBlockSize)));
        }
        int i12 = 0;
        while (i12 < iDecompress) {
            int i13 = ((FilterInputStream) this).in.read(bArr, i12, iDecompress - i12);
            if (i13 < 0) {
                throw new IOException(PREMATURE_EOS);
            }
            i12 += i13;
        }
        if (this.frameInfo.isEnabled(LZ4FrameOutputStream.FLG.Bits.BLOCK_CHECKSUM) && readInt(((FilterInputStream) this).in) != this.checksum.m93889a(bArr, 0, iDecompress, 0)) {
            throw new IOException(BLOCK_HASH_MISMATCH);
        }
        if (z11) {
            try {
                LZ4SafeDecompressor lZ4SafeDecompressor = this.decompressor;
                byte[] bArr2 = this.rawBuffer;
                iDecompress = lZ4SafeDecompressor.decompress(bArr, 0, iDecompress, bArr2, 0, bArr2.length);
            } catch (LZ4Exception e11) {
                throw new IOException(e11);
            }
        }
        if (this.frameInfo.isEnabled(LZ4FrameOutputStream.FLG.Bits.CONTENT_CHECKSUM)) {
            this.frameInfo.updateStreamHash(this.rawBuffer, 0, iDecompress);
        }
        this.totalContentSize += (long) iDecompress;
        this.buffer.limit(iDecompress);
        this.buffer.rewind();
    }

    private void readHeader() throws IOException {
        this.headerBuffer.rewind();
        int i11 = ((FilterInputStream) this).in.read();
        if (i11 < 0) {
            throw new IOException(PREMATURE_EOS);
        }
        int i12 = ((FilterInputStream) this).in.read();
        if (i12 < 0) {
            throw new IOException(PREMATURE_EOS);
        }
        byte b11 = (byte) (i11 & 255);
        LZ4FrameOutputStream.FLG flgFromByte = LZ4FrameOutputStream.FLG.fromByte(b11);
        this.headerBuffer.put(b11);
        byte b12 = (byte) (i12 & 255);
        LZ4FrameOutputStream.C42819BD c42819bdFromByte = LZ4FrameOutputStream.C42819BD.fromByte(b12);
        this.headerBuffer.put(b12);
        this.frameInfo = new LZ4FrameOutputStream.FrameInfo(flgFromByte, c42819bdFromByte);
        if (flgFromByte.isEnabled(LZ4FrameOutputStream.FLG.Bits.CONTENT_SIZE)) {
            long j11 = readLong(((FilterInputStream) this).in);
            this.expectedContentSize = j11;
            this.headerBuffer.putLong(j11);
        }
        this.totalContentSize = 0L;
        byte bM93889a = (byte) ((this.checksum.m93889a(this.headerArray, 0, this.headerBuffer.position(), 0) >> 8) & 255);
        int i13 = ((FilterInputStream) this).in.read();
        if (i13 < 0) {
            throw new IOException(PREMATURE_EOS);
        }
        if (bM93889a != ((byte) (i13 & 255))) {
            throw new IOException(DESCRIPTOR_HASH_MISMATCH);
        }
        int blockMaximumSize = this.frameInfo.getBD().getBlockMaximumSize();
        this.maxBlockSize = blockMaximumSize;
        this.compressedBuffer = new byte[blockMaximumSize];
        byte[] bArr = new byte[blockMaximumSize];
        this.rawBuffer = bArr;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.buffer = byteBufferWrap;
        byteBufferWrap.limit(0);
        this.firstFrameHeaderRead = true;
    }

    private void skippableFrame() throws IOException {
        int i11 = readInt(((FilterInputStream) this).in);
        byte[] bArr = new byte[1024];
        while (i11 > 0) {
            int i12 = ((FilterInputStream) this).in.read(bArr, 0, Math.min(i11, 1024));
            if (i12 < 0) {
                throw new IOException(PREMATURE_EOS);
            }
            i11 -= i12;
        }
        this.firstFrameHeaderRead = true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return this.buffer.remaining();
    }

    public long getExpectedContentSize() throws IOException {
        if (!this.readSingleFrame) {
            throw new UnsupportedOperationException("Operation not permitted when multiple frames can be read");
        }
        if (this.firstFrameHeaderRead || nextFrameInfo()) {
            return this.expectedContentSize;
        }
        return -1L;
    }

    public boolean isExpectedContentSizeDefined() throws IOException {
        return this.readSingleFrame && (this.firstFrameHeaderRead || nextFrameInfo()) && this.expectedContentSize >= 0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j11) throws IOException {
        if (j11 <= 0) {
            return 0L;
        }
        while (true) {
            if (this.firstFrameHeaderRead && this.buffer.remaining() != 0) {
                long jMin = Math.min(j11, this.buffer.remaining());
                ByteBuffer byteBuffer = this.buffer;
                byteBuffer.position(byteBuffer.position() + ((int) jMin));
                return jMin;
            }
            if ((!this.firstFrameHeaderRead || this.frameInfo.isFinished()) && ((this.firstFrameHeaderRead && this.readSingleFrame) || !nextFrameInfo())) {
                return 0L;
            }
            readBlock();
        }
    }

    public LZ4FrameInputStream(InputStream inputStream, LZ4SafeDecompressor lZ4SafeDecompressor, AbstractC42824c abstractC42824c) throws IOException {
        this(inputStream, lZ4SafeDecompressor, abstractC42824c, false);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
    }

    public LZ4FrameInputStream(InputStream inputStream, LZ4SafeDecompressor lZ4SafeDecompressor, AbstractC42824c abstractC42824c, boolean z11) throws IOException {
        super(inputStream);
        byte[] bArr = new byte[15];
        this.headerArray = bArr;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.headerBuffer = byteBufferWrap.order(byteOrder);
        this.buffer = null;
        this.rawBuffer = null;
        this.maxBlockSize = -1;
        this.expectedContentSize = -1L;
        this.totalContentSize = 0L;
        this.firstFrameHeaderRead = false;
        this.frameInfo = null;
        this.readNumberBuff = ByteBuffer.allocate(8).order(byteOrder);
        this.decompressor = lZ4SafeDecompressor;
        this.checksum = abstractC42824c;
        this.readSingleFrame = z11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        if (i11 < 0 || i12 < 0 || i11 + i12 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        while (true) {
            if (this.firstFrameHeaderRead && this.buffer.remaining() != 0) {
                int iMin = Math.min(i12, this.buffer.remaining());
                this.buffer.get(bArr, i11, iMin);
                return iMin;
            }
            if ((!this.firstFrameHeaderRead || this.frameInfo.isFinished()) && ((this.firstFrameHeaderRead && this.readSingleFrame) || !nextFrameInfo())) {
                return -1;
            }
            readBlock();
        }
    }
}
