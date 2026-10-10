package com.jumio.core.models;

import androidx.exifinterface.media.ExifInterface;
import com.jumio.commons.PersistWith;
import com.jumio.core.JumioMrzData;
import com.jumio.core.enums.EMRTDStatus;
import com.jumio.core.models.MrzDataModel;
import com.jumio.core.models.automation.ExtractedData;
import com.jumio.core.util.StringUtilKt;
import com.jumio.sdk.document.JumioDocumentType;
import com.kubi.kyc.KycKey;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import jumio.core.AbstractC40745w2;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014J\u0018\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lcom/jumio/core/models/MrzDataModel;", "Lcom/jumio/core/models/DocumentDataModel;", "<init>", "()V", "emrtdStatus", "Lcom/jumio/core/enums/EMRTDStatus;", "getEmrtdStatus", "()Lcom/jumio/core/enums/EMRTDStatus;", "setEmrtdStatus", "(Lcom/jumio/core/enums/EMRTDStatus;)V", "mrtdData", "Lcom/jumio/core/models/MrtdDataModel;", "mrzData", "Lcom/jumio/core/JumioMrzData;", "setFromExtractedData", "", "extractedData", "Lcom/jumio/core/models/automation/ExtractedData;", "setMrtdData", "replaceDocumentData", "", "fillRequest", "request", "Lorg/json/JSONObject;", "scanPart", "Lcom/jumio/core/models/ScanPartModel;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@PersistWith("MrzDataModel")
@SourceDebugExtension({"SMAP\nMrzDataModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MrzDataModel.kt\ncom/jumio/core/models/MrzDataModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n1#2:118\n*E\n"})
public final class MrzDataModel extends DocumentDataModel {

    /* JADX INFO: renamed from: r */
    public MrtdDataModel f14287r;

    /* JADX INFO: renamed from: q */
    public EMRTDStatus f14286q = EMRTDStatus.NOT_PERFORMED;

    /* JADX INFO: renamed from: s */
    public final JumioMrzData f14288s = new JumioMrzData();

