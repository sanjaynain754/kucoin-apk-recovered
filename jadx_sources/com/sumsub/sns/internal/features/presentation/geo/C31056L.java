package com.sumsub.sns.internal.features.presentation.geo;

import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.L */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31056L extends SuspendLambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C31120v0 f62783a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C29983l f62784b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31056L(C29983l c29983l, C31120v0 c31120v0, Continuation continuation) {
        super(1, continuation);
        this.f62783a = c31120v0;
        this.f62784b = c29983l;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C31056L(this.f62784b, this.f62783a, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C31120v0 c31120v0 = this.f62783a;
        return new C31056L(this.f62784b, c31120v0, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C29983l c29983l = this.f62784b;
        C31044D0 c31044d0 = C31044D0.f62745a;
        KProperty[] kPropertyArr = C31120v0.f62914w;
        String strM70061a = c29983l.m70061a("sns_geolocation_action_continue");
        if (strM70061a == null) {
            strM70061a = "";
        }
        return new C31124x0(strM70061a, c31044d0);
    }
}
