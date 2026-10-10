package com.sumsub.sns.internal.features.presentation.verification;

import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification.K */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32686K implements InterfaceC41634e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41634e f66772a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32720j0 f66773b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f66774c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f66775d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ CharSequence f66776e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CharSequence f66777f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f66778g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ CharSequence f66779h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ CharSequence f66780i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean f66781j;

    public C32686K(InterfaceC41634e interfaceC41634e, C32720j0 c32720j0, String str, boolean z11, CharSequence charSequence, CharSequence charSequence2, String str2, CharSequence charSequence3, CharSequence charSequence4, boolean z12) {
        this.f66772a = interfaceC41634e;
        this.f66773b = c32720j0;
        this.f66774c = str;
        this.f66775d = z11;
        this.f66776e = charSequence;
        this.f66777f = charSequence2;
        this.f66778g = str2;
        this.f66779h = charSequence3;
        this.f66780i = charSequence4;
        this.f66781j = z12;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41634e
    public final Object collect(InterfaceC41635f interfaceC41635f, Continuation continuation) {
        Object objCollect = this.f66772a.collect(new C32685J(interfaceC41635f, this.f66773b, this.f66774c, this.f66775d, this.f66776e, this.f66777f, this.f66778g, this.f66779h, this.f66780i, this.f66781j), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }
}
