package jumio.liveness;

import android.content.Context;
import android.graphics.Rect;
import android.os.SystemClock;
import com.jumio.analytics.Analytics;
import com.jumio.analytics.MetaInfo;
import com.jumio.analytics.MobileEvents;
import com.jumio.commons.camera.CameraSettings;
import com.jumio.commons.camera.CameraUtilsKt;
import com.jumio.commons.camera.Frame;
import com.jumio.commons.camera.Size;
import com.jumio.commons.log.Log;
import com.jumio.commons.log.LogLevel;
import com.jumio.core.MobileContext;
import com.jumio.core.camera.CameraConnectionData;
import com.jumio.core.cdn.CDNEncryptedEntry;
import com.jumio.core.cdn.CDNFeatureModel;
import com.jumio.core.data.ScanMode;
import com.jumio.core.environment.Environment;
import com.jumio.core.extraction.ExtractionClient;
import com.jumio.core.extraction.ExtractionUpdateInterface;
import com.jumio.core.extraction.JumioRect;
import com.jumio.core.extraction.liveness.extraction.LivenessUpdateState;
import com.jumio.core.model.StaticModel;
import com.jumio.core.models.InitiateModel;
import com.jumio.core.models.LivenessScanPartModel;
import com.jumio.core.models.LivenessSettingsModel;
import com.jumio.core.models.ScanPartModel;
import com.jumio.core.models.TimeModel;
import com.jumio.core.performance.FrameRateCheck;
import com.jumio.core.persistence.DataManager;
import com.jumio.core.scope.ScopeProviderInterface;
import com.jumio.core.sensors.LightSensorKt;
import com.jumio.core.sensors.SensorInterface;
import com.jumio.core.sensors.SensorProxy;
import com.jumio.core.sensors.SensorType;
import com.jumio.core.util.QAKt;
import com.jumio.liveness.DaClient2;
import com.jumio.liveness.LivenessPlugin;
import com.jumio.liveness.LivenessUX;
import com.jumio.sdk.enums.JumioFallbackReason;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.C41696j;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;

/* JADX INFO: renamed from: jumio.liveness.z */
/* JADX INFO: loaded from: classes61.dex */
public final class C40809z extends ExtractionClient {

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ int f90652F = 0;

    /* JADX INFO: renamed from: A */
    public final AtomicBoolean f90653A;

    /* JADX INFO: renamed from: B */
    public FrameRateCheck f90654B;

    /* JADX INFO: renamed from: C */
    public final Size f90655C;

    /* JADX INFO: renamed from: D */
    public ScanMode f90656D;

    /* JADX INFO: renamed from: E */
    public String f90657E;

    /* JADX INFO: renamed from: u */
    public final LivenessSettingsModel f90658u;

    /* JADX INFO: renamed from: v */
    public final C40797n f90659v;

    /* JADX INFO: renamed from: w */
    public CDNFeatureModel f90660w;

    /* JADX INFO: renamed from: x */
    public TimeModel f90661x;

    /* JADX INFO: renamed from: y */
    public boolean f90662y;

    /* JADX INFO: renamed from: z */
    public final AtomicBoolean f90663z;

    public C40809z(MobileContext context, ScopeProviderInterface scopeProvider, LivenessSettingsModel livenessSettingsModel) {
        C40797n livenessProcessor = new C40797n(scopeProvider);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(livenessSettingsModel, "livenessSettingsModel");
        Intrinsics.checkNotNullParameter(livenessProcessor, "livenessProcessor");
        super(context, scopeProvider);
        this.f90658u = livenessSettingsModel;
        this.f90659v = livenessProcessor;
        this.f90661x = new TimeModel(0L, 0L, 3, null);
        new ArrayList();
        this.f90663z = new AtomicBoolean(false);
        this.f90653A = new AtomicBoolean(false);
        this.f90654B = new FrameRateCheck(livenessSettingsModel.getFrameRateThreshold(), livenessSettingsModel.getViolationLimit());
        this.f90655C = new Size(1920, TXVodDownloadDataSource.QUALITY_1080P);
        this.f90656D = ScanMode.JUMIO_LIVENESS;
    }

