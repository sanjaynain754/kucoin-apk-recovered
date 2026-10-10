package jumio.core;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.jumio.commons.camera.C9300a;
import com.jumio.commons.camera.ImageData;
import com.jumio.commons.camera.ImageDataInterface;
import com.jumio.core.camera.CameraConnectionData;
import com.jumio.core.camera.CameraDataModel;
import com.jumio.core.camera.CameraStatistics;
import com.jumio.core.constants.ConstantsKt;
import com.jumio.core.data.scan.FileData;
import com.jumio.core.data.scan.FileDataInterface;
import com.jumio.core.enums.UploadResolution;
import com.jumio.core.extraction.liveness.extraction.LivenessDataModel;
import com.jumio.core.models.DocumentScanPartModel;
import com.jumio.core.models.FaceScanPartModel;
import com.jumio.core.models.ScanPartModel;
import com.jumio.core.util.JsonUtilKt;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import jumio.core.AbstractC40586R0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.R0 */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC40586R0 {
    /* JADX INFO: renamed from: a */
    public static final void m89232a(LivenessDataModel livenessDataModel, String str, boolean z11, Function2 function2) {
        ImageData[] f14113b = livenessDataModel.getF14113b();
        if (f14113b != null) {
            int length = f14113b.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                ImageData imageData = f14113b[i11];
                int i13 = i12 + 1;
                JSONObject jSONObjectPut = new JSONObject().put("multipartName", imageData.getFileName()).put("fileType", imageData.getFileType()).put("uploadType", str + '_' + i13).put("usabilityExpected", z11);
                ImageData.CameraPosition cameraPosition = imageData.getCameraPosition();
                if (cameraPosition != null) {
                    Intrinsics.checkNotNull(jSONObjectPut);
                    jSONObjectPut.put("captureMode", cameraPosition == ImageData.CameraPosition.FRONT ? ConstantsKt.FACE_CAPTURE_MODE_FRONT : ConstantsKt.FACE_CAPTURE_MODE_BACK);
                }
                JSONObject uploadMetadata = imageData.getUploadMetadata();
                if (uploadMetadata != null) {
                    uploadMetadata.put("order", i12);
                    jSONObjectPut.put("fileMetaData", uploadMetadata);
                }
                CameraDataModel cameraDataModel = imageData.getCameraDataModel();
                if (cameraDataModel != null) {
                    Intrinsics.checkNotNull(jSONObjectPut);
                    jSONObjectPut.put("cls", m89230a(cameraDataModel.getF13721a()));
                    jSONObjectPut.put("clsm", m89230a(cameraDataModel.getF13722b()));
                }
                CameraConnectionData cameraConnectionData = imageData.getCameraConnectionData();
                if (cameraConnectionData != null) {
                    Intrinsics.checkNotNull(jSONObjectPut);
                    m89231a(cameraConnectionData, jSONObjectPut);
                }
                Intrinsics.checkNotNull(jSONObjectPut);
                function2.invoke(jSONObjectPut, imageData);
                i11++;
                i12 = i13;
            }
        }
        FileData f14114c = livenessDataModel.getF14114c();
        if (f14114c != null) {
            JSONObject jSONObjectPut2 = new JSONObject().put("multipartName", f14114c.getFileName()).put("fileType", f14114c.getFileType()).put("uploadType", str + "_BLOB").put("usabilityExpected", false);
            Intrinsics.checkNotNull(jSONObjectPut2);
            function2.invoke(jSONObjectPut2, f14114c);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final JSONObject m89235b() {
        return new JSONObject();
    }

    /* JADX INFO: renamed from: a */
    public static final void m89233a(ScanPartModel scanPartModel, String str, UploadResolution uploadResolution, Function2 function2) {
        String str2;
        FileDataInterface f14314c = scanPartModel.getF14314c();
        C9300a c9300a = f14314c instanceof C9300a ? (C9300a) f14314c : null;
        if (c9300a != null) {
            c9300a.m14448b(uploadResolution);
        }
        if (scanPartModel.getF14314c().getHasData()) {
            JSONObject jSONObjectPut = new JSONObject().put("multipartName", scanPartModel.getF14314c().getFileName()).put("fileType", scanPartModel.getF14314c().getFileType()).put("uploadType", str);
            if (scanPartModel instanceof DocumentScanPartModel) {
                DocumentScanPartModel documentScanPartModel = (DocumentScanPartModel) scanPartModel;
                jSONObjectPut.put("country", documentScanPartModel.f14240l);
                jSONObjectPut.put("docType", documentScanPartModel.f14241m.getF13795a());
            } else if (scanPartModel instanceof FaceScanPartModel) {
                jSONObjectPut.put("usabilityExpected", scanPartModel.getF14315d());
            } else {
                Unit unit = Unit.INSTANCE;
            }
            FileDataInterface f14314c2 = scanPartModel.getF14314c();
            ImageDataInterface imageDataInterface = f14314c2 instanceof ImageDataInterface ? (ImageDataInterface) f14314c2 : null;
            if (imageDataInterface != null) {
                ImageData.CameraPosition cameraPosition = imageDataInterface.getCameraPosition();
                if (cameraPosition != null) {
                    Intrinsics.checkNotNull(jSONObjectPut);
                    if (cameraPosition == ImageData.CameraPosition.FRONT) {
                        str2 = ConstantsKt.FACE_CAPTURE_MODE_FRONT;
                    } else {
                        str2 = ConstantsKt.FACE_CAPTURE_MODE_BACK;
                    }
                    jSONObjectPut.put("captureMode", str2);
                }
                CameraDataModel cameraDataModel = imageDataInterface.getCameraDataModel();
                if (cameraDataModel != null) {
                    Intrinsics.checkNotNull(jSONObjectPut);
                    jSONObjectPut.put("cls", m89230a(cameraDataModel.getF13721a()));
                    jSONObjectPut.put("clsm", m89230a(cameraDataModel.getF13722b()));
                }
                CameraConnectionData cameraConnectionData = imageDataInterface.getCameraConnectionData();
                if (cameraConnectionData != null) {
                    Intrinsics.checkNotNull(jSONObjectPut);
                    m89231a(cameraConnectionData, jSONObjectPut);
                }
            }
            C40535G3 f14321j = scanPartModel.getF14321j();
            if (f14321j != null) {
                Intrinsics.checkNotNull(jSONObjectPut);
                m89234a(f14321j, jSONObjectPut);
            }
            Intrinsics.checkNotNull(jSONObjectPut);
            function2.invoke(jSONObjectPut, scanPartModel.getF14314c());
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m89231a(CameraConnectionData cameraConnectionData, JSONObject jSONObject) {
        if (Intrinsics.areEqual(jSONObject.optString("resolution"), UploadResolution.DEBUG.toString())) {
            return;
        }
        ((JSONObject) JsonUtilKt.getOrPut(jSONObject, "riskSignals", new Function0() { // from class: lg0.x
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC40586R0.m89229a();
            }
        })).put("cameraStackTrace", new JSONArray(cameraConnectionData.getData()));
    }

    /* JADX INFO: renamed from: a */
    public static final JSONObject m89229a() {
        return new JSONObject();
    }

    /* JADX INFO: renamed from: a */
    public static final void m89234a(C40535G3 c40535g3, JSONObject jSONObject) {
        if (Intrinsics.areEqual(jSONObject.optString("resolution"), UploadResolution.DEBUG.toString())) {
            return;
        }
        JSONObject jSONObject2 = (JSONObject) JsonUtilKt.getOrPut(jSONObject, "riskSignals", new Function0() { // from class: lg0.y
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC40586R0.m89235b();
            }
        });
        JSONObject jSONObject3 = new JSONObject();
        long j11 = c40535g3.f89980a;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        jSONObject3.put("startTime", simpleDateFormat.format(new Date(j11)));
        jSONObject3.put("credentialId", c40535g3.f89981b);
        jSONObject3.put("samplingIntervalMs", String.valueOf(c40535g3.f89982c));
        for (InterfaceC40550J3 interfaceC40550J3 : c40535g3.f89983d) {
            String uploadName = interfaceC40550J3.getType().getUploadName();
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String lowerCase = uploadName.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            jSONObject3.put(lowerCase, interfaceC40550J3.mo89190a());
        }
        jSONObject2.put("sensorData", jSONObject3);
    }

    /* JADX INFO: renamed from: a */
    public static final JSONObject m89230a(CameraStatistics cameraStatistics) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", cameraStatistics.getTimestamp());
        String label = cameraStatistics.getLabel();
        if (label != null) {
            jSONObject.put(CmcdData.Factory.STREAM_TYPE_LIVE, label);
        }
        jSONObject.put("y", cameraStatistics.getSequence());
        if (cameraStatistics.getSequence()) {
            jSONObject.put("t", cameraStatistics.getStart_time());
            jSONObject.put("p", cameraStatistics.getCount());
            jSONObject.put("q", cameraStatistics.getDuration());
        }
        return jSONObject;
    }
}
