package com.kubi.tradingbotkit.widget.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RobotWidgetEntity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/tradingbotkit/widget/entity/TaskProfitRateCurve;", "", "time", "", "profitRate", "Ljava/math/BigDecimal;", "<init>", "(Ljava/lang/Long;Ljava/math/BigDecimal;)V", "getTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getProfitRate", "()Ljava/math/BigDecimal;", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/math/BigDecimal;)Lcom/kubi/tradingbotkit/widget/entity/TaskProfitRateCurve;", "equals", "", "other", "hashCode", "", "toString", "", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TaskProfitRateCurve {

    @Nullable
    private final BigDecimal profitRate;

    @Nullable
    private final Long time;

    /* JADX WARN: Multi-variable type inference failed */
    public TaskProfitRateCurve() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaskProfitRateCurve)) {
            return false;
        }
        TaskProfitRateCurve taskProfitRateCurve = (TaskProfitRateCurve) other;
        return Intrinsics.areEqual(this.time, taskProfitRateCurve.time) && Intrinsics.areEqual(this.profitRate, taskProfitRateCurve.profitRate);
    }

    public TaskProfitRateCurve(@Nullable Long l11, @Nullable BigDecimal bigDecimal) {
        this.time = l11;
        this.profitRate = bigDecimal;
    }

    public static /* synthetic */ TaskProfitRateCurve copy$default(TaskProfitRateCurve taskProfitRateCurve, Long l11, BigDecimal bigDecimal, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = taskProfitRateCurve.time;
        }
        if ((i11 & 2) != 0) {
            bigDecimal = taskProfitRateCurve.profitRate;
        }
        return taskProfitRateCurve.copy(l11, bigDecimal);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getTime() {
        return this.time;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getProfitRate() {
        return this.profitRate;
    }

    @NotNull
    public final TaskProfitRateCurve copy(@Nullable Long time, @Nullable BigDecimal profitRate) {
        return new TaskProfitRateCurve(time, profitRate);
    }

    @Nullable
    public final BigDecimal getProfitRate() {
        return this.profitRate;
    }

    @Nullable
    public final Long getTime() {
        return this.time;
    }

    public int hashCode() {
        Long l11 = this.time;
        int iHashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        BigDecimal bigDecimal = this.profitRate;
        return iHashCode + (bigDecimal != null ? bigDecimal.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TaskProfitRateCurve(time=" + this.time + ", profitRate=" + this.profitRate + ')';
    }

    public /* synthetic */ TaskProfitRateCurve(Long l11, BigDecimal bigDecimal, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : l11, (i11 & 2) != 0 ? null : bigDecimal);
    }
}
