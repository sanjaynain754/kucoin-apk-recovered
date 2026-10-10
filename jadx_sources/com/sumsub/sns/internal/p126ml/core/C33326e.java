package com.sumsub.sns.internal.p126ml.core;

import com.sumsub.sns.internal.core.analytics.C28368g;
import com.sumsub.sns.internal.core.analytics.PrimaryAction;
import com.sumsub.sns.internal.core.analytics.PrimaryActionState;
import com.sumsub.sns.internal.core.common.C28435a1;
import kotlinx.coroutines.AbstractC41710m1;
import org.tensorflow.lite.InterpreterApi;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.ml.core.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33326e extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC33329h f67957a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33326e(AbstractC33329h abstractC33329h, Continuation continuation) {
        super(2, continuation);
        this.f67957a = abstractC33329h;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C33326e(this.f67957a, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C33326e(this.f67957a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        AbstractC33329h abstractC33329h = this.f67957a;
        abstractC33329h.getClass();
        C28368g c28368gM69264a = new C28368g().m69264a(PrimaryAction.MlModelExecution);
        c28368gM69264a.f57846b.add(PrimaryActionState.Completed);
        Pair pairM90091to = TuplesKt.m90091to("name", abstractC33329h.mo71640d());
        double dAverageOfLong = CollectionsKt.averageOfLong(abstractC33329h.f67961b.f57949a);
        Object objValueOf = Double.valueOf(dAverageOfLong);
        if (Double.isNaN(dAverageOfLong)) {
            objValueOf = null;
        }
        if (objValueOf == null) {
            objValueOf = -1;
        }
        c28368gM69264a.f57847c = MapsKt.toMap(ArraysKt.filterNotNull(new Pair[]{pairM90091to, TuplesKt.m90091to("average", objValueOf), TuplesKt.m90091to("median", Long.valueOf(abstractC33329h.f67961b.m69318a(50.0d))), TuplesKt.m90091to("p99", Long.valueOf(abstractC33329h.f67961b.m69318a(99.0d))), TuplesKt.m90091to("p100", Long.valueOf(abstractC33329h.f67961b.m69318a(100.0d)))}));
        c28368gM69264a.m69267a(false);
        C28435a1 c28435a1 = abstractC33329h.f67961b;
        c28435a1.f57949a.clear();
        c28435a1.f57950b = true;
        InterpreterApi interpreterApi = this.f67957a.f67962c;
        if (interpreterApi != null) {
            interpreterApi.close();
        }
        AbstractC33329h abstractC33329h2 = this.f67957a;
        abstractC33329h2.f67962c = null;
        ((AbstractC41710m1) abstractC33329h2.f67964e.getValue()).close();
        return Unit.INSTANCE;
    }
}
