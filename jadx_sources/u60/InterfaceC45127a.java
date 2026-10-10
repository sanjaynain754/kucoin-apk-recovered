package u60;

import com.kubi.kumex.data.platform.model.ModifyMarginModeResultEntity;
import com.kubi.kumex.data.platform.model.SubmitCrossLeverageEntity;
import com.kubi.kumex.data.trade.model.PositionOrderHoldMarginEntity;
import com.kubi.kumex.data.trade.model.QuoteEntity;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: u60.a */
/* JADX INFO: compiled from: ICrossApi.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\t\u001a\u00020\u0004H'J\u001e\u0010\n\u001a\u00020\u000b2\u0014\b\u0001\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H'J\u0012\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000eH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/unify/unify/cross/api/ICrossApi;", "", "submitCrossLeverage", "", "", ReportDataTable.COLUMN_PARAMS, "Lcom/kubi/kumex/data/platform/model/SubmitCrossLeverageEntity;", "fetchPosOrderMargin", "Lcom/kubi/kumex/data/trade/model/PositionOrderHoldMarginEntity;", "symbol", "submitMarginMode", "Lcom/kubi/kumex/data/platform/model/ModifyMarginModeResultEntity;", "map", "fetchAllContractsMarginMode", "", "Lcom/kubi/kumex/data/trade/model/QuoteEntity;", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC45127a {
    @GET("ultra-position/unified/inner/position/get-switchable-contracts")
    @Nullable
    /* JADX INFO: renamed from: a */
    List<QuoteEntity> m99751a() throws Throwable;

    @POST("ultra-position/unified/inner/position/change-margin-mode")
    @NotNull
    /* JADX INFO: renamed from: b */
    ModifyMarginModeResultEntity m99752b(@Body @NotNull Map<String, String> map) throws Throwable;

    @POST("ultra-position/unified/inner/position/modify-leverage")
    @NotNull
    /* JADX INFO: renamed from: c */
    Map<String, String> m99753c(@Body @NotNull SubmitCrossLeverageEntity submitCrossLeverageEntity) throws Throwable;

    @GET("ultra-order/unified/inner/orders/get-pos-order-value")
    @Nullable
    /* JADX INFO: renamed from: d */
    PositionOrderHoldMarginEntity m99754d(@NotNull @Query("symbol") String str) throws Throwable;
}