    @Override // com.jumio.core.extraction.ExtractionClient
    public final void configure(DataManager dataManager, StaticModel configurationModel) {
        Intrinsics.checkNotNullParameter(dataManager, "dataManager");
        Intrinsics.checkNotNullParameter(configurationModel, "configurationModel");
        super.configure(dataManager, configurationModel);
        try {
            setConfigured(getF13859q() && Environment.loadDaClientLib$default(Environment.INSTANCE, getF13845c(), false, 2, null));
            if (!(configurationModel instanceof ScanPartModel)) {
                throw new IllegalArgumentException("Configuration model should be an instance of ScanPartModel");
            }
            this.f90660w = (CDNFeatureModel) dataManager.get(CDNFeatureModel.class);
            this.f90661x = (TimeModel) dataManager.get(TimeModel.class);
            LivenessScanPartModel livenessScanPartModel = configurationModel instanceof LivenessScanPartModel ? (LivenessScanPartModel) configurationModel : null;
            if (livenessScanPartModel != null) {
                ScanMode f14313b = livenessScanPartModel.getF14313b();
                this.f90656D = f14313b;
                if (f14313b == ScanMode.JUMIO_PREMIUM) {
                    this.f90657E = ((InitiateModel) dataManager.get(InitiateModel.class)).getF14256b();
                }
            }
        } catch (Exception e11) {
            Log.printStackTrace(e11);
            setConfigured(false);
        }
    }

    @Override // com.jumio.core.extraction.ExtractionClient
    /* JADX INFO: renamed from: getFrameRateCheck */
    public final FrameRateCheck getF13858p() {
        return this.f90654B;
    }

    @Override // com.jumio.core.extraction.ExtractionClient
    public final Size getPreferredPreviewSize() {
        return this.f90655C;
    }

