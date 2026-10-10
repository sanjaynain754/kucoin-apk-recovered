package com.kubi.search.searchresult;

import com.kubi.search.utils.SearchFavHelper;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: SearchResultFragment.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.search.searchresult.SearchResultFragment$onAgainShow$1$1", m90122f = "SearchResultFragment.kt", m90123i = {}, m90124l = {309, 314}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class SearchResultFragment$onAgainShow$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SearchResultFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultFragment$onAgainShow$1$1(SearchResultFragment searchResultFragment, Continuation<? super SearchResultFragment$onAgainShow$1$1> continuation) {
        super(1, continuation);
        this.this$0 = searchResultFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new SearchResultFragment$onAgainShow$1$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((SearchResultFragment$onAgainShow$1$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m59439g(SearchResultFragment searchResultFragment) {
        searchResultFragment.m59420N3().m59367n3();
        searchResultFragment.m59427U3().m59367n3();
        searchResultFragment.m59425S3().m59367n3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m59440h(SearchResultFragment searchResultFragment) {
        searchResultFragment.m59420N3().m59367n3();
        searchResultFragment.m59421O3().m59355n3();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r6.m59565A(r3, r5) == r0) goto L15;
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
        final SearchResultFragment searchResultFragment = this.this$0;
        Function0<Unit> function0 = new Function0() { // from class: com.kubi.search.searchresult.l0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchResultFragment$onAgainShow$1$1.m59439g(searchResultFragment);
            }
        };
        this.label = 1;
        if (searchFavHelper.m59565A(function0, this) != coroutine_suspended) {
        }
        return coroutine_suspended;
        SearchFavHelper searchFavHelper2 = SearchFavHelper.f49141a;
        final SearchResultFragment searchResultFragment2 = this.this$0;
        Function0<Unit> function1 = new Function0() { // from class: com.kubi.search.searchresult.m0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchResultFragment$onAgainShow$1$1.m59440h(searchResultFragment2);
            }
        };
        this.label = 2;
    }
}
