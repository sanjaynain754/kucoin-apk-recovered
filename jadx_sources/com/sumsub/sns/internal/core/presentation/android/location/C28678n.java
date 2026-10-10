package com.sumsub.sns.internal.core.presentation.android.location;

import androidx.lifecycle.Lifecycle;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.android.location.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28678n implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f58315a;

    public C28678n(InterfaceC41635f interfaceC41635f) {
        this.f58315a = interfaceC41635f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C28677m c28677m;
        if (continuation instanceof C28677m) {
            c28677m = (C28677m) continuation;
            int i11 = c28677m.f58313b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c28677m.f58313b = i11 - Integer.MIN_VALUE;
            } else {
                c28677m = new C28677m(this, continuation);
            }
        } else {
            c28677m = new C28677m(this, continuation);
        }
        Object obj2 = c28677m.f58312a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c28677m.f58313b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f58315a;
            Boolean boolBoxBoolean = Boxing.boxBoolean(((Lifecycle.State) obj).isAtLeast(Lifecycle.State.STARTED));
            c28677m.f58313b = 1;
            if (interfaceC41635f.emit(boolBoxBoolean, c28677m) == coroutine_suspended) {
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
