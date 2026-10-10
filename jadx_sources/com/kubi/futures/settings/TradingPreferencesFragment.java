package com.kubi.futures.settings;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.text.BidiFormatter;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.extractor.text.ttml.TtmlNode;
import bi.C4614f;
import com.blankj.utilcode.util.C5303w0;
import com.kubi.broker.BrokerConfig;
import com.kubi.event.api.C12572a;
import com.kubi.futures.FuturesDisplayNameUtils;
import com.kubi.futures.settings.vm.TradingPreferenceViewModel;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.platform.model.ContractRiskLimitEntity;
import com.kubi.kumex.data.trade.model.AutoDepositStatus;
import com.kubi.kumex.dialog.C15943u;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.kumex.utils.Persistence;
import com.kubi.kumex.utils.ViewExKt;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KcSwitchButton;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.FragmentResultListener;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27063n;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import dm.C36803m3;
import fm.C37567b;
import java.math.BigDecimal;
import kotlinx.coroutines.C41696j;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p569qq.C43852m;
import p801yl.C46527h0;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: TradingPreferencesFragment.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010%\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001bH\u0003J\b\u0010&\u001a\u00020#H\u0002J\u0018\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\u0019H\u0002J\u0018\u0010,\u001a\u00020#2\u0006\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\u0019H\u0002J\u0018\u0010-\u001a\u00020#2\u0006\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\u0019H\u0002J\u0010\u0010.\u001a\u00020#2\u0006\u0010/\u001a\u00020\u000eH\u0002J\u0010\u00100\u001a\u00020#2\u0006\u0010/\u001a\u00020\u000eH\u0002J\u0018\u00101\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001b2\u0006\u00102\u001a\u00020\u0014H\u0002J\u0018\u00103\u001a\u00020#2\u0006\u0010$\u001a\u0002042\u0006\u00102\u001a\u00020\u0014H\u0002J\u0010\u00105\u001a\u00020#2\u0006\u0010/\u001a\u00020\u000eH\u0002J\b\u00106\u001a\u00020#H\u0002J\u0010\u00107\u001a\u00020#2\u0006\u00108\u001a\u00020\u0014H\u0002J\u0010\u00109\u001a\u00020#2\u0006\u0010:\u001a\u00020;H\u0002J\u0010\u0010<\u001a\u00020#2\u0006\u0010=\u001a\u00020\u0005H\u0002J\u0010\u0010>\u001a\u00020#2\u0006\u0010?\u001a\u00020@H\u0003J\b\u0010A\u001a\u00020#H\u0002J\b\u0010C\u001a\u00020#H\u0002J\b\u0010D\u001a\u00020#H\u0002J\u0016\u0010E\u001a\u00020\u00192\u0006\u0010F\u001a\u0002042\u0006\u0010G\u001a\u00020\u001bJ\b\u0010H\u001a\u00020#H\u0016J\b\u0010I\u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001d\u0010\r\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0013\u0010\u0015R\u000e\u0010\u0017\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006J"}, m90084d2 = {"Lcom/kubi/futures/settings/TradingPreferencesFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "blockId", "", "symbol", "viewModel", "Lcom/kubi/futures/settings/vm/TradingPreferenceViewModel;", "getViewModel", "()Lcom/kubi/futures/settings/vm/TradingPreferenceViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexFragmentTradingPreferencesBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexFragmentTradingPreferencesBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "isTrial", "", "()Z", "isTrial$delegate", "isRetailUser", "currentPanelIndex", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initView", "showHedgeAutoMarginDialog", "currentBookIndex", "clickBook", "imageId", "textId", "currentKlineIndex", "clickKLine", "clickPanel", "initBookDirection", "binding", "initPanelSetting", "setBackgroundByChecked", "isChecked", "setTextColorByChecked", "Landroid/widget/TextView;", "initKLineDirection", "initObserver", "onFetchResultChanged", "isSuccess", "onHedgeAutoDepositStatus", "status", "Lcom/kubi/kumex/data/trade/model/AutoDepositStatus;", "setPositionMode", "positionMode", "setRiskLimit", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/kumex/data/platform/model/ContractRiskLimitEntity;", "showAutoDepositMargin", "titleY", "addScrollListener", "fetchAuUserCategory", "getBottomDistanceFromParentTop", "childView", "parentView", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "isHedgeMode", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradingPreferencesFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradingPreferencesFragment.kt\ncom/kubi/futures/settings/TradingPreferencesFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,631:1\n147#2,16:632\n13472#3,2:648\n13472#3,2:650\n13472#3,2:652\n13472#3,2:654\n13472#3,2:656\n13472#3,2:658\n*S KotlinDebug\n*F\n+ 1 TradingPreferencesFragment.kt\ncom/kubi/futures/settings/TradingPreferencesFragment\n*L\n79#1:632,16\n268#1:648,2\n275#1:650,2\n302#1:652,2\n309#1:654,2\n334#1:656,2\n341#1:658,2\n*E\n"})
public final class TradingPreferencesFragment extends BaseFragment {

