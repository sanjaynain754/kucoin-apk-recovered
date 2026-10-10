package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.sns.internal.features.data.repository.dynamic.C29980i;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.z1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31372z1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f63570a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31243a2 f63571b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31372z1(C31243a2 c31243a2, Continuation continuation) {
        super(2, continuation);
        this.f63571b = c31243a2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31372z1 c31372z1 = new C31372z1(this.f63571b, continuation);
        c31372z1.f63570a = obj;
        return c31372z1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C31372z1 c31372z1 = new C31372z1(this.f63571b, (Continuation) obj2);
        c31372z1.f63570a = (C29980i) obj;
        return c31372z1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C29980i c29980i = (C29980i) this.f63570a;
        C31243a2 c31243a2 = this.f63571b;
        KProperty[] kPropertyArr = C31243a2.f63220x;
        c31243a2.handleDataUpdated(c29980i);
        return Unit.INSTANCE;
    }
}
