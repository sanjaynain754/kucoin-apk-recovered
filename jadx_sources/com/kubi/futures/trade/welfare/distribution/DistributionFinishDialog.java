package com.kubi.futures.trade.welfare.distribution;

import android.app.Dialog;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.trade.FuturesFragment;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36847u;
import f00.C37304a;
import g00.InterfaceC37766r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p729wl.C45875l0;
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

/* JADX INFO: compiled from: DistributionFinishDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/distribution/DistributionFinishDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/kumex/databinding/BkumexDialogFutureBonusDistributionFinishBinding;", "getBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogFutureBonusDistributionFinishBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onStart", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDistributionFinishDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DistributionFinishDialog.kt\ncom/kubi/futures/trade/welfare/distribution/DistributionFinishDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,63:1\n143#2,20:64\n*S KotlinDebug\n*F\n+ 1 DistributionFinishDialog.kt\ncom/kubi/futures/trade/welfare/distribution/DistributionFinishDialog\n*L\n27#1:64,20\n*E\n"})
public final class DistributionFinishDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f24702q0 = C45681e.m100799e(this, new Function1<DistributionFinishDialog, C36847u>() { // from class: com.kubi.futures.trade.welfare.distribution.DistributionFinishDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36847u invoke(@NotNull DistributionFinishDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36847u.m82559a(fragment.requireView());
        }
    }, new Function1<C36847u, Unit>() { // from class: com.kubi.futures.trade.welfare.distribution.DistributionFinishDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36847u it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36847u c36847u) {
            invoke(c36847u);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: s0 */
    public static final /* synthetic */ KProperty<Object>[] f24701s0 = {Reflection.property1(new PropertyReference1Impl(DistributionFinishDialog.class, "binding", "getBinding()Lcom/kubi/kumex/databinding/BkumexDialogFutureBonusDistributionFinishBinding;", 0))};

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public static final Companion f24700r0 = new Companion(null);

    /* JADX INFO: compiled from: DistributionFinishDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/distribution/DistributionFinishDialog$Companion;", "", "<init>", "()V", "DISTRIBUTION_FINISH_DIALOG_KEY", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: p4 */
    public static final Unit m28544p4(DistributionFinishDialog distributionFinishDialog) {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, C45875l0.f103336a.m101334C0(), null, null, null, null, null, null, 126, null);
        distributionFinishDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m4 */
    public final C36847u m28545m4() {
        return (C36847u) this.f24702q0.getValue(this, f24701s0[0]);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.bkumex_dialog_future_bonus_distribution_finish, container);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        BaseTextView baseTextView;
        TextPaint paint;
        BaseTextView baseTextView2;
        TextPaint paint2;
        BaseTextView baseTextView3;
        KcPrimaryButton kcPrimaryButton;
        ImageView imageView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m54191p3();
        C43852m.m96591c(C17060n0.m36552b(), "RealTimeRewardOrderPlaced", "1", null, 8, null);
        C36847u c36847uM28545m4 = m28545m4();
        if (c36847uM28545m4 != null && (imageView = c36847uM28545m4.f81092c) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.futures.trade.welfare.distribution.i0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DistributionFinishDialog.m28542n4(this.f24729b);
                }
            }, 1, null);
        }
        C36847u c36847uM28545m5 = m28545m4();
        if (c36847uM28545m5 != null && (kcPrimaryButton = c36847uM28545m5.f81091b) != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.futures.trade.welfare.distribution.j0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DistributionFinishDialog.m28543o4(this.f24757b);
                }
            }, 1, null);
        }
        C36847u c36847uM28545m6 = m28545m4();
        if (c36847uM28545m6 != null && (baseTextView3 = c36847uM28545m6.f81097h) != null) {
            C27046k.m66711z(baseTextView3, 0L, new Function0() { // from class: com.kubi.futures.trade.welfare.distribution.k0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DistributionFinishDialog.m28544p4(this.f24759b);
                }
            }, 1, null);
        }
        C36847u c36847uM28545m7 = m28545m4();
        if (c36847uM28545m7 != null && (baseTextView2 = c36847uM28545m7.f81097h) != null && (paint2 = baseTextView2.getPaint()) != null) {
            paint2.setFlags(8);
        }
        C36847u c36847uM28545m8 = m28545m4();
        if (c36847uM28545m8 == null || (baseTextView = c36847uM28545m8.f81097h) == null || (paint = baseTextView.getPaint()) == null) {
            return;
        }
        paint.setAntiAlias(true);
    }

    /* JADX INFO: renamed from: n4 */
    public static final Unit m28542n4(DistributionFinishDialog distributionFinishDialog) {
        distributionFinishDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o4 */
    public static final Unit m28543o4(DistributionFinishDialog distributionFinishDialog) {
        FuturesFragment futuresFragment;
        Fragment parentFragment = distributionFinishDialog.getParentFragment();
        if (parentFragment instanceof FuturesFragment) {
            futuresFragment = (FuturesFragment) parentFragment;
        } else {
            futuresFragment = null;
        }
        if (futuresFragment != null) {
            futuresFragment.m36203z8();
        }
        distributionFinishDialog.dismiss();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        WindowManager.LayoutParams attributes;
        Window window;
        Window window2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            attributes = window2.getAttributes();
        } else {
            attributes = null;
        }
        if (attributes != null) {
            attributes.height = -1;
        }
        if (attributes != null) {
            attributes.gravity = 119;
        }
        if (attributes != null) {
            attributes.windowAnimations = 0;
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            window.setAttributes(attributes);
        }
    }
}
