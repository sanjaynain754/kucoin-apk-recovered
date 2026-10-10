package com.sumsub.sns.internal.features.presentation.verification2.phone;

import com.sumsub.sns.internal.features.presentation.verification2.host.C32818b;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.phone.D */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32845D implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f67202a;

    public C32845D(InterfaceC41635f interfaceC41635f) {
        this.f67202a = interfaceC41635f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C32844C c32844c;
        if (continuation instanceof C32844C) {
            c32844c = (C32844C) continuation;
            int i11 = c32844c.f67200b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32844c.f67200b = i11 - Integer.MIN_VALUE;
            } else {
                c32844c = new C32844C(this, continuation);
            }
        } else {
            c32844c = new C32844C(this, continuation);
        }
        Object obj2 = c32844c.f67199a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32844c.f67200b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f67202a;
            CharSequence charSequence = ((C32818b) obj).f67161b;
            c32844c.f67200b = 1;
            if (interfaceC41635f.emit(charSequence, c32844c) == coroutine_suspended) {
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
