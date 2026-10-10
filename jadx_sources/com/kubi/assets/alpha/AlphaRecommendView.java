package com.kubi.assets.alpha;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.assets.R$layout;
import com.kubi.assets.entity.AlphaTopTokenInfo;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.extensions.C27046k;
import f00.C37304a;
import g00.InterfaceC37754f;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44763f2;
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

/* JADX INFO: compiled from: AlphaRecommendView.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/assets/alpha/AlphaRecommendView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/kubi/assets/databinding/AssetViewAlphaEmptyBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetViewAlphaEmptyBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "adapter", "Lcom/kubi/assets/alpha/AlphaRecommendAdapter;", "bindData", "", "list", "", "Lcom/kubi/assets/entity/AlphaTopTokenInfo;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAlphaRecommendView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlphaRecommendView.kt\ncom/kubi/assets/alpha/AlphaRecommendView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,43:1\n52#2:44\n80#2,7:45\n*S KotlinDebug\n*F\n+ 1 AlphaRecommendView.kt\ncom/kubi/assets/alpha/AlphaRecommendView\n*L\n25#1:44\n25#1:45,7\n*E\n"})
public final class AlphaRecommendView extends FrameLayout {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ KProperty<Object>[] f16438d = {Reflection.property1(new PropertyReference1Impl(AlphaRecommendView.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetViewAlphaEmptyBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f16439b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public AlphaRecommendAdapter f16440c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AlphaRecommendView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AlphaRecommendView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: b */
    public static final Unit m15298b() {
        InterfaceC37754f.a.m85129a(C37304a.f82764a, null, Boolean.TRUE, null, null, null, 29, null);
        return Unit.INSTANCE;
    }

    private final C44763f2 getBinding() {
        return (C44763f2) this.f16439b.getValue(this, f16438d[0]);
    }

    /* JADX INFO: renamed from: c */
    public final void m15299c(@NotNull List<AlphaTopTokenInfo> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f16440c.setNewData(list);
    }

    public /* synthetic */ AlphaRecommendView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AlphaRecommendView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        KcPrimaryButton kcPrimaryButton;
        RecyclerView recyclerView;
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f16439b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C44763f2>() { // from class: com.kubi.assets.alpha.AlphaRecommendView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44763f2 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C44763f2.m99041a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.asset_view_alpha_empty, this);
        this.f16440c = new AlphaRecommendAdapter();
        C44763f2 binding = getBinding();
        if (binding != null && (recyclerView = binding.f99899c) != null) {
            recyclerView.setAdapter(this.f16440c);
        }
        C44763f2 binding2 = getBinding();
        if (binding2 == null || (kcPrimaryButton = binding2.f99898b) == null) {
            return;
        }
        C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.assets.alpha.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaRecommendView.m15298b();
            }
        }, 1, null);
    }
}
