package net.jpountz.lz4;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Locale;
import net.jpountz.xxhash.AbstractC42822a;
import net.jpountz.xxhash.AbstractC42824c;
import net.jpountz.xxhash.C42826e;

/* JADX INFO: loaded from: classes61.dex */
public class LZ4FrameOutputStream extends FilterOutputStream {
    static final String CLOSED_STREAM = "The stream is already closed";
    static final FLG.Bits[] DEFAULT_FEATURES = {FLG.Bits.BLOCK_INDEPENDENCE};
    static final int INTEGER_BYTES = 4;
    static final int LONG_BYTES = 8;
    static final int LZ4_FRAME_INCOMPRESSIBLE_MASK = Integer.MIN_VALUE;
    static final int LZ4_MAX_HEADER_LENGTH = 15;
    static final int MAGIC = 407708164;
    private final ByteBuffer buffer;
    private final AbstractC42824c checksum;
    private final byte[] compressedBuffer;
    private final LZ4Compressor compressor;
    private FrameInfo frameInfo;
    private final ByteBuffer intLEBuffer;
    private final long knownSize;
    private final int maxBlockSize;

    /* JADX INFO: renamed from: net.jpountz.lz4.LZ4FrameOutputStream$BD */
    public static class C42819BD {
        private static final int RESERVED_MASK = 143;
        private final BLOCKSIZE blockSizeValue;

        private C42819BD(BLOCKSIZE blocksize) {
            this.blockSizeValue = blocksize;
        }

        public static C42819BD fromByte(byte b11) {
            int i11 = (b11 >>> 4) & 7;
            if ((b11 & 143) <= 0) {
                return new C42819BD(BLOCKSIZE.valueOf(i11));
            }
            throw new RuntimeException("Reserved fields must be 0");
        }

        public int getBlockMaximumSize() {
            return 1 << ((this.blockSizeValue.getIndicator() * 2) + 8);
        }

        public byte toByte() {
            return (byte) ((this.blockSizeValue.getIndicator() & 7) << 4);
        }
    }

    public enum BLOCKSIZE {
        SIZE_64KB(4),
        SIZE_256KB(5),
        SIZE_1MB(6),
        SIZE_4MB(7);

        private final int indicator;

        public static BLOCKSIZE valueOf(int i11) {
            if (i11 == 4) {
                return SIZE_64KB;
            }
            if (i11 == 5) {
                return SIZE_256KB;
            }
            if (i11 == 6) {
                return SIZE_1MB;
            }
            if (i11 == 7) {
                return SIZE_4MB;
            }
            throw new IllegalArgumentException(String.format(Locale.ROOT, "Block size must be 4-7. Cannot use value of [%d]", Integer.valueOf(i11)));
        }

        public int getIndicator() {
            return this.indicator;
        }

        BLOCKSIZE(int i11) {
            this.indicator = i11;
        }
    }

    public static class FLG {
        private static final int DEFAULT_VERSION = 1;
        private final BitSet bitSet;
        private final int version;

        public enum Bits {
            RESERVED_0(0),
            RESERVED_1(1),
            CONTENT_CHECKSUM(2),
            CONTENT_SIZE(3),
            BLOCK_CHECKSUM(4),
            BLOCK_INDEPENDENCE(5);

            private final int position;

            Bits(int i11) {
                this.position = i11;
            }
        }

        public FLG(int i11, Bits... bitsArr) {
            this.bitSet = new BitSet(8);
            this.version = i11;
            if (bitsArr != null) {
                for (Bits bits : bitsArr) {
                    this.bitSet.set(bits.position);
                }
            }
            validate();
        }

        public static FLG fromByte(byte b11) {
            byte b12 = (byte) (b11 & 192);
            return new FLG(b12 >>> 6, (byte) (b11 ^ b12));
        }

