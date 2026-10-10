package com.kubi.sdk.protocol.flutter.protocol;

import androidx.annotation.Keep;
import androidx.autofill.HintConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCFlutterBridgeCoreCall.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b+\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010\u0015J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010.\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010/\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010(J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÎ\u0001\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020\u000b2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020@HÖ\u0001J\u0014\u0010A\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010BJ\t\u0010C\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001f\u0010\u001dR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b$\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b*\u0010\u001d¨\u0006D"}, m90084d2 = {"Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeCoreUserInfo;", "", "avatar", "", FirebaseAnalytics.Param.CURRENCY, "email", "id", "language", "nickname", HintConstants.AUTOFILL_HINT_PHONE, "phoneValidate", "", "referralCode", InterfaceC33826o0.f71244p, "hasMarginLoan", "hasOpenFutures", "withDrawPassword", "balanceCurrency", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "type", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getAvatar", "()Ljava/lang/String;", "getBalanceCurrency", "getCountryCode", "getCurrency", "getEmail", "getHasMarginLoan", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHasOpenFutures", "getId", "getLanguage", "getNickname", "getPhone", "getPhoneValidate", "getReferralCode", "getToken", "getType", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getWithDrawPassword", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeCoreUserInfo;", "equals", "other", "hashCode", "", "toMap", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCFlutterBridgeCoreUserInfo {

    @Nullable
    private final String avatar;

    @Nullable
    private final String balanceCurrency;

    @Nullable
    private final String countryCode;

    @Nullable
    private final String currency;

    @Nullable
    private final String email;

    @Nullable
    private final Boolean hasMarginLoan;

    @Nullable
    private final Boolean hasOpenFutures;

    @Nullable
    private final String id;

    @Nullable
    private final String language;

    @Nullable
    private final String nickname;

    @Nullable
    private final String phone;

    @Nullable
    private final Boolean phoneValidate;

    @Nullable
    private final String referralCode;

    @Nullable
    private final String token;

    @Nullable
    private final Long type;

    @Nullable
    private final Boolean withDrawPassword;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCFlutterBridgeCoreUserInfo)) {
            return false;
        }
        KCFlutterBridgeCoreUserInfo kCFlutterBridgeCoreUserInfo = (KCFlutterBridgeCoreUserInfo) other;
        return Intrinsics.areEqual(this.avatar, kCFlutterBridgeCoreUserInfo.avatar) && Intrinsics.areEqual(this.currency, kCFlutterBridgeCoreUserInfo.currency) && Intrinsics.areEqual(this.email, kCFlutterBridgeCoreUserInfo.email) && Intrinsics.areEqual(this.id, kCFlutterBridgeCoreUserInfo.id) && Intrinsics.areEqual(this.language, kCFlutterBridgeCoreUserInfo.language) && Intrinsics.areEqual(this.nickname, kCFlutterBridgeCoreUserInfo.nickname) && Intrinsics.areEqual(this.phone, kCFlutterBridgeCoreUserInfo.phone) && Intrinsics.areEqual(this.phoneValidate, kCFlutterBridgeCoreUserInfo.phoneValidate) && Intrinsics.areEqual(this.referralCode, kCFlutterBridgeCoreUserInfo.referralCode) && Intrinsics.areEqual(this.token, kCFlutterBridgeCoreUserInfo.token) && Intrinsics.areEqual(this.hasMarginLoan, kCFlutterBridgeCoreUserInfo.hasMarginLoan) && Intrinsics.areEqual(this.hasOpenFutures, kCFlutterBridgeCoreUserInfo.hasOpenFutures) && Intrinsics.areEqual(this.withDrawPassword, kCFlutterBridgeCoreUserInfo.withDrawPassword) && Intrinsics.areEqual(this.balanceCurrency, kCFlutterBridgeCoreUserInfo.balanceCurrency) && Intrinsics.areEqual(this.countryCode, kCFlutterBridgeCoreUserInfo.countryCode) && Intrinsics.areEqual(this.type, kCFlutterBridgeCoreUserInfo.type);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getHasMarginLoan() {
        return this.hasMarginLoan;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getHasOpenFutures() {
        return this.hasOpenFutures;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getWithDrawPassword() {
        return this.withDrawPassword;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getBalanceCurrency() {
        return this.balanceCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Long getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getPhoneValidate() {
        return this.phoneValidate;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getReferralCode() {
        return this.referralCode;
    }

    @NotNull
    public final KCFlutterBridgeCoreUserInfo copy(@Nullable String avatar, @Nullable String currency, @Nullable String email, @Nullable String id2, @Nullable String language, @Nullable String nickname, @Nullable String phone, @Nullable Boolean phoneValidate, @Nullable String referralCode, @Nullable String token, @Nullable Boolean hasMarginLoan, @Nullable Boolean hasOpenFutures, @Nullable Boolean withDrawPassword, @Nullable String balanceCurrency, @Nullable String countryCode, @Nullable Long type) {
        return new KCFlutterBridgeCoreUserInfo(avatar, currency, email, id2, language, nickname, phone, phoneValidate, referralCode, token, hasMarginLoan, hasOpenFutures, withDrawPassword, balanceCurrency, countryCode, type);
    }

    @Nullable
    public final String getAvatar() {
        return this.avatar;
    }

    @Nullable
    public final String getBalanceCurrency() {
        return this.balanceCurrency;
    }

    @Nullable
    public final String getCountryCode() {
        return this.countryCode;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    public final Boolean getHasMarginLoan() {
        return this.hasMarginLoan;
    }

    @Nullable
    public final Boolean getHasOpenFutures() {
        return this.hasOpenFutures;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getLanguage() {
        return this.language;
    }

    @Nullable
    public final String getNickname() {
        return this.nickname;
    }

    @Nullable
    public final String getPhone() {
        return this.phone;
    }

    @Nullable
    public final Boolean getPhoneValidate() {
        return this.phoneValidate;
    }

    @Nullable
    public final String getReferralCode() {
        return this.referralCode;
    }

    @Nullable
    public final String getToken() {
        return this.token;
    }

    @Nullable
    public final Long getType() {
        return this.type;
    }

    @Nullable
    public final Boolean getWithDrawPassword() {
        return this.withDrawPassword;
    }

    public int hashCode() {
        String str = this.avatar;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currency;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.email;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.id;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.language;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.nickname;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.phone;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.phoneValidate;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str8 = this.referralCode;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.token;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool2 = this.hasMarginLoan;
        int iHashCode11 = (iHashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.hasOpenFutures;
        int iHashCode12 = (iHashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.withDrawPassword;
        int iHashCode13 = (iHashCode12 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str10 = this.balanceCurrency;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.countryCode;
        int iHashCode15 = (iHashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Long l11 = this.type;
        return iHashCode15 + (l11 != null ? l11.hashCode() : 0);
    }

    @NotNull
    public final Map<String, Object> toMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("avatar", this.avatar);
        linkedHashMap.put(FirebaseAnalytics.Param.CURRENCY, this.currency);
        linkedHashMap.put("email", this.email);
        linkedHashMap.put("id", this.id);
        linkedHashMap.put("language", this.language);
        linkedHashMap.put("nickname", this.nickname);
        linkedHashMap.put(HintConstants.AUTOFILL_HINT_PHONE, this.phone);
        linkedHashMap.put("phoneValidate", this.phoneValidate);
        linkedHashMap.put("referralCode", this.referralCode);
        linkedHashMap.put(InterfaceC33826o0.f71244p, this.token);
        linkedHashMap.put("hasMarginLoan", this.hasMarginLoan);
        linkedHashMap.put("hasOpenFutures", this.hasOpenFutures);
        linkedHashMap.put("withDrawPassword", this.withDrawPassword);
        linkedHashMap.put("balanceCurrency", this.balanceCurrency);
        linkedHashMap.put(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, this.countryCode);
        linkedHashMap.put("type", this.type);
        return linkedHashMap;
    }

    @NotNull
    public String toString() {
        return "KCFlutterBridgeCoreUserInfo(avatar=" + this.avatar + ", currency=" + this.currency + ", email=" + this.email + ", id=" + this.id + ", language=" + this.language + ", nickname=" + this.nickname + ", phone=" + this.phone + ", phoneValidate=" + this.phoneValidate + ", referralCode=" + this.referralCode + ", token=" + this.token + ", hasMarginLoan=" + this.hasMarginLoan + ", hasOpenFutures=" + this.hasOpenFutures + ", withDrawPassword=" + this.withDrawPassword + ", balanceCurrency=" + this.balanceCurrency + ", countryCode=" + this.countryCode + ", type=" + this.type + ')';
    }

    public KCFlutterBridgeCoreUserInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Boolean bool, @Nullable String str8, @Nullable String str9, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable String str10, @Nullable String str11, @Nullable Long l11) {
        this.avatar = str;
        this.currency = str2;
        this.email = str3;
        this.id = str4;
        this.language = str5;
        this.nickname = str6;
        this.phone = str7;
        this.phoneValidate = bool;
        this.referralCode = str8;
        this.token = str9;
        this.hasMarginLoan = bool2;
        this.hasOpenFutures = bool3;
        this.withDrawPassword = bool4;
        this.balanceCurrency = str10;
        this.countryCode = str11;
        this.type = l11;
    }
}
