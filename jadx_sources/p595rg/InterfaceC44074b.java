package p595rg;

import am.HistoryFundsParams;
import am.HistoryProfitDetailParams;
import am.HistoryProfitParams;
import am.HistoryTradeRecordParams;
import com.kubi.kumex.data.assets.model.ProfitDetailItemEntity;
import com.kubi.kumex.data.assets.model.ProfitRecordEntity;
import com.kubi.kumex.data.assets.model.ProfitShareEntity;
import com.kubi.kumex.data.assets.model.TradeRecordEntity;
import com.kubi.kumex.entity.FundsRecordEntity;
import com.kubi.sdk.PageEntity;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p559qg.InterfaceC43729a;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: rg.b */
/* JADX INFO: compiled from: IMultiHistoryApi.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u0005\u001a\u00020\tH&J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0005\u001a\u00020\rH&J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u0006\u0010\u0005\u001a\u00020\u0010H&J\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/function/common/IMultiHistoryApi;", "Lcom/kubi/function/IMultiFunction;", "fetchProfitRecord", "Lcom/kubi/sdk/PageEntity;", "Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;", ReportDataTable.COLUMN_PARAMS, "Lcom/kubi/kumex/data/assets/model/HistoryProfitParams;", "fetchProfitDetail", "Lcom/kubi/kumex/data/assets/model/ProfitDetailItemEntity;", "Lcom/kubi/kumex/data/assets/model/HistoryProfitDetailParams;", "fetchFundsRecord", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "Lcom/kubi/kumex/entity/FundsRecordEntity;", "Lcom/kubi/kumex/data/assets/model/HistoryFundsParams;", "fetchTradeRecord", "Lcom/kubi/kumex/data/assets/model/TradeRecordEntity;", "Lcom/kubi/kumex/data/assets/model/HistoryTradeRecordParams;", "fetchProfitShare", "Lcom/kubi/kumex/data/assets/model/ProfitShareEntity;", "pnlId", "", "closeTime", "", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC44074b extends InterfaceC43729a {
    @NotNull
    /* JADX INFO: renamed from: K0 */
    PageEntity<ProfitRecordEntity> mo83052K0(@NotNull HistoryProfitParams historyProfitParams);

    @NotNull
    /* JADX INFO: renamed from: O0 */
    PageEntity<TradeRecordEntity> mo83053O0(@NotNull HistoryTradeRecordParams historyTradeRecordParams);

    @NotNull
    /* JADX INFO: renamed from: Q0 */
    BasePageEntity<FundsRecordEntity> mo83054Q0(@NotNull HistoryFundsParams historyFundsParams);

    @Nullable
    /* JADX INFO: renamed from: c */
    ProfitShareEntity mo83055c(@NotNull String str, long j11);

    @NotNull
    /* JADX INFO: renamed from: c0 */
    PageEntity<ProfitDetailItemEntity> mo83056c0(@NotNull HistoryProfitDetailParams historyProfitDetailParams);
}
