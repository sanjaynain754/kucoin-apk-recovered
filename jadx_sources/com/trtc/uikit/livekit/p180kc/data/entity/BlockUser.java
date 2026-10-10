package com.trtc.uikit.livekit.p180kc.data.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BlockUser.kt */
/* JADX INFO: loaded from: classes60.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/data/entity/BlockUser;", "", "<init>", "()V", "Request", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BlockUser {

    /* JADX INFO: compiled from: BlockUser.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/data/entity/BlockUser$Request;", "", "roomId", "", "<init>", "(Ljava/lang/String;)V", "getRoomId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Request {

        @NotNull
        private final String roomId;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Request) && Intrinsics.areEqual(this.roomId, ((Request) other).roomId);
        }

        public Request(@NotNull String roomId) {
            Intrinsics.checkNotNullParameter(roomId, "roomId");
            this.roomId = roomId;
        }

        public static /* synthetic */ Request copy$default(Request request, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = request.roomId;
            }
            return request.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getRoomId() {
            return this.roomId;
        }

        @NotNull
        public final Request copy(@NotNull String roomId) {
            Intrinsics.checkNotNullParameter(roomId, "roomId");
            return new Request(roomId);
        }

        @NotNull
        public final String getRoomId() {
            return this.roomId;
        }

        public int hashCode() {
            return this.roomId.hashCode();
        }

        @NotNull
        public String toString() {
            return "Request(roomId=" + this.roomId + ')';
        }
    }
}
