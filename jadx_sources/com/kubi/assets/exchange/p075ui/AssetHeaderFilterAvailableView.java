package com.kubi.assets.exchange.p075ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.SmallEntity;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44900y0;
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

/* JADX INFO: compiled from: AssetHeaderFilterAvailableView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/assets/exchange/ui/AssetHeaderFilterAvailableView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/kubi/assets/databinding/AssetHeaderFilterAvailableBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetHeaderFilterAvailableBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetHeaderFilterAvailableView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetHeaderFilterAvailableView.kt\ncom/kubi/assets/exchange/ui/AssetHeaderFilterAvailableView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,27:1\n41#2:28\n65#2:29\n80#2,7:30\n*S KotlinDebug\n*F\n+ 1 AssetHeaderFilterAvailableView.kt\ncom/kubi/assets/exchange/ui/AssetHeaderFilterAvailableView\n*L\n21#1:28\n21#1:29\n21#1:30,7\n*E\n"})
public final class AssetHeaderFilterAvailableView extends ConstraintLayout {

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ KProperty<Object>[] f17251o = {Reflection.property1(new PropertyReference1Impl(AssetHeaderFilterAvailableView.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetHeaderFilterAvailableBinding;", 0))};

    /* JADX INFO: renamed from: n */
    @NotNull
    public final InterfaceC24293a f17252n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AssetHeaderFilterAvailableView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AssetHeaderFilterAvailableView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final C44900y0 getBinding() {
        return (C44900y0) this.f17252n.getValue(this, f17251o[0]);
    }

    public /* synthetic */ AssetHeaderFilterAvailableView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AssetHeaderFilterAvailableView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        BaseTextView baseTextView;
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f17252n = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C44900y0>() { // from class: com.kubi.assets.exchange.ui.AssetHeaderFilterAvailableView$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44900y0 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C44900y0.m99324a(C45682f.m100801b(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.asset_header_filter_available, this);
        C44900y0 binding = getBinding();
        if (binding == null || (baseTextView = binding.f101167b) == null) {
            return;
        }
        int i12 = R$string.kc_convert_less_balance;
        SmallEntity smallEntityM19167k = AssetsHelper.f18684a.m19167k();
        baseTextView.setText(context.getString(i12, smallEntityM19167k != null ? smallEntityM19167k.showKcsString() : null));
    }
}
