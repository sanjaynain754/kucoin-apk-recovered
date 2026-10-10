package com.trtc.uikit.livekit.component.gift.view.animation;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.firebase.messaging.Constants;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnimationView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0018B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH&J\b\u0010\u0017\u001a\u00020\u0015H&R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", TUIConstants.TUIChat.CALL_BACK, "Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView$Callback;", "getCallback", "()Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView$Callback;", "setCallback", "(Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView$Callback;)V", "roomId", "", "getRoomId", "()Ljava/lang/String;", "setRoomId", "(Ljava/lang/String;)V", "playAnimation", "", "playUrl", "stopPlay", "Callback", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class AnimationView extends FrameLayout {

    /* JADX INFO: renamed from: b */
    @Nullable
    public InterfaceC35926a f77795b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public String f77796c;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.gift.view.animation.AnimationView$a */
    /* JADX INFO: compiled from: AnimationView.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView$Callback;", "", "onFinished", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC35926a {
        /* JADX INFO: renamed from: a */
        void mo79658a(int i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public AnimationView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo79684d(@NotNull String str);

    /* JADX INFO: renamed from: e */
    public abstract void mo79685e();

    public /* synthetic */ AnimationView(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    @Nullable
    /* JADX INFO: renamed from: getCallback, reason: from getter */
    public final InterfaceC35926a getF77795b() {
        return this.f77795b;
    }

    @NotNull
    /* JADX INFO: renamed from: getRoomId, reason: from getter */
    public final String getF77796c() {
        return this.f77796c;
    }

    public final void setCallback(@Nullable InterfaceC35926a interfaceC35926a) {
        this.f77795b = interfaceC35926a;
    }

    public final void setRoomId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f77796c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AnimationView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f77796c = "";
    }
}
