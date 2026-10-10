package com.kubi.sdk.log.realtime.p116db;

import androidx.annotation.Keep;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.google.gson.annotations.SerializedName;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LogData.kt */
/* JADX INFO: loaded from: classes3.dex */
@Entity
@Keep
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003JB\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0007HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, m90084d2 = {"Lcom/kubi/sdk/log/realtime/db/LogData;", "", "logId", "", "content", "", "type", "", "timeStamp", "threadName", "(Ljava/lang/Long;Ljava/lang/String;IJLjava/lang/String;)V", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "getLogId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getThreadName", "getTimeStamp", "()J", "getType", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Long;Ljava/lang/String;IJLjava/lang/String;)Lcom/kubi/sdk/log/realtime/db/LogData;", "equals", "", "other", "hashCode", "toString", "Logger-realtime_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class LogData {

    @SerializedName("c")
    @ColumnInfo(name = "message")
    @NotNull
    private String content;

    @PrimaryKey(autoGenerate = true)
    @Nullable
    private final Long logId;

    @SerializedName("n")
    @ColumnInfo(name = InterfaceC33953u5.f72225u)
    @NotNull
    private final String threadName;

    @SerializedName(CmcdData.Factory.STREAM_TYPE_LIVE)
    @ColumnInfo(name = "timestamp")
    private final long timeStamp;

    @SerializedName("f")
    @ColumnInfo(name = "type")
    private final int type;

    public LogData(@Nullable Long l11, @NotNull String content, int i11, long j11, @NotNull String threadName) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(threadName, "threadName");
        this.logId = l11;
        this.content = content;
        this.type = i11;
        this.timeStamp = j11;
        this.threadName = threadName;
    }

    public static /* synthetic */ LogData copy$default(LogData logData, Long l11, String str, int i11, long j11, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            l11 = logData.logId;
        }
        if ((i12 & 2) != 0) {
            str = logData.content;
        }
        if ((i12 & 4) != 0) {
            i11 = logData.type;
        }
        if ((i12 & 8) != 0) {
            j11 = logData.timeStamp;
        }
        if ((i12 & 16) != 0) {
            str2 = logData.threadName;
        }
        String str3 = str2;
        int i13 = i11;
        return logData.copy(l11, str, i13, j11, str3);
    }

    @NotNull
    public final LogData copy(@Nullable Long logId, @NotNull String content, int type, long timeStamp, @NotNull String threadName) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(threadName, "threadName");
        return new LogData(logId, content, type, timeStamp, threadName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogData)) {
            return false;
        }
        LogData logData = (LogData) other;
        return Intrinsics.areEqual(this.logId, logData.logId) && Intrinsics.areEqual(this.content, logData.content) && this.type == logData.type && this.timeStamp == logData.timeStamp && Intrinsics.areEqual(this.threadName, logData.threadName);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getLogId() {
        return this.logId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getThreadName() {
        return this.threadName;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final Long getLogId() {
        return this.logId;
    }

    @NotNull
    public final String getThreadName() {
        return this.threadName;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        Long l11 = this.logId;
        return ((((((((l11 == null ? 0 : l11.hashCode()) * 31) + this.content.hashCode()) * 31) + Integer.hashCode(this.type)) * 31) + Long.hashCode(this.timeStamp)) * 31) + this.threadName.hashCode();
    }

    public final void setContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.content = str;
    }

    @NotNull
    public String toString() {
        return "LogData(logId=" + this.logId + ", content=" + this.content + ", type=" + this.type + ", timeStamp=" + this.timeStamp + ", threadName=" + this.threadName + ')';
    }

    public /* synthetic */ LogData(Long l11, String str, int i11, long j11, String str2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? null : l11, str, i11, j11, str2);
    }
}
