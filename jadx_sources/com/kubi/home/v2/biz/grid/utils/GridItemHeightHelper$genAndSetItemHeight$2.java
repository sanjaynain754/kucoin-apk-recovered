package com.kubi.home.v2.biz.grid.utils;

import android.util.SparseIntArray;
import com.kubi.home.entity.GridNavigationEntity;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: GridItemHeightHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.v2.biz.grid.utils.GridItemHeightHelper$genAndSetItemHeight$2", m90122f = "GridItemHeightHelper.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nGridItemHeightHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GridItemHeightHelper.kt\ncom/kubi/home/v2/biz/grid/utils/GridItemHeightHelper$genAndSetItemHeight$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,75:1\n1878#2,2:76\n1869#2,2:78\n1880#2:80\n*S KotlinDebug\n*F\n+ 1 GridItemHeightHelper.kt\ncom/kubi/home/v2/biz/grid/utils/GridItemHeightHelper$genAndSetItemHeight$2\n*L\n43#1:76,2\n44#1:78,2\n43#1:80\n*E\n"})
public final class GridItemHeightHelper$genAndSetItemHeight$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $containerWidth;
    final /* synthetic */ List<GridNavigationEntity> $dataList;
    final /* synthetic */ int $spanCount;
    int label;

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM103844constructorimpl;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        float fM30670e = ((this.$containerWidth - ((this.$spanCount - 1) * GridNavigationExKt.m30670e())) / this.$spanCount) - C27040e.m66658b(4);
        SparseIntArray sparseIntArray = new SparseIntArray();
        List listChunked = CollectionsKt.chunked(this.$dataList, this.$spanCount);
        int i11 = this.$spanCount;
        List<GridNavigationEntity> list = this.$dataList;
        int i12 = 0;
        for (Object obj2 : listChunked) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            for (GridNavigationEntity gridNavigationEntity : (List) obj2) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(Boxing.boxInt(GridItemHeightHelper.f26415a.m30638f(C27041f.m66668h(gridNavigationEntity.getName()), (int) fM30670e)));
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
                }
                Integer numBoxInt = Boxing.boxInt(1);
                if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
                    objM103844constructorimpl = numBoxInt;
                }
                sparseIntArray.put(i12, Math.max(((Number) objM103844constructorimpl).intValue() > 1 ? GridItemHeightHelper.f26417c : GridItemHeightHelper.f26416b, sparseIntArray.get(i12, GridItemHeightHelper.f26416b)));
            }
            int i14 = i12 * i11;
            int i15 = i14 + i11;
            while (i14 < i15) {
                GridNavigationEntity gridNavigationEntity2 = (GridNavigationEntity) CollectionsKt.getOrNull(list, i14);
                if (gridNavigationEntity2 != null) {
                    gridNavigationEntity2.setItemViewHeight(sparseIntArray.get(i12, GridItemHeightHelper.f26416b));
                }
                i14++;
            }
            i12 = i13;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GridItemHeightHelper$genAndSetItemHeight$2(int i11, int i12, List<? extends GridNavigationEntity> list, Continuation<? super GridItemHeightHelper$genAndSetItemHeight$2> continuation) {
        super(2, continuation);
        this.$spanCount = i11;
        this.$containerWidth = i12;
        this.$dataList = list;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GridItemHeightHelper$genAndSetItemHeight$2(this.$spanCount, this.$containerWidth, this.$dataList, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((GridItemHeightHelper$genAndSetItemHeight$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
