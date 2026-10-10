package com.kubi.chat.entity;

import androidx.annotation.Keep;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/chat/entity/ChatHistoryRequest;", "", TypedValues.TransitionType.S_TO, "", "seqId", "pageSize", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getPageSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSeqId", "()Ljava/lang/String;", "getTo", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/kubi/chat/entity/ChatHistoryRequest;", "equals", "", "other", "hashCode", "toString", "ImSDK_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final /* data */ class ChatHistoryRequest {

    @Nullable
    private final Integer pageSize;

    @Nullable
    private final String seqId;

    @Nullable
    private final String to;

    public ChatHistoryRequest(@Nullable String str, @Nullable String str2, @Nullable Integer num) {
        this.to = str;
        this.seqId = str2;
        this.pageSize = num;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatHistoryRequest)) {
            return false;
        }
        ChatHistoryRequest chatHistoryRequest = (ChatHistoryRequest) other;
        return Intrinsics.areEqual(this.to, chatHistoryRequest.to) && Intrinsics.areEqual(this.seqId, chatHistoryRequest.seqId) && Intrinsics.areEqual(this.pageSize, chatHistoryRequest.pageSize);
    }

    public static /* synthetic */ ChatHistoryRequest copy$default(ChatHistoryRequest chatHistoryRequest, String str, String str2, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = chatHistoryRequest.to;
        }
        if ((i11 & 2) != 0) {
            str2 = chatHistoryRequest.seqId;
        }
        if ((i11 & 4) != 0) {
            num = chatHistoryRequest.pageSize;
        }
        return chatHistoryRequest.copy(str, str2, num);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTo() {
        return this.to;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSeqId() {
        return this.seqId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getPageSize() {
        return this.pageSize;
    }

    @NotNull
    public final ChatHistoryRequest copy(@Nullable String to2, @Nullable String seqId, @Nullable Integer pageSize) {
        return new ChatHistoryRequest(to2, seqId, pageSize);
    }

    @Nullable
    public final Integer getPageSize() {
        return this.pageSize;
    }

    @Nullable
    public final String getSeqId() {
        return this.seqId;
    }

    @Nullable
    public final String getTo() {
        return this.to;
    }

    public int hashCode() {
        String str = this.to;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.seqId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.pageSize;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ChatHistoryRequest(to=" + ((Object) this.to) + ", seqId=" + ((Object) this.seqId) + ", pageSize=" + this.pageSize + ')';
    }

    public /* synthetic */ ChatHistoryRequest(String str, String str2, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? 20 : num);
    }
}
