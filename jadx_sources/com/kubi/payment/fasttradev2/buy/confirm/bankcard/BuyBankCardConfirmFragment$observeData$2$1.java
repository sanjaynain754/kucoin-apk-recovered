package com.kubi.payment.fasttradev2.buy.confirm.bankcard;

import com.kubi.widget.web.ui.KWebContainer;
import kotlinx.coroutines.InterfaceC41709m0;
import p270ft.C37613e1;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BuyBankCardConfirmFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fasttradev2.buy.confirm.bankcard.BuyBankCardConfirmFragment$observeData$2$1", m90122f = "BuyBankCardConfirmFragment.kt", m90123i = {}, m90124l = {122}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class BuyBankCardConfirmFragment$observeData$2$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $htmlString;
    int label;
    final /* synthetic */ BuyBankCardConfirmFragment this$0;

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.buy.confirm.bankcard.BuyBankCardConfirmFragment$observeData$2$1$1 */
    /* JADX INFO: compiled from: BuyBankCardConfirmFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.payment.fasttradev2.buy.confirm.bankcard.BuyBankCardConfirmFragment$observeData$2$1$1", m90122f = "BuyBankCardConfirmFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C207331 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
        final /* synthetic */ String $htmlString;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C207331(String str, Continuation<? super C207331> continuation) {
            super(1, continuation);
            this.$htmlString = str;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C207331(this.$htmlString, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super String> continuation) {
            return ((C207331) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                String str = this.$htmlString;
                Intrinsics.checkNotNull(str);
                return str;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyBankCardConfirmFragment$observeData$2$1(BuyBankCardConfirmFragment buyBankCardConfirmFragment, String str, Continuation<? super BuyBankCardConfirmFragment$observeData$2$1> continuation) {
        super(2, continuation);
        this.this$0 = buyBankCardConfirmFragment;
        this.$htmlString = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuyBankCardConfirmFragment$observeData$2$1(this.this$0, this.$htmlString, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((BuyBankCardConfirmFragment$observeData$2$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        KWebContainer kWebContainer;
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
            C37613e1 c37613e1M47575H4 = this.this$0.m47575H4();
            if (c37613e1M47575H4 != null && (kWebContainer = c37613e1M47575H4.f83838j) != null) {
                C207331 c207331 = new C207331(this.$htmlString, null);
                this.label = 1;
                obj = kWebContainer.m67476B(c207331, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
