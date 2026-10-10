package io.trtc.tuikit.atomicxcore.api.message;

import android.os.Parcel;
import android.os.Parcelable;
import io.trtc.tuikit.atomicxcore.api.call.AbstractC39396a;
import io.trtc.tuikit.atomicxcore.api.login.UserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J7\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\"\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\u0019\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0005HÖ\u0001R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006,"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/MessageReaction;", "Landroid/os/Parcelable;", "reactionID", "", "totalUserCount", "", "partialUserList", "", "Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;", "reactedByMyself", "", "(Ljava/lang/String;ILjava/util/List;Z)V", "getPartialUserList", "()Ljava/util/List;", "setPartialUserList", "(Ljava/util/List;)V", "getReactedByMyself", "()Z", "setReactedByMyself", "(Z)V", "getReactionID", "()Ljava/lang/String;", "setReactionID", "(Ljava/lang/String;)V", "getTotalUserCount", "()I", "setTotalUserCount", "(I)V", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class MessageReaction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MessageReaction> CREATOR = new Creator();

    @NotNull
    private List<UserProfile> partialUserList;
    private boolean reactedByMyself;

    @NotNull
    private String reactionID;
    private int totalUserCount;

    @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<MessageReaction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MessageReaction createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i11 = parcel.readInt();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                arrayList.add(UserProfile.CREATOR.createFromParcel(parcel));
            }
            return new MessageReaction(string, i11, arrayList, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MessageReaction[] newArray(int i11) {
            return new MessageReaction[i11];
        }
    }

    public MessageReaction(@NotNull String reactionID, int i11, @NotNull List<UserProfile> partialUserList, boolean z11) {
        Intrinsics.checkNotNullParameter(reactionID, "reactionID");
        Intrinsics.checkNotNullParameter(partialUserList, "partialUserList");
        this.reactionID = reactionID;
        this.totalUserCount = i11;
        this.partialUserList = partialUserList;
        this.reactedByMyself = z11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageReaction)) {
            return false;
        }
        MessageReaction messageReaction = (MessageReaction) other;
        return Intrinsics.areEqual(this.reactionID, messageReaction.reactionID) && this.totalUserCount == messageReaction.totalUserCount && Intrinsics.areEqual(this.partialUserList, messageReaction.partialUserList) && this.reactedByMyself == messageReaction.reactedByMyself;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessageReaction copy$default(MessageReaction messageReaction, String str, int i11, List list, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = messageReaction.reactionID;
        }
        if ((i12 & 2) != 0) {
            i11 = messageReaction.totalUserCount;
        }
        if ((i12 & 4) != 0) {
            list = messageReaction.partialUserList;
        }
        if ((i12 & 8) != 0) {
            z11 = messageReaction.reactedByMyself;
        }
        return messageReaction.copy(str, i11, list, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getReactionID() {
        return this.reactionID;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTotalUserCount() {
        return this.totalUserCount;
    }

    @NotNull
    public final List<UserProfile> component3() {
        return this.partialUserList;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getReactedByMyself() {
        return this.reactedByMyself;
    }

    @NotNull
    public final MessageReaction copy(@NotNull String reactionID, int totalUserCount, @NotNull List<UserProfile> partialUserList, boolean reactedByMyself) {
        Intrinsics.checkNotNullParameter(reactionID, "reactionID");
        Intrinsics.checkNotNullParameter(partialUserList, "partialUserList");
        return new MessageReaction(reactionID, totalUserCount, partialUserList, reactedByMyself);
    }

    @NotNull
    public final List<UserProfile> getPartialUserList() {
        return this.partialUserList;
    }

    public final boolean getReactedByMyself() {
        return this.reactedByMyself;
    }

    @NotNull
    public final String getReactionID() {
        return this.reactionID;
    }

    public final int getTotalUserCount() {
        return this.totalUserCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    public int hashCode() {
        int iHashCode = (this.partialUserList.hashCode() + AbstractC39396a.m88225a(this.totalUserCount, this.reactionID.hashCode() * 31, 31)) * 31;
        boolean z11 = this.reactedByMyself;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        return iHashCode + r11;
    }

    public final void setPartialUserList(@NotNull List<UserProfile> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.partialUserList = list;
    }

    public final void setReactedByMyself(boolean z11) {
        this.reactedByMyself = z11;
    }

    public final void setReactionID(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.reactionID = str;
    }

    public final void setTotalUserCount(int i11) {
        this.totalUserCount = i11;
    }

    @NotNull
    public String toString() {
        return "MessageReaction(reactionID=" + this.reactionID + ", totalUserCount=" + this.totalUserCount + ", partialUserList=" + this.partialUserList + ", reactedByMyself=" + this.reactedByMyself + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.reactionID);
        parcel.writeInt(this.totalUserCount);
        List<UserProfile> list = this.partialUserList;
        parcel.writeInt(list.size());
        Iterator<UserProfile> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.reactedByMyself ? 1 : 0);
    }

    public /* synthetic */ MessageReaction(String str, int i11, List list, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? CollectionsKt.emptyList() : list, (i12 & 8) != 0 ? false : z11);
    }
}