    /* JADX INFO: renamed from: e0 */
    public static final /* synthetic */ KProperty<Object>[] f23224e0 = {Reflection.property1(new PropertyReference1Impl(TradingPreferencesFragment.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexFragmentTradingPreferencesBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final String f23225U;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final String f23226V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f23227W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC24293a f23228X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f23229Y;

    /* JADX INFO: renamed from: Z */
    public boolean f23230Z;

    /* JADX INFO: renamed from: a0 */
    public int f23231a0;

    /* JADX INFO: renamed from: b0 */
    public int f23232b0;

    /* JADX INFO: renamed from: c0 */
    public int f23233c0;

    /* JADX INFO: renamed from: d0 */
    public int f23234d0;

    /* JADX INFO: renamed from: com.kubi.futures.settings.TradingPreferencesFragment$a */
    /* JADX INFO: compiled from: TradingPreferencesFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/futures/settings/TradingPreferencesFragment$addScrollListener$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class ViewTreeObserverOnGlobalLayoutListenerC13272a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C36803m3 f23235b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ TradingPreferencesFragment f23236c;

        public ViewTreeObserverOnGlobalLayoutListenerC13272a(C36803m3 c36803m3, TradingPreferencesFragment tradingPreferencesFragment) {
            this.f23235b = c36803m3;
            this.f23236c = tradingPreferencesFragment;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f23235b.f80578J.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            TradingPreferencesFragment tradingPreferencesFragment = this.f23236c;
            BaseTextView tradingTitle = this.f23235b.f80578J;
            Intrinsics.checkNotNullExpressionValue(tradingTitle, "tradingTitle");
            NestedScrollView scrollView = this.f23235b.f80576H;
            Intrinsics.checkNotNullExpressionValue(scrollView, "scrollView");
            tradingPreferencesFragment.f23234d0 = tradingPreferencesFragment.m26161S3(tradingTitle, scrollView);
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.settings.TradingPreferencesFragment$b */
    /* JADX INFO: compiled from: TradingPreferencesFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/futures/settings/TradingPreferencesFragment$initObserver$6", "Lcom/kubi/sdk/FragmentResultListener;", "onFragmentResult", "", DbParams.KEY_CHANNEL_RESULT, "Landroid/os/Bundle;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13273b implements FragmentResultListener {
        public C13273b() {
        }

        @Override // com.kubi.sdk.FragmentResultListener
        /* JADX INFO: renamed from: a */
        public void mo26171a(Bundle result) {
            Intrinsics.checkNotNullParameter(result, "result");
            String string = result.getString("data_1");
            if (string != null) {
                TradingPreferencesFragment.this.m26163U3().m26416q().setValue(string);
                String name = C4614f.class.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                C12572a.m23695d(name, new C4614f(string), 0L, 4, null);
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.settings.TradingPreferencesFragment$c */
    /* JADX INFO: compiled from: TradingPreferencesFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/futures/settings/TradingPreferencesFragment$initObserver$7", "Lcom/kubi/sdk/FragmentResultListener;", "onFragmentResult", "", DbParams.KEY_CHANNEL_RESULT, "Landroid/os/Bundle;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13274c implements FragmentResultListener {
        public C13274c() {
        }

        @Override // com.kubi.sdk.FragmentResultListener
        /* JADX INFO: renamed from: a */
        public void mo26171a(Bundle result) {
            Intrinsics.checkNotNullParameter(result, "result");
            if (Intrinsics.areEqual(result.getString("symbol"), TradingPreferencesFragment.this.f23226V)) {
                boolean z11 = result.getBoolean("data_1");
                boolean z12 = result.getBoolean("data_2");
                AutoDepositStatus value = TradingPreferencesFragment.this.m26163U3().m26413n().getValue();
                TradingPreferencesFragment.this.m26163U3().m26413n().setValue(AutoDepositStatus.copy$default(value == null ? new AutoDepositStatus(null, null, null, 7, null) : value, Boolean.valueOf(z11), Boolean.valueOf(z12), null, 4, null));
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.settings.TradingPreferencesFragment$d */
    /* JADX INFO: compiled from: TradingPreferencesFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13275d implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f23239b;

        public C13275d(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f23239b = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p852kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f23239b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f23239b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: x4 */
    public static final void m26150x4(TradingPreferencesFragment tradingPreferencesFragment, View view) {
        BaseFragment.showLoadingView$default(tradingPreferencesFragment, 0, 0, 3, null);
        tradingPreferencesFragment.m26163U3().m26411f(tradingPreferencesFragment.f23226V, tradingPreferencesFragment.m26098E0());
    }

    /* JADX INFO: renamed from: W3 */
    public final void m26165W3(C36803m3 c36803m3) {
        int iM66765c = C27063n.m66765c("k_panel_position", 0, 1, null);
        this.f23233c0 = iM66765c;
        if (iM66765c == 1) {
            AppCompatImageView ivChartBottom = c36803m3.f80611n;
            Intrinsics.checkNotNullExpressionValue(ivChartBottom, "ivChartBottom");
            m26170z4(ivChartBottom, true);
            BaseTextView ivChartBottomDesc = c36803m3.f80612o;
            Intrinsics.checkNotNullExpressionValue(ivChartBottomDesc, "ivChartBottomDesc");
            m26155C4(ivChartBottomDesc, true);
            return;
        }
        if (iM66765c != 2) {
            AppCompatImageView ivChartTop = c36803m3.f80615r;
            Intrinsics.checkNotNullExpressionValue(ivChartTop, "ivChartTop");
            m26170z4(ivChartTop, true);
            BaseTextView ivChartTopDesc = c36803m3.f80616s;
            Intrinsics.checkNotNullExpressionValue(ivChartTopDesc, "ivChartTopDesc");
            m26155C4(ivChartTopDesc, true);
            return;
        }
        AppCompatImageView ivChartHide = c36803m3.f80613p;
        Intrinsics.checkNotNullExpressionValue(ivChartHide, "ivChartHide");
        m26170z4(ivChartHide, true);
        BaseTextView ivChartHideDesc = c36803m3.f80614q;
        Intrinsics.checkNotNullExpressionValue(ivChartHideDesc, "ivChartHideDesc");
        m26155C4(ivChartHideDesc, true);
    }

    /* JADX INFO: renamed from: u4 */
    public final boolean m26167u4() {
        return false;
    }

    /* JADX INFO: renamed from: E0 */
    private final boolean m26098E0() {
        return ((Boolean) this.f23229Y.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: G4 */
    public static final TradingPreferenceViewModel m26103G4(TradingPreferencesFragment tradingPreferencesFragment) {
        return (TradingPreferenceViewModel) new ViewModelProvider(tradingPreferencesFragment).get(TradingPreferenceViewModel.class);
    }

    /* JADX INFO: renamed from: N3 */
    public static final void m26110N3(TradingPreferencesFragment tradingPreferencesFragment, NestedScrollView nestedScrollView, int i11, int i12, int i13, int i14) {
        if (i12 > tradingPreferencesFragment.f23234d0) {
            tradingPreferencesFragment.getTitleBar().setTitle(tradingPreferencesFragment.getString(R$string.kumex_trading_perferences));
        } else {
            tradingPreferencesFragment.getTitleBar().setTitle("");
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: e4 */
    private final void m26118e4(View view) {
        final C36803m3 c36803m3M26162T3 = m26162T3();
        if (c36803m3M26162T3 == null) {
            return;
        }
        BrokerConfig brokerConfig = BrokerConfig.f19211a;
        if (brokerConfig.m20201d().mo20237Y0() && brokerConfig.m20201d().mo20222A0()) {
            Group isolatedGroup = c36803m3M26162T3.f80605h;
            Intrinsics.checkNotNullExpressionValue(isolatedGroup, "isolatedGroup");
            ViewExtKt.m66594y(isolatedGroup);
        } else {
            Group isolatedGroup2 = c36803m3M26162T3.f80605h;
            Intrinsics.checkNotNullExpressionValue(isolatedGroup2, "isolatedGroup");
            ViewExtKt.m66577h(isolatedGroup2);
        }
        if (brokerConfig.m20201d().mo20225G0()) {
            BaseTextView tvNotification = c36803m3M26162T3.f80589U;
            Intrinsics.checkNotNullExpressionValue(tvNotification, "tvNotification");
            ViewExtKt.m66594y(tvNotification);
            AppCompatImageView ivNotification = c36803m3M26162T3.f80617t;
            Intrinsics.checkNotNullExpressionValue(ivNotification, "ivNotification");
            ViewExtKt.m66594y(ivNotification);
        } else {
            BaseTextView tvNotification2 = c36803m3M26162T3.f80589U;
            Intrinsics.checkNotNullExpressionValue(tvNotification2, "tvNotification");
            ViewExtKt.m66577h(tvNotification2);
            AppCompatImageView ivNotification2 = c36803m3M26162T3.f80617t;
            Intrinsics.checkNotNullExpressionValue(ivNotification2, "ivNotification");
            ViewExtKt.m66577h(ivNotification2);
        }
        m26164V3(c36803m3M26162T3);
        m26165W3(c36803m3M26162T3);
        m26166d4(c36803m3M26162T3);
        BaseTextView baseTextView = c36803m3M26162T3.f80602e;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getStringRes(R$string.kumex_current_contract, new Object[0]));
        sb2.append(" (");
        BidiFormatter bidiFormatter = BidiFormatter.getInstance();
        ContractEntity contractEntityM102673I = C46527h0.f104291a.m102673I();
        sb2.append((Object) bidiFormatter.unicodeWrap(C27041f.m66667g(contractEntityM102673I != null ? FuturesDisplayNameUtils.f22525a.m24440e(contractEntityM102673I) : null, getStringRes(R$string.stub, new Object[0]))));
        sb2.append(')');
        baseTextView.setText(sb2.toString());
        BaseTextView tvNotification3 = c36803m3M26162T3.f80589U;
        Intrinsics.checkNotNullExpressionValue(tvNotification3, "tvNotification");
        C27046k.m66711z(tvNotification3, 0L, new Function0() { // from class: com.kubi.futures.settings.c5
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradingPreferencesFragment.m26134o4(this.f23304b);
            }
        }, 1, null);
        BaseTextView tvPositionFeature = c36803m3M26162T3.f80592X;
        Intrinsics.checkNotNullExpressionValue(tvPositionFeature, "tvPositionFeature");
        C27046k.m66711z(tvPositionFeature, 0L, new Function0() { // from class: com.kubi.futures.settings.x5
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradingPreferencesFragment.m26136p4(this.f23576b);
            }
        }, 1, null);
        BaseTextView tvOrder = c36803m3M26162T3.f80590V;
        Intrinsics.checkNotNullExpressionValue(tvOrder, "tvOrder");
        C27046k.m66711z(tvOrder, 0L, new Function0() { // from class: com.kubi.futures.settings.y5
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradingPreferencesFragment.m26138q4(this.f23584b);
            }
        }, 1, null);
        BaseTextView tvSecondConfirm = c36803m3M26162T3.f80600c0;
        Intrinsics.checkNotNullExpressionValue(tvSecondConfirm, "tvSecondConfirm");
        C27046k.m66711z(tvSecondConfirm, 0L, new Function0() { // from class: com.kubi.futures.settings.z5
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradingPreferencesFragment.m26140r4(this.f23592b);
            }
        }, 1, null);
        View riskLimit = c36803m3M26162T3.f80575G;
        Intrinsics.checkNotNullExpressionValue(riskLimit, "riskLimit");
        C27046k.m66711z(riskLimit, 0L, new Function0() { // from class: com.kubi.futures.settings.a6
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradingPreferencesFragment.m26142s4(this.f23285b);
            }
        }, 1, null);
        KcSwitchButton switchMargin = c36803m3M26162T3.f80577I;
        Intrinsics.checkNotNullExpressionValue(switchMargin, "switchMargin");
        ViewExKt.m36487m(switchMargin, new Function1() { // from class: com.kubi.futures.settings.d5
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradingPreferencesFragment.m26144t4(this.f23315b, c36803m3M26162T3, (SwitchCompat) obj);
            }
        });
        BaseTextView tvPositionMode = c36803m3M26162T3.f80593Y;
        Intrinsics.checkNotNullExpressionValue(tvPositionMode, "tvPositionMode");
        C27046k.m66711z(tvPositionMode, 0L, new Function0() { // from class: com.kubi.futures.settings.e5
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradingPreferencesFragment.m26119f4(this.f23325b);
            }
        }, 1, null);
        BaseTextView tvHedgeAutoMarginValue = c36803m3M26162T3.f80587S;
        Intrinsics.checkNotNullExpressionValue(tvHedgeAutoMarginValue, "tvHedgeAutoMarginValue");
        C27046k.m66711z(tvHedgeAutoMarginValue, 0L, new Function0() { // from class: com.kubi.futures.settings.f5
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradingPreferencesFragment.m26120g4(this.f23335b);
            }
        }, 1, null);
        AppCompatImageView ivBookLeft = c36803m3M26162T3.f80607j;
        Intrinsics.checkNotNullExpressionValue(ivBookLeft, "ivBookLeft");
        BaseTextView ivBookLeftDesc = c36803m3M26162T3.f80608k;
        Intrinsics.checkNotNullExpressionValue(ivBookLeftDesc, "ivBookLeftDesc");
        C27046k.m66681D(new View[]{ivBookLeft, ivBookLeftDesc}, new Function0() { // from class: com.kubi.futures.settings.g5
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradingPreferencesFragment.m26121h4(this.f23343b);
            }
        });
        AppCompatImageView ivBookRight = c36803m3M26162T3.f80609l;
        Intrinsics.checkNotNullExpressionValue(ivBookRight, "ivBookRight");
        BaseTextView ivBookRightDesc = c36803m3M26162T3.f80610m;
        Intrinsics.checkNotNullExpressionValue(ivBookRightDesc, "ivBookRightDesc");
        C27046k.m66681D(new View[]{ivBookRight, ivBookRightDesc}, new Function0() { // from class: com.kubi.futures.settings.h5
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradingPreferencesFragment.m26122i4(this.f23351b);
            }
        });
        AppCompatImageView ivChartTop = c36803m3M26162T3.f80615r;
        Intrinsics.checkNotNullExpressionValue(ivChartTop, "ivChartTop");
        BaseTextView ivChartTopDesc = c36803m3M26162T3.f80616s;
        Intrinsics.checkNotNullExpressionValue(ivChartTopDesc, "ivChartTopDesc");
        C27046k.m66681D(new View[]{ivChartTop, ivChartTopDesc}, new Function0() { // from class: com.kubi.futures.settings.n5
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradingPreferencesFragment.m26124j4(this.f23405b);
            }
        });
        AppCompatImageView ivChartBottom = c36803m3M26162T3.f80611n;
        Intrinsics.checkNotNullExpressionValue(ivChartBottom, "ivChartBottom");
        BaseTextView ivChartBottomDesc = c36803m3M26162T3.f80612o;
        Intrinsics.checkNotNullExpressionValue(ivChartBottomDesc, "ivChartBottomDesc");
        C27046k.m66681D(new View[]{ivChartBottom, ivChartBottomDesc}, new Function0() { // from class: com.kubi.futures.settings.t5
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradingPreferencesFragment.m26126k4(this.f23458b);
            }
        });
        AppCompatImageView ivChartHide = c36803m3M26162T3.f80613p;
        Intrinsics.checkNotNullExpressionValue(ivChartHide, "ivChartHide");
        BaseTextView ivChartHideDesc = c36803m3M26162T3.f80614q;
        Intrinsics.checkNotNullExpressionValue(ivChartHideDesc, "ivChartHideDesc");
        C27046k.m66681D(new View[]{ivChartHide, ivChartHideDesc}, new Function0() { // from class: com.kubi.futures.settings.u5
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradingPreferencesFragment.m26128l4(this.f23467b);
            }
        });
        AppCompatImageView ivPanelTogether = c36803m3M26162T3.f80621x;
        Intrinsics.checkNotNullExpressionValue(ivPanelTogether, "ivPanelTogether");
        BaseTextView ivPanelTogetherDesc = c36803m3M26162T3.f80622y;
        Intrinsics.checkNotNullExpressionValue(ivPanelTogetherDesc, "ivPanelTogetherDesc");
        C27046k.m66681D(new View[]{ivPanelTogether, ivPanelTogetherDesc}, new Function0() { // from class: com.kubi.futures.settings.v5
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradingPreferencesFragment.m26130m4(this.f23476b);
            }
        });
        AppCompatImageView ivPanelSplit = c36803m3M26162T3.f80619v;
        Intrinsics.checkNotNullExpressionValue(ivPanelSplit, "ivPanelSplit");
        BaseTextView ivPanelSplitDesc = c36803m3M26162T3.f80620w;
        Intrinsics.checkNotNullExpressionValue(ivPanelSplitDesc, "ivPanelSplitDesc");
        C27046k.m66681D(new View[]{ivPanelSplit, ivPanelSplitDesc}, new Function0() { // from class: com.kubi.futures.settings.w5
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradingPreferencesFragment.m26132n4(this.f23567b);
            }
        });
        ConstraintLayout clPanel = c36803m3M26162T3.f80601d;
        Intrinsics.checkNotNullExpressionValue(clPanel, "clPanel");
        C27046k.m66684G(clPanel, true ^ m26167u4());
    }

    /* JADX INFO: renamed from: h4 */
    public static final Unit m26121h4(TradingPreferencesFragment tradingPreferencesFragment) {
        tradingPreferencesFragment.m26158O3(R$id.iv_book_left, R$id.iv_book_left_desc);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i4 */
    public static final Unit m26122i4(TradingPreferencesFragment tradingPreferencesFragment) {
        tradingPreferencesFragment.m26158O3(R$id.iv_book_right, R$id.iv_book_right_desc);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j4 */
    public static final Unit m26124j4(TradingPreferencesFragment tradingPreferencesFragment) {
        tradingPreferencesFragment.m26159P3(R$id.iv_chart_top, R$id.iv_chart_top_desc);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k4 */
    public static final Unit m26126k4(TradingPreferencesFragment tradingPreferencesFragment) {
        tradingPreferencesFragment.m26159P3(R$id.iv_chart_bottom, R$id.iv_chart_bottom_desc);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l4 */
    public static final Unit m26128l4(TradingPreferencesFragment tradingPreferencesFragment) {
        tradingPreferencesFragment.m26159P3(R$id.iv_chart_hide, R$id.iv_chart_hide_desc);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m4 */
    public static final Unit m26130m4(TradingPreferencesFragment tradingPreferencesFragment) {
        tradingPreferencesFragment.m26160Q3(R$id.iv_panel_together, R$id.iv_panel_together_desc);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n4 */
    public static final Unit m26132n4(TradingPreferencesFragment tradingPreferencesFragment) {
        tradingPreferencesFragment.m26160Q3(R$id.iv_panel_split, R$id.iv_panel_split_desc);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t4 */
    public static final Unit m26144t4(TradingPreferencesFragment tradingPreferencesFragment, C36803m3 c36803m3, SwitchCompat it) {
        Intrinsics.checkNotNullParameter(it, "it");
        tradingPreferencesFragment.m26156D4();
        C43852m.m96590b(C17060n0.m36552b(), tradingPreferencesFragment.f23225U, "6", TuplesKt.m90091to("status", c36803m3.f80577I.isChecked() ? "close" : TtmlNode.TEXT_EMPHASIS_MARK_OPEN));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C4 */
    public final void m26155C4(TextView textView, boolean z11) {
        textView.setTextColor(z11 ? C27017c.f54310a.m66512a(R$color.c_text) : C27017c.f54310a.m66512a(R$color.c_text40));
    }

    /* JADX INFO: renamed from: O3 */
    public final void m26158O3(int i11, int i12) {
        Integer[] numArr = {Integer.valueOf(R$id.iv_book_left), Integer.valueOf(R$id.iv_book_right)};
        Integer[] numArr2 = {Integer.valueOf(R$id.iv_book_left_desc), Integer.valueOf(R$id.iv_book_right_desc)};
        int iIndexOf = ArraysKt.indexOf(numArr, Integer.valueOf(i11));
        if (iIndexOf < 0 || this.f23232b0 == iIndexOf) {
            return;
        }
        this.f23232b0 = iIndexOf;
        for (int i13 = 0; i13 < 2; i13++) {
            int iIntValue = numArr[i13].intValue();
            if (iIntValue == i11) {
                View viewFindViewById = findViewById(iIntValue);
                if (viewFindViewById != null) {
                    viewFindViewById.setBackgroundResource(R$drawable.shape_border_emphasis_8r);
                }
            } else {
                View viewFindViewById2 = findViewById(iIntValue);
                if (viewFindViewById2 != null) {
                    viewFindViewById2.setBackgroundResource(R$drawable.shape_border_emphasis8_8r);
                }
            }
        }
        for (int i14 = 0; i14 < 2; i14++) {
            int iIntValue2 = numArr2[i14].intValue();
            if (iIntValue2 == i12) {
                TextView textView = (TextView) findViewById(iIntValue2);
                if (textView != null) {
                    textView.setTextColor(C27017c.f54310a.m66512a(R$color.c_text));
                }
            } else {
                TextView textView2 = (TextView) findViewById(iIntValue2);
                if (textView2 != null) {
                    textView2.setTextColor(C27017c.f54310a.m66512a(R$color.c_text40));
                }
            }
        }
        C27063n.m66770h(iIndexOf, "trade_panel_position");
        C43852m.m96591c(C17060n0.m36552b(), "MorePreferencesLayoutBook", String.valueOf(iIndexOf + 1), null, 8, null);
    }

    /* JADX INFO: renamed from: P3 */
    public final void m26159P3(int i11, int i12) {
        Integer[] numArr = {Integer.valueOf(R$id.iv_chart_top), Integer.valueOf(R$id.iv_chart_bottom), Integer.valueOf(R$id.iv_chart_hide)};
        Integer[] numArr2 = {Integer.valueOf(R$id.iv_chart_top_desc), Integer.valueOf(R$id.iv_chart_bottom_desc), Integer.valueOf(R$id.iv_chart_hide_desc)};
        int iIndexOf = ArraysKt.indexOf(numArr, Integer.valueOf(i11));
        if (iIndexOf == this.f23233c0) {
            return;
        }
        this.f23233c0 = iIndexOf;
        for (int i13 = 0; i13 < 3; i13++) {
            int iIntValue = numArr[i13].intValue();
            if (iIntValue == i11) {
                View viewFindViewById = findViewById(iIntValue);
                if (viewFindViewById != null) {
                    viewFindViewById.setBackgroundResource(R$drawable.shape_border_emphasis_8r);
                }
            } else {
                View viewFindViewById2 = findViewById(iIntValue);
                if (viewFindViewById2 != null) {
                    viewFindViewById2.setBackgroundResource(R$drawable.shape_border_emphasis8_8r);
                }
            }
        }
        for (int i14 = 0; i14 < 3; i14++) {
            int iIntValue2 = numArr2[i14].intValue();
            if (iIntValue2 == i12) {
                TextView textView = (TextView) findViewById(iIntValue2);
                if (textView != null) {
                    textView.setTextColor(C27017c.f54310a.m66512a(R$color.c_text));
                }
            } else {
                TextView textView2 = (TextView) findViewById(iIntValue2);
                if (textView2 != null) {
                    textView2.setTextColor(C27017c.f54310a.m66512a(R$color.c_text40));
                }
            }
        }
        C27063n.m66770h(iIndexOf, "k_panel_position");
        C43852m.m96591c(C17060n0.m36552b(), "MorePreferencesLayoutChart", String.valueOf(iIndexOf + 1), null, 8, null);
    }

    /* JADX INFO: renamed from: Q3 */
    public final void m26160Q3(int i11, int i12) {
        Integer[] numArr = {Integer.valueOf(R$id.iv_panel_together), Integer.valueOf(R$id.iv_panel_split)};
        Integer[] numArr2 = {Integer.valueOf(R$id.iv_panel_together_desc), Integer.valueOf(R$id.iv_panel_split_desc)};
        int iIndexOf = ArraysKt.indexOf(numArr, Integer.valueOf(i11));
        if (iIndexOf < 0 || this.f23231a0 == iIndexOf) {
            return;
        }
        this.f23231a0 = iIndexOf;
        for (int i13 = 0; i13 < 2; i13++) {
            int iIntValue = numArr[i13].intValue();
            if (iIntValue == i11) {
                View viewFindViewById = findViewById(iIntValue);
                if (viewFindViewById != null) {
                    viewFindViewById.setBackgroundResource(R$drawable.shape_border_emphasis_8r);
                }
            } else {
                View viewFindViewById2 = findViewById(iIntValue);
                if (viewFindViewById2 != null) {
                    viewFindViewById2.setBackgroundResource(R$drawable.shape_border_emphasis8_8r);
                }
            }
        }
        for (int i14 = 0; i14 < 2; i14++) {
            int iIntValue2 = numArr2[i14].intValue();
            if (iIntValue2 == i12) {
                TextView textView = (TextView) findViewById(iIntValue2);
                if (textView != null) {
                    textView.setTextColor(C27017c.f54310a.m66512a(R$color.c_text));
                }
            } else {
                TextView textView2 = (TextView) findViewById(iIntValue2);
                if (textView2 != null) {
                    textView2.setTextColor(C27017c.f54310a.m66512a(R$color.c_text40));
                }
            }
        }
        Persistence.f30799a.m36520g("panel_long_short_type", iIndexOf);
        C43852m.m96591c(C17060n0.m36552b(), this.f23225U, i11 == R$id.iv_panel_together ? "9" : "8", null, 8, null);
    }

    /* JADX INFO: renamed from: S3 */
    public final int m26161S3(@NotNull TextView childView, @NotNull View parentView) {
        Intrinsics.checkNotNullParameter(childView, "childView");
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        childView.getLocationInWindow(iArr);
        parentView.getLocationInWindow(iArr2);
        Paint.FontMetrics fontMetrics = childView.getPaint().getFontMetrics();
        return (iArr[1] + ((int) (fontMetrics.descent - fontMetrics.ascent))) - iArr2[1];
    }

    /* JADX INFO: renamed from: T3 */
    public final C36803m3 m26162T3() {
        return (C36803m3) this.f23228X.getValue(this, f23224e0[0]);
    }

    /* JADX INFO: renamed from: U3 */
    public final TradingPreferenceViewModel m26163U3() {
        return (TradingPreferenceViewModel) this.f23227W.getValue();
    }

    /* JADX INFO: renamed from: d4 */
    public final void m26166d4(C36803m3 c36803m3) {
        int iM36517c = Persistence.f30799a.m36517c("panel_long_short_type", 1);
        this.f23231a0 = iM36517c;
        boolean z11 = iM36517c == 0;
        AppCompatImageView ivPanelTogether = c36803m3.f80621x;
        Intrinsics.checkNotNullExpressionValue(ivPanelTogether, "ivPanelTogether");
        m26170z4(ivPanelTogether, z11);
        BaseTextView ivPanelTogetherDesc = c36803m3.f80622y;
        Intrinsics.checkNotNullExpressionValue(ivPanelTogetherDesc, "ivPanelTogetherDesc");
        m26155C4(ivPanelTogetherDesc, z11);
        AppCompatImageView ivPanelSplit = c36803m3.f80619v;
        Intrinsics.checkNotNullExpressionValue(ivPanelSplit, "ivPanelSplit");
        m26170z4(ivPanelSplit, !z11);
        BaseTextView ivPanelSplitDesc = c36803m3.f80620w;
        Intrinsics.checkNotNullExpressionValue(ivPanelSplitDesc, "ivPanelSplitDesc");
        m26155C4(ivPanelSplitDesc, !z11);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_fragment_trading_preferences, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m26111R3();
        BaseFragment.showLoadingView$default(this, 0, 0, 3, null);
        m26118e4(view);
        m26112X3();
        m26109M3();
        C43852m.m96595g(C17060n0.m36552b(), this.f23225U, null, null, 12, null);
    }

    /* JADX INFO: renamed from: w4 */
    public final void m26168w4(boolean z11) {
        if (z11) {
            showContentView();
        } else {
            BaseFragment.showFailView$default(this, 0, 0, new View.OnClickListener() { // from class: com.kubi.futures.settings.r5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TradingPreferencesFragment.m26150x4(this.f23438b, view);
                }
            }, 3, (Object) null);
        }
    }

    /* JADX INFO: renamed from: z4 */
    public final void m26170z4(View view, boolean z11) {
        view.setBackgroundResource(z11 ? R$drawable.shape_border_emphasis_8r : R$drawable.shape_border_emphasis8_8r);
    }

    public TradingPreferencesFragment() {
        setPageId(C17060n0.m36552b());
        this.f23225U = "MorePreferences";
        this.f23226V = C46527h0.f104291a.m102677L();
        this.f23227W = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.i5
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradingPreferencesFragment.m26103G4(this.f23361b);
            }
        });
        this.f23228X = C45681e.m100799e(this, new Function1<TradingPreferencesFragment, C36803m3>() { // from class: com.kubi.futures.settings.TradingPreferencesFragment$special$$inlined$viewBindingFragment$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C36803m3 invoke(@NotNull TradingPreferencesFragment fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                return C36803m3.m82467a(this.this$0.getContentView());
            }

            {
                super(1);
            }
        }, new Function1<C36803m3, Unit>() { // from class: com.kubi.futures.settings.TradingPreferencesFragment$special$$inlined$viewBindingFragment$1
            public final void invoke(@NotNull C36803m3 it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C36803m3 c36803m3) {
                invoke(c36803m3);
                return Unit.INSTANCE;
            }
        });
        this.f23229Y = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.j5
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(TradingPreferencesFragment.m26147v4(this.f23368b));
            }
        });
    }

    /* JADX INFO: renamed from: E4 */
    public static final Unit m26100E4(TradingPreferencesFragment tradingPreferencesFragment, boolean z11) {
        tradingPreferencesFragment.m26163U3().m26419t(tradingPreferencesFragment.m26098E0(), C27041f.m66668h(tradingPreferencesFragment.f23226V), z11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M3 */
    private final void m26109M3() {
        C36803m3 c36803m3M26162T3 = m26162T3();
        if (c36803m3M26162T3 == null) {
            return;
        }
        c36803m3M26162T3.f80578J.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC13272a(c36803m3M26162T3, this));
        c36803m3M26162T3.f80576H.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() { // from class: com.kubi.futures.settings.k5
            @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
            public final void onScrollChange(NestedScrollView nestedScrollView, int i11, int i12, int i13, int i14) {
                TradingPreferencesFragment.m26110N3(this.f23377a, nestedScrollView, i11, i12, i13, i14);
            }
        });
    }

    /* JADX INFO: renamed from: R3 */
    private final void m26111R3() {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TradingPreferencesFragment$fetchAuUserCategory$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: X3 */
    private final void m26112X3() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        m26163U3().m26417r().observe(viewLifecycleOwner, new C13275d(new Function1() { // from class: com.kubi.futures.settings.l5
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradingPreferencesFragment.m26113Y3(this.f23386b, (ContractRiskLimitEntity) obj);
            }
        }));
        m26163U3().m26416q().observe(viewLifecycleOwner, new C13275d(new Function1() { // from class: com.kubi.futures.settings.m5
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradingPreferencesFragment.m26114Z3(this.f23394b, (String) obj);
            }
        }));
        m26163U3().m26413n().observe(viewLifecycleOwner, new C13275d(new Function1() { // from class: com.kubi.futures.settings.o5
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradingPreferencesFragment.m26115a4(this.f23415b, (AutoDepositStatus) obj);
            }
        }));
        m26163U3().m26414o().observe(viewLifecycleOwner, new C13275d(new Function1() { // from class: com.kubi.futures.settings.p5
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradingPreferencesFragment.m26116b4(this.f23423b, (Boolean) obj);
            }
        }));
        m26163U3().m26415p().observe(viewLifecycleOwner, new C13275d(new Function1() { // from class: com.kubi.futures.settings.q5
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradingPreferencesFragment.m26117c4(this.f23430b, (Boolean) obj);
            }
        }));
        String name = ModifyPositionModeDialog.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        setFragmentResultListener(name, new C13273b());
        String name2 = HedgeAutoDepositDialog.class.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
        setFragmentResultListener(name2, new C13274c());
    }

    /* JADX INFO: renamed from: Y3 */
    public static final Unit m26113Y3(TradingPreferencesFragment tradingPreferencesFragment, ContractRiskLimitEntity contractRiskLimitEntity) {
        Intrinsics.checkNotNull(contractRiskLimitEntity);
        tradingPreferencesFragment.m26154B4(contractRiskLimitEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z3 */
    public static final Unit m26114Z3(TradingPreferencesFragment tradingPreferencesFragment, String str) {
        Intrinsics.checkNotNull(str);
        tradingPreferencesFragment.m26153A4(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a4 */
    public static final Unit m26115a4(TradingPreferencesFragment tradingPreferencesFragment, AutoDepositStatus autoDepositStatus) {
        Intrinsics.checkNotNull(autoDepositStatus);
        tradingPreferencesFragment.m26169y4(autoDepositStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b4 */
    public static final Unit m26116b4(TradingPreferencesFragment tradingPreferencesFragment, Boolean bool) {
        Intrinsics.checkNotNull(bool);
        tradingPreferencesFragment.m26168w4(bool.booleanValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c4 */
    public static final Unit m26117c4(TradingPreferencesFragment tradingPreferencesFragment, Boolean bool) {
        Group group;
        C36803m3 c36803m3M26162T3 = tradingPreferencesFragment.m26162T3();
        if (c36803m3M26162T3 != null && (group = c36803m3M26162T3.f80574F) != null) {
            Intrinsics.checkNotNull(bool);
            C27046k.m66684G(group, bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f4 */
    public static final Unit m26119f4(TradingPreferencesFragment tradingPreferencesFragment) {
        String value = tradingPreferencesFragment.m26163U3().m26416q().getValue();
        if (value == null) {
            return Unit.INSTANCE;
        }
        C43852m.m96591c(C17060n0.m36552b(), tradingPreferencesFragment.f23225U, TUIConstants.TUICustomerServicePlugin.BUSINESS_ID_SRC_CUSTOMER_SERVICE_SAY_HELLO, null, 8, null);
        ModifyPositionModeDialog.Companion companion = ModifyPositionModeDialog.f23179u0;
        FragmentManager childFragmentManager = tradingPreferencesFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        companion.show(childFragmentManager, value, tradingPreferencesFragment.m26098E0());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g4 */
    public static final Unit m26120g4(TradingPreferencesFragment tradingPreferencesFragment) {
        tradingPreferencesFragment.m26157F4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o4 */
    public static final Unit m26134o4(TradingPreferencesFragment tradingPreferencesFragment) {
        C43852m.m96591c(C17060n0.m36552b(), tradingPreferencesFragment.f23225U, "1", null, 8, null);
        BaseActivity.Companion companion = BaseActivity.INSTANCE;
        Context contextRequireContext = tradingPreferencesFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        BaseActivity.Companion.launch$default(companion, contextRequireContext, TradingNotificationFragment.class, null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p4 */
    public static final Unit m26136p4(TradingPreferencesFragment tradingPreferencesFragment) {
        C43852m.m96591c(C17060n0.m36552b(), tradingPreferencesFragment.f23225U, "2", null, 8, null);
        BaseActivity.Companion companion = BaseActivity.INSTANCE;
        Context contextRequireContext = tradingPreferencesFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        BaseActivity.Companion.launch$default(companion, contextRequireContext, TradingPositionFeatureFragment.class, null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q4 */
    public static final Unit m26138q4(TradingPreferencesFragment tradingPreferencesFragment) {
        C43852m.m96591c(C17060n0.m36552b(), tradingPreferencesFragment.f23225U, "3", null, 8, null);
        BaseActivity.Companion companion = BaseActivity.INSTANCE;
        Context contextRequireContext = tradingPreferencesFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        BaseActivity.Companion.launch$default(companion, contextRequireContext, TradingOrderFeatureFragment.class, null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r4 */
    public static final Unit m26140r4(TradingPreferencesFragment tradingPreferencesFragment) {
        C43852m.m96591c(C17060n0.m36552b(), tradingPreferencesFragment.f23225U, "4", null, 8, null);
        BaseActivity.Companion companion = BaseActivity.INSTANCE;
        Context contextRequireContext = tradingPreferencesFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        BaseActivity.Companion.launch$default(companion, contextRequireContext, TradingConfirmAgainFragment.class, null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s4 */
    public static final Unit m26142s4(TradingPreferencesFragment tradingPreferencesFragment) {
        C43852m.m96591c(C17060n0.m36552b(), tradingPreferencesFragment.f23225U, "5", null, 8, null);
        BaseActivity.Companion companion = BaseActivity.INSTANCE;
        Context contextRequireContext = tradingPreferencesFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Bundle bundle = new Bundle();
        bundle.putString("from", "trading_preferences");
        bundle.putString("data", C27041f.m66669i(tradingPreferencesFragment.m26163U3().m26412l().getValue(), SharedPositionInfo.MARGIN_MODE_ISOLATED));
        bundle.putBoolean("data_1", tradingPreferencesFragment.m26098E0());
        bundle.putBoolean("data_2", tradingPreferencesFragment.f23230Z);
        Unit unit = Unit.INSTANCE;
        companion.launch(contextRequireContext, SettingRiskLimitFragment.class, bundle);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v4 */
    public static final boolean m26147v4(TradingPreferencesFragment tradingPreferencesFragment) {
        Boolean boolValueOf;
        Bundle arguments = tradingPreferencesFragment.getArguments();
        if (arguments != null) {
            boolValueOf = Boolean.valueOf(arguments.getBoolean("data"));
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }

    /* JADX INFO: renamed from: A4 */
    public final void m26153A4(String str) {
        C36803m3 c36803m3M26162T3 = m26162T3();
        if (c36803m3M26162T3 != null) {
            if (Intrinsics.areEqual(str, "HEDGE")) {
                c36803m3M26162T3.f80594Z.setText(C27017c.f54310a.m66516f(R$string.kumex_position_mode_hedge, new Object[0]));
                ConstraintLayout clPanel = c36803m3M26162T3.f80601d;
                Intrinsics.checkNotNullExpressionValue(clPanel, "clPanel");
                ViewExtKt.m66577h(clPanel);
                View line3 = c36803m3M26162T3.f80572D;
                Intrinsics.checkNotNullExpressionValue(line3, "line3");
                C27046k.m66703r(line3);
            } else {
                c36803m3M26162T3.f80594Z.setText(C27017c.f54310a.m66516f(R$string.kumex_position_mode_oneway, new Object[0]));
                ConstraintLayout clPanel2 = c36803m3M26162T3.f80601d;
                Intrinsics.checkNotNullExpressionValue(clPanel2, "clPanel");
                C27046k.m66685H(clPanel2);
                View line4 = c36803m3M26162T3.f80572D;
                Intrinsics.checkNotNullExpressionValue(line4, "line3");
                C27046k.m66685H(line4);
            }
            AutoDepositStatus value = m26163U3().m26413n().getValue();
            if (value != null) {
                m26169y4(value);
            }
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: B4 */
    public final void m26154B4(ContractRiskLimitEntity contractRiskLimitEntity) {
        C36803m3 c36803m3M26162T3 = m26162T3();
        if (c36803m3M26162T3 == null || !Intrinsics.areEqual(contractRiskLimitEntity.getSymbol(), this.f23226V) || !m26163U3().m26418s()) {
            return;
        }
        BaseTextView tvRiskLimitValue = c36803m3M26162T3.f80598b0;
        Intrinsics.checkNotNullExpressionValue(tvRiskLimitValue, "tvRiskLimitValue");
        C27046k.m66685H(tvRiskLimitValue);
        BigDecimal bigDecimalM66656p = C27039d.m66656p(contractRiskLimitEntity.getMaxRiskLimit());
        C46527h0 c46527h0 = C46527h0.f104291a;
        tvRiskLimitValue.setText(C42828b.m93906g(C42180b.m92640e(bigDecimalM66656p, null, C37567b.m84623m(c46527h0.m102673I()), true, true, true, 0, null, 97, null), C27041f.m66668h(C37567b.m84620j(c46527h0.m102673I())), true, false, 4, null));
    }

    /* JADX INFO: renamed from: D4 */
    public final void m26156D4() {
        Boolean boolValueOf;
        KcSwitchButton kcSwitchButton;
        C36803m3 c36803m3M26162T3 = m26162T3();
        if (c36803m3M26162T3 != null && (kcSwitchButton = c36803m3M26162T3.f80577I) != null) {
            boolValueOf = Boolean.valueOf(kcSwitchButton.isChecked());
        } else {
            boolValueOf = null;
        }
        final boolean z11 = !C27025c.m66566d(boolValueOf);
        if (C13392j.m26326m()) {
            BaseDialogFragment baseDialogFragmentM33701t = C15943u.m33701t(z11, null, new Function0() { // from class: com.kubi.futures.settings.s5
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradingPreferencesFragment.m26100E4(this.f23446b, z11);
                }
            }, 2, null);
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            baseDialogFragmentM33701t.show(childFragmentManager, "auto_ensure_dialog");
            return;
        }
        m26163U3().m26419t(m26098E0(), C27041f.m66668h(this.f23226V), z11);
    }

    /* JADX INFO: renamed from: F4 */
    public final void m26157F4() {
        AutoDepositStatus value = m26163U3().m26413n().getValue();
        if (value == null) {
            return;
        }
        HedgeAutoDepositDialog.Companion companion = HedgeAutoDepositDialog.f23146w0;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        companion.show(childFragmentManager, this.f23226V, m26098E0(), C27025c.m66566d(value.getLONG()), C27025c.m66566d(value.getSHORT()));
    }

    /* JADX INFO: renamed from: V3 */
    public final void m26164V3(C36803m3 c36803m3) {
        int i11;
        int i12;
        boolean z11;
        if (C5303w0.m6511a()) {
            i11 = R$string.on_right;
        } else {
            i11 = R$string.on_left;
        }
        String string = getString(i11);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        if (C5303w0.m6511a()) {
            i12 = R$string.on_left;
        } else {
            i12 = R$string.on_right;
        }
        String string2 = getString(i12);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        c36803m3.f80608k.setText(string);
        c36803m3.f80610m.setText(string2);
        int iM66764b = C27063n.m66764b("trade_panel_position", 1);
        this.f23232b0 = iM66764b;
        if (iM66764b == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        AppCompatImageView ivBookLeft = c36803m3.f80607j;
        Intrinsics.checkNotNullExpressionValue(ivBookLeft, "ivBookLeft");
        m26170z4(ivBookLeft, z11);
        BaseTextView ivBookLeftDesc = c36803m3.f80608k;
        Intrinsics.checkNotNullExpressionValue(ivBookLeftDesc, "ivBookLeftDesc");
        m26155C4(ivBookLeftDesc, z11);
        AppCompatImageView ivBookRight = c36803m3.f80609l;
        Intrinsics.checkNotNullExpressionValue(ivBookRight, "ivBookRight");
        m26170z4(ivBookRight, !z11);
        BaseTextView ivBookRightDesc = c36803m3.f80610m;
        Intrinsics.checkNotNullExpressionValue(ivBookRightDesc, "ivBookRightDesc");
        m26155C4(ivBookRightDesc, !z11);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        m26163U3().m26411f(this.f23226V, m26098E0());
    }

    /* JADX INFO: renamed from: y4 */
    public final void m26169y4(AutoDepositStatus autoDepositStatus) {
        String value;
        String string;
        C36803m3 c36803m3M26162T3 = m26162T3();
        if (c36803m3M26162T3 == null || (value = m26163U3().m26416q().getValue()) == null) {
            return;
        }
        if (Intrinsics.areEqual(value, "HEDGE")) {
            Group oneWayAutoMarginGroup = c36803m3M26162T3.f80573E;
            Intrinsics.checkNotNullExpressionValue(oneWayAutoMarginGroup, "oneWayAutoMarginGroup");
            ViewExtKt.m66577h(oneWayAutoMarginGroup);
            Group hedgeAutoMarginGroup = c36803m3M26162T3.f80604g;
            Intrinsics.checkNotNullExpressionValue(hedgeAutoMarginGroup, "hedgeAutoMarginGroup");
            C27046k.m66685H(hedgeAutoMarginGroup);
            if (C27025c.m66566d(autoDepositStatus.getLONG()) && C27025c.m66566d(autoDepositStatus.getSHORT())) {
                string = getString(R$string.kumex_hedge_auto_margin_all_open);
            } else if (C27025c.m66566d(autoDepositStatus.getLONG())) {
                string = getString(R$string.kumex_hedge_auto_margin_open_long);
            } else if (C27025c.m66566d(autoDepositStatus.getSHORT())) {
                string = getString(R$string.kumex_hedge_auto_margin_open_short);
            } else {
                string = getString(R$string.kumex_hedge_auto_margin_close);
            }
            Intrinsics.checkNotNull(string);
            c36803m3M26162T3.f80587S.setText(string);
            return;
        }
        Group oneWayAutoMarginGroup2 = c36803m3M26162T3.f80573E;
        Intrinsics.checkNotNullExpressionValue(oneWayAutoMarginGroup2, "oneWayAutoMarginGroup");
        C27046k.m66685H(oneWayAutoMarginGroup2);
        Group hedgeAutoMarginGroup2 = c36803m3M26162T3.f80604g;
        Intrinsics.checkNotNullExpressionValue(hedgeAutoMarginGroup2, "hedgeAutoMarginGroup");
        ViewExtKt.m66577h(hedgeAutoMarginGroup2);
        c36803m3M26162T3.f80577I.setChecked(C27025c.m66566d(autoDepositStatus.getBOTH()));
    }
}
