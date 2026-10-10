package com.facebook.soloader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes45.dex */
public class SoFileLoaderImpl implements SoFileLoader {
    private static final String TAG = "SoFileLoaderImpl";
    private final Runtime mRuntime = null;
    private final Method mNativeLoadRuntimeMethod = null;
    private final String mLocalLdLibraryPath = null;
    private final String mLocalLdLibraryPathNoZips = null;

    private String getLibHash(String str) {
        try {
            File file = new File(str);
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int i11 = fileInputStream.read(bArr);
                    if (i11 <= 0) {
                        String str2 = String.format("%32x", new BigInteger(1, messageDigest.digest()));
                        fileInputStream.close();
                        return str2;
                    }
                    messageDigest.update(bArr, 0, i11);
                }
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException | SecurityException | NoSuchAlgorithmException e11) {
            return e11.toString();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r2 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
    
        com.facebook.soloader.LogUtil.m10652e(com.facebook.soloader.SoFileLoaderImpl.TAG, "Error when loading library: " + r2 + ", library hash is " + getLibHash(r7) + ", LD_LIBRARY_PATH is " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
    
        return;
     */
    @Override // com.facebook.soloader.SoFileLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void load(String str, int i11) throws Throwable {
        Throwable th2;
        Object e11;
        if (this.mNativeLoadRuntimeMethod == null) {
            System.load(str);
            return;
        }
        String str2 = (i11 & 4) == 4 ? this.mLocalLdLibraryPath : this.mLocalLdLibraryPathNoZips;
        String str3 = null;
        try {
            try {
                try {
                    try {
                        synchronized (this.mRuntime) {
                            try {
                                String str4 = (String) this.mNativeLoadRuntimeMethod.invoke(this.mRuntime, str, SoLoader.class.getClassLoader(), str2);
                                if (str4 != null) {
                                    str3 = "nativeLoad() returned error for " + str + ": " + str4;
                                    throw new SoLoaderULError(str, str3);
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                    try {
                        throw th;
                    } catch (IllegalAccessException e12) {
                        e11 = e12;
                        throw new RuntimeException("nativeLoad() error during invocation for " + str + ": " + e11);
                    } catch (IllegalArgumentException e13) {
                        e11 = e13;
                        throw new RuntimeException("nativeLoad() error during invocation for " + str + ": " + e11);
                    } catch (InvocationTargetException e14) {
                        e11 = e14;
                        throw new RuntimeException("nativeLoad() error during invocation for " + str + ": " + e11);
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                    if (0 != 0) {
                        LogUtil.m10652e(TAG, "Error when loading library: " + ((String) null) + ", library hash is " + getLibHash(str) + ", LD_LIBRARY_PATH is " + str2);
                    }
                    throw th2;
                }
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e15) {
                e11 = e15;
            }
        } catch (Throwable th6) {
            th2 = th6;
        }
    }

    @Override // com.facebook.soloader.SoFileLoader
    public void loadBytes(String str, ElfByteChannel elfByteChannel, int i11) {
        throw new UnsupportedOperationException();
    }
}
