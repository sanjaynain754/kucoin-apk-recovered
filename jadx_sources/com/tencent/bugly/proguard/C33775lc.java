package com.tencent.bugly.proguard;

import androidx.annotation.RequiresApi;
import com.tencent.bugly.common.looper.FrameManager;
import com.tencent.bugly.common.looper.IFrame;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.lc */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@RequiresApi(api = 16)
public final class C33775lc extends C33754kc implements IFrame, ViewTreeObserverOnDrawListenerC33780lh.b {

    /* JADX INFO: renamed from: j */
    public ViewTreeObserverOnDrawListenerC33780lh f70836j;

    /* JADX INFO: renamed from: k */
    public boolean f70837k = false;

    /* JADX INFO: renamed from: l */
    public long f70838l = 0;

    /* JADX INFO: renamed from: m */
    public C33644f7 f70839m = new C33644f7();

    @Override // com.tencent.bugly.proguard.C33754kc
    /* JADX INFO: renamed from: a */
    public boolean mo73805a(String str, long j11) {
        boolean zMo73805a = super.mo73805a(str, j11);
        if (zMo73805a) {
            this.f70838l = 0L;
            ViewTreeObserverOnDrawListenerC33780lh viewTreeObserverOnDrawListenerC33780lh = this.f70836j;
            if (viewTreeObserverOnDrawListenerC33780lh != null) {
                viewTreeObserverOnDrawListenerC33780lh.m73991a(this);
            }
            FrameManager.INSTANCE.register(this);
        }
        return zMo73805a;
    }

    @Override // com.tencent.bugly.common.looper.IFrame
    public void doFrame(long j11) {
        boolean z11;
        long j12 = this.f70838l;
        if (j11 < j12 || j12 == 0) {
            this.f70838l = j11;
            return;
        }
        if (this.f70836j != null) {
            z11 = this.f70837k;
            this.f70837k = false;
        } else {
            z11 = true;
        }
        boolean z12 = z11;
        this.f70838l = j11;
        this.f70839m.m73010a(j11, j11 - j12, z12);
        m73807b(this.f70839m);
    }

    @Override // com.tencent.bugly.common.looper.IFrame
    public boolean isOpen() {
        return this.f70646c && !m73808c();
    }

    public C33775lc() {
        this.f70836j = null;
        this.f70836j = ViewTreeObserverOnDrawListenerC33780lh.m73988b();
    }

    @Override // com.tencent.bugly.proguard.C33754kc
    /* JADX INFO: renamed from: e */
    public boolean mo73810e() {
        boolean zMo73810e = super.mo73810e();
        if (zMo73810e) {
            FrameManager.INSTANCE.unRegister(this);
        }
        return zMo73810e;
    }

    @Override // com.tencent.bugly.proguard.C33754kc
    /* JADX INFO: renamed from: f */
    public boolean mo73811f() {
        boolean zMo73811f = super.mo73811f();
        if (zMo73811f) {
            this.f70838l = 0L;
            FrameManager.INSTANCE.register(this);
        }
        return zMo73811f;
    }

    @Override // com.tencent.bugly.proguard.C33754kc
    /* JADX INFO: renamed from: g */
    public boolean mo73812g() {
        boolean zMo73812g = super.mo73812g();
        if (zMo73812g) {
            this.f70838l = 0L;
            ViewTreeObserverOnDrawListenerC33780lh viewTreeObserverOnDrawListenerC33780lh = this.f70836j;
            if (viewTreeObserverOnDrawListenerC33780lh != null) {
                viewTreeObserverOnDrawListenerC33780lh.m73993b(this);
            }
            FrameManager.INSTANCE.unRegister(this);
        }
        return zMo73812g;
    }

    @Override // com.tencent.bugly.proguard.ViewTreeObserverOnDrawListenerC33780lh.b
    /* JADX INFO: renamed from: a */
    public void mo73977a() {
        this.f70837k = true;
    }
}
