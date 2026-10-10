package com.jumio.sdk.interfaces;

import com.jumio.sdk.enums.JumioScanStep;
import com.jumio.sdk.enums.JumioScanUpdate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H&J\u001a\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H&¨\u0006\nÀ\u0006\u0003"}, m90084d2 = {"Lcom/jumio/sdk/interfaces/JumioScanPartInterface;", "", "onUpdate", "", "jumioScanUpdate", "Lcom/jumio/sdk/enums/JumioScanUpdate;", "data", "onScanStep", "jumioScanStep", "Lcom/jumio/sdk/enums/JumioScanStep;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface JumioScanPartInterface {
    void onScanStep(@NotNull JumioScanStep jumioScanStep, @Nullable Object data);

    void onUpdate(@NotNull JumioScanUpdate jumioScanUpdate, @Nullable Object data);
}
