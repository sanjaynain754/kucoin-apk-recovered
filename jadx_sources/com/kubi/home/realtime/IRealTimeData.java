package com.kubi.home.realtime;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.home.realtime.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: IRealTimeData.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0005H\u0016R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/home/realtime/IRealTimeData;", "", "<init>", "()V", "businessId", "", "getBusinessId", "()Ljava/lang/String;", "viewType", "Lcom/kubi/home/realtime/RealTimeViewType;", "getViewType", "()Lcom/kubi/home/realtime/RealTimeViewType;", "viewTypeV2", "getViewTypeV2", "reportStatus", "getReportStatus", "autoIncreaseId", "", "getAutoIncreaseId", "()J", "setAutoIncreaseId", "(J)V", "getUniqueId", "HomeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class IRealTimeData {
    private long autoIncreaseId;

    @Nullable
    private final String reportStatus;

    @Nullable
    private final String viewTypeV2;

    @NotNull
    public abstract String getBusinessId();

    @NotNull
    public abstract RealTimeViewType getViewType();

    public final long getAutoIncreaseId() {
        return this.autoIncreaseId;
    }

    @Nullable
    public String getReportStatus() {
        return this.reportStatus;
    }

    @NotNull
    public String getUniqueId() {
        return getViewType().getTypeName() + '_' + getBusinessId();
    }

    @Nullable
    public String getViewTypeV2() {
        return this.viewTypeV2;
    }

    public final void setAutoIncreaseId(long j11) {
        this.autoIncreaseId = j11;
    }
}
