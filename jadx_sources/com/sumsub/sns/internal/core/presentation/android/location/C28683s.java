package com.sumsub.sns.internal.core.presentation.android.location;

import com.sumsub.sns.internal.features.domain.utils.C30317b;
import com.tencent.bugly.proguard.C33627eb;
import kotlinx.coroutines.InterfaceC41769w;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41678w;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.android.location.s */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28683s {

    /* JADX INFO: renamed from: a */
    public final Function0 f58327a;

    /* JADX INFO: renamed from: b */
    public final C30317b f58328b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC41669n f58329c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC41678w f58330d;

    /* JADX INFO: renamed from: e */
    public InterfaceC41769w f58331e;

    /* JADX INFO: renamed from: a */
    public final void m69497a(boolean z11) {
        InterfaceC41769w interfaceC41769w = this.f58331e;
        if (interfaceC41769w == null) {
            return;
        }
        this.f58331e = null;
        this.f58329c.setValue(LocationServiceController$Phase.Idle);
        m69496a("resolved: enabled=" + z11);
        interfaceC41769w.mo91370n(Boolean.valueOf(z11));
    }

    /* JADX INFO: renamed from: b */
    public final void m69498b(boolean z11) {
        if (this.f58331e == null || this.f58329c.getValue() != LocationServiceController$Phase.AwaitingSettingsReturn) {
            return;
        }
        m69496a("settings return: enabled=" + z11);
        if (z11) {
            m69497a(true);
        } else {
            this.f58329c.setValue(LocationServiceController$Phase.CheckRequested);
        }
    }

    public C28683s(Function0 function0, C30317b c30317b) {
        this.f58327a = function0;
        this.f58328b = c30317b;
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(LocationServiceController$Phase.Idle);
        this.f58329c = interfaceC41669nM91009a;
        this.f58330d = C41636g.m90907c(interfaceC41669nM91009a);
    }

    /* JADX INFO: renamed from: a */
    public final void m69496a(String str) {
        C30317b.m70184a(this.f58328b, "LocationServiceController" + C33627eb.f69716f + str);
    }
}
