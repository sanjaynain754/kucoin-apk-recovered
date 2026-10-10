package com.kubi.route.config.client;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.route.config.model.RouteConfigEntry;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: com.kubi.route.config.client.a */
/* JADX INFO: compiled from: RemoteConfigClient.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J(\u0010\u0007\u001a\u00020\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/route/config/client/a;", "", "", "version", "", "validate", "Lcom/kubi/route/config/model/RouteConfigEntry;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "route-config_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public interface InterfaceC23632a {
    @GET("v1/kucoin-route-config")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m56177a(@Nullable @Query("version") String str, @Nullable @Query("validate") Boolean bool, @NotNull Continuation<? super RouteConfigEntry> continuation) throws Throwable;
}
