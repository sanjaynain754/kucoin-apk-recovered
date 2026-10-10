package io.trtc.tuikit.atomicxcore.api.message;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39391a;
import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39392b;
import io.trtc.tuikit.atomicxcore.api.contact.GroupJoinOption;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0013\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0013\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'(¨\u0006)"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo;", "Landroid/os/Parcelable;", "()V", "CancelGroupAdmin", "ChangeGroupAvatar", "ChangeGroupIntroduction", "ChangeGroupMuteAll", "ChangeGroupName", "ChangeGroupNotification", "ChangeGroupOwner", "ChangeInviteToGroupApproval", "ChangeJoinGroupApproval", "InviteToGroup", "JoinGroup", "KickedFromGroup", "MuteGroupMember", "PinGroupMessage", "QuitGroup", "RecallMessage", "SetGroupAdmin", "Unknown", "UnpinGroupMessage", "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$CancelGroupAdmin;", "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeGroupAvatar;", "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeGroupIntroduction;", "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeGroupMuteAll;", "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeGroupName;", "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeGroupNotification;", "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeGroupOwner;", "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeInviteToGroupApproval;", "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeJoinGroupApproval;", "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$InviteToGroup;", "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$JoinGroup;", "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$KickedFromGroup;", "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$MuteGroupMember;", "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$PinGroupMessage;", "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$QuitGroup;", "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$RecallMessage;", "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$SetGroupAdmin;", "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$Unknown;", "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$UnpinGroupMessage;", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public abstract class SystemMessageInfo implements Parcelable {

    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u001c"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$CancelGroupAdmin;", "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo;", "groupID", "", "cancelAdminOperator", "cancelAdminMembersShowName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCancelAdminMembersShowName", "()Ljava/lang/String;", "getCancelAdminOperator", "getGroupID", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final /* data */ class CancelGroupAdmin extends SystemMessageInfo {

        @NotNull
        public static final Parcelable.Creator<CancelGroupAdmin> CREATOR = new Creator();

        @NotNull
        private final String cancelAdminMembersShowName;

        @NotNull
        private final String cancelAdminOperator;

        @NotNull
        private final String groupID;

        @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
        public static final class Creator implements Parcelable.Creator<CancelGroupAdmin> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final CancelGroupAdmin createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CancelGroupAdmin(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final CancelGroupAdmin[] newArray(int i11) {
                return new CancelGroupAdmin[i11];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CancelGroupAdmin)) {
                return false;
            }
            CancelGroupAdmin cancelGroupAdmin = (CancelGroupAdmin) other;
            return Intrinsics.areEqual(this.groupID, cancelGroupAdmin.groupID) && Intrinsics.areEqual(this.cancelAdminOperator, cancelGroupAdmin.cancelAdminOperator) && Intrinsics.areEqual(this.cancelAdminMembersShowName, cancelGroupAdmin.cancelAdminMembersShowName);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CancelGroupAdmin(@NotNull String groupID, @NotNull String cancelAdminOperator, @NotNull String cancelAdminMembersShowName) {
            super(null);
            Intrinsics.checkNotNullParameter(groupID, "groupID");
            Intrinsics.checkNotNullParameter(cancelAdminOperator, "cancelAdminOperator");
            Intrinsics.checkNotNullParameter(cancelAdminMembersShowName, "cancelAdminMembersShowName");
            this.groupID = groupID;
            this.cancelAdminOperator = cancelAdminOperator;
            this.cancelAdminMembersShowName = cancelAdminMembersShowName;
        }

        public static /* synthetic */ CancelGroupAdmin copy$default(CancelGroupAdmin cancelGroupAdmin, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = cancelGroupAdmin.groupID;
            }
            if ((i11 & 2) != 0) {
                str2 = cancelGroupAdmin.cancelAdminOperator;
            }
            if ((i11 & 4) != 0) {
                str3 = cancelGroupAdmin.cancelAdminMembersShowName;
            }
            return cancelGroupAdmin.copy(str, str2, str3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getGroupID() {
            return this.groupID;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCancelAdminOperator() {
            return this.cancelAdminOperator;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCancelAdminMembersShowName() {
            return this.cancelAdminMembersShowName;
        }

        @NotNull
        public final CancelGroupAdmin copy(@NotNull String groupID, @NotNull String cancelAdminOperator, @NotNull String cancelAdminMembersShowName) {
            Intrinsics.checkNotNullParameter(groupID, "groupID");
            Intrinsics.checkNotNullParameter(cancelAdminOperator, "cancelAdminOperator");
            Intrinsics.checkNotNullParameter(cancelAdminMembersShowName, "cancelAdminMembersShowName");
            return new CancelGroupAdmin(groupID, cancelAdminOperator, cancelAdminMembersShowName);
        }

        @NotNull
        public final String getCancelAdminMembersShowName() {
            return this.cancelAdminMembersShowName;
        }

        @NotNull
        public final String getCancelAdminOperator() {
            return this.cancelAdminOperator;
        }

        @NotNull
        public final String getGroupID() {
            return this.groupID;
        }

        public int hashCode() {
            return this.cancelAdminMembersShowName.hashCode() + AbstractC39391a.m88220a(this.cancelAdminOperator, this.groupID.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("CancelGroupAdmin(groupID=");
            sb2.append(this.groupID);
            sb2.append(", cancelAdminOperator=");
            sb2.append(this.cancelAdminOperator);
            sb2.append(", cancelAdminMembersShowName=");
            return AbstractC39392b.m88221a(sb2, this.cancelAdminMembersShowName, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.groupID);
            parcel.writeString(this.cancelAdminOperator);
            parcel.writeString(this.cancelAdminMembersShowName);
        }
    }

    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u001c"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeGroupAvatar;", "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo;", "groupID", "", "groupAvatarOperator", "groupAvatar", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getGroupAvatar", "()Ljava/lang/String;", "getGroupAvatarOperator", "getGroupID", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final /* data */ class ChangeGroupAvatar extends SystemMessageInfo {

        @NotNull
        public static final Parcelable.Creator<ChangeGroupAvatar> CREATOR = new Creator();

        @NotNull
        private final String groupAvatar;

        @NotNull
        private final String groupAvatarOperator;

        @NotNull
        private final String groupID;

        @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
        public static final class Creator implements Parcelable.Creator<ChangeGroupAvatar> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final ChangeGroupAvatar createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChangeGroupAvatar(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final ChangeGroupAvatar[] newArray(int i11) {
                return new ChangeGroupAvatar[i11];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChangeGroupAvatar)) {
                return false;
            }
            ChangeGroupAvatar changeGroupAvatar = (ChangeGroupAvatar) other;
            return Intrinsics.areEqual(this.groupID, changeGroupAvatar.groupID) && Intrinsics.areEqual(this.groupAvatarOperator, changeGroupAvatar.groupAvatarOperator) && Intrinsics.areEqual(this.groupAvatar, changeGroupAvatar.groupAvatar);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChangeGroupAvatar(@NotNull String groupID, @NotNull String groupAvatarOperator, @NotNull String groupAvatar) {
            super(null);
            Intrinsics.checkNotNullParameter(groupID, "groupID");
            Intrinsics.checkNotNullParameter(groupAvatarOperator, "groupAvatarOperator");
            Intrinsics.checkNotNullParameter(groupAvatar, "groupAvatar");
            this.groupID = groupID;
            this.groupAvatarOperator = groupAvatarOperator;
            this.groupAvatar = groupAvatar;
        }

        public static /* synthetic */ ChangeGroupAvatar copy$default(ChangeGroupAvatar changeGroupAvatar, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = changeGroupAvatar.groupID;
            }
            if ((i11 & 2) != 0) {
                str2 = changeGroupAvatar.groupAvatarOperator;
            }
            if ((i11 & 4) != 0) {
                str3 = changeGroupAvatar.groupAvatar;
            }
            return changeGroupAvatar.copy(str, str2, str3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getGroupID() {
            return this.groupID;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getGroupAvatarOperator() {
            return this.groupAvatarOperator;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getGroupAvatar() {
            return this.groupAvatar;
        }

        @NotNull
        public final ChangeGroupAvatar copy(@NotNull String groupID, @NotNull String groupAvatarOperator, @NotNull String groupAvatar) {
            Intrinsics.checkNotNullParameter(groupID, "groupID");
            Intrinsics.checkNotNullParameter(groupAvatarOperator, "groupAvatarOperator");
            Intrinsics.checkNotNullParameter(groupAvatar, "groupAvatar");
            return new ChangeGroupAvatar(groupID, groupAvatarOperator, groupAvatar);
        }

        @NotNull
        public final String getGroupAvatar() {
            return this.groupAvatar;
        }

        @NotNull
        public final String getGroupAvatarOperator() {
            return this.groupAvatarOperator;
        }

        @NotNull
        public final String getGroupID() {
            return this.groupID;
        }

        public int hashCode() {
            return this.groupAvatar.hashCode() + AbstractC39391a.m88220a(this.groupAvatarOperator, this.groupID.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ChangeGroupAvatar(groupID=");
            sb2.append(this.groupID);
            sb2.append(", groupAvatarOperator=");
            sb2.append(this.groupAvatarOperator);
            sb2.append(", groupAvatar=");
            return AbstractC39392b.m88221a(sb2, this.groupAvatar, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.groupID);
            parcel.writeString(this.groupAvatarOperator);
            parcel.writeString(this.groupAvatar);
        }
    }

    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u001c"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeGroupIntroduction;", "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo;", "groupID", "", "groupIntroductionOperator", TUIConstants.TUIContact.GROUP_INTRODUCTION, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getGroupID", "()Ljava/lang/String;", "getGroupIntroduction", "getGroupIntroductionOperator", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final /* data */ class ChangeGroupIntroduction extends SystemMessageInfo {

        @NotNull
        public static final Parcelable.Creator<ChangeGroupIntroduction> CREATOR = new Creator();

        @NotNull
        private final String groupID;

        @NotNull
        private final String groupIntroduction;

        @NotNull
        private final String groupIntroductionOperator;

        @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
        public static final class Creator implements Parcelable.Creator<ChangeGroupIntroduction> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final ChangeGroupIntroduction createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChangeGroupIntroduction(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final ChangeGroupIntroduction[] newArray(int i11) {
                return new ChangeGroupIntroduction[i11];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChangeGroupIntroduction)) {
                return false;
            }
            ChangeGroupIntroduction changeGroupIntroduction = (ChangeGroupIntroduction) other;
            return Intrinsics.areEqual(this.groupID, changeGroupIntroduction.groupID) && Intrinsics.areEqual(this.groupIntroductionOperator, changeGroupIntroduction.groupIntroductionOperator) && Intrinsics.areEqual(this.groupIntroduction, changeGroupIntroduction.groupIntroduction);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChangeGroupIntroduction(@NotNull String groupID, @NotNull String groupIntroductionOperator, @NotNull String groupIntroduction) {
            super(null);
            Intrinsics.checkNotNullParameter(groupID, "groupID");
            Intrinsics.checkNotNullParameter(groupIntroductionOperator, "groupIntroductionOperator");
            Intrinsics.checkNotNullParameter(groupIntroduction, "groupIntroduction");
            this.groupID = groupID;
            this.groupIntroductionOperator = groupIntroductionOperator;
            this.groupIntroduction = groupIntroduction;
        }

        public static /* synthetic */ ChangeGroupIntroduction copy$default(ChangeGroupIntroduction changeGroupIntroduction, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = changeGroupIntroduction.groupID;
            }
            if ((i11 & 2) != 0) {
                str2 = changeGroupIntroduction.groupIntroductionOperator;
            }
            if ((i11 & 4) != 0) {
                str3 = changeGroupIntroduction.groupIntroduction;
            }
            return changeGroupIntroduction.copy(str, str2, str3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getGroupID() {
            return this.groupID;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getGroupIntroductionOperator() {
            return this.groupIntroductionOperator;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getGroupIntroduction() {
            return this.groupIntroduction;
        }

        @NotNull
        public final ChangeGroupIntroduction copy(@NotNull String groupID, @NotNull String groupIntroductionOperator, @NotNull String groupIntroduction) {
            Intrinsics.checkNotNullParameter(groupID, "groupID");
            Intrinsics.checkNotNullParameter(groupIntroductionOperator, "groupIntroductionOperator");
            Intrinsics.checkNotNullParameter(groupIntroduction, "groupIntroduction");
            return new ChangeGroupIntroduction(groupID, groupIntroductionOperator, groupIntroduction);
        }

        @NotNull
        public final String getGroupID() {
            return this.groupID;
        }

        @NotNull
        public final String getGroupIntroduction() {
            return this.groupIntroduction;
        }

        @NotNull
        public final String getGroupIntroductionOperator() {
            return this.groupIntroductionOperator;
        }

        public int hashCode() {
            return this.groupIntroduction.hashCode() + AbstractC39391a.m88220a(this.groupIntroductionOperator, this.groupID.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ChangeGroupIntroduction(groupID=");
            sb2.append(this.groupID);
            sb2.append(", groupIntroductionOperator=");
            sb2.append(this.groupIntroductionOperator);
            sb2.append(", groupIntroduction=");
            return AbstractC39392b.m88221a(sb2, this.groupIntroduction, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.groupID);
            parcel.writeString(this.groupIntroductionOperator);
            parcel.writeString(this.groupIntroduction);
        }
    }

    @Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u001c"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeGroupMuteAll;", "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo;", "groupID", "", "groupMuteAllOperator", "isMuteAll", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getGroupID", "()Ljava/lang/String;", "getGroupMuteAllOperator", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final /* data */ class ChangeGroupMuteAll extends SystemMessageInfo {

        @NotNull
        public static final Parcelable.Creator<ChangeGroupMuteAll> CREATOR = new Creator();

        @NotNull
        private final String groupID;

        @NotNull
        private final String groupMuteAllOperator;
        private final boolean isMuteAll;

        @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
        public static final class Creator implements Parcelable.Creator<ChangeGroupMuteAll> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final ChangeGroupMuteAll createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChangeGroupMuteAll(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final ChangeGroupMuteAll[] newArray(int i11) {
                return new ChangeGroupMuteAll[i11];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChangeGroupMuteAll)) {
                return false;
            }
            ChangeGroupMuteAll changeGroupMuteAll = (ChangeGroupMuteAll) other;
            return Intrinsics.areEqual(this.groupID, changeGroupMuteAll.groupID) && Intrinsics.areEqual(this.groupMuteAllOperator, changeGroupMuteAll.groupMuteAllOperator) && this.isMuteAll == changeGroupMuteAll.isMuteAll;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChangeGroupMuteAll(@NotNull String groupID, @NotNull String groupMuteAllOperator, boolean z11) {
            super(null);
            Intrinsics.checkNotNullParameter(groupID, "groupID");
            Intrinsics.checkNotNullParameter(groupMuteAllOperator, "groupMuteAllOperator");
            this.groupID = groupID;
            this.groupMuteAllOperator = groupMuteAllOperator;
            this.isMuteAll = z11;
        }

        public static /* synthetic */ ChangeGroupMuteAll copy$default(ChangeGroupMuteAll changeGroupMuteAll, String str, String str2, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = changeGroupMuteAll.groupID;
            }
            if ((i11 & 2) != 0) {
                str2 = changeGroupMuteAll.groupMuteAllOperator;
            }
            if ((i11 & 4) != 0) {
                z11 = changeGroupMuteAll.isMuteAll;
            }
            return changeGroupMuteAll.copy(str, str2, z11);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getGroupID() {
            return this.groupID;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getGroupMuteAllOperator() {
            return this.groupMuteAllOperator;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getIsMuteAll() {
            return this.isMuteAll;
        }

        @NotNull
        public final ChangeGroupMuteAll copy(@NotNull String groupID, @NotNull String groupMuteAllOperator, boolean isMuteAll) {
            Intrinsics.checkNotNullParameter(groupID, "groupID");
            Intrinsics.checkNotNullParameter(groupMuteAllOperator, "groupMuteAllOperator");
            return new ChangeGroupMuteAll(groupID, groupMuteAllOperator, isMuteAll);
        }

        @NotNull
        public final String getGroupID() {
            return this.groupID;
        }

        @NotNull
        public final String getGroupMuteAllOperator() {
            return this.groupMuteAllOperator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4 */
        public int hashCode() {
            int iM88220a = AbstractC39391a.m88220a(this.groupMuteAllOperator, this.groupID.hashCode() * 31, 31);
            boolean z11 = this.isMuteAll;
            ?? r11 = z11;
            if (z11) {
                r11 = 1;
            }
            return iM88220a + r11;
        }

        public final boolean isMuteAll() {
            return this.isMuteAll;
        }

        @NotNull
        public String toString() {
            return "ChangeGroupMuteAll(groupID=" + this.groupID + ", groupMuteAllOperator=" + this.groupMuteAllOperator + ", isMuteAll=" + this.isMuteAll + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.groupID);
            parcel.writeString(this.groupMuteAllOperator);
            parcel.writeInt(this.isMuteAll ? 1 : 0);
        }
    }

    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u001c"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeGroupName;", "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo;", "groupID", "", "groupNameOperator", "groupName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getGroupID", "()Ljava/lang/String;", "getGroupName", "getGroupNameOperator", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final /* data */ class ChangeGroupName extends SystemMessageInfo {

        @NotNull
        public static final Parcelable.Creator<ChangeGroupName> CREATOR = new Creator();

        @NotNull
        private final String groupID;

        @NotNull
        private final String groupName;

        @NotNull
        private final String groupNameOperator;

        @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
        public static final class Creator implements Parcelable.Creator<ChangeGroupName> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final ChangeGroupName createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChangeGroupName(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final ChangeGroupName[] newArray(int i11) {
                return new ChangeGroupName[i11];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChangeGroupName)) {
                return false;
            }
            ChangeGroupName changeGroupName = (ChangeGroupName) other;
            return Intrinsics.areEqual(this.groupID, changeGroupName.groupID) && Intrinsics.areEqual(this.groupNameOperator, changeGroupName.groupNameOperator) && Intrinsics.areEqual(this.groupName, changeGroupName.groupName);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChangeGroupName(@NotNull String groupID, @NotNull String groupNameOperator, @NotNull String groupName) {
            super(null);
            Intrinsics.checkNotNullParameter(groupID, "groupID");
            Intrinsics.checkNotNullParameter(groupNameOperator, "groupNameOperator");
            Intrinsics.checkNotNullParameter(groupName, "groupName");
            this.groupID = groupID;
            this.groupNameOperator = groupNameOperator;
            this.groupName = groupName;
        }

        public static /* synthetic */ ChangeGroupName copy$default(ChangeGroupName changeGroupName, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = changeGroupName.groupID;
            }
            if ((i11 & 2) != 0) {
                str2 = changeGroupName.groupNameOperator;
            }
            if ((i11 & 4) != 0) {
                str3 = changeGroupName.groupName;
            }
            return changeGroupName.copy(str, str2, str3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getGroupID() {
            return this.groupID;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getGroupNameOperator() {
            return this.groupNameOperator;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getGroupName() {
            return this.groupName;
        }

        @NotNull
        public final ChangeGroupName copy(@NotNull String groupID, @NotNull String groupNameOperator, @NotNull String groupName) {
            Intrinsics.checkNotNullParameter(groupID, "groupID");
            Intrinsics.checkNotNullParameter(groupNameOperator, "groupNameOperator");
            Intrinsics.checkNotNullParameter(groupName, "groupName");
            return new ChangeGroupName(groupID, groupNameOperator, groupName);
        }

        @NotNull
        public final String getGroupID() {
            return this.groupID;
        }

        @NotNull
        public final String getGroupName() {
            return this.groupName;
        }

        @NotNull
        public final String getGroupNameOperator() {
            return this.groupNameOperator;
        }

        public int hashCode() {
            return this.groupName.hashCode() + AbstractC39391a.m88220a(this.groupNameOperator, this.groupID.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ChangeGroupName(groupID=");
            sb2.append(this.groupID);
            sb2.append(", groupNameOperator=");
            sb2.append(this.groupNameOperator);
            sb2.append(", groupName=");
            return AbstractC39392b.m88221a(sb2, this.groupName, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.groupID);
            parcel.writeString(this.groupNameOperator);
            parcel.writeString(this.groupName);
        }
    }

    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u001c"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeGroupNotification;", "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo;", "groupID", "", "groupNotificationOperator", TUIConstants.TUIContact.GROUP_NOTIFICATION, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getGroupID", "()Ljava/lang/String;", "getGroupNotification", "getGroupNotificationOperator", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final /* data */ class ChangeGroupNotification extends SystemMessageInfo {

        @NotNull
        public static final Parcelable.Creator<ChangeGroupNotification> CREATOR = new Creator();

        @NotNull
        private final String groupID;

        @NotNull
        private final String groupNotification;

        @NotNull
        private final String groupNotificationOperator;

        @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
        public static final class Creator implements Parcelable.Creator<ChangeGroupNotification> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final ChangeGroupNotification createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChangeGroupNotification(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final ChangeGroupNotification[] newArray(int i11) {
                return new ChangeGroupNotification[i11];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChangeGroupNotification)) {
                return false;
            }
            ChangeGroupNotification changeGroupNotification = (ChangeGroupNotification) other;
            return Intrinsics.areEqual(this.groupID, changeGroupNotification.groupID) && Intrinsics.areEqual(this.groupNotificationOperator, changeGroupNotification.groupNotificationOperator) && Intrinsics.areEqual(this.groupNotification, changeGroupNotification.groupNotification);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChangeGroupNotification(@NotNull String groupID, @NotNull String groupNotificationOperator, @NotNull String groupNotification) {
            super(null);
            Intrinsics.checkNotNullParameter(groupID, "groupID");
            Intrinsics.checkNotNullParameter(groupNotificationOperator, "groupNotificationOperator");
            Intrinsics.checkNotNullParameter(groupNotification, "groupNotification");
            this.groupID = groupID;
            this.groupNotificationOperator = groupNotificationOperator;
            this.groupNotification = groupNotification;
        }

        public static /* synthetic */ ChangeGroupNotification copy$default(ChangeGroupNotification changeGroupNotification, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = changeGroupNotification.groupID;
            }
            if ((i11 & 2) != 0) {
                str2 = changeGroupNotification.groupNotificationOperator;
            }
            if ((i11 & 4) != 0) {
                str3 = changeGroupNotification.groupNotification;
            }
            return changeGroupNotification.copy(str, str2, str3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getGroupID() {
            return this.groupID;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getGroupNotificationOperator() {
            return this.groupNotificationOperator;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getGroupNotification() {
            return this.groupNotification;
        }

        @NotNull
        public final ChangeGroupNotification copy(@NotNull String groupID, @NotNull String groupNotificationOperator, @NotNull String groupNotification) {
            Intrinsics.checkNotNullParameter(groupID, "groupID");
            Intrinsics.checkNotNullParameter(groupNotificationOperator, "groupNotificationOperator");
            Intrinsics.checkNotNullParameter(groupNotification, "groupNotification");
            return new ChangeGroupNotification(groupID, groupNotificationOperator, groupNotification);
        }

        @NotNull
        public final String getGroupID() {
            return this.groupID;
        }

        @NotNull
        public final String getGroupNotification() {
            return this.groupNotification;
        }

        @NotNull
        public final String getGroupNotificationOperator() {
            return this.groupNotificationOperator;
        }

        public int hashCode() {
            return this.groupNotification.hashCode() + AbstractC39391a.m88220a(this.groupNotificationOperator, this.groupID.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ChangeGroupNotification(groupID=");
            sb2.append(this.groupID);
            sb2.append(", groupNotificationOperator=");
            sb2.append(this.groupNotificationOperator);
            sb2.append(", groupNotification=");
            return AbstractC39392b.m88221a(sb2, this.groupNotification, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.groupID);
            parcel.writeString(this.groupNotificationOperator);
            parcel.writeString(this.groupNotification);
        }
    }

    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u001c"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeGroupOwner;", "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo;", "groupID", "", "groupOwnerOperator", TUIConstants.TUIContact.GROUP_OWNER, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getGroupID", "()Ljava/lang/String;", "getGroupOwner", "getGroupOwnerOperator", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final /* data */ class ChangeGroupOwner extends SystemMessageInfo {

        @NotNull
        public static final Parcelable.Creator<ChangeGroupOwner> CREATOR = new Creator();

        @NotNull
        private final String groupID;

        @NotNull
        private final String groupOwner;

        @NotNull
        private final String groupOwnerOperator;

        @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
        public static final class Creator implements Parcelable.Creator<ChangeGroupOwner> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final ChangeGroupOwner createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChangeGroupOwner(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final ChangeGroupOwner[] newArray(int i11) {
                return new ChangeGroupOwner[i11];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChangeGroupOwner)) {
                return false;
            }
            ChangeGroupOwner changeGroupOwner = (ChangeGroupOwner) other;
            return Intrinsics.areEqual(this.groupID, changeGroupOwner.groupID) && Intrinsics.areEqual(this.groupOwnerOperator, changeGroupOwner.groupOwnerOperator) && Intrinsics.areEqual(this.groupOwner, changeGroupOwner.groupOwner);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChangeGroupOwner(@NotNull String groupID, @NotNull String groupOwnerOperator, @NotNull String groupOwner) {
            super(null);
            Intrinsics.checkNotNullParameter(groupID, "groupID");
            Intrinsics.checkNotNullParameter(groupOwnerOperator, "groupOwnerOperator");
            Intrinsics.checkNotNullParameter(groupOwner, "groupOwner");
            this.groupID = groupID;
            this.groupOwnerOperator = groupOwnerOperator;
            this.groupOwner = groupOwner;
        }

        public static /* synthetic */ ChangeGroupOwner copy$default(ChangeGroupOwner changeGroupOwner, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = changeGroupOwner.groupID;
            }
            if ((i11 & 2) != 0) {
                str2 = changeGroupOwner.groupOwnerOperator;
            }
            if ((i11 & 4) != 0) {
                str3 = changeGroupOwner.groupOwner;
            }
            return changeGroupOwner.copy(str, str2, str3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getGroupID() {
            return this.groupID;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getGroupOwnerOperator() {
            return this.groupOwnerOperator;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getGroupOwner() {
            return this.groupOwner;
        }

        @NotNull
        public final ChangeGroupOwner copy(@NotNull String groupID, @NotNull String groupOwnerOperator, @NotNull String groupOwner) {
            Intrinsics.checkNotNullParameter(groupID, "groupID");
            Intrinsics.checkNotNullParameter(groupOwnerOperator, "groupOwnerOperator");
            Intrinsics.checkNotNullParameter(groupOwner, "groupOwner");
            return new ChangeGroupOwner(groupID, groupOwnerOperator, groupOwner);
        }

        @NotNull
        public final String getGroupID() {
            return this.groupID;
        }

        @NotNull
        public final String getGroupOwner() {
            return this.groupOwner;
        }

        @NotNull
        public final String getGroupOwnerOperator() {
            return this.groupOwnerOperator;
        }

        public int hashCode() {
            return this.groupOwner.hashCode() + AbstractC39391a.m88220a(this.groupOwnerOperator, this.groupID.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ChangeGroupOwner(groupID=");
            sb2.append(this.groupID);
            sb2.append(", groupOwnerOperator=");
            sb2.append(this.groupOwnerOperator);
            sb2.append(", groupOwner=");
            return AbstractC39392b.m88221a(sb2, this.groupOwner, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.groupID);
            parcel.writeString(this.groupOwnerOperator);
            parcel.writeString(this.groupOwner);
        }
    }

    @Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeInviteToGroupApproval;", "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo;", "groupID", "", "groupInviteApprovalOperator", "groupInviteOption", "Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption;", "(Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption;)V", "getGroupID", "()Ljava/lang/String;", "getGroupInviteApprovalOperator", "getGroupInviteOption", "()Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final /* data */ class ChangeInviteToGroupApproval extends SystemMessageInfo {

        @NotNull
        public static final Parcelable.Creator<ChangeInviteToGroupApproval> CREATOR = new Creator();

        @NotNull
        private final String groupID;

        @NotNull
        private final String groupInviteApprovalOperator;

        @NotNull
        private final GroupJoinOption groupInviteOption;

        @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
        public static final class Creator implements Parcelable.Creator<ChangeInviteToGroupApproval> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final ChangeInviteToGroupApproval createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChangeInviteToGroupApproval(parcel.readString(), parcel.readString(), GroupJoinOption.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final ChangeInviteToGroupApproval[] newArray(int i11) {
                return new ChangeInviteToGroupApproval[i11];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChangeInviteToGroupApproval)) {
                return false;
            }
            ChangeInviteToGroupApproval changeInviteToGroupApproval = (ChangeInviteToGroupApproval) other;
            return Intrinsics.areEqual(this.groupID, changeInviteToGroupApproval.groupID) && Intrinsics.areEqual(this.groupInviteApprovalOperator, changeInviteToGroupApproval.groupInviteApprovalOperator) && this.groupInviteOption == changeInviteToGroupApproval.groupInviteOption;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChangeInviteToGroupApproval(@NotNull String groupID, @NotNull String groupInviteApprovalOperator, @NotNull GroupJoinOption groupInviteOption) {
            super(null);
            Intrinsics.checkNotNullParameter(groupID, "groupID");
            Intrinsics.checkNotNullParameter(groupInviteApprovalOperator, "groupInviteApprovalOperator");
            Intrinsics.checkNotNullParameter(groupInviteOption, "groupInviteOption");
            this.groupID = groupID;
            this.groupInviteApprovalOperator = groupInviteApprovalOperator;
            this.groupInviteOption = groupInviteOption;
        }

        public static /* synthetic */ ChangeInviteToGroupApproval copy$default(ChangeInviteToGroupApproval changeInviteToGroupApproval, String str, String str2, GroupJoinOption groupJoinOption, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = changeInviteToGroupApproval.groupID;
            }
            if ((i11 & 2) != 0) {
                str2 = changeInviteToGroupApproval.groupInviteApprovalOperator;
            }
            if ((i11 & 4) != 0) {
                groupJoinOption = changeInviteToGroupApproval.groupInviteOption;
            }
            return changeInviteToGroupApproval.copy(str, str2, groupJoinOption);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getGroupID() {
            return this.groupID;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getGroupInviteApprovalOperator() {
            return this.groupInviteApprovalOperator;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final GroupJoinOption getGroupInviteOption() {
            return this.groupInviteOption;
        }

        @NotNull
        public final ChangeInviteToGroupApproval copy(@NotNull String groupID, @NotNull String groupInviteApprovalOperator, @NotNull GroupJoinOption groupInviteOption) {
            Intrinsics.checkNotNullParameter(groupID, "groupID");
            Intrinsics.checkNotNullParameter(groupInviteApprovalOperator, "groupInviteApprovalOperator");
            Intrinsics.checkNotNullParameter(groupInviteOption, "groupInviteOption");
            return new ChangeInviteToGroupApproval(groupID, groupInviteApprovalOperator, groupInviteOption);
        }

        @NotNull
        public final String getGroupID() {
            return this.groupID;
        }

        @NotNull
        public final String getGroupInviteApprovalOperator() {
            return this.groupInviteApprovalOperator;
        }

        @NotNull
        public final GroupJoinOption getGroupInviteOption() {
            return this.groupInviteOption;
        }

        public int hashCode() {
            return this.groupInviteOption.hashCode() + AbstractC39391a.m88220a(this.groupInviteApprovalOperator, this.groupID.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            return "ChangeInviteToGroupApproval(groupID=" + this.groupID + ", groupInviteApprovalOperator=" + this.groupInviteApprovalOperator + ", groupInviteOption=" + this.groupInviteOption + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.groupID);
            parcel.writeString(this.groupInviteApprovalOperator);
            parcel.writeString(this.groupInviteOption.name());
        }
    }

    @Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeJoinGroupApproval;", "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo;", "groupID", "", "groupJoinApprovalOperator", "groupJoinOption", "Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption;", "(Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption;)V", "getGroupID", "()Ljava/lang/String;", "getGroupJoinApprovalOperator", "getGroupJoinOption", "()Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final /* data */ class ChangeJoinGroupApproval extends SystemMessageInfo {

        @NotNull
        public static final Parcelable.Creator<ChangeJoinGroupApproval> CREATOR = new Creator();

        @NotNull
        private final String groupID;

        @NotNull
        private final String groupJoinApprovalOperator;

        @NotNull
        private final GroupJoinOption groupJoinOption;

        @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
        public static final class Creator implements Parcelable.Creator<ChangeJoinGroupApproval> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final ChangeJoinGroupApproval createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChangeJoinGroupApproval(parcel.readString(), parcel.readString(), GroupJoinOption.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final ChangeJoinGroupApproval[] newArray(int i11) {
                return new ChangeJoinGroupApproval[i11];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChangeJoinGroupApproval)) {
                return false;
            }
            ChangeJoinGroupApproval changeJoinGroupApproval = (ChangeJoinGroupApproval) other;
            return Intrinsics.areEqual(this.groupID, changeJoinGroupApproval.groupID) && Intrinsics.areEqual(this.groupJoinApprovalOperator, changeJoinGroupApproval.groupJoinApprovalOperator) && this.groupJoinOption == changeJoinGroupApproval.groupJoinOption;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChangeJoinGroupApproval(@NotNull String groupID, @NotNull String groupJoinApprovalOperator, @NotNull GroupJoinOption groupJoinOption) {
            super(null);
            Intrinsics.checkNotNullParameter(groupID, "groupID");
            Intrinsics.checkNotNullParameter(groupJoinApprovalOperator, "groupJoinApprovalOperator");
            Intrinsics.checkNotNullParameter(groupJoinOption, "groupJoinOption");
            this.groupID = groupID;
            this.groupJoinApprovalOperator = groupJoinApprovalOperator;
            this.groupJoinOption = groupJoinOption;
        }

        public static /* synthetic */ ChangeJoinGroupApproval copy$default(ChangeJoinGroupApproval changeJoinGroupApproval, String str, String str2, GroupJoinOption groupJoinOption, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = changeJoinGroupApproval.groupID;
            }
            if ((i11 & 2) != 0) {
                str2 = changeJoinGroupApproval.groupJoinApprovalOperator;
            }
            if ((i11 & 4) != 0) {
                groupJoinOption = changeJoinGroupApproval.groupJoinOption;
            }
            return changeJoinGroupApproval.copy(str, str2, groupJoinOption);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getGroupID() {
            return this.groupID;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getGroupJoinApprovalOperator() {
            return this.groupJoinApprovalOperator;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final GroupJoinOption getGroupJoinOption() {
            return this.groupJoinOption;
        }

        @NotNull
        public final ChangeJoinGroupApproval copy(@NotNull String groupID, @NotNull String groupJoinApprovalOperator, @NotNull GroupJoinOption groupJoinOption) {
            Intrinsics.checkNotNullParameter(groupID, "groupID");
            Intrinsics.checkNotNullParameter(groupJoinApprovalOperator, "groupJoinApprovalOperator");
            Intrinsics.checkNotNullParameter(groupJoinOption, "groupJoinOption");
            return new ChangeJoinGroupApproval(groupID, groupJoinApprovalOperator, groupJoinOption);
        }

        @NotNull
        public final String getGroupID() {
            return this.groupID;
        }

        @NotNull
        public final String getGroupJoinApprovalOperator() {
            return this.groupJoinApprovalOperator;
        }

        @NotNull
        public final GroupJoinOption getGroupJoinOption() {
            return this.groupJoinOption;
        }

        public int hashCode() {
            return this.groupJoinOption.hashCode() + AbstractC39391a.m88220a(this.groupJoinApprovalOperator, this.groupID.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            return "ChangeJoinGroupApproval(groupID=" + this.groupID + ", groupJoinApprovalOperator=" + this.groupJoinApprovalOperator + ", groupJoinOption=" + this.groupJoinOption + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.groupID);
            parcel.writeString(this.groupJoinApprovalOperator);
            parcel.writeString(this.groupJoinOption.name());
        }
    }

    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u001c"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$InviteToGroup;", "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo;", "groupID", "", "inviter", "inviteesShowName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getGroupID", "()Ljava/lang/String;", "getInviteesShowName", "getInviter", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final /* data */ class InviteToGroup extends SystemMessageInfo {

        @NotNull
        public static final Parcelable.Creator<InviteToGroup> CREATOR = new Creator();

        @NotNull
        private final String groupID;

        @NotNull
        private final String inviteesShowName;

        @NotNull
        private final String inviter;

        @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
        public static final class Creator implements Parcelable.Creator<InviteToGroup> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final InviteToGroup createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InviteToGroup(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final InviteToGroup[] newArray(int i11) {
                return new InviteToGroup[i11];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InviteToGroup)) {
                return false;
            }
            InviteToGroup inviteToGroup = (InviteToGroup) other;
            return Intrinsics.areEqual(this.groupID, inviteToGroup.groupID) && Intrinsics.areEqual(this.inviter, inviteToGroup.inviter) && Intrinsics.areEqual(this.inviteesShowName, inviteToGroup.inviteesShowName);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InviteToGroup(@NotNull String groupID, @NotNull String inviter, @NotNull String inviteesShowName) {
            super(null);
            Intrinsics.checkNotNullParameter(groupID, "groupID");
            Intrinsics.checkNotNullParameter(inviter, "inviter");
            Intrinsics.checkNotNullParameter(inviteesShowName, "inviteesShowName");
            this.groupID = groupID;
            this.inviter = inviter;
            this.inviteesShowName = inviteesShowName;
        }

        public static /* synthetic */ InviteToGroup copy$default(InviteToGroup inviteToGroup, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = inviteToGroup.groupID;
            }
            if ((i11 & 2) != 0) {
                str2 = inviteToGroup.inviter;
            }
            if ((i11 & 4) != 0) {
                str3 = inviteToGroup.inviteesShowName;
            }
            return inviteToGroup.copy(str, str2, str3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getGroupID() {
            return this.groupID;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getInviter() {
            return this.inviter;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getInviteesShowName() {
            return this.inviteesShowName;
        }

        @NotNull
        public final InviteToGroup copy(@NotNull String groupID, @NotNull String inviter, @NotNull String inviteesShowName) {
            Intrinsics.checkNotNullParameter(groupID, "groupID");
            Intrinsics.checkNotNullParameter(inviter, "inviter");
            Intrinsics.checkNotNullParameter(inviteesShowName, "inviteesShowName");
            return new InviteToGroup(groupID, inviter, inviteesShowName);
        }

        @NotNull
        public final String getGroupID() {
            return this.groupID;
        }

        @NotNull
        public final String getInviteesShowName() {
            return this.inviteesShowName;
        }

        @NotNull
        public final String getInviter() {
            return this.inviter;
        }

        public int hashCode() {
            return this.inviteesShowName.hashCode() + AbstractC39391a.m88220a(this.inviter, this.groupID.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("InviteToGroup(groupID=");
            sb2.append(this.groupID);
            sb2.append(", inviter=");
            sb2.append(this.inviter);
            sb2.append(", inviteesShowName=");
            return AbstractC39392b.m88221a(sb2, this.inviteesShowName, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.groupID);
            parcel.writeString(this.inviter);
            parcel.writeString(this.inviteesShowName);
        }
    }

    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$JoinGroup;", "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo;", "groupID", "", "joinMember", "(Ljava/lang/String;Ljava/lang/String;)V", "getGroupID", "()Ljava/lang/String;", "getJoinMember", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final /* data */ class JoinGroup extends SystemMessageInfo {

        @NotNull
        public static final Parcelable.Creator<JoinGroup> CREATOR = new Creator();

        @NotNull
        private final String groupID;

        @NotNull
        private final String joinMember;

        @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
        public static final class Creator implements Parcelable.Creator<JoinGroup> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final JoinGroup createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JoinGroup(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final JoinGroup[] newArray(int i11) {
                return new JoinGroup[i11];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof JoinGroup)) {
                return false;
            }
            JoinGroup joinGroup = (JoinGroup) other;
            return Intrinsics.areEqual(this.groupID, joinGroup.groupID) && Intrinsics.areEqual(this.joinMember, joinGroup.joinMember);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JoinGroup(@NotNull String groupID, @NotNull String joinMember) {
            super(null);
            Intrinsics.checkNotNullParameter(groupID, "groupID");
            Intrinsics.checkNotNullParameter(joinMember, "joinMember");
            this.groupID = groupID;
            this.joinMember = joinMember;
        }

        public static /* synthetic */ JoinGroup copy$default(JoinGroup joinGroup, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = joinGroup.groupID;
            }
            if ((i11 & 2) != 0) {
                str2 = joinGroup.joinMember;
            }
            return joinGroup.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getGroupID() {
            return this.groupID;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getJoinMember() {
            return this.joinMember;
        }

        @NotNull
        public final JoinGroup copy(@NotNull String groupID, @NotNull String joinMember) {
            Intrinsics.checkNotNullParameter(groupID, "groupID");
            Intrinsics.checkNotNullParameter(joinMember, "joinMember");
            return new JoinGroup(groupID, joinMember);
        }

        @NotNull
        public final String getGroupID() {
            return this.groupID;
        }

        @NotNull
        public final String getJoinMember() {
            return this.joinMember;
        }

        public int hashCode() {
            return this.joinMember.hashCode() + (this.groupID.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("JoinGroup(groupID=");
            sb2.append(this.groupID);
            sb2.append(", joinMember=");
            return AbstractC39392b.m88221a(sb2, this.joinMember, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.groupID);
            parcel.writeString(this.joinMember);
        }
    }

    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u001c"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$KickedFromGroup;", "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo;", "groupID", "", "kickOperator", "kickedMembersShowName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getGroupID", "()Ljava/lang/String;", "getKickOperator", "getKickedMembersShowName", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final /* data */ class KickedFromGroup extends SystemMessageInfo {

        @NotNull
        public static final Parcelable.Creator<KickedFromGroup> CREATOR = new Creator();

        @NotNull
        private final String groupID;

        @NotNull
        private final String kickOperator;

        @NotNull
        private final String kickedMembersShowName;

        @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
        public static final class Creator implements Parcelable.Creator<KickedFromGroup> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final KickedFromGroup createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new KickedFromGroup(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final KickedFromGroup[] newArray(int i11) {
                return new KickedFromGroup[i11];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof KickedFromGroup)) {
                return false;
            }
            KickedFromGroup kickedFromGroup = (KickedFromGroup) other;
            return Intrinsics.areEqual(this.groupID, kickedFromGroup.groupID) && Intrinsics.areEqual(this.kickOperator, kickedFromGroup.kickOperator) && Intrinsics.areEqual(this.kickedMembersShowName, kickedFromGroup.kickedMembersShowName);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KickedFromGroup(@NotNull String groupID, @NotNull String kickOperator, @NotNull String kickedMembersShowName) {
            super(null);
            Intrinsics.checkNotNullParameter(groupID, "groupID");
            Intrinsics.checkNotNullParameter(kickOperator, "kickOperator");
            Intrinsics.checkNotNullParameter(kickedMembersShowName, "kickedMembersShowName");
            this.groupID = groupID;
            this.kickOperator = kickOperator;
            this.kickedMembersShowName = kickedMembersShowName;
        }

        public static /* synthetic */ KickedFromGroup copy$default(KickedFromGroup kickedFromGroup, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = kickedFromGroup.groupID;
            }
            if ((i11 & 2) != 0) {
                str2 = kickedFromGroup.kickOperator;
            }
            if ((i11 & 4) != 0) {
                str3 = kickedFromGroup.kickedMembersShowName;
            }
            return kickedFromGroup.copy(str, str2, str3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getGroupID() {
            return this.groupID;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getKickOperator() {
            return this.kickOperator;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getKickedMembersShowName() {
            return this.kickedMembersShowName;
        }

        @NotNull
        public final KickedFromGroup copy(@NotNull String groupID, @NotNull String kickOperator, @NotNull String kickedMembersShowName) {
            Intrinsics.checkNotNullParameter(groupID, "groupID");
            Intrinsics.checkNotNullParameter(kickOperator, "kickOperator");
            Intrinsics.checkNotNullParameter(kickedMembersShowName, "kickedMembersShowName");
            return new KickedFromGroup(groupID, kickOperator, kickedMembersShowName);
        }

        @NotNull
        public final String getGroupID() {
            return this.groupID;
        }

        @NotNull
        public final String getKickOperator() {
            return this.kickOperator;
        }

        @NotNull
        public final String getKickedMembersShowName() {
            return this.kickedMembersShowName;
        }

        public int hashCode() {
            return this.kickedMembersShowName.hashCode() + AbstractC39391a.m88220a(this.kickOperator, this.groupID.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("KickedFromGroup(groupID=");
            sb2.append(this.groupID);
            sb2.append(", kickOperator=");
            sb2.append(this.kickOperator);
            sb2.append(", kickedMembersShowName=");
            return AbstractC39392b.m88221a(sb2, this.kickedMembersShowName, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.groupID);
            parcel.writeString(this.kickOperator);
            parcel.writeString(this.kickedMembersShowName);
        }
    }

    @Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006$"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$MuteGroupMember;", "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo;", "groupID", "", "muteGroupMemberOperator", "isSelfMuted", "", "mutedGroupMembersShowName", "muteTime", "", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;J)V", "getGroupID", "()Ljava/lang/String;", "()Z", "getMuteGroupMemberOperator", "getMuteTime", "()J", "getMutedGroupMembersShowName", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final /* data */ class MuteGroupMember extends SystemMessageInfo {

        @NotNull
        public static final Parcelable.Creator<MuteGroupMember> CREATOR = new Creator();

        @NotNull
        private final String groupID;
        private final boolean isSelfMuted;

        @NotNull
        private final String muteGroupMemberOperator;
        private final long muteTime;

        @NotNull
        private final String mutedGroupMembersShowName;

        @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
        public static final class Creator implements Parcelable.Creator<MuteGroupMember> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final MuteGroupMember createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MuteGroupMember(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readLong());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final MuteGroupMember[] newArray(int i11) {
                return new MuteGroupMember[i11];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MuteGroupMember)) {
                return false;
            }
            MuteGroupMember muteGroupMember = (MuteGroupMember) other;
            return Intrinsics.areEqual(this.groupID, muteGroupMember.groupID) && Intrinsics.areEqual(this.muteGroupMemberOperator, muteGroupMember.muteGroupMemberOperator) && this.isSelfMuted == muteGroupMember.isSelfMuted && Intrinsics.areEqual(this.mutedGroupMembersShowName, muteGroupMember.mutedGroupMembersShowName) && this.muteTime == muteGroupMember.muteTime;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MuteGroupMember(@NotNull String groupID, @NotNull String muteGroupMemberOperator, boolean z11, @NotNull String mutedGroupMembersShowName, long j11) {
            super(null);
            Intrinsics.checkNotNullParameter(groupID, "groupID");
            Intrinsics.checkNotNullParameter(muteGroupMemberOperator, "muteGroupMemberOperator");
            Intrinsics.checkNotNullParameter(mutedGroupMembersShowName, "mutedGroupMembersShowName");
            this.groupID = groupID;
            this.muteGroupMemberOperator = muteGroupMemberOperator;
            this.isSelfMuted = z11;
            this.mutedGroupMembersShowName = mutedGroupMembersShowName;
            this.muteTime = j11;
        }

        public static /* synthetic */ MuteGroupMember copy$default(MuteGroupMember muteGroupMember, String str, String str2, boolean z11, String str3, long j11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = muteGroupMember.groupID;
            }
            if ((i11 & 2) != 0) {
                str2 = muteGroupMember.muteGroupMemberOperator;
            }
            if ((i11 & 4) != 0) {
                z11 = muteGroupMember.isSelfMuted;
            }
            if ((i11 & 8) != 0) {
                str3 = muteGroupMember.mutedGroupMembersShowName;
            }
            if ((i11 & 16) != 0) {
                j11 = muteGroupMember.muteTime;
            }
            long j12 = j11;
            return muteGroupMember.copy(str, str2, z11, str3, j12);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getGroupID() {
            return this.groupID;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMuteGroupMemberOperator() {
            return this.muteGroupMemberOperator;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getIsSelfMuted() {
            return this.isSelfMuted;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getMutedGroupMembersShowName() {
            return this.mutedGroupMembersShowName;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final long getMuteTime() {
            return this.muteTime;
        }

        @NotNull
        public final MuteGroupMember copy(@NotNull String groupID, @NotNull String muteGroupMemberOperator, boolean isSelfMuted, @NotNull String mutedGroupMembersShowName, long muteTime) {
            Intrinsics.checkNotNullParameter(groupID, "groupID");
            Intrinsics.checkNotNullParameter(muteGroupMemberOperator, "muteGroupMemberOperator");
            Intrinsics.checkNotNullParameter(mutedGroupMembersShowName, "mutedGroupMembersShowName");
            return new MuteGroupMember(groupID, muteGroupMemberOperator, isSelfMuted, mutedGroupMembersShowName, muteTime);
        }

        @NotNull
        public final String getGroupID() {
            return this.groupID;
        }

        @NotNull
        public final String getMuteGroupMemberOperator() {
            return this.muteGroupMemberOperator;
        }

        public final long getMuteTime() {
            return this.muteTime;
        }

        @NotNull
        public final String getMutedGroupMembersShowName() {
            return this.mutedGroupMembersShowName;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [int] */
        /* JADX WARN: Type inference failed for: r2v2, types: [int] */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v5 */
        public int hashCode() {
            int iM88220a = AbstractC39391a.m88220a(this.muteGroupMemberOperator, this.groupID.hashCode() * 31, 31);
            boolean z11 = this.isSelfMuted;
            ?? r11 = z11;
            if (z11) {
                r11 = 1;
            }
            return Long.hashCode(this.muteTime) + AbstractC39391a.m88220a(this.mutedGroupMembersShowName, (iM88220a + r11) * 31, 31);
        }

        public final boolean isSelfMuted() {
            return this.isSelfMuted;
        }

        @NotNull
        public String toString() {
            return "MuteGroupMember(groupID=" + this.groupID + ", muteGroupMemberOperator=" + this.muteGroupMemberOperator + ", isSelfMuted=" + this.isSelfMuted + ", mutedGroupMembersShowName=" + this.mutedGroupMembersShowName + ", muteTime=" + this.muteTime + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.groupID);
            parcel.writeString(this.muteGroupMemberOperator);
            parcel.writeInt(this.isSelfMuted ? 1 : 0);
            parcel.writeString(this.mutedGroupMembersShowName);
            parcel.writeLong(this.muteTime);
        }
    }

    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$PinGroupMessage;", "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo;", "groupID", "", "pinGroupMessageOperator", "(Ljava/lang/String;Ljava/lang/String;)V", "getGroupID", "()Ljava/lang/String;", "getPinGroupMessageOperator", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final /* data */ class PinGroupMessage extends SystemMessageInfo {

        @NotNull
        public static final Parcelable.Creator<PinGroupMessage> CREATOR = new Creator();

        @NotNull
        private final String groupID;

        @NotNull
        private final String pinGroupMessageOperator;

        @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
        public static final class Creator implements Parcelable.Creator<PinGroupMessage> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final PinGroupMessage createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PinGroupMessage(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final PinGroupMessage[] newArray(int i11) {
                return new PinGroupMessage[i11];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PinGroupMessage)) {
                return false;
            }
            PinGroupMessage pinGroupMessage = (PinGroupMessage) other;
            return Intrinsics.areEqual(this.groupID, pinGroupMessage.groupID) && Intrinsics.areEqual(this.pinGroupMessageOperator, pinGroupMessage.pinGroupMessageOperator);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PinGroupMessage(@NotNull String groupID, @NotNull String pinGroupMessageOperator) {
            super(null);
            Intrinsics.checkNotNullParameter(groupID, "groupID");
            Intrinsics.checkNotNullParameter(pinGroupMessageOperator, "pinGroupMessageOperator");
            this.groupID = groupID;
            this.pinGroupMessageOperator = pinGroupMessageOperator;
        }

        public static /* synthetic */ PinGroupMessage copy$default(PinGroupMessage pinGroupMessage, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = pinGroupMessage.groupID;
            }
            if ((i11 & 2) != 0) {
                str2 = pinGroupMessage.pinGroupMessageOperator;
            }
            return pinGroupMessage.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getGroupID() {
            return this.groupID;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPinGroupMessageOperator() {
            return this.pinGroupMessageOperator;
        }

        @NotNull
        public final PinGroupMessage copy(@NotNull String groupID, @NotNull String pinGroupMessageOperator) {
            Intrinsics.checkNotNullParameter(groupID, "groupID");
            Intrinsics.checkNotNullParameter(pinGroupMessageOperator, "pinGroupMessageOperator");
            return new PinGroupMessage(groupID, pinGroupMessageOperator);
        }

        @NotNull
        public final String getGroupID() {
            return this.groupID;
        }

        @NotNull
        public final String getPinGroupMessageOperator() {
            return this.pinGroupMessageOperator;
        }

        public int hashCode() {
            return this.pinGroupMessageOperator.hashCode() + (this.groupID.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("PinGroupMessage(groupID=");
            sb2.append(this.groupID);
            sb2.append(", pinGroupMessageOperator=");
            return AbstractC39392b.m88221a(sb2, this.pinGroupMessageOperator, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.groupID);
            parcel.writeString(this.pinGroupMessageOperator);
        }
    }

    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$QuitGroup;", "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo;", "groupID", "", "quitMember", "(Ljava/lang/String;Ljava/lang/String;)V", "getGroupID", "()Ljava/lang/String;", "getQuitMember", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final /* data */ class QuitGroup extends SystemMessageInfo {

        @NotNull
        public static final Parcelable.Creator<QuitGroup> CREATOR = new Creator();

        @NotNull
        private final String groupID;

        @NotNull
        private final String quitMember;

        @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
        public static final class Creator implements Parcelable.Creator<QuitGroup> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final QuitGroup createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new QuitGroup(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final QuitGroup[] newArray(int i11) {
                return new QuitGroup[i11];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuitGroup)) {
                return false;
            }
            QuitGroup quitGroup = (QuitGroup) other;
            return Intrinsics.areEqual(this.groupID, quitGroup.groupID) && Intrinsics.areEqual(this.quitMember, quitGroup.quitMember);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QuitGroup(@NotNull String groupID, @NotNull String quitMember) {
            super(null);
            Intrinsics.checkNotNullParameter(groupID, "groupID");
            Intrinsics.checkNotNullParameter(quitMember, "quitMember");
            this.groupID = groupID;
            this.quitMember = quitMember;
        }

        public static /* synthetic */ QuitGroup copy$default(QuitGroup quitGroup, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = quitGroup.groupID;
            }
            if ((i11 & 2) != 0) {
                str2 = quitGroup.quitMember;
            }
            return quitGroup.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getGroupID() {
            return this.groupID;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getQuitMember() {
            return this.quitMember;
        }

        @NotNull
        public final QuitGroup copy(@NotNull String groupID, @NotNull String quitMember) {
            Intrinsics.checkNotNullParameter(groupID, "groupID");
            Intrinsics.checkNotNullParameter(quitMember, "quitMember");
            return new QuitGroup(groupID, quitMember);
        }

        @NotNull
        public final String getGroupID() {
            return this.groupID;
        }

        @NotNull
        public final String getQuitMember() {
            return this.quitMember;
        }

        public int hashCode() {
            return this.quitMember.hashCode() + (this.groupID.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("QuitGroup(groupID=");
            sb2.append(this.groupID);
            sb2.append(", quitMember=");
            return AbstractC39392b.m88221a(sb2, this.quitMember, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.groupID);
            parcel.writeString(this.quitMember);
        }
    }

    @Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006!"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$RecallMessage;", "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo;", "groupID", "", "recallMessageOperator", "isRecalledBySelf", "", "isInGroup", "recallReason", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V", "getGroupID", "()Ljava/lang/String;", "()Z", "getRecallMessageOperator", "getRecallReason", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final /* data */ class RecallMessage extends SystemMessageInfo {

        @NotNull
        public static final Parcelable.Creator<RecallMessage> CREATOR = new Creator();

        @NotNull
        private final String groupID;
        private final boolean isInGroup;
        private final boolean isRecalledBySelf;

        @NotNull
        private final String recallMessageOperator;

        @NotNull
        private final String recallReason;

        @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
        public static final class Creator implements Parcelable.Creator<RecallMessage> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final RecallMessage createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                boolean z11 = false;
                if (parcel.readInt() != 0) {
                    z11 = true;
                }
                return new RecallMessage(string, string2, z11, parcel.readInt() != 0, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final RecallMessage[] newArray(int i11) {
                return new RecallMessage[i11];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RecallMessage)) {
                return false;
            }
            RecallMessage recallMessage = (RecallMessage) other;
            return Intrinsics.areEqual(this.groupID, recallMessage.groupID) && Intrinsics.areEqual(this.recallMessageOperator, recallMessage.recallMessageOperator) && this.isRecalledBySelf == recallMessage.isRecalledBySelf && this.isInGroup == recallMessage.isInGroup && Intrinsics.areEqual(this.recallReason, recallMessage.recallReason);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecallMessage(@NotNull String groupID, @NotNull String recallMessageOperator, boolean z11, boolean z12, @NotNull String recallReason) {
            super(null);
            Intrinsics.checkNotNullParameter(groupID, "groupID");
            Intrinsics.checkNotNullParameter(recallMessageOperator, "recallMessageOperator");
            Intrinsics.checkNotNullParameter(recallReason, "recallReason");
            this.groupID = groupID;
            this.recallMessageOperator = recallMessageOperator;
            this.isRecalledBySelf = z11;
            this.isInGroup = z12;
            this.recallReason = recallReason;
        }

        public static /* synthetic */ RecallMessage copy$default(RecallMessage recallMessage, String str, String str2, boolean z11, boolean z12, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = recallMessage.groupID;
            }
            if ((i11 & 2) != 0) {
                str2 = recallMessage.recallMessageOperator;
            }
            if ((i11 & 4) != 0) {
                z11 = recallMessage.isRecalledBySelf;
            }
            if ((i11 & 8) != 0) {
                z12 = recallMessage.isInGroup;
            }
            if ((i11 & 16) != 0) {
                str3 = recallMessage.recallReason;
            }
            String str4 = str3;
            boolean z13 = z11;
            return recallMessage.copy(str, str2, z13, z12, str4);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getGroupID() {
            return this.groupID;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getRecallMessageOperator() {
            return this.recallMessageOperator;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getIsRecalledBySelf() {
            return this.isRecalledBySelf;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIsInGroup() {
            return this.isInGroup;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getRecallReason() {
            return this.recallReason;
        }

        @NotNull
        public final RecallMessage copy(@NotNull String groupID, @NotNull String recallMessageOperator, boolean isRecalledBySelf, boolean isInGroup, @NotNull String recallReason) {
            Intrinsics.checkNotNullParameter(groupID, "groupID");
            Intrinsics.checkNotNullParameter(recallMessageOperator, "recallMessageOperator");
            Intrinsics.checkNotNullParameter(recallReason, "recallReason");
            return new RecallMessage(groupID, recallMessageOperator, isRecalledBySelf, isInGroup, recallReason);
        }

        @NotNull
        public final String getGroupID() {
            return this.groupID;
        }

        @NotNull
        public final String getRecallMessageOperator() {
            return this.recallMessageOperator;
        }

        @NotNull
        public final String getRecallReason() {
            return this.recallReason;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [int] */
        /* JADX WARN: Type inference failed for: r0v6, types: [int] */
        /* JADX WARN: Type inference failed for: r2v2, types: [int] */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1, types: [int] */
        /* JADX WARN: Type inference failed for: r3v2 */
        public int hashCode() {
            int iM88220a = AbstractC39391a.m88220a(this.recallMessageOperator, this.groupID.hashCode() * 31, 31);
            boolean z11 = this.isRecalledBySelf;
            ?? r11 = z11;
            if (z11) {
                r11 = 1;
            }
            int i11 = (iM88220a + r11) * 31;
            boolean z12 = this.isInGroup;
            return this.recallReason.hashCode() + ((i11 + (z12 ? 1 : z12)) * 31);
        }

        public final boolean isInGroup() {
            return this.isInGroup;
        }

        public final boolean isRecalledBySelf() {
            return this.isRecalledBySelf;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("RecallMessage(groupID=");
            sb2.append(this.groupID);
            sb2.append(", recallMessageOperator=");
            sb2.append(this.recallMessageOperator);
            sb2.append(", isRecalledBySelf=");
            sb2.append(this.isRecalledBySelf);
            sb2.append(", isInGroup=");
            sb2.append(this.isInGroup);
            sb2.append(", recallReason=");
            return AbstractC39392b.m88221a(sb2, this.recallReason, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.groupID);
            parcel.writeString(this.recallMessageOperator);
            parcel.writeInt(this.isRecalledBySelf ? 1 : 0);
            parcel.writeInt(this.isInGroup ? 1 : 0);
            parcel.writeString(this.recallReason);
        }
    }

    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u001c"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$SetGroupAdmin;", "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo;", "groupID", "", "setAdminOperator", "setAdminMembersShowName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getGroupID", "()Ljava/lang/String;", "getSetAdminMembersShowName", "getSetAdminOperator", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final /* data */ class SetGroupAdmin extends SystemMessageInfo {

        @NotNull
        public static final Parcelable.Creator<SetGroupAdmin> CREATOR = new Creator();

        @NotNull
        private final String groupID;

        @NotNull
        private final String setAdminMembersShowName;

        @NotNull
        private final String setAdminOperator;

        @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
        public static final class Creator implements Parcelable.Creator<SetGroupAdmin> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SetGroupAdmin createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SetGroupAdmin(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SetGroupAdmin[] newArray(int i11) {
                return new SetGroupAdmin[i11];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SetGroupAdmin)) {
                return false;
            }
            SetGroupAdmin setGroupAdmin = (SetGroupAdmin) other;
            return Intrinsics.areEqual(this.groupID, setGroupAdmin.groupID) && Intrinsics.areEqual(this.setAdminOperator, setGroupAdmin.setAdminOperator) && Intrinsics.areEqual(this.setAdminMembersShowName, setGroupAdmin.setAdminMembersShowName);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetGroupAdmin(@NotNull String groupID, @NotNull String setAdminOperator, @NotNull String setAdminMembersShowName) {
            super(null);
            Intrinsics.checkNotNullParameter(groupID, "groupID");
            Intrinsics.checkNotNullParameter(setAdminOperator, "setAdminOperator");
            Intrinsics.checkNotNullParameter(setAdminMembersShowName, "setAdminMembersShowName");
            this.groupID = groupID;
            this.setAdminOperator = setAdminOperator;
            this.setAdminMembersShowName = setAdminMembersShowName;
        }

        public static /* synthetic */ SetGroupAdmin copy$default(SetGroupAdmin setGroupAdmin, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = setGroupAdmin.groupID;
            }
            if ((i11 & 2) != 0) {
                str2 = setGroupAdmin.setAdminOperator;
            }
            if ((i11 & 4) != 0) {
                str3 = setGroupAdmin.setAdminMembersShowName;
            }
            return setGroupAdmin.copy(str, str2, str3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getGroupID() {
            return this.groupID;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSetAdminOperator() {
            return this.setAdminOperator;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getSetAdminMembersShowName() {
            return this.setAdminMembersShowName;
        }

        @NotNull
        public final SetGroupAdmin copy(@NotNull String groupID, @NotNull String setAdminOperator, @NotNull String setAdminMembersShowName) {
            Intrinsics.checkNotNullParameter(groupID, "groupID");
            Intrinsics.checkNotNullParameter(setAdminOperator, "setAdminOperator");
            Intrinsics.checkNotNullParameter(setAdminMembersShowName, "setAdminMembersShowName");
            return new SetGroupAdmin(groupID, setAdminOperator, setAdminMembersShowName);
        }

        @NotNull
        public final String getGroupID() {
            return this.groupID;
        }

        @NotNull
        public final String getSetAdminMembersShowName() {
            return this.setAdminMembersShowName;
        }

        @NotNull
        public final String getSetAdminOperator() {
            return this.setAdminOperator;
        }

        public int hashCode() {
            return this.setAdminMembersShowName.hashCode() + AbstractC39391a.m88220a(this.setAdminOperator, this.groupID.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("SetGroupAdmin(groupID=");
            sb2.append(this.groupID);
            sb2.append(", setAdminOperator=");
            sb2.append(this.setAdminOperator);
            sb2.append(", setAdminMembersShowName=");
            return AbstractC39392b.m88221a(sb2, this.setAdminMembersShowName, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.groupID);
            parcel.writeString(this.setAdminOperator);
            parcel.writeString(this.setAdminMembersShowName);
        }
    }

    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$Unknown;", "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Unknown extends SystemMessageInfo {

        @NotNull
        public static final Unknown INSTANCE = new Unknown();

        @NotNull
        public static final Parcelable.Creator<Unknown> CREATOR = new Creator();

        @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
        public static final class Creator implements Parcelable.Creator<Unknown> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Unknown createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Unknown.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Unknown[] newArray(int i11) {
                return new Unknown[i11];
            }
        }

        private Unknown() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$UnpinGroupMessage;", "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo;", "groupID", "", "unpinGroupMessageOperator", "(Ljava/lang/String;Ljava/lang/String;)V", "getGroupID", "()Ljava/lang/String;", "getUnpinGroupMessageOperator", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final /* data */ class UnpinGroupMessage extends SystemMessageInfo {

        @NotNull
        public static final Parcelable.Creator<UnpinGroupMessage> CREATOR = new Creator();

        @NotNull
        private final String groupID;

        @NotNull
        private final String unpinGroupMessageOperator;

        @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
        public static final class Creator implements Parcelable.Creator<UnpinGroupMessage> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final UnpinGroupMessage createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UnpinGroupMessage(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final UnpinGroupMessage[] newArray(int i11) {
                return new UnpinGroupMessage[i11];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UnpinGroupMessage)) {
                return false;
            }
            UnpinGroupMessage unpinGroupMessage = (UnpinGroupMessage) other;
            return Intrinsics.areEqual(this.groupID, unpinGroupMessage.groupID) && Intrinsics.areEqual(this.unpinGroupMessageOperator, unpinGroupMessage.unpinGroupMessageOperator);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnpinGroupMessage(@NotNull String groupID, @NotNull String unpinGroupMessageOperator) {
            super(null);
            Intrinsics.checkNotNullParameter(groupID, "groupID");
            Intrinsics.checkNotNullParameter(unpinGroupMessageOperator, "unpinGroupMessageOperator");
            this.groupID = groupID;
            this.unpinGroupMessageOperator = unpinGroupMessageOperator;
        }

        public static /* synthetic */ UnpinGroupMessage copy$default(UnpinGroupMessage unpinGroupMessage, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = unpinGroupMessage.groupID;
            }
            if ((i11 & 2) != 0) {
                str2 = unpinGroupMessage.unpinGroupMessageOperator;
            }
            return unpinGroupMessage.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getGroupID() {
            return this.groupID;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getUnpinGroupMessageOperator() {
            return this.unpinGroupMessageOperator;
        }

        @NotNull
        public final UnpinGroupMessage copy(@NotNull String groupID, @NotNull String unpinGroupMessageOperator) {
            Intrinsics.checkNotNullParameter(groupID, "groupID");
            Intrinsics.checkNotNullParameter(unpinGroupMessageOperator, "unpinGroupMessageOperator");
            return new UnpinGroupMessage(groupID, unpinGroupMessageOperator);
        }

        @NotNull
        public final String getGroupID() {
            return this.groupID;
        }

        @NotNull
        public final String getUnpinGroupMessageOperator() {
            return this.unpinGroupMessageOperator;
        }

        public int hashCode() {
            return this.unpinGroupMessageOperator.hashCode() + (this.groupID.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("UnpinGroupMessage(groupID=");
            sb2.append(this.groupID);
            sb2.append(", unpinGroupMessageOperator=");
            return AbstractC39392b.m88221a(sb2, this.unpinGroupMessageOperator, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.groupID);
            parcel.writeString(this.unpinGroupMessageOperator);
        }
    }

    public /* synthetic */ SystemMessageInfo(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SystemMessageInfo() {
    }
}
