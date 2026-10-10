package com.kubi.tradingbotkit.entity.asset;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: AssetsTotalEntity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\tR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\tR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006$"}, m90084d2 = {"Lcom/kubi/tradingbotkit/entity/asset/TaskAssetAndProfitGroupVO;", "", "<init>", "()V", "runningAmount", "", "getRunningAmount", "()Ljava/lang/String;", "setRunningAmount", "(Ljava/lang/String;)V", "taskAssetAndProfitVOList", "", "Lcom/kubi/tradingbotkit/entity/asset/TaskAssetAndProfitVO;", "getTaskAssetAndProfitVOList", "()Ljava/util/List;", "setTaskAssetAndProfitVOList", "(Ljava/util/List;)V", "templateId", "", "getTemplateId", "()Ljava/lang/Long;", "setTemplateId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "todayProfit", "getTodayProfit", "setTodayProfit", "totalProfit", "getTotalProfit", "setTotalProfit", "templateInfo", "Lcom/kubi/tradingbotkit/entity/asset/TemplateInfo;", "getTemplateInfo", "()Lcom/kubi/tradingbotkit/entity/asset/TemplateInfo;", "setTemplateInfo", "(Lcom/kubi/tradingbotkit/entity/asset/TemplateInfo;)V", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TaskAssetAndProfitGroupVO {

    @Nullable
    private String runningAmount;

    @Nullable
    private List<TaskAssetAndProfitVO> taskAssetAndProfitVOList;

    @Nullable
    private Long templateId;

    @Nullable
    private TemplateInfo templateInfo;

    @Nullable
    private String todayProfit;

    @Nullable
    private String totalProfit;

    @Nullable
    public final String getRunningAmount() {
        return this.runningAmount;
    }

    @Nullable
    public final List<TaskAssetAndProfitVO> getTaskAssetAndProfitVOList() {
        return this.taskAssetAndProfitVOList;
    }

    @Nullable
    public final Long getTemplateId() {
        return this.templateId;
    }

    @Nullable
    public final TemplateInfo getTemplateInfo() {
        return this.templateInfo;
    }

    @Nullable
    public final String getTodayProfit() {
        return this.todayProfit;
    }

    @Nullable
    public final String getTotalProfit() {
        return this.totalProfit;
    }

    public final void setRunningAmount(@Nullable String str) {
        this.runningAmount = str;
    }

    public final void setTaskAssetAndProfitVOList(@Nullable List<TaskAssetAndProfitVO> list) {
        this.taskAssetAndProfitVOList = list;
    }

    public final void setTemplateId(@Nullable Long l11) {
        this.templateId = l11;
    }

    public final void setTemplateInfo(@Nullable TemplateInfo templateInfo) {
        this.templateInfo = templateInfo;
    }

    public final void setTodayProfit(@Nullable String str) {
        this.todayProfit = str;
    }

    public final void setTotalProfit(@Nullable String str) {
        this.totalProfit = str;
    }
}
