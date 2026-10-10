package com.tencent.bugly.proguard;

import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.u0 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public final class C33948u0 extends ReentrantLock {

    /* JADX INFO: renamed from: b */
    public static final long f72167b = -3283069816958445549L;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.u0$a */
    /* JADX INFO: compiled from: BUGLY */
    public static final class a implements InterfaceC33708i8 {

        /* JADX INFO: renamed from: b */
        @NotNull
        public final ReentrantLock f72168b;

        @Override // com.tencent.bugly.proguard.InterfaceC33708i8, java.lang.AutoCloseable
        public void close() {
            this.f72168b.unlock();
        }

        public a(@NotNull ReentrantLock reentrantLock) {
            this.f72168b = reentrantLock;
        }
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC33708i8 m75112a() {
        lock();
        return new a(this);
    }
}
