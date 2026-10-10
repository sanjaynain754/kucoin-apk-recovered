package io.trtc.tuikit.atomicxcore.api.device;

import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39394d;
import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39395e;
import io.trtc.tuikit.atomicxcore.api.barrage.BarrageStore;
import io.trtc.tuikit.atomicxcore.api.gift.GiftStore;
import io.trtc.tuikit.atomicxcore.api.live.BattleStore;
import io.trtc.tuikit.atomicxcore.api.live.CoGuestStore;
import io.trtc.tuikit.atomicxcore.api.live.CoHostStore;
import io.trtc.tuikit.atomicxcore.api.live.LikeStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveAudienceStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveListStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveSummaryStore;
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
import p852kotlin.Lazy;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b&\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000bH&J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000bH&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;", "", "()V", "baseBeautyState", "Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyState;", "getBaseBeautyState", "()Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyState;", "reset", "", "setRuddyLevel", "ruddyLevel", "", "setSmoothLevel", "smoothLevel", "setWhitenessLevel", "whitenessLevel", "Companion", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public abstract class BaseBeautyStore {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore$Companion;", "", "()V", "shared", "Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nBaseBeautyStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseBeautyStore.kt\nio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore$Companion\n+ 2 StoreFactory.kt\nio/trtc/tuikit/atomicxcore/impl/live/StoreFactory\n+ 3 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,165:1\n43#2,15:166\n58#2:184\n59#2,11:188\n72#3,2:181\n1#4:183\n372#5,3:185\n375#5,4:199\n*S KotlinDebug\n*F\n+ 1 BaseBeautyStore.kt\nio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore$Companion\n*L\n130#1:166,15\n130#1:184\n130#1:188,11\n130#1:181,2\n130#1:183\n130#1:185,3\n130#1:199,4\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final BaseBeautyStore shared() throws Exception {
            Object c39733e1;
            Object objPutIfAbsent;
            Lazy lazy = C39772r1.f88378c;
            C39772r1 c39772r1M88324a = AbstractC39769q1.m88324a();
            if (Intrinsics.areEqual(BaseBeautyStore.class.getName(), AudioEffectStore.class.getName())) {
                Lazy lazy2 = C39647d.f88068h;
                Object objM88293a = AbstractC39646c.m88293a();
                if (objM88293a != null) {
                    return (BaseBeautyStore) objM88293a;
                }
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.BaseBeautyStore");
            }
            if (Intrinsics.areEqual(BaseBeautyStore.class.getName(), BaseBeautyStore.class.getName())) {
                Lazy lazy3 = C39650g.f88077g;
                C39650g c39650gM88294a = AbstractC39649f.m88294a();
                if (c39650gM88294a != null) {
                    return c39650gM88294a;
                }
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.BaseBeautyStore");
            }
            if (Intrinsics.areEqual(BaseBeautyStore.class.getName(), DeviceStore.class.getName())) {
                Lazy lazy4 = C39661r.f88102s;
                Object objM88298a = AbstractC39654k.m88298a();
                if (objM88298a != null) {
                    return (BaseBeautyStore) objM88298a;
                }
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.BaseBeautyStore");
            }
            if (Intrinsics.areEqual(BaseBeautyStore.class.getName(), LiveListStore.class.getName())) {
                Lazy lazy5 = C39695N0.f88198j;
                Object objM88331a = AbstractC39782w0.m88331a();
                if (objM88331a != null) {
                    return (BaseBeautyStore) objM88331a;
                }
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.BaseBeautyStore");
            }
            C39510r c39510r = c39772r1M88324a.f88380b;
            c39510r.m88251a(1, AbstractC39394d.m88223a(BaseBeautyStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r, "message"));
            ConcurrentHashMap concurrentHashMap = c39772r1M88324a.f88379a;
            Object concurrentHashMap2 = concurrentHashMap.get("");
            if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent("", (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap2 = objPutIfAbsent;
            }
            Map map = (Map) concurrentHashMap2;
            String strM88224a = AbstractC39395e.m88224a(map, BaseBeautyStore.class, "getName(...)");
            Object obj = map.get(strM88224a);
            if (obj == null) {
                String name = BaseBeautyStore.class.getName();
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
            return (BaseBeautyStore) obj;
        }
    }

    @NotNull
    public abstract BaseBeautyState getBaseBeautyState();

    public abstract void reset();

    public abstract void setRuddyLevel(float ruddyLevel);

    public abstract void setSmoothLevel(float smoothLevel);

    public abstract void setWhitenessLevel(float whitenessLevel);

    @JvmStatic
    @NotNull
    public static final BaseBeautyStore shared() {
        return INSTANCE.shared();
    }
}
