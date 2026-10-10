package com.kubi.assets.main.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.R$layout;
import com.kubi.assets.entity.MainRecommendDataItem;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.sdk.widget.shape.view.ShapeTextView;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.core.ViewExtKt;
import gf.C37890n;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44909z2;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: MainSubRecommendView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/assets/main/view/MainSubRecommendView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/kubi/assets/databinding/BassetsItemMainRecommendSubBinding;", "getBinding", "()Lcom/kubi/assets/databinding/BassetsItemMainRecommendSubBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "setData", "", "data", "Lcom/kubi/assets/entity/MainRecommendDataItem;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMainSubRecommendView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainSubRecommendView.kt\ncom/kubi/assets/main/view/MainSubRecommendView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,45:1\n41#2:46\n65#2:47\n80#2,7:48\n*S KotlinDebug\n*F\n+ 1 MainSubRecommendView.kt\ncom/kubi/assets/main/view/MainSubRecommendView\n*L\n27#1:46\n27#1:47\n27#1:48,7\n*E\n"})
public final class MainSubRecommendView extends ConstraintLayout {

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ KProperty<Object>[] f17971o = {Reflection.property1(new PropertyReference1Impl(MainSubRecommendView.class, "binding", "getBinding()Lcom/kubi/assets/databinding/BassetsItemMainRecommendSubBinding;", 0))};

    /* JADX INFO: renamed from: n */
    @NotNull
    public final InterfaceC24293a f17972n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MainSubRecommendView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MainSubRecommendView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final C44909z2 getBinding() {
        return (C44909z2) this.f17972n.getValue(this, f17971o[0]);
    }

    public /* synthetic */ MainSubRecommendView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void setData(@Nullable MainRecommendDataItem data) {
        String currency;
        String iconUrl;
        String productName;
        String yieldDesc;
        String yield;
        String category;
        ViewExtKt.m66594y(this);
        C37890n c37890n = C37890n.f85269a;
        String category2 = null;
        if (data != null) {
            currency = data.getCurrency();
        } else {
            currency = null;
        }
        CoinInfoEntity coinInfoEntityM85613u = c37890n.m85613u(C27041f.m66668h(currency));
        C44909z2 binding = getBinding();
        if (binding != null) {
            Context context = getContext();
            if (coinInfoEntityM85613u != null) {
                iconUrl = coinInfoEntityM85613u.getIconUrl();
            } else {
                iconUrl = null;
            }
            C24277v.m58540e(context, iconUrl, binding.f101237b);
            BaseTextView baseTextView = binding.f101241f;
            if (data != null) {
                productName = data.getProductName();
            } else {
                productName = null;
            }
            baseTextView.setText(C27041f.m66668h(productName));
            BaseTextView baseTextView2 = binding.f101239d;
            if (data != null) {
                yieldDesc = data.getYieldDesc();
            } else {
                yieldDesc = null;
            }
            baseTextView2.setText(C27041f.m66668h(yieldDesc));
            BaseTextView baseTextView3 = binding.f101238c;
            if (data != null) {
                yield = data.getYield();
            } else {
                yield = null;
            }
            baseTextView3.setText(C42828b.m93903d(C27041f.m66668h(yield)));
            ShapeTextView shapeTextView = binding.f101240e;
            if (data != null) {
                category2 = data.getCategory();
            }
            shapeTextView.setText(C27041f.m66668h(category2));
            ShapeTextView tvLabel = binding.f101240e;
            Intrinsics.checkNotNullExpressionValue(tvLabel, "tvLabel");
            boolean z11 = false;
            if (data != null && (category = data.getCategory()) != null && category.length() > 0) {
                z11 = true;
            }
            AssetExKt.m15138z(tvLabel, z11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MainSubRecommendView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f17972n = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C44909z2>() { // from class: com.kubi.assets.main.view.MainSubRecommendView$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44909z2 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C44909z2.m99342a(C45682f.m100801b(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.bassets_item_main_recommend_sub, this);
    }
}
