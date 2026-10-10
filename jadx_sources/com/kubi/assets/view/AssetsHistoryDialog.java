package com.kubi.assets.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.C9459a;
import com.kubi.assets.R$layout;
import com.kubi.assets.finance.EarnUrlConfig;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.assets.view.tab.TabManager;
import com.kubi.data.coin.AccountType;
import com.kubi.event.api.C12572a;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.resources.dialog.BaseBottomDialog;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.tradingbotkit.api.ITradingBotService;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37749a;
import g00.InterfaceC37752d;
import g00.InterfaceC37754f;
import g00.InterfaceC37756h;
import g00.InterfaceC37762n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p637ta.C44907z0;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: AssetsHistoryDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u0019H\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u0018\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001dH\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\""}, m90084d2 = {"Lcom/kubi/assets/view/AssetsHistoryDialog;", "Lcom/kubi/resources/dialog/BaseBottomDialog;", "<init>", "()V", "maxHeightRatio", "", "getMaxHeightRatio", "()F", "binding", "Lcom/kubi/assets/databinding/AssetHistoryDialogBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetHistoryDialogBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "isBottomSheet", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initViews", "getUrlTheme", "", "trackClick", TtmlNode.ANNOTATION_POSITION_AFTER, "type", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetsHistoryDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetsHistoryDialog.kt\ncom/kubi/assets/view/AssetsHistoryDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,180:1\n143#2,20:181\n*S KotlinDebug\n*F\n+ 1 AssetsHistoryDialog.kt\ncom/kubi/assets/view/AssetsHistoryDialog\n*L\n42#1:181,20\n*E\n"})
public final class AssetsHistoryDialog extends BaseBottomDialog {

    /* JADX INFO: renamed from: s0 */
    public final float f19086s0 = 0.9f;

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final InterfaceC24293a f19087t0 = C45681e.m100799e(this, new Function1<AssetsHistoryDialog, C44907z0>() { // from class: com.kubi.assets.view.AssetsHistoryDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44907z0 invoke(@NotNull AssetsHistoryDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44907z0.m99338a(fragment.requireView());
        }
    }, new Function1<C44907z0, Unit>() { // from class: com.kubi.assets.view.AssetsHistoryDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C44907z0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44907z0 c44907z0) {
            invoke(c44907z0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: v0 */
    public static final /* synthetic */ KProperty<Object>[] f19085v0 = {Reflection.property1(new PropertyReference1Impl(AssetsHistoryDialog.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetHistoryDialogBinding;", 0))};

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public static final Companion f19084u0 = new Companion(null);

    /* JADX INFO: compiled from: AssetsHistoryDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/assets/view/AssetsHistoryDialog$Companion;", "", "<init>", "()V", "ASSETS_HISTORY", "", "TRADE_ORDERS", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: E4 */
    public static final void m19979E4(AssetsHistoryDialog assetsHistoryDialog, View view) {
        if (AssetsHelper.f18684a.m19169m()) {
            return;
        }
        assetsHistoryDialog.m20008R4("Deposit", "assetsHistory");
        InterfaceC37749a.a.m85114i(C37304a.f82764a, null, 0L, null, null, null, 29, null);
        assetsHistoryDialog.dismiss();
    }

    /* JADX INFO: renamed from: F4 */
    public static final void m19980F4(AssetsHistoryDialog assetsHistoryDialog, View view) {
        if (AssetsHelper.f18684a.m19169m()) {
            return;
        }
        assetsHistoryDialog.m20008R4("CopyTrading", "tradeOrders");
        InterfaceC37754f.a.m85138j(C37304a.f82764a, "copyTrading", null, "copyTradingJump.myCopy", null, null, null, null, 122, null);
        assetsHistoryDialog.dismiss();
    }

    /* JADX INFO: renamed from: G4 */
    public static final void m19981G4(AssetsHistoryDialog assetsHistoryDialog, View view) {
        if (AssetsHelper.f18684a.m19169m()) {
            return;
        }
        assetsHistoryDialog.m20008R4("Finance", "tradeOrders");
        Router.f46192a.m56184f(EarnUrlConfig.f17409a.m16752b() + "?isBanner=1&loading=2&needLogin=true&type=0&appNeedLang=true&" + assetsHistoryDialog.m20007B4()).m4048k();
        assetsHistoryDialog.dismiss();
    }

    /* JADX INFO: renamed from: H4 */
    public static final void m19982H4(AssetsHistoryDialog assetsHistoryDialog, View view) {
        assetsHistoryDialog.m20008R4("Options", "tradeOrders");
        Router.f46192a.m56184f("krn/router?component=kucoin_options_rn&biz=options&entry=main&route=HistoryPage&appNeedLang=true&" + assetsHistoryDialog.m20007B4()).m4048k();
        assetsHistoryDialog.dismiss();
    }

    /* JADX INFO: renamed from: I4 */
    public static final void m19983I4(AssetsHistoryDialog assetsHistoryDialog, View view) {
        assetsHistoryDialog.m20008R4("Mining", "tradeOrders");
        C12572a.m23695d("event_asset_tab", "mining", 0L, 4, null);
        assetsHistoryDialog.dismiss();
    }

    /* JADX INFO: renamed from: J4 */
    public static final void m19984J4(AssetsHistoryDialog assetsHistoryDialog, View view) {
        if (AssetsHelper.f18684a.m19169m()) {
            return;
        }
        assetsHistoryDialog.m20008R4("Withdraw", "assetsHistory");
        InterfaceC37749a.a.m85114i(C37304a.f82764a, null, 1L, null, null, null, 29, null);
        assetsHistoryDialog.dismiss();
    }

    /* JADX INFO: renamed from: K4 */
    public static final void m19985K4(AssetsHistoryDialog assetsHistoryDialog, View view) {
        assetsHistoryDialog.m20008R4("Transfer", "assetsHistory");
        InterfaceC37749a.a.m85114i(C37304a.f82764a, null, 2L, null, null, null, 29, null);
        assetsHistoryDialog.dismiss();
    }

    /* JADX INFO: renamed from: L4 */
    public static final void m19986L4(AssetsHistoryDialog assetsHistoryDialog, View view) {
        assetsHistoryDialog.m20008R4("AccountTransfer", "assetsHistory");
        InterfaceC37749a.a.m85108c(C37304a.f82764a, null, null, null, 7, null);
        assetsHistoryDialog.dismiss();
    }

    /* JADX INFO: renamed from: M4 */
    public static final void m19987M4(AssetsHistoryDialog assetsHistoryDialog, View view) {
        assetsHistoryDialog.m20008R4(IQuoteFacadeService.Companion.TRADE_TYPE_SPOT, "tradeOrders");
        InterfaceC37762n.a.m85178b(C37304a.f82764a, 0L, 2L, null, null, null, null, 60, null);
        assetsHistoryDialog.dismiss();
    }

    /* JADX INFO: renamed from: N4 */
    public static final void m19988N4(AssetsHistoryDialog assetsHistoryDialog, View view) {
        assetsHistoryDialog.m20008R4("Futures", "tradeOrders");
        InterfaceC37752d.a.m85125d(C37304a.f82764a, null, 2L, null, null, null, null, null, 125, null);
        assetsHistoryDialog.dismiss();
    }

    /* JADX INFO: renamed from: O4 */
    public static final void m19989O4(AssetsHistoryDialog assetsHistoryDialog, View view) {
        assetsHistoryDialog.m20008R4("Cross", "tradeOrders");
        InterfaceC37756h.a.m85146d(C37304a.f82764a, "cross", 2L, null, null, null, null, null, null, 252, null);
        assetsHistoryDialog.dismiss();
    }

    /* JADX INFO: renamed from: P4 */
    public static final void m19990P4(AssetsHistoryDialog assetsHistoryDialog, View view) {
        assetsHistoryDialog.m20008R4("Isolate", "tradeOrders");
        InterfaceC37756h.a.m85146d(C37304a.f82764a, "isolated", 2L, null, null, null, null, null, null, 252, null);
        assetsHistoryDialog.dismiss();
    }

    /* JADX INFO: renamed from: Q4 */
    public static final void m19991Q4(AssetsHistoryDialog assetsHistoryDialog, View view) {
        if (AssetsHelper.f18684a.m19169m()) {
            return;
        }
        assetsHistoryDialog.m20008R4("Bot", "tradeOrders");
        ITradingBotService.f52126a.get().mo63678b();
        assetsHistoryDialog.dismiss();
    }

    /* JADX INFO: renamed from: A4 */
    public final C44907z0 m20006A4() {
        return (C44907z0) this.f19087t0.getValue(this, f19085v0[0]);
    }

    /* JADX INFO: renamed from: B4 */
    public final String m20007B4() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("theme=");
        sb2.append(DayNightThemeManager.f28592a.m33187l() ? "light" : "dark");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: R4 */
    public final void m20008R4(String str, String str2) {
        C43852m.m96590b("B1overview", "historyPopup", "1", TuplesKt.m90091to("after_click_element_value", str), TuplesKt.m90091to("type", str2), TuplesKt.m90091to("norm_version", "1"));
    }

    @Override // com.kubi.resources.dialog.BaseBottomDialog
    /* JADX INFO: renamed from: k4, reason: from getter */
    public float getF17737s0() {
        return this.f19086s0;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return getLayoutInflater().inflate(R$layout.asset_history_dialog, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m19977C4();
    }

    /* JADX INFO: renamed from: C4 */
    private final void m19977C4() {
        boolean z11;
        C44907z0 c44907z0M20006A4 = m20006A4();
        if (c44907z0M20006A4 != null) {
            c44907z0M20006A4.f101209c.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.view.z
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AssetsHistoryDialog.m19978D4(this.f19194b, view);
                }
            });
            c44907z0M20006A4.f101219m.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.view.i0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AssetsHistoryDialog.m19979E4(this.f19127b, view);
                }
            });
            c44907z0M20006A4.f101228v.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.view.j0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AssetsHistoryDialog.m19984J4(this.f19129b, view);
                }
            });
            c44907z0M20006A4.f101227u.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.view.k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AssetsHistoryDialog.m19985K4(this.f19131b, view);
                }
            });
            c44907z0M20006A4.f101216j.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.view.l0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AssetsHistoryDialog.m19986L4(this.f19133b, view);
                }
            });
            c44907z0M20006A4.f101225s.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.view.m0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AssetsHistoryDialog.m19987M4(this.f19135b, view);
                }
            });
            BaseTextView tvFutures = c44907z0M20006A4.f101221o;
            Intrinsics.checkNotNullExpressionValue(tvFutures, "tvFutures");
            AssetExKt.m15138z(tvFutures, C9459a.m15238a());
            c44907z0M20006A4.f101221o.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.view.a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AssetsHistoryDialog.m19988N4(this.f19115b, view);
                }
            });
            BaseTextView tvCrossMargin = c44907z0M20006A4.f101218l;
            Intrinsics.checkNotNullExpressionValue(tvCrossMargin, "tvCrossMargin");
            SiteVisibleConfigKey siteVisibleConfigKey = SiteVisibleConfigKey.Margin;
            AssetExKt.m15138z(tvCrossMargin, C24129b.m58030b(siteVisibleConfigKey));
            c44907z0M20006A4.f101218l.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.view.b0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AssetsHistoryDialog.m19989O4(this.f19116b, view);
                }
            });
            BaseTextView tvIsolateMargin = c44907z0M20006A4.f101222p;
            Intrinsics.checkNotNullExpressionValue(tvIsolateMargin, "tvIsolateMargin");
            AssetExKt.m15138z(tvIsolateMargin, C24129b.m58030b(siteVisibleConfigKey));
            c44907z0M20006A4.f101222p.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.view.c0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AssetsHistoryDialog.m19990P4(this.f19118b, view);
                }
            });
            BaseTextView tvTradingBot = c44907z0M20006A4.f101226t;
            Intrinsics.checkNotNullExpressionValue(tvTradingBot, "tvTradingBot");
            AssetExKt.m15138z(tvTradingBot, C24129b.m58030b(SiteVisibleConfigKey.TradingBot));
            c44907z0M20006A4.f101226t.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.view.d0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AssetsHistoryDialog.m19991Q4(this.f19120b, view);
                }
            });
            BaseTextView tvCopyTrading = c44907z0M20006A4.f101217k;
            Intrinsics.checkNotNullExpressionValue(tvCopyTrading, "tvCopyTrading");
            AssetExKt.m15138z(tvCopyTrading, C24129b.m58030b(SiteVisibleConfigKey.CopyTrading));
            c44907z0M20006A4.f101217k.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.view.e0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AssetsHistoryDialog.m19980F4(this.f19121b, view);
                }
            });
            BaseTextView tvFinance = c44907z0M20006A4.f101220n;
            Intrinsics.checkNotNullExpressionValue(tvFinance, "tvFinance");
            AssetExKt.m15138z(tvFinance, C24129b.m58030b(SiteVisibleConfigKey.Financing));
            c44907z0M20006A4.f101220n.setText(getString(AccountType.FINANCE.getNickNameRes()));
            c44907z0M20006A4.f101220n.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.view.f0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AssetsHistoryDialog.m19981G4(this.f19122b, view);
                }
            });
            BaseTextView tvOption = c44907z0M20006A4.f101224r;
            Intrinsics.checkNotNullExpressionValue(tvOption, "tvOption");
            AssetExKt.m15138z(tvOption, C24129b.m58030b(SiteVisibleConfigKey.Option));
            c44907z0M20006A4.f101224r.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.view.g0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AssetsHistoryDialog.m19982H4(this.f19123b, view);
                }
            });
            BaseTextView tvMining = c44907z0M20006A4.f101223q;
            Intrinsics.checkNotNullExpressionValue(tvMining, "tvMining");
            if (C24129b.m58030b(SiteVisibleConfigKey.CLOUD_MINING) && TabManager.f19165h.getContainsMiningFragment()) {
                z11 = true;
            } else {
                z11 = false;
            }
            AssetExKt.m15138z(tvMining, z11);
            c44907z0M20006A4.f101223q.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.view.h0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AssetsHistoryDialog.m19983I4(this.f19126b, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: D4 */
    public static final void m19978D4(AssetsHistoryDialog assetsHistoryDialog, View view) {
        assetsHistoryDialog.dismiss();
    }
}
