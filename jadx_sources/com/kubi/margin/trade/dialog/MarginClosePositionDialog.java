package com.kubi.margin.trade.dialog;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.KeyboardUtils;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.margin.R$color;
import com.kubi.margin.R$id;
import com.kubi.margin.R$layout;
import com.kubi.margin.R$string;
import com.kubi.margin.api.entity.MarginPosition;
import com.kubi.margin.entity.IsolateMarginPositionConfig;
import com.kubi.margin.trade.BaseMarginFragment;
import com.kubi.margin.trade.MarginConfigManager;
import com.kubi.margin.trade.position.MarginIsolatedPositionFragment;
import com.kubi.margin.view.MarginRiskView;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.resources.C22890g;
import com.kubi.resources.dialog.GravityDialogFragment;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.RadioGroupPlus;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.safe.api.service.TradePasswordExtensionsKt;
import com.kubi.safe.api.service.TradePasswordExtensionsKt$executeTradePassword$1;
import com.kubi.safe.api.tradesecurity.TradeSecurityScene;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.tradebase.entity.CurrencyBalance;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37756h;
import gf.C37890n;
import io.reactivex.functions.Action;
import java.math.BigDecimal;
import mp.C42579a;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p206dp.C36907d;
import p402kf.C41014a;
import p568qp.C43836p;
import p569qq.C43852m;
import p768xo.InterfaceC46305f;
import p768xo.InterfaceC46307h;
import p838zo.C46897a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: MarginClosePositionDialog.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u00102\u001a\u000203H\u0016J\u0012\u00104\u001a\u0002032\b\u00105\u001a\u0004\u0018\u000106H\u0016J&\u00107\u001a\u0004\u0018\u0001082\u0006\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<2\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u001a\u0010=\u001a\u0002032\u0006\u0010>\u001a\u0002082\b\u00105\u001a\u0004\u0018\u000106H\u0016J\b\u0010?\u001a\u000203H\u0002J\n\u0010@\u001a\u0004\u0018\u00010AH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R#\u0010\u0016\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u001d\u001a\n \u0018*\u0004\u0018\u00010\u001e0\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\u001f\u0010 R\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b$\u0010%R\u001d\u0010'\u001a\u0004\u0018\u00010(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u001c\u001a\u0004\b)\u0010*R\u0012\u0010,\u001a\u0004\u0018\u00010-X\u0082\u0004¢\u0006\u0004\n\u0002\u0010.R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u000100X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006B"}, m90084d2 = {"Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;", "Lcom/kubi/resources/dialog/GravityDialogFragment;", ViewProps.POSITION, "Lcom/kubi/margin/api/entity/MarginPosition;", "symbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lio/reactivex/functions/Action;", "<init>", "(Lcom/kubi/margin/api/entity/MarginPosition;Lcom/kubi/data/entity/SymbolInfoEntity;Lio/reactivex/functions/Action;)V", "getPosition", "()Lcom/kubi/margin/api/entity/MarginPosition;", "getSymbolInfo", "()Lcom/kubi/data/entity/SymbolInfoEntity;", "getAction", "()Lio/reactivex/functions/Action;", "bmarginDialogMarginClosePositionBinding", "Lcom/kubi/margin/databinding/BmarginDialogMarginClosePositionBinding;", "getBmarginDialogMarginClosePositionBinding", "()Lcom/kubi/margin/databinding/BmarginDialogMarginClosePositionBinding;", "bmarginDialogMarginClosePositionBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "marketApi", "Lcom/kubi/margin/api/MarketApi;", "kotlin.jvm.PlatformType", "getMarketApi", "()Lcom/kubi/margin/api/MarketApi;", "marketApi$delegate", "Lkotlin/Lazy;", "marginApi", "Lcom/kubi/margin/api/MarginApi;", "getMarginApi", "()Lcom/kubi/margin/api/MarginApi;", "marginApi$delegate", "positionFragment", "Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;", "getPositionFragment", "()Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;", "positionFragment$delegate", "isolateConfig", "Lcom/kubi/margin/entity/IsolateMarginPositionConfig;", "getIsolateConfig", "()Lcom/kubi/margin/entity/IsolateMarginPositionConfig;", "isolateConfig$delegate", "isLong", "", "Ljava/lang/Boolean;", "baseAsset", "Lcom/kubi/tradebase/entity/CurrencyBalance;", "quoteAsset", "dismiss", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "requestOrder", "marginFragment", "Lcom/kubi/margin/trade/BaseMarginFragment;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"KCCyclomaticComplexityCheck", "KCLongMethodCheck"})
@SourceDebugExtension({"SMAP\nMarginClosePositionDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginClosePositionDialog.kt\ncom/kubi/margin/trade/dialog/MarginClosePositionDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,331:1\n143#2,20:332\n*S KotlinDebug\n*F\n+ 1 MarginClosePositionDialog.kt\ncom/kubi/margin/trade/dialog/MarginClosePositionDialog\n*L\n72#1:332,20\n*E\n"})
public final class MarginClosePositionDialog extends GravityDialogFragment {

