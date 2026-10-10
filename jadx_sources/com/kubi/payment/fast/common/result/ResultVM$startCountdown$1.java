package com.kubi.payment.fast.common.result;

import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: ResultVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fast.common.result.ResultVM$startCountdown$1", m90122f = "ResultVM.kt", m90123i = {0, 0, 0}, m90124l = {105}, m90125m = "invokeSuspend", m90126n = {"lastTimes", "currentProgress", "stepProgress"}, m90127s = {"L$0", "L$1", "I$0"})
public final class ResultVM$startCountdown$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ResultVM this$0;

    /* JADX INFO: renamed from: com.kubi.payment.fast.common.result.ResultVM$startCountdown$1$1 */
    /* JADX INFO: compiled from: ResultVM.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.payment.fast.common.result.ResultVM$startCountdown$1$1", m90122f = "ResultVM.kt", m90123i = {}, m90124l = {107}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C204981 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.IntRef $currentProgress;
        final /* synthetic */ Ref.IntRef $lastTimes;
        final /* synthetic */ int $stepProgress;
        int label;
        final /* synthetic */ ResultVM this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C204981(Ref.IntRef intRef, ResultVM resultVM, Ref.IntRef intRef2, int i11, Continuation<? super C204981> continuation) {
            super(2, continuation);
            this.$lastTimes = intRef;
            this.this$0 = resultVM;
            this.$currentProgress = intRef2;
            this.$stepProgress = i11;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C204981(this.$lastTimes, this.this$0, this.$currentProgress, this.$stepProgress, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C204981) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0030 -> B:16:0x0033). Please report as a decompilation issue!!! */
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
                if (this.$lastTimes.element <= 0 && this.this$0.f38588d0) {
                    this.label = 1;
                    if (DelayKt.m90350b(1000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    return Unit.INSTANCE;
                }
            }
            this.$currentProgress.element -= this.$stepProgress;
            this.this$0.f38587c0.postValue(Boxing.boxInt(this.$currentProgress.element));
            this.$lastTimes.element--;
            this.this$0.f38586b0.postValue(String.valueOf(this.$lastTimes.element));
            if (this.$lastTimes.element <= 0) {
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResultVM$startCountdown$1(ResultVM resultVM, Continuation<? super ResultVM$startCountdown$1> continuation) {
        super(2, continuation);
        this.this$0 = resultVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ResultVM$startCountdown$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((ResultVM$startCountdown$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            this.this$0.f38589e0 = false;
            Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = 5;
            Ref.IntRef intRef2 = new Ref.IntRef();
            intRef2.element = 100;
            AbstractC41697j0 abstractC41697j0 = this.this$0.f38583Y;
            C204981 c204981 = new C204981(intRef, this.this$0, intRef2, 20, null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(intRef);
            this.L$1 = SpillingKt.nullOutSpilledVariable(intRef2);
            this.I$0 = 20;
            this.label = 1;
            if (C41686h.m91049g(abstractC41697j0, c204981, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        this.this$0.f38589e0 = true;
        return Unit.INSTANCE;
    }
}
