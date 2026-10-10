package com.sumsub.sns.internal.features.presentation.prooface.session;

import com.sumsub.sns.internal.features.data.network.prooface.C29893h;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.Y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32190Y implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f65559a;

    public C32190Y(InterfaceC41635f interfaceC41635f) {
        this.f65559a = interfaceC41635f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C32188X c32188x;
        if (continuation instanceof C32188X) {
            c32188x = (C32188X) continuation;
            int i11 = c32188x.f65555b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32188x.f65555b = i11 - Integer.MIN_VALUE;
            } else {
                c32188x = new C32188X(this, continuation);
            }
        } else {
            c32188x = new C32188X(this, continuation);
        }
        Object obj2 = c32188x.f65554a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32188x.f65555b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f65559a;
            if (obj instanceof C29893h) {
                c32188x.f65555b = 1;
                if (interfaceC41635f.emit(obj, c32188x) == coroutine_suspended) {
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
