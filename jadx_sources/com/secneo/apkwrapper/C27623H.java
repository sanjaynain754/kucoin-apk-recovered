package com.secneo.apkwrapper;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import androidx.credentials.provider.CredentialEntry;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: com.secneo.apkwrapper.H */
/* JADX INFO: loaded from: classes.dex */
public class C27623H {
    public static Application sApp;
    public static ApplicationInfo sAppInfo;
    private static Boolean isLoaded = Boolean.FALSE;
    public static String PKGNAME = "com.kubi.kucoin";
    public static String APPNAME = "com.kubi.rn.RNApplication";
    public static String ACFNAME = "###ACFNAME###";
    public static String ISSOPHIX = "###SOPHIX###";
    public static String HAVEX86 = "###HAVEX86###";
    public static String HAVEX8664 = "###HAVEX8664###";
    public static String X86_LIBRARY = "DexHelper-x86";
    public static String ARM_LIBRARY = "DexHelper";
    public static String ORI_AW_NAME = "com.secneo.apkwrapper.AW";

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static int Iii1Iii1IIIi1(int i11) throws Exception {
        try {
            int[] iArr = new int[0];
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/self/status"));
                Throwable th2 = null;
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            bufferedReader.close();
                            return 0;
                        }
                        if (i11 == 0) {
                            if (line.startsWith("TracerPid:")) {
                                int i12 = Integer.parseInt(line.substring(10).trim());
                                bufferedReader.close();
                                return i12;
                            }
                        } else if (i11 == 1 && line.startsWith("PPid:")) {
                            int i13 = Integer.parseInt(line.substring(5).trim());
                            bufferedReader.close();
                            return i13;
                        }
                    } catch (Throwable th3) {
                        if (0 != 0) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th4) {
                                th2.addSuppressed(th4);
                            }
                        } else {
                            bufferedReader.close();
                        }
                        throw th3;
                    }
                }
            } catch (IOException e11) {
                Exception ex1 = new RuntimeException("read tracer", e11);
                throw ex1;
            }
        } catch (Exception ex2) {
            throw ex2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static int Iii1Iii1IlIi1(int i11) throws Exception {
        try {
            int[] iArr = new int[0];
            try {
                FileInputStream fileInputStream = new FileInputStream("/system/bin/app_process");
                Throwable th2 = null;
                try {
                    fileInputStream.read();
                    fileInputStream.close();
                } catch (Throwable th3) {
                    if (th2 != null) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th4) {
                            th2.addSuppressed(th4);
                        }
                    } else {
                        fileInputStream.close();
                    }
                    throw th3;
                }
            } catch (IOException unused) {
            }
            SystemClock.sleep(2000L);
            return Iii1Iii1IIIi1(i11);
        } catch (Exception ex1) {
            throw ex1;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static int bytes2int(byte[] bArr) throws Exception {
        try {
            int[] iArr = new int[0];
            return bArr[3] | ((((((0 | bArr[0]) << 8) | bArr[1]) << 8) | bArr[2]) << 8);
        } catch (Exception ex1) {
            throw ex1;
        }
    }

    /* JADX INFO: renamed from: d */
    public static native String m68581d(String str);

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public static void m68582g(Object obj) throws Exception {
        try {
            int[] iArr = new int[0];
        } catch (Exception ex1) {
            throw ex1;
        }
    }

    public static native Object[] gah();

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static Object getFieldValue(Class<?> cls, Object obj, String str) throws Exception {
        try {
            int[] iArr = new int[0];
            try {
                Field declaredField = cls.getDeclaredField(str);
                declaredField.setAccessible(true);
                return declaredField.get(obj);
            } catch (IllegalAccessException e11) {
                e11.printStackTrace();
                return null;
            } catch (IllegalArgumentException e12) {
                e12.printStackTrace();
                return null;
            } catch (NoSuchFieldException e13) {
                e13.printStackTrace();
                return null;
            }
        } catch (Exception ex1) {
            throw ex1;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static Object getFieldValue(String str, Object obj, String str2) throws Exception {
        try {
            int[] iArr = new int[0];
            try {
                return getFieldValue(Class.forName(str), obj, str2);
            } catch (ClassNotFoundException e11) {
                e11.printStackTrace();
                return null;
            } catch (IllegalArgumentException e12) {
                e12.printStackTrace();
                return null;
            }
        } catch (Exception ex1) {
            throw ex1;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private static int getRuntimeAbi() throws Exception {
        FileInputStream fileInputStream;
        try {
            int[] iArr = new int[0];
            byte[] bArr = new byte[20];
            int i11 = 0;
            try {
                fileInputStream = new FileInputStream("/proc/self/exe");
                try {
                    fileInputStream.read(bArr);
                    int iBytes2int = bytes2int(new byte[]{0, 0, bArr[19], bArr[18]});
                    if (iBytes2int == 3 || iBytes2int == 6 || iBytes2int == 7) {
                        i11 = 1;
                    } else if (iBytes2int == 62) {
                        i11 = 2;
                    }
                } catch (Exception unused) {
                    if (fileInputStream != null) {
                    }
                    return i11;
                } catch (Throwable th2) {
                    ex1 = th2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw ex1;
                }
            } catch (Exception unused3) {
                fileInputStream = null;
            } catch (Throwable th3) {
                ex1 = th3;
                fileInputStream = null;
            }
            try {
                fileInputStream.close();
            } catch (IOException unused4) {
            }
            return i11;
        } catch (Exception ex1) {
            throw ex1;
        }
    }

    public static native int gha(String str);

    public static native long ghc(String str);

    /* JADX INFO: renamed from: gv */
    public static native int m68583gv();

    /* JADX INFO: renamed from: he */
    private static native void m68584he(int i11);

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static void init() throws Exception {
        try {
            int[] iArr = new int[0];
            Iii1Iii1IIIi1(0);
        } catch (Exception ex1) {
            throw ex1;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static Object invokeMethod(Class<?> cls, Object obj, Object[] objArr, String str, Class<?>... clsArr) throws Exception {
        try {
            int[] iArr = new int[0];
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                declaredMethod.setAccessible(true);
                return declaredMethod.invoke(obj, objArr);
            } catch (IllegalAccessException e11) {
                e11.printStackTrace();
                return null;
            } catch (IllegalArgumentException e12) {
                e12.printStackTrace();
                return null;
            } catch (NoSuchMethodException e13) {
                e13.printStackTrace();
                return null;
            } catch (InvocationTargetException e14) {
                e14.printStackTrace();
                return null;
            }
        } catch (Exception ex1) {
            throw ex1;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static boolean isNeedLoadX86() throws Exception {
        try {
            int[] iArr = new int[0];
            boolean zEqualsIgnoreCase = HAVEX86.equalsIgnoreCase(CredentialEntry.TRUE_STRING);
            boolean zEqualsIgnoreCase2 = HAVEX8664.equalsIgnoreCase(CredentialEntry.TRUE_STRING);
            int runtimeAbi = getRuntimeAbi();
            if (runtimeAbi != 1 || zEqualsIgnoreCase) {
                return runtimeAbi == 2 && !zEqualsIgnoreCase2;
            }
            return true;
        } catch (Exception ex1) {
            throw ex1;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static void load(ApplicationInfo applicationInfo) throws Exception {
        try {
            int[] iArr = new int[0];
            synchronized (isLoaded) {
                if (!isLoaded.booleanValue()) {
                    try {
                        System.loadLibrary(isNeedLoadX86() ? X86_LIBRARY : ARM_LIBRARY);
                    } catch (Throwable unused) {
                        loadLib(applicationInfo);
                    }
                    isLoaded = Boolean.TRUE;
                }
            }
        } catch (Exception ex1) {
            throw ex1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0130 A[Catch: Exception -> 0x0139, TryCatch #3 {Exception -> 0x0139, blocks: (B:21:0x004c, B:23:0x0055, B:25:0x0071, B:27:0x008d, B:28:0x009f, B:47:0x00fc, B:48:0x00ff, B:71:0x0128, B:75:0x0130, B:77:0x0135, B:78:0x0138, B:65:0x0119, B:31:0x00ab, B:33:0x00c7, B:68:0x011f), top: B:81:0x004c, inners: #8 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0135 A[Catch: Exception -> 0x0139, TryCatch #3 {Exception -> 0x0139, blocks: (B:21:0x004c, B:23:0x0055, B:25:0x0071, B:27:0x008d, B:28:0x009f, B:47:0x00fc, B:48:0x00ff, B:71:0x0128, B:75:0x0130, B:77:0x0135, B:78:0x0138, B:65:0x0119, B:31:0x00ab, B:33:0x00c7, B:68:0x011f), top: B:81:0x004c, inners: #8 }] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static void loadLib(ApplicationInfo applicationInfo) throws Exception {
        int runtimeAbi;
        ZipEntry entry;
        StringBuilder sb2;
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        try {
            int[] iArr = new int[0];
            if (Build.VERSION.SDK_INT >= 19 && (runtimeAbi = getRuntimeAbi()) != 0) {
                String str = applicationInfo.sourceDir;
                File file = new File(applicationInfo.dataDir, ".cache");
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(file, "lib" + X86_LIBRARY + ".so");
                try {
                    ZipFile zipFile = new ZipFile(str);
                    InputStream inputStream2 = null;
                    if (runtimeAbi == 1) {
                        entry = zipFile.getEntry("lib/armeabi-v7a/lib" + X86_LIBRARY + ".so");
                        if (entry == null) {
                            entry = zipFile.getEntry("lib/armeabi/lib" + X86_LIBRARY + ".so");
                        }
                        if (entry == null) {
                            sb2 = new StringBuilder();
                            sb2.append("lib/x86/lib");
                            sb2.append(ARM_LIBRARY);
                            sb2.append(".so");
                            entry = zipFile.getEntry(sb2.toString());
                        }
                    }
                    if (runtimeAbi == 2) {
                        entry = zipFile.getEntry("lib/arm64-v8a/lib" + X86_LIBRARY + ".so");
                        if (entry == null) {
                            sb2 = new StringBuilder();
                            sb2.append("lib/x86_64/lib");
                            sb2.append(ARM_LIBRARY);
                            sb2.append(".so");
                            entry = zipFile.getEntry(sb2.toString());
                        }
                    }
                    entry = null;
                    if (entry == null) {
                        return;
                    }
                    try {
                        inputStream = zipFile.getInputStream(entry);
                        try {
                            fileOutputStream = new FileOutputStream(file2);
                            try {
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int i11 = inputStream.read(bArr);
                                    if (i11 == -1) {
                                        break;
                                    } else {
                                        fileOutputStream.write(bArr, 0, i11);
                                    }
                                }
                                fileOutputStream.flush();
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                            } catch (Exception e11) {
                                e = e11;
                                inputStream2 = inputStream;
                                try {
                                    e.printStackTrace();
                                    if (inputStream2 != null) {
                                        inputStream2.close();
                                    }
                                    if (fileOutputStream != null) {
                                    }
                                    m68585sl(file2.getAbsolutePath());
                                } catch (Throwable th2) {
                                    th = th2;
                                    inputStream = inputStream2;
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    if (fileOutputStream != null) {
                                        fileOutputStream.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                throw th;
                            }
                        } catch (Exception e12) {
                            e = e12;
                            fileOutputStream = null;
                        } catch (Throwable th4) {
                            th = th4;
                            fileOutputStream = null;
                        }
                    } catch (Exception e13) {
                        e = e13;
                        fileOutputStream = null;
                    } catch (Throwable th5) {
                        th = th5;
                        inputStream = null;
                        fileOutputStream = null;
                    }
                    fileOutputStream.close();
                    try {
                        m68585sl(file2.getAbsolutePath());
                    } catch (Throwable th6) {
                        th6.printStackTrace();
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Exception ex1) {
            throw ex1;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static void main(String[] strArr) throws Exception {
        ParcelFileDescriptor parcelFileDescriptorAdoptFd;
        try {
            int[] iArr = new int[0];
            if (strArr.length != 4) {
                System.exit(1);
            }
            int i11 = 0;
            Throwable th2 = null;
            try {
                parcelFileDescriptorAdoptFd = ParcelFileDescriptor.adoptFd(Integer.parseInt(strArr[1]));
                try {
                    i11 = Integer.parseInt(strArr[3]);
                } catch (Exception unused) {
                    System.exit(1);
                }
            } catch (Exception unused2) {
                parcelFileDescriptorAdoptFd = null;
            }
            try {
                int iIii1Iii1IlIi1 = Iii1Iii1IlIi1(i11);
                DataOutputStream dataOutputStream = new DataOutputStream(new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorAdoptFd));
                try {
                    dataOutputStream.writeUTF(Integer.toString(iIii1Iii1IlIi1));
                    dataOutputStream.close();
                } catch (Throwable th3) {
                    if (0 != 0) {
                        try {
                            dataOutputStream.close();
                        } catch (Throwable th4) {
                            th2.addSuppressed(th4);
                        }
                    } else {
                        dataOutputStream.close();
                    }
                    throw th3;
                }
            } catch (Throwable unused3) {
                System.exit(1);
            }
        } catch (Exception ex1) {
            throw ex1;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static boolean setFieldValue(Class<?> cls, Object obj, String str, Object obj2) throws Exception {
        try {
            int[] iArr = new int[0];
            try {
                Field declaredField = cls.getDeclaredField(str);
                declaredField.setAccessible(true);
                declaredField.set(obj, obj2);
                return true;
            } catch (IllegalAccessException e11) {
                e11.printStackTrace();
                return false;
            } catch (IllegalArgumentException e12) {
                e12.printStackTrace();
                return false;
            } catch (NoSuchFieldException e13) {
                e13.printStackTrace();
                return false;
            }
        } catch (Exception ex1) {
            throw ex1;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static boolean setFieldValue(String str, Object obj, String str2, Object obj2) throws Exception {
        try {
            int[] iArr = new int[0];
            try {
                setFieldValue(Class.forName(str), obj, str2, obj2);
                return true;
            } catch (ClassNotFoundException e11) {
                e11.printStackTrace();
                return false;
            } catch (IllegalArgumentException e12) {
                e12.printStackTrace();
                return false;
            }
        } catch (Exception ex1) {
            throw ex1;
        }
    }

    public static native void sha(String str, int i11);

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static void showToast(String str, int i11) throws Exception {
        try {
            int[] iArr = new int[0];
            Application application = sApp;
            if (application == null || application.getBaseContext() == null) {
                return;
            }
            new Handler(Looper.getMainLooper()).post(new RunnableC27624a(str, i11));
        } catch (Exception ex1) {
            throw ex1;
        }
    }

    /* JADX INFO: renamed from: sl */
    private static native void m68585sl(String str);

    /* JADX INFO: renamed from: sn */
    public static native int m68586sn(String str);
}
