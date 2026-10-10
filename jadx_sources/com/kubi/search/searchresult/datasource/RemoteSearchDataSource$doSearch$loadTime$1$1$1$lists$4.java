package com.kubi.search.searchresult.datasource;

import com.kubi.search.entity.SearchEntity;
import com.kubi.search.entity.SearchItemData;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: RemoteSearchDataSource.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "Lcom/kubi/search/entity/SearchItemData;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.search.searchresult.datasource.RemoteSearchDataSource$doSearch$loadTime$1$1$1$lists$4", m90122f = "RemoteSearchDataSource.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class RemoteSearchDataSource$doSearch$loadTime$1$1$1$lists$4 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super List<? extends SearchItemData>>, Object> {
    final /* synthetic */ List<SearchEntity> $remoteWeb3;
    int label;
    final /* synthetic */ RemoteSearchDataSource this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<? extends SearchItemData>> continuation) {
        return invoke2(interfaceC41709m0, (Continuation<? super List<SearchItemData>>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteSearchDataSource$doSearch$loadTime$1$1$1$lists$4(RemoteSearchDataSource remoteSearchDataSource, List<SearchEntity> list, Continuation<? super RemoteSearchDataSource$doSearch$loadTime$1$1$1$lists$4> continuation) {
        super(2, continuation);
        this.this$0 = remoteSearchDataSource;
        this.$remoteWeb3 = list;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RemoteSearchDataSource$doSearch$loadTime$1$1$1$lists$4(this.this$0, this.$remoteWeb3, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<SearchItemData>> continuation) {
        return ((RemoteSearchDataSource$doSearch$loadTime$1$1$1$lists$4) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            return this.this$0.m59498m(this.$remoteWeb3);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
