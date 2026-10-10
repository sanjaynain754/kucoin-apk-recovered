package com.sumsub.sns.internal.features.presentation.verification2.host;

import com.sumsub.sns.internal.core.presentation.screen.base.C28929m;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.host.H */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32812H implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f67145a;

    public C32812H(InterfaceC41635f interfaceC41635f) {
        this.f67145a = interfaceC41635f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C32811G c32811g;
        if (continuation instanceof C32811G) {
            c32811g = (C32811G) continuation;
            int i11 = c32811g.f67143b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32811g.f67143b = i11 - Integer.MIN_VALUE;
            } else {
                c32811g = new C32811G(this, continuation);
            }
        } else {
            c32811g = new C32811G(this, continuation);
        }
        Object obj2 = c32811g.f67142a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32811g.f67143b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f67145a;
            C28929m c28929m = new C28929m((List) obj);
            c32811g.f67143b = 1;
            if (interfaceC41635f.emit(c28929m, c32811g) == coroutine_suspended) {
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
