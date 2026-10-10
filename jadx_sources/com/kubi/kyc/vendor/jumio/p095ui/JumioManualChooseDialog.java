package com.kubi.kyc.vendor.jumio.p095ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.kyc.R$layout;
import com.kubi.resources.dialog.GravityDialogFragment;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p205dn.C36894n;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: JumioManualChooseDialog.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u0018X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/kyc/vendor/jumio/ui/JumioManualChooseDialog;", "Lcom/kubi/resources/dialog/GravityDialogFragment;", "<init>", "()V", "viewBinding", "Lcom/kubi/kyc/databinding/LayoutJumioDialogContentManualBinding;", "getViewBinding", "()Lcom/kubi/kyc/databinding/LayoutJumioDialogContentManualBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "hasManual", "", "manaulCallback", "Lkotlin/Function0;", "Companion", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nJumioManualChooseDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JumioManualChooseDialog.kt\ncom/kubi/kyc/vendor/jumio/ui/JumioManualChooseDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,59:1\n143#2,20:60\n*S KotlinDebug\n*F\n+ 1 JumioManualChooseDialog.kt\ncom/kubi/kyc/vendor/jumio/ui/JumioManualChooseDialog\n*L\n23#1:60,20\n*E\n"})
public final class JumioManualChooseDialog extends GravityDialogFragment {

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final InterfaceC24293a f31624c0 = C45681e.m100799e(this, new Function1<JumioManualChooseDialog, C36894n>() { // from class: com.kubi.kyc.vendor.jumio.ui.JumioManualChooseDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36894n invoke(@NotNull JumioManualChooseDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36894n.m82657a(fragment.requireView());
        }
    }, new Function1<C36894n, Unit>() { // from class: com.kubi.kyc.vendor.jumio.ui.JumioManualChooseDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36894n it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36894n c36894n) {
            invoke(c36894n);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: d0 */
    public boolean f31625d0;

    /* JADX INFO: renamed from: e0 */
    public Function0<Unit> f31626e0;

    /* JADX INFO: renamed from: g0 */
    public static final /* synthetic */ KProperty<Object>[] f31623g0 = {Reflection.property1(new PropertyReference1Impl(JumioManualChooseDialog.class, "viewBinding", "getViewBinding()Lcom/kubi/kyc/databinding/LayoutJumioDialogContentManualBinding;", 0))};

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public static final Companion f31622f0 = new Companion(null);

    /* JADX INFO: compiled from: JumioManualChooseDialog.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0007¨\u0006\f"}, m90084d2 = {"Lcom/kubi/kyc/vendor/jumio/ui/JumioManualChooseDialog$Companion;", "", "<init>", "()V", "showDialog", "", "fm", "Landroidx/fragment/app/FragmentManager;", "hasManual", "", "manaulCallback", "Lkotlin/Function0;", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        public final void showDialog(@NotNull FragmentManager fm2, boolean hasManual, @NotNull Function0<Unit> manaulCallback) {
            Intrinsics.checkNotNullParameter(fm2, "fm");
            Intrinsics.checkNotNullParameter(manaulCallback, "manaulCallback");
            JumioManualChooseDialog jumioManualChooseDialog = new JumioManualChooseDialog();
            jumioManualChooseDialog.f31625d0 = hasManual;
            jumioManualChooseDialog.f31626e0 = manaulCallback;
            jumioManualChooseDialog.show(fm2, JumioManualChooseDialog.class.getSimpleName());
        }
    }

    /* JADX INFO: renamed from: F3 */
    public static final Unit m37389F3(JumioManualChooseDialog jumioManualChooseDialog) {
        Function0<Unit> function0 = jumioManualChooseDialog.f31626e0;
        if (function0 != null) {
            if (function0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("manaulCallback");
                function0 = null;
            }
            function0.invoke();
        }
        jumioManualChooseDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: D3 */
    public final C36894n m37391D3() {
        return (C36894n) this.f31624c0.getValue(this, f31623g0[0]);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.layout_jumio_dialog_content_manual, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        KcPrimaryButton kcPrimaryButton;
        KcPrimaryButton kcPrimaryButton2;
        KcPrimaryButton kcPrimaryButton3;
        KcPrimaryButton kcPrimaryButton4;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C36894n c36894nM37391D3 = m37391D3();
        if (c36894nM37391D3 != null && (kcPrimaryButton4 = c36894nM37391D3.f81505c) != null) {
            C27046k.m66711z(kcPrimaryButton4, 0L, new Function0() { // from class: com.kubi.kyc.vendor.jumio.ui.r0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return JumioManualChooseDialog.m37388E3(this.f31682b);
                }
            }, 1, null);
        }
        C36894n c36894nM37391D4 = m37391D3();
        if (c36894nM37391D4 != null && (kcPrimaryButton3 = c36894nM37391D4.f81504b) != null) {
            C27046k.m66711z(kcPrimaryButton3, 0L, new Function0() { // from class: com.kubi.kyc.vendor.jumio.ui.s0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return JumioManualChooseDialog.m37389F3(this.f31684b);
                }
            }, 1, null);
        }
        if (this.f31625d0) {
            C36894n c36894nM37391D5 = m37391D3();
            if (c36894nM37391D5 == null || (kcPrimaryButton2 = c36894nM37391D5.f81504b) == null) {
                return;
            }
            ViewExtKt.m66577h(kcPrimaryButton2);
            return;
        }
        C36894n c36894nM37391D6 = m37391D3();
        if (c36894nM37391D6 == null || (kcPrimaryButton = c36894nM37391D6.f81504b) == null) {
            return;
        }
        ViewExtKt.m66594y(kcPrimaryButton);
    }

    /* JADX INFO: renamed from: E3 */
    public static final Unit m37388E3(JumioManualChooseDialog jumioManualChooseDialog) {
        jumioManualChooseDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }
}
