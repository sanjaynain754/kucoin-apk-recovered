package com.trtc.uikit.livekit.features.anchorboardcast.view.battle.panel;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.R$string;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import com.trtc.uikit.livekit.features.anchorboardcast.view.battle.panel.AnchorEndBattleDialog;
import io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnchorEndBattleDialog.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0002\u0010\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\u0010\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u0007J\b\u0010\u000e\u001a\u00020\tH\u0002J\b\u0010\u000f\u001a\u00020\tH\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/AnchorEndBattleDialog;", "Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "onEndBattleListener", "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/AnchorEndBattleDialog$OnEndBattleListener;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setOnEndBattleListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "initEndLiveButton", "initCancelButton", "Companion", "OnEndBattleListener", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AnchorEndBattleDialog extends AtomicPopover {

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final Companion f78209n = new Companion(null);

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final LiveKitLogger f78210o = LiveKitLogger.f77564c.getFeaturesLogger("AnchorEndBattleDialog");

    /* JADX INFO: renamed from: m */
    @Nullable
    public InterfaceC36067a f78211m;

    /* JADX INFO: compiled from: AnchorEndBattleDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/AnchorEndBattleDialog$Companion;", "", "<init>", "()V", "LOGGER", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.battle.panel.AnchorEndBattleDialog$a */
    /* JADX INFO: compiled from: AnchorEndBattleDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/AnchorEndBattleDialog$OnEndBattleListener;", "", "onEndBattle", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC36067a {
        /* JADX INFO: renamed from: a */
        void mo80150a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorEndBattleDialog(@NotNull Context context) {
        super(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
        View viewInflate = getLayoutInflater().inflate(R$layout.livekit_anchor_end_battle_panel, (ViewGroup) null);
        Intrinsics.checkNotNull(viewInflate);
        m88181q(viewInflate);
    }

    /* JADX INFO: renamed from: E */
    public final void m80264E() {
        TextView textView = (TextView) findViewById(R$id.tv_cancel);
        if (textView != null) {
            textView.setText(getContext().getString(R$string.common_cancel));
        }
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: zd0.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AnchorEndBattleDialog.m80262F(this.f104637b, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m80265G() {
        TextView textView = (TextView) findViewById(R$id.tv_end_live);
        if (textView != null) {
            textView.setText(getContext().getString(R$string.common_battle_end_pk));
        }
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: zd0.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AnchorEndBattleDialog.m80263H(this.f104636b, view);
                }
            });
        }
    }

    public final void setOnEndBattleListener(@Nullable InterfaceC36067a interfaceC36067a) {
        this.f78211m = interfaceC36067a;
    }

    /* JADX INFO: renamed from: F */
    public static final void m80262F(AnchorEndBattleDialog anchorEndBattleDialog, View view) {
        anchorEndBattleDialog.dismiss();
    }

    /* JADX INFO: renamed from: H */
    public static final void m80263H(AnchorEndBattleDialog anchorEndBattleDialog, View view) {
        anchorEndBattleDialog.dismiss();
        InterfaceC36067a interfaceC36067a = anchorEndBattleDialog.f78211m;
        if (interfaceC36067a != null && interfaceC36067a != null) {
            interfaceC36067a.mo80150a();
        }
    }

    @Override // io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover, android.app.Dialog
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m80264E();
        m80265G();
    }
}
