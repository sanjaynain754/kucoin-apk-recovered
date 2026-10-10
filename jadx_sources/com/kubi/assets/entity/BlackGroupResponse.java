package com.kubi.assets.entity;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.appsflyer.AppsFlyerProperties;
import com.kubi.assets.api.R$string;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: BlackGroupResponse.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0015\u001a\u00020\u0003J\u000e\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u001aJ\t\u0010\u001b\u001a\u00020\u0003HÂ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003JC\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010!\u001a\u00020\"J\u0013\u0010#\u001a\u00020\u001a2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\"HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\"R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000e¨\u0006-"}, m90084d2 = {"Lcom/kubi/assets/entity/BlackGroupResponse;", "Landroid/os/Parcelable;", "expireAt", "", AppsFlyerProperties.CHANNEL, "", "groupCode", "freezeContent", "freezeHelpUrl", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChannel", "()Ljava/lang/String;", "setChannel", "(Ljava/lang/String;)V", "getGroupCode", "setGroupCode", "getFreezeContent", "setFreezeContent", "getFreezeHelpUrl", "setFreezeHelpUrl", "getTime", "getWithdrawLimitTips", "context", "Landroid/content/Context;", "isLimitWithdraw", "", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class BlackGroupResponse implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BlackGroupResponse> CREATOR = new Creator();

    @Nullable
    private String channel;
    private long expireAt;

    @Nullable
    private String freezeContent;

    @Nullable
    private String freezeHelpUrl;

    @Nullable
    private String groupCode;

    /* JADX INFO: compiled from: BlackGroupResponse.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<BlackGroupResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BlackGroupResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BlackGroupResponse(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BlackGroupResponse[] newArray(int i11) {
            return new BlackGroupResponse[i11];
        }
    }

    public BlackGroupResponse() {
        this(0L, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlackGroupResponse)) {
            return false;
        }
        BlackGroupResponse blackGroupResponse = (BlackGroupResponse) other;
        return this.expireAt == blackGroupResponse.expireAt && Intrinsics.areEqual(this.channel, blackGroupResponse.channel) && Intrinsics.areEqual(this.groupCode, blackGroupResponse.groupCode) && Intrinsics.areEqual(this.freezeContent, blackGroupResponse.freezeContent) && Intrinsics.areEqual(this.freezeHelpUrl, blackGroupResponse.freezeHelpUrl);
    }

    public BlackGroupResponse(long j11, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.expireAt = j11;
        this.channel = str;
        this.groupCode = str2;
        this.freezeContent = str3;
        this.freezeHelpUrl = str4;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final long getExpireAt() {
        return this.expireAt;
    }

    public static /* synthetic */ BlackGroupResponse copy$default(BlackGroupResponse blackGroupResponse, long j11, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = blackGroupResponse.expireAt;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            str = blackGroupResponse.channel;
        }
        String str5 = str;
        if ((i11 & 4) != 0) {
            str2 = blackGroupResponse.groupCode;
        }
        String str6 = str2;
        if ((i11 & 8) != 0) {
            str3 = blackGroupResponse.freezeContent;
        }
        String str7 = str3;
        if ((i11 & 16) != 0) {
            str4 = blackGroupResponse.freezeHelpUrl;
        }
        return blackGroupResponse.copy(j12, str5, str6, str7, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getGroupCode() {
        return this.groupCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFreezeContent() {
        return this.freezeContent;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFreezeHelpUrl() {
        return this.freezeHelpUrl;
    }

    @NotNull
    public final BlackGroupResponse copy(long expireAt, @Nullable String channel, @Nullable String groupCode, @Nullable String freezeContent, @Nullable String freezeHelpUrl) {
        return new BlackGroupResponse(expireAt, channel, groupCode, freezeContent, freezeHelpUrl);
    }

    @Nullable
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    public final String getFreezeContent() {
        return this.freezeContent;
    }

    @Nullable
    public final String getFreezeHelpUrl() {
        return this.freezeHelpUrl;
    }

    @Nullable
    public final String getGroupCode() {
        return this.groupCode;
    }

    public final long getTime() {
        return Intrinsics.areEqual(this.channel, BlackGroupResponseKt.FREEZE_CENTER) ? this.expireAt - System.currentTimeMillis() : this.expireAt * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    @NotNull
    public final String getWithdrawLimitTips(@NotNull Context context) {
        int i11;
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        if (Intrinsics.areEqual(this.channel, BlackGroupResponseKt.FREEZE_CENTER) && (str = this.freezeContent) != null && true == (!StringsKt.isBlank(str))) {
            String str2 = this.freezeContent;
            return str2 == null ? "" : str2;
        }
        String str3 = this.channel;
        if (str3 != null) {
            switch (str3) {
                case "SELF":
                    i11 = R$string.withdraw_forbidden_tips;
                    break;
                case "SUB_POSITION":
                    i11 = R$string.withdraw_limit_sub_position_tips;
                    break;
                case "OTC_DANGER":
                    i11 = R$string.withdraw_limit_otc_danger_tips;
                    break;
                case "POSITION":
                    i11 = R$string.cross_position_cannot_withdraw;
                    break;
                default:
                    i11 = R$string.withdraw_limit_default_tips;
                    break;
            }
        } else {
            i11 = R$string.withdraw_limit_default_tips;
        }
        String string = context.getString(i11);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.expireAt) * 31;
        String str = this.channel;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.groupCode;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.freezeContent;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.freezeHelpUrl;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean isLimitWithdraw() {
        String str = this.channel;
        return !(str == null || str.length() == 0);
    }

    public final void setChannel(@Nullable String str) {
        this.channel = str;
    }

    public final void setFreezeContent(@Nullable String str) {
        this.freezeContent = str;
    }

    public final void setFreezeHelpUrl(@Nullable String str) {
        this.freezeHelpUrl = str;
    }

    public final void setGroupCode(@Nullable String str) {
        this.groupCode = str;
    }

    @NotNull
    public String toString() {
        return "BlackGroupResponse(expireAt=" + this.expireAt + ", channel=" + this.channel + ", groupCode=" + this.groupCode + ", freezeContent=" + this.freezeContent + ", freezeHelpUrl=" + this.freezeHelpUrl + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.expireAt);
        dest.writeString(this.channel);
        dest.writeString(this.groupCode);
        dest.writeString(this.freezeContent);
        dest.writeString(this.freezeHelpUrl);
    }

    public /* synthetic */ BlackGroupResponse(long j11, String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? -1L : j11, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4);
    }
}
