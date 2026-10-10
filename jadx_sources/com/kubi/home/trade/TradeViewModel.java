package com.kubi.home.trade;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.kucoin.home.cards.ExtensionKt;
import com.kubi.mvi.p102vm.BaseVM;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41016c;
import p830zf.InterfaceC46811m0;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: TradeViewModel.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000fJ\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000fJ\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0006\u0010\u0013\u001a\u00020\u0012J\u0018\u0010\u0014\u001a\u00020\u00122\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0002J\b\u0010\u0016\u001a\u00020\u0012H\u0002J\b\u0010\u0017\u001a\u00020\u0012H\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/home/trade/TradeViewModel;", "Lcom/kubi/mvi/vm/BaseVM;", "<init>", "()V", "disposableTradeChange", "Lio/reactivex/disposables/Disposable;", "repository", "Lcom/kubi/home/trade/TradeRepository;", "currencyChangedLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "tradeListLiveData", "", "Lcom/kubi/data/entity/TradeItemBean;", "getCurrencyChangedLiveData", "Landroidx/lifecycle/LiveData;", "getTradeListLiveData", "listenCurrencyChanged", "", "getTradeList", "sendData", "tradeList", "registerWsData", "onCleared", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeViewModel.kt\ncom/kubi/home/trade/TradeViewModel\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,120:1\n25#2,3:121\n*S KotlinDebug\n*F\n+ 1 TradeViewModel.kt\ncom/kubi/home/trade/TradeViewModel\n*L\n93#1:121,3\n*E\n"})
public final class TradeViewModel extends BaseVM {

    /* JADX INFO: renamed from: V */
    @Nullable
    public Disposable f26320V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final TradeRepository f26321W = new TradeRepository();

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MutableLiveData<Boolean> f26322X = new MutableLiveData<>();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final MutableLiveData<List<TradeItemBean>> f26323Y = new MutableLiveData<>();

    /* JADX INFO: renamed from: q */
    public static final Unit m30427q(TradeViewModel tradeViewModel, Boolean bool) {
        tradeViewModel.f26322X.postValue(bool);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    private final void m30431u() {
        ExtensionKt.m32184j(this, new TradeViewModel$registerWsData$1(this, null));
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final LiveData<Boolean> m30432n() {
        return this.f26322X;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final LiveData<List<TradeItemBean>> m30433o() {
        return this.f26323Y;
    }

    /* JADX INFO: renamed from: v */
    public final void m30435v(List<? extends TradeItemBean> list) {
        List<TradeItemBean> mutableList;
        if (list == null || (mutableList = CollectionsKt.toMutableList((Collection) list)) == null) {
            return;
        }
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46811m0.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            ((InterfaceC46811m0) objM56186h).m103143b();
        } else {
            mutableList.add(new TradeItemBean());
        }
        this.f26323Y.postValue(mutableList);
    }

    public TradeViewModel() {
        m30434p();
        m30431u();
    }

    /* JADX INFO: renamed from: r */
    public static final void m30428r(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m30429s(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final void m30430t(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // com.kubi.mvi.p102vm.BaseVM, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        Disposable disposable = this.f26320V;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m30434p() {
        Observable<Boolean> observableObserveOn = C41016c.m89963a().observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.home.trade.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeViewModel.m30427q(this.f26331b, (Boolean) obj);
            }
        };
        Consumer<? super Boolean> consumer = new Consumer() { // from class: com.kubi.home.trade.h
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeViewModel.m30428r(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.home.trade.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeViewModel.m30429s((Throwable) obj);
            }
        };
        this.f26320V = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.home.trade.j
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeViewModel.m30430t(function2, obj);
            }
        });
    }
}
