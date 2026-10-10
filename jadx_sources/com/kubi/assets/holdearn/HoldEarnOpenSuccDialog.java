package com.kubi.assets.holdearn;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.assets.R$layout;
import com.kubi.resources.dialog.BaseBottomDialog;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44745d0;
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

/* JADX INFO: compiled from: HoldEarnOpenSuccDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 (2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0016\u001a\u00020\u00002\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fJ&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010\"\u001a\u00020\u0010H\u0002J\u0010\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020'H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, m90084d2 = {"Lcom/kubi/assets/holdearn/HoldEarnOpenSuccDialog;", "Lcom/kubi/resources/dialog/BaseBottomDialog;", "<init>", "()V", "maxHeightRatio", "", "getMaxHeightRatio", "()F", "binding", "Lcom/kubi/assets/databinding/AssetDialogHoldEarnOpenSuccBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetDialogHoldEarnOpenSuccBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onOpenClicked", "Lkotlin/Function0;", "", "getOnOpenClicked", "()Lkotlin/jvm/functions/Function0;", "setOnOpenClicked", "(Lkotlin/jvm/functions/Function0;)V", "onCloseListener", "setOnCloseListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "setupViews", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "isBottomSheet", "", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHoldEarnOpenSuccDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HoldEarnOpenSuccDialog.kt\ncom/kubi/assets/holdearn/HoldEarnOpenSuccDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,68:1\n143#2,20:69\n*S KotlinDebug\n*F\n+ 1 HoldEarnOpenSuccDialog.kt\ncom/kubi/assets/holdearn/HoldEarnOpenSuccDialog\n*L\n26#1:69,20\n*E\n"})
public final class HoldEarnOpenSuccDialog extends BaseBottomDialog {

    /* JADX INFO: renamed from: s0 */
    public final float f17737s0 = 0.75f;

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final InterfaceC24293a f17738t0 = C45681e.m100799e(this, new Function1<HoldEarnOpenSuccDialog, C44745d0>() { // from class: com.kubi.assets.holdearn.HoldEarnOpenSuccDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44745d0 invoke(@NotNull HoldEarnOpenSuccDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44745d0.m99002a(fragment.requireView());
        }
    }, new Function1<C44745d0, Unit>() { // from class: com.kubi.assets.holdearn.HoldEarnOpenSuccDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C44745d0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44745d0 c44745d0) {
            invoke(c44745d0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: u0 */
    @Nullable
    public Function0<Unit> f17739u0;

    /* JADX INFO: renamed from: v0 */
    @Nullable
    public Function0<Unit> f17740v0;

    /* JADX INFO: renamed from: x0 */
    public static final /* synthetic */ KProperty<Object>[] f17736x0 = {Reflection.property1(new PropertyReference1Impl(HoldEarnOpenSuccDialog.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetDialogHoldEarnOpenSuccBinding;", 0))};

    /* JADX INFO: renamed from: w0 */
    @NotNull
    public static final Companion f17735w0 = new Companion(null);

    /* JADX INFO: compiled from: HoldEarnOpenSuccDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/assets/holdearn/HoldEarnOpenSuccDialog$Companion;", "", "<init>", "()V", "create", "Lcom/kubi/assets/holdearn/HoldEarnOpenSuccDialog;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final HoldEarnOpenSuccDialog create() {
            return new HoldEarnOpenSuccDialog();
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: s4 */
    public static final Unit m17377s4(HoldEarnOpenSuccDialog holdEarnOpenSuccDialog) {
        Function0<Unit> function0 = holdEarnOpenSuccDialog.f17739u0;
        if (function0 != null) {
            function0.invoke();
        }
        holdEarnOpenSuccDialog.dismiss();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.dialog.BaseBottomDialog
    /* JADX INFO: renamed from: k4, reason: from getter */
    public float getF17737s0() {
        return this.f17737s0;
    }

    /* JADX INFO: renamed from: o4 */
    public final C44745d0 m17378o4() {
        return (C44745d0) this.f17738t0.getValue(this, f17736x0[0]);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.asset_dialog_hold_earn_open_succ, container, false);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        Function0<Unit> function0 = this.f17740v0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m17375q4();
    }

    @NotNull
    /* JADX INFO: renamed from: p4 */
    public final HoldEarnOpenSuccDialog m17379p4(@Nullable Function0<Unit> function0) {
        this.f17740v0 = function0;
        return this;
    }

    /* JADX INFO: renamed from: q4 */
    private final void m17375q4() {
        C44745d0 c44745d0M17378o4 = m17378o4();
        if (c44745d0M17378o4 != null) {
            AppCompatImageView ivClose = c44745d0M17378o4.f99722d;
            Intrinsics.checkNotNullExpressionValue(ivClose, "ivClose");
            C27046k.m66711z(ivClose, 0L, new Function0() { // from class: com.kubi.assets.holdearn.p
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HoldEarnOpenSuccDialog.m17376r4(this.f17764b);
                }
            }, 1, null);
            KcPrimaryButton btnOpen = c44745d0M17378o4.f99720b;
            Intrinsics.checkNotNullExpressionValue(btnOpen, "btnOpen");
            C27046k.m66711z(btnOpen, 0L, new Function0() { // from class: com.kubi.assets.holdearn.q
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HoldEarnOpenSuccDialog.m17377s4(this.f17765b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: r4 */
    public static final Unit m17376r4(HoldEarnOpenSuccDialog holdEarnOpenSuccDialog) {
        holdEarnOpenSuccDialog.dismiss();
        return Unit.INSTANCE;
    }
}
