package com.kubi.assets.alpha;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.GravityCompat;
import com.kubi.assets.R$drawable;
import com.kubi.assets.R$layout;
import com.kubi.assets.entity.AssetV2OverviewEntity;
import com.kubi.assets.entity.CommonAccountEntity;
import com.kubi.assets.view.AccountInfoHeaderView;
import com.kubi.assets.view.C11273q;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.flutter.KCFlutterRouteManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import f00.C37304a;
import g00.InterfaceC37754f;
import gf.C37885i;
import io.reactivex.functions.Action;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p637ta.C44771g2;
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

/* JADX INFO: compiled from: AlphaHeaderView.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/assets/alpha/AlphaHeaderView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/kubi/assets/databinding/AssetViewAlphaHeaderBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetViewAlphaHeaderBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getAccountInfoHeader", "Lcom/kubi/assets/view/AccountInfoHeaderView;", "initView", "", "bindFragment", "alphaFragment", "Lcom/kubi/assets/alpha/AlphaFragment;", "bindInfo2View", "asset", "Lcom/kubi/assets/entity/AssetV2OverviewEntity;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAlphaHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlphaHeaderView.kt\ncom/kubi/assets/alpha/AlphaHeaderView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,77:1\n52#2:78\n80#2,7:79\n*S KotlinDebug\n*F\n+ 1 AlphaHeaderView.kt\ncom/kubi/assets/alpha/AlphaHeaderView\n*L\n30#1:78\n30#1:79,7\n*E\n"})
public final class AlphaHeaderView extends FrameLayout {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ KProperty<Object>[] f16436c = {Reflection.property1(new PropertyReference1Impl(AlphaHeaderView.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetViewAlphaHeaderBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f16437b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlphaHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f16437b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C44771g2>() { // from class: com.kubi.assets.alpha.AlphaHeaderView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44771g2 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C44771g2.m99058a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.asset_view_alpha_header, this);
        m15293f();
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m15288g() {
        InterfaceC37754f.a.m85129a(C37304a.f82764a, null, Boolean.TRUE, null, null, null, 29, null);
        return Unit.INSTANCE;
    }

    private final C44771g2 getBinding() {
        return (C44771g2) this.f16437b.getValue(this, f16436c[0]);
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m15289h() {
        InterfaceC37754f.a.m85129a(C37304a.f82764a, null, Boolean.FALSE, null, null, null, 29, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static final void m15290i() {
        KCFlutterRouteManager.m56839j(KCFlutterRouteManager.f46704a, "asset/fund/flow/home", false, null, 6, null);
    }

    /* JADX INFO: renamed from: d */
    public final void m15291d(@NotNull AlphaFragment alphaFragment) {
        AccountInfoHeaderView accountInfoHeaderView;
        Intrinsics.checkNotNullParameter(alphaFragment, "alphaFragment");
        C44771g2 binding = getBinding();
        if (binding == null || (accountInfoHeaderView = binding.f99967b) == null) {
            return;
        }
        accountInfoHeaderView.mo19955d(alphaFragment, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m15292e(@NotNull AssetV2OverviewEntity asset) {
        AccountInfoHeaderView accountInfoHeaderView;
        BigDecimal totalBalance;
        BigDecimal totalBalance2;
        Intrinsics.checkNotNullParameter(asset, "asset");
        CommonAccountEntity alphaAsset = asset.getAlphaAsset();
        C44771g2 binding = getBinding();
        if (binding == null || (accountInfoHeaderView = binding.f99967b) == null) {
            return;
        }
        String strM89950x = null;
        String strM66669i = C27041f.m66669i((alphaAsset == null || (totalBalance2 = alphaAsset.getTotalBalance()) == null) ? null : C37885i.m85562a(totalBalance2, asset.getBaseCurrency(), C11273q.m20046b(asset.getBaseCurrency())), "--");
        if (alphaAsset != null && (totalBalance = alphaAsset.getTotalBalance()) != null) {
            strM89950x = C41014a.m89950x(C41014a.m89940n(totalBalance, asset.getBaseCurrency()), null, null, 0, false, true, false, true, 47, null);
        }
        accountInfoHeaderView.m19942B(asset, strM66669i, C27041f.m66669i(strM89950x, "--"));
    }

    /* JADX INFO: renamed from: f */
    public final void m15293f() {
        AccountInfoHeaderView accountInfoHeaderView;
        KcPrimaryButton kcPrimaryButton;
        KcPrimaryButton kcPrimaryButton2;
        C44771g2 binding = getBinding();
        if (binding != null && (kcPrimaryButton2 = binding.f99968c) != null) {
            C27046k.m66711z(kcPrimaryButton2, 0L, new Function0() { // from class: com.kubi.assets.alpha.p
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AlphaHeaderView.m15288g();
                }
            }, 1, null);
        }
        C44771g2 binding2 = getBinding();
        if (binding2 != null && (kcPrimaryButton = binding2.f99969d) != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.assets.alpha.q
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AlphaHeaderView.m15289h();
                }
            }, 1, null);
        }
        C44771g2 binding3 = getBinding();
        if (binding3 != null && (accountInfoHeaderView = binding3.f99967b) != null) {
            AccountInfoHeaderView.m19940y(accountInfoHeaderView, new Action() { // from class: com.kubi.assets.alpha.r
                @Override // io.reactivex.functions.Action
                public final void run() {
                    AlphaHeaderView.m15290i();
                }
            }, null, R$drawable.ic2_history_20, GravityCompat.END, 0, null, false, false, 242, null);
        }
    }

    @Nullable
    public final AccountInfoHeaderView getAccountInfoHeader() {
        C44771g2 binding = getBinding();
        if (binding != null) {
            return binding.f99967b;
        }
        return null;
    }
}
