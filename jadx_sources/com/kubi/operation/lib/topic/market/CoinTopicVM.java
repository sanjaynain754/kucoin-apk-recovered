package com.kubi.operation.lib.topic.market;

import androidx.lifecycle.ViewModelKt;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.operation.lib.api.OperationApi;
import com.kubi.operation.lib.entity.CoinTopicEntity;
import com.kubi.operation.lib.topic.CoinTopicState;
import com.kubi.operation.lib.topic.QueryTopic;
import com.kubi.operation.lib.utils.EntranceStatus;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: CoinTopicVM.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0094@¢\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u0006H\u0094@¢\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0082@¢\u0006\u0002\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/operation/lib/topic/market/CoinTopicVM;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/operation/lib/topic/TopicIntentState$CoinTopicState;", "<init>", "()V", "dispatchIntent", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleInitIntent", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchCoinTopicInfo", "coin", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initState", "getInitState", "()Lcom/kubi/operation/lib/topic/TopicIntentState$CoinTopicState;", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCoinTopicVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoinTopicVM.kt\ncom/kubi/operation/lib/topic/market/CoinTopicVM\n+ 2 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,50:1\n106#2,2:51\n*S KotlinDebug\n*F\n+ 1 CoinTopicVM.kt\ncom/kubi/operation/lib/topic/market/CoinTopicVM\n*L\n31#1:51,2\n*E\n"})
public final class CoinTopicVM extends AbstractC19291m<CoinTopicState> {

    /* JADX INFO: renamed from: com.kubi.operation.lib.topic.market.CoinTopicVM$a */
    /* JADX INFO: compiled from: CoinTopicVM.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C19537a implements Function1<CoinTopicState, CoinTopicState> {

        /* JADX INFO: renamed from: b */
        public static final C19537a f36827b = new C19537a();

        @Override // p852kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoinTopicState invoke(CoinTopicState updateState) {
            Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
            return updateState.copy(null);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final CoinTopicState m43580h(CoinTopicState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return updateState.copy(null);
    }

    /* JADX INFO: renamed from: i */
    public static final CoinTopicState m43581i(CoinTopicEntity coinTopicEntity, CoinTopicState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return updateState.copy(coinTopicEntity);
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        if (!(interfaceC19282d instanceof QueryTopic)) {
            return Unit.INSTANCE;
        }
        Object objM43582g = m43582g(((QueryTopic) interfaceC19282d).getCoin(), continuation);
        return objM43582g == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM43582g : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m43582g(String str, Continuation<? super Unit> continuation) {
        CoinTopicVM$fetchCoinTopicInfo$1 coinTopicVM$fetchCoinTopicInfo$1;
        if (continuation instanceof CoinTopicVM$fetchCoinTopicInfo$1) {
            coinTopicVM$fetchCoinTopicInfo$1 = (CoinTopicVM$fetchCoinTopicInfo$1) continuation;
            int i11 = coinTopicVM$fetchCoinTopicInfo$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                coinTopicVM$fetchCoinTopicInfo$1.label = i11 - Integer.MIN_VALUE;
            } else {
                coinTopicVM$fetchCoinTopicInfo$1 = new CoinTopicVM$fetchCoinTopicInfo$1(this, continuation);
            }
        } else {
            coinTopicVM$fetchCoinTopicInfo$1 = new CoinTopicVM$fetchCoinTopicInfo$1(this, continuation);
        }
        Object objM42830k = coinTopicVM$fetchCoinTopicInfo$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = coinTopicVM$fetchCoinTopicInfo$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42830k);
            if (str.length() == 0 || !EntranceStatus.m43662b()) {
                updateState(new Function1() { // from class: com.kubi.operation.lib.topic.market.c
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CoinTopicVM.m43580h((CoinTopicState) obj);
                    }
                });
                return Unit.INSTANCE;
            }
            InterfaceC41634e<CoinTopicEntity> interfaceC41634eM43286c = ((OperationApi) RetrofitFlowExKt.m42820a(OperationApi.class)).m43286c(str);
            coinTopicVM$fetchCoinTopicInfo$1.L$0 = SpillingKt.nullOutSpilledVariable(str);
            coinTopicVM$fetchCoinTopicInfo$1.label = 1;
            objM42830k = RetrofitFlowExKt.m42830k(interfaceC41634eM43286c, coinTopicVM$fetchCoinTopicInfo$1);
            if (objM42830k == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42830k);
        }
        final CoinTopicEntity coinTopicEntity = (CoinTopicEntity) objM42830k;
        updateState(new Function1() { // from class: com.kubi.operation.lib.topic.market.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CoinTopicVM.m43581i(coinTopicEntity, (CoinTopicState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public CoinTopicState getInitState() {
        return new CoinTopicState(null, 1, null);
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    public Object handleInitIntent(@NotNull Continuation<? super Unit> continuation) {
        InterfaceC41709m0 viewModelScope = ViewModelKt.getViewModelScope(this);
        if (C12573b.f21598a.m23696a()) {
            "EVENT_CLOSE_ENTRANCE".length();
        }
        C12572a.m23693b(viewModelScope, new CoinTopicVM$handleInitIntent$$inlined$bindFlowEvent$1("EVENT_CLOSE_ENTRANCE", null, this));
        return Unit.INSTANCE;
    }
}
