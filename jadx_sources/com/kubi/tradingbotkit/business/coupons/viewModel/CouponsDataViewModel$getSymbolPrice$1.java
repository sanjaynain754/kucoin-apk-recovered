package com.kubi.tradingbotkit.business.coupons.viewModel;

import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.tradingbotkit.business.coupons.CouponsSelectUIState;
import com.kubi.tradingbotkit.business.spot.viewmodel.t0;
import com.kubi.tradingbotkit.entity.OrderBookCenterEntity;
import com.kubi.utils.extensions.C27039d;
import com.tencent.bugly.proguard.InterfaceC33568bf;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.math.BigDecimal;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p402kf.C41014a;
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
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: CouponsDataViewModel.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.tradingbotkit.business.coupons.viewModel.CouponsDataViewModel$getSymbolPrice$1", m90122f = "CouponsDataViewModel.kt", m90123i = {0, 0}, m90124l = {InterfaceC33568bf.f69245q}, m90125m = "invokeSuspend", m90126n = {"quoteCode", "baseCode"}, m90127s = {"L$0", "L$1"})
@SourceDebugExtension({"SMAP\nCouponsDataViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CouponsDataViewModel.kt\ncom/kubi/tradingbotkit/business/coupons/viewModel/CouponsDataViewModel$getSymbolPrice$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,245:1\n25#2:246\n26#2:248\n1#3:247\n*S KotlinDebug\n*F\n+ 1 CouponsDataViewModel.kt\ncom/kubi/tradingbotkit/business/coupons/viewModel/CouponsDataViewModel$getSymbolPrice$1\n*L\n223#1:246\n223#1:248\n223#1:247\n*E\n"})
public final class CouponsDataViewModel$getSymbolPrice$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $checkCouponsId;
    final /* synthetic */ String $quote;
    final /* synthetic */ String $symbol;
    final /* synthetic */ String $templateType;
    final /* synthetic */ BigDecimal $totalInvestments;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ CouponsDataViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.business.coupons.viewModel.CouponsDataViewModel$getSymbolPrice$1$1 */
    /* JADX INFO: compiled from: CouponsDataViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/tradingbotkit/entity/OrderBookCenterEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.tradingbotkit.business.coupons.viewModel.CouponsDataViewModel$getSymbolPrice$1$1", m90122f = "CouponsDataViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C261231 extends SuspendLambda implements Function2<OrderBookCenterEntity, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $checkCouponsId;
        final /* synthetic */ String $symbol;
        final /* synthetic */ String $templateType;
        final /* synthetic */ BigDecimal $totalInvestments;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ CouponsDataViewModel this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(OrderBookCenterEntity orderBookCenterEntity, Continuation<? super Unit> continuation) {
            return ((C261231) create(orderBookCenterEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C261231(BigDecimal bigDecimal, CouponsDataViewModel couponsDataViewModel, String str, String str2, String str3, Continuation<? super C261231> continuation) {
            super(2, continuation);
            this.$totalInvestments = bigDecimal;
            this.this$0 = couponsDataViewModel;
            this.$symbol = str;
            this.$templateType = str2;
            this.$checkCouponsId = str3;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C261231 c261231 = new C261231(this.$totalInvestments, this.this$0, this.$symbol, this.$templateType, this.$checkCouponsId, continuation);
            c261231.L$0 = obj;
            return c261231;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            OrderBookCenterEntity orderBookCenterEntity = (OrderBookCenterEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BigDecimal bigDecimalMultiply = C41014a.m89922G(this.$totalInvestments, null, 1, null).multiply(new BigDecimal(String.valueOf(C27039d.m66646f(orderBookCenterEntity != null ? Boxing.boxDouble(orderBookCenterEntity.getPrice()) : null))));
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            this.this$0.m63942J(this.$symbol, this.$templateType, bigDecimalMultiply.toPlainString(), this.$checkCouponsId);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CouponsDataViewModel$getSymbolPrice$1(String str, CouponsDataViewModel couponsDataViewModel, BigDecimal bigDecimal, String str2, String str3, String str4, Continuation<? super CouponsDataViewModel$getSymbolPrice$1> continuation) {
        super(2, continuation);
        this.$quote = str;
        this.this$0 = couponsDataViewModel;
        this.$totalInvestments = bigDecimal;
        this.$symbol = str2;
        this.$templateType = str3;
        this.$checkCouponsId = str4;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CouponsDataViewModel$getSymbolPrice$1(this.$quote, this.this$0, this.$totalInvestments, this.$symbol, this.$templateType, this.$checkCouponsId, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((CouponsDataViewModel$getSymbolPrice$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CouponsDataViewModel$getSymbolPrice$1 couponsDataViewModel$getSymbolPrice$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                couponsDataViewModel$getSymbolPrice$1 = this;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            String str = this.$quote;
            InterfaceC41634e<OrderBookCenterEntity> interfaceC41634eM97773g = this.this$0.f52324V.m97773g(str + "-USDT");
            C261231 c261231 = new C261231(this.$totalInvestments, this.this$0, this.$symbol, this.$templateType, this.$checkCouponsId, null);
            this.L$0 = SpillingKt.nullOutSpilledVariable("USDT");
            this.L$1 = SpillingKt.nullOutSpilledVariable(str);
            this.label = 1;
            couponsDataViewModel$getSymbolPrice$1 = this;
            obj = RetrofitFlowExKt.m42824e(interfaceC41634eM97773g, false, c261231, couponsDataViewModel$getSymbolPrice$1, 1, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        CouponsDataViewModel couponsDataViewModel = couponsDataViewModel$getSymbolPrice$1.this$0;
        Throwable throwable = ((C19334f) obj).getThrowable();
        if (throwable != null) {
            CouponsSelectUIState couponsSelectUIState = new CouponsSelectUIState();
            couponsSelectUIState.m63918f(throwable.getMessage());
            t0.d(couponsDataViewModel.m63936A(), couponsSelectUIState);
            C44128b.m97264h(throwable);
        }
        return Unit.INSTANCE;
    }
}
