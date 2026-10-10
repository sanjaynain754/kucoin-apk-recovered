package com.kubi.operation.lib.utils;

import com.kubi.mvi.common.MviExKt;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: CountDownHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.operation.lib.utils.CountDownHelper$launchCountDown$1$2", m90122f = "CountDownHelper.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class CountDownHelper$launchCountDown$1$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.LongRef $currentCountDownTime;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CountDownHelper this$0;

    /* JADX INFO: renamed from: com.kubi.operation.lib.utils.CountDownHelper$launchCountDown$1$2$1 */
    /* JADX INFO: compiled from: CountDownHelper.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.operation.lib.utils.CountDownHelper$launchCountDown$1$2$1", m90122f = "CountDownHelper.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C195501 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.LongRef $currentCountDownTime;
        int label;
        final /* synthetic */ CountDownHelper this$0;

        public final Object invoke(int i11, Continuation<? super Unit> continuation) {
            return ((C195501) create(Integer.valueOf(i11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C195501(CountDownHelper countDownHelper, Ref.LongRef longRef, Continuation<? super C195501> continuation) {
            super(2, continuation);
            this.this$0 = countDownHelper;
            this.$currentCountDownTime = longRef;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C195501(this.this$0, this.$currentCountDownTime, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
            return invoke(num.intValue(), continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.this$0.f36841a == CountdownType.Bonus) {
                    C19553c.m43659g(C19553c.m43655c() - 1);
                    C19553c.m43655c();
                }
                if (this.this$0.f36841a == CountdownType.Welfare) {
                    C19553c.m43660h(C19553c.m43656d() - 1);
                    C19553c.m43656d();
                }
                Ref.LongRef longRef = this.$currentCountDownTime;
                long j11 = longRef.element - 1;
                longRef.element = j11;
                CountDownHelper countDownHelper = this.this$0;
                countDownHelper.m43609m(countDownHelper.m43605g(RangesKt.coerceAtLeast(j11, 0L)));
                if (this.$currentCountDownTime.element <= 0) {
                    InterfaceC41775x1 interfaceC41775x1 = this.this$0.f36842b;
                    if (interfaceC41775x1 != null) {
                        InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
                    }
                    this.this$0.f36842b = null;
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownHelper$launchCountDown$1$2(CountDownHelper countDownHelper, Ref.LongRef longRef, Continuation<? super CountDownHelper$launchCountDown$1$2> continuation) {
        super(2, continuation);
        this.this$0 = countDownHelper;
        this.$currentCountDownTime = longRef;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CountDownHelper$launchCountDown$1$2 countDownHelper$launchCountDown$1$2 = new CountDownHelper$launchCountDown$1$2(this.this$0, this.$currentCountDownTime, continuation);
        countDownHelper$launchCountDown$1$2.L$0 = obj;
        return countDownHelper$launchCountDown$1$2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((CountDownHelper$launchCountDown$1$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MviExKt.m42522r(interfaceC41709m0, Integer.MAX_VALUE, 1000L, null, null, null, new C195501(this.this$0, this.$currentCountDownTime, null), 28, null);
        return Unit.INSTANCE;
    }
}
