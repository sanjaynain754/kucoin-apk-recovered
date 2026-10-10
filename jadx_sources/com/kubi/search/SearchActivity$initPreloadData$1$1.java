package com.kubi.search;

import com.kubi.search.utils.SearchFavHelper;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: SearchActivity.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.search.SearchActivity$initPreloadData$1$1", m90122f = "SearchActivity.kt", m90123i = {}, m90124l = {123, 124}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class SearchActivity$initPreloadData$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;

    public SearchActivity$initPreloadData$1$1(Continuation<? super SearchActivity$initPreloadData$1$1> continuation) {
        super(1, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new SearchActivity$initPreloadData$1$1(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((SearchActivity$initPreloadData$1$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (com.kubi.search.utils.SearchFavHelper.m59564z(r6, null, r5, 1, null) == r0) goto L15;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
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
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        SearchFavHelper searchFavHelper = SearchFavHelper.f49141a;
        this.label = 1;
        if (SearchFavHelper.m59545B(searchFavHelper, null, this, 1, null) != coroutine_suspended) {
        }
        return coroutine_suspended;
        SearchFavHelper searchFavHelper2 = SearchFavHelper.f49141a;
        this.label = 2;
    }
}
