package com.sumsub.sns.core.presentation.base;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29149l0;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.B */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28050B extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public AbstractC28052C f57196a;

    /* JADX INFO: renamed from: b */
    public AbstractC29149l0 f57197b;

    /* JADX INFO: renamed from: c */
    public String f57198c;

    /* JADX INFO: renamed from: d */
    public int f57199d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC28052C f57200e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC29149l0 f57201f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f57202g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f57203h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28050B(AbstractC28052C abstractC28052C, AbstractC29149l0 abstractC29149l0, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f57200e = abstractC28052C;
        this.f57201f = abstractC29149l0;
        this.f57202g = str;
        this.f57203h = str2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C28050B(this.f57200e, this.f57201f, this.f57202g, this.f57203h, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C28050B) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AbstractC29149l0 abstractC29149l0;
        AbstractC28052C abstractC28052C;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f57199d;
        if (i11 != 0) {
            if (i11 == 1) {
                str = this.f57198c;
                abstractC29149l0 = this.f57197b;
                abstractC28052C = this.f57196a;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            AbstractC28052C abstractC28052C2 = this.f57200e;
            abstractC29149l0 = this.f57201f;
            String str2 = this.f57202g;
            this.f57196a = abstractC28052C2;
            this.f57197b = abstractC29149l0;
            this.f57198c = str2;
            this.f57199d = 1;
            Object string = abstractC28052C2.getString("sns_alert_action_ok", this);
            if (string == coroutine_suspended) {
                return coroutine_suspended;
            }
            abstractC28052C = abstractC28052C2;
            obj = string;
            str = str2;
        }
        abstractC28052C.fireEvent(new C28135m(abstractC29149l0, str, (CharSequence) obj, this.f57203h));
        return Unit.INSTANCE;
    }
}
