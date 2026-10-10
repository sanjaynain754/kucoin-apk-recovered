package cn.jiguang.privates.core.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.AtomicFile;
import cn.jiguang.privates.common.log.JCommonLog;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes34.dex */
public class FileUtil {
    private static final String TAG = "FileUtil";

    public static void atomicFileWrite(@NonNull File file, @NonNull String str) throws Throwable {
        FileOutputStream fileOutputStreamStartWrite;
        Throwable th2;
        AtomicFile atomicFile = new AtomicFile(file);
        try {
            fileOutputStreamStartWrite = atomicFile.startWrite();
            try {
                try {
                    fileOutputStreamStartWrite.write(str.getBytes(StandardCharsets.UTF_8));
                    atomicFile.finishWrite(fileOutputStreamStartWrite);
                    safeClose(fileOutputStreamStartWrite);
                } catch (IOException unused) {
                    atomicFile.failWrite(null);
                    JCommonLog.m5431e(TAG, "AtomicFileWrite failed");
                    safeClose(fileOutputStreamStartWrite);
                }
            } catch (Throwable th3) {
                th2 = th3;
                safeClose(fileOutputStreamStartWrite);
                throw th2;
            }
        } catch (IOException unused2) {
            fileOutputStreamStartWrite = null;
        } catch (Throwable th4) {
            fileOutputStreamStartWrite = null;
            th2 = th4;
            safeClose(fileOutputStreamStartWrite);
            throw th2;
        }
    }

    public static void safeClose(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                JCommonLog.m5430d(TAG, "safeClose failed");
            }
        }
    }

    private FileUtil() {
    }

    public static String atomicFileRead(@NonNull File file) {
        if (!file.exists()) {
            return "";
        }
        AtomicFile atomicFile = new AtomicFile(file);
        FileInputStream fileInputStreamOpenRead = null;
        try {
            fileInputStreamOpenRead = atomicFile.openRead();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStreamOpenRead, StandardCharsets.UTF_8));
            StringBuilder sb2 = new StringBuilder();
            char[] cArr = new char[4096];
            while (true) {
                int i11 = bufferedReader.read(cArr);
                if (i11 != -1) {
                    sb2.append(cArr, 0, i11);
                } else {
                    return sb2.toString();
                }
            }
        } catch (IOException unused) {
            JCommonLog.m5431e(TAG, "atomicFileRead failed");
            return "";
        } finally {
            safeClose(fileInputStreamOpenRead);
        }
    }
}
