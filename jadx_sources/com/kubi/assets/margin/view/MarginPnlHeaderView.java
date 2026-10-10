package com.kubi.assets.margin.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.BidiFormatter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.graphics.ColorUtils;
import com.kubi.assets.R$color;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.MarginPnlEntity;
import com.kubi.assets.entity.SpotAccountOverviewEntity;
import com.kubi.assets.margin.view.MarginPnlHeaderView;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33820nf;
import java.math.BigDecimal;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p311hf.C38184b;
import p402kf.C41014a;
import p637ta.C44767f6;
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

/* JADX INFO: compiled from: MarginPnlHeaderView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011J\u0014\u0010\u0012\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011J\u0012\u0010\u0013\u001a\u00020\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0012\u0010\u0016\u001a\u00020\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0017R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/assets/margin/view/MarginPnlHeaderView;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/kubi/assets/databinding/ViewMarginPnlAssetsHeaderBinding;", "getBinding", "()Lcom/kubi/assets/databinding/ViewMarginPnlAssetsHeaderBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "setTitleClickListener", "", "onClick", "Lkotlin/Function0;", "setPnlClickListener", "bindMarginPnl", "pnlEntity", "Lcom/kubi/assets/entity/MarginPnlEntity;", "bindSpotPnl", "Lcom/kubi/assets/entity/SpotAccountOverviewEntity;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nMarginPnlHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginPnlHeaderView.kt\ncom/kubi/assets/margin/view/MarginPnlHeaderView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,166:1\n52#2:167\n80#2,7:168\n1#3:175\n*S KotlinDebug\n*F\n+ 1 MarginPnlHeaderView.kt\ncom/kubi/assets/margin/view/MarginPnlHeaderView\n*L\n42#1:167\n42#1:168,7\n*E\n"})
public final class MarginPnlHeaderView extends LinearLayoutCompat {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ KProperty<Object>[] f18104c = {Reflection.property1(new PropertyReference1Impl(MarginPnlHeaderView.class, "binding", "getBinding()Lcom/kubi/assets/databinding/ViewMarginPnlAssetsHeaderBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f18105b;

    /* JADX INFO: renamed from: e */
    public final void m18050e(@Nullable MarginPnlEntity marginPnlEntity) {
        final MarginPnlHeaderView marginPnlHeaderView;
        ImageView imageView;
        ImageView imageView2;
        ShowHideTextView showHideTextView;
        ShowHideTextView showHideTextView2;
        AppCompatImageView appCompatImageView;
        ImageView imageView3;
        ShowHideTextView showHideTextView3;
        ShowHideTextView showHideTextView4;
        AppCompatImageView appCompatImageView2;
        ImageView imageView4;
        ShowHideTextView showHideTextView5;
        BigDecimal bigDecimalAbs;
        boolean z11 = C27039d.m66647g(marginPnlEntity != null ? marginPnlEntity.getTodayPnlAmount() : null) == 0.0d;
        if (marginPnlEntity != null) {
            if (Intrinsics.areEqual(marginPnlEntity.getBaseCurrency(), AssetsDepend.f18689a.m19189j().d0().getBalanceCurrency())) {
                ViewExtKt.m66594y(this);
                String str = C27039d.m66647g(marginPnlEntity.getTodayPnlAmount()) > 0.0d ? "+" : C33820nf.f71144W;
                BigDecimal todayPnlAmount = marginPnlEntity.getTodayPnlAmount();
                String strM66669i = C27041f.m66669i((todayPnlAmount == null || (bigDecimalAbs = todayPnlAmount.abs()) == null) ? null : C41014a.m89950x(C41014a.m89940n(bigDecimalAbs, C38184b.f85884a.m86146a()), null, null, 0, false, false, false, false, 127, null), "--");
                BidiFormatter bidiFormatter = BidiFormatter.getInstance();
                BigDecimal todayPnlRatio = marginPnlEntity.getTodayPnlRatio();
                String strUnicodeWrap = bidiFormatter.unicodeWrap(C42828b.m93903d(C27039d.m66642b(todayPnlRatio != null ? todayPnlRatio.abs() : null)));
                if (z11) {
                    C44767f6 binding = getBinding();
                    if (binding != null && (showHideTextView5 = binding.f99941e) != null) {
                        showHideTextView5.setText(C27017c.f54310a.m66516f(R$string.kc_assets_pnl_updating, new Object[0]));
                    }
                    C44767f6 binding2 = getBinding();
                    if (binding2 != null && (imageView4 = binding2.f99938b) != null) {
                        ViewExtKt.m66577h(imageView4);
                    }
                    C44767f6 binding3 = getBinding();
                    if (binding3 != null && (appCompatImageView2 = binding3.f99939c) != null) {
                        ViewExtKt.m66594y(appCompatImageView2);
                    }
                    C44767f6 binding4 = getBinding();
                    if (binding4 != null && (showHideTextView4 = binding4.f99941e) != null) {
                        showHideTextView4.setTextSize(13.0f);
                    }
                } else {
                    C44767f6 binding5 = getBinding();
                    if (binding5 != null && (showHideTextView3 = binding5.f99941e) != null) {
                        showHideTextView3.setText(str + strM66669i + '(' + strUnicodeWrap + ')');
                    }
                    C44767f6 binding6 = getBinding();
                    if (binding6 != null && (imageView3 = binding6.f99938b) != null) {
                        ViewExtKt.m66594y(imageView3);
                    }
                    C44767f6 binding7 = getBinding();
                    if (binding7 != null && (appCompatImageView = binding7.f99939c) != null) {
                        ViewExtKt.m66577h(appCompatImageView);
                    }
                    C44767f6 binding8 = getBinding();
                    if (binding8 != null && (showHideTextView2 = binding8.f99941e) != null) {
                        showHideTextView2.setTextSize(16.0f);
                    }
                }
            }
            marginPnlHeaderView = this;
        } else {
            marginPnlHeaderView = this;
            new Function0() { // from class: cb.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginPnlHeaderView.m18046f(this.f5461b);
                }
            };
        }
        Context context = marginPnlHeaderView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iM54278c = C22890g.m54278c(context, C27039d.m66647g(marginPnlEntity != null ? marginPnlEntity.getTodayPnlAmount() : null), z11 ? R$color.c_text40 : R$color.c_text);
        C44767f6 binding9 = marginPnlHeaderView.getBinding();
        if (binding9 != null && (showHideTextView = binding9.f99941e) != null) {
            showHideTextView.setTextColor(iM54278c);
        }
        if (z11) {
            iM54278c = marginPnlHeaderView.getResources().getColor(R$color.c_icon60);
        }
        C44767f6 binding10 = marginPnlHeaderView.getBinding();
        if (binding10 != null && (imageView2 = binding10.f99938b) != null) {
            C27046k.m66701p(imageView2, iM54278c);
        }
        C44767f6 binding11 = marginPnlHeaderView.getBinding();
        if (binding11 == null || (imageView = binding11.f99938b) == null) {
            return;
        }
        imageView.setBackground(C22890g.m54287l(ColorUtils.setAlphaComponent(iM54278c, 20), 4.0f));
    }

    /* JADX INFO: renamed from: g */
    public final void m18051g(@Nullable SpotAccountOverviewEntity spotAccountOverviewEntity) {
        Boolean boolValueOf;
        final MarginPnlHeaderView marginPnlHeaderView;
        ImageView imageView;
        ImageView imageView2;
        ShowHideTextView showHideTextView;
        String strM66669i;
        BigDecimal bigDecimalM66536f;
        BigDecimal bigDecimalAbs;
        ShowHideTextView showHideTextView2;
        AppCompatImageView appCompatImageView;
        ImageView imageView3;
        ShowHideTextView showHideTextView3;
        ShowHideTextView showHideTextView4;
        AppCompatImageView appCompatImageView2;
        ImageView imageView4;
        ShowHideTextView showHideTextView5;
        String todayPnl;
        BigDecimal bigDecimalM66536f2;
        if (spotAccountOverviewEntity == null || (todayPnl = spotAccountOverviewEntity.getTodayPnl()) == null || (bigDecimalM66536f2 = DowngradeExKt.m66536f(todayPnl)) == null) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(C27039d.m66647g(bigDecimalM66536f2) == 0.0d);
        }
        boolean z11 = boolValueOf == null;
        if (spotAccountOverviewEntity != null) {
            if (Intrinsics.areEqual(spotAccountOverviewEntity.getBaseCurrency(), AssetsDepend.f18689a.m19189j().d0().getBalanceCurrency())) {
                ViewExtKt.m66594y(this);
                String str = C27039d.m66647g(DowngradeExKt.m66536f(spotAccountOverviewEntity.getTodayPnl())) > 0.0d ? "+" : C33820nf.f71144W;
                Boolean bool = Boolean.TRUE;
                if (Intrinsics.areEqual(boolValueOf, bool)) {
                    strM66669i = "0.00";
                } else {
                    String todayPnl2 = spotAccountOverviewEntity.getTodayPnl();
                    strM66669i = C27041f.m66669i((todayPnl2 == null || (bigDecimalM66536f = DowngradeExKt.m66536f(todayPnl2)) == null || (bigDecimalAbs = bigDecimalM66536f.abs()) == null) ? null : C41014a.m89950x(C41014a.m89940n(bigDecimalAbs, C38184b.f85884a.m86146a()), null, null, 0, false, false, false, false, 127, null), "--");
                }
                BidiFormatter bidiFormatter = BidiFormatter.getInstance();
                String todayRoe = spotAccountOverviewEntity.getTodayRoe();
                String strUnicodeWrap = bidiFormatter.unicodeWrap(C42828b.m93903d(C27039d.m66642b(todayRoe != null ? DowngradeExKt.m66536f(todayRoe) : null)));
                if (z11) {
                    C44767f6 binding = getBinding();
                    if (binding != null && (showHideTextView5 = binding.f99941e) != null) {
                        showHideTextView5.setText(C27017c.f54310a.m66516f(R$string.kc_assets_pnl_updating, new Object[0]));
                    }
                    C44767f6 binding2 = getBinding();
                    if (binding2 != null && (imageView4 = binding2.f99938b) != null) {
                        ViewExtKt.m66577h(imageView4);
                    }
                    C44767f6 binding3 = getBinding();
                    if (binding3 != null && (appCompatImageView2 = binding3.f99939c) != null) {
                        ViewExtKt.m66594y(appCompatImageView2);
                    }
                    C44767f6 binding4 = getBinding();
                    if (binding4 != null && (showHideTextView4 = binding4.f99941e) != null) {
                        showHideTextView4.setTextSize(13.0f);
                    }
                } else {
                    C44767f6 binding5 = getBinding();
                    if (binding5 != null && (showHideTextView3 = binding5.f99941e) != null) {
                        if (!Intrinsics.areEqual(boolValueOf, bool)) {
                            strM66669i = str + strM66669i + '(' + strUnicodeWrap + ')';
                        }
                        showHideTextView3.setText(strM66669i);
                    }
                    C44767f6 binding6 = getBinding();
                    if (binding6 != null && (imageView3 = binding6.f99938b) != null) {
                        ViewExtKt.m66594y(imageView3);
                    }
                    C44767f6 binding7 = getBinding();
                    if (binding7 != null && (appCompatImageView = binding7.f99939c) != null) {
                        ViewExtKt.m66577h(appCompatImageView);
                    }
                    C44767f6 binding8 = getBinding();
                    if (binding8 != null && (showHideTextView2 = binding8.f99941e) != null) {
                        showHideTextView2.setTextSize(16.0f);
                    }
                }
            }
            marginPnlHeaderView = this;
        } else {
            marginPnlHeaderView = this;
            new Function0() { // from class: cb.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginPnlHeaderView.m18047h(this.f5464b);
                }
            };
        }
        Context context = marginPnlHeaderView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iM54278c = C22890g.m54278c(context, C27039d.m66647g(DowngradeExKt.m66536f(spotAccountOverviewEntity != null ? spotAccountOverviewEntity.getTodayPnl() : null)), z11 ? R$color.c_text40 : R$color.c_text);
        C44767f6 binding9 = marginPnlHeaderView.getBinding();
        if (binding9 != null && (showHideTextView = binding9.f99941e) != null) {
            showHideTextView.setTextColor(iM54278c);
        }
        if (z11) {
            iM54278c = marginPnlHeaderView.getResources().getColor(R$color.c_icon60);
        }
        C44767f6 binding10 = marginPnlHeaderView.getBinding();
        if (binding10 != null && (imageView2 = binding10.f99938b) != null) {
            C27046k.m66701p(imageView2, iM54278c);
        }
        C44767f6 binding11 = marginPnlHeaderView.getBinding();
        if (binding11 == null || (imageView = binding11.f99938b) == null) {
            return;
        }
        imageView.setBackground(C22890g.m54287l(ColorUtils.setAlphaComponent(iM54278c, 20), 4.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginPnlHeaderView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f18105b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C44767f6>() { // from class: com.kubi.assets.margin.view.MarginPnlHeaderView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44767f6 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C44767f6.m99049a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.view_margin_pnl_assets_header, this);
        ViewExtKt.m66577h(this);
    }

    private final C44767f6 getBinding() {
        return (C44767f6) this.f18105b.getValue(this, f18104c[0]);
    }

    public final void setPnlClickListener(@NotNull final Function0<Unit> onClick) {
        LinearLayoutCompat linearLayoutCompat;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        C44767f6 binding = getBinding();
        if (binding == null || (linearLayoutCompat = binding.f99940d) == null) {
            return;
        }
        C27046k.m66711z(linearLayoutCompat, 0L, new Function0() { // from class: cb.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginPnlHeaderView.m18048i(onClick);
            }
        }, 1, null);
    }

    public final void setTitleClickListener(@NotNull final Function0<Unit> onClick) {
        DashTextView dashTextView;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        C44767f6 binding = getBinding();
        if (binding == null || (dashTextView = binding.f99942f) == null) {
            return;
        }
        C27046k.m66711z(dashTextView, 0L, new Function0() { // from class: cb.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginPnlHeaderView.m18049j(onClick);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m18046f(MarginPnlHeaderView marginPnlHeaderView) {
        AppCompatImageView appCompatImageView;
        C44767f6 binding = marginPnlHeaderView.getBinding();
        if (binding != null && (appCompatImageView = binding.f99939c) != null) {
            ViewExtKt.m66577h(appCompatImageView);
            return Unit.INSTANCE;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m18047h(MarginPnlHeaderView marginPnlHeaderView) {
        AppCompatImageView appCompatImageView;
        C44767f6 binding = marginPnlHeaderView.getBinding();
        if (binding != null && (appCompatImageView = binding.f99939c) != null) {
            ViewExtKt.m66577h(appCompatImageView);
            return Unit.INSTANCE;
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m18048i(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m18049j(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