    @Override // com.jumio.core.extraction.ExtractionClient
    public final void init() {
        CDNEncryptedEntry cDNEncryptedEntry;
        super.init();
        C41696j.m91104d(getF13852j().getMainScope(), null, null, new C40803t(this, null), 3, null);
        Log.m14474i("LivenessExtractionClient", "Initialising " + Reflection.getOrCreateKotlinClass(C40809z.class).getSimpleName());
        CDNFeatureModel cDNFeatureModel = this.f90660w;
        if (cDNFeatureModel == null || (cDNEncryptedEntry = cDNFeatureModel.get(LivenessPlugin.LIVENESS_ASSETS)) == null) {
            Log.m14469e("LivenessExtractionClient", "Could not find encrypted model for livenessAssets");
            Analytics.INSTANCE.add(MobileEvents.misc$default("livenessAssetsNotAvailable", null, 2, null));
            triggerFallback(JumioFallbackReason.SCANNING_ERROR);
            return;
        }
        if (cDNEncryptedEntry.isPreloadedFile()) {
            Analytics.INSTANCE.add(MobileEvents.misc$default("livenessAssetsPreloaded", null, 2, null));
        }
        long jConvert = TimeUnit.NANOSECONDS.convert(this.f90658u.getSamplingTimeInMs(), TimeUnit.MILLISECONDS);
        startFrameRateObservation(jConvert, this);
        Log.m14463d("LivenessExtractionClient", "Frame rate observation initialised with:\n" + this.f90658u.getFrameRateThreshold() + " FPS threshold\n" + jConvert + " Ns sampling time\n" + this.f90658u.getViolationLimit() + " violation limit");
        ExtractionUpdateInterface.Companion companion = ExtractionUpdateInterface.INSTANCE;
        int faceCenterArea = LivenessUpdateState.INSTANCE.getFaceCenterArea();
        CameraSettings f13860r = getF13860r();
        CameraSettings f13860r2 = getF13860r();
        LivenessSettingsModel livenessSettingsModel = this.f90658u;
        double d11 = (double) 2;
        double maxFaceCenterDifference = (livenessSettingsModel.getMaxFaceCenterDifference() * ((double) f13860r2.getF13517c().getWidth())) / d11;
        double maxFaceCenterDifference2 = (livenessSettingsModel.getMaxFaceCenterDifference() * ((double) f13860r2.getF13517c().getHeight())) / d11;
        publishUpdate(ExtractionUpdateInterface.Companion.build$default(companion, faceCenterArea, CameraUtilsKt.previewToSurface(f13860r, new JumioRect((int) (((double) (f13860r2.getF13517c().getWidth() / 2)) - maxFaceCenterDifference), (int) ((((double) (f13860r2.getF13517c().getHeight() / 2)) - maxFaceCenterDifference2) * 1.1d), (int) (((double) (f13860r2.getF13517c().getWidth() / 2)) + maxFaceCenterDifference), (int) ((((double) (f13860r2.getF13517c().getHeight() / 2)) + maxFaceCenterDifference2) * 1.1d)).toRectF()), null, 4, null));
        try {
            Context f13845c = getF13845c();
            Intrinsics.checkNotNull(f13845c, "null cannot be cast to non-null type com.jumio.core.MobileContext");
            this.f90659v.m89291a(new C40808y(this), new C40773B((MobileContext) f13845c, this.f90658u, this.f90661x, getF13860r().getF13517c().isPortrait(), cDNEncryptedEntry.load(getF13845c(), this.f90658u.getModelInitTimeoutInMs()), this.f90656D, this.f90657E));
            this.f90663z.set(false);
        } catch (Exception e11) {
            Log.m14469e("LivenessExtractionClient", "Liveness error: " + Reflection.getOrCreateKotlinClass(e11.getClass()).getSimpleName() + " | " + e11.getMessage());
            Log.printStackTrace(e11);
            MetaInfo metaInfo = new MetaInfo();
            metaInfo.put("message", e11.getMessage());
            Analytics.INSTANCE.add(MobileEvents.misc("livenessError", metaInfo));
            triggerFallback(JumioFallbackReason.SCANNING_ERROR);
        }
    }

    @Override // com.jumio.core.extraction.ExtractionClient, com.jumio.core.performance.FrameRateCallback
    public final void onFramesSampled(int i11) {
        FrameRateCheck frameRateCheck = this.f90654B;
        if (frameRateCheck == null || frameRateCheck.checkFrameRate(i11)) {
            return;
        }
        Analytics.INSTANCE.add(MobileEvents.misc$default("livenessFrameRateFallback", null, 2, null));
        triggerFallback(JumioFallbackReason.LOW_PERFORMANCE);
    }

