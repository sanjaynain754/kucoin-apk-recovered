package androidx.exifinterface.media;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.ErrnoException;
import android.system.Os;
import android.util.Log;
import androidx.annotation.RequiresApi;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes34.dex */
class ExifInterfaceUtils {
    private static final String TAG = "ExifInterfaceUtils";

    public static int copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i11 = 0;
        while (true) {
            int i12 = inputStream.read(bArr);
            if (i12 == -1) {
                return i11;
            }
            i11 += i12;
            outputStream.write(bArr, 0, i12);
        }
    }

    public static boolean startsWith(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i11 = 0; i11 < bArr2.length; i11++) {
            if (bArr[i11] != bArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    @RequiresApi(23)
    public static class Api23Impl {
        private Api23Impl() {
        }

        public static void setDataSource(MediaMetadataRetriever mediaMetadataRetriever, MediaDataSource mediaDataSource) {
            mediaMetadataRetriever.setDataSource(mediaDataSource);
        }
    }

    public static String byteArrayToHexString(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b11 : bArr) {
            sb2.append(String.format("%02x", Byte.valueOf(b11)));
        }
        return sb2.toString();
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused) {
            }
        }
    }

    public static long[] convertToLongArray(Object obj) {
        if (!(obj instanceof int[])) {
            if (obj instanceof long[]) {
                return (long[]) obj;
            }
            return null;
        }
        int[] iArr = (int[]) obj;
        long[] jArr = new long[iArr.length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            jArr[i11] = iArr[i11];
        }
        return jArr;
    }

    private ExifInterfaceUtils() {
    }

    public static void closeFileDescriptor(FileDescriptor fileDescriptor) {
        try {
            Os.close(fileDescriptor);
        } catch (ErrnoException e11) {
            Log.e(TAG, "Error closing fd.", e11);
        }
    }

    public static long parseSubSeconds(String str) {
        try {
            int iMin = Math.min(str.length(), 3);
            long j11 = Long.parseLong(str.substring(0, iMin));
            while (iMin < 3) {
                j11 *= 10;
                iMin++;
            }
            return j11;
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    public static void copy(InputStream inputStream, OutputStream outputStream, int i11) throws IOException {
        byte[] bArr = new byte[8192];
        while (i11 > 0) {
            int iMin = Math.min(i11, 8192);
            int i12 = inputStream.read(bArr, 0, iMin);
            if (i12 == iMin) {
                i11 -= i12;
                outputStream.write(bArr, 0, i12);
            } else {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
        }
    }
}
