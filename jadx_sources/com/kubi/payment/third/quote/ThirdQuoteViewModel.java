package com.kubi.payment.third.quote;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.otc.R$string;
import com.kubi.payment.third.data.entities.ChannelLimit;
import com.kubi.payment.third.data.entities.FiatCurrencySelect;
import com.kubi.payment.third.data.entities.PayChannelSelect;
import com.kubi.payment.third.data.entities.ThirdKycInfo;
import com.kubi.payment.third.data.entities.ThirdOrder;
import com.kubi.payment.third.data.entities.ThirdQuoteInfo;
import com.kubi.payment.third.data.source.IThirdRepository;
import com.kubi.payment.track.IPaymentTrack;
import com.kubi.payment.track.ThirdBuyTrackData;
import com.kubi.sdk.constant.monitor.KunlunBusinessEventEnum;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import ht.C38346y;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p477nt.AbstractC42878k;
import p477nt.C42874g;
import p569qq.C43847h;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: ThirdQuoteViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 b2\u00020\u0001:\u0001bB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010O\u001a\u00020PJ\u0010\u0010Q\u001a\u00020P2\b\b\u0002\u0010;\u001a\u00020#J\u0006\u0010R\u001a\u00020PJ\u001a\u0010S\u001a\u00020P2\u0006\u0010T\u001a\u00020U2\b\u0010V\u001a\u0004\u0018\u00010\u0007H\u0002J\u0006\u0010W\u001a\u00020PJ\u0006\u0010X\u001a\u00020PJ\u000e\u0010Y\u001a\u00020P2\u0006\u0010Z\u001a\u00020[J\u0010\u0010\\\u001a\u00020P2\u0006\u0010]\u001a\u00020^H\u0002J\u0010\u0010_\u001a\u00020P2\u0006\u0010]\u001a\u00020^H\u0002J\b\u0010`\u001a\u00020PH\u0002J\b\u0010a\u001a\u00020PH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0010\u0010!\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020&0(8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020,0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020,0(8F¢\u0006\u0006\u001a\u0004\b.\u0010*R\u0014\u0010/\u001a\b\u0012\u0004\u0012\u00020#0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020#0(8F¢\u0006\u0006\u001a\u0004\b0\u0010*R\u0014\u00101\u001a\b\u0012\u0004\u0012\u00020\u00070%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020\u00070(8F¢\u0006\u0006\u001a\u0004\b3\u0010*R\u0014\u00104\u001a\b\u0012\u0004\u0012\u0002050%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00106\u001a\b\u0012\u0004\u0012\u0002050(8F¢\u0006\u0006\u001a\u0004\b7\u0010*R\u0014\u00108\u001a\b\u0012\u0004\u0012\u00020#0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00109\u001a\b\u0012\u0004\u0012\u00020#0(8F¢\u0006\u0006\u001a\u0004\b9\u0010*R\u0014\u0010:\u001a\b\u0012\u0004\u0012\u00020#0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020#0(8F¢\u0006\u0006\u001a\u0004\b;\u0010*R\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00020#0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00020#0(8F¢\u0006\u0006\u001a\u0004\b=\u0010*R\u0014\u0010>\u001a\b\u0012\u0004\u0012\u00020#0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010?\u001a\b\u0012\u0004\u0012\u00020#0(8F¢\u0006\u0006\u001a\u0004\b?\u0010*R\u0014\u0010@\u001a\b\u0012\u0004\u0012\u00020#0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020#0(8F¢\u0006\u0006\u001a\u0004\bA\u0010*R\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020#0(8F¢\u0006\u0006\u001a\u0004\bC\u0010*R\u0014\u0010D\u001a\b\u0012\u0004\u0012\u00020#0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00070(8F¢\u0006\u0006\u001a\u0004\bF\u0010*R\u0014\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00070%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010H\u001a\b\u0012\u0004\u0012\u00020#0(8F¢\u0006\u0006\u001a\u0004\bH\u0010*R\u0014\u0010I\u001a\b\u0012\u0004\u0012\u00020#0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010J\u001a\b\u0012\u0004\u0012\u00020K0(8F¢\u0006\u0006\u001a\u0004\bL\u0010*R\u0014\u0010M\u001a\b\u0012\u0004\u0012\u00020K0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006c"}, m90084d2 = {"Lcom/kubi/payment/third/quote/ThirdQuoteViewModel;", "Lcom/kubi/payment/base/BaseViewModel;", "repository", "Lcom/kubi/payment/third/data/source/IThirdRepository;", "<init>", "(Lcom/kubi/payment/third/data/source/IThirdRepository;)V", "fiatSelected", "", "getFiatSelected", "()Ljava/lang/String;", "setFiatSelected", "(Ljava/lang/String;)V", "currencySelected", "getCurrencySelected", "setCurrencySelected", "payMethodIdSelected", "getPayMethodIdSelected", "setPayMethodIdSelected", "fiatAmount", "getFiatAmount", "setFiatAmount", "thirdQuoteInfo", "Lcom/kubi/payment/third/data/entities/ThirdQuoteInfo;", "getThirdQuoteInfo", "()Lcom/kubi/payment/third/data/entities/ThirdQuoteInfo;", "setThirdQuoteInfo", "(Lcom/kubi/payment/third/data/entities/ThirdQuoteInfo;)V", "payChannelSelected", "Lcom/kubi/payment/third/data/entities/PayChannelSelect;", "getPayChannelSelected", "()Lcom/kubi/payment/third/data/entities/PayChannelSelect;", "setPayChannelSelected", "(Lcom/kubi/payment/third/data/entities/PayChannelSelect;)V", "thirdAllQuoteInfo", "isRequestFromSave", "", "_kycInfo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/payment/third/data/entities/ThirdKycInfo;", "kycInfo", "Landroidx/lifecycle/LiveData;", "getKycInfo", "()Landroidx/lifecycle/LiveData;", "_orderInfo", "Lcom/kubi/payment/third/data/entities/ThirdOrder;", "orderInfo", "getOrderInfo", "_isLimitInput", "isLimitInput", "_limitInputTip", "limitInputTip", "getLimitInputTip", "_inputPrecision", "", "inputPrecision", "getInputPrecision", "_isRefreshView", "isRefreshView", "_isShowLoading", "isShowLoading", "_isShowChannelLoading", "isShowChannelLoading", "_isShowPayLoadingEmpty", "isShowPayLoadingEmpty", "_isCheckEnable", "isCheckEnable", "showHighKyc", "getShowHighKyc", "_showHighKyc", "showTRYUserTip", "getShowTRYUserTip", "_showTRYUserTip", "isCheckChannelSupport", "_isCheckChannelSupport", "showOngoingOrder", "Lcom/kubi/payment/third/quote/OnGoingOrder;", "getShowOngoingOrder", "_showOngoingOrder", "isFirstLoad", "loadCheckKycExist", "", "loadQuoteThirdInfo", "loadCreateOrder", "handleCreateOrderError", DbParams.KEY_CHANNEL_RESULT, "Lcom/kubi/payment/base/Result$Error;", "channelId", "checkLimitAmount", "refreshInputPrecision", "checkAppVersionIsSupport", "manage", "Landroidx/fragment/app/FragmentManager;", "trackCheckQuote", "exception", "Lcom/kubi/network/retrofit/exception/ApiException;", "trackCheckCreateOrder", "trackCheckCreateOrderSuccess", "onCleared", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nThirdQuoteViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThirdQuoteViewModel.kt\ncom/kubi/payment/third/quote/ThirdQuoteViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,410:1\n1#2:411\n*E\n"})
public final class ThirdQuoteViewModel extends C42874g {

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public static final Companion f40278v0 = new Companion(null);

