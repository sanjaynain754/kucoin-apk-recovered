package com.kubi.lite.tab.config;

import com.kubi.lite.tab.bean.TabConfigResponse;
import com.kubi.sdk.base.entity.BaseEntity;
import io.reactivex.Observable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.http.GET;

/* JADX INFO: renamed from: com.kubi.lite.tab.config.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TabConfigApi.kt */
/* JADX INFO: loaded from: classes24.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/lite/tab/config/TabConfigApi;", "", "getTabConfigs", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Lcom/kubi/lite/tab/bean/TabConfigResponse;", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface TabConfigApi {
    @GET("v1/kucoin-tab-config")
    @NotNull
    /* JADX INFO: renamed from: a */
    Observable<BaseEntity<TabConfigResponse>> m37560a();
}
