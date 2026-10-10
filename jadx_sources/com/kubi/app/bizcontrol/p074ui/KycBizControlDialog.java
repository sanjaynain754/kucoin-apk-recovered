package com.kubi.app.bizcontrol.p074ui;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.app.bizcontrol.R$layout;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import la.C42143a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: KycBizControlDialog.kt */
/* JADX INFO: loaded from: classes64.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u000eH\u0002J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u001b\u001a\u00020\u0018H\u0002R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/app/bizcontrol/ui/KycBizControlDialog;", "Lcom/kubi/resources/dialog/BaseDialogFragment;", "<init>", "()V", "fetchResult", "Landroidx/lifecycle/MutableLiveData;", "", "binding", "Lcom/kubi/app/bizcontrol/databinding/LayoutBizControlKycDialogBinding;", "getBinding", "()Lcom/kubi/app/bizcontrol/databinding/LayoutBizControlKycDialogBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getLayoutId", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "fetchConfig", "LBizControl_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKycBizControlDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KycBizControlDialog.kt\ncom/kubi/app/bizcontrol/ui/KycBizControlDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,93:1\n143#2,20:94\n*S KotlinDebug\n*F\n+ 1 KycBizControlDialog.kt\ncom/kubi/app/bizcontrol/ui/KycBizControlDialog\n*L\n33#1:94,20\n*E\n"})
public final class KycBizControlDialog extends BaseDialogFragment {

    /* JADX INFO: renamed from: b0 */
    public static final /* synthetic */ KProperty<Object>[] f15522b0 = {Reflection.property1(new PropertyReference1Impl(KycBizControlDialog.class, "binding", "getBinding()Lcom/kubi/app/bizcontrol/databinding/LayoutBizControlKycDialogBinding;", 0))};

    /* JADX INFO: renamed from: Z */
    @NotNull
    public MutableLiveData<Boolean> f15523Z = new MutableLiveData<>(null);

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final InterfaceC24293a f15524a0 = C45681e.m100799e(this, new Function1<KycBizControlDialog, C42143a>() { // from class: com.kubi.app.bizcontrol.ui.KycBizControlDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C42143a invoke(@NotNull KycBizControlDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C42143a.m92481a(fragment.requireView());
        }
    }, new Function1<C42143a, Unit>() { // from class: com.kubi.app.bizcontrol.ui.KycBizControlDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C42143a it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C42143a c42143a) {
            invoke(c42143a);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: com.kubi.app.bizcontrol.ui.KycBizControlDialog$a */
    /* JADX INFO: compiled from: KycBizControlDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C9422a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f15525b;

        public C9422a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f15525b = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p852kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f15525b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f15525b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: A3 */
    private final int m15015A3() {
        return R$layout.layout_biz_control_kyc_dialog;
    }

    /* JADX INFO: renamed from: C3 */
    public static final Unit m15017C3(KycBizControlDialog kycBizControlDialog, Boolean bool) {
        KcPrimaryButton kcPrimaryButton;
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            kycBizControlDialog.dismiss();
        } else if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
            C42143a c42143aM15022z3 = kycBizControlDialog.m15022z3();
            if (c42143aM15022z3 != null && (kcPrimaryButton = c42143aM15022z3.f93578b) != null) {
                kcPrimaryButton.mo28851l();
            }
            kycBizControlDialog.f15523Z.removeObservers(kycBizControlDialog.getViewLifecycleOwner());
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(m15015A3(), (ViewGroup) null, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        KcPrimaryButton kcPrimaryButton;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m54191p3();
        m15021y3();
        C42143a c42143aM15022z3 = m15022z3();
        if (c42143aM15022z3 == null || (kcPrimaryButton = c42143aM15022z3.f93578b) == null) {
            return;
        }
        C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.app.bizcontrol.ui.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KycBizControlDialog.m15016B3(this.f15530b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: z3 */
    public final C42143a m15022z3() {
        return (C42143a) this.f15524a0.getValue(this, f15522b0[0]);
    }

    /* JADX INFO: renamed from: B3 */
    public static final Unit m15016B3(final KycBizControlDialog kycBizControlDialog) {
        KcPrimaryButton kcPrimaryButton;
        C42143a c42143aM15022z3 = kycBizControlDialog.m15022z3();
        if (c42143aM15022z3 != null && (kcPrimaryButton = c42143aM15022z3.f93578b) != null) {
            kcPrimaryButton.m55043o();
        }
        if (Intrinsics.areEqual(kycBizControlDialog.f15523Z.getValue(), Boolean.FALSE)) {
            kycBizControlDialog.m15021y3();
        }
        kycBizControlDialog.f15523Z.observe(kycBizControlDialog.getViewLifecycleOwner(), new C9422a(new Function1() { // from class: com.kubi.app.bizcontrol.ui.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KycBizControlDialog.m15017C3(this.f15531b, (Boolean) obj);
            }
        }));
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        Window window2;
        super.onStart();
        if (getDialog() != null) {
            Dialog dialog = getDialog();
            Intrinsics.checkNotNull(dialog);
            if (dialog.getWindow() != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                requireActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                Dialog dialog2 = getDialog();
                if (dialog2 != null && (window2 = dialog2.getWindow()) != null) {
                    window2.setBackgroundDrawable(new ColorDrawable(0));
                }
                Dialog dialog3 = getDialog();
                Intrinsics.checkNotNull(dialog3);
                Window window3 = dialog3.getWindow();
                Intrinsics.checkNotNull(window3);
                WindowManager.LayoutParams attributes = window3.getAttributes();
                int i11 = displayMetrics.widthPixels;
                attributes.width = i11;
                attributes.gravity = 17;
                attributes.width = i11 - C5275i0.m6236a(64.0f);
                Dialog dialog4 = getDialog();
                if (dialog4 != null && (window = dialog4.getWindow()) != null) {
                    window.setAttributes(attributes);
                }
            }
        }
    }

    /* JADX INFO: renamed from: y3 */
    public final void m15021y3() {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenCreated(new KycBizControlDialog$fetchConfig$1(this, null));
    }
}
