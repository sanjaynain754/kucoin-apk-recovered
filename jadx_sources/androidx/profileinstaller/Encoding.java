package androidx.profileinstaller;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileLock;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes34.dex */
class Encoding {
    static final int SIZEOF_BYTE = 8;
    static final int UINT_16_SIZE = 2;
    static final int UINT_32_SIZE = 4;
    static final int UINT_8_SIZE = 1;

    public static int readUInt16(@NonNull InputStream inputStream) throws IOException {
        return (int) readUInt(inputStream, 2);
    }

    public static long readUInt32(@NonNull InputStream inputStream) throws IOException {
        return readUInt(inputStream, 4);
    }

    public static int readUInt8(@NonNull InputStream inputStream) throws IOException {
        return (int) readUInt(inputStream, 1);
    }

    public static void writeCompressed(@NonNull OutputStream outputStream, byte[] bArr) throws IOException {
        writeUInt32(outputStream, bArr.length);
        byte[] bArrCompress = compress(bArr);
        writeUInt32(outputStream, bArrCompress.length);
        outputStream.write(bArrCompress);
    }

    public static void writeUInt16(@NonNull OutputStream outputStream, int i11) throws IOException {
        writeUInt(outputStream, i11, 2);
    }

    public static void writeUInt32(@NonNull OutputStream outputStream, long j11) throws IOException {
        writeUInt(outputStream, j11, 4);
    }

    public static void writeUInt8(@NonNull OutputStream outputStream, int i11) throws IOException {
        writeUInt(outputStream, i11, 1);
    }

    public static int bitsToBytes(int i11) {
        return ((i11 + 7) & (-8)) / 8;
    }

    public static byte[] compress(@NonNull byte[] bArr) throws IOException {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th2) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            deflater.end();
            throw th4;
        }
    }

    @NonNull
    public static RuntimeException error(@Nullable String str) {
        return new IllegalStateException(str);
    }

    @NonNull
    public static byte[] read(@NonNull InputStream inputStream, int i11) throws IOException {
        byte[] bArr = new byte[i11];
        int i12 = 0;
        while (i12 < i11) {
            int i13 = inputStream.read(bArr, i12, i11 - i12);
            if (i13 < 0) {
                throw error("Not enough bytes to read: " + i11);
            }
            i12 += i13;
        }
        return bArr;
    }

    @NonNull
    public static byte[] readCompressed(@NonNull InputStream inputStream, int i11, int i12) throws IOException {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i12];
            byte[] bArr2 = new byte[2048];
            int i13 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i13 < i11) {
                int i14 = inputStream.read(bArr2);
                if (i14 < 0) {
                    throw error("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i11 + " bytes");
                }
                inflater.setInput(bArr2, 0, i14);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i12 - iInflate);
                    i13 += i14;
                } catch (DataFormatException e11) {
                    throw error(e11.getMessage());
                }
            }
            if (i13 == i11) {
                if (!inflater.finished()) {
                    throw error("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw error("Didn't read enough bytes during decompression. expected=" + i11 + " actual=" + i13);
        } catch (Throwable th2) {
            inflater.end();
            throw th2;
        }
    }

    @NonNull
    public static String readString(InputStream inputStream, int i11) throws IOException {
        return new String(read(inputStream, i11), StandardCharsets.UTF_8);
    }

    public static int utf8Length(@NonNull String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    public static void writeAll(@NonNull InputStream inputStream, @NonNull OutputStream outputStream, @Nullable FileLock fileLock) throws IOException {
        if (fileLock == null || !fileLock.isValid()) {
            throw new IOException("Unable to acquire a lock on the underlying file channel.");
        }
        byte[] bArr = new byte[512];
        while (true) {
            int i11 = inputStream.read(bArr);
            if (i11 <= 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i11);
            }
        }
    }

    public static void writeString(@NonNull OutputStream outputStream, @NonNull String str) throws IOException {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    public static void writeUInt(@NonNull OutputStream outputStream, long j11, int i11) throws IOException {
        byte[] bArr = new byte[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i12] = (byte) ((j11 >> (i12 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    private Encoding() {
    }

    public static long readUInt(@NonNull InputStream inputStream, int i11) throws IOException {
        byte[] bArr = read(inputStream, i11);
        long j11 = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            j11 += ((long) (bArr[i12] & 255)) << (i12 * 8);
        }
        return j11;
    }
}
