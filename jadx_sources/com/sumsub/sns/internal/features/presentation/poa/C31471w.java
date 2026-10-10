package com.sumsub.sns.internal.features.presentation.poa;

import com.sumsub.sns.internal.features.domain.documents.C30152w;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.poa.w */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31471w extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public C31472x f63832a;

    /* JADX INFO: renamed from: b */
    public CharSequence f63833b;

    /* JADX INFO: renamed from: c */
    public int f63834c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C31472x f63835d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C30152w f63836e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31471w(C31472x c31472x, C30152w c30152w, Continuation continuation) {
        super(2, continuation);
        this.f63835d = c31472x;
        this.f63836e = c30152w;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31471w(this.f63835d, this.f63836e, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31471w(this.f63835d, this.f63836e, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C31472x c31472x;
        CharSequence charSequence;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f63834c;
        if (i11 != 0) {
            if (i11 == 1) {
                charSequence = this.f63833b;
                c31472x = this.f63832a;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            c31472x = this.f63835d;
            CharSequence charSequence2 = this.f63836e.f60594f;
            this.f63832a = c31472x;
            this.f63833b = charSequence2;
            this.f63834c = 1;
            Object string = c31472x.getString("sns_alert_action_dismiss", this);
            if (string == coroutine_suspended) {
                return coroutine_suspended;
            }
            charSequence = charSequence2;
            obj = string;
        }
        int i12 = C31472x.f63837W;
        c31472x.m70465a(charSequence, (CharSequence) obj);
        return Unit.INSTANCE;
    }
}
