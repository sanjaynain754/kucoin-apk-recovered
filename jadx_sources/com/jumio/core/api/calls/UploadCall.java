package com.jumio.core.api.calls;

import com.google.api.client.json.Json;
import com.jumio.analytics.MetaInfo;
import com.jumio.commons.log.Log;
import com.jumio.commons.obfuscate.StringDeobfuscator;
import com.jumio.core.enums.UploadResolution;
import com.jumio.core.extraction.liveness.extraction.LivenessDataModel;
import com.jumio.core.models.ApiCallDataModel;
import com.jumio.core.models.ConsentModel;
import com.jumio.core.models.DigitalIdScanPartModel;
import com.jumio.core.models.LivenessScanPartModel;
import com.jumio.core.models.PhysicalIdScanPartModel;
import com.jumio.core.models.ScanPartModel;
import com.jumio.core.models.TimeoutModel;
import com.jumio.core.models.UploadSettingsModel;
import com.jumio.core.persistence.DataManager;
import java.io.Serializable;
import java.net.SocketTimeoutException;
import java.util.LinkedHashMap;
import java.util.Map;
import jumio.core.AbstractC40586R0;
import jumio.core.AbstractC40609V3;
import jumio.core.AbstractC40652e;
import jumio.core.AbstractC40760z2;
import jumio.core.C40572O0;
import jumio.core.C40577P0;
import jumio.core.C40582Q0;
import jumio.core.C40604U3;
import jumio.core.InterfaceC40542I0;
import jumio.core.InterfaceC40619X3;
import jumio.core.InterfaceC40657f;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import org.tensorflow.lite.schema.BuiltinOptions;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nB\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\t\u0010\u000bJ\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u000eH\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0014J\u0014\u0010\u001c\u001a\u00020\u001d2\n\u0010\u001e\u001a\u00060\u001fj\u0002` H\u0014J\b\u0010!\u001a\u00020\"H\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R0\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f`\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015¨\u0006$"}, m90084d2 = {"Lcom/jumio/core/api/calls/UploadCall;", "Lcom/jumio/core/network/MultipartApiCall;", "Lorg/json/JSONObject;", "apiCallSettings", "Lcom/jumio/core/network/ApiCallSettings;", "apiCallDataModel", "Lcom/jumio/core/models/ApiCallDataModel;", "uploadProcessor", "Lcom/jumio/core/api/calls/upload/UploadProcessorInterface;", "<init>", "(Lcom/jumio/core/network/ApiCallSettings;Lcom/jumio/core/models/ApiCallDataModel;Lcom/jumio/core/api/calls/upload/UploadProcessorInterface;)V", "(Lcom/jumio/core/network/ApiCallSettings;Lcom/jumio/core/models/ApiCallDataModel;)V", "data", "Ljava/util/LinkedHashMap;", "", "", "Lkotlin/collections/LinkedHashMap;", "getData", "()Ljava/util/LinkedHashMap;", "credentialId", "getCredentialId", "()Ljava/lang/String;", "uri", "getUri", "parseResponse", "plainTextAnswer", "prepareData", "", "checkSilentRetry", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "additionalAnalyticsDetails", "Lcom/jumio/analytics/MetaInfo;", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUploadCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadCall.kt\ncom/jumio/core/api/calls/UploadCall\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
public final class UploadCall extends AbstractC40760z2 {

    @NotNull
    public static final String DATA_CREDENTIAL_ID = "DATA_CREDENTIAL_ID";

    @NotNull
    public static final String DATA_PARTS = "DATA_PARTS";

    /* JADX INFO: renamed from: m */
    public final InterfaceC40619X3 f13719m;

