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
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J$\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J\u0012\u0010\u0012\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J\u001c\u0010\u0013\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u001c\u0010\u0015\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J\u001c\u0010\u0016\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0018"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;", "", "()V", "liveAudienceState", "Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceState;", "getLiveAudienceState", "()Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceState;", "addLiveAudienceListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceListener;", "disableSendMessage", "userID", "", "isDisable", "", "completion", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "fetchAudienceList", "kickUserOutOfRoom", "removeLiveAudienceListener", "revokeAdministrator", "setAdministrator", "Companion", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public abstract class LiveAudienceStore {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore$Companion;", "", "()V", "create", "Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;", "liveID", "", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nLiveAudienceStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveAudienceStore.kt\nio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore$Companion\n+ 2 StoreFactory.kt\nio/trtc/tuikit/atomicxcore/impl/live/StoreFactory\n+ 3 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,253:1\n44#2,14:254\n58#2:271\n59#2,11:275\n72#3,2:268\n1#4:270\n372#5,3:272\n375#5,4:286\n*S KotlinDebug\n*F\n+ 1 LiveAudienceStore.kt\nio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore$Companion\n*L\n178#1:254,14\n178#1:271\n178#1:275,11\n178#1:268,2\n178#1:270\n178#1:272,3\n178#1:286,4\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final LiveAudienceStore create(@NotNull String liveID) throws Exception {
            Object c39733e1;
            Object objPutIfAbsent;
            Intrinsics.checkNotNullParameter(liveID, "liveID");
            Lazy lazy = C39772r1.f88378c;
            C39772r1 c39772r1M88324a = AbstractC39769q1.m88324a();
            if (Intrinsics.areEqual(LiveAudienceStore.class.getName(), AudioEffectStore.class.getName())) {
                Lazy lazy2 = C39647d.f88068h;
                Object objM88293a = AbstractC39646c.m88293a();
                if (objM88293a != null) {
                    return (LiveAudienceStore) objM88293a;
                }
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveAudienceStore");
            }
            if (Intrinsics.areEqual(LiveAudienceStore.class.getName(), BaseBeautyStore.class.getName())) {
                Lazy lazy3 = C39650g.f88077g;
                Object objM88294a = AbstractC39649f.m88294a();
                if (objM88294a != null) {
                    return (LiveAudienceStore) objM88294a;
                }
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveAudienceStore");
            }
            if (Intrinsics.areEqual(LiveAudienceStore.class.getName(), DeviceStore.class.getName())) {
                Lazy lazy4 = C39661r.f88102s;
                Object objM88298a = AbstractC39654k.m88298a();
                if (objM88298a != null) {
                    return (LiveAudienceStore) objM88298a;
                }
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveAudienceStore");
            }
            if (Intrinsics.areEqual(LiveAudienceStore.class.getName(), LiveListStore.class.getName())) {
                Lazy lazy5 = C39695N0.f88198j;
                Object objM88331a = AbstractC39782w0.m88331a();
                if (objM88331a != null) {
                    return (LiveAudienceStore) objM88331a;
                }
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveAudienceStore");
            }
            C39510r c39510r = c39772r1M88324a.f88380b;
            c39510r.m88251a(1, AbstractC39394d.m88223a(LiveAudienceStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r, "message"));
            ConcurrentHashMap concurrentHashMap = c39772r1M88324a.f88379a;
            Object concurrentHashMap2 = concurrentHashMap.get(liveID);
            if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(liveID, (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap2 = objPutIfAbsent;
            }
            Map map = (Map) concurrentHashMap2;
            String strM88224a = AbstractC39395e.m88224a(map, LiveAudienceStore.class, "getName(...)");
            Object obj = map.get(strM88224a);
            if (obj == null) {
                String name = LiveAudienceStore.class.getName();
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
            return (LiveAudienceStore) obj;
        }
    }

    public abstract void addLiveAudienceListener(@NotNull LiveAudienceListener listener);

    public abstract void disableSendMessage(@Nullable String userID, boolean isDisable, @Nullable CompletionHandler completion);

    public abstract void fetchAudienceList(@Nullable CompletionHandler completion);

    @NotNull
    public abstract LiveAudienceState getLiveAudienceState();

    public abstract void kickUserOutOfRoom(@Nullable String userID, @Nullable CompletionHandler completion);

    public abstract void removeLiveAudienceListener(@NotNull LiveAudienceListener listener);

    public abstract void revokeAdministrator(@Nullable String userID, @Nullable CompletionHandler completion);

    public abstract void setAdministrator(@Nullable String userID, @Nullable CompletionHandler completion);

    @JvmStatic
    @NotNull
    public static final LiveAudienceStore create(@NotNull String str) {
        return INSTANCE.create(str);
    }
}
