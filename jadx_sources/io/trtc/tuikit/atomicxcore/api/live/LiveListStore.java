package io.trtc.tuikit.atomicxcore.api.live;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.bugly.proguard.InterfaceC33953u5;
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
import java.util.HashMap;
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
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 )2\u00020\u0001:\u0001)B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u001a\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J\u0012\u0010\u0010\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0011H&J\u001a\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J$\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u000e\u001a\u0004\u0018\u00010\u0019H&J\u001c\u0010\u001a\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J\u0012\u0010\u001b\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0019H&J \u0010\u001c\u001a\u00020\b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u001e2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001fH&J\u0010\u0010 \u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\b\u0010!\u001a\u00020\bH&J(\u0010\"\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u001e2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0019H&J6\u0010%\u001a\u00020\b2\"\u0010&\u001a\u001e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140'j\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014`(2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0019H&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006*"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;", "", "()V", "liveState", "Lio/trtc/tuikit/atomicxcore/api/live/LiveListState;", "getLiveState", "()Lio/trtc/tuikit/atomicxcore/api/live/LiveListState;", "addLiveListListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lio/trtc/tuikit/atomicxcore/api/live/LiveListListener;", "createLive", "liveInfo", "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;", "completion", "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfoCompletionHandler;", "endLive", "Lio/trtc/tuikit/atomicxcore/api/live/StopLiveCompletionHandler;", "fetchLiveInfo", "liveID", "", "fetchLiveList", InterfaceC33953u5.f72198E, "count", "", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "joinLive", "leaveLive", "queryMetaData", "keys", "", "Lio/trtc/tuikit/atomicxcore/api/live/MetaDataCompletionHandler;", "removeLiveListListener", "reset", "updateLiveInfo", "modifyFlagList", "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo$ModifyFlag;", "updateLiveMetaData", "metaData", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Companion", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public abstract class LiveListStore {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore$Companion;", "", "()V", "shared", "Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nLiveListStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveListStore.kt\nio/trtc/tuikit/atomicxcore/api/live/LiveListStore$Companion\n+ 2 StoreFactory.kt\nio/trtc/tuikit/atomicxcore/impl/live/StoreFactory\n+ 3 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,530:1\n43#2,15:531\n58#2:549\n59#2,11:553\n72#3,2:546\n1#4:548\n372#5,3:550\n375#5,4:564\n*S KotlinDebug\n*F\n+ 1 LiveListStore.kt\nio/trtc/tuikit/atomicxcore/api/live/LiveListStore$Companion\n*L\n407#1:531,15\n407#1:549\n407#1:553,11\n407#1:546,2\n407#1:548\n407#1:550,3\n407#1:564,4\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final LiveListStore shared() throws Exception {
            Object c39733e1;
            Object objPutIfAbsent;
            Lazy lazy = C39772r1.f88378c;
            C39772r1 c39772r1M88324a = AbstractC39769q1.m88324a();
            if (Intrinsics.areEqual(LiveListStore.class.getName(), AudioEffectStore.class.getName())) {
                Lazy lazy2 = C39647d.f88068h;
                Object objM88293a = AbstractC39646c.m88293a();
                if (objM88293a != null) {
                    return (LiveListStore) objM88293a;
                }
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveListStore");
            }
            if (Intrinsics.areEqual(LiveListStore.class.getName(), BaseBeautyStore.class.getName())) {
                Lazy lazy3 = C39650g.f88077g;
                Object objM88294a = AbstractC39649f.m88294a();
                if (objM88294a != null) {
                    return (LiveListStore) objM88294a;
                }
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveListStore");
            }
            if (Intrinsics.areEqual(LiveListStore.class.getName(), DeviceStore.class.getName())) {
                Lazy lazy4 = C39661r.f88102s;
                Object objM88298a = AbstractC39654k.m88298a();
                if (objM88298a != null) {
                    return (LiveListStore) objM88298a;
                }
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveListStore");
            }
            if (Intrinsics.areEqual(LiveListStore.class.getName(), LiveListStore.class.getName())) {
                Lazy lazy5 = C39695N0.f88198j;
                C39695N0 c39695n0M88331a = AbstractC39782w0.m88331a();
                if (c39695n0M88331a != null) {
                    return c39695n0M88331a;
                }
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveListStore");
            }
            C39510r c39510r = c39772r1M88324a.f88380b;
            c39510r.m88251a(1, AbstractC39394d.m88223a(LiveListStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r, "message"));
            ConcurrentHashMap concurrentHashMap = c39772r1M88324a.f88379a;
            Object concurrentHashMap2 = concurrentHashMap.get("");
            if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent("", (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap2 = objPutIfAbsent;
            }
            Map map = (Map) concurrentHashMap2;
            String strM88224a = AbstractC39395e.m88224a(map, LiveListStore.class, "getName(...)");
            Object obj = map.get(strM88224a);
            if (obj == null) {
                String name = LiveListStore.class.getName();
                if (Intrinsics.areEqual(name, BarrageStore.class.getName())) {
                    c39733e1 = new C39468e("");
                } else if (Intrinsics.areEqual(name, BattleStore.class.getName())) {
                    c39733e1 = new C39767q("");
                } else if (Intrinsics.areEqual(name, CoGuestStore.class.getName())) {
                    c39733e1 = new C39692M("");
                } else if (Intrinsics.areEqual(name, CoHostStore.class.getName())) {
                    c39733e1 = new C39726c0("");
                } else if (Intrinsics.areEqual(name, GiftStore.class.getName())) {
                    c39733e1 = new C39667f("");
                } else if (Intrinsics.areEqual(name, LikeStore.class.getName())) {
                    c39733e1 = new C39744i0("");
                } else if (Intrinsics.areEqual(name, LiveAudienceStore.class.getName())) {
                    c39733e1 = new C39774s0("");
                } else if (Intrinsics.areEqual(name, LiveSeatStore.class.getName())) {
                    c39733e1 = new C39716Y0("");
                } else {
                    if (!Intrinsics.areEqual(name, LiveSummaryStore.class.getName())) {
                        throw new Exception("type is not supported");
                    }
                    c39733e1 = new C39733e1("");
                }
                obj = c39733e1;
                map.put(strM88224a, obj);
            }
            return (LiveListStore) obj;
        }
    }

    public abstract void addLiveListListener(@NotNull LiveListListener listener);

    public abstract void createLive(@NotNull LiveInfo liveInfo, @Nullable LiveInfoCompletionHandler completion);

    public abstract void endLive(@Nullable StopLiveCompletionHandler completion);

    public abstract void fetchLiveInfo(@NotNull String liveID, @Nullable LiveInfoCompletionHandler completion);

    public abstract void fetchLiveList(@Nullable String cursor, int count, @Nullable CompletionHandler completion);

    @NotNull
    public abstract LiveListState getLiveState();

    public abstract void joinLive(@Nullable String liveID, @Nullable LiveInfoCompletionHandler completion);

    public abstract void leaveLive(@Nullable CompletionHandler completion);

    public abstract void queryMetaData(@NotNull List<String> keys, @Nullable MetaDataCompletionHandler completion);

    public abstract void removeLiveListListener(@NotNull LiveListListener listener);

    public abstract void reset();

    public abstract void updateLiveInfo(@NotNull LiveInfo liveInfo, @NotNull List<? extends LiveInfo.ModifyFlag> modifyFlagList, @Nullable CompletionHandler completion);

    public abstract void updateLiveMetaData(@NotNull HashMap<String, String> metaData, @Nullable CompletionHandler completion);

    @JvmStatic
    @NotNull
    public static final LiveListStore shared() {
        return INSTANCE.shared();
    }
}
