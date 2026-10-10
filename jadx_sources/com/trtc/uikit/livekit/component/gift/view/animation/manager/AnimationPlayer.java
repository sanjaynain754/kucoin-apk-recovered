package com.trtc.uikit.livekit.component.gift.view.animation.manager;

import com.google.firebase.messaging.Constants;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import pd0.C43444a;

/* JADX INFO: renamed from: com.trtc.uikit.livekit.component.gift.view.animation.manager.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AnimationPlayer.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\t\u001a\u00020\u0005H&J\u0012\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&¨\u0006\u000e"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/AnimationPlayer;", "", "<init>", "()V", "preparePlay", "", "model", "Lcom/trtc/uikit/livekit/component/gift/viewmodel/GiftModel;", "startPlay", "stopPlay", "setCallback", TUIConstants.TUIChat.CALL_BACK, "Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/AnimationPlayer$PlayCallback;", "PlayCallback", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class AnimationPlayer {

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.gift.view.animation.manager.a$a */
    /* JADX INFO: compiled from: AnimationPlayer.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/AnimationPlayer$PlayCallback;", "", "onFinished", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo79721a(int i11);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo79654a(@NotNull C43444a c43444a);

    /* JADX INFO: renamed from: b */
    public abstract void mo79655b(@Nullable a aVar);

    /* JADX INFO: renamed from: c */
    public abstract void mo79656c(@NotNull C43444a c43444a);

    /* JADX INFO: renamed from: d */
    public abstract void mo79657d();
}
