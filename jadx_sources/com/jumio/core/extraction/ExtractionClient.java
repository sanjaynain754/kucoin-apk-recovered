package com.jumio.core.extraction;

import android.content.Context;
import android.graphics.Rect;
import androidx.annotation.CallSuper;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.jumio.analytics.Analytics;
import com.jumio.analytics.MobileEvents;
import com.jumio.commons.camera.CameraSettings;
import com.jumio.commons.camera.CameraUtilsKt;
import com.jumio.commons.camera.Frame;
import com.jumio.commons.camera.Size;
import com.jumio.commons.log.Log;
import com.jumio.core.enums.UploadResolution;
import com.jumio.core.model.PublisherWithUpdate;
import com.jumio.core.model.StaticModel;
import com.jumio.core.models.ScanPartModel;
import com.jumio.core.models.UploadSettingsModel;
import com.jumio.core.performance.FrameRateCallback;
import com.jumio.core.performance.FrameRateCheck;
import com.jumio.core.performance.FrameRateObserver;
import com.jumio.core.performance.FrameRateUtils;
import com.jumio.core.persistence.DataManager;
import com.jumio.core.scope.ScopeProviderInterface;
import com.jumio.core.util.QAKt;
import com.jumio.sdk.enums.JumioCredentialPart;
import com.jumio.sdk.enums.JumioFallbackReason;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.concurrent.atomic.AtomicBoolean;
import jumio.core.C40679j1;
import jumio.core.C40684k1;
import jumio.core.C40754y1;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import rg0.C44091j;
import rg0.InterfaceC44088g;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b&\u0018\u00002\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ.\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\u00002\u001e\u0010\\\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030]J\u000e\u0010^\u001a\u00020Z2\u0006\u0010[\u001a\u00020\u0000J \u0010_\u001a\u00020Z2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010L\u001a\u00020K2\u0006\u0010R\u001a\u00020QH$J\b\u0010`\u001a\u00020$H$J\u0006\u0010a\u001a\u00020ZJ\u0010\u0010b\u001a\u0004\u0018\u00010ZH\u0082@¢\u0006\u0002\u0010cJ\b\u0010d\u001a\u00020ZH\u0015J\u0018\u0010e\u001a\u00020Z2\u0006\u0010,\u001a\u00020-2\u0006\u0010f\u001a\u00020\u0003H\u0017J\u000e\u0010g\u001a\u00020Z2\u0006\u0010\u0014\u001a\u00020\u0015J\u0012\u0010h\u001a\u00020Z2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0017J\b\u0010i\u001a\u00020ZH\u0017J\b\u0010j\u001a\u00020ZH\u0017J\u0010\u0010k\u001a\u00020Z2\u0006\u0010l\u001a\u00020$H\u0004J\u0014\u0010m\u001a\u00020Z2\n\u0010n\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0014J\u0012\u0010o\u001a\u00020Z2\b\u0010p\u001a\u0004\u0018\u00010\u0003H\u0014J\u0010\u0010q\u001a\u00020\u00172\u0006\u0010r\u001a\u00020sH\u0004J\b\u0010t\u001a\u00020$H\u0016J\b\u0010u\u001a\u00020ZH\u0016J\u0018\u0010v\u001a\u00020Z2\u0006\u0010w\u001a\u00020x2\u0006\u0010y\u001a\u00020\u0004H\u0004J\b\u0010z\u001a\u00020ZH\u0002J\u0010\u0010{\u001a\u00020Z2\u0006\u0010|\u001a\u00020}H\u0016J\b\u0010~\u001a\u00020$H\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020$X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020$X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\u001c\u0010,\u001a\u0004\u0018\u00010-X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u00102\u001a\u000203X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001c\u00108\u001a\u0004\u0018\u000109X\u0094\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0016\u0010>\u001a\u0004\u0018\u00010?8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0013\u0010B\u001a\u0004\u0018\u00010C8F¢\u0006\u0006\u001a\u0004\bD\u0010ER$\u0010F\u001a\u00020$2\u0006\u0010\u001e\u001a\u00020$@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010&\"\u0004\bG\u0010(R$\u0010H\u001a\u00020$2\u0006\u0010\u001e\u001a\u00020$8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u0010&\"\u0004\bJ\u0010(R$\u0010L\u001a\u00020K2\u0006\u0010\u001e\u001a\u00020K@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010R\u001a\u00020Q2\u0006\u0010\u001e\u001a\u00020Q@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001a\u0010W\u001a\u00020$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010&\"\u0004\bX\u0010(¨\u0006\u007f"}, m90084d2 = {"Lcom/jumio/core/extraction/ExtractionClient;", "Lcom/jumio/core/model/PublisherWithUpdate;", "Lcom/jumio/core/extraction/ExtractionUpdateInterface;", "Lcom/jumio/core/model/StaticModel;", "Lcom/jumio/core/performance/FrameRateCallback;", "context", "Landroid/content/Context;", "scopeProvider", "Lcom/jumio/core/scope/ScopeProviderInterface;", "<init>", "(Landroid/content/Context;Lcom/jumio/core/scope/ScopeProviderInterface;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "extractionSemaphore", "Lkotlinx/coroutines/sync/Semaphore;", "inProcessing", "Ljava/util/concurrent/atomic/AtomicBoolean;", "dataExtractionActive", TypedValues.AttributesType.S_FRAME, "Lcom/jumio/commons/camera/Frame;", "extractionJob", "Lkotlinx/coroutines/Job;", "subExtraction", "Lcom/jumio/core/extraction/SubExtractionProxy;", "getScopeProvider", "()Lcom/jumio/core/scope/ScopeProviderInterface;", "setScopeProvider", "(Lcom/jumio/core/scope/ScopeProviderInterface;)V", "value", "Lcom/jumio/core/performance/FrameRateObserver;", "frameRateObserver", "getFrameRateObserver", "()Lcom/jumio/core/performance/FrameRateObserver;", "shouldInitAsync", "", "getShouldInitAsync", "()Z", "setShouldInitAsync", "(Z)V", "centerCropExtractionArea", "getCenterCropExtractionArea", "setCenterCropExtractionArea", "dataManager", "Lcom/jumio/core/persistence/DataManager;", "getDataManager", "()Lcom/jumio/core/persistence/DataManager;", "setDataManager", "(Lcom/jumio/core/persistence/DataManager;)V", "configuredPart", "", "getConfiguredPart", "()Ljava/lang/String;", "setConfiguredPart", "(Ljava/lang/String;)V", "frameRateCheck", "Lcom/jumio/core/performance/FrameRateCheck;", "getFrameRateCheck", "()Lcom/jumio/core/performance/FrameRateCheck;", "setFrameRateCheck", "(Lcom/jumio/core/performance/FrameRateCheck;)V", "preferredPreviewSize", "Lcom/jumio/commons/camera/Size;", "getPreferredPreviewSize", "()Lcom/jumio/commons/camera/Size;", "framePerformance", "Lcom/jumio/core/performance/FramePerformance;", "getFramePerformance", "()Lcom/jumio/core/performance/FramePerformance;", "isConfigured", "setConfigured", "dataExtraction", "getDataExtraction", "setDataExtraction", "Lcom/jumio/commons/camera/CameraSettings;", "cameraSettings", "getCameraSettings", "()Lcom/jumio/commons/camera/CameraSettings;", "setCameraSettings", "(Lcom/jumio/commons/camera/CameraSettings;)V", "Landroid/graphics/Rect;", "extractionArea", "getExtractionArea", "()Landroid/graphics/Rect;", "setExtractionArea", "(Landroid/graphics/Rect;)V", "isSubExtraction", "setSubExtraction", "addSubExtraction", "", "extractionClient", "mergeResults", "Lkotlin/Function2;", "removeSubExtraction", "process", "shouldFeed", "reinit", "extract", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "init", "configure", "configurationModel", "feed", BridgeParamKeyKt.CAPTURE, "cancel", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "setResult", "finished", "publishUpdate", "update", "publishResult", "data", "triggerFallback", "fallbackReason", "Lcom/jumio/sdk/enums/JumioFallbackReason;", "takePictureManually", "takePicture", "startFrameRateObservation", "samplingTimeInNs", "", "frameRateCallback", "stopFrameRateObservation", "onFramesSampled", ProcessingTimesRecorderKt.DEFAULT_RECORDS_LABEL, "", "requestHighResolutionImage", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class ExtractionClient extends PublisherWithUpdate<ExtractionUpdateInterface<?>, StaticModel> implements FrameRateCallback {

    /* JADX INFO: renamed from: c */
    public Context f13845c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC44088g f13846d;

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f13847e;

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f13848f;

    /* JADX INFO: renamed from: g */
    public Frame f13849g;

    /* JADX INFO: renamed from: h */
    public InterfaceC41775x1 f13850h;

    /* JADX INFO: renamed from: i */
    public final SubExtractionProxy f13851i;

    /* JADX INFO: renamed from: j */
    public ScopeProviderInterface f13852j;

    /* JADX INFO: renamed from: k */
    public FrameRateObserver f13853k;

    /* JADX INFO: renamed from: l */
    public boolean f13854l;

    /* JADX INFO: renamed from: m */
    public boolean f13855m;

    /* JADX INFO: renamed from: n */
    public DataManager f13856n;

    /* JADX INFO: renamed from: o */
    public String f13857o;

    /* JADX INFO: renamed from: p */
    public FrameRateCheck f13858p;

    /* JADX INFO: renamed from: q */
    public boolean f13859q;

    /* JADX INFO: renamed from: r */
    public CameraSettings f13860r;

    /* JADX INFO: renamed from: s */
    public Rect f13861s;

    /* JADX INFO: renamed from: t */
    public boolean f13862t;

    @CallSuper
    public void cancel() {
        setDataExtraction(false);
        this.f13851i.cancel();
    }

    @CallSuper
    public synchronized void capture(@Nullable Frame frame) {
        if (frame != null) {
            try {
                QAKt.getQA().getClass();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f13851i.capture(frame);
    }

    public final synchronized void feed(@NotNull Frame frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
        if (!this.f13860r.isEmpty() && !this.f13861s.isEmpty() && getDataExtraction() && shouldFeed() && this.f13847e.compareAndSet(false, true)) {
            try {
                synchronized (this.f13846d) {
                    try {
                        this.f13849g = frame.getDirectCameraFrame() ? frame.deepCopy() : frame;
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    this.f13846d.release();
                } catch (Exception unused) {
                    Analytics.INSTANCE.add(MobileEvents.misc$default("semaphoreReleaseException", null, 2, null));
                    Log.m14467e("Could not release semaphore - let's continue anyways");
                }
            } catch (OutOfMemoryError e11) {
                Log.m14484w("ExtractionClient", "Insufficient memory for frame deep copy, skipping frame: " + e11.getMessage());
                this.f13847e.set(false);
                return;
            }
        }
        this.f13851i.feed(frame);
    }

    @Nullable
    public Size getPreferredPreviewSize() {
        return null;
    }

    public abstract void process(@NotNull Frame frame, @NotNull CameraSettings cameraSettings, @NotNull Rect extractionArea);

    public abstract boolean shouldFeed();

    public boolean takePictureManually() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtractionClient(@NotNull Context context, @NotNull ScopeProviderInterface scopeProvider) {
        super(scopeProvider);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f13845c = context;
        this.f13846d = C44091j.m97147a(1, 1);
        this.f13847e = new AtomicBoolean(false);
        this.f13848f = new AtomicBoolean(false);
        this.f13849g = new Frame(null, null, 0, 0, 0.0f, 0L, null, 0.0f, 0, false, 0, 0L, 4095, null);
        this.f13851i = new SubExtractionProxy();
        this.f13852j = scopeProvider.fork();
        this.f13857o = "";
        this.f13859q = true;
        this.f13860r = new CameraSettings();
        this.f13861s = new Rect(0, 0, 0, 0);
    }

    public final void addSubExtraction(@NotNull ExtractionClient extractionClient, @NotNull Function2<? super StaticModel, ? super StaticModel, ? extends StaticModel> mergeResults) {
        Intrinsics.checkNotNullParameter(extractionClient, "extractionClient");
        Intrinsics.checkNotNullParameter(mergeResults, "mergeResults");
        this.f13851i.add(extractionClient, mergeResults);
    }

    @CallSuper
    public void configure(@NotNull DataManager dataManager, @NotNull StaticModel configurationModel) {
        String strName;
        JumioCredentialPart f14312a;
        Intrinsics.checkNotNullParameter(dataManager, "dataManager");
        Intrinsics.checkNotNullParameter(configurationModel, "configurationModel");
        this.f13856n = dataManager;
        this.f13859q = true;
        ScanPartModel scanPartModel = configurationModel instanceof ScanPartModel ? (ScanPartModel) configurationModel : null;
        if (scanPartModel == null || (f14312a = scanPartModel.getF14312a()) == null || (strName = f14312a.name()) == null) {
            strName = "FRONT";
        }
        this.f13857o = strName;
        this.f13851i.configure(dataManager, configurationModel);
        this.f13859q = this.f13859q && this.f13851i.getAreConfigured();
    }

    @NotNull
    /* JADX INFO: renamed from: getCameraSettings, reason: from getter */
    public final CameraSettings getF13860r() {
        return this.f13860r;
    }

    /* JADX INFO: renamed from: getCenterCropExtractionArea, reason: from getter */
    public final boolean getF13855m() {
        return this.f13855m;
    }

    @NotNull
    /* JADX INFO: renamed from: getConfiguredPart, reason: from getter */
    public final String getF13857o() {
        return this.f13857o;
    }

    @NotNull
    /* JADX INFO: renamed from: getContext, reason: from getter */
    public final Context getF13845c() {
        return this.f13845c;
    }

    public final boolean getDataExtraction() {
        return this.f13848f.get();
    }

    @Nullable
    /* JADX INFO: renamed from: getDataManager, reason: from getter */
    public final DataManager getF13856n() {
        return this.f13856n;
    }

    @NotNull
    /* JADX INFO: renamed from: getExtractionArea, reason: from getter */
    public final Rect getF13861s() {
        return this.f13861s;
    }

    @Nullable
    public final C40754y1 getFramePerformance() {
        FrameRateObserver frameRateObserver = this.f13853k;
        if (frameRateObserver != null) {
            return frameRateObserver.getFramePerformance();
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: getFrameRateCheck, reason: from getter */
    public FrameRateCheck getF13858p() {
        return this.f13858p;
    }

    @Nullable
    /* JADX INFO: renamed from: getFrameRateObserver, reason: from getter */
    public final FrameRateObserver getF13853k() {
        return this.f13853k;
    }

    @NotNull
    /* JADX INFO: renamed from: getScopeProvider, reason: from getter */
    public final ScopeProviderInterface getF13852j() {
        return this.f13852j;
    }

    /* JADX INFO: renamed from: getShouldInitAsync, reason: from getter */
    public final boolean getF13854l() {
        return this.f13854l;
    }

    /* JADX INFO: renamed from: isConfigured, reason: from getter */
    public final boolean getF13859q() {
        return this.f13859q;
    }

    /* JADX INFO: renamed from: isSubExtraction, reason: from getter */
    public final boolean getF13862t() {
        return this.f13862t;
    }

    @Override // com.jumio.core.model.PublisherWithUpdate
    public void publishResult(@Nullable StaticModel data) {
        super.publishResult(this.f13851i.mergeResult(data));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    @Override // com.jumio.core.model.PublisherWithUpdate
    public void publishUpdate(@NotNull ExtractionUpdateInterface<?> update) {
        Intrinsics.checkNotNullParameter(update, "update");
        Integer f13842a = update.getF13842a();
        ExtractionUpdateState.Companion companion = ExtractionUpdateState.INSTANCE;
        int holdStill = companion.getHoldStill();
        if (f13842a != null && f13842a.intValue() == holdStill) {
            this.f13851i.setActive(true);
        } else {
            int tooClose = companion.getTooClose();
            if (f13842a != null && f13842a.intValue() == tooClose) {
                this.f13851i.setActive(false);
            } else {
                int moveCloser = companion.getMoveCloser();
                if (f13842a != null && f13842a.intValue() == moveCloser) {
                    this.f13851i.setActive(false);
                } else {
                    int centerId = companion.getCenterId();
                    if (f13842a != null && f13842a.intValue() == centerId) {
                        this.f13851i.setActive(false);
                    }
                }
            }
        }
        super.publishUpdate(update);
    }

    public final void reinit() {
        if (!this.f13859q || this.f13861s.isEmpty() || this.f13860r.isEmpty()) {
            return;
        }
        InterfaceC41775x1 interfaceC41775x1 = this.f13850h;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f13850h = C41696j.m91104d(this.f13852j.getMainScope(), null, null, new C40679j1(this, null), 3, null);
        if (!getDataExtraction() && !this.f13854l) {
            init();
        } else if (!getDataExtraction()) {
            C41696j.m91104d(this.f13852j.getBackgroundScope(), null, null, new C40684k1(this, null), 3, null);
        }
        this.f13847e.set(false);
        this.f13851i.reinit();
    }

    public final void removeSubExtraction(@NotNull ExtractionClient extractionClient) {
        Intrinsics.checkNotNullParameter(extractionClient, "extractionClient");
        this.f13851i.remove(extractionClient);
    }

    public final boolean requestHighResolutionImage() {
        UploadSettingsModel uploadSettingsModel;
        DataManager dataManager = this.f13856n;
        if (((dataManager == null || (uploadSettingsModel = (UploadSettingsModel) dataManager.get(UploadSettingsModel.class)) == null) ? null : uploadSettingsModel.getF14381b()) != UploadResolution.UHD) {
            return false;
        }
        publishUpdate(ExtractionUpdateInterface.Companion.build$default(ExtractionUpdateInterface.INSTANCE, ExtractionUpdateState.INSTANCE.getCaptureHighResolutionImage(), null, null, 4, null));
        return true;
    }

    public final void setCameraSettings(@NotNull CameraSettings value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f13860r = value.copy();
        this.f13851i.setCameraSettings(value);
    }

    public final void setCenterCropExtractionArea(boolean z11) {
        this.f13855m = z11;
    }

    public final void setConfigured(boolean z11) {
        this.f13859q = z11;
    }

    public final void setConfiguredPart(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f13857o = str;
    }

    public final void setContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.f13845c = context;
    }

    public final void setDataExtraction(boolean z11) {
        this.f13848f.set(z11);
        this.f13851i.setDataExtraction(z11);
        if (z11) {
            FrameRateObserver frameRateObserver = this.f13853k;
            if (frameRateObserver != null) {
                frameRateObserver.start();
                return;
            }
            return;
        }
        FrameRateObserver frameRateObserver2 = this.f13853k;
        if (frameRateObserver2 != null) {
            frameRateObserver2.stop();
        }
    }

    public final void setDataManager(@Nullable DataManager dataManager) {
        this.f13856n = dataManager;
    }

    public final void setExtractionArea(@NotNull Rect value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Rect rectCenterCropRect = this.f13855m ? CameraUtilsKt.centerCropRect(value) : new Rect(value);
        this.f13861s = rectCenterCropRect;
        this.f13851i.setExtractionArea(rectCenterCropRect);
    }

    public void setFrameRateCheck(@Nullable FrameRateCheck frameRateCheck) {
        this.f13858p = frameRateCheck;
    }

    public final void setResult(boolean finished) {
        this.f13847e.set(finished);
        if (finished) {
            FrameRateObserver frameRateObserver = this.f13853k;
            if (frameRateObserver != null) {
                Log.m14463d("ExtractionClient", "Stopping frame rate observation");
                frameRateObserver.stop();
            }
            this.f13853k = null;
        }
    }

    public final void setScopeProvider(@NotNull ScopeProviderInterface scopeProviderInterface) {
        Intrinsics.checkNotNullParameter(scopeProviderInterface, "<set-?>");
        this.f13852j = scopeProviderInterface;
    }

    public final void setShouldInitAsync(boolean z11) {
        this.f13854l = z11;
    }

    public final void setSubExtraction(boolean z11) {
        this.f13862t = z11;
    }

    public final void startFrameRateObservation(long samplingTimeInNs, @NotNull FrameRateCallback frameRateCallback) {
        Intrinsics.checkNotNullParameter(frameRateCallback, "frameRateCallback");
        FrameRateObserver frameRateObserver = this.f13853k;
        if (frameRateObserver != null) {
            Log.m14463d("ExtractionClient", "Stopping frame rate observation");
            frameRateObserver.stop();
        }
        this.f13853k = null;
        Log.m14463d("ExtractionClient", "Starting frame rate observation");
        FrameRateObserver frameRateObserver2 = new FrameRateObserver(samplingTimeInNs, frameRateCallback, FrameRateObserver.THREAD.WORKER);
        frameRateObserver2.start();
        this.f13853k = frameRateObserver2;
    }

    @NotNull
    public final InterfaceC41775x1 triggerFallback(@NotNull JumioFallbackReason fallbackReason) {
        Intrinsics.checkNotNullParameter(fallbackReason, "fallbackReason");
        return this.f13852j.postOnMain(new C9302a(this, fallbackReason, null));
    }

    @CallSuper
    public void destroy() {
        cancel();
        InterfaceC41775x1 interfaceC41775x1 = this.f13850h;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f13850h = null;
        this.f13852j.cancelAll();
        this.f13851i.destroy();
    }

    @Override // com.jumio.core.performance.FrameRateCallback
    public void onFramesSampled(int frames) {
        if (getF13858p() == null) {
            setFrameRateCheck(new FrameRateCheck((int) (FrameRateUtils.INSTANCE.getFrameRate(this.f13845c) * 0.8f), 1));
        }
        FrameRateCheck f13858p = getF13858p();
        if (f13858p != null && !f13858p.checkFrameRate(frames)) {
            triggerFallback(JumioFallbackReason.LOW_PERFORMANCE);
            FrameRateObserver frameRateObserver = this.f13853k;
            if (frameRateObserver != null) {
                Log.m14463d("ExtractionClient", "Stopping frame rate observation");
                frameRateObserver.stop();
            }
            this.f13853k = null;
        }
    }

    @CallSuper
    public void init() {
    }

    public void takePicture() {
    }
}
