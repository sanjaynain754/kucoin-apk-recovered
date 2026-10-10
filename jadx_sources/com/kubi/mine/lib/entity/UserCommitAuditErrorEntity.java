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
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J>\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u0013\u0010\u001f\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001eHÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001eR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u0013\u0010\u000b\"\u0004\b\u0014\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012¨\u0006)"}, m90084d2 = {"Lcom/kubi/mine/lib/entity/UserCommitAuditErrorEntity;", "Landroid/os/Parcelable;", "canAuditAvatar", "", "avatarLimitMsg", "", "canAuditNickname", "nickNameLimitMsg", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getCanAuditAvatar", "()Ljava/lang/Boolean;", "setCanAuditAvatar", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getAvatarLimitMsg", "()Ljava/lang/String;", "setAvatarLimitMsg", "(Ljava/lang/String;)V", "getCanAuditNickname", "setCanAuditNickname", "getNickNameLimitMsg", "setNickNameLimitMsg", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/kubi/mine/lib/entity/UserCommitAuditErrorEntity;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UserCommitAuditErrorEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UserCommitAuditErrorEntity> CREATOR = new C18936a();

    @Nullable
    private String avatarLimitMsg;

    @Nullable
    private Boolean canAuditAvatar;

    @Nullable
    private Boolean canAuditNickname;

    @Nullable
    private String nickNameLimitMsg;

    /* JADX INFO: renamed from: com.kubi.mine.lib.entity.UserCommitAuditErrorEntity$a */
    /* JADX INFO: compiled from: UserInfoEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C18936a implements Parcelable.Creator<UserCommitAuditErrorEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UserCommitAuditErrorEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new UserCommitAuditErrorEntity(boolValueOf, string, boolValueOf2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UserCommitAuditErrorEntity[] newArray(int i11) {
            return new UserCommitAuditErrorEntity[i11];
        }
    }

    public UserCommitAuditErrorEntity() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserCommitAuditErrorEntity)) {
            return false;
        }
        UserCommitAuditErrorEntity userCommitAuditErrorEntity = (UserCommitAuditErrorEntity) other;
        return Intrinsics.areEqual(this.canAuditAvatar, userCommitAuditErrorEntity.canAuditAvatar) && Intrinsics.areEqual(this.avatarLimitMsg, userCommitAuditErrorEntity.avatarLimitMsg) && Intrinsics.areEqual(this.canAuditNickname, userCommitAuditErrorEntity.canAuditNickname) && Intrinsics.areEqual(this.nickNameLimitMsg, userCommitAuditErrorEntity.nickNameLimitMsg);
    }

    public UserCommitAuditErrorEntity(@Nullable Boolean bool, @Nullable String str, @Nullable Boolean bool2, @Nullable String str2) {
        this.canAuditAvatar = bool;
        this.avatarLimitMsg = str;
        this.canAuditNickname = bool2;
        this.nickNameLimitMsg = str2;
    }

    public static /* synthetic */ UserCommitAuditErrorEntity copy$default(UserCommitAuditErrorEntity userCommitAuditErrorEntity, Boolean bool, String str, Boolean bool2, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = userCommitAuditErrorEntity.canAuditAvatar;
        }
        if ((i11 & 2) != 0) {
            str = userCommitAuditErrorEntity.avatarLimitMsg;
        }
        if ((i11 & 4) != 0) {
            bool2 = userCommitAuditErrorEntity.canAuditNickname;
        }
        if ((i11 & 8) != 0) {
            str2 = userCommitAuditErrorEntity.nickNameLimitMsg;
        }
        return userCommitAuditErrorEntity.copy(bool, str, bool2, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getCanAuditAvatar() {
        return this.canAuditAvatar;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAvatarLimitMsg() {
        return this.avatarLimitMsg;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getCanAuditNickname() {
        return this.canAuditNickname;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNickNameLimitMsg() {
        return this.nickNameLimitMsg;
    }

    @NotNull
    public final UserCommitAuditErrorEntity copy(@Nullable Boolean canAuditAvatar, @Nullable String avatarLimitMsg, @Nullable Boolean canAuditNickname, @Nullable String nickNameLimitMsg) {
        return new UserCommitAuditErrorEntity(canAuditAvatar, avatarLimitMsg, canAuditNickname, nickNameLimitMsg);
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
    public final String getNickNameLimitMsg() {
        return this.nickNameLimitMsg;
    }

    public int hashCode() {
        Boolean bool = this.canAuditAvatar;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.avatarLimitMsg;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.canAuditNickname;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.nickNameLimitMsg;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
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

    public final void setNickNameLimitMsg(@Nullable String str) {
        this.nickNameLimitMsg = str;
    }

    @NotNull
    public String toString() {
        return "UserCommitAuditErrorEntity(canAuditAvatar=" + this.canAuditAvatar + ", avatarLimitMsg=" + this.avatarLimitMsg + ", canAuditNickname=" + this.canAuditNickname + ", nickNameLimitMsg=" + this.nickNameLimitMsg + ')';
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
        dest.writeString(this.avatarLimitMsg);
        Boolean bool2 = this.canAuditNickname;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.nickNameLimitMsg);
    }

    public /* synthetic */ UserCommitAuditErrorEntity(Boolean bool, String str, Boolean bool2, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bool, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : bool2, (i11 & 8) != 0 ? null : str2);
    }
}
