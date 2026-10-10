package com.jumio.sdk.result;

import androidx.autofill.HintConstants;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.jumio.core.util.JsonUtilKt;
import com.kubi.kyc.KycKey;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\bF\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 Q2\u00020\u00012\u00020\u0002:\u0001QB\u008f\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u000b\u00103\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0091\u0002\u0010I\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010J\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010MHÖ\u0003J\t\u0010N\u001a\u00020OHÖ\u0001J\t\u0010P\u001a\u00020\u0004HÖ\u0001R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001dR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001dR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001dR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001dR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001dR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001dR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001d¨\u0006R"}, m90084d2 = {"Lcom/jumio/sdk/result/JumioIDResult;", "Lcom/jumio/sdk/result/JumioCredentialResult;", "Ljava/io/Serializable;", "issuingCountry", "", KycKey.idType, "idSubType", KycKey.firstName, KycKey.lastName, "dateOfBirth", "issuingDate", "expiryDate", "documentNumber", "personalNumber", HintConstants.AUTOFILL_HINT_GENDER, KycKey.nationality, "placeOfBirth", "country", "address", "city", "subdivision", HintConstants.AUTOFILL_HINT_POSTAL_CODE, "mrzLine1", "mrzLine2", "mrzLine3", "curp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIssuingCountry", "()Ljava/lang/String;", "getIdType", "getIdSubType", "getFirstName", "getLastName", "getDateOfBirth", "getIssuingDate", "getExpiryDate", "getDocumentNumber", "getPersonalNumber", "getGender", "getNationality", "getPlaceOfBirth", "getCountry", "getAddress", "getCity", "getSubdivision", "getPostalCode", "getMrzLine1", "getMrzLine2", "getMrzLine3", "getCurp", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class JumioIDResult extends JumioCredentialResult implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    public final String f14712c;

    /* JADX INFO: renamed from: d */
    public final String f14713d;

    /* JADX INFO: renamed from: e */
    public final String f14714e;

    /* JADX INFO: renamed from: f */
    public final String f14715f;

    /* JADX INFO: renamed from: g */
    public final String f14716g;

    /* JADX INFO: renamed from: h */
    public final String f14717h;

    /* JADX INFO: renamed from: i */
    public final String f14718i;

    /* JADX INFO: renamed from: j */
    public final String f14719j;

    /* JADX INFO: renamed from: k */
    public final String f14720k;

    /* JADX INFO: renamed from: l */
    public final String f14721l;

    /* JADX INFO: renamed from: m */
    public final String f14722m;

    /* JADX INFO: renamed from: n */
    public final String f14723n;

    /* JADX INFO: renamed from: o */
    public final String f14724o;

    /* JADX INFO: renamed from: p */
    public final String f14725p;

    /* JADX INFO: renamed from: q */
    public final String f14726q;

    /* JADX INFO: renamed from: r */
    public final String f14727r;

    /* JADX INFO: renamed from: s */
    public final String f14728s;

    /* JADX INFO: renamed from: t */
    public final String f14729t;

    /* JADX INFO: renamed from: u */
    public final String f14730u;

    /* JADX INFO: renamed from: v */
    public final String f14731v;

    /* JADX INFO: renamed from: w */
    public final String f14732w;

    /* JADX INFO: renamed from: x */
    public final String f14733x;

    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/jumio/sdk/result/JumioIDResult$Companion;", "", "<init>", "()V", "fromJson", "Lcom/jumio/sdk/result/JumioIDResult;", JPushConstants.Analysis.KEY_JSON, "Lorg/json/JSONObject;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        @NotNull
        public final JumioIDResult fromJson(@NotNull JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new JumioIDResult(JsonUtilKt.stringOrNull(json, "issuingCountry"), JsonUtilKt.stringOrNull(json, KycKey.idType), JsonUtilKt.stringOrNull(json, "idSubType"), JsonUtilKt.stringOrNull(json, KycKey.firstName), JsonUtilKt.stringOrNull(json, KycKey.lastName), JsonUtilKt.stringOrNull(json, "dateOfBirth"), JsonUtilKt.stringOrNull(json, "issuingDate"), JsonUtilKt.stringOrNull(json, "expiryDate"), JsonUtilKt.stringOrNull(json, "documentNumber"), JsonUtilKt.stringOrNull(json, "personalNumber"), JsonUtilKt.stringOrNull(json, HintConstants.AUTOFILL_HINT_GENDER), JsonUtilKt.stringOrNull(json, KycKey.nationality), JsonUtilKt.stringOrNull(json, "placeOfBirth"), JsonUtilKt.stringOrNull(json, "country"), JsonUtilKt.stringOrNull(json, "address"), JsonUtilKt.stringOrNull(json, "city"), JsonUtilKt.stringOrNull(json, "subdivision"), JsonUtilKt.stringOrNull(json, HintConstants.AUTOFILL_HINT_POSTAL_CODE), JsonUtilKt.stringOrNull(json, "mrzLine1"), JsonUtilKt.stringOrNull(json, "mrzLine2"), JsonUtilKt.stringOrNull(json, "mrzLine3"), JsonUtilKt.stringOrNull(json, "curp"));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public JumioIDResult() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194303, null);
    }

    public static /* synthetic */ JumioIDResult copy$default(JumioIDResult jumioIDResult, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, int i11, Object obj) {
        String str23;
        String str24;
        String str25 = (i11 & 1) != 0 ? jumioIDResult.f14712c : str;
        String str26 = (i11 & 2) != 0 ? jumioIDResult.f14713d : str2;
        String str27 = (i11 & 4) != 0 ? jumioIDResult.f14714e : str3;
        String str28 = (i11 & 8) != 0 ? jumioIDResult.f14715f : str4;
        String str29 = (i11 & 16) != 0 ? jumioIDResult.f14716g : str5;
        String str30 = (i11 & 32) != 0 ? jumioIDResult.f14717h : str6;
        String str31 = (i11 & 64) != 0 ? jumioIDResult.f14718i : str7;
        String str32 = (i11 & 128) != 0 ? jumioIDResult.f14719j : str8;
        String str33 = (i11 & 256) != 0 ? jumioIDResult.f14720k : str9;
        String str34 = (i11 & 512) != 0 ? jumioIDResult.f14721l : str10;
        String str35 = (i11 & 1024) != 0 ? jumioIDResult.f14722m : str11;
        String str36 = (i11 & 2048) != 0 ? jumioIDResult.f14723n : str12;
        String str37 = (i11 & 4096) != 0 ? jumioIDResult.f14724o : str13;
        String str38 = (i11 & 8192) != 0 ? jumioIDResult.f14725p : str14;
        String str39 = str25;
        String str40 = (i11 & 16384) != 0 ? jumioIDResult.f14726q : str15;
        String str41 = (i11 & 32768) != 0 ? jumioIDResult.f14727r : str16;
        String str42 = (i11 & 65536) != 0 ? jumioIDResult.f14728s : str17;
        String str43 = (i11 & 131072) != 0 ? jumioIDResult.f14729t : str18;
        String str44 = (i11 & 262144) != 0 ? jumioIDResult.f14730u : str19;
        String str45 = (i11 & 524288) != 0 ? jumioIDResult.f14731v : str20;
        String str46 = (i11 & 1048576) != 0 ? jumioIDResult.f14732w : str21;
        if ((i11 & 2097152) != 0) {
            str24 = str46;
            str23 = jumioIDResult.f14733x;
        } else {
            str23 = str22;
            str24 = str46;
        }
        return jumioIDResult.copy(str39, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str40, str41, str42, str43, str44, str45, str24, str23);
    }

    @NotNull
    public final JumioIDResult copy(@Nullable String issuingCountry, @Nullable String idType, @Nullable String idSubType, @Nullable String firstName, @Nullable String lastName, @Nullable String dateOfBirth, @Nullable String issuingDate, @Nullable String expiryDate, @Nullable String documentNumber, @Nullable String personalNumber, @Nullable String gender, @Nullable String nationality, @Nullable String placeOfBirth, @Nullable String country, @Nullable String address, @Nullable String city, @Nullable String subdivision, @Nullable String postalCode, @Nullable String mrzLine1, @Nullable String mrzLine2, @Nullable String mrzLine3, @Nullable String curp) {
        return new JumioIDResult(issuingCountry, idType, idSubType, firstName, lastName, dateOfBirth, issuingDate, expiryDate, documentNumber, personalNumber, gender, nationality, placeOfBirth, country, address, city, subdivision, postalCode, mrzLine1, mrzLine2, mrzLine3, curp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JumioIDResult)) {
            return false;
        }
        JumioIDResult jumioIDResult = (JumioIDResult) other;
        return Intrinsics.areEqual(this.f14712c, jumioIDResult.f14712c) && Intrinsics.areEqual(this.f14713d, jumioIDResult.f14713d) && Intrinsics.areEqual(this.f14714e, jumioIDResult.f14714e) && Intrinsics.areEqual(this.f14715f, jumioIDResult.f14715f) && Intrinsics.areEqual(this.f14716g, jumioIDResult.f14716g) && Intrinsics.areEqual(this.f14717h, jumioIDResult.f14717h) && Intrinsics.areEqual(this.f14718i, jumioIDResult.f14718i) && Intrinsics.areEqual(this.f14719j, jumioIDResult.f14719j) && Intrinsics.areEqual(this.f14720k, jumioIDResult.f14720k) && Intrinsics.areEqual(this.f14721l, jumioIDResult.f14721l) && Intrinsics.areEqual(this.f14722m, jumioIDResult.f14722m) && Intrinsics.areEqual(this.f14723n, jumioIDResult.f14723n) && Intrinsics.areEqual(this.f14724o, jumioIDResult.f14724o) && Intrinsics.areEqual(this.f14725p, jumioIDResult.f14725p) && Intrinsics.areEqual(this.f14726q, jumioIDResult.f14726q) && Intrinsics.areEqual(this.f14727r, jumioIDResult.f14727r) && Intrinsics.areEqual(this.f14728s, jumioIDResult.f14728s) && Intrinsics.areEqual(this.f14729t, jumioIDResult.f14729t) && Intrinsics.areEqual(this.f14730u, jumioIDResult.f14730u) && Intrinsics.areEqual(this.f14731v, jumioIDResult.f14731v) && Intrinsics.areEqual(this.f14732w, jumioIDResult.f14732w) && Intrinsics.areEqual(this.f14733x, jumioIDResult.f14733x);
    }

    public /* synthetic */ JumioIDResult(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & 128) != 0 ? null : str8, (i11 & 256) != 0 ? null : str9, (i11 & 512) != 0 ? null : str10, (i11 & 1024) != 0 ? null : str11, (i11 & 2048) != 0 ? null : str12, (i11 & 4096) != 0 ? null : str13, (i11 & 8192) != 0 ? null : str14, (i11 & 16384) != 0 ? null : str15, (i11 & 32768) != 0 ? null : str16, (i11 & 65536) != 0 ? null : str17, (i11 & 131072) != 0 ? null : str18, (i11 & 262144) != 0 ? null : str19, (i11 & 524288) != 0 ? null : str20, (i11 & 1048576) != 0 ? null : str21, (i11 & 2097152) != 0 ? null : str22);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getF14712c() {
        return this.f14712c;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getF14721l() {
        return this.f14721l;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getF14722m() {
        return this.f14722m;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getF14723n() {
        return this.f14723n;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getF14724o() {
        return this.f14724o;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getF14725p() {
        return this.f14725p;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getF14726q() {
        return this.f14726q;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getF14727r() {
        return this.f14727r;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getF14728s() {
        return this.f14728s;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getF14729t() {
        return this.f14729t;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getF14730u() {
        return this.f14730u;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getF14713d() {
        return this.f14713d;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getF14731v() {
        return this.f14731v;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getF14732w() {
        return this.f14732w;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getF14733x() {
        return this.f14733x;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getF14714e() {
        return this.f14714e;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getF14715f() {
        return this.f14715f;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getF14716g() {
        return this.f14716g;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getF14717h() {
        return this.f14717h;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getF14718i() {
        return this.f14718i;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getF14719j() {
        return this.f14719j;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getF14720k() {
        return this.f14720k;
    }

    @Nullable
    public final String getAddress() {
        return this.f14726q;
    }

    @Nullable
    public final String getCity() {
        return this.f14727r;
    }

    @Nullable
    public final String getCountry() {
        return this.f14725p;
    }

    @Nullable
    public final String getCurp() {
        return this.f14733x;
    }

    @Nullable
    public final String getDateOfBirth() {
        return this.f14717h;
    }

    @Nullable
    public final String getDocumentNumber() {
        return this.f14720k;
    }

    @Nullable
    public final String getExpiryDate() {
        return this.f14719j;
    }

    @Nullable
    public final String getFirstName() {
        return this.f14715f;
    }

    @Nullable
    public final String getGender() {
        return this.f14722m;
    }

    @Nullable
    public final String getIdSubType() {
        return this.f14714e;
    }

    @Nullable
    public final String getIdType() {
        return this.f14713d;
    }

    @Nullable
    public final String getIssuingCountry() {
        return this.f14712c;
    }

    @Nullable
    public final String getIssuingDate() {
        return this.f14718i;
    }

    @Nullable
    public final String getLastName() {
        return this.f14716g;
    }

    @Nullable
    public final String getMrzLine1() {
        return this.f14730u;
    }

    @Nullable
    public final String getMrzLine2() {
        return this.f14731v;
    }

    @Nullable
    public final String getMrzLine3() {
        return this.f14732w;
    }

    @Nullable
    public final String getNationality() {
        return this.f14723n;
    }

    @Nullable
    public final String getPersonalNumber() {
        return this.f14721l;
    }

    @Nullable
    public final String getPlaceOfBirth() {
        return this.f14724o;
    }

    @Nullable
    public final String getPostalCode() {
        return this.f14729t;
    }

    @Nullable
    public final String getSubdivision() {
        return this.f14728s;
    }

    public int hashCode() {
        String str = this.f14712c;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f14713d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f14714e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f14715f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f14716g;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f14717h;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f14718i;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f14719j;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f14720k;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f14721l;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f14722m;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f14723n;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f14724o;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f14725p;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f14726q;
        int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.f14727r;
        int iHashCode16 = (iHashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.f14728s;
        int iHashCode17 = (iHashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.f14729t;
        int iHashCode18 = (iHashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.f14730u;
        int iHashCode19 = (iHashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.f14731v;
        int iHashCode20 = (iHashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.f14732w;
        int iHashCode21 = (iHashCode20 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.f14733x;
        return iHashCode21 + (str22 != null ? str22.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "JumioIDResult(issuingCountry=" + this.f14712c + ", idType=" + this.f14713d + ", idSubType=" + this.f14714e + ", firstName=" + this.f14715f + ", lastName=" + this.f14716g + ", dateOfBirth=" + this.f14717h + ", issuingDate=" + this.f14718i + ", expiryDate=" + this.f14719j + ", documentNumber=" + this.f14720k + ", personalNumber=" + this.f14721l + ", gender=" + this.f14722m + ", nationality=" + this.f14723n + ", placeOfBirth=" + this.f14724o + ", country=" + this.f14725p + ", address=" + this.f14726q + ", city=" + this.f14727r + ", subdivision=" + this.f14728s + ", postalCode=" + this.f14729t + ", mrzLine1=" + this.f14730u + ", mrzLine2=" + this.f14731v + ", mrzLine3=" + this.f14732w + ", curp=" + this.f14733x + ')';
    }

    public JumioIDResult(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22) {
        this.f14712c = str;
        this.f14713d = str2;
        this.f14714e = str3;
        this.f14715f = str4;
        this.f14716g = str5;
        this.f14717h = str6;
        this.f14718i = str7;
        this.f14719j = str8;
        this.f14720k = str9;
        this.f14721l = str10;
        this.f14722m = str11;
        this.f14723n = str12;
        this.f14724o = str13;
        this.f14725p = str14;
        this.f14726q = str15;
        this.f14727r = str16;
        this.f14728s = str17;
        this.f14729t = str18;
        this.f14730u = str19;
        this.f14731v = str20;
        this.f14732w = str21;
        this.f14733x = str22;
    }
}
