package com.kubi.home.v2.biz.grid.utils;

import com.kubi.home.api.entity.HomeQuickAccessEntity;
import com.kubi.home.api.entity.QuickAccessEntity;
import com.kubi.home.entity.GridNaviClickedEntity;
import com.kubi.home.entity.GridNaviClickedTimeEntity;
import com.kubi.home.entity.GridNavigationEntity;
import com.kubi.home.entity.HomeGridNavigationEntity;
import com.kubi.home.entity.MoreIconEntity;
import com.kubi.home.entity.MoreNavigationEntity;
import com.kubi.home.widgets.HomeWidgetRepo;
import dj.C36719d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;

/* JADX INFO: compiled from: GridNaviDataProvider.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/home/api/entity/HomeQuickAccessEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.v2.biz.grid.utils.GridNaviDataProvider$getHomeShowNavigations$2", m90122f = "GridNaviDataProvider.kt", m90123i = {}, m90124l = {90, 92}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nGridNaviDataProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GridNaviDataProvider.kt\ncom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider$getHomeShowNavigations$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 4 KVStore.kt\ncom/kubi/utils/storage/KVStore\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n1563#2:139\n1634#2,3:140\n2756#2:146\n774#2:148\n865#2,2:149\n1021#2,2:151\n1617#2,9:155\n1869#2:164\n295#2,2:165\n1870#2:168\n1626#2:169\n153#3,2:143\n144#3,2:153\n178#4:145\n1#5:147\n1#5:167\n*S KotlinDebug\n*F\n+ 1 GridNaviDataProvider.kt\ncom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider$getHomeShowNavigations$2\n*L\n96#1:139\n96#1:140,3\n103#1:146\n105#1:148\n105#1:149,2\n108#1:151,2\n111#1:155,9\n111#1:164\n111#1:165,2\n111#1:168\n111#1:169\n102#1:143,2\n110#1:153,2\n102#1:145\n103#1:147\n111#1:167\n*E\n"})
public final class GridNaviDataProvider$getHomeShowNavigations$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super HomeQuickAccessEntity>, Object> {
    final /* synthetic */ boolean $useCache;
    int label;

    /* JADX INFO: renamed from: com.kubi.home.v2.biz.grid.utils.GridNaviDataProvider$getHomeShowNavigations$2$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 GridNaviDataProvider.kt\ncom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider$getHomeShowNavigations$2\n*L\n1#1,328:1\n108#2:329\n*E\n"})
    public static final class C14952a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Integer.valueOf(((GridNaviClickedTimeEntity) t12).getClickedTimes().size()), Integer.valueOf(((GridNaviClickedTimeEntity) t11).getClickedTimes().size()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GridNaviDataProvider$getHomeShowNavigations$2(boolean z11, Continuation<? super GridNaviDataProvider$getHomeShowNavigations$2> continuation) {
        super(2, continuation);
        this.$useCache = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GridNaviDataProvider$getHomeShowNavigations$2(this.$useCache, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super HomeQuickAccessEntity> continuation) {
        return ((GridNaviDataProvider$getHomeShowNavigations$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r2 == r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        if (r2 == r1) goto L18;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM31074h;
        Object objM31070d;
        HomeGridNavigationEntity homeGridNavigationEntity;
        List<GridNavigationEntity> navigationList;
        List listEmptyList;
        Object next;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$useCache) {
                HomeWidgetRepo homeWidgetRepo = GridNaviDataProvider.f26420c;
                this.label = 1;
                objM31070d = homeWidgetRepo.m31070d(this);
            } else {
                HomeWidgetRepo homeWidgetRepo2 = GridNaviDataProvider.f26420c;
                this.label = 2;
                objM31074h = homeWidgetRepo2.m31074h(null, this);
            }
            return coroutine_suspended;
        }
        if (i11 == 1) {
            ResultKt.throwOnFailure(obj);
            objM31070d = obj;
            homeGridNavigationEntity = (HomeGridNavigationEntity) objM31070d;
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objM31074h = obj;
            homeGridNavigationEntity = (HomeGridNavigationEntity) objM31074h;
        }
        if (homeGridNavigationEntity == null || (navigationList = homeGridNavigationEntity.getNavigationList()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(navigationList, 10));
        Iterator<T> it = navigationList.iterator();
        while (it.hasNext()) {
            arrayList.add(((GridNavigationEntity) it.next()).toQuickAccessEntity());
        }
        MoreIconEntity iconResponse = homeGridNavigationEntity.getIconResponse();
        String dayIcon = iconResponse != null ? iconResponse.getDayIcon() : null;
        MoreIconEntity iconResponse2 = homeGridNavigationEntity.getIconResponse();
        MoreNavigationEntity moreNavigationEntity = new MoreNavigationEntity(dayIcon, iconResponse2 != null ? iconResponse2.getDarkIcon() : null);
        GridNaviClickedEntity gridNaviClickedEntity = (GridNaviClickedEntity) C46392a.f104043a.m102336j(C36719d.f79632a.m82264i(), GridNaviClickedEntity.class, null);
        if (gridNaviClickedEntity != null) {
            List<GridNaviClickedTimeEntity> items = gridNaviClickedEntity.getItems();
            for (GridNaviClickedTimeEntity gridNaviClickedTimeEntity : items) {
                List<Long> clickedTimes = gridNaviClickedTimeEntity.getClickedTimes();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : clickedTimes) {
                    if (System.currentTimeMillis() - ((Number) obj2).longValue() < 604800000) {
                        arrayList2.add(obj2);
                    }
                }
                gridNaviClickedTimeEntity.setClickedTimes(CollectionsKt.toMutableList((Collection) arrayList2));
            }
            if (items.size() > 1) {
                CollectionsKt.sortWith(items, new C14952a());
            }
            C46392a.m102331n(C36719d.f79632a.m82264i(), gridNaviClickedEntity);
            List<GridNaviClickedTimeEntity> items2 = gridNaviClickedEntity.getItems();
            listEmptyList = new ArrayList();
            for (GridNaviClickedTimeEntity gridNaviClickedTimeEntity2 : items2) {
                Iterator it2 = arrayList.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!Intrinsics.areEqual(gridNaviClickedTimeEntity2.getId(), ((QuickAccessEntity) next).getId()));
                QuickAccessEntity quickAccessEntity = (QuickAccessEntity) next;
                String id2 = quickAccessEntity != null ? quickAccessEntity.getId() : null;
                if (id2 != null) {
                    listEmptyList.add(id2);
                }
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list = listEmptyList;
        C44128b.m97259c("GridNaviDataProvider", "[getHome]homeList=>" + arrayList.size() + "},clickedIds:" + list.size());
        return new HomeQuickAccessEntity(arrayList, moreNavigationEntity.toQuickAccessEntity(), Boxing.boxInt(7), list, homeGridNavigationEntity.getUserCustomVersion());
    }
}