    /* JADX INFO: renamed from: X */
    @NotNull
    public final IThirdRepository f40279X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public String f40280Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public String f40281Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public String f40282a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public String f40283b0;

    /* JADX INFO: renamed from: c0 */
    @Nullable
    public ThirdQuoteInfo f40284c0;

    /* JADX INFO: renamed from: d0 */
    @Nullable
    public PayChannelSelect f40285d0;

    /* JADX INFO: renamed from: e0 */
    @Nullable
    public ThirdQuoteInfo f40286e0;

    /* JADX INFO: renamed from: f0 */
    public boolean f40287f0;

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public final MutableLiveData<ThirdKycInfo> f40288g0;

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public final MutableLiveData<ThirdOrder> f40289h0;

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public final MutableLiveData<Boolean> f40290i0;

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public final MutableLiveData<String> f40291j0;

    /* JADX INFO: renamed from: k0 */
    @NotNull
    public final MutableLiveData<Integer> f40292k0;

    /* JADX INFO: renamed from: l0 */
    @NotNull
    public final MutableLiveData<Boolean> f40293l0;

    /* JADX INFO: renamed from: m0 */
    @NotNull
    public final MutableLiveData<Boolean> f40294m0;

    /* JADX INFO: renamed from: n0 */
    @NotNull
    public final MutableLiveData<Boolean> f40295n0;

