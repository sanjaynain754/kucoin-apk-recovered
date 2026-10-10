package com.sumsub.sns.internal.features.presentation.sumsubid;

import com.sumsub.sns.core.presentation.base.C28075O;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.A0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32459A0 implements InterfaceC41634e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41634e f66175a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C28075O f66176b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32557s f66177c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32487O0 f66178d;

    public C32459A0(InterfaceC41634e interfaceC41634e, C28075O c28075o, C32557s c32557s, C32487O0 c32487o0) {
        this.f66175a = interfaceC41634e;
        this.f66176b = c28075o;
        this.f66177c = c32557s;
        this.f66178d = c32487o0;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41634e
    public final Object collect(InterfaceC41635f interfaceC41635f, Continuation continuation) {
        Object objCollect = this.f66175a.collect(new C32609z0(interfaceC41635f, this.f66176b, this.f66177c, this.f66178d), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }
}
