package com.sumsub.sns.internal.features.presentation.main.navigation;

import com.sumsub.sns.internal.features.data.repository.navigation.C30027v;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.navigation.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31314j extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f63465a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f63466b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31318n f63467c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31314j(C31318n c31318n, Continuation continuation) {
        super(2, continuation);
        this.f63467c = c31318n;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31314j c31314j = new C31314j(this.f63467c, continuation);
        c31314j.f63466b = obj;
        return c31314j;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C31314j c31314j = new C31314j(this.f63467c, (Continuation) obj2);
        c31314j.f63466b = (String) obj;
        return c31314j.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM70068a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f63465a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                objM70068a = ((Result) obj).getValue();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            String str = (String) this.f63466b;
            C30027v c30027v = this.f63467c.f63476a;
            this.f63465a = 1;
            objM70068a = c30027v.m70068a(str, this);
            if (objM70068a == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Result.m103843boximpl(objM70068a);
    }
}
