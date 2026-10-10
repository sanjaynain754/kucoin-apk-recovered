package io.trtc.tuikit.atomicxcore.impl.view.room;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.tencent.cloud.tuikit.engine.common.TUIVideoView;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.trtc.TRTCCloudDef;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStatus;
import io.trtc.tuikit.atomicxcore.api.login.LoginStore;
import io.trtc.tuikit.atomicxcore.api.login.UserProfile;
import io.trtc.tuikit.atomicxcore.api.room.RoomParticipant;
import io.trtc.tuikit.atomicxcore.api.view.FillMode;
import io.trtc.tuikit.atomicxcore.api.view.RoomParticipantView;
import io.trtc.tuikit.atomicxcore.api.view.VideoStreamType;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import io.trtc.tuikit.atomicxcore.impl.view.room.AbstractC40148b;
import p852kotlin.Lazy;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.room.b */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC40148b {
    /* JADX INFO: renamed from: a */
    public static final void m88495a(final RoomParticipantView roomParticipantView) {
        Intrinsics.checkNotNullParameter(roomParticipantView, "<this>");
        roomParticipantView.setMeasureLayoutRunnable$atomicxcore_release(new Runnable() { // from class: jg0.a
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC40148b.m88499b(roomParticipantView);
            }
        });
        roomParticipantView.addView(roomParticipantView.getVideoView());
    }

    /* JADX INFO: renamed from: b */
    public static final void m88499b(RoomParticipantView this_initInternal) {
        Intrinsics.checkNotNullParameter(this_initInternal, "$this_initInternal");
        this_initInternal.measure(View.MeasureSpec.makeMeasureSpec(this_initInternal.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this_initInternal.getHeight(), 1073741824));
        this_initInternal.layout(this_initInternal.getLeft(), this_initInternal.getTop(), this_initInternal.getRight(), this_initInternal.getBottom());
    }

    /* JADX INFO: renamed from: d */
    public static final void m88501d(RoomParticipantView roomParticipantView) {
        Intrinsics.checkNotNullParameter(roomParticipantView, "<this>");
        RoomParticipant participant = roomParticipantView.getParticipant();
        String userID = participant != null ? participant.getUserID() : null;
        UserProfile value = LoginStore.shared.getLoginState().getLoginUserInfo().getValue();
        String userID2 = value != null ? value.getUserID() : null;
        if (userID2 == null || userID2.length() == 0 || userID == null || userID.length() == 0) {
            return;
        }
        if (Intrinsics.areEqual(userID, userID2)) {
            Lazy lazy = C40155i.f89299f;
            AbstractC40150d.m88502a().f89301b.setLocalVideoView(null);
            return;
        }
        VideoStreamType streamType = roomParticipantView.getStreamType();
        int i11 = streamType == null ? -1 : AbstractC40147a.f89291a[streamType.ordinal()];
        if (i11 == 1) {
            Lazy lazy2 = C40155i.f89299f;
            AbstractC40150d.m88502a().m88504a(userID, roomParticipantView.getVideoView(), true);
        } else {
            if (i11 != 2) {
                return;
            }
            Lazy lazy3 = C40155i.f89299f;
            AbstractC40150d.m88502a().m88505b(userID, roomParticipantView.getVideoView(), true);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m88497a(VideoStreamType streamType, RoomParticipant roomParticipant, FillMode fillMode) {
        Lazy lazy = C40155i.f89299f;
        C40155i c40155iM88502a = AbstractC40150d.m88502a();
        String userID = roomParticipant.getUserID();
        c40155iM88502a.getClass();
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(streamType, "streamType");
        Intrinsics.checkNotNullParameter(fillMode, "fillMode");
        UserProfile value = LoginStore.shared.getLoginState().getLoginUserInfo().getValue();
        String userID2 = value != null ? value.getUserID() : null;
        if (userID2 != null && userID2.length() != 0) {
            TRTCCloudDef.TRTCRenderParams tRTCRenderParams = new TRTCCloudDef.TRTCRenderParams();
            tRTCRenderParams.fillMode = fillMode == FillMode.FILL ? 0 : 1;
            if (Intrinsics.areEqual(userID, userID2)) {
                c40155iM88502a.f89301b.getTRTCCloud().setLocalRenderParams(tRTCRenderParams);
                return;
            }
            int i11 = AbstractC40152f.f89296a[streamType.ordinal()];
            if (i11 == 1) {
                c40155iM88502a.f89301b.getTRTCCloud().setRemoteRenderParams(userID, 0, tRTCRenderParams);
                c40155iM88502a.f89301b.getTRTCCloud().setRemoteRenderParams(userID, 1, tRTCRenderParams);
                return;
            } else {
                if (i11 != 2) {
                    return;
                }
                c40155iM88502a.f89301b.getTRTCCloud().setRemoteRenderParams(userID, 2, tRTCRenderParams);
                return;
            }
        }
        C39510r c39510r = c40155iM88502a.f89300a;
        Intrinsics.checkNotNullParameter("Invalid login userId", "message");
        c39510r.m88251a(2, "Invalid login userId");
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m88500c(RoomParticipantView roomParticipantView) {
        if (roomParticipantView.getStreamType() != null && roomParticipantView.getParticipant() != null && roomParticipantView.getIsActive()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static final void m88496a(RoomParticipantView roomParticipantView, VideoStreamType videoStreamType, RoomParticipant roomParticipant) {
        UserProfile value = LoginStore.shared.getLoginState().getLoginUserInfo().getValue();
        String userID = value != null ? value.getUserID() : null;
        if (userID != null && userID.length() != 0) {
            FillMode fillMode = roomParticipantView.getFillMode();
            if (fillMode != null) {
                m88497a(videoStreamType, roomParticipant, fillMode);
            }
            if (Intrinsics.areEqual(roomParticipant.getUserID(), userID)) {
                Lazy lazy = C40155i.f89299f;
                AbstractC40150d.m88502a().f89301b.setLocalVideoView(roomParticipantView.getVideoView());
                return;
            }
            int i11 = AbstractC40147a.f89291a[videoStreamType.ordinal()];
            if (i11 == 1) {
                if (roomParticipant.getCameraStatus() == DeviceStatus.ON) {
                    Lazy lazy2 = C40155i.f89299f;
                    AbstractC40150d.m88502a().m88503a(roomParticipant.getUserID(), roomParticipantView.getVideoView());
                    return;
                } else {
                    Lazy lazy3 = C40155i.f89299f;
                    AbstractC40150d.m88502a().m88504a(roomParticipant.getUserID(), roomParticipantView.getVideoView(), false);
                    return;
                }
            }
            if (i11 != 2) {
                return;
            }
            if (roomParticipant.getScreenShareStatus() == DeviceStatus.ON) {
                Lazy lazy4 = C40155i.f89299f;
                C40155i c40155iM88502a = AbstractC40150d.m88502a();
                String userID2 = roomParticipant.getUserID();
                TUIVideoView view = roomParticipantView.getVideoView();
                c40155iM88502a.getClass();
                Intrinsics.checkNotNullParameter(userID2, "userID");
                Intrinsics.checkNotNullParameter(view, "view");
                C39510r c39510r = c40155iM88502a.f89300a;
                String message = "startPlayScreenShareStream,userId:" + userID2 + " ,view:" + view.hashCode();
                Intrinsics.checkNotNullParameter(message, "message");
                c39510r.m88251a(0, message);
                if (userID2.length() == 0) {
                    return;
                }
                TUIRoomDefine.VideoStreamType videoStreamType2 = TUIRoomDefine.VideoStreamType.SCREEN_STREAM;
                C40151e c40151e = new C40151e(userID2, videoStreamType2, view.hashCode());
                if (Intrinsics.areEqual(c40151e, c40155iM88502a.f89304e)) {
                    C39510r c39510r2 = c40155iM88502a.f89300a;
                    Intrinsics.checkNotNullParameter("same user operation, ignore", "message");
                    c39510r2.m88251a(0, "same user operation, ignore");
                    return;
                } else {
                    c40155iM88502a.f89301b.setRemoteVideoView(userID2, videoStreamType2, view);
                    c40155iM88502a.f89301b.startPlayRemoteVideo(userID2, videoStreamType2, new C40154h(c40155iM88502a));
                    c40155iM88502a.f89304e = c40151e;
                    return;
                }
            }
            Lazy lazy5 = C40155i.f89299f;
            AbstractC40150d.m88502a().m88505b(roomParticipant.getUserID(), roomParticipantView.getVideoView(), false);
            return;
        }
        C39510r log = roomParticipantView.getLog();
        log.getClass();
        Intrinsics.checkNotNullParameter("Invalid login userId", "message");
        log.m88251a(2, "Invalid login userId");
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m88498a(RoomParticipantView roomParticipantView, View view, MotionEvent event) {
        View.OnClickListener clickListener;
        float f11;
        double dSqrt;
        float fCoerceAtMost;
        float fCoerceAtMost2;
        double dSqrt2;
        ViewParent parent;
        Intrinsics.checkNotNullParameter(roomParticipantView, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(event, "event");
        if (roomParticipantView.getStreamType() != VideoStreamType.SCREEN) {
            return false;
        }
        int pointerCount = event.getPointerCount();
        int action = event.getAction() & 255;
        if (action != 0) {
            if (action == 1) {
                if (roomParticipantView.getIsClickAction() && roomParticipantView.getClickListener() != null && (clickListener = roomParticipantView.getClickListener()) != null) {
                    clickListener.onClick(roomParticipantView);
                }
                if (pointerCount == 2) {
                    roomParticipantView.setPressedPoint1X$atomicxcore_release(0.0f);
                    roomParticipantView.setPressedPoint1Y$atomicxcore_release(0.0f);
                    roomParticipantView.setPressedPoint2X$atomicxcore_release(0.0f);
                    roomParticipantView.setPressedPoint2Y$atomicxcore_release(0.0f);
                }
                ViewParent parent2 = roomParticipantView.getParent();
                if (parent2 != null) {
                    parent2.requestDisallowInterceptTouchEvent(false);
                }
            } else if (action == 2) {
                if (pointerCount == 1) {
                    float fAbs = Math.abs(event.getX() - roomParticipantView.getTouchDownPointX());
                    float fAbs2 = Math.abs(event.getY() - roomParticipantView.getTouchDownPointY());
                    if (fAbs >= 10.0f || fAbs2 >= 10.0f) {
                        roomParticipantView.setClickAction$atomicxcore_release(false);
                    }
                }
                if (pointerCount == 2) {
                    float x11 = event.getX(0);
                    float x12 = event.getX(1);
                    float y11 = event.getY(0);
                    float y12 = event.getY(1);
                    double pressedPoint1X = x11 - roomParticipantView.getPressedPoint1X();
                    double pressedPoint2X = x12 - roomParticipantView.getPressedPoint2X();
                    double pressedPoint1Y = y11 - roomParticipantView.getPressedPoint1Y();
                    double pressedPoint2Y = y12 - roomParticipantView.getPressedPoint2Y();
                    if (roomParticipantView.getScaleX() > 1.0f) {
                        double d11 = 2;
                        f11 = 1.0f;
                        float f12 = -((float) ((pressedPoint2Y / d11) + (pressedPoint1Y / d11)));
                        float pivotX = roomParticipantView.getPivotX() + (-((float) ((pressedPoint2X / d11) + (pressedPoint1X / d11))));
                        float pivotY = roomParticipantView.getPivotY() + f12;
                        if (pivotX < 0.0f && pivotY < 0.0f) {
                            fCoerceAtMost2 = 0.0f;
                            fCoerceAtMost = 0.0f;
                        } else if (pivotX > 0.0f && pivotY < 0.0f) {
                            fCoerceAtMost = RangesKt.coerceAtMost(pivotX, roomParticipantView.getWidth());
                            fCoerceAtMost2 = 0.0f;
                        } else if (pivotX < 0.0f && pivotY > 0.0f) {
                            fCoerceAtMost2 = RangesKt.coerceAtMost(pivotY, roomParticipantView.getHeight());
                            fCoerceAtMost = 0.0f;
                        } else {
                            fCoerceAtMost = RangesKt.coerceAtMost(pivotX, roomParticipantView.getWidth());
                            fCoerceAtMost2 = RangesKt.coerceAtMost(pivotY, roomParticipantView.getHeight());
                        }
                        roomParticipantView.setPivotX(fCoerceAtMost);
                        roomParticipantView.setPivotY(fCoerceAtMost2);
                    } else {
                        f11 = 1.0f;
                    }
                    if (event.getPointerCount() == 2) {
                        float x13 = event.getX(0) - event.getX(1);
                        float y13 = event.getY(0) - event.getY(1);
                        dSqrt = Math.sqrt((y13 * y13) + (x13 * x13));
                    } else {
                        dSqrt = 0.0d;
                    }
                    roomParticipantView.setDistAfterMove$atomicxcore_release(dSqrt);
                    float distAfterMove = (float) (((roomParticipantView.getDistAfterMove() - roomParticipantView.getDistBeforeMove()) / ((double) view.getWidth())) + ((double) roomParticipantView.getScaleX()));
                    if (distAfterMove < f11) {
                        roomParticipantView.setScaleX(f11);
                        roomParticipantView.setScaleY(f11);
                    } else if (distAfterMove > 5.0f) {
                        roomParticipantView.setScaleX(5.0f);
                        roomParticipantView.setScaleY(5.0f);
                    } else {
                        roomParticipantView.setScaleX(distAfterMove);
                        roomParticipantView.setScaleY(distAfterMove);
                    }
                }
            } else if (action == 3) {
                ViewParent parent3 = roomParticipantView.getParent();
                if (parent3 != null) {
                    parent3.requestDisallowInterceptTouchEvent(false);
                }
                if (pointerCount == 2) {
                    roomParticipantView.setPressedPoint1X$atomicxcore_release(0.0f);
                    roomParticipantView.setPressedPoint1Y$atomicxcore_release(0.0f);
                    roomParticipantView.setPressedPoint2X$atomicxcore_release(0.0f);
                    roomParticipantView.setPressedPoint2Y$atomicxcore_release(0.0f);
                }
            } else if (action != 5) {
                if (action == 6 && pointerCount == 2 && (parent = roomParticipantView.getParent()) != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
            } else if (pointerCount == 2) {
                ViewParent parent4 = roomParticipantView.getParent();
                if (parent4 != null) {
                    parent4.requestDisallowInterceptTouchEvent(true);
                }
                roomParticipantView.setPressedPoint1X$atomicxcore_release(event.getX(0));
                roomParticipantView.setPressedPoint2X$atomicxcore_release(event.getX(1));
                roomParticipantView.setPressedPoint1Y$atomicxcore_release(event.getY(0));
                roomParticipantView.setPressedPoint2Y$atomicxcore_release(event.getY(1));
                if (event.getPointerCount() == 2) {
                    float x14 = event.getX(0) - event.getX(1);
                    float y14 = event.getY(0) - event.getY(1);
                    dSqrt2 = Math.sqrt((y14 * y14) + (x14 * x14));
                } else {
                    dSqrt2 = 0.0d;
                }
                roomParticipantView.setDistBeforeMove$atomicxcore_release(dSqrt2);
            }
        } else if (pointerCount == 1) {
            roomParticipantView.setTouchDownPointX$atomicxcore_release(event.getX());
            roomParticipantView.setTouchDownPointY$atomicxcore_release(event.getY());
            roomParticipantView.setClickAction$atomicxcore_release(true);
        }
        return true;
    }
}
