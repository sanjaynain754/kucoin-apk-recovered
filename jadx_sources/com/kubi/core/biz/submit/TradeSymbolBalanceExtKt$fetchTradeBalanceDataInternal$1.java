package com.kubi.core.biz.submit;

import com.kubi.core.biz.loan.entity.MaxAvailableEntity;
import com.kubi.core.biz.margininfo.IMarginInfoApi;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import java.math.BigDecimal;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p756xc.BalanceData;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: TradeSymbolBalanceExt.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.submit.TradeSymbolBalanceExtKt$fetchTradeBalanceDataInternal$1", m90122f = "TradeSymbolBalanceExt.kt", m90123i = {}, m90124l = {310}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nTradeSymbolBalanceExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeSymbolBalanceExt.kt\ncom/kubi/core/biz/submit/TradeSymbolBalanceExtKt$fetchTradeBalanceDataInternal$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,460:1\n25#2:461\n26#2:463\n1#3:462\n*S KotlinDebug\n*F\n+ 1 TradeSymbolBalanceExt.kt\ncom/kubi/core/biz/submit/TradeSymbolBalanceExtKt$fetchTradeBalanceDataInternal$1\n*L\n334#1:461\n334#1:463\n334#1:462\n*E\n"})
public final class TradeSymbolBalanceExtKt$fetchTradeBalanceDataInternal$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $buyPrice;
    final /* synthetic */ String $buyTriggerPrice;
    final /* synthetic */ String $orderType;
    final /* synthetic */ String $sellPrice;
    final /* synthetic */ String $sellTriggerPrice;
    final /* synthetic */ UiState $state;
    final /* synthetic */ String $symbol;
    final /* synthetic */ SymbolInfoEntity $symbolInfo;
    final /* synthetic */ TradeSubmitVM $this_fetchTradeBalanceDataInternal;
    final /* synthetic */ String $tradeType;
    final /* synthetic */ IMarginInfoApi $utaOrderApi1;
    int label;

    /* JADX INFO: renamed from: com.kubi.core.biz.submit.TradeSymbolBalanceExtKt$fetchTradeBalanceDataInternal$1$1 */
    /* JADX INFO: compiled from: TradeSymbolBalanceExt.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/biz/loan/entity/MaxAvailableEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.submit.TradeSymbolBalanceExtKt$fetchTradeBalanceDataInternal$1$1", m90122f = "TradeSymbolBalanceExt.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C120661 extends SuspendLambda implements Function2<MaxAvailableEntity, Continuation<? super Unit>, Object> {
        final /* synthetic */ UiState $state;
        final /* synthetic */ SymbolInfoEntity $symbolInfo;
        final /* synthetic */ TradeSubmitVM $this_fetchTradeBalanceDataInternal;
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(MaxAvailableEntity maxAvailableEntity, Continuation<? super Unit> continuation) {
            return ((C120661) create(maxAvailableEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120661(SymbolInfoEntity symbolInfoEntity, UiState uiState, TradeSubmitVM tradeSubmitVM, Continuation<? super C120661> continuation) {
            super(2, continuation);
            this.$symbolInfo = symbolInfoEntity;
            this.$state = uiState;
            this.$this_fetchTradeBalanceDataInternal = tradeSubmitVM;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C120661 c120661 = new C120661(this.$symbolInfo, this.$state, this.$this_fetchTradeBalanceDataInternal, continuation);
            c120661.L$0 = obj;
            return c120661;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MaxAvailableEntity maxAvailableEntity = (MaxAvailableEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44128b.m97258b("获取最大可用余额结果: " + maxAvailableEntity);
            BigDecimal buyMaxAvailable = maxAvailableEntity.getBuyMaxAvailable();
            BalanceData balanceData = new BalanceData(this.$symbolInfo.getBaseCurrency(), this.$symbolInfo.getBaseCurrencyName(), maxAvailableEntity.getSellMaxAvailable());
            BalanceData balanceData2 = new BalanceData(this.$symbolInfo.getQuoteCurrency(), this.$symbolInfo.getQuoteCurrencyName(), buyMaxAvailable);
            if (Intrinsics.areEqual(this.$state.getSymbol(), this.$symbolInfo.getCode())) {
                this.$this_fetchTradeBalanceDataInternal.m22464T0(balanceData);
                this.$this_fetchTradeBalanceDataInternal.m22464T0(balanceData2);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeSymbolBalanceExtKt$fetchTradeBalanceDataInternal$1(IMarginInfoApi iMarginInfoApi, String str, String str2, String str3, String str4, String str5, String str6, String str7, SymbolInfoEntity symbolInfoEntity, UiState uiState, TradeSubmitVM tradeSubmitVM, Continuation<? super TradeSymbolBalanceExtKt$fetchTradeBalanceDataInternal$1> continuation) {
        super(2, continuation);
        this.$utaOrderApi1 = iMarginInfoApi;
        this.$tradeType = str;
        this.$symbol = str2;
        this.$orderType = str3;
        this.$buyPrice = str4;
        this.$buyTriggerPrice = str5;
        this.$sellPrice = str6;
        this.$sellTriggerPrice = str7;
        this.$symbolInfo = symbolInfoEntity;
        this.$state = uiState;
        this.$this_fetchTradeBalanceDataInternal = tradeSubmitVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradeSymbolBalanceExtKt$fetchTradeBalanceDataInternal$1(this.$utaOrderApi1, this.$tradeType, this.$symbol, this.$orderType, this.$buyPrice, this.$buyTriggerPrice, this.$sellPrice, this.$sellTriggerPrice, this.$symbolInfo, this.$state, this.$this_fetchTradeBalanceDataInternal, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((TradeSymbolBalanceExtKt$fetchTradeBalanceDataInternal$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM42824e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                IMarginInfoApi iMarginInfoApi = this.$utaOrderApi1;
                String str = this.$tradeType;
                String str2 = this.$symbol;
                Intrinsics.checkNotNull(str2);
                InterfaceC41634e<MaxAvailableEntity> interfaceC41634eM21869b = iMarginInfoApi.m21869b(str, str2, this.$orderType, this.$buyPrice, this.$buyTriggerPrice, this.$sellPrice, this.$sellTriggerPrice);
                C120661 c120661 = new C120661(this.$symbolInfo, this.$state, this.$this_fetchTradeBalanceDataInternal, null);
                this.label = 1;
                objM42824e = RetrofitFlowExKt.m42824e(interfaceC41634eM21869b, false, c120661, this, 1, null);
                if (objM42824e == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objM42824e = obj;
            }
            TradeSubmitVM tradeSubmitVM = this.$this_fetchTradeBalanceDataInternal;
            SymbolInfoEntity symbolInfoEntity = this.$symbolInfo;
            if (((C19334f) objM42824e).getThrowable() != null) {
                tradeSubmitVM.m22464T0(new BalanceData(symbolInfoEntity.getBaseCurrency(), symbolInfoEntity.getBaseCurrencyName(), null));
                tradeSubmitVM.m22464T0(new BalanceData(symbolInfoEntity.getQuoteCurrency(), symbolInfoEntity.getQuoteCurrencyName(), null));
            }
        } catch (Exception e11) {
            C44128b.m97258b("获取最大可用余额失败: " + e11.getMessage());
        }
        return Unit.INSTANCE;
    }
}
