package com.sumsub.sns.internal.features.presentation.paymentmethod.upload;

import com.sumsub.sns.internal.features.domain.documents.C30152w;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.paymentmethod.upload.u */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31441u extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public C31442v f63725a;

    /* JADX INFO: renamed from: b */
    public CharSequence f63726b;

    /* JADX INFO: renamed from: c */
    public int f63727c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C31442v f63728d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C30152w f63729e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31441u(C31442v c31442v, C30152w c30152w, Continuation continuation) {
        super(2, continuation);
        this.f63728d = c31442v;
        this.f63729e = c30152w;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31441u(this.f63728d, this.f63729e, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31441u(this.f63728d, this.f63729e, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C31442v c31442v;
        CharSequence charSequence;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f63727c;
        if (i11 != 0) {
            if (i11 == 1) {
                charSequence = this.f63726b;
                c31442v = this.f63725a;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            c31442v = this.f63728d;
            CharSequence charSequence2 = this.f63729e.f60594f;
            this.f63725a = c31442v;
            this.f63726b = charSequence2;
            this.f63727c = 1;
            Object string = c31442v.getString("sns_alert_action_dismiss", this);
            if (string == coroutine_suspended) {
                return coroutine_suspended;
            }
            charSequence = charSequence2;
            obj = string;
        }
        int i12 = C31442v.f63730W;
        c31442v.m70465a(charSequence, (CharSequence) obj);
        return Unit.INSTANCE;
    }
}
