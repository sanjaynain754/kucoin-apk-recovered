package com.kubi.kucoin.data.platform;

import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Url;

/* JADX INFO: renamed from: com.kubi.kucoin.data.platform.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: IPAddressApi.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/kucoin/data/platform/IPAddressApi;", "", "fetchIp", "Lokhttp3/ResponseBody;", "url", "", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IPAddressApi {
    @GET
    @NotNull
    /* JADX INFO: renamed from: a */
    ResponseBody m32046a(@Url @NotNull String str) throws Exception;
}
