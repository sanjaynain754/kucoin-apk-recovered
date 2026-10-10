package androidx.media3.datasource;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class DataSourceUtil {
    public static void closeQuietly(@Nullable DataSource dataSource) {
        if (dataSource != null) {
            try {
                dataSource.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] readExactly(DataSource dataSource, int i11) throws IOException {
        byte[] bArr = new byte[i11];
        int i12 = 0;
        while (i12 < i11) {
            int i13 = dataSource.read(bArr, i12, i11 - i12);
            if (i13 == -1) {
                throw new IllegalStateException("Not enough data could be read: " + i12 + " < " + i11);
            }
            i12 += i13;
        }
        return bArr;
    }

    public static byte[] readToEnd(DataSource dataSource) throws IOException {
        byte[] bArrCopyOf = new byte[1024];
        int i11 = 0;
        int i12 = 0;
        while (i11 != -1) {
            if (i12 == bArrCopyOf.length) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
            }
            i11 = dataSource.read(bArrCopyOf, i12, bArrCopyOf.length - i12);
            if (i11 != -1) {
                i12 += i11;
            }
        }
        return Arrays.copyOf(bArrCopyOf, i12);
    }

    private DataSourceUtil() {
    }
}
