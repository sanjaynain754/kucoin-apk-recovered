package com.kubi.margin.kline;

import android.content.Intent;
import androidx.core.view.KeyEventDispatcher;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.margin.kline.MarginKlineFragment$configDialogResultListener$1$onFragmentResult$1 */
/* JADX INFO: compiled from: MarginKlineFragment.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.margin.kline.MarginKlineFragment$configDialogResultListener$1$onFragmentResult$1", m90122f = "MarginKlineFragment.kt", m90123i = {}, m90124l = {321}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class C17700x316ae6f2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MarginKlineFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17700x316ae6f2(MarginKlineFragment marginKlineFragment, Continuation<? super C17700x316ae6f2> continuation) {
        super(2, continuation);
        this.this$0 = marginKlineFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C17700x316ae6f2(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((C17700x316ae6f2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            if (DelayKt.m90350b(200L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        MarginKlineFragment marginKlineFragment = this.this$0;
        Intent intent = new Intent(this.this$0.getContext(), (Class<?>) MarginFlutterKlineLandscapeActivity.class);
        KeyEventDispatcher.Component activity = this.this$0.getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.kubi.margin.kline.MarginKlineFragment.IKlineFragmentProvider");
        marginKlineFragment.startActivity(intent.putExtra("data", ((MarginKlineFragment.InterfaceC17697a) activity).mo38428D0()).putExtra("data_4", this.this$0.f33110a0).putExtra("isFrom", true));
        return Unit.INSTANCE;
    }
}
