package io.trtc.tuikit.atomicxcore.api.contact;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.uimanager.ViewProps;
import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import com.tencent.imsdk.p128v2.V2TIMManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003JK\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001J\u0013\u0010*\u001a\u00020\u00112\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020)HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\u0019\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020)HÖ\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\r\"\u0004\b\u001a\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\r\"\u0004\b \u0010\u000f¨\u00064"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/contact/GroupMember;", "Landroid/os/Parcelable;", "userID", "", "nickname", "avatarURL", TUIConstantDefine.NAME_CARD, ViewProps.ROLE, "Lio/trtc/tuikit/atomicxcore/api/contact/GroupMemberRole;", "muteUntil", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/contact/GroupMemberRole;J)V", "getAvatarURL", "()Ljava/lang/String;", "setAvatarURL", "(Ljava/lang/String;)V", "isMuted", "", "()Z", "getMuteUntil", "()J", "setMuteUntil", "(J)V", "getNameCard", "setNameCard", "getNickname", "setNickname", "getRole", "()Lio/trtc/tuikit/atomicxcore/api/contact/GroupMemberRole;", "setRole", "(Lio/trtc/tuikit/atomicxcore/api/contact/GroupMemberRole;)V", "getUserID", "setUserID", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class GroupMember implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<GroupMember> CREATOR = new Creator();

    @Nullable
    private String avatarURL;
    private long muteUntil;

    @Nullable
    private String nameCard;

    @Nullable
    private String nickname;

    @NotNull
    private GroupMemberRole role;

    @NotNull
    private String userID;

    @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<GroupMember> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final GroupMember createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GroupMember(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), GroupMemberRole.valueOf(parcel.readString()), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final GroupMember[] newArray(int i11) {
            return new GroupMember[i11];
        }
    }

    public GroupMember(@NotNull String userID, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull GroupMemberRole role, long j11) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(role, "role");
        this.userID = userID;
        this.nickname = str;
        this.avatarURL = str2;
        this.nameCard = str3;
        this.role = role;
        this.muteUntil = j11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupMember)) {
            return false;
        }
        GroupMember groupMember = (GroupMember) other;
        return Intrinsics.areEqual(this.userID, groupMember.userID) && Intrinsics.areEqual(this.nickname, groupMember.nickname) && Intrinsics.areEqual(this.avatarURL, groupMember.avatarURL) && Intrinsics.areEqual(this.nameCard, groupMember.nameCard) && this.role == groupMember.role && this.muteUntil == groupMember.muteUntil;
    }

    public static /* synthetic */ GroupMember copy$default(GroupMember groupMember, String str, String str2, String str3, String str4, GroupMemberRole groupMemberRole, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = groupMember.userID;
        }
        if ((i11 & 2) != 0) {
            str2 = groupMember.nickname;
        }
        if ((i11 & 4) != 0) {
            str3 = groupMember.avatarURL;
        }
        if ((i11 & 8) != 0) {
            str4 = groupMember.nameCard;
        }
        if ((i11 & 16) != 0) {
            groupMemberRole = groupMember.role;
        }
        if ((i11 & 32) != 0) {
            j11 = groupMember.muteUntil;
        }
        long j12 = j11;
        GroupMemberRole groupMemberRole2 = groupMemberRole;
        String str5 = str3;
        return groupMember.copy(str, str2, str5, str4, groupMemberRole2, j12);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserID() {
        return this.userID;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAvatarURL() {
        return this.avatarURL;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNameCard() {
        return this.nameCard;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final GroupMemberRole getRole() {
        return this.role;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getMuteUntil() {
        return this.muteUntil;
    }

    @Nullable
    public final String getAvatarURL() {
        return this.avatarURL;
    }

    public final long getMuteUntil() {
        return this.muteUntil;
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
    public final GroupMemberRole getRole() {
        return this.role;
    }

    @NotNull
    public final String getUserID() {
        return this.userID;
    }

    public int hashCode() {
        int iHashCode = this.userID.hashCode() * 31;
        String str = this.nickname;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.avatarURL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nameCard;
        return Long.hashCode(this.muteUntil) + ((this.role.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31)) * 31);
    }

    public final boolean isMuted() {
        if (this.muteUntil == 0) {
            return false;
        }
        return this.muteUntil > V2TIMManager.getInstance().getServerTime();
    }

    public final void setAvatarURL(@Nullable String str) {
        this.avatarURL = str;
    }

    public final void setMuteUntil(long j11) {
        this.muteUntil = j11;
    }

    public final void setNameCard(@Nullable String str) {
        this.nameCard = str;
    }

    public final void setNickname(@Nullable String str) {
        this.nickname = str;
    }

    public final void setRole(@NotNull GroupMemberRole groupMemberRole) {
        Intrinsics.checkNotNullParameter(groupMemberRole, "<set-?>");
        this.role = groupMemberRole;
    }

    public final void setUserID(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userID = str;
    }

    @NotNull
    public String toString() {
        return "GroupMember(userID=" + this.userID + ", nickname=" + this.nickname + ", avatarURL=" + this.avatarURL + ", nameCard=" + this.nameCard + ", role=" + this.role + ", muteUntil=" + this.muteUntil + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.userID);
        parcel.writeString(this.nickname);
        parcel.writeString(this.avatarURL);
        parcel.writeString(this.nameCard);
        parcel.writeString(this.role.name());
        parcel.writeLong(this.muteUntil);
    }

    @NotNull
    public final GroupMember copy(@NotNull String userID, @Nullable String nickname, @Nullable String avatarURL, @Nullable String nameCard, @NotNull GroupMemberRole role, long muteUntil) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(role, "role");
        return new GroupMember(userID, nickname, avatarURL, nameCard, role, muteUntil);
    }

    public /* synthetic */ GroupMember(String str, String str2, String str3, String str4, GroupMemberRole groupMemberRole, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? GroupMemberRole.MEMBER : groupMemberRole, (i11 & 32) != 0 ? 0L : j11);
    }
}
