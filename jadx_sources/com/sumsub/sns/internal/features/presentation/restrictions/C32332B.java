package com.sumsub.sns.internal.features.presentation.restrictions;

import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.internal.core.common.C28494t;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.restrictions.B */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32332B extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f65881a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f65882b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32333C f65883c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32333C f65884d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32332B(C32333C c32333c, Continuation continuation, C32333C c32333c2) {
        super(2, continuation);
        this.f65883c = c32333c;
        this.f65884d = c32333c2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C32332B c32332b = new C32332B(this.f65883c, continuation, this.f65884d);
        c32332b.f65882b = obj;
        return c32332b;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C32332B) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f65881a;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C32340f c32340f = this.f65884d.f65887b;
                this.f65881a = 1;
                obj = c32340f.m71100a(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            InterfaceC32338d interfaceC32338d = (InterfaceC32338d) obj;
            if (Intrinsics.areEqual(interfaceC32338d, C32334a.f65891a)) {
                AbstractC28052C.finish$default(this.f65884d, new C28494t(false), null, null, null, 14, null);
                this.f65884d.f65888c.mo69384c();
            } else if (interfaceC32338d instanceof C32336b) {
                this.f65884d.f65890e.setValue(((C32336b) interfaceC32338d).f65893a);
            } else if (interfaceC32338d instanceof C32337c) {
                AbstractC28052C.throwError$default(this.f65884d, ((C32337c) interfaceC32338d).f65894a, "Status", null, 4, null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            this.f65883c.showProgress(false);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            this.f65883c.showProgress(false);
            throw th2;
        }
    }
}