    /* JADX INFO: renamed from: o0 */
    @NotNull
    public final MutableLiveData<Boolean> f40296o0;

    /* JADX INFO: renamed from: p0 */
    @NotNull
    public final MutableLiveData<Boolean> f40297p0;

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final MutableLiveData<Boolean> f40298q0;

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final MutableLiveData<String> f40299r0;

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final MutableLiveData<Boolean> f40300s0;

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final MutableLiveData<OnGoingOrder> f40301t0;

    /* JADX INFO: renamed from: u0 */
    public boolean f40302u0;

    /* JADX INFO: compiled from: ThirdQuoteViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/payment/third/quote/ThirdQuoteViewModel$Companion;", "", "<init>", "()V", "THIRD_QUOTE_USER_SELECTION", "", "ERROR_CODE_KYC_LEVEL", "ERROR_CODE_TRY", "ERROR_CODE_ONGOING_ORDER", "DEFAULT_CRYPTO_CURRENCY", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m49782g0(boolean z11) {
        this.f40285d0 = null;
        this.f40297p0.setValue(Boolean.TRUE);
        this.f40294m0.setValue(Boolean.valueOf(C27025c.m66566d(Boolean.valueOf(z11))));
        MutableLiveData<Boolean> mutableLiveData = this.f40295n0;
        boolean z12 = this.f40287f0;
        this.f40287f0 = false;
        mutableLiveData.setValue(Boolean.valueOf(!z12));
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new ThirdQuoteViewModel$loadQuoteThirdInfo$2(this, null), 3, null);
    }

    public ThirdQuoteViewModel(@NotNull IThirdRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f40279X = repository;
        this.f40280Y = "";
        this.f40281Z = "";
        this.f40282a0 = "";
        this.f40283b0 = "";
        this.f40288g0 = new MutableLiveData<>();
        this.f40289h0 = new MutableLiveData<>();
        this.f40290i0 = new MutableLiveData<>();
        this.f40291j0 = new MutableLiveData<>();
        this.f40292k0 = new MutableLiveData<>();
        this.f40293l0 = new MutableLiveData<>();
        this.f40294m0 = new MutableLiveData<>();
        this.f40295n0 = new MutableLiveData<>();
        this.f40296o0 = new MutableLiveData<>();
        this.f40297p0 = new MutableLiveData<>();
        this.f40298q0 = new MutableLiveData<>();
        this.f40299r0 = new MutableLiveData<>();
        this.f40300s0 = new MutableLiveData<>();
        this.f40301t0 = new MutableLiveData<>();
        this.f40302u0 = true;
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m49747h0(ThirdQuoteViewModel thirdQuoteViewModel, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        thirdQuoteViewModel.m49782g0(z11);
    }

    /* JADX INFO: renamed from: H */
    public final void m49757H(@NotNull FragmentManager manage) {
        Intrinsics.checkNotNullParameter(manage, "manage");
        m94034o().setValue(Boolean.TRUE);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new ThirdQuoteViewModel$checkAppVersionIsSupport$1(this, manage, null), 3, null);
    }

    /* JADX INFO: renamed from: I */
    public final void m49758I() {
        if (this.f40283b0.length() == 0) {
            this.f40290i0.setValue(Boolean.FALSE);
            return;
        }
        ThirdQuoteInfo thirdQuoteInfo = this.f40284c0;
        String strM66668h = C27041f.m66668h(thirdQuoteInfo != null ? thirdQuoteInfo.getMinFiatAmount() : null);
        ThirdQuoteInfo thirdQuoteInfo2 = this.f40284c0;
        String strM66668h2 = C27041f.m66668h(thirdQuoteInfo2 != null ? thirdQuoteInfo2.getMaxFiatAmount() : null);
        BigDecimal bigDecimalM86490A = C38346y.m86490A(this.f40283b0);
        BigDecimal bigDecimalM86490A2 = C38346y.m86490A(strM66668h);
        BigDecimal bigDecimalM86490A3 = C38346y.m86490A(strM66668h2);
        if (strM66668h.length() <= 0 || strM66668h2.length() <= 0 || C27039d.m66645e(bigDecimalM86490A, bigDecimalM86490A2, bigDecimalM86490A3)) {
            if (strM66668h.length() > 0 && bigDecimalM86490A.compareTo(bigDecimalM86490A2) == -1) {
                this.f40290i0.setValue(Boolean.TRUE);
                this.f40291j0.setValue(C27017c.f54310a.m66516f(R$string.payment_min_amount_tip, strM66668h, this.f40280Y));
                return;
            } else if (strM66668h2.length() <= 0 || bigDecimalM86490A.compareTo(bigDecimalM86490A3) != 1) {
                this.f40290i0.setValue(Boolean.FALSE);
                return;
            } else {
                this.f40290i0.setValue(Boolean.TRUE);
                this.f40291j0.setValue(C27017c.f54310a.m66516f(R$string.payment_max_amount_tip, strM66668h2, this.f40280Y));
                return;
            }
        }
        this.f40290i0.setValue(Boolean.TRUE);
        this.f40291j0.setValue(C27017c.f54310a.m66516f(R$string.simplex_limit, strM66668h + ' ' + this.f40280Y, strM66668h2 + ' ' + this.f40280Y));
    }

    @NotNull
    /* JADX INFO: renamed from: J, reason: from getter */
    public final String getF40281Z() {
        return this.f40281Z;
    }

    @NotNull
    /* JADX INFO: renamed from: K, reason: from getter */
    public final String getF40283b0() {
        return this.f40283b0;
    }

    @NotNull
    /* JADX INFO: renamed from: L, reason: from getter */
    public final String getF40280Y() {
        return this.f40280Y;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final LiveData<Integer> m49762M() {
        return this.f40292k0;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final LiveData<ThirdKycInfo> m49763N() {
        return this.f40288g0;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final LiveData<String> m49764O() {
        return this.f40291j0;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final LiveData<ThirdOrder> m49765P() {
        return this.f40289h0;
    }

    @Nullable
    /* JADX INFO: renamed from: Q, reason: from getter */
    public final PayChannelSelect getF40285d0() {
        return this.f40285d0;
    }

    @NotNull
    /* JADX INFO: renamed from: R, reason: from getter */
    public final String getF40282a0() {
        return this.f40282a0;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final LiveData<Boolean> m49768S() {
        return this.f40298q0;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final LiveData<OnGoingOrder> m49769T() {
        return this.f40301t0;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final LiveData<String> m49770U() {
        return this.f40299r0;
    }

    @Nullable
    /* JADX INFO: renamed from: V, reason: from getter */
    public final ThirdQuoteInfo getF40284c0() {
        return this.f40284c0;
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final LiveData<Boolean> m49773X() {
        return this.f40300s0;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final LiveData<Boolean> m49774Y() {
        return this.f40297p0;
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final LiveData<Boolean> m49775Z() {
        return this.f40290i0;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final LiveData<Boolean> m49776a0() {
        return this.f40293l0;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final LiveData<Boolean> m49777b0() {
        return this.f40295n0;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final LiveData<Boolean> m49778c0() {
        return this.f40294m0;
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public final LiveData<Boolean> m49779d0() {
        return this.f40296o0;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m49783i0() {
        FiatCurrencySelect fiatCurrencySelect;
        List<ChannelLimit> channelLimit;
        Object next;
        String client;
        PayChannelSelect payChannelSelect;
        List<FiatCurrencySelect> fiatList;
        Object next2;
        ThirdQuoteInfo thirdQuoteInfo = this.f40284c0;
        Integer precision = null;
        if (thirdQuoteInfo == null || (fiatList = thirdQuoteInfo.getFiatList()) == null) {
            fiatCurrencySelect = null;
        } else {
            Iterator<T> it = fiatList.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (!Intrinsics.areEqual(((FiatCurrencySelect) next2).getName(), this.f40280Y));
            fiatCurrencySelect = (FiatCurrencySelect) next2;
        }
        MutableLiveData<Integer> mutableLiveData = this.f40292k0;
        if (fiatCurrencySelect != null && (channelLimit = fiatCurrencySelect.getChannelLimit()) != null) {
            Iterator<T> it2 = channelLimit.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it2.next();
                    client = ((ChannelLimit) next).getClient();
                    payChannelSelect = this.f40285d0;
                }
            } while (!Intrinsics.areEqual(client, payChannelSelect != null ? payChannelSelect.getChannel() : null));
            ChannelLimit channelLimit2 = (ChannelLimit) next;
            if (channelLimit2 != null) {
                precision = channelLimit2.getPrecision();
            }
        }
        mutableLiveData.setValue(Integer.valueOf(C27039d.m66651k(precision, 2)));
    }

    /* JADX INFO: renamed from: j0 */
    public final void m49784j0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f40281Z = str;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m49785l0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f40283b0 = str;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m49786m0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f40280Y = str;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m49787n0(@Nullable PayChannelSelect payChannelSelect) {
        this.f40285d0 = payChannelSelect;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m49788o0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f40282a0 = str;
    }

    /* JADX INFO: renamed from: p0 */
    public final void m49789p0(@Nullable ThirdQuoteInfo thirdQuoteInfo) {
        this.f40284c0 = thirdQuoteInfo;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m49790q0(ApiException apiException) {
        IPaymentTrack track = IPaymentTrack.f40346a.getTrack();
        String str = apiException.code + ':' + apiException.getMessage();
        PayChannelSelect payChannelSelect = this.f40285d0;
        ThirdBuyTrackData thirdBuyTrackData = new ThirdBuyTrackData(payChannelSelect != null ? payChannelSelect.getChannel() : null, this.f40282a0);
        thirdBuyTrackData.setFiatCurrency(this.f40280Y);
        thirdBuyTrackData.setCryptoCurrency(this.f40281Z);
        Unit unit = Unit.INSTANCE;
        IPaymentTrack.m49797i(track, "CHECK_CREATE_ORDER", false, str, thirdBuyTrackData, 2, null);
        KunlunBusinessEventEnum kunlunBusinessEventEnum = KunlunBusinessEventEnum.PAYMENT_THIRD_BUY_RESULT;
        String code = apiException.code;
        Intrinsics.checkNotNullExpressionValue(code, "code");
        Integer intOrNull = StringsKt.toIntOrNull(code);
        C43847h.m96572a(kunlunBusinessEventEnum, intOrNull != null ? intOrNull.intValue() : -1);
    }

    /* JADX INFO: renamed from: x0 */
    public final void m49791x0() {
        IPaymentTrack track = IPaymentTrack.f40346a.getTrack();
        PayChannelSelect payChannelSelect = this.f40285d0;
        ThirdBuyTrackData thirdBuyTrackData = new ThirdBuyTrackData(payChannelSelect != null ? payChannelSelect.getChannel() : null, this.f40282a0);
        thirdBuyTrackData.setFiatCurrency(this.f40280Y);
        thirdBuyTrackData.setCryptoCurrency(this.f40281Z);
        Unit unit = Unit.INSTANCE;
        IPaymentTrack.m49797i(track, "CHECK_CREATE_ORDER", true, null, thirdBuyTrackData, 4, null);
        C43847h.m96572a(KunlunBusinessEventEnum.PAYMENT_THIRD_BUY_RESULT, 0);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m49792y0(ApiException apiException) {
        IPaymentTrack track = IPaymentTrack.f40346a.getTrack();
        String str = apiException.code + ':' + apiException.getMessage();
        PayChannelSelect payChannelSelect = this.f40285d0;
        ThirdBuyTrackData thirdBuyTrackData = new ThirdBuyTrackData(payChannelSelect != null ? payChannelSelect.getChannel() : null, this.f40282a0);
        thirdBuyTrackData.setFiatCurrency(this.f40280Y);
        thirdBuyTrackData.setCryptoCurrency(this.f40281Z);
        Unit unit = Unit.INSTANCE;
        IPaymentTrack.m49797i(track, "CHECK_QUOTE", false, str, thirdBuyTrackData, 2, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    /* JADX INFO: renamed from: W */
    public final void m49772W(AbstractC42878k.Error error, String str) {
        Exception exception = error.getException();
        if (exception instanceof ApiException) {
            ApiException apiException = (ApiException) exception;
            String str2 = apiException.code;
            if (str2 != null) {
                switch (str2.hashCode()) {
                    case 1535446016:
                        if (str2.equals("410003")) {
                            this.f40298q0.setValue(Boolean.TRUE);
                        } else {
                            m94035p().setValue(exception);
                        }
                        break;
                    case 1535446017:
                        if (str2.equals("410004")) {
                            this.f40299r0.setValue(exception.getMessage());
                        } else {
                            m94035p().setValue(exception);
                        }
                        break;
                    case 1535446018:
                    default:
                        m94035p().setValue(exception);
                        break;
                    case 1535446019:
                        if (str2.equals("410006")) {
                            this.f40301t0.setValue(new OnGoingOrder(exception.getMessage(), str));
                        } else {
                            m94035p().setValue(exception);
                        }
                        break;
                }
            } else {
                m94035p().setValue(exception);
            }
            m49790q0(apiException);
            return;
        }
        m94035p().setValue(exception);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m49780e0() {
        m94034o().setValue(Boolean.TRUE);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new ThirdQuoteViewModel$loadCheckKycExist$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m49781f0() {
        m94034o().setValue(Boolean.TRUE);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new ThirdQuoteViewModel$loadCreateOrder$1(this, null), 3, null);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.f40302u0 = false;
    }
}
