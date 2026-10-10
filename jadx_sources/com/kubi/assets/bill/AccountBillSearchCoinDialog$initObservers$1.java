package com.kubi.assets.bill;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.kubi.assets.R$layout;
import com.kubi.utils.extensions.C27041f;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AccountBillSearchCoinDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.bill.AccountBillSearchCoinDialog$initObservers$1", m90122f = "AccountBillSearchCoinDialog.kt", m90123i = {}, m90124l = {126}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AccountBillSearchCoinDialog$initObservers$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AccountBillSearchCoinDialog this$0;

    /* JADX INFO: renamed from: com.kubi.assets.bill.AccountBillSearchCoinDialog$initObservers$1$1 */
    /* JADX INFO: compiled from: AccountBillSearchCoinDialog.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.bill.AccountBillSearchCoinDialog$initObservers$1$1", m90122f = "AccountBillSearchCoinDialog.kt", m90123i = {}, m90124l = {127}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C95601 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AccountBillSearchCoinDialog this$0;

        /* JADX INFO: renamed from: com.kubi.assets.bill.AccountBillSearchCoinDialog$initObservers$1$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: AccountBillSearchCoinDialog.kt */
        @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/assets/bill/AccountBillSearchCoinDialog$SearchCoinItemInfo;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "com.kubi.assets.bill.AccountBillSearchCoinDialog$initObservers$1$1$1", m90122f = "AccountBillSearchCoinDialog.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<List<? extends AccountBillSearchCoinDialog.SearchCoinItemInfo>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AccountBillSearchCoinDialog this$0;

            @Override // p852kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends AccountBillSearchCoinDialog.SearchCoinItemInfo> list, Continuation<? super Unit> continuation) {
                return invoke2((List<AccountBillSearchCoinDialog.SearchCoinItemInfo>) list, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AccountBillSearchCoinDialog accountBillSearchCoinDialog, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = accountBillSearchCoinDialog;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<AccountBillSearchCoinDialog.SearchCoinItemInfo> list, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                List<AccountBillSearchCoinDialog.SearchCoinItemInfo> list = (List) this.L$0;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (list.isEmpty()) {
                    this.this$0.m15676z4().setEmptyView(R$layout.view_empty);
                }
                AccountBillSearchCoinDialog accountBillSearchCoinDialog = this.this$0;
                accountBillSearchCoinDialog.f16667y0 = C27041f.m66668h((String) accountBillSearchCoinDialog.f16666x0.getValue());
                this.this$0.m15676z4().setNewData(list);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C95601(AccountBillSearchCoinDialog accountBillSearchCoinDialog, Continuation<? super C95601> continuation) {
            super(2, continuation);
            this.this$0 = accountBillSearchCoinDialog;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C95601(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C95601) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41669n interfaceC41669n = this.this$0.f16664v0;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (C41636g.m90925l(interfaceC41669n, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountBillSearchCoinDialog$initObservers$1(AccountBillSearchCoinDialog accountBillSearchCoinDialog, Continuation<? super AccountBillSearchCoinDialog$initObservers$1> continuation) {
        super(2, continuation);
        this.this$0 = accountBillSearchCoinDialog;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AccountBillSearchCoinDialog$initObservers$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AccountBillSearchCoinDialog$initObservers$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            AccountBillSearchCoinDialog accountBillSearchCoinDialog = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            C95601 c95601 = new C95601(accountBillSearchCoinDialog, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(accountBillSearchCoinDialog, state, c95601, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
