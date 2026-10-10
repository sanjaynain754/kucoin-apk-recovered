package com.kubi.payment.channel.data.entities;

import androidx.annotation.Keep;
import androidx.autofill.HintConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.tencent.rmonitor.base.p144db.table.DropFrameTable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Capitual.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001$BO\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\r\"\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\r¨\u0006%"}, m90084d2 = {"Lcom/kubi/payment/channel/data/entities/ChannelKycRequest;", "", "channelId", "", "fullName", HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS, FirebaseAnalytics.Param.CURRENCY, DropFrameTable.COLUMN_SCENE, "userType", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChannelId", "()Ljava/lang/String;", "getFullName", "getEmailAddress", "setEmailAddress", "(Ljava/lang/String;)V", "getCurrency", "getScene", "getUserType", "getPhoneNumber", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ChannelKycRequest {

    @NotNull
    public static final String SCENE_DEPOSIT = "deposit";

    @NotNull
    public static final String SCENE_WITHDRAW = "withdraw";

    @SerializedName("channelId")
    @Nullable
    private final String channelId;

    @SerializedName(FirebaseAnalytics.Param.CURRENCY)
    @Nullable
    private final String currency;

    @SerializedName("userEmail")
    @Nullable
    private String emailAddress;

    @SerializedName("fullName")
    @Nullable
    private final String fullName;

    @SerializedName("userPhone")
    @Nullable
    private final String phoneNumber;

    @SerializedName(DropFrameTable.COLUMN_SCENE)
    @Nullable
    private final String scene;

    @SerializedName("userType")
    @Nullable
    private final String userType;

    public ChannelKycRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.channelId = str;
        this.fullName = str2;
        this.emailAddress = str3;
        this.currency = str4;
        this.scene = str5;
        this.userType = str6;
        this.phoneNumber = str7;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelKycRequest)) {
            return false;
        }
        ChannelKycRequest channelKycRequest = (ChannelKycRequest) other;
        return Intrinsics.areEqual(this.channelId, channelKycRequest.channelId) && Intrinsics.areEqual(this.fullName, channelKycRequest.fullName) && Intrinsics.areEqual(this.emailAddress, channelKycRequest.emailAddress) && Intrinsics.areEqual(this.currency, channelKycRequest.currency) && Intrinsics.areEqual(this.scene, channelKycRequest.scene) && Intrinsics.areEqual(this.userType, channelKycRequest.userType) && Intrinsics.areEqual(this.phoneNumber, channelKycRequest.phoneNumber);
    }

    public static /* synthetic */ ChannelKycRequest copy$default(ChannelKycRequest channelKycRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = channelKycRequest.channelId;
        }
        if ((i11 & 2) != 0) {
            str2 = channelKycRequest.fullName;
        }
        if ((i11 & 4) != 0) {
            str3 = channelKycRequest.emailAddress;
        }
        if ((i11 & 8) != 0) {
            str4 = channelKycRequest.currency;
        }
        if ((i11 & 16) != 0) {
            str5 = channelKycRequest.scene;
        }
        if ((i11 & 32) != 0) {
            str6 = channelKycRequest.userType;
        }
        if ((i11 & 64) != 0) {
            str7 = channelKycRequest.phoneNumber;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return channelKycRequest.copy(str, str2, str11, str4, str10, str8, str9);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEmailAddress() {
        return this.emailAddress;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getScene() {
        return this.scene;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUserType() {
        return this.userType;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    @NotNull
    public final ChannelKycRequest copy(@Nullable String channelId, @Nullable String fullName, @Nullable String emailAddress, @Nullable String currency, @Nullable String scene, @Nullable String userType, @Nullable String phoneNumber) {
        return new ChannelKycRequest(channelId, fullName, emailAddress, currency, scene, userType, phoneNumber);
    }

    @Nullable
    public final String getChannelId() {
        return this.channelId;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getEmailAddress() {
        return this.emailAddress;
    }

    @Nullable
    public final String getFullName() {
        return this.fullName;
    }

    @Nullable
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Nullable
    public final String getScene() {
        return this.scene;
    }

    @Nullable
    public final String getUserType() {
        return this.userType;
    }

    public int hashCode() {
        String str = this.channelId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fullName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.emailAddress;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.currency;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.scene;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.userType;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.phoneNumber;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public final void setEmailAddress(@Nullable String str) {
        this.emailAddress = str;
    }

    @NotNull
    public String toString() {
        return "ChannelKycRequest(channelId=" + this.channelId + ", fullName=" + this.fullName + ", emailAddress=" + this.emailAddress + ", currency=" + this.currency + ", scene=" + this.scene + ", userType=" + this.userType + ", phoneNumber=" + this.phoneNumber + ')';
    }

    public /* synthetic */ ChannelKycRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i11 & 32) != 0 ? "personal" : str6, str7);
    }
}
