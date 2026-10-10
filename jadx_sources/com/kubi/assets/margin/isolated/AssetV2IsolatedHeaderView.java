package com.kubi.assets.margin.isolated;

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
import com.facebook.react.uimanager.ViewProps;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.C11351z0;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.UrlConstant;
import com.kubi.assets.entity.AssetV2OverviewEntity;
import com.kubi.assets.margin.AssetV2MarginFragment;
import com.kubi.assets.margin.view.MarginPnlHeaderView;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.assets.view.AccountInfoHeaderView;
import com.kubi.assets.view.C11273q;
import com.kubi.assets.view.VerticalIconTextBtn;
import com.kubi.margin.api.IMarginService;
import com.kubi.margin.api.entity.IsolateMarginPosition;
import com.kubi.mvi.common.MviExKt;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.router.core.Router;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.C27017c;
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
import p637ta.C44743c6;
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

/* JADX INFO: compiled from: AssetV2IsolatedHeaderView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fJ\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u000e\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 H\u0007J\b\u0010!\u001a\u00020\u0015H\u0002R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\""}, m90084d2 = {"Lcom/kubi/assets/margin/isolated/AssetV2IsolatedHeaderView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/kubi/assets/databinding/ViewIsolatedAssetsHeaderBinding;", "getBinding", "()Lcom/kubi/assets/databinding/ViewIsolatedAssetsHeaderBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "fragment", "Lcom/kubi/assets/margin/isolated/AssetV2IsolatedFragment;", "getFragment", "()Lcom/kubi/assets/margin/isolated/AssetV2IsolatedFragment;", "setFragment", "(Lcom/kubi/assets/margin/isolated/AssetV2IsolatedFragment;)V", "bindFragment", "", "assetV2IsolatedFragment", "getAccountInfoHeader", "Lcom/kubi/assets/view/AccountInfoHeaderView;", "getPnlViewHeader", "Lcom/kubi/assets/margin/view/MarginPnlHeaderView;", "updateCrossTabVisibility", ViewProps.HIDDEN, "", "bindInfo2View", "asset", "Lcom/kubi/assets/entity/AssetV2OverviewEntity;", "initListener", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nAssetV2IsolatedHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetV2IsolatedHeaderView.kt\ncom/kubi/assets/margin/isolated/AssetV2IsolatedHeaderView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,208:1\n52#2:209\n80#2,7:210\n*S KotlinDebug\n*F\n+ 1 AssetV2IsolatedHeaderView.kt\ncom/kubi/assets/margin/isolated/AssetV2IsolatedHeaderView\n*L\n63#1:209\n63#1:210,7\n*E\n"})
public final class AssetV2IsolatedHeaderView extends FrameLayout {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ KProperty<Object>[] f18045d = {Reflection.property1(new PropertyReference1Impl(AssetV2IsolatedHeaderView.class, "binding", "getBinding()Lcom/kubi/assets/databinding/ViewIsolatedAssetsHeaderBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f18046b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public AssetV2IsolatedFragment f18047c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetV2IsolatedHeaderView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f18046b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C44743c6>() { // from class: com.kubi.assets.margin.isolated.AssetV2IsolatedHeaderView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44743c6 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C44743c6.m98998a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.view_isolated_assets_header, this);
    }

    private final C44743c6 getBinding() {
        return (C44743c6) this.f18046b.getValue(this, f18045d[0]);
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m17950l() {
        IMarginService.f32724a.get().mo37953p0(InterfaceC46555b.b.f104310a, AbstractC46554a.a.f104306b, null, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m17953o() {
        C43852m.m96591c("B4isolatedMarginAccount", "revenueStatistics", null, null, 12, null);
        if (C11351z0.m20196k()) {
            Router.f46192a.m56184f(C11351z0.m20186a() + C11351z0.m20191f()).m4048k();
        } else {
            C37304a c37304a = C37304a.f82764a;
            String strDecode = Uri.decode(UrlConstant.f16608a.m15462e());
            Intrinsics.checkNotNullExpressionValue(strDecode, "decode(...)");
            InterfaceC37766r.a.m85190a(c37304a, strDecode, null, null, null, null, null, null, 126, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m17954q(AssetV2IsolatedHeaderView assetV2IsolatedHeaderView) {
        C43852m.m96591c("B4isolatedMarginAccount", "transfer", "1", null, 8, null);
        AssetV2IsolatedFragment assetV2IsolatedFragment = assetV2IsolatedHeaderView.f18047c;
        if (assetV2IsolatedFragment != null) {
            MviExKt.m42519o(assetV2IsolatedFragment, new AssetV2IsolatedHeaderView$initListener$5$1(null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m17955r(AssetV2IsolatedHeaderView assetV2IsolatedHeaderView) {
        C43852m.m96591c("B4isolatedMarginAccount", "crossMargin", "1", null, 8, null);
        AssetV2IsolatedFragment assetV2IsolatedFragment = assetV2IsolatedHeaderView.f18047c;
        Fragment parentFragment = assetV2IsolatedFragment != null ? assetV2IsolatedFragment.getParentFragment() : null;
        AssetV2MarginFragment assetV2MarginFragment = parentFragment instanceof AssetV2MarginFragment ? (AssetV2MarginFragment) parentFragment : null;
        if (assetV2MarginFragment != null) {
            assetV2MarginFragment.m17793H3();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m17956s() {
        InterfaceC37756h.a.m85143a(C37304a.f82764a, 1L, null, null, null, null, null, 62, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m17957t() {
        C43852m.m96591c("B4isolatedMarginAccount", "borrowButton", "1", null, 8, null);
        C37304a c37304a = C37304a.f82764a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("BTC-");
        C38184b c38184b = C38184b.f85884a;
        sb2.append(c38184b.m86146a());
        InterfaceC37756h.a.m85144b(c37304a, c38184b.m86146a(), sb2.toString(), "borrow", "isolated", C43852m.m96601m("B4isolatedMarginAccount", "borrowButton", "1"), null, null, 96, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m17958u() {
        C43852m.m96591c("B4isolatedMarginAccount", "repayButton", "1", null, 8, null);
        InterfaceC37756h.a.m85143a(C37304a.f82764a, 1L, null, null, C43852m.m96601m("B4isolatedMarginAccount", "repayButton", "1"), null, null, 54, null);
        return Unit.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: getFragment, reason: from getter */
    public final AssetV2IsolatedFragment getF18047c() {
        return this.f18047c;
    }

    /* JADX INFO: renamed from: j */
    public final void m17959j(@NotNull AssetV2IsolatedFragment assetV2IsolatedFragment) {
        AccountInfoHeaderView accountInfoHeaderView;
        Intrinsics.checkNotNullParameter(assetV2IsolatedFragment, "assetV2IsolatedFragment");
        this.f18047c = assetV2IsolatedFragment;
        C44743c6 binding = getBinding();
        if (binding != null && (accountInfoHeaderView = binding.f99698b) != null) {
            accountInfoHeaderView.mo19955d(assetV2IsolatedFragment, "B4isolatedMarginAccount");
        }
        m17961p();
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: k */
    public final void m17960k(@NotNull AssetV2OverviewEntity asset) {
        MarginPnlHeaderView marginPnlHeaderView;
        MarginPnlHeaderView marginPnlHeaderView2;
        ImageView imageView;
        ShowHideTextView showHideTextView;
        TextView textViewM97383c;
        ShowHideTextView showHideTextView2;
        BigDecimal totalLiability;
        ShowHideTextView showHideTextView3;
        TextView textViewM97383c2;
        BigDecimal totalLiability2;
        AccountInfoHeaderView accountInfoHeaderView;
        BigDecimal totalBalance;
        BigDecimal totalBalance2;
        Intrinsics.checkNotNullParameter(asset, "asset");
        IsolateMarginPosition isolatedMarginAsset = asset.getIsolatedMarginAsset();
        if (isolatedMarginAsset != null) {
            isolatedMarginAsset.setValuableCurrency(asset.getBaseCurrency());
        }
        if (isolatedMarginAsset != null) {
            isolatedMarginAsset.getRealBalancePriceString();
        }
        C44743c6 binding = getBinding();
        if (binding != null && (accountInfoHeaderView = binding.f99698b) != null) {
            accountInfoHeaderView.m19942B(asset, C27041f.m66669i((isolatedMarginAsset == null || (totalBalance2 = isolatedMarginAsset.getTotalBalance()) == null) ? null : C37885i.m85562a(totalBalance2, asset.getBaseCurrency(), C11273q.m20046b(asset.getBaseCurrency())), "--"), C27041f.m66669i((isolatedMarginAsset == null || (totalBalance = isolatedMarginAsset.getTotalBalance()) == null) ? null : C41014a.m89950x(C41014a.m89940n(totalBalance, asset.getBaseCurrency()), null, null, 0, false, true, false, true, 47, null), "--"));
        }
        C44743c6 binding2 = getBinding();
        if (binding2 != null && (showHideTextView3 = binding2.f99709m) != null && (textViewM97383c2 = C44172b.m97383c(showHideTextView3, new AbstractC44173c.a(0, false, 3, null), false, 2, null)) != null) {
            textViewM97383c2.setText(C27041f.m66669i((isolatedMarginAsset == null || (totalLiability2 = isolatedMarginAsset.getTotalLiability()) == null) ? null : C37885i.m85562a(totalLiability2, asset.getBaseCurrency(), C11273q.m20046b(asset.getBaseCurrency())), "--"));
        }
        C44743c6 binding3 = getBinding();
        if (binding3 != null && (showHideTextView2 = binding3.f99708l) != null) {
            showHideTextView2.setText(C27041f.m66669i((isolatedMarginAsset == null || (totalLiability = isolatedMarginAsset.getTotalLiability()) == null) ? null : C41014a.m89950x(C41014a.m89939m(totalLiability.doubleValue(), asset.getBaseCurrency()), null, null, 0, false, true, false, true, 47, null), "--"));
        }
        C44743c6 binding4 = getBinding();
        if (binding4 != null && (showHideTextView = binding4.f99712p) != null && (textViewM97383c = C44172b.m97383c(showHideTextView, new AbstractC44173c.a(0, false, 3, null), false, 2, null)) != null) {
            textViewM97383c.setText(isolatedMarginAsset != null ? isolatedMarginAsset.getRealBalanceString(isolatedMarginAsset.getValuableCurrency(), C11273q.m20046b(isolatedMarginAsset.getValuableCurrency())) : null);
        }
        C44743c6 binding5 = getBinding();
        if (binding5 != null && (imageView = binding5.f99699c) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.assets.margin.isolated.n
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetV2IsolatedHeaderView.m17950l();
                }
            }, 1, null);
        }
        C44743c6 binding6 = getBinding();
        if (binding6 != null && (marginPnlHeaderView2 = binding6.f99715s) != null) {
            marginPnlHeaderView2.setTitleClickListener(new Function0() { // from class: com.kubi.assets.margin.isolated.o
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetV2IsolatedHeaderView.m17951m();
                }
            });
        }
        C44743c6 binding7 = getBinding();
        if (binding7 == null || (marginPnlHeaderView = binding7.f99715s) == null) {
            return;
        }
        marginPnlHeaderView.setPnlClickListener(new Function0() { // from class: com.kubi.assets.margin.isolated.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetV2IsolatedHeaderView.m17953o();
            }
        });
    }

    public final void setFragment(@Nullable AssetV2IsolatedFragment assetV2IsolatedFragment) {
        this.f18047c = assetV2IsolatedFragment;
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m17951m() {
        FragmentActivity fragmentActivity;
        Activity activityM6125h = C5258a.m6125h();
        if (activityM6125h instanceof FragmentActivity) {
            fragmentActivity = (FragmentActivity) activityM6125h;
        } else {
            fragmentActivity = null;
        }
        if (fragmentActivity != null) {
            AlertDialogFragmentHelper alertDialogFragmentHelperM54162S4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.analysis_todays_pnl).m54156M4(C27017c.f54310a.m66516f(R$string.margin_pnl_tips, AssetsDepend.f18689a.m19189j().d0().getBalanceCurrency())).m54162S4(R$string.already_know, new DialogInterface.OnClickListener() { // from class: com.kubi.assets.margin.isolated.q
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    AssetV2IsolatedHeaderView.m17952n(dialogInterface, i11);
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
        C44743c6 binding = getBinding();
        if (binding != null) {
            return binding.f99698b;
        }
        return null;
    }

    @Nullable
    public final MarginPnlHeaderView getPnlViewHeader() {
        C44743c6 binding = getBinding();
        if (binding != null) {
            return binding.f99715s;
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final void m17961p() {
        VerticalIconTextBtn verticalIconTextBtn;
        VerticalIconTextBtn verticalIconTextBtn2;
        VerticalIconTextBtn verticalIconTextBtn3;
        LinearLayout linearLayout;
        BaseTextView baseTextView;
        C44743c6 binding = getBinding();
        if (binding != null && (baseTextView = binding.f99703g) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.assets.margin.isolated.r
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetV2IsolatedHeaderView.m17955r(this.f18098b);
                }
            }, 1, null);
        }
        C44743c6 binding2 = getBinding();
        if (binding2 != null && (linearLayout = binding2.f99702f) != null) {
            C27046k.m66711z(linearLayout, 0L, new Function0() { // from class: com.kubi.assets.margin.isolated.s
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetV2IsolatedHeaderView.m17956s();
                }
            }, 1, null);
        }
        C44743c6 binding3 = getBinding();
        if (binding3 != null && (verticalIconTextBtn3 = binding3.f99706j) != null) {
            C27046k.m66711z(verticalIconTextBtn3, 0L, new Function0() { // from class: com.kubi.assets.margin.isolated.t
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetV2IsolatedHeaderView.m17957t();
                }
            }, 1, null);
        }
        C44743c6 binding4 = getBinding();
        if (binding4 != null && (verticalIconTextBtn2 = binding4.f99713q) != null) {
            C27046k.m66711z(verticalIconTextBtn2, 0L, new Function0() { // from class: com.kubi.assets.margin.isolated.u
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetV2IsolatedHeaderView.m17958u();
                }
            }, 1, null);
        }
        C44743c6 binding5 = getBinding();
        if (binding5 != null && (verticalIconTextBtn = binding5.f99714r) != null) {
            C27046k.m66711z(verticalIconTextBtn, 0L, new Function0() { // from class: com.kubi.assets.margin.isolated.v
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetV2IsolatedHeaderView.m17954q(this.f18099b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m17962v(boolean z11) {
        LinearLayout linearLayout;
        C44743c6 binding = getBinding();
        if (binding != null && (linearLayout = binding.f99704h) != null) {
            AssetExKt.m15138z(linearLayout, !z11);
        }
    }

    /* JADX INFO: renamed from: n */
    public static final void m17952n(DialogInterface dialogInterface, int i11) {
    }
}