        private void validate() {
            if (this.bitSet.get(Bits.RESERVED_0.position)) {
                throw new RuntimeException("Reserved0 field must be 0");
            }
            if (this.bitSet.get(Bits.RESERVED_1.position)) {
                throw new RuntimeException("Reserved1 field must be 0");
            }
            if (!this.bitSet.get(Bits.BLOCK_INDEPENDENCE.position)) {
                throw new RuntimeException("Dependent block stream is unsupported (BLOCK_INDEPENDENCE must be set)");
            }
            if (this.version != 1) {
                throw new RuntimeException(String.format(Locale.ROOT, "Version %d is unsupported", Integer.valueOf(this.version)));
            }
        }

        public int getVersion() {
            return this.version;
        }

        public boolean isEnabled(Bits bits) {
            return this.bitSet.get(bits.position);
        }

        public byte toByte() {
            return (byte) (this.bitSet.toByteArray()[0] | ((this.version & 3) << 6));
        }

        private FLG(int i11, byte b11) {
            this.bitSet = BitSet.valueOf(new byte[]{b11});
            this.version = i11;
            validate();
        }
    }

    public static class FrameInfo {

        /* JADX INFO: renamed from: bd */
        private final C42819BD f94861bd;
        private boolean finished = false;
        private final FLG flg;
        private final AbstractC42822a streamHash;

        public int currentStreamHash() {
            throw null;
        }

        public void finish() {
            this.finished = true;
        }

        public void updateStreamHash(byte[] bArr, int i11, int i12) {
            throw null;
        }

        public C42819BD getBD() {
            return this.f94861bd;
        }

        public FLG getFLG() {
            return this.flg;
        }

        public boolean isEnabled(FLG.Bits bits) {
            return this.flg.isEnabled(bits);
        }

        public boolean isFinished() {
            return this.finished;
        }

        public FrameInfo(FLG flg, C42819BD c42819bd) {
            this.flg = flg;
            this.f94861bd = c42819bd;
            if (flg.isEnabled(FLG.Bits.CONTENT_CHECKSUM)) {
                C42826e.m93891b().m93898g(0);
            }
        }
    }

