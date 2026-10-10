package com.kubi.sdk.timpush.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TimPushInfo.kt */
/* JADX INFO: loaded from: classes43.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, m90084d2 = {"Lcom/kubi/sdk/timpush/data/model/TimPushInfo;", "Landroid/os/Parcelable;", "url", "", "messageId", "templateCode", "businessCustomTracking", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getMessageId", "getTemplateCode", "getBusinessCustomTracking", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LTimPush_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TimPushInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TimPushInfo> CREATOR = new C24201a();

    @SerializedName("business_custom_tracking")
    @Nullable
    private final String businessCustomTracking;

    @SerializedName("__mc_message_id")
    @Nullable
    private final String messageId;

    @SerializedName("__mc_template_code")
    @Nullable
    private final String templateCode;

    @SerializedName("url")
    @Nullable
    private final String url;

    /* JADX INFO: renamed from: com.kubi.sdk.timpush.data.model.TimPushInfo$a */
    /* JADX INFO: compiled from: TimPushInfo.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C24201a implements Parcelable.Creator<TimPushInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TimPushInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TimPushInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final TimPushInfo[] newArray(int i11) {
            return new TimPushInfo[i11];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimPushInfo)) {
            return false;
        }
        TimPushInfo timPushInfo = (TimPushInfo) other;
        return Intrinsics.areEqual(this.url, timPushInfo.url) && Intrinsics.areEqual(this.messageId, timPushInfo.messageId) && Intrinsics.areEqual(this.templateCode, timPushInfo.templateCode) && Intrinsics.areEqual(this.businessCustomTracking, timPushInfo.businessCustomTracking);
    }

    public static /* synthetic */ TimPushInfo copy$default(TimPushInfo timPushInfo, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = timPushInfo.url;
        }
        if ((i11 & 2) != 0) {
            str2 = timPushInfo.messageId;
        }
        if ((i11 & 4) != 0) {
            str3 = timPushInfo.templateCode;
        }
        if ((i11 & 8) != 0) {
            str4 = timPushInfo.businessCustomTracking;
        }
        return timPushInfo.copy(str, str2, str3, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTemplateCode() {
        return this.templateCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBusinessCustomTracking() {
        return this.businessCustomTracking;
    }

    @NotNull
    public final TimPushInfo copy(@Nullable String url, @Nullable String messageId, @Nullable String templateCode, @Nullable String businessCustomTracking) {
        return new TimPushInfo(url, messageId, templateCode, businessCustomTracking);
    }

    @Nullable
    public final String getBusinessCustomTracking() {
        return this.businessCustomTracking;
    }

    @Nullable
    public final String getMessageId() {
        return this.messageId;
    }

    @Nullable
    public final String getTemplateCode() {
        return this.templateCode;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.messageId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.templateCode;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.businessCustomTracking;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TimPushInfo(url=" + this.url + ", messageId=" + this.messageId + ", templateCode=" + this.templateCode + ", businessCustomTracking=" + this.businessCustomTracking + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.url);
        dest.writeString(this.messageId);
        dest.writeString(this.templateCode);
        dest.writeString(this.businessCustomTracking);
    }

    public TimPushInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.url = str;
        this.messageId = str2;
        this.templateCode = str3;
        this.businessCustomTracking = str4;
    }
}
