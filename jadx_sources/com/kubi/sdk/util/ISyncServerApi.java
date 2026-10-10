package com.kubi.sdk.util;

import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

/* JADX INFO: renamed from: com.kubi.sdk.util.y, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TimeSyncManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/sdk/util/ISyncServerApi;", "", "fetchServerTimeMills", "Lretrofit2/Call;", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ISyncServerApi {
    @Headers({"Cache-Control: no-cache", "Pragma: no-cache"})
    @GET("/timestamp")
    @Nullable
    /* JADX INFO: renamed from: a */
    Call<String> m58546a();
}
