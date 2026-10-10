package io.trtc.tuikit.atomicxcore.api.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.cloud.tuikit.engine.common.TUIVideoView;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.room.RoomParticipant;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import io.trtc.tuikit.atomicxcore.impl.view.room.AbstractC40148b;
import io.trtc.tuikit.atomicxcore.impl.view.room.AbstractC40150d;
import io.trtc.tuikit.atomicxcore.impl.view.room.C40151e;
import io.trtc.tuikit.atomicxcore.impl.view.room.C40155i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010$\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0007H\u0014¢\u0006\u0004\b$\u0010%J\u0019\u0010(\u001a\u00020\u000f2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u000fH\u0016¢\u0006\u0004\b*\u0010\u001fJ\u001f\u0010/\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100R\u001a\u00101\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u00106\u001a\u0002058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001a\u0010;\u001a\u00020:8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010\u0013R$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010\u0015R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010\u0019R\"\u0010\u001b\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010\u001dR\"\u0010P\u001a\u00020O8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010V\u001a\u00020O8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bV\u0010Q\u001a\u0004\bW\u0010S\"\u0004\bX\u0010UR\"\u0010Y\u001a\u00020O8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bY\u0010Q\u001a\u0004\bZ\u0010S\"\u0004\b[\u0010UR\"\u0010\\\u001a\u00020O8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\\\u0010Q\u001a\u0004\b]\u0010S\"\u0004\b^\u0010UR\"\u0010`\u001a\u00020_8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010f\u001a\u00020_8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bf\u0010a\u001a\u0004\bg\u0010c\"\u0004\bh\u0010eR\"\u0010i\u001a\u00020O8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bi\u0010Q\u001a\u0004\bj\u0010S\"\u0004\bk\u0010UR\"\u0010l\u001a\u00020O8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bl\u0010Q\u001a\u0004\bm\u0010S\"\u0004\bn\u0010UR$\u0010p\u001a\u0004\u0018\u00010o8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR$\u0010'\u001a\u0004\u0018\u00010&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010)R\"\u0010z\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bz\u0010K\u001a\u0004\b{\u0010M\"\u0004\b|\u0010\u001d¨\u0006}"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;", "Landroid/widget/FrameLayout;", "Landroid/view/View$OnTouchListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lio/trtc/tuikit/atomicxcore/api/view/VideoStreamType;", "streamType", "Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;", "participant", "", "init", "(Lio/trtc/tuikit/atomicxcore/api/view/VideoStreamType;Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;)V", "updateStreamType", "(Lio/trtc/tuikit/atomicxcore/api/view/VideoStreamType;)V", "updateParticipant", "(Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;)V", "Lio/trtc/tuikit/atomicxcore/api/view/FillMode;", "fillMode", "setFillMode", "(Lio/trtc/tuikit/atomicxcore/api/view/FillMode;)V", "", "isActive", "setActive", "(Z)V", "onDetachedFromWindow", "()V", "w", CmcdData.Factory.STREAMING_FORMAT_HLS, "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/view/View$OnClickListener;", "clickListener", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "requestLayout", "Landroid/view/View;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/MotionEvent;", "event", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "oid", "I", "getOid$atomicxcore_release", "()I", "Lio/trtc/tuikit/atomicxcore/impl/common/r;", "log", "Lio/trtc/tuikit/atomicxcore/impl/common/r;", "getLog$atomicxcore_release", "()Lio/trtc/tuikit/atomicxcore/impl/common/r;", "Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;", "videoView", "Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;", "getVideoView$atomicxcore_release", "()Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;", "Lio/trtc/tuikit/atomicxcore/api/view/VideoStreamType;", "getStreamType$atomicxcore_release", "()Lio/trtc/tuikit/atomicxcore/api/view/VideoStreamType;", "setStreamType$atomicxcore_release", "Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;", "getParticipant$atomicxcore_release", "()Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;", "setParticipant$atomicxcore_release", "Lio/trtc/tuikit/atomicxcore/api/view/FillMode;", "getFillMode$atomicxcore_release", "()Lio/trtc/tuikit/atomicxcore/api/view/FillMode;", "setFillMode$atomicxcore_release", "Z", "isActive$atomicxcore_release", "()Z", "setActive$atomicxcore_release", "", "pressedPoint1X", "F", "getPressedPoint1X$atomicxcore_release", "()F", "setPressedPoint1X$atomicxcore_release", "(F)V", "pressedPoint2X", "getPressedPoint2X$atomicxcore_release", "setPressedPoint2X$atomicxcore_release", "pressedPoint1Y", "getPressedPoint1Y$atomicxcore_release", "setPressedPoint1Y$atomicxcore_release", "pressedPoint2Y", "getPressedPoint2Y$atomicxcore_release", "setPressedPoint2Y$atomicxcore_release", "", "distBeforeMove", "D", "getDistBeforeMove$atomicxcore_release", "()D", "setDistBeforeMove$atomicxcore_release", "(D)V", "distAfterMove", "getDistAfterMove$atomicxcore_release", "setDistAfterMove$atomicxcore_release", "touchDownPointX", "getTouchDownPointX$atomicxcore_release", "setTouchDownPointX$atomicxcore_release", "touchDownPointY", "getTouchDownPointY$atomicxcore_release", "setTouchDownPointY$atomicxcore_release", "Ljava/lang/Runnable;", "measureLayoutRunnable", "Ljava/lang/Runnable;", "getMeasureLayoutRunnable$atomicxcore_release", "()Ljava/lang/Runnable;", "setMeasureLayoutRunnable$atomicxcore_release", "(Ljava/lang/Runnable;)V", "Landroid/view/View$OnClickListener;", "getClickListener$atomicxcore_release", "()Landroid/view/View$OnClickListener;", "setClickListener$atomicxcore_release", "isClickAction", "isClickAction$atomicxcore_release", "setClickAction$atomicxcore_release", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final class RoomParticipantView extends FrameLayout implements View.OnTouchListener {

    @Nullable
    private View.OnClickListener clickListener;
    private double distAfterMove;
    private double distBeforeMove;

    @Nullable
    private FillMode fillMode;
    private boolean isActive;
    private boolean isClickAction;

    @NotNull
    private final C39510r log;

    @Nullable
    private Runnable measureLayoutRunnable;
    private final int oid;

    @Nullable
    private RoomParticipant participant;
    private float pressedPoint1X;
    private float pressedPoint1Y;
    private float pressedPoint2X;
    private float pressedPoint2Y;

    @Nullable
    private VideoStreamType streamType;
    private float touchDownPointX;
    private float touchDownPointY;

    @NotNull
    private final TUIVideoView videoView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomParticipantView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomParticipantView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Nullable
    /* JADX INFO: renamed from: getClickListener$atomicxcore_release, reason: from getter */
    public final View.OnClickListener getClickListener() {
        return this.clickListener;
    }

    /* JADX INFO: renamed from: getDistAfterMove$atomicxcore_release, reason: from getter */
    public final double getDistAfterMove() {
        return this.distAfterMove;
    }

    /* JADX INFO: renamed from: getDistBeforeMove$atomicxcore_release, reason: from getter */
    public final double getDistBeforeMove() {
        return this.distBeforeMove;
    }

    @Nullable
    /* JADX INFO: renamed from: getFillMode$atomicxcore_release, reason: from getter */
    public final FillMode getFillMode() {
        return this.fillMode;
    }

    @NotNull
    /* JADX INFO: renamed from: getLog$atomicxcore_release, reason: from getter */
    public final C39510r getLog() {
        return this.log;
    }

    @Nullable
    /* JADX INFO: renamed from: getMeasureLayoutRunnable$atomicxcore_release, reason: from getter */
    public final Runnable getMeasureLayoutRunnable() {
        return this.measureLayoutRunnable;
    }

    /* JADX INFO: renamed from: getOid$atomicxcore_release, reason: from getter */
    public final int getOid() {
        return this.oid;
    }

    @Nullable
    /* JADX INFO: renamed from: getParticipant$atomicxcore_release, reason: from getter */
    public final RoomParticipant getParticipant() {
        return this.participant;
    }

    /* JADX INFO: renamed from: getPressedPoint1X$atomicxcore_release, reason: from getter */
    public final float getPressedPoint1X() {
        return this.pressedPoint1X;
    }

    /* JADX INFO: renamed from: getPressedPoint1Y$atomicxcore_release, reason: from getter */
    public final float getPressedPoint1Y() {
        return this.pressedPoint1Y;
    }

    /* JADX INFO: renamed from: getPressedPoint2X$atomicxcore_release, reason: from getter */
    public final float getPressedPoint2X() {
        return this.pressedPoint2X;
    }

    /* JADX INFO: renamed from: getPressedPoint2Y$atomicxcore_release, reason: from getter */
    public final float getPressedPoint2Y() {
        return this.pressedPoint2Y;
    }

    @Nullable
    /* JADX INFO: renamed from: getStreamType$atomicxcore_release, reason: from getter */
    public final VideoStreamType getStreamType() {
        return this.streamType;
    }

    /* JADX INFO: renamed from: getTouchDownPointX$atomicxcore_release, reason: from getter */
    public final float getTouchDownPointX() {
        return this.touchDownPointX;
    }

    /* JADX INFO: renamed from: getTouchDownPointY$atomicxcore_release, reason: from getter */
    public final float getTouchDownPointY() {
        return this.touchDownPointY;
    }

    @NotNull
    /* JADX INFO: renamed from: getVideoView$atomicxcore_release, reason: from getter */
    public final TUIVideoView getVideoView() {
        return this.videoView;
    }

    /* JADX INFO: renamed from: isActive$atomicxcore_release, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    /* JADX INFO: renamed from: isClickAction$atomicxcore_release, reason: from getter */
    public final boolean getIsClickAction() {
        return this.isClickAction;
    }

    public final void setActive(boolean isActive) {
        Intrinsics.checkNotNullParameter(this, "<this>");
        setActive$atomicxcore_release(isActive);
        if (!isActive) {
            AbstractC40148b.m88501d(this);
            return;
        }
        if (AbstractC40148b.m88500c(this)) {
            VideoStreamType streamType = getStreamType();
            Intrinsics.checkNotNull(streamType);
            RoomParticipant participant = getParticipant();
            Intrinsics.checkNotNull(participant);
            AbstractC40148b.m88496a(this, streamType, participant);
        }
    }

    public final void setActive$atomicxcore_release(boolean z11) {
        this.isActive = z11;
    }

    public final void setClickAction$atomicxcore_release(boolean z11) {
        this.isClickAction = z11;
    }

    public final void setClickListener$atomicxcore_release(@Nullable View.OnClickListener onClickListener) {
        this.clickListener = onClickListener;
    }

    public final void setDistAfterMove$atomicxcore_release(double d11) {
        this.distAfterMove = d11;
    }

    public final void setDistBeforeMove$atomicxcore_release(double d11) {
        this.distBeforeMove = d11;
    }

    public final void setFillMode(@NotNull FillMode fillMode) {
        Intrinsics.checkNotNullParameter(fillMode, "fillMode");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(fillMode, "fillMode");
        setFillMode$atomicxcore_release(fillMode);
        if (AbstractC40148b.m88500c(this)) {
            VideoStreamType streamType = getStreamType();
            Intrinsics.checkNotNull(streamType);
            RoomParticipant participant = getParticipant();
            Intrinsics.checkNotNull(participant);
            AbstractC40148b.m88497a(streamType, participant, fillMode);
        }
    }

    public final void setFillMode$atomicxcore_release(@Nullable FillMode fillMode) {
        this.fillMode = fillMode;
    }

    public final void setMeasureLayoutRunnable$atomicxcore_release(@Nullable Runnable runnable) {
        this.measureLayoutRunnable = runnable;
    }

    public final void setParticipant$atomicxcore_release(@Nullable RoomParticipant roomParticipant) {
        this.participant = roomParticipant;
    }

    public final void setPressedPoint1X$atomicxcore_release(float f11) {
        this.pressedPoint1X = f11;
    }

    public final void setPressedPoint1Y$atomicxcore_release(float f11) {
        this.pressedPoint1Y = f11;
    }

    public final void setPressedPoint2X$atomicxcore_release(float f11) {
        this.pressedPoint2X = f11;
    }

    public final void setPressedPoint2Y$atomicxcore_release(float f11) {
        this.pressedPoint2Y = f11;
    }

    public final void setStreamType$atomicxcore_release(@Nullable VideoStreamType videoStreamType) {
        this.streamType = videoStreamType;
    }

    public final void setTouchDownPointX$atomicxcore_release(float f11) {
        this.touchDownPointX = f11;
    }

    public final void setTouchDownPointY$atomicxcore_release(float f11) {
        this.touchDownPointY = f11;
    }

    public final void updateParticipant(@NotNull RoomParticipant participant) {
        Intrinsics.checkNotNullParameter(participant, "participant");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(participant, "participant");
        setParticipant$atomicxcore_release(participant);
        if (AbstractC40148b.m88500c(this)) {
            VideoStreamType streamType = getStreamType();
            Intrinsics.checkNotNull(streamType);
            AbstractC40148b.m88496a(this, streamType, participant);
        }
    }

    public /* synthetic */ RoomParticipantView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void init(@NotNull VideoStreamType streamType, @NotNull RoomParticipant participant) {
        Intrinsics.checkNotNullParameter(streamType, "streamType");
        Intrinsics.checkNotNullParameter(participant, "participant");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(streamType, "streamType");
        Intrinsics.checkNotNullParameter(participant, "participant");
        setStreamType$atomicxcore_release(streamType);
        setParticipant$atomicxcore_release(participant);
        if (AbstractC40148b.m88500c(this)) {
            AbstractC40148b.m88496a(this, streamType, participant);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        AbstractC40148b.m88501d(this);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onSizeChanged(int w11, int h11, int oldw, int oldh) {
        RoomParticipant participant;
        TUIRoomDefine.VideoStreamType videoStreamType;
        super.onSizeChanged(w11, h11, oldw, oldh);
        Intrinsics.checkNotNullParameter(this, "<this>");
        if (w11 != oldw && AbstractC40148b.m88500c(this) && (participant = getParticipant()) != null) {
            String userID = participant.getUserID();
            Lazy lazy = C40155i.f89299f;
            C40155i c40155iM88502a = AbstractC40150d.m88502a();
            TUIVideoView view = getVideoView();
            c40155iM88502a.getClass();
            Intrinsics.checkNotNullParameter(userID, "userID");
            Intrinsics.checkNotNullParameter(view, "view");
            C40151e c40151e = (C40151e) c40155iM88502a.f89303d.get(userID);
            if (c40151e != null) {
                if (c40155iM88502a.f89302c.size() >= 5 && view.getWidth() <= 960) {
                    videoStreamType = TUIRoomDefine.VideoStreamType.CAMERA_STREAM_LOW;
                } else {
                    videoStreamType = TUIRoomDefine.VideoStreamType.CAMERA_STREAM;
                }
                if (videoStreamType != c40151e.f89294b) {
                    AbstractC40150d.m88502a().m88503a(userID, getVideoView());
                }
            }
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@NotNull View view, @NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(event, "event");
        return AbstractC40148b.m88498a(this, view, event);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        Intrinsics.checkNotNullParameter(this, "<this>");
        Runnable measureLayoutRunnable = getMeasureLayoutRunnable();
        if (measureLayoutRunnable != null) {
            post(measureLayoutRunnable);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener clickListener) {
        super.setOnClickListener(clickListener);
        this.clickListener = clickListener;
    }

    public final void updateStreamType(@NotNull VideoStreamType streamType) {
        Intrinsics.checkNotNullParameter(streamType, "streamType");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(streamType, "streamType");
        setStreamType$atomicxcore_release(streamType);
        if (AbstractC40148b.m88500c(this)) {
            RoomParticipant participant = getParticipant();
            Intrinsics.checkNotNull(participant);
            AbstractC40148b.m88496a(this, streamType, participant);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomParticipantView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.oid = hashCode();
        this.log = AbstractC39398a.m88229a("RoomParticipantView", "file", "AtomicXCore-Room", "RoomParticipantView");
        this.videoView = new TUIVideoView(context.getApplicationContext());
        AbstractC40148b.m88495a(this);
        setOnTouchListener(this);
    }
}
