package com.kubi.tradingbotkit.entity.downtime;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: DowntimeInformationEntity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\r"}, m90084d2 = {"Lcom/kubi/tradingbotkit/entity/downtime/Link;", "", "<init>", "()V", "enUS", "", "getEnUS", "()Ljava/lang/String;", "setEnUS", "(Ljava/lang/String;)V", "zhCN", "getZhCN", "setZhCN", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class Link {

    @SerializedName("en_US")
    @Nullable
    private String enUS;

    @SerializedName("zh_CN")
    @Nullable
    private String zhCN;

    @Nullable
    public final String getEnUS() {
        return this.enUS;
    }

    @Nullable
    public final String getZhCN() {
        return this.zhCN;
    }

    public final void setEnUS(@Nullable String str) {
        this.enUS = str;
    }

    public final void setZhCN(@Nullable String str) {
        this.zhCN = str;
    }
}
