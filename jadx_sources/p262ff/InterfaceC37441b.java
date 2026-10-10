package p262ff;

import android.annotation.SuppressLint;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.data.rate.CurrencyPrice;
import com.kubi.sdk.base.entity.BaseEntity;
import io.reactivex.Observable;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: ff.b */
/* JADX INFO: compiled from: IRateApi.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J8\u0010\u0002\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00040\u00032\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0006H'J \u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u00032\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0006H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/data/api/IRateApi;", "", "getLegalRates", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Ljava/util/HashMap;", "", "", TtmlNode.RUBY_BASE, "targets", "getCurrencyPrice", "Lcom/kubi/data/rate/CurrencyPrice;", "unit", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"KCRetrofitAPICheck"})
public interface InterfaceC37441b {
    @GET("v2/currency-price")
    @NotNull
    /* JADX INFO: renamed from: a */
    Observable<BaseEntity<CurrencyPrice>> m84236a(@Nullable @Query(TtmlNode.RUBY_BASE) String str);

    @GET("v1/currency-rates")
    @NotNull
    /* JADX INFO: renamed from: b */
    Observable<BaseEntity<HashMap<String, Double>>> m84237b(@Nullable @Query(TtmlNode.RUBY_BASE) String str, @Nullable @Query("targets") String str2);
}
