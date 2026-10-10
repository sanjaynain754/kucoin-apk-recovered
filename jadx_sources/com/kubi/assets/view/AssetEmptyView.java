package com.kubi.assets.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.kubi.assets.R$layout;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import org.jetbrains.annotations.NotNull;
import p637ta.C44803k2;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: AssetEmptyView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/assets/view/AssetEmptyView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", JAnalysisConstants.EVENT_ATTRIBUTES, "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/kubi/assets/databinding/AssetViewEmptyBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetViewEmptyBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "setTipAndIcon", "", "tip", "", "resId", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetEmptyView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetEmptyView.kt\ncom/kubi/assets/view/AssetEmptyView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 AssetEx.kt\ncom/kubi/assets/AssetExKt\n*L\n1#1,38:1\n52#2:39\n80#2,7:40\n51#3,3:47\n*S KotlinDebug\n*F\n+ 1 AssetEmptyView.kt\ncom/kubi/assets/view/AssetEmptyView\n*L\n21#1:39\n21#1:40,7\n31#1:47,3\n*E\n"})
public final class AssetEmptyView extends LinearLayout {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ KProperty<Object>[] f19074c = {Reflection.property1(new PropertyReference1Impl(AssetEmptyView.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetViewEmptyBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f19075b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetEmptyView(@NotNull Context context, @NotNull AttributeSet attributes) {
        super(context, attributes);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f19075b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C44803k2>() { // from class: com.kubi.assets.view.AssetEmptyView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44803k2 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C44803k2.m99126a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.asset_view_empty, this);
    }

    private final C44803k2 getBinding() {
        return (C44803k2) this.f19075b.getValue(this, f19074c[0]);
    }
}
