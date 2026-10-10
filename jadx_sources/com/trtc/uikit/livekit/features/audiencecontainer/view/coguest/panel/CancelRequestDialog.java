package com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.common.ErrorLocalized;
import ee0.C37144f;
import io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import vc0.C45494c;
import vc0.C45495d;

/* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.u, reason: from Kotlin metadata */
/* JADX INFO: compiled from: CancelRequestDialog.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0003J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/CancelRequestDialog;", "Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;", "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceStore$AudienceViewListener;", "context", "Landroid/content/Context;", "audienceStore", "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceStore;", "<init>", "(Landroid/content/Context;Lcom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceStore;)V", "initView", "", "onAttachedToWindow", "onDetachedFromWindow", "onRoomDismissed", "roomId", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CancelRequestDialog extends AtomicPopover implements C37144f.a {

    /* JADX INFO: renamed from: m */
    @NotNull
    public final C37144f f78883m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancelRequestDialog(@NotNull Context context, @NotNull C37144f audienceStore) {
        super(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(audienceStore, "audienceStore");
        this.f78883m = audienceStore;
        m81165H();
    }

    /* JADX INFO: renamed from: J */
    public static final Unit m81167J(final CancelRequestDialog cancelRequestDialog, C45494c completionHandler) {
        Intrinsics.checkNotNullParameter(completionHandler, "$this$completionHandler");
        completionHandler.m100462i(new Function0() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CancelRequestDialog.m81168K(this.f78882b);
            }
        });
        completionHandler.m100461h(new Function2() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.t
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CancelRequestDialog.m81169L(((Integer) obj).intValue(), (String) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K */
    public static final Unit m81168K(CancelRequestDialog cancelRequestDialog) {
        cancelRequestDialog.f78883m.getF82429k().m80790g(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L */
    public static final Unit m81169L(int i11, String str) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        ErrorLocalized.f77561a.onError(i11);
        return Unit.INSTANCE;
    }

    @Override // ee0.C37144f.a
    public void onRoomDismissed(@NotNull String roomId) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        dismiss();
    }

    @SuppressLint({"InflateParams"})
    /* JADX INFO: renamed from: H */
    private final void m81165H() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R$layout.livekit_dialog_co_guest_cancel, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R$id.tv_cancel_co_guest);
        TextView textView2 = (TextView) viewInflate.findViewById(R$id.tv_dismiss);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CancelRequestDialog.m81166I(this.f78879b, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CancelRequestDialog.m81170M(this.f78880b, view);
            }
        });
        Intrinsics.checkNotNull(viewInflate);
        m88181q(viewInflate);
    }

    /* JADX INFO: renamed from: I */
    public static final void m81166I(final CancelRequestDialog cancelRequestDialog, View view) {
        if (!view.isEnabled()) {
            return;
        }
        view.setEnabled(false);
        cancelRequestDialog.f78883m.getF82424f().cancelApplication(C45495d.m100463a(new Function1() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.r
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CancelRequestDialog.m81167J(this.f78881b, (C45494c) obj);
            }
        }));
        cancelRequestDialog.dismiss();
    }

    /* JADX INFO: renamed from: M */
    public static final void m81170M(CancelRequestDialog cancelRequestDialog, View view) {
        cancelRequestDialog.dismiss();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f78883m.m83085d(this);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f78883m.m83081B(this);
    }
}
