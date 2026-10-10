package com.sumsub.sns.internal.features.presentation.prooface;

import com.sumsub.sns.internal.core.presentation.camera.C28758x;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.y1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32286y1 implements InterfaceC41634e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41634e f65762a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C28758x f65763b;

    public C32286y1(InterfaceC41634e interfaceC41634e, C28758x c28758x) {
        this.f65762a = interfaceC41634e;
        this.f65763b = c28758x;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41634e
    public final Object collect(InterfaceC41635f interfaceC41635f, Continuation continuation) {
        Object objCollect = this.f65762a.collect(new C32282x1(interfaceC41635f, this.f65763b), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }
}
