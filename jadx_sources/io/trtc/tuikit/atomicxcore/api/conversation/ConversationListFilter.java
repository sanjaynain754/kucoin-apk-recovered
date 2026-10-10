package io.trtc.tuikit.atomicxcore.api.conversation;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0011JH\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010%J\t\u0010&\u001a\u00020'HÖ\u0001J\u0013\u0010(\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020'HÖ\u0001J\t\u0010,\u001a\u00020\u0005HÖ\u0001J\u0019\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020'HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\n\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u00062"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListFilter;", "Landroid/os/Parcelable;", "type", "Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationType;", "conversationGroup", "", "markType", "Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationMarkType;", "hasUnreadCount", "", "hasGroupAtInfo", "(Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationType;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationMarkType;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getConversationGroup", "()Ljava/lang/String;", "setConversationGroup", "(Ljava/lang/String;)V", "getHasGroupAtInfo", "()Ljava/lang/Boolean;", "setHasGroupAtInfo", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getHasUnreadCount", "setHasUnreadCount", "getMarkType", "()Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationMarkType;", "setMarkType", "(Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationMarkType;)V", "getType", "()Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationType;", "setType", "(Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationType;)V", "component1", "component2", "component3", "component4", "component5", "copy", "(Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationType;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationMarkType;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListFilter;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class ConversationListFilter implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ConversationListFilter> CREATOR = new Creator();

    @Nullable
    private String conversationGroup;

    @Nullable
    private Boolean hasGroupAtInfo;

    @Nullable
    private Boolean hasUnreadCount;

    @Nullable
    private ConversationMarkType markType;

    @NotNull
    private ConversationType type;

    @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<ConversationListFilter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ConversationListFilter createFromParcel(@NotNull Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ConversationType conversationTypeValueOf = ConversationType.valueOf(parcel.readString());
            String string = parcel.readString();
            Boolean boolValueOf2 = null;
            ConversationMarkType conversationMarkTypeValueOf = parcel.readInt() == 0 ? null : ConversationMarkType.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ConversationListFilter(conversationTypeValueOf, string, conversationMarkTypeValueOf, boolValueOf, boolValueOf2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ConversationListFilter[] newArray(int i11) {
            return new ConversationListFilter[i11];
        }
    }

    public ConversationListFilter() {
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
        if (!(other instanceof ConversationListFilter)) {
            return false;
        }
        ConversationListFilter conversationListFilter = (ConversationListFilter) other;
        return this.type == conversationListFilter.type && Intrinsics.areEqual(this.conversationGroup, conversationListFilter.conversationGroup) && this.markType == conversationListFilter.markType && Intrinsics.areEqual(this.hasUnreadCount, conversationListFilter.hasUnreadCount) && Intrinsics.areEqual(this.hasGroupAtInfo, conversationListFilter.hasGroupAtInfo);
    }

    public ConversationListFilter(@NotNull ConversationType type, @Nullable String str, @Nullable ConversationMarkType conversationMarkType, @Nullable Boolean bool, @Nullable Boolean bool2) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.conversationGroup = str;
        this.markType = conversationMarkType;
        this.hasUnreadCount = bool;
        this.hasGroupAtInfo = bool2;
    }

    public static /* synthetic */ ConversationListFilter copy$default(ConversationListFilter conversationListFilter, ConversationType conversationType, String str, ConversationMarkType conversationMarkType, Boolean bool, Boolean bool2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            conversationType = conversationListFilter.type;
        }
        if ((i11 & 2) != 0) {
            str = conversationListFilter.conversationGroup;
        }
        if ((i11 & 4) != 0) {
            conversationMarkType = conversationListFilter.markType;
        }
        if ((i11 & 8) != 0) {
            bool = conversationListFilter.hasUnreadCount;
        }
        if ((i11 & 16) != 0) {
            bool2 = conversationListFilter.hasGroupAtInfo;
        }
        Boolean bool3 = bool2;
        ConversationMarkType conversationMarkType2 = conversationMarkType;
        return conversationListFilter.copy(conversationType, str, conversationMarkType2, bool, bool3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ConversationType getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getConversationGroup() {
        return this.conversationGroup;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ConversationMarkType getMarkType() {
        return this.markType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getHasUnreadCount() {
        return this.hasUnreadCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getHasGroupAtInfo() {
        return this.hasGroupAtInfo;
    }

    @Nullable
    public final String getConversationGroup() {
        return this.conversationGroup;
    }

    @Nullable
    public final Boolean getHasGroupAtInfo() {
        return this.hasGroupAtInfo;
    }

    @Nullable
    public final Boolean getHasUnreadCount() {
        return this.hasUnreadCount;
    }

    @Nullable
    public final ConversationMarkType getMarkType() {
        return this.markType;
    }

    @NotNull
    public final ConversationType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.conversationGroup;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ConversationMarkType conversationMarkType = this.markType;
        int iHashCode3 = (iHashCode2 + (conversationMarkType == null ? 0 : conversationMarkType.hashCode())) * 31;
        Boolean bool = this.hasUnreadCount;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasGroupAtInfo;
        return iHashCode4 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final void setConversationGroup(@Nullable String str) {
        this.conversationGroup = str;
    }

    public final void setHasGroupAtInfo(@Nullable Boolean bool) {
        this.hasGroupAtInfo = bool;
    }

    public final void setHasUnreadCount(@Nullable Boolean bool) {
        this.hasUnreadCount = bool;
    }

    public final void setMarkType(@Nullable ConversationMarkType conversationMarkType) {
        this.markType = conversationMarkType;
    }

    public final void setType(@NotNull ConversationType conversationType) {
        Intrinsics.checkNotNullParameter(conversationType, "<set-?>");
        this.type = conversationType;
    }

    @NotNull
    public String toString() {
        return "ConversationListFilter(type=" + this.type + ", conversationGroup=" + this.conversationGroup + ", markType=" + this.markType + ", hasUnreadCount=" + this.hasUnreadCount + ", hasGroupAtInfo=" + this.hasGroupAtInfo + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.type.name());
        parcel.writeString(this.conversationGroup);
        ConversationMarkType conversationMarkType = this.markType;
        if (conversationMarkType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(conversationMarkType.name());
        }
        Boolean bool = this.hasUnreadCount;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.hasGroupAtInfo;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    @NotNull
    public final ConversationListFilter copy(@NotNull ConversationType type, @Nullable String conversationGroup, @Nullable ConversationMarkType markType, @Nullable Boolean hasUnreadCount, @Nullable Boolean hasGroupAtInfo) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new ConversationListFilter(type, conversationGroup, markType, hasUnreadCount, hasGroupAtInfo);
    }

    public /* synthetic */ ConversationListFilter(ConversationType conversationType, String str, ConversationMarkType conversationMarkType, Boolean bool, Boolean bool2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? ConversationType.UNKNOWN : conversationType, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : conversationMarkType, (i11 & 8) != 0 ? null : bool, (i11 & 16) != 0 ? null : bool2);
    }
}
