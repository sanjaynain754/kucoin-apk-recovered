package com.kubi.assets.options;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.kubi.assets.R$layout;
import com.kubi.assets.entity.AssetV2OverviewEntity;
import com.kubi.assets.entity.OptionsOverviewEntity;
import com.kubi.assets.options.view.OptionsPnlHeaderView;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.assets.view.AccountInfoHeaderView;
import com.kubi.assets.view.C11273q;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.router.core.Router;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import gf.C37885i;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p637ta.C44846q2;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import rs.AbstractC44173c;
import rs.C44172b;
import w00.C45682f;

/* JADX INFO: compiled from: AssetOptionsHeaderView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fJ\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u001a\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007J\b\u0010\u001c\u001a\u00020\u0011H\u0002R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/assets/options/AssetOptionsHeaderView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", JAnalysisConstants.EVENT_ATTRIBUTES, "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/kubi/assets/databinding/AssetViewOptionsHeaderBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetViewOptionsHeaderBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "fragment", "Lcom/kubi/assets/options/AssetOptionsFragment;", "bindFragment", "", "assetOptionsFragment", "getAccountInfoHeader", "Lcom/kubi/assets/view/AccountInfoHeaderView;", "getPnlViewHeader", "Lcom/kubi/assets/options/view/OptionsPnlHeaderView;", "bindInfo2View", "asset", "Lcom/kubi/assets/entity/OptionsOverviewEntity;", "assetsOverview", "Lcom/kubi/assets/entity/AssetV2OverviewEntity;", "initListener", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetOptionsHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetOptionsHeaderView.kt\ncom/kubi/assets/options/AssetOptionsHeaderView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,95:1\n52#2:96\n80#2,7:97\n*S KotlinDebug\n*F\n+ 1 AssetOptionsHeaderView.kt\ncom/kubi/assets/options/AssetOptionsHeaderView\n*L\n39#1:96\n39#1:97,7\n*E\n"})
public final class AssetOptionsHeaderView extends FrameLayout {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ KProperty<Object>[] f18121d = {Reflection.property1(new PropertyReference1Impl(AssetOptionsHeaderView.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetViewOptionsHeaderBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f18122b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public AssetOptionsFragment f18123c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public AssetOptionsHeaderView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ AssetOptionsHeaderView(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m18073e() {
        Router.f46192a.m56184f("krn/router?component=kucoin_options_rn&biz=options&entry=main&route=" + Uri.encode("HistoryPage?tab=ORDER_HISTORY")).m4048k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m18074g() {
        AssetsHelper.m19139N(AssetsHelper.f18684a, null, "OPTION", null, 5, null);
        return Unit.INSTANCE;
    }

    private final C44846q2 getBinding() {
        return (C44846q2) this.f18122b.getValue(this, f18121d[0]);
    }

    /* JADX INFO: renamed from: c */
    public final void m18075c(@NotNull AssetOptionsFragment assetOptionsFragment) {
        AccountInfoHeaderView accountInfoHeaderView;
        Intrinsics.checkNotNullParameter(assetOptionsFragment, "assetOptionsFragment");
        this.f18123c = assetOptionsFragment;
        C44846q2 binding = getBinding();
        if (binding != null && (accountInfoHeaderView = binding.f100667b) != null) {
            accountInfoHeaderView.mo19955d(assetOptionsFragment, "B4optionsAccount");
        }
        m18077f();
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: d */
    public final void m18076d(@NotNull OptionsOverviewEntity asset, @Nullable AssetV2OverviewEntity assetV2OverviewEntity) {
        ImageView imageView;
        ShowHideTextView showHideTextView;
        ShowHideTextView showHideTextView2;
        TextView textViewM97383c;
        ShowHideTextView showHideTextView3;
        ShowHideTextView showHideTextView4;
        TextView textViewM97383c2;
        AccountInfoHeaderView accountInfoHeaderView;
        Intrinsics.checkNotNullParameter(asset, "asset");
        C44846q2 binding = getBinding();
        if (binding != null && (accountInfoHeaderView = binding.f100667b) != null) {
            BigDecimal totalBalance = asset.getTotalBalance();
            String strM66669i = C27041f.m66669i(totalBalance != null ? C37885i.m85562a(totalBalance, asset.getCurrency(), C11273q.m20046b(asset.getCurrency())) : null, "--");
            BigDecimal totalBalance2 = asset.getTotalBalance();
            accountInfoHeaderView.m19945J(strM66669i, C27041f.m66669i(totalBalance2 != null ? C41014a.m89950x(C41014a.m89940n(totalBalance2, asset.getCurrency()), null, null, 0, false, true, false, true, 47, null) : null, "--"), asset.getCurrency(), assetV2OverviewEntity);
        }
        C44846q2 binding2 = getBinding();
        if (binding2 != null && (showHideTextView4 = binding2.f100674i) != null && (textViewM97383c2 = C44172b.m97383c(showHideTextView4, new AbstractC44173c.a(0, false, 3, null), false, 2, null)) != null) {
            BigDecimal availableBalance = asset.getAvailableBalance();
            textViewM97383c2.setText(C27041f.m66669i(availableBalance != null ? C37885i.m85563b(availableBalance, asset.getCurrency(), 0, 2, null) : null, "--"));
        }
        C44846q2 binding3 = getBinding();
        if (binding3 != null && (showHideTextView3 = binding3.f100673h) != null) {
            BigDecimal availableBalance2 = asset.getAvailableBalance();
            showHideTextView3.setText(C27041f.m66669i(availableBalance2 != null ? C41014a.m89950x(C41014a.m89939m(availableBalance2.doubleValue(), asset.getCurrency()), null, null, 0, false, true, false, true, 47, null) : null, "--"));
        }
        C44846q2 binding4 = getBinding();
        if (binding4 != null && (showHideTextView2 = binding4.f100677l) != null && (textViewM97383c = C44172b.m97383c(showHideTextView2, new AbstractC44173c.a(0, false, 3, null), false, 2, null)) != null) {
            BigDecimal assetBalance = asset.getAssetBalance();
            textViewM97383c.setText(C27041f.m66669i(assetBalance != null ? C37885i.m85563b(assetBalance, asset.getCurrency(), 0, 2, null) : null, "--"));
        }
        C44846q2 binding5 = getBinding();
        if (binding5 != null && (showHideTextView = binding5.f100676k) != null) {
            BigDecimal assetBalance2 = asset.getAssetBalance();
            showHideTextView.setText(C27041f.m66669i(assetBalance2 != null ? C41014a.m89950x(C41014a.m89939m(assetBalance2.doubleValue(), asset.getCurrency()), null, null, 0, false, true, false, true, 47, null) : null, "--"));
        }
        C44846q2 binding6 = getBinding();
        if (binding6 == null || (imageView = binding6.f100668c) == null) {
            return;
        }
        C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.assets.options.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetOptionsHeaderView.m18073e();
            }
        }, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AssetOptionsHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f18122b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C44846q2>() { // from class: com.kubi.assets.options.AssetOptionsHeaderView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44846q2 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C44846q2.m99217a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.asset_view_options_header, this);
    }

    /* JADX INFO: renamed from: f */
    public final void m18077f() {
        KcSecondaryButton kcSecondaryButton;
        C44846q2 binding = getBinding();
        if (binding != null && (kcSecondaryButton = binding.f100678m) != null) {
            C27046k.m66711z(kcSecondaryButton, 0L, new Function0() { // from class: com.kubi.assets.options.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetOptionsHeaderView.m18074g();
                }
            }, 1, null);
        }
    }

    @Nullable
    public final AccountInfoHeaderView getAccountInfoHeader() {
        C44846q2 binding = getBinding();
        if (binding != null) {
            return binding.f100667b;
        }
        return null;
    }

    @Nullable
    public final OptionsPnlHeaderView getPnlViewHeader() {
        C44846q2 binding = getBinding();
        if (binding != null) {
            return binding.f100679n;
        }
        return null;
    }
}
