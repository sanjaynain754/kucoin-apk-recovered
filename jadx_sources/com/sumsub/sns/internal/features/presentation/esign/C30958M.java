package com.sumsub.sns.internal.features.presentation.esign;

import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.features.data.model.esign.C29779o;
import java.util.List;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.esign.M */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30958M extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public C30994m f62554a;

    /* JADX INFO: renamed from: b */
    public int f62555b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C29779o f62556c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C30997n0 f62557d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30958M(C29779o c29779o, C30997n0 c30997n0, Continuation continuation) {
        super(2, continuation);
        this.f62556c = c29779o;
        this.f62557d = c30997n0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30958M(this.f62556c, this.f62557d, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C30958M(this.f62556c, this.f62557d, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C30994m c30994m;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f62555b;
        if (i11 != 0) {
            if (i11 == 1) {
                C30994m c30994m2 = this.f62554a;
                ResultKt.throwOnFailure(obj);
                c30994m = c30994m2;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            List listEmptyList = this.f62556c.f59850a;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            C30994m c30994m3 = new C30994m(listEmptyList);
            C30997n0 c30997n0 = this.f62557d;
            this.f62554a = c30994m3;
            this.f62555b = 1;
            Object string = c30997n0.getString("sns_esign_provided_data_action_continue", this);
            if (string == coroutine_suspended) {
                return coroutine_suspended;
            }
            c30994m = c30994m3;
            obj = string;
        }
        String str = (String) obj;
        C30997n0 c30997n1 = this.f62557d;
        Screen screenM70556e = Screen.ESignDataScreen;
        KProperty[] kPropertyArr = C30997n0.f62640t;
        if (screenM70556e == null) {
            screenM70556e = c30997n1.m70556e();
        }
        return new C31014x(c30994m, str, true, new C30988j(screenM70556e, MapsKt.emptyMap()), false);
    }
}
