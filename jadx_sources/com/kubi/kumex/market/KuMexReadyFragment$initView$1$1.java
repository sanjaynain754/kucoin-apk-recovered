package com.kubi.kumex.market;

import android.content.Context;
import android.widget.ImageView;
import com.kubi.sdk.util.C24277v;
import dm.C36727a;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: KuMexReadyFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kumex.market.KuMexReadyFragment$initView$1$1", m90122f = "KuMexReadyFragment.kt", m90123i = {}, m90124l = {86}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KuMexReadyFragment$initView$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ KuMexReadyFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KuMexReadyFragment$initView$1$1(KuMexReadyFragment kuMexReadyFragment, Continuation<? super KuMexReadyFragment$initView$1$1> continuation) {
        super(2, continuation);
        this.this$0 = kuMexReadyFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KuMexReadyFragment$initView$1$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KuMexReadyFragment$initView$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        ImageView imageView = null;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            AbstractC41697j0 abstractC41697j0M91392b = C41782z0.m91392b();
            KuMexReadyFragment$initView$1$1$iconUrl$1 kuMexReadyFragment$initView$1$1$iconUrl$1 = new KuMexReadyFragment$initView$1$1$iconUrl$1(this.this$0, null);
            this.label = 1;
            obj = C41686h.m91049g(abstractC41697j0M91392b, kuMexReadyFragment$initView$1$1$iconUrl$1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        String str = (String) obj;
        Context context = this.this$0.getContext();
        if (context != null) {
            C36727a c36727aM34319t3 = this.this$0.m34319t3();
            if (c36727aM34319t3 != null && c36727aM34319t3.f79654g != null) {
                if (str != null) {
                    C36727a c36727aM34319t4 = this.this$0.m34319t3();
                    if (c36727aM34319t4 != null) {
                        imageView = c36727aM34319t4.f79654g;
                    }
                    C24277v.m58540e(context, str, imageView);
                }
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
