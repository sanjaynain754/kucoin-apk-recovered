package com.kubi.margin.trade;

import com.kubi.data.entity.MarginSymbolInfo;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.margin.api.entity.MarginNoticeBanner;
import com.kubi.sdk.base.entity.BaseEntity;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41729r0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import ro.C44128b;

/* JADX INFO: compiled from: BaseMarginViewModel.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.margin.trade.BaseMarginViewModel$requestBannerInfos$1", m90122f = "BaseMarginViewModel.kt", m90123i = {0, 0, 0, 1, 1, 1, 1}, m90124l = {65, 66}, m90125m = "invokeSuspend", m90126n = {"$this$launch", "marginNoticeDeferred", "symbolOfflineDeferred", "$this$launch", "marginNoticeDeferred", "symbolOfflineDeferred", "marginNoticeData"}, m90127s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
public final class BaseMarginViewModel$requestBannerInfos$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ TradeItemBean $currentSymbol;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ BaseMarginViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseMarginViewModel$requestBannerInfos$1(BaseMarginViewModel baseMarginViewModel, TradeItemBean tradeItemBean, Continuation<? super BaseMarginViewModel$requestBannerInfos$1> continuation) {
        super(2, continuation);
        this.this$0 = baseMarginViewModel;
        this.$currentSymbol = tradeItemBean;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BaseMarginViewModel$requestBannerInfos$1 baseMarginViewModel$requestBannerInfos$1 = new BaseMarginViewModel$requestBannerInfos$1(this.this$0, this.$currentSymbol, continuation);
        baseMarginViewModel$requestBannerInfos$1.L$0 = obj;
        return baseMarginViewModel$requestBannerInfos$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((BaseMarginViewModel$requestBannerInfos$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:22:0x00d9  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41729r0 interfaceC41729r0M91102b;
        InterfaceC41729r0 interfaceC41729r0;
        BaseEntity baseEntity;
        MarginSymbolInfo marginSymbolInfo;
        MarginNoticeBanner marginNoticeBannerM39764t;
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41729r0 interfaceC41729r0M91102b2 = C41696j.m91102b(interfaceC41709m0, null, null, new BaseMarginViewModel$requestBannerInfos$1$marginNoticeDeferred$1(this.this$0, null), 3, null);
            interfaceC41729r0M91102b = C41696j.m91102b(interfaceC41709m0, null, null, new BaseMarginViewModel$requestBannerInfos$1$symbolOfflineDeferred$1(this.$currentSymbol, null), 3, null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
            this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M91102b2);
            this.L$2 = interfaceC41729r0M91102b;
            this.label = 1;
            Object objMo91198h = interfaceC41729r0M91102b2.mo91198h(this);
            if (objMo91198h != coroutine_suspended) {
                interfaceC41729r0 = interfaceC41729r0M91102b2;
                obj = objMo91198h;
            }
            return coroutine_suspended;
        }
        if (i11 == 1) {
            interfaceC41729r0M91102b = (InterfaceC41729r0) this.L$2;
            interfaceC41729r0 = (InterfaceC41729r0) this.L$1;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            baseEntity = (BaseEntity) this.L$3;
            ResultKt.throwOnFailure(obj);
        }
        marginSymbolInfo = (MarginSymbolInfo) obj;
        C44128b.m97259c("BaseMarginViewModel", "requestBannerInfos: " + baseEntity);
        C44128b.m97259c("BaseMarginViewModel", "requestBannerInfos: " + marginSymbolInfo);
        marginNoticeBannerM39764t = this.this$0.m39764t(baseEntity);
        this.this$0.f33676W.postValue(marginNoticeBannerM39764t);
        if (marginNoticeBannerM39764t != null) {
            this.this$0.f33678Y.postValue(null);
            return Unit.INSTANCE;
        }
        this.this$0.f33678Y.postValue(this.this$0.m39765u(marginSymbolInfo));
        return Unit.INSTANCE;
        BaseEntity baseEntity2 = (BaseEntity) obj;
        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
        this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
        this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M91102b);
        this.L$3 = baseEntity2;
        this.label = 2;
        Object objMo91198h2 = interfaceC41729r0M91102b.mo91198h(this);
        if (objMo91198h2 != coroutine_suspended) {
            baseEntity = baseEntity2;
            obj = objMo91198h2;
            marginSymbolInfo = (MarginSymbolInfo) obj;
            C44128b.m97259c("BaseMarginViewModel", "requestBannerInfos: " + baseEntity);
            C44128b.m97259c("BaseMarginViewModel", "requestBannerInfos: " + marginSymbolInfo);
            marginNoticeBannerM39764t = this.this$0.m39764t(baseEntity);
            this.this$0.f33676W.postValue(marginNoticeBannerM39764t);
            if (marginNoticeBannerM39764t != null) {
                this.this$0.f33678Y.postValue(null);
                return Unit.INSTANCE;
            }
            this.this$0.f33678Y.postValue(this.this$0.m39765u(marginSymbolInfo));
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }
}
