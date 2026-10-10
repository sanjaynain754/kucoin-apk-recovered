package com.sumsub.sns.internal.features.presentation.prooface;

import com.sumsub.sns.internal.core.presentation.camera.C28758x;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.x1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32282x1 implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f65755a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C28758x f65756b;

    public C32282x1(InterfaceC41635f interfaceC41635f, C28758x c28758x) {
        this.f65755a = interfaceC41635f;
        this.f65756b = c28758x;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C32279w1 c32279w1;
        if (continuation instanceof C32279w1) {
            c32279w1 = (C32279w1) continuation;
            int i11 = c32279w1.f65750b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32279w1.f65750b = i11 - Integer.MIN_VALUE;
            } else {
                c32279w1 = new C32279w1(this, continuation);
            }
        } else {
            c32279w1 = new C32279w1(this, continuation);
        }
        Object obj2 = c32279w1.f65749a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32279w1.f65750b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f65755a;
            C32016L0 c32016l0 = new C32016L0(this.f65756b, ((Boolean) obj).booleanValue());
            c32279w1.f65750b = 1;
            if (interfaceC41635f.emit(c32016l0, c32279w1) == coroutine_suspended) {
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
