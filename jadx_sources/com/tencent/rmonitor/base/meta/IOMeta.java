package com.tencent.rmonitor.base.meta;

import com.facebook.react.devsupport.StackTraceHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b0\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0005¢\u0006\u0002\u0010\u0014J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003J\t\u00100\u001a\u00020\u0007HÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\u009f\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0005HÆ\u0001J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:HÖ\u0003J\t\u0010;\u001a\u00020\u0007HÖ\u0001J\t\u0010<\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0016¨\u0006="}, m90084d2 = {"Lcom/tencent/rmonitor/base/meta/IOMeta;", "Lcom/tencent/rmonitor/base/meta/MonitorMeta;", "path", "", "fileSize", "", "opCnt", "", "opReadCnt", "opWriteCnt", "bufferSize", "opCostTime", "opType", "opSize", "opReadSize", "opWriteSize", "threadName", "processName", StackTraceHelper.STACK_KEY, "timeStamp", "(Ljava/lang/String;JIIIJJIJJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getBufferSize", "()J", "getFileSize", "getOpCnt", "()I", "getOpCostTime", "getOpReadCnt", "getOpReadSize", "getOpSize", "getOpType", "getOpWriteCnt", "getOpWriteSize", "getPath", "()Ljava/lang/String;", "getProcessName", "getStack", "getThreadName", "getTimeStamp", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final /* data */ class IOMeta extends MonitorMeta {
    private final long bufferSize;
    private final long fileSize;
    private final int opCnt;
    private final long opCostTime;
    private final int opReadCnt;
    private final long opReadSize;
    private final long opSize;
    private final int opType;
    private final int opWriteCnt;
    private final long opWriteSize;

    @NotNull
    private final String path;

    @NotNull
    private final String processName;

    @NotNull
    private final String stack;

    @NotNull
    private final String threadName;
    private final long timeStamp;

    public static /* synthetic */ IOMeta copy$default(IOMeta iOMeta, String str, long j11, int i11, int i12, int i13, long j12, long j13, int i14, long j14, long j15, long j16, String str2, String str3, String str4, long j17, int i15, Object obj) {
        long j18;
        String str5;
        String str6 = (i15 & 1) != 0 ? iOMeta.path : str;
        long j19 = (i15 & 2) != 0 ? iOMeta.fileSize : j11;
        int i16 = (i15 & 4) != 0 ? iOMeta.opCnt : i11;
        int i17 = (i15 & 8) != 0 ? iOMeta.opReadCnt : i12;
        int i18 = (i15 & 16) != 0 ? iOMeta.opWriteCnt : i13;
        long j21 = (i15 & 32) != 0 ? iOMeta.bufferSize : j12;
        long j22 = (i15 & 64) != 0 ? iOMeta.opCostTime : j13;
        int i19 = (i15 & 128) != 0 ? iOMeta.opType : i14;
        long j23 = (i15 & 256) != 0 ? iOMeta.opSize : j14;
        String str7 = str6;
        long j24 = (i15 & 512) != 0 ? iOMeta.opReadSize : j15;
        long j25 = (i15 & 1024) != 0 ? iOMeta.opWriteSize : j16;
        String str8 = (i15 & 2048) != 0 ? iOMeta.threadName : str2;
        long j26 = j25;
        String str9 = (i15 & 4096) != 0 ? iOMeta.processName : str3;
        String str10 = (i15 & 8192) != 0 ? iOMeta.stack : str4;
        if ((i15 & 16384) != 0) {
            str5 = str9;
            j18 = iOMeta.timeStamp;
        } else {
            j18 = j17;
            str5 = str9;
        }
        return iOMeta.copy(str7, j19, i16, i17, i18, j21, j22, i19, j23, j24, j26, str8, str5, str10, j18);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IOMeta)) {
            return false;
        }
        IOMeta iOMeta = (IOMeta) other;
        return Intrinsics.areEqual(this.path, iOMeta.path) && this.fileSize == iOMeta.fileSize && this.opCnt == iOMeta.opCnt && this.opReadCnt == iOMeta.opReadCnt && this.opWriteCnt == iOMeta.opWriteCnt && this.bufferSize == iOMeta.bufferSize && this.opCostTime == iOMeta.opCostTime && this.opType == iOMeta.opType && this.opSize == iOMeta.opSize && this.opReadSize == iOMeta.opReadSize && this.opWriteSize == iOMeta.opWriteSize && Intrinsics.areEqual(this.threadName, iOMeta.threadName) && Intrinsics.areEqual(this.processName, iOMeta.processName) && Intrinsics.areEqual(this.stack, iOMeta.stack) && this.timeStamp == iOMeta.timeStamp;
    }

    public IOMeta(@NotNull String path, long j11, int i11, int i12, int i13, long j12, long j13, int i14, long j14, long j15, long j16, @NotNull String threadName, @NotNull String processName, @NotNull String stack, long j17) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(threadName, "threadName");
        Intrinsics.checkNotNullParameter(processName, "processName");
        Intrinsics.checkNotNullParameter(stack, "stack");
        this.path = path;
        this.fileSize = j11;
        this.opCnt = i11;
        this.opReadCnt = i12;
        this.opWriteCnt = i13;
        this.bufferSize = j12;
        this.opCostTime = j13;
        this.opType = i14;
        this.opSize = j14;
        this.opReadSize = j15;
        this.opWriteSize = j16;
        this.threadName = threadName;
        this.processName = processName;
        this.stack = stack;
        this.timeStamp = j17;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getOpReadSize() {
        return this.opReadSize;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getOpWriteSize() {
        return this.opWriteSize;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getThreadName() {
        return this.threadName;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getProcessName() {
        return this.processName;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getStack() {
        return this.stack;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getFileSize() {
        return this.fileSize;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getOpCnt() {
        return this.opCnt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getOpReadCnt() {
        return this.opReadCnt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getOpWriteCnt() {
        return this.opWriteCnt;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getBufferSize() {
        return this.bufferSize;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getOpCostTime() {
        return this.opCostTime;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getOpType() {
        return this.opType;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getOpSize() {
        return this.opSize;
    }

    @NotNull
    public final IOMeta copy(@NotNull String path, long fileSize, int opCnt, int opReadCnt, int opWriteCnt, long bufferSize, long opCostTime, int opType, long opSize, long opReadSize, long opWriteSize, @NotNull String threadName, @NotNull String processName, @NotNull String stack, long timeStamp) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(threadName, "threadName");
        Intrinsics.checkNotNullParameter(processName, "processName");
        Intrinsics.checkNotNullParameter(stack, "stack");
        return new IOMeta(path, fileSize, opCnt, opReadCnt, opWriteCnt, bufferSize, opCostTime, opType, opSize, opReadSize, opWriteSize, threadName, processName, stack, timeStamp);
    }

    public final long getBufferSize() {
        return this.bufferSize;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final int getOpCnt() {
        return this.opCnt;
    }

    public final long getOpCostTime() {
        return this.opCostTime;
    }

    public final int getOpReadCnt() {
        return this.opReadCnt;
    }

    public final long getOpReadSize() {
        return this.opReadSize;
    }

    public final long getOpSize() {
        return this.opSize;
    }

    public final int getOpType() {
        return this.opType;
    }

    public final int getOpWriteCnt() {
        return this.opWriteCnt;
    }

    public final long getOpWriteSize() {
        return this.opWriteSize;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    @NotNull
    public final String getProcessName() {
        return this.processName;
    }

    @NotNull
    public final String getStack() {
        return this.stack;
    }

    @NotNull
    public final String getThreadName() {
        return this.threadName;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        return Long.hashCode(this.timeStamp) + ((this.stack.hashCode() + ((this.processName.hashCode() + ((this.threadName.hashCode() + ((Long.hashCode(this.opWriteSize) + ((Long.hashCode(this.opReadSize) + ((Long.hashCode(this.opSize) + ((Integer.hashCode(this.opType) + ((Long.hashCode(this.opCostTime) + ((Long.hashCode(this.bufferSize) + ((Integer.hashCode(this.opWriteCnt) + ((Integer.hashCode(this.opReadCnt) + ((Integer.hashCode(this.opCnt) + ((Long.hashCode(this.fileSize) + (this.path.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "IOMeta(path=" + this.path + ", fileSize=" + this.fileSize + ", opCnt=" + this.opCnt + ", opReadCnt=" + this.opReadCnt + ", opWriteCnt=" + this.opWriteCnt + ", bufferSize=" + this.bufferSize + ", opCostTime=" + this.opCostTime + ", opType=" + this.opType + ", opSize=" + this.opSize + ", opReadSize=" + this.opReadSize + ", opWriteSize=" + this.opWriteSize + ", threadName=" + this.threadName + ", processName=" + this.processName + ", stack=" + this.stack + ", timeStamp=" + this.timeStamp + ')';
    }
}
