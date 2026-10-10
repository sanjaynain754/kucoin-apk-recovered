package p202dh;

import com.kubi.kumex.data.trade.model.PositionEntity;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: dh.c */
/* JADX INFO: compiled from: ITrialPositionApi.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\bH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/futures/classic/common/positon/api/ITrialPositionApi;", "", "fetchPositionBySymbol", "", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "symbol", "", "isTrial", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC36681c {
    @GET("v2/km/position")
    @NotNull
    /* JADX INFO: renamed from: b */
    List<PositionEntity> m82112b(@NotNull @Query("symbol") String str, @Query("isTrialFunds") boolean z11) throws Throwable;

    /* JADX INFO: renamed from: a */
    static /* synthetic */ List m82111a(InterfaceC36681c interfaceC36681c, String str, boolean z11, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchPositionBySymbol");
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return interfaceC36681c.m82112b(str, z11);
    }
}
