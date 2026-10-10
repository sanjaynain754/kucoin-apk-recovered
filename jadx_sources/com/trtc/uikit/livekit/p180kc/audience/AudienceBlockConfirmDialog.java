package com.trtc.uikit.livekit.p180kc.audience;

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
import com.trtc.uikit.livekit.p180kc.audience.AudienceBlockConfirmDialog;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import vd0.C45514a;

/* JADX INFO: compiled from: AudienceBlockConfirmDialog.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u000bH\u0002J\b\u0010\u0017\u001a\u00020\u000bH\u0002J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u000bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/audience/AudienceBlockConfirmDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "_binding", "Lcom/trtc/uikit/livekit/databinding/LiveKcAudienceBlockConfirmDialogBinding;", "binding", "getBinding", "()Lcom/trtc/uikit/livekit/databinding/LiveKcAudienceBlockConfirmDialogBinding;", "onConfirm", "Lkotlin/Function0;", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "handleConfirm", "handleCancel", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "onDestroyView", "isBottomSheet", "", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AudienceBlockConfirmDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public static final Companion f79153s0 = new Companion(null);

    /* JADX INFO: renamed from: q0 */
    @Nullable
    public C45514a f79154q0;

    /* JADX INFO: renamed from: r0 */
    @Nullable
    public Function0<Unit> f79155r0;

    /* JADX INFO: compiled from: AudienceBlockConfirmDialog.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/audience/AudienceBlockConfirmDialog$Companion;", "", "<init>", "()V", "TAG", "", TIMPushProvider.f75062n, "", "activity", "Landroidx/fragment/app/FragmentActivity;", "onConfirm", "Lkotlin/Function0;", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final boolean show(@Nullable FragmentActivity activity, @NotNull Function0<Unit> onConfirm) {
            Intrinsics.checkNotNullParameter(onConfirm, "onConfirm");
            if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                return false;
            }
            AudienceBlockConfirmDialog audienceBlockConfirmDialog = new AudienceBlockConfirmDialog();
            Bundle bundle = new Bundle();
            bundle.putInt("type", 4);
            bundle.putBoolean("isAnimationEnabled", true);
            audienceBlockConfirmDialog.setArguments(bundle);
            audienceBlockConfirmDialog.f79155r0 = onConfirm;
            audienceBlockConfirmDialog.m54194t3(activity, "Live_AudienceBlockConfirmDialog");
            return true;
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return false;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f79154q0 = null;
        super.onDestroyView();
    }

    /* JADX INFO: renamed from: p4 */
    private final void m81501p4() {
        Function0<Unit> function0 = this.f79155r0;
        if (function0 != null) {
            function0.invoke();
        }
        dismiss();
    }

    /* JADX INFO: renamed from: n4, reason: from getter */
    public final C45514a getF79154q0() {
        return this.f79154q0;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f79154q0 = C45514a.m100497c(inflater, container, false);
        C45514a f79154q0 = getF79154q0();
        if (f79154q0 != null) {
            return f79154q0.f102548h;
        }
        return null;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        this.f79155r0 = null;
        super.onDismiss(dialog);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        TextView textView;
        TextView textView2;
        ImageView imageView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C45514a f79154q0 = getF79154q0();
        if (f79154q0 != null && (imageView = f79154q0.f102545e) != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: ke0.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AudienceBlockConfirmDialog.m81502q4(this.f91234b, view2);
                }
            });
        }
        C45514a f79154q1 = getF79154q0();
        if (f79154q1 != null && (textView2 = f79154q1.f102544d) != null) {
            textView2.setOnClickListener(new View.OnClickListener() { // from class: ke0.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AudienceBlockConfirmDialog.m81503r4(this.f91235b, view2);
                }
            });
        }
        C45514a f79154q2 = getF79154q0();
        if (f79154q2 == null || (textView = f79154q2.f102546f) == null) {
            return;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: ke0.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AudienceBlockConfirmDialog.m81504s4(this.f91236b, view2);
            }
        });
    }

    /* JADX INFO: renamed from: q4 */
    public static final void m81502q4(AudienceBlockConfirmDialog audienceBlockConfirmDialog, View view) {
        audienceBlockConfirmDialog.m81506o4();
    }

    /* JADX INFO: renamed from: r4 */
    public static final void m81503r4(AudienceBlockConfirmDialog audienceBlockConfirmDialog, View view) {
        audienceBlockConfirmDialog.m81506o4();
    }

    /* JADX INFO: renamed from: s4 */
    public static final void m81504s4(AudienceBlockConfirmDialog audienceBlockConfirmDialog, View view) {
        audienceBlockConfirmDialog.m81501p4();
    }

    /* JADX INFO: renamed from: o4 */
    public final void m81506o4() {
        dismiss();
    }
}
