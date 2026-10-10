package com.jumio.core.models;

import androidx.autofill.HintConstants;
import com.jumio.commons.PersistWith;
import com.jumio.core.data.country.Country;
import com.jumio.core.enums.JumioGender;
import com.jumio.core.model.StaticModel;
import com.jumio.sdk.document.JumioDocumentType;
import com.jumio.sdk.result.JumioImageData;
import com.kubi.kyc.KycKey;
import com.tencent.bugly.proguard.C33627eb;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import jumio.core.AbstractC40585Q3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010J\u001a\u00020K2\u0016\u0010L\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050M\"\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0002\u0010NJ\n\u0010O\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010P\u001a\u00020K2\b\u0010Q\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010R\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010S\u001a\u00020K2\b\u0010T\u001a\u0004\u0018\u00010\u0005H\u0016J\u0014\u0010U\u001a\u0004\u0018\u00010\u00052\b\u0010V\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010W\u001a\u00020X2\b\u0010V\u001a\u0004\u0018\u00010\u0005H\u0016J\u0018\u0010Y\u001a\u00020K2\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020]H\u0016J\"\u0010^\u001a\u00020K2\u0006\u0010Z\u001a\u00020[2\u0006\u0010_\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0004J\"\u0010^\u001a\u00020K2\u0006\u0010Z\u001a\u00020[2\u0006\u0010_\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010`H\u0004R(\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR(\u0010\u0014\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR(\u0010 \u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\b\"\u0004\b\"\u0010\nR*\u0010#\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\b\"\u0004\b%\u0010\nR\u001c\u0010&\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\b\"\u0004\b(\u0010\nR\"\u0010)\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b*\u0010\nR\u001c\u0010+\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001a\"\u0004\b-\u0010\u001cR\u001c\u0010.\u001a\u0004\u0018\u00010/X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R(\u00104\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\b\"\u0004\b6\u0010\nR\"\u00107\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b8\u0010\nR\"\u00109\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b:\u0010\nR\"\u0010;\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b<\u0010\nR\"\u0010=\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b>\u0010\nR\u0010\u0010?\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010@\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010A\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\b\"\u0004\bC\u0010\nR\u001c\u0010D\u001a\u0004\u0018\u00010EX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010I¨\u0006a"}, m90084d2 = {"Lcom/jumio/core/models/DocumentDataModel;", "Lcom/jumio/core/model/StaticModel;", "<init>", "()V", "value", "", "selectedCountry", "getSelectedCountry", "()Ljava/lang/String;", "setSelectedCountry", "(Ljava/lang/String;)V", "selectedDocumentType", "Lcom/jumio/sdk/document/JumioDocumentType;", "getSelectedDocumentType", "()Lcom/jumio/sdk/document/JumioDocumentType;", "setSelectedDocumentType", "(Lcom/jumio/sdk/document/JumioDocumentType;)V", KycKey.idNumber, "getIdNumber", "setIdNumber", "personalNumber", "getPersonalNumber", "setPersonalNumber", "issuingDate", "Ljava/util/Date;", "getIssuingDate", "()Ljava/util/Date;", "setIssuingDate", "(Ljava/util/Date;)V", "expiryDate", "getExpiryDate", "setExpiryDate", "issuingCountry", "getIssuingCountry", "setIssuingCountry", KycKey.lastName, "getLastName", "setLastName", KycKey.firstName, "getFirstName", "setFirstName", "nameSuffix", "setNameSuffix", "dob", "getDob", "setDob", HintConstants.AUTOFILL_HINT_GENDER, "Lcom/jumio/core/enums/JumioGender;", "getGender", "()Lcom/jumio/core/enums/JumioGender;", "setGender", "(Lcom/jumio/core/enums/JumioGender;)V", "originatingCountry", "getOriginatingCountry", "setOriginatingCountry", "addressLine", "setAddressLine", "city", "setCity", "subdivision", "setSubdivision", "postCode", "setPostCode", "optData1", "optData2", "placeOfBirth", "getPlaceOfBirth", "setPlaceOfBirth", "imageData", "Lcom/jumio/sdk/result/JumioImageData;", "getImageData", "()Lcom/jumio/sdk/result/JumioImageData;", "setImageData", "(Lcom/jumio/sdk/result/JumioImageData;)V", "setFirstNames", "", "names", "", "([Ljava/lang/String;)V", "getOptionalData1", "setOptionalData1", "optionalData1", "getOptionalData2", "setOptionalData2", "optionalData2", "fixGermanCountryCode", "isoCode", "checkCountryCode", "", "fillRequest", "request", "Lorg/json/JSONObject;", "scanPart", "Lcom/jumio/core/models/ScanPartModel;", "appendValue", "name", "Lorg/json/JSONArray;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@PersistWith("DocumentDataModel")
@SourceDebugExtension({"SMAP\nDocumentDataModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DocumentDataModel.kt\ncom/jumio/core/models/DocumentDataModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,166:1\n1#2:167\n*E\n"})
public class DocumentDataModel implements StaticModel {

    /* JADX INFO: renamed from: a */
    public String f14222a;

    /* JADX INFO: renamed from: b */
    public JumioDocumentType f14223b;

    /* JADX INFO: renamed from: c */
    public String f14224c;

    /* JADX INFO: renamed from: d */
    public String f14225d;

    /* JADX INFO: renamed from: e */
    public Date f14226e;

    /* JADX INFO: renamed from: f */
    public Date f14227f;

    /* JADX INFO: renamed from: g */
    public String f14228g;

    /* JADX INFO: renamed from: h */
    public String f14229h;

    /* JADX INFO: renamed from: i */
    public String f14230i;

    /* JADX INFO: renamed from: j */
    public Date f14231j;

    /* JADX INFO: renamed from: k */
    public JumioGender f14232k;

    /* JADX INFO: renamed from: l */
    public String f14233l;

    /* JADX INFO: renamed from: m */
    public String f14234m;

    /* JADX INFO: renamed from: n */
    public String f14235n;

    /* JADX INFO: renamed from: o */
    public String f14236o;

    /* JADX INFO: renamed from: p */
    public JumioImageData f14237p;

    public final void appendValue(@NotNull JSONObject request, @NotNull String name, @Nullable String value) throws JSONException {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(name, "name");
        if (value == null || value.length() == 0) {
            return;
        }
        request.put(name, value);
    }

    public boolean checkCountryCode(@Nullable String isoCode) {
        if (isoCode == null || isoCode.length() == 0) {
            return false;
        }
        return !StringsKt.equals(new Country(isoCode, false, 2, null).getF13766b(), isoCode, true);
    }

    public final void setSelectedCountry(@Nullable String str) {
        this.f14222a = AbstractC40585Q3.m89225a(3, str);
    }

    public void fillRequest(@NotNull JSONObject request, @NotNull ScanPartModel scanPart) throws JSONException {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(scanPart, "scanPart");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        appendValue(request, KycKey.firstName, this.f14230i);
        appendValue(request, KycKey.lastName, getF14229h());
        appendValue(request, "personalNumber", this.f14225d);
        appendValue(request, "number", this.f14224c);
        Date date = this.f14226e;
        appendValue(request, "issuingDate", date != null ? simpleDateFormat.format(date) : null);
        Date date2 = this.f14231j;
        appendValue(request, "dob", date2 != null ? simpleDateFormat.format(date2) : null);
        Date date3 = this.f14227f;
        appendValue(request, "expiry", date3 != null ? simpleDateFormat.format(date3) : null);
        appendValue(request, "country", this.f14233l);
        appendValue(request, "optionalData1", this.f14234m);
        appendValue(request, "optionalData2", this.f14235n);
        appendValue(request, "extractionSide", scanPart.getF14312a().name());
        JSONObject jSONObject = new JSONObject();
        appendValue(jSONObject, "city", (String) null);
        appendValue(jSONObject, "subdivision", (String) null);
        appendValue(jSONObject, "addressLine", (String) null);
        appendValue(jSONObject, "postCode", (String) null);
        request.put("address", jSONObject);
    }

    @Nullable
    public String fixGermanCountryCode(@Nullable String isoCode) {
        return (Intrinsics.areEqual("D", isoCode) || Intrinsics.areEqual("D<<", isoCode)) ? "DEU" : isoCode;
    }

    @Nullable
    /* JADX INFO: renamed from: getDob, reason: from getter */
    public final Date getF14231j() {
        return this.f14231j;
    }

    @Nullable
    /* JADX INFO: renamed from: getExpiryDate, reason: from getter */
    public final Date getF14227f() {
        return this.f14227f;
    }

    @Nullable
    /* JADX INFO: renamed from: getFirstName, reason: from getter */
    public final String getF14230i() {
        return this.f14230i;
    }

    @Nullable
    /* JADX INFO: renamed from: getGender, reason: from getter */
    public final JumioGender getF14232k() {
        return this.f14232k;
    }

    @Nullable
    /* JADX INFO: renamed from: getIdNumber, reason: from getter */
    public final String getF14224c() {
        return this.f14224c;
    }

    @Nullable
    /* JADX INFO: renamed from: getImageData, reason: from getter */
    public final JumioImageData getF14237p() {
        return this.f14237p;
    }

    @Nullable
    /* JADX INFO: renamed from: getIssuingCountry, reason: from getter */
    public final String getF14228g() {
        return this.f14228g;
    }

    @Nullable
    /* JADX INFO: renamed from: getIssuingDate, reason: from getter */
    public final Date getF14226e() {
        return this.f14226e;
    }

    @Nullable
    /* JADX INFO: renamed from: getLastName, reason: from getter */
    public final String getF14229h() {
        return this.f14229h;
    }

    @Nullable
    /* JADX INFO: renamed from: getOptionalData1, reason: from getter */
    public String getF14234m() {
        return this.f14234m;
    }

    @Nullable
    /* JADX INFO: renamed from: getOptionalData2, reason: from getter */
    public String getF14235n() {
        return this.f14235n;
    }

    @Nullable
    /* JADX INFO: renamed from: getOriginatingCountry, reason: from getter */
    public final String getF14233l() {
        return this.f14233l;
    }

    @Nullable
    /* JADX INFO: renamed from: getPersonalNumber, reason: from getter */
    public final String getF14225d() {
        return this.f14225d;
    }

    @Nullable
    /* JADX INFO: renamed from: getPlaceOfBirth, reason: from getter */
    public final String getF14236o() {
        return this.f14236o;
    }

    @Nullable
    /* JADX INFO: renamed from: getSelectedCountry, reason: from getter */
    public final String getF14222a() {
        return this.f14222a;
    }

    @Nullable
    /* JADX INFO: renamed from: getSelectedDocumentType, reason: from getter */
    public final JumioDocumentType getF14223b() {
        return this.f14223b;
    }

    public final void setDob(@Nullable Date date) {
        this.f14231j = date;
    }

    public final void setExpiryDate(@Nullable Date date) {
        this.f14227f = date;
    }

    public final void setFirstName(@Nullable String str) {
        this.f14230i = str;
    }

    public void setFirstNames(@NotNull String... names) {
        Intrinsics.checkNotNullParameter(names, "names");
        StringBuilder sb2 = new StringBuilder();
        for (String str : names) {
            if (str != null) {
                sb2.append(str);
                sb2.append(C33627eb.f69716f);
            }
        }
        this.f14230i = AbstractC40585Q3.m89225a(100, sb2.toString());
    }

    public final void setGender(@Nullable JumioGender jumioGender) {
        this.f14232k = jumioGender;
    }

    public final void setIdNumber(@Nullable String str) {
        this.f14224c = AbstractC40585Q3.m89225a(100, str);
    }

    public final void setImageData(@Nullable JumioImageData jumioImageData) {
        this.f14237p = jumioImageData;
    }

    public final void setIssuingDate(@Nullable Date date) {
        this.f14226e = date;
    }

    public final void setLastName(@Nullable String str) {
        this.f14229h = AbstractC40585Q3.m89225a(100, str);
    }

    public void setOptionalData1(@Nullable String optionalData1) {
        this.f14234m = AbstractC40585Q3.m89226a(optionalData1, "^[A-Z0-9]*$", 50);
    }

    public void setOptionalData2(@Nullable String optionalData2) {
        this.f14235n = AbstractC40585Q3.m89226a(optionalData2, "^[A-Z0-9]*$", 50);
    }

    public final void setPersonalNumber(@Nullable String str) {
        this.f14225d = AbstractC40585Q3.m89226a(str, "^[A-Z0-9]*$", 14);
    }

    public final void setPlaceOfBirth(@Nullable String str) {
        this.f14236o = str;
    }

    public final void setSelectedDocumentType(@Nullable JumioDocumentType jumioDocumentType) {
        this.f14223b = jumioDocumentType;
    }

    public final void appendValue(@NotNull JSONObject request, @NotNull String name, @Nullable JSONArray value) throws JSONException {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(name, "name");
        if (value == null || value.length() == 0) {
            return;
        }
        request.put(name, value);
    }

    public final void setIssuingCountry(@Nullable String str) {
        String strFixGermanCountryCode = fixGermanCountryCode(str);
        this.f14228g = strFixGermanCountryCode;
        String strM89226a = AbstractC40585Q3.m89226a(strFixGermanCountryCode, "[A-Z]{3}", 3);
        this.f14228g = strM89226a;
        if (!checkCountryCode(strM89226a)) {
            this.f14228g = null;
        }
    }

    public final void setOriginatingCountry(@Nullable String str) {
        String strFixGermanCountryCode = fixGermanCountryCode(str);
        this.f14233l = strFixGermanCountryCode;
        String strM89226a = AbstractC40585Q3.m89226a(strFixGermanCountryCode, "[A-Z]{3}", 3);
        this.f14233l = strM89226a;
        if (!checkCountryCode(strM89226a)) {
            this.f14233l = null;
        }
    }
}
