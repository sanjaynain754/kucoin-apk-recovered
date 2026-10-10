package com.kubi.network.api.subscribe.model;

import android.text.TextUtils;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SubscribeResponse.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0006\u0010\u001d\u001a\u00020\u0019R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\r¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/network/api/subscribe/model/SubscribeMessage;", "", "id", "", "userId", "topic", "subject", "data", "extension", "timestamp", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V", "getData", "()Ljava/lang/String;", "getExtension", "()Ljava/lang/Object;", "getId", "getSubject", "getTimestamp", "()J", "setTimestamp", "(J)V", "getTopic", "getUserId", "equals", "", "other", "hashCode", "", "isSocketMessage", "network-adapter-subscribe_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class SubscribeMessage {

    @Nullable
    private final String data;

    @Nullable
    private final Object extension;

    @NotNull
    private final String id;

    @NotNull
    private final String subject;
    private long timestamp;

    @NotNull
    private final String topic;

    @NotNull
    private final String userId;

    public SubscribeMessage(@NotNull String id2, @NotNull String userId, @NotNull String topic, @NotNull String subject, @Nullable String str, @Nullable Object obj, long j11) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(subject, "subject");
        this.id = id2;
        this.userId = userId;
        this.topic = topic;
        this.subject = subject;
        this.data = str;
        this.extension = obj;
        this.timestamp = j11;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(SubscribeMessage.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.kubi.network.api.subscribe.model.SubscribeMessage");
        SubscribeMessage subscribeMessage = (SubscribeMessage) other;
        return Intrinsics.areEqual(this.id, subscribeMessage.id) && Intrinsics.areEqual(this.userId, subscribeMessage.userId) && Intrinsics.areEqual(this.topic, subscribeMessage.topic) && Intrinsics.areEqual(this.subject, subscribeMessage.subject) && Intrinsics.areEqual(this.data, subscribeMessage.data) && Intrinsics.areEqual(this.extension, subscribeMessage.extension) && this.timestamp == subscribeMessage.timestamp;
    }

    @Nullable
    public final String getData() {
        return this.data;
    }

    @Nullable
    public final Object getExtension() {
        return this.extension;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getSubject() {
        return this.subject;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getTopic() {
        return this.topic;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = ((((((this.id.hashCode() * 31) + this.userId.hashCode()) * 31) + this.topic.hashCode()) * 31) + this.subject.hashCode()) * 31;
        String str = this.data;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        Object obj = this.extension;
        return ((iHashCode2 + (obj != null ? obj.hashCode() : 0)) * 31) + Long.hashCode(this.timestamp);
    }

    public final boolean isSocketMessage() {
        return (TextUtils.isEmpty(this.topic) && TextUtils.isEmpty(this.subject)) ? false : true;
    }

    public final void setTimestamp(long j11) {
        this.timestamp = j11;
    }

    public /* synthetic */ SubscribeMessage(String str, String str2, String str3, String str4, String str5, Object obj, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? "" : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : obj, (i11 & 64) != 0 ? 0L : j11);
    }
}
