package com.tencent.ugc.decoder;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class H264RbspRewriter {
    public static final boolean DEBUG = false;
    private static final String TAG = "H264RbspRewriter";
    protected static int bitsRead;
    private int curBit;
    private int curByte;
    private int[] curByteWrite;
    protected CharCache debugBits;

    /* JADX INFO: renamed from: is */
    private InputStream f76940is;
    int nBit;
    private int nextByte;

    /* JADX INFO: renamed from: os */
    private final OutputStream f76941os;

    public H264RbspRewriter(InputStream inputStream) throws IOException {
        this.debugBits = new CharCache(50);
        this.curByteWrite = new int[8];
        this.f76940is = inputStream;
        this.f76941os = null;
        this.curByte = inputStream.read();
        this.nextByte = inputStream.read();
    }

    private void skipUE() throws IOException {
        int i11 = 0;
        while (read1Bit(true) == 0) {
            i11++;
        }
        if (i11 > 0) {
            skipNBit(i11);
        }
    }

    public boolean readBool(boolean z11) throws IOException {
        return read1Bit(z11) == 1;
    }

    public long readNBit(int i11, boolean z11) throws IOException {
        if (i11 > 64) {
            throw new IllegalArgumentException("Can not readByte more then 64 bit");
        }
        long j11 = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            j11 = (j11 << 1) | ((long) read1Bit(z11));
        }
        return j11;
    }

    public void readTrailingBits() throws IOException {
        read1Bit(true);
        readRemainingByte();
    }

    public int readUE(boolean z11) throws IOException {
        int i11 = 0;
        while (read1Bit(z11) == 0) {
            i11++;
        }
        if (i11 <= 0) {
            return 0;
        }
        return (int) (((long) ((1 << i11) - 1)) + readNBit(i11, z11));
    }

    public int readZeroBitCount(String str) throws IOException {
        int i11 = 0;
        while (read1Bit(true) == 0) {
            i11++;
        }
        trace(str, String.valueOf(i11));
        return i11;
    }

    public void skipNBit(int i11) throws IOException {
        if (i11 > 64) {
            throw new IllegalArgumentException("Can not skip more then 64 bit");
        }
        for (int i12 = 0; i12 < i11; i12++) {
            read1Bit(true);
        }
    }

    public boolean testBool(String str) throws IOException {
        boolean bool = readBool(false);
        trace(str, bool ? "1" : "0");
        return bool;
    }

    public void writeNBit(long j11, int i11) throws IOException {
        for (int i12 = 0; i12 < i11; i12++) {
            write1Bit(((int) (j11 >> ((i11 - i12) - 1))) & 1);
        }
    }

    public void writeTrailingBits() throws IOException {
        write1Bit(1);
        writeRemainingZero();
        flush();
    }

    public void writeU(int i11, int i12, String str) throws IOException {
        writeNBit(i11, i12);
    }

    public void writeUE(int i11) throws IOException {
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i13 < 15) {
            int i15 = (1 << i13) + i14;
            if (i11 < i15) {
                i12 = i13;
                break;
            } else {
                i13++;
                i14 = i15;
            }
        }
        writeNBit(0L, i12);
        write1Bit(1);
        writeNBit(i11 - i14, i12);
    }

    private void advance() throws IOException {
        this.curByte = this.nextByte;
        this.nextByte = this.f76940is.read();
        this.nBit = 0;
    }

    private void writeCurByte() throws IOException {
        int[] iArr = this.curByteWrite;
        this.f76941os.write(iArr[7] | (iArr[0] << 7) | (iArr[1] << 6) | (iArr[2] << 5) | (iArr[3] << 4) | (iArr[4] << 3) | (iArr[5] << 2) | (iArr[6] << 1));
    }

    public void flush() throws IOException {
        for (int i11 = this.curBit; i11 < 8; i11++) {
            this.curByteWrite[i11] = 0;
        }
        this.curBit = 0;
        writeCurByte();
    }

    public byte[] read(int i11) throws IOException {
        byte[] bArr = new byte[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i12] = (byte) readByte();
        }
        return bArr;
    }

    public int read1Bit(boolean z11) throws IOException {
        if (this.nBit == 8) {
            advance();
            if (this.curByte == -1) {
                return -1;
            }
        }
        int i11 = this.curByte;
        int i12 = this.nBit;
        int i13 = (i11 >> (7 - i12)) & 1;
        this.nBit = i12 + 1;
        if (z11 && this.f76941os != null) {
            write1Bit(i13);
        }
        return i13;
    }

    public boolean readBool(String str) throws IOException {
        boolean bool = readBool(true);
        trace(str, bool ? "1" : "0");
        return bool;
    }

    public int readByte() throws IOException {
        if (this.nBit > 0) {
            advance();
        }
        int i11 = this.curByte;
        advance();
        return i11;
    }

    public long readRemainingByte() throws IOException {
        return readNBit(8 - this.nBit);
    }

    public void skipScalingList(int i11) throws IOException {
        int[] iArr = new int[i11];
        int se2 = 8;
        int i12 = 8;
        for (int i13 = 0; i13 < i11; i13++) {
            if (se2 != 0) {
                se2 = ((readSE("deltaScale") + i12) + 256) % 256;
            }
            if (se2 != 0) {
                i12 = se2;
            }
            iArr[i13] = i12;
        }
    }

    public void write1Bit(int i11) throws IOException {
        if (this.curBit == 8) {
            this.curBit = 0;
            writeCurByte();
        }
        int[] iArr = this.curByteWrite;
        int i12 = this.curBit;
        this.curBit = i12 + 1;
        iArr[i12] = i11;
    }

    public void writeNBit(long j11, int i11, String str) throws IOException {
        for (int i12 = 0; i12 < i11; i12++) {
            write1Bit(((int) (j11 >> ((i11 - i12) - 1))) & 1);
        }
    }

    public void writeRemainingZero() throws IOException {
        writeNBit(0L, 8 - this.curBit);
    }

    public void writeSE(int i11, String str) throws IOException {
        writeUE(((i11 << 1) * (i11 < 0 ? -1 : 1)) + (i11 <= 0 ? 0 : 1));
    }

    public void writeSliceTrailingBits() {
        throw new IllegalStateException("todo");
    }

    public void writeU(int i11, int i12) throws IOException {
        writeNBit(i11, i12);
    }

    private int readUE() throws IOException {
        int i11 = 0;
        while (read1Bit(true) == 0) {
            i11++;
        }
        if (i11 <= 0) {
            return 0;
        }
        return (int) (((long) ((1 << i11) - 1)) + readNBit(i11));
    }

    public long readNBit(int i11) throws IOException {
        if (i11 > 64) {
            throw new IllegalArgumentException("Can not readByte more then 64 bit");
        }
        long j11 = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            j11 = (j11 << 1) | ((long) read1Bit(true));
        }
        return j11;
    }

    public int readSE(String str) throws IOException {
        int ue2 = readUE();
        int i11 = ue2 & 1;
        int i12 = ((ue2 >> 1) + i11) * ((i11 << 1) - 1);
        trace(str, String.valueOf(i12));
        return i12;
    }

    public int readU(int i11, String str) throws IOException {
        return (int) readNBit(i11, str);
    }

    public void skipNBit(int i11, String str) throws IOException {
        skipNBit(i11);
        trace(str, "skip NBits");
    }

    public void skipUE(String str) throws IOException {
        skipUE();
        trace(str, "skip UE");
    }

    public void writeBool(boolean z11, String str) throws IOException {
        write1Bit(z11 ? 1 : 0);
    }

    public void writeUE(int i11, String str) throws IOException {
        writeUE(i11);
    }

    public long readNBit(int i11, String str) throws IOException {
        long nBit = readNBit(i11);
        trace(str, String.valueOf(nBit));
        return nBit;
    }

    public int readUE(String str) throws IOException {
        int ue2 = readUE();
        trace(str, String.valueOf(ue2));
        return ue2;
    }

    public H264RbspRewriter(InputStream inputStream, OutputStream outputStream) throws IOException {
        this.debugBits = new CharCache(50);
        this.curByteWrite = new int[8];
        this.f76940is = inputStream;
        this.f76941os = outputStream;
        this.curByte = inputStream.read();
        this.nextByte = inputStream.read();
    }

    private void trace(String str, String str2) {
    }
}
