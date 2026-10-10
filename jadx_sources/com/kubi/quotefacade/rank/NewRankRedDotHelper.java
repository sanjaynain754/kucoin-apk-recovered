package com.kubi.quotefacade.rank;

import androidx.lifecycle.MutableLiveData;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.exception.KCConfigException;
import com.kubi.quotefacade.entity.RankEntity;
import com.kubi.quotefacade.helper.QuoteKV;
import com.kubi.sdk.util.TimeSyncManager;
import com.kubi.utils.C27100x0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025av.C4392c;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rg0.C44087f;
import rg0.InterfaceC44082a;
import ro.C44128b;
import y70.C46392a;

/* JADX INFO: compiled from: NewRankRedDotHelper.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001-B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0018\u00010\u00112\u0006\u0010\u0019\u001a\u00020\u0005J\u001c\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00052\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\u000e\u0010\u001d\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\u001eJ\u001c\u0010\u001f\u001a\u00020\n2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0086@¢\u0006\u0002\u0010!J\u001c\u0010\"\u001a\u00020\u001b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0086@¢\u0006\u0002\u0010!J\u001c\u0010$\u001a\u00020\u001b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0082@¢\u0006\u0002\u0010!J\u001a\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0'H\u0087@¢\u0006\u0002\u0010\u001eJ\u001a\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0'H\u0082@¢\u0006\u0002\u0010\u001eJ\b\u0010)\u001a\u00020\u001bH\u0002J\"\u0010*\u001a\u00020\u001b2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0'H\u0082@¢\u0006\u0002\u0010,R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015¨\u0006."}, m90084d2 = {"Lcom/kubi/quotefacade/rank/NewRankRedDotHelper;", "", "<init>", "()V", "TAG", "", "EXPOSED_SYMBOL", "exposedSymbolsScope", "Lkotlinx/coroutines/CoroutineScope;", "hasLoadedExposedSymbols", "", "exposedSymbolSetLock", "Lkotlinx/coroutines/sync/Mutex;", "exposedSymbolMap", "Ljava/util/concurrent/ConcurrentHashMap;", "", "rankNewCoinLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/kubi/quotefacade/entity/RankEntity;", "getRankNewCoinLiveData", "()Landroidx/lifecycle/MutableLiveData;", "rankNewFutureLiveData", "getRankNewFutureLiveData", "getNewSubTabLiveData", "subType", "updateNewTabData", "", "realList", "needShowDotInNewTab", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "needShowDot", "curData", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "exposedSymbols", "list", "realExposedSymbols", "symbols", "testGetExposedSymbols", "", "getExposedSymbols", "loadLocalExposedSymbols", "saveExposedSymbolToLocal", "readSymbols", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ExposedBean", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNewRankRedDotHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewRankRedDotHelper.kt\ncom/kubi/quotefacade/rank/NewRankRedDotHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 5 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,172:1\n1#2:173\n1761#3,3:174\n774#3:177\n865#3,2:178\n1869#3,2:181\n32#4:180\n47#5,4:183\n*S KotlinDebug\n*F\n+ 1 NewRankRedDotHelper.kt\ncom/kubi/quotefacade/rank/NewRankRedDotHelper\n*L\n90#1:174,3\n98#1:177\n98#1:178,2\n145#1:181,2\n140#1:180\n35#1:183,4\n*E\n"})
public final class NewRankRedDotHelper {

    /* JADX INFO: renamed from: c */
    public static boolean f42390c;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final NewRankRedDotHelper f42388a = new NewRankRedDotHelper();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final InterfaceC41709m0 f42389b = C41713n0.m91125a(new CoroutineName("home_rank_read_symbol").plus(C42911a.m94120b()).plus(new C22430c(CoroutineExceptionHandler.INSTANCE)));

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final InterfaceC44082a f42391d = C44087f.m97144b(false, 1, null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final ConcurrentHashMap<String, Long> f42392e = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final MutableLiveData<List<RankEntity>> f42393f = new MutableLiveData<>();

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final MutableLiveData<List<RankEntity>> f42394g = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.kubi.quotefacade.rank.NewRankRedDotHelper$a, reason: from toString */
    /* JADX INFO: compiled from: NewRankRedDotHelper.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/quotefacade/rank/NewRankRedDotHelper$ExposedBean;", "", "exposeKey", "", "openTime", "", "<init>", "(Ljava/lang/String;J)V", "getExposeKey", "()Ljava/lang/String;", "getOpenTime", "()J", "isCountDownType", "", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ExposedBean {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final String exposeKey;

        /* JADX INFO: renamed from: b, reason: from toString */
        public final long openTime;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExposedBean)) {
                return false;
            }
            ExposedBean exposedBean = (ExposedBean) other;
            return Intrinsics.areEqual(this.exposeKey, exposedBean.exposeKey) && this.openTime == exposedBean.openTime;
        }

        public ExposedBean(@NotNull String exposeKey, long j11) {
            Intrinsics.checkNotNullParameter(exposeKey, "exposeKey");
            this.exposeKey = exposeKey;
            this.openTime = j11;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getExposeKey() {
            return this.exposeKey;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getOpenTime() {
            return this.openTime;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m52651c() {
            return this.openTime > TimeSyncManager.f48123a.m58366p();
        }

        public int hashCode() {
            return (this.exposeKey.hashCode() * 31) + Long.hashCode(this.openTime);
        }

        @NotNull
        public String toString() {
            return "ExposedBean(exposeKey=" + this.exposeKey + ", openTime=" + this.openTime + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.rank.NewRankRedDotHelper$b */
    /* JADX INFO: compiled from: NewRankRedDotHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, m90084d2 = {"com/kubi/quotefacade/rank/NewRankRedDotHelper$loadLocalExposedSymbols$1$type$1", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/kubi/quotefacade/rank/NewRankRedDotHelper$ExposedBean;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22429b extends TypeToken<List<? extends ExposedBean>> {
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.rank.NewRankRedDotHelper$c */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 NewRankRedDotHelper.kt\ncom/kubi/quotefacade/rank/NewRankRedDotHelper\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,49:1\n36#2:50\n37#2:53\n44#3,2:51\n*S KotlinDebug\n*F\n+ 1 NewRankRedDotHelper.kt\ncom/kubi/quotefacade/rank/NewRankRedDotHelper\n*L\n36#1:51,2\n*E\n"})
    public static final class C22430c extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            C43846g.m96568c(new KCConfigException(exception, "NewRankDataSource unhatched", false, null, 8, null), null, 2, null);
        }

        public C22430c(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m52637l() {
        String strM102326h = C46392a.m102326h(QuoteKV.f42044a.m52053m(), "");
        C44128b.m97266j("NewRankRedDotHelper", "[load] jsonStr:" + strM102326h);
        if (strM102326h.length() != 0) {
            Object objFromJson = new Gson().fromJson(strM102326h, new C22429b().getType());
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            for (ExposedBean exposedBean : (List) objFromJson) {
                if (exposedBean.m52651c()) {
                    f42392e.put(exposedBean.getExposeKey(), Long.valueOf(exposedBean.getOpenTime()));
                }
            }
        }
        C44128b.m97266j("NewRankRedDotHelper", "[load] map:" + f42392e);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a6, code lost:
    
        if (m52646o(r2, r0) == r1) goto L34;
     */
    @Nullable
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m52638f(@NotNull List<RankEntity> list, @NotNull Continuation<? super Unit> continuation) {
        NewRankRedDotHelper$exposedSymbols$1 newRankRedDotHelper$exposedSymbols$1;
        if (continuation instanceof NewRankRedDotHelper$exposedSymbols$1) {
            newRankRedDotHelper$exposedSymbols$1 = (NewRankRedDotHelper$exposedSymbols$1) continuation;
            int i11 = newRankRedDotHelper$exposedSymbols$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                newRankRedDotHelper$exposedSymbols$1.label = i11 - Integer.MIN_VALUE;
            } else {
                newRankRedDotHelper$exposedSymbols$1 = new NewRankRedDotHelper$exposedSymbols$1(this, continuation);
            }
        } else {
            newRankRedDotHelper$exposedSymbols$1 = new NewRankRedDotHelper$exposedSymbols$1(this, continuation);
        }
        Object objM52639g = newRankRedDotHelper$exposedSymbols$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = newRankRedDotHelper$exposedSymbols$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM52639g);
            newRankRedDotHelper$exposedSymbols$1.L$0 = list;
            newRankRedDotHelper$exposedSymbols$1.label = 1;
            objM52639g = m52639g(newRankRedDotHelper$exposedSymbols$1);
            if (objM52639g != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            list = (List) newRankRedDotHelper$exposedSymbols$1.L$0;
            ResultKt.throwOnFailure(objM52639g);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM52639g);
        }
        return Unit.INSTANCE;
        Map map = (Map) objM52639g;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            RankEntity rankEntity = (RankEntity) obj;
            String exposeKey = rankEntity.getExposeKey();
            if (rankEntity.isCountDownType() && exposeKey != null && !map.containsKey(exposeKey)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return Unit.INSTANCE;
        }
        newRankRedDotHelper$exposedSymbols$1.L$0 = SpillingKt.nullOutSpilledVariable(list);
        newRankRedDotHelper$exposedSymbols$1.L$1 = SpillingKt.nullOutSpilledVariable(map);
        newRankRedDotHelper$exposedSymbols$1.L$2 = SpillingKt.nullOutSpilledVariable(arrayList);
        newRankRedDotHelper$exposedSymbols$1.label = 2;
    }

    /* JADX INFO: renamed from: g */
    public final Object m52639g(Continuation<? super Map<String, Long>> continuation) {
        return C41686h.m91049g(f42389b.getF26335b(), new NewRankRedDotHelper$getExposedSymbols$2(null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final MutableLiveData<List<RankEntity>> m52640h(@NotNull String subType) {
        Intrinsics.checkNotNullParameter(subType, "subType");
        if (C4392c.m4016d(subType)) {
            return f42393f;
        }
        if (C4392c.m4017e(subType)) {
            return f42394g;
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final MutableLiveData<List<RankEntity>> m52641i() {
        return f42393f;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final MutableLiveData<List<RankEntity>> m52642j() {
        return f42394g;
    }

    /* JADX INFO: renamed from: k */
    public final void m52643k() {
        if (f42390c) {
            return;
        }
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.rank.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewRankRedDotHelper.m52637l();
            }
        });
        f42390c = true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: m */
    public final Object m52644m(@NotNull List<RankEntity> list, @NotNull Continuation<? super Boolean> continuation) {
        NewRankRedDotHelper$needShowDot$1 newRankRedDotHelper$needShowDot$1;
        if (continuation instanceof NewRankRedDotHelper$needShowDot$1) {
            newRankRedDotHelper$needShowDot$1 = (NewRankRedDotHelper$needShowDot$1) continuation;
            int i11 = newRankRedDotHelper$needShowDot$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                newRankRedDotHelper$needShowDot$1.label = i11 - Integer.MIN_VALUE;
            } else {
                newRankRedDotHelper$needShowDot$1 = new NewRankRedDotHelper$needShowDot$1(this, continuation);
            }
        } else {
            newRankRedDotHelper$needShowDot$1 = new NewRankRedDotHelper$needShowDot$1(this, continuation);
        }
        Object objM52639g = newRankRedDotHelper$needShowDot$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = newRankRedDotHelper$needShowDot$1.label;
        boolean z11 = true;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM52639g);
            newRankRedDotHelper$needShowDot$1.L$0 = list;
            newRankRedDotHelper$needShowDot$1.label = 1;
            objM52639g = m52639g(newRankRedDotHelper$needShowDot$1);
            if (objM52639g == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) newRankRedDotHelper$needShowDot$1.L$0;
            ResultKt.throwOnFailure(objM52639g);
        }
        Map map = (Map) objM52639g;
        if (list == null || !list.isEmpty()) {
            for (RankEntity rankEntity : list) {
                String exposeKey = rankEntity.getExposeKey();
                if (!rankEntity.isCountDownType() || exposeKey == null || map.containsKey(exposeKey)) {
                }
            }
            z11 = false;
        } else {
            z11 = false;
        }
        return Boxing.boxBoolean(z11);
    }

    /* JADX INFO: renamed from: o */
    public final Object m52646o(List<RankEntity> list, Continuation<? super Unit> continuation) {
        C44128b.m97266j("NewRankRedDotHelper", "[exposedSymbols] size:" + list.size());
        Object objM91049g = C41686h.m91049g(f42389b.getF26335b(), new NewRankRedDotHelper$realExposedSymbols$2(list, null), continuation);
        return objM91049g == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91049g : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public final Object m52647p(Map<String, Long> map, Continuation<? super Unit> continuation) {
        Object objM91049g = C41686h.m91049g(f42389b.getF26335b(), new NewRankRedDotHelper$saveExposedSymbolToLocal$2(map, null), continuation);
        return objM91049g == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91049g : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public final void m52648q(@NotNull String subType, @NotNull List<RankEntity> realList) {
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(realList, "realList");
        if (C4392c.m4016d(subType)) {
            f42393f.postValue(realList);
        } else if (C4392c.m4017e(subType)) {
            f42394g.postValue(realList);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public final Object m52645n(@NotNull Continuation<? super Boolean> continuation) {
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        List<RankEntity> value = f42393f.getValue();
        if (value != null) {
            Boxing.boxBoolean(listCreateListBuilder.addAll(value));
        }
        List<RankEntity> value2 = f42394g.getValue();
        if (value2 != null) {
            listCreateListBuilder.addAll(value2);
        }
        return m52644m(CollectionsKt.build(listCreateListBuilder), continuation);
    }
}
