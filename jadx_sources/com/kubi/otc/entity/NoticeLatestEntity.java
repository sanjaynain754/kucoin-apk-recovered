package com.kubi.otc.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OtherBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0014JJ\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\tHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, m90084d2 = {"Lcom/kubi/otc/entity/NoticeLatestEntity;", "", "eventId", "", "content", "date", "", "subject", "unreadCount", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;)V", "getEventId", "()Ljava/lang/String;", "getContent", "getDate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSubject", "getUnreadCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;)Lcom/kubi/otc/entity/NoticeLatestEntity;", "equals", "", "other", "hashCode", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class NoticeLatestEntity {

    @Nullable
    private final String content;

    @Nullable
    private final Long date;

    @Nullable
    private final String eventId;

    @Nullable
    private final String subject;

    @Nullable
    private final Integer unreadCount;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoticeLatestEntity)) {
            return false;
        }
        NoticeLatestEntity noticeLatestEntity = (NoticeLatestEntity) other;
        return Intrinsics.areEqual(this.eventId, noticeLatestEntity.eventId) && Intrinsics.areEqual(this.content, noticeLatestEntity.content) && Intrinsics.areEqual(this.date, noticeLatestEntity.date) && Intrinsics.areEqual(this.subject, noticeLatestEntity.subject) && Intrinsics.areEqual(this.unreadCount, noticeLatestEntity.unreadCount);
    }

    public static /* synthetic */ NoticeLatestEntity copy$default(NoticeLatestEntity noticeLatestEntity, String str, String str2, Long l11, String str3, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = noticeLatestEntity.eventId;
        }
        if ((i11 & 2) != 0) {
            str2 = noticeLatestEntity.content;
        }
        if ((i11 & 4) != 0) {
            l11 = noticeLatestEntity.date;
        }
        if ((i11 & 8) != 0) {
            str3 = noticeLatestEntity.subject;
        }
        if ((i11 & 16) != 0) {
            num = noticeLatestEntity.unreadCount;
        }
        Integer num2 = num;
        Long l12 = l11;
        return noticeLatestEntity.copy(str, str2, l12, str3, num2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getDate() {
        return this.date;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSubject() {
        return this.subject;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getUnreadCount() {
        return this.unreadCount;
    }

    @NotNull
    public final NoticeLatestEntity copy(@Nullable String eventId, @Nullable String content, @Nullable Long date, @Nullable String subject, @Nullable Integer unreadCount) {
        return new NoticeLatestEntity(eventId, content, date, subject, unreadCount);
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final Long getDate() {
        return this.date;
    }

    @Nullable
    public final String getEventId() {
        return this.eventId;
    }

    @Nullable
    public final String getSubject() {
        return this.subject;
    }

    @Nullable
    public final Integer getUnreadCount() {
        return this.unreadCount;
    }

    public int hashCode() {
        String str = this.eventId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.content;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.date;
        int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str3 = this.subject;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.unreadCount;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NoticeLatestEntity(eventId=" + this.eventId + ", content=" + this.content + ", date=" + this.date + ", subject=" + this.subject + ", unreadCount=" + this.unreadCount + ')';
    }

    public NoticeLatestEntity(@Nullable String str, @Nullable String str2, @Nullable Long l11, @Nullable String str3, @Nullable Integer num) {
        this.eventId = str;
        this.content = str2;
        this.date = l11;
        this.subject = str3;
        this.unreadCount = num;
    }
}
