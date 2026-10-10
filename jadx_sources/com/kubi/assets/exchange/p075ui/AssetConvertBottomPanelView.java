package com.kubi.assets.exchange.p075ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.kubi.assets.R$layout;
import com.kubi.assets.entity.RedeemableEntity;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37886j;
import io.reactivex.functions.Action;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p637ta.C44787i2;
import p754xa.TokenItem;
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

/* JADX INFO: compiled from: AssetConvertBottomPanelView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017J\u001c\u0010\u0018\u001a\u00020\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u0017J\u0014\u0010\u001d\u001a\u00020\u001e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001fJ\u001c\u0010\u0018\u001a\u00020\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u001c\u001a\u00020\u0017J\u0014\u0010!\u001a\u00020\"2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020 0\u001fR\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006#"}, m90084d2 = {"Lcom/kubi/assets/exchange/ui/AssetConvertBottomPanelView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/kubi/assets/databinding/AssetViewConvertBottomPanelBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetViewConvertBottomPanelBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "selectAll", "", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lio/reactivex/functions/Action;", "convertKCS", "setUIStatus", "noData", "", "updateData", TUIConstants.TUIContact.SELECTED_LIST, "Ljava/util/ArrayList;", "Lcom/kubi/assets/entity/RedeemableEntity;", "isAllSelected", "getTotalEstimatedConvertAmount", "", "", "Lcom/kubi/assets/exchange/model/TokenItem;", "getTotalEstimatedSum", "Ljava/math/BigDecimal;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetConvertBottomPanelView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetConvertBottomPanelView.kt\ncom/kubi/assets/exchange/ui/AssetConvertBottomPanelView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n41#2:101\n65#2:102\n80#2,7:103\n1803#3,3:110\n*S KotlinDebug\n*F\n+ 1 AssetConvertBottomPanelView.kt\ncom/kubi/assets/exchange/ui/AssetConvertBottomPanelView\n*L\n30#1:101\n30#1:102\n30#1:103,7\n76#1:110,3\n*E\n"})
public final class AssetConvertBottomPanelView extends ConstraintLayout {

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ KProperty<Object>[] f17249o = {Reflection.property1(new PropertyReference1Impl(AssetConvertBottomPanelView.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetViewConvertBottomPanelBinding;", 0))};

    /* JADX INFO: renamed from: n */
    @NotNull
    public final InterfaceC24293a f17250n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AssetConvertBottomPanelView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AssetConvertBottomPanelView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final C44787i2 getBinding() {
        return (C44787i2) this.f17250n.getValue(this, f17249o[0]);
    }

    /* JADX INFO: renamed from: c */
    public final void m16384c(@NotNull final Action action) {
        KcPrimaryButton kcPrimaryButton;
        Intrinsics.checkNotNullParameter(action, "action");
        C44787i2 binding = getBinding();
        if (binding == null || (kcPrimaryButton = binding.f100124d) == null) {
            return;
        }
        C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.assets.exchange.ui.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetConvertBottomPanelView.m16382d(action);
            }
        }, 1, null);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final String m16385e(@NotNull List<RedeemableEntity> selectedList) {
        Intrinsics.checkNotNullParameter(selectedList, "selectedList");
        BigDecimal bigDecimalAdd = BigDecimal.ZERO;
        for (RedeemableEntity redeemableEntity : selectedList) {
            Intrinsics.checkNotNull(bigDecimalAdd);
            bigDecimalAdd = bigDecimalAdd.add(C41014a.m89922G(redeemableEntity.getEstimatedExchangeAmount(), null, 1, null));
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        }
        String plainString = bigDecimalAdd.toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
        return plainString;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final BigDecimal m16386f(@NotNull List<TokenItem> selectedList) {
        Intrinsics.checkNotNullParameter(selectedList, "selectedList");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        Iterator<T> it = selectedList.iterator();
        while (it.hasNext()) {
            bigDecimalValueOf = bigDecimalValueOf.add(C41014a.m89922G(((TokenItem) it.next()).getEstimatedExchangeAmount(), null, 1, null));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    /* JADX INFO: renamed from: g */
    public final void m16387g(@NotNull final Action action) {
        Intrinsics.checkNotNullParameter(action, "action");
        C44787i2 binding = getBinding();
        if (binding != null) {
            ImageView ivCheck = binding.f100122b;
            Intrinsics.checkNotNullExpressionValue(ivCheck, "ivCheck");
            BaseTextView tvCheck = binding.f100123c;
            Intrinsics.checkNotNullExpressionValue(tvCheck, "tvCheck");
            C27046k.m66681D(new View[]{ivCheck, tvCheck}, new Function0() { // from class: com.kubi.assets.exchange.ui.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetConvertBottomPanelView.m16383h(action);
                }
            });
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m16388i(@NotNull ArrayList<RedeemableEntity> selectedList, boolean z11) {
        BaseTextView baseTextView;
        ImageView imageView;
        KcPrimaryButton kcPrimaryButton;
        Intrinsics.checkNotNullParameter(selectedList, "selectedList");
        C44787i2 binding = getBinding();
        if (binding != null && (kcPrimaryButton = binding.f100124d) != null) {
            kcPrimaryButton.setEnabled(selectedList.size() != 0);
        }
        C44787i2 binding2 = getBinding();
        if (binding2 != null && (imageView = binding2.f100122b) != null) {
            imageView.setSelected(z11);
        }
        C44787i2 binding3 = getBinding();
        if (binding3 == null || (baseTextView = binding3.f100126f) == null) {
            return;
        }
        baseTextView.setText(C37886j.m85578b(DowngradeExKt.m66535e(m16385e(selectedList), null, 1, null), "KCS", null, false, false, false, 0, null, 0, 254, null));
    }

    /* JADX INFO: renamed from: j */
    public final void m16389j(@NotNull List<TokenItem> selectedList, boolean z11) {
        BaseTextView baseTextView;
        ImageView imageView;
        KcPrimaryButton kcPrimaryButton;
        Intrinsics.checkNotNullParameter(selectedList, "selectedList");
        C44787i2 binding = getBinding();
        if (binding != null && (kcPrimaryButton = binding.f100124d) != null) {
            kcPrimaryButton.setEnabled(!selectedList.isEmpty());
        }
        C44787i2 binding2 = getBinding();
        if (binding2 != null && (imageView = binding2.f100122b) != null) {
            imageView.setSelected(z11);
        }
        C44787i2 binding3 = getBinding();
        if (binding3 == null || (baseTextView = binding3.f100126f) == null) {
            return;
        }
        baseTextView.setText(C37886j.m85578b(m16386f(selectedList), "KCS", null, false, false, false, 0, null, 0, 254, null));
    }

    public /* synthetic */ AssetConvertBottomPanelView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m16382d(Action action) throws Exception {
        action.run();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m16383h(Action action) throws Exception {
        action.run();
        return Unit.INSTANCE;
    }

    public final void setUIStatus(boolean noData) {
        ImageView imageView;
        C44787i2 binding = getBinding();
        if (binding != null && (imageView = binding.f100122b) != null) {
            imageView.setEnabled(!noData);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AssetConvertBottomPanelView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f17250n = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C44787i2>() { // from class: com.kubi.assets.exchange.ui.AssetConvertBottomPanelView$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44787i2 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C44787i2.m99092a(C45682f.m100801b(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.asset_view_convert_bottom_panel, this);
    }
}
