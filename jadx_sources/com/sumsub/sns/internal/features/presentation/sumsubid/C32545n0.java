package com.sumsub.sns.internal.features.presentation.sumsubid;

import com.sumsub.sns.core.presentation.base.C28075O;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29130i;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import java.util.ArrayList;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.n0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32545n0 implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f66390a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C28075O f66391b;

    public C32545n0(InterfaceC41635f interfaceC41635f, C28075O c28075o) {
        this.f66390a = interfaceC41635f;
        this.f66391b = c28075o;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C32542m0 c32542m0;
        if (continuation instanceof C32542m0) {
            c32542m0 = (C32542m0) continuation;
            int i11 = c32542m0.f66387b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32542m0.f66387b = i11 - Integer.MIN_VALUE;
            } else {
                c32542m0 = new C32542m0(this, continuation);
            }
        } else {
            c32542m0 = new C32542m0(this, continuation);
        }
        Object obj2 = c32542m0.f66386a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32542m0.f66387b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f66390a;
            ArrayList arrayList = (ArrayList) obj;
            C29124h c29124h = this.f66391b.f57270b;
            C32491Q0 c32491q0 = new C32491Q0(c29124h != null ? AbstractC29130i.m69770a("sumsubid.reuse.actionContinue", c29124h.f59089v) : null, c29124h != null ? AbstractC29130i.m69770a("sumsubid.reuse.footer", c29124h.f59089v) : null, arrayList, new C32520f(Control.ContinueButton, C32468F.f66204a));
            c32542m0.f66387b = 1;
            if (interfaceC41635f.emit(c32491q0, c32542m0) == coroutine_suspended) {
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
