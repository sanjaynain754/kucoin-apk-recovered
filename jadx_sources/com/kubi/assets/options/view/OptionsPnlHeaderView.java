package com.kubi.assets.options.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.BidiFormatter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.graphics.ColorUtils;
import com.kubi.assets.R$color;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.OptionsOverviewEntity;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.assets.view.C11273q;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import gf.C37885i;
import java.math.BigDecimal;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44767f6;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: OptionsPnlHeaderView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/assets/options/view/OptionsPnlHeaderView;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/kubi/assets/databinding/ViewMarginPnlAssetsHeaderBinding;", "getBinding", "()Lcom/kubi/assets/databinding/ViewMarginPnlAssetsHeaderBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "bindPnlData", "", "optionsOverviewEntity", "Lcom/kubi/assets/entity/OptionsOverviewEntity;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nOptionsPnlHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OptionsPnlHeaderView.kt\ncom/kubi/assets/options/view/OptionsPnlHeaderView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,93:1\n52#2:94\n80#2,7:95\n*S KotlinDebug\n*F\n+ 1 OptionsPnlHeaderView.kt\ncom/kubi/assets/options/view/OptionsPnlHeaderView\n*L\n39#1:94\n39#1:95,7\n*E\n"})
public final class OptionsPnlHeaderView extends LinearLayoutCompat {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ KProperty<Object>[] f18174c = {Reflection.property1(new PropertyReference1Impl(OptionsPnlHeaderView.class, "binding", "getBinding()Lcom/kubi/assets/databinding/ViewMarginPnlAssetsHeaderBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f18175b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionsPnlHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        DashTextView dashTextView;
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f18175b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C44767f6>() { // from class: com.kubi.assets.options.view.OptionsPnlHeaderView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44767f6 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C44767f6.m99049a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.view_margin_pnl_assets_header, this);
        ViewExtKt.m66577h(this);
        C44767f6 binding = getBinding();
        if (binding == null || (dashTextView = binding.f99942f) == null) {
            return;
        }
        dashTextView.setText(R$string.unrealised_pnl);
    }

    private final C44767f6 getBinding() {
        return (C44767f6) this.f18175b.getValue(this, f18174c[0]);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: a */
    public final void m18191a(@Nullable OptionsOverviewEntity optionsOverviewEntity) {
        ShowHideTextView showHideTextView;
        ImageView imageView;
        ImageView imageView2;
        ShowHideTextView showHideTextView2;
        ShowHideTextView showHideTextView3;
        ImageView imageView3;
        DashTextView dashTextView;
        if (optionsOverviewEntity == null || !Intrinsics.areEqual(optionsOverviewEntity.getCurrency(), AssetsDepend.f18689a.m19189j().d0().getBalanceCurrency())) {
            return;
        }
        ViewExtKt.m66594y(this);
        C44767f6 binding = getBinding();
        if (binding != null && (dashTextView = binding.f99942f) != null) {
            dashTextView.setNeedDash(false);
        }
        C44767f6 binding2 = getBinding();
        if (binding2 != null && (imageView3 = binding2.f99938b) != null) {
            imageView3.setVisibility(8);
        }
        boolean z11 = C27039d.m66647g(optionsOverviewEntity.getUnrealizedProfitAndLossAmount()) == 0.0d;
        boolean z12 = C27039d.m66647g(optionsOverviewEntity.getUnrealizedProfitAndLossRate()) > 0.0d;
        String str = C27039d.m66647g(optionsOverviewEntity.getUnrealizedProfitAndLossAmount()) > 0.0d ? "+" : "";
        String str2 = z12 ? "+" : "";
        BigDecimal unrealizedProfitAndLossAmount = optionsOverviewEntity.getUnrealizedProfitAndLossAmount();
        String strM66669i = C27041f.m66669i(unrealizedProfitAndLossAmount != null ? C37885i.m85562a(unrealizedProfitAndLossAmount, optionsOverviewEntity.getCurrency(), C11273q.m20046b(optionsOverviewEntity.getCurrency())) : null, "--");
        String strUnicodeWrap = BidiFormatter.getInstance().unicodeWrap(C42828b.m93903d(C27039d.m66642b(optionsOverviewEntity.getUnrealizedProfitAndLossRate())));
        if (z11) {
            C44767f6 binding3 = getBinding();
            if (binding3 != null && (showHideTextView3 = binding3.f99941e) != null) {
                showHideTextView3.setText(strM66669i);
            }
        } else {
            C44767f6 binding4 = getBinding();
            if (binding4 != null && (showHideTextView = binding4.f99941e) != null) {
                showHideTextView.setText(str + strM66669i + '(' + str2 + strUnicodeWrap + ')');
            }
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iM54278c = C22890g.m54278c(context, C27039d.m66647g(optionsOverviewEntity.getUnrealizedProfitAndLossRate()), R$color.c_text);
        C44767f6 binding5 = getBinding();
        if (binding5 != null && (showHideTextView2 = binding5.f99941e) != null) {
            showHideTextView2.setTextColor(iM54278c);
        }
        if (z11) {
            iM54278c = getResources().getColor(R$color.c_icon60);
        }
        C44767f6 binding6 = getBinding();
        if (binding6 != null && (imageView2 = binding6.f99938b) != null) {
            C27046k.m66701p(imageView2, iM54278c);
        }
        C44767f6 binding7 = getBinding();
        if (binding7 == null || (imageView = binding7.f99938b) == null) {
            return;
        }
        imageView.setBackground(C22890g.m54287l(ColorUtils.setAlphaComponent(iM54278c, 20), 4.0f));
    }
}
