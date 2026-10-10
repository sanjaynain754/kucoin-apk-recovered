package com.jumio.core.models.automation;

import com.jumio.core.util.JsonUtilKt;
import com.jumio.sdk.document.JumioDocumentType;
import com.kubi.kyc.KycKey;
import java.io.Serializable;
import java.util.Date;
import jumio.core.AbstractC40511C;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 +2\u00020\u0001:\u0001+B]\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u001a\u001a\u00020\u001bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003J_\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010%\u001a\u00020\u001b2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006,"}, m90084d2 = {"Lcom/jumio/core/models/automation/ExtractedData;", "Ljava/io/Serializable;", "issuingCountry", "", "dateOfBirth", "Ljava/util/Date;", "expiryDate", "documentNumber", "mrzLine1", "mrzLine2", "mrzLine3", KycKey.idType, "Lcom/jumio/sdk/document/JumioDocumentType;", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/jumio/sdk/document/JumioDocumentType;)V", "getIssuingCountry", "()Ljava/lang/String;", "getDateOfBirth", "()Ljava/util/Date;", "getExpiryDate", "getDocumentNumber", "getMrzLine1", "getMrzLine2", "getMrzLine3", "getIdType", "()Lcom/jumio/sdk/document/JumioDocumentType;", "isNfcChipUnlockDataComplete", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "", "toString", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ExtractedData implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final String f14391a;

    /* JADX INFO: renamed from: b */
    public final Date f14392b;

    /* JADX INFO: renamed from: c */
    public final Date f14393c;

    /* JADX INFO: renamed from: d */
    public final String f14394d;

    /* JADX INFO: renamed from: e */
    public final String f14395e;

    /* JADX INFO: renamed from: f */
    public final String f14396f;

    /* JADX INFO: renamed from: g */
    public final String f14397g;

    /* JADX INFO: renamed from: h */
    public final JumioDocumentType f14398h;

    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/jumio/core/models/automation/ExtractedData$Companion;", "", "<init>", "()V", "fromJson", "Lcom/jumio/core/models/automation/ExtractedData;", "jsonObject", "Lorg/json/JSONObject;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        @NotNull
        public final ExtractedData fromJson(@NotNull JSONObject jsonObject) throws JSONException {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            String strOptString = jsonObject.optString("issuingCountry");
            Date dateOptDate$default = JsonUtilKt.optDate$default(jsonObject, "dateOfBirth", "yyyy-MM-dd", null, null, null, 28, null);
            Date dateOptDate$default2 = JsonUtilKt.optDate$default(jsonObject, "expiryDate", "yyyy-MM-dd", null, null, null, 28, null);
            String strOptString2 = jsonObject.optString("documentNumber");
            String strOptString3 = jsonObject.optString("mrzLine1");
            String strOptString4 = jsonObject.optString("mrzLine2");
            String strOptString5 = jsonObject.optString("mrzLine3");
            JumioDocumentType.Companion companion = JumioDocumentType.INSTANCE;
            String strOptString6 = jsonObject.optString(KycKey.idType);
            Intrinsics.checkNotNullExpressionValue(strOptString6, "optString(...)");
            JumioDocumentType jumioDocumentTypeFromString = companion.fromString(strOptString6);
            Intrinsics.checkNotNull(strOptString);
            Intrinsics.checkNotNull(strOptString2);
            Intrinsics.checkNotNull(strOptString3);
            Intrinsics.checkNotNull(strOptString4);
            Intrinsics.checkNotNull(strOptString5);
            return new ExtractedData(strOptString, dateOptDate$default, dateOptDate$default2, strOptString2, strOptString3, strOptString4, strOptString5, jumioDocumentTypeFromString);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ExtractedData() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtractedData)) {
            return false;
        }
        ExtractedData extractedData = (ExtractedData) other;
        return Intrinsics.areEqual(this.f14391a, extractedData.f14391a) && Intrinsics.areEqual(this.f14392b, extractedData.f14392b) && Intrinsics.areEqual(this.f14393c, extractedData.f14393c) && Intrinsics.areEqual(this.f14394d, extractedData.f14394d) && Intrinsics.areEqual(this.f14395e, extractedData.f14395e) && Intrinsics.areEqual(this.f14396f, extractedData.f14396f) && Intrinsics.areEqual(this.f14397g, extractedData.f14397g) && this.f14398h == extractedData.f14398h;
    }

    public ExtractedData(@NotNull String issuingCountry, @Nullable Date date, @Nullable Date date2, @NotNull String documentNumber, @NotNull String mrzLine1, @NotNull String mrzLine2, @NotNull String mrzLine3, @Nullable JumioDocumentType jumioDocumentType) {
        Intrinsics.checkNotNullParameter(issuingCountry, "issuingCountry");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        Intrinsics.checkNotNullParameter(mrzLine1, "mrzLine1");
        Intrinsics.checkNotNullParameter(mrzLine2, "mrzLine2");
        Intrinsics.checkNotNullParameter(mrzLine3, "mrzLine3");
        this.f14391a = issuingCountry;
        this.f14392b = date;
        this.f14393c = date2;
        this.f14394d = documentNumber;
        this.f14395e = mrzLine1;
        this.f14396f = mrzLine2;
        this.f14397g = mrzLine3;
        this.f14398h = jumioDocumentType;
    }

    public static /* synthetic */ ExtractedData copy$default(ExtractedData extractedData, String str, Date date, Date date2, String str2, String str3, String str4, String str5, JumioDocumentType jumioDocumentType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = extractedData.f14391a;
        }
        if ((i11 & 2) != 0) {
            date = extractedData.f14392b;
        }
        if ((i11 & 4) != 0) {
            date2 = extractedData.f14393c;
        }
        if ((i11 & 8) != 0) {
            str2 = extractedData.f14394d;
        }
        if ((i11 & 16) != 0) {
            str3 = extractedData.f14395e;
        }
        if ((i11 & 32) != 0) {
            str4 = extractedData.f14396f;
        }
        if ((i11 & 64) != 0) {
            str5 = extractedData.f14397g;
        }
        if ((i11 & 128) != 0) {
            jumioDocumentType = extractedData.f14398h;
        }
        String str6 = str5;
        JumioDocumentType jumioDocumentType2 = jumioDocumentType;
        String str7 = str3;
        String str8 = str4;
        return extractedData.copy(str, date, date2, str2, str7, str8, str6, jumioDocumentType2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getF14391a() {
        return this.f14391a;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getF14392b() {
        return this.f14392b;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getF14393c() {
        return this.f14393c;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getF14394d() {
        return this.f14394d;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getF14395e() {
        return this.f14395e;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getF14396f() {
        return this.f14396f;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getF14397g() {
        return this.f14397g;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final JumioDocumentType getF14398h() {
        return this.f14398h;
    }

    @NotNull
    public final ExtractedData copy(@NotNull String issuingCountry, @Nullable Date dateOfBirth, @Nullable Date expiryDate, @NotNull String documentNumber, @NotNull String mrzLine1, @NotNull String mrzLine2, @NotNull String mrzLine3, @Nullable JumioDocumentType idType) {
        Intrinsics.checkNotNullParameter(issuingCountry, "issuingCountry");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        Intrinsics.checkNotNullParameter(mrzLine1, "mrzLine1");
        Intrinsics.checkNotNullParameter(mrzLine2, "mrzLine2");
        Intrinsics.checkNotNullParameter(mrzLine3, "mrzLine3");
        return new ExtractedData(issuingCountry, dateOfBirth, expiryDate, documentNumber, mrzLine1, mrzLine2, mrzLine3, idType);
    }

    @Nullable
    public final Date getDateOfBirth() {
        return this.f14392b;
    }

    @NotNull
    public final String getDocumentNumber() {
        return this.f14394d;
    }

    @Nullable
    public final Date getExpiryDate() {
        return this.f14393c;
    }

    @Nullable
    public final JumioDocumentType getIdType() {
        return this.f14398h;
    }

    @NotNull
    public final String getIssuingCountry() {
        return this.f14391a;
    }

    @NotNull
    public final String getMrzLine1() {
        return this.f14395e;
    }

    @NotNull
    public final String getMrzLine2() {
        return this.f14396f;
    }

    @NotNull
    public final String getMrzLine3() {
        return this.f14397g;
    }

    public int hashCode() {
        int iHashCode = this.f14391a.hashCode() * 31;
        Date date = this.f14392b;
        int iHashCode2 = (iHashCode + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.f14393c;
        int iM89148a = AbstractC40511C.m89148a(this.f14397g, AbstractC40511C.m89148a(this.f14396f, AbstractC40511C.m89148a(this.f14395e, AbstractC40511C.m89148a(this.f14394d, (iHashCode2 + (date2 == null ? 0 : date2.hashCode())) * 31, 31), 31), 31), 31);
        JumioDocumentType jumioDocumentType = this.f14398h;
        return iM89148a + (jumioDocumentType != null ? jumioDocumentType.hashCode() : 0);
    }

    public final boolean isNfcChipUnlockDataComplete() {
        return this.f14391a.length() > 0 && this.f14392b != null && this.f14393c != null && this.f14394d.length() > 0;
    }

    @NotNull
    public String toString() {
        return "ExtractedData(issuingCountry=" + this.f14391a + ", dateOfBirth=" + this.f14392b + ", expiryDate=" + this.f14393c + ", documentNumber=" + this.f14394d + ", mrzLine1=" + this.f14395e + ", mrzLine2=" + this.f14396f + ", mrzLine3=" + this.f14397g + ", idType=" + this.f14398h + ')';
    }

    public /* synthetic */ ExtractedData(String str, Date date, Date date2, String str2, String str3, String str4, String str5, JumioDocumentType jumioDocumentType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? null : date, (i11 & 4) != 0 ? null : date2, (i11 & 8) != 0 ? "" : str2, (i11 & 16) != 0 ? "" : str3, (i11 & 32) != 0 ? "" : str4, (i11 & 64) != 0 ? "" : str5, (i11 & 128) != 0 ? null : jumioDocumentType);
    }
}
