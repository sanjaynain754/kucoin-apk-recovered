package com.jumio.core.image;

import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.jumio.commons.camera.Frame;
import com.jumio.commons.camera.ImageData;
import com.jumio.core.Injected;
import com.jumio.core.models.AuthorizationModel;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Injected
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005R\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&J\b\u0010\u000e\u001a\u00020\u0003H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J \u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0014H&¨\u0006\u001bÀ\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/image/ImageStoreInterface;", "", "configure", "", "sessionKey", "Lcom/jumio/core/models/AuthorizationModel$SessionKey;", "Lcom/jumio/core/models/AuthorizationModel;", "compressFormat", "Landroid/graphics/Bitmap$CompressFormat;", "compressQuality", "", "mimeType", "", "fileType", "start", InterfaceC33730j9.f70350a, "awaitTermination", "", "add", "imageData", "Lcom/jumio/commons/camera/ImageData;", TypedValues.AttributesType.S_FRAME, "Lcom/jumio/commons/camera/Frame;", "extractionArea", "Landroid/graphics/Rect;", "delete", "data", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ImageStoreInterface {
    void add(@NotNull ImageData imageData, @NotNull Frame frame, @NotNull Rect extractionArea);

    void configure(@NotNull AuthorizationModel.SessionKey sessionKey, @NotNull Bitmap.CompressFormat compressFormat, int compressQuality, @NotNull String mimeType, @NotNull String fileType);

    void delete(@NotNull ImageData data);

    void start();

    void stop(boolean awaitTermination);
}
