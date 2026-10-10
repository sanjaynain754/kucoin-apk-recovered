package com.facebook.common.statfs;

import android.annotation.SuppressLint;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p712w3.C45713m;

/* JADX INFO: loaded from: classes34.dex */
public class StatFsHelper {

    /* JADX INFO: renamed from: h */
    public static StatFsHelper f8154h;

    /* JADX INFO: renamed from: i */
    public static final long f8155i = TimeUnit.MINUTES.toMillis(2);

    /* JADX INFO: renamed from: b */
    public volatile File f8157b;

    /* JADX INFO: renamed from: d */
    public volatile File f8159d;

    /* JADX INFO: renamed from: e */
    public long f8160e;

    /* JADX INFO: renamed from: a */
    public volatile StatFs f8156a = null;

    /* JADX INFO: renamed from: c */
    public volatile StatFs f8158c = null;

    /* JADX INFO: renamed from: g */
    public volatile boolean f8162g = false;

    /* JADX INFO: renamed from: f */
    public final Lock f8161f = new ReentrantLock();

    public enum StorageType {
        INTERNAL,
        EXTERNAL
    }

    /* JADX INFO: renamed from: h */
    public final StatFs m8556h(StatFs statFs, File file) {
        if (file != null && file.exists()) {
            try {
                if (statFs == null) {
                    return m8549a(file.getAbsolutePath());
                }
                statFs.restat(file.getAbsolutePath());
                return statFs;
            } catch (IllegalArgumentException unused) {
            } catch (Throwable th2) {
                throw C45713m.m100908a(th2);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static StatFs m8549a(String str) {
        return new StatFs(str);
    }

    /* JADX INFO: renamed from: d */
    public static synchronized StatFsHelper m8550d() {
        try {
            if (f8154h == null) {
                f8154h = new StatFsHelper();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f8154h;
    }

    /* JADX INFO: renamed from: b */
    public final void m8551b() {
        if (this.f8162g) {
            return;
        }
        this.f8161f.lock();
        try {
            if (!this.f8162g) {
                this.f8157b = Environment.getDataDirectory();
                this.f8159d = Environment.getExternalStorageDirectory();
                m8555g();
                this.f8162g = true;
            }
        } finally {
            this.f8161f.unlock();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m8553e() {
        if (this.f8161f.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - this.f8160e > f8155i) {
                    m8555g();
                }
            } finally {
                this.f8161f.unlock();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m8555g() {
        this.f8156a = m8556h(this.f8156a, this.f8157b);
        this.f8158c = m8556h(this.f8158c, this.f8159d);
        this.f8160e = SystemClock.uptimeMillis();
    }

    @SuppressLint({"DeprecatedMethod"})
    /* JADX INFO: renamed from: c */
    public long m8552c(StorageType storageType) {
        StatFs statFs;
        m8551b();
        m8553e();
        if (storageType == StorageType.INTERNAL) {
            statFs = this.f8156a;
        } else {
            statFs = this.f8158c;
        }
        if (statFs != null) {
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: f */
    public boolean m8554f(StorageType storageType, long j11) {
        m8551b();
        long jM8552c = m8552c(storageType);
        if (jM8552c <= 0 || jM8552c < j11) {
            return true;
        }
        return false;
    }
}
