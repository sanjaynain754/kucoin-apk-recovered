package com.kubi.futures.trade.order.modify;

import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.EditText;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5267e0;
import com.blankj.utilcode.util.C5270g;
import com.blankj.utilcode.util.KeyboardUtils;
import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.trade.order.modify.BaseModifyOrderViewModel;
import com.kubi.futures.trade.order.modify.advance.AdvanceLimitModifyDialog;
import com.kubi.futures.trade.order.modify.hidden.HiddenModifyOrderDialog;
import com.kubi.futures.trade.order.modify.limit.LimitModifyOrderDialog;
import com.kubi.futures.trade.order.modify.twap.TwapModifyOrderDialog;
import com.kubi.futures.view.MaxHeightConstraintLayout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.market.model.PriceEntity;
import com.kubi.kumex.data.market.model.TickerEntity;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.platform.model.TradingNoticeEntity;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.logic.constant.OrderTradeType;
import com.kubi.p110rn.kline.KlineFlutterMiniConstants;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.ITradeInputLayoutOperations;
import com.kubi.resources.widget.KcTradeNumAbInputView;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.utils.C27092t0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import fm.C37568c;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import ki.C41050b;
import ki.InterfaceC41049a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p314hi.C38214b;
import p314hi.InterfaceC38213a;
import p314hi.InterfaceC38215c;
import p314hi.InterfaceC38216d;
import p314hi.InterfaceC38220h;
import p343ii.C38645a;
import p343ii.C38646b;
import p343ii.C38651g;
import p402kf.C41014a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import sh.EuropeComplianceSymbolDocEntity;
import th.InterfaceC44980d;

