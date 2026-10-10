package com.jumio.core.scanpart;

import androidx.exifinterface.media.ExifInterface;
import com.jumio.analytics.MetaInfo;
import com.jumio.commons.camera.ImageData;
import com.jumio.commons.log.Log;
import com.jumio.commons.log.LogLevel;
import com.jumio.core.C9301R;
import com.jumio.core.Controller;
import com.jumio.core.api.calls.ReusableIdLookupCall;
import com.jumio.core.api.calls.UploadCall;
import com.jumio.core.api.calls.UsabilityCall;
import com.jumio.core.data.ScanMode;
import com.jumio.core.data.UploadType;
import com.jumio.core.data.scan.DataState;
import com.jumio.core.extraction.liveness.extraction.LivenessDataModel;
import com.jumio.core.extraction.result.ExtractionResult;
import com.jumio.core.interfaces.UsabilityInterface;
import com.jumio.core.model.StaticModel;
import com.jumio.core.models.ApiCallDataModel;
import com.jumio.core.models.CredentialsModel;
import com.jumio.core.models.FaceScanPartModel;
import com.jumio.core.models.LivenessSettingsModel;
import com.jumio.core.models.ReusableIdLookupResult;
import com.jumio.core.models.ScanPartModel;
import com.jumio.core.models.SettingsModel;
import com.jumio.core.models.TimeModel;
import com.jumio.core.models.automation.AutomationModel;
import com.jumio.core.models.automation.RejectReason;
import com.jumio.core.network.ApiCall;
import com.jumio.core.scanpart.FaceScanPart;
import com.jumio.core.sensors.SensorConfig;
import com.jumio.core.sensors.SensorFactoryInterfaceKt;
import com.jumio.core.sensors.SensorProxy;
import com.jumio.core.sensors.SensorType;
import com.jumio.sdk.credentials.JumioFaceCredential;
import com.jumio.sdk.enums.JumioCameraFacing;
import com.jumio.sdk.enums.JumioCredentialPart;
import com.jumio.sdk.enums.JumioScanStep;
import com.jumio.sdk.interfaces.JumioScanPartInterface;
import com.jumio.sdk.retry.JumioRetryReason;
import com.jumio.sdk.views.JumioAnimationView;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import java.util.List;
import java.util.Map;
import jumio.core.C40635a4;
import jumio.core.C40711p3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004B'\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020)H\u0016J\b\u0010+\u001a\u00020)H\u0016J\b\u0010,\u001a\u00020)H\u0014J\b\u0010-\u001a\u00020)H\u0016J\u0010\u0010.\u001a\u00020)2\u0006\u0010/\u001a\u00020%H\u0016J\u0012\u00100\u001a\u00020)2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u0010\u00103\u001a\u00020)2\u0006\u00104\u001a\u000205H\u0017J\b\u00106\u001a\u00020\u000fH\u0016J\u001a\u00107\u001a\b\u0012\u0004\u0012\u000209082\n\u0010:\u001a\u0006\u0012\u0002\b\u00030;H\u0016J\u001e\u00100\u001a\u00020)2\n\u0010:\u001a\u0006\u0012\u0002\b\u00030;2\b\u00101\u001a\u0004\u0018\u00010<H\u0016J$\u0010=\u001a\u00020)2\b\u00101\u001a\u0004\u0018\u00010>2\b\u0010?\u001a\u0004\u0018\u00010@2\u0006\u0010A\u001a\u00020%H\u0014J\u001c\u0010B\u001a\u00020)2\n\u0010:\u001a\u0006\u0012\u0002\b\u00030;2\u0006\u0010C\u001a\u00020DH\u0014J\u001c\u0010E\u001a\u00020)2\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020D0GH\u0014J\u0006\u0010I\u001a\u00020)R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00130\u00120\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u0019X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0011X\u0096\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\u001dX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006J"}, m90084d2 = {"Lcom/jumio/core/scanpart/FaceScanPart;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/jumio/core/models/FaceScanPartModel;", "Lcom/jumio/core/scanpart/JVisionScanPart;", "Lcom/jumio/core/interfaces/UsabilityInterface;", "controller", "Lcom/jumio/core/Controller;", URLCredentialContract.FeedEntry.TABLE_NAME, "Lcom/jumio/sdk/credentials/JumioFaceCredential;", "scanPartModel", "scanPartInterface", "Lcom/jumio/sdk/interfaces/JumioScanPartInterface;", "<init>", "(Lcom/jumio/core/Controller;Lcom/jumio/sdk/credentials/JumioFaceCredential;Lcom/jumio/core/models/FaceScanPartModel;Lcom/jumio/sdk/interfaces/JumioScanPartInterface;)V", "sensorSamplingTime", "", "bindingClasses", "", "Ljava/lang/Class;", "Lcom/jumio/core/network/ApiCall;", "getBindingClasses", "()[Ljava/lang/Class;", "sensorProxy", "Lcom/jumio/core/sensors/SensorProxy;", "livenessSettingsModel", "Lcom/jumio/core/models/LivenessSettingsModel;", "getLivenessSettingsModel", "()Lcom/jumio/core/models/LivenessSettingsModel;", "supportedFacing", "Lcom/jumio/sdk/enums/JumioCameraFacing;", "getSupportedFacing", "()[Lcom/jumio/sdk/enums/JumioCameraFacing;", "[Lcom/jumio/sdk/enums/JumioCameraFacing;", "defaultFacing", "getDefaultFacing", "()Lcom/jumio/sdk/enums/JumioCameraFacing;", "shouldEnableUsability", "", "getShouldEnableUsability", "()Z", "start", "", "finish", "cancel", "reset", "restore", "persist", InterfaceC33730j9.f70350a, "onResult", DbParams.KEY_CHANNEL_RESULT, "Lcom/jumio/core/model/StaticModel;", "getHelpAnimation", "animationView", "Lcom/jumio/sdk/views/JumioAnimationView;", "getPreferredBrandTextColor", "getMultipartItemsForResultKeys", "", "Lcom/jumio/core/interfaces/UsabilityInterface$MultipartItem;", "apiCallDataModel", "Lcom/jumio/core/models/ApiCallDataModel;", "", "handleShotTaken", "Lcom/jumio/core/extraction/result/ExtractionResult;", "metaInfo", "Lcom/jumio/analytics/MetaInfo;", "vibrate", "handleUploadOrUsabilityResult", "automationModel", "Lcom/jumio/core/models/automation/AutomationModel;", "handleUsabilityReject", "rejectedModels", "", "Lcom/jumio/sdk/enums/JumioCredentialPart;", "clearReusableIdLookUp", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFaceScanPart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceScanPart.kt\ncom/jumio/core/scanpart/FaceScanPart\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 Log.kt\ncom/jumio/commons/log/Log\n*L\n1#1,247:1\n13402#2:248\n13403#2:250\n34#3:249\n*S KotlinDebug\n*F\n+ 1 FaceScanPart.kt\ncom/jumio/core/scanpart/FaceScanPart\n*L\n210#1:248\n210#1:250\n212#1:249\n*E\n"})
public class FaceScanPart<T extends FaceScanPartModel> extends JVisionScanPart<T> implements UsabilityInterface {

