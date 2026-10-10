package et;

import com.kubi.otc.entity.FastSymbol;
import com.kubi.sdk.base.entity.BaseEntity;
import io.reactivex.Observable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: et.a */
/* JADX INFO: compiled from: FastApi.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u0007H'Jd\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00040\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\u00072\b\b\u0001\u0010\r\u001a\u00020\u00072\b\b\u0001\u0010\u000e\u001a\u00020\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u00072\b\b\u0003\u0010\u0010\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\u0006\u001a\u00020\u0007H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/otc/api/FastApi;", "", "fastSymbols", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Lcom/kubi/otc/entity/FastSymbol;", "version", "", "platform", "fastQuotes", "Lcom/kubi/otc/entity/FastQuotesModel;", "amount", "fiatCurrency", "cryptoCurrency", "quoteType", "side", "source", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC37239a {
    @GET("v1/dispatch/symbols")
    @NotNull
    /* JADX INFO: renamed from: b */
    Observable<BaseEntity<FastSymbol>> m83287b(@NotNull @Query("version") String str, @NotNull @Query("platform") String str2);

    /* JADX INFO: renamed from: a */
    static /* synthetic */ Observable m83286a(InterfaceC37239a interfaceC37239a, String str, String str2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fastSymbols");
        }
        if ((i11 & 1) != 0) {
            str = "v2";
        }
        if ((i11 & 2) != 0) {
            str2 = "KUCOIN";
        }
        return interfaceC37239a.m83287b(str, str2);
    }
}
