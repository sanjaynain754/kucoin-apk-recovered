package com.kubi.mine.lib.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UserInfoEntity.kt */
/* JADX INFO: loaded from: classes29.dex */
@Keep
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003JV\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010$J\u0006\u0010%\u001a\u00020&J\u0013\u0010'\u001a\u00020\u00032\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020&HÖ\u0001J\t\u0010+\u001a\u00020\u0005HÖ\u0001J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020&R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014¨\u00061"}, m90084d2 = {"Lcom/kubi/mine/lib/entity/QueryAuditInfoResponse;", "Landroid/os/Parcelable;", "canAuditAvatar", "", "avatar", "", "avatarLimitMsg", "canAuditNickname", "nickName", "nickNameLimitMsg", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getCanAuditAvatar", "()Ljava/lang/Boolean;", "setCanAuditAvatar", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getAvatar", "()Ljava/lang/String;", "setAvatar", "(Ljava/lang/String;)V", "getAvatarLimitMsg", "setAvatarLimitMsg", "getCanAuditNickname", "setCanAuditNickname", "getNickName", "setNickName", "getNickNameLimitMsg", "setNickNameLimitMsg", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/mine/lib/entity/QueryAuditInfoResponse;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class QueryAuditInfoResponse implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<QueryAuditInfoResponse> CREATOR = new C18933a();

    @Nullable
    private String avatar;

    @Nullable
    private String avatarLimitMsg;

    @Nullable
    private Boolean canAuditAvatar;

    @Nullable
    private Boolean canAuditNickname;

    @Nullable
    private String nickName;

    @Nullable
    private String nickNameLimitMsg;

    /* JADX INFO: renamed from: com.kubi.mine.lib.entity.QueryAuditInfoResponse$a */
    /* JADX INFO: compiled from: UserInfoEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C18933a implements Parcelable.Creator<QueryAuditInfoResponse> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final QueryAuditInfoResponse createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new QueryAuditInfoResponse(boolValueOf, string, string2, boolValueOf2, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final QueryAuditInfoResponse[] newArray(int i11) {
            return new QueryAuditInfoResponse[i11];
        }
    }

    public QueryAuditInfoResponse() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryAuditInfoResponse)) {
            return false;
        }
        QueryAuditInfoResponse queryAuditInfoResponse = (QueryAuditInfoResponse) other;
        return Intrinsics.areEqual(this.canAuditAvatar, queryAuditInfoResponse.canAuditAvatar) && Intrinsics.areEqual(this.avatar, queryAuditInfoResponse.avatar) && Intrinsics.areEqual(this.avatarLimitMsg, queryAuditInfoResponse.avatarLimitMsg) && Intrinsics.areEqual(this.canAuditNickname, queryAuditInfoResponse.canAuditNickname) && Intrinsics.areEqual(this.nickName, queryAuditInfoResponse.nickName) && Intrinsics.areEqual(this.nickNameLimitMsg, queryAuditInfoResponse.nickNameLimitMsg);
    }

    public QueryAuditInfoResponse(@Nullable Boolean bool, @Nullable String str, @Nullable String str2, @Nullable Boolean bool2, @Nullable String str3, @Nullable String str4) {
        this.canAuditAvatar = bool;
        this.avatar = str;
        this.avatarLimitMsg = str2;
        this.canAuditNickname = bool2;
        this.nickName = str3;
        this.nickNameLimitMsg = str4;
    }

    public static /* synthetic */ QueryAuditInfoResponse copy$default(QueryAuditInfoResponse queryAuditInfoResponse, Boolean bool, String str, String str2, Boolean bool2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = queryAuditInfoResponse.canAuditAvatar;
        }
        if ((i11 & 2) != 0) {
            str = queryAuditInfoResponse.avatar;
        }
        if ((i11 & 4) != 0) {
            str2 = queryAuditInfoResponse.avatarLimitMsg;
        }
        if ((i11 & 8) != 0) {
            bool2 = queryAuditInfoResponse.canAuditNickname;
        }
        if ((i11 & 16) != 0) {
            str3 = queryAuditInfoResponse.nickName;
        }
        if ((i11 & 32) != 0) {
            str4 = queryAuditInfoResponse.nickNameLimitMsg;
        }
        String str5 = str3;
        String str6 = str4;
        return queryAuditInfoResponse.copy(bool, str, str2, bool2, str5, str6);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getCanAuditAvatar() {
        return this.canAuditAvatar;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAvatarLimitMsg() {
        return this.avatarLimitMsg;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getCanAuditNickname() {
        return this.canAuditNickname;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getNickNameLimitMsg() {
        return this.nickNameLimitMsg;
    }

    @NotNull
    public final QueryAuditInfoResponse copy(@Nullable Boolean canAuditAvatar, @Nullable String avatar, @Nullable String avatarLimitMsg, @Nullable Boolean canAuditNickname, @Nullable String nickName, @Nullable String nickNameLimitMsg) {
        return new QueryAuditInfoResponse(canAuditAvatar, avatar, avatarLimitMsg, canAuditNickname, nickName, nickNameLimitMsg);
    }

    @Nullable
    public final String getAvatar() {
        return this.avatar;
    }

    @Nullable
    public final String getAvatarLimitMsg() {
        return this.avatarLimitMsg;
    }

    @Nullable
    public final Boolean getCanAuditAvatar() {
        return this.canAuditAvatar;
    }

    @Nullable
    public final Boolean getCanAuditNickname() {
        return this.canAuditNickname;
    }

    @Nullable
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    public final String getNickNameLimitMsg() {
        return this.nickNameLimitMsg;
    }

    public int hashCode() {
        Boolean bool = this.canAuditAvatar;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.avatar;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.avatarLimitMsg;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool2 = this.canAuditNickname;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.nickName;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nickNameLimitMsg;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setAvatar(@Nullable String str) {
        this.avatar = str;
    }

    public final void setAvatarLimitMsg(@Nullable String str) {
        this.avatarLimitMsg = str;
    }

    public final void setCanAuditAvatar(@Nullable Boolean bool) {
        this.canAuditAvatar = bool;
    }

    public final void setCanAuditNickname(@Nullable Boolean bool) {
        this.canAuditNickname = bool;
    }

    public final void setNickName(@Nullable String str) {
        this.nickName = str;
    }

    public final void setNickNameLimitMsg(@Nullable String str) {
        this.nickNameLimitMsg = str;
    }

    @NotNull
    public String toString() {
        return "QueryAuditInfoResponse(canAuditAvatar=" + this.canAuditAvatar + ", avatar=" + this.avatar + ", avatarLimitMsg=" + this.avatarLimitMsg + ", canAuditNickname=" + this.canAuditNickname + ", nickName=" + this.nickName + ", nickNameLimitMsg=" + this.nickNameLimitMsg + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Boolean bool = this.canAuditAvatar;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.avatar);
        dest.writeString(this.avatarLimitMsg);
        Boolean bool2 = this.canAuditNickname;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.nickName);
        dest.writeString(this.nickNameLimitMsg);
    }

    public /* synthetic */ QueryAuditInfoResponse(Boolean bool, String str, String str2, Boolean bool2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bool, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : bool2, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : str4);
    }
}
