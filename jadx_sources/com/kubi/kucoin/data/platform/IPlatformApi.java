package com.kubi.kucoin.data.platform;

import com.kubi.kucoin.data.platform.model.CountryEntity;
import com.kubi.sdk.base.entity.BaseEntity;
import io.reactivex.Observable;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: com.kubi.kucoin.data.platform.e, reason: from Kotlin metadata */
/* JADX INFO: compiled from: IPlatformApi.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/kucoin/data/platform/IPlatformApi;", "", "fetchCountryList", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BaseEntity;", "", "Lcom/kubi/kucoin/data/platform/model/CountryEntity;", "sceneCode", "", "LAppCountry_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IPlatformApi {
    @GET("v1/country-codes")
    @NotNull
    /* JADX INFO: renamed from: a */
    Observable<BaseEntity<List<CountryEntity>>> m32054a(@Nullable @Query("sceneCode") String str) throws Exception;
}
