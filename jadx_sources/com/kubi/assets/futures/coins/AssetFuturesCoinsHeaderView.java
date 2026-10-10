package com.kubi.assets.futures.coins;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.C11351z0;
import com.kubi.assets.R$drawable;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.AssetV2OverviewEntity;
import com.kubi.assets.entity.EquityEntity;
import com.kubi.assets.entity.SpotAccountOverviewEntity;
import com.kubi.assets.margin.view.MarginPnlHeaderView;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.assets.view.AccountInfoHeaderView;
import com.kubi.assets.view.C11273q;
import com.kubi.event.api.C12572a;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.resources.InjectExpandableUIBehavior;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.AlertTipsTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KuCheckBox;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.core.Router;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.sdk.widget.shape.layout.ShapeLinearLayout;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import f00.C37304a;
import g00.InterfaceC37766r;
import gf.C37885i;
import java.math.BigDecimal;
import lb.C42153h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p294gz.C38057a;
import p402kf.C41014a;
import p569qq.C43852m;
import p637ta.C44727a6;
import p830zf.InterfaceC46804j;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;
import y70.C46392a;

/* JADX INFO: compiled from: AssetFuturesCoinsHeaderView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0012\u0010\u0014\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0011H\u0002J\u0015\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010\u001aJ\u0012\u0010\u001b\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/assets/futures/coins/AssetFuturesCoinsHeaderView;", "Landroid/widget/FrameLayout;", "fragment", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "(Lcom/kubi/sdk/base/ui/OldBaseFragment;)V", "getFragment", "()Lcom/kubi/sdk/base/ui/OldBaseFragment;", "binding", "Lcom/kubi/assets/databinding/ViewFuturesAssetsHeaderBinding;", "getBinding", "()Lcom/kubi/assets/databinding/ViewFuturesAssetsHeaderBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getAccountInfoHeader", "Lcom/kubi/assets/view/AccountInfoHeaderView;", "bindInfo2View", "", "assets", "Lcom/kubi/assets/entity/AssetV2OverviewEntity;", "initUnifiedTip", "Ljava/math/BigDecimal;", "initListener", "setTrialCheckView", "isShow", "", "(Ljava/lang/Boolean;)V", "bindSpotPnlData", "overview", "Lcom/kubi/assets/entity/SpotAccountOverviewEntity;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetFuturesCoinsHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetFuturesCoinsHeaderView.kt\ncom/kubi/assets/futures/coins/AssetFuturesCoinsHeaderView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 4 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,187:1\n52#2:188\n80#2,7:189\n136#3:196\n136#3:197\n126#3,2:201\n25#4,3:198\n*S KotlinDebug\n*F\n+ 1 AssetFuturesCoinsHeaderView.kt\ncom/kubi/assets/futures/coins/AssetFuturesCoinsHeaderView\n*L\n59#1:188\n59#1:189,7\n75#1:196\n81#1:197\n141#1:201,2\n144#1:198,3\n*E\n"})
public final class AssetFuturesCoinsHeaderView extends FrameLayout {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ KProperty<Object>[] f17568d = {Reflection.property1(new PropertyReference1Impl(AssetFuturesCoinsHeaderView.class, "binding", "getBinding()Lcom/kubi/assets/databinding/ViewFuturesAssetsHeaderBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final OldBaseFragment f17569b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final InterfaceC24293a f17570c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetFuturesCoinsHeaderView(@NotNull OldBaseFragment fragment) {
        KuCheckBox kuCheckBox;
        AccountInfoHeaderView accountInfoHeaderView;
        super(fragment.requireContext());
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f17569b = fragment;
        this.f17570c = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C44727a6>() { // from class: com.kubi.assets.futures.coins.AssetFuturesCoinsHeaderView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44727a6 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C44727a6.m98964a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(getContext()).inflate(R$layout.view_futures_assets_header, this);
        C44727a6 binding = getBinding();
        if (binding != null && (accountInfoHeaderView = binding.f99580b) != null) {
            accountInfoHeaderView.mo19955d(fragment, "B6FuturesAccount");
        }
        C44727a6 binding2 = getBinding();
        if (binding2 != null && (kuCheckBox = binding2.f99581c) != null) {
            kuCheckBox.setChecked(C46392a.m102322d(C42153h.f93593a.m92527q(), true));
        }
        m17035h();
    }

    private final C44727a6 getBinding() {
        return (C44727a6) this.f17570c.getValue(this, f17568d[0]);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m17028i() {
        if (!AssetsDepend.f18689a.m19189j().d0().isHasOpenContract() || IKuMexService.m33248N(AssetsDepend.m19180c(), null, 1, null)) {
            AssetsHelper.m19139N(AssetsHelper.f18684a, null, null, null, 7, null);
        } else {
            AssetsHelper.m19139N(AssetsHelper.f18684a, null, "CONTRACT", null, 5, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static final void m17029j(CompoundButton compoundButton, boolean z11) {
        C43852m.m96591c("B6futures", "AirDropPositionBalanceButton", z11 ? "2" : "1", null, 8, null);
        C46392a.m102328k(C42153h.f93593a.m92527q(), z11);
        C12572a.m23695d("trial_equity_key", null, 0L, 6, null);
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m17030k() {
        C43852m.m96591c("B6FuturesAccount", "Welfare", null, null, 12, null);
        InterfaceC37766r.a.m85190a(C37304a.f82764a, AssetsDepend.m19180c().mo33291u(), null, null, null, C43852m.m96602n("B6FuturesAccount", "Welfare", null, 4, null), null, null, 110, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m17031l(AssetFuturesCoinsHeaderView assetFuturesCoinsHeaderView) {
        AlertDialogFragmentHelper alertDialogFragmentHelperM54162S4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.kc_asset_pnl_today_title).m54153J4(R$string.kc_assets_futures_pnl_tip).m54162S4(R$string.i_already_know, null);
        OldBaseFragment oldBaseFragment = assetFuturesCoinsHeaderView.f17569b;
        alertDialogFragmentHelperM54162S4.m54172c5(oldBaseFragment != null ? oldBaseFragment.getChildFragmentManager() : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m17032m() {
        Router.f46192a.m56184f(C11351z0.m20186a() + C11351z0.m20190e()).m4048k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public final void m17033f(@NotNull AssetV2OverviewEntity assets) {
        BigDecimal totalEquity;
        AccountInfoHeaderView accountInfoHeaderView;
        BigDecimal totalEquity2;
        BigDecimal trialTotalEquity;
        Intrinsics.checkNotNullParameter(assets, "assets");
        EquityEntity futureAsset = assets.getFutureAsset();
        if (C46392a.m102322d(C42153h.f93593a.m92527q(), true)) {
            if (futureAsset == null || (totalEquity2 = futureAsset.getTotalEquity()) == null) {
                totalEquity2 = BigDecimal.ZERO;
            }
            if (futureAsset == null || (trialTotalEquity = futureAsset.getTrialTotalEquity()) == null) {
                trialTotalEquity = BigDecimal.ZERO;
            }
            Intrinsics.checkNotNull(totalEquity2);
            Intrinsics.checkNotNull(trialTotalEquity);
            totalEquity = totalEquity2.add(trialTotalEquity);
            Intrinsics.checkNotNullExpressionValue(totalEquity, "add(...)");
        } else {
            totalEquity = futureAsset != null ? futureAsset.getTotalEquity() : null;
        }
        C44727a6 binding = getBinding();
        if (binding != null && (accountInfoHeaderView = binding.f99580b) != null) {
            accountInfoHeaderView.m19942B(assets, C27041f.m66669i(totalEquity != null ? C37885i.m85562a(totalEquity, assets.getBaseCurrency(), C11273q.m20046b(assets.getBaseCurrency())) : null, "--"), C27041f.m66669i(totalEquity != null ? C41014a.m89950x(C41014a.m89940n(totalEquity, assets.getBaseCurrency()), null, null, 0, false, true, false, true, 47, null) : null, "--"));
        }
        m17036n(futureAsset != null ? futureAsset.getTotalEquity() : null);
    }

    @NotNull
    /* JADX INFO: renamed from: getFragment, reason: from getter */
    public final OldBaseFragment getF17569b() {
        return this.f17569b;
    }

    /* JADX INFO: renamed from: n */
    public final void m17036n(BigDecimal bigDecimal) {
        View view;
        AlertTipsTextView alertTipsTextView;
        String string = (bigDecimal == null || bigDecimal.compareTo(BigDecimal.ZERO) != 0) ? getContext().getString(R$string.alert_unify_contract_trading_upgrade) : getContext().getString(R$string.alert_unify_contract_trading_no_asset_upgrade);
        Intrinsics.checkNotNull(string);
        C44727a6 binding = getBinding();
        if (binding != null && (alertTipsTextView = binding.f99588j) != null) {
            AssetExKt.m15138z(alertTipsTextView, IUnifyAccountService.f53155a.get().mo64979C());
        }
        C44727a6 binding2 = getBinding();
        if (binding2 != null && (view = binding2.f99585g) != null) {
            AssetExKt.m15138z(view, IUnifyAccountService.f53155a.get().mo64979C());
        }
        C44727a6 binding3 = getBinding();
        AlertTipsTextView alertTipsTextView2 = binding3 != null ? binding3.f99588j : null;
        C44727a6 binding4 = getBinding();
        new InjectExpandableUIBehavior(string, alertTipsTextView2, binding4 != null ? binding4.f99582d : null, 1, ContextCompat.getDrawable(getContext(), R$drawable.ic2_arrow_down_16), ContextCompat.getDrawable(getContext(), R$drawable.ic2_arrow_up_16));
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: g */
    public final void m17034g(@Nullable SpotAccountOverviewEntity spotAccountOverviewEntity) {
        MarginPnlHeaderView marginPnlHeaderView;
        MarginPnlHeaderView marginPnlHeaderView2;
        MarginPnlHeaderView marginPnlHeaderView3;
        if (!C11351z0.m20196k()) {
            C44727a6 binding = getBinding();
            if (binding != null && (marginPnlHeaderView3 = binding.f99584f) != null) {
                ViewExtKt.m66577h(marginPnlHeaderView3);
                return;
            }
            return;
        }
        C44727a6 binding2 = getBinding();
        if (binding2 != null && (marginPnlHeaderView2 = binding2.f99584f) != null) {
            ViewExtKt.m66594y(marginPnlHeaderView2);
        }
        C44727a6 binding3 = getBinding();
        if (binding3 != null && (marginPnlHeaderView = binding3.f99584f) != null) {
            marginPnlHeaderView.m18051g(spotAccountOverviewEntity);
        }
    }

    @Nullable
    public final AccountInfoHeaderView getAccountInfoHeader() {
        C44727a6 binding = getBinding();
        if (binding != null) {
            return binding.f99580b;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m17035h() {
        C44727a6 binding = getBinding();
        if (binding == null) {
            return;
        }
        KcPrimaryButton tvTransfer = binding.f99587i;
        Intrinsics.checkNotNullExpressionValue(tvTransfer, "tvTransfer");
        C27046k.m66711z(tvTransfer, 0L, new Function0() { // from class: com.kubi.assets.futures.coins.e0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetFuturesCoinsHeaderView.m17028i();
            }
        }, 1, null);
        binding.f99581c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.kubi.assets.futures.coins.f0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                AssetFuturesCoinsHeaderView.m17029j(compoundButton, z11);
            }
        });
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46804j.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            ShapeLinearLayout llGift = binding.f99583e;
            Intrinsics.checkNotNullExpressionValue(llGift, "llGift");
            ((InterfaceC46804j) objM56186h).m103136a(llGift);
        } else {
            if (C38057a.f85671a.m85928a("kcApp.B6FuturesTrade.futures.perks", true)) {
                ShapeLinearLayout llGift2 = binding.f99583e;
                Intrinsics.checkNotNullExpressionValue(llGift2, "llGift");
                C27046k.m66685H(llGift2);
            } else {
                ShapeLinearLayout llGift3 = binding.f99583e;
                Intrinsics.checkNotNullExpressionValue(llGift3, "llGift");
                C27046k.m66700o(llGift3);
            }
            ShapeLinearLayout llGift4 = binding.f99583e;
            Intrinsics.checkNotNullExpressionValue(llGift4, "llGift");
            C27046k.m66711z(llGift4, 0L, new Function0() { // from class: com.kubi.assets.futures.coins.g0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetFuturesCoinsHeaderView.m17030k();
                }
            }, 1, null);
        }
        binding.f99584f.setTitleClickListener(new Function0() { // from class: com.kubi.assets.futures.coins.h0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetFuturesCoinsHeaderView.m17031l(this.f17584b);
            }
        });
        binding.f99584f.setPnlClickListener(new Function0() { // from class: com.kubi.assets.futures.coins.i0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetFuturesCoinsHeaderView.m17032m();
            }
        });
    }

    public final void setTrialCheckView(@Nullable Boolean isShow) {
        BaseTextView baseTextView;
        KuCheckBox kuCheckBox;
        int i11;
        C44727a6 binding = getBinding();
        int i12 = 8;
        if (binding != null && (kuCheckBox = binding.f99581c) != null) {
            if (C27025c.m66566d(isShow)) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            kuCheckBox.setVisibility(i11);
        }
        C44727a6 binding2 = getBinding();
        if (binding2 != null && (baseTextView = binding2.f99586h) != null) {
            if (C27025c.m66566d(isShow)) {
                i12 = 0;
            }
            baseTextView.setVisibility(i12);
        }
    }
}
