package com.trtc.uikit.livekit.component.pippanel;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.component.pippanel.PIPTogglePanel;
import io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover;
import io.trtc.tuikit.atomicxcore.api.live.LiveEndedReason;
import io.trtc.tuikit.atomicxcore.api.live.LiveListListener;
import io.trtc.tuikit.atomicxcore.api.live.LiveListStore;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.trtc.uikit.livekit.component.pippanel.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: PIPTogglePanel.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000-\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000*\u0001\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u000eH\u0014J\b\u0010\u0010\u001a\u00020\u000eH\u0002J\u0006\u0010\u0011\u001a\u00020\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u0013"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/pippanel/PIPTogglePanel;", "Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;", "context", "Landroid/content/Context;", "liveID", "", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "getLiveID", "()Ljava/lang/String;", "liveListListener", "com/trtc/uikit/livekit/component/pippanel/PIPTogglePanel$liveListListener$1", "Lcom/trtc/uikit/livekit/component/pippanel/PIPTogglePanel$liveListListener$1;", "onStart", "", "onStop", "initView", "hasPictureInPicturePermission", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPIPTogglePanel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PIPTogglePanel.kt\ncom/trtc/uikit/livekit/component/pippanel/PIPTogglePanel\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,75:1\n29#2:76\n*S KotlinDebug\n*F\n+ 1 PIPTogglePanel.kt\ncom/trtc/uikit/livekit/component/pippanel/PIPTogglePanel\n*L\n51#1:76\n*E\n"})
public final class PIPTogglePanel extends AtomicPopover {

    /* JADX INFO: renamed from: m */
    @NotNull
    public final String f77999m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final a f78000n;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.pippanel.a$a */
    /* JADX INFO: compiled from: PIPTogglePanel.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\t"}, m90084d2 = {"com/trtc/uikit/livekit/component/pippanel/PIPTogglePanel$liveListListener$1", "Lio/trtc/tuikit/atomicxcore/api/live/LiveListListener;", "onLiveEnded", "", "liveID", "", "reason", "Lio/trtc/tuikit/atomicxcore/api/live/LiveEndedReason;", "message", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends LiveListListener {
        public a() {
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.LiveListListener
        public void onLiveEnded(String liveID, LiveEndedReason reason, String message) {
            Intrinsics.checkNotNullParameter(liveID, "liveID");
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(message, "message");
            PIPTogglePanel.this.dismiss();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PIPTogglePanel(@NotNull Context context, @NotNull String liveID) {
        super(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        this.f77999m = liveID;
        this.f78000n = new a();
        m79911E();
    }

    /* JADX INFO: renamed from: F */
    public static final void m79912F(PIPTogglePanel pIPTogglePanel, CompoundButton compoundButton, boolean z11) {
        PIPPanelStore.f77996b.sharedInstance().getF77998a().m99364i(z11);
        if (!z11 || pIPTogglePanel.m79913D()) {
            return;
        }
        Intent intent = new Intent("android.settings.PICTURE_IN_PICTURE_SETTINGS", Uri.parse("package:" + pIPTogglePanel.getContext().getPackageName()));
        intent.addFlags(268435456);
        pIPTogglePanel.getContext().startActivity(intent);
        pIPTogglePanel.dismiss();
    }

    @Override // io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover, android.app.Dialog
    public void onStop() {
        LiveListStore.INSTANCE.shared().removeLiveListListener(this.f78000n);
        super.onStop();
    }

    /* JADX INFO: renamed from: E */
    private final void m79911E() {
        boolean z11;
        View viewInflate = View.inflate(getContext(), R$layout.livekit_layout_pip_toggle_panel, null);
        SwitchCompat switchCompat = (SwitchCompat) viewInflate.findViewById(R$id.sc_enable_pip);
        boolean zM79913D = m79913D();
        if (switchCompat != null) {
            if (PIPPanelStore.f77996b.sharedInstance().getF77998a().getF101324e() && zM79913D) {
                z11 = true;
            } else {
                z11 = false;
            }
            switchCompat.setChecked(z11);
        }
        if (switchCompat != null) {
            switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: td0.b
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z12) {
                    PIPTogglePanel.m79912F(this.f101325b, compoundButton, z12);
                }
            });
        }
        Intrinsics.checkNotNull(viewInflate);
        m88181q(viewInflate);
    }

    /* JADX INFO: renamed from: D */
    public final boolean m79913D() {
        Object systemService = getContext().getSystemService("appops");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.AppOpsManager");
        AppOpsManager appOpsManager = (AppOpsManager) systemService;
        if (Build.VERSION.SDK_INT < 26 || appOpsManager.checkOpNoThrow("android:picture_in_picture", getContext().getApplicationInfo().uid, getContext().getPackageName()) != 0) {
            return false;
        }
        return true;
    }

    @Override // io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover, android.app.Dialog
    public void onStart() {
        super.onStart();
        LiveListStore.INSTANCE.shared().addLiveListListener(this.f78000n);
    }
}
