package com.kubi.home.v2.biz.grid.utils;

import com.kubi.home.api.HomeBizRepo;
import com.kubi.home.api.entity.QuickAccessEntity;
import com.kubi.home.entity.GridNavigationEntity;
import com.kubi.home.entity.GridNavigationMoreEntity;
import com.kubi.home.exception.HomeException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: GridNaviDataProvider.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "Lcom/kubi/home/api/entity/QuickAccessEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.v2.biz.grid.utils.GridNaviDataProvider$getAllNavigations$2", m90122f = "GridNaviDataProvider.kt", m90123i = {}, m90124l = {70, 72}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nGridNaviDataProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GridNaviDataProvider.kt\ncom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider$getAllNavigations$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 HomeIssue.kt\ncom/kubi/home/exception/HomeIssueKt\n*L\n1#1,138:1\n1563#2:139\n1634#2,3:140\n1669#2,8:143\n1563#2:151\n1634#2,3:152\n1#3:155\n47#4,2:156\n*S KotlinDebug\n*F\n+ 1 GridNaviDataProvider.kt\ncom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider$getAllNavigations$2\n*L\n77#1:139\n77#1:140,3\n77#1:143,8\n78#1:151\n78#1:152,3\n79#1:156,2\n*E\n"})
public final class GridNaviDataProvider$getAllNavigations$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super List<? extends QuickAccessEntity>>, Object> {
    final /* synthetic */ boolean $useCache;
    int label;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<? extends QuickAccessEntity>> continuation) {
        return invoke2(interfaceC41709m0, (Continuation<? super List<QuickAccessEntity>>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GridNaviDataProvider$getAllNavigations$2(boolean z11, Continuation<? super GridNaviDataProvider$getAllNavigations$2> continuation) {
        super(2, continuation);
        this.$useCache = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GridNaviDataProvider$getAllNavigations$2(this.$useCache, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<QuickAccessEntity>> continuation) {
        return ((GridNaviDataProvider$getAllNavigations$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (r12 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        if (r12 == r0) goto L18;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        GridNavigationMoreEntity gridNavigationMoreEntity;
        List<GridNavigationEntity> navigationList;
        Object objM103844constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                    gridNavigationMoreEntity = (GridNavigationMoreEntity) obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                gridNavigationMoreEntity = (GridNavigationMoreEntity) obj;
            }
        } else {
            ResultKt.throwOnFailure(obj);
            if (this.$useCache) {
                HomeBizRepo homeBizRepo = GridNaviDataProvider.f26419b;
                this.label = 1;
                obj = homeBizRepo.m28940c(this);
            } else {
                HomeBizRepo homeBizRepo2 = GridNaviDataProvider.f26419b;
                this.label = 2;
                obj = homeBizRepo2.m28943f(this);
            }
            return coroutine_suspended;
        }
        if (gridNavigationMoreEntity != null && (navigationList = gridNavigationMoreEntity.getNavigationList()) != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(navigationList, 10));
                Iterator<T> it = navigationList.iterator();
                while (it.hasNext()) {
                    List children = ((GridNavigationEntity) it.next()).getChildren();
                    if (children == null) {
                        children = CollectionsKt.emptyList();
                    }
                    arrayList.add(children);
                }
                List listFlatten = CollectionsKt.flatten(arrayList);
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listFlatten) {
                    if (hashSet.add(((GridNavigationEntity) obj2).getId())) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((GridNavigationEntity) it2.next()).toQuickAccessEntity());
                }
                objM103844constructorimpl = Result.m103844constructorimpl(arrayList3);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                C43846g.m96568c(new HomeException(thM103847exceptionOrNullimpl, "GridNaviDataProvider", false, null, 8, null), null, 2, null);
            }
            if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
                objM103844constructorimpl = null;
            }
            List listEmptyList = (List) objM103844constructorimpl;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            C44128b.m97259c("GridNaviDataProvider", "[getAll]list=" + listEmptyList.size());
            return listEmptyList;
        }
        return CollectionsKt.emptyList();
    }
}
