package com.tencent.liteav.base.storage;

import com.tencent.liteav.base.annotations.JNINamespace;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav")
public class PersistStorageMmkv {
    private long mNativePersistStorageMmkv;

    private static native void nativeClear(long j11, String str);

    private static native void nativeCommit(long j11);

    private static native long nativeCreatePersistStorageMmkv(String str);

    private static native void nativeDestroyPersistStorageMmkv(long j11);

    private static native String[] nativeGetAllKeys(long j11);

    private static native Integer nativeGetInt32(long j11, String str);

    private static native Long nativeGetLong(long j11, String str);

    private static native String nativeGetString(long j11, String str);

    private static native void nativePutInt32(long j11, String str, int i11);

    private static native void nativePutLong(long j11, String str, long j12);

    private static native void nativePutString(long j11, String str, String str2);

    public void put(String str, int i11) {
        long j11 = this.mNativePersistStorageMmkv;
        if (j11 == 0) {
            return;
        }
        try {
            nativePutInt32(j11, str, i11);
        } catch (Throwable unused) {
        }
    }

    public void clear(String str) {
        long j11 = this.mNativePersistStorageMmkv;
        if (j11 == 0) {
            return;
        }
        try {
            nativeClear(j11, str);
        } catch (Throwable unused) {
        }
    }

    public void commit() {
        long j11 = this.mNativePersistStorageMmkv;
        if (j11 == 0) {
            return;
        }
        try {
            nativeCommit(j11);
        } catch (Throwable unused) {
        }
    }

    public String[] getAllKeys() {
        long j11 = this.mNativePersistStorageMmkv;
        if (j11 == 0) {
            return new String[0];
        }
        try {
            String[] strArrNativeGetAllKeys = nativeGetAllKeys(j11);
            return strArrNativeGetAllKeys == null ? new String[0] : strArrNativeGetAllKeys;
        } catch (Throwable unused) {
            return new String[0];
        }
    }

    public Integer getInt(String str) {
        long j11 = this.mNativePersistStorageMmkv;
        if (j11 == 0) {
            return null;
        }
        try {
            return nativeGetInt32(j11, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public Long getLong(String str) {
        long j11 = this.mNativePersistStorageMmkv;
        if (j11 == 0) {
            return null;
        }
        try {
            return nativeGetLong(j11, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getString(String str) {
        long j11 = this.mNativePersistStorageMmkv;
        if (j11 == 0) {
            return null;
        }
        try {
            return nativeGetString(j11, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public PersistStorageMmkv(String str) {
        this.mNativePersistStorageMmkv = 0L;
        this.mNativePersistStorageMmkv = nativeCreatePersistStorageMmkv(str);
    }

    public void finalize() throws Throwable {
        super.finalize();
        long j11 = this.mNativePersistStorageMmkv;
        if (j11 != 0) {
            nativeDestroyPersistStorageMmkv(j11);
        }
    }

    public void put(String str, long j11) {
        long j12 = this.mNativePersistStorageMmkv;
        if (j12 == 0) {
            return;
        }
        try {
            nativePutLong(j12, str, j11);
        } catch (Throwable unused) {
        }
    }

    public void put(String str, String str2) {
        long j11 = this.mNativePersistStorageMmkv;
        if (j11 == 0) {
            return;
        }
        try {
            nativePutString(j11, str, str2);
        } catch (Throwable unused) {
        }
    }
}
