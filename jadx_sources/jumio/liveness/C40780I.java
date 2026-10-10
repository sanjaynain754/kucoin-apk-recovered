package jumio.liveness;

import android.graphics.RectF;
import com.jumio.commons.camera.CameraSettings;
import com.jumio.commons.camera.CameraUtilsKt;
import com.jumio.commons.camera.ImageData;
import com.jumio.core.Controller;
import com.jumio.core.api.calls.AuthenticationCall;
import com.jumio.core.api.calls.UploadCall;
import com.jumio.core.api.calls.UsabilityCall;
import com.jumio.core.camera.CameraDataInterface;
import com.jumio.core.camera.CameraDataSettingsModel;
import com.jumio.core.cdn.CDNFeatureModel;
import com.jumio.core.data.ScanMode;
import com.jumio.core.data.scan.FileDataInterface;
import com.jumio.core.enums.ErrorCase;
import com.jumio.core.error.Error;
import com.jumio.core.extraction.ExtractionClient;
import com.jumio.core.extraction.ExtractionUpdateInterface;
import com.jumio.core.extraction.ExtractionUpdateState;
import com.jumio.core.extraction.liveness.extraction.LivenessDataModel;
import com.jumio.core.extraction.liveness.extraction.LivenessUpdateState;
import com.jumio.core.extraction.result.ExtractionResult;
import com.jumio.core.model.StaticModel;
import com.jumio.core.models.ApiCallDataModel;
import com.jumio.core.models.AuthenticationModel;
import com.jumio.core.models.AuthenticationScanPartModel;
import com.jumio.core.models.LivenessScanPartModel;
import com.jumio.core.models.automation.AutomationModel;
import com.jumio.core.scanpart.FaceScanPart;
import com.jumio.core.scanpart.ScanPart;
import com.jumio.liveness.DaClient2;
import com.jumio.liveness.DelegateCameraData;
import com.jumio.liveness.LivenessPlugin;
import com.jumio.liveness.image.LivenessImageData;
import com.jumio.sdk.credentials.JumioFaceCredential;
import com.jumio.sdk.enums.JumioCameraFacing;
import com.jumio.sdk.enums.JumioFallbackReason;
import com.jumio.sdk.enums.JumioScanStep;
import com.jumio.sdk.enums.JumioScanUpdate;
import com.jumio.sdk.error.JumioError;
import com.jumio.sdk.interfaces.JumioScanPartInterface;
import java.util.List;
import jumio.core.C40711p3;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41783z1;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.liveness.I */
/* JADX INFO: loaded from: classes61.dex */
public final class C40780I extends FaceScanPart {

    /* JADX INFO: renamed from: B */
    public static final /* synthetic */ int f90590B = 0;

    /* JADX INFO: renamed from: A */
    public final JumioCameraFacing f90591A;

    /* JADX INFO: renamed from: y */
    public InterfaceC41775x1 f90592y;

    /* JADX INFO: renamed from: z */
    public final JumioCameraFacing[] f90593z;

