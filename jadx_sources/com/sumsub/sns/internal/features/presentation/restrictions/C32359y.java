package com.sumsub.sns.internal.features.presentation.restrictions;

import com.sumsub.sns.internal.features.data.model.common.remote.response.C29586o0;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.restrictions.y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32359y implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f65934a;

    public C32359y(InterfaceC41635f interfaceC41635f, C32333C c32333c) {
        this.f65934a = interfaceC41635f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C32358x c32358x;
        String str;
        if (continuation instanceof C32358x) {
            c32358x = (C32358x) continuation;
            int i11 = c32358x.f65932b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32358x.f65932b = i11 - Integer.MIN_VALUE;
            } else {
                c32358x = new C32358x(this, continuation);
            }
        } else {
            c32358x = new C32358x(this, continuation);
        }
        Object obj2 = c32358x.f65931a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32358x.f65932b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f65934a;
            C29586o0 c29586o0 = (C29586o0) obj;
            int i13 = C32333C.f65885V;
            if (c29586o0 == null || (str = c29586o0.f59609a) == null) {
                str = "unknown";
            }
            c32358x.f65932b = 1;
            if (interfaceC41635f.emit(str, c32358x) == coroutine_suspended) {
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
