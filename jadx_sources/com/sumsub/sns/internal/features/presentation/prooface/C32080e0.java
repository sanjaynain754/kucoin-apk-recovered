package com.sumsub.sns.internal.features.presentation.prooface;

import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.e0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32080e0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public InterfaceC41669n f65287a;

    /* JADX INFO: renamed from: b */
    public int f65288b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32109k0 f65289c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32080e0(C32109k0 c32109k0, Continuation continuation) {
        super(2, continuation);
        this.f65289c = c32109k0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C32080e0(this.f65289c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C32080e0(this.f65289c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r1.emit(r3, r4) == r0) goto L15;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC41669n interfaceC41669n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f65288b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                interfaceC41669n = this.f65287a;
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        C32109k0 c32109k0 = this.f65289c;
        interfaceC41669n = c32109k0.f65352I;
        this.f65287a = interfaceC41669n;
        this.f65288b = 1;
        obj = c32109k0.getString("sns_facescan_hint_processingTakesTooLong", this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        C31997F c31997f = new C31997F((CharSequence) obj);
        this.f65287a = null;
        this.f65288b = 2;
    }
}
