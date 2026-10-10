package com.kubi.assets.search.transfer;

import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.kubi.assets.R$string;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.utils.C27017c;
import gf.C37890n;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SearchCoinViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0006H\u0002J\"\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00100\u00182\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cR!\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R'\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00100\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/assets/search/transfer/SearchCoinViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "list", "", "Lcom/kubi/data/entity/CoinInfoEntity;", "getList", "()Ljava/util/List;", "list$delegate", "Lkotlin/Lazy;", "fromType", "", "toType", "displayList", "Landroidx/lifecycle/MutableLiveData;", "", "getDisplayList", "()Landroidx/lifecycle/MutableLiveData;", "displayList$delegate", "filterCondition", "", "type", "coinInfo", "Landroidx/lifecycle/LiveData;", "searchFilter", "", "key", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSearchCoinViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchCoinViewModel.kt\ncom/kubi/assets/search/transfer/SearchCoinViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,90:1\n774#2:91\n865#2,2:92\n*S KotlinDebug\n*F\n+ 1 SearchCoinViewModel.kt\ncom/kubi/assets/search/transfer/SearchCoinViewModel\n*L\n45#1:91\n45#1:92,2\n*E\n"})
public final class SearchCoinViewModel extends ViewModel {

    /* JADX INFO: renamed from: W */
    public int f18657W;

    /* JADX INFO: renamed from: X */
    public int f18658X;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f18656V = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.search.transfer.n
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchCoinViewModel.m19130x();
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f18659Y = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.search.transfer.o
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchCoinViewModel.m19128r(this.f18681b);
        }
    });

    /* JADX INFO: renamed from: t */
    public final boolean m19131t(int i11, CoinInfoEntity coinInfoEntity) {
        return (i11 == 1 && coinInfoEntity.isDisplayDeposit() && coinInfoEntity.isDigital()) || (i11 == 2 && coinInfoEntity.isDisplayWithdraw() && coinInfoEntity.isDigital()) || ((i11 == 7 && (coinInfoEntity.isMarginEnabled() || coinInfoEntity.isIsolatedEnabled())) || ((i11 == 3 && coinInfoEntity.isDebitEnabled() && (coinInfoEntity.isMarginEnabled() || coinInfoEntity.isIsolatedEnabled())) || ((i11 == 8 && coinInfoEntity.isDebitEnabled()) || ((i11 == 6 && coinInfoEntity.getContractCoin() != null) || i11 == 4 || (i11 == 0 && coinInfoEntity.isDigital())))));
    }

    /* JADX INFO: renamed from: r */
    public static final MutableLiveData m19128r(final SearchCoinViewModel searchCoinViewModel) {
        final MutableLiveData mutableLiveData = new MutableLiveData();
        C37890n.f85269a.mo85590a(new Consumer() { // from class: com.kubi.assets.search.transfer.p
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SearchCoinViewModel.m19129s(mutableLiveData, searchCoinViewModel, (List) obj);
            }
        });
        return mutableLiveData;
    }

    /* JADX INFO: renamed from: s */
    public static final void m19129s(MutableLiveData mutableLiveData, SearchCoinViewModel searchCoinViewModel, List coinInfoList) {
        Intrinsics.checkNotNullParameter(coinInfoList, "coinInfoList");
        if (coinInfoList.isEmpty()) {
            mutableLiveData.setValue(CollectionsKt.emptyList());
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : coinInfoList) {
            CoinInfoEntity coinInfoEntity = (CoinInfoEntity) obj;
            if (searchCoinViewModel.m19131t(searchCoinViewModel.f18657W, coinInfoEntity) && searchCoinViewModel.m19131t(searchCoinViewModel.f18658X, coinInfoEntity)) {
                arrayList.add(obj);
            }
        }
        searchCoinViewModel.m19134w().addAll(arrayList);
        CoinInfoEntity coinInfoEntity2 = new CoinInfoEntity();
        coinInfoEntity2.setCurrency(C27017c.f54310a.m66516f(R$string.all, new Object[0]));
        mutableLiveData.setValue(CollectionsKt.plus((Collection) CollectionsKt.listOf(coinInfoEntity2), (Iterable) searchCoinViewModel.m19134w()));
    }

    /* JADX INFO: renamed from: x */
    public static final List m19130x() {
        return new ArrayList();
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final LiveData<List<CoinInfoEntity>> m19132u(int i11, int i12) {
        this.f18657W = i11;
        this.f18658X = i12;
        return m19133v();
    }

    /* JADX INFO: renamed from: v */
    public final MutableLiveData<List<CoinInfoEntity>> m19133v() {
        return (MutableLiveData) this.f18659Y.getValue();
    }

    /* JADX INFO: renamed from: w */
    public final List<CoinInfoEntity> m19134w() {
        return (List) this.f18656V.getValue();
    }

    /* JADX INFO: renamed from: y */
    public final void m19135y(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (TextUtils.isEmpty(key)) {
            m19133v().setValue(m19134w());
        } else {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new SearchCoinViewModel$searchFilter$1(this, key, null), 3, null);
        }
    }
}
