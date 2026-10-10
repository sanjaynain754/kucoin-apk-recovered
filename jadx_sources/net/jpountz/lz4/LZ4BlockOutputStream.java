package net.jpountz.lz4;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.Checksum;
import net.jpountz.util.SafeUtils;
import net.jpountz.xxhash.C42826e;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes61.dex */
public class LZ4BlockOutputStream extends FilterOutputStream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int COMPRESSION_LEVEL_BASE = 10;
    static final int COMPRESSION_METHOD_LZ4 = 32;
    static final int COMPRESSION_METHOD_RAW = 16;
    static final int DEFAULT_SEED = -1756908916;
    static final int HEADER_LENGTH;
    static final byte[] MAGIC;
    static final int MAGIC_LENGTH;
    static final int MAX_BLOCK_SIZE = 33554432;
    static final int MIN_BLOCK_SIZE = 64;
    private final int blockSize;
    private final byte[] buffer;
    private final Checksum checksum;
    private final byte[] compressedBuffer;
    private final int compressionLevel;
    private final LZ4Compressor compressor;
    private boolean finished;

    /* JADX INFO: renamed from: o */
    private int f94860o;
    private final boolean syncFlush;

    public LZ4BlockOutputStream(OutputStream outputStream, int i11, LZ4Compressor lZ4Compressor, Checksum checksum, boolean z11) {
        super(outputStream);
        this.blockSize = i11;
        this.compressor = lZ4Compressor;
        this.checksum = checksum;
        this.compressionLevel = compressionLevel(i11);
        this.buffer = new byte[i11];
        byte[] bArr = new byte[HEADER_LENGTH + lZ4Compressor.maxCompressedLength(i11)];
        this.compressedBuffer = bArr;
        this.syncFlush = z11;
        this.f94860o = 0;
        this.finished = false;
        System.arraycopy(MAGIC, 0, bArr, 0, MAGIC_LENGTH);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i11) throws IOException {
        ensureNotFinished();
        if (this.f94860o == this.blockSize) {
            flushBufferedData();
        }
        byte[] bArr = this.buffer;
        int i12 = this.f94860o;
        this.f94860o = i12 + 1;
        bArr[i12] = (byte) i11;
    }

    static {
        byte[] bArr = {BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.SquareOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.HashtableOptions};
        MAGIC = bArr;
        int length = bArr.length;
        MAGIC_LENGTH = length;
        HEADER_LENGTH = length + 13;
    }

    private static int compressionLevel(int i11) {
        if (i11 < 64) {
            throw new IllegalArgumentException("blockSize must be >= 64, got " + i11);
        }
        if (i11 <= 33554432) {
            return Math.max(0, 22 - Integer.numberOfLeadingZeros(i11 - 1));
        }
        throw new IllegalArgumentException("blockSize must be <= 33554432, got " + i11);
    }

    private void ensureNotFinished() {
        if (this.finished) {
            throw new IllegalStateException("This stream is already closed");
        }
    }

    private void flushBufferedData() throws IOException {
        int i11;
        if (this.f94860o == 0) {
            return;
        }
        this.checksum.reset();
        this.checksum.update(this.buffer, 0, this.f94860o);
        int value = (int) this.checksum.getValue();
        LZ4Compressor lZ4Compressor = this.compressor;
        byte[] bArr = this.buffer;
        int i12 = this.f94860o;
        byte[] bArr2 = this.compressedBuffer;
        int i13 = HEADER_LENGTH;
        int iCompress = lZ4Compressor.compress(bArr, 0, i12, bArr2, i13);
        int i14 = this.f94860o;
        if (iCompress >= i14) {
            System.arraycopy(this.buffer, 0, this.compressedBuffer, i13, i14);
            i11 = 16;
        } else {
            i14 = iCompress;
            i11 = 32;
        }
        byte[] bArr3 = this.compressedBuffer;
        int i15 = MAGIC_LENGTH;
        bArr3[i15] = (byte) (i11 | this.compressionLevel);
        writeIntLE(i14, bArr3, i15 + 1);
        writeIntLE(this.f94860o, this.compressedBuffer, i15 + 5);
        writeIntLE(value, this.compressedBuffer, i15 + 9);
        ((FilterOutputStream) this).out.write(this.compressedBuffer, 0, i13 + i14);
        this.f94860o = 0;
    }

    private static void writeIntLE(int i11, byte[] bArr, int i12) {
        bArr[i12] = (byte) i11;
        bArr[i12 + 1] = (byte) (i11 >>> 8);
        bArr[i12 + 2] = (byte) (i11 >>> 16);
        bArr[i12 + 3] = (byte) (i11 >>> 24);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.finished) {
            finish();
        }
        OutputStream outputStream = ((FilterOutputStream) this).out;
        if (outputStream != null) {
            outputStream.close();
            ((FilterOutputStream) this).out = null;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        if (((FilterOutputStream) this).out != null) {
            if (this.syncFlush) {
                flushBufferedData();
            }
            ((FilterOutputStream) this).out.flush();
        }
    }

    public String toString() {
        return getClass().getSimpleName() + "(out=" + ((FilterOutputStream) this).out + ", blockSize=" + this.blockSize + ", compressor=" + this.compressor + ", checksum=" + this.checksum + ")";
    }

    public void finish() throws IOException {
        ensureNotFinished();
        flushBufferedData();
        byte[] bArr = this.compressedBuffer;
        int i11 = MAGIC_LENGTH;
        bArr[i11] = (byte) (this.compressionLevel | 16);
        writeIntLE(0, bArr, i11 + 1);
        writeIntLE(0, this.compressedBuffer, i11 + 5);
        writeIntLE(0, this.compressedBuffer, i11 + 9);
        ((FilterOutputStream) this).out.write(this.compressedBuffer, 0, HEADER_LENGTH);
        this.finished = true;
        ((FilterOutputStream) this).out.flush();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) throws IOException {
        SafeUtils.checkRange(bArr, i11, i12);
        ensureNotFinished();
        while (true) {
            int i13 = this.f94860o;
            int i14 = i13 + i12;
            int i15 = this.blockSize;
            if (i14 > i15) {
                int i16 = i15 - i13;
                System.arraycopy(bArr, i11, this.buffer, i13, i15 - i13);
                this.f94860o = this.blockSize;
                flushBufferedData();
                i11 += i16;
                i12 -= i16;
            } else {
                System.arraycopy(bArr, i11, this.buffer, i13, i12);
                this.f94860o += i12;
                return;
            }
        }
    }

    public LZ4BlockOutputStream(OutputStream outputStream, int i11, LZ4Compressor lZ4Compressor) {
        C42826e.m93891b().m93898g(DEFAULT_SEED);
        throw null;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        ensureNotFinished();
        write(bArr, 0, bArr.length);
    }

    public LZ4BlockOutputStream(OutputStream outputStream, int i11) {
        this(outputStream, i11, LZ4Factory.fastestInstance().fastCompressor());
    }

    public LZ4BlockOutputStream(OutputStream outputStream) {
        this(outputStream, 65536);
    }
}
