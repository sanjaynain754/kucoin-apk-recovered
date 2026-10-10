package com.kubi.sdk.protocol.hybrid.protocol;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCHybridBridgeUserCenterCall.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b'\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010$J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¶\u0001\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u00106J\u0013\u00107\u001a\u00020\u00072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001b\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b \u0010\u0018R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0015¨\u0006<"}, m90084d2 = {"Lcom/kubi/sdk/protocol/hybrid/protocol/KCHybridBridgeUserCenterUserInfo;", "", "uid", "", RemoteConfigConstants.RequestFieldKey.TIME_ZONE, "nickname", "emailValidate", "", "phoneValidate", "language", FirebaseAnalytics.Param.CURRENCY, "googleTfa", "loginSafeWord", "mailSafeWord", "referralCode", "feeLevelUrl", "balanceCurrency", "type", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getBalanceCurrency", "()Ljava/lang/String;", "getCurrency", "getEmailValidate", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFeeLevelUrl", "getGoogleTfa", "getLanguage", "getLoginSafeWord", "getMailSafeWord", "getNickname", "getPhoneValidate", "getReferralCode", "getTimeZone", "getType", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getUid", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/kubi/sdk/protocol/hybrid/protocol/KCHybridBridgeUserCenterUserInfo;", "equals", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCHybridBridgeUserCenterUserInfo {

    @Nullable
    private final String balanceCurrency;

    @Nullable
    private final String currency;

    @Nullable
    private final Boolean emailValidate;

    @Nullable
    private final String feeLevelUrl;

    @Nullable
    private final Boolean googleTfa;

    @Nullable
    private final String language;

    @Nullable
    private final String loginSafeWord;

    @Nullable
    private final String mailSafeWord;

    @Nullable
    private final String nickname;

    @Nullable
    private final Boolean phoneValidate;

    @Nullable
    private final String referralCode;

    @Nullable
    private final String timeZone;

    @Nullable
    private final Long type;

    @Nullable
    private final String uid;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCHybridBridgeUserCenterUserInfo)) {
            return false;
        }
        KCHybridBridgeUserCenterUserInfo kCHybridBridgeUserCenterUserInfo = (KCHybridBridgeUserCenterUserInfo) other;
        return Intrinsics.areEqual(this.uid, kCHybridBridgeUserCenterUserInfo.uid) && Intrinsics.areEqual(this.timeZone, kCHybridBridgeUserCenterUserInfo.timeZone) && Intrinsics.areEqual(this.nickname, kCHybridBridgeUserCenterUserInfo.nickname) && Intrinsics.areEqual(this.emailValidate, kCHybridBridgeUserCenterUserInfo.emailValidate) && Intrinsics.areEqual(this.phoneValidate, kCHybridBridgeUserCenterUserInfo.phoneValidate) && Intrinsics.areEqual(this.language, kCHybridBridgeUserCenterUserInfo.language) && Intrinsics.areEqual(this.currency, kCHybridBridgeUserCenterUserInfo.currency) && Intrinsics.areEqual(this.googleTfa, kCHybridBridgeUserCenterUserInfo.googleTfa) && Intrinsics.areEqual(this.loginSafeWord, kCHybridBridgeUserCenterUserInfo.loginSafeWord) && Intrinsics.areEqual(this.mailSafeWord, kCHybridBridgeUserCenterUserInfo.mailSafeWord) && Intrinsics.areEqual(this.referralCode, kCHybridBridgeUserCenterUserInfo.referralCode) && Intrinsics.areEqual(this.feeLevelUrl, kCHybridBridgeUserCenterUserInfo.feeLevelUrl) && Intrinsics.areEqual(this.balanceCurrency, kCHybridBridgeUserCenterUserInfo.balanceCurrency) && Intrinsics.areEqual(this.type, kCHybridBridgeUserCenterUserInfo.type);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getMailSafeWord() {
        return this.mailSafeWord;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getReferralCode() {
        return this.referralCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getFeeLevelUrl() {
        return this.feeLevelUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getBalanceCurrency() {
        return this.balanceCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Long getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTimeZone() {
        return this.timeZone;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getEmailValidate() {
        return this.emailValidate;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getPhoneValidate() {
        return this.phoneValidate;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getGoogleTfa() {
        return this.googleTfa;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getLoginSafeWord() {
        return this.loginSafeWord;
    }

    @NotNull
    public final KCHybridBridgeUserCenterUserInfo copy(@Nullable String uid, @Nullable String timeZone, @Nullable String nickname, @Nullable Boolean emailValidate, @Nullable Boolean phoneValidate, @Nullable String language, @Nullable String currency, @Nullable Boolean googleTfa, @Nullable String loginSafeWord, @Nullable String mailSafeWord, @Nullable String referralCode, @Nullable String feeLevelUrl, @Nullable String balanceCurrency, @Nullable Long type) {
        return new KCHybridBridgeUserCenterUserInfo(uid, timeZone, nickname, emailValidate, phoneValidate, language, currency, googleTfa, loginSafeWord, mailSafeWord, referralCode, feeLevelUrl, balanceCurrency, type);
    }

    @Nullable
    public final String getBalanceCurrency() {
        return this.balanceCurrency;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final Boolean getEmailValidate() {
        return this.emailValidate;
    }

    @Nullable
    public final String getFeeLevelUrl() {
        return this.feeLevelUrl;
    }

    @Nullable
    public final Boolean getGoogleTfa() {
        return this.googleTfa;
    }

    @Nullable
    public final String getLanguage() {
        return this.language;
    }

    @Nullable
    public final String getLoginSafeWord() {
        return this.loginSafeWord;
    }

    @Nullable
    public final String getMailSafeWord() {
        return this.mailSafeWord;
    }

    @Nullable
    public final String getNickname() {
        return this.nickname;
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
    public final String getTimeZone() {
        return this.timeZone;
    }

    @Nullable
    public final Long getType() {
        return this.type;
    }

    @Nullable
    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        String str = this.uid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.timeZone;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nickname;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.emailValidate;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.phoneValidate;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str4 = this.language;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.currency;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool3 = this.googleTfa;
        int iHashCode8 = (iHashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str6 = this.loginSafeWord;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.mailSafeWord;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.referralCode;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.feeLevelUrl;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.balanceCurrency;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Long l11 = this.type;
        return iHashCode13 + (l11 != null ? l11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "KCHybridBridgeUserCenterUserInfo(uid=" + this.uid + ", timeZone=" + this.timeZone + ", nickname=" + this.nickname + ", emailValidate=" + this.emailValidate + ", phoneValidate=" + this.phoneValidate + ", language=" + this.language + ", currency=" + this.currency + ", googleTfa=" + this.googleTfa + ", loginSafeWord=" + this.loginSafeWord + ", mailSafeWord=" + this.mailSafeWord + ", referralCode=" + this.referralCode + ", feeLevelUrl=" + this.feeLevelUrl + ", balanceCurrency=" + this.balanceCurrency + ", type=" + this.type + ')';
    }

    public KCHybridBridgeUserCenterUserInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str4, @Nullable String str5, @Nullable Boolean bool3, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable Long l11) {
        this.uid = str;
        this.timeZone = str2;
        this.nickname = str3;
        this.emailValidate = bool;
        this.phoneValidate = bool2;
        this.language = str4;
        this.currency = str5;
        this.googleTfa = bool3;
        this.loginSafeWord = str6;
        this.mailSafeWord = str7;
        this.referralCode = str8;
        this.feeLevelUrl = str9;
        this.balanceCurrency = str10;
        this.type = l11;
    }
}
