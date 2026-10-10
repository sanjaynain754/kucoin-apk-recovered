package com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import ee0.C37144f;
import io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.y, reason: from Kotlin metadata */
/* JADX INFO: compiled from: StopCoGuestDialog.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/StopCoGuestDialog;", "Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;", "context", "Landroid/content/Context;", "audienceStore", "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceStore;", "<init>", "(Landroid/content/Context;Lcom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceStore;)V", "initView", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class StopCoGuestDialog extends AtomicPopover {

    /* JADX INFO: renamed from: m */
    @NotNull
    public final C37144f f78887m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopCoGuestDialog(@NotNull Context context, @NotNull C37144f audienceStore) {
        super(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(audienceStore, "audienceStore");
        this.f78887m = audienceStore;
        m81173E();
    }

    /* JADX INFO: renamed from: F */
    public static final void m81174F(StopCoGuestDialog stopCoGuestDialog, View view) {
        stopCoGuestDialog.f78887m.getF82424f().disconnect(null);
        stopCoGuestDialog.f78887m.getF82429k().m80790g(false);
        stopCoGuestDialog.dismiss();
    }

    @SuppressLint({"InflateParams"})
    /* JADX INFO: renamed from: E */
    private final void m81173E() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R$layout.livekit_dialog_co_guest_stop, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R$id.tv_stop_co_guest);
        TextView textView2 = (TextView) viewInflate.findViewById(R$id.tv_dismiss);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StopCoGuestDialog.m81174F(this.f78885b, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StopCoGuestDialog.m81175G(this.f78886b, view);
            }
        });
        Intrinsics.checkNotNull(viewInflate);
        m88181q(viewInflate);
    }

    /* JADX INFO: renamed from: G */
    public static final void m81175G(StopCoGuestDialog stopCoGuestDialog, View view) {
        stopCoGuestDialog.dismiss();
    }
}
