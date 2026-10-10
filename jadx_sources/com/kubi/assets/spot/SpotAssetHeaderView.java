package com.kubi.assets.spot;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.C11351z0;
import com.kubi.assets.R$drawable;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.dialog.payment.C9835j;
import com.kubi.assets.entity.AssetV2OverviewEntity;
import com.kubi.assets.entity.SpotAccountOverviewEntity;
import com.kubi.assets.margin.view.MarginPnlHeaderView;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.assets.view.AccountInfoHeaderView;
import com.kubi.assets.view.C11273q;
import com.kubi.assets.view.VerticalIconTextBtn;
import com.kubi.data.entity.AssetSingleEntity;
import com.kubi.payment.channel.data.entities.ChannelKycRequest;
import com.kubi.resources.InjectExpandableUIBehavior;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.AlertTipsTextView;
import com.kubi.router.core.Router;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import f00.C37304a;
import g00.InterfaceC37762n;
import gf.C37885i;
import io.reactivex.functions.Action;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p569qq.C43852m;
import p637ta.C44783h6;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: SpotAssetHeaderView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fJ\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\u0012\u0010\u001a\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J\b\u0010 \u001a\u00020\u0015H\u0002J\u0010\u0010!\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010#J\u0012\u0010$\u001a\u00020\u00152\b\u0010%\u001a\u0004\u0018\u00010&H\u0007R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006'"}, m90084d2 = {"Lcom/kubi/assets/spot/SpotAssetHeaderView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/kubi/assets/databinding/ViewSpotAssetsHeaderBinding;", "getBinding", "()Lcom/kubi/assets/databinding/ViewSpotAssetsHeaderBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "fragment", "Lcom/kubi/assets/spot/AssetV2SpotFragment;", "getFragment", "()Lcom/kubi/assets/spot/AssetV2SpotFragment;", "setFragment", "(Lcom/kubi/assets/spot/AssetV2SpotFragment;)V", "bindFragment", "", "assetV2SpotFragment", "getAccountInfoHeader", "Lcom/kubi/assets/view/AccountInfoHeaderView;", "initView", "initUnifiedTip", "assets", "Ljava/math/BigDecimal;", "bindInfo2View", "asset", "Lcom/kubi/assets/entity/AssetV2OverviewEntity;", "initListener", "onConvertInfoGet", "it", "Lcom/kubi/assets/spot/AssetV2SpotContract$CovertFromCoin;", "bindSpotPnlData", "overview", "Lcom/kubi/assets/entity/SpotAccountOverviewEntity;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSpotAssetHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpotAssetHeaderView.kt\ncom/kubi/assets/spot/SpotAssetHeaderView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,184:1\n52#2:185\n80#2,7:186\n*S KotlinDebug\n*F\n+ 1 SpotAssetHeaderView.kt\ncom/kubi/assets/spot/SpotAssetHeaderView\n*L\n48#1:185\n48#1:186,7\n*E\n"})
public final class SpotAssetHeaderView extends FrameLayout {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ KProperty<Object>[] f18824d = {Reflection.property1(new PropertyReference1Impl(SpotAssetHeaderView.class, "binding", "getBinding()Lcom/kubi/assets/databinding/ViewSpotAssetsHeaderBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f18825b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public AssetV2SpotFragment f18826c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotAssetHeaderView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f18825b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C44783h6>() { // from class: com.kubi.assets.spot.SpotAssetHeaderView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44783h6 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C44783h6.m99083a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.view_spot_assets_header, this);
    }

    private final C44783h6 getBinding() {
        return (C44783h6) this.f18825b.getValue(this, f18824d[0]);
    }

    /* JADX INFO: renamed from: l */
    public static final void m19473l() {
        InterfaceC37762n.a.m85178b(C37304a.f82764a, 0L, 2L, null, null, null, null, 60, null);
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m19474m() {
        C43852m.m96591c("B5TradeAccount", "transfer", "1", null, 8, null);
        AssetsHelper.m19139N(AssetsHelper.f18684a, null, null, C43852m.m96602n("B5TradeAccount", "transfer", null, 4, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m19475n() {
        C43852m.m96590b("B5TradeAccount", ChannelKycRequest.SCENE_DEPOSIT, "1", TuplesKt.m90091to("after_page_id", "B1depositCoinList"), TuplesKt.m90091to("norm_version", "1"), TuplesKt.m90091to("isABNew", Boolean.valueOf(C9835j.m16374a())));
        AssetsHelper.m19137F(AssetsHelper.f18684a, C43852m.m96602n("B5TradeAccount", ChannelKycRequest.SCENE_DEPOSIT, null, 4, null), 0, false, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m19476o() {
        C43852m.m96590b("B5TradeAccount", ChannelKycRequest.SCENE_WITHDRAW, "1", TuplesKt.m90091to("after_page_id", "B1depositCoinList"), TuplesKt.m90091to("norm_version", "1"), TuplesKt.m90091to("isABNew", Boolean.valueOf(C9835j.m16374a())));
        AssetsHelper.f18684a.m19159O();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m19477p(SpotAssetHeaderView spotAssetHeaderView) {
        AlertDialogFragmentHelper alertDialogFragmentHelperM54162S4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.kc_asset_pnl_today_title).m54153J4(R$string.kc_assets_spot_pnl_tip).m54162S4(R$string.i_already_know, null);
        AssetV2SpotFragment assetV2SpotFragment = spotAssetHeaderView.f18826c;
        alertDialogFragmentHelperM54162S4.m54172c5(assetV2SpotFragment != null ? assetV2SpotFragment.getChildFragmentManager() : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m19478q() {
        Router.f46192a.m56184f(C11351z0.m20186a() + C11351z0.m20192g()).m4048k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m19479u(CovertFromCoin covertFromCoin) {
        C43852m.m96591c("B5TradeAccount", "convert", "1", null, 8, null);
        AssetsHelper.f18684a.m19150B(covertFromCoin != null ? covertFromCoin.m19551a() : null);
        return Unit.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: getFragment, reason: from getter */
    public final AssetV2SpotFragment getF18826c() {
        return this.f18826c;
    }

    /* JADX INFO: renamed from: h */
    public final void m19480h(@NotNull AssetV2SpotFragment assetV2SpotFragment) {
        AccountInfoHeaderView accountInfoHeaderView;
        Intrinsics.checkNotNullParameter(assetV2SpotFragment, "assetV2SpotFragment");
        this.f18826c = assetV2SpotFragment;
        C44783h6 binding = getBinding();
        if (binding != null && (accountInfoHeaderView = binding.f100084b) != null) {
            accountInfoHeaderView.mo19955d(assetV2SpotFragment, "B5TradeAccount");
        }
        m19485s();
        m19483k();
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: i */
    public final void m19481i(@NotNull AssetV2OverviewEntity asset) {
        AccountInfoHeaderView accountInfoHeaderView;
        BigDecimal totalBalance;
        BigDecimal totalBalance2;
        Intrinsics.checkNotNullParameter(asset, "asset");
        AssetSingleEntity spotAsset = asset.getSpotAsset();
        C44783h6 binding = getBinding();
        if (binding != null && (accountInfoHeaderView = binding.f100084b) != null) {
            accountInfoHeaderView.m19942B(asset, C27041f.m66669i((spotAsset == null || (totalBalance2 = spotAsset.getTotalBalance()) == null) ? null : C37885i.m85562a(totalBalance2, asset.getBaseCurrency(), C11273q.m20046b(asset.getBaseCurrency())), "--"), C27041f.m66669i((spotAsset == null || (totalBalance = spotAsset.getTotalBalance()) == null) ? null : C41014a.m89950x(C41014a.m89940n(totalBalance, asset.getBaseCurrency()), null, null, 0, false, true, false, true, 47, null), "--"));
        }
        m19484r(spotAsset != null ? spotAsset.getTotalBalance() : null);
    }

    /* JADX INFO: renamed from: r */
    public final void m19484r(BigDecimal bigDecimal) {
        View view;
        AlertTipsTextView alertTipsTextView;
        String string = (bigDecimal == null || bigDecimal.compareTo(BigDecimal.ZERO) != 0) ? getContext().getString(R$string.alert_unify_spot_trading_upgrade) : getContext().getString(R$string.alert_unify_spot_trading_no_asset_upgrade);
        Intrinsics.checkNotNull(string);
        C44783h6 binding = getBinding();
        if (binding != null && (alertTipsTextView = binding.f100092j) != null) {
            AssetExKt.m15138z(alertTipsTextView, IUnifyAccountService.f53155a.get().mo64979C());
        }
        C44783h6 binding2 = getBinding();
        if (binding2 != null && (view = binding2.f100089g) != null) {
            AssetExKt.m15138z(view, IUnifyAccountService.f53155a.get().mo64979C());
        }
        C44783h6 binding3 = getBinding();
        AlertTipsTextView alertTipsTextView2 = binding3 != null ? binding3.f100092j : null;
        C44783h6 binding4 = getBinding();
        new InjectExpandableUIBehavior(string, alertTipsTextView2, binding4 != null ? binding4.f100085c : null, 1, ContextCompat.getDrawable(getContext(), R$drawable.ic2_arrow_down_16), ContextCompat.getDrawable(getContext(), R$drawable.ic2_arrow_up_16));
    }

    public final void setFragment(@Nullable AssetV2SpotFragment assetV2SpotFragment) {
        this.f18826c = assetV2SpotFragment;
    }

    /* JADX INFO: renamed from: t */
    public final void m19486t(@Nullable final CovertFromCoin covertFromCoin) {
        VerticalIconTextBtn verticalIconTextBtn;
        VerticalIconTextBtn verticalIconTextBtn2;
        VerticalIconTextBtn verticalIconTextBtn3;
        if (!C27025c.m66566d(covertFromCoin != null ? Boolean.valueOf(covertFromCoin.getIsOpen()) : null)) {
            C44783h6 binding = getBinding();
            if (binding == null || (verticalIconTextBtn = binding.f100086d) == null) {
                return;
            }
            ViewExtKt.m66577h(verticalIconTextBtn);
            return;
        }
        C44783h6 binding2 = getBinding();
        if (binding2 != null && (verticalIconTextBtn3 = binding2.f100086d) != null) {
            ViewExtKt.m66594y(verticalIconTextBtn3);
        }
        C44783h6 binding3 = getBinding();
        if (binding3 == null || (verticalIconTextBtn2 = binding3.f100086d) == null) {
            return;
        }
        C27046k.m66711z(verticalIconTextBtn2, 0L, new Function0() { // from class: com.kubi.assets.spot.m0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotAssetHeaderView.m19479u(covertFromCoin);
            }
        }, 1, null);
    }

    @Nullable
    public final AccountInfoHeaderView getAccountInfoHeader() {
        C44783h6 binding = getBinding();
        if (binding != null) {
            return binding.f100084b;
        }
        return null;
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: j */
    public final void m19482j(@Nullable SpotAccountOverviewEntity spotAccountOverviewEntity) {
        MarginPnlHeaderView marginPnlHeaderView;
        MarginPnlHeaderView marginPnlHeaderView2;
        MarginPnlHeaderView marginPnlHeaderView3;
        if (!C11351z0.m20196k()) {
            C44783h6 binding = getBinding();
            if (binding != null && (marginPnlHeaderView3 = binding.f100088f) != null) {
                ViewExtKt.m66577h(marginPnlHeaderView3);
                return;
            }
            return;
        }
        C44783h6 binding2 = getBinding();
        if (binding2 != null && (marginPnlHeaderView2 = binding2.f100088f) != null) {
            ViewExtKt.m66594y(marginPnlHeaderView2);
        }
        C44783h6 binding3 = getBinding();
        if (binding3 != null && (marginPnlHeaderView = binding3.f100088f) != null) {
            marginPnlHeaderView.m18051g(spotAccountOverviewEntity);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m19483k() {
        AccountInfoHeaderView accountInfoHeaderView;
        C44783h6 binding = getBinding();
        if (binding != null && (accountInfoHeaderView = binding.f100084b) != null) {
            AccountInfoHeaderView.m19940y(accountInfoHeaderView, new Action() { // from class: com.kubi.assets.spot.n0
                @Override // io.reactivex.functions.Action
                public final void run() {
                    SpotAssetHeaderView.m19473l();
                }
            }, null, R$drawable.ic2_history_20, 0, 0, null, false, false, 186, null);
        }
        C44783h6 binding2 = getBinding();
        if (binding2 != null) {
            VerticalIconTextBtn tvTransfer = binding2.f100091i;
            Intrinsics.checkNotNullExpressionValue(tvTransfer, "tvTransfer");
            C27046k.m66711z(tvTransfer, 0L, new Function0() { // from class: com.kubi.assets.spot.o0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SpotAssetHeaderView.m19474m();
                }
            }, 1, null);
            VerticalIconTextBtn tvDeposit = binding2.f100090h;
            Intrinsics.checkNotNullExpressionValue(tvDeposit, "tvDeposit");
            C27046k.m66711z(tvDeposit, 0L, new Function0() { // from class: com.kubi.assets.spot.p0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SpotAssetHeaderView.m19475n();
                }
            }, 1, null);
            VerticalIconTextBtn tvWithdraw = binding2.f100093k;
            Intrinsics.checkNotNullExpressionValue(tvWithdraw, "tvWithdraw");
            C27046k.m66711z(tvWithdraw, 0L, new Function0() { // from class: com.kubi.assets.spot.q0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SpotAssetHeaderView.m19476o();
                }
            }, 1, null);
            binding2.f100088f.setTitleClickListener(new Function0() { // from class: com.kubi.assets.spot.r0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SpotAssetHeaderView.m19477p(this.f18897b);
                }
            });
            binding2.f100088f.setPnlClickListener(new Function0() { // from class: com.kubi.assets.spot.s0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SpotAssetHeaderView.m19478q();
                }
            });
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m19485s() {
        MarginPnlHeaderView marginPnlHeaderView;
        VerticalIconTextBtn verticalIconTextBtn;
        VerticalIconTextBtn verticalIconTextBtn2;
        VerticalIconTextBtn verticalIconTextBtn3;
        C44783h6 binding = getBinding();
        if (binding != null && (verticalIconTextBtn3 = binding.f100090h) != null) {
            ViewExtKt.m66594y(verticalIconTextBtn3);
        }
        C44783h6 binding2 = getBinding();
        if (binding2 != null && (verticalIconTextBtn2 = binding2.f100093k) != null) {
            ViewExtKt.m66594y(verticalIconTextBtn2);
        }
        C44783h6 binding3 = getBinding();
        if (binding3 != null && (verticalIconTextBtn = binding3.f100091i) != null) {
            ViewExtKt.m66594y(verticalIconTextBtn);
        }
        C44783h6 binding4 = getBinding();
        if (binding4 != null && (marginPnlHeaderView = binding4.f100088f) != null) {
            AssetExKt.m15138z(marginPnlHeaderView, C11351z0.m20196k());
        }
    }
}
