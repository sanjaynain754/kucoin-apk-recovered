package net.jpountz.util;

import androidx.credentials.provider.CredentialEntry;
import com.tencent.bugly.proguard.C33978va;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes61.dex */
public enum Native {
    ;


    /* JADX INFO: renamed from: b */
    public static boolean f94863b;

    /* JADX INFO: renamed from: net.jpountz.util.Native$a */
    public static class C42821a implements FilenameFilter {

        /* JADX INFO: renamed from: a */
        public final String f94866a = "liblz4-java-";

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith("liblz4-java-") && !str.endsWith(".lck");
        }
    }

    /* JADX INFO: renamed from: net.jpountz.util.Native$OS */
    public enum EnumC42820OS {
        WINDOWS("win32", "so"),
        LINUX("linux", "so"),
        MAC("darwin", "dylib"),
        SOLARIS("solaris", "so");

        public final String libExtension;
        public final String name;

        EnumC42820OS(String str, String str2) {
            this.name = str;
            this.libExtension = str2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m93884a() {
        return System.getProperty("os.arch");
    }

    /* JADX INFO: renamed from: b */
    public static void m93885b() {
        File[] fileArrListFiles = new File(new File(System.getProperty("java.io.tmpdir")).getAbsolutePath()).listFiles(new C42821a());
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (!new File(file.getAbsolutePath() + ".lck").exists()) {
                    try {
                        file.delete();
                    } catch (SecurityException e11) {
                        System.err.println("Failed to delete old temp lib" + e11.getMessage());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static EnumC42820OS m93886c() {
        String property = System.getProperty("os.name");
        if (property.contains("Linux")) {
            return EnumC42820OS.LINUX;
        }
        if (property.contains("Mac")) {
            return EnumC42820OS.MAC;
        }
        if (property.contains("Windows")) {
            return EnumC42820OS.WINDOWS;
        }
        if (property.contains("Solaris") || property.contains("SunOS")) {
            return EnumC42820OS.SOLARIS;
        }
        throw new UnsupportedOperationException("Unsupported operating system: " + property);
    }

    public static synchronized boolean isLoaded() {
        return f94863b;
    }

    public static synchronized void load() {
        File fileCreateTempFile;
        if (f94863b) {
            return;
        }
        m93885b();
        try {
            System.loadLibrary("lz4-java");
            f94863b = true;
        } catch (UnsatisfiedLinkError unused) {
            String strM93887d = m93887d();
            InputStream resourceAsStream = Native.class.getResourceAsStream(strM93887d);
            if (resourceAsStream == null) {
                throw new UnsupportedOperationException("Unsupported OS/arch, cannot find " + strM93887d + ". Please try building from source.");
            }
            File file = null;
            try {
                fileCreateTempFile = File.createTempFile("liblz4-java-", C33978va.f72339h + m93886c().libExtension + ".lck");
                try {
                    try {
                        File file2 = new File(fileCreateTempFile.getAbsolutePath().replaceFirst(".lck$", ""));
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file2);
                            try {
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int i11 = resourceAsStream.read(bArr);
                                    if (i11 == -1) {
                                        break;
                                    } else {
                                        fileOutputStream.write(bArr, 0, i11);
                                    }
                                }
                                fileOutputStream.close();
                                System.load(file2.getAbsolutePath());
                                f94863b = true;
                                String str = System.getenv("LZ4JAVA_KEEP_TEMP_JNI_LIB");
                                String property = System.getProperty("lz4java.jnilib.temp.keep");
                                if ((str == null || !str.equals(CredentialEntry.TRUE_STRING)) && (property == null || !property.equals(CredentialEntry.TRUE_STRING))) {
                                    file2.deleteOnExit();
                                }
                                fileCreateTempFile.deleteOnExit();
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (Throwable th4) {
                                        th2.addSuppressed(th4);
                                    }
                                    throw th3;
                                }
                            }
                        } catch (IOException e11) {
                            e = e11;
                            file = file2;
                            throw new ExceptionInInitializerError("Cannot unpack liblz4-java: " + e);
                        } catch (Throwable th5) {
                            th = th5;
                            file = file2;
                            if (f94863b) {
                                String str2 = System.getenv("LZ4JAVA_KEEP_TEMP_JNI_LIB");
                                String property2 = System.getProperty("lz4java.jnilib.temp.keep");
                                if ((str2 == null || !str2.equals(CredentialEntry.TRUE_STRING)) && (property2 == null || !property2.equals(CredentialEntry.TRUE_STRING))) {
                                    file.deleteOnExit();
                                }
                                fileCreateTempFile.deleteOnExit();
                            } else {
                                if (file != null && file.exists() && !file.delete()) {
                                    throw new ExceptionInInitializerError("Cannot unpack liblz4-java / cannot delete a temporary native library " + file);
                                }
                                if (fileCreateTempFile != null && fileCreateTempFile.exists() && !fileCreateTempFile.delete()) {
                                    throw new ExceptionInInitializerError("Cannot unpack liblz4-java / cannot delete a temporary lock file " + fileCreateTempFile);
                                }
                            }
                            throw th;
                        }
                    } catch (IOException e12) {
                        e = e12;
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (IOException e13) {
                e = e13;
                fileCreateTempFile = null;
            } catch (Throwable th7) {
                th = th7;
                fileCreateTempFile = null;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m93887d() {
        EnumC42820OS enumC42820OSM93886c = m93886c();
        return "/" + Native.class.getPackage().getName().replace('.', '/') + "/" + enumC42820OSM93886c.name + "/" + m93884a() + "/liblz4-java." + enumC42820OSM93886c.libExtension;
    }
}
