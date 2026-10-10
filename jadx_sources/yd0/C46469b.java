package yd0;

import com.google.gson.Gson;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomObserver;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import com.trtc.uikit.livekit.features.anchorboardcast.store.AnchorStore;
import java.lang.ref.WeakReference;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yd0.b */
/* JADX INFO: compiled from: RoomEngineObserver.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005JD\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0010\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u000f2\u0010\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u000fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/store/observer/RoomEngineObserver;", "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;", "anchorStore", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;", "<init>", "(Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;)V", "logger", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "anchorStoreRef", "Ljava/lang/ref/WeakReference;", "onSeatListChanged", "", "roomId", "", "seatList", "", "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;", "newlySeatedUsers", "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;", "newlyLeftUsers", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46469b extends TUIRoomObserver {

    /* JADX INFO: renamed from: d */
    @NotNull
    public final LiveKitLogger f104231d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final WeakReference<AnchorStore> f104232e;

    public C46469b(@NotNull AnchorStore anchorStore) {
        Intrinsics.checkNotNullParameter(anchorStore, "anchorStore");
        this.f104231d = LiveKitLogger.f77564c.getFeaturesLogger("RoomEngineObserver");
        this.f104232e = new WeakReference<>(anchorStore);
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public void onSeatListChanged(@Nullable String roomId, @NotNull List<? extends TUIRoomDefine.SeatFullInfo> seatList, @Nullable List<? extends TUIRoomDefine.UserInfo> newlySeatedUsers, @Nullable List<? extends TUIRoomDefine.UserInfo> newlyLeftUsers) {
        Intrinsics.checkNotNullParameter(seatList, "seatList");
        this.f104231d.m79404b(hashCode() + " onSeatListChanged:roomId:" + roomId + ",[seatList:" + new Gson().toJson(seatList) + ']');
        AnchorStore anchorStore = this.f104232e.get();
        if (anchorStore == null || !Intrinsics.areEqual(anchorStore.getF78170c().getRoomId(), roomId)) {
            return;
        }
        anchorStore.m80245y(seatList);
    }
}
