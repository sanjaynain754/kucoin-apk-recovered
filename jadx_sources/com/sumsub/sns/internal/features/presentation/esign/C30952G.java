package com.sumsub.sns.internal.features.presentation.esign;

import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.esign.G */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30952G extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public C30986i f62537a;

    /* JADX INFO: renamed from: b */
    public int f62538b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30997n0 f62539c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30952G(C30997n0 c30997n0, Continuation continuation) {
        super(2, continuation);
        this.f62539c = c30997n0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30952G(this.f62539c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C30952G(this.f62539c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C30986i c30986i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f62538b;
        if (i11 != 0) {
            if (i11 == 1) {
                C30986i c30986i2 = this.f62537a;
                ResultKt.throwOnFailure(obj);
                c30986i = c30986i2;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C30986i c30986i3 = C30986i.f62617b;
            C30997n0 c30997n0 = this.f62539c;
            this.f62537a = c30986i3;
            this.f62538b = 1;
            Object string = c30997n0.getString("sns_esign_agreement_action_continue", this);
            if (string == coroutine_suspended) {
                return coroutine_suspended;
            }
            c30986i = c30986i3;
            obj = string;
        }
        String str = (String) obj;
        C28936t c28936t = this.f62539c.f62658r;
        KProperty kProperty = C30997n0.f62640t[5];
        boolean zBooleanValue = ((Boolean) c28936t.m69705a()).booleanValue();
        C30997n0 c30997n1 = this.f62539c;
        Screen screenM70556e = Screen.ESignAgreementScreen;
        if (screenM70556e == null) {
            screenM70556e = c30997n1.m70556e();
        }
        return new C31014x(c30986i, str, zBooleanValue, new C30988j(screenM70556e, MapsKt.emptyMap()), false);
    }
}