    public LZ4FrameOutputStream(OutputStream outputStream, BLOCKSIZE blocksize, FLG.Bits... bitsArr) throws IOException {
        this(outputStream, blocksize, -1L, bitsArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i11) throws IOException {
        ensureNotFinished();
        if (this.buffer.position() == this.maxBlockSize) {
            writeBlock();
        }
        this.buffer.put((byte) i11);
    }

    public LZ4FrameOutputStream(OutputStream outputStream, BLOCKSIZE blocksize, long j11, FLG.Bits... bitsArr) throws IOException {
        this(outputStream, blocksize, j11, LZ4Factory.fastestInstance().fastCompressor(), C42826e.m93891b().m93897d(), bitsArr);
    }

    private void ensureNotFinished() {
        if (this.frameInfo.isFinished()) {
            throw new IllegalStateException(CLOSED_STREAM);
        }
    }

    private void writeBlock() throws IOException {
        byte[] bArrCopyOf;
        int i11;
        if (this.buffer.position() == 0) {
            return;
        }
        Arrays.fill(this.compressedBuffer, (byte) 0);
        if (this.frameInfo.isEnabled(FLG.Bits.CONTENT_CHECKSUM)) {
            this.frameInfo.updateStreamHash(this.buffer.array(), 0, this.buffer.position());
        }
        int iCompress = this.compressor.compress(this.buffer.array(), 0, this.buffer.position(), this.compressedBuffer, 0);
        if (iCompress >= this.buffer.position()) {
            iCompress = this.buffer.position();
            bArrCopyOf = Arrays.copyOf(this.buffer.array(), iCompress);
            i11 = Integer.MIN_VALUE;
        } else {
            bArrCopyOf = this.compressedBuffer;
            i11 = 0;
        }
        this.intLEBuffer.putInt(0, i11 | iCompress);
        ((FilterOutputStream) this).out.write(this.intLEBuffer.array());
        ((FilterOutputStream) this).out.write(bArrCopyOf, 0, iCompress);
        if (this.frameInfo.isEnabled(FLG.Bits.BLOCK_CHECKSUM)) {
            this.intLEBuffer.putInt(0, this.checksum.m93889a(bArrCopyOf, 0, iCompress, 0));
            ((FilterOutputStream) this).out.write(this.intLEBuffer.array());
        }
        this.buffer.rewind();
    }

    private void writeEndMark() throws IOException {
        this.intLEBuffer.putInt(0, 0);
        ((FilterOutputStream) this).out.write(this.intLEBuffer.array());
        if (this.frameInfo.isEnabled(FLG.Bits.CONTENT_CHECKSUM)) {
            this.intLEBuffer.putInt(0, this.frameInfo.currentStreamHash());
            ((FilterOutputStream) this).out.write(this.intLEBuffer.array());
        }
        this.frameInfo.finish();
    }

    private void writeHeader() throws IOException {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(15).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.putInt(MAGIC);
        byteBufferOrder.put(this.frameInfo.getFLG().toByte());
        byteBufferOrder.put(this.frameInfo.getBD().toByte());
        if (this.frameInfo.isEnabled(FLG.Bits.CONTENT_SIZE)) {
            byteBufferOrder.putLong(this.knownSize);
        }
        byteBufferOrder.put((byte) ((this.checksum.m93889a(byteBufferOrder.array(), 4, byteBufferOrder.position() - 4, 0) >> 8) & 255));
        ((FilterOutputStream) this).out.write(byteBufferOrder.array(), 0, byteBufferOrder.position());
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.frameInfo.isFinished()) {
            flush();
            writeEndMark();
        }
        super.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        if (!this.frameInfo.isFinished()) {
            writeBlock();
        }
        super.flush();
    }

    public LZ4FrameOutputStream(OutputStream outputStream, BLOCKSIZE blocksize, long j11, LZ4Compressor lZ4Compressor, AbstractC42824c abstractC42824c, FLG.Bits... bitsArr) throws IOException {
        super(outputStream);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.intLEBuffer = byteBufferAllocate.order(byteOrder);
        this.frameInfo = null;
        this.compressor = lZ4Compressor;
        this.checksum = abstractC42824c;
        FrameInfo frameInfo = new FrameInfo(new FLG(1, bitsArr), new C42819BD(blocksize));
        this.frameInfo = frameInfo;
        int blockMaximumSize = frameInfo.getBD().getBlockMaximumSize();
        this.maxBlockSize = blockMaximumSize;
        this.buffer = ByteBuffer.allocate(blockMaximumSize).order(byteOrder);
        this.compressedBuffer = new byte[lZ4Compressor.maxCompressedLength(blockMaximumSize)];
        if (this.frameInfo.getFLG().isEnabled(FLG.Bits.CONTENT_SIZE) && j11 < 0) {
            throw new IllegalArgumentException("Known size must be greater than zero in order to use the known size feature");
        }
        this.knownSize = j11;
        writeHeader();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) throws IOException {
        if (i11 >= 0 && i12 >= 0 && i11 + i12 <= bArr.length) {
            ensureNotFinished();
            while (i12 > this.buffer.remaining()) {
                int iRemaining = this.buffer.remaining();
                this.buffer.put(bArr, i11, iRemaining);
                writeBlock();
                i11 += iRemaining;
                i12 -= iRemaining;
            }
            this.buffer.put(bArr, i11, i12);
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public LZ4FrameOutputStream(OutputStream outputStream, BLOCKSIZE blocksize) throws IOException {
        this(outputStream, blocksize, DEFAULT_FEATURES);
    }

    public LZ4FrameOutputStream(OutputStream outputStream) throws IOException {
        this(outputStream, BLOCKSIZE.SIZE_4MB);
    }
}
