package com.kubi.futures;

import com.kubi.kumex.utils.CoroutineExKt;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.sdk.BaseActivity;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import p026ay.C4400a;
import p846zx.InterfaceC46935a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: FuturesInterceptor.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.FuturesInterceptor$proceedOpenFutures$job$1", m90122f = "FuturesInterceptor.kt", m90123i = {}, m90124l = {81}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FuturesInterceptor$proceedOpenFutures$job$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC46935a $chain;
    final /* synthetic */ C4400a $postcard;
    final /* synthetic */ BaseActivity $topBaseActivity;
    int label;

    /* JADX INFO: renamed from: com.kubi.futures.FuturesInterceptor$proceedOpenFutures$job$1$1 */
    /* JADX INFO: compiled from: FuturesInterceptor.kt */
    @Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.futures.FuturesInterceptor$proceedOpenFutures$job$1$1", m90122f = "FuturesInterceptor.kt", m90123i = {}, m90124l = {82}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C128221 extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> {
        final /* synthetic */ InterfaceC46935a $chain;
        final /* synthetic */ C4400a $postcard;
        final /* synthetic */ BaseActivity $topBaseActivity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128221(BaseActivity baseActivity, C4400a c4400a, InterfaceC46935a interfaceC46935a, Continuation<? super C128221> continuation) {
            super(1, continuation);
            this.$topBaseActivity = baseActivity;
            this.$postcard = c4400a;
            this.$chain = interfaceC46935a;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C128221(this.$topBaseActivity, this.$postcard, this.$chain, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Boolean> continuation) {
            return ((C128221) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
                C12823x2a445162 c12823x2a445162 = new C12823x2a445162(null);
                this.label = 1;
                obj = C41686h.m91049g(abstractC41697j0M94120b, c12823x2a445162, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            BaseActivity.hideLoadingDialog$default(this.$topBaseActivity, false, 1, null);
            this.$postcard.m4038a("AgreementsOfOpenFuturesStr", (String) obj);
            return Boxing.boxBoolean(this.$chain.mo103413a(this.$postcard));
        }
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m24434f(BaseActivity baseActivity, Throwable th2) {
        C19331c.m42836c(th2, null, 2, null);
        BaseActivity.hideLoadingDialog$default(baseActivity, false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesInterceptor$proceedOpenFutures$job$1(BaseActivity baseActivity, C4400a c4400a, InterfaceC46935a interfaceC46935a, Continuation<? super FuturesInterceptor$proceedOpenFutures$job$1> continuation) {
        super(2, continuation);
        this.$topBaseActivity = baseActivity;
        this.$postcard = c4400a;
        this.$chain = interfaceC46935a;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesInterceptor$proceedOpenFutures$job$1(this.$topBaseActivity, this.$postcard, this.$chain, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FuturesInterceptor$proceedOpenFutures$job$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            this.$topBaseActivity.showLoadingDialog();
            C128221 c128221 = new C128221(this.$topBaseActivity, this.$postcard, this.$chain, null);
            final BaseActivity baseActivity = this.$topBaseActivity;
            Function1 function1 = new Function1() { // from class: com.kubi.futures.b
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return FuturesInterceptor$proceedOpenFutures$job$1.m24434f(baseActivity, (Throwable) obj2);
                }
            };
            this.label = 1;
            if (CoroutineExKt.m36471a(c128221, function1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
