package com.kubi.assets.margin.cross;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.blankj.utilcode.util.C5258a;
import com.kubi.assets.C11351z0;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.UrlConstant;
import com.kubi.assets.entity.AssetV2OverviewEntity;
import com.kubi.assets.margin.AssetV2MarginFragment;
import com.kubi.assets.margin.view.MarginPnlHeaderView;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.assets.view.AccountInfoHeaderView;
import com.kubi.assets.view.C11273q;
import com.kubi.assets.view.VerticalIconTextBtn;
import com.kubi.margin.api.IMarginService;
import com.kubi.margin.api.entity.LeverBalance;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.router.core.Router;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import f00.C37304a;
import g00.InterfaceC37756h;
import g00.InterfaceC37766r;
import gf.C37885i;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p311hf.C38184b;
import p402kf.C41014a;
import p569qq.C43852m;
import p637ta.C44898x5;
import p804yo.AbstractC46554a;
import p804yo.InterfaceC46555b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import rs.AbstractC44173c;
import rs.C44172b;
import w00.C45682f;

/* JADX INFO: compiled from: AssetV2CrossHeaderView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fJ\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J\b\u0010\u001e\u001a\u00020\u0015H\u0002R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/kubi/assets/databinding/ViewCrossAssetsHeaderBinding;", "getBinding", "()Lcom/kubi/assets/databinding/ViewCrossAssetsHeaderBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "fragment", "Lcom/kubi/assets/margin/cross/AssetV2CrossFragment;", "getFragment", "()Lcom/kubi/assets/margin/cross/AssetV2CrossFragment;", "setFragment", "(Lcom/kubi/assets/margin/cross/AssetV2CrossFragment;)V", "bindFragment", "", "assetV2CrossFragment", "getAccountInfoHeader", "Lcom/kubi/assets/view/AccountInfoHeaderView;", "getPnlViewHeader", "Lcom/kubi/assets/margin/view/MarginPnlHeaderView;", "bindInfo2View", "asset", "Lcom/kubi/assets/entity/AssetV2OverviewEntity;", "initListener", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nAssetV2CrossHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetV2CrossHeaderView.kt\ncom/kubi/assets/margin/cross/AssetV2CrossHeaderView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,186:1\n52#2:187\n80#2,7:188\n*S KotlinDebug\n*F\n+ 1 AssetV2CrossHeaderView.kt\ncom/kubi/assets/margin/cross/AssetV2CrossHeaderView\n*L\n57#1:187\n57#1:188,7\n*E\n"})
public final class AssetV2CrossHeaderView extends FrameLayout {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ KProperty<Object>[] f17996d = {Reflection.property1(new PropertyReference1Impl(AssetV2CrossHeaderView.class, "binding", "getBinding()Lcom/kubi/assets/databinding/ViewCrossAssetsHeaderBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f17997b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public AssetV2CrossFragment f17998c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetV2CrossHeaderView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f17997b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C44898x5>() { // from class: com.kubi.assets.margin.cross.AssetV2CrossHeaderView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44898x5 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C44898x5.m99320a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.view_cross_assets_header, this);
    }

    private final C44898x5 getBinding() {
        return (C44898x5) this.f17997b.getValue(this, f17996d[0]);
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m17846l() {
        IMarginService.f32724a.get().mo37953p0(InterfaceC46555b.a.f104307a, AbstractC46554a.a.f104306b, null, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m17849o() {
        C43852m.m96591c("B4crossMarginAccount", "revenueStatistics", null, null, 12, null);
        if (C11351z0.m20196k()) {
            Router.f46192a.m56184f(C11351z0.m20186a() + C11351z0.m20189d()).m4048k();
        } else {
            C37304a c37304a = C37304a.f82764a;
            String strDecode = Uri.decode(UrlConstant.f16608a.m15461d());
            Intrinsics.checkNotNullExpressionValue(strDecode, "decode(...)");
            InterfaceC37766r.a.m85190a(c37304a, strDecode, null, null, null, null, null, null, 126, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m17850q() {
        C43852m.m96591c("B4crossMarginAccount", "transfer", "1", null, 8, null);
        AssetsHelper.m19139N(AssetsHelper.f18684a, null, "MARGIN", C43852m.m96602n("B4crossMarginAccount", "transfer", null, 4, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m17851r(AssetV2CrossHeaderView assetV2CrossHeaderView) {
        C43852m.m96591c("B4crossMarginAccount", "isolatedMargin", "1", null, 8, null);
        AssetV2CrossFragment assetV2CrossFragment = assetV2CrossHeaderView.f17998c;
        Fragment parentFragment = assetV2CrossFragment != null ? assetV2CrossFragment.getParentFragment() : null;
        AssetV2MarginFragment assetV2MarginFragment = parentFragment instanceof AssetV2MarginFragment ? (AssetV2MarginFragment) parentFragment : null;
        if (assetV2MarginFragment != null) {
            assetV2MarginFragment.m17794I3();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m17852s() {
        InterfaceC37756h.a.m85143a(C37304a.f82764a, 0L, null, null, null, null, null, 62, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m17853t() {
        C43852m.m96591c("B4crossMarginAccount", "borrowButton", "1", null, 8, null);
        C37304a c37304a = C37304a.f82764a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("BTC-");
        C38184b c38184b = C38184b.f85884a;
        sb2.append(c38184b.m86146a());
        InterfaceC37756h.a.m85144b(c37304a, c38184b.m86146a(), sb2.toString(), "borrow", "cross", C43852m.m96601m("B4crossMarginAccount", "borrowButton", "1"), null, null, 96, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m17854u() {
        C43852m.m96591c("B4crossMarginAccount", "repayButton", "1", null, 8, null);
        InterfaceC37756h.a.m85143a(C37304a.f82764a, 0L, null, null, C43852m.m96601m("B4crossMarginAccount", "repayButton", "1"), null, null, 54, null);
        return Unit.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: getFragment, reason: from getter */
    public final AssetV2CrossFragment getF17998c() {
        return this.f17998c;
    }

    /* JADX INFO: renamed from: j */
    public final void m17855j(@NotNull AssetV2CrossFragment assetV2CrossFragment) {
        AccountInfoHeaderView accountInfoHeaderView;
        Intrinsics.checkNotNullParameter(assetV2CrossFragment, "assetV2CrossFragment");
        this.f17998c = assetV2CrossFragment;
        C44898x5 binding = getBinding();
        if (binding != null && (accountInfoHeaderView = binding.f101142b) != null) {
            accountInfoHeaderView.mo19955d(assetV2CrossFragment, "B4crossMarginAccount");
        }
        m17857p();
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: k */
    public final void m17856k(@NotNull AssetV2OverviewEntity asset) {
        MarginPnlHeaderView marginPnlHeaderView;
        MarginPnlHeaderView marginPnlHeaderView2;
        ImageView imageView;
        ShowHideTextView showHideTextView;
        ShowHideTextView showHideTextView2;
        TextView textViewM97383c;
        AccountInfoHeaderView accountInfoHeaderView;
        ShowHideTextView showHideTextView3;
        BigDecimal totalLiability;
        ShowHideTextView showHideTextView4;
        TextView textViewM97383c2;
        BigDecimal totalLiability2;
        AccountInfoHeaderView accountInfoHeaderView2;
        BigDecimal totalBalance;
        BigDecimal totalBalance2;
        Intrinsics.checkNotNullParameter(asset, "asset");
        LeverBalance crossMarginAsset = asset.getCrossMarginAsset();
        if (crossMarginAsset != null) {
            crossMarginAsset.setValuableCurrency(asset.getBaseCurrency());
        }
        C44898x5 binding = getBinding();
        if (binding != null && (accountInfoHeaderView2 = binding.f101142b) != null) {
            accountInfoHeaderView2.m19942B(asset, C27041f.m66669i((crossMarginAsset == null || (totalBalance2 = crossMarginAsset.getTotalBalance()) == null) ? null : C37885i.m85562a(totalBalance2, asset.getBaseCurrency(), C11273q.m20046b(asset.getBaseCurrency())), "--"), C27041f.m66669i((crossMarginAsset == null || (totalBalance = crossMarginAsset.getTotalBalance()) == null) ? null : C41014a.m89950x(C41014a.m89940n(totalBalance, asset.getBaseCurrency()), null, null, 0, false, true, false, true, 47, null), "--"));
        }
        C44898x5 binding2 = getBinding();
        if (binding2 != null && (showHideTextView4 = binding2.f101153m) != null && (textViewM97383c2 = C44172b.m97383c(showHideTextView4, new AbstractC44173c.a(0, false, 3, null), false, 2, null)) != null) {
            textViewM97383c2.setText(C27041f.m66669i((crossMarginAsset == null || (totalLiability2 = crossMarginAsset.getTotalLiability()) == null) ? null : C37885i.m85562a(totalLiability2, asset.getBaseCurrency(), C11273q.m20046b(asset.getBaseCurrency())), "--"));
        }
        C44898x5 binding3 = getBinding();
        if (binding3 != null && (showHideTextView3 = binding3.f101152l) != null) {
            showHideTextView3.setText(C27041f.m66669i((crossMarginAsset == null || (totalLiability = crossMarginAsset.getTotalLiability()) == null) ? null : C41014a.m89950x(C41014a.m89939m(totalLiability.doubleValue(), asset.getBaseCurrency()), null, null, 0, false, true, false, true, 47, null), "--"));
        }
        AssetsDepend assetsDepend = AssetsDepend.f18689a;
        IMarginService iMarginServiceM19183d = assetsDepend.m19183d();
        C44898x5 binding4 = getBinding();
        ViewGroup viewGroupM19952Y = (binding4 == null || (accountInfoHeaderView = binding4.f101142b) == null) ? null : accountInfoHeaderView.m19952Y();
        AssetV2CrossFragment assetV2CrossFragment = this.f17998c;
        Intrinsics.checkNotNull(assetV2CrossFragment);
        String strM66668h = C27041f.m66668h(crossMarginAsset != null ? crossMarginAsset.getStatus() : null);
        double dM66647g = C27039d.m66647g(crossMarginAsset != null ? crossMarginAsset.getLiabilityRate() : null);
        String strM66668h2 = C27041f.m66668h(assetsDepend.m19183d().mo37923W());
        BigDecimal bigDecimalMo37963u0 = assetsDepend.m19183d().mo37963u0(false, "");
        BigDecimal bigDecimalMo37962u = assetsDepend.m19183d().mo37962u(false, "");
        AssetV2CrossFragment assetV2CrossFragment2 = this.f17998c;
        IMarginService.m37899R(iMarginServiceM19183d, viewGroupM19952Y, assetV2CrossFragment, strM66668h, dM66647g, strM66668h2, null, bigDecimalMo37963u0, bigDecimalMo37962u, false, assetV2CrossFragment2 != null ? assetV2CrossFragment2.m17835E3() : null, false, 1024, null);
        C44898x5 binding5 = getBinding();
        if (binding5 != null && (showHideTextView2 = binding5.f101156p) != null && (textViewM97383c = C44172b.m97383c(showHideTextView2, new AbstractC44173c.a(0, false, 3, null), false, 2, null)) != null) {
            textViewM97383c.setText(crossMarginAsset != null ? crossMarginAsset.getRealBalanceString(crossMarginAsset.getValuableCurrency(), C11273q.m20046b(crossMarginAsset.getValuableCurrency())) : null);
        }
        C44898x5 binding6 = getBinding();
        if (binding6 != null && (showHideTextView = binding6.f101155o) != null) {
            showHideTextView.setText(crossMarginAsset != null ? crossMarginAsset.getRealBalancePriceString() : null);
        }
        C44898x5 binding7 = getBinding();
        if (binding7 != null && (imageView = binding7.f101143c) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.assets.margin.cross.n
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetV2CrossHeaderView.m17846l();
                }
            }, 1, null);
        }
        C44898x5 binding8 = getBinding();
        if (binding8 != null && (marginPnlHeaderView2 = binding8.f101159s) != null) {
            marginPnlHeaderView2.setTitleClickListener(new Function0() { // from class: com.kubi.assets.margin.cross.o
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetV2CrossHeaderView.m17847m();
                }
            });
        }
        C44898x5 binding9 = getBinding();
        if (binding9 == null || (marginPnlHeaderView = binding9.f101159s) == null) {
            return;
        }
        marginPnlHeaderView.setPnlClickListener(new Function0() { // from class: com.kubi.assets.margin.cross.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetV2CrossHeaderView.m17849o();
            }
        });
    }

    public final void setFragment(@Nullable AssetV2CrossFragment assetV2CrossFragment) {
        this.f17998c = assetV2CrossFragment;
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m17847m() {
        FragmentActivity fragmentActivity;
        Activity activityM6125h = C5258a.m6125h();
        if (activityM6125h instanceof FragmentActivity) {
            fragmentActivity = (FragmentActivity) activityM6125h;
        } else {
            fragmentActivity = null;
        }
        if (fragmentActivity != null) {
            AlertDialogFragmentHelper alertDialogFragmentHelperM54162S4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.analysis_todays_pnl).m54156M4(C27017c.f54310a.m66516f(R$string.margin_pnl_tips, AssetsDepend.f18689a.m19189j().d0().getBalanceCurrency())).m54162S4(R$string.already_know, new DialogInterface.OnClickListener() { // from class: com.kubi.assets.margin.cross.q
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    AssetV2CrossHeaderView.m17848n(dialogInterface, i11);
                }
            });
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            alertDialogFragmentHelperM54162S4.show(supportFragmentManager, "MarginPnlHeaderView");
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final AccountInfoHeaderView getAccountInfoHeader() {
        C44898x5 binding = getBinding();
        if (binding != null) {
            return binding.f101142b;
        }
        return null;
    }

    @Nullable
    public final MarginPnlHeaderView getPnlViewHeader() {
        C44898x5 binding = getBinding();
        if (binding != null) {
            return binding.f101159s;
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final void m17857p() {
        VerticalIconTextBtn verticalIconTextBtn;
        VerticalIconTextBtn verticalIconTextBtn2;
        VerticalIconTextBtn verticalIconTextBtn3;
        LinearLayout linearLayout;
        BaseTextView baseTextView;
        C44898x5 binding = getBinding();
        if (binding != null && (baseTextView = binding.f101149i) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.assets.margin.cross.r
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetV2CrossHeaderView.m17851r(this.f18026b);
                }
            }, 1, null);
        }
        C44898x5 binding2 = getBinding();
        if (binding2 != null && (linearLayout = binding2.f101146f) != null) {
            C27046k.m66711z(linearLayout, 0L, new Function0() { // from class: com.kubi.assets.margin.cross.s
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetV2CrossHeaderView.m17852s();
                }
            }, 1, null);
        }
        C44898x5 binding3 = getBinding();
        if (binding3 != null && (verticalIconTextBtn3 = binding3.f101150j) != null) {
            C27046k.m66711z(verticalIconTextBtn3, 0L, new Function0() { // from class: com.kubi.assets.margin.cross.t
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetV2CrossHeaderView.m17853t();
                }
            }, 1, null);
        }
        C44898x5 binding4 = getBinding();
        if (binding4 != null && (verticalIconTextBtn2 = binding4.f101157q) != null) {
            C27046k.m66711z(verticalIconTextBtn2, 0L, new Function0() { // from class: com.kubi.assets.margin.cross.u
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetV2CrossHeaderView.m17854u();
                }
            }, 1, null);
        }
        C44898x5 binding5 = getBinding();
        if (binding5 != null && (verticalIconTextBtn = binding5.f101158r) != null) {
            C27046k.m66711z(verticalIconTextBtn, 0L, new Function0() { // from class: com.kubi.assets.margin.cross.v
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetV2CrossHeaderView.m17850q();
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: n */
    public static final void m17848n(DialogInterface dialogInterface, int i11) {
    }
}
