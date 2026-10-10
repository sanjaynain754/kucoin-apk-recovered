package com.kubi.futures.trade.welfare.distribution;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.data.constance.ValidationBizEnum;
import com.kubi.futures.data.trial.SubmitTrialData;
import com.kubi.kumex.data.market.model.DistributionPageEntity;
import com.kubi.kumex.data.market.model.DistributionQuoteEntity;
import com.kubi.kumex.data.market.model.IDistributionData;
import com.kubi.kumex.helper.TradePwdHelperKt;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.mvi.p102vm.BaseVM;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.utils.C27100x0;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Observable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41696j;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p569qq.C43852m;
import p725wh.InterfaceC45831a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: DistributionChooseSymbolDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u0010\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$H\u0002J2\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020'2\u0006\u0010 \u001a\u00020!2\u0006\u0010(\u001a\u00020\u00112\u0006\u0010)\u001a\u00020!2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+R\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R#\u0010\u0014\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u0082D¢\u0006\u0002\n\u0000¨\u0006,"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/distribution/DistributionChooseSymbolViewModel;", "Lcom/kubi/mvi/vm/BaseVM;", "<init>", "()V", "_sourceDataList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/kubi/kumex/data/market/model/IDistributionData;", "sourceDataList", "Landroidx/lifecycle/LiveData;", "getSourceDataList", "()Landroidx/lifecycle/LiveData;", "_initError", "", "initError", "getInitError", "loadingDialog", "", "getLoadingDialog", "()Landroidx/lifecycle/MutableLiveData;", "api", "Lcom/kubi/futures/data/welfare/IWelfareApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/futures/data/welfare/IWelfareApi;", "api$delegate", "Lkotlin/Lazy;", "pageIndex", "", "pageSize", "fetchSourceData", "", "code", "", "handleKlineFlatten", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/kumex/data/market/model/DistributionPageEntity;", "requestOrder", "baseFragment", "Lcom/kubi/sdk/BaseFragment;", "isBuy", "symbol", "callBack", "Lio/reactivex/functions/Action;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDistributionChooseSymbolDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DistributionChooseSymbolDialog.kt\ncom/kubi/futures/trade/welfare/distribution/DistributionChooseSymbolViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,282:1\n1869#2:283\n1869#2,2:284\n1870#2:286\n*S KotlinDebug\n*F\n+ 1 DistributionChooseSymbolDialog.kt\ncom/kubi/futures/trade/welfare/distribution/DistributionChooseSymbolViewModel\n*L\n221#1:283\n223#1:284,2\n221#1:286\n*E\n"})
public final class DistributionChooseSymbolViewModel extends BaseVM {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final MutableLiveData<List<IDistributionData>> f24692V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final LiveData<List<IDistributionData>> f24693W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MutableLiveData<Throwable> f24694X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final LiveData<Throwable> f24695Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final MutableLiveData<Boolean> f24696Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f24697a0;

    /* JADX INFO: renamed from: b0 */
    public int f24698b0;

    /* JADX INFO: renamed from: c0 */
    public final int f24699c0;

