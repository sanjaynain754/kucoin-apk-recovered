package com.trtc.uikit.livekit.p180kc.web3;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import vd0.C45516c;

/* JADX INFO: compiled from: KCWeb3UpdateCardConfirmDialog.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u000bH\u0002J\b\u0010\u001a\u001a\u00020\u000bH\u0002J\u0010\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u000bH\u0016J\b\u0010\u001f\u001a\u00020\u000eH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/web3/KCWeb3UpdateCardConfirmDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "_binding", "Lcom/trtc/uikit/livekit/databinding/LiveKcDialogWeb3UpdateCardBinding;", "binding", "getBinding", "()Lcom/trtc/uikit/livekit/databinding/LiveKcDialogWeb3UpdateCardBinding;", "onConfirm", "Lkotlin/Function0;", "", "onCancel", "handledAction", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "handleConfirm", "handleCancel", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "onDestroyView", "isBottomSheet", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KCWeb3UpdateCardConfirmDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public static final Companion f79202u0 = new Companion(null);

    /* JADX INFO: renamed from: q0 */
    @Nullable
    public C45516c f79203q0;

    /* JADX INFO: renamed from: r0 */
    @Nullable
    public Function0<Unit> f79204r0;

    /* JADX INFO: renamed from: s0 */
    @Nullable
    public Function0<Unit> f79205s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f79206t0;

    /* JADX INFO: compiled from: KCWeb3UpdateCardConfirmDialog.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/web3/KCWeb3UpdateCardConfirmDialog$Companion;", "", "<init>", "()V", "TAG", "", "KEY_TIPS", TIMPushProvider.f75062n, "", "activity", "Landroidx/fragment/app/FragmentActivity;", "tips", "onConfirm", "Lkotlin/Function0;", "", "onCancel", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final boolean show(@Nullable FragmentActivity activity, @NotNull String tips, @NotNull Function0<Unit> onConfirm, @NotNull Function0<Unit> onCancel) {
            Intrinsics.checkNotNullParameter(tips, "tips");
            Intrinsics.checkNotNullParameter(onConfirm, "onConfirm");
            Intrinsics.checkNotNullParameter(onCancel, "onCancel");
            if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                return false;
            }
            KCWeb3UpdateCardConfirmDialog kCWeb3UpdateCardConfirmDialog = new KCWeb3UpdateCardConfirmDialog();
            Bundle bundle = new Bundle();
            bundle.putInt("type", 4);
            bundle.putBoolean("isAnimationEnabled", true);
            bundle.putString("tips", tips);
            kCWeb3UpdateCardConfirmDialog.setArguments(bundle);
            kCWeb3UpdateCardConfirmDialog.f79204r0 = onConfirm;
            kCWeb3UpdateCardConfirmDialog.f79205s0 = onCancel;
            kCWeb3UpdateCardConfirmDialog.m54194t3(activity, "Live_KCWeb3UpdateCardConfirmDialog");
            return true;
        }
    }

    /* JADX INFO: renamed from: p4 */
    private final void m81615p4() {
        this.f79206t0 = true;
        Function0<Unit> function0 = this.f79205s0;
        if (function0 != null) {
            function0.invoke();
        }
        dismiss();
    }

    /* JADX INFO: renamed from: q4 */
    private final void m81616q4() {
        this.f79206t0 = true;
        Function0<Unit> function0 = this.f79204r0;
        if (function0 != null) {
            function0.invoke();
        }
        dismiss();
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return false;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f79203q0 = null;
        super.onDestroyView();
    }

    /* JADX INFO: renamed from: o4, reason: from getter */
    public final C45516c getF79203q0() {
        return this.f79203q0;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f79203q0 = C45516c.m100503c(inflater, container, false);
        C45516c f79203q0 = getF79203q0();
        if (f79203q0 != null) {
            return f79203q0.f102568h;
        }
        return null;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        Function0<Unit> function0;
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        if (!this.f79206t0 && (function0 = this.f79205s0) != null) {
            function0.invoke();
        }
        this.f79204r0 = null;
        this.f79205s0 = null;
        super.onDismiss(dialog);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        TextView textView;
        TextView textView2;
        ImageView imageView;
        TextView textView3;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C45516c f79203q0 = getF79203q0();
        if (f79203q0 != null && (textView3 = f79203q0.f102567g) != null) {
            Bundle arguments = getArguments();
            String string = arguments != null ? arguments.getString("tips") : null;
            if (string == null) {
                string = "";
            }
            textView3.setText(string);
        }
        C45516c f79203q1 = getF79203q0();
        if (f79203q1 != null && (imageView = f79203q1.f102565e) != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.kc.web3.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    KCWeb3UpdateCardConfirmDialog.m81617r4(this.f79212b, view2);
                }
            });
        }
        C45516c f79203q2 = getF79203q0();
        if (f79203q2 != null && (textView2 = f79203q2.f102564d) != null) {
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.kc.web3.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    KCWeb3UpdateCardConfirmDialog.m81618s4(this.f79213b, view2);
                }
            });
        }
        C45516c f79203q3 = getF79203q0();
        if (f79203q3 == null || (textView = f79203q3.f102566f) == null) {
            return;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.kc.web3.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                KCWeb3UpdateCardConfirmDialog.m81619t4(this.f79214b, view2);
            }
        });
    }

    /* JADX INFO: renamed from: r4 */
    public static final void m81617r4(KCWeb3UpdateCardConfirmDialog kCWeb3UpdateCardConfirmDialog, View view) {
        kCWeb3UpdateCardConfirmDialog.m81615p4();
    }

    /* JADX INFO: renamed from: s4 */
    public static final void m81618s4(KCWeb3UpdateCardConfirmDialog kCWeb3UpdateCardConfirmDialog, View view) {
        kCWeb3UpdateCardConfirmDialog.m81615p4();
    }

    /* JADX INFO: renamed from: t4 */
    public static final void m81619t4(KCWeb3UpdateCardConfirmDialog kCWeb3UpdateCardConfirmDialog, View view) {
        kCWeb3UpdateCardConfirmDialog.m81616q4();
    }
}
