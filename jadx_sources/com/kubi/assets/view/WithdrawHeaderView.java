package com.kubi.assets.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.kubi.assets.R$layout;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CoinAvatarView;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.core.ViewExtKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44806k5;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: WithdrawHeaderView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0006\u0010\u0016\u001a\u00020\u000fR\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/assets/view/WithdrawHeaderView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", JAnalysisConstants.EVENT_ATTRIBUTES, "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/kubi/assets/databinding/KucoinViewWithdrawHeaderBinding;", "getBinding", "()Lcom/kubi/assets/databinding/KucoinViewWithdrawHeaderBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onLoadCoinInfo", "", "coinInfo", "Lcom/kubi/data/entity/CoinInfoEntity;", "title", "", "getContentLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "hideCurrencyArrow", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWithdrawHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithdrawHeaderView.kt\ncom/kubi/assets/view/WithdrawHeaderView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 AssetEx.kt\ncom/kubi/assets/AssetExKt\n*L\n1#1,58:1\n52#2:59\n80#2,7:60\n51#3,3:67\n*S KotlinDebug\n*F\n+ 1 WithdrawHeaderView.kt\ncom/kubi/assets/view/WithdrawHeaderView\n*L\n29#1:59\n29#1:60,7\n40#1:67,3\n*E\n"})
public final class WithdrawHeaderView extends FrameLayout {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ KProperty<Object>[] f19112c = {Reflection.property1(new PropertyReference1Impl(WithdrawHeaderView.class, "binding", "getBinding()Lcom/kubi/assets/databinding/KucoinViewWithdrawHeaderBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f19113b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WithdrawHeaderView(@NotNull Context context, @NotNull AttributeSet attributes) {
        super(context, attributes);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f19113b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C44806k5>() { // from class: com.kubi.assets.view.WithdrawHeaderView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44806k5 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C44806k5.m99132a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.kucoin_view_withdraw_header, this);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m20042c(WithdrawHeaderView withdrawHeaderView, CoinInfoEntity coinInfoEntity, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        withdrawHeaderView.m20044b(coinInfoEntity, str);
    }

    private final C44806k5 getBinding() {
        return (C44806k5) this.f19113b.getValue(this, f19112c[0]);
    }

    /* JADX INFO: renamed from: a */
    public final void m20043a() {
        ImageView imageView;
        C44806k5 binding = getBinding();
        if (binding != null && (imageView = binding.f100306c) != null) {
            ViewExtKt.m66577h(imageView);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m20044b(@Nullable CoinInfoEntity coinInfoEntity, @Nullable String str) {
        String iconUrl;
        String currency;
        String name;
        C44806k5 binding = getBinding();
        if (binding != null) {
            CoinAvatarView coinAvatarView = binding.f100307d;
            Boolean boolValueOf = null;
            if (coinInfoEntity != null) {
                iconUrl = coinInfoEntity.getIconUrl();
            } else {
                iconUrl = null;
            }
            C24277v.m58542g(coinAvatarView, iconUrl);
            BaseTextView baseTextView = binding.f100310g;
            if (coinInfoEntity != null) {
                currency = coinInfoEntity.getCurrency();
            } else {
                currency = null;
            }
            baseTextView.setText(C27041f.m66677q(C27041f.m66668h(currency)));
            BaseTextView baseTextView2 = binding.f100309f;
            if (coinInfoEntity != null) {
                name = coinInfoEntity.getName();
            } else {
                name = null;
            }
            baseTextView2.setText(C27041f.m66668h(name));
            if (str != null && !TextUtils.isEmpty(str)) {
                binding.f100311h.setText(str);
                ImageView ivArrow = binding.f100306c;
                Intrinsics.checkNotNullExpressionValue(ivArrow, "ivArrow");
                ViewExtKt.m66577h(ivArrow);
            }
            LabelView labelView = binding.f100308e;
            if (coinInfoEntity != null) {
                boolValueOf = Boolean.valueOf(coinInfoEntity.isWithdrawEnabled());
            }
            boolean zM66566d = C27025c.m66566d(boolValueOf);
            Intrinsics.checkNotNull(labelView);
            if (zM66566d) {
                ViewExtKt.m66577h(labelView);
            } else {
                ViewExtKt.m66594y(labelView);
            }
        }
    }

    @Nullable
    public final ConstraintLayout getContentLayout() {
        C44806k5 binding = getBinding();
        if (binding != null) {
            return binding.f100305b;
        }
        return null;
    }
}
