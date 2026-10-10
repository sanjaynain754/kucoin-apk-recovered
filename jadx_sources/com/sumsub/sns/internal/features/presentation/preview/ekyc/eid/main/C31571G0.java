package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main;

import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.G0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31571G0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public InterfaceC41669n f64102a;

    /* JADX INFO: renamed from: b */
    public int f64103b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f64104c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C31583M0 f64105d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31571G0(boolean z11, C31583M0 c31583m0, Continuation continuation) {
        super(2, continuation);
        this.f64104c = z11;
        this.f64105d = c31583m0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31571G0(this.f64104c, this.f64105d, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31571G0(this.f64104c, this.f64105d, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41669n interfaceC41669n;
        InterfaceC41669n interfaceC41669n2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f64103b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    interfaceC41669n = this.f64102a;
                    ResultKt.throwOnFailure(obj);
                    interfaceC41669n.setValue(obj);
                    this.f64105d.f64144g.setValue(null);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                interfaceC41669n2 = this.f64102a;
                ResultKt.throwOnFailure(obj);
                interfaceC41669n2.setValue(obj);
            }
        } else {
            ResultKt.throwOnFailure(obj);
            if (this.f64104c) {
                C31583M0 c31583m0 = this.f64105d;
                InterfaceC41669n interfaceC41669n3 = c31583m0.f64145h;
                this.f64102a = interfaceC41669n3;
                this.f64103b = 1;
                obj = c31583m0.getString("sns_eid_nfcScan_hint_scanning", this);
                if (obj != coroutine_suspended) {
                    interfaceC41669n2 = interfaceC41669n3;
                    interfaceC41669n2.setValue(obj);
                }
            } else {
                C31583M0 c31583m1 = this.f64105d;
                InterfaceC41669n interfaceC41669n4 = c31583m1.f64145h;
                this.f64102a = interfaceC41669n4;
                this.f64103b = 2;
                obj = c31583m1.getString("sns_eid_nfcScan_hint_searching", this);
                if (obj != coroutine_suspended) {
                    interfaceC41669n = interfaceC41669n4;
                    interfaceC41669n.setValue(obj);
                    this.f64105d.f64144g.setValue(null);
                }
            }
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
