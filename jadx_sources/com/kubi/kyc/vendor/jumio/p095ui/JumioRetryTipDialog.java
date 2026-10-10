package com.kubi.kyc.vendor.jumio.p095ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.kyc.R$layout;
import com.kubi.resources.dialog.GravityDialogFragment;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p205dn.C36890j;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: JumioRetryTipDialog.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/kyc/vendor/jumio/ui/JumioRetryTipDialog;", "Lcom/kubi/resources/dialog/GravityDialogFragment;", "<init>", "()V", "viewBinding", "Lcom/kubi/kyc/databinding/DialogJumioRetryContentBinding;", "getViewBinding", "()Lcom/kubi/kyc/databinding/DialogJumioRetryContentBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Companion", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nJumioRetryTipDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JumioRetryTipDialog.kt\ncom/kubi/kyc/vendor/jumio/ui/JumioRetryTipDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,65:1\n143#2,20:66\n*S KotlinDebug\n*F\n+ 1 JumioRetryTipDialog.kt\ncom/kubi/kyc/vendor/jumio/ui/JumioRetryTipDialog\n*L\n21#1:66,20\n*E\n"})
public final class JumioRetryTipDialog extends GravityDialogFragment {

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final InterfaceC24293a f31640c0 = C45681e.m100799e(this, new Function1<JumioRetryTipDialog, C36890j>() { // from class: com.kubi.kyc.vendor.jumio.ui.JumioRetryTipDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36890j invoke(@NotNull JumioRetryTipDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36890j.m82649a(fragment.requireView());
        }
    }, new Function1<C36890j, Unit>() { // from class: com.kubi.kyc.vendor.jumio.ui.JumioRetryTipDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36890j it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36890j c36890j) {
            invoke(c36890j);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: e0 */
    public static final /* synthetic */ KProperty<Object>[] f31639e0 = {Reflection.property1(new PropertyReference1Impl(JumioRetryTipDialog.class, "viewBinding", "getViewBinding()Lcom/kubi/kyc/databinding/DialogJumioRetryContentBinding;", 0))};

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public static final Companion f31638d0 = new Companion(null);

    /* JADX INFO: compiled from: JumioRetryTipDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kyc/vendor/jumio/ui/JumioRetryTipDialog$Companion;", "", "<init>", "()V", "CALLBACK", "", "newInstance", "Lcom/kubi/kyc/vendor/jumio/ui/JumioRetryTipDialog;", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final JumioRetryTipDialog newInstance() {
            return new JumioRetryTipDialog();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: B3 */
    public final C36890j m37417B3() {
        return (C36890j) this.f31640c0.getValue(this, f31639e0[0]);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.dialog_jumio_retry_content, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Button button;
        KcPrimaryButton kcPrimaryButton;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m54250y3(3);
        m54191p3();
        C36890j c36890jM37417B3 = m37417B3();
        if (c36890jM37417B3 != null && (kcPrimaryButton = c36890jM37417B3.f81475c) != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.kyc.vendor.jumio.ui.z0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return JumioRetryTipDialog.m37414C3(this.f31697b);
                }
            }, 1, null);
        }
        C36890j c36890jM37417B4 = m37417B3();
        if (c36890jM37417B4 == null || (button = c36890jM37417B4.f81474b) == null) {
            return;
        }
        C27046k.m66711z(button, 0L, new Function0() { // from class: com.kubi.kyc.vendor.jumio.ui.a1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JumioRetryTipDialog.m37415D3(this.f31643b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: C3 */
    public static final Unit m37414C3(JumioRetryTipDialog jumioRetryTipDialog) {
        BaseActivity baseActivity;
        FragmentActivity activity = jumioRetryTipDialog.getActivity();
        if (activity instanceof BaseActivity) {
            baseActivity = (BaseActivity) activity;
        } else {
            baseActivity = null;
        }
        if (baseActivity != null) {
            String name = JumioRetryTipDialog.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            Bundle bundle = new Bundle();
            bundle.putBoolean("CALLBACK", true);
            Unit unit = Unit.INSTANCE;
            baseActivity.setFragmentResult(name, bundle);
        }
        jumioRetryTipDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D3 */
    public static final Unit m37415D3(JumioRetryTipDialog jumioRetryTipDialog) {
        BaseActivity baseActivity;
        FragmentActivity activity = jumioRetryTipDialog.getActivity();
        if (activity instanceof BaseActivity) {
            baseActivity = (BaseActivity) activity;
        } else {
            baseActivity = null;
        }
        if (baseActivity != null) {
            String name = JumioRetryTipDialog.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            Bundle bundle = new Bundle();
            bundle.putBoolean("CALLBACK", false);
            Unit unit = Unit.INSTANCE;
            baseActivity.setFragmentResult(name, bundle);
        }
        jumioRetryTipDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }
}
