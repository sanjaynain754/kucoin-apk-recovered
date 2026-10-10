package io.trtc.tuikit.atomicxcore.api.room;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.ListResultCompletionHandler;
import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39395e;
import io.trtc.tuikit.atomicxcore.api.device.DeviceType;
import io.trtc.tuikit.atomicxcore.impl.room.AbstractC39943o0;
import io.trtc.tuikit.atomicxcore.impl.room.C39904T0;
import io.trtc.tuikit.atomicxcore.impl.room.C39934k0;
import io.trtc.tuikit.atomicxcore.impl.room.C39945p0;
import java.util.HashMap;
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
@Metadata(m90083d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 32\u00020\u0001:\u00013B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u0012\u0010\u000f\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J\"\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\"\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u001a\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\"\u0010\u0015\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\"\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\"\u0010\u0017\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u001a\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\"\u0010\u001b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\"\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\n2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eH&J,\u0010 \u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010!\u001a\u00020\"2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u001a\u0010#\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\b\u0010$\u001a\u00020\bH&J\"\u0010%\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u0012\u0010&\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J$\u0010'\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010!\u001a\u00020\"2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u001a\u0010(\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u001a\u0010)\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u001a\u0010*\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u0012\u0010+\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J>\u0010,\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\"\u0010-\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020/0.j\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020/`02\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\"\u00101\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u00102\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u00064"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantStore;", "", "()V", "state", "Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantState;", "getState", "()Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantState;", "acceptOpenDeviceInvitation", "", "userID", "", "device", "Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;", "completion", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "addRoomParticipantListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantListener;", "approveOpenDeviceRequest", "cancelOpenDeviceInvitation", "cancelOpenDeviceRequest", "closeParticipantDevice", "declineOpenDeviceInvitation", "disableAllDevices", "disable", "", "disableAllMessages", "disableUserMessage", "getParticipantList", InterfaceC33953u5.f72198E, "Lio/trtc/tuikit/atomicxcore/api/ListResultCompletionHandler;", "Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;", "inviteToOpenDevice", "timeout", "", "kickUser", "muteMicrophone", "rejectOpenDeviceRequest", "removeRoomParticipantListener", "requestToOpenDevice", "revokeAdmin", "setAdmin", "transferOwner", "unmuteMicrophone", "updateParticipantMetaData", "metaData", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "updateParticipantNameCard", TUIConstantDefine.NAME_CARD, "Companion", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public abstract class RoomParticipantStore {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantStore$Companion;", "", "()V", "create", "Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantStore;", "roomID", "", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRoomParticipantStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomParticipantStore.kt\nio/trtc/tuikit/atomicxcore/api/room/RoomParticipantStore$Companion\n+ 2 RoomStoreFactory.kt\nio/trtc/tuikit/atomicxcore/impl/room/RoomStoreFactory\n+ 3 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,714:1\n28#2,4:715\n32#2:722\n33#2,3:726\n72#3,2:719\n1#4:721\n372#5,3:723\n375#5,4:729\n*S KotlinDebug\n*F\n+ 1 RoomParticipantStore.kt\nio/trtc/tuikit/atomicxcore/api/room/RoomParticipantStore$Companion\n*L\n444#1:715,4\n444#1:722\n444#1:726,3\n444#1:719,2\n444#1:721\n444#1:723,3\n444#1:729,4\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final RoomParticipantStore create(@NotNull String roomID) throws Exception {
            Object objPutIfAbsent;
            Intrinsics.checkNotNullParameter(roomID, "roomID");
            Lazy lazy = C39945p0.f88810b;
            C39945p0 c39945p0M88369a = AbstractC39943o0.m88369a();
            if (Intrinsics.areEqual(RoomParticipantStore.class.getName(), RoomStore.class.getName())) {
                Object obj = (C39904T0) C39904T0.f88694k.getValue();
                if (obj != null) {
                    return (RoomParticipantStore) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore");
            }
            ConcurrentHashMap concurrentHashMap = c39945p0M88369a.f88811a;
            Object concurrentHashMap2 = concurrentHashMap.get(roomID);
            if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(roomID, (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap2 = objPutIfAbsent;
            }
            Map map = (Map) concurrentHashMap2;
            String strM88224a = AbstractC39395e.m88224a(map, RoomParticipantStore.class, "getName(...)");
            Object c39934k0 = map.get(strM88224a);
            if (c39934k0 == null) {
                if (!Intrinsics.areEqual(RoomParticipantStore.class.getName(), RoomParticipantStore.class.getName())) {
                    throw new Exception("type is not supported");
                }
                c39934k0 = new C39934k0(roomID);
                map.put(strM88224a, c39934k0);
            }
            return (RoomParticipantStore) c39934k0;
        }
    }

    public abstract void acceptOpenDeviceInvitation(@NotNull String userID, @NotNull DeviceType device, @Nullable CompletionHandler completion);

    public abstract void addRoomParticipantListener(@Nullable RoomParticipantListener listener);

    public abstract void approveOpenDeviceRequest(@NotNull DeviceType device, @NotNull String userID, @Nullable CompletionHandler completion);

    public abstract void cancelOpenDeviceInvitation(@NotNull String userID, @NotNull DeviceType device, @Nullable CompletionHandler completion);

    public abstract void cancelOpenDeviceRequest(@NotNull DeviceType device, @Nullable CompletionHandler completion);

    public abstract void closeParticipantDevice(@NotNull String userID, @NotNull DeviceType device, @Nullable CompletionHandler completion);

    public abstract void declineOpenDeviceInvitation(@NotNull String userID, @NotNull DeviceType device, @Nullable CompletionHandler completion);

    public abstract void disableAllDevices(@NotNull DeviceType device, boolean disable, @Nullable CompletionHandler completion);

    public abstract void disableAllMessages(boolean disable, @Nullable CompletionHandler completion);

    public abstract void disableUserMessage(@NotNull String userID, boolean disable, @Nullable CompletionHandler completion);

    public abstract void getParticipantList(@Nullable String cursor, @Nullable ListResultCompletionHandler<RoomParticipant> completion);

    @NotNull
    public abstract RoomParticipantState getState();

    public abstract void inviteToOpenDevice(@NotNull String userID, @NotNull DeviceType device, int timeout, @Nullable CompletionHandler completion);

    public abstract void kickUser(@NotNull String userID, @Nullable CompletionHandler completion);

    public abstract void muteMicrophone();

    public abstract void rejectOpenDeviceRequest(@NotNull DeviceType device, @NotNull String userID, @Nullable CompletionHandler completion);

    public abstract void removeRoomParticipantListener(@Nullable RoomParticipantListener listener);

    public abstract void requestToOpenDevice(@NotNull DeviceType device, int timeout, @Nullable CompletionHandler completion);

    public abstract void revokeAdmin(@NotNull String userID, @Nullable CompletionHandler completion);

    public abstract void setAdmin(@NotNull String userID, @Nullable CompletionHandler completion);

    public abstract void transferOwner(@NotNull String userID, @Nullable CompletionHandler completion);

    public abstract void unmuteMicrophone(@Nullable CompletionHandler completion);

    public abstract void updateParticipantMetaData(@NotNull String userID, @NotNull HashMap<String, byte[]> metaData, @Nullable CompletionHandler completion);

    public abstract void updateParticipantNameCard(@NotNull String userID, @NotNull String nameCard, @Nullable CompletionHandler completion);

    @JvmStatic
    @NotNull
    public static final RoomParticipantStore create(@NotNull String str) {
        return INSTANCE.create(str);
    }

    public static /* synthetic */ void inviteToOpenDevice$default(RoomParticipantStore roomParticipantStore, String str, DeviceType deviceType, int i11, CompletionHandler completionHandler, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: inviteToOpenDevice");
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        roomParticipantStore.inviteToOpenDevice(str, deviceType, i11, completionHandler);
    }

    public static /* synthetic */ void requestToOpenDevice$default(RoomParticipantStore roomParticipantStore, DeviceType deviceType, int i11, CompletionHandler completionHandler, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestToOpenDevice");
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        roomParticipantStore.requestToOpenDevice(deviceType, i11, completionHandler);
    }
}
