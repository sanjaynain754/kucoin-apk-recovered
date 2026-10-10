package com.sumsub.sns.internal.features.presentation.preview.photo.mrtd;

import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.V */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31847V implements InterfaceC41634e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41634e f64725a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31848W f64726b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Function2 f64727c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C31868f0 f64728d;

    public C31847V(InterfaceC41634e interfaceC41634e, C31848W c31848w, Function2 function2, C31868f0 c31868f0) {
        this.f64725a = interfaceC41634e;
        this.f64726b = c31848w;
        this.f64727c = function2;
        this.f64728d = c31868f0;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41634e
    public final Object collect(InterfaceC41635f interfaceC41635f, Continuation continuation) {
        Object objCollect = this.f64725a.collect(new C31846U(interfaceC41635f, this.f64726b, this.f64727c, this.f64728d), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }
}