    /* JADX INFO: renamed from: G */
    public static final Unit m28511G(List list, List list2) {
        list.add(list2.get(1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I */
    public static final Observable m28512I(boolean z11, String str, String str2, String str3) {
        Observable<R> observableCompose = RepositoryServiceLocator.f19236a.m20292k().mo100561i(new SubmitTrialData("ANDROID", str, str2, z11 ? "buy" : "sell", str3)).compose(C24217a1.m58390n());
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        return observableCompose;
    }

    /* JADX INFO: renamed from: J */
    public static final void m28513J(DistributionChooseSymbolViewModel distributionChooseSymbolViewModel, Action action, Object obj) throws Exception {
        distributionChooseSymbolViewModel.f24696Z.setValue(Boolean.FALSE);
        if (action != null) {
            action.run();
        }
    }

    /* JADX INFO: renamed from: K */
    public static final void m28514K(DistributionChooseSymbolViewModel distributionChooseSymbolViewModel, Throwable th2) {
        distributionChooseSymbolViewModel.f24696Z.setValue(Boolean.FALSE);
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
    }

    /* JADX INFO: renamed from: A */
    public final void m28528A(@NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new DistributionChooseSymbolViewModel$fetchSourceData$1(this, code, null), 3, null);
    }

    /* JADX INFO: renamed from: B */
    public final InterfaceC45831a m28529B() {
        return (InterfaceC45831a) this.f24697a0.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final LiveData<Throwable> m28530C() {
        return this.f24695Y;
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public final MutableLiveData<Boolean> m28531D() {
        return this.f24696Z;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final LiveData<List<IDistributionData>> m28532E() {
        return this.f24693W;
    }

    /* JADX INFO: renamed from: H */
    public final void m28534H(@NotNull BaseFragment baseFragment, @NotNull final String code, final boolean z11, @NotNull final String symbol, @Nullable final Action action) {
        Intrinsics.checkNotNullParameter(baseFragment, "baseFragment");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        C43852m.m96589a(C17060n0.m36552b(), "RealTimeRewardTrialOrder", z11 ? "1" : "2", new JSONObject().put("symbol", symbol).put("orderSide", z11 ? "long" : "short"));
        if (TradePwdHelperKt.m33931k(baseFragment, true)) {
            this.f24696Z.setValue(Boolean.TRUE);
            TradePwdHelperKt.m33935o(baseFragment, ValidationBizEnum.CONTRACT_TRADE, new Function1() { // from class: com.kubi.futures.trade.welfare.distribution.d0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DistributionChooseSymbolViewModel.m28512I(z11, code, symbol, (String) obj);
                }
            }, new Consumer() { // from class: com.kubi.futures.trade.welfare.distribution.e0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    DistributionChooseSymbolViewModel.m28513J(this.f24722b, action, obj);
                }
            }, new Consumer() { // from class: com.kubi.futures.trade.welfare.distribution.f0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    DistributionChooseSymbolViewModel.m28514K(this.f24726b, (Throwable) obj);
                }
            }, true, null, 64, null);
        }
    }

    public DistributionChooseSymbolViewModel() {
        MutableLiveData<List<IDistributionData>> mutableLiveData = new MutableLiveData<>();
        this.f24692V = mutableLiveData;
        this.f24693W = mutableLiveData;
        MutableLiveData<Throwable> mutableLiveData2 = new MutableLiveData<>();
        this.f24694X = mutableLiveData2;
        this.f24695Y = mutableLiveData2;
        this.f24696Z = new MutableLiveData<>();
        this.f24697a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.welfare.distribution.b0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DistributionChooseSymbolViewModel.m28527z();
            }
        });
        this.f24698b0 = 1;
        this.f24699c0 = 10;
    }

    /* JADX INFO: renamed from: z */
    public static final InterfaceC45831a m28527z() {
        return (InterfaceC45831a) C42597a.m93387c().create(InterfaceC45831a.class);
    }

    /* JADX INFO: renamed from: F */
    public final void m28533F(DistributionPageEntity distributionPageEntity) {
        List<DistributionQuoteEntity> items = distributionPageEntity.getItems();
        if (items != null) {
            for (DistributionQuoteEntity distributionQuoteEntity : items) {
                final ArrayList arrayList = new ArrayList();
                List<List<Double>> klineData = distributionQuoteEntity.getKlineData();
                if (klineData != null) {
                    Iterator<T> it = klineData.iterator();
                    while (it.hasNext()) {
                        final List list = (List) it.next();
                        C27100x0.m66923d(new Function0() { // from class: com.kubi.futures.trade.welfare.distribution.c0
                            @Override // p852kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return DistributionChooseSymbolViewModel.m28511G(arrayList, list);
                            }
                        });
                    }
                }
                distributionQuoteEntity.setKlineLocal(CollectionsKt.reversed(arrayList));
            }
        }
    }
}
