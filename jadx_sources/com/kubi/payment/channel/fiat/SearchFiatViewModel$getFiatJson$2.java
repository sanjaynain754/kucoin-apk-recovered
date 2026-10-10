package com.kubi.payment.channel.fiat;

import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: SearchFiatViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.channel.fiat.SearchFiatViewModel$getFiatJson$2", m90122f = "SearchFiatViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class SearchFiatViewModel$getFiatJson$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super String>, Object> {
    final /* synthetic */ StorageId<String> $cacheKey;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFiatViewModel$getFiatJson$2(StorageId<String> storageId, Continuation<? super SearchFiatViewModel$getFiatJson$2> continuation) {
        super(2, continuation);
        this.$cacheKey = storageId;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchFiatViewModel$getFiatJson$2(this.$cacheKey, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super String> continuation) {
        return ((SearchFiatViewModel$getFiatJson$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            return C46392a.m102326h(this.$cacheKey, "");
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
