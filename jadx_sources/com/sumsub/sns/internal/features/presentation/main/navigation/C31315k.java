package com.sumsub.sns.internal.features.presentation.main.navigation;

import com.sumsub.sns.internal.features.data.repository.navigation.C30027v;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.navigation.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31315k extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f63468a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f63469b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31318n f63470c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31315k(C31318n c31318n, Continuation continuation) {
        super(2, continuation);
        this.f63470c = c31318n;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31315k c31315k = new C31315k(this.f63470c, continuation);
        c31315k.f63469b = obj;
        return c31315k;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C31315k c31315k = new C31315k(this.f63470c, (Continuation) obj2);
        c31315k.f63469b = (String) obj;
        return c31315k.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM70070b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f63468a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                objM70070b = ((Result) obj).getValue();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            String str = (String) this.f63469b;
            C30027v c30027v = this.f63470c.f63476a;
            this.f63468a = 1;
            objM70070b = c30027v.m70070b(str, this);
            if (objM70070b == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Result.m103843boximpl(objM70070b);
    }
}
