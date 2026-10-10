package com.kubi.payment.channel.fiat;

import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.payment.channel.data.entities.FiatInfoEntity;
import com.kubi.payment.channel.data.source.IChannelRepository;
import java.util.List;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p477nt.C42874g;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: SearchFiatViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 ,2\u00020\u0001:\u0001,B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ.\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0082@¢\u0006\u0002\u0010\u001eJ\u001c\u0010\u001f\u001a\u00020\u001b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0!H\u0082@¢\u0006\u0002\u0010\"J,\u0010#\u001a\u00020$2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0!2\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0082@¢\u0006\u0002\u0010%J\u000e\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u001bJ\u0018\u0010(\u001a\u00020\u00192\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0007J\u0016\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010+\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b0\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00150\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00150\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\r¨\u0006-"}, m90084d2 = {"Lcom/kubi/payment/channel/fiat/SearchFiatViewModel;", "Lcom/kubi/payment/base/BaseViewModel;", "repository", "Lcom/kubi/payment/channel/data/source/IChannelRepository;", "<init>", "(Lcom/kubi/payment/channel/data/source/IChannelRepository;)V", "_fiatList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/kubi/payment/channel/data/entities/FiatInfoEntity$FiatInfo;", "fiatList", "Landroidx/lifecycle/LiveData;", "getFiatList", "()Landroidx/lifecycle/LiveData;", "originFiatList", "isSearch", "", "()Z", "setSearch", "(Z)V", "_historyList", "", "historyList", "getHistoryList", "loadFiatList", "", "type", "", "historyFiatJson", "data", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFiatJson", "cacheKey", "Lcom/kubi/utils/storage/StorageId;", "(Lcom/kubi/utils/storage/StorageId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "putCacheData", "Lcom/kubi/utils/storage/KVStore;", "(Lcom/kubi/utils/storage/StorageId;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchFilter", "key", "setFiatList", "addToHistory", "item", "clearHistory", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SearchFiatViewModel extends C42874g {

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public static final Companion f38268c0 = new Companion(null);

    /* JADX INFO: renamed from: X */
    @NotNull
    public final IChannelRepository f38269X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final MutableLiveData<List<FiatInfoEntity.FiatInfo>> f38270Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public List<FiatInfoEntity.FiatInfo> f38271Z;

    /* JADX INFO: renamed from: a0 */
    public boolean f38272a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final MutableLiveData<List<FiatInfoEntity.FiatInfo>> f38273b0;

    /* JADX INFO: compiled from: SearchFiatViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/payment/channel/fiat/SearchFiatViewModel$Companion;", "", "<init>", "()V", "PARAM_RECHARGE", "", "PARAM_WITHDRAW", "HISTORY_MAX_LIMIT", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public SearchFiatViewModel(@NotNull IChannelRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f38269X = repository;
        this.f38270Y = new MutableLiveData<>();
        this.f38271Z = CollectionsKt.emptyList();
        this.f38273b0 = new MutableLiveData<>();
    }

    /* JADX INFO: renamed from: A */
    public final void m45826A(@NotNull FiatInfoEntity.FiatInfo item, @NotNull String type) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(type, "type");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new SearchFiatViewModel$addToHistory$1(this, item, type, null), 3, null);
    }

    /* JADX INFO: renamed from: B */
    public final void m45827B(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new SearchFiatViewModel$clearHistory$1(type, this, null), 3, null);
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public final LiveData<List<FiatInfoEntity.FiatInfo>> m45829D() {
        return this.f38270Y;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final LiveData<List<FiatInfoEntity.FiatInfo>> m45830E() {
        return this.f38273b0;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final boolean getF38272a0() {
        return this.f38272a0;
    }

    /* JADX INFO: renamed from: H */
    public final void m45833H(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new SearchFiatViewModel$loadFiatList$1(type, this, null), 3, null);
    }

    /* JADX INFO: renamed from: J */
    public final void m45835J(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (TextUtils.isEmpty(key)) {
            this.f38272a0 = false;
            this.f38270Y.setValue(this.f38271Z);
        } else {
            this.f38272a0 = true;
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new SearchFiatViewModel$searchFilter$1(this, key, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: C */
    public final Object m45828C(StorageId<String> storageId, Continuation<? super String> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new SearchFiatViewModel$getFiatJson$2(storageId, null), continuation);
    }

    /* JADX INFO: renamed from: F */
    public final Object m45831F(String str, List<FiatInfoEntity.FiatInfo> list, Continuation<? super List<FiatInfoEntity.FiatInfo>> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new SearchFiatViewModel$getHistoryList$2(str, list, null), continuation);
    }

    /* JADX INFO: renamed from: I */
    public final Object m45834I(StorageId<String> storageId, List<FiatInfoEntity.FiatInfo> list, Continuation<? super C46392a> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new SearchFiatViewModel$putCacheData$2(storageId, list, null), continuation);
    }
}
