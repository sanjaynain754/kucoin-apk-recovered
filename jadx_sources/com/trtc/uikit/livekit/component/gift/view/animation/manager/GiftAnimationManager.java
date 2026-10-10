package com.trtc.uikit.livekit.component.gift.view.animation.manager;

import android.util.Log;
import com.google.firebase.messaging.Constants;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import com.trtc.uikit.livekit.component.gift.view.animation.manager.GiftAnimationManager;
import io.trtc.tuikit.atomicxcore.api.gift.Gift;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import pd0.C43444a;

/* JADX INFO: compiled from: GiftAnimationManager.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\bJ\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\bJ\u0006\u0010\u0014\u001a\u00020\u000eJ\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\bH\u0002J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/GiftAnimationManager;", "", "<init>", "()V", "logger", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "giftPrepareList", "", "Lcom/trtc/uikit/livekit/component/gift/viewmodel/GiftModel;", "animationPlayer", "Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/AnimationPlayer;", "isPlaying", "", "setPlayer", "", "player", "add", "gift", "startPlay", "model", "stopPlay", "preparePlay", "onFinished", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class GiftAnimationManager {

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Companion f77821e = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final LiveKitLogger f77822a = LiveKitLogger.f77564c.getComponentLogger("GiftAnimationManager");

    /* JADX INFO: renamed from: b */
    @NotNull
    public final List<C43444a> f77823b = new ArrayList();

    /* JADX INFO: renamed from: c */
    @Nullable
    public AnimationPlayer f77824c;

    /* JADX INFO: renamed from: d */
    public boolean f77825d;

    /* JADX INFO: compiled from: GiftAnimationManager.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/GiftAnimationManager$Companion;", "", "<init>", "()V", "TAG", "", "MAX_CACHE_SIZE", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m79715b(@NotNull C43444a gift) {
        Intrinsics.checkNotNullParameter(gift, "gift");
        if (!gift.getF95976d() || this.f77823b.isEmpty()) {
            this.f77823b.add(gift);
        } else {
            int size = this.f77823b.size() - 1;
            while (true) {
                if (size <= 0) {
                    size = 0;
                    break;
                } else if (this.f77823b.get(size).getF95976d()) {
                    break;
                } else {
                    size--;
                }
            }
            this.f77823b.add(size + 1, gift);
        }
        if (this.f77823b.size() == 4) {
            int size2 = this.f77823b.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size2) {
                    i11 = 1;
                    break;
                } else if (!this.f77823b.get(i11).getF95976d()) {
                    break;
                } else {
                    i11++;
                }
            }
            this.f77823b.remove(i11);
        }
        if (this.f77823b.size() != 1 || this.f77825d) {
            return;
        }
        m79717d(this.f77823b.remove(0));
    }

    /* JADX INFO: renamed from: c */
    public final void m79716c(int i11) {
        Log.i("GiftAnimationManager", "onFinished:" + i11);
        this.f77825d = false;
        if (this.f77823b.isEmpty()) {
            return;
        }
        m79717d(this.f77823b.remove(0));
    }

    /* JADX INFO: renamed from: d */
    public final void m79717d(C43444a c43444a) {
        LiveKitLogger liveKitLogger = this.f77822a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("preparePlay:");
        Gift f95973a = c43444a.getF95973a();
        sb2.append(f95973a != null ? f95973a.getResourceURL() : null);
        sb2.append(",isPlaying:");
        sb2.append(this.f77825d);
        liveKitLogger.m79404b(sb2.toString());
        this.f77825d = true;
        AnimationPlayer animationPlayer = this.f77824c;
        if (animationPlayer != null) {
            animationPlayer.mo79654a(c43444a);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m79718e(@Nullable AnimationPlayer animationPlayer) {
        this.f77824c = animationPlayer;
        if (animationPlayer != null) {
            animationPlayer.mo79655b(new AnimationPlayer.a() { // from class: od0.a
                @Override // com.trtc.uikit.livekit.component.gift.view.animation.manager.AnimationPlayer.a
                /* JADX INFO: renamed from: a */
                public final void mo79721a(int i11) {
                    GiftAnimationManager.m79714f(this.f95198a, i11);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m79719g(@NotNull C43444a model) {
        Intrinsics.checkNotNullParameter(model, "model");
        LiveKitLogger liveKitLogger = this.f77822a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("startPlay:");
        Gift f95973a = model.getF95973a();
        sb2.append(f95973a != null ? f95973a.getResourceURL() : null);
        sb2.append(",isPlaying:");
        sb2.append(this.f77825d);
        liveKitLogger.m79404b(sb2.toString());
        AnimationPlayer animationPlayer = this.f77824c;
        if (animationPlayer != null) {
            animationPlayer.mo79656c(model);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m79720h() {
        this.f77822a.m79404b("startPlay:isPlaying:" + this.f77825d);
        this.f77825d = false;
        AnimationPlayer animationPlayer = this.f77824c;
        if (animationPlayer != null) {
            animationPlayer.mo79657d();
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m79714f(GiftAnimationManager giftAnimationManager, int i11) {
        giftAnimationManager.m79716c(i11);
    }
}
