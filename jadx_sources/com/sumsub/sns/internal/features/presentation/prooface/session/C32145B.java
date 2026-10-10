package com.sumsub.sns.internal.features.presentation.prooface.session;

import com.sumsub.sns.internal.features.presentation.prooface.C32016L0;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.B */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32145B implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f65436a;

    public C32145B(InterfaceC41635f interfaceC41635f) {
        this.f65436a = interfaceC41635f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C32143A c32143a;
        if (continuation instanceof C32143A) {
            c32143a = (C32143A) continuation;
            int i11 = c32143a.f65433b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32143a.f65433b = i11 - Integer.MIN_VALUE;
            } else {
                c32143a = new C32143A(this, continuation);
            }
        } else {
            c32143a = new C32143A(this, continuation);
        }
        Object obj2 = c32143a.f65432a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32143a.f65433b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f65436a;
            if (((C32016L0) obj).f65083b) {
                c32143a.f65433b = 1;
                if (interfaceC41635f.emit(obj, c32143a) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
