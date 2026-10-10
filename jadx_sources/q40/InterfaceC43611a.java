package q40;

import com.kubi.tradingbotkit.bean.params.coupons.CouponsOverviewBean;
import com.kubi.tradingbotkit.entity.coupons.AllCouponsEntity;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: renamed from: q40.a */
/* JADX INFO: compiled from: IGridCouponsApi.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u001a\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\tH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/coupons/api/IGridCouponsApi;", "", "newCouponsList", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/tradingbotkit/entity/coupons/ExperienceGoldEntity;", ReportDataTable.COLUMN_PARAMS, "Lcom/kubi/tradingbotkit/bean/params/coupons/CouponsReceiveBean;", "getCouponsOverview", "Lcom/kubi/tradingbotkit/entity/coupons/AllCouponsEntity;", "Lcom/kubi/tradingbotkit/bean/params/coupons/CouponsOverviewBean;", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC43611a {
    @POST("v1/robot/coupon/overview")
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<AllCouponsEntity> m95970a(@Body @NotNull CouponsOverviewBean couponsOverviewBean);
}
