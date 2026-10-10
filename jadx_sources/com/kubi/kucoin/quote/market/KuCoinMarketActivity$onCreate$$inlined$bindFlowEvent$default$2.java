package com.kubi.kucoin.quote.market;

import androidx.exifinterface.media.ExifInterface;
import com.kubi.kucoin.quote.market.KuCoinMarketActivity.RunnableC15544c;
import com.kubi.resources.widget.CustomViewPager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import pf.C43460a;
import pf.InterfaceC43461b;
import t20.C44630b;

/* JADX INFO: compiled from: FlowEventBusApi.kt */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@¨\u0006\u0005"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "Lcom/kubi/event/entity/IFlowEvent;", "com/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kucoin.quote.market.KuCoinMarketActivity$onCreate$$inlined$bindFlowEvent$default$2", m90122f = "KuCoinMarketActivity.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFlowEventBusApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1\n+ 2 KuCoinMarketActivity.kt\ncom/kubi/kucoin/quote/market/KuCoinMarketActivity\n*L\n1#1,187:1\n357#2,10:188\n*E\n"})
public final class KuCoinMarketActivity$onCreate$$inlined$bindFlowEvent$default$2 extends SuspendLambda implements Function2<InterfaceC43461b, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ KuCoinMarketActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KuCoinMarketActivity$onCreate$$inlined$bindFlowEvent$default$2(String str, Continuation continuation, KuCoinMarketActivity kuCoinMarketActivity) {
        super(2, continuation);
        this.$key = str;
        this.this$0 = kuCoinMarketActivity;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        KuCoinMarketActivity$onCreate$$inlined$bindFlowEvent$default$2 kuCoinMarketActivity$onCreate$$inlined$bindFlowEvent$default$2 = new KuCoinMarketActivity$onCreate$$inlined$bindFlowEvent$default$2(this.$key, continuation, this.this$0);
        kuCoinMarketActivity$onCreate$$inlined$bindFlowEvent$default$2.L$0 = obj;
        return kuCoinMarketActivity$onCreate$$inlined$bindFlowEvent$default$2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC43461b interfaceC43461b, @Nullable Continuation<? super Unit> continuation) {
        return ((KuCoinMarketActivity$onCreate$$inlined$bindFlowEvent$default$2) create(interfaceC43461b, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CustomViewPager customViewPager;
        C44630b c44630bM32811W1;
        CustomViewPager customViewPager2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC43461b interfaceC43461b = (InterfaceC43461b) this.L$0;
            if (interfaceC43461b instanceof C43460a) {
                C43460a c43460a = (C43460a) interfaceC43461b;
                if (Intrinsics.areEqual(c43460a.getKeyEvent(), this.$key) && (c43460a.getData() instanceof String)) {
                    if (this.this$0.f28321E) {
                        C44630b c44630bM32811W2 = this.this$0.m32811W1();
                        if (c44630bM32811W2 != null) {
                            customViewPager = c44630bM32811W2.f98974p;
                        } else {
                            customViewPager = null;
                        }
                        if (customViewPager != null && 1 < this.this$0.f28317A.size() && (c44630bM32811W1 = this.this$0.m32811W1()) != null && (customViewPager2 = c44630bM32811W1.f98974p) != null) {
                            Boxing.boxBoolean(customViewPager2.post(this.this$0.new RunnableC15544c(1)));
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
