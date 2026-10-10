package com.jumio.liveness;

import android.content.Context;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.jumio.commons.camera.Frame;
import com.jumio.core.camera.CameraDataSettingsModel;
import com.jumio.core.environment.Environment;
import com.jumio.core.scope.ScopeProviderInterface;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.qcloud.tuicore.TUIConstants;
import jumio.liveness.AbstractC40786c;
import jumio.liveness.C40782K;
import jumio.liveness.C40783L;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\nH\u0016J\b\u0010\u0016\u001a\u00020\nH\u0016J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0006H\u0016J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u001c"}, m90084d2 = {"Lcom/jumio/liveness/StandaloneCameraData;", "Lcom/jumio/liveness/CameraData;", "Lcom/jumio/liveness/DaClient2$EventHandler;", "<init>", "()V", "timestamp", "", "getTimestamp", "()J", "init", "", "context", "Landroid/content/Context;", "cameraDataSettingsModel", "Lcom/jumio/core/camera/CameraDataSettingsModel;", "scopeProvider", "Lcom/jumio/core/scope/ScopeProviderInterface;", "start", "sendFrame", TypedValues.AttributesType.S_FRAME, "Lcom/jumio/commons/camera/Frame;", InterfaceC33730j9.f70350a, TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "onEventForForwarding", "nativeEventPtr", "onResponse", "eventView", "Lcom/jumio/liveness/DaClient2$EventView;", "jumio-liveness_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class StandaloneCameraData extends CameraData implements DaClient2.EventHandler {
    @Override // com.jumio.liveness.CameraData, com.jumio.core.camera.CameraDataInterface
    public void init(@NotNull Context context, @NotNull CameraDataSettingsModel cameraDataSettingsModel, @NotNull ScopeProviderInterface scopeProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cameraDataSettingsModel, "cameraDataSettingsModel");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        super.init(context, cameraDataSettingsModel, scopeProvider);
        if (cameraDataSettingsModel.getF13724a() && Environment.loadDaClientLib$default(Environment.INSTANCE, context, false, 2, null)) {
            C41696j.m91104d(scopeProvider.getMainScope(), null, null, new C40783L(this, context, cameraDataSettingsModel, null), 3, null);
        }
    }

    @Override // com.jumio.liveness.DaClient2.EventHandler
    public void onResponse(@NotNull DaClient2.EventView eventView) {
        Intrinsics.checkNotNullParameter(eventView, "eventView");
        if (Intrinsics.areEqual(eventView.getName(), "camera_liveness_status")) {
            saveEvent(eventView.copy());
        }
    }

    @Override // com.jumio.liveness.CameraData, com.jumio.core.camera.CameraDataInterface
    public void sendFrame(@NotNull Frame frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
        synchronized (getF14602c()) {
            DaClient2 f14600a = getF14600a();
            if (f14600a != null) {
                long timestamp = getTimestamp();
                Pair<String, Object>[] attributes = new Pair[0];
                Intrinsics.checkNotNullParameter(f14600a, "<this>");
                Intrinsics.checkNotNullParameter(frame, "frame");
                Intrinsics.checkNotNullParameter(attributes, "attributes");
                f14600a.sendFrameNV21(timestamp, frame.getByteArray(), frame.getMetadata().getSize().getWidth(), frame.getMetadata().getSize().getHeight(), frame.getMetadata().getRotation(), attributes);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // com.jumio.liveness.CameraData, com.jumio.core.camera.CameraDataInterface
    public void destroy() {
        InterfaceC41709m0 backgroundScope;
        DaClient2 f14600a = getF14600a();
        setDaClient(null);
        synchronized (getF14602c()) {
            ScopeProviderInterface f14601b = getF14601b();
            if (f14601b != null && (backgroundScope = f14601b.getBackgroundScope()) != null) {
                C41696j.m91104d(backgroundScope, null, null, new C40782K(f14600a, null), 3, null);
            }
        }
        super.destroy();
    }

    @Override // com.jumio.liveness.CameraData
    public long getTimestamp() {
        return System.currentTimeMillis();
    }

    @Override // com.jumio.liveness.CameraData, com.jumio.core.camera.CameraDataInterface
    public void start() {
        synchronized (getF14602c()) {
            try {
                DaClient2 f14600a = getF14600a();
                if (f14600a != null) {
                    f14600a.start();
                    AbstractC40786c.m89283a(f14600a, DaClient.EVENT_START_SESSION, new Pair[0], getTimestamp());
                }
                super.start();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.jumio.liveness.CameraData, com.jumio.core.camera.CameraDataInterface
    public void stop() {
        super.stop();
        synchronized (getF14602c()) {
            DaClient2 f14600a = getF14600a();
            if (f14600a != null) {
                f14600a.stop();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // com.jumio.liveness.DaClient2.EventHandler
    public void onEventForForwarding(long nativeEventPtr) {
    }
}
