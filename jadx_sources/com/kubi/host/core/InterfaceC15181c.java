package com.kubi.host.core;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Url;

/* JADX INFO: renamed from: com.kubi.host.core.c */
/* JADX INFO: compiled from: RemoteConfig.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JO\u0010\b\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006j\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H'¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/host/core/c;", "", "", "url", "", "headers", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Ljava/util/Map;)Ljava/util/LinkedHashMap;", "Host_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC15181c {
    @GET
    @NotNull
    /* JADX INFO: renamed from: a */
    LinkedHashMap<String, Object> m31402a(@Url @NotNull String url, @HeaderMap @NotNull Map<String, String> headers) throws Throwable;
}
