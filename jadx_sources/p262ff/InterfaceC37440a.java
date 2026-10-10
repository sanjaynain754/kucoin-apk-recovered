package p262ff;

import com.kubi.data.entity.FiatCurrencyEntity;
import com.kubi.sdk.base.entity.BaseEntity;
import io.reactivex.Observable;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.http.GET;

/* JADX INFO: renamed from: ff.a */
/* JADX INFO: compiled from: ICommonApi.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R&\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/data/api/ICommonApi;", "", "currencyUnit", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BaseEntity;", "", "Lcom/kubi/data/entity/FiatCurrencyEntity;", "getCurrencyUnit", "()Lio/reactivex/Observable;", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC37440a {
    @GET("v2/currency-unit")
    @NotNull
    /* JADX INFO: renamed from: a */
    Observable<BaseEntity<List<FiatCurrencyEntity>>> m84235a();
}
