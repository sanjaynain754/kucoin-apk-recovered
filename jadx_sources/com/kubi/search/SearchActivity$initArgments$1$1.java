package com.kubi.search;

import com.blankj.utilcode.util.KeyboardUtils;
import com.kubi.utils.C27100x0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import q10.C43581a;

/* JADX INFO: compiled from: SearchActivity.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.search.SearchActivity$initArgments$1$1", m90122f = "SearchActivity.kt", m90123i = {}, m90124l = {107}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class SearchActivity$initArgments$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $coin;
    int label;
    final /* synthetic */ SearchActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchActivity$initArgments$1$1(SearchActivity searchActivity, String str, Continuation<? super SearchActivity$initArgments$1$1> continuation) {
        super(2, continuation);
        this.this$0 = searchActivity;
        this.$coin = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchActivity$initArgments$1$1(this.this$0, this.$coin, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((SearchActivity$initArgments$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m59107f(SearchActivity searchActivity, String str) {
        C43581a c43581aM59099p0 = searchActivity.m59099p0();
        if (c43581aM59099p0 == null) {
            return Unit.INSTANCE;
        }
        if (str.length() > 0) {
            c43581aM59099p0.f96178d.setText(str);
            c43581aM59099p0.f96178d.setSelection(str.length());
        }
        KeyboardUtils.m6041m(c43581aM59099p0.f96178d);
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
            this.label = 1;
            if (DelayKt.m90350b(500L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        final SearchActivity searchActivity = this.this$0;
        final String str = this.$coin;
        C27100x0.m66923d(new Function0() { // from class: com.kubi.search.w
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchActivity$initArgments$1$1.m59107f(searchActivity, str);
            }
        });
        return Unit.INSTANCE;
    }
}
