package com.sumsub.sns.internal.features.presentation.restrictions;

import com.sumsub.sns.internal.core.analytics.C28367f;
import com.sumsub.sns.internal.core.analytics.Screen;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.restrictions.A */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32331A extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f65879a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32333C f65880b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32331A(C32333C c32333c, Continuation continuation) {
        super(2, continuation);
        this.f65880b = c32333c;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C32331A c32331a = new C32331A(this.f65880b, continuation);
        c32331a.f65879a = obj;
        return c32331a;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C32331A c32331a = new C32331A(this.f65880b, (Continuation) obj2);
        c32331a.f65879a = (String) obj;
        return c32331a.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        String str = (String) this.f65879a;
        C32341g c32341g = this.f65880b.f65889d;
        c32341g.getClass();
        Screen screen = Screen.RestrictionsScreen;
        C28367f.m69259a(new C28367f(screen, c32341g.f65899a), screen, c32341g.f65899a, MapsKt.mapOf(TuplesKt.m90091to("restrictionCode", str)), 8);
        return Unit.INSTANCE;
    }
}
