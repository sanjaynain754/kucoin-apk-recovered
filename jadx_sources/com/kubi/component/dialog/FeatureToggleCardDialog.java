package com.kubi.component.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5267e0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.kubi.component.dialog.FeatureToggleCardDialog;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.tradebase.R$id;
import com.kubi.tradebase.R$layout;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import n30.C42737m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p038bc.C4552f;
import p038bc.InterfaceC4549c;
import p038bc.ToggleCardModeData;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: FeatureToggleCardDialog.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0012\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00130\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0019J&\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010%\u001a\u00020#H\u0016J\b\u0010&\u001a\u00020'H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006("}, m90084d2 = {"Lcom/kubi/component/dialog/FeatureToggleCardDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/tradebase/databinding/KcFeatureToggleCardSelectorListDialogBinding;", "getBinding", "()Lcom/kubi/tradebase/databinding/KcFeatureToggleCardSelectorListDialogBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "dialogTitle", "", "adapter", "Lcom/kubi/component/dialog/ToggleCardSelectorAdapter;", "getAdapter", "()Lcom/kubi/component/dialog/ToggleCardSelectorAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "setData", ExifInterface.GPS_DIRECTION_TRUE, "title", "data", "", "Lcom/kubi/component/dialog/ToggleCardModeData;", "selectedMode", "Lcom/kubi/component/dialog/ToggleCardSelectedMode;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onStart", "isBottomSheet", "", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFeatureToggleCardDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeatureToggleCardDialog.kt\ncom/kubi/component/dialog/FeatureToggleCardDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,71:1\n143#2,20:72\n*S KotlinDebug\n*F\n+ 1 FeatureToggleCardDialog.kt\ncom/kubi/component/dialog/FeatureToggleCardDialog\n*L\n22#1:72,20\n*E\n"})
public final class FeatureToggleCardDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: t0 */
    public static final /* synthetic */ KProperty<Object>[] f19599t0 = {Reflection.property1(new PropertyReference1Impl(FeatureToggleCardDialog.class, "binding", "getBinding()Lcom/kubi/tradebase/databinding/KcFeatureToggleCardSelectorListDialogBinding;", 0))};

    /* JADX INFO: renamed from: r0 */
    @Nullable
    public String f19601r0;

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f19600q0 = C45681e.m100799e(this, new Function1<FeatureToggleCardDialog, C42737m>() { // from class: com.kubi.component.dialog.FeatureToggleCardDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C42737m invoke(@NotNull FeatureToggleCardDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C42737m.m93647a(fragment.requireView());
        }
    }, new Function1<C42737m, Unit>() { // from class: com.kubi.component.dialog.FeatureToggleCardDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C42737m it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C42737m c42737m) {
            invoke(c42737m);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f19602s0 = LazyKt.lazy(new Function0() { // from class: bc.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FeatureToggleCardDialog.m20441k4();
        }
    });

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static final C4552f m20441k4() {
        return new C4552f();
    }

    /* JADX INFO: renamed from: l4 */
    public final C4552f m20442l4() {
        return (C4552f) this.f19602s0.getValue();
    }

    /* JADX INFO: renamed from: m4 */
    public final C42737m m20443m4() {
        return (C42737m) this.f19600q0.getValue(this, f19599t0[0]);
    }

    @NotNull
    /* JADX INFO: renamed from: n4 */
    public final <T> FeatureToggleCardDialog m20444n4(@NotNull String title, @NotNull List<ToggleCardModeData<T>> data, @NotNull InterfaceC4549c selectedMode) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(selectedMode, "selectedMode");
        this.f19601r0 = title;
        m20442l4().m4438k(data, selectedMode);
        if (isAdded()) {
            m20442l4().notifyItemRangeRemoved(0, m20442l4().getItemCount());
            m20442l4().notifyItemRangeInserted(0, data.size());
        }
        return this;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.kc_feature_toggle_card_selector_list_dialog, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        BaseTextView baseTextView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C42737m c42737mM20443m4 = m20443m4();
        if (c42737mM20443m4 != null && (baseTextView = c42737mM20443m4.f94650c) != null) {
            baseTextView.setText(this.f19601r0);
        }
        C42737m c42737mM20443m5 = m20443m4();
        if (c42737mM20443m5 != null && (recyclerView2 = c42737mM20443m5.f94649b) != null) {
            recyclerView2.setItemAnimator(null);
        }
        C42737m c42737mM20443m6 = m20443m4();
        if (c42737mM20443m6 == null || (recyclerView = c42737mM20443m6.f94649b) == null) {
            return;
        }
        recyclerView.setAdapter(m20442l4());
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        FrameLayout frameLayout;
        super.onStart();
        int iM6182d = C5267e0.m6182d();
        Dialog dialog = getDialog();
        if (dialog != null && (frameLayout = (FrameLayout) dialog.findViewById(R$id.design_bottom_sheet)) != null) {
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
            bottomSheetBehaviorFrom.setPeekHeight(iM6182d);
        }
    }
}
