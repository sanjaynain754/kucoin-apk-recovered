package com.kubi.assets.view.tab;

import com.kubi.assets.entity.AssetV2OverviewEntity;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.kubi.assets.view.tab.AssetTabSortHelper$refreshAssetsPageTabs$1$deferredAccountAssetsRequest$1 */
/* JADX INFO: compiled from: AssetTabSortHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/assets/entity/AssetV2OverviewEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.view.tab.AssetTabSortHelper$refreshAssetsPageTabs$1$deferredAccountAssetsRequest$1", m90122f = "AssetTabSortHelper.kt", m90123i = {}, m90124l = {249}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class C11285xc1a42fca extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super AssetV2OverviewEntity>, Object> {
    int label;

    public C11285xc1a42fca(Continuation<? super C11285xc1a42fca> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C11285xc1a42fca(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super AssetV2OverviewEntity> continuation) {
        return ((C11285xc1a42fca) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AssetTabSortHelper assetTabSortHelper = AssetTabSortHelper.f19161a;
        this.label = 1;
        Object objM20063f = assetTabSortHelper.m20063f(this);
        if (objM20063f == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM20063f;
    }
}
