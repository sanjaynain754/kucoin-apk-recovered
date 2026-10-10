package com.sumsub.sns.internal.features.presentation.prooface.session;

import com.sumsub.sns.internal.features.data.network.prooface.C29891f;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.U */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32182U implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f65541a;

    public C32182U(InterfaceC41635f interfaceC41635f) {
        this.f65541a = interfaceC41635f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C32180T c32180t;
        if (continuation instanceof C32180T) {
            c32180t = (C32180T) continuation;
            int i11 = c32180t.f65538b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32180t.f65538b = i11 - Integer.MIN_VALUE;
            } else {
                c32180t = new C32180T(this, continuation);
            }
        } else {
            c32180t = new C32180T(this, continuation);
        }
        Object obj2 = c32180t.f65537a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32180t.f65538b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f65541a;
            if (obj instanceof C29891f) {
                c32180t.f65538b = 1;
                if (interfaceC41635f.emit(obj, c32180t) == coroutine_suspended) {
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
