package com.kubi.home.widgets;

import com.kubi.home.api.HomeWidgetApi;
import com.kubi.home.entity.GridNavigationEntity;
import com.kubi.home.entity.HomeGridNavigationEntity;
import com.kubi.home.entity.WidgetBannerEntity;
import com.kubi.home.entity.WidgetRecommendEntity;
import com.kubi.home.utils.HomeCoroutineScope;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.core.C27029c;
import dj.C36719d;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.C41636g;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: HomeWidgetRepo.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0086@¢\u0006\u0002\u0010\u000fJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0086@¢\u0006\u0002\u0010\u0013J\u0016\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u0086@¢\u0006\u0002\u0010\u000fJ \u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0086@¢\u0006\u0002\u0010\u0013J\u0016\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0015H\u0086@¢\u0006\u0002\u0010\u000fJ \u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0086@¢\u0006\u0002\u0010\u0013R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/home/widgets/HomeWidgetRepo;", "", "<init>", "()V", "api", "Lcom/kubi/home/api/HomeWidgetApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/home/api/HomeWidgetApi;", "api$delegate", "Lkotlin/Lazy;", "preloadAsync", "Lkotlinx/coroutines/Job;", "cachedGridNaviWidgetInfo", "Lcom/kubi/home/entity/HomeGridNavigationEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGridNaviWidgetInfo", "cacheTime", "", "(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cachedBannerWidgetInfo", "", "Lcom/kubi/home/entity/WidgetBannerEntity;", "getBannerWidgetInfo", "cachedRecommendWidgetInfo", "Lcom/kubi/home/entity/WidgetRecommendEntity;", "getRecommendWidgetInfo", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeWidgetRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeWidgetRepo.kt\ncom/kubi/home/widgets/HomeWidgetRepo\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,119:1\n32#2:120\n23#2,2:124\n32#2:126\n23#2,2:131\n32#2:133\n23#2,2:137\n196#3,3:121\n196#3,3:127\n196#3,3:134\n1#4:130\n*S KotlinDebug\n*F\n+ 1 HomeWidgetRepo.kt\ncom/kubi/home/widgets/HomeWidgetRepo\n*L\n53#1:120\n68#1:124,2\n80#1:126\n91#1:131,2\n102#1:133\n113#1:137,2\n55#1:121,3\n82#1:127,3\n104#1:134,3\n*E\n"})
public final class HomeWidgetRepo {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f26675b = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f26676a = LazyKt.lazy(new Function0() { // from class: com.kubi.home.widgets.i
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HomeWidgetRepo.m31068b();
        }
    });

    /* JADX INFO: compiled from: HomeWidgetRepo.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/home/widgets/HomeWidgetRepo$Companion;", "", "<init>", "()V", "TAG", "", "BANNER_CODE", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object m31069c(@NotNull Continuation<? super List<WidgetBannerEntity>> continuation) {
        String strM102326h = C46392a.m102326h(C36719d.f79632a.m82278w(), "");
        if (strM102326h.length() <= 0) {
            return null;
        }
        C27099x c27099x = C27099x.f54458a;
        return C41636g.m90914f0(C41636g.m90890N(C41636g.m90887K(new HomeWidgetRepo$cachedBannerWidgetInfo$$inlined$fromJsonOrNull$1(strM102326h, null)), C42911a.m94120b()), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Object m31070d(@NotNull Continuation<? super HomeGridNavigationEntity> continuation) {
        String strM102326h = C46392a.m102326h(C36719d.f79632a.m82279x(), "");
        if (strM102326h.length() <= 0) {
            return null;
        }
        C27099x c27099x = C27099x.f54458a;
        return C41636g.m90914f0(C41636g.m90890N(C41636g.m90887K(new C15075xe69546d1(strM102326h, null)), C42911a.m94120b()), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final Object m31071e(@NotNull Continuation<? super List<WidgetRecommendEntity>> continuation) {
        String strM102326h = C46392a.m102326h(C36719d.f79632a.m82280y(), "");
        if (strM102326h.length() <= 0) {
            return null;
        }
        C27099x c27099x = C27099x.f54458a;
        return C41636g.m90914f0(C41636g.m90890N(C41636g.m90887K(new C15076xea8bcf7f(strM102326h, null)), C42911a.m94120b()), continuation);
    }

    /* JADX INFO: renamed from: f */
    public final HomeWidgetApi m31072f() {
        return (HomeWidgetApi) this.f26676a.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    /* JADX INFO: renamed from: g */
    public final Object m31073g(@Nullable Long l11, @NotNull Continuation<? super List<WidgetBannerEntity>> continuation) {
        HomeWidgetRepo$getBannerWidgetInfo$1 homeWidgetRepo$getBannerWidgetInfo$1;
        List list;
        if (continuation instanceof HomeWidgetRepo$getBannerWidgetInfo$1) {
            homeWidgetRepo$getBannerWidgetInfo$1 = (HomeWidgetRepo$getBannerWidgetInfo$1) continuation;
            int i11 = homeWidgetRepo$getBannerWidgetInfo$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                homeWidgetRepo$getBannerWidgetInfo$1.label = i11 - Integer.MIN_VALUE;
            } else {
                homeWidgetRepo$getBannerWidgetInfo$1 = new HomeWidgetRepo$getBannerWidgetInfo$1(this, continuation);
            }
        } else {
            homeWidgetRepo$getBannerWidgetInfo$1 = new HomeWidgetRepo$getBannerWidgetInfo$1(this, continuation);
        }
        HomeWidgetRepo$getBannerWidgetInfo$1 homeWidgetRepo$getBannerWidgetInfo$2 = homeWidgetRepo$getBannerWidgetInfo$1;
        Object objM28969c = homeWidgetRepo$getBannerWidgetInfo$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = homeWidgetRepo$getBannerWidgetInfo$2.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM28969c);
                HomeWidgetApi homeWidgetApiM31072f = m31072f();
                homeWidgetRepo$getBannerWidgetInfo$2.L$0 = SpillingKt.nullOutSpilledVariable(l11);
                homeWidgetRepo$getBannerWidgetInfo$2.label = 1;
                objM28969c = HomeWidgetApi.m28969c(homeWidgetApiM31072f, l11, null, homeWidgetRepo$getBannerWidgetInfo$2, 2, null);
                if (objM28969c == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM28969c);
            }
            Map map = (Map) objM28969c;
            if (map == null || (list = (List) map.get("app-banner-new-2026")) == null) {
                return null;
            }
            StorageId<String> storageIdM82278w = C36719d.f79632a.m82278w();
            String strM66606i = C27029c.m66606i(list);
            Intrinsics.checkNotNullExpressionValue(strM66606i, "toJson(...)");
            C46392a.m102333p(storageIdM82278w, strM66606i);
            return list;
        } catch (Exception e11) {
            C44128b.m97263g("HomeWidgetRepo", e11);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: h */
    public final Object m31074h(@Nullable Long l11, @NotNull Continuation<? super HomeGridNavigationEntity> continuation) {
        HomeWidgetRepo$getGridNaviWidgetInfo$1 homeWidgetRepo$getGridNaviWidgetInfo$1;
        if (continuation instanceof HomeWidgetRepo$getGridNaviWidgetInfo$1) {
            homeWidgetRepo$getGridNaviWidgetInfo$1 = (HomeWidgetRepo$getGridNaviWidgetInfo$1) continuation;
            int i11 = homeWidgetRepo$getGridNaviWidgetInfo$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                homeWidgetRepo$getGridNaviWidgetInfo$1.label = i11 - Integer.MIN_VALUE;
            } else {
                homeWidgetRepo$getGridNaviWidgetInfo$1 = new HomeWidgetRepo$getGridNaviWidgetInfo$1(this, continuation);
            }
        } else {
            homeWidgetRepo$getGridNaviWidgetInfo$1 = new HomeWidgetRepo$getGridNaviWidgetInfo$1(this, continuation);
        }
        Object objM28970a = homeWidgetRepo$getGridNaviWidgetInfo$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = homeWidgetRepo$getGridNaviWidgetInfo$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM28970a);
                HomeWidgetApi homeWidgetApiM31072f = m31072f();
                homeWidgetRepo$getGridNaviWidgetInfo$1.L$0 = SpillingKt.nullOutSpilledVariable(l11);
                homeWidgetRepo$getGridNaviWidgetInfo$1.label = 1;
                objM28970a = homeWidgetApiM31072f.m28970a(l11, homeWidgetRepo$getGridNaviWidgetInfo$1);
                if (objM28970a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM28970a);
            }
            HomeGridNavigationEntity homeGridNavigationEntity = (HomeGridNavigationEntity) objM28970a;
            if (homeGridNavigationEntity == null) {
                return null;
            }
            List<GridNavigationEntity> navigationList = homeGridNavigationEntity.getNavigationList();
            HomeGridNavigationEntity homeGridNavigationEntity2 = new HomeGridNavigationEntity(navigationList != null ? CollectionsKt.take(navigationList, 7) : null, homeGridNavigationEntity.getIconResponse(), null, 4, null);
            StorageId<String> storageIdM82279x = C36719d.f79632a.m82279x();
            String strM66606i = C27029c.m66606i(homeGridNavigationEntity2);
            Intrinsics.checkNotNullExpressionValue(strM66606i, "toJson(...)");
            C46392a.m102333p(storageIdM82279x, strM66606i);
            return homeGridNavigationEntity;
        } catch (Exception e11) {
            C44128b.m97263g("HomeWidgetRepo", e11);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: i */
    public final Object m31075i(@Nullable Long l11, @NotNull Continuation<? super List<WidgetRecommendEntity>> continuation) {
        HomeWidgetRepo$getRecommendWidgetInfo$1 homeWidgetRepo$getRecommendWidgetInfo$1;
        if (continuation instanceof HomeWidgetRepo$getRecommendWidgetInfo$1) {
            homeWidgetRepo$getRecommendWidgetInfo$1 = (HomeWidgetRepo$getRecommendWidgetInfo$1) continuation;
            int i11 = homeWidgetRepo$getRecommendWidgetInfo$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                homeWidgetRepo$getRecommendWidgetInfo$1.label = i11 - Integer.MIN_VALUE;
            } else {
                homeWidgetRepo$getRecommendWidgetInfo$1 = new HomeWidgetRepo$getRecommendWidgetInfo$1(this, continuation);
            }
        } else {
            homeWidgetRepo$getRecommendWidgetInfo$1 = new HomeWidgetRepo$getRecommendWidgetInfo$1(this, continuation);
        }
        Object objM28972d = homeWidgetRepo$getRecommendWidgetInfo$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = homeWidgetRepo$getRecommendWidgetInfo$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM28972d);
                HomeWidgetApi homeWidgetApiM31072f = m31072f();
                homeWidgetRepo$getRecommendWidgetInfo$1.L$0 = SpillingKt.nullOutSpilledVariable(l11);
                homeWidgetRepo$getRecommendWidgetInfo$1.label = 1;
                objM28972d = homeWidgetApiM31072f.m28972d(l11, homeWidgetRepo$getRecommendWidgetInfo$1);
                if (objM28972d == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM28972d);
            }
            List list = (List) objM28972d;
            if (list == null) {
                return null;
            }
            StorageId<String> storageIdM82280y = C36719d.f79632a.m82280y();
            String strM66606i = C27029c.m66606i(list);
            Intrinsics.checkNotNullExpressionValue(strM66606i, "toJson(...)");
            C46392a.m102333p(storageIdM82280y, strM66606i);
            return list;
        } catch (Exception e11) {
            C44128b.m97263g("HomeWidgetRepo", e11);
            return null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final InterfaceC41775x1 m31076j() {
        return C41696j.m91104d(new HomeCoroutineScope(C42911a.m94120b(), "preload"), null, null, new HomeWidgetRepo$preloadAsync$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: b */
    public static final HomeWidgetApi m31068b() {
        return (HomeWidgetApi) C42597a.m93388d().create(HomeWidgetApi.class);
    }
}