    /* JADX INFO: renamed from: t */
    public final int f14526t;

    /* JADX INFO: renamed from: u */
    public final SensorProxy f14527u;

    /* JADX INFO: renamed from: v */
    public final LivenessSettingsModel f14528v;

    /* JADX INFO: renamed from: w */
    public final JumioCameraFacing[] f14529w;

    /* JADX INFO: renamed from: x */
    public final JumioCameraFacing f14530x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceScanPart(@NotNull final Controller controller, @NotNull JumioFaceCredential credential, @NotNull T scanPartModel, @NotNull JumioScanPartInterface scanPartInterface) {
        super(controller, credential, CollectionsKt.listOf(scanPartModel), scanPartInterface);
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(credential, "credential");
        Intrinsics.checkNotNullParameter(scanPartModel, "scanPartModel");
        Intrinsics.checkNotNullParameter(scanPartInterface, "scanPartInterface");
        this.f14526t = ((SettingsModel) controller.getF13603d().get(SettingsModel.class)).getSensorSamplingTime();
        this.f14527u = new SensorProxy(new Function1() { // from class: u9.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FaceScanPart.m14581a(controller, this, (List) obj);
            }
        });
        this.f14528v = (LivenessSettingsModel) controller.getF13603d().get(LivenessSettingsModel.class);
        JumioCameraFacing.Companion companion = JumioCameraFacing.INSTANCE;
        this.f14529w = new JumioCameraFacing[]{companion.fromFaceCaptureMode(getSettingsModel().getFaceCaptureMode())};
        this.f14530x = companion.fromFaceCaptureMode(getSettingsModel().getFaceCaptureMode());
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m14581a(Controller controller, FaceScanPart faceScanPart, List SensorProxy) {
        Intrinsics.checkNotNullParameter(SensorProxy, "$this$SensorProxy");
        if (((SettingsModel) controller.getF13603d().get(SettingsModel.class)).getSensorDataCollectionEnabled()) {
            SensorConfig sensorConfig = new SensorConfig((TimeModel) controller.getF13603d().get(TimeModel.class), faceScanPart.f14526t, null, 4, null);
            SensorProxy.add(SensorFactoryInterfaceKt.getSensorFactory().getSensor(SensorType.GYROSCOPE, sensorConfig));
            SensorProxy.add(SensorFactoryInterfaceKt.getSensorFactory().getSensor(SensorType.ACCELEROMETER, sensorConfig));
            SensorProxy.add(SensorFactoryInterfaceKt.getSensorFactory().getSensor(SensorType.GRAVITY, sensorConfig));
        }
        return Unit.INSTANCE;
    }

