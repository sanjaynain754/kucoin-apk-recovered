package com.kubi.kumex.trade.menu.p092vm;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.kubi.kumex.data.platform.model.Article;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AnnouncementViewModel.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0015H\u0002R+\u0010\u0004\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR+\u0010\f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR+\u0010\u000e\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/kumex/trade/menu/vm/AnnouncementViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "allTypeLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "", "", "Lcom/kubi/kumex/data/platform/model/Article;", "getAllTypeLiveData", "()Landroidx/lifecycle/MutableLiveData;", "latestTypeLiveData", "getLatestTypeLiveData", "newTypeTypeLiveData", "getNewTypeTypeLiveData", "fetchCampaignActivities", "", "lang", "", "announcementType", "Lcom/kubi/kumex/trade/menu/vm/AnnouncementType;", "getCategoriesByType", "type", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAnnouncementViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnouncementViewModel.kt\ncom/kubi/kumex/trade/menu/vm/AnnouncementViewModel\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,89:1\n47#2,4:90\n*S KotlinDebug\n*F\n+ 1 AnnouncementViewModel.kt\ncom/kubi/kumex/trade/menu/vm/AnnouncementViewModel\n*L\n53#1:90,4\n*E\n"})
public final class AnnouncementViewModel extends ViewModel {

    /* JADX INFO: renamed from: Y */
    @NotNull
    public static final Companion f30627Y = new Companion(null);

    /* JADX INFO: renamed from: V */
    @NotNull
    public final MutableLiveData<Pair<Boolean, List<Article>>> f30628V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final MutableLiveData<Pair<Boolean, List<Article>>> f30629W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MutableLiveData<Pair<Boolean, List<Article>>> f30630X;

    /* JADX INFO: compiled from: AnnouncementViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kumex/trade/menu/vm/AnnouncementViewModel$Companion;", "", "<init>", "()V", "ALL_CATEGORIES", "", "LATEST_CATEGORIES", "NEW_PAIR_CATEGORIES", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.trade.menu.vm.AnnouncementViewModel$b */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 AnnouncementViewModel.kt\ncom/kubi/kumex/trade/menu/vm/AnnouncementViewModel\n*L\n1#1,49:1\n54#2,6:50\n*E\n"})
    public static final class C16941b extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ MutableLiveData f30631b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16941b(CoroutineExceptionHandler.Companion companion, MutableLiveData mutableLiveData) {
            super(companion);
            this.f30631b = mutableLiveData;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            this.f30631b.postValue(new Pair(Boolean.FALSE, null));
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.trade.menu.vm.AnnouncementViewModel$a */
    /* JADX INFO: compiled from: AnnouncementViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C16940a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnnouncementType.values().length];
            try {
                iArr[AnnouncementType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnnouncementType.LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnnouncementType.NEW_TRADING_PAIR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m36380d(@NotNull String lang, @NotNull AnnouncementType announcementType) {
        MutableLiveData<Pair<Boolean, List<Article>>> mutableLiveData;
        Intrinsics.checkNotNullParameter(lang, "lang");
        Intrinsics.checkNotNullParameter(announcementType, "announcementType");
        int i11 = C16940a.$EnumSwitchMapping$0[announcementType.ordinal()];
        if (i11 == 1) {
            mutableLiveData = this.f30628V;
        } else if (i11 == 2) {
            mutableLiveData = this.f30629W;
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            mutableLiveData = this.f30630X;
        }
        MutableLiveData<Pair<Boolean, List<Article>>> mutableLiveData2 = mutableLiveData;
        mutableLiveData2.postValue(new Pair<>(Boolean.TRUE, CollectionsKt.emptyList()));
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b().plus(new C16941b(CoroutineExceptionHandler.INSTANCE, mutableLiveData2)), null, new AnnouncementViewModel$fetchCampaignActivities$2(this, announcementType, lang, mutableLiveData2, null), 2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final MutableLiveData<Pair<Boolean, List<Article>>> m36381n() {
        return this.f30628V;
    }

    /* JADX INFO: renamed from: o */
    public final String m36382o(AnnouncementType announcementType) {
        int i11 = C16940a.$EnumSwitchMapping$0[announcementType.ordinal()];
        if (i11 == 1) {
            return "futures-announcements";
        }
        if (i11 == 2) {
            return "futures-announcements,activities";
        }
        if (i11 == 3) {
            return "futures-announcements,new-listings";
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final MutableLiveData<Pair<Boolean, List<Article>>> m36383p() {
        return this.f30629W;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final MutableLiveData<Pair<Boolean, List<Article>>> m36384q() {
        return this.f30630X;
    }

    public AnnouncementViewModel() {
        Boolean bool = Boolean.TRUE;
        this.f30628V = new MutableLiveData<>(new Pair(bool, null));
        this.f30629W = new MutableLiveData<>(new Pair(bool, null));
        this.f30630X = new MutableLiveData<>(new Pair(bool, null));
    }
}
