package com.kubi.assets.main.detail;

import com.kubi.assets.detail.BaseAccountDetailFragment;
import com.kubi.data.entity.CoinInfoEntity;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.kubi.assets.main.detail.MainAccountDetailFragment$initAsnycAssetsHeaderItems$1$deferredGetB2cItem$1 */
/* JADX INFO: compiled from: MainAccountDetailFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/assets/detail/BaseAccountDetailFragment$AssetHeaderFunction;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.main.detail.MainAccountDetailFragment$initAsnycAssetsHeaderItems$1$deferredGetB2cItem$1", m90122f = "MainAccountDetailFragment.kt", m90123i = {}, m90124l = {322}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class C10326x4770656a extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super BaseAccountDetailFragment.AssetHeaderFunction>, Object> {
    int label;
    final /* synthetic */ MainAccountDetailFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10326x4770656a(MainAccountDetailFragment mainAccountDetailFragment, Continuation<? super C10326x4770656a> continuation) {
        super(2, continuation);
        this.this$0 = mainAccountDetailFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C10326x4770656a(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super BaseAccountDetailFragment.AssetHeaderFunction> continuation) {
        return ((C10326x4770656a) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
        MainAccountDetailFragment mainAccountDetailFragment = this.this$0;
        CoinInfoEntity coinInfoEntityM15914h4 = mainAccountDetailFragment.m15914h4();
        this.label = 1;
        Object objM17765d5 = mainAccountDetailFragment.m17765d5(coinInfoEntityM15914h4, this);
        if (objM17765d5 == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM17765d5;
    }
}
