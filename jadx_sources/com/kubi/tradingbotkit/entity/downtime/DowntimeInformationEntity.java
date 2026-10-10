package com.kubi.tradingbotkit.entity.downtime;

import androidx.annotation.Keep;
import com.kubi.user.protocol.entity.SignTermItem;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: DowntimeInformationEntity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006'"}, m90084d2 = {"Lcom/kubi/tradingbotkit/entity/downtime/DowntimeInformationEntity;", "", "<init>", "()V", SignTermItem.LINK, "Lcom/kubi/tradingbotkit/entity/downtime/Link;", "getLink", "()Lcom/kubi/tradingbotkit/entity/downtime/Link;", "setLink", "(Lcom/kubi/tradingbotkit/entity/downtime/Link;)V", "maintenanceEnd", "", "getMaintenanceEnd", "()Ljava/lang/Long;", "setMaintenanceEnd", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "maintenanceStart", "getMaintenanceStart", "setMaintenanceStart", "status", "", "getStatus", "()Ljava/lang/String;", "setStatus", "(Ljava/lang/String;)V", "title", "Lcom/kubi/tradingbotkit/entity/downtime/Title;", "getTitle", "()Lcom/kubi/tradingbotkit/entity/downtime/Title;", "setTitle", "(Lcom/kubi/tradingbotkit/entity/downtime/Title;)V", "pollingInterval", "", "getPollingInterval", "()Ljava/lang/Integer;", "setPollingInterval", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DowntimeInformationEntity {

    @Nullable
    private Link link;

    @Nullable
    private Long maintenanceEnd;

    @Nullable
    private Long maintenanceStart;

    @Nullable
    private Integer pollingInterval;

    @Nullable
    private String status;

    @Nullable
    private Title title;

    @Nullable
    public final Link getLink() {
        return this.link;
    }

    @Nullable
    public final Long getMaintenanceEnd() {
        return this.maintenanceEnd;
    }

    @Nullable
    public final Long getMaintenanceStart() {
        return this.maintenanceStart;
    }

    @Nullable
    public final Integer getPollingInterval() {
        return this.pollingInterval;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final Title getTitle() {
        return this.title;
    }

    public final void setLink(@Nullable Link link) {
        this.link = link;
    }

    public final void setMaintenanceEnd(@Nullable Long l11) {
        this.maintenanceEnd = l11;
    }

    public final void setMaintenanceStart(@Nullable Long l11) {
        this.maintenanceStart = l11;
    }

    public final void setPollingInterval(@Nullable Integer num) {
        this.pollingInterval = num;
    }

    public final void setStatus(@Nullable String str) {
        this.status = str;
    }

    public final void setTitle(@Nullable Title title) {
        this.title = title;
    }
}
