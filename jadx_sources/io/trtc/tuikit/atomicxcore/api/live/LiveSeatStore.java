package io.trtc.tuikit.atomicxcore.api.live;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39394d;
import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39395e;
import io.trtc.tuikit.atomicxcore.api.barrage.BarrageStore;
import io.trtc.tuikit.atomicxcore.api.device.AudioEffectStore;
import io.trtc.tuikit.atomicxcore.api.device.BaseBeautyStore;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStore;
import io.trtc.tuikit.atomicxcore.api.gift.GiftStore;
import io.trtc.tuikit.atomicxcore.impl.barrage.C39468e;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import io.trtc.tuikit.atomicxcore.impl.device.AbstractC39646c;
import io.trtc.tuikit.atomicxcore.impl.device.AbstractC39649f;
import io.trtc.tuikit.atomicxcore.impl.device.AbstractC39654k;
import io.trtc.tuikit.atomicxcore.impl.device.C39647d;
import io.trtc.tuikit.atomicxcore.impl.device.C39650g;
import io.trtc.tuikit.atomicxcore.impl.device.C39661r;
import io.trtc.tuikit.atomicxcore.impl.gift.C39667f;
import io.trtc.tuikit.atomicxcore.impl.live.AbstractC39769q1;
import io.trtc.tuikit.atomicxcore.impl.live.AbstractC39782w0;
import io.trtc.tuikit.atomicxcore.impl.live.C39692M;
import io.trtc.tuikit.atomicxcore.impl.live.C39695N0;
import io.trtc.tuikit.atomicxcore.impl.live.C39716Y0;
import io.trtc.tuikit.atomicxcore.impl.live.C39726c0;
import io.trtc.tuikit.atomicxcore.impl.live.C39733e1;
import io.trtc.tuikit.atomicxcore.impl.live.C39744i0;
import io.trtc.tuikit.atomicxcore.impl.live.C39767q;
import io.trtc.tuikit.atomicxcore.impl.live.C39772r1;
import io.trtc.tuikit.atomicxcore.impl.live.C39774s0;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
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
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 (2\u00020\u0001:\u0001(B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J\u001c\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H&J\u001c\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H&J\u001c\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H&J\u0012\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H&J\u001a\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H&J0\u0010\u001c\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001d\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H&J\b\u0010 \u001a\u00020\u000fH&J$\u0010!\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001e\u001a\u00020\"2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H&J$\u0010#\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001e\u001a\u00020\"2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H&J\u0012\u0010$\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J\u001a\u0010%\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H&J\u001a\u0010&\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H&J\u0012\u0010'\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H&R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006)"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;", "", "()V", "hasAudioStreamUserList", "", "", "getHasAudioStreamUserList$atomicxcore_release", "()Ljava/util/Set;", "hasVideoStreamUserList", "getHasVideoStreamUserList$atomicxcore_release", "liveSeatState", "Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatState;", "getLiveSeatState", "()Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatState;", "addLiveSeatEventListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatListener;", "closeRemoteCamera", "userID", "completion", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "closeRemoteMicrophone", "kickUserOutOfSeat", "leaveSeat", "lockSeat", "seatIndex", "", "moveUserToSeat", "targetIndex", "policy", "Lio/trtc/tuikit/atomicxcore/api/live/MoveSeatPolicy;", "muteMicrophone", "openRemoteCamera", "Lio/trtc/tuikit/atomicxcore/api/live/DeviceControlPolicy;", "openRemoteMicrophone", "removeLiveSeatEventListener", "takeSeat", "unlockSeat", "unmuteMicrophone", "Companion", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public abstract class LiveSeatStore {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Set<String> hasAudioStreamUserList = new LinkedHashSet();

    @NotNull
    private final Set<String> hasVideoStreamUserList = new LinkedHashSet();

    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore$Companion;", "", "()V", "create", "Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;", "liveID", "", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nLiveSeatStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveSeatStore.kt\nio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore$Companion\n+ 2 StoreFactory.kt\nio/trtc/tuikit/atomicxcore/impl/live/StoreFactory\n+ 3 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,551:1\n44#2,14:552\n58#2:569\n59#2,11:573\n72#3,2:566\n1#4:568\n372#5,3:570\n375#5,4:584\n*S KotlinDebug\n*F\n+ 1 LiveSeatStore.kt\nio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore$Companion\n*L\n399#1:552,14\n399#1:569\n399#1:573,11\n399#1:566,2\n399#1:568\n399#1:570,3\n399#1:584,4\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final LiveSeatStore create(@NotNull String liveID) throws Exception {
            Object c39733e1;
            Object objPutIfAbsent;
            Intrinsics.checkNotNullParameter(liveID, "liveID");
            Lazy lazy = C39772r1.f88378c;
            C39772r1 c39772r1M88324a = AbstractC39769q1.m88324a();
            if (Intrinsics.areEqual(LiveSeatStore.class.getName(), AudioEffectStore.class.getName())) {
                Lazy lazy2 = C39647d.f88068h;
                Object objM88293a = AbstractC39646c.m88293a();
                if (objM88293a != null) {
                    return (LiveSeatStore) objM88293a;
                }
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore");
            }
            if (Intrinsics.areEqual(LiveSeatStore.class.getName(), BaseBeautyStore.class.getName())) {
                Lazy lazy3 = C39650g.f88077g;
                Object objM88294a = AbstractC39649f.m88294a();
                if (objM88294a != null) {
                    return (LiveSeatStore) objM88294a;
                }
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore");
            }
            if (Intrinsics.areEqual(LiveSeatStore.class.getName(), DeviceStore.class.getName())) {
                Lazy lazy4 = C39661r.f88102s;
                Object objM88298a = AbstractC39654k.m88298a();
                if (objM88298a != null) {
                    return (LiveSeatStore) objM88298a;
                }
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore");
            }
            if (Intrinsics.areEqual(LiveSeatStore.class.getName(), LiveListStore.class.getName())) {
                Lazy lazy5 = C39695N0.f88198j;
                Object objM88331a = AbstractC39782w0.m88331a();
                if (objM88331a != null) {
                    return (LiveSeatStore) objM88331a;
                }
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore");
            }
            C39510r c39510r = c39772r1M88324a.f88380b;
            c39510r.m88251a(1, AbstractC39394d.m88223a(LiveSeatStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r, "message"));
            ConcurrentHashMap concurrentHashMap = c39772r1M88324a.f88379a;
            Object concurrentHashMap2 = concurrentHashMap.get(liveID);
            if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(liveID, (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap2 = objPutIfAbsent;
            }
            Map map = (Map) concurrentHashMap2;
            String strM88224a = AbstractC39395e.m88224a(map, LiveSeatStore.class, "getName(...)");
            Object obj = map.get(strM88224a);
            if (obj == null) {
                String name = LiveSeatStore.class.getName();
                if (Intrinsics.areEqual(name, BarrageStore.class.getName())) {
                    c39733e1 = new C39468e(liveID);
                } else if (Intrinsics.areEqual(name, BattleStore.class.getName())) {
                    c39733e1 = new C39767q(liveID);
                } else if (Intrinsics.areEqual(name, CoGuestStore.class.getName())) {
                    c39733e1 = new C39692M(liveID);
                } else if (Intrinsics.areEqual(name, CoHostStore.class.getName())) {
                    c39733e1 = new C39726c0(liveID);
                } else if (Intrinsics.areEqual(name, GiftStore.class.getName())) {
                    c39733e1 = new C39667f(liveID);
                } else if (Intrinsics.areEqual(name, LikeStore.class.getName())) {
                    c39733e1 = new C39744i0(liveID);
                } else if (Intrinsics.areEqual(name, LiveAudienceStore.class.getName())) {
                    c39733e1 = new C39774s0(liveID);
                } else if (Intrinsics.areEqual(name, LiveSeatStore.class.getName())) {
                    c39733e1 = new C39716Y0(liveID);
                } else {
                    if (!Intrinsics.areEqual(name, LiveSummaryStore.class.getName())) {
                        throw new Exception("type is not supported");
                    }
                    c39733e1 = new C39733e1(liveID);
                }
                obj = c39733e1;
                map.put(strM88224a, obj);
            }
            return (LiveSeatStore) obj;
        }
    }

    public abstract void addLiveSeatEventListener(@Nullable LiveSeatListener listener);

    public abstract void closeRemoteCamera(@Nullable String userID, @Nullable CompletionHandler completion);

    public abstract void closeRemoteMicrophone(@Nullable String userID, @Nullable CompletionHandler completion);

    @NotNull
    public abstract LiveSeatState getLiveSeatState();

    public abstract void kickUserOutOfSeat(@Nullable String userID, @Nullable CompletionHandler completion);

    public abstract void leaveSeat(@Nullable CompletionHandler completion);

    public abstract void lockSeat(int seatIndex, @Nullable CompletionHandler completion);

    public abstract void moveUserToSeat(@Nullable String userID, int targetIndex, @Nullable MoveSeatPolicy policy, @Nullable CompletionHandler completion);

    public abstract void muteMicrophone();

    public abstract void openRemoteCamera(@Nullable String userID, @NotNull DeviceControlPolicy policy, @Nullable CompletionHandler completion);

    public abstract void openRemoteMicrophone(@Nullable String userID, @NotNull DeviceControlPolicy policy, @Nullable CompletionHandler completion);

    public abstract void removeLiveSeatEventListener(@Nullable LiveSeatListener listener);

    public abstract void takeSeat(int seatIndex, @Nullable CompletionHandler completion);

    public abstract void unlockSeat(int seatIndex, @Nullable CompletionHandler completion);

    public abstract void unmuteMicrophone(@Nullable CompletionHandler completion);

    @JvmStatic
    @NotNull
    public static final LiveSeatStore create(@NotNull String str) {
        return INSTANCE.create(str);
    }

    public static /* synthetic */ void moveUserToSeat$default(LiveSeatStore liveSeatStore, String str, int i11, MoveSeatPolicy moveSeatPolicy, CompletionHandler completionHandler, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: moveUserToSeat");
        }
        if ((i12 & 4) != 0) {
            moveSeatPolicy = MoveSeatPolicy.ABORT_WHEN_OCCUPIED;
        }
        liveSeatStore.moveUserToSeat(str, i11, moveSeatPolicy, completionHandler);
    }

    @NotNull
    public final Set<String> getHasAudioStreamUserList$atomicxcore_release() {
        return this.hasAudioStreamUserList;
    }

    @NotNull
    public final Set<String> getHasVideoStreamUserList$atomicxcore_release() {
        return this.hasVideoStreamUserList;
    }
}
