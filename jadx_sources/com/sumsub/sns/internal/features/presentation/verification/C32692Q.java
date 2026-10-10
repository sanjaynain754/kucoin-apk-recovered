package com.sumsub.sns.internal.features.presentation.verification;

import com.sumsub.sns.internal.features.domain.C30068B;
import com.sumsub.sns.internal.features.domain.C30270n;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification.Q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32692Q implements InterfaceC41634e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41634e f66821a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32720j0 f66822b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32739u f66823c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f66824d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ CharSequence f66825e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CharSequence f66826f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C30068B f66827g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ CharSequence f66828h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C30270n f66829i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ CharSequence f66830j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean f66831k;

    public C32692Q(InterfaceC41634e interfaceC41634e, C32720j0 c32720j0, C32739u c32739u, boolean z11, CharSequence charSequence, CharSequence charSequence2, C30068B c30068b, CharSequence charSequence3, C30270n c30270n, CharSequence charSequence4, boolean z12) {
        this.f66821a = interfaceC41634e;
        this.f66822b = c32720j0;
        this.f66823c = c32739u;
        this.f66824d = z11;
        this.f66825e = charSequence;
        this.f66826f = charSequence2;
        this.f66827g = c30068b;
        this.f66828h = charSequence3;
        this.f66829i = c30270n;
        this.f66830j = charSequence4;
        this.f66831k = z12;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41634e
    public final Object collect(InterfaceC41635f interfaceC41635f, Continuation continuation) {
        Object objCollect = this.f66821a.collect(new C32691P(interfaceC41635f, this.f66822b, this.f66823c, this.f66824d, this.f66825e, this.f66826f, this.f66827g, this.f66828h, this.f66829i, this.f66830j, this.f66831k), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }
}
