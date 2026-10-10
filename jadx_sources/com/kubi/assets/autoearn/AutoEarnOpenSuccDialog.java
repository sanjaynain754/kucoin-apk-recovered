package com.kubi.assets.autoearn;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.assets.R$layout;
import com.kubi.resources.dialog.BaseBottomDialog;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44864t;
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

/* JADX INFO: compiled from: AutoEarnOpenSuccDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001f\u001a\u00020\u0010H\u0002J\b\u0010 \u001a\u00020!H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006#"}, m90084d2 = {"Lcom/kubi/assets/autoearn/AutoEarnOpenSuccDialog;", "Lcom/kubi/resources/dialog/BaseBottomDialog;", "<init>", "()V", "maxHeightRatio", "", "getMaxHeightRatio", "()F", "binding", "Lcom/kubi/assets/databinding/AssetDialogAutoEarnOpenSuccBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetDialogAutoEarnOpenSuccBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onOpenClicked", "Lkotlin/Function0;", "", "getOnOpenClicked", "()Lkotlin/jvm/functions/Function0;", "setOnOpenClicked", "(Lkotlin/jvm/functions/Function0;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "setupViews", "isBottomSheet", "", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAutoEarnOpenSuccDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoEarnOpenSuccDialog.kt\ncom/kubi/assets/autoearn/AutoEarnOpenSuccDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,56:1\n143#2,20:57\n*S KotlinDebug\n*F\n+ 1 AutoEarnOpenSuccDialog.kt\ncom/kubi/assets/autoearn/AutoEarnOpenSuccDialog\n*L\n25#1:57,20\n*E\n"})
public final class AutoEarnOpenSuccDialog extends BaseBottomDialog {

    /* JADX INFO: renamed from: s0 */
    public final float f16567s0 = 0.75f;

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final InterfaceC24293a f16568t0 = C45681e.m100799e(this, new Function1<AutoEarnOpenSuccDialog, C44864t>() { // from class: com.kubi.assets.autoearn.AutoEarnOpenSuccDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44864t invoke(@NotNull AutoEarnOpenSuccDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44864t.m99252a(fragment.requireView());
        }
    }, new Function1<C44864t, Unit>() { // from class: com.kubi.assets.autoearn.AutoEarnOpenSuccDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C44864t it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44864t c44864t) {
            invoke(c44864t);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: u0 */
    @Nullable
    public Function0<Unit> f16569u0;

    /* JADX INFO: renamed from: w0 */
    public static final /* synthetic */ KProperty<Object>[] f16566w0 = {Reflection.property1(new PropertyReference1Impl(AutoEarnOpenSuccDialog.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetDialogAutoEarnOpenSuccBinding;", 0))};

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public static final Companion f16565v0 = new Companion(null);

    /* JADX INFO: compiled from: AutoEarnOpenSuccDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/assets/autoearn/AutoEarnOpenSuccDialog$Companion;", "", "<init>", "()V", "create", "Lcom/kubi/assets/autoearn/AutoEarnOpenSuccDialog;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final AutoEarnOpenSuccDialog create() {
            return new AutoEarnOpenSuccDialog();
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: r4 */
    public static final Unit m15420r4(AutoEarnOpenSuccDialog autoEarnOpenSuccDialog) {
        Function0<Unit> function0 = autoEarnOpenSuccDialog.f16569u0;
        if (function0 != null) {
            function0.invoke();
        }
        autoEarnOpenSuccDialog.dismiss();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.dialog.BaseBottomDialog
    /* JADX INFO: renamed from: k4, reason: from getter */
    public float getF16567s0() {
        return this.f16567s0;
    }

    /* JADX INFO: renamed from: o4 */
    public final C44864t m15421o4() {
        return (C44864t) this.f16568t0.getValue(this, f16566w0[0]);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.asset_dialog_auto_earn_open_succ, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m15418p4();
    }

    /* JADX INFO: renamed from: p4 */
    private final void m15418p4() {
        C44864t c44864tM15421o4 = m15421o4();
        if (c44864tM15421o4 != null) {
            AppCompatImageView ivClose = c44864tM15421o4.f100849d;
            Intrinsics.checkNotNullExpressionValue(ivClose, "ivClose");
            C27046k.m66711z(ivClose, 0L, new Function0() { // from class: com.kubi.assets.autoearn.s
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AutoEarnOpenSuccDialog.m15419q4(this.f16590b);
                }
            }, 1, null);
            KcPrimaryButton btnOpen = c44864tM15421o4.f100847b;
            Intrinsics.checkNotNullExpressionValue(btnOpen, "btnOpen");
            C27046k.m66711z(btnOpen, 0L, new Function0() { // from class: com.kubi.assets.autoearn.t
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AutoEarnOpenSuccDialog.m15420r4(this.f16591b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: q4 */
    public static final Unit m15419q4(AutoEarnOpenSuccDialog autoEarnOpenSuccDialog) {
        autoEarnOpenSuccDialog.dismiss();
        return Unit.INSTANCE;
    }
}
