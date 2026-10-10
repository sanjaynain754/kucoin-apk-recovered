package com.kubi.sdk.lib.kunlun.sdk.p115db;

import androidx.annotation.Keep;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KunlunDBEventData.kt */
/* JADX INFO: loaded from: classes3.dex */
@Entity
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/sdk/lib/kunlun/sdk/db/KunlunDBEventData;", "", "eventId", "", "event", "", "timeStamp", "(JLjava/lang/String;J)V", "getEvent", "()Ljava/lang/String;", "getEventId", "()J", "getTimeStamp", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "kunlun-sdk_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KunlunDBEventData {

    @ColumnInfo(name = "event")
    @NotNull
    private final String event;

    @PrimaryKey(autoGenerate = true)
    private final long eventId;

    @ColumnInfo(name = "timestamp")
    private final long timeStamp;

    public KunlunDBEventData(long j11, @NotNull String event, long j12) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.eventId = j11;
        this.event = event;
        this.timeStamp = j12;
    }

    public static /* synthetic */ KunlunDBEventData copy$default(KunlunDBEventData kunlunDBEventData, long j11, String str, long j12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = kunlunDBEventData.eventId;
        }
        long j13 = j11;
        if ((i11 & 2) != 0) {
            str = kunlunDBEventData.event;
        }
        String str2 = str;
        if ((i11 & 4) != 0) {
            j12 = kunlunDBEventData.timeStamp;
        }
        return kunlunDBEventData.copy(j13, str2, j12);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KunlunDBEventData)) {
            return false;
        }
        KunlunDBEventData kunlunDBEventData = (KunlunDBEventData) other;
        return this.eventId == kunlunDBEventData.eventId && Intrinsics.areEqual(this.event, kunlunDBEventData.event) && this.timeStamp == kunlunDBEventData.timeStamp;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getEventId() {
        return this.eventId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEvent() {
        return this.event;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    @NotNull
    public final KunlunDBEventData copy(long eventId, @NotNull String event, long timeStamp) {
        Intrinsics.checkNotNullParameter(event, "event");
        return new KunlunDBEventData(eventId, event, timeStamp);
    }

    @NotNull
    public final String getEvent() {
        return this.event;
    }

    public final long getEventId() {
        return this.eventId;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        return (((Long.hashCode(this.eventId) * 31) + this.event.hashCode()) * 31) + Long.hashCode(this.timeStamp);
    }

    @NotNull
    public String toString() {
        return "KunlunDBEventData(eventId=" + this.eventId + ", event=" + this.event + ", timeStamp=" + this.timeStamp + ')';
    }

    public /* synthetic */ KunlunDBEventData(long j11, String str, long j12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0L : j11, str, (i11 & 4) != 0 ? System.currentTimeMillis() : j12);
    }
}
