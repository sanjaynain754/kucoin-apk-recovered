package com.kubi.kumex.trade;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentManager;
import cm.SubmitStopOrderParams;
import com.facebook.react.uimanager.ViewProps;
import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.data.constance.ValidationBizEnum;
import com.kubi.futures.trade.position.adapter.BasePositionsViewHolder;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.kumex.data.trade.model.SubmitAlterTpslOrderEntity;
import com.kubi.kumex.dialog.MarketCloseDialog;
import com.kubi.kumex.dialog.ResultData;
import com.kubi.kumex.dialog.RiskEducationDialog;
import com.kubi.kumex.helper.TradePwdHelperKt;
import com.kubi.kumex.trade.tpsl.ProfitLossPlusDialogFragment;
import com.kubi.kumex.trade.tpsl.SimpleSetTpslDialogFragment;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.kumex.utils.GoogleRatingUtil;
import com.kubi.kumex.utils.Log;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.FragmentResultListener;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24271s1;
import com.kubi.utils.C27017c;
import com.kubi.utils.FlowableCompat;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.qcloud.tuicore.TUIConstants;
import fm.C37568c;
import fm.C37569d;
import io.reactivex.Observable;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Consumer;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p569qq.C43852m;
import p595rg.InterfaceC44081i;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Triple;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.kumex.trade.y3, reason: from Kotlin metadata */
/* JADX INFO: compiled from: PositionHelper.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJF\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052 \b\u0002\u0010\u0011\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\r\u0018\u00010\u0012JB\u0010\u0014\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00162 \b\u0002\u0010\u0011\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\r\u0018\u00010\u0012JR\u0010\u0017\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052 \b\u0002\u0010\u0011\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\r\u0018\u00010\u0012H\u0007JJ\u0010\u0018\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00162 \b\u0002\u0010\u0011\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\r\u0018\u00010\u0012JD\u0010\u001a\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052 \b\u0002\u0010\u0011\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\r\u0018\u00010\u0012J4\u0010\u001c\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2 \b\u0002\u0010\u001d\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\r\u0018\u00010\u0012H\u0002J\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0002J2\u0010\u001f\u001a\u00020 2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010\u0005H\u0002J:\u0010$\u001a\u00020%2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006&"}, m90084d2 = {"Lcom/kubi/kumex/trade/PositionHelper;", "", "<init>", "()V", "TAG", "", "isTpSlOrder", "", "order", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", ViewProps.POSITION, "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "handlePlusProfitLoss", "", "fragment", "Lcom/kubi/sdk/BaseFragment;", "subUid", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/ProtocolException;", "handleSimpleSetTpsl", "targetPrice", "Ljava/math/BigDecimal;", "handleModifyTpsl", "handleSubmitKlineModifyTpsl", "modifyPrice", "handleCopyTradingPlusMarketClose", "display", "fragmentAdded", "notAddExpCallback", "resolveStopDirection", "buildAlterTpslOrderEntity", "Lcom/kubi/kumex/data/trade/model/SubmitAlterTpslOrderEntity;", "isTpOrder", "stopDirection", "validationToken", "buildStopOrderParams", "Lcom/kubi/kumex/data/trade/model/SubmitStopOrderParams;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPositionHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PositionHelper.kt\ncom/kubi/kumex/trade/PositionHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,449:1\n1#2:450\n295#3,2:451\n*S KotlinDebug\n*F\n+ 1 PositionHelper.kt\ncom/kubi/kumex/trade/PositionHelper\n*L\n202#1:451,2\n*E\n"})
public final class PositionHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final PositionHelper f30771a = new PositionHelper();

    /* JADX INFO: renamed from: com.kubi.kumex.trade.y3$a */
    /* JADX INFO: compiled from: PositionHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/kumex/trade/PositionHelper$handleCopyTradingPlusMarketClose$1", "Lcom/kubi/sdk/FragmentResultListener;", "onFragmentResult", "", DbParams.KEY_CHANNEL_RESULT, "Landroid/os/Bundle;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a implements FragmentResultListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Function2<Boolean, ProtocolException, Unit> f30772a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super Boolean, ? super ProtocolException, Unit> function2) {
            this.f30772a = function2;
        }

        @Override // com.kubi.sdk.FragmentResultListener
        /* JADX INFO: renamed from: a */
        public void mo26171a(Bundle result) {
            Intrinsics.checkNotNullParameter(result, "result");
            ResultData resultData = (ResultData) BundleCompat.getParcelable(result, "data", ResultData.class);
            Log.f30813a.m36615a("com.kubi.kumex.dialog.MarketCloseDialog", "市价平仓回调：" + resultData);
            if (resultData == null) {
                Function2<Boolean, ProtocolException, Unit> function2 = this.f30772a;
                if (function2 != null) {
                    function2.invoke(Boolean.FALSE, new ProtocolException("4", new RuntimeException("无市价平仓后回调结果"), null, false, 12, null));
                    return;
                }
                return;
            }
            if (resultData.getSuccess()) {
                Function2<Boolean, ProtocolException, Unit> function3 = this.f30772a;
                if (function3 != null) {
                    function3.invoke(Boolean.TRUE, null);
                    return;
                }
                return;
            }
            Function2<Boolean, ProtocolException, Unit> function4 = this.f30772a;
            if (function4 != null) {
                function4.invoke(Boolean.FALSE, new ProtocolException(resultData.getCode(), new RuntimeException(resultData.getMsg()), null, false, 12, null));
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m36467p(BaseFragment baseFragment, Function2<? super Boolean, ? super ProtocolException, Unit> function2) {
        boolean z11 = false;
        if (baseFragment != null && baseFragment.isAdded()) {
            z11 = true;
        }
        if (!z11 && function2 != null) {
            Boolean bool = Boolean.FALSE;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("当前页面已销毁，page: ");
            sb2.append(baseFragment != null ? baseFragment.getClass().getCanonicalName() : null);
            function2.invoke(bool, new ProtocolException("5", new RuntimeException(sb2.toString()), null, false, 12, null));
        }
        return z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m36433A(PositionHelper positionHelper, BaseFragment baseFragment, PositionEntity positionEntity, String str, Function2 function2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str = null;
        }
        if ((i11 & 8) != 0) {
            function2 = null;
        }
        positionHelper.m36470z(baseFragment, positionEntity, str, function2);
    }

    /* JADX INFO: renamed from: B */
    public static final void m36434B(BaseFragment baseFragment, Function2 function2, PositionEntity positionEntity, Boolean bool) {
        RiskEducationDialog.Companion companion = RiskEducationDialog.f28863q0;
        FragmentManager childFragmentManager = baseFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        companion.showStopProfitAndLossRisk(childFragmentManager);
        if (positionEntity != null) {
            GoogleRatingUtil.f30812a.m36610b(baseFragment.getActivity(), positionEntity);
        }
        if (function2 != null) {
            function2.invoke(bool, null);
        }
    }

    /* JADX INFO: renamed from: D */
    public static final Unit m36435D(Function2 function2, boolean z11) {
        if (function2 != null) {
            function2.invoke(Boolean.valueOf(z11), null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F */
    public static final void m36436F(boolean z11, OrderEntity orderEntity, BigDecimal bigDecimal, Function2 function2, Object obj) {
        C44128b.m97259c("PositionHelper", "submitKlineModifyTpSlOrder success, isPartial=" + z11 + ", orderId=" + orderEntity.getId() + ", targetPrice=" + bigDecimal);
        if (function2 != null) {
            function2.invoke(Boolean.TRUE, null);
        }
    }

    /* JADX INFO: renamed from: G */
    public static final void m36437G(Function2 function2, Throwable th2) {
        if (function2 != null) {
            Boolean bool = Boolean.FALSE;
            String message = th2.getMessage();
            if (message == null) {
                message = "submitKlineModifyTpSlOrder error";
            }
            function2.invoke(bool, new ProtocolException(message, th2, null, false, 12, null));
        }
    }

    /* JADX INFO: renamed from: H */
    public static final Observable m36438H(final boolean z11, final InterfaceC44081i interfaceC44081i, final OrderEntity orderEntity, final BigDecimal bigDecimal, final boolean z12, final String str, final PositionEntity positionEntity, final String str2) {
        Observable observable = FlowableCompat.f54248a.m66386c(new Function0() { // from class: com.kubi.kumex.trade.o3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PositionHelper.m36439I(z11, interfaceC44081i, orderEntity, bigDecimal, z12, str, str2, positionEntity);
            }
        }).compose(C24217a1.m58386j()).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        return observable;
    }

    /* JADX INFO: renamed from: I */
    public static final Unit m36439I(boolean z11, InterfaceC44081i interfaceC44081i, OrderEntity orderEntity, BigDecimal bigDecimal, boolean z12, String str, String str2, PositionEntity positionEntity) {
        if (z11) {
            interfaceC44081i.mo4494B(f30771a.m36465n(orderEntity, bigDecimal, z12, str, str2));
        } else {
            interfaceC44081i.mo4510l0(positionEntity.isTrialFunds(), f30771a.m36466o(positionEntity, orderEntity, bigDecimal, z12, str, str2));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J */
    public static final Unit m36440J(Function2 function2) {
        if (function2 != null) {
            function2.invoke(Boolean.FALSE, new ProtocolException("trade password cancelled", null, null, false, 14, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m36454s(PositionHelper positionHelper, BaseFragment baseFragment, PositionEntity positionEntity, OrderEntity orderEntity, String str, Function2 function2, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            str = null;
        }
        if ((i11 & 16) != 0) {
            function2 = null;
        }
        positionHelper.m36469r(baseFragment, positionEntity, orderEntity, str, function2);
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m36455t(Function2 function2, Throwable th2) {
        C44128b.m97259c("PositionHelper", "handleModifyTpsl fetchPosition error: " + th2);
        if (function2 != null) {
            Boolean bool = Boolean.FALSE;
            String message = th2.getMessage();
            if (message == null) {
                message = "handleModifyTpsl fetchPosition error";
            }
            function2.invoke(bool, new ProtocolException(message, th2, null, false, 12, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final PositionEntity m36457v(boolean z11, OrderEntity orderEntity, PositionEntity positionEntity) {
        Object next;
        Iterator<T> it = MultiBizFacadeManager.f19232a.m20276t().mo83155S(z11, C27041f.m66668h(orderEntity.getSymbol())).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!f30771a.m36463K(orderEntity, (PositionEntity) next));
        PositionEntity positionEntity2 = (PositionEntity) next;
        return positionEntity2 == null ? positionEntity : positionEntity2;
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m36458w(BaseFragment baseFragment, final Function2 function2, OrderEntity orderEntity, String str, PositionEntity positionEntity) {
        BigDecimal scale;
        BigDecimal scale2;
        BigDecimal bigDecimalM11724a;
        BigDecimal bigDecimalM11724a2;
        BigDecimal scale3;
        BigDecimal scale4;
        BigDecimal tickSize;
        if (!f30771a.m36467p(baseFragment, function2)) {
            return Unit.INSTANCE;
        }
        Bundle bundleBundleOf = BundleKt.bundleOf();
        bundleBundleOf.putParcelable("data", positionEntity);
        bundleBundleOf.putString("title", C27017c.f54310a.m66516f(R$string.take_profit_stop_loss, new Object[0]));
        if (positionEntity == null) {
            C44128b.m97259c("PositionHelper", "handleModifyTpsl no matched position found for order " + orderEntity.getId());
            ToastCompat.m66437C(R$string.failed);
            if (function2 != null) {
                function2.invoke(Boolean.FALSE, new ProtocolException("handleModifyTpsl fetchPosition error", null, null, false, 14, null));
            }
            return Unit.INSTANCE;
        }
        ContractEntity contractEntityM84661b = C37569d.m84661b(positionEntity);
        String plainString = null;
        int iM66651k = C27039d.m66651k((contractEntityM84661b == null || (tickSize = contractEntityM84661b.getTickSize()) == null) ? null : Integer.valueOf(C41014a.m89952z(tickSize)), 2);
        bundleBundleOf.putString("subUid", str);
        bundleBundleOf.putInt("modifyMode", C37568c.m84638i(orderEntity) ? 1 : 2);
        bundleBundleOf.putParcelable("modifyOrder", orderEntity);
        bundleBundleOf.putBoolean("isPartial", C27025c.m66566d(orderEntity.getCloseOnly()));
        BigDecimal stopPrice = orderEntity.getStopPrice();
        bundleBundleOf.putString("tpPrice", (stopPrice == null || (scale4 = stopPrice.setScale(iM66651k, RoundingMode.DOWN)) == null) ? null : scale4.toPlainString());
        bundleBundleOf.putString("tpPriceType", orderEntity.getStopPriceType());
        BigDecimal stopPrice2 = orderEntity.getStopPrice();
        bundleBundleOf.putString("slPrice", (stopPrice2 == null || (scale3 = stopPrice2.setScale(iM66651k, RoundingMode.DOWN)) == null) ? null : scale3.toPlainString());
        bundleBundleOf.putString("slPriceType", orderEntity.getStopPriceType());
        BigDecimal size = orderEntity.getSize();
        bundleBundleOf.putString("tpSize", (size == null || (bigDecimalM11724a2 = C6447a.m11724a(size)) == null) ? null : bigDecimalM11724a2.toPlainString());
        BigDecimal size2 = orderEntity.getSize();
        bundleBundleOf.putString("slSize", (size2 == null || (bigDecimalM11724a = C6447a.m11724a(size2)) == null) ? null : bigDecimalM11724a.toPlainString());
        boolean zAreEqual = Intrinsics.areEqual(orderEntity.getType(), TUIConstants.TUIContact.LIMIT);
        bundleBundleOf.putBoolean("tpIsLimit", zAreEqual);
        bundleBundleOf.putBoolean("slIsLimit", zAreEqual);
        BigDecimal price = orderEntity.getPrice();
        bundleBundleOf.putString("tpLimitPrice", (price == null || (scale2 = price.setScale(iM66651k, RoundingMode.DOWN)) == null) ? null : scale2.toPlainString());
        BigDecimal price2 = orderEntity.getPrice();
        if (price2 != null && (scale = price2.setScale(iM66651k, RoundingMode.DOWN)) != null) {
            plainString = scale.toPlainString();
        }
        bundleBundleOf.putString("slLimitPrice", plainString);
        ProfitLossPlusDialogFragment profitLossPlusDialogFragment = new ProfitLossPlusDialogFragment();
        profitLossPlusDialogFragment.setArguments(bundleBundleOf);
        profitLossPlusDialogFragment.F5(new BiConsumer() { // from class: com.kubi.kumex.trade.u3
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                PositionHelper.m36459x(function2, (PositionEntity) obj, (Boolean) obj2);
            }
        });
        FragmentManager childFragmentManager = baseFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        profitLossPlusDialogFragment.show(childFragmentManager, "ProfitLossPlusDialogFragment");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static final void m36459x(Function2 function2, PositionEntity positionEntity, Boolean bool) {
        if (function2 != null) {
            function2.invoke(bool, null);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m36461C(@Nullable BaseFragment baseFragment, @NotNull PositionEntity position, @NotNull BigDecimal targetPrice, @Nullable final Function2<? super Boolean, ? super ProtocolException, Unit> function2) {
        BigDecimal tickSize;
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(targetPrice, "targetPrice");
        if (m36467p(baseFragment, function2)) {
            ContractEntity contractEntityM84661b = C37569d.m84661b(position);
            int iM66651k = C27039d.m66651k((contractEntityM84661b == null || (tickSize = contractEntityM84661b.getTickSize()) == null) ? null : Integer.valueOf(C41014a.m89952z(tickSize)), 2);
            BigDecimal scale = targetPrice.setScale(iM66651k, RoundingMode.DOWN);
            C44128b.m97259c("PositionHelper", "handleSimpleSetTpsl: targetPrice=" + targetPrice + ", modifyPrice=" + scale + ", precision=" + iM66651k);
            String strMo24997Y = RepositoryServiceLocator.f19236a.m20288g().mo24997Y(C27041f.m66668h(position.getSymbol()));
            Context context = baseFragment != null ? baseFragment.getContext() : null;
            if (Intrinsics.areEqual(strMo24997Y, "Paused") || Intrinsics.areEqual(strMo24997Y, "CancelOnly") || context == null) {
                if (function2 != null) {
                    function2.invoke(Boolean.FALSE, new ProtocolException("-3", new RuntimeException("当前处于无法下单的状态，status=" + strMo24997Y), null, false, 12, null));
                    return;
                }
                return;
            }
            BasePositionsViewHolder.i.trackClick("3", position);
            SimpleSetTpslDialogFragment.Companion companion = SimpleSetTpslDialogFragment.G0;
            String plainString = scale.toPlainString();
            Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
            SimpleSetTpslDialogFragment simpleSetTpslDialogFragmentNewInstance = companion.newInstance(position, plainString);
            simpleSetTpslDialogFragmentNewInstance.X5(new Function1() { // from class: com.kubi.kumex.trade.v3
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PositionHelper.m36435D(function2, ((Boolean) obj).booleanValue());
                }
            });
            FragmentManager childFragmentManager = baseFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            simpleSetTpslDialogFragmentNewInstance.show(childFragmentManager, "SimpleSetTpslDialogFragment");
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m36462E(@Nullable BaseFragment baseFragment, @NotNull final PositionEntity position, @NotNull final OrderEntity order, @NotNull final BigDecimal modifyPrice, @Nullable final Function2<? super Boolean, ? super ProtocolException, Unit> function2) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(modifyPrice, "modifyPrice");
        if (m36467p(baseFragment, function2)) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(m36464L(order));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl == null) {
                final String str = (String) objM103844constructorimpl;
                final boolean zM84638i = C37568c.m84638i(order);
                final boolean z11 = C27025c.m66566d(order.getCloseOnly()) && !C27025c.m66566d(order.getCloseOrder());
                final InterfaceC44081i interfaceC44081iM20260s = MultiBizFacadeManager.m20260s(MultiBizFacadeManager.f19232a, null, 1, null);
                Intrinsics.checkNotNull(baseFragment);
                TradePwdHelperKt.m33943w(baseFragment, false, ValidationBizEnum.CONTRACT_TRADE, new Function1() { // from class: com.kubi.kumex.trade.m3
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PositionHelper.m36438H(z11, interfaceC44081iM20260s, order, modifyPrice, zM84638i, str, position, (String) obj);
                    }
                }, new Consumer() { // from class: com.kubi.kumex.trade.w3
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        PositionHelper.m36436F(z11, order, modifyPrice, function2, obj);
                    }
                }, new Consumer() { // from class: com.kubi.kumex.trade.x3
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        PositionHelper.m36437G(function2, (Throwable) obj);
                    }
                }, z11 ? order.isTrialFunds() : position.isTrialFunds(), (128 & 128) != 0 ? "" : null, (128 & 256) != 0 ? 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0095: INVOKE 
                      (r15v0 'baseFragment' com.kubi.sdk.BaseFragment)
                      false
                      (wrap com.kubi.data.constance.ValidationBizEnum:0x0066: SGET  A[WRAPPED] (LINE:104) com.kubi.data.constance.ValidationBizEnum.CONTRACT_TRADE com.kubi.data.constance.ValidationBizEnum)
                      (wrap kotlin.jvm.functions.Function1:0x0081: CONSTRUCTOR 
                      (r2v4 'z11' boolean A[DONT_INLINE])
                      (r3v2 'interfaceC44081iM20260s' rg.i A[DONT_INLINE])
                      (r17v0 'order' com.kubi.kumex.data.trade.model.OrderEntity A[DONT_INLINE])
                      (r18v0 'modifyPrice' java.math.BigDecimal A[DONT_INLINE])
                      (r6v1 'zM84638i' boolean A[DONT_INLINE])
                      (r7v2 'str' java.lang.String A[DONT_INLINE])
                      (r16v0 'position' com.kubi.kumex.data.trade.model.PositionEntity A[DONT_INLINE])
                     A[MD:(boolean, rg.i, com.kubi.kumex.data.trade.model.OrderEntity, java.math.BigDecimal, boolean, java.lang.String, com.kubi.kumex.data.trade.model.PositionEntity):void (m), WRAPPED] (LINE:132) call: com.kubi.kumex.trade.m3.<init>(boolean, rg.i, com.kubi.kumex.data.trade.model.OrderEntity, java.math.BigDecimal, boolean, java.lang.String, com.kubi.kumex.data.trade.model.PositionEntity):void type: CONSTRUCTOR)
                      (wrap io.reactivex.functions.Consumer:0x006a: CONSTRUCTOR 
                      (r2v4 'z11' boolean A[DONT_INLINE])
                      (r17v0 'order' com.kubi.kumex.data.trade.model.OrderEntity A[DONT_INLINE])
                      (r18v0 'modifyPrice' java.math.BigDecimal A[DONT_INLINE])
                      (r19v0 'function2' kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super com.kubi.sdk.protocol.ProtocolException, kotlin.Unit> A[DONT_INLINE])
                     A[MD:(boolean, com.kubi.kumex.data.trade.model.OrderEntity, java.math.BigDecimal, kotlin.jvm.functions.Function2):void (m), WRAPPED] (LINE:109) call: com.kubi.kumex.trade.w3.<init>(boolean, com.kubi.kumex.data.trade.model.OrderEntity, java.math.BigDecimal, kotlin.jvm.functions.Function2):void type: CONSTRUCTOR)
                      (wrap io.reactivex.functions.Consumer:0x006f: CONSTRUCTOR 
                      (r19v0 'function2' kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super com.kubi.sdk.protocol.ProtocolException, kotlin.Unit> A[DONT_INLINE])
                     A[MD:(kotlin.jvm.functions.Function2):void (m), WRAPPED] (LINE:114) call: com.kubi.kumex.trade.x3.<init>(kotlin.jvm.functions.Function2):void type: CONSTRUCTOR)
                      (wrap boolean:0x0078: TERNARY null = ((r2v4 'z11' boolean) != false) ? (wrap ??:0x0074: INVOKE (r17v0 'order' com.kubi.kumex.data.trade.model.OrderEntity) VIRTUAL call: com.kubi.kumex.data.trade.model.OrderEntity.isTrialFunds():boolean A[MD:():boolean (m), WRAPPED] (LINE:119)) : (wrap ??:0x007a: INVOKE (r16v0 'position' com.kubi.kumex.data.trade.model.PositionEntity) VIRTUAL call: com.kubi.kumex.data.trade.model.PositionEntity.isTrialFunds():boolean A[MD:():boolean (m), WRAPPED] (LINE:125)))
                      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0002: ARITH (128 int) & (128 int) A[WRAPPED] (LINE:4)) != (0 int)) ? ("") : (null java.lang.String))
                      (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x000c: ARITH (128 int) & (256 int) A[WRAPPED] (LINE:14)) != (0 int)) ? (wrap ??:0x0015: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:21) call: com.kubi.kumex.helper.y0.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function0:0x0086: CONSTRUCTOR 
                      (r19v0 'function2' kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super com.kubi.sdk.protocol.ProtocolException, kotlin.Unit> A[DONT_INLINE])
                     A[MD:(kotlin.jvm.functions.Function2):void (m), WRAPPED] (LINE:137) call: com.kubi.kumex.trade.n3.<init>(kotlin.jvm.functions.Function2):void type: CONSTRUCTOR))
                     STATIC call: com.kubi.kumex.helper.TradePwdHelperKt.w(androidx.fragment.app.Fragment, boolean, com.kubi.data.constance.ValidationBizEnum, kotlin.jvm.functions.Function1, io.reactivex.functions.Consumer, io.reactivex.functions.Consumer, boolean, java.lang.String, kotlin.jvm.functions.Function0):void A[MD:(androidx.fragment.app.Fragment, boolean, com.kubi.data.constance.ValidationBizEnum, kotlin.jvm.functions.Function1<? super java.lang.String, ? extends io.reactivex.Observable<java.lang.Object>>, io.reactivex.functions.Consumer<java.lang.Object>, io.reactivex.functions.Consumer<java.lang.Throwable>, boolean, java.lang.String, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:38) in method: com.kubi.kumex.trade.y3.E(com.kubi.sdk.BaseFragment, com.kubi.kumex.data.trade.model.PositionEntity, com.kubi.kumex.data.trade.model.OrderEntity, java.math.BigDecimal, kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super com.kubi.sdk.protocol.ProtocolException, kotlin.Unit>):void, file: classes20.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.kubi.kumex.helper.y0, state: NOT_LOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                    	at jadx.core.codegen.InsnGen.makeTernary(InsnGen.java:1187)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:536)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                    	... 31 more
                    */
                /*
                    this = this;
                    r4 = r17
                    r5 = r18
                    r9 = r19
                    java.lang.String r0 = "position"
                    r8 = r16
                    p852kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                    java.lang.String r0 = "order"
                    p852kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                    java.lang.String r0 = "modifyPrice"
                    p852kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                    r10 = r15
                    boolean r0 = r14.m36467p(r15, r9)
                    if (r0 != 0) goto L20
                    goto Lb2
                L20:
                    kotlin.Result$Companion r0 = p852kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L2b
                    java.lang.String r0 = r14.m36464L(r4)     // Catch: java.lang.Throwable -> L2b
                    java.lang.Object r0 = p852kotlin.Result.m103844constructorimpl(r0)     // Catch: java.lang.Throwable -> L2b
                    goto L36
                L2b:
                    r0 = move-exception
                    kotlin.Result$Companion r1 = p852kotlin.Result.INSTANCE
                    java.lang.Object r0 = p852kotlin.ResultKt.createFailure(r0)
                    java.lang.Object r0 = p852kotlin.Result.m103844constructorimpl(r0)
                L36:
                    java.lang.Throwable r3 = p852kotlin.Result.m103847exceptionOrNullimpl(r0)
                    if (r3 != 0) goto L99
                    r7 = r0
                    java.lang.String r7 = (java.lang.String) r7
                    boolean r6 = fm.C37568c.m84638i(r4)
                    java.lang.Boolean r0 = r4.getCloseOnly()
                    boolean r0 = com.kubi.utils.extensions.C27025c.m66566d(r0)
                    r1 = 1
                    if (r0 == 0) goto L5a
                    java.lang.Boolean r0 = r4.getCloseOrder()
                    boolean r0 = com.kubi.utils.extensions.C27025c.m66566d(r0)
                    if (r0 != 0) goto L5a
                    r2 = r1
                    goto L5c
                L5a:
                    r0 = 0
                    r2 = r0
                L5c:
                    com.kubi.broker.m r0 = com.kubi.broker.MultiBizFacadeManager.f19232a
                    r3 = 0
                    rg.i r3 = com.kubi.broker.MultiBizFacadeManager.m20260s(r0, r3, r1, r3)
                    p852kotlin.jvm.internal.Intrinsics.checkNotNull(r15)
                    com.kubi.data.constance.ValidationBizEnum r0 = com.kubi.data.constance.ValidationBizEnum.CONTRACT_TRADE
                    com.kubi.kumex.trade.w3 r11 = new com.kubi.kumex.trade.w3
                    r11.<init>()
                    com.kubi.kumex.trade.x3 r12 = new com.kubi.kumex.trade.x3
                    r12.<init>()
                    if (r2 == 0) goto L7a
                    boolean r1 = r4.isTrialFunds()
                L78:
                    r13 = r1
                    goto L7f
                L7a:
                    boolean r1 = r8.isTrialFunds()
                    goto L78
                L7f:
                    com.kubi.kumex.trade.m3 r1 = new com.kubi.kumex.trade.m3
                    r1.<init>()
                    com.kubi.kumex.trade.n3 r2 = new com.kubi.kumex.trade.n3
                    r2.<init>()
                    r10 = 128(0x80, float:1.8E-43)
                    r5 = r11
                    r11 = 0
                    r9 = r2
                    r2 = 0
                    r8 = 0
                    r3 = r0
                    r4 = r1
                    r6 = r12
                    r7 = r13
                    r1 = r15
                    com.kubi.kumex.helper.TradePwdHelperKt.m33944x(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                    return
                L99:
                    if (r9 == 0) goto Lb2
                    java.lang.Boolean r0 = java.lang.Boolean.FALSE
                    com.kubi.sdk.protocol.ProtocolException r1 = new com.kubi.sdk.protocol.ProtocolException
                    java.lang.String r2 = r3.getMessage()
                    if (r2 != 0) goto La7
                    java.lang.String r2 = "invalid stop direction"
                La7:
                    r6 = 12
                    r7 = 0
                    r4 = 0
                    r5 = 0
                    r1.<init>(r2, r3, r4, r5, r6, r7)
                    r9.invoke(r0, r1)
                Lb2:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.kubi.kumex.trade.PositionHelper.m36462E(com.kubi.sdk.BaseFragment, com.kubi.kumex.data.trade.model.PositionEntity, com.kubi.kumex.data.trade.model.OrderEntity, java.math.BigDecimal, kotlin.jvm.functions.Function2):void");
            }

            /* JADX INFO: renamed from: K */
            public final boolean m36463K(@NotNull OrderEntity order, @NotNull PositionEntity position) {
                String stop;
                String stopPriceType;
                Intrinsics.checkNotNullParameter(order, "order");
                Intrinsics.checkNotNullParameter(position, "position");
                BigDecimal bigDecimalM89922G = C41014a.m89922G(position.getCurrentQty(), null, 1, null);
                return Intrinsics.areEqual(order.getSymbol(), position.getSymbol()) && !((!Intrinsics.areEqual(order.getDisplayType(), "market_stop") && !Intrinsics.areEqual(order.getDisplayType(), "limit_stop")) || (stop = order.getStop()) == null || StringsKt.isBlank(stop) || order.getStopPrice() == null || (stopPriceType = order.getStopPriceType()) == null || StringsKt.isBlank(stopPriceType) || ((!C27025c.m66566d(order.getCloseOnly()) && !C27025c.m66566d(order.getCloseOrder())) || !((Intrinsics.areEqual(order.getSide(), "buy") && bigDecimalM89922G.compareTo(BigDecimal.ZERO) < 0) || (Intrinsics.areEqual(order.getSide(), "sell") && bigDecimalM89922G.compareTo(BigDecimal.ZERO) > 0)) || order.isTrialFunds() != position.isTrialFunds()));
            }

            /* JADX INFO: renamed from: n */
            public final SubmitAlterTpslOrderEntity m36465n(OrderEntity orderEntity, BigDecimal bigDecimal, boolean z11, String str, String str2) {
                return new SubmitAlterTpslOrderEntity("ANDROID", bigDecimal, orderEntity.getSize(), orderEntity.getStopPriceType(), orderEntity.getSymbol(), orderEntity.getId(), orderEntity.getSide(), z11 ? bigDecimal : null, z11 ? null : bigDecimal, orderEntity.getType(), str, bigDecimal, str2);
            }

            /* JADX WARN: Code duplicated, block: B:18:0x0044  */
            /* JADX WARN: Code duplicated, block: B:25:0x0059  */
            /* JADX WARN: Code duplicated, block: B:32:0x006f  */
            /* JADX WARN: Code duplicated, block: B:39:0x0085  */
            /* JADX WARN: Code duplicated, block: B:46:0x009a  */
            /* JADX WARN: Code duplicated, block: B:53:0x00b0  */
            /* JADX INFO: renamed from: o */
            public final SubmitStopOrderParams m36466o(PositionEntity positionEntity, OrderEntity orderEntity, BigDecimal bigDecimal, boolean z11, String str, String str2) {
                Object first;
                String str3;
                Object second;
                BigDecimal bigDecimal2;
                Object third2;
                String str4;
                Object first2;
                String str5;
                Object second2;
                BigDecimal bigDecimal3;
                Object third3;
                String str6;
                BigDecimal bigDecimalAbs;
                BigDecimal bigDecimalM11724a;
                BigDecimal currentQty = positionEntity.getCurrentQty();
                boolean z12 = false;
                if (currentQty != null && currentQty.compareTo(BigDecimal.ZERO) == 1) {
                    z12 = true;
                }
                String plainString = null;
                Triple triple = z11 ? new Triple(C27041f.m66668h(orderEntity.getStopPriceType()), bigDecimal, str) : null;
                Triple triple2 = z11 ? null : new Triple(C27041f.m66668h(orderEntity.getStopPriceType()), bigDecimal, str);
                if (z12) {
                    if (triple != null) {
                        first = triple.getFirst();
                        str3 = (String) first;
                    } else {
                        str3 = null;
                    }
                } else if (triple2 != null) {
                    first = triple2.getFirst();
                    str3 = (String) first;
                } else {
                    str3 = null;
                }
                if (z12) {
                    if (triple != null) {
                        second = triple.getSecond();
                        bigDecimal2 = (BigDecimal) second;
                    } else {
                        bigDecimal2 = null;
                    }
                } else if (triple2 != null) {
                    second = triple2.getSecond();
                    bigDecimal2 = (BigDecimal) second;
                } else {
                    bigDecimal2 = null;
                }
                if (z12) {
                    if (triple != null) {
                        third2 = triple.getThird();
                        str4 = (String) third2;
                    } else {
                        str4 = null;
                    }
                } else if (triple2 != null) {
                    third2 = triple2.getThird();
                    str4 = (String) third2;
                } else {
                    str4 = null;
                }
                if (z12) {
                    if (triple2 != null) {
                        first2 = triple2.getFirst();
                        str5 = (String) first2;
                    } else {
                        str5 = null;
                    }
                } else if (triple != null) {
                    first2 = triple.getFirst();
                    str5 = (String) first2;
                } else {
                    str5 = null;
                }
                if (z12) {
                    if (triple2 != null) {
                        second2 = triple2.getSecond();
                        bigDecimal3 = (BigDecimal) second2;
                    } else {
                        bigDecimal3 = null;
                    }
                } else if (triple != null) {
                    second2 = triple.getSecond();
                    bigDecimal3 = (BigDecimal) second2;
                } else {
                    bigDecimal3 = null;
                }
                if (z12) {
                    if (triple2 != null) {
                        third3 = triple2.getThird();
                        str6 = (String) third3;
                    } else {
                        str6 = null;
                    }
                } else if (triple != null) {
                    third3 = triple.getThird();
                    str6 = (String) third3;
                } else {
                    str6 = null;
                }
                String strM66669i = C27041f.m66669i(positionEntity.getSymbol(), C27041f.m66668h(orderEntity.getSymbol()));
                String str7 = z12 ? "sell" : "buy";
                BigDecimal currentQty2 = positionEntity.getCurrentQty();
                if (currentQty2 != null && (bigDecimalAbs = currentQty2.abs()) != null && (bigDecimalM11724a = C6447a.m11724a(bigDecimalAbs)) != null) {
                    plainString = bigDecimalM11724a.toPlainString();
                }
                return new SubmitStopOrderParams(strM66669i, str7, plainString, C27041f.m66668h(positionEntity.getPositionSide()), C27041f.m66668h(positionEntity.getMarginMode()), str3, bigDecimal2, str5, bigDecimal3, str4, str6, str2, orderEntity.getId(), "ANDROID", null, 16384, null);
            }

            /* JADX INFO: renamed from: q */
            public final void m36468q(@NotNull BaseFragment fragment, @NotNull PositionEntity display, @Nullable String str, @Nullable Function2<? super Boolean, ? super ProtocolException, Unit> function2) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                Intrinsics.checkNotNullParameter(display, "display");
                if (m36467p(fragment, function2)) {
                    if (!TradePwdHelperKt.m33931k(fragment, display.isTrialFunds())) {
                        if (function2 != null) {
                            function2.invoke(Boolean.FALSE, new ProtocolException("-3", new RuntimeException("未设置交易密码"), null, false, 12, null));
                        }
                    } else {
                        fragment.setFragmentResultListener("com.kubi.kumex.dialog.MarketCloseDialog", new a(function2));
                        MarketCloseDialog marketCloseDialogNewInstance = MarketCloseDialog.B0.newInstance(display, str);
                        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                        marketCloseDialogNewInstance.show(childFragmentManager, "copy_trading_market_close_dialog");
                    }
                }
            }

            @SuppressLint({"CheckResult"})
            /* JADX INFO: renamed from: r */
            public final void m36469r(@Nullable final BaseFragment baseFragment, @Nullable final PositionEntity positionEntity, @NotNull final OrderEntity order, @Nullable final String str, @Nullable final Function2<? super Boolean, ? super ProtocolException, Unit> function2) {
                Intrinsics.checkNotNullParameter(order, "order");
                if (m36467p(baseFragment, function2)) {
                    String strMo24997Y = RepositoryServiceLocator.f19236a.m20288g().mo24997Y(C27041f.m66668h(order.getSymbol()));
                    Context context = baseFragment != null ? baseFragment.getContext() : null;
                    if (!Intrinsics.areEqual(strMo24997Y, "Paused") && !Intrinsics.areEqual(strMo24997Y, "CancelOnly") && context != null) {
                        final boolean zIsTrialFunds = order.isTrialFunds();
                        Observable observableCompose = Observable.fromCallable(new Callable() { // from class: com.kubi.kumex.trade.p3
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return PositionHelper.m36457v(zIsTrialFunds, order, positionEntity);
                            }
                        }).compose(C24217a1.m58387k());
                        final Function1 function1 = new Function1() { // from class: com.kubi.kumex.trade.q3
                            @Override // p852kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return PositionHelper.m36458w(baseFragment, function2, order, str, (PositionEntity) obj);
                            }
                        };
                        Consumer consumer = new Consumer() { // from class: com.kubi.kumex.trade.r3
                            @Override // io.reactivex.functions.Consumer
                            public final void accept(Object obj) {
                                PositionHelper.m36460y(function1, obj);
                            }
                        };
                        final Function1 function3 = new Function1() { // from class: com.kubi.kumex.trade.s3
                            @Override // p852kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return PositionHelper.m36455t(function2, (Throwable) obj);
                            }
                        };
                        observableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.kumex.trade.t3
                            @Override // io.reactivex.functions.Consumer
                            public final void accept(Object obj) {
                                PositionHelper.m36456u(function3, obj);
                            }
                        });
                        return;
                    }
                    if (function2 != null) {
                        function2.invoke(Boolean.FALSE, new ProtocolException("-3", new RuntimeException("当前处于无法下单的状态，status=" + strMo24997Y), null, false, 12, null));
                    }
                }
            }

            /* JADX INFO: renamed from: z */
            public final void m36470z(@Nullable final BaseFragment baseFragment, @NotNull PositionEntity position, @Nullable String str, @Nullable final Function2<? super Boolean, ? super ProtocolException, Unit> function2) {
                Intrinsics.checkNotNullParameter(position, "position");
                if (m36467p(baseFragment, function2)) {
                    String strMo24997Y = RepositoryServiceLocator.f19236a.m20288g().mo24997Y(C27041f.m66668h(position.getSymbol()));
                    Context context = baseFragment != null ? baseFragment.getContext() : null;
                    if (Intrinsics.areEqual(strMo24997Y, "Paused") || Intrinsics.areEqual(strMo24997Y, "CancelOnly") || context == null) {
                        if (function2 != null) {
                            function2.invoke(Boolean.FALSE, new ProtocolException("-3", new RuntimeException("当前处于无法下单的状态，status=" + strMo24997Y), null, false, 12, null));
                            return;
                        }
                        return;
                    }
                    BasePositionsViewHolder.i.trackClick("3", position);
                    Bundle bundleBundleOf = BundleKt.bundleOf();
                    bundleBundleOf.putParcelable("data", position);
                    bundleBundleOf.putString("title", C27017c.f54310a.m66516f(R$string.take_profit_stop_loss, new Object[0]));
                    bundleBundleOf.putString("subUid", str);
                    C24271s1.m58529a(bundleBundleOf, C43852m.m96601m(C17060n0.m36552b(), "PositionHold", "3"));
                    ProfitLossPlusDialogFragment profitLossPlusDialogFragment = new ProfitLossPlusDialogFragment();
                    profitLossPlusDialogFragment.setArguments(bundleBundleOf);
                    profitLossPlusDialogFragment.F5(new BiConsumer() { // from class: com.kubi.kumex.trade.l3
                        @Override // io.reactivex.functions.BiConsumer
                        public final void accept(Object obj, Object obj2) {
                            PositionHelper.m36434B(baseFragment, function2, (PositionEntity) obj, (Boolean) obj2);
                        }
                    });
                    FragmentManager childFragmentManager = baseFragment.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                    profitLossPlusDialogFragment.show(childFragmentManager, "ProfitLossPlusDialogFragment");
                }
            }

            /* JADX INFO: renamed from: u */
            public static final void m36456u(Function1 function1, Object obj) {
                function1.invoke(obj);
            }

            /* JADX INFO: renamed from: y */
            public static final void m36460y(Function1 function1, Object obj) {
                function1.invoke(obj);
            }

            /* JADX INFO: renamed from: L */
            public final String m36464L(OrderEntity orderEntity) {
                String strM66668h = C27041f.m66668h(orderEntity.getStop());
                if (!Intrinsics.areEqual(strM66668h, "up") && !Intrinsics.areEqual(strM66668h, "down")) {
                    throw new IllegalArgumentException("invalid stop direction: " + strM66668h);
                }
                return strM66668h;
            }
        }
