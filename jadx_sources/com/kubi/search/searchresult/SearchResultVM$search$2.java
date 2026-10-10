package com.kubi.search.searchresult;

import com.kubi.search.searchresult.datasource.RemoteSearchDataSource;
import kotlinx.coroutines.InterfaceC41709m0;
import org.json.JSONException;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: SearchResultVM.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.search.searchresult.SearchResultVM$search$2", m90122f = "SearchResultVM.kt", m90123i = {}, m90124l = {71, 71}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class SearchResultVM$search$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    Object L$0;
    int label;
    final /* synthetic */ SearchResultVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultVM$search$2(SearchResultVM searchResultVM, String str, Continuation<? super SearchResultVM$search$2> continuation) {
        super(2, continuation);
        this.this$0 = searchResultVM;
        this.$key = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchResultVM$search$2(this.this$0, this.$key, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((SearchResultVM$search$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r1.m59448p((com.kubi.search.entity.SearchResultWrap) r6, r5) == r0) goto L15;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws JSONException {
        SearchResultVM searchResultVM;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                searchResultVM = (SearchResultVM) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        searchResultVM = this.this$0;
        RemoteSearchDataSource remoteSearchDataSource = searchResultVM.f49032b0;
        String str = this.$key;
        this.L$0 = searchResultVM;
        this.label = 1;
        obj = remoteSearchDataSource.m59492g(str, this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        this.L$0 = null;
        this.label = 2;
    }
}
