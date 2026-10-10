package com.kubi.sdk.util;

import kotlinx.coroutines.AbstractC41586e2;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.text.StringsKt;
import retrofit2.Call;
import retrofit2.Response;
import ro.C44128b;

/* JADX INFO: compiled from: TimeSyncManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.util.TimeSyncManager$fetchServerTime$1", m90122f = "TimeSyncManager.kt", m90123i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1}, m90124l = {178, 183}, m90125m = "invokeSuspend", m90126n = {"$this$launch", "$this$invokeSuspend_u24lambda_u240", "response", "serverTime", "$i$a$-runCatching-TimeSyncManager$fetchServerTime$1$1", "start", "end", "$this$launch", "it", "$i$a$-onFailure-TimeSyncManager$fetchServerTime$1$2"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0", "J$0", "J$1", "L$0", "L$2", "I$0"})
public final class TimeSyncManager$fetchServerTime$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function3<Long, Long, Long, Unit> $onResult;
    int I$0;
    long J$0;
    long J$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TimeSyncManager$fetchServerTime$1(Function3<? super Long, ? super Long, ? super Long, Unit> function3, Continuation<? super TimeSyncManager$fetchServerTime$1> continuation) {
        super(2, continuation);
        this.$onResult = function3;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TimeSyncManager$fetchServerTime$1 timeSyncManager$fetchServerTime$1 = new TimeSyncManager$fetchServerTime$1(this.$onResult, continuation);
        timeSyncManager$fetchServerTime$1.L$0 = obj;
        return timeSyncManager$fetchServerTime$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((TimeSyncManager$fetchServerTime$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f5, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r9, r10, r17) == r3) goto L35;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM103844constructorimpl;
        Response<String> responseExecute;
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            Function3<Long, Long, Long, Unit> function3 = this.$onResult;
            Result.Companion companion = Result.INSTANCE;
            TimeSyncManager timeSyncManager = TimeSyncManager.f48123a;
            long jM58362l = timeSyncManager.m58362l();
            Call<String> callM58546a = TimeSyncManager.f48137o.m58546a();
            String strBody = (callM58546a == null || (responseExecute = callM58546a.execute()) == null) ? null : responseExecute.body();
            long jM58362l2 = timeSyncManager.m58362l();
            Long longOrNull = strBody != null ? StringsKt.toLongOrNull(strBody) : null;
            AbstractC41586e2 abstractC41586e2M91393c = C41782z0.m91393c();
            TimeSyncManager$fetchServerTime$1$1$1 timeSyncManager$fetchServerTime$1$1$1 = new TimeSyncManager$fetchServerTime$1$1$1(function3, longOrNull, jM58362l, jM58362l2, null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
            this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
            this.L$2 = SpillingKt.nullOutSpilledVariable(strBody);
            this.L$3 = SpillingKt.nullOutSpilledVariable(longOrNull);
            this.I$0 = 0;
            this.J$0 = jM58362l;
            this.J$1 = jM58362l2;
            this.label = 1;
            if (C41686h.m91049g(abstractC41586e2M91393c, timeSyncManager$fetchServerTime$1$1$1, this) == coroutine_suspended) {
            }
            return coroutine_suspended;
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Function3<Long, Long, Long, Unit> function4 = this.$onResult;
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C44128b.m97261e("TimeSyncManager", "message:" + thM103847exceptionOrNullimpl.getMessage());
            AbstractC41586e2 abstractC41586e2M91393c2 = C41782z0.m91393c();
            TimeSyncManager$fetchServerTime$1$2$1 timeSyncManager$fetchServerTime$1$2$1 = new TimeSyncManager$fetchServerTime$1$2$1(function4, null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
            this.L$1 = objM103844constructorimpl;
            this.L$2 = SpillingKt.nullOutSpilledVariable(thM103847exceptionOrNullimpl);
            this.L$3 = null;
            this.I$0 = 0;
            this.label = 2;
        }
        return Unit.INSTANCE;
    }
}
