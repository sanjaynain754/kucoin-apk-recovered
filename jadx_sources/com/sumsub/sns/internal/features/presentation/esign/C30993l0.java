package com.sumsub.sns.internal.features.presentation.esign;

import com.sumsub.sns.internal.core.analytics.Screen;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.esign.l0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30993l0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public C30998o f62630a;

    /* JADX INFO: renamed from: b */
    public int f62631b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30997n0 f62632c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30993l0(C30997n0 c30997n0, Continuation continuation) {
        super(2, continuation);
        this.f62632c = c30997n0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30993l0(this.f62632c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C30993l0(this.f62632c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C30998o c30998o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f62631b;
        if (i11 != 0) {
            if (i11 == 1) {
                C30998o c30998o2 = this.f62630a;
                ResultKt.throwOnFailure(obj);
                c30998o = c30998o2;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C30998o c30998o3 = new C30998o();
            C30997n0 c30997n0 = this.f62632c;
            this.f62630a = c30998o3;
            this.f62631b = 1;
            Object string = c30997n0.getString("sns_esign_documents_action_continue", this);
            if (string == coroutine_suspended) {
                return coroutine_suspended;
            }
            c30998o = c30998o3;
            obj = string;
        }
        String str = (String) obj;
        boolean zM70540a = C30997n0.m70540a(this.f62632c);
        C30997n0 c30997n1 = this.f62632c;
        Screen screenM70556e = Screen.ESignDocumentsScreen;
        if (screenM70556e == null) {
            screenM70556e = c30997n1.m70556e();
        }
        return new C31014x(c30998o, str, zM70540a, new C30988j(screenM70556e, MapsKt.emptyMap()), false);
    }
}
