package p606rt;

import com.kubi.payment.common.data.entities.DayLimit;
import com.kubi.payment.common.data.entities.DayLimitRequest;
import com.kubi.payment.common.data.entities.UpgradeOptionRequest;
import com.kubi.payment.common.data.entities.UpgradeOptionResult;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: renamed from: rt.a */
/* JADX INFO: compiled from: CommonWebService.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\tH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/payment/common/data/source/remote/CommonWebService;", "", "queryDayLimit", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/payment/common/data/entities/DayLimit;", "request", "Lcom/kubi/payment/common/data/entities/DayLimitRequest;", "loadUpgradeOption", "Lcom/kubi/payment/common/data/entities/UpgradeOptionResult;", "Lcom/kubi/payment/common/data/entities/UpgradeOptionRequest;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC44174a {
    @POST("pmtapi/v1/app/limit/check")
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<UpgradeOptionResult> m97391a(@Body @NotNull UpgradeOptionRequest upgradeOptionRequest);

    @POST("pmtapi/v1/payment/userDayLimit/query")
    @NotNull
    /* JADX INFO: renamed from: b */
    InterfaceC41634e<DayLimit> m97392b(@Body @NotNull DayLimitRequest dayLimitRequest);
}
