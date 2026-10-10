package io.trtc.tuikit.atomicxcore.api.message;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39392b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JC\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001cHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001cHÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006("}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;", "Landroid/os/Parcelable;", "userID", "", "avatarURL", "nickname", TUIConstants.TUIContact.FRIEND_REMARK, TUIConstantDefine.NAME_CARD, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAvatarURL", "()Ljava/lang/String;", "setAvatarURL", "(Ljava/lang/String;)V", "getFriendRemark", "setFriendRemark", "getNameCard", "setNameCard", "getNickname", "setNickname", "getUserID", "setUserID", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class MessageSenderInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MessageSenderInfo> CREATOR = new Creator();

    @Nullable
    private String avatarURL;

    @Nullable
    private String friendRemark;

    @Nullable
    private String nameCard;

    @Nullable
    private String nickname;

    @NotNull
    private String userID;

    @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<MessageSenderInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MessageSenderInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MessageSenderInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MessageSenderInfo[] newArray(int i11) {
            return new MessageSenderInfo[i11];
        }
    }

    public MessageSenderInfo() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageSenderInfo)) {
            return false;
        }
        MessageSenderInfo messageSenderInfo = (MessageSenderInfo) other;
        return Intrinsics.areEqual(this.userID, messageSenderInfo.userID) && Intrinsics.areEqual(this.avatarURL, messageSenderInfo.avatarURL) && Intrinsics.areEqual(this.nickname, messageSenderInfo.nickname) && Intrinsics.areEqual(this.friendRemark, messageSenderInfo.friendRemark) && Intrinsics.areEqual(this.nameCard, messageSenderInfo.nameCard);
    }

    public MessageSenderInfo(@NotNull String userID, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        this.userID = userID;
        this.avatarURL = str;
        this.nickname = str2;
        this.friendRemark = str3;
        this.nameCard = str4;
    }

    public static /* synthetic */ MessageSenderInfo copy$default(MessageSenderInfo messageSenderInfo, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = messageSenderInfo.userID;
        }
        if ((i11 & 2) != 0) {
            str2 = messageSenderInfo.avatarURL;
        }
        if ((i11 & 4) != 0) {
            str3 = messageSenderInfo.nickname;
        }
        if ((i11 & 8) != 0) {
            str4 = messageSenderInfo.friendRemark;
        }
        if ((i11 & 16) != 0) {
            str5 = messageSenderInfo.nameCard;
        }
        String str6 = str5;
        String str7 = str3;
        return messageSenderInfo.copy(str, str2, str7, str4, str6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserID() {
        return this.userID;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAvatarURL() {
        return this.avatarURL;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFriendRemark() {
        return this.friendRemark;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNameCard() {
        return this.nameCard;
    }

    @Nullable
    public final String getAvatarURL() {
        return this.avatarURL;
    }

    @Nullable
    public final String getFriendRemark() {
        return this.friendRemark;
    }

    @Nullable
    public final String getNameCard() {
        return this.nameCard;
    }

    @Nullable
    public final String getNickname() {
        return this.nickname;
    }

    @NotNull
    public final String getUserID() {
        return this.userID;
    }

    public int hashCode() {
        int iHashCode = this.userID.hashCode() * 31;
        String str = this.avatarURL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nickname;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.friendRemark;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nameCard;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setAvatarURL(@Nullable String str) {
        this.avatarURL = str;
    }

    public final void setFriendRemark(@Nullable String str) {
        this.friendRemark = str;
    }

    public final void setNameCard(@Nullable String str) {
        this.nameCard = str;
    }

    public final void setNickname(@Nullable String str) {
        this.nickname = str;
    }

    public final void setUserID(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userID = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("MessageSenderInfo(userID=");
        sb2.append(this.userID);
        sb2.append(", avatarURL=");
        sb2.append(this.avatarURL);
        sb2.append(", nickname=");
        sb2.append(this.nickname);
        sb2.append(", friendRemark=");
        sb2.append(this.friendRemark);
        sb2.append(", nameCard=");
        return AbstractC39392b.m88221a(sb2, this.nameCard, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.userID);
        parcel.writeString(this.avatarURL);
        parcel.writeString(this.nickname);
        parcel.writeString(this.friendRemark);
        parcel.writeString(this.nameCard);
    }

    @NotNull
    public final MessageSenderInfo copy(@NotNull String userID, @Nullable String avatarURL, @Nullable String nickname, @Nullable String friendRemark, @Nullable String nameCard) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        return new MessageSenderInfo(userID, avatarURL, nickname, friendRemark, nameCard);
    }

    public /* synthetic */ MessageSenderInfo(String str, String str2, String str3, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5);
    }
}