/* JADX INFO: compiled from: BaseModifyOrderDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 h*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u0004:\u0001hB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u001f\u001a\u00020\u001dH\u0016J\b\u0010#\u001a\u00020$H&J\b\u0010%\u001a\u00020\u001dH&J\b\u0010&\u001a\u00020'H&J\u0010\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020*H&J\b\u0010+\u001a\u00020,H&J&\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u0001022\b\u00103\u001a\u0004\u0018\u000104H\u0016J\u001a\u00105\u001a\u00020'2\u0006\u00106\u001a\u00020.2\b\u00103\u001a\u0004\u0018\u000104H\u0016J\f\u00107\u001a\u00020'*\u000208H\u0004J\f\u00109\u001a\u00020'*\u00020:H\u0004J\f\u0010;\u001a\u00020'*\u00020:H\u0004J\n\u0010<\u001a\u0004\u0018\u00010=H\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010>H\u0016J\n\u0010?\u001a\u0004\u0018\u00010@H\u0016J\n\u0010A\u001a\u0004\u0018\u00010BH\u0016J\b\u0010)\u001a\u00020*H\u0016J\b\u0010C\u001a\u00020DH\u0016J\b\u0010E\u001a\u00020$H\u0016J\b\u0010F\u001a\u00020\u000eH\u0016J\n\u0010G\u001a\u0004\u0018\u00010\u000eH\u0016J\n\u0010H\u001a\u0004\u0018\u00010\u000eH\u0016J\n\u0010I\u001a\u0004\u0018\u00010\u000eH\u0016J\n\u0010J\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010K\u001a\u00020,H\u0016J\b\u0010L\u001a\u00020,H\u0016J\b\u0010M\u001a\u00020\u0018H\u0016J\b\u0010N\u001a\u00020DH\u0016J\b\u0010O\u001a\u00020DH\u0016J\b\u0010P\u001a\u00020DH\u0016J\u0012\u0010Q\u001a\u0004\u0018\u00010\u000e2\u0006\u0010C\u001a\u00020DH\u0016J\u0012\u0010R\u001a\u0004\u0018\u00010\u000e2\u0006\u0010C\u001a\u00020DH\u0016J\u0012\u0010S\u001a\u0004\u0018\u00010\u000e2\u0006\u0010C\u001a\u00020DH\u0016J\b\u0010T\u001a\u00020DH\u0016J\n\u0010Y\u001a\u0004\u0018\u00010\u000eH\u0016J\n\u0010Z\u001a\u0004\u0018\u00010\u000eH\u0016J\n\u0010[\u001a\u0004\u0018\u00010\\H\u0016J\b\u0010]\u001a\u00020'H\u0016J\b\u0010^\u001a\u00020'H\u0016J\b\u0010_\u001a\u00020'H\u0002J\u000e\u0010`\u001a\u0004\u0018\u00010a*\u000202H\u0002J\u0014\u0010b\u001a\u00020'*\u00020.2\u0006\u0010c\u001a\u00020\u001dH\u0002J\f\u0010d\u001a\u00020'*\u00020.H\u0002J\u000e\u0010e\u001a\u0004\u0018\u000102*\u00020.H\u0002J\u000e\u0010f\u001a\u0004\u0018\u000102*\u00020.H\u0002J\b\u0010g\u001a\u00020'H\u0016R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001d\u0010\r\u001a\u0004\u0018\u00010\u000e8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00138DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00188TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\f\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010 \u001a\u00028\u0000X¤\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001d\u0010U\u001a\u0004\u0018\u00010D8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bX\u0010\f\u001a\u0004\bV\u0010W¨\u0006i"}, m90084d2 = {"Lcom/kubi/futures/trade/order/modify/BaseModifyOrderDialog;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/kubi/futures/trade/order/modify/BaseModifyOrderViewModel;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "Lcom/kubi/futures/trade/order/modify/IModifyOrderPanelInput;", "<init>", "()V", "order", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "getOrder", "()Lcom/kubi/kumex/data/trade/model/OrderEntity;", "order$delegate", "Lkotlin/Lazy;", "targetPrice", "Ljava/math/BigDecimal;", "getTargetPrice", "()Ljava/math/BigDecimal;", "targetPrice$delegate", "contract", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "getContract", "()Lcom/kubi/kumex/data/platform/model/ContractEntity;", "contract$delegate", "qtyFactory", "Lcom/kubi/futures/trade/config/qty/IQtyUnitStrategy;", "getQtyFactory", "()Lcom/kubi/futures/trade/config/qty/IQtyUnitStrategy;", "qtyFactory$delegate", "statusBarHeight", "", "screenHeight", "initType", "viewModel", "getViewModel", "()Lcom/kubi/futures/trade/order/modify/BaseModifyOrderViewModel;", "orderType", "Lcom/kubi/kumex/logic/constant/OrderTradeType;", "getLayoutId", "initView", "", "initObserver", TUIConstants.TUIChat.OWNER, "Landroidx/lifecycle/LifecycleOwner;", "isModifyOfOrder", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "setMaxHeight", "Lcom/kubi/futures/view/MaxHeightConstraintLayout;", "initPriceInput", "Lcom/kubi/resources/widget/KcTradeNumAbInputView;", "initQtyInput", "environment", "Lcom/kubi/futures/trade/config/IFuturesEnvironmentConfig;", "Lcom/kubi/futures/trade/config/IFuturesContractConfig;", "noticeSetting", "Lcom/kubi/futures/trade/config/IFuturesNoticeSetting;", "userConfig", "Lcom/kubi/futures/trade/config/IFuturesUserConfig;", "side", "", "tradeType", "leverage", "bestAsk", "bestBid", "markPrice", KlineFlutterMiniConstants.PROP_LATEST_PRICE, "isTrial", "isAirdrop", "qtyUnit", "marginMode", "positionMode", "positionStatus", "liquidationPrice", "maxQty", "cost", "trackType", "orderId", "getOrderId", "()Ljava/lang/String;", "orderId$delegate", "originalTriggerStopUpPrice", "originalTriggerStopDownPrice", "europeComplianceDoc", "Lcom/kubi/futures/data/compliance/entity/EuropeComplianceSymbolDocEntity;", "onResume", "onPause", "registerSoftInputListener", "findFocusedEditTextRecursive", "Landroid/widget/EditText;", "scrollIntoView", "keyboardHeight", "scrollTop", "findScrollView", "findScrollableParent", "onDestroyView", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class BaseModifyOrderDialog<T extends BaseModifyOrderViewModel> extends DialogFragmentHelper implements IModifyOrderPanelInput {

    /* JADX INFO: renamed from: x0 */
    @NotNull
    public static final Companion f23879x0 = new Companion(null);

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final Lazy f23880q0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.order.modify.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseModifyOrderDialog.m27127F4(this.f23917b);
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f23881r0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.order.modify.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseModifyOrderDialog.m27131N4(this.f23919b);
        }
    });

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f23882s0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.order.modify.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseModifyOrderDialog.m27139q4(this.f23921b);
        }
    });

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final Lazy f23883t0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.order.modify.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseModifyOrderDialog.m27128G4(this.f23923b);
        }
    });

    /* JADX INFO: renamed from: u0 */
    public final int f23884u0 = C5270g.m6194h();

    /* JADX INFO: renamed from: v0 */
    public final int f23885v0 = C5267e0.m6179a();

    /* JADX INFO: renamed from: w0 */
    @NotNull
    public final Lazy f23886w0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.order.modify.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseModifyOrderDialog.m27126D4(this.f23925b);
        }
    });

    /* JADX INFO: compiled from: BaseModifyOrderDialog.kt */
    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JD\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2 \b\u0002\u0010\f\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/futures/trade/order/modify/BaseModifyOrderDialog$Companion;", "", "<init>", "()V", TIMPushProvider.f75062n, "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "orderEntity", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "targetPrice", "Ljava/math/BigDecimal;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void show$default(Companion companion, FragmentManager fragmentManager, OrderEntity orderEntity, BigDecimal bigDecimal, Function2 function2, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                bigDecimal = null;
            }
            if ((i11 & 8) != 0) {
                function2 = null;
            }
            companion.show(fragmentManager, orderEntity, bigDecimal, function2);
        }

        public final void show(@NotNull FragmentManager fragmentManager, @NotNull OrderEntity orderEntity, @Nullable BigDecimal targetPrice, @Nullable Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
            com.kubi.futures.trade.submit.panel.tradeType.twap.b twapModifyOrderDialog;
            String str;
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(orderEntity, "orderEntity");
            if (C37568c.m84636g(orderEntity)) {
                twapModifyOrderDialog = new LimitModifyOrderDialog();
                twapModifyOrderDialog.m27362w5(callback);
                str = "LimitModifyOrderDialog";
            } else if (C37568c.m84633d(orderEntity)) {
                twapModifyOrderDialog = new AdvanceLimitModifyDialog();
                twapModifyOrderDialog.m27362w5(callback);
                str = "AdvanceLimitModifyDialog";
            } else if (C37568c.m84635f(orderEntity)) {
                twapModifyOrderDialog = new HiddenModifyOrderDialog();
                twapModifyOrderDialog.m27362w5(callback);
                str = "HiddenModifyOrderDialog";
            } else if (C37568c.m84647r(orderEntity)) {
                twapModifyOrderDialog = new TwapModifyOrderDialog();
                str = "TwapModifyOrderDialog";
            } else {
                twapModifyOrderDialog = null;
                str = null;
            }
            if (twapModifyOrderDialog != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("data", orderEntity);
                bundle.putSerializable("data_1", targetPrice);
                twapModifyOrderDialog.setArguments(bundle);
                twapModifyOrderDialog.show(fragmentManager, str);
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.trade.order.modify.BaseModifyOrderDialog$a */
    /* JADX INFO: compiled from: BaseModifyOrderDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/futures/trade/order/modify/BaseModifyOrderDialog$noticeSetting$1", "Lcom/kubi/futures/trade/config/IFuturesNoticeSetting;", "enableDeepBook", "", "enableMarkPriceDeviation", "enableLimitOrderConfirmAgain", "enableMarketOrderConfirmAgain", "enableTriggerOrderConfirmAgain", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13787a implements InterfaceC38216d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TradingNoticeEntity f23887a;

        @Override // p314hi.InterfaceC38216d
        /* JADX INFO: renamed from: a */
        public boolean mo27182a() {
            return false;
        }

        public C13787a(TradingNoticeEntity tradingNoticeEntity) {
            this.f23887a = tradingNoticeEntity;
        }

        @Override // p314hi.InterfaceC38216d
        /* JADX INFO: renamed from: b */
        public boolean mo27183b() {
            HashMap<String, Boolean> confirmConfig = this.f23887a.getConfirmConfig();
            return C27025c.m66567e(confirmConfig != null ? confirmConfig.get("MISOPERATION") : null, true);
        }

        @Override // p314hi.InterfaceC38216d
        /* JADX INFO: renamed from: c */
        public boolean mo27184c() {
            HashMap<String, Boolean> confirmConfig = this.f23887a.getConfirmConfig();
            return C27025c.m66567e(confirmConfig != null ? confirmConfig.get("LIMIT_CLOSE") : null, true);
        }
    }

    /* JADX INFO: renamed from: A4 */
    public abstract void mo27141A4(@NotNull LifecycleOwner lifecycleOwner);

    @NotNull
    /* JADX INFO: renamed from: E4 */
    public abstract OrderTradeType mo27147E4();

    /* JADX INFO: renamed from: K4 */
    public final void m27153K4(View view, int i11) {
        ViewGroup viewGroupM27173t4;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int height = iArr[1] + view.getHeight();
        int i12 = this.f23885v0 - i11;
        if (height <= i12 || (viewGroupM27173t4 = m27173t4(view)) == null) {
            return;
        }
        viewGroupM27173t4.animate().translationY(i12 - height).start();
    }

    public abstract void initView();

    @Nullable
    /* JADX INFO: renamed from: m1 */
    public EuropeComplianceSymbolDocEntity m27168m1() {
        return null;
    }

    /* JADX INFO: renamed from: v4 */
    public abstract int mo27176v4();

    @NotNull
    /* JADX INFO: renamed from: z4 */
    public abstract T mo27181z4();

    /* JADX INFO: renamed from: G4 */
    public static final InterfaceC41049a m27128G4(BaseModifyOrderDialog baseModifyOrderDialog) {
        return C41050b.f91264a.m90019b(baseModifyOrderDialog.m27174u4());
    }

    /* JADX INFO: renamed from: I4 */
    public static final void m27129I4(final BaseModifyOrderDialog baseModifyOrderDialog, final int i11) {
        ViewGroup viewGroupM27170s4;
        if (i11 > 0) {
            View view = baseModifyOrderDialog.getView();
            if (view != null) {
                view.postDelayed(new Runnable() { // from class: com.kubi.futures.trade.order.modify.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseModifyOrderDialog.m27130J4(this.f23927b, i11);
                    }
                }, 100L);
                return;
            }
            return;
        }
        View view2 = baseModifyOrderDialog.getView();
        ViewGroup viewGroup = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
        if (viewGroup == null || (viewGroupM27170s4 = baseModifyOrderDialog.m27170s4(viewGroup)) == null) {
            return;
        }
        baseModifyOrderDialog.m27154L4(viewGroupM27170s4);
    }

    /* JADX INFO: renamed from: q4 */
    public static final ContractEntity m27139q4(BaseModifyOrderDialog baseModifyOrderDialog) {
        InterfaceC44980d interfaceC44980dM20288g = RepositoryServiceLocator.f19236a.m20288g();
        OrderEntity orderEntityM27178w4 = baseModifyOrderDialog.m27178w4();
        return InterfaceC44980d.m99529O(interfaceC44980dM20288g, C27041f.m66668h(orderEntityM27178w4 != null ? orderEntityM27178w4.getSymbol() : null), false, 2, null);
    }

    /* JADX INFO: renamed from: B4 */
    public final void m27142B4(@NotNull KcTradeNumAbInputView kcTradeNumAbInputView) {
        InterfaceC38213a interfaceC38213aM27158Q2;
        Intrinsics.checkNotNullParameter(kcTradeNumAbInputView, "<this>");
        OrderEntity orderEntityM27178w4 = m27178w4();
        if (orderEntityM27178w4 == null || (interfaceC38213aM27158Q2 = m27158Q2()) == null) {
            return;
        }
        BigDecimal bigDecimalM89921F = C41014a.m89921F(interfaceC38213aM27158Q2.mo86248s(), "2");
        int iM86254c = C38214b.m86254c(interfaceC38213aM27158Q2);
        ITradeInputLayoutOperations.m55172d(kcTradeNumAbInputView, bigDecimalM89921F, iM86254c, false, 4, null);
        kcTradeNumAbInputView.setEnsureIncrement(bigDecimalM89921F);
        EditText editText = kcTradeNumAbInputView.getEditText();
        BigDecimal bigDecimalM27180y4 = m27180y4();
        if (bigDecimalM27180y4 == null) {
            bigDecimalM27180y4 = C41014a.m89922G(orderEntityM27178w4.getPrice(), null, 1, null);
        }
        com.kubi.futures.trade.submit.panel.view.h.c(editText, bigDecimalM27180y4.setScale(iM86254c, RoundingMode.DOWN).toPlainString());
        EditText editText2 = kcTradeNumAbInputView.getEditText();
        Editable text = kcTradeNumAbInputView.getEditText().getText();
        editText2.setSelection(text != null ? text.length() : 0);
        kcTradeNumAbInputView.setHint(getString(R$string.price_order, interfaceC38213aM27158Q2.mo86239j()));
    }

    /* JADX INFO: renamed from: C4 */
    public final void m27143C4(@NotNull KcTradeNumAbInputView kcTradeNumAbInputView) {
        InterfaceC38213a interfaceC38213aM27158Q2;
        Intrinsics.checkNotNullParameter(kcTradeNumAbInputView, "<this>");
        OrderEntity orderEntityM27178w4 = m27178w4();
        if (orderEntityM27178w4 == null || (interfaceC38213aM27158Q2 = m27158Q2()) == null) {
            return;
        }
        kcTradeNumAbInputView.setHint(getString(R$string.qty_stub, C6447a.m11724a(mo27179x4().mo90013g(interfaceC38213aM27158Q2)).toPlainString()));
        kcTradeNumAbInputView.setSupportFloatInputFilter(true);
        ITradeInputLayoutOperations.m55172d(kcTradeNumAbInputView, mo27179x4().mo90016j(interfaceC38213aM27158Q2, orderEntityM27178w4.getPrice(), null), mo27179x4().mo90017k(interfaceC38213aM27158Q2), false, 4, null);
        kcTradeNumAbInputView.setEnsureIncrement(mo27179x4().mo90013g(interfaceC38213aM27158Q2));
        InterfaceC41049a interfaceC41049aMo27179x4 = mo27179x4();
        BigDecimal bigDecimalM66656p = C27039d.m66656p(orderEntityM27178w4.getPrice());
        BigDecimal bigDecimalSubtract = C27039d.m66656p(orderEntityM27178w4.getSize()).abs().subtract(C27039d.m66656p(orderEntityM27178w4.getCancelSize()).abs()).subtract(C27039d.m66656p(orderEntityM27178w4.getDealSize()).abs());
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        BigDecimal bigDecimalM11724a = C6447a.m11724a(interfaceC41049aMo27179x4.mo90009c(interfaceC38213aM27158Q2, bigDecimalM66656p, bigDecimalSubtract, null));
        Intrinsics.checkNotNullExpressionValue(bigDecimalM11724a, "stripTrailingZeros(...)");
        ITradeInputLayoutOperations.m55171a(kcTradeNumAbInputView, bigDecimalM11724a, false, 2, null);
    }

    @Nullable
    /* JADX INFO: renamed from: G0 */
    public InterfaceC38220h m27149G0() {
        return new C38651g(RepositoryServiceLocator.f19236a.m20290i().mo99981F0());
    }

    @Nullable
    /* JADX INFO: renamed from: I1 */
    public BigDecimal m27152I1(@NotNull String side) {
        Intrinsics.checkNotNullParameter(side, "side");
        return null;
    }

    /* JADX INFO: renamed from: M4 */
    public final void m27155M4(@NotNull MaxHeightConstraintLayout maxHeightConstraintLayout) {
        Intrinsics.checkNotNullParameter(maxHeightConstraintLayout, "<this>");
        maxHeightConstraintLayout.setMaxHeightPx(C5267e0.m6179a() - this.f23884u0);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: N3 */
    public int mo24511N3() {
        return 8;
    }

    @Nullable
    /* JADX INFO: renamed from: Q1 */
    public BigDecimal m27157Q1(@NotNull String side) {
        Intrinsics.checkNotNullParameter(side, "side");
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: T0 */
    public BigDecimal m27159T0(@NotNull String side) {
        Intrinsics.checkNotNullParameter(side, "side");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c1 */
    public String m27164c1() {
        return "futuresModifyOrder";
    }

    @Override // com.kubi.futures.trade.order.modify.IModifyOrderPanelInput
    @Nullable
    public String getOrderId() {
        return (String) this.f23886w0.getValue();
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(mo27176v4(), container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (m27178w4() == null) {
            dismissAllowingStateLoss();
            return;
        }
        initView();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        mo27141A4(viewLifecycleOwner);
        m27151H4();
    }

    /* JADX INFO: renamed from: s4 */
    public final ViewGroup m27170s4(View view) {
        if ((view instanceof ScrollView) || (view instanceof NestedScrollView)) {
            return (ViewGroup) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            Intrinsics.checkNotNull(childAt);
            ViewGroup viewGroupM27170s4 = m27170s4(childAt);
            if (viewGroupM27170s4 != null) {
                return viewGroupM27170s4;
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: u4 */
    public final ContractEntity m27174u4() {
        return (ContractEntity) this.f23882s0.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: v1 */
    public InterfaceC38216d m27175v1() {
        return new C13787a(RepositoryServiceLocator.f19236a.m20290i().mo99985g());
    }

    @Nullable
    /* JADX INFO: renamed from: w2 */
    public InterfaceC38215c m27177w2() {
        return new C38646b();
    }

    @Nullable
    /* JADX INFO: renamed from: w4 */
    public final OrderEntity m27178w4() {
        return (OrderEntity) this.f23880q0.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: x4 */
    public InterfaceC41049a mo27179x4() {
        return (InterfaceC41049a) this.f23883t0.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: y4 */
    public final BigDecimal m27180y4() {
        return (BigDecimal) this.f23881r0.getValue();
    }

    /* JADX INFO: renamed from: D4 */
    public static final String m27126D4(BaseModifyOrderDialog baseModifyOrderDialog) {
        OrderEntity orderEntityM27178w4 = baseModifyOrderDialog.m27178w4();
        if (orderEntityM27178w4 != null) {
            return orderEntityM27178w4.getId();
        }
        return null;
    }

    /* JADX INFO: renamed from: F4 */
    public static final OrderEntity m27127F4(BaseModifyOrderDialog baseModifyOrderDialog) {
        Bundle arguments = baseModifyOrderDialog.getArguments();
        if (arguments != null) {
            return (OrderEntity) arguments.getParcelable("data");
        }
        return null;
    }

    /* JADX INFO: renamed from: J4 */
    public static final void m27130J4(BaseModifyOrderDialog baseModifyOrderDialog, int i11) {
        ViewGroup viewGroup;
        EditText editTextM27169r4;
        View view = baseModifyOrderDialog.getView();
        if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup) view;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null && (editTextM27169r4 = baseModifyOrderDialog.m27169r4(viewGroup)) != null) {
            baseModifyOrderDialog.m27153K4(editTextM27169r4, i11);
        }
    }

    /* JADX INFO: renamed from: N4 */
    public static final BigDecimal m27131N4(BaseModifyOrderDialog baseModifyOrderDialog) {
        Serializable serializable;
        Bundle arguments = baseModifyOrderDialog.getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("data_1");
        } else {
            serializable = null;
        }
        if (!(serializable instanceof BigDecimal)) {
            return null;
        }
        return (BigDecimal) serializable;
    }

    @NotNull
    /* JADX INFO: renamed from: A0 */
    public OrderTradeType m27140A0() {
        return mo27147E4();
    }

    @Nullable
    /* JADX INFO: renamed from: D2 */
    public BigDecimal m27144D2() {
        TickerEntity value = mo27181z4().m27226S().getValue();
        if (value != null) {
            return value.getPrice();
        }
        return null;
    }

    /* JADX INFO: renamed from: E0 */
    public boolean m27145E0() {
        Boolean boolValueOf;
        OrderEntity orderEntityM27178w4 = m27178w4();
        if (orderEntityM27178w4 != null) {
            boolValueOf = Boolean.valueOf(orderEntityM27178w4.isTrialFunds());
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }

    @Override // com.kubi.futures.trade.order.modify.IModifyOrderPanelInput
    @Nullable
    /* JADX INFO: renamed from: E1 */
    public BigDecimal mo27146E1() {
        OrderEntity orderEntityM27178w4 = m27178w4();
        if (orderEntityM27178w4 != null) {
            return orderEntityM27178w4.getTriggerStopUpPrice();
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: H0 */
    public BigDecimal m27150H0() {
        TickerEntity value = mo27181z4().m27226S().getValue();
        if (value != null) {
            return value.getBestAskPrice();
        }
        return null;
    }

    /* JADX INFO: renamed from: H4 */
    public final void m27151H4() {
        Window window;
        FragmentActivity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        KeyboardUtils.m6039k(window, new KeyboardUtils.InterfaceC5235b() { // from class: com.kubi.futures.trade.order.modify.a
            @Override // com.blankj.utilcode.util.KeyboardUtils.InterfaceC5235b
            /* JADX INFO: renamed from: a */
            public final void mo6045a(int i11) {
                BaseModifyOrderDialog.m27129I4(this.f23915b, i11);
            }
        });
    }

    /* JADX INFO: renamed from: L4 */
    public final void m27154L4(View view) {
        ViewGroup viewGroupM27170s4 = m27170s4(view);
        if (viewGroupM27170s4 == null) {
            return;
        }
        viewGroupM27170s4.animate().translationY(0.0f).start();
    }

    @NotNull
    /* JADX INFO: renamed from: Q0 */
    public String m27156Q0() {
        String positionSide;
        String strM27172t2 = m27172t2();
        OrderEntity orderEntityM27178w4 = m27178w4();
        if (orderEntityM27178w4 == null || (positionSide = orderEntityM27178w4.getPositionSide()) == null) {
            positionSide = "BOTH";
        }
        if (!Intrinsics.areEqual(positionSide, "BOTH")) {
            if (!Intrinsics.areEqual(strM27172t2, "buy") || !Intrinsics.areEqual(positionSide, SharedPositionInfo.SIDE_LONG)) {
                if (!Intrinsics.areEqual(strM27172t2, "sell") || !Intrinsics.areEqual(positionSide, SharedPositionInfo.SIDE_SHORT)) {
                    return "CLOSE";
                }
                return "OPEN";
            }
            return "OPEN";
        }
        return "OPEN";
    }

    @Nullable
    /* JADX INFO: renamed from: Q2 */
    public InterfaceC38213a m27158Q2() {
        ContractEntity contractEntityM27174u4 = m27174u4();
        if (contractEntityM27174u4 != null) {
            return new C38645a(contractEntityM27174u4);
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: U0 */
    public BigDecimal m27160U0() {
        TickerEntity value = mo27181z4().m27226S().getValue();
        if (value != null) {
            return value.getBestBidPrice();
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V0 */
    public String m27161V0() {
        String marginMode;
        OrderEntity orderEntityM27178w4 = m27178w4();
        if (orderEntityM27178w4 != null && (marginMode = orderEntityM27178w4.getMarginMode()) != null) {
            return marginMode;
        }
        return SharedPositionInfo.MARGIN_MODE_ISOLATED;
    }

    /* JADX INFO: renamed from: a0 */
    public boolean m27162a0() {
        String prizeType;
        OrderEntity orderEntityM27178w4 = m27178w4();
        if (orderEntityM27178w4 != null) {
            prizeType = orderEntityM27178w4.getPrizeType();
        } else {
            prizeType = null;
        }
        return C27092t0.m66897b(prizeType);
    }

    @NotNull
    /* JADX INFO: renamed from: a3 */
    public String m27163a3() {
        String positionSide;
        OrderEntity orderEntityM27178w4 = m27178w4();
        if (orderEntityM27178w4 != null) {
            positionSide = orderEntityM27178w4.getPositionSide();
        } else {
            positionSide = null;
        }
        String strM66668h = C27041f.m66668h(positionSide);
        if (!Intrinsics.areEqual(strM66668h, SharedPositionInfo.SIDE_SHORT) && !Intrinsics.areEqual(strM66668h, SharedPositionInfo.SIDE_LONG)) {
            return "ONEWAY";
        }
        return "HEDGE";
    }

    @Override // com.kubi.futures.trade.order.modify.IModifyOrderPanelInput
    @Nullable
    /* JADX INFO: renamed from: d1 */
    public BigDecimal mo27165d1() {
        OrderEntity orderEntityM27178w4 = m27178w4();
        if (orderEntityM27178w4 != null) {
            return orderEntityM27178w4.getTriggerStopDownPrice();
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: d2 */
    public BigDecimal m27166d2() {
        PriceEntity value = mo27181z4().m27225R().getValue();
        if (value != null) {
            return value.getMarkPrice();
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k2 */
    public BigDecimal m27167k2() {
        BigDecimal leverage;
        OrderEntity orderEntityM27178w4 = m27178w4();
        if (orderEntityM27178w4 != null) {
            leverage = orderEntityM27178w4.getLeverage();
        } else {
            leverage = null;
        }
        return C27039d.m66656p(leverage);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Window window;
        super.onDestroyView();
        FragmentActivity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            KeyboardUtils.m6044p(window);
        }
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        mo27181z4().m27232m();
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onResume() {
        String symbol;
        super.onResume();
        BaseModifyOrderViewModel baseModifyOrderViewModelMo27181z4 = mo27181z4();
        OrderEntity orderEntityM27178w4 = m27178w4();
        if (orderEntityM27178w4 != null) {
            symbol = orderEntityM27178w4.getSymbol();
        } else {
            symbol = null;
        }
        baseModifyOrderViewModelMo27181z4.m27230W(C27041f.m66668h(symbol));
    }

    /* JADX INFO: renamed from: r4 */
    public final EditText m27169r4(ViewGroup viewGroup) {
        View viewFindFocus = viewGroup.findFocus();
        if (viewFindFocus instanceof EditText) {
            return (EditText) viewFindFocus;
        }
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt instanceof ViewGroup) {
                EditText editTextM27169r4 = m27169r4((ViewGroup) childAt);
                if (editTextM27169r4 != null) {
                    return editTextM27169r4;
                }
            } else if (childAt instanceof EditText) {
                EditText editText = (EditText) childAt;
                if (editText.isFocused()) {
                    return editText;
                }
            } else {
                continue;
            }
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: t0 */
    public InterfaceC41049a m27171t0() {
        return mo27179x4();
    }

    @NotNull
    /* JADX INFO: renamed from: t2 */
    public String m27172t2() {
        String side;
        OrderEntity orderEntityM27178w4 = m27178w4();
        if (orderEntityM27178w4 != null) {
            side = orderEntityM27178w4.getSide();
        } else {
            side = null;
        }
        return C27041f.m66669i(side, "buy");
    }

    /* JADX INFO: renamed from: t4 */
    public final ViewGroup m27173t4(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && !(parent instanceof ScrollView) && !(parent instanceof NestedScrollView)) {
            parent = parent.getParent();
        }
        if (parent instanceof ViewGroup) {
            return (ViewGroup) parent;
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: F2 */
    public LifecycleOwner m27148F2() {
        return this;
    }
}