    @Override // com.jumio.core.scanpart.JVisionScanPart, com.jumio.core.scanpart.ScanPart
    public void finish() {
        this.f14527u.stop();
        super.finish();
    }

    @Override // com.jumio.core.scanpart.JVisionScanPart, jumio.core.InterfaceC40643c0
    @NotNull
    /* JADX INFO: renamed from: getDefaultFacing, reason: from getter */
    public JumioCameraFacing getF14540s() {
        return this.f14530x;
    }

    @Override // com.jumio.core.scanpart.JVisionScanPart, com.jumio.core.scanpart.ScanPart
    @Deprecated(message = "Deprecated in core, moved to defaultui module")
    public void getHelpAnimation(@NotNull JumioAnimationView animationView) {
        Intrinsics.checkNotNullParameter(animationView, "animationView");
    }

    @NotNull
    /* JADX INFO: renamed from: getLivenessSettingsModel, reason: from getter */
    public final LivenessSettingsModel getF14528v() {
        return this.f14528v;
    }

    @Override // com.jumio.core.interfaces.UsabilityInterface
    @NotNull
    public List<C40635a4> getMultipartItemsForResultKeys(@NotNull ApiCallDataModel<?> apiCallDataModel) {
        Intrinsics.checkNotNullParameter(apiCallDataModel, "apiCallDataModel");
        return CollectionsKt.listOf(new C40635a4(getScanPartModel().getF14314c().getFileName(), getScanPartModel().getF14312a().name()));
    }

    @Override // com.jumio.core.scanpart.JVisionScanPart, jumio.core.InterfaceC40702o
    public int getPreferredBrandTextColor() {
        return C9301R.color.jumio_gray_12;
    }

    @Override // com.jumio.core.scanpart.JVisionScanPart, jumio.core.InterfaceC40643c0
    @NotNull
    /* JADX INFO: renamed from: getSupportedFacing, reason: from getter */
    public JumioCameraFacing[] getF14539r() {
        return this.f14529w;
    }

    @Override // com.jumio.core.scanpart.JVisionScanPart
    public void handleUploadOrUsabilityResult(@NotNull ApiCallDataModel<?> apiCallDataModel, @NotNull AutomationModel automationModel) {
        Intrinsics.checkNotNullParameter(apiCallDataModel, "apiCallDataModel");
        Intrinsics.checkNotNullParameter(automationModel, "automationModel");
        super.handleUploadOrUsabilityResult(apiCallDataModel, automationModel);
        if (getScanPartModel().getF14313b() == ScanMode.FACE_MANUAL) {
            LivenessDataModel f14243l = ((FaceScanPartModel) getScanPartModel()).getF14243l();
            DataState f14115d = f14243l != null ? f14243l.getF14115d() : null;
            DataState dataState = DataState.SKIPPED;
            if (f14115d != dataState) {
                LivenessDataModel f14243l2 = ((FaceScanPartModel) getScanPartModel()).getF14243l();
                if ((f14243l2 != null ? f14243l2.getF14115d() : null) == DataState.UPLOADED) {
                    return;
                }
                LivenessDataModel f14243l3 = ((FaceScanPartModel) getScanPartModel()).getF14243l();
                if (f14243l3 == null || automationModel.getDecisionType() == AutomationModel.DecisionType.REJECT) {
                    if (f14243l3 != null) {
                        f14243l3.setState(dataState);
                        return;
                    }
                    return;
                }
                ImageData[] f14113b = f14243l3.getF14113b();
                if (f14113b != null) {
                    for (ImageData imageData : f14113b) {
                        addCameraData(imageData);
                        Log log = Log.INSTANCE;
                        LogLevel logLevel = LogLevel.OFF;
                    }
                }
                getF14541a().getF13604e().uploadRawData(getF14542b(), MapsKt.linkedMapOf(TuplesKt.m90091to(UploadType.LIVENESS_SERIES, f14243l3)), getScanPartModel().getF14318g(), "liveness_series");
            }
        }
    }

