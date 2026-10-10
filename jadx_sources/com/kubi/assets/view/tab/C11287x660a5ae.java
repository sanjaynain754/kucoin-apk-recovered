package com.kubi.assets.view.tab;

import com.kubi.assets.entity.AccountOrderEntity;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.kubi.assets.view.tab.AssetTabSortHelper$refreshAssetsPageTabs$1$deferredAccountOrderConfig$1 */
/* JADX INFO: compiled from: AssetTabSortHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/assets/entity/AccountOrderEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.view.tab.AssetTabSortHelper$refreshAssetsPageTabs$1$deferredAccountOrderConfig$1", m90122f = "AssetTabSortHelper.kt", m90123i = {}, m90124l = {269}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class C11287x660a5ae extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super AccountOrderEntity>, Object> {
    int label;

    public C11287x660a5ae(Continuation<? super C11287x660a5ae> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C11287x660a5ae(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super AccountOrderEntity> continuation) {
        return ((C11287x660a5ae) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
        Object objM20064g = assetTabSortHelper.m20064g(this);
        if (objM20064g == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM20064g;
    }
}
