package io.trtc.tuikit.atomicxcore.api.conversation;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001f"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationFetchOption;", "Landroid/os/Parcelable;", "filter", "Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListFilter;", "count", "", "(Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListFilter;I)V", "getCount", "()I", "setCount", "(I)V", "getFilter", "()Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListFilter;", "setFilter", "(Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListFilter;)V", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class ConversationFetchOption implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ConversationFetchOption> CREATOR = new Creator();
    private int count;

    @Nullable
    private ConversationListFilter filter;

    @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<ConversationFetchOption> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ConversationFetchOption createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ConversationFetchOption(parcel.readInt() == 0 ? null : ConversationListFilter.CREATOR.createFromParcel(parcel), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ConversationFetchOption[] newArray(int i11) {
            return new ConversationFetchOption[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConversationFetchOption() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationFetchOption)) {
            return false;
        }
        ConversationFetchOption conversationFetchOption = (ConversationFetchOption) other;
        return Intrinsics.areEqual(this.filter, conversationFetchOption.filter) && this.count == conversationFetchOption.count;
    }

    public ConversationFetchOption(@Nullable ConversationListFilter conversationListFilter, int i11) {
        this.filter = conversationListFilter;
        this.count = i11;
    }

    public static /* synthetic */ ConversationFetchOption copy$default(ConversationFetchOption conversationFetchOption, ConversationListFilter conversationListFilter, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            conversationListFilter = conversationFetchOption.filter;
        }
        if ((i12 & 2) != 0) {
            i11 = conversationFetchOption.count;
        }
        return conversationFetchOption.copy(conversationListFilter, i11);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ConversationListFilter getFilter() {
        return this.filter;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final ConversationFetchOption copy(@Nullable ConversationListFilter filter, int count) {
        return new ConversationFetchOption(filter, count);
    }

    public final int getCount() {
        return this.count;
    }

    @Nullable
    public final ConversationListFilter getFilter() {
        return this.filter;
    }

    public int hashCode() {
        ConversationListFilter conversationListFilter = this.filter;
        return Integer.hashCode(this.count) + ((conversationListFilter == null ? 0 : conversationListFilter.hashCode()) * 31);
    }

    public final void setCount(int i11) {
        this.count = i11;
    }

    public final void setFilter(@Nullable ConversationListFilter conversationListFilter) {
        this.filter = conversationListFilter;
    }

    @NotNull
    public String toString() {
        return "ConversationFetchOption(filter=" + this.filter + ", count=" + this.count + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        ConversationListFilter conversationListFilter = this.filter;
        if (conversationListFilter == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            conversationListFilter.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.count);
    }

    public /* synthetic */ ConversationFetchOption(ConversationListFilter conversationListFilter, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? null : conversationListFilter, (i12 & 2) != 0 ? 100 : i11);
    }
}
