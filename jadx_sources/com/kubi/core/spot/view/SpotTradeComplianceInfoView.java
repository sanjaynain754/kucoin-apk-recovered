package com.kubi.core.spot.view;

import af.C0296a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.FragmentManager;
import com.kubi.core.spot.entity.ComplianceInfoEntity;
import com.kubi.core.spot.view.SpotTradeComplianceInfoView;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.sdk.widget.shape.layout.ShapeLinearLayout;
import com.kubi.sdk.widget.shape.view.ShapeTextView;
import com.kubi.tradecorebiz.R$layout;
import com.kubi.tradecorebiz.R$string;
import com.kubi.utils.extensions.C27046k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import v30.C45401p0;
import w00.C45682f;

/* JADX INFO: compiled from: SpotTradeComplianceInfoView.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u001d\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\u000fH\u0002R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/core/spot/view/SpotTradeComplianceInfoView;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/kubi/tradecorebiz/databinding/TradeCoreViewTradeComplianceInfoBinding;", "getBinding", "()Lcom/kubi/tradecorebiz/databinding/TradeCoreViewTradeComplianceInfoBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "showComplianceInfo", "", "complianceInfoEntity", "Lcom/kubi/core/spot/entity/ComplianceInfoEntity;", "setChangeP30", "isShowP30", "changeRate", "", "(ZLjava/lang/Double;)Z", "setQuestionListener", "", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "updateRootViewVisibility", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSpotTradeComplianceInfoView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpotTradeComplianceInfoView.kt\ncom/kubi/core/spot/view/SpotTradeComplianceInfoView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,86:1\n41#2:87\n65#2:88\n80#2,7:89\n1563#3:96\n1634#3,3:97\n254#4:100\n254#4:101\n254#4:102\n254#4:103\n*S KotlinDebug\n*F\n+ 1 SpotTradeComplianceInfoView.kt\ncom/kubi/core/spot/view/SpotTradeComplianceInfoView\n*L\n25#1:87\n25#1:88\n25#1:89,7\n37#1:96\n37#1:97,3\n77#1:100\n78#1:101\n79#1:102\n80#1:103\n*E\n"})
public final class SpotTradeComplianceInfoView extends LinearLayoutCompat {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ KProperty<Object>[] f21287c = {Reflection.property1(new PropertyReference1Impl(SpotTradeComplianceInfoView.class, "binding", "getBinding()Lcom/kubi/tradecorebiz/databinding/TradeCoreViewTradeComplianceInfoBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f21288b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotTradeComplianceInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f21288b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C45401p0>() { // from class: com.kubi.core.spot.view.SpotTradeComplianceInfoView$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C45401p0 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C45401p0.m100339a(C45682f.m100801b(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.trade_core_view_trade_compliance_info, this);
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m23392c(FragmentManager fragmentManager) {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.kc_symbol_tag_title).m54153J4(R$string.kc_symbol_tag_content).m54162S4(R$string.i_already_know, null).show(fragmentManager, "AlertDialogFragmentHelper");
        return Unit.INSTANCE;
    }

    private final C45401p0 getBinding() {
        return (C45401p0) this.f21288b.getValue(this, f21287c[0]);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m23393b(boolean z11, @Nullable Double d11) {
        ShapeLinearLayout shapeLinearLayout;
        boolean z12 = z11 && d11 != null && (d11.doubleValue() >= 0.3d || d11.doubleValue() <= -30.0d);
        C45401p0 binding = getBinding();
        if (binding != null && (shapeLinearLayout = binding.f102284c) != null) {
            C0296a.m1042d(shapeLinearLayout, z12);
        }
        return m23395e();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m23394d(@Nullable ComplianceInfoEntity complianceInfoEntity) {
        Set setEmptySet;
        ShapeTextView shapeTextView;
        ShapeTextView shapeTextView2;
        ShapeTextView shapeTextView3;
        String value;
        List listSplit$default;
        if (complianceInfoEntity == null || (value = complianceInfoEntity.getValue()) == null || (listSplit$default = StringsKt.split$default((CharSequence) value, new String[]{","}, false, 0, 6, (Object) null)) == null) {
            setEmptySet = null;
        } else {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
            Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                arrayList.add(StringsKt.trim((CharSequence) it.next()).toString());
            }
            setEmptySet = CollectionsKt.toSet(arrayList);
        }
        if (setEmptySet == null) {
            setEmptySet = SetsKt.emptySet();
        }
        C45401p0 binding = getBinding();
        if (binding != null && (shapeTextView3 = binding.f102287f) != null) {
            C0296a.m1042d(shapeTextView3, setEmptySet.contains("N"));
        }
        C45401p0 binding2 = getBinding();
        if (binding2 != null && (shapeTextView2 = binding2.f102286e) != null) {
            C0296a.m1042d(shapeTextView2, setEmptySet.contains("MN"));
        }
        C45401p0 binding3 = getBinding();
        if (binding3 != null && (shapeTextView = binding3.f102285d) != null) {
            C0296a.m1042d(shapeTextView, setEmptySet.contains("C"));
        }
        return m23395e();
    }

    public final void setQuestionListener(@NotNull final FragmentManager childFragmentManager) {
        ImageView imageView;
        Intrinsics.checkNotNullParameter(childFragmentManager, "childFragmentManager");
        C45401p0 binding = getBinding();
        if (binding == null || (imageView = binding.f102283b) == null) {
            return;
        }
        C27046k.m66711z(imageView, 0L, new Function0() { // from class: bf.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotTradeComplianceInfoView.m23392c(childFragmentManager);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m23395e() {
        C45401p0 binding;
        C45401p0 binding2;
        C45401p0 binding3;
        boolean z11;
        ShapeTextView shapeTextView;
        ShapeTextView shapeTextView2;
        ShapeTextView shapeTextView3;
        ImageView imageView;
        LinearLayoutCompat root;
        ShapeLinearLayout shapeLinearLayout;
        C45401p0 binding4 = getBinding();
        if ((binding4 != null && (shapeLinearLayout = binding4.f102284c) != null && shapeLinearLayout.getVisibility() == 0) || (((binding = getBinding()) != null && (shapeTextView3 = binding.f102287f) != null && shapeTextView3.getVisibility() == 0) || (((binding2 = getBinding()) != null && (shapeTextView2 = binding2.f102286e) != null && shapeTextView2.getVisibility() == 0) || ((binding3 = getBinding()) != null && (shapeTextView = binding3.f102285d) != null && shapeTextView.getVisibility() == 0)))) {
            z11 = true;
        } else {
            z11 = false;
        }
        C45401p0 binding5 = getBinding();
        if (binding5 != null && (root = binding5.getRoot()) != null) {
            C0296a.m1042d(root, z11);
        }
        C45401p0 binding6 = getBinding();
        if (binding6 != null && (imageView = binding6.f102283b) != null) {
            C0296a.m1042d(imageView, z11);
        }
        return z11;
    }
}
