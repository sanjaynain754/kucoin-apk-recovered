package com.jumio.core.interfaces;

import com.jumio.sdk.scanpart.JumioScanPart;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007À\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/interfaces/ScanViewInterface;", "", "attach", "", "scanPart", "Lcom/jumio/sdk/scanpart/JumioScanPart;", "detach", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ScanViewInterface {
    void attach(@NotNull JumioScanPart scanPart);

    void detach();
}
