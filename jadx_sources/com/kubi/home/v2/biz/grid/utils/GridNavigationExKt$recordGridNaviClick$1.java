package com.kubi.home.v2.biz.grid.utils;

import com.kubi.home.entity.GridNaviClickedEntity;
import com.kubi.home.entity.GridNaviClickedTimeEntity;
import dj.C36719d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: compiled from: GridNavigationEx.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.v2.biz.grid.utils.GridNavigationExKt$recordGridNaviClick$1", m90122f = "GridNavigationEx.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nGridNavigationEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GridNavigationEx.kt\ncom/kubi/home/v2/biz/grid/utils/GridNavigationExKt$recordGridNaviClick$1\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 KVStore.kt\ncom/kubi/utils/storage/KVStore\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,149:1\n153#2,2:150\n144#2,2:159\n178#3:152\n295#4,2:153\n774#4:155\n865#4,2:156\n1#5:158\n*S KotlinDebug\n*F\n+ 1 GridNavigationEx.kt\ncom/kubi/home/v2/biz/grid/utils/GridNavigationExKt$recordGridNaviClick$1\n*L\n135#1:150,2\n148#1:159,2\n135#1:152\n136#1:153,2\n144#1:155\n144#1:156,2\n*E\n"})
public final class GridNavigationExKt$recordGridNaviClick$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $gridNaviId;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GridNavigationExKt$recordGridNaviClick$1(String str, Continuation<? super GridNavigationExKt$recordGridNaviClick$1> continuation) {
        super(2, continuation);
        this.$gridNaviId = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GridNavigationExKt$recordGridNaviClick$1(this.$gridNaviId, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((GridNavigationExKt$recordGridNaviClick$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object next;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            GridNaviClickedEntity gridNaviClickedEntity = (GridNaviClickedEntity) C46392a.f104043a.m102336j(C36719d.f79632a.m82264i(), GridNaviClickedEntity.class, null);
            if (gridNaviClickedEntity == null) {
                gridNaviClickedEntity = new GridNaviClickedEntity(null, 1, null);
            }
            List<GridNaviClickedTimeEntity> items = gridNaviClickedEntity.getItems();
            String str = this.$gridNaviId;
            Iterator<T> it = items.iterator();
            do {
                if (it.hasNext()) {
                    next = it.next();
                } else {
                    next = null;
                    break;
                }
            } while (!Intrinsics.areEqual(((GridNaviClickedTimeEntity) next).getId(), str));
            GridNaviClickedTimeEntity gridNaviClickedTimeEntity = (GridNaviClickedTimeEntity) next;
            if (gridNaviClickedTimeEntity == null) {
                List<GridNaviClickedTimeEntity> items2 = gridNaviClickedEntity.getItems();
                GridNaviClickedTimeEntity gridNaviClickedTimeEntity2 = new GridNaviClickedTimeEntity(this.$gridNaviId, null, 2, null);
                gridNaviClickedTimeEntity2.getClickedTimes().add(Boxing.boxLong(System.currentTimeMillis()));
                Boxing.boxBoolean(items2.add(gridNaviClickedTimeEntity2));
            } else {
                List<Long> clickedTimes = gridNaviClickedTimeEntity.getClickedTimes();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : clickedTimes) {
                    if (System.currentTimeMillis() - ((Number) obj2).longValue() < 604800000) {
                        arrayList.add(obj2);
                    }
                }
                List<Long> mutableList = CollectionsKt.toMutableList((Collection) arrayList);
                mutableList.add(Boxing.boxLong(System.currentTimeMillis()));
                gridNaviClickedTimeEntity.setClickedTimes(mutableList);
            }
            C46392a.m102331n(C36719d.f79632a.m82264i(), gridNaviClickedEntity);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
