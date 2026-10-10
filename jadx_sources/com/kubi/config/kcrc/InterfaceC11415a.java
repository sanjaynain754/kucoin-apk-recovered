package com.kubi.config.kcrc;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import io.reactivex.Observable;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/* JADX INFO: renamed from: com.kubi.config.kcrc.a */
/* JADX INFO: compiled from: KCRemoteConfigFetcher.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J+\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/config/kcrc/a;", "", "", "", ReportDataTable.COLUMN_PARAMS, "Lio/reactivex/Observable;", "Lcom/kubi/config/kcrc/KCRCAllEntity;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/util/Map;)Lio/reactivex/Observable;", "Lcom/kubi/config/kcrc/KCRCIncrementEntity;", "b", "Config_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
public interface InterfaceC11415a {
    @GET("v1/remote-config")
    @NotNull
    /* JADX INFO: renamed from: a */
    Observable<KCRCAllEntity> m20551a(@QueryMap(encoded = true) @NotNull Map<String, String> params);

    @GET("v1/increment-remote-config")
    @NotNull
    /* JADX INFO: renamed from: b */
    Observable<KCRCIncrementEntity> m20552b(@QueryMap(encoded = true) @NotNull Map<String, String> params);
}
