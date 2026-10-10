package com.kubi.chat.entity;

import androidx.annotation.Keep;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/chat/entity/ChatHasUnreadRequest;", "", TypedValues.TransitionType.S_TO, "", "(Ljava/lang/String;)V", "getTo", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "ImSDK_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final /* data */ class ChatHasUnreadRequest {

    @Nullable
    private final String to;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ChatHasUnreadRequest) && Intrinsics.areEqual(this.to, ((ChatHasUnreadRequest) other).to);
    }

    public static /* synthetic */ ChatHasUnreadRequest copy$default(ChatHasUnreadRequest chatHasUnreadRequest, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = chatHasUnreadRequest.to;
        }
        return chatHasUnreadRequest.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTo() {
        return this.to;
    }

    @NotNull
    public final ChatHasUnreadRequest copy(@Nullable String to2) {
        return new ChatHasUnreadRequest(to2);
    }

    @Nullable
    public final String getTo() {
        return this.to;
    }

    public int hashCode() {
        String str = this.to;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        return "ChatHasUnreadRequest(to=" + ((Object) this.to) + ')';
    }

    public ChatHasUnreadRequest(@Nullable String str) {
        this.to = str;
    }
}
