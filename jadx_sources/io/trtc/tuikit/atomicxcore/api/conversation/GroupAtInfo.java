package io.trtc.tuikit.atomicxcore.api.conversation;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/conversation/GroupAtInfo;", "Landroid/os/Parcelable;", "msgSeq", "", "atType", "Lio/trtc/tuikit/atomicxcore/api/conversation/GroupAtType;", "(JLio/trtc/tuikit/atomicxcore/api/conversation/GroupAtType;)V", "getAtType", "()Lio/trtc/tuikit/atomicxcore/api/conversation/GroupAtType;", "getMsgSeq", "()J", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class GroupAtInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<GroupAtInfo> CREATOR = new Creator();

    @NotNull
    private final GroupAtType atType;
    private final long msgSeq;

    @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<GroupAtInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final GroupAtInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GroupAtInfo(parcel.readLong(), GroupAtType.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final GroupAtInfo[] newArray(int i11) {
            return new GroupAtInfo[i11];
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
        if (!(other instanceof GroupAtInfo)) {
            return false;
        }
        GroupAtInfo groupAtInfo = (GroupAtInfo) other;
        return this.msgSeq == groupAtInfo.msgSeq && this.atType == groupAtInfo.atType;
    }

    public GroupAtInfo(long j11, @NotNull GroupAtType atType) {
        Intrinsics.checkNotNullParameter(atType, "atType");
        this.msgSeq = j11;
        this.atType = atType;
    }

    public static /* synthetic */ GroupAtInfo copy$default(GroupAtInfo groupAtInfo, long j11, GroupAtType groupAtType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = groupAtInfo.msgSeq;
        }
        if ((i11 & 2) != 0) {
            groupAtType = groupAtInfo.atType;
        }
        return groupAtInfo.copy(j11, groupAtType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getMsgSeq() {
        return this.msgSeq;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final GroupAtType getAtType() {
        return this.atType;
    }

    @NotNull
    public final GroupAtInfo copy(long msgSeq, @NotNull GroupAtType atType) {
        Intrinsics.checkNotNullParameter(atType, "atType");
        return new GroupAtInfo(msgSeq, atType);
    }

    @NotNull
    public final GroupAtType getAtType() {
        return this.atType;
    }

    public final long getMsgSeq() {
        return this.msgSeq;
    }

    public int hashCode() {
        return this.atType.hashCode() + (Long.hashCode(this.msgSeq) * 31);
    }

    @NotNull
    public String toString() {
        return "GroupAtInfo(msgSeq=" + this.msgSeq + ", atType=" + this.atType + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeLong(this.msgSeq);
        parcel.writeString(this.atType.name());
    }
}