    /* JADX INFO: renamed from: n0 */
    public static final /* synthetic */ KProperty<Object>[] f33754n0 = {Reflection.property1(new PropertyReference1Impl(MarginClosePositionDialog.class, "bmarginDialogMarginClosePositionBinding", "getBmarginDialogMarginClosePositionBinding()Lcom/kubi/margin/databinding/BmarginDialogMarginClosePositionBinding;", 0))};

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final MarginPosition f33755c0;

    /* JADX INFO: renamed from: d0 */
    @Nullable
    public final SymbolInfoEntity f33756d0;

    /* JADX INFO: renamed from: e0 */
    @Nullable
    public final Action f33757e0;

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final InterfaceC24293a f33758f0;

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public final Lazy f33759g0;

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public final Lazy f33760h0;

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public final Lazy f33761i0;

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public final Lazy f33762j0;

    /* JADX INFO: renamed from: k0 */
    @Nullable
    public final Boolean f33763k0;

    /* JADX INFO: renamed from: l0 */
    @Nullable
    public final CurrencyBalance f33764l0;

    /* JADX INFO: renamed from: m0 */
    @Nullable
    public final CurrencyBalance f33765m0;

    /* JADX INFO: renamed from: com.kubi.margin.trade.dialog.MarginClosePositionDialog$a */
    /* JADX INFO: compiled from: MarginClosePositionDialog.kt */
    @Metadata(m90083d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0010"}, m90084d2 = {"com/kubi/margin/trade/dialog/MarginClosePositionDialog$onViewCreated$1$3", "Lcom/kubi/margin/view/MarginRiskView$IRiskData;", "fragment", "Landroidx/fragment/app/Fragment;", "status", "", "value", "", "riskGrade", "symbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "transferableAmountDebtRatio", "Ljava/math/BigDecimal;", "flDebtRatio", "isIsolateMargin", "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C18217a implements MarginRiskView.InterfaceC18593a {
        @Override // com.kubi.margin.view.MarginRiskView.InterfaceC18593a
        /* JADX INFO: renamed from: b */
        public boolean mo40121b() {
            return true;
        }

        public C18217a() {
        }

        @Override // com.kubi.margin.view.MarginRiskView.InterfaceC18593a
        /* JADX INFO: renamed from: H */
        public Fragment mo40120H() {
            return MarginClosePositionDialog.this;
        }

        @Override // com.kubi.margin.view.MarginRiskView.InterfaceC18593a
        /* JADX INFO: renamed from: c */
        public String mo40122c() {
            return C27041f.m66668h(MarginClosePositionDialog.this.getF33755c0().getRiskGrade());
        }

        @Override // com.kubi.margin.view.MarginRiskView.InterfaceC18593a
        /* JADX INFO: renamed from: d */
        public BigDecimal mo40123d() {
            IsolateMarginPositionConfig isolateMarginPositionConfigM40115N3 = MarginClosePositionDialog.this.m40115N3();
            if (isolateMarginPositionConfigM40115N3 != null) {
                return isolateMarginPositionConfigM40115N3.getFlDebtRatio();
            }
            return null;
        }

        @Override // com.kubi.margin.view.MarginRiskView.InterfaceC18593a
        /* JADX INFO: renamed from: e */
        public SymbolInfoEntity mo40124e() {
            return MarginClosePositionDialog.this.getF33756d0();
        }

        @Override // com.kubi.margin.view.MarginRiskView.InterfaceC18593a
        /* JADX INFO: renamed from: f */
        public BigDecimal mo40125f() {
            IsolateMarginPositionConfig isolateMarginPositionConfigM40115N3 = MarginClosePositionDialog.this.m40115N3();
            if (isolateMarginPositionConfigM40115N3 != null) {
                return isolateMarginPositionConfigM40115N3.getTransferOutMaxDebtRatio();
            }
            return null;
        }

        @Override // com.kubi.margin.view.MarginRiskView.InterfaceC18593a
        public String status() {
            return C27041f.m66668h(MarginClosePositionDialog.this.getF33755c0().getStatus());
        }

        @Override // com.kubi.margin.view.MarginRiskView.InterfaceC18593a
        public double value() {
            return C27039d.m66647g(MarginClosePositionDialog.this.getF33755c0().calculatorLiabilityRate());
        }
    }

