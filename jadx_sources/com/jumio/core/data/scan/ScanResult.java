package com.jumio.core.data.scan;

import androidx.exifinterface.media.ExifInterface;
import com.jumio.core.data.scan.DataInterface;
import com.jumio.core.models.automation.AutomationModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003R\u0012\u0010\u0004\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\bX¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u00020\u000eX¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0012\u0010\u0017\u001a\u00020\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0018À\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/data/scan/ScanResult;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/jumio/core/data/scan/DataInterface;", "", "data", "getData", "()Lcom/jumio/core/data/scan/DataInterface;", "automationModel", "Lcom/jumio/core/models/automation/AutomationModel;", "getAutomationModel", "()Lcom/jumio/core/models/automation/AutomationModel;", "setAutomationModel", "(Lcom/jumio/core/models/automation/AutomationModel;)V", "state", "Lcom/jumio/core/data/scan/DataState;", "getState", "()Lcom/jumio/core/data/scan/DataState;", "setState", "(Lcom/jumio/core/data/scan/DataState;)V", "hasData", "", "getHasData", "()Z", "isComplete", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ScanResult<T extends DataInterface<?>> {
    @Nullable
    AutomationModel getAutomationModel();

    @NotNull
    T getData();

    boolean getHasData();

    @NotNull
    DataState getState();

    boolean isComplete();

    void setAutomationModel(@Nullable AutomationModel automationModel);

    void setState(@NotNull DataState dataState);
}
