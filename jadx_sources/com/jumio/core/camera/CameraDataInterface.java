package com.jumio.core.camera;

import android.content.Context;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.jumio.commons.camera.Frame;
import com.jumio.core.Injected;
import com.jumio.core.scope.ScopeProviderInterface;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Injected
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&J\b\u0010\u0010\u001a\u00020\u0011H&¨\u0006\u0012À\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/camera/CameraDataInterface;", "", "init", "", "context", "Landroid/content/Context;", "cameraDataSettingsModel", "Lcom/jumio/core/camera/CameraDataSettingsModel;", "scopeProvider", "Lcom/jumio/core/scope/ScopeProviderInterface;", "start", "sendFrame", TypedValues.AttributesType.S_FRAME, "Lcom/jumio/commons/camera/Frame;", InterfaceC33730j9.f70350a, TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "getResult", "Lcom/jumio/core/camera/CameraDataResult;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface CameraDataInterface {
    void destroy();

    @NotNull
    CameraDataResult getResult();

    void init(@NotNull Context context, @NotNull CameraDataSettingsModel cameraDataSettingsModel, @NotNull ScopeProviderInterface scopeProvider);

    void sendFrame(@NotNull Frame frame);

    void start();

    void stop();
}