    @Override // com.jumio.core.scanpart.JVisionScanPart
    public void handleUsabilityReject(@NotNull Map<JumioCredentialPart, AutomationModel> rejectedModels) {
        RejectReason rejectReason;
        String code;
        Integer intOrNull;
        Intrinsics.checkNotNullParameter(rejectedModels, "rejectedModels");
        setNumOfRetries(getF14535n() + 1);
        JumioScanStep jumioScanStep = JumioScanStep.RETRY;
        AutomationModel automationModel = rejectedModels.get(CollectionsKt.first(rejectedModels.keySet()));
        ScanPart.sendScanStep$default(this, jumioScanStep, new JumioRetryReason((automationModel == null || (rejectReason = automationModel.getRejectReason()) == null || (code = rejectReason.getCode()) == null || (intOrNull = StringsKt.toIntOrNull(code)) == null) ? 0 : intOrNull.intValue(), ""), null, 4, null);
    }

    @Override // com.jumio.core.scanpart.JVisionScanPart, com.jumio.core.model.SubscriberWithUpdate, com.jumio.core.model.Subscriber
    public void onResult(@Nullable StaticModel result) {
        LivenessDataModel livenessDataModel = result instanceof LivenessDataModel ? (LivenessDataModel) result : null;
        if (livenessDataModel == null) {
            return;
        }
        ((FaceScanPartModel) getScanPartModel()).setLivenessData(livenessDataModel);
        super.onResult(result);
    }

    @Override // jumio.core.AbstractC40755y2, com.jumio.core.scanpart.ScanPart
    public void reset() {
        synchronized (this.f14527u) {
            this.f14527u.reset();
            Unit unit = Unit.INSTANCE;
        }
        ScanPartModel scanPartModel = getScanPartModel();
        FaceScanPartModel faceScanPartModel = scanPartModel instanceof FaceScanPartModel ? (FaceScanPartModel) scanPartModel : null;
        if (faceScanPartModel != null) {
            faceScanPartModel.setShouldUseLookupResult(Intrinsics.areEqual(((CredentialsModel) getF14541a().getF13603d().get(CredentialsModel.class)).f14206b, "REUSABLE_IDENTITY"));
        }
        ((FaceScanPartModel) getScanPartModel()).setLivenessData(null);
        super.reset();
    }

    @Override // com.jumio.core.scanpart.JVisionScanPart, com.jumio.core.scanpart.ScanPart
    public void start() {
        this.f14527u.start(getF14541a().getF13601b());
        clearReusableIdLookUp();
        super.start();
    }

    @Override // com.jumio.core.scanpart.JVisionScanPart, com.jumio.core.scanpart.ScanPart
    public void cancel() {
        super.cancel();
        clearReusableIdLookUp();
        this.f14527u.stop();
    }

    public final void clearReusableIdLookUp() {
        ((ReusableIdLookupResult) getF14541a().getF13603d().get(ReusableIdLookupResult.class)).f14311a = null;
    }

    @Override // com.jumio.core.scanpart.JVisionScanPart, com.jumio.core.network.ApiBinding
    @NotNull
    public Class<? extends ApiCall<?>>[] getBindingClasses() {
        return (Class[]) ArraysKt.plus((Object[]) super.getBindingClasses(), (Object[]) new Class[]{ReusableIdLookupCall.class});
    }

    @Override // com.jumio.core.interfaces.UsabilityInterface
    public boolean getShouldEnableUsability() {
        if (getSettingsModel().isInstantFeedbackEnabled() && getF14535n() < this.f14528v.getRetries()) {
            return true;
        }
        return false;
    }

    @Override // com.jumio.core.scanpart.JVisionScanPart
    public void handleShotTaken(@Nullable ExtractionResult result, @Nullable MetaInfo metaInfo, boolean vibrate) {
        if (getScanPartModel().getF14313b() == ScanMode.FACE_MANUAL) {
            synchronized (this.f14527u) {
                getScanPartModel().setSensorData(this.f14527u.collectResult(getF14542b(), this.f14526t));
                this.f14527u.reset();
                Unit unit = Unit.INSTANCE;
            }
        }
        super.handleShotTaken(result, metaInfo, vibrate);
    }

    @Override // com.jumio.core.scanpart.JVisionScanPart, com.jumio.core.scanpart.ScanPart
    public void persist(boolean stop) {
        super.persist(stop);
        if (stop) {
            this.f14527u.stop();
        }
    }

