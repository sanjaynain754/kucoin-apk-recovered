package jumio.core;

import android.content.Context;
import com.google.api.client.json.Json;
import com.jumio.analytics.MetaInfo;
import com.jumio.commons.camera.C9300a;
import com.jumio.commons.camera.ImageData;
import com.jumio.commons.camera.ImageDataInterface;
import com.jumio.commons.camera.ImageMetadata;
import com.jumio.commons.log.Log;
import com.jumio.commons.utils.FileUtil;
import com.jumio.core.camera.CameraConnectionData;
import com.jumio.core.camera.CameraDataModel;
import com.jumio.core.constants.ConstantsKt;
import com.jumio.core.data.ScanMode;
import com.jumio.core.data.UploadType;
import com.jumio.core.data.digitaldocument.DigitalDocumentPart;
import com.jumio.core.data.scan.ByteArrayData;
import com.jumio.core.data.scan.DataInterface;
import com.jumio.core.data.scan.FileDataInterface;
import com.jumio.core.data.scan.ScanResult;
import com.jumio.core.enums.UploadResolution;
import com.jumio.core.extraction.liveness.extraction.LivenessDataModel;
import com.jumio.core.interfaces.DeviceUtilInterface;
import com.jumio.core.models.DigitalIdScanPartModel;
import com.jumio.core.models.DocumentDataModel;
import com.jumio.core.models.LivenessScanPartModel;
import com.jumio.core.models.PhysicalIdScanPartModel;
import com.jumio.core.models.ScanPartModel;
import com.jumio.core.models.UploadSettingsModel;
import com.jumio.core.persistence.DataManager;
import com.jumio.core.processor.ProcessorImage;
import com.jumio.core.util.DeviceUtilKt;
import com.jumio.core.util.JsonUtilKt;
import com.kubi.kyc.KycKey;
import java.io.Serializable;
import java.util.List;
import java.util.Locale;
import jumio.core.C40582Q0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: jumio.core.Q0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40582Q0 implements InterfaceC40619X3 {

    /* JADX INFO: renamed from: a */
    public final DataManager f90082a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC40542I0 f90083b;

    /* JADX INFO: renamed from: c */
    public final JSONArray f90084c;

    /* JADX INFO: renamed from: d */
    public final JSONArray f90085d;

    /* JADX INFO: renamed from: e */
    public boolean f90086e;

    /* JADX INFO: renamed from: f */
    public final MetaInfo f90087f;

    /* JADX INFO: renamed from: g */
    public C40604U3 f90088g;

    /* JADX INFO: renamed from: a */
    public final void m89220a(String str, PhysicalIdScanPartModel physicalIdScanPartModel, FileDataInterface fileDataInterface, boolean z11) throws JSONException {
        UploadResolution uploadResolution;
        ImageData.CameraPosition cameraPosition;
        UploadResolution uploadImageResolution = ((UploadSettingsModel) this.f90082a.get(UploadSettingsModel.class)).getF14381b();
        Intrinsics.checkNotNullParameter(fileDataInterface, "<this>");
        Intrinsics.checkNotNullParameter(uploadImageResolution, "uploadImageResolution");
        boolean z12 = fileDataInterface instanceof C9300a;
        if (z12) {
            C9300a c9300a = (C9300a) fileDataInterface;
            uploadResolution = UploadResolution.UHD;
            if (!c9300a.m14447a(uploadResolution).getHasData()) {
                uploadResolution = UploadResolution.FHD;
                if (!c9300a.m14447a(uploadResolution).getHasData()) {
                    UploadResolution uploadResolution2 = UploadResolution.DEBUG;
                    if (c9300a.m14447a(uploadResolution2).getHasData()) {
                        uploadResolution = uploadResolution2;
                    }
                }
            }
        } else {
            uploadResolution = UploadResolution.FHD;
        }
        if (uploadImageResolution != uploadResolution) {
            UploadResolution uploadResolution3 = UploadResolution.DEBUG;
            if (uploadResolution == uploadResolution3) {
                uploadResolution = uploadResolution3;
            } else {
                uploadResolution = uploadResolution == UploadResolution.UHD ? UploadResolution.FHD : UploadResolution.FHD;
            }
        }
        this.f90086e = uploadResolution == UploadResolution.UHD;
        Function2 function2 = new Function2() { // from class: lg0.w
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C40582Q0.m89218b(this.f93683b, (JSONObject) obj, (FileDataInterface) obj2);
            }
        };
        String f13765a = null;
        C9300a c9300a2 = z12 ? (C9300a) fileDataInterface : null;
        if (c9300a2 != null) {
            c9300a2.m14448b(uploadResolution);
        }
        if (fileDataInterface.getHasData()) {
            JSONObject jSONObjectPut = new JSONObject().put("multipartName", fileDataInterface.getFileName()).put("fileType", fileDataInterface.getFileType()).put("uploadType", str);
            DocumentDataModel f14300r = physicalIdScanPartModel.getF14300r();
            String f14228g = f14300r != null ? f14300r.getF14228g() : null;
            if (f14228g == null || f14228g.length() == 0) {
                f14228g = null;
            }
            if (f14228g == null) {
                f14228g = physicalIdScanPartModel.getF14294l().getF14323a().getF13765a();
            }
            JSONObject jSONObjectPut2 = jSONObjectPut.put("country", f14228g).put(KycKey.idType, physicalIdScanPartModel.getF14294l().getF14302b().getF13814a().name()).put("resolution", uploadResolution.toString());
            if (z11) {
                jSONObjectPut2.put("usabilityExpected", physicalIdScanPartModel.getF14315d());
            } else {
                ProcessorImage processorImageImageForClassifier = physicalIdScanPartModel.imageForClassifier(str);
                jSONObjectPut2.put("usabilityExpected", (processorImageImageForClassifier != null ? processorImageImageForClassifier.getUsabilityExpected() : false) && physicalIdScanPartModel.getF14315d());
            }
            ImageDataInterface imageDataInterface = fileDataInterface instanceof ImageDataInterface ? (ImageDataInterface) fileDataInterface : null;
            if (imageDataInterface != null) {
                if (!Intrinsics.areEqual(str, "FRONT_WITH_FLASH") && !StringsKt.startsWith$default(str, "FRONT_CAMERA_CHALLENGE", false, 2, (Object) null) && (cameraPosition = imageDataInterface.getCameraPosition()) != null) {
                    Intrinsics.checkNotNull(jSONObjectPut2);
                    jSONObjectPut2.put("captureMode", cameraPosition == ImageData.CameraPosition.FRONT ? ConstantsKt.FACE_CAPTURE_MODE_FRONT : ConstantsKt.FACE_CAPTURE_MODE_BACK);
                }
                ImageMetadata metadata = imageDataInterface.getMetadata();
                if (metadata != null) {
                    Intrinsics.checkNotNull(jSONObjectPut2);
                    jSONObjectPut2.put("fileMetaData", metadata.asJson());
                }
                CameraDataModel cameraDataModel = imageDataInterface.getCameraDataModel();
                if (cameraDataModel != null) {
                    Intrinsics.checkNotNull(jSONObjectPut2);
                    jSONObjectPut2.put("cls", AbstractC40586R0.m89230a(cameraDataModel.getF13721a()));
                    jSONObjectPut2.put("clsm", AbstractC40586R0.m89230a(cameraDataModel.getF13722b()));
                }
                CameraConnectionData cameraConnectionData = imageDataInterface.getCameraConnectionData();
                if (cameraConnectionData != null) {
                    Intrinsics.checkNotNull(jSONObjectPut2);
                    AbstractC40586R0.m89231a(cameraConnectionData, jSONObjectPut2);
                }
            }
            C40535G3 f14321j = physicalIdScanPartModel.getF14321j();
            if (f14321j != null) {
                Intrinsics.checkNotNull(jSONObjectPut2);
                AbstractC40586R0.m89234a(f14321j, jSONObjectPut2);
            }
            Intrinsics.checkNotNull(jSONObjectPut2);
            function2.invoke(jSONObjectPut2, fileDataInterface);
        }
        if (z11) {
            JSONObject jSONObject = new JSONObject();
            DocumentDataModel f14300r2 = physicalIdScanPartModel.getF14300r();
            if (f14300r2 != null) {
                f14300r2.fillRequest(jSONObject, physicalIdScanPartModel);
            }
            jSONObject.put(KycKey.idType, physicalIdScanPartModel.getF14294l().getF14302b().getF13814a().name());
            jSONObject.put("documentVariant", physicalIdScanPartModel.getF14294l().getF14303c().getF13809a().name());
            DocumentDataModel f14300r3 = physicalIdScanPartModel.getF14300r();
            String f14228g2 = f14300r3 != null ? f14300r3.getF14228g() : null;
            if (f14228g2 != null && f14228g2.length() != 0) {
                f13765a = f14228g2;
            }
            if (f13765a == null) {
                f13765a = physicalIdScanPartModel.getF14294l().getF14323a().getF13765a();
            }
            JsonUtilKt.putIfNotNullOrBlank(jSONObject, "issuingCountry", f13765a);
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            String str2 = "data" + this.f90085d.length();
            m89224a(AbstractC40609V3.m89242a(str2, Json.MEDIA_TYPE, string.length()), string, -1);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("multipartName", str2);
            jSONObject2.put("uploadType", str);
            this.f90085d.put(jSONObject2);
        }
    }

    public C40582Q0(DataManager dataManager, InterfaceC40542I0 dataAccessEncryption) {
        Intrinsics.checkNotNullParameter(dataManager, "dataManager");
        Intrinsics.checkNotNullParameter(dataAccessEncryption, "dataAccessEncryption");
        this.f90082a = dataManager;
        this.f90083b = dataAccessEncryption;
        this.f90084c = new JSONArray();
        this.f90085d = new JSONArray();
        this.f90087f = new MetaInfo();
    }

    /* JADX INFO: renamed from: b */
    public static final Unit m89218b(C40582Q0 c40582q0, JSONObject metaData, FileDataInterface fileData) {
        Intrinsics.checkNotNullParameter(metaData, "metaData");
        Intrinsics.checkNotNullParameter(fileData, "fileData");
        if (fileData instanceof ImageDataInterface) {
            c40582q0.m89219a((ImageDataInterface) fileData);
        }
        c40582q0.m89223a(metaData, fileData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final void m89219a(ImageDataInterface imageDataInterface) {
        String lowerCase;
        String strName;
        MetaInfo metaInfo = this.f90087f;
        ImageData.CameraPosition cameraPosition = imageDataInterface.getCameraPosition();
        if (cameraPosition == null || (strName = cameraPosition.name()) == null) {
            lowerCase = null;
        } else {
            lowerCase = strName.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        }
        metaInfo.put("camera", lowerCase);
        metaInfo.put("actualResolution", ((UploadSettingsModel) this.f90082a.get(UploadSettingsModel.class)).getF14381b().toString());
        metaInfo.put("requestedResolution", ((UploadSettingsModel) this.f90082a.get(UploadSettingsModel.class)).getF14380a().toString());
    }

    /* JADX INFO: renamed from: a */
    public final void m89224a(String[] strArr, Serializable serializable, int i11) {
        C40604U3 c40604u3 = this.f90088g;
        if (c40604u3 != null) {
            c40604u3.invoke(strArr, serializable, Integer.valueOf(i11));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [byte[], java.io.Serializable] */
    /* JADX INFO: renamed from: a */
    public final void m89221a(String str, ScanPartModel scanPartModel) throws JSONException {
        DataInterface data;
        String str2;
        if (scanPartModel instanceof PhysicalIdScanPartModel) {
            boolean zContains = CollectionsKt.listOf((Object[]) new String[]{UploadType.FRONTSIDE, UploadType.BACKSIDE, UploadType.FACE}).contains(str);
            if (zContains) {
                data = ((PhysicalIdScanPartModel) scanPartModel).getF14314c();
            } else {
                ScanResult<?> scanResultScanResultForClassifier = ((PhysicalIdScanPartModel) scanPartModel).scanResultForClassifier(str);
                data = scanResultScanResultForClassifier != null ? scanResultScanResultForClassifier.getData() : null;
            }
            if (data == null) {
                return;
            }
            if (data instanceof FileDataInterface) {
                m89220a(str, (PhysicalIdScanPartModel) scanPartModel, (FileDataInterface) data, zContains);
                return;
            }
            String strRemoveSuffix = StringsKt.removeSuffix(str, (CharSequence) "_GZIP");
            if (Intrinsics.areEqual(data.getMimeType(), "application/x-gzip-compressed")) {
                str2 = "_gzip";
            } else {
                str2 = "";
            }
            String str3 = "data" + this.f90085d.length() + str2;
            if (data instanceof ByteArrayData) {
                ByteArrayData byteArrayData = (ByteArrayData) data;
                ?? data2 = byteArrayData.getData();
                m89224a(AbstractC40609V3.m89242a(str3, byteArrayData.getMimeType(), data2.length), (Serializable) data2, -1);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("multipartName", str3);
                jSONObject.put("uploadType", strRemoveSuffix);
                this.f90085d.put(jSONObject);
                return;
            }
            return;
        }
        if (scanPartModel instanceof DigitalIdScanPartModel) {
            DigitalIdScanPartModel digitalIdScanPartModel = (DigitalIdScanPartModel) scanPartModel;
            FileDataInterface f14314c = scanPartModel.getF14314c();
            Function2 function2 = new Function2() { // from class: lg0.t
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C40582Q0.m89216a(this.f93681b, (JSONObject) obj, (FileDataInterface) obj2);
                }
            };
            if (f14314c.getHasData() && digitalIdScanPartModel.getF14313b() == ScanMode.FILE) {
                JSONObject jSONObjectPut = new JSONObject().put("uploadType", str).put("multipartName", f14314c.getFileName()).put("type", digitalIdScanPartModel.getF14210n().getF13776b()).put("country", digitalIdScanPartModel.getF14209m().getF13765a()).put("fileType", ((DigitalDocumentPart) CollectionsKt.first((List) digitalIdScanPartModel.getParts())).getF13774c().getFileType()).put("docType", ((DigitalDocumentPart) CollectionsKt.first((List) digitalIdScanPartModel.getParts())).getF13774c().getIdType()).put("usabilityExpected", digitalIdScanPartModel.getF14315d());
                Intrinsics.checkNotNull(jSONObjectPut);
                function2.invoke(jSONObjectPut, f14314c);
                return;
            }
            return;
        }
        if (scanPartModel instanceof LivenessScanPartModel) {
            LivenessScanPartModel livenessScanPartModel = (LivenessScanPartModel) scanPartModel;
            C40567N0 c40567n0 = new C40567N0(this);
            if (CollectionsKt.listOf((Object[]) new ScanMode[]{ScanMode.JUMIO_LIVENESS, ScanMode.JUMIO_PREMIUM}).contains(livenessScanPartModel.getF14313b())) {
                LivenessDataModel f14243l = livenessScanPartModel.getF14243l();
                if (f14243l != null) {
                    AbstractC40586R0.m89232a(f14243l, str, livenessScanPartModel.getF14315d(), c40567n0);
                    Unit unit = Unit.INSTANCE;
                    return;
                }
                return;
            }
            AbstractC40586R0.m89233a(livenessScanPartModel, str, UploadResolution.FHD, c40567n0);
            Unit unit2 = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m89216a(C40582Q0 c40582q0, JSONObject metaData, FileDataInterface fileData) {
        Intrinsics.checkNotNullParameter(metaData, "metaData");
        Intrinsics.checkNotNullParameter(fileData, "fileData");
        if (fileData instanceof ImageDataInterface) {
            c40582q0.m89219a((ImageDataInterface) fileData);
        }
        c40582q0.m89223a(metaData, fileData);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [byte[], java.io.Serializable] */
    /* JADX INFO: renamed from: a */
    public final void m89223a(JSONObject jSONObject, FileDataInterface fileDataInterface) {
        this.f90084c.put(jSONObject);
        try {
            ?? file = FileUtil.INSTANCE.readFile(fileDataInterface.getData(), this.f90083b.getSessionKey());
            m89224a(AbstractC40609V3.m89242a(fileDataInterface.getFileName(), fileDataInterface.getMimeType(), file.length), (Serializable) file, -1);
        } catch (Exception e11) {
            Log.m14470e("DefaultUploadProcessor", "Error adding file data", e11);
            throw e11;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m89222a(JSONArray jSONArray) throws JSONException {
        if (jSONArray.length() == 0) {
            return;
        }
        DeviceUtilInterface deviceUtil = DeviceUtilKt.getDeviceUtil();
        Object obj = this.f90083b;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.content.Context");
        final String strInstallationId = deviceUtil.installationId((Context) obj);
        JsonUtilKt.forEach(jSONArray, new Function1() { // from class: lg0.v
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return C40582Q0.m89215a(strInstallationId, (JSONObject) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m89215a(String str, JSONObject it) throws JSONException {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it.optString("resolution"), UploadResolution.DEBUG.toString())) {
            return Unit.INSTANCE;
        }
        ((JSONObject) JsonUtilKt.getOrPut(it, "riskSignals", new Function0() { // from class: lg0.u
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C40582Q0.m89217a();
            }
        })).put("installationId", str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final JSONObject m89217a() {
        return new JSONObject();
    }
}