    /* JADX INFO: renamed from: a */
    public static final Object m89280a(C40780I c40780i, CDNFeatureModel cDNFeatureModel, Function1 function1, C40776E c40776e) {
        c40780i.getClass();
        Boolean boolLoadSync$default = CDNFeatureModel.loadSync$default(cDNFeatureModel, LivenessPlugin.LIVENESS_ASSETS, 0, 2, null);
        if (!C41783z1.m91411q(c40776e.getContext())) {
            return Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(boolLoadSync$default, Boxing.boxBoolean(true))) {
            Object objInvoke = function1.invoke(c40776e);
            return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : Unit.INSTANCE;
        }
        if (!((LivenessScanPartModel) c40780i.getScanPartModel()).getF14263o()) {
            Controller.onError$default(c40780i.getF14541a(), new Error(ErrorCase.GENERAL_NETWORK_ERROR, 0, 0), null, 2, null);
            return Unit.INSTANCE;
        }
        ((LivenessScanPartModel) c40780i.getScanPartModel()).setMode(ScanMode.FACE_MANUAL);
        ((LivenessScanPartModel) c40780i.getScanPartModel()).setLivenessEnabled(false);
        c40780i.initExtractionAndOverlay();
        Object objInvoke2 = function1.invoke(c40776e);
        return objInvoke2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke2 : Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40780I(Controller controller, JumioFaceCredential credential, LivenessScanPartModel scanPartModel, JumioScanPartInterface scanPartInterface) {
        super(controller, credential, scanPartModel, scanPartInterface);
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(credential, "credential");
        Intrinsics.checkNotNullParameter(scanPartModel, "scanPartModel");
        Intrinsics.checkNotNullParameter(scanPartInterface, "scanPartInterface");
        JumioCameraFacing jumioCameraFacing = JumioCameraFacing.FRONT;
        this.f90593z = new JumioCameraFacing[]{jumioCameraFacing};
        this.f90591A = jumioCameraFacing;
    }

    @Override // com.jumio.core.scanpart.FaceScanPart, com.jumio.core.scanpart.JVisionScanPart, com.jumio.core.scanpart.ScanPart
    public final void cancel() {
        InterfaceC41775x1 interfaceC41775x1 = this.f90592y;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f90592y = null;
        super.cancel();
    }

    @Override // com.jumio.core.scanpart.ScanPart
    public final boolean consumeError(JumioError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (!Intrinsics.areEqual(error.getF14707c(), "A000000")) {
            return false;
        }
        InterfaceC41775x1 interfaceC41775x1 = this.f90592y;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f90592y = C41696j.m91104d(getF14541a().getF13607h().getBackgroundScope(), null, null, new C40776E(this, new C40775D(this, null), null), 3, null);
        return true;
    }

    @Override // com.jumio.core.scanpart.ScanPart
    public final void fallback(JumioFallbackReason fallbackReason) {
        Intrinsics.checkNotNullParameter(fallbackReason, "fallbackReason");
        if ((getHasFallback() || fallbackReason == JumioFallbackReason.LOW_PERFORMANCE || fallbackReason == JumioFallbackReason.SCANNING_ERROR) && getScanView() != null) {
            super.fallback(fallbackReason);
            boolean z11 = fallbackReason != JumioFallbackReason.LOW_PERFORMANCE;
            ((LivenessScanPartModel) getScanPartModel()).setMode(ScanMode.FACE_MANUAL);
            ((LivenessScanPartModel) getScanPartModel()).setLivenessEnabled(z11);
            initExtractionAndOverlay();
            sendUpdate(JumioScanUpdate.FALLBACK, fallbackReason);
        }
    }

    @Override // com.jumio.core.scanpart.FaceScanPart, com.jumio.core.scanpart.JVisionScanPart, jumio.core.InterfaceC40643c0
    /* JADX INFO: renamed from: getDefaultFacing */
    public final JumioCameraFacing getF14540s() {
        return this.f90591A;
    }

    @Override // com.jumio.core.scanpart.FaceScanPart, com.jumio.core.scanpart.JVisionScanPart, jumio.core.InterfaceC40643c0
    /* JADX INFO: renamed from: getSupportedFacing */
    public final JumioCameraFacing[] getF14539r() {
        return this.f90593z;
    }

    @Override // com.jumio.core.scanpart.FaceScanPart, com.jumio.core.scanpart.JVisionScanPart, com.jumio.core.model.SubscriberWithUpdate, com.jumio.core.model.Subscriber
    public void onResult(@Nullable StaticModel staticModel) {
        if (((LivenessScanPartModel) getScanPartModel()).getF14313b() == ScanMode.FACE_MANUAL) {
            super.onResult(staticModel);
            return;
        }
        LivenessDataModel livenessDataModel = staticModel instanceof LivenessDataModel ? (LivenessDataModel) staticModel : null;
        if (livenessDataModel == null) {
            return;
        }
        ImageData[] f14113b = livenessDataModel.getF14113b();
        if (f14113b != null) {
            for (ImageData imageData : f14113b) {
                if ((imageData instanceof LivenessImageData) && ((LivenessImageData) imageData).getF14669a()) {
                    FileDataInterface f14314c = ((LivenessScanPartModel) getScanPartModel()).getF14314c();
                    ImageData imageData2 = f14314c instanceof ImageData ? (ImageData) f14314c : null;
                    if (imageData2 != null) {
                        imageData2.setData(imageData.getData());
                        imageData2.setMimeType(imageData.getMimeType());
                        imageData2.setFileType(imageData.getFileType());
                        imageData2.getSize().setWidth(imageData.getSize().getWidth());
                        imageData2.getSize().setHeight(imageData.getSize().getHeight());
                    }
                }
                addCameraData(imageData);
            }
        }
        ((LivenessScanPartModel) getScanPartModel()).setLivenessData(livenessDataModel);
        uploadExtractionResult(new ExtractionResult(((LivenessScanPartModel) getScanPartModel()).getF14312a().name(), null, null, 6, null));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.jumio.core.scanpart.JVisionScanPart, com.jumio.core.model.SubscriberWithUpdate
    public void onUpdate(@NotNull ExtractionUpdateInterface<?> update) {
        Intrinsics.checkNotNullParameter(update, "update");
        Integer f13842a = update.getF13842a();
        ExtractionUpdateState.Companion companion = ExtractionUpdateState.INSTANCE;
        int shotTaken = companion.getShotTaken();
        if (f13842a != null && f13842a.intValue() == shotTaken) {
            handleShotTaken((ExtractionResult) update.getData(), update.getF13844c(), true);
        } else {
            int fallbackRequired = companion.getFallbackRequired();
            if (f13842a != null && f13842a.intValue() == fallbackRequired) {
                handleFallback(update);
            } else {
                int holdStill = companion.getHoldStill();
                if (f13842a != null && f13842a.intValue() == holdStill) {
                    JumioScanUpdate jumioScanUpdate = JumioScanUpdate.HOLD_STILL;
                    Object data = update.getData();
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.Long");
                    sendUpdateFiltered(jumioScanUpdate, (Long) data);
                } else {
                    LivenessUpdateState livenessUpdateState = LivenessUpdateState.INSTANCE;
                    int moveFaceIntoFrame = livenessUpdateState.getMoveFaceIntoFrame();
                    if (f13842a != null && f13842a.intValue() == moveFaceIntoFrame) {
                        ScanPart.sendUpdateFiltered$default(this, JumioScanUpdate.MOVE_FACE_INTO_FRAME, null, 2, null);
                    } else {
                        int centerFace = livenessUpdateState.getCenterFace();
                        if (f13842a != null && f13842a.intValue() == centerFace) {
                            ScanPart.sendUpdateFiltered$default(this, JumioScanUpdate.CENTER_FACE, null, 2, null);
                        } else {
                            int faceTiltUp = livenessUpdateState.getFaceTiltUp();
                            if (f13842a != null && f13842a.intValue() == faceTiltUp) {
                                ScanPart.sendUpdateFiltered$default(this, JumioScanUpdate.TILT_FACE_UP, null, 2, null);
                            } else {
                                int faceTiltDown = livenessUpdateState.getFaceTiltDown();
                                if (f13842a != null && f13842a.intValue() == faceTiltDown) {
                                    ScanPart.sendUpdateFiltered$default(this, JumioScanUpdate.TILT_FACE_DOWN, null, 2, null);
                                } else {
                                    int faceTiltLeft = livenessUpdateState.getFaceTiltLeft();
                                    if (f13842a != null && f13842a.intValue() == faceTiltLeft) {
                                        ScanPart.sendUpdateFiltered$default(this, JumioScanUpdate.TILT_FACE_LEFT, null, 2, null);
                                    } else {
                                        int faceTiltRight = livenessUpdateState.getFaceTiltRight();
                                        if (f13842a != null && f13842a.intValue() == faceTiltRight) {
                                            ScanPart.sendUpdateFiltered$default(this, JumioScanUpdate.TILT_FACE_RIGHT, null, 2, null);
                                        } else {
                                            int levelEyesAndDevice = livenessUpdateState.getLevelEyesAndDevice();
                                            if (f13842a != null && f13842a.intValue() == levelEyesAndDevice) {
                                                ScanPart.sendUpdateFiltered$default(this, JumioScanUpdate.LEVEL_EYES_AND_DEVICE, null, 2, null);
                                            } else {
                                                int faceTooClose = livenessUpdateState.getFaceTooClose();
                                                if (f13842a != null && f13842a.intValue() == faceTooClose) {
                                                    ScanPart.sendUpdateFiltered$default(this, JumioScanUpdate.FACE_TOO_CLOSE, null, 2, null);
                                                } else {
                                                    int moveFaceCloser = livenessUpdateState.getMoveFaceCloser();
                                                    if (f13842a != null && f13842a.intValue() == moveFaceCloser) {
                                                        ScanPart.sendUpdateFiltered$default(this, JumioScanUpdate.MOVE_FACE_CLOSER, null, 2, null);
                                                    } else {
                                                        int nextPosition = livenessUpdateState.getNextPosition();
                                                        if (f13842a != null && f13842a.intValue() == nextPosition) {
                                                            ScanPart.sendUpdate$default(this, JumioScanUpdate.NEXT_POSITION, null, 2, null);
                                                        } else {
                                                            int livenessFinished = livenessUpdateState.getLivenessFinished();
                                                            if (f13842a != null && f13842a.intValue() == livenessFinished) {
                                                                nextPartOrProcess(false);
                                                            } else {
                                                                int faceRoiRect = livenessUpdateState.getFaceRoiRect();
                                                                if (f13842a != null && f13842a.intValue() == faceRoiRect) {
                                                                    ExtractionClient f14533l = getF14533l();
                                                                    CameraSettings f13860r = f14533l != null ? f14533l.getF13860r() : null;
                                                                    Object data2 = update.getData();
                                                                    RectF rectF = data2 instanceof RectF ? (RectF) data2 : null;
                                                                    if (f13860r != null && rectF != null) {
                                                                        rectF.set(CameraUtilsKt.previewToSurface(f13860r, rectF));
                                                                    }
                                                                } else {
                                                                    int attachClient = livenessUpdateState.getAttachClient();
                                                                    if (f13842a != null && f13842a.intValue() == attachClient) {
                                                                        Object data3 = update.getData();
                                                                        Pair pair = data3 instanceof Pair ? (Pair) data3 : null;
                                                                        if (pair != null && !(getF14538q() instanceof DelegateCameraData)) {
                                                                            CameraDataInterface f14538q = getF14538q();
                                                                            if (f14538q != null) {
                                                                                f14538q.stop();
                                                                                f14538q.destroy();
                                                                            }
                                                                            DelegateCameraData delegateCameraData = new DelegateCameraData((DaClient2) pair.getFirst(), (C40787d) pair.getSecond());
                                                                            Controller f14541a = getF14541a();
                                                                            delegateCameraData.init(f14541a.getF13601b(), (CameraDataSettingsModel) f14541a.getF13603d().get(CameraDataSettingsModel.class), f14541a.getF13607h());
                                                                            delegateCameraData.start();
                                                                            setCameraData(delegateCameraData);
                                                                        }
                                                                    } else {
                                                                        super.onUpdate(update);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        getF14541a().getF13607h().postOnMain(new C40777F(this, update, null));
    }

    @Override // com.jumio.core.scanpart.FaceScanPart, com.jumio.core.scanpart.JVisionScanPart, com.jumio.core.network.ApiBinding
    public final Class[] getBindingClasses() {
        return (Class[]) ArraysKt.plus((Object[]) super.getBindingClasses(), (Object[]) new Class[]{AuthenticationCall.class});
    }

    @Override // com.jumio.core.scanpart.JVisionScanPart, jumio.core.InterfaceC40643c0
    public final boolean getEnableExtraction() {
        ExtractionClient f14533l = getF14533l();
        if (f14533l != null) {
            return f14533l.getDataExtraction();
        }
        return false;
    }

    @Override // com.jumio.core.scanpart.JVisionScanPart, com.jumio.core.scanpart.ScanPart
    public final boolean getHasFallback() {
        if (((LivenessScanPartModel) getScanPartModel()).getF14313b() != ScanMode.FACE_MANUAL && ((LivenessScanPartModel) getScanPartModel()).getF14263o()) {
            return true;
        }
        return false;
    }

    @Override // com.jumio.core.scanpart.JVisionScanPart, jumio.core.InterfaceC40643c0
    public final void setEnableExtraction(boolean z11) {
        ExtractionClient f14533l = getF14533l();
        if (f14533l != null) {
            f14533l.setDataExtraction(z11);
        }
        isPresented(z11);
    }

    @Override // com.jumio.core.scanpart.FaceScanPart, com.jumio.core.scanpart.JVisionScanPart, com.jumio.core.scanpart.ScanPart
    public final void start() {
        if (((LivenessScanPartModel) getScanPartModel()).getF14264p() && ((LivenessScanPartModel) getScanPartModel()).getF14313b() == ScanMode.FACE_MANUAL) {
            ((LivenessScanPartModel) getScanPartModel()).setMode(ScanMode.JUMIO_LIVENESS);
            initExtractionAndOverlay();
        }
        ScanPart.sendScanStep$default(this, JumioScanStep.PREPARE, null, null, 6, null);
        InterfaceC41775x1 interfaceC41775x1 = this.f90592y;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f90592y = C41696j.m91104d(getF14541a().getF13607h().getBackgroundScope(), null, null, new C40776E(this, new C40779H(this, null), null), 3, null);
    }

    @Override // com.jumio.core.scanpart.FaceScanPart, com.jumio.core.scanpart.JVisionScanPart, com.jumio.core.network.ApiBinding, jumio.core.InterfaceC40662g
    public void onResult(@NotNull ApiCallDataModel<?> apiCallDataModel, @Nullable Object obj) {
        LivenessDataModel f14243l;
        Intrinsics.checkNotNullParameter(apiCallDataModel, "apiCallDataModel");
        Class<?> call = apiCallDataModel.getCall();
        if (Intrinsics.areEqual(call, UploadCall.class)) {
            List<C40711p3> usabilityResultKeys = getUsabilityResultKeys(apiCallDataModel, obj instanceof JSONObject ? (JSONObject) obj : null);
            if ((getScanPartModel() instanceof AuthenticationScanPartModel) && ((usabilityResultKeys.isEmpty() || !getSettingsModel().isInstantFeedbackEnabled()) && (f14243l = ((LivenessScanPartModel) getScanPartModel()).getF14243l()) != null)) {
                f14243l.setPassed(Boolean.FALSE);
            }
        } else if (Intrinsics.areEqual(call, UsabilityCall.class)) {
            if (getScanPartModel() instanceof AuthenticationScanPartModel) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.jumio.core.models.automation.AutomationModel");
                if (((AutomationModel) obj).getDecisionType() == AutomationModel.DecisionType.PASS) {
                    getF14541a().getF13604e().authenticate();
                } else {
                    LivenessDataModel f14243l2 = ((LivenessScanPartModel) getScanPartModel()).getF14243l();
                    if (f14243l2 != null) {
                        f14243l2.setPassed(Boolean.FALSE);
                    }
                }
            }
        } else if (Intrinsics.areEqual(call, AuthenticationCall.class)) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.jumio.core.models.AuthenticationModel");
            AuthenticationModel authenticationModel = (AuthenticationModel) obj;
            LivenessDataModel f14243l3 = ((LivenessScanPartModel) getScanPartModel()).getF14243l();
            if (f14243l3 != null) {
                f14243l3.setPassed(Boolean.valueOf(authenticationModel.getDecisionType() == AuthenticationModel.DecisionType.PASS));
            }
            if (getAllPartsComplete()) {
                processUsabilityResults();
            }
        }
        super.onResult(apiCallDataModel, obj);
    }

    @Override // com.jumio.core.scanpart.JVisionScanPart
    public final void initCameraData() {
    }
}
