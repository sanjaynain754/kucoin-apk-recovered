package com.sumsub.sns.internal.features.presentation.geo;

import com.sumsub.sns.internal.core.analytics.C28367f;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31095j extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f62876a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31120v0 f62877b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31095j(C31120v0 c31120v0, Continuation continuation) {
        super(2, continuation);
        this.f62877b = c31120v0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31095j c31095j = new C31095j(this.f62877b, continuation);
        c31095j.f62876a = ((Boolean) obj).booleanValue();
        return c31095j;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.getClass();
        C31095j c31095j = new C31095j(this.f62877b, (Continuation) obj2);
        c31095j.f62876a = bool.booleanValue();
        return c31095j.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C28367f.m69260a(this.f62877b.m70585e(), MapsKt.mapOf(TuplesKt.m90091to("hasAllPermissions", Boxing.boxBoolean(this.f62876a))));
        return Unit.INSTANCE;
    }
}
