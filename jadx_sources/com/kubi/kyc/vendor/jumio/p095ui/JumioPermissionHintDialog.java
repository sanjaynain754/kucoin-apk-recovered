package com.kubi.kyc.vendor.jumio.p095ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.kyc.R$layout;
import com.kubi.resources.dialog.GravityDialogFragment;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p205dn.C36895o;
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

/* JADX INFO: compiled from: JumioPermissionHintDialog.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/kyc/vendor/jumio/ui/JumioPermissionHintDialog;", "Lcom/kubi/resources/dialog/GravityDialogFragment;", "<init>", "()V", "viewBinding", "Lcom/kubi/kyc/databinding/LayoutJumioDialogContentPermissionHintBinding;", "getViewBinding", "()Lcom/kubi/kyc/databinding/LayoutJumioDialogContentPermissionHintBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "confirm", "Lkotlin/Function0;", "cancel", "Companion", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nJumioPermissionHintDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JumioPermissionHintDialog.kt\ncom/kubi/kyc/vendor/jumio/ui/JumioPermissionHintDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,61:1\n143#2,20:62\n*S KotlinDebug\n*F\n+ 1 JumioPermissionHintDialog.kt\ncom/kubi/kyc/vendor/jumio/ui/JumioPermissionHintDialog\n*L\n21#1:62,20\n*E\n"})
public final class JumioPermissionHintDialog extends GravityDialogFragment {

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final InterfaceC24293a f31635c0 = C45681e.m100799e(this, new Function1<JumioPermissionHintDialog, C36895o>() { // from class: com.kubi.kyc.vendor.jumio.ui.JumioPermissionHintDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36895o invoke(@NotNull JumioPermissionHintDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36895o.m82659a(fragment.requireView());
        }
    }, new Function1<C36895o, Unit>() { // from class: com.kubi.kyc.vendor.jumio.ui.JumioPermissionHintDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36895o it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36895o c36895o) {
            invoke(c36895o);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: d0 */
    @Nullable
    public Function0<Unit> f31636d0;

    /* JADX INFO: renamed from: e0 */
    @Nullable
    public Function0<Unit> f31637e0;

    /* JADX INFO: renamed from: g0 */
    public static final /* synthetic */ KProperty<Object>[] f31634g0 = {Reflection.property1(new PropertyReference1Impl(JumioPermissionHintDialog.class, "viewBinding", "getViewBinding()Lcom/kubi/kyc/databinding/LayoutJumioDialogContentPermissionHintBinding;", 0))};

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public static final Companion f31633f0 = new Companion(null);

    /* JADX INFO: compiled from: JumioPermissionHintDialog.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0007¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/kyc/vendor/jumio/ui/JumioPermissionHintDialog$Companion;", "", "<init>", "()V", "showDialog", "", "fm", "Landroidx/fragment/app/FragmentManager;", "confirm", "Lkotlin/Function0;", "cancel", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        public final void showDialog(@NotNull FragmentManager fm2, @NotNull Function0<Unit> confirm, @NotNull Function0<Unit> cancel) {
            Intrinsics.checkNotNullParameter(fm2, "fm");
            Intrinsics.checkNotNullParameter(confirm, "confirm");
            Intrinsics.checkNotNullParameter(cancel, "cancel");
            JumioPermissionHintDialog jumioPermissionHintDialog = new JumioPermissionHintDialog();
            jumioPermissionHintDialog.f31636d0 = confirm;
            jumioPermissionHintDialog.f31637e0 = cancel;
            jumioPermissionHintDialog.show(fm2, JumioPermissionHintDialog.class.getSimpleName());
        }
    }

    @Nullable
    /* JADX INFO: renamed from: D3 */
    public final C36895o m37412D3() {
        return (C36895o) this.f31635c0.getValue(this, f31634g0[0]);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.layout_jumio_dialog_content_permission_hint, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        TextView textView;
        KcPrimaryButton kcPrimaryButton;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m54250y3(4);
        m54191p3();
        C36895o c36895oM37412D3 = m37412D3();
        if (c36895oM37412D3 != null && (kcPrimaryButton = c36895oM37412D3.f81508c) != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.kyc.vendor.jumio.ui.x0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return JumioPermissionHintDialog.m37409E3(this.f31693b);
                }
            }, 1, null);
        }
        C36895o c36895oM37412D4 = m37412D3();
        if (c36895oM37412D4 == null || (textView = c36895oM37412D4.f81507b) == null) {
            return;
        }
        C27046k.m66711z(textView, 0L, new Function0() { // from class: com.kubi.kyc.vendor.jumio.ui.y0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JumioPermissionHintDialog.m37410F3(this.f31695b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: E3 */
    public static final Unit m37409E3(JumioPermissionHintDialog jumioPermissionHintDialog) {
        jumioPermissionHintDialog.dismissAllowingStateLoss();
        Function0<Unit> function0 = jumioPermissionHintDialog.f31636d0;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F3 */
    public static final Unit m37410F3(JumioPermissionHintDialog jumioPermissionHintDialog) {
        jumioPermissionHintDialog.dismissAllowingStateLoss();
        Function0<Unit> function0 = jumioPermissionHintDialog.f31637e0;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
