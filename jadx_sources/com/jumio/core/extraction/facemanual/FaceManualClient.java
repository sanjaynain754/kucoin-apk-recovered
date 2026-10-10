package com.jumio.core.extraction.facemanual;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.jumio.commons.camera.CameraSettings;
import com.jumio.commons.camera.Frame;
import com.jumio.commons.camera.Size;
import com.jumio.commons.log.Log;
import com.jumio.commons.utils.BitmapUtilKt;
import com.jumio.core.MobileContext;
import com.jumio.core.data.ScanMode;
import com.jumio.core.data.scan.DataState;
import com.jumio.core.extraction.ExtractionClient;
import com.jumio.core.extraction.ExtractionUpdateInterface;
import com.jumio.core.extraction.ExtractionUpdateState;
import com.jumio.core.extraction.liveness.extraction.FaceManualSequenceCache;
import com.jumio.core.extraction.liveness.extraction.LivenessDataModel;
import com.jumio.core.extraction.result.ExtractionResult;
import com.jumio.core.extraction.result.ImageExtractionResult;
import com.jumio.core.model.StaticModel;
import com.jumio.core.models.SettingsModel;
import com.jumio.core.persistence.DataManager;
import com.jumio.core.scope.ScopeProviderInterface;
import com.jumio.core.util.QAKt;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0014J \u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0014J\b\u0010\u001f\u001a\u00020 H\u0014J\b\u0010!\u001a\u00020\u000eH\u0016J\b\u0010\"\u001a\u00020 H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, m90084d2 = {"Lcom/jumio/core/extraction/facemanual/FaceManualClient;", "Lcom/jumio/core/extraction/ExtractionClient;", "context", "Landroid/content/Context;", "scopeProvider", "Lcom/jumio/core/scope/ScopeProviderInterface;", "<init>", "(Landroid/content/Context;Lcom/jumio/core/scope/ScopeProviderInterface;)V", "mTakePicture", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mPictureTaken", "faceManualSequenceCache", "Lcom/jumio/core/extraction/liveness/extraction/FaceManualSequenceCache;", "configure", "", "dataManager", "Lcom/jumio/core/persistence/DataManager;", "configurationModel", "Lcom/jumio/core/model/StaticModel;", "preferredPreviewSize", "Lcom/jumio/commons/camera/Size;", "getPreferredPreviewSize", "()Lcom/jumio/commons/camera/Size;", "init", "process", TypedValues.AttributesType.S_FRAME, "Lcom/jumio/commons/camera/Frame;", "cameraSettings", "Lcom/jumio/commons/camera/CameraSettings;", "extractionArea", "Landroid/graphics/Rect;", "shouldFeed", "", "takePicture", "takePictureManually", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FaceManualClient extends ExtractionClient {

    /* JADX INFO: renamed from: u */
    public final AtomicBoolean f14099u;

    /* JADX INFO: renamed from: v */
    public final AtomicBoolean f14100v;

    /* JADX INFO: renamed from: w */
    public FaceManualSequenceCache f14101w;

    @Override // com.jumio.core.extraction.ExtractionClient
    public boolean takePictureManually() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceManualClient(@NotNull Context context, @NotNull ScopeProviderInterface scopeProvider) {
        super(context, scopeProvider);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f14099u = new AtomicBoolean(false);
        this.f14100v = new AtomicBoolean(false);
    }

    @Override // com.jumio.core.extraction.ExtractionClient
    public void configure(@NotNull DataManager dataManager, @NotNull StaticModel configurationModel) {
        Intrinsics.checkNotNullParameter(dataManager, "dataManager");
        Intrinsics.checkNotNullParameter(configurationModel, "configurationModel");
        super.configure(dataManager, configurationModel);
        SettingsModel settingsModel = (SettingsModel) dataManager.get(SettingsModel.class);
        Context f13845c = getF13845c();
        Context f13845c2 = getF13845c();
        Intrinsics.checkNotNull(f13845c2, "null cannot be cast to non-null type com.jumio.core.MobileContext");
        this.f14101w = new FaceManualSequenceCache(f13845c, ((MobileContext) f13845c2).getSessionKey(), settingsModel.getMaxLivenessImages(), 60, settingsModel.getImageCompressionQuality());
    }

    @Override // com.jumio.core.extraction.ExtractionClient
    @NotNull
    public Size getPreferredPreviewSize() {
        return new Size(1280, 720);
    }

    @Override // com.jumio.core.extraction.ExtractionClient
    public void process(@NotNull Frame frame, @NotNull CameraSettings cameraSettings, @NotNull Rect extractionArea) throws Throwable {
        Intrinsics.checkNotNullParameter(frame, "frame");
        Intrinsics.checkNotNullParameter(cameraSettings, "cameraSettings");
        Intrinsics.checkNotNullParameter(extractionArea, "extractionArea");
        boolean z11 = false;
        try {
            FaceManualSequenceCache faceManualSequenceCache = this.f14101w;
            if (faceManualSequenceCache != null) {
                faceManualSequenceCache.addSync(frame, cameraSettings, extractionArea);
            }
            if (!this.f14099u.get() || this.f14100v.get()) {
                this.f14099u.set(false);
            } else {
                this.f14100v.set(true);
                QAKt.getQA().getClass();
                Bitmap bitmapCropRotateScale$default = BitmapUtilKt.cropRotateScale$default(BitmapUtilKt.nv21ToBitmap(frame.getByteArray(), frame.getMetadata().getSize().getWidth(), frame.getMetadata().getSize().getHeight()), frame.getMetadata(), cameraSettings, extractionArea, false, false, null, false, 120, null);
                ExtractionUpdateInterface.Companion companion = ExtractionUpdateInterface.INSTANCE;
                ExtractionUpdateState.Companion companion2 = ExtractionUpdateState.INSTANCE;
                publishUpdate(ExtractionUpdateInterface.Companion.build$default(companion, companion2.getSaveImage(), new ImageExtractionResult(bitmapCropRotateScale$default, getF13857o(), null, null, null, frame.getMetadata().getCameraConnectionData(), 28, null), null, 4, null));
                publishUpdate(ExtractionUpdateInterface.Companion.build$default(companion, companion2.getShotTaken(), new ExtractionResult(getF13857o(), null, null, 6, null), null, 4, null));
                LivenessDataModel livenessDataModel = new LivenessDataModel();
                livenessDataModel.setType(ScanMode.FACE_MANUAL);
                FaceManualSequenceCache faceManualSequenceCache2 = this.f14101w;
                livenessDataModel.setFrames(faceManualSequenceCache2 != null ? faceManualSequenceCache2.finish() : null);
                livenessDataModel.setState(DataState.SAVED);
                livenessDataModel.setPassed(null);
                publishResult((StaticModel) livenessDataModel);
                z11 = true;
            }
        } catch (Exception e11) {
            Log.m14485w("ImageCheck", "computeFocusConfidence failed!", e11);
        }
        System.gc();
        setResult(z11);
    }

    @Override // com.jumio.core.extraction.ExtractionClient
    public boolean shouldFeed() {
        return !this.f14100v.get();
    }

    @Override // com.jumio.core.extraction.ExtractionClient
    public void init() {
        super.init();
        this.f14099u.set(false);
        this.f14100v.set(false);
        FaceManualSequenceCache faceManualSequenceCache = this.f14101w;
        if (faceManualSequenceCache != null) {
            faceManualSequenceCache.reset();
            faceManualSequenceCache.setActive(true);
        }
    }

    @Override // com.jumio.core.extraction.ExtractionClient
    public void takePicture() {
        if (getDataExtraction()) {
            this.f14099u.set(true);
        }
    }
}
