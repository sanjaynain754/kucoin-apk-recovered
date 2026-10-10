package io.trtc.tuikit.atomicxcore.api.room;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.ListResultCompletionHandler;
import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39395e;
import io.trtc.tuikit.atomicxcore.impl.room.AbstractC39943o0;
import io.trtc.tuikit.atomicxcore.impl.room.C39904T0;
import io.trtc.tuikit.atomicxcore.impl.room.C39934k0;
import io.trtc.tuikit.atomicxcore.impl.room.C39945p0;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 92\u00020\u0001:\u00019B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u0012\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J(\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&J>\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0017H&J(\u0010\u0018\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u001a\u0010\u0019\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\"\u0010\u001a\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u0012\u0010\u001d\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&J*\u0010\u001e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 H&J\u001a\u0010\"\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010#H&J*\u0010$\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010 H&J\"\u0010&\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010 H&J&\u0010(\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u0012\u0010*\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\"\u0010+\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010,\u001a\u00020-2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u0012\u0010.\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J(\u0010/\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\b\u00100\u001a\u00020\bH&J\"\u00101\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001b\u001a\u0002022\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&J0\u00103\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001b\u001a\u0002042\f\u00105\u001a\b\u0012\u0004\u0012\u0002060\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&J0\u00107\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001b\u001a\u0002022\f\u00105\u001a\b\u0012\u0004\u0012\u0002080\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006:"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/room/RoomStore;", "", "()V", "state", "Lio/trtc/tuikit/atomicxcore/api/room/RoomState;", "getState", "()Lio/trtc/tuikit/atomicxcore/api/room/RoomState;", "acceptCall", "", "roomID", "", "completion", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "addRoomListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lio/trtc/tuikit/atomicxcore/api/room/RoomListener;", "addScheduledAttendees", "userIDList", "", "callUserToRoom", "timeout", "", "extensionInfo", "Lio/trtc/tuikit/atomicxcore/api/room/CallUserToRoomCompletionHandler;", "cancelCall", "cancelScheduledRoom", "createAndJoinRoom", "options", "Lio/trtc/tuikit/atomicxcore/api/room/CreateRoomOptions;", "endRoom", "getPendingCalls", InterfaceC33953u5.f72198E, "Lio/trtc/tuikit/atomicxcore/api/ListResultCompletionHandler;", "Lio/trtc/tuikit/atomicxcore/api/room/RoomCall;", "getRoomInfo", "Lio/trtc/tuikit/atomicxcore/api/room/GetRoomInfoCompletionHandler;", "getScheduledAttendees", "Lio/trtc/tuikit/atomicxcore/api/room/RoomUser;", "getScheduledRoomList", "Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;", "joinRoom", "password", "leaveRoom", "rejectCall", "reason", "Lio/trtc/tuikit/atomicxcore/api/room/CallRejectionReason;", "removeRoomListener", "removeScheduledAttendees", "reset", "scheduleRoom", "Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;", "updateRoomInfo", "Lio/trtc/tuikit/atomicxcore/api/room/UpdateRoomOptions;", "modifyFlagList", "Lio/trtc/tuikit/atomicxcore/api/room/UpdateRoomOptions$ModifyFlag;", "updateScheduledRoom", "Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions$ModifyFlag;", "Companion", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public abstract class RoomStore {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/room/RoomStore$Companion;", "", "()V", "shared", "Lio/trtc/tuikit/atomicxcore/api/room/RoomStore;", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRoomStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomStore.kt\nio/trtc/tuikit/atomicxcore/api/room/RoomStore$Companion\n+ 2 RoomStoreFactory.kt\nio/trtc/tuikit/atomicxcore/impl/room/RoomStoreFactory\n+ 3 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,900:1\n27#2,5:901\n32#2:909\n33#2,3:913\n72#3,2:906\n1#4:908\n372#5,3:910\n375#5,4:916\n*S KotlinDebug\n*F\n+ 1 RoomStore.kt\nio/trtc/tuikit/atomicxcore/api/room/RoomStore$Companion\n*L\n648#1:901,5\n648#1:909\n648#1:913,3\n648#1:906,2\n648#1:908\n648#1:910,3\n648#1:916,4\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final RoomStore shared() throws Exception {
            Object objPutIfAbsent;
            Lazy lazy = C39945p0.f88810b;
            C39945p0 c39945p0M88369a = AbstractC39943o0.m88369a();
            if (Intrinsics.areEqual(RoomStore.class.getName(), RoomStore.class.getName())) {
                C39904T0 c39904t0 = (C39904T0) C39904T0.f88694k.getValue();
                if (c39904t0 != null) {
                    return c39904t0;
                }
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.room.RoomStore");
            }
            ConcurrentHashMap concurrentHashMap = c39945p0M88369a.f88811a;
            Object concurrentHashMap2 = concurrentHashMap.get("");
            if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent("", (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap2 = objPutIfAbsent;
            }
            Map map = (Map) concurrentHashMap2;
            String strM88224a = AbstractC39395e.m88224a(map, RoomStore.class, "getName(...)");
            Object c39934k0 = map.get(strM88224a);
            if (c39934k0 == null) {
                if (!Intrinsics.areEqual(RoomStore.class.getName(), RoomParticipantStore.class.getName())) {
                    throw new Exception("type is not supported");
                }
                c39934k0 = new C39934k0("");
                map.put(strM88224a, c39934k0);
            }
            return (RoomStore) c39934k0;
        }
    }

    public abstract void acceptCall(@NotNull String roomID, @Nullable CompletionHandler completion);

    public abstract void addRoomListener(@Nullable RoomListener listener);

    public abstract void addScheduledAttendees(@NotNull String roomID, @NotNull List<String> userIDList, @Nullable CompletionHandler completion);

    public abstract void callUserToRoom(@NotNull String roomID, @NotNull List<String> userIDList, int timeout, @Nullable String extensionInfo, @Nullable CallUserToRoomCompletionHandler completion);

    public abstract void cancelCall(@NotNull String roomID, @NotNull List<String> userIDList, @Nullable CompletionHandler completion);

    public abstract void cancelScheduledRoom(@NotNull String roomID, @Nullable CompletionHandler completion);

    public abstract void createAndJoinRoom(@NotNull String roomID, @NotNull CreateRoomOptions options, @Nullable CompletionHandler completion);

    public abstract void endRoom(@Nullable CompletionHandler completion);

    public abstract void getPendingCalls(@NotNull String roomID, @Nullable String cursor, @Nullable ListResultCompletionHandler<RoomCall> completion);

    public abstract void getRoomInfo(@NotNull String roomID, @Nullable GetRoomInfoCompletionHandler completion);

    public abstract void getScheduledAttendees(@NotNull String roomID, @Nullable String cursor, @Nullable ListResultCompletionHandler<RoomUser> completion);

    public abstract void getScheduledRoomList(@Nullable String cursor, @Nullable ListResultCompletionHandler<RoomInfo> completion);

    @NotNull
    public abstract RoomState getState();

    public abstract void joinRoom(@NotNull String roomID, @Nullable String password, @Nullable CompletionHandler completion);

    public abstract void leaveRoom(@Nullable CompletionHandler completion);

    public abstract void rejectCall(@NotNull String roomID, @NotNull CallRejectionReason reason, @Nullable CompletionHandler completion);

    public abstract void removeRoomListener(@Nullable RoomListener listener);

    public abstract void removeScheduledAttendees(@NotNull String roomID, @NotNull List<String> userIDList, @Nullable CompletionHandler completion);

    public abstract void reset();

    public abstract void scheduleRoom(@NotNull String roomID, @NotNull ScheduleRoomOptions options, @Nullable CompletionHandler completion);

    public abstract void updateRoomInfo(@NotNull String roomID, @NotNull UpdateRoomOptions options, @NotNull List<? extends UpdateRoomOptions.ModifyFlag> modifyFlagList, @Nullable CompletionHandler completion);

    public abstract void updateScheduledRoom(@NotNull String roomID, @NotNull ScheduleRoomOptions options, @NotNull List<? extends ScheduleRoomOptions.ModifyFlag> modifyFlagList, @Nullable CompletionHandler completion);

    public static /* synthetic */ void callUserToRoom$default(RoomStore roomStore, String str, List list, int i11, String str2, CallUserToRoomCompletionHandler callUserToRoomCompletionHandler, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: callUserToRoom");
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        int i13 = i11;
        if ((i12 & 8) != 0) {
            str2 = null;
        }
        roomStore.callUserToRoom(str, list, i13, str2, callUserToRoomCompletionHandler);
    }

    public static /* synthetic */ void joinRoom$default(RoomStore roomStore, String str, String str2, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinRoom");
        }
        if ((i11 & 2) != 0) {
            str2 = "";
        }
        roomStore.joinRoom(str, str2, completionHandler);
    }

    @JvmStatic
    @NotNull
    public static final RoomStore shared() {
        return INSTANCE.shared();
    }
}
