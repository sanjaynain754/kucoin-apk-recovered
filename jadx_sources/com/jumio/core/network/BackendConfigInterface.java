package com.jumio.core.network;

import com.jumio.core.Injected;
import com.jumio.sdk.enums.JumioDataCenter;
import jumio.core.C40682k;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Injected
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006À\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/network/BackendConfigInterface;", "", "get", "Lcom/jumio/core/network/BackendSettings;", "dataCenter", "Lcom/jumio/sdk/enums/JumioDataCenter;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface BackendConfigInterface {
    @NotNull
    C40682k get(@NotNull JumioDataCenter jumioDataCenter);
}
