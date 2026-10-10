package com.kubi.spot.kline;

import android.content.Intent;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.KeyEventDispatcher;
import com.kubi.spot.kline.flutter.SpotFlutterKlineLandscapeActivity;
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

/* JADX INFO: renamed from: com.kubi.spot.kline.KuCoinKlineFragment$configDialogResultListener$1$onFragmentResult$1 */
/* JADX INFO: compiled from: KuCoinKlineFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.spot.kline.KuCoinKlineFragment$configDialogResultListener$1$onFragmentResult$1", m90122f = "KuCoinKlineFragment.kt", m90123i = {}, m90124l = {TypedValues.AttributesType.TYPE_PIVOT_TARGET}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class C25356x727fa8a5 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ KuCoinKlineFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25356x727fa8a5(KuCoinKlineFragment kuCoinKlineFragment, Continuation<? super C25356x727fa8a5> continuation) {
        super(2, continuation);
        this.this$0 = kuCoinKlineFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C25356x727fa8a5(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((C25356x727fa8a5) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
        KuCoinKlineFragment kuCoinKlineFragment = this.this$0;
        Intent intent = new Intent(this.this$0.getContext(), (Class<?>) SpotFlutterKlineLandscapeActivity.class);
        KeyEventDispatcher.Component activity = this.this$0.getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.kubi.spot.kline.KuCoinKlineFragment.IKlineFragmentProvider");
        kuCoinKlineFragment.startActivity(intent.putExtra("data", ((KuCoinKlineFragment.InterfaceC25353a) activity).getF49727V()).putExtra("data_4", this.this$0.f50627c0).putExtra("isFrom", true));
        return Unit.INSTANCE;
    }
}
