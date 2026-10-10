package com.kubi.search.searchinitial;

import com.kubi.event.api.C12572a;
import com.kubi.utils.C27100x0;
import com.kubi.utils.TimeUtils;
import com.tencent.bugly.proguard.C33844oi;
import kotlinx.coroutines.InterfaceC41775x1;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import q10.C43590j;

/* JADX INFO: compiled from: SearchRealtimeView.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "seconds", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.search.searchinitial.SearchRealtimeView$showCountdown$1$4", m90122f = "SearchRealtimeView.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class SearchRealtimeView$showCountdown$1$4 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
    final /* synthetic */ C43590j $binding;
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ SearchRealtimeView this$0;

    /* JADX INFO: renamed from: f */
    public static final Unit m59172f(int i11, C43590j c43590j) {
        String strM66415b = TimeUtils.m66415b(Long.valueOf(i11));
        Intrinsics.checkNotNullExpressionValue(strM66415b, "countTimer(...)");
        c43590j.f96224j.setText(StringsKt.replace$default(strM66415b, C33844oi.f71346o, " : ", false, 4, (Object) null));
        return Unit.INSTANCE;
    }

    public final Object invoke(int i11, Continuation<? super Unit> continuation) {
        return ((SearchRealtimeView$showCountdown$1$4) create(Integer.valueOf(i11), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchRealtimeView$showCountdown$1$4(SearchRealtimeView searchRealtimeView, C43590j c43590j, Continuation<? super SearchRealtimeView$showCountdown$1$4> continuation) {
        super(2, continuation);
        this.this$0 = searchRealtimeView;
        this.$binding = c43590j;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SearchRealtimeView$showCountdown$1$4 searchRealtimeView$showCountdown$1$4 = new SearchRealtimeView$showCountdown$1$4(this.this$0, this.$binding, continuation);
        searchRealtimeView$showCountdown$1$4.I$0 = ((Number) obj).intValue();
        return searchRealtimeView$showCountdown$1$4;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
        return invoke(num.intValue(), continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final int i11 = this.I$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC41775x1 interfaceC41775x1 = this.this$0.f48888e;
        if (interfaceC41775x1 == null || !interfaceC41775x1.isActive()) {
            return Unit.INSTANCE;
        }
        final C43590j c43590j = this.$binding;
        C27100x0.m66924e(new Function0() { // from class: com.kubi.search.searchinitial.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchRealtimeView$showCountdown$1$4.m59172f(i11, c43590j);
            }
        });
        if (i11 == 0) {
            C12572a.m23695d("search_event_realtime_countdown_finish", null, 0L, 6, null);
        }
        return Unit.INSTANCE;
    }
}