    @Override // com.jumio.core.models.DocumentDataModel
    public void fillRequest(@NotNull JSONObject request, @NotNull ScanPartModel scanPart) throws JSONException {
        JumioMrzData mrzData;
        JumioMrzData mrzData2;
        JumioMrzData mrzData3;
        Date f14226e;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(scanPart, "scanPart");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        appendValue(request, KycKey.firstName, getF14230i());
        appendValue(request, KycKey.lastName, getF14229h());
        appendValue(request, "placeOfBirth", getF14236o());
        int i11 = AbstractC40745w2.f90463a[scanPart.getF14312a().ordinal()];
        appendValue(request, "extractionSide", i11 != 1 ? i11 != 2 ? "" : "BACK" : "FRONT");
        appendValue(request, "issuingDate", (getF14226e() == null || (f14226e = getF14226e()) == null) ? null : simpleDateFormat.format(f14226e));
        appendValue(request, "mrzFormat", this.f14288s.getF13617d().name());
        appendValue(request, "mrzLine1", this.f14288s.getF13614a());
        appendValue(request, "mrzLine2", this.f14288s.getF13615b());
        appendValue(request, "mrzLine3", this.f14288s.getF13616c());
        MrtdDataModel mrtdDataModel = this.f14287r;
        if (mrtdDataModel != null) {
            EMRTDStatus eMRTDStatus = this.f14286q;
            if (eMRTDStatus == EMRTDStatus.SUCCESS || eMRTDStatus == EMRTDStatus.FAILED) {
                if (mrtdDataModel.getMrzData() != null) {
                    MrtdDataModel mrtdDataModel2 = this.f14287r;
                    appendValue(request, "nfcLine1", (mrtdDataModel2 == null || (mrzData3 = mrtdDataModel2.getMrzData()) == null) ? null : mrzData3.getF13614a());
                    MrtdDataModel mrtdDataModel3 = this.f14287r;
                    appendValue(request, "nfcLine2", (mrtdDataModel3 == null || (mrzData2 = mrtdDataModel3.getMrzData()) == null) ? null : mrzData2.getF13615b());
                    MrtdDataModel mrtdDataModel4 = this.f14287r;
                    appendValue(request, "nfcLine3", (mrtdDataModel4 == null || (mrzData = mrtdDataModel4.getMrzData()) == null) ? null : mrzData.getF13616c());
                }
                JSONObject jSONObject = new JSONObject();
                MrtdDataModel mrtdDataModel5 = this.f14287r;
                jSONObject.put("BAC", mrtdDataModel5 != null ? Integer.valueOf(mrtdDataModel5.getBacCheckResult()) : null);
                MrtdDataModel mrtdDataModel6 = this.f14287r;
                jSONObject.put("AA", mrtdDataModel6 != null ? Integer.valueOf(mrtdDataModel6.getActiveAuthResult()) : null);
                JSONObject jSONObject2 = new JSONObject();
                MrtdDataModel mrtdDataModel7 = this.f14287r;
                jSONObject2.put("DSC", mrtdDataModel7 != null ? Integer.valueOf(mrtdDataModel7.getDscCheckResult()) : null);
                MrtdDataModel mrtdDataModel8 = this.f14287r;
                jSONObject2.put("CSCA", mrtdDataModel8 != null ? Integer.valueOf(mrtdDataModel8.getRootCertCheck()) : null);
                JSONObject jSONObject3 = new JSONObject();
                MrtdDataModel mrtdDataModel9 = this.f14287r;
                Map<String, Integer> htCheckResults = mrtdDataModel9 != null ? mrtdDataModel9.getHtCheckResults() : null;
                if (htCheckResults != null) {
                    for (Map.Entry<String, Integer> entry : htCheckResults.entrySet()) {
                        jSONObject3.put(entry.getKey(), entry.getValue().intValue());
                    }
                    jSONObject2.put("HTC", jSONObject3);
                }
                jSONObject.put("PA", jSONObject2);
                MrtdDataModel mrtdDataModel10 = this.f14287r;
                int[] encodedDataItems = mrtdDataModel10 != null ? mrtdDataModel10.getEncodedDataItems() : null;
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("authenticationSteps", "\"" + jSONObject + '\"');
                String string = Arrays.toString(encodedDataItems);
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                jSONObject4.put("additionalData", string);
                request.put("eMRTD", jSONObject4);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m14558a(MrzDataModel mrzDataModel, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mrzDataModel.setFirstName(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static final Unit m14559b(MrzDataModel mrzDataModel, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mrzDataModel.setLastName(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m14560c(MrzDataModel mrzDataModel, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mrzDataModel.setPersonalNumber(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m14561d(MrzDataModel mrzDataModel, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mrzDataModel.setIdNumber(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m14562e(MrzDataModel mrzDataModel, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mrzDataModel.setIssuingCountry(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m14563f(MrzDataModel mrzDataModel, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mrzDataModel.setOriginatingCountry(it);
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: getEmrtdStatus, reason: from getter */
    public final EMRTDStatus getF14286q() {
        return this.f14286q;
    }

    public final void setEmrtdStatus(@NotNull EMRTDStatus eMRTDStatus) {
        Intrinsics.checkNotNullParameter(eMRTDStatus, "<set-?>");
        this.f14286q = eMRTDStatus;
    }

    public final void setFromExtractedData(@NotNull ExtractedData extractedData) {
        String upperCase;
        Intrinsics.checkNotNullParameter(extractedData, "extractedData");
        setIssuingCountry(extractedData.getIssuingCountry());
        setDob(extractedData.getDateOfBirth());
        setExpiryDate(extractedData.getExpiryDate());
        setIdNumber(extractedData.getDocumentNumber());
        this.f14288s.setMrzLine1(extractedData.getMrzLine1());
        this.f14288s.setMrzLine2(extractedData.getMrzLine2());
        this.f14288s.setMrzLine3(extractedData.getMrzLine3());
        JumioDocumentType idType = extractedData.getIdType();
        if (idType == null) {
            Character chFirstOrNull = StringsKt.firstOrNull(extractedData.getMrzLine1());
            idType = null;
            if (chFirstOrNull != null) {
                String strValueOf = String.valueOf(chFirstOrNull.charValue());
                Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
                upperCase = strValueOf.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            } else {
                upperCase = null;
            }
            if (upperCase != null) {
                int iHashCode = upperCase.hashCode();
                if (iHashCode != 73) {
                    if (iHashCode != 80) {
                        if (iHashCode == 86 && upperCase.equals(ExifInterface.GPS_MEASUREMENT_INTERRUPTED)) {
                            idType = JumioDocumentType.VISA;
                        }
                    } else if (upperCase.equals("P")) {
                        idType = JumioDocumentType.PASSPORT;
                    }
                } else if (upperCase.equals("I")) {
                    idType = JumioDocumentType.ID_CARD;
                }
            }
        }
        setSelectedDocumentType(idType);
    }

    public final void setMrtdData(@NotNull MrtdDataModel mrtdData, boolean replaceDocumentData) {
        Intrinsics.checkNotNullParameter(mrtdData, "mrtdData");
        this.f14287r = mrtdData;
        if (replaceDocumentData) {
            StringUtilKt.isNotNullOrEmpty(mrtdData.getMrzFirstName(), new Function1() { // from class: r9.d
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MrzDataModel.m14558a(this.f97165b, (String) obj);
                }
            });
            StringUtilKt.isNotNullOrEmpty(mrtdData.getMrzLastName(), new Function1() { // from class: r9.e
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MrzDataModel.m14559b(this.f97166b, (String) obj);
                }
            });
            StringUtilKt.isNotNullOrEmpty(mrtdData.getMrzPersonalNumber(), new Function1() { // from class: r9.f
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MrzDataModel.m14560c(this.f97167b, (String) obj);
                }
            });
            StringUtilKt.isNotNullOrEmpty(mrtdData.getMrzIdNumber(), new Function1() { // from class: r9.g
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MrzDataModel.m14561d(this.f97168b, (String) obj);
                }
            });
            StringUtilKt.isNotNullOrEmpty(mrtdData.getMrzIssuingCountry(), new Function1() { // from class: r9.h
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MrzDataModel.m14562e(this.f97169b, (String) obj);
                }
            });
            Date issuingDate = mrtdData.getIssuingDate();
            if (issuingDate != null) {
                setIssuingDate(issuingDate);
            }
            StringUtilKt.isNotNullOrEmpty(mrtdData.getMrzOriginatingCountry(), new Function1() { // from class: r9.i
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MrzDataModel.m14563f(this.f97170b, (String) obj);
                }
            });
        }
    }
}
