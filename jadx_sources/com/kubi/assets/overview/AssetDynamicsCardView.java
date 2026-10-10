package com.kubi.assets.overview;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.R$layout;
import com.kubi.assets.autoearn.AutoEarnOpenDialog;
import com.kubi.assets.entity.DynamicsEntity;
import com.kubi.assets.holdearn.HoldEarnOpenDialog;
import com.kubi.event.api.C12572a;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.sdk.widget.shape.layout.ShapeConstraintLayout;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import f00.C37304a;
import g00.InterfaceC37754f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p481ny.C42899b;
import p569qq.C43852m;
import p637ta.C44730b1;
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

/* JADX INFO: compiled from: AssetDynamicsCardView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/assets/overview/AssetDynamicsCardView;", "Lcom/kubi/sdk/widget/shape/layout/ShapeConstraintLayout;", "context", "Landroid/content/Context;", JAnalysisConstants.EVENT_ATTRIBUTES, "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/kubi/assets/databinding/AssetItemDynamicsCardBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetItemDynamicsCardBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "updateView", "", "dynamicsEntity", "Lcom/kubi/assets/entity/DynamicsEntity;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetDynamicsCardView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetDynamicsCardView.kt\ncom/kubi/assets/overview/AssetDynamicsCardView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,74:1\n41#2:75\n65#2:76\n80#2,7:77\n*S KotlinDebug\n*F\n+ 1 AssetDynamicsCardView.kt\ncom/kubi/assets/overview/AssetDynamicsCardView\n*L\n30#1:75\n30#1:76\n30#1:77,7\n*E\n"})
public final class AssetDynamicsCardView extends ShapeConstraintLayout {

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ KProperty<Object>[] f18177q = {Reflection.property1(new PropertyReference1Impl(AssetDynamicsCardView.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetItemDynamicsCardBinding;", 0))};

    /* JADX INFO: renamed from: p */
    @NotNull
    public final InterfaceC24293a f18178p;

    /* JADX INFO: renamed from: f */
    public static final Unit m18197f(DynamicsEntity dynamicsEntity) {
        Integer type;
        Integer type2;
        if (dynamicsEntity != null && (type2 = dynamicsEntity.getType()) != null && type2.intValue() == 2) {
            C42899b.m94073c(new Function1() { // from class: com.kubi.assets.overview.b
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AssetDynamicsCardView.m18198g((FragmentActivity) obj);
                }
            });
            C43852m.m96591c("B1overview", "holdToEarn", "1", null, 8, null);
        } else if (dynamicsEntity == null || (type = dynamicsEntity.getType()) == null || type.intValue() != 0) {
            String url = dynamicsEntity != null ? dynamicsEntity.getUrl() : null;
            if (url == null || url.length() == 0) {
                InterfaceC37754f.a.m85130b(C37304a.f82764a, "finance", null, null, null, 14, null);
            } else {
                RouteExKt.m56217H(C27041f.m66668h(dynamicsEntity != null ? dynamicsEntity.getUrl() : null));
            }
        } else {
            C42899b.m94073c(new Function1() { // from class: com.kubi.assets.overview.c
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AssetDynamicsCardView.m18199h((FragmentActivity) obj);
                }
            });
        }
        OverviewAnalyticsReporter.f18247a.m18408f(C27039d.m66650j(dynamicsEntity != null ? dynamicsEntity.getDynamicsType() : null), C27041f.m66668h(dynamicsEntity != null ? dynamicsEntity.getStyle() : null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static final void m18200i(DialogInterface dialogInterface) {
        C12572a.m23695d("AUTO_EARN_STATE_REFRESH", null, 0L, 6, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetDynamicsCardView(@NotNull Context context, @NotNull AttributeSet attributes) {
        super(context, attributes);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f18178p = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C44730b1>() { // from class: com.kubi.assets.overview.AssetDynamicsCardView$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44730b1 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C44730b1.m98970a(C45682f.m100801b(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.asset_item_dynamics_card, this);
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m18198g(FragmentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        HoldEarnOpenDialog holdEarnOpenDialogCreate = HoldEarnOpenDialog.f17726y0.create(C43852m.m96601m("B1overview", "holdToEarn", "1"));
        FragmentManager supportFragmentManager = it.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        holdEarnOpenDialogCreate.show(supportFragmentManager, "HoldEarnOpenDialog");
        return Unit.INSTANCE;
    }

    private final C44730b1 getBinding() {
        return (C44730b1) this.f18178p.getValue(this, f18177q[0]);
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m18199h(FragmentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BaseDialogFragment baseDialogFragmentM54192r3 = AutoEarnOpenDialog.Companion.create$default(AutoEarnOpenDialog.f16556x0, null, C43852m.m96601m("B1overview", "autoEarn", "1"), 1, null).m54192r3(new DialogInterface.OnDismissListener() { // from class: com.kubi.assets.overview.d
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                AssetDynamicsCardView.m18200i(dialogInterface);
            }
        });
        FragmentManager supportFragmentManager = it.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        baseDialogFragmentM54192r3.show(supportFragmentManager, "AutoEarnOpenDialog");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public final void m18201e(@Nullable final DynamicsEntity dynamicsEntity) {
        ShapeConstraintLayout shapeConstraintLayout;
        BaseTextView baseTextView;
        Integer type;
        BaseTextView baseTextView2;
        String buttonName;
        BaseTextView baseTextView3;
        String typePhrases;
        C44730b1 binding = getBinding();
        String phrases = null;
        if (binding != null && (baseTextView3 = binding.f99610d) != null) {
            if (dynamicsEntity != null) {
                typePhrases = dynamicsEntity.getTypePhrases();
            } else {
                typePhrases = null;
            }
            baseTextView3.setText(C27041f.m66668h(typePhrases));
        }
        C44730b1 binding2 = getBinding();
        if (binding2 != null && (baseTextView2 = binding2.f99609c) != null) {
            if (dynamicsEntity != null) {
                buttonName = dynamicsEntity.getButtonName();
            } else {
                buttonName = null;
            }
            baseTextView2.setText(C27041f.m66668h(buttonName));
        }
        if (dynamicsEntity != null && (type = dynamicsEntity.getType()) != null && type.intValue() == 2 && UserInfo.c().getType() == 3) {
            AssetExKt.m15138z(this, false);
        }
        C44730b1 binding3 = getBinding();
        if (binding3 != null && (baseTextView = binding3.f99611e) != null) {
            if (dynamicsEntity != null) {
                phrases = dynamicsEntity.getPhrases();
            }
            baseTextView.setText(C27041f.m66668h(phrases));
        }
        C44730b1 binding4 = getBinding();
        if (binding4 != null && (shapeConstraintLayout = binding4.f99608b) != null) {
            C27046k.m66711z(shapeConstraintLayout, 0L, new Function0() { // from class: com.kubi.assets.overview.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetDynamicsCardView.m18197f(dynamicsEntity);
                }
            }, 1, null);
        }
    }
}
