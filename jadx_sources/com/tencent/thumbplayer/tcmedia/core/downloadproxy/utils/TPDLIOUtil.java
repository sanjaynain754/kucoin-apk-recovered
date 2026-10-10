package com.tencent.thumbplayer.tcmedia.core.downloadproxy.utils;

import android.content.Context;
import android.os.Environment;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDLProxyLogListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes63.dex */
public class TPDLIOUtil {
    private static final String FILE_NAME = "TPDLIOUtil";
    private static final String PROTOCOL_ASSET = "asset";
    private static final String PROTOCOL_FILE = "file";
    private static final String PROTOCOL_HTTP = "http";
    private static final String PROTOCOL_HTTPS = "https";
    private static Pattern PROTOCOL_PATTERN = Pattern.compile("^(\\w+):/{2,3}");
    private static Pattern PATH_PATTERN = Pattern.compile("^(\\w+):/{2,3}(.*)");

    public static int copy(InputStream inputStream, OutputStream outputStream) {
        if (inputStream == null || outputStream == null) {
            return 0;
        }
        byte[] bArr = new byte[1024];
        int i11 = 0;
        while (true) {
            try {
                int i12 = inputStream.read(bArr);
                if (i12 <= 0) {
                    break;
                }
                outputStream.write(bArr, 0, i12);
                i11 += i12;
            } catch (IOException unused) {
            }
        }
        return i11;
    }

    public static boolean createFile(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return true;
        }
        if (!createParentDirectories(file)) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean createParentDirectories(File file) {
        if (file == null) {
            return false;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null || parentFile.exists()) {
            return true;
        }
        return parentFile.mkdirs();
    }

    public static InputStream openInputStream(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        return openInputStream(new File(str));
    }

    public static OutputStream openOutputStream(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        return openOutputStream(new File(str));
    }

    public static File compare(File file, File file2) {
        if (file == null) {
            return file2;
        }
        return (file2 == null || !file2.exists() || (file.exists() && file.lastModified() > file2.lastModified())) ? file : file2;
    }

    public static String getPath(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = PATH_PATTERN.matcher(str);
        return (matcher.find() && matcher.group(1).equals(PROTOCOL_ASSET)) ? matcher.group(2) : str;
    }

    public static String getProtocol(String str) {
        if (str != null && str.length() > 0) {
            Matcher matcher = PROTOCOL_PATTERN.matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
        }
        return "file";
    }

    public static void recursiveDelete(File file) {
        if (file != null) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        File[] fileArrListFiles = file.listFiles();
                        if (fileArrListFiles == null) {
                            return;
                        }
                        for (File file2 : fileArrListFiles) {
                            recursiveDelete(file2);
                        }
                    }
                    TPDLProxyLog.m78073d(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "recursiveDelete: delete=".concat(String.valueOf(file.delete())));
                }
            } catch (Exception e11) {
                TPDLProxyLog.m78073d(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "recursiveDelete failed, error:" + e11.toString());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
    
        if (r6.createNewFile() == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean write(File file, byte[] bArr, int i11, int i12) throws Throwable {
        if (file != null && bArr != null && bArr.length > 0) {
            if (!file.exists()) {
                File parentFile = file.getParentFile();
                if (parentFile != null && !parentFile.mkdirs()) {
                    return false;
                }
            }
            FileOutputStream fileOutputStream = null;
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    fileOutputStream2.write(bArr, i11, i12);
                    try {
                        fileOutputStream2.close();
                        return true;
                    } catch (IOException e11) {
                        TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "write error:" + e11.toString());
                        return true;
                    }
                } catch (Exception unused) {
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e12) {
                            TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "write error:" + e12.toString());
                        }
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e13) {
                            TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "write error:" + e13.toString());
                        }
                    }
                    throw th;
                }
            } catch (Exception unused2) {
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return false;
        return false;
    }

    public static boolean isExternalStorageMounted() {
        return Environment.getExternalStorageState().equals("mounted");
    }

    public static boolean isRemoteFile(String str) {
        String protocol = getProtocol(str);
        if (!protocol.equals("https") && !protocol.equals("http")) {
            return false;
        }
        return true;
    }

    public static InputStream open(Context context, String str) {
        String protocol = getProtocol(str);
        if (protocol.equals(PROTOCOL_ASSET)) {
            try {
                return context.getAssets().open(getPath(str));
            } catch (IOException unused) {
                return null;
            }
        }
        if (protocol.equals("file")) {
            try {
                return new FileInputStream(getPath(str));
            } catch (Exception unused2) {
                return null;
            }
        }
        if (!protocol.equals("http") && !protocol.equals("https")) {
            return null;
        }
        try {
            return FirebasePerfUrlConnection.openStream(new URL(str));
        } catch (Exception unused3) {
            return null;
        }
    }

    public static InputStream openInputStream(File file) {
        if (file == null) {
            return null;
        }
        try {
            return new FileInputStream(file);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public static OutputStream openOutputStream(File file) {
        if (file != null && createFile(file)) {
            try {
                return new FileOutputStream(file);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    public static int copy(File file, File file2) throws Throwable {
        FileOutputStream fileOutputStream;
        if (file == null || file2 == null || !file.exists()) {
            return 0;
        }
        if (!file2.exists()) {
            File parentFile = file2.getParentFile();
            if (parentFile == null) {
                return 0;
            }
            if (!parentFile.exists() && !parentFile.mkdirs()) {
                return 0;
            }
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    int iCopy = copy(fileInputStream2, fileOutputStream);
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused) {
                    }
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused2) {
                    }
                    return iCopy;
                } catch (FileNotFoundException unused3) {
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused5) {
                        }
                    }
                    return 0;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused6) {
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                            throw th;
                        } catch (IOException unused7) {
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused8) {
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (FileNotFoundException unused9) {
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    public static boolean createFile(String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        return createFile(new File(str));
    }

    public static boolean createParentDirectories(String str) {
        return createParentDirectories(new File(str));
    }
}
