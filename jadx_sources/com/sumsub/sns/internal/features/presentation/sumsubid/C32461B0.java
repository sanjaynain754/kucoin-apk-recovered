package com.sumsub.sns.internal.features.presentation.sumsubid;

import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.data.repository.sumsubid.C30052a;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.B0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32461B0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f66180a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f66181b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32487O0 f66182c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32487O0 f66183d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f66184e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32461B0(C32487O0 c32487o0, Continuation continuation, C32487O0 c32487o1, boolean z11) {
        super(2, continuation);
        this.f66182c = c32487o0;
        this.f66183d = c32487o1;
        this.f66184e = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C32461B0 c32461b0 = new C32461B0(this.f66182c, continuation, this.f66183d, this.f66184e);
        c32461b0.f66181b = obj;
        return c32461b0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C32461B0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f66180a;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC29984m interfaceC29984m = this.f66183d.f66262a;
                this.f66180a = 1;
                if (((C29967J) interfaceC29984m).m70043a(true, (ContinuationImpl) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (this.f66184e) {
                InterfaceC41669n interfaceC41669n = this.f66183d.f66264c.f60387a;
                do {
                    value = interfaceC41669n.getValue();
                } while (!interfaceC41669n.compareAndSet(value, new C30052a(((C30052a) value).f60383a, 14)));
            }
            C32487O0 c32487o0 = this.f66183d;
            c32487o0.f66279r = true;
            c32487o0.m71155a(Screen.SumsubIdAgreementScreen);
            AbstractC28052C.finishWithResult$default(this.f66183d, 50, null, 2, null);
            this.f66182c.showProgress(false);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            this.f66182c.showProgress(false);
            throw th2;
        }
    }
}
