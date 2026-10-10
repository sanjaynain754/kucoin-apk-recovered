package io.trtc.tuikit.atomicxcore.api.device;

import com.tencent.bugly.proguard.C33757kf;
import com.tencent.live2.impl.V2TXLiveDefInner;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
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
import io.trtc.tuikit.atomicxcore.api.view.CameraView;
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
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 )2\u00020\u0001:\u0001)B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\bH&J\u001a\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u0012\u0010\u000f\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\b\u0010\u0010\u001a\u00020\bH&J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0016H&J\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0019H ¢\u0006\u0002\b\u001aJ\u0010\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0016H&J\u001a\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\b\u0010\u001f\u001a\u00020\bH&J\b\u0010 \u001a\u00020\bH&J\b\u0010!\u001a\u00020\bH&J\u0010\u0010\"\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020%H&J\u0010\u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020(H&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006*"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;", "", "()V", "deviceState", "Lio/trtc/tuikit/atomicxcore/api/device/DeviceState;", "getDeviceState", "()Lio/trtc/tuikit/atomicxcore/api/device/DeviceState;", "closeLocalCamera", "", "closeLocalMicrophone", "openLocalCamera", "isFront", "", "completion", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "openLocalMicrophone", "reset", V2TXLiveDefInner.TXLivePropertyKey.kV2SetAudioRoute, "audioRoute", "Lio/trtc/tuikit/atomicxcore/api/device/AudioRoute;", "setCaptureVolume", "volume", "", "setFocus", TUIConstants.TUIChat.OWNER, "Lio/trtc/tuikit/atomicxcore/api/device/DeviceFocusOwner;", "setFocus$atomicxcore_release", "setOutputVolume", "startCameraTest", "cameraView", "Lio/trtc/tuikit/atomicxcore/api/view/CameraView;", "startScreenShare", "stopCameraTest", "stopScreenShare", "switchCamera", "switchMirror", "mirrorType", "Lio/trtc/tuikit/atomicxcore/api/device/MirrorType;", "updateVideoQuality", C33757kf.f70665k, "Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;", "Companion", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public abstract class DeviceStore {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore$Companion;", "", "()V", "shared", "Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nDeviceStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceStore.kt\nio/trtc/tuikit/atomicxcore/api/device/DeviceStore$Companion\n+ 2 StoreFactory.kt\nio/trtc/tuikit/atomicxcore/impl/live/StoreFactory\n+ 3 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,729:1\n43#2,15:730\n58#2:748\n59#2,11:752\n72#3,2:745\n1#4:747\n372#5,3:749\n375#5,4:763\n*S KotlinDebug\n*F\n+ 1 DeviceStore.kt\nio/trtc/tuikit/atomicxcore/api/device/DeviceStore$Companion\n*L\n612#1:730,15\n612#1:748\n612#1:752,11\n612#1:745,2\n612#1:747\n612#1:749,3\n612#1:763,4\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final DeviceStore shared() throws Exception {
            Object c39733e1;
            Object objPutIfAbsent;
            Lazy lazy = C39772r1.f88378c;
            C39772r1 c39772r1M88324a = AbstractC39769q1.m88324a();
            if (Intrinsics.areEqual(DeviceStore.class.getName(), AudioEffectStore.class.getName())) {
                Lazy lazy2 = C39647d.f88068h;
                Object objM88293a = AbstractC39646c.m88293a();
                if (objM88293a != null) {
                    return (DeviceStore) objM88293a;
                }
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore");
            }
            if (Intrinsics.areEqual(DeviceStore.class.getName(), BaseBeautyStore.class.getName())) {
                Lazy lazy3 = C39650g.f88077g;
                Object objM88294a = AbstractC39649f.m88294a();
                if (objM88294a != null) {
                    return (DeviceStore) objM88294a;
                }
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore");
            }
            if (Intrinsics.areEqual(DeviceStore.class.getName(), DeviceStore.class.getName())) {
                Lazy lazy4 = C39661r.f88102s;
                C39661r c39661rM88298a = AbstractC39654k.m88298a();
                if (c39661rM88298a != null) {
                    return c39661rM88298a;
                }
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore");
            }
            if (Intrinsics.areEqual(DeviceStore.class.getName(), LiveListStore.class.getName())) {
                Lazy lazy5 = C39695N0.f88198j;
                Object objM88331a = AbstractC39782w0.m88331a();
                if (objM88331a != null) {
                    return (DeviceStore) objM88331a;
                }
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore");
            }
            C39510r c39510r = c39772r1M88324a.f88380b;
            c39510r.m88251a(1, AbstractC39394d.m88223a(DeviceStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r, "message"));
            ConcurrentHashMap concurrentHashMap = c39772r1M88324a.f88379a;
            Object concurrentHashMap2 = concurrentHashMap.get("");
            if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent("", (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap2 = objPutIfAbsent;
            }
            Map map = (Map) concurrentHashMap2;
            String strM88224a = AbstractC39395e.m88224a(map, DeviceStore.class, "getName(...)");
            Object obj = map.get(strM88224a);
            if (obj == null) {
                String name = DeviceStore.class.getName();
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
            return (DeviceStore) obj;
        }
    }

    public abstract void closeLocalCamera();

    public abstract void closeLocalMicrophone();

    @NotNull
    public abstract DeviceState getDeviceState();

    public abstract void openLocalCamera(boolean isFront, @Nullable CompletionHandler completion);

    public abstract void openLocalMicrophone(@Nullable CompletionHandler completion);

    public abstract void reset();

    public abstract void setAudioRoute(@NotNull AudioRoute audioRoute);

    public abstract void setCaptureVolume(int volume);

    public abstract void setFocus$atomicxcore_release(@NotNull DeviceFocusOwner owner);

    public abstract void setOutputVolume(int volume);

    public abstract void startCameraTest(@NotNull CameraView cameraView, @Nullable CompletionHandler completion);

    public abstract void startScreenShare();

    public abstract void stopCameraTest();

    public abstract void stopScreenShare();

    public abstract void switchCamera(boolean isFront);

    public abstract void switchMirror(@NotNull MirrorType mirrorType);

    public abstract void updateVideoQuality(@NotNull VideoQuality quality);

    @JvmStatic
    @NotNull
    public static final DeviceStore shared() {
        return INSTANCE.shared();
    }
}
