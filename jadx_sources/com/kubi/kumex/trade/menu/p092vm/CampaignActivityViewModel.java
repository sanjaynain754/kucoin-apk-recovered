package com.kubi.kumex.trade.menu.p092vm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.kubi.kumex.data.platform.model.Article;
import java.util.List;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p236em.C37213a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CampaignActivityViewModel.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\tR\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\tR\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\t¨\u0006!"}, m90084d2 = {"Lcom/kubi/kumex/trade/menu/vm/CampaignActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "_isLoading", "Landroidx/lifecycle/MutableLiveData;", "", "isLoading", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "_isLoadingMore", "isLoadingMore", "_isEmpty", "isEmpty", "_isNoMoreData", "isNoMoreData", "_isError", "isError", "_isLoadMoreError", "isLoadMoreError", "_fetchedCampaignActivities", "", "Lcom/kubi/kumex/data/platform/model/Article;", "fetchedCampaignActivities", "getFetchedCampaignActivities", "fetchCampaignActivities", "", "page", "", "lang", "", "loadingComplete", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CampaignActivityViewModel extends ViewModel {

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public static final Companion f30632j0 = new Companion(null);

    /* JADX INFO: renamed from: V */
    @NotNull
    public final MutableLiveData<Boolean> f30633V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final LiveData<Boolean> f30634W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MutableLiveData<Boolean> f30635X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final LiveData<Boolean> f30636Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final MutableLiveData<Boolean> f30637Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final LiveData<Boolean> f30638a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final MutableLiveData<Boolean> f30639b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final LiveData<Boolean> f30640c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final MutableLiveData<Boolean> f30641d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final LiveData<Boolean> f30642e0;

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final MutableLiveData<Boolean> f30643f0;

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public final LiveData<Boolean> f30644g0;

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public final MutableLiveData<List<Article>> f30645h0;

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public final LiveData<List<Article>> f30646i0;

    /* JADX INFO: compiled from: CampaignActivityViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kumex/trade/menu/vm/CampaignActivityViewModel$Companion;", "", "<init>", "()V", "PAGE_SIZE", "", "CATEGORIES", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m36399u(int i11) {
        if (i11 == 1) {
            this.f30633V.postValue(Boolean.FALSE);
        } else {
            this.f30635X.postValue(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m36391i(int i11, @NotNull String lang) {
        Intrinsics.checkNotNullParameter(lang, "lang");
        if (i11 == 1) {
            this.f30633V.setValue(Boolean.TRUE);
        }
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b().plus(C37213a.m83254d()), null, new CampaignActivityViewModel$fetchCampaignActivities$1(i11, lang, this, null), 2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final LiveData<List<Article>> m36392n() {
        return this.f30646i0;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final LiveData<Boolean> m36393o() {
        return this.f30638a0;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final LiveData<Boolean> m36394p() {
        return this.f30642e0;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final LiveData<Boolean> m36395q() {
        return this.f30644g0;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final LiveData<Boolean> m36396r() {
        return this.f30634W;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final LiveData<Boolean> m36397s() {
        return this.f30636Y;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final LiveData<Boolean> m36398t() {
        return this.f30640c0;
    }

    public CampaignActivityViewModel() {
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.f30633V = mutableLiveData;
        this.f30634W = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        this.f30635X = mutableLiveData2;
        this.f30636Y = mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3 = new MutableLiveData<>();
        this.f30637Z = mutableLiveData3;
        this.f30638a0 = mutableLiveData3;
        MutableLiveData<Boolean> mutableLiveData4 = new MutableLiveData<>();
        this.f30639b0 = mutableLiveData4;
        this.f30640c0 = mutableLiveData4;
        MutableLiveData<Boolean> mutableLiveData5 = new MutableLiveData<>();
        this.f30641d0 = mutableLiveData5;
        this.f30642e0 = mutableLiveData5;
        MutableLiveData<Boolean> mutableLiveData6 = new MutableLiveData<>();
        this.f30643f0 = mutableLiveData6;
        this.f30644g0 = mutableLiveData6;
        MutableLiveData<List<Article>> mutableLiveData7 = new MutableLiveData<>();
        this.f30645h0 = mutableLiveData7;
        this.f30646i0 = mutableLiveData7;
    }
}
