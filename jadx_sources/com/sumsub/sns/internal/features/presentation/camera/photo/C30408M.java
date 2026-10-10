package com.sumsub.sns.internal.features.presentation.camera.photo;

import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.M */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30408M implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f61183a;

    public C30408M(InterfaceC41635f interfaceC41635f) {
        this.f61183a = interfaceC41635f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C30407L c30407l;
        if (continuation instanceof C30407L) {
            c30407l = (C30407L) continuation;
            int i11 = c30407l.f61181b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30407l.f61181b = i11 - Integer.MIN_VALUE;
            } else {
                c30407l = new C30407L(this, continuation);
            }
        } else {
            c30407l = new C30407L(this, continuation);
        }
        Object obj2 = c30407l.f61180a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30407l.f61181b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f61183a;
            C30683n c30683n = new C30683n((List) obj);
            c30407l.f61181b = 1;
            if (interfaceC41635f.emit(c30683n, c30407l) == coroutine_suspended) {
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
