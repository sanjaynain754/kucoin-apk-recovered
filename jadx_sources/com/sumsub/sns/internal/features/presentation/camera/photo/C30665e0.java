package com.sumsub.sns.internal.features.presentation.camera.photo;

import androidx.core.os.BundleKt;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.e0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30665e0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C30736v0 f61967a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30665e0(C30736v0 c30736v0, Continuation continuation) {
        super(2, continuation);
        this.f61967a = c30736v0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30665e0(this.f61967a, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C30665e0(this.f61967a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC30399D interfaceC30399D;
        Pair pairM90091to;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C30400E c30400e = (C30400E) this.f61967a.f62103p.getValue();
        if (c30400e != null && (interfaceC30399D = c30400e.f61160a) != null) {
            C30736v0 c30736v0 = this.f61967a;
            Pair pairM90091to2 = TuplesKt.m90091to("result_selected_country", interfaceC30399D.mo70271a());
            if (interfaceC30399D instanceof C30687p) {
                pairM90091to = TuplesKt.m90091to("result_selected_id_doc_type", ((C30687p) interfaceC30399D).f62012b.f59176a);
            } else if (interfaceC30399D instanceof C30733u) {
                pairM90091to = TuplesKt.m90091to("result_selected_ekyc_source", ((C30733u) interfaceC30399D).f62083b);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC28052C.finishWithResult$default(c30736v0, 0, BundleKt.bundleOf(pairM90091to2, pairM90091to), 1, null);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
