package com.kubi.transfer.search.symbol;

import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.kubi.transfer.TransferApi;
import com.kubi.transfer.entity.SearchSymbolEntity;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.C41696j;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SearchSymbolViewModel.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00130\u001bJ\u0016\u0010\u0019\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u00130\u001bJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0018J\u0006\u0010\u001f\u001a\u00020\u001dR#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR#\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u000e\u0010\u000fR)\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00130\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u0014\u0010\u0015R)\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00130\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u0019\u0010\u0015¨\u0006 "}, m90084d2 = {"Lcom/kubi/transfer/search/symbol/SearchSymbolViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "api", "Lcom/kubi/transfer/TransferApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/transfer/TransferApi;", "api$delegate", "Lkotlin/Lazy;", "list", "", "Lcom/kubi/transfer/entity/SearchSymbolEntity;", "getList", "()Ljava/util/List;", "list$delegate", "displayList", "Landroidx/lifecycle/MutableLiveData;", "", "getDisplayList", "()Landroidx/lifecycle/MutableLiveData;", "displayList$delegate", "historyList", "", "getHistoryList", "historyList$delegate", "Landroidx/lifecycle/LiveData;", "searchFilter", "", "key", "clearHistory", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SearchSymbolViewModel extends ViewModel {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f52917V = LazyKt.lazy(new Function0() { // from class: com.kubi.transfer.search.symbol.p
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchSymbolViewModel.m64771v();
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f52918W = LazyKt.lazy(new Function0() { // from class: com.kubi.transfer.search.symbol.q
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchSymbolViewModel.m64762F();
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f52919X = LazyKt.lazy(new Function0() { // from class: com.kubi.transfer.search.symbol.r
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchSymbolViewModel.m64772x(this.f52938b);
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f52920Y = LazyKt.lazy(new Function0() { // from class: com.kubi.transfer.search.symbol.s
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchSymbolViewModel.m64761E(this.f52939b);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public final MutableLiveData<List<SearchSymbolEntity>> m64758A() {
        return (MutableLiveData) this.f52919X.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public final MutableLiveData<List<String>> m64759C() {
        return (MutableLiveData) this.f52920Y.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public final List<SearchSymbolEntity> m64760D() {
        return (List) this.f52918W.getValue();
    }

    /* JADX INFO: renamed from: E */
    public static final MutableLiveData m64761E(SearchSymbolViewModel searchSymbolViewModel) {
        MutableLiveData mutableLiveData = new MutableLiveData();
        C41696j.m91104d(ViewModelKt.getViewModelScope(searchSymbolViewModel), null, null, new SearchSymbolViewModel$historyList$2$1$1(mutableLiveData, null), 3, null);
        return mutableLiveData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final List m64762F() {
        return new ArrayList();
    }

    /* JADX INFO: renamed from: x */
    public static final MutableLiveData m64772x(SearchSymbolViewModel searchSymbolViewModel) {
        MutableLiveData mutableLiveData = new MutableLiveData();
        C41696j.m91104d(ViewModelKt.getViewModelScope(searchSymbolViewModel), null, null, new SearchSymbolViewModel$displayList$2$1$1(searchSymbolViewModel, mutableLiveData, null), 3, null);
        return mutableLiveData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public final TransferApi m64773y() {
        return (TransferApi) this.f52917V.getValue();
    }

    /* JADX INFO: renamed from: G */
    public final void m64775G(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (TextUtils.isEmpty(key)) {
            m64758A().setValue(m64760D());
        } else {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new SearchSymbolViewModel$searchFilter$1(this, key, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final TransferApi m64771v() {
        return (TransferApi) C42597a.m93387c().create(TransferApi.class);
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final LiveData<List<String>> m64774B() {
        return m64759C();
    }

    /* JADX INFO: renamed from: w */
    public final void m64776w() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new SearchSymbolViewModel$clearHistory$1(this, null), 3, null);
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final LiveData<List<SearchSymbolEntity>> m64777z() {
        return m64758A();
    }
}