    public /* synthetic */ UploadCall(InterfaceC40657f interfaceC40657f, ApiCallDataModel apiCallDataModel, InterfaceC40619X3 interfaceC40619X3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i11 & 4) != 0) {
            DataManager dataManager = interfaceC40657f.getDataManager();
            Object context = interfaceC40657f.getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.jumio.core.persistence.DataAccessEncryption");
            interfaceC40619X3 = new C40582Q0(dataManager, (InterfaceC40542I0) context);
        }
        this(interfaceC40657f, apiCallDataModel, interfaceC40619X3);
    }

    @Override // com.jumio.core.network.ApiCall
    @NotNull
    public MetaInfo additionalAnalyticsDetails() {
        return ((C40582Q0) this.f13719m).f90087f;
    }

    @Override // com.jumio.core.network.ApiCall
    public boolean checkSilentRetry(@NotNull Exception e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        if (!(e11 instanceof SocketTimeoutException) || !((C40582Q0) this.f13719m).f90086e) {
            return false;
        }
        DataManager dataManager = getF14407c().getDataManager();
        getApiCallDataModel().setTimeout(((TimeoutModel) dataManager.get(TimeoutModel.class)).getUpload());
        ((UploadSettingsModel) dataManager.get(UploadSettingsModel.class)).setUploadImageResolution(UploadResolution.FHD);
        return true;
    }

    @Override // com.jumio.core.network.ApiCall
    @NotNull
    public String getUri() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractC40652e.f90248a);
        sb2.append(StringDeobfuscator.deobfuscate(new byte[]{BuiltinOptions.Rfft2dOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.SplitVOptions, 29, 26, -19, 4, -62, BuiltinOptions.LogicalAndOptions, -18}, 7954085481774384125L));
        Serializable serializable = getApiCallDataModel().getData().get(DATA_CREDENTIAL_ID);
        Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type kotlin.String");
        sb2.append((String) serializable);
        sb2.append(StringDeobfuscator.deobfuscate(new byte[]{18, -65, 7, -10, BuiltinOptions.CosOptions, -40, -103}, 2727321516117831622L));
        return sb2.toString();
    }

    @Override // com.jumio.core.network.ApiCall
    @NotNull
    public JSONObject parseResponse(@NotNull String plainTextAnswer) {
        Intrinsics.checkNotNullParameter(plainTextAnswer, "plainTextAnswer");
        try {
            ((ConsentModel) getF14407c().getDataManager().get(ConsentModel.class)).addConsentOutcome();
            return new JSONObject(plainTextAnswer);
        } catch (Exception e11) {
            Log.m14485w(getF14409e(), "Exception", e11);
            return new JSONObject();
        }
    }

    @Override // jumio.core.AbstractC40760z2
    public void prepareData() throws Exception {
        UploadCall uploadCall;
        InterfaceC40619X3 interfaceC40619X3 = this.f13719m;
        Serializable serializable = getApiCallDataModel().getData().get(DATA_PARTS);
        Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type java.util.LinkedHashMap<kotlin.String, kotlin.Any>");
        LinkedHashMap data = (LinkedHashMap) serializable;
        C40582Q0 c40582q0 = (C40582Q0) interfaceC40619X3;
        c40582q0.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        for (Map.Entry entry : data.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof LivenessDataModel) {
                AbstractC40586R0.m89232a((LivenessDataModel) value, str, false, (Function2) new C40572O0(c40582q0));
            } else if (value instanceof LivenessScanPartModel) {
                c40582q0.m89221a(str, (ScanPartModel) value);
            } else if (value instanceof PhysicalIdScanPartModel) {
                c40582q0.m89221a(str, (ScanPartModel) value);
            } else if (value instanceof DigitalIdScanPartModel) {
                c40582q0.m89221a(str, (ScanPartModel) value);
            } else if (value instanceof ScanPartModel) {
                AbstractC40586R0.m89233a((ScanPartModel) value, str, UploadResolution.FHD, new C40577P0(c40582q0));
            } else {
                Log.m14482w("Given model is not yet supported for upload: " + value);
            }
        }
        c40582q0.m89222a(c40582q0.f90084c);
        JSONArray jSONArray = c40582q0.f90084c;
        if (jSONArray.length() != 0) {
            String string = new JSONObject().put("files", jSONArray).toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            c40582q0.m89224a(AbstractC40609V3.m89242a("uploadFilesMetadata", Json.MEDIA_TYPE, string.length()), string, 0);
        }
        JSONArray jSONArray2 = c40582q0.f90085d;
        if (jSONArray2.length() != 0) {
            String string2 = new JSONObject().put("parts", jSONArray2).toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            c40582q0.m89224a(AbstractC40609V3.m89242a("uploadDataPartsMetadata", Json.MEDIA_TYPE, string2.length()), string2, 0);
        }
        String consentDataIfNeeded = ((ConsentModel) getF14407c().getDataManager().get(ConsentModel.class)).getConsentDataIfNeeded();
        if (consentDataIfNeeded != null) {
            uploadCall = this;
            AbstractC40760z2.addPart$default(uploadCall, AbstractC40609V3.m89242a("consents", Json.MEDIA_TYPE, consentDataIfNeeded.length()), consentDataIfNeeded, 0, 4, null);
        } else {
            uploadCall = this;
        }
        if (((C40582Q0) uploadCall.f13719m).f90086e) {
            getApiCallDataModel().setTimeout(((TimeoutModel) getF14407c().getDataManager().get(TimeoutModel.class)).getUploadHighResolution());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadCall(@NotNull InterfaceC40657f apiCallSettings, @NotNull ApiCallDataModel<?> apiCallDataModel, @NotNull InterfaceC40619X3 uploadProcessor) {
        super(apiCallSettings, apiCallDataModel);
        Intrinsics.checkNotNullParameter(apiCallSettings, "apiCallSettings");
        Intrinsics.checkNotNullParameter(apiCallDataModel, "apiCallDataModel");
        Intrinsics.checkNotNullParameter(uploadProcessor, "uploadProcessor");
        this.f13719m = uploadProcessor;
        if (apiCallDataModel.getData().containsKey(DATA_CREDENTIAL_ID)) {
            if (apiCallDataModel.getData().containsKey(DATA_PARTS)) {
                ((C40582Q0) uploadProcessor).f90088g = new C40604U3(this);
                return;
            }
            throw new IllegalArgumentException("Upload Parts are missing");
        }
        throw new IllegalArgumentException("Credential ID is missing");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UploadCall(@NotNull InterfaceC40657f apiCallSettings, @NotNull ApiCallDataModel<?> apiCallDataModel) {
        Intrinsics.checkNotNullParameter(apiCallSettings, "apiCallSettings");
        Intrinsics.checkNotNullParameter(apiCallDataModel, "apiCallDataModel");
        DataManager dataManager = apiCallSettings.getDataManager();
        Object context = apiCallSettings.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.jumio.core.persistence.DataAccessEncryption");
        this(apiCallSettings, apiCallDataModel, new C40582Q0(dataManager, (InterfaceC40542I0) context));
    }
}
