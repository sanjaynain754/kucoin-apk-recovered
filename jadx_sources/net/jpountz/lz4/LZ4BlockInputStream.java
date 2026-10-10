package net.jpountz.lz4;

import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.Checksum;
import net.jpountz.util.SafeUtils;
import net.jpountz.xxhash.C42826e;

/* JADX INFO: loaded from: classes61.dex */
public class LZ4BlockInputStream extends FilterInputStream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private byte[] buffer;
    private final Checksum checksum;
    private byte[] compressedBuffer;
    private final LZ4FastDecompressor decompressor;
    private boolean finished;

    /* JADX INFO: renamed from: o */
    private int f94859o;
    private int originalLen;
    private final boolean stopOnEmptyBlock;

    public LZ4BlockInputStream(InputStream inputStream, LZ4FastDecompressor lZ4FastDecompressor, Checksum checksum, boolean z11) {
        super(inputStream);
        this.decompressor = lZ4FastDecompressor;
        this.checksum = checksum;
        this.stopOnEmptyBlock = z11;
        this.buffer = new byte[0];
        this.compressedBuffer = new byte[LZ4BlockOutputStream.HEADER_LENGTH];
        this.originalLen = 0;
        this.f94859o = 0;
        this.finished = false;
    }

    private boolean tryReadFully(byte[] bArr, int i11) throws IOException {
        int i12 = 0;
        while (i12 < i11) {
            int i13 = ((FilterInputStream) this).in.read(bArr, i12, i11 - i12);
            if (i13 < 0) {
                return false;
            }
            i12 += i13;
        }
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.finished) {
            return -1;
        }
        if (this.f94859o == this.originalLen) {
            refill();
        }
        if (this.finished) {
            return -1;
        }
        byte[] bArr = this.buffer;
        int i11 = this.f94859o;
        this.f94859o = i11 + 1;
        return bArr[i11] & 255;
    }

    private void refill() throws IOException {
        if (!tryReadFully(this.compressedBuffer, LZ4BlockOutputStream.HEADER_LENGTH)) {
            if (this.stopOnEmptyBlock) {
                throw new EOFException("Stream ended prematurely");
            }
            this.finished = true;
            return;
        }
        int i11 = 0;
        while (true) {
            int i12 = LZ4BlockOutputStream.MAGIC_LENGTH;
            if (i11 >= i12) {
                byte[] bArr = this.compressedBuffer;
                byte b11 = bArr[i12];
                int i13 = b11 & 240;
                int i14 = (b11 & 15) + 10;
                if (i13 != 16 && i13 != 32) {
                    throw new IOException("Stream is corrupted");
                }
                int intLE = SafeUtils.readIntLE(bArr, i12 + 1);
                this.originalLen = SafeUtils.readIntLE(this.compressedBuffer, i12 + 5);
                int intLE2 = SafeUtils.readIntLE(this.compressedBuffer, i12 + 9);
                int i15 = this.originalLen;
                if (i15 > (1 << i14) || i15 < 0 || intLE < 0 || ((i15 == 0 && intLE != 0) || ((i15 != 0 && intLE == 0) || (i13 == 16 && i15 != intLE)))) {
                    throw new IOException("Stream is corrupted");
                }
                if (i15 == 0 && intLE == 0) {
                    if (intLE2 != 0) {
                        throw new IOException("Stream is corrupted");
                    }
                    if (this.stopOnEmptyBlock) {
                        this.finished = true;
                        return;
                    } else {
                        refill();
                        return;
                    }
                }
                byte[] bArr2 = this.buffer;
                if (bArr2.length < i15) {
                    this.buffer = new byte[Math.max(i15, (bArr2.length * 3) / 2)];
                }
                if (i13 == 16) {
                    readFully(this.buffer, this.originalLen);
                } else {
                    if (i13 != 32) {
                        throw new AssertionError();
                    }
                    byte[] bArr3 = this.compressedBuffer;
                    if (bArr3.length < intLE) {
                        this.compressedBuffer = new byte[Math.max(intLE, (bArr3.length * 3) / 2)];
                    }
                    readFully(this.compressedBuffer, intLE);
                    try {
                        if (intLE != this.decompressor.decompress(this.compressedBuffer, 0, this.buffer, 0, this.originalLen)) {
                            throw new IOException("Stream is corrupted");
                        }
                    } catch (LZ4Exception e11) {
                        throw new IOException("Stream is corrupted", e11);
                    }
                }
                this.checksum.reset();
                this.checksum.update(this.buffer, 0, this.originalLen);
                if (((int) this.checksum.getValue()) != intLE2) {
                    throw new IOException("Stream is corrupted");
                }
                this.f94859o = 0;
                return;
            }
            if (this.compressedBuffer[i11] != LZ4BlockOutputStream.MAGIC[i11]) {
                throw new IOException("Stream is corrupted");
            }
            i11++;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return this.originalLen - this.f94859o;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new IOException("mark/reset not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j11) throws IOException {
        if (j11 <= 0 || this.finished) {
            return 0L;
        }
        if (this.f94859o == this.originalLen) {
            refill();
        }
        if (this.finished) {
            return 0L;
        }
        int iMin = (int) Math.min(j11, this.originalLen - this.f94859o);
        this.f94859o += iMin;
        return iMin;
    }

    public String toString() {
        return getClass().getSimpleName() + "(in=" + ((FilterInputStream) this).in + ", decompressor=" + this.decompressor + ", checksum=" + this.checksum + ")";
    }

    private void readFully(byte[] bArr, int i11) throws IOException {
        if (tryReadFully(bArr, i11)) {
        } else {
            throw new EOFException("Stream ended prematurely");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        SafeUtils.checkRange(bArr, i11, i12);
        if (this.finished) {
            return -1;
        }
        if (this.f94859o == this.originalLen) {
            refill();
        }
        if (this.finished) {
            return -1;
        }
        int iMin = Math.min(i12, this.originalLen - this.f94859o);
        System.arraycopy(this.buffer, this.f94859o, bArr, i11, iMin);
        this.f94859o += iMin;
        return iMin;
    }

    public LZ4BlockInputStream(InputStream inputStream, LZ4FastDecompressor lZ4FastDecompressor, Checksum checksum) {
        this(inputStream, lZ4FastDecompressor, checksum, true);
    }

    public LZ4BlockInputStream(InputStream inputStream, LZ4FastDecompressor lZ4FastDecompressor) {
        C42826e.m93891b().m93898g(-1756908916);
        throw null;
    }

    public LZ4BlockInputStream(InputStream inputStream, boolean z11) {
        LZ4Factory.fastestInstance().fastDecompressor();
        C42826e.m93891b().m93898g(-1756908916);
        throw null;
    }

    public LZ4BlockInputStream(InputStream inputStream) {
        this(inputStream, LZ4Factory.fastestInstance().fastDecompressor());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i11) {
    }
}
