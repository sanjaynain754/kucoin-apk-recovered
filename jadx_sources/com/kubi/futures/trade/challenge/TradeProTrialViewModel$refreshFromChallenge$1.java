package com.kubi.futures.trade.challenge;

import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.data.trade.model.UserJoinChallengeEntity;
import com.kubi.kumex.utils.Log;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: TradeProTrialState.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.trade.challenge.TradeProTrialViewModel$refreshFromChallenge$1", m90122f = "TradeProTrialState.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class TradeProTrialViewModel$refreshFromChallenge$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $contractSymbol;
    final /* synthetic */ long $seq;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeProTrialViewModel$refreshFromChallenge$1(String str, long j11, Continuation<? super TradeProTrialViewModel$refreshFromChallenge$1> continuation) {
        super(2, continuation);
        this.$contractSymbol = str;
        this.$seq = j11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradeProTrialViewModel$refreshFromChallenge$1(this.$contractSymbol, this.$seq, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((TradeProTrialViewModel$refreshFromChallenge$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String code;
        String status;
        Long startTime;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                UserJoinChallengeEntity userJoinChallengeEntityMo100563m = RepositoryServiceLocator.f19236a.m20292k().mo100563m(this.$contractSymbol);
                Log log = Log.f30813a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("challengeApi symbol=");
                sb2.append(this.$contractSymbol);
                sb2.append(" code=");
                Long endTime = null;
                if (userJoinChallengeEntityMo100563m != null) {
                    code = userJoinChallengeEntityMo100563m.getCode();
                } else {
                    code = null;
                }
                sb2.append(code);
                sb2.append(" status=");
                if (userJoinChallengeEntityMo100563m != null) {
                    status = userJoinChallengeEntityMo100563m.getStatus();
                } else {
                    status = null;
                }
                sb2.append(status);
                sb2.append(" startTime=");
                if (userJoinChallengeEntityMo100563m != null) {
                    startTime = userJoinChallengeEntityMo100563m.getStartTime();
                } else {
                    startTime = null;
                }
                sb2.append(startTime);
                sb2.append(" endTime=");
                if (userJoinChallengeEntityMo100563m != null) {
                    endTime = userJoinChallengeEntityMo100563m.getEndTime();
                }
                sb2.append(endTime);
                log.m36615a("TradeProTrialTimer", sb2.toString());
                TradeProTrialStateStore.f23763a.m26988i(userJoinChallengeEntityMo100563m, this.$seq);
            } catch (Throwable unused) {
                TradeProTrialStateStore.f23763a.m26982b(this.$seq);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
