package com.kubi.assets.bill;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.kubi.assets.R$string;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.utils.extensions.C27041f;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41678w;
import p637ta.C44720a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AccountBillCommonFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.bill.AccountBillCommonFragment$observeViewModel$1", m90122f = "AccountBillCommonFragment.kt", m90123i = {}, m90124l = {123}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AccountBillCommonFragment$observeViewModel$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AccountBillCommonFragment this$0;

    /* JADX INFO: renamed from: com.kubi.assets.bill.AccountBillCommonFragment$observeViewModel$1$1 */
    /* JADX INFO: compiled from: AccountBillCommonFragment.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.bill.AccountBillCommonFragment$observeViewModel$1$1", m90122f = "AccountBillCommonFragment.kt", m90123i = {}, m90124l = {125}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C95401 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AccountBillCommonFragment this$0;

        /* JADX INFO: renamed from: com.kubi.assets.bill.AccountBillCommonFragment$observeViewModel$1$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: AccountBillCommonFragment.kt */
        @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "filter", "Lcom/kubi/assets/bill/AccountBillFilterModel;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "com.kubi.assets.bill.AccountBillCommonFragment$observeViewModel$1$1$1", m90122f = "AccountBillCommonFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<AccountBillFilterModel, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AccountBillCommonFragment this$0;

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(AccountBillFilterModel accountBillFilterModel, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(accountBillFilterModel, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AccountBillCommonFragment accountBillCommonFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = accountBillCommonFragment;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                AccountBillFilterModel accountBillFilterModel = (AccountBillFilterModel) this.L$0;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                C44720a c44720aM15532h4 = this.this$0.m15532h4();
                if (c44720aM15532h4 != null) {
                    AccountBillCommonFragment accountBillCommonFragment = this.this$0;
                    c44720aM15532h4.f99533b.f99595g.setText(C9657x.m15813d(accountBillFilterModel.getTime()));
                    c44720aM15532h4.f99533b.f99594f.setText(C9657x.m15812c(accountBillFilterModel.getDirection()));
                    c44720aM15532h4.f99533b.f99596h.setText(C9657x.m15810a(accountBillFilterModel.getBizType(), accountBillCommonFragment.m15494A3()));
                    BaseTextView baseTextView = c44720aM15532h4.f99533b.f99593e;
                    String currency = accountBillFilterModel.getCurrency();
                    String string = accountBillCommonFragment.getString(R$string.coin);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    baseTextView.setText(C27041f.m66669i(currency, string));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C95401(AccountBillCommonFragment accountBillCommonFragment, Continuation<? super C95401> continuation) {
            super(2, continuation);
            this.this$0 = accountBillCommonFragment;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C95401(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C95401) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<AccountBillFilterModel> interfaceC41678wM15555x = this.this$0.m15496C3().m15555x();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (C41636g.m90925l(interfaceC41678wM15555x, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountBillCommonFragment$observeViewModel$1(AccountBillCommonFragment accountBillCommonFragment, Continuation<? super AccountBillCommonFragment$observeViewModel$1> continuation) {
        super(2, continuation);
        this.this$0 = accountBillCommonFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AccountBillCommonFragment$observeViewModel$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AccountBillCommonFragment$observeViewModel$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            LifecycleOwner viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            Lifecycle.State state = Lifecycle.State.STARTED;
            C95401 c95401 = new C95401(this.this$0, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, c95401, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
