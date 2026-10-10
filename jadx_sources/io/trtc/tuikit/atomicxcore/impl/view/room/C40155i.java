package io.trtc.tuikit.atomicxcore.impl.view.room;

import com.tencent.cloud.tuikit.engine.common.TUIVideoView;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomEngine;
import io.trtc.tuikit.atomicxcore.api.view.AbstractC39398a;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import java.util.HashMap;
import java.util.HashSet;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.room.i */
/* JADX INFO: loaded from: classes61.dex */
public final class C40155i {

    /* JADX INFO: renamed from: f */
    public static final Lazy f89299f = LazyKt.lazy(C40149c.f89292a);

    /* JADX INFO: renamed from: a */
    public final C39510r f89300a = AbstractC39398a.m88229a("VideoStreamManager", "file", "AtomicXCore-Room", "VideoStreamManager");

    /* JADX INFO: renamed from: b */
    public final TUIRoomEngine f89301b = TUIRoomEngine.sharedInstance();

    /* JADX INFO: renamed from: c */
    public final HashSet f89302c = new HashSet();

    /* JADX INFO: renamed from: d */
    public final HashMap f89303d = new HashMap();

    /* JADX INFO: renamed from: e */
    public C40151e f89304e;

    /* JADX INFO: renamed from: a */
    public final void m88503a(String userID, TUIVideoView view) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(view, "view");
        if (userID.length() == 0) {
            return;
        }
        TUIRoomDefine.VideoStreamType videoStreamType = (this.f89302c.size() < 5 || view.getWidth() > 960) ? TUIRoomDefine.VideoStreamType.CAMERA_STREAM : TUIRoomDefine.VideoStreamType.CAMERA_STREAM_LOW;
        C39510r c39510r = this.f89300a;
        String message = "startPlayCameraStream userId:" + userID + " ,view:" + view.hashCode() + " ,streamType:" + videoStreamType;
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        C40151e c40151e = new C40151e(userID, videoStreamType, view.hashCode());
        if (Intrinsics.areEqual(c40151e, this.f89303d.get(userID))) {
            C39510r c39510r2 = this.f89300a;
            Intrinsics.checkNotNullParameter("same user operation, ignore", "message");
            c39510r2.m88251a(0, "same user operation, ignore");
        } else {
            this.f89301b.setRemoteVideoView(userID, videoStreamType, view);
            this.f89301b.startPlayRemoteVideo(userID, videoStreamType, new C40153g(this));
            this.f89303d.put(userID, c40151e);
            if (videoStreamType == TUIRoomDefine.VideoStreamType.CAMERA_STREAM) {
                this.f89302c.add(userID);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m88505b(String userID, TUIVideoView view, boolean z11) {
        C40151e c40151e;
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(view, "view");
        C39510r c39510r = this.f89300a;
        String message = "stopPlayScreenShareStream userId:" + userID + '}';
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        if (userID.length() != 0 && (c40151e = this.f89304e) != null && c40151e.f89295c == view.hashCode()) {
            TUIRoomEngine tUIRoomEngine = this.f89301b;
            TUIRoomDefine.VideoStreamType videoStreamType = TUIRoomDefine.VideoStreamType.SCREEN_STREAM;
            tUIRoomEngine.stopPlayRemoteVideo(userID, videoStreamType);
            if (z11) {
                this.f89301b.setRemoteVideoView(userID, videoStreamType, null);
            }
            this.f89304e = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m88504a(String userID, TUIVideoView view, boolean z11) {
        C40151e c40151e;
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(view, "view");
        C39510r c39510r = this.f89300a;
        String message = "stopPlayCameraStream userId:" + userID + '}';
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        if (userID.length() == 0 || (c40151e = (C40151e) this.f89303d.get(userID)) == null || c40151e.f89295c != view.hashCode()) {
            return;
        }
        TUIRoomEngine tUIRoomEngine = this.f89301b;
        TUIRoomDefine.VideoStreamType videoStreamType = TUIRoomDefine.VideoStreamType.CAMERA_STREAM;
        tUIRoomEngine.stopPlayRemoteVideo(userID, videoStreamType);
        TUIRoomEngine tUIRoomEngine2 = this.f89301b;
        TUIRoomDefine.VideoStreamType videoStreamType2 = TUIRoomDefine.VideoStreamType.CAMERA_STREAM_LOW;
        tUIRoomEngine2.stopPlayRemoteVideo(userID, videoStreamType2);
        if (z11) {
            this.f89301b.setRemoteVideoView(userID, videoStreamType, null);
            this.f89301b.setRemoteVideoView(userID, videoStreamType2, null);
        }
        this.f89302c.remove(userID);
        this.f89303d.remove(userID);
    }
}
