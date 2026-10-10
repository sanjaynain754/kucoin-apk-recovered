package com.trtc.uikit.livekit.component.networkInfo.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.trtc.uikit.livekit.component.networkInfo.view.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AudioModePanel.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u000eH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/networkInfo/view/AudioModePanel;", "Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "textDefault", "Landroid/widget/TextView;", "textSpeech", "textMusic", "textCancel", "audioModeListener", "Lcom/trtc/uikit/livekit/component/networkInfo/view/NetworkInfoPanel$OnAudioModeListener;", "initView", "", "setAudioModeListener", "bindViewId", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "setClickListener", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AudioModePanel extends AtomicPopover {

    /* JADX INFO: renamed from: m */
    public TextView f77987m;

    /* JADX INFO: renamed from: n */
    public TextView f77988n;

    /* JADX INFO: renamed from: o */
    public TextView f77989o;

    /* JADX INFO: renamed from: p */
    public TextView f77990p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public NetworkInfoPanel.InterfaceC35949a f77991q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioModePanel(@NotNull Context context) {
        super(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
        m79902E();
    }

    /* JADX INFO: renamed from: D */
    private final void m79901D(View view) {
        View viewFindViewById = view.findViewById(R$id.tv_default);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f77987m = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R$id.tv_speech);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f77988n = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R$id.tv_music);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f77989o = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R$id.tv_cancel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f77990p = (TextView) viewFindViewById4;
    }

    /* JADX INFO: renamed from: F */
    public final void m79904F() {
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.trtc.uikit.livekit.component.networkInfo.view.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AudioModePanel.m79903G(this.f77986b, view);
            }
        };
        TextView textView = this.f77987m;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textDefault");
            textView = null;
        }
        textView.setOnClickListener(onClickListener);
        TextView textView3 = this.f77988n;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textSpeech");
            textView3 = null;
        }
        textView3.setOnClickListener(onClickListener);
        TextView textView4 = this.f77989o;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textMusic");
            textView4 = null;
        }
        textView4.setOnClickListener(onClickListener);
        TextView textView5 = this.f77990p;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textCancel");
        } else {
            textView2 = textView5;
        }
        textView2.setOnClickListener(onClickListener);
    }

    public final void setAudioModeListener(@NotNull NetworkInfoPanel.InterfaceC35949a audioModeListener) {
        Intrinsics.checkNotNullParameter(audioModeListener, "audioModeListener");
        this.f77991q = audioModeListener;
    }

    /* JADX INFO: renamed from: E */
    private final void m79902E() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R$layout.network_info_audio_mode_panel, (ViewGroup) null);
        Intrinsics.checkNotNull(viewInflate);
        m79901D(viewInflate);
        m79904F();
        m88181q(viewInflate);
    }

    /* JADX INFO: renamed from: G */
    public static final void m79903G(AudioModePanel audioModePanel, View view) {
        NetworkInfoPanel.InterfaceC35949a interfaceC35949a;
        int id2 = view.getId();
        if (id2 == R$id.tv_default) {
            NetworkInfoPanel.InterfaceC35949a interfaceC35949a2 = audioModePanel.f77991q;
            if (interfaceC35949a2 != null) {
                interfaceC35949a2.mo79889a(TUIRoomDefine.AudioQuality.DEFAULT);
            }
        } else if (id2 == R$id.tv_speech) {
            NetworkInfoPanel.InterfaceC35949a interfaceC35949a3 = audioModePanel.f77991q;
            if (interfaceC35949a3 != null) {
                interfaceC35949a3.mo79889a(TUIRoomDefine.AudioQuality.SPEECH);
            }
        } else if (id2 == R$id.tv_music && (interfaceC35949a = audioModePanel.f77991q) != null) {
            interfaceC35949a.mo79889a(TUIRoomDefine.AudioQuality.MUSIC);
        }
        audioModePanel.hide();
    }
}
