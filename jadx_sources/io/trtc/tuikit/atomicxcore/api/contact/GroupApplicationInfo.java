package io.trtc.tuikit.atomicxcore.api.contact;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.MimeTypes;
import com.tencent.imsdk.p128v2.V2TIMGroupApplication;
import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39391a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010?\u001a\u00020\u0012HÆ\u0003J\u000e\u0010@\u001a\u00020\u0014HÀ\u0003¢\u0006\u0002\bAJ\t\u0010B\u001a\u00020\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010G\u001a\u00020\nHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u009b\u0001\u0010J\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014HÆ\u0001J\t\u0010K\u001a\u00020LHÖ\u0001J\u0013\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010PHÖ\u0003J\t\u0010Q\u001a\u00020LHÖ\u0001J\t\u0010R\u001a\u00020\u0003HÖ\u0001J\u0019\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020LHÖ\u0001R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0013\u001a\u00020\u0014X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001f\"\u0004\b'\u0010!R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001f\"\u0004\b)\u0010!R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001f\"\u0004\b+\u0010!R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001f\"\u0004\b5\u0010!R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u001f\"\u0004\b7\u0010!R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006X"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationInfo;", "Landroid/os/Parcelable;", "applicationID", "", "groupID", "fromUser", "fromUserNickname", "fromUserAvatarURL", "toUser", "addTime", "", "requestMsg", "handledMsg", "handledStatus", "Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationHandledStatus;", "handledResult", "Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationHandledResult;", "type", "Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationType;", MimeTypes.BASE_TYPE_APPLICATION, "Lcom/tencent/imsdk/v2/V2TIMGroupApplication;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationHandledStatus;Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationHandledResult;Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationType;Lcom/tencent/imsdk/v2/V2TIMGroupApplication;)V", "getAddTime", "()J", "setAddTime", "(J)V", "getApplication$atomicxcore_release", "()Lcom/tencent/imsdk/v2/V2TIMGroupApplication;", "setApplication$atomicxcore_release", "(Lcom/tencent/imsdk/v2/V2TIMGroupApplication;)V", "getApplicationID", "()Ljava/lang/String;", "setApplicationID", "(Ljava/lang/String;)V", "getFromUser", "setFromUser", "getFromUserAvatarURL", "setFromUserAvatarURL", "getFromUserNickname", "setFromUserNickname", "getGroupID", "setGroupID", "getHandledMsg", "setHandledMsg", "getHandledResult", "()Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationHandledResult;", "setHandledResult", "(Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationHandledResult;)V", "getHandledStatus", "()Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationHandledStatus;", "setHandledStatus", "(Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationHandledStatus;)V", "getRequestMsg", "setRequestMsg", "getToUser", "setToUser", "getType", "()Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationType;", "setType", "(Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationType;)V", "component1", "component10", "component11", "component12", "component13", "component13$atomicxcore_release", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class GroupApplicationInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<GroupApplicationInfo> CREATOR = new Creator();
    private long addTime;

    @NotNull
    private V2TIMGroupApplication application;

    @NotNull
    private String applicationID;

    @Nullable
    private String fromUser;

    @Nullable
    private String fromUserAvatarURL;

    @Nullable
    private String fromUserNickname;

    @NotNull
    private String groupID;

    @Nullable
    private String handledMsg;

    @Nullable
    private GroupApplicationHandledResult handledResult;

    @Nullable
    private GroupApplicationHandledStatus handledStatus;

    @Nullable
    private String requestMsg;

    @Nullable
    private String toUser;

    @NotNull
    private GroupApplicationType type;

    @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<GroupApplicationInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final GroupApplicationInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GroupApplicationInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : GroupApplicationHandledStatus.valueOf(parcel.readString()), parcel.readInt() != 0 ? GroupApplicationHandledResult.valueOf(parcel.readString()) : null, GroupApplicationType.valueOf(parcel.readString()), (V2TIMGroupApplication) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final GroupApplicationInfo[] newArray(int i11) {
            return new GroupApplicationInfo[i11];
        }
    }

    public GroupApplicationInfo(@NotNull String applicationID, @NotNull String groupID, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, long j11, @Nullable String str5, @Nullable String str6, @Nullable GroupApplicationHandledStatus groupApplicationHandledStatus, @Nullable GroupApplicationHandledResult groupApplicationHandledResult, @NotNull GroupApplicationType type, @NotNull V2TIMGroupApplication application) {
        Intrinsics.checkNotNullParameter(applicationID, "applicationID");
        Intrinsics.checkNotNullParameter(groupID, "groupID");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(application, "application");
        this.applicationID = applicationID;
        this.groupID = groupID;
        this.fromUser = str;
        this.fromUserNickname = str2;
        this.fromUserAvatarURL = str3;
        this.toUser = str4;
        this.addTime = j11;
        this.requestMsg = str5;
        this.handledMsg = str6;
        this.handledStatus = groupApplicationHandledStatus;
        this.handledResult = groupApplicationHandledResult;
        this.type = type;
        this.application = application;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupApplicationInfo)) {
            return false;
        }
        GroupApplicationInfo groupApplicationInfo = (GroupApplicationInfo) other;
        return Intrinsics.areEqual(this.applicationID, groupApplicationInfo.applicationID) && Intrinsics.areEqual(this.groupID, groupApplicationInfo.groupID) && Intrinsics.areEqual(this.fromUser, groupApplicationInfo.fromUser) && Intrinsics.areEqual(this.fromUserNickname, groupApplicationInfo.fromUserNickname) && Intrinsics.areEqual(this.fromUserAvatarURL, groupApplicationInfo.fromUserAvatarURL) && Intrinsics.areEqual(this.toUser, groupApplicationInfo.toUser) && this.addTime == groupApplicationInfo.addTime && Intrinsics.areEqual(this.requestMsg, groupApplicationInfo.requestMsg) && Intrinsics.areEqual(this.handledMsg, groupApplicationInfo.handledMsg) && this.handledStatus == groupApplicationInfo.handledStatus && this.handledResult == groupApplicationInfo.handledResult && this.type == groupApplicationInfo.type && Intrinsics.areEqual(this.application, groupApplicationInfo.application);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApplicationID() {
        return this.applicationID;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final GroupApplicationHandledStatus getHandledStatus() {
        return this.handledStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final GroupApplicationHandledResult getHandledResult() {
        return this.handledResult;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final GroupApplicationType getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component13$atomicxcore_release, reason: from getter */
    public final V2TIMGroupApplication getApplication() {
        return this.application;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getGroupID() {
        return this.groupID;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFromUser() {
        return this.fromUser;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFromUserNickname() {
        return this.fromUserNickname;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFromUserAvatarURL() {
        return this.fromUserAvatarURL;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getToUser() {
        return this.toUser;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getAddTime() {
        return this.addTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getRequestMsg() {
        return this.requestMsg;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getHandledMsg() {
        return this.handledMsg;
    }

    @NotNull
    public final GroupApplicationInfo copy(@NotNull String applicationID, @NotNull String groupID, @Nullable String fromUser, @Nullable String fromUserNickname, @Nullable String fromUserAvatarURL, @Nullable String toUser, long addTime, @Nullable String requestMsg, @Nullable String handledMsg, @Nullable GroupApplicationHandledStatus handledStatus, @Nullable GroupApplicationHandledResult handledResult, @NotNull GroupApplicationType type, @NotNull V2TIMGroupApplication application) {
        Intrinsics.checkNotNullParameter(applicationID, "applicationID");
        Intrinsics.checkNotNullParameter(groupID, "groupID");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(application, "application");
        return new GroupApplicationInfo(applicationID, groupID, fromUser, fromUserNickname, fromUserAvatarURL, toUser, addTime, requestMsg, handledMsg, handledStatus, handledResult, type, application);
    }

    public final long getAddTime() {
        return this.addTime;
    }

    @NotNull
    public final V2TIMGroupApplication getApplication$atomicxcore_release() {
        return this.application;
    }

    @NotNull
    public final String getApplicationID() {
        return this.applicationID;
    }

    @Nullable
    public final String getFromUser() {
        return this.fromUser;
    }

    @Nullable
    public final String getFromUserAvatarURL() {
        return this.fromUserAvatarURL;
    }

    @Nullable
    public final String getFromUserNickname() {
        return this.fromUserNickname;
    }

    @NotNull
    public final String getGroupID() {
        return this.groupID;
    }

    @Nullable
    public final String getHandledMsg() {
        return this.handledMsg;
    }

    @Nullable
    public final GroupApplicationHandledResult getHandledResult() {
        return this.handledResult;
    }

    @Nullable
    public final GroupApplicationHandledStatus getHandledStatus() {
        return this.handledStatus;
    }

    @Nullable
    public final String getRequestMsg() {
        return this.requestMsg;
    }

    @Nullable
    public final String getToUser() {
        return this.toUser;
    }

    @NotNull
    public final GroupApplicationType getType() {
        return this.type;
    }

    public int hashCode() {
        int iM88220a = AbstractC39391a.m88220a(this.groupID, this.applicationID.hashCode() * 31, 31);
        String str = this.fromUser;
        int iHashCode = (iM88220a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fromUserNickname;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fromUserAvatarURL;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.toUser;
        int iHashCode4 = (Long.hashCode(this.addTime) + ((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        String str5 = this.requestMsg;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.handledMsg;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        GroupApplicationHandledStatus groupApplicationHandledStatus = this.handledStatus;
        int iHashCode7 = (iHashCode6 + (groupApplicationHandledStatus == null ? 0 : groupApplicationHandledStatus.hashCode())) * 31;
        GroupApplicationHandledResult groupApplicationHandledResult = this.handledResult;
        int iHashCode8 = groupApplicationHandledResult != null ? groupApplicationHandledResult.hashCode() : 0;
        return this.application.hashCode() + ((this.type.hashCode() + ((iHashCode7 + iHashCode8) * 31)) * 31);
    }

    public final void setAddTime(long j11) {
        this.addTime = j11;
    }

    public final void setApplication$atomicxcore_release(@NotNull V2TIMGroupApplication v2TIMGroupApplication) {
        Intrinsics.checkNotNullParameter(v2TIMGroupApplication, "<set-?>");
        this.application = v2TIMGroupApplication;
    }

    public final void setApplicationID(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.applicationID = str;
    }

    public final void setFromUser(@Nullable String str) {
        this.fromUser = str;
    }

    public final void setFromUserAvatarURL(@Nullable String str) {
        this.fromUserAvatarURL = str;
    }

    public final void setFromUserNickname(@Nullable String str) {
        this.fromUserNickname = str;
    }

    public final void setGroupID(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.groupID = str;
    }

    public final void setHandledMsg(@Nullable String str) {
        this.handledMsg = str;
    }

    public final void setHandledResult(@Nullable GroupApplicationHandledResult groupApplicationHandledResult) {
        this.handledResult = groupApplicationHandledResult;
    }

    public final void setHandledStatus(@Nullable GroupApplicationHandledStatus groupApplicationHandledStatus) {
        this.handledStatus = groupApplicationHandledStatus;
    }

    public final void setRequestMsg(@Nullable String str) {
        this.requestMsg = str;
    }

    public final void setToUser(@Nullable String str) {
        this.toUser = str;
    }

    public final void setType(@NotNull GroupApplicationType groupApplicationType) {
        Intrinsics.checkNotNullParameter(groupApplicationType, "<set-?>");
        this.type = groupApplicationType;
    }

    @NotNull
    public String toString() {
        return "GroupApplicationInfo(applicationID=" + this.applicationID + ", groupID=" + this.groupID + ", fromUser=" + this.fromUser + ", fromUserNickname=" + this.fromUserNickname + ", fromUserAvatarURL=" + this.fromUserAvatarURL + ", toUser=" + this.toUser + ", addTime=" + this.addTime + ", requestMsg=" + this.requestMsg + ", handledMsg=" + this.handledMsg + ", handledStatus=" + this.handledStatus + ", handledResult=" + this.handledResult + ", type=" + this.type + ", application=" + this.application + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.applicationID);
        parcel.writeString(this.groupID);
        parcel.writeString(this.fromUser);
        parcel.writeString(this.fromUserNickname);
        parcel.writeString(this.fromUserAvatarURL);
        parcel.writeString(this.toUser);
        parcel.writeLong(this.addTime);
        parcel.writeString(this.requestMsg);
        parcel.writeString(this.handledMsg);
        GroupApplicationHandledStatus groupApplicationHandledStatus = this.handledStatus;
        if (groupApplicationHandledStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(groupApplicationHandledStatus.name());
        }
        GroupApplicationHandledResult groupApplicationHandledResult = this.handledResult;
        if (groupApplicationHandledResult == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(groupApplicationHandledResult.name());
        }
        parcel.writeString(this.type.name());
        parcel.writeSerializable(this.application);
    }

    public /* synthetic */ GroupApplicationInfo(String str, String str2, String str3, String str4, String str5, String str6, long j11, String str7, String str8, GroupApplicationHandledStatus groupApplicationHandledStatus, GroupApplicationHandledResult groupApplicationHandledResult, GroupApplicationType groupApplicationType, V2TIMGroupApplication v2TIMGroupApplication, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? 0L : j11, (i11 & 128) != 0 ? null : str7, (i11 & 256) != 0 ? null : str8, (i11 & 512) != 0 ? null : groupApplicationHandledStatus, (i11 & 1024) != 0 ? null : groupApplicationHandledResult, groupApplicationType, v2TIMGroupApplication);
    }
}
