package com.tencent.rmonitor.sla;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001e\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010*\u001a\u00020\u0003H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0003X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000bR\u001a\u0010\u0014\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000f\"\u0004\b\u0016\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\u001a\u0010\u001a\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u0011R\u001a\u0010\u001d\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u000bR\u001a\u0010!\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u0011R\u001a\u0010$\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u000f\"\u0004\b&\u0010\u0011R\u001a\u0010'\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u000f\"\u0004\b)\u0010\u0011¨\u0006+"}, m90084d2 = {"Lcom/tencent/rmonitor/sla/StatisticsEvent;", "", "baseType", "", "subType", "(Ljava/lang/String;Ljava/lang/String;)V", "attaEvent", "Lcom/tencent/rmonitor/sla/AttaEvent;", "getAttaEvent", "()Lcom/tencent/rmonitor/sla/AttaEvent;", "getBaseType", "()Ljava/lang/String;", "discardCount", "", "getDiscardCount", "()I", "setDiscardCount", "(I)V", "eventCode", "getEventCode", "expiredCount", "getExpiredCount", "setExpiredCount", "failContentLengthSum", "getFailContentLengthSum", "setFailContentLengthSum", "failCostSum", "getFailCostSum", "setFailCostSum", "failCount", "getFailCount", "setFailCount", "getSubType", "succContentLengthSum", "getSuccContentLengthSum", "setSuccContentLengthSum", "succCostSum", "getSuccCostSum", "setSuccCostSum", "succCount", "getSuccCount", "setSuccCount", "toString", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class StatisticsEvent {

    @NotNull
    private final AttaEvent attaEvent;

    @NotNull
    private final String baseType;
    private int discardCount;

    @NotNull
    private final String eventCode;
    private int expiredCount;
    private int failContentLengthSum;
    private int failCostSum;
    private int failCount;

    @NotNull
    private final String subType;
    private int succContentLengthSum;
    private int succCostSum;
    private int succCount;

    public StatisticsEvent(@NotNull String baseType, @NotNull String subType) {
        Intrinsics.checkNotNullParameter(baseType, "baseType");
        Intrinsics.checkNotNullParameter(subType, "subType");
        this.baseType = baseType;
        this.subType = subType;
        this.eventCode = AttaEvent.EventCode.RM_RECORD_REPORT;
        this.attaEvent = new AttaEvent(AttaEvent.EventCode.RM_RECORD_REPORT);
    }

    @NotNull
    public final AttaEvent getAttaEvent() {
        return this.attaEvent;
    }

    @NotNull
    public final String getBaseType() {
        return this.baseType;
    }

    public final int getDiscardCount() {
        return this.discardCount;
    }

    @NotNull
    public final String getEventCode() {
        return this.eventCode;
    }

    public final int getExpiredCount() {
        return this.expiredCount;
    }

    public final int getFailContentLengthSum() {
        return this.failContentLengthSum;
    }

    public final int getFailCostSum() {
        return this.failCostSum;
    }

    public final int getFailCount() {
        return this.failCount;
    }

    @NotNull
    public final String getSubType() {
        return this.subType;
    }

    public final int getSuccContentLengthSum() {
        return this.succContentLengthSum;
    }

    public final int getSuccCostSum() {
        return this.succCostSum;
    }

    public final int getSuccCount() {
        return this.succCount;
    }

    public final void setDiscardCount(int i11) {
        this.discardCount = i11;
    }

    public final void setExpiredCount(int i11) {
        this.expiredCount = i11;
    }

    public final void setFailContentLengthSum(int i11) {
        this.failContentLengthSum = i11;
    }

    public final void setFailCostSum(int i11) {
        this.failCostSum = i11;
    }

    public final void setFailCount(int i11) {
        this.failCount = i11;
    }

    public final void setSuccContentLengthSum(int i11) {
        this.succContentLengthSum = i11;
    }

    public final void setSuccCostSum(int i11) {
        this.succCostSum = i11;
    }

    public final void setSuccCount(int i11) {
        this.succCount = i11;
    }

    @NotNull
    public String toString() {
        return "StatisticsEvent(baseType='" + this.baseType + "', subType='" + this.subType + "', eventCode='" + this.eventCode + "', discardCount=" + this.discardCount + ", failCount=" + this.failCount + ", succCount=" + this.succCount + ", succContentLengthSum=" + this.succContentLengthSum + ", failContentLengthSum=" + this.failContentLengthSum + ", succCostSum=" + this.succCostSum + ", failCostSum=" + this.failCostSum + ", expiredCount=" + this.expiredCount + ", )";
    }
}
