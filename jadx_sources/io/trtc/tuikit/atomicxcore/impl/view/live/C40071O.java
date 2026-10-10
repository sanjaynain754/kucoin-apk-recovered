package io.trtc.tuikit.atomicxcore.impl.view.live;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomEngine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomObserver;
import io.trtc.tuikit.atomicxcore.api.live.deprecated.LiveCoreViewDefine;
import io.trtc.tuikit.atomicxcore.api.view.AbstractC39398a;
import io.trtc.tuikit.atomicxcore.api.view.LiveCoreView;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.O */
/* JADX INFO: loaded from: classes61.dex */
public final class C40071O extends TUIRoomObserver {

    /* JADX INFO: renamed from: a */
    public final C39510r f89136a;

    /* JADX INFO: renamed from: b */
    public final int f89137b;

    /* JADX INFO: renamed from: c */
    public final WeakReference f89138c;

    public C40071O(LiveCoreView coreView) {
        Intrinsics.checkNotNullParameter(coreView, "coreView");
        this.f89136a = AbstractC39398a.m88229a("LiveCoreViewImplObserver", "file", "AtomicXCore-Live", "LiveCoreViewImplObserver");
        this.f89137b = hashCode();
        this.f89138c = new WeakReference(null);
        this.f89138c = new WeakReference(coreView);
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onKickedOutOfRoom(String str, TUIRoomDefine.KickedOutOfRoomReason kickedOutOfRoomReason, String str2) throws Exception {
        LiveCoreView liveCoreView = (LiveCoreView) this.f89138c.get();
        if (liveCoreView != null) {
            AbstractC40069N.m88442d(liveCoreView);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onRoomDismissed(String str, TUIRoomDefine.RoomDismissedReason roomDismissedReason) throws Exception {
        LiveCoreView liveCoreView = (LiveCoreView) this.f89138c.get();
        if (liveCoreView != null) {
            AbstractC40069N.m88442d(liveCoreView);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onSeatListChanged(List seatList, List list, List list2) throws Exception {
        Object next;
        LiveCoreView liveCoreView;
        MutableLiveData mutableLiveData;
        LiveCoreViewDefine.CoreState coreState;
        LiveCoreViewDefine.MediaState mediaState;
        LiveCoreViewDefine.CoreState coreState2;
        LiveCoreViewDefine.MediaState mediaState2;
        TUIRoomDefine.SeatInfo seatInfo;
        Intrinsics.checkNotNullParameter(seatList, "seatList");
        LiveCoreView liveCoreView2 = (LiveCoreView) this.f89138c.get();
        if (liveCoreView2 != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : seatList) {
                TUIRoomDefine.SeatInfo seatInfo2 = (TUIRoomDefine.SeatInfo) obj;
                String str = seatInfo2 != null ? seatInfo2.userId : null;
                if (str != null && str.length() != 0) {
                    arrayList.add(obj);
                }
            }
            boolean z11 = arrayList.size() <= 1;
            Intrinsics.checkNotNullParameter(liveCoreView2, "<this>");
            if (liveCoreView2.getBigPlaceholderBitmap() != null && liveCoreView2.getSmallPlaceholderBitmap() != null) {
                TUIRoomEngine.sharedInstance().setLocalVideoMuteImage(z11 ? liveCoreView2.getBigPlaceholderBitmap() : liveCoreView2.getSmallPlaceholderBitmap());
            }
        }
        String str2 = TUIRoomEngine.getSelfInfo().userId;
        Iterator it = seatList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                seatInfo = (TUIRoomDefine.SeatInfo) next;
            }
        } while (!Intrinsics.areEqual(seatInfo != null ? seatInfo.userId : null, str2));
        TUIRoomDefine.SeatInfo seatInfo3 = (TUIRoomDefine.SeatInfo) next;
        if (seatInfo3 == null) {
            LiveCoreView liveCoreView3 = (LiveCoreView) this.f89138c.get();
            LiveData<Boolean> liveData = (liveCoreView3 == null || (coreState2 = liveCoreView3.getCoreState()) == null || (mediaState2 = coreState2.mediaState) == null) ? null : mediaState2.isMicrophoneMuted;
            mutableLiveData = liveData instanceof MutableLiveData ? (MutableLiveData) liveData : null;
            if (mutableLiveData == null) {
                return;
            }
            mutableLiveData.setValue(Boolean.FALSE);
            return;
        }
        if (seatInfo3.isAudioLocked) {
            LiveCoreView liveCoreView4 = (LiveCoreView) this.f89138c.get();
            LiveData<Boolean> liveData2 = (liveCoreView4 == null || (coreState = liveCoreView4.getCoreState()) == null || (mediaState = coreState.mediaState) == null) ? null : mediaState.isMicrophoneMuted;
            mutableLiveData = liveData2 instanceof MutableLiveData ? (MutableLiveData) liveData2 : null;
            if (mutableLiveData != null) {
                mutableLiveData.setValue(Boolean.TRUE);
            }
        }
        if (!seatInfo3.isVideoLocked || (liveCoreView = (LiveCoreView) this.f89138c.get()) == null) {
            return;
        }
        liveCoreView.stopCamera();
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onUserVideoStateChanged(String userId, TUIRoomDefine.VideoStreamType streamType, boolean z11, TUIRoomDefine.ChangeReason changeReason) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(streamType, "streamType");
        C39510r c39510r = this.f89136a;
        String message = "oid:" + this.f89137b + ", onUserVideoStateChanged:userId" + userId + ", streamType" + streamType + ", hasVideo" + z11 + ", reason" + changeReason;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        LiveCoreView liveCoreView = (LiveCoreView) this.f89138c.get();
        if (liveCoreView != null) {
            AbstractC40069N.m88435a(liveCoreView, userId, streamType, z11);
        }
    }
}
