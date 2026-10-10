package com.kubi.quotefacade.market.spot;

import com.kubi.quotefacade.entity.SpotLevel1;
import com.kubi.quotefacade.entity.SpotLevel2;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: QuoteSpotFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.market.spot.QuoteSpotFragment$updateTab$1", m90122f = "QuoteSpotFragment.kt", m90123i = {0, 0, 0, 0}, m90124l = {241}, m90125m = "invokeSuspend", m90126n = {"it", "it1", "$i$a$-let-QuoteSpotFragment$updateTab$1$1", "$i$a$-let-QuoteSpotFragment$updateTab$1$1$1"}, m90127s = {"L$0", "L$1", "I$0", "I$1"})
public final class QuoteSpotFragment$updateTab$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $index;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ QuoteSpotFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuoteSpotFragment$updateTab$1(int i11, QuoteSpotFragment quoteSpotFragment, Continuation<? super QuoteSpotFragment$updateTab$1> continuation) {
        super(2, continuation);
        this.$index = i11;
        this.this$0 = quoteSpotFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new QuoteSpotFragment$updateTab$1(this.$index, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((QuoteSpotFragment$updateTab$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List<SpotLevel2> level2;
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
            if (this.$index < this.this$0.f42351V.size() && (level2 = ((SpotLevel1) this.this$0.f42351V.get(this.$index)).getLevel2()) != null) {
                QuoteSpotFragment quoteSpotFragment = this.this$0;
                String quoteCryptoAliasName = ((SpotLevel1) quoteSpotFragment.f42351V.get(this.$index)).getQuoteCryptoAliasName();
                if (quoteCryptoAliasName != null) {
                    this.L$0 = SpillingKt.nullOutSpilledVariable(level2);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(quoteCryptoAliasName);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    if (quoteSpotFragment.m52606D3(quoteCryptoAliasName, level2, 0, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
