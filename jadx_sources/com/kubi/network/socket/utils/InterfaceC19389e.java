package com.kubi.network.socket.utils;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.socket.model.DefaultTokenEntity;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmSuppressWildcards;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.Url;

/* JADX INFO: renamed from: com.kubi.network.socket.utils.e */
/* JADX INFO: compiled from: RemoteTokenUtils.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bb\u0018\u00002\u00020\u0001JE\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H'¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/network/socket/utils/e;", "", "", "url", "", "fields", "headers", "Lcom/kubi/network/socket/model/DefaultTokenEntity;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lcom/kubi/network/socket/model/DefaultTokenEntity;", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
interface InterfaceC19389e {
    @JvmSuppressWildcards
    @NotNull
    @FormUrlEncoded
    @POST
    /* JADX INFO: renamed from: a */
    DefaultTokenEntity m43054a(@Url @NotNull String url, @FieldMap @NotNull Map<String, String> fields, @HeaderMap @NotNull Map<String, String> headers) throws Exception;
}
