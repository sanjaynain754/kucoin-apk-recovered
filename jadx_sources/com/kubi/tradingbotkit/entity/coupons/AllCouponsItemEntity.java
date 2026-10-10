package com.kubi.tradingbotkit.entity.coupons;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: AllCouponsItemEntity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR\u001e\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u0010\n\u0002\u0010(\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010)\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0007\"\u0004\b+\u0010\t¨\u0006,"}, m90084d2 = {"Lcom/kubi/tradingbotkit/entity/coupons/AllCouponsItemEntity;", "", "<init>", "()V", "expirationTime", "", "getExpirationTime", "()Ljava/lang/String;", "setExpirationTime", "(Ljava/lang/String;)V", "id", "getId", "setId", "name", "getName", "setName", "phaseId", "getPhaseId", "setPhaseId", "receiveTime", "getReceiveTime", "setReceiveTime", "rules", "Lcom/kubi/tradingbotkit/entity/coupons/Rules;", "getRules", "()Lcom/kubi/tradingbotkit/entity/coupons/Rules;", "setRules", "(Lcom/kubi/tradingbotkit/entity/coupons/Rules;)V", "startUseTime", "getStartUseTime", "setStartUseTime", "status", "getStatus", "setStatus", "taskId", "", "getTaskId", "()Ljava/lang/Long;", "setTaskId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "unUsableReason", "getUnUsableReason", "setUnUsableReason", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AllCouponsItemEntity {

    @Nullable
    private String expirationTime;

    @Nullable
    private String id;

    @Nullable
    private String name;

    @Nullable
    private String phaseId;

    @Nullable
    private String receiveTime;

    @Nullable
    private Rules rules;

    @Nullable
    private String startUseTime;

    @Nullable
    private String status;

    @Nullable
    private Long taskId;

    @Nullable
    private String unUsableReason;

    @Nullable
    public final String getExpirationTime() {
        return this.expirationTime;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPhaseId() {
        return this.phaseId;
    }

    @Nullable
    public final String getReceiveTime() {
        return this.receiveTime;
    }

    @Nullable
    public final Rules getRules() {
        return this.rules;
    }

    @Nullable
    public final String getStartUseTime() {
        return this.startUseTime;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final Long getTaskId() {
        return this.taskId;
    }

    @Nullable
    public final String getUnUsableReason() {
        return this.unUsableReason;
    }

    public final void setExpirationTime(@Nullable String str) {
        this.expirationTime = str;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setPhaseId(@Nullable String str) {
        this.phaseId = str;
    }

    public final void setReceiveTime(@Nullable String str) {
        this.receiveTime = str;
    }

    public final void setRules(@Nullable Rules rules) {
        this.rules = rules;
    }

    public final void setStartUseTime(@Nullable String str) {
        this.startUseTime = str;
    }

    public final void setStatus(@Nullable String str) {
        this.status = str;
    }

    public final void setTaskId(@Nullable Long l11) {
        this.taskId = l11;
    }

    public final void setUnUsableReason(@Nullable String str) {
        this.unUsableReason = str;
    }
}
