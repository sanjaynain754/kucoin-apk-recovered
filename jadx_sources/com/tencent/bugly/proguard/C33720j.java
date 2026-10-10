package com.tencent.bugly.proguard;

import android.app.Activity;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.tencent.rmonitor.common.lifecycle.IActivityStateCallback;
import com.tencent.rmonitor.common.lifecycle.LifecycleCallback;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.j */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33720j implements IActivityStateCallback {

    /* JADX INFO: renamed from: b */
    public String f70308b = null;

    /* JADX INFO: renamed from: c */
    public final InterfaceC33699i f70309c;

    /* JADX INFO: renamed from: a */
    public void m73452a() {
        LifecycleCallback.register(this);
    }

    /* JADX INFO: renamed from: a */
    public final String m73451a(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onBackground() {
        this.f70309c.onBackground();
    }

    @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onForeground() {
        this.f70309c.onForeground();
    }

    public C33720j(@NotNull InterfaceC33699i interfaceC33699i) {
        this.f70309c = interfaceC33699i;
    }

    /* JADX INFO: renamed from: b */
    public void m73453b() {
        LifecycleCallback.unRegister(this);
    }

    @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onDestroy(@NotNull Activity activity) {
        if (TextUtils.equals(m73451a(activity), this.f70308b)) {
            this.f70308b = null;
        }
        this.f70309c.mo72968a(this.f70308b);
    }

    @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onResume(@NotNull Activity activity) {
        String strM73451a = m73451a(activity);
        this.f70308b = strM73451a;
        this.f70309c.mo72968a(strM73451a);
    }

    @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onCreate(@NotNull Activity activity) {
    }

    @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onPause(@NotNull Activity activity) {
    }

    @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onPostCreate(@NonNull Activity activity) {
    }

    @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onStart(@NotNull Activity activity) {
    }

    @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onStop(@NotNull Activity activity) {
    }
}
