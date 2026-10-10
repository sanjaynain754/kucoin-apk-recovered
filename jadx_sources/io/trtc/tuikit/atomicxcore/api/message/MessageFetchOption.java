package io.trtc.tuikit.atomicxcore.api.message;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003J=\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u000bHÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchOption;", "", "message", "Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;", "messageSeq", "", "direction", "Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;", "filterType", "Lio/trtc/tuikit/atomicxcore/api/message/MessageFilterType;", "pageCount", "", "(Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;JLio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;Lio/trtc/tuikit/atomicxcore/api/message/MessageFilterType;I)V", "getDirection", "()Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;", "getFilterType", "()Lio/trtc/tuikit/atomicxcore/api/message/MessageFilterType;", "getMessage", "()Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;", "getMessageSeq", "()J", "getPageCount", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class MessageFetchOption {

    @NotNull
    private final MessageFetchDirection direction;

    @NotNull
    private final MessageFilterType filterType;

    @Nullable
    private final MessageInfo message;
    private final long messageSeq;
    private final int pageCount;

    public MessageFetchOption() {
        this(null, 0L, null, null, 0, 31, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageFetchOption)) {
            return false;
        }
        MessageFetchOption messageFetchOption = (MessageFetchOption) other;
        return Intrinsics.areEqual(this.message, messageFetchOption.message) && this.messageSeq == messageFetchOption.messageSeq && this.direction == messageFetchOption.direction && Intrinsics.areEqual(this.filterType, messageFetchOption.filterType) && this.pageCount == messageFetchOption.pageCount;
    }

    public MessageFetchOption(@Nullable MessageInfo messageInfo, long j11, @NotNull MessageFetchDirection direction, @NotNull MessageFilterType filterType, int i11) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(filterType, "filterType");
        this.message = messageInfo;
        this.messageSeq = j11;
        this.direction = direction;
        this.filterType = filterType;
        this.pageCount = i11;
    }

    public static /* synthetic */ MessageFetchOption copy$default(MessageFetchOption messageFetchOption, MessageInfo messageInfo, long j11, MessageFetchDirection messageFetchDirection, MessageFilterType messageFilterType, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            messageInfo = messageFetchOption.message;
        }
        if ((i12 & 2) != 0) {
            j11 = messageFetchOption.messageSeq;
        }
        if ((i12 & 4) != 0) {
            messageFetchDirection = messageFetchOption.direction;
        }
        if ((i12 & 8) != 0) {
            messageFilterType = messageFetchOption.filterType;
        }
        if ((i12 & 16) != 0) {
            i11 = messageFetchOption.pageCount;
        }
        int i13 = i11;
        MessageFetchDirection messageFetchDirection2 = messageFetchDirection;
        return messageFetchOption.copy(messageInfo, j11, messageFetchDirection2, messageFilterType, i13);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MessageInfo getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getMessageSeq() {
        return this.messageSeq;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MessageFetchDirection getDirection() {
        return this.direction;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final MessageFilterType getFilterType() {
        return this.filterType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPageCount() {
        return this.pageCount;
    }

    @NotNull
    public final MessageFetchOption copy(@Nullable MessageInfo message, long messageSeq, @NotNull MessageFetchDirection direction, @NotNull MessageFilterType filterType, int pageCount) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(filterType, "filterType");
        return new MessageFetchOption(message, messageSeq, direction, filterType, pageCount);
    }

    @NotNull
    public final MessageFetchDirection getDirection() {
        return this.direction;
    }

    @NotNull
    public final MessageFilterType getFilterType() {
        return this.filterType;
    }

    @Nullable
    public final MessageInfo getMessage() {
        return this.message;
    }

    public final long getMessageSeq() {
        return this.messageSeq;
    }

    public final int getPageCount() {
        return this.pageCount;
    }

    public int hashCode() {
        MessageInfo messageInfo = this.message;
        return Integer.hashCode(this.pageCount) + ((this.filterType.hashCode() + ((this.direction.hashCode() + ((Long.hashCode(this.messageSeq) + ((messageInfo == null ? 0 : messageInfo.hashCode()) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "MessageFetchOption(message=" + this.message + ", messageSeq=" + this.messageSeq + ", direction=" + this.direction + ", filterType=" + this.filterType + ", pageCount=" + this.pageCount + ')';
    }

    public /* synthetic */ MessageFetchOption(MessageInfo messageInfo, long j11, MessageFetchDirection messageFetchDirection, MessageFilterType messageFilterType, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? null : messageInfo, (i12 & 2) != 0 ? 0L : j11, (i12 & 4) != 0 ? MessageFetchDirection.OLDER : messageFetchDirection, (i12 & 8) != 0 ? MessageFilterType.All : messageFilterType, (i12 & 16) != 0 ? 20 : i11);
    }
}
