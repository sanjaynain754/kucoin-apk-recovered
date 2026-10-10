package com.sumsub.sns.internal.core.domain.facedetector;

import com.sumsub.sns.internal.core.analytics.C28368g;
import com.sumsub.sns.internal.core.analytics.PrimaryAction;
import com.sumsub.sns.internal.core.analytics.PrimaryActionState;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.domain.facedetector.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28556b extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C28558d f58110a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28556b(C28558d c28558d, Continuation continuation) {
        super(2, continuation);
        this.f58110a = c28558d;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C28556b(this.f58110a, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C28556b(this.f58110a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        InterfaceC28561g interfaceC28561gM69414a = this.f58110a.m69414a();
        if (interfaceC28561gM69414a != null) {
            C28368g c28368gM69264a = new C28368g().m69264a(PrimaryAction.FaceDetection);
            c28368gM69264a.f57846b.add(PrimaryActionState.Completed);
            c28368gM69264a.f57847c = MapsKt.toMap(ArraysKt.filterNotNull(new Pair[]{TuplesKt.m90091to("detector", interfaceC28561gM69414a.getName()), TuplesKt.m90091to("start", 1)}));
            c28368gM69264a.m69267a(false);
        }
        return Unit.INSTANCE;
    }
}
