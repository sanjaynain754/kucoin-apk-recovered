package com.kubi.futures.trade.welfare.vm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import bm.FuturesWelfareSubTitle;
import bm.InterfaceC4633f;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.broker.BrokerConfig;
import com.kubi.broker.MultiBizType;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.trade.challenge.TradeProTrialState;
import com.kubi.futures.trade.challenge.TradeProTrialStateStore;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.CoinEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareComposeEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareComposeItemEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareCouponItemEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialItemEntity;
import com.kubi.kumex.data.platform.model.PropertyEntity;
import com.kubi.kumex.service.KuMexDepend;
import com.kubi.kumex.utils.Persistence;
import com.kubi.mvi.p102vm.BaseVM;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27092t0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import th.InterfaceC44980d;

/* JADX INFO: compiled from: SelectFuturesWelfareViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0005J\u0006\u0010\"\u001a\u00020\u001fJ\u0006\u0010#\u001a\u00020\u001fJ\b\u0010$\u001a\u00020\u0005H\u0002J\b\u0010%\u001a\u00020\u0005H\u0002J\u0012\u0010&\u001a\u00020\u001f2\b\u0010'\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010(\u001a\u00020\u0010H\u0002J\u001c\u0010)\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\b0*2\u0006\u0010+\u001a\u00020\bJ\u0012\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010'\u001a\u00020\u0010H\u0002J\u0010\u0010.\u001a\u00020/2\u0006\u0010'\u001a\u00020\u0010H\u0002J\u0010\u00100\u001a\u00020/2\u0006\u0010'\u001a\u00020\u0010H\u0002J\u0012\u00101\u001a\u0004\u0018\u0001022\u0006\u0010'\u001a\u00020\u0010H\u0002J\u0012\u00103\u001a\u0004\u0018\u0001022\u0006\u0010'\u001a\u00020\u0010H\u0002J\u001a\u00104\u001a\u00020\b2\u0006\u00105\u001a\u0002022\b\u0010!\u001a\u0004\u0018\u00010\u0005H\u0002J\u001a\u00106\u001a\u00020\u00102\u0006\u00107\u001a\u00020\u00102\b\u0010!\u001a\u0004\u0018\u00010\u0005H\u0002J\u0016\u00108\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0005J\u001c\u00109\u001a\b\u0012\u0004\u0012\u00020;0:2\u0006\u0010'\u001a\u00020\u00102\u0006\u0010<\u001a\u00020\bJ\u0010\u0010=\u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0019\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000eR\u0019\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u000e¨\u0006>"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/vm/SelectFuturesWelfareViewModel;", "Lcom/kubi/mvi/vm/BaseVM;", "<init>", "()V", "TAG", "", "ALL_SUPPORTED_CONTRACT", "isLeadTradingFuturesContext", "", "manualTriggerExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "loadingDialog", "Landroidx/lifecycle/MutableLiveData;", "getLoadingDialog", "()Landroidx/lifecycle/MutableLiveData;", "welfareComposeData", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeEntity;", "getWelfareComposeData", "tradeProTrialState", "Landroidx/lifecycle/LiveData;", "Lcom/kubi/futures/trade/challenge/TradeProTrialState;", "getTradeProTrialState", "()Landroidx/lifecycle/LiveData;", "availableTrial", "getAvailableTrial", "selectDialogTriggerPanelTrialSwitch", "getSelectDialogTriggerPanelTrialSwitch", "leadWelfareTipToShow", "Lcom/kubi/futures/trade/welfare/vm/LeadWelfareTip;", "getLeadWelfareTipToShow", "fetchFuturesWelfare", "", FirebaseAnalytics.Param.CURRENCY, "symbol", "markLeadTrialTipDismissed", "markLeadCouponTipDismissed", "leadTrialTipDismissedKey", "leadCouponTipDismissedKey", "evaluateLeadWelfareTipsAfterData", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "generateEmptyFuturesWelfareComposeEntity", "getWelfareDescOfPanel", "Lkotlin/Pair;", "isOpen", "findCoupon", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponItemEntity;", "findTrialCount", "", "findAirdropCount", "findAvailableTrial", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;", "findAvailableAirdrop", "isTrialSupportSymbol", "trial", "filterComposeBySymbol", "compose", "hasAvailableTrialOfCurrency", "generateWelfareTypeList", "", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareType;", "trialChecked", "fetchAvailableTrial", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSelectFuturesWelfareViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectFuturesWelfareViewModel.kt\ncom/kubi/futures/trade/welfare/vm/SelectFuturesWelfareViewModel\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 CoinEntityEx.kt\ncom/kubi/kumex/extensions/CoinEntityExKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,547:1\n47#2,4:548\n1761#3,3:552\n1869#3,2:557\n1869#3,2:559\n1869#3,2:561\n1788#3,4:563\n1869#3,2:567\n1021#3,2:569\n360#3,7:571\n360#3,7:578\n360#3,7:585\n20#4:555\n1#5:556\n*S KotlinDebug\n*F\n+ 1 SelectFuturesWelfareViewModel.kt\ncom/kubi/futures/trade/welfare/vm/SelectFuturesWelfareViewModel\n*L\n60#1:548,4\n177#1:552,3\n286#1:557,2\n300#1:559,2\n346#1:561,2\n356#1:563,4\n395#1:567,2\n429#1:569,2\n443#1:571,7\n454#1:578,7\n466#1:585,7\n229#1:555\n*E\n"})
public final class SelectFuturesWelfareViewModel extends BaseVM {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final String f24945V = "SelectFuturesWelfareViewModel";

    /* JADX INFO: renamed from: W */
    @NotNull
    public final String f24946W = "ALL";

    /* JADX INFO: renamed from: X */
    @NotNull
    public final CoroutineExceptionHandler f24947X = new C14422b(CoroutineExceptionHandler.INSTANCE, this);

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final MutableLiveData<Boolean> f24948Y = new MutableLiveData<>();

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final MutableLiveData<FuturesWelfareComposeEntity> f24949Z = new MutableLiveData<>();

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final LiveData<TradeProTrialState> f24950a0 = TradeProTrialStateStore.f23763a.m26983d();

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final MutableLiveData<Boolean> f24951b0 = new MutableLiveData<>();

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final MutableLiveData<Boolean> f24952c0 = new MutableLiveData<>();

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final MutableLiveData<LeadWelfareTip> f24953d0 = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.kubi.futures.trade.welfare.vm.SelectFuturesWelfareViewModel$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 SelectFuturesWelfareViewModel.kt\ncom/kubi/futures/trade/welfare/vm/SelectFuturesWelfareViewModel\n*L\n1#1,328:1\n430#2,12:329\n*E\n"})
    public static final class C14421a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int i11;
            InterfaceC4633f interfaceC4633f = (InterfaceC4633f) t12;
            int i12 = 4;
            if (interfaceC4633f instanceof FuturesWelfareCouponItemEntity) {
                i11 = 1;
            } else if (interfaceC4633f instanceof FuturesWelfareTrialItemEntity) {
                i11 = C27092t0.m66897b(((FuturesWelfareTrialItemEntity) interfaceC4633f).getPrizeType()) ? 3 : 2;
            } else {
                i11 = 4;
            }
            Integer numValueOf = Integer.valueOf(i11);
            InterfaceC4633f interfaceC4633f2 = (InterfaceC4633f) t11;
            if (interfaceC4633f2 instanceof FuturesWelfareCouponItemEntity) {
                i12 = 1;
            } else if (interfaceC4633f2 instanceof FuturesWelfareTrialItemEntity) {
                i12 = C27092t0.m66897b(((FuturesWelfareTrialItemEntity) interfaceC4633f2).getPrizeType()) ? 3 : 2;
            }
            return ComparisonsKt.compareValues(numValueOf, Integer.valueOf(i12));
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.trade.welfare.vm.SelectFuturesWelfareViewModel$b */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 SelectFuturesWelfareViewModel.kt\ncom/kubi/futures/trade/welfare/vm/SelectFuturesWelfareViewModel\n*L\n1#1,49:1\n61#2,3:50\n*E\n"})
    public static final class C14422b extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SelectFuturesWelfareViewModel f24954b;

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            C19331c.m42836c(exception, null, 2, null);
            this.f24954b.m28796t().postValue(Boolean.FALSE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14422b(CoroutineExceptionHandler.Companion companion, SelectFuturesWelfareViewModel selectFuturesWelfareViewModel) {
            super(companion);
            this.f24954b = selectFuturesWelfareViewModel;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m28784f(FuturesWelfareComposeEntity futuresWelfareComposeEntity) {
        if (futuresWelfareComposeEntity == null) {
            this.f24953d0.postValue(null);
            return;
        }
        if (!m28802z()) {
            this.f24953d0.postValue(null);
            return;
        }
        if (m28791o(futuresWelfareComposeEntity) == 0) {
            this.f24953d0.postValue(null);
            return;
        }
        if (!Persistence.m36514b(Persistence.f30799a, m28782C(), false, 2, null)) {
            this.f24953d0.postValue(LeadWelfareTip.TRIAL);
            return;
        }
        ArrayList<FuturesWelfareComposeItemEntity> items = futuresWelfareComposeEntity.getItems();
        if (items == null || !items.isEmpty()) {
            Iterator<T> it = items.iterator();
            while (it.hasNext()) {
                FuturesWelfareTrialItemEntity trial = ((FuturesWelfareComposeItemEntity) it.next()).toTrial();
                if (Intrinsics.areEqual(trial != null ? trial.getStatus() : null, "SEND_FINISHED")) {
                    if (Persistence.m36514b(Persistence.f30799a, m28781B(), false, 2, null)) {
                        break;
                    }
                    this.f24953d0.postValue(LeadWelfareTip.COUPON);
                    return;
                }
            }
        }
        this.f24953d0.postValue(null);
    }

    /* JADX INFO: renamed from: B */
    public final String m28781B() {
        UserInfo userInfo = UserInfo.a;
        String strI = userInfo.i();
        if (strI == null || strI.length() == 0) {
            return "";
        }
        return "lead_welfare_coupon_tip_dismissed_" + userInfo.i();
    }

    /* JADX INFO: renamed from: C */
    public final String m28782C() {
        UserInfo userInfo = UserInfo.a;
        String strI = userInfo.i();
        if (strI == null || strI.length() == 0) {
            return "";
        }
        return "lead_welfare_trial_tip_dismissed_" + userInfo.i();
    }

    /* JADX INFO: renamed from: D */
    public final void m28783D() {
        Persistence.f30799a.m36519f(m28782C(), true);
        m28784f(this.f24949Z.getValue());
    }

    /* JADX INFO: renamed from: g */
    public final void m28785g(@Nullable String str) {
        this.f24948Y.setValue(Boolean.TRUE);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b().plus(this.f24947X), null, new SelectFuturesWelfareViewModel$fetchAvailableTrial$1(this, str, null), 2, null);
    }

    /* JADX INFO: renamed from: h */
    public final void m28786h(@NotNull String currency, @NotNull String symbol) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        KuMexDepend kuMexDepend = KuMexDepend.f30378a;
        if (kuMexDepend.m35905g().c() && kuMexDepend.m35906h() && BrokerConfig.f19211a.m20201d().mo20229O()) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new SelectFuturesWelfareViewModel$fetchFuturesWelfare$1(this, currency, symbol, null), 2, null);
        } else {
            this.f24949Z.postValue(m28792p());
            TradeProTrialStateStore.m26980c(TradeProTrialStateStore.f23763a, 0L, 1, null);
        }
    }

    /* JADX INFO: renamed from: i */
    public final FuturesWelfareComposeEntity m28787i(FuturesWelfareComposeEntity futuresWelfareComposeEntity, String str) {
        ArrayList arrayList = new ArrayList();
        for (FuturesWelfareComposeItemEntity futuresWelfareComposeItemEntity : futuresWelfareComposeEntity.getItems()) {
            FuturesWelfareTrialItemEntity trial = futuresWelfareComposeItemEntity.toTrial();
            if (trial != null && m28780A(trial, str)) {
                arrayList.add(futuresWelfareComposeItemEntity);
            }
        }
        int size = arrayList.size();
        int i11 = 0;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                FuturesWelfareTrialItemEntity trial2 = ((FuturesWelfareComposeItemEntity) it.next()).toTrial();
                if (Intrinsics.areEqual(trial2 != null ? trial2.getStatus() : null, "ACTIVATE_FINISHED") && (i11 = i11 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        return FuturesWelfareComposeEntity.copy$default(futuresWelfareComposeEntity, 0, 0, size, 0, i11, null, null, arrayList, 107, null);
    }

    /* JADX INFO: renamed from: p */
    public final FuturesWelfareComposeEntity m28792p() {
        return new FuturesWelfareComposeEntity(0, 0, 0, 0, 0, 0L, Boolean.FALSE, new ArrayList());
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final List<InterfaceC4633f> m28793q(@NotNull FuturesWelfareComposeEntity entity, boolean z11) {
        int i11;
        Intrinsics.checkNotNullParameter(entity, "entity");
        ArrayList arrayList = new ArrayList();
        if (!entity.getItems().isEmpty()) {
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            for (FuturesWelfareComposeItemEntity futuresWelfareComposeItemEntity : entity.getItems()) {
                C44128b.m97259c("SelectFuturesWelfare", "generateWelfareTypeList before trial=" + futuresWelfareComposeItemEntity);
                FuturesWelfareTrialItemEntity trial = futuresWelfareComposeItemEntity.toTrial();
                C44128b.m97259c("SelectFuturesWelfare", "generateWelfareTypeList after trial=" + trial);
                if (trial != null) {
                    i12++;
                    trial.setChecked(z11);
                    arrayList.add(trial);
                } else {
                    FuturesWelfareCouponItemEntity coupon = futuresWelfareComposeItemEntity.toCoupon();
                    if (coupon == null || (!(z11 && C27025c.m66567e(entity.isSupportDiscount(), true)) && z11)) {
                        FuturesWelfareTrialItemEntity airdrop = futuresWelfareComposeItemEntity.toAirdrop();
                        if (airdrop != null) {
                            i13++;
                            arrayList.add(airdrop);
                        }
                    } else {
                        i14++;
                        arrayList.add(coupon);
                    }
                }
            }
            if (arrayList.size() > 1) {
                CollectionsKt.sortWith(arrayList, new C14421a());
            }
            Iterator it = arrayList.iterator();
            int i15 = 0;
            while (true) {
                i11 = -1;
                if (!it.hasNext()) {
                    i15 = -1;
                    break;
                }
                InterfaceC4633f interfaceC4633f = (InterfaceC4633f) it.next();
                if ((interfaceC4633f instanceof FuturesWelfareTrialItemEntity) && C27092t0.m66897b(((FuturesWelfareTrialItemEntity) interfaceC4633f).getPrizeType())) {
                    break;
                }
                i15++;
            }
            if (i15 >= 0) {
                arrayList.add(i15, new FuturesWelfareSubTitle(C27017c.f54310a.m66516f(R$string.kumex_airdrop_label_stub, String.valueOf(i13))));
            }
            Iterator it2 = arrayList.iterator();
            int i16 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i16 = -1;
                    break;
                }
                InterfaceC4633f interfaceC4633f2 = (InterfaceC4633f) it2.next();
                if ((interfaceC4633f2 instanceof FuturesWelfareTrialItemEntity) && !C27092t0.m66897b(((FuturesWelfareTrialItemEntity) interfaceC4633f2).getPrizeType())) {
                    break;
                }
                i16++;
            }
            if (i16 >= 0) {
                arrayList.add(i16, new FuturesWelfareSubTitle(C27017c.f54310a.m66516f(R$string.kumex_welfare_trial, new Object[0]) + " (" + i12 + ')'));
            }
            Iterator it3 = arrayList.iterator();
            int i17 = 0;
            while (it3.hasNext()) {
                if (((InterfaceC4633f) it3.next()) instanceof FuturesWelfareCouponItemEntity) {
                    i11 = i17;
                    break;
                }
                i17++;
            }
            if (i11 >= 0) {
                arrayList.add(i11, new FuturesWelfareSubTitle(C27017c.f54310a.m66516f(R$string.coupon_records, new Object[0]) + " (" + i14 + ')'));
            }
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final MutableLiveData<Boolean> m28794r() {
        return this.f24951b0;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final MutableLiveData<LeadWelfareTip> m28795s() {
        return this.f24953d0;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final MutableLiveData<Boolean> m28796t() {
        return this.f24948Y;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final MutableLiveData<Boolean> m28797u() {
        return this.f24952c0;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final LiveData<TradeProTrialState> m28798v() {
        return this.f24950a0;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final MutableLiveData<FuturesWelfareComposeEntity> m28799w() {
        return this.f24949Z;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final Pair<String, Boolean> m28800x(boolean z11) {
        PropertyEntity properties;
        FuturesWelfareComposeEntity value = this.f24949Z.getValue();
        Integer shortDisplayPrecision = null;
        if (value == null) {
            return new Pair<>(null, Boolean.FALSE);
        }
        FuturesWelfareCouponItemEntity futuresWelfareCouponItemEntityM28790n = m28790n(value);
        int iM28791o = m28791o(value);
        int iM28788j = m28788j(value);
        if (iM28791o <= 0) {
            if (iM28788j <= 0) {
                return futuresWelfareCouponItemEntityM28790n != null ? new Pair<>(C27017c.f54310a.m66516f(R$string.kumex_welfare_trade_coupons_discount, C42180b.m92640e(C27039d.m66656p(futuresWelfareCouponItemEntityM28790n.getAttributes().getDeductionRatio()), null, 2, false, false, false, 0, null, 125, null)), Boolean.FALSE) : new Pair<>(null, Boolean.FALSE);
            }
            C27017c c27017c = C27017c.f54310a;
            int i11 = R$string.kumex_welfare_trial_lot;
            if (futuresWelfareCouponItemEntityM28790n != null) {
                iM28788j++;
            }
            return new Pair<>(c27017c.m66516f(i11, Integer.valueOf(iM28788j)), Boolean.FALSE);
        }
        FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntityM28789k = m28789k(value);
        if (z11 && futuresWelfareTrialItemEntityM28789k != null) {
            CoinEntity coinEntityM99528E = InterfaceC44980d.m99528E(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(futuresWelfareTrialItemEntityM28789k.getCurrency()), false, 2, null);
            if (coinEntityM99528E != null && (properties = coinEntityM99528E.getProperties()) != null) {
                shortDisplayPrecision = properties.getShortDisplayPrecision();
            }
            return new Pair<>(C27017c.f54310a.m66516f(R$string.kumex_welfare_trade_trial_facevalue, C42180b.m92640e(C27039d.m66656p(futuresWelfareTrialItemEntityM28789k.getFaceValue()), null, C27039d.m66651k(shortDisplayPrecision, 4), false, false, false, 0, null, 125, null), C27041f.m66668h(C27041f.m66677q(futuresWelfareTrialItemEntityM28789k.getCurrency()))), Boolean.TRUE);
        }
        C27017c c27017c2 = C27017c.f54310a;
        int i12 = R$string.kumex_welfare_trial_lot;
        int i13 = iM28791o + iM28788j;
        if (futuresWelfareCouponItemEntityM28790n != null) {
            i13++;
        }
        return new Pair<>(c27017c2.m66516f(i12, Integer.valueOf(i13)), Boolean.TRUE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0065 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0066 A[RETURN] */
    /* JADX INFO: renamed from: y */
    public final boolean m28801y(@NotNull FuturesWelfareComposeEntity entity, @NotNull String currency) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        Intrinsics.checkNotNullParameter(currency, "currency");
        for (Object obj : entity.getItems()) {
            FuturesWelfareComposeItemEntity futuresWelfareComposeItemEntity = (FuturesWelfareComposeItemEntity) obj;
            FuturesWelfareTrialItemEntity trial = futuresWelfareComposeItemEntity.toTrial();
            boolean z11 = trial != null && Intrinsics.areEqual(trial.getStatus(), "ACTIVATE_FINISHED") && Intrinsics.areEqual(trial.getCurrency(), currency);
            FuturesWelfareTrialItemEntity airdrop = futuresWelfareComposeItemEntity.toAirdrop();
            boolean z12 = airdrop != null && Intrinsics.areEqual(airdrop.getStatus(), "ACTIVATE_FINISHED") && Intrinsics.areEqual(airdrop.getCurrency(), currency);
            if (z11 || z12) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m28802z() {
        return BrokerConfig.f19211a.m20201d().mo4515x() == MultiBizType.COPY_TRADING && KuMexDepend.f30378a.m35900b().mo20635p();
    }

    /* JADX INFO: renamed from: A */
    public final boolean m28780A(FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity, String str) {
        List<String> supportedContracts = futuresWelfareTrialItemEntity.getSupportedContracts();
        List<String> contractList = futuresWelfareTrialItemEntity.getContractList();
        if ((supportedContracts != null && supportedContracts.contains(this.f24946W)) || ((contractList != null && contractList.contains(this.f24946W)) || ((supportedContracts != null && CollectionsKt.contains(supportedContracts, str)) || (contractList != null && CollectionsKt.contains(contractList, str))))) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final int m28788j(FuturesWelfareComposeEntity futuresWelfareComposeEntity) {
        Iterator<T> it = futuresWelfareComposeEntity.getItems().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (((FuturesWelfareComposeItemEntity) it.next()).toAirdrop() != null) {
                i11++;
            }
        }
        return i11;
    }

    /* JADX INFO: renamed from: k */
    public final FuturesWelfareTrialItemEntity m28789k(FuturesWelfareComposeEntity futuresWelfareComposeEntity) {
        Object next;
        Iterator<T> it = futuresWelfareComposeEntity.getItems().iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                FuturesWelfareTrialItemEntity trial = ((FuturesWelfareComposeItemEntity) next).toTrial();
                if (trial != null && Intrinsics.areEqual(trial.getStatus(), "ACTIVATE_FINISHED")) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        FuturesWelfareComposeItemEntity futuresWelfareComposeItemEntity = (FuturesWelfareComposeItemEntity) next;
        if (futuresWelfareComposeItemEntity == null) {
            return null;
        }
        return futuresWelfareComposeItemEntity.toTrial();
    }

    /* JADX INFO: renamed from: n */
    public final FuturesWelfareCouponItemEntity m28790n(FuturesWelfareComposeEntity futuresWelfareComposeEntity) {
        Object next;
        Iterator<T> it = futuresWelfareComposeEntity.getItems().iterator();
        do {
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (((FuturesWelfareComposeItemEntity) next).toCoupon() == null);
        FuturesWelfareComposeItemEntity futuresWelfareComposeItemEntity = (FuturesWelfareComposeItemEntity) next;
        if (futuresWelfareComposeItemEntity == null) {
            return null;
        }
        return futuresWelfareComposeItemEntity.toCoupon();
    }

    /* JADX INFO: renamed from: o */
    public final int m28791o(FuturesWelfareComposeEntity futuresWelfareComposeEntity) {
        Iterator<T> it = futuresWelfareComposeEntity.getItems().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (((FuturesWelfareComposeItemEntity) it.next()).toTrial() != null) {
                i11++;
            }
        }
        return i11;
    }
}
