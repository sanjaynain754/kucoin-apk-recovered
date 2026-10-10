package p768xo;

import com.kubi.margin.entity.IndexSampleData;
import com.kubi.margin.entity.IndexSymbolData;
import com.kubi.sdk.base.entity.BaseEntity;
import io.reactivex.Observable;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: xo.e */
/* JADX INFO: compiled from: IndexApi.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bH'J2\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00040\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\bH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/margin/api/IndexApi;", "", "getIndexListData", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Ljava/util/ArrayList;", "Lcom/kubi/margin/entity/IndexSymbolData;", "symbol", "", "getIndexSamples", "Lcom/kubi/margin/entity/IndexSampleData;", "priceCurrency", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC46304e {
    @GET("v1/index/samples")
    @NotNull
    /* JADX INFO: renamed from: b */
    Observable<BaseEntity<ArrayList<IndexSampleData>>> m102061b(@Nullable @Query("symbol") String str, @Nullable @Query("priceCurrency") String str2);

    @GET("v1/index/tickers")
    @NotNull
    /* JADX INFO: renamed from: c */
    Observable<BaseEntity<ArrayList<IndexSymbolData>>> m102062c(@Nullable @Query("symbol") String str);

    /* JADX INFO: renamed from: a */
    static /* synthetic */ Observable m102060a(InterfaceC46304e interfaceC46304e, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getIndexListData");
        }
        if ((i11 & 1) != 0) {
            str = null;
        }
        return interfaceC46304e.m102062c(str);
    }
}
