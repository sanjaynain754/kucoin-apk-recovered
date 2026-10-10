package com.kubi.transfer.search.coin;

import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.kubi.transfer.TransferApi;
import com.kubi.transfer.entity.AccountCoin;
import com.kubi.transfer.entity.AccountInfo;
import com.kubi.transfer.entity.PayAccountInfo;
import com.kubi.transfer.entity.QueryBalanceParam;
import com.kubi.transfer.entity.ReqMultiAccountCoinsParam;
import g60.C37827c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41696j;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import p402kf.C41016c;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SearchCoinViewModel.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00140\u001e2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00142\u0006\u0010\u0015\u001a\u00020\u0012J\u0016\u0010\u001c\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u00140\u001eJ\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0012J\u0006\u0010\"\u001a\u00020 R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR#\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R)\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00140\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u0018\u0010\u0019R)\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00140\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001c\u0010\u0019¨\u0006#"}, m90084d2 = {"Lcom/kubi/transfer/search/coin/SearchCoinViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "api", "Lcom/kubi/transfer/TransferApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/transfer/TransferApi;", "api$delegate", "Lkotlin/Lazy;", "list", "", "Lcom/kubi/transfer/entity/AccountCoin;", "getList", "()Ljava/util/List;", "list$delegate", "fromType", "", "multiAccountList", "", "toType", "displayList", "Landroidx/lifecycle/MutableLiveData;", "getDisplayList", "()Landroidx/lifecycle/MutableLiveData;", "displayList$delegate", "historyList", "getHistoryList", "historyList$delegate", "Landroidx/lifecycle/LiveData;", "searchFilter", "", "key", "clearHistory", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSearchCoinViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchCoinViewModel.kt\ncom/kubi/transfer/search/coin/SearchCoinViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,147:1\n1563#2:148\n1634#2,3:149\n*S KotlinDebug\n*F\n+ 1 SearchCoinViewModel.kt\ncom/kubi/transfer/search/coin/SearchCoinViewModel\n*L\n51#1:148\n51#1:149,3\n*E\n"})
public final class SearchCoinViewModel extends ViewModel {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f52880V = LazyKt.lazy(new Function0() { // from class: com.kubi.transfer.search.coin.s
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchCoinViewModel.m64702v();
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f52881W = LazyKt.lazy(new Function0() { // from class: com.kubi.transfer.search.coin.t
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchCoinViewModel.m64691F();
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public String f52882X = "";

    /* JADX INFO: renamed from: Y */
    @NotNull
    public List<String> f52883Y = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: Z */
    @NotNull
    public String f52884Z = "";

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f52885a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.transfer.search.coin.u
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchCoinViewModel.m64703x(this.f52905b);
        }
    });

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f52886b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.transfer.search.coin.v
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchCoinViewModel.m64690E(this.f52906b);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public final MutableLiveData<List<AccountCoin>> m64688A() {
        return (MutableLiveData) this.f52885a0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public final List<AccountCoin> m64689D() {
        return (List) this.f52881W.getValue();
    }

    /* JADX INFO: renamed from: E */
    public static final MutableLiveData m64690E(SearchCoinViewModel searchCoinViewModel) {
        MutableLiveData mutableLiveData = new MutableLiveData();
        C41696j.m91104d(ViewModelKt.getViewModelScope(searchCoinViewModel), null, null, new SearchCoinViewModel$historyList$2$1$1(mutableLiveData, searchCoinViewModel, null), 3, null);
        return mutableLiveData;
    }

    /* JADX INFO: renamed from: F */
    public static final List m64691F() {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public final TransferApi m64704y() {
        return (TransferApi) this.f52880V.getValue();
    }

    /* JADX INFO: renamed from: C */
    public final MutableLiveData<List<String>> m64706C() {
        return (MutableLiveData) this.f52886b0.getValue();
    }

    /* JADX INFO: renamed from: G */
    public final void m64707G(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (TextUtils.isEmpty(key)) {
            m64688A().setValue(m64689D());
        } else {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new SearchCoinViewModel$searchFilter$1(this, key, null), 3, null);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final LiveData<List<AccountCoin>> m64709z(@NotNull String fromType, @NotNull List<String> multiAccountList, @NotNull String toType) {
        Intrinsics.checkNotNullParameter(fromType, "fromType");
        Intrinsics.checkNotNullParameter(multiAccountList, "multiAccountList");
        Intrinsics.checkNotNullParameter(toType, "toType");
        this.f52882X = fromType;
        this.f52883Y = multiAccountList;
        this.f52884Z = toType;
        return m64688A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final TransferApi m64702v() {
        return (TransferApi) C42597a.m93387c().create(TransferApi.class);
    }

    /* JADX INFO: renamed from: x */
    public static final MutableLiveData m64703x(SearchCoinViewModel searchCoinViewModel) {
        if (C37827c.m85384c()) {
            MutableLiveData mutableLiveData = new MutableLiveData();
            List<String> list = searchCoinViewModel.f52883Y;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new PayAccountInfo((String) it.next(), "DEFAULT"));
            }
            String str = searchCoinViewModel.f52884Z;
            String strM89965c = C41016c.m89965c();
            Intrinsics.checkNotNullExpressionValue(strM89965c, "getCurrentCurrency(...)");
            C41696j.m91104d(ViewModelKt.getViewModelScope(searchCoinViewModel), null, null, new SearchCoinViewModel$displayList$2$1$1(searchCoinViewModel, new ReqMultiAccountCoinsParam(arrayList, str, "DEFAULT", strM89965c), mutableLiveData, null), 3, null);
            return mutableLiveData;
        }
        MutableLiveData mutableLiveData2 = new MutableLiveData();
        String strM89965c2 = C41016c.m89965c();
        Intrinsics.checkNotNullExpressionValue(strM89965c2, "getCurrentCurrency(...)");
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new AccountInfo(searchCoinViewModel.f52882X));
        arrayList2.add(new AccountInfo(searchCoinViewModel.f52884Z));
        C41696j.m91104d(ViewModelKt.getViewModelScope(searchCoinViewModel), null, null, new SearchCoinViewModel$displayList$2$2$1(searchCoinViewModel, new QueryBalanceParam(strM89965c2, arrayList2), mutableLiveData2, null), 3, null);
        return mutableLiveData2;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final LiveData<List<String>> m64705B() {
        return m64706C();
    }

    /* JADX INFO: renamed from: w */
    public final void m64708w() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new SearchCoinViewModel$clearHistory$1(this, null), 3, null);
    }
}
