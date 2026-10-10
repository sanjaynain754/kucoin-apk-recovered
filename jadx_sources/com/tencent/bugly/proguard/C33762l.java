package com.tencent.bugly.proguard;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.tencent.bugly.common.utils.AndroidVersion;
import com.tencent.rmonitor.common.lifecycle.IActivityStateCallback;
import com.tencent.rmonitor.common.lifecycle.LifecycleCallback;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.l */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33762l extends AbstractC33968v0 {

    /* JADX INFO: renamed from: d */
    public final IActivityStateCallback f70674d;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.l$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a extends C33758kg {
        public a() {
        }

        @Override // com.tencent.bugly.proguard.C33758kg, com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
        public void onDestroy(@NonNull Activity activity) {
            C33762l.this.m75222a(activity);
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33793m9
    /* JADX INFO: renamed from: b */
    public boolean mo72930b() {
        LifecycleCallback.register(this.f70674d);
        return true;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33793m9
    /* JADX INFO: renamed from: c */
    public void mo72931c() {
        LifecycleCallback.unRegister(this.f70674d);
    }

    public C33762l(C33565bc c33565bc) {
        super(c33565bc);
        this.f70674d = new a();
    }

    @Override // com.tencent.bugly.proguard.AbstractC33596d1, com.tencent.bugly.proguard.InterfaceC33793m9
    /* JADX INFO: renamed from: a */
    public boolean mo72765a() {
        return AndroidVersion.isOverIceScreamSandwich();
    }
}
