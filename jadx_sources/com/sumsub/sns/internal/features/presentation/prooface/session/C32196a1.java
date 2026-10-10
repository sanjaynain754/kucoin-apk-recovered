package com.sumsub.sns.internal.features.presentation.prooface.session;

import com.sumsub.sns.internal.features.data.model.prooface.C29798A;
import com.sumsub.sns.internal.features.presentation.prooface.utils.AbstractC32267d;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.a1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32196a1 implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f65568a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32202c1 f65569b;

    public C32196a1(InterfaceC41635f interfaceC41635f, C32202c1 c32202c1) {
        this.f65568a = interfaceC41635f;
        this.f65569b = c32202c1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C32193Z0 c32193z0;
        if (continuation instanceof C32193Z0) {
            c32193z0 = (C32193Z0) continuation;
            int i11 = c32193z0.f65564b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32193z0.f65564b = i11 - Integer.MIN_VALUE;
            } else {
                c32193z0 = new C32193Z0(this, continuation);
            }
        } else {
            c32193z0 = new C32193Z0(this, continuation);
        }
        Object obj2 = c32193z0.f65563a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32193z0.f65564b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f65568a;
            Pair pair = (Pair) obj;
            C29798A c29798a = (C29798A) pair.component1();
            boolean zBooleanValue = ((Boolean) pair.component2()).booleanValue();
            AbstractC32267d.m71078a("SegmentSender: segment sent. isDebug: " + zBooleanValue + ", data: " + c29798a);
            this.f65569b.f65580c.m69944a(c29798a);
            Boolean boolBoxBoolean = Boxing.boxBoolean(zBooleanValue);
            c32193z0.f65564b = 1;
            if (interfaceC41635f.emit(boolBoxBoolean, c32193z0) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj2);
        }
        return Unit.INSTANCE;
    }
}
