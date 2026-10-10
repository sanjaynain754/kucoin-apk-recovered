package cn.jiguang.privates.common.utils;

import cn.jiguang.privates.common.log.JCommonLog;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes34.dex */
public class GZipUtil {
    private static final String TAG = "GZipUtil";

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th2) {
                JCommonLog.m5433w(TAG, "closeQuietly failed " + th2.getMessage());
            }
        }
    }

    public static byte[] unzip(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
        try {
            byte[] bArr2 = new byte[256];
            while (true) {
                int i11 = gZIPInputStream.read(bArr2);
                if (i11 < 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    closeQuietly(byteArrayOutputStream);
                    closeQuietly(byteArrayInputStream);
                    closeQuietly(gZIPInputStream);
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr2, 0, i11);
            }
        } catch (Throwable th2) {
            try {
                JCommonLog.m5433w(TAG, "unzip failed " + th2.getMessage());
                return null;
            } finally {
                closeQuietly(byteArrayOutputStream);
                closeQuietly(byteArrayInputStream);
                closeQuietly(gZIPInputStream);
            }
        }
    }

    public static byte[] zip(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            closeQuietly(byteArrayOutputStream);
            closeQuietly(gZIPOutputStream);
            return byteArray;
        } catch (Throwable th2) {
            try {
                JCommonLog.m5433w(TAG, "zip failed " + th2.getMessage());
                return null;
            } finally {
                closeQuietly(byteArrayOutputStream);
                closeQuietly(gZIPOutputStream);
            }
        }
    }
}
