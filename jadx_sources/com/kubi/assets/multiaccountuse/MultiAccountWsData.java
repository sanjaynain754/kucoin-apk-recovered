package com.kubi.assets.multiaccountuse;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MultiAccountWsData.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\""}, m90084d2 = {"Lcom/kubi/assets/multiaccountuse/MultiAccountWsData;", "", "accountTag", "", "accountType", FirebaseAnalytics.Param.CURRENCY, "time", "topic", "transferAmount", "userId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccountTag", "()Ljava/lang/String;", "getAccountType", "getCurrency", "getTime", "getTopic", "getTransferAmount", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "AssetsCenterApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MultiAccountWsData {

    @Nullable
    private final String accountTag;

    @Nullable
    private final String accountType;

    @Nullable
    private final String currency;

    @Nullable
    private final String time;

    @Nullable
    private final String topic;

    @Nullable
    private final String transferAmount;

    @Nullable
    private final String userId;

    public MultiAccountWsData() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiAccountWsData)) {
            return false;
        }
        MultiAccountWsData multiAccountWsData = (MultiAccountWsData) other;
        return Intrinsics.areEqual(this.accountTag, multiAccountWsData.accountTag) && Intrinsics.areEqual(this.accountType, multiAccountWsData.accountType) && Intrinsics.areEqual(this.currency, multiAccountWsData.currency) && Intrinsics.areEqual(this.time, multiAccountWsData.time) && Intrinsics.areEqual(this.topic, multiAccountWsData.topic) && Intrinsics.areEqual(this.transferAmount, multiAccountWsData.transferAmount) && Intrinsics.areEqual(this.userId, multiAccountWsData.userId);
    }

    public MultiAccountWsData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.accountTag = str;
        this.accountType = str2;
        this.currency = str3;
        this.time = str4;
        this.topic = str5;
        this.transferAmount = str6;
        this.userId = str7;
    }

    public static /* synthetic */ MultiAccountWsData copy$default(MultiAccountWsData multiAccountWsData, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = multiAccountWsData.accountTag;
        }
        if ((i11 & 2) != 0) {
            str2 = multiAccountWsData.accountType;
        }
        if ((i11 & 4) != 0) {
            str3 = multiAccountWsData.currency;
        }
        if ((i11 & 8) != 0) {
            str4 = multiAccountWsData.time;
        }
        if ((i11 & 16) != 0) {
            str5 = multiAccountWsData.topic;
        }
        if ((i11 & 32) != 0) {
            str6 = multiAccountWsData.transferAmount;
        }
        if ((i11 & 64) != 0) {
            str7 = multiAccountWsData.userId;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return multiAccountWsData.copy(str, str2, str11, str4, str10, str8, str9);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccountTag() {
        return this.accountTag;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAccountType() {
        return this.accountType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTime() {
        return this.time;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTopic() {
        return this.topic;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTransferAmount() {
        return this.transferAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final MultiAccountWsData copy(@Nullable String accountTag, @Nullable String accountType, @Nullable String currency, @Nullable String time, @Nullable String topic, @Nullable String transferAmount, @Nullable String userId) {
        return new MultiAccountWsData(accountTag, accountType, currency, time, topic, transferAmount, userId);
    }

    @Nullable
    public final String getAccountTag() {
        return this.accountTag;
    }

    @Nullable
    public final String getAccountType() {
        return this.accountType;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getTime() {
        return this.time;
    }

    @Nullable
    public final String getTopic() {
        return this.topic;
    }

    @Nullable
    public final String getTransferAmount() {
        return this.transferAmount;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.accountTag;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.accountType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currency;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.time;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.topic;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.transferAmount;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.userId;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MultiAccountWsData(accountTag=" + this.accountTag + ", accountType=" + this.accountType + ", currency=" + this.currency + ", time=" + this.time + ", topic=" + this.topic + ", transferAmount=" + this.transferAmount + ", userId=" + this.userId + ')';
    }

    public /* synthetic */ MultiAccountWsData(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7);
    }
}
