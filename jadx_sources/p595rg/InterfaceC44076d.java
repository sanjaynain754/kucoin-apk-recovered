package p595rg;

import androidx.media3.extractor.text.ttml.TtmlNode;
import cm.CancelAllOrderParams;
import cm.SubmitStopOrderParams;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.kumex.data.platform.model.UserMaxLeverageEntity;
import com.kubi.kumex.data.trade.model.CouponDetailEntity;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.data.trade.model.OrderResult;
import com.kubi.kumex.data.trade.model.SubmitAlterTpslOrderEntity;
import com.kubi.kumex.data.trade.model.SubmitModifyOrderEntity;
import com.kubi.kumex.data.trade.model.SubmitReversePositionEntity;
import com.kubi.kumex.data.trade.model.SubmitScaledOrderBody;
import com.kubi.kumex.data.trade.model.SubmitTwapModifyOrderEntity;
import com.kubi.kumex.data.trade.model.TwapDelegateHistPageEntity;
import com.kubi.sdk.PageEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.math.BigDecimal;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p559qg.InterfaceC43729a;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: rg.d */
/* JADX INFO: compiled from: IMultiOrderApi.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0014\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u001e\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&J\u001e\u0010\u000f\u001a\u00020\f2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0011H&J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u0005H&J\"\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001cH&J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001cH&J&\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0011H&J\u0018\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020 H&J\u001a\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u0005H&J$\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0011H&J$\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0011H&J\u001e\u0010'\u001a\u0004\u0018\u00010(2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0011H&J$\u0010)\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0011H&JT\u0010*\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\u0006\u0012\u0004\u0018\u00010,\u0018\u00010+2\u0006\u0010-\u001a\u00020\u00182\b\u0010.\u001a\u0004\u0018\u00010,2\b\u0010/\u001a\u0004\u0018\u00010,2\u0006\u00100\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u0005H¦@¢\u0006\u0002\u00102J\u0010\u00103\u001a\u00020\f2\u0006\u0010\r\u001a\u000204H&J\u0010\u00105\u001a\u00020\f2\u0006\u00106\u001a\u000207H&J\u0010\u00108\u001a\u00020\f2\u0006\u0010\r\u001a\u000209H&J\u001c\u0010:\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0011H&J\n\u0010'\u001a\u0004\u0018\u00010;H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006<À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/function/common/IMultiOrderApi;", "Lcom/kubi/function/IMultiFunction;", "pauseOrRestartTwapOrder", "", "orderId", "", "status", "cancelTwapOrder", "cancelAllTwapOrder", "symbol", "advancedType", "submitModifyTwapOrder", "Lcom/kubi/kumex/data/trade/model/OrderResult;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/kumex/data/trade/model/SubmitTwapModifyOrderEntity;", "submitTwapOrder", "request", "", "submitScaledOrder", TtmlNode.TAG_BODY, "Lcom/kubi/kumex/data/trade/model/SubmitScaledOrderBody;", "fetchUserMaxLeverage", "Lcom/kubi/kumex/data/platform/model/UserMaxLeverageEntity;", "isTrial", "", "cancelOrder", "cancelAllOrder", ReportDataTable.COLUMN_PARAMS, "Lcom/kubi/kumex/data/trade/model/CancelAllOrderParams;", "cancelAllAdvancedOrders", "submitOrder", "submitStopOrder", "Lcom/kubi/kumex/data/trade/model/SubmitStopOrderParams;", "fetchCouponDetail", "Lcom/kubi/kumex/data/trade/model/CouponDetailEntity;", "fetchActiveOrders", "Lcom/kubi/sdk/PageEntity;", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "fetchAdvancedOrders", "fetchTwapOrders", "Lcom/kubi/kumex/data/trade/model/TwapDelegateHistPageEntity;", "fetchHistoryOrders", "fetchEsAccountRiskRateChange", "Lkotlin/Pair;", "Ljava/math/BigDecimal;", "trial", "qty", FirebaseAnalytics.Param.PRICE, "orderType", "side", "(ZLjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitReversePositionOrder", "Lcom/kubi/kumex/data/trade/model/SubmitReversePositionEntity;", "submitModifyOrder", "createSubmitModifyOrderEntity", "Lcom/kubi/kumex/data/trade/model/SubmitModifyOrderEntity;", "submitAlterTpslOrder", "Lcom/kubi/kumex/data/trade/model/SubmitAlterTpslOrderEntity;", "submitChaseOrder", "Lcom/kubi/kumex/data/trade/model/OrdersPageEntity;", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC44076d extends InterfaceC43729a {
    @NotNull
    /* JADX INFO: renamed from: B */
    OrderResult mo4494B(@NotNull SubmitAlterTpslOrderEntity submitAlterTpslOrderEntity);

    @NotNull
    /* JADX INFO: renamed from: H0 */
    OrderResult mo4496H0(boolean z11, @NotNull Map<String, String> map);

    @NotNull
    /* JADX INFO: renamed from: J */
    Object mo4497J(@NotNull CancelAllOrderParams cancelAllOrderParams);

    @NotNull
    /* JADX INFO: renamed from: L0 */
    UserMaxLeverageEntity mo4498L0(boolean z11, @NotNull String str);

    @Nullable
    /* JADX INFO: renamed from: d0 */
    CouponDetailEntity mo4500d0(boolean z11, @NotNull String str);

    @Nullable
    /* JADX INFO: renamed from: d1 */
    Object mo4501d1(boolean z11, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Continuation<? super Pair<? extends BigDecimal, ? extends BigDecimal>> continuation);

    @NotNull
    /* JADX INFO: renamed from: e1 */
    OrderResult mo4502e1(@NotNull SubmitScaledOrderBody submitScaledOrderBody);

    @Nullable
    /* JADX INFO: renamed from: f */
    PageEntity<OrderEntity> mo4503f(@NotNull Map<String, String> map);

    @Nullable
    /* JADX INFO: renamed from: g */
    PageEntity<OrderEntity> mo4504g(@NotNull Map<String, String> map);

    @NotNull
    /* JADX INFO: renamed from: h */
    OrderResult mo4505h(@NotNull SubmitModifyOrderEntity submitModifyOrderEntity);

    @NotNull
    /* JADX INFO: renamed from: i */
    OrderResult mo4506i(@NotNull SubmitTwapModifyOrderEntity submitTwapModifyOrderEntity);

    @NotNull
    /* JADX INFO: renamed from: i1 */
    Object mo4507i1(boolean z11, @Nullable String str, @NotNull String str2);

    @Nullable
    /* JADX INFO: renamed from: j */
    PageEntity<OrderEntity> mo4508j(@NotNull Map<String, String> map);

    @NotNull
    /* JADX INFO: renamed from: k */
    OrderResult mo4509k(@NotNull SubmitReversePositionEntity submitReversePositionEntity);

    @NotNull
    /* JADX INFO: renamed from: l0 */
    Object mo4510l0(boolean z11, @NotNull SubmitStopOrderParams submitStopOrderParams);

    @Nullable
    /* JADX INFO: renamed from: m */
    TwapDelegateHistPageEntity mo4511m(@NotNull Map<String, String> map);

    @NotNull
    /* JADX INFO: renamed from: r */
    Object mo4512r(@Nullable String str);

    @NotNull
    /* JADX INFO: renamed from: s */
    Object mo4513s(@Nullable String str, @NotNull String str2);

    @NotNull
    /* JADX INFO: renamed from: v */
    OrderResult mo4514v(@NotNull Map<String, String> map);

    @NotNull
    /* JADX INFO: renamed from: y */
    Object mo4516y(@Nullable String str, @NotNull String str2);

    @NotNull
    /* JADX INFO: renamed from: z */
    OrderResult mo4517z(@NotNull Map<String, String> map);

    @NotNull
    /* JADX INFO: renamed from: z0 */
    Object mo4518z0(@NotNull CancelAllOrderParams cancelAllOrderParams);

    /* JADX INFO: renamed from: b0 */
    static /* synthetic */ Object m97138b0(InterfaceC44076d interfaceC44076d, String str, String str2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancelAllTwapOrder");
        }
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            str2 = "twap";
        }
        return interfaceC44076d.mo4513s(str, str2);
    }
}
