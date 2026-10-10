package com.kubi.assets.overview.ongoing;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.blankj.utilcode.util.C5275i0;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.C9459a;
import com.kubi.assets.R$layout;
import com.kubi.assets.finance.EarnUrlConfig;
import com.kubi.assets.overview.OverviewAnalyticsReporter;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.data.coin.AccountType;
import com.kubi.host.HostManager;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KcLabelView;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.util.C24271s1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import f00.C37304a;
import g00.InterfaceC37754f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p637ta.C44839p2;
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
import w00.C45682f;

/* JADX INFO: compiled from: OnGoingRecommendView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0014J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0007H\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0002R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/assets/overview/ongoing/OnGoingRecommendView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/kubi/assets/databinding/AssetViewOngoingEmptyBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetViewOngoingEmptyBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "initView", "", "onAttachedToWindow", "onRtlPropertiesChanged", ViewProps.LAYOUT_DIRECTION, "updateCopyTradingMarkTranslation", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOnGoingRecommendView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnGoingRecommendView.kt\ncom/kubi/assets/overview/ongoing/OnGoingRecommendView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,119:1\n52#2:120\n80#2,7:121\n*S KotlinDebug\n*F\n+ 1 OnGoingRecommendView.kt\ncom/kubi/assets/overview/ongoing/OnGoingRecommendView\n*L\n43#1:120\n43#1:121,7\n*E\n"})
public final class OnGoingRecommendView extends FrameLayout {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ KProperty<Object>[] f18420c = {Reflection.property1(new PropertyReference1Impl(OnGoingRecommendView.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetViewOngoingEmptyBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f18421b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OnGoingRecommendView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OnGoingRecommendView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m18752g() {
        Router.f46192a.m56184f("kumex/trade").m4048k();
        OverviewAnalyticsReporter.f18247a.m18422t("goFuture");
        return Unit.INSTANCE;
    }

    private final C44839p2 getBinding() {
        return (C44839p2) this.f18421b.getValue(this, f18420c[0]);
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m18753h() {
        InterfaceC37754f.a.m85135g(C37304a.f82764a, null, null, C43852m.m96601m("B1overview", "ongoingArea", "goMargin"), null, null, 27, null);
        OverviewAnalyticsReporter.f18247a.m18422t("goMargin");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m18754i() {
        C24271s1.m58532d(Router.f46192a.m56184f(HostManager.a.j() + "?appNeedLang=true"), "B1overview", "ongoingArea", "goBot").m4048k();
        OverviewAnalyticsReporter.f18247a.m18422t("goBot");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m18755j() {
        C24271s1.m58532d(Router.f46192a.m56184f(EarnUrlConfig.f17409a.m16754d() + "?appNeedLang=true"), "B1overview", "ongoingArea", "goEarn").m4048k();
        OverviewAnalyticsReporter.f18247a.m18422t("goEarn");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m18756k() {
        InterfaceC37754f.a.m85138j(C37304a.f82764a, "copyTrading", null, "copyTradingJump.myCopy", null, null, null, null, 122, null);
        OverviewAnalyticsReporter.f18247a.m18422t("goCopyTrading");
        return Unit.INSTANCE;
    }

    public /* synthetic */ OnGoingRecommendView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: f */
    public final void m18757f() {
        LinearLayoutCompat linearLayoutCompat;
        BaseTextView baseTextView;
        LinearLayoutCompat linearLayoutCompat2;
        LinearLayoutCompat linearLayoutCompat3;
        BaseTextView baseTextView2;
        LinearLayoutCompat linearLayoutCompat4;
        LinearLayoutCompat linearLayoutCompat5;
        LinearLayoutCompat linearLayoutCompat6;
        LinearLayoutCompat linearLayoutCompat7;
        LinearLayoutCompat linearLayoutCompat8;
        LinearLayoutCompat linearLayoutCompat9;
        LinearLayoutCompat linearLayoutCompat10;
        LinearLayoutCompat linearLayoutCompat11;
        m18758l();
        if (C9459a.m15238a()) {
            C44839p2 binding = getBinding();
            if (binding != null && (linearLayoutCompat11 = binding.f100594e) != null) {
                ViewExtKt.m66594y(linearLayoutCompat11);
            }
        } else {
            C44839p2 binding2 = getBinding();
            if (binding2 != null && (linearLayoutCompat = binding2.f100594e) != null) {
                ViewExtKt.m66577h(linearLayoutCompat);
            }
        }
        C44839p2 binding3 = getBinding();
        if (binding3 != null && (linearLayoutCompat10 = binding3.f100595f) != null) {
            AssetExKt.m15138z(linearLayoutCompat10, C24129b.m58030b(SiteVisibleConfigKey.Margin));
        }
        C44839p2 binding4 = getBinding();
        if (binding4 != null && (linearLayoutCompat9 = binding4.f100591b) != null) {
            AssetExKt.m15138z(linearLayoutCompat9, C24129b.m58030b(SiteVisibleConfigKey.TradingBot));
        }
        C44839p2 binding5 = getBinding();
        if (binding5 != null && (linearLayoutCompat8 = binding5.f100593d) != null) {
            AssetExKt.m15138z(linearLayoutCompat8, C24129b.m58030b(SiteVisibleConfigKey.Financing));
        }
        C44839p2 binding6 = getBinding();
        if (binding6 != null && (linearLayoutCompat7 = binding6.f100592c) != null) {
            AssetExKt.m15138z(linearLayoutCompat7, AssetsDepend.f18689a.m19181a().mo20634o());
        }
        C44839p2 binding7 = getBinding();
        if (binding7 != null && (linearLayoutCompat6 = binding7.f100594e) != null) {
            C27046k.m66711z(linearLayoutCompat6, 0L, new Function0() { // from class: com.kubi.assets.overview.ongoing.a0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OnGoingRecommendView.m18752g();
                }
            }, 1, null);
        }
        C44839p2 binding8 = getBinding();
        if (binding8 != null && (linearLayoutCompat5 = binding8.f100595f) != null) {
            C27046k.m66711z(linearLayoutCompat5, 0L, new Function0() { // from class: com.kubi.assets.overview.ongoing.b0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OnGoingRecommendView.m18753h();
                }
            }, 1, null);
        }
        C44839p2 binding9 = getBinding();
        if (binding9 != null && (linearLayoutCompat4 = binding9.f100591b) != null) {
            C27046k.m66711z(linearLayoutCompat4, 0L, new Function0() { // from class: com.kubi.assets.overview.ongoing.c0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OnGoingRecommendView.m18754i();
                }
            }, 1, null);
        }
        C44839p2 binding10 = getBinding();
        if (binding10 != null && (baseTextView2 = binding10.f100597h) != null) {
            baseTextView2.setText(C27017c.f54310a.m66516f(AccountType.FINANCE.getNickNameRes(), new Object[0]));
        }
        C44839p2 binding11 = getBinding();
        if (binding11 != null && (linearLayoutCompat3 = binding11.f100593d) != null) {
            C27046k.m66711z(linearLayoutCompat3, 0L, new Function0() { // from class: com.kubi.assets.overview.ongoing.d0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OnGoingRecommendView.m18755j();
                }
            }, 1, null);
        }
        C44839p2 binding12 = getBinding();
        if (binding12 != null && (linearLayoutCompat2 = binding12.f100592c) != null) {
            C27046k.m66711z(linearLayoutCompat2, 0L, new Function0() { // from class: com.kubi.assets.overview.ongoing.e0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OnGoingRecommendView.m18756k();
                }
            }, 1, null);
        }
        C44839p2 binding13 = getBinding();
        if (binding13 != null && (baseTextView = binding13.f100597h) != null) {
            baseTextView.setText(C27017c.f54310a.m66516f(AccountType.FINANCE.getNickNameRes(), new Object[0]));
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m18758l() {
        float f11;
        KcLabelView kcLabelView;
        KcLabelView kcLabelView2;
        if (!AssetExKt.m15128p(this) && getResources().getConfiguration().getLayoutDirection() != 1) {
            f11 = 25.0f;
        } else {
            f11 = -15.0f;
        }
        float fM6236a = C5275i0.m6236a(f11);
        float f12 = -C5275i0.m6236a(5.0f);
        C44839p2 binding = getBinding();
        if (binding != null && (kcLabelView2 = binding.f100596g) != null) {
            kcLabelView2.setTranslationX(fM6236a);
        }
        C44839p2 binding2 = getBinding();
        if (binding2 != null && (kcLabelView = binding2.f100596g) != null) {
            kcLabelView.setTranslationY(f12);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m18758l();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int layoutDirection) {
        super.onRtlPropertiesChanged(layoutDirection);
        m18758l();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OnGoingRecommendView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f18421b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C44839p2>() { // from class: com.kubi.assets.overview.ongoing.OnGoingRecommendView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44839p2 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C44839p2.m99204a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.asset_view_ongoing_empty, this);
        m18757f();
    }
}