    public /* synthetic */ MarginClosePositionDialog(MarginPosition marginPosition, SymbolInfoEntity symbolInfoEntity, Action action, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(marginPosition, symbolInfoEntity, (i11 & 4) != 0 ? null : action);
    }

    public MarginClosePositionDialog(@NotNull MarginPosition position, @Nullable SymbolInfoEntity symbolInfoEntity, @Nullable Action action) {
        Intrinsics.checkNotNullParameter(position, "position");
        this.f33755c0 = position;
        this.f33756d0 = symbolInfoEntity;
        this.f33757e0 = action;
        this.f33758f0 = C45681e.m100799e(this, new Function1<MarginClosePositionDialog, C36907d>() { // from class: com.kubi.margin.trade.dialog.MarginClosePositionDialog$special$$inlined$viewBindingFragment$default$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C36907d invoke(@NotNull MarginClosePositionDialog fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                return C36907d.m82683a(fragment.requireView());
            }
        }, new Function1<C36907d, Unit>() { // from class: com.kubi.margin.trade.dialog.MarginClosePositionDialog$special$$inlined$viewBindingFragment$default$1
            public final void invoke(@NotNull C36907d it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C36907d c36907d) {
                invoke(c36907d);
                return Unit.INSTANCE;
            }
        });
        this.f33759g0 = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.trade.dialog.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginClosePositionDialog.m40105V3();
            }
        });
        this.f33760h0 = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.trade.dialog.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginClosePositionDialog.m40104T3();
            }
        });
        this.f33761i0 = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.trade.dialog.t
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginClosePositionDialog.m40108Y3(this.f33848b);
            }
        });
        this.f33762j0 = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.trade.dialog.u
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginClosePositionDialog.m40103S3(this.f33851b);
            }
        });
        this.f33763k0 = position.isShowDirection();
        this.f33764l0 = position.getBaseAsset();
        this.f33765m0 = position.getQuoteAsset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O3 */
    public final InterfaceC46305f m40102O3() {
        return (InterfaceC46305f) this.f33760h0.getValue();
    }

    /* JADX INFO: renamed from: S3 */
    public static final IsolateMarginPositionConfig m40103S3(MarginClosePositionDialog marginClosePositionDialog) {
        return MarginConfigManager.f33681a.m39872S0(C27041f.m66668h(marginClosePositionDialog.f33755c0.getTag()));
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0027  */
    /* JADX INFO: renamed from: W3 */
    public static final Unit m40106W3(MarginClosePositionDialog marginClosePositionDialog, C36907d c36907d) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("symbol", marginClosePositionDialog.f33755c0.getTag());
        int f44016b = c36907d.f81627n.getF44016b();
        String str = "retainBase";
        if (f44016b == R$id.rb_one) {
            if (C27025c.m66567e(marginClosePositionDialog.f33763k0, true)) {
                str = "retainQuote";
            }
        } else if (f44016b != R$id.rb_two) {
            str = f44016b == R$id.rb_three ? "liquidationLiability" : "";
        } else if (!C27025c.m66567e(marginClosePositionDialog.f33763k0, true)) {
            str = "retainQuote";
        }
        jSONObject.put("model", str);
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a("B4tradingIsolated", "orderManagement", "15", jSONObject);
        BaseMarginFragment baseMarginFragmentM40119U3 = marginClosePositionDialog.m40119U3();
        String disabledTip = null;
        if (C27025c.m66566d(baseMarginFragmentM40119U3 != null ? Boolean.valueOf(baseMarginFragmentM40119U3.mo39721M()) : null)) {
            ToastCompat.m66437C(R$string.outage_tip);
            marginClosePositionDialog.dismissAllowingStateLoss();
            return Unit.INSTANCE;
        }
        if (!C42579a.f94275a.m93347g().d0().isHasOpenLever()) {
            marginClosePositionDialog.dismissAllowingStateLoss();
            InterfaceC37756h.a.m85147e(C37304a.f82764a, null, null, null, null, null, null, null, 127, null);
            return Unit.INSTANCE;
        }
        SymbolInfoEntity symbolInfoEntity = marginClosePositionDialog.f33756d0;
        if (C27025c.m66566d(symbolInfoEntity != null ? Boolean.valueOf(symbolInfoEntity.isEnableTrading()) : null)) {
            if (C43836p.m96535b(marginClosePositionDialog.m40117Q3())) {
                marginClosePositionDialog.m40109Z3();
                return Unit.INSTANCE;
            }
            marginClosePositionDialog.dismissAllowingStateLoss();
            return Unit.INSTANCE;
        }
        SymbolInfoEntity symbolInfoEntity2 = marginClosePositionDialog.f33756d0;
        if (TextUtils.isEmpty(symbolInfoEntity2 != null ? symbolInfoEntity2.getDisabledTip() : null)) {
            disabledTip = marginClosePositionDialog.getString(R$string.current_trade_pause);
        } else {
            SymbolInfoEntity symbolInfoEntity3 = marginClosePositionDialog.f33756d0;
            if (symbolInfoEntity3 != null) {
                disabledTip = symbolInfoEntity3.getDisabledTip();
            }
        }
        ToastCompat.m66441G(disabledTip, new Object[0]);
        marginClosePositionDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f  */
    /* JADX INFO: renamed from: Z3 */
    private final void m40109Z3() {
        LifecycleCoroutineScope lifecycleScope;
        RadioGroupPlus radioGroupPlus;
        C36907d c36907dM40114M3 = m40114M3();
        Integer numValueOf = (c36907dM40114M3 == null || (radioGroupPlus = c36907dM40114M3.f81627n) == null) ? null : Integer.valueOf(radioGroupPlus.getF44016b());
        int i11 = R$id.rb_one;
        String str = "retainBase";
        if (numValueOf == null || numValueOf.intValue() != i11) {
            int i12 = R$id.rb_two;
            if (numValueOf == null || numValueOf.intValue() != i12) {
                str = (numValueOf != null && numValueOf.intValue() == R$id.rb_three) ? "liquidationLiability" : "";
            } else if (!C27025c.m66567e(this.f33763k0, true)) {
                str = "retainQuote";
            }
        } else if (C27025c.m66567e(this.f33763k0, true)) {
            str = "retainQuote";
        }
        String strM66668h = C27041f.m66668h(this.f33755c0.getTag());
        String str2 = "{\"symbol\":\"" + strM66668h + "\",\"model\":\"" + str + "\"}";
        BaseMarginFragment baseMarginFragmentM40119U3 = m40119U3();
        if (baseMarginFragmentM40119U3 != null) {
            TradeSecurityScene tradeSecurityScene = TradeSecurityScene.MARGIN_ISOLATED_CLOSE;
            BaseMarginFragment baseMarginFragmentM40119U4 = m40119U3();
            if (baseMarginFragmentM40119U4 == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(baseMarginFragmentM40119U4)) == null) {
                lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            }
            TradePasswordExtensionsKt.m56335d(baseMarginFragmentM40119U3, tradeSecurityScene, lifecycleScope, (504 & 4) != 0 ? "" : str2, (504 & 8) != 0 ? null : null, (504 & 16) != 0 ? false : false, (504 & 32) != 0, (504 & 64) != 0 ? false : false, (504 & 128) != 0 ? new TradePasswordExtensionsKt$executeTradePassword$1(null) : null, (504 & 256) != 0 ? new Function0() { // from class: com.kubi.safe.api.service.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradePasswordExtensionsKt.m56337f();
                }
            } : null, new MarginClosePositionDialog$requestOrder$1(this, strM66668h, str, null), (504 & 1024) != 0 ? new Function0() { // from class: com.kubi.safe.api.service.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradePasswordExtensionsKt.m56338g();
                }
            } : new Function0() { // from class: com.kubi.margin.trade.dialog.x
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginClosePositionDialog.m40110a4();
                }
            }, (504 & 2048) != 0 ? new Function1() { // from class: com.kubi.safe.api.service.f
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradePasswordExtensionsKt.m56339h((Throwable) obj);
                }
            } : new Function1() { // from class: com.kubi.margin.trade.dialog.y
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginClosePositionDialog.m40111b4((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a4 */
    public static final Unit m40110a4() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b4 */
    public static final Unit m40111b4(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        C19331c.m42836c(error, null, 2, null);
        C44128b.m97264h(error);
        return Unit.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: L3, reason: from getter */
    public final Action getF33757e0() {
        return this.f33757e0;
    }

    /* JADX INFO: renamed from: M3 */
    public final C36907d m40114M3() {
        return (C36907d) this.f33758f0.getValue(this, f33754n0[0]);
    }

    /* JADX INFO: renamed from: N3 */
    public final IsolateMarginPositionConfig m40115N3() {
        return (IsolateMarginPositionConfig) this.f33762j0.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: P3, reason: from getter */
    public final MarginPosition getF33755c0() {
        return this.f33755c0;
    }

    /* JADX INFO: renamed from: Q3 */
    public final MarginIsolatedPositionFragment m40117Q3() {
        return (MarginIsolatedPositionFragment) this.f33761i0.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: R3, reason: from getter */
    public final SymbolInfoEntity getF33756d0() {
        return this.f33756d0;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.bmargin_dialog_margin_close_position, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        CurrencyBalance currencyBalance;
        CurrencyBalance currencyBalance2;
        CurrencyBalance currencyBalance3;
        CurrencyBalance currencyBalance4;
        CurrencyBalance currencyBalance5;
        CurrencyBalance currencyBalance6;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        final C36907d c36907dM40114M3 = m40114M3();
        if (c36907dM40114M3 != null) {
            AppCompatImageView close = c36907dM40114M3.f81615b;
            Intrinsics.checkNotNullExpressionValue(close, "close");
            C27046k.m66711z(close, 0L, new Function0() { // from class: com.kubi.margin.trade.dialog.v
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginClosePositionDialog.m40107X3(this.f33854b);
                }
            }, 1, null);
            BaseTextView baseTextView = c36907dM40114M3.f81638y;
            Intrinsics.checkNotNull(baseTextView);
            ViewExtKt.m66577h(baseTextView);
            Boolean bool = this.f33763k0;
            if (bool != null) {
                boolean zBooleanValue = bool.booleanValue();
                ViewExtKt.m66594y(baseTextView);
                baseTextView.setText(zBooleanValue ? R$string.multi : R$string.empty);
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                baseTextView.setBackground(C22890g.m54287l(C22890g.m54281f(contextRequireContext, zBooleanValue), 4.0f));
            }
            BaseTextView baseTextView2 = c36907dM40114M3.f81633t;
            SymbolInfoEntity symbolInfoEntity = this.f33756d0;
            baseTextView2.setText(symbolInfoEntity != null ? symbolInfoEntity.getShowSymbol() : null);
            c36907dM40114M3.f81618e.m40708e(new C18217a(), true);
            BaseTextView baseTextView3 = c36907dM40114M3.f81630q;
            C27096v0 c27096v0Append = new C27096v0().append(getString(R$string.margin_current_position, ""));
            CurrencyBalance currencyBalance7 = this.f33764l0;
            BigDecimal bigDecimalM89922G = C41014a.m89922G(currencyBalance7 != null ? currencyBalance7.getTotalBalance() : null, null, 1, null);
            BigDecimal bigDecimal = BigDecimal.ZERO;
            if (bigDecimalM89922G.compareTo(bigDecimal) > 0) {
                CurrencyBalance currencyBalance8 = this.f33764l0;
                String strM103305q = currencyBalance8 != null ? C46897a.m103305q(currencyBalance8) : null;
                C27017c c27017c = C27017c.f54310a;
                int i11 = R$color.c_text;
                C27096v0 c27096v0Append2 = c27096v0Append.m66905e(strM103305q, c27017c.m66512a(i11)).append(C33627eb.f69716f);
                CurrencyBalance currencyBalance9 = this.f33764l0;
                c27096v0Append2.append(currencyBalance9 != null ? currencyBalance9.getCurrencyName() : null);
                CurrencyBalance currencyBalance10 = this.f33765m0;
                if (C41014a.m89922G(currencyBalance10 != null ? currencyBalance10.getTotalBalance() : null, null, 1, null).compareTo(bigDecimal) > 0) {
                    C27096v0 c27096v0Append3 = c27096v0Append.append(" + ");
                    CurrencyBalance currencyBalance11 = this.f33765m0;
                    C27096v0 c27096v0Append4 = c27096v0Append3.m66905e(currencyBalance11 != null ? C46897a.m103305q(currencyBalance11) : null, c27017c.m66512a(i11)).append(C33627eb.f69716f);
                    CurrencyBalance currencyBalance12 = this.f33765m0;
                    c27096v0Append4.append(currencyBalance12 != null ? currencyBalance12.getCurrencyName() : null);
                }
            } else {
                CurrencyBalance currencyBalance13 = this.f33765m0;
                if (C41014a.m89922G(currencyBalance13 != null ? currencyBalance13.getTotalBalance() : null, null, 1, null).compareTo(bigDecimal) > 0) {
                    CurrencyBalance currencyBalance14 = this.f33765m0;
                    C27096v0 c27096v0Append5 = c27096v0Append.m66905e(currencyBalance14 != null ? C46897a.m103305q(currencyBalance14) : null, C27017c.f54310a.m66512a(R$color.c_text)).append(C33627eb.f69716f);
                    CurrencyBalance currencyBalance15 = this.f33765m0;
                    c27096v0Append5.append(currencyBalance15 != null ? currencyBalance15.getCurrencyName() : null);
                }
            }
            baseTextView3.setText(c27096v0Append);
            BaseTextView baseTextView4 = c36907dM40114M3.f81629p;
            int i12 = R$string.margin_close_out_total;
            BigDecimal bigDecimal2 = this.f33755c0.totalConversionCompat();
            baseTextView4.setText(getString(i12, C27041f.m66668h(bigDecimal2 != null ? C41014a.m89948v(C41014a.m89940n(bigDecimal2, "BTC"), null, null, 0, false, false, false, 63, null) : null)));
            BaseTextView baseTextView5 = c36907dM40114M3.f81631r;
            int i13 = R$string.hold_position_qty;
            baseTextView5.setText(getString(i13, C27041f.m66668h((!C27025c.m66567e(this.f33763k0, true) ? (currencyBalance = this.f33764l0) != null : (currencyBalance = this.f33765m0) != null) ? null : currencyBalance.getCurrencyName())));
            BaseTextView baseTextView6 = c36907dM40114M3.f81632s;
            int i14 = R$string.margin_close_out_hold_tip;
            baseTextView6.setText(getString(i14, C27041f.m66668h((!C27025c.m66567e(this.f33763k0, true) ? (currencyBalance2 = this.f33764l0) != null : (currencyBalance2 = this.f33765m0) != null) ? null : currencyBalance2.getCurrencyName())));
            ImageView imageView = c36907dM40114M3.f81619f;
            C37890n c37890n = C37890n.f85269a;
            CoinInfoEntity coinInfoEntityM85613u = c37890n.m85613u(C27041f.m66668h((!C27025c.m66567e(this.f33763k0, true) ? (currencyBalance3 = this.f33764l0) != null : (currencyBalance3 = this.f33765m0) != null) ? null : currencyBalance3.getCurrency()));
            C24277v.m58542g(imageView, coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getIconUrl() : null);
            c36907dM40114M3.f81635v.setText(getString(i13, C27041f.m66668h((C27025c.m66567e(this.f33763k0, true) ? (currencyBalance4 = this.f33764l0) == null : (currencyBalance4 = this.f33765m0) == null) ? null : currencyBalance4.getCurrencyName())));
            c36907dM40114M3.f81637x.setText(getString(i14, C27041f.m66668h((C27025c.m66567e(this.f33763k0, true) ? (currencyBalance5 = this.f33764l0) == null : (currencyBalance5 = this.f33765m0) == null) ? null : currencyBalance5.getCurrencyName())));
            ImageView imageView2 = c36907dM40114M3.f81622i;
            CoinInfoEntity coinInfoEntityM85613u2 = c37890n.m85613u(C27041f.m66668h((C27025c.m66567e(this.f33763k0, true) ? (currencyBalance6 = this.f33764l0) == null : (currencyBalance6 = this.f33765m0) == null) ? null : currencyBalance6.getCurrency()));
            C24277v.m58542g(imageView2, coinInfoEntityM85613u2 != null ? coinInfoEntityM85613u2.getIconUrl() : null);
            ImageView imageView3 = c36907dM40114M3.f81620g;
            CurrencyBalance currencyBalance16 = this.f33764l0;
            CoinInfoEntity coinInfoEntityM85613u3 = c37890n.m85613u(C27041f.m66668h(currencyBalance16 != null ? currencyBalance16.getCurrency() : null));
            C24277v.m58542g(imageView3, coinInfoEntityM85613u3 != null ? coinInfoEntityM85613u3.getIconUrl() : null);
            ImageView imageView4 = c36907dM40114M3.f81621h;
            CurrencyBalance currencyBalance17 = this.f33765m0;
            CoinInfoEntity coinInfoEntityM85613u4 = c37890n.m85613u(C27041f.m66668h(currencyBalance17 != null ? currencyBalance17.getCurrency() : null));
            C24277v.m58542g(imageView4, coinInfoEntityM85613u4 != null ? coinInfoEntityM85613u4.getIconUrl() : null);
            CurrencyBalance currencyBalance18 = this.f33764l0;
            if (C41014a.m89922G(currencyBalance18 != null ? C46897a.m103299k(currencyBalance18) : null, null, 1, null).compareTo(bigDecimal) > 0) {
                CurrencyBalance currencyBalance19 = this.f33765m0;
                if (C41014a.m89922G(currencyBalance19 != null ? C46897a.m103299k(currencyBalance19) : null, null, 1, null).compareTo(bigDecimal) > 0) {
                    BaseTextView baseTextView7 = c36907dM40114M3.f81634u;
                    int i15 = R$string.margin_close_out_repay_debt_only;
                    StringBuilder sb2 = new StringBuilder();
                    CurrencyBalance currencyBalance20 = this.f33764l0;
                    sb2.append(C27041f.m66668h(currencyBalance20 != null ? currencyBalance20.getCurrencyName() : null));
                    sb2.append(" + ");
                    CurrencyBalance currencyBalance21 = this.f33765m0;
                    sb2.append(C27041f.m66668h(currencyBalance21 != null ? currencyBalance21.getCurrencyName() : null));
                    baseTextView7.setText(getString(i15, sb2.toString()));
                    ImageView ivThree1 = c36907dM40114M3.f81620g;
                    Intrinsics.checkNotNullExpressionValue(ivThree1, "ivThree1");
                    ViewExtKt.m66594y(ivThree1);
                    ImageView ivThree2 = c36907dM40114M3.f81621h;
                    Intrinsics.checkNotNullExpressionValue(ivThree2, "ivThree2");
                    ViewExtKt.m66594y(ivThree2);
                } else {
                    BaseTextView baseTextView8 = c36907dM40114M3.f81634u;
                    int i16 = R$string.margin_close_out_repay_debt_only;
                    CurrencyBalance currencyBalance22 = this.f33764l0;
                    baseTextView8.setText(getString(i16, C27041f.m66668h(currencyBalance22 != null ? currencyBalance22.getCurrencyName() : null)));
                    ImageView ivThree3 = c36907dM40114M3.f81620g;
                    Intrinsics.checkNotNullExpressionValue(ivThree3, "ivThree1");
                    ViewExtKt.m66594y(ivThree3);
                    ImageView ivThree4 = c36907dM40114M3.f81621h;
                    Intrinsics.checkNotNullExpressionValue(ivThree4, "ivThree2");
                    ViewExtKt.m66577h(ivThree4);
                }
            } else {
                CurrencyBalance currencyBalance23 = this.f33765m0;
                if (C41014a.m89922G(currencyBalance23 != null ? C46897a.m103299k(currencyBalance23) : null, null, 1, null).compareTo(bigDecimal) > 0) {
                    BaseTextView baseTextView9 = c36907dM40114M3.f81634u;
                    int i17 = R$string.margin_close_out_repay_debt_only;
                    CurrencyBalance currencyBalance24 = this.f33765m0;
                    baseTextView9.setText(getString(i17, C27041f.m66668h(currencyBalance24 != null ? currencyBalance24.getCurrencyName() : null)));
                    ImageView ivThree5 = c36907dM40114M3.f81620g;
                    Intrinsics.checkNotNullExpressionValue(ivThree5, "ivThree1");
                    ViewExtKt.m66577h(ivThree5);
                    ImageView ivThree6 = c36907dM40114M3.f81621h;
                    Intrinsics.checkNotNullExpressionValue(ivThree6, "ivThree2");
                    ViewExtKt.m66594y(ivThree6);
                } else {
                    c36907dM40114M3.f81634u.setText("");
                    ImageView ivThree7 = c36907dM40114M3.f81620g;
                    Intrinsics.checkNotNullExpressionValue(ivThree7, "ivThree1");
                    ViewExtKt.m66577h(ivThree7);
                    ImageView ivThree8 = c36907dM40114M3.f81621h;
                    Intrinsics.checkNotNullExpressionValue(ivThree8, "ivThree2");
                    ViewExtKt.m66577h(ivThree8);
                }
            }
            c36907dM40114M3.f81627n.m54743f(R$id.rb_one);
            KcPrimaryButton confirm = c36907dM40114M3.f81616c;
            Intrinsics.checkNotNullExpressionValue(confirm, "confirm");
            C27046k.m66711z(confirm, 0L, new Function0() { // from class: com.kubi.margin.trade.dialog.w
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginClosePositionDialog.m40106W3(this.f33857b, c36907dM40114M3);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: T3 */
    public static final InterfaceC46305f m40104T3() {
        return (InterfaceC46305f) C42597a.m93386b().create(InterfaceC46305f.class);
    }

    /* JADX INFO: renamed from: V3 */
    public static final InterfaceC46307h m40105V3() {
        return (InterfaceC46307h) C42597a.m93386b().create(InterfaceC46307h.class);
    }

    /* JADX INFO: renamed from: X3 */
    public static final Unit m40107X3(MarginClosePositionDialog marginClosePositionDialog) {
        marginClosePositionDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y3 */
    public static final MarginIsolatedPositionFragment m40108Y3(MarginClosePositionDialog marginClosePositionDialog) {
        Fragment parentFragment = marginClosePositionDialog.getParentFragment();
        Intrinsics.checkNotNull(parentFragment, "null cannot be cast to non-null type com.kubi.margin.trade.position.MarginIsolatedPositionFragment");
        return (MarginIsolatedPositionFragment) parentFragment;
    }

    /* JADX INFO: renamed from: U3 */
    public final BaseMarginFragment m40119U3() {
        return m40117Q3().m40512z4();
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment
    public void dismiss() {
        super.dismiss();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            KeyboardUtils.m6033e(activity);
        }
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m54250y3(0);
        m54249x3(0.7f);
    }
}
