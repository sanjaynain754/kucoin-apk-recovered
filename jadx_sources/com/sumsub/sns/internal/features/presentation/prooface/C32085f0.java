package com.sumsub.sns.internal.features.presentation.prooface;

import androidx.lifecycle.ViewModelKt;
import java.util.TimerTask;
import kotlinx.coroutines.C41696j;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.f0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32085f0 extends TimerTask {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C32109k0 f65297a;

    public C32085f0(C32109k0 c32109k0) {
        this.f65297a = c32109k0;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this.f65297a), null, null, new C32080e0(this.f65297a, null), 3, null);
    }
}
