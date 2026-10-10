package com.blankj.utilcode.util;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: com.blankj.utilcode.util.n */
/* JADX INFO: compiled from: FileUtils.java */
/* JADX INFO: loaded from: classes34.dex */
public final class C5284n {

    /* JADX INFO: renamed from: a */
    public static final String f6575a = System.getProperty("line.separator");

    /* JADX INFO: renamed from: com.blankj.utilcode.util.n$a */
    /* JADX INFO: compiled from: FileUtils.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        boolean m6315a(File file, File file2);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m6299b(File file, File file2, a aVar) {
        return m6301d(file, file2, aVar, false);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m6300c(File file, File file2, a aVar) {
        return m6302e(file, file2, aVar, false);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m6301d(File file, File file2, a aVar, boolean z11) {
        if (file != null && file2 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(file.getPath());
            String str = File.separator;
            sb2.append(str);
            String string = sb2.toString();
            String str2 = file2.getPath() + str;
            if (str2.contains(string) || !file.exists() || !file.isDirectory() || !m6304g(file2)) {
                return false;
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                for (File file3 : fileArrListFiles) {
                    File file4 = new File(str2 + file3.getName());
                    if (file3.isFile()) {
                        if (!m6302e(file3, file4, aVar, z11)) {
                            return false;
                        }
                    } else if (file3.isDirectory() && !m6301d(file3, file4, aVar, z11)) {
                        return false;
                    }
                }
            }
            return !z11 || m6309l(file);
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m6302e(File file, File file2, a aVar, boolean z11) {
        if (file != null && file2 != null && !file.equals(file2) && file.exists() && file.isFile()) {
            if (file2.exists()) {
                if (aVar != null && !aVar.m6315a(file, file2)) {
                    return true;
                }
                if (!file2.delete()) {
                    return false;
                }
            }
            if (!m6304g(file2.getParentFile())) {
                return false;
            }
            try {
                return C5299u0.m6476N(file2.getAbsolutePath(), new FileInputStream(file)) && (!z11 || m6310m(file));
            } catch (FileNotFoundException e11) {
                e11.printStackTrace();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m6303f(File file) {
        if (file == null) {
            return false;
        }
        if ((file.exists() && !file.delete()) || !m6304g(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (IOException e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m6306i(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isFile();
        }
        if (!m6304g(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (IOException e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: l */
    public static boolean m6309l(File file) {
        if (file == null) {
            return false;
        }
        if (!file.exists()) {
            return true;
        }
        if (!file.isDirectory()) {
            return false;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length > 0) {
            for (File file2 : fileArrListFiles) {
                if (file2.isFile()) {
                    if (!file2.delete()) {
                        return false;
                    }
                } else if (file2.isDirectory() && !m6309l(file2)) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m6298a(File file, File file2, a aVar) {
        if (file == null) {
            return false;
        }
        return file.isDirectory() ? m6299b(file, file2, aVar) : m6300c(file, file2, aVar);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m6304g(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isDirectory();
        }
        return file.mkdirs();
    }

    /* JADX INFO: renamed from: j */
    public static boolean m6307j(File file) {
        if (file == null) {
            return false;
        }
        return file.isDirectory() ? m6309l(file) : m6310m(file);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m6310m(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isFile() && file.delete();
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m6312o(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return true;
        }
        return m6313p(file.getAbsolutePath());
    }

    /* JADX INFO: renamed from: q */
    public static boolean m6314q(String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = C5287o0.m6331a().getContentResolver().openAssetFileDescriptor(Uri.parse(str), "r");
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    return false;
                }
                try {
                    assetFileDescriptorOpenAssetFileDescriptor.close();
                    return true;
                } catch (IOException unused) {
                    return true;
                }
            } catch (FileNotFoundException unused2) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m6305h(String str) {
        return m6304g(m6311n(str));
    }

    /* JADX INFO: renamed from: k */
    public static boolean m6308k(String str) {
        return m6307j(m6311n(str));
    }

    /* JADX INFO: renamed from: n */
    public static File m6311n(String str) {
        if (C5299u0.m6469G(str)) {
            return null;
        }
        return new File(str);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m6313p(String str) {
        File fileM6311n = m6311n(str);
        if (fileM6311n == null) {
            return false;
        }
        if (fileM6311n.exists()) {
            return true;
        }
        return m6314q(str);
    }
}
