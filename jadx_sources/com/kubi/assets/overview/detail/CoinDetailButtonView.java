package com.kubi.assets.overview.detail;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.data.coin.TransferJumper;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.payment.channel.data.entities.ChannelKycRequest;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import f00.C37304a;
import g00.InterfaceC37749a;
import g00.InterfaceC37758j;
import gf.C37890n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p637ta.C44792j;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
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

/* JADX INFO: compiled from: CoinDetailButtonView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u0084\u0002"}, m90084d2 = {"Lcom/kubi/assets/overview/detail/CoinDetailButtonView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/kubi/assets/databinding/AssetCoinDetailButtonViewBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetCoinDetailButtonViewBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "initClickEvents", "", FirebaseAnalytics.Param.CURRENCY, "", "AssetsCenterLib_googleRelease", "coinInfoEntity", "Lcom/kubi/data/entity/CoinInfoEntity;"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCoinDetailButtonView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoinDetailButtonView.kt\ncom/kubi/assets/overview/detail/CoinDetailButtonView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,83:1\n52#2:84\n80#2,7:85\n*S KotlinDebug\n*F\n+ 1 CoinDetailButtonView.kt\ncom/kubi/assets/overview/detail/CoinDetailButtonView\n*L\n30#1:84\n30#1:85,7\n*E\n"})
public final class CoinDetailButtonView extends FrameLayout {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ KProperty<Object>[] f18327c = {Reflection.property1(new PropertyReference1Impl(CoinDetailButtonView.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetCoinDetailButtonViewBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f18328b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoinDetailButtonView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f18328b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C44792j>() { // from class: com.kubi.assets.overview.detail.CoinDetailButtonView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44792j invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C44792j.m99102a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.asset_coin_detail_button_view, this);
    }

    private final C44792j getBinding() {
        return (C44792j) this.f18328b.getValue(this, f18327c[0]);
    }

    /* JADX INFO: renamed from: h */
    public static final CoinInfoEntity m18615h(String str) {
        CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(str);
        if (coinInfoEntityM85613u != null) {
            return coinInfoEntityM85613u;
        }
        CoinInfoEntity coinInfoEntity = new CoinInfoEntity();
        coinInfoEntity.setCode(coinInfoEntity.getCode());
        coinInfoEntity.setCurrency(coinInfoEntity.getCode());
        return coinInfoEntity;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m18617j(String str, Lazy lazy) throws JSONException {
        InterfaceC37758j.a.m85157f(C37304a.f82764a, C27041f.m66668h(m18616i(lazy).getCode()), null, null, null, null, 30, null);
        CoinDetailTracker.f18371a.m18634b(ChannelKycRequest.SCENE_DEPOSIT, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m18618k(String str, Lazy lazy) throws JSONException {
        InterfaceC37758j.a.m85159h(C37304a.f82764a, C27041f.m66668h(m18616i(lazy).getCode()), null, null, null, null, 30, null);
        CoinDetailTracker.f18371a.m18634b(ChannelKycRequest.SCENE_WITHDRAW, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m18619l(String str, Lazy lazy) throws JSONException {
        InterfaceC37749a.a.m85110e(C37304a.f82764a, C27041f.m66668h(m18616i(lazy).getCode()), null, null, null, null, null, 62, null);
        CoinDetailTracker.f18371a.m18634b(ChannelKycRequest.SCENE_DEPOSIT, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m18620m(String str, Lazy lazy) throws JSONException {
        InterfaceC37749a.a.m85118m(C37304a.f82764a, C27041f.m66668h(m18616i(lazy).getCode()), null, null, null, null, null, null, 126, null);
        CoinDetailTracker.f18371a.m18634b(ChannelKycRequest.SCENE_WITHDRAW, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m18621n(String str, Lazy lazy) throws JSONException {
        TransferJumper.Companion.jumpToTransfer$default(TransferJumper.f21427a, m18616i(lazy).getCode(), null, null, null, null, true, null, 94, null);
        CoinDetailTracker.f18371a.m18634b("transfer", str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public final void m18622g(@NotNull final String currency) {
        KcSecondaryButton kcSecondaryButton;
        KcPrimaryButton kcPrimaryButton;
        KcPrimaryButton kcPrimaryButton2;
        KcSecondaryButton kcSecondaryButton2;
        KcSecondaryButton kcSecondaryButton3;
        KcSecondaryButton kcSecondaryButton4;
        KcPrimaryButton kcPrimaryButton3;
        KcPrimaryButton kcPrimaryButton4;
        KcPrimaryButton kcPrimaryButton5;
        Intrinsics.checkNotNullParameter(currency, "currency");
        final Lazy lazy = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.overview.detail.d0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CoinDetailButtonView.m18615h(currency);
            }
        });
        if (C27025c.m66567e(Boolean.valueOf(m18616i(lazy).isDigital()), true)) {
            C44792j binding = getBinding();
            if (binding != null && (kcPrimaryButton2 = binding.f100198c) != null) {
                kcPrimaryButton2.setText(R$string.deposit_coin);
            }
            C44792j binding2 = getBinding();
            if (binding2 != null && (kcPrimaryButton = binding2.f100198c) != null) {
                C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.assets.overview.detail.g0
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CoinDetailButtonView.m18619l(currency, lazy);
                    }
                }, 1, null);
            }
            C44792j binding3 = getBinding();
            if (binding3 != null && (kcSecondaryButton = binding3.f100200e) != null) {
                C27046k.m66711z(kcSecondaryButton, 0L, new Function0() { // from class: com.kubi.assets.overview.detail.h0
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CoinDetailButtonView.m18620m(currency, lazy);
                    }
                }, 1, null);
            }
        } else {
            C44792j binding4 = getBinding();
            if (binding4 != null && (kcPrimaryButton5 = binding4.f100198c) != null) {
                AssetExKt.m15138z(kcPrimaryButton5, C24129b.m58030b(SiteVisibleConfigKey.FiatDeposit));
            }
            C44792j binding5 = getBinding();
            if (binding5 != null && (kcPrimaryButton4 = binding5.f100198c) != null) {
                kcPrimaryButton4.setText(R$string.fiat_charge);
            }
            C44792j binding6 = getBinding();
            if (binding6 != null && (kcPrimaryButton3 = binding6.f100198c) != null) {
                C27046k.m66711z(kcPrimaryButton3, 0L, new Function0() { // from class: com.kubi.assets.overview.detail.e0
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CoinDetailButtonView.m18617j(currency, lazy);
                    }
                }, 1, null);
            }
            C44792j binding7 = getBinding();
            if (binding7 != null && (kcSecondaryButton4 = binding7.f100200e) != null) {
                AssetExKt.m15138z(kcSecondaryButton4, C24129b.m58030b(SiteVisibleConfigKey.FiatDeposit));
            }
            C44792j binding8 = getBinding();
            if (binding8 != null && (kcSecondaryButton3 = binding8.f100200e) != null) {
                C27046k.m66711z(kcSecondaryButton3, 0L, new Function0() { // from class: com.kubi.assets.overview.detail.f0
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CoinDetailButtonView.m18618k(currency, lazy);
                    }
                }, 1, null);
            }
        }
        C44792j binding9 = getBinding();
        if (binding9 == null || (kcSecondaryButton2 = binding9.f100199d) == null) {
            return;
        }
        C27046k.m66711z(kcSecondaryButton2, 0L, new Function0() { // from class: com.kubi.assets.overview.detail.i0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CoinDetailButtonView.m18621n(currency, lazy);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: i */
    public static final CoinInfoEntity m18616i(Lazy<? extends CoinInfoEntity> lazy) {
        return lazy.getValue();
    }
}
