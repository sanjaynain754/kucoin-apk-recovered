package com.jumio.core.camera;

import android.content.Context;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.jumio.commons.camera.Frame;
import com.jumio.core.scope.ScopeProviderInterface;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0005H\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016¨\u0006\u0014"}, m90084d2 = {"Lcom/jumio/core/camera/DefaultCameraData;", "Lcom/jumio/core/camera/CameraDataInterface;", "<init>", "()V", "init", "", "context", "Landroid/content/Context;", "cameraDataSettingsModel", "Lcom/jumio/core/camera/CameraDataSettingsModel;", "scopeProvider", "Lcom/jumio/core/scope/ScopeProviderInterface;", "start", "sendFrame", TypedValues.AttributesType.S_FRAME, "Lcom/jumio/commons/camera/Frame;", InterfaceC33730j9.f70350a, TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "getResult", "Lcom/jumio/core/camera/CameraDataResult;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DefaultCameraData implements CameraDataInterface {
    @Override // com.jumio.core.camera.CameraDataInterface
    @NotNull
    public CameraDataResult getResult() {
        return new CameraDataResult();
    }

    @Override // com.jumio.core.camera.CameraDataInterface
    public void init(@NotNull Context context, @NotNull CameraDataSettingsModel cameraDataSettingsModel, @NotNull ScopeProviderInterface scopeProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cameraDataSettingsModel, "cameraDataSettingsModel");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
    }

    @Override // com.jumio.core.camera.CameraDataInterface
    public void sendFrame(@NotNull Frame frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
    }

    @Override // com.jumio.core.camera.CameraDataInterface
    public void destroy() {
    }

    @Override // com.jumio.core.camera.CameraDataInterface
    public void start() {
    }

    @Override // com.jumio.core.camera.CameraDataInterface
    public void stop() {
    }
}
