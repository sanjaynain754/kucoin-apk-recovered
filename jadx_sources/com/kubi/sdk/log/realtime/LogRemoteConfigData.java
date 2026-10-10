package com.kubi.sdk.log.realtime;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LogRemoteConfigData.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t¢\u0006\u0002\u0010\u000fJ\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0004HÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003Jk\u0010\"\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\tHÆ\u0001J\u0013\u0010#\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0004HÖ\u0001J\t\u0010&\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u000e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016¨\u0006'"}, m90084d2 = {"Lcom/kubi/sdk/log/realtime/LogRemoteConfigData;", "", "availableLevel", "", "", "availableType", "availableTag", "", "isOpen", "", "limitInterval", "", "limitSize", "poolingInterval", "isDBOpen", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;ZJIJZ)V", "getAvailableLevel", "()Ljava/util/List;", "getAvailableTag", "getAvailableType", "()Z", "getLimitInterval", "()J", "getLimitSize", "()I", "getPoolingInterval", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "Logger-realtime_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class LogRemoteConfigData {

    @NotNull
    private final List<Integer> availableLevel;

    @NotNull
    private final List<String> availableTag;

    @NotNull
    private final List<Integer> availableType;
    private final boolean isDBOpen;
    private final boolean isOpen;
    private final long limitInterval;
    private final int limitSize;
    private final long poolingInterval;

    public LogRemoteConfigData() {
        this(null, null, null, false, 0L, 0, 0L, false, 255, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogRemoteConfigData)) {
            return false;
        }
        LogRemoteConfigData logRemoteConfigData = (LogRemoteConfigData) other;
        return Intrinsics.areEqual(this.availableLevel, logRemoteConfigData.availableLevel) && Intrinsics.areEqual(this.availableType, logRemoteConfigData.availableType) && Intrinsics.areEqual(this.availableTag, logRemoteConfigData.availableTag) && this.isOpen == logRemoteConfigData.isOpen && this.limitInterval == logRemoteConfigData.limitInterval && this.limitSize == logRemoteConfigData.limitSize && this.poolingInterval == logRemoteConfigData.poolingInterval && this.isDBOpen == logRemoteConfigData.isDBOpen;
    }

    public LogRemoteConfigData(@NotNull List<Integer> availableLevel, @NotNull List<Integer> availableType, @NotNull List<String> availableTag, boolean z11, long j11, int i11, long j12, boolean z12) {
        Intrinsics.checkNotNullParameter(availableLevel, "availableLevel");
        Intrinsics.checkNotNullParameter(availableType, "availableType");
        Intrinsics.checkNotNullParameter(availableTag, "availableTag");
        this.availableLevel = availableLevel;
        this.availableType = availableType;
        this.availableTag = availableTag;
        this.isOpen = z11;
        this.limitInterval = j11;
        this.limitSize = i11;
        this.poolingInterval = j12;
        this.isDBOpen = z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LogRemoteConfigData copy$default(LogRemoteConfigData logRemoteConfigData, List list, List list2, List list3, boolean z11, long j11, int i11, long j12, boolean z12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = logRemoteConfigData.availableLevel;
        }
        if ((i12 & 2) != 0) {
            list2 = logRemoteConfigData.availableType;
        }
        if ((i12 & 4) != 0) {
            list3 = logRemoteConfigData.availableTag;
        }
        if ((i12 & 8) != 0) {
            z11 = logRemoteConfigData.isOpen;
        }
        if ((i12 & 16) != 0) {
            j11 = logRemoteConfigData.limitInterval;
        }
        if ((i12 & 32) != 0) {
            i11 = logRemoteConfigData.limitSize;
        }
        if ((i12 & 64) != 0) {
            j12 = logRemoteConfigData.poolingInterval;
        }
        if ((i12 & 128) != 0) {
            z12 = logRemoteConfigData.isDBOpen;
        }
        int i13 = i11;
        long j13 = j11;
        List list4 = list3;
        boolean z13 = z11;
        return logRemoteConfigData.copy(list, list2, list4, z13, j13, i13, j12, z12);
    }

    @NotNull
    public final List<Integer> component1() {
        return this.availableLevel;
    }

    @NotNull
    public final List<Integer> component2() {
        return this.availableType;
    }

    @NotNull
    public final List<String> component3() {
        return this.availableTag;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsOpen() {
        return this.isOpen;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getLimitInterval() {
        return this.limitInterval;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getLimitSize() {
        return this.limitSize;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getPoolingInterval() {
        return this.poolingInterval;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsDBOpen() {
        return this.isDBOpen;
    }

    @NotNull
    public final LogRemoteConfigData copy(@NotNull List<Integer> availableLevel, @NotNull List<Integer> availableType, @NotNull List<String> availableTag, boolean isOpen, long limitInterval, int limitSize, long poolingInterval, boolean isDBOpen) {
        Intrinsics.checkNotNullParameter(availableLevel, "availableLevel");
        Intrinsics.checkNotNullParameter(availableType, "availableType");
        Intrinsics.checkNotNullParameter(availableTag, "availableTag");
        return new LogRemoteConfigData(availableLevel, availableType, availableTag, isOpen, limitInterval, limitSize, poolingInterval, isDBOpen);
    }

    @NotNull
    public final List<Integer> getAvailableLevel() {
        return this.availableLevel;
    }

    @NotNull
    public final List<String> getAvailableTag() {
        return this.availableTag;
    }

    @NotNull
    public final List<Integer> getAvailableType() {
        return this.availableType;
    }

    public final long getLimitInterval() {
        return this.limitInterval;
    }

    public final int getLimitSize() {
        return this.limitSize;
    }

    public final long getPoolingInterval() {
        return this.poolingInterval;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((this.availableLevel.hashCode() * 31) + this.availableType.hashCode()) * 31) + this.availableTag.hashCode()) * 31;
        boolean z11 = this.isOpen;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int iHashCode2 = (((((((iHashCode + r11) * 31) + Long.hashCode(this.limitInterval)) * 31) + Integer.hashCode(this.limitSize)) * 31) + Long.hashCode(this.poolingInterval)) * 31;
        boolean z12 = this.isDBOpen;
        return iHashCode2 + (z12 ? 1 : z12);
    }

    public final boolean isDBOpen() {
        return this.isDBOpen;
    }

    public final boolean isOpen() {
        return this.isOpen;
    }

    @NotNull
    public String toString() {
        return "LogRemoteConfigData(availableLevel=" + this.availableLevel + ", availableType=" + this.availableType + ", availableTag=" + this.availableTag + ", isOpen=" + this.isOpen + ", limitInterval=" + this.limitInterval + ", limitSize=" + this.limitSize + ", poolingInterval=" + this.poolingInterval + ", isDBOpen=" + this.isDBOpen + ')';
    }

    public /* synthetic */ LogRemoteConfigData(List list, List list2, List list3, boolean z11, long j11, int i11, long j12, boolean z12, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? CollectionsKt.emptyList() : list, (i12 & 2) != 0 ? CollectionsKt.emptyList() : list2, (i12 & 4) != 0 ? CollectionsKt.emptyList() : list3, (i12 & 8) != 0 ? false : z11, (i12 & 16) != 0 ? 60L : j11, (i12 & 32) != 0 ? 30 : i11, (i12 & 64) != 0 ? 15L : j12, (i12 & 128) != 0 ? true : z12);
    }
}
