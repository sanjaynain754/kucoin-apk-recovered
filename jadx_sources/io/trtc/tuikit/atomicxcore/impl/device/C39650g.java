package io.trtc.tuikit.atomicxcore.impl.device;

import com.tencent.cloud.tuikit.engine.room.TUIRoomEngine;
import com.tencent.liteav.beauty.TXBeautyManager;
import io.trtc.tuikit.atomicxcore.api.device.BaseBeautyState;
import io.trtc.tuikit.atomicxcore.api.device.BaseBeautyStore;
import io.trtc.tuikit.atomicxcore.api.view.AbstractC39398a;
import io.trtc.tuikit.atomicxcore.impl.barrage.AbstractC39465b;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.device.g */
/* JADX INFO: loaded from: classes61.dex */
public final class C39650g extends BaseBeautyStore {

    /* JADX INFO: renamed from: g */
    public static final Lazy f88077g = LazyKt.lazy(C39648e.f88076a);

    /* JADX INFO: renamed from: a */
    public final InterfaceC41669n f88078a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC41669n f88079b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC41669n f88080c;

    /* JADX INFO: renamed from: d */
    public final C39510r f88081d;

    /* JADX INFO: renamed from: e */
    public final TXBeautyManager f88082e;

    /* JADX INFO: renamed from: f */
    public final BaseBeautyState f88083f;

    @Override // io.trtc.tuikit.atomicxcore.api.device.BaseBeautyStore
    public final BaseBeautyState getBaseBeautyState() {
        return this.f88083f;
    }

    @Override // io.trtc.tuikit.atomicxcore.api.device.BaseBeautyStore
    public final void reset() {
        AbstractC39465b.m88232a(this.f88081d, "API: reset called", "message", 0, "API: reset called");
        this.f88082e.setBeautyLevel(0.0f);
        this.f88082e.setWhitenessLevel(0.0f);
        this.f88082e.setRuddyLevel(0.0f);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.device.BaseBeautyStore
    public final void setRuddyLevel(float f11) {
        Object value;
        C39510r c39510r = this.f88081d;
        String message = "API: setRuddyLevel called with ruddyLevel=" + f11;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        InterfaceC41669n interfaceC41669n = this.f88080c;
        do {
            value = interfaceC41669n.getValue();
            ((Number) value).floatValue();
        } while (!interfaceC41669n.compareAndSet(value, Float.valueOf(f11)));
        this.f88082e.setRuddyLevel(f11);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.device.BaseBeautyStore
    public final void setSmoothLevel(float f11) {
        Object value;
        C39510r c39510r = this.f88081d;
        String message = "API: setSmoothLevel called with smoothLevel=" + f11;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        InterfaceC41669n interfaceC41669n = this.f88078a;
        do {
            value = interfaceC41669n.getValue();
            ((Number) value).floatValue();
        } while (!interfaceC41669n.compareAndSet(value, Float.valueOf(f11)));
        this.f88082e.setBeautyStyle(0);
        this.f88082e.setBeautyLevel(f11);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.device.BaseBeautyStore
    public final void setWhitenessLevel(float f11) {
        Object value;
        C39510r c39510r = this.f88081d;
        String message = "API: setWhitenessLevel called with whitenessLevel=" + f11;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        InterfaceC41669n interfaceC41669n = this.f88079b;
        do {
            value = interfaceC41669n.getValue();
            ((Number) value).floatValue();
        } while (!interfaceC41669n.compareAndSet(value, Float.valueOf(f11)));
        this.f88082e.setWhitenessLevel(f11);
    }

    public C39650g() {
        Float fValueOf = Float.valueOf(0.0f);
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(fValueOf);
        this.f88078a = interfaceC41669nM91009a;
        InterfaceC41669n interfaceC41669nM91009a2 = C41679x.m91009a(fValueOf);
        this.f88079b = interfaceC41669nM91009a2;
        InterfaceC41669n interfaceC41669nM91009a3 = C41679x.m91009a(fValueOf);
        this.f88080c = interfaceC41669nM91009a3;
        this.f88081d = AbstractC39398a.m88229a("BaseBeautyStoreImpl", "file", "AtomicXCore-Live", "BaseBeautyStoreImpl");
        TUIRoomEngine tUIRoomEngineSharedInstance = TUIRoomEngine.sharedInstance();
        Intrinsics.checkNotNullExpressionValue(tUIRoomEngineSharedInstance, "sharedInstance(...)");
        this.f88082e = tUIRoomEngineSharedInstance.getBeautyManager();
        this.f88083f = new BaseBeautyState(interfaceC41669nM91009a, interfaceC41669nM91009a2, interfaceC41669nM91009a3);
    }
}