    @Override // com.jumio.core.extraction.ExtractionClient
    public final void process(Frame frame, CameraSettings cameraSettings, Rect extractionArea) {
        SensorInterface sensorInterfaceFirstOrNull;
        float[] latestData;
        Intrinsics.checkNotNullParameter(frame, "frame");
        Intrinsics.checkNotNullParameter(cameraSettings, "cameraSettings");
        Intrinsics.checkNotNullParameter(extractionArea, "extractionArea");
        if (!this.f90662y) {
            setResult(false);
            return;
        }
        int width = frame.getMetadata().getSize().getWidth();
        int height = frame.getMetadata().getSize().getHeight();
        if (width == 0 || height == 0) {
            setResult(false);
            return;
        }
        Size size = frame.getMetadata().getSize();
        if (size.getWidth() < 720 || size.getHeight() < 720) {
            triggerFallback(JumioFallbackReason.LOW_PERFORMANCE);
            setResult(false);
            return;
        }
        if (!this.f90659v.m89292b()) {
            Log.m14484w("LivenessExtractionClient", "Liveness client not ready, could not process image!");
            setResult(false);
            return;
        }
        SystemClock.uptimeMillis();
        Log.m14479v("LivenessExtractionClient", "Processing frame with timeStamp=" + frame.getMetadata().getTimestamp() + ", width=" + width + ", height=" + height + ", rotation=" + frame.getMetadata().getRotation() + ", orientation=" + frame.getMetadata().getOrientation());
        if (this.f90653A.getAndSet(false)) {
            QAKt.getQA().getClass();
        }
        C40797n c40797n = this.f90659v;
        c40797n.getClass();
        Intrinsics.checkNotNullParameter(frame, "frame");
        if (c40797n.m89292b()) {
            try {
                synchronized (c40797n.f90635i) {
                    LivenessUX livenessUX = c40797n.f90629c;
                    if (livenessUX != null) {
                        livenessUX.onBeforeFrame();
                        Unit unit = Unit.INSTANCE;
                    }
                }
                long jUptimeMillis = SystemClock.uptimeMillis();
                CameraConnectionData cameraConnectionData = frame.getMetadata().getCameraConnectionData();
                if (cameraConnectionData != null) {
                    c40797n.f90639m.put(Long.valueOf(jUptimeMillis), cameraConnectionData);
                }
                synchronized (c40797n.f90634h) {
                    try {
                        SensorProxy sensorProxy = c40797n.f90640n;
                        float f11 = (sensorProxy == null || (sensorInterfaceFirstOrNull = sensorProxy.firstOrNull(SensorType.LIGHT)) == null || (latestData = sensorInterfaceFirstOrNull.getLatestData()) == null) ? LightSensorKt.getLIGHT_SENSOR_DEFAULT_VALUE()[0] : latestData[0];
                        DaClient2 daClient2 = c40797n.f90628b;
                        if (daClient2 != null) {
                            Pair<String, Object>[] attributes = AbstractC40799p.m89299a(frame.getMetadata(), f11);
                            Intrinsics.checkNotNullParameter(daClient2, "<this>");
                            Intrinsics.checkNotNullParameter(frame, "frame");
                            Intrinsics.checkNotNullParameter(attributes, "attributes");
                            daClient2.sendFrameNV21(jUptimeMillis, frame.getByteArray(), frame.getMetadata().getSize().getWidth(), frame.getMetadata().getSize().getHeight(), frame.getMetadata().getRotation(), attributes);
                            Unit unit2 = Unit.INSTANCE;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                synchronized (c40797n.f90635i) {
                    LivenessUX livenessUX2 = c40797n.f90629c;
                    if (livenessUX2 != null) {
                        livenessUX2.onAfterFrame();
                        Unit unit3 = Unit.INSTANCE;
                    }
                }
            } catch (Exception e11) {
                Log.printStackTrace(e11);
            }
        }
        LogLevel logLevel = LogLevel.OFF;
        setResult(false);
    }

    @Override // com.jumio.core.extraction.ExtractionClient
    public final void setFrameRateCheck(FrameRateCheck frameRateCheck) {
        this.f90654B = frameRateCheck;
    }

    @Override // com.jumio.core.extraction.ExtractionClient
    public final boolean shouldFeed() {
        return this.f90659v.m89292b() && !this.f90663z.get();
    }

    @Override // com.jumio.core.extraction.ExtractionClient
    public final void cancel() {
        super.cancel();
        Log.m14474i("LivenessExtractionClient", "Cancelling " + Reflection.getOrCreateKotlinClass(C40809z.class).getSimpleName());
        this.f90659v.m89293c();
        LogLevel logLevel = LogLevel.OFF;
    }

    @Override // com.jumio.core.extraction.ExtractionClient
    public final void destroy() {
        super.destroy();
        Log.m14474i("LivenessExtractionClient", "Destroying " + Reflection.getOrCreateKotlinClass(C40809z.class).getSimpleName());
        this.f90659v.m89293c();
    }
}
