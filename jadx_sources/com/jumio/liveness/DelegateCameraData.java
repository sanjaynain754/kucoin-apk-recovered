package com.jumio.liveness;

import android.content.Context;
import com.jumio.core.camera.CameraDataSettingsModel;
import com.jumio.core.scope.ScopeProviderInterface;
import com.tencent.qcloud.tuicore.TUIConstants;
import jumio.liveness.C40787d;
import jumio.liveness.C40800q;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\tH\u0016J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lcom/jumio/liveness/DelegateCameraData;", "Lcom/jumio/liveness/CameraData;", "daClient", "Lcom/jumio/liveness/DaClient2;", "eventHandler", "Lcom/jumio/liveness/processor/DaClientEventHandler;", "<init>", "(Lcom/jumio/liveness/DaClient2;Lcom/jumio/liveness/processor/DaClientEventHandler;)V", "init", "", "context", "Landroid/content/Context;", "cameraDataSettingsModel", "Lcom/jumio/core/camera/CameraDataSettingsModel;", "scopeProvider", "Lcom/jumio/core/scope/ScopeProviderInterface;", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "handleEvent", "event", "Lcom/jumio/liveness/DaClient2$Event;", "jumio-liveness_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DelegateCameraData extends CameraData {

    /* JADX INFO: renamed from: h */
    public final C40787d f14607h;

    public DelegateCameraData(@NotNull DaClient2 daClient, @NotNull C40787d eventHandler) {
        Intrinsics.checkNotNullParameter(daClient, "daClient");
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        this.f14607h = eventHandler;
        setDaClient(daClient);
        eventHandler.f90614c = new C40800q(this);
    }

    @Override // com.jumio.liveness.CameraData, com.jumio.core.camera.CameraDataInterface
    public void destroy() {
        this.f14607h.f90614c = null;
        super.destroy();
    }

    @Override // com.jumio.liveness.CameraData, com.jumio.core.camera.CameraDataInterface
    public void init(@NotNull Context context, @NotNull CameraDataSettingsModel cameraDataSettingsModel, @NotNull ScopeProviderInterface scopeProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cameraDataSettingsModel, "cameraDataSettingsModel");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        super.init(context, cameraDataSettingsModel, scopeProvider);
        if (cameraDataSettingsModel.getF13724a()) {
            return;
        }
        destroy();
    }

    public static final void access$handleEvent(DelegateCameraData delegateCameraData, DaClient2.Event event) {
        delegateCameraData.getClass();
        if (Intrinsics.areEqual(event.getName(), "camera_liveness_status")) {
            delegateCameraData.saveEvent(event);
        }
    }
}
