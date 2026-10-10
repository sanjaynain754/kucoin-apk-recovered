package io.trtc.tuikit.atomicx.pictureinpicture;

import io.trtc.tuikit.atomicx.pictureinpicture.PictureInPictureStore;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;
import zf0.PictureInPictureState;

/* JADX INFO: compiled from: PictureInPictureStore.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/pictureinpicture/PictureInPictureStore;", "", "<init>", "()V", "_isPictureInPictureMode", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "state", "Lio/trtc/tuikit/atomicx/pictureinpicture/PictureInPictureState;", "getState", "()Lio/trtc/tuikit/atomicx/pictureinpicture/PictureInPictureState;", "updateIsPictureInPictureMode", "", "isPictureInPictureMode", "Companion", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPictureInPictureStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PictureInPictureStore.kt\nio/trtc/tuikit/atomicx/pictureinpicture/PictureInPictureStore\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,24:1\n230#2,5:25\n*S KotlinDebug\n*F\n+ 1 PictureInPictureStore.kt\nio/trtc/tuikit/atomicx/pictureinpicture/PictureInPictureStore\n*L\n22#1:25,5\n*E\n"})
public final class PictureInPictureStore {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Companion f87308c = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Lazy<PictureInPictureStore> f87309d = LazyKt.lazy(new Function0() { // from class: zf0.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PictureInPictureStore.m87972d();
        }
    });

    /* JADX INFO: renamed from: a */
    @NotNull
    public final InterfaceC41669n<Boolean> f87310a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final PictureInPictureState f87311b;

    /* JADX INFO: compiled from: PictureInPictureStore.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/pictureinpicture/PictureInPictureStore$Companion;", "", "<init>", "()V", "shared", "Lio/trtc/tuikit/atomicx/pictureinpicture/PictureInPictureStore;", "getShared", "()Lio/trtc/tuikit/atomicx/pictureinpicture/PictureInPictureStore;", "shared$delegate", "Lkotlin/Lazy;", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final PictureInPictureStore getShared() {
            return (PictureInPictureStore) PictureInPictureStore.f87309d.getValue();
        }
    }

    /* JADX INFO: renamed from: d */
    public static final PictureInPictureStore m87972d() {
        return new PictureInPictureStore();
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final PictureInPictureState getF87311b() {
        return this.f87311b;
    }

    /* JADX INFO: renamed from: e */
    public final void m87974e(boolean z11) {
        Boolean value;
        InterfaceC41669n<Boolean> interfaceC41669n = this.f87310a;
        do {
            value = interfaceC41669n.getValue();
            value.getClass();
        } while (!interfaceC41669n.compareAndSet(value, Boolean.valueOf(z11)));
    }

    public PictureInPictureStore() {
        InterfaceC41669n<Boolean> interfaceC41669nM91009a = C41679x.m91009a(Boolean.FALSE);
        this.f87310a = interfaceC41669nM91009a;
        this.f87311b = new PictureInPictureState(interfaceC41669nM91009a);
    }
}
