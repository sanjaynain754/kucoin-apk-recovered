package com.kubi.core.spot.business.holder;

import android.content.Context;
import androidx.viewbinding.ViewBinding;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.resources.widget.DashTextView;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.functions.Action;
import java.math.BigDecimal;
import java.util.List;
import me.InterfaceC42516c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import pe.C43452h;
import pe.InterfaceC43445a;
import pe.InterfaceC43446b;
import pe.InterfaceC43447c;

/* JADX INFO: renamed from: com.kubi.core.spot.business.holder.e0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ITradeDiffBizDefine.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\tH&J\b\u0010\u000b\u001a\u00020\tH&J\b\u0010\f\u001a\u00020\tH&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH&J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H&J\u001a\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013H&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH&J\b\u0010\u001c\u001a\u00020\u0018H&J \u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 H&J\u0012\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010#H&J \u0010$\u001a\u00020%2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u0018H&J\u0010\u0010'\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010(\u001a\u0004\u0018\u00010%2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010)\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H&J\b\u0010.\u001a\u00020\u0018H\u0016J\b\u0010/\u001a\u00020\u0018H\u0016J\b\u00100\u001a\u00020#H&J\"\u00101\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u00182\b\u00103\u001a\u0004\u0018\u00010#H&J\u0010\u00104\u001a\u0002052\u0006\u0010,\u001a\u00020-H&J\u0010\u00106\u001a\u0002072\u0006\u0010,\u001a\u00020-H\u0016J\u0018\u00108\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u00109\u001a\u00020 H&J\u0018\u0010:\u001a\u00020\u00032\u0006\u0010;\u001a\u00020#2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010<\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0005H&J4\u0010=\u001a\b\u0012\u0004\u0012\u00020?0>2\u0006\u0010@\u001a\u00020A2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#0C2\b\u0010D\u001a\u0004\u0018\u00010#H&J4\u0010E\u001a\b\u0012\u0004\u0012\u00020?0>2\u0006\u0010@\u001a\u00020A2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#0C2\b\u0010D\u001a\u0004\u0018\u00010#H&J\u0010\u0010F\u001a\u00020\u00032\u0006\u0010G\u001a\u00020HH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006IÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/core/spot/business/holder/ITradeDiffBizDefine;", "", "initBottomBizView", "", "baseOrderHolder", "Lcom/kubi/core/spot/business/holder/BaseOrderHolder;", "trackImp", "Lcom/kubi/core/spot/business/holder/IHolderTrackDefine;", "limitLayoutRes", "", "marketLayoutRes", "ocoLayoutRes", "trailingLayoutRes", "preIntercepts", "", "Lcom/kubi/core/spot/business/holder/intercept/IOrderIntercept;", "formatterBaseBalanceDisplay", "", "tvBaseUnit", "Lcom/kubi/resources/widget/DashTextView;", "formatterQuoteBalanceDisplay", "tvQuoteUnit", "onCouponsDataGet", "isBuyHolder", "", "trackPercentClick", "radioGroup", "Landroid/widget/RadioGroup;", "isMarginTrade", "checkAvailableSizeOk", "needHint", "insufficientCallBack", "Lio/reactivex/functions/Action;", "toTransfer", "targetCurrency", "", "getHolderDiffAvailableBalance", "Ljava/math/BigDecimal;", "isReal", "calculateBorrowAmount", "getBorrowAmount", "calculateRepayDebtAmount", "checkSpotSubmitClickIntercept", "Lcom/kubi/core/spot/business/holder/intercept/input/ILimitTradeInputIntercept;", "context", "Landroid/content/Context;", "isAutoBorrow", "isAutoRepay", "requestTradeType", "trackOrderSuccessOrFail", "success", "errorMsg", "checkMarketSubmitClickIntercept", "Lcom/kubi/core/spot/business/holder/intercept/input/IMarketTradeInputIntercept;", "checkSegmentSubmitClickIntercept", "Lcom/kubi/core/spot/business/holder/intercept/input/ISegmentTradeInputIntercept;", "needTipsMarginPriceOffset", TUIConstants.TIMPush.NOTIFICATION.ACTION, "showTransferDialog", FirebaseAnalytics.Param.CURRENCY, "needCheckAvailable", "requestOcoOrderApi", "Lio/reactivex/Observable;", "Lcom/kubi/core/spot/entity/OrderResultEntity;", "marketApi", "Lcom/kubi/core/spot/api/MarketApi;", "requestEntity", "", "fingerEvent", "requestTsoOderApi", "initMarginViewBind", "viewBinding", "Landroidx/viewbinding/ViewBinding;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ITradeDiffBizDefine {
    /* JADX INFO: renamed from: a */
    default boolean m23270a() {
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    IHolderTrackDefine mo23216b();

    @NotNull
    /* JADX INFO: renamed from: c */
    InterfaceC43445a mo23217c(@NotNull Context context);

    /* JADX INFO: renamed from: d */
    int mo23218d();

    /* JADX INFO: renamed from: e */
    default boolean m23271e() {
        return false;
    }

    /* JADX INFO: renamed from: f */
    boolean mo23219f();

    @NotNull
    /* JADX INFO: renamed from: g */
    String mo23220g();

    /* JADX INFO: renamed from: h */
    void mo23221h(boolean z11);

    @NotNull
    /* JADX INFO: renamed from: i */
    InterfaceC43446b mo23222i(@NotNull Context context);

    /* JADX INFO: renamed from: j */
    int mo23223j();

    @NotNull
    /* JADX INFO: renamed from: k */
    List<InterfaceC42516c> mo23224k();

    /* JADX INFO: renamed from: l */
    void mo23225l(@Nullable String str);

    /* JADX INFO: renamed from: m */
    void mo23226m(@NotNull ViewBinding viewBinding);

    /* JADX INFO: renamed from: n */
    void mo23227n(@NotNull BaseOrderHolder baseOrderHolder);

    @NotNull
    /* JADX INFO: renamed from: o */
    CharSequence mo23228o(@NotNull BaseOrderHolder baseOrderHolder, @Nullable DashTextView dashTextView);

    /* JADX INFO: renamed from: p */
    void mo23229p(@NotNull BaseOrderHolder baseOrderHolder, boolean z11, @Nullable String str);

    /* JADX INFO: renamed from: q */
    void mo23230q(@NotNull BaseOrderHolder baseOrderHolder);

    @NotNull
    /* JADX INFO: renamed from: r */
    CharSequence mo23231r(@NotNull BaseOrderHolder baseOrderHolder, @Nullable DashTextView dashTextView);

    @Nullable
    /* JADX INFO: renamed from: s */
    BigDecimal mo23232s(@NotNull BaseOrderHolder baseOrderHolder);

    /* JADX INFO: renamed from: t */
    void mo23233t(@NotNull BaseOrderHolder baseOrderHolder, @NotNull Action action);

    /* JADX INFO: renamed from: u */
    void mo23234u(@NotNull BaseOrderHolder baseOrderHolder);

    /* JADX INFO: renamed from: v */
    void mo23235v(@NotNull String str, @NotNull BaseOrderHolder baseOrderHolder);

    /* JADX INFO: renamed from: w */
    boolean mo23236w(@NotNull BaseOrderHolder baseOrderHolder);

    /* JADX INFO: renamed from: y */
    boolean mo23238y(@NotNull BaseOrderHolder baseOrderHolder, boolean z11, @NotNull Action action);

    @NotNull
    /* JADX INFO: renamed from: z */
    BigDecimal mo23239z(@NotNull BaseOrderHolder baseOrderHolder, boolean z11, boolean z12);

    @NotNull
    /* JADX INFO: renamed from: x */
    default InterfaceC43447c mo23237x(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new C43452h(context);
    }
}