    @Override // com.jumio.core.scanpart.JVisionScanPart, jumio.core.AbstractC40755y2, com.jumio.core.scanpart.ScanPart
    public void restore() {
        super.restore();
        this.f14527u.start(getF14541a().getF13601b());
    }

    @Override // com.jumio.core.scanpart.JVisionScanPart, com.jumio.core.network.ApiBinding, jumio.core.InterfaceC40662g
    public void onResult(@NotNull ApiCallDataModel<?> apiCallDataModel, @Nullable Object result) {
        LivenessDataModel f14243l;
        Intrinsics.checkNotNullParameter(apiCallDataModel, "apiCallDataModel");
        if ((Intrinsics.areEqual(apiCallDataModel.getF14175c(), "liveness_series") || getScanPartModel().getF14313b() == ScanMode.JUMIO_LIVENESS) && (f14243l = ((FaceScanPartModel) getScanPartModel()).getF14243l()) != null) {
            f14243l.setState(DataState.UPLOADED);
        }
        Class<?> call = apiCallDataModel.getCall();
        if (Intrinsics.areEqual(call, ReusableIdLookupCall.class)) {
            ReusableIdLookupResult reusableIdLookupResult = result instanceof ReusableIdLookupResult ? (ReusableIdLookupResult) result : null;
            if (reusableIdLookupResult == null) {
                reusableIdLookupResult = new ReusableIdLookupResult();
            }
            getF14541a().getF13603d().put(ReusableIdLookupResult.class, reusableIdLookupResult);
            ScanPartModel scanPartModel = getScanPartModel();
            FaceScanPartModel faceScanPartModel = scanPartModel instanceof FaceScanPartModel ? (FaceScanPartModel) scanPartModel : null;
            if (faceScanPartModel != null) {
                faceScanPartModel.setLookupResult(reusableIdLookupResult);
            }
            if (getAllPartsComplete()) {
                processUsabilityResults();
            }
            super.onResult(apiCallDataModel, result);
            return;
        }
        boolean z11 = false;
        if (Intrinsics.areEqual(call, UsabilityCall.class)) {
            ScanPartModel scanPartModel2 = getScanPartModel();
            FaceScanPartModel faceScanPartModel2 = scanPartModel2 instanceof FaceScanPartModel ? (FaceScanPartModel) scanPartModel2 : null;
            if (faceScanPartModel2 != null) {
                if (faceScanPartModel2.getF14245n()) {
                    Intrinsics.checkNotNull(result, "null cannot be cast to non-null type com.jumio.core.models.automation.AutomationModel");
                    if (((AutomationModel) result).getDecisionType() != AutomationModel.DecisionType.REJECT) {
                        z11 = true;
                    }
                }
                faceScanPartModel2.setShouldUseLookupResult(z11);
                super.onResult(apiCallDataModel, result);
                ScanPartModel scanPartModel3 = getScanPartModel();
                Intrinsics.checkNotNull(scanPartModel3, "null cannot be cast to non-null type com.jumio.core.models.FaceScanPartModel");
                if (((FaceScanPartModel) scanPartModel3).getUploadAndUsabilityComplete() && faceScanPartModel2.getF14245n()) {
                    getF14541a().getF13604e().reusableIdLookup();
                    return;
                }
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(call, UploadCall.class)) {
            ScanPartModel scanPartModel4 = getScanPartModel();
            FaceScanPartModel faceScanPartModel3 = scanPartModel4 instanceof FaceScanPartModel ? (FaceScanPartModel) scanPartModel4 : null;
            if (faceScanPartModel3 != null) {
                List<C40711p3> usabilityResultKeys = getUsabilityResultKeys(apiCallDataModel, result instanceof JSONObject ? (JSONObject) result : null);
                if (faceScanPartModel3.getF14245n() && !usabilityResultKeys.isEmpty()) {
                    z11 = true;
                }
                faceScanPartModel3.setShouldUseLookupResult(z11);
                super.onResult(apiCallDataModel, result);
                ScanPartModel scanPartModel5 = getScanPartModel();
                Intrinsics.checkNotNull(scanPartModel5, "null cannot be cast to non-null type com.jumio.core.models.FaceScanPartModel");
                if (((FaceScanPartModel) scanPartModel5).getUploadAndUsabilityComplete() && ((FaceScanPartModel) getScanPartModel()).getF14245n()) {
                    getF14541a().getF13604e().reusableIdLookup();
                    return;
                }
                return;
            }
            return;
        }
        super.onResult(apiCallDataModel, result);
    }
}
