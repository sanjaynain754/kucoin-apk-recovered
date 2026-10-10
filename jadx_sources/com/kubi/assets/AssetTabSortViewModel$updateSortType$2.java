package com.kubi.assets;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AssetTabSortViewModel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.AssetTabSortViewModel$updateSortType$2", m90122f = "AssetTabSortViewModel.kt", m90123i = {}, m90124l = {101}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nAssetTabSortViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetTabSortViewModel.kt\ncom/kubi/assets/AssetTabSortViewModel$updateSortType$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,177:1\n1563#2:178\n1634#2,3:179\n*S KotlinDebug\n*F\n+ 1 AssetTabSortViewModel.kt\ncom/kubi/assets/AssetTabSortViewModel$updateSortType$2\n*L\n101#1:178\n101#1:179,3\n*E\n"})
public final class AssetTabSortViewModel$updateSortType$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $sortType;
    int label;
    final /* synthetic */ AssetTabSortViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetTabSortViewModel$updateSortType$2(AssetTabSortViewModel assetTabSortViewModel, String str, Continuation<? super AssetTabSortViewModel$updateSortType$2> continuation) {
        super(2, continuation);
        this.this$0 = assetTabSortViewModel;
        this.$sortType = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AssetTabSortViewModel$updateSortType$2(this.this$0, this.$sortType, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AssetTabSortViewModel$updateSortType$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List listEmptyList;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            AssetTabSortViewModel assetTabSortViewModel = this.this$0;
            String str = this.$sortType;
            List list = (List) assetTabSortViewModel.f16333a0.getValue();
            if (list != null) {
                listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    listEmptyList.add(((AccountSortIndexItem) it.next()).getF16605a());
                }
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            this.label = 1;
            if (assetTabSortViewModel.m15176H(str, listEmptyList, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
