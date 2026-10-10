package com.kubi.assets.bill;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.kubi.utils.extensions.C27041f;
import e60.C37084b;
import java.math.BigDecimal;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41669n;
import org.tensorflow.lite.schema.BuiltinOperator;
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

/* JADX INFO: compiled from: AccountBillSearchCoinDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.bill.AccountBillSearchCoinDialog$initObservers$3", m90122f = "AccountBillSearchCoinDialog.kt", m90123i = {}, m90124l = {154}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AccountBillSearchCoinDialog$initObservers$3 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AccountBillSearchCoinDialog this$0;

    /* JADX INFO: renamed from: com.kubi.assets.bill.AccountBillSearchCoinDialog$initObservers$3$1 */
    /* JADX INFO: compiled from: AccountBillSearchCoinDialog.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.bill.AccountBillSearchCoinDialog$initObservers$3$1", m90122f = "AccountBillSearchCoinDialog.kt", m90123i = {}, m90124l = {BuiltinOperator.UNSORTED_SEGMENT_SUM}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C95621 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AccountBillSearchCoinDialog this$0;

        /* JADX INFO: renamed from: com.kubi.assets.bill.AccountBillSearchCoinDialog$initObservers$3$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: AccountBillSearchCoinDialog.kt */
        @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "text", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "com.kubi.assets.bill.AccountBillSearchCoinDialog$initObservers$3$1$1", m90122f = "AccountBillSearchCoinDialog.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AccountBillSearchCoinDialog this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AccountBillSearchCoinDialog accountBillSearchCoinDialog, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = accountBillSearchCoinDialog;
            }

            /* JADX INFO: renamed from: j */
            public static final BigDecimal m15693j(AccountBillSearchCoinDialog.SearchCoinItemInfo searchCoinItemInfo) {
                BigDecimal ZERO = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                return ZERO;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(String str, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: renamed from: h */
            public static final String m15691h(AccountBillSearchCoinDialog.SearchCoinItemInfo searchCoinItemInfo) {
                return searchCoinItemInfo.getCurrency();
            }

            /* JADX INFO: renamed from: i */
            public static final String m15692i(AccountBillSearchCoinDialog.SearchCoinItemInfo searchCoinItemInfo) {
                return searchCoinItemInfo.getName();
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.f16664v0.setValue(C37084b.m83009d(this.this$0.m15675x4(AccountBillSearchCoinDialog.f16658C0), C27041f.m66668h((String) this.this$0.f16666x0.getValue()), new Function1() { // from class: com.kubi.assets.bill.e1
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return AccountBillSearchCoinDialog$initObservers$3.C95621.AnonymousClass1.m15691h((AccountBillSearchCoinDialog.SearchCoinItemInfo) obj2);
                        }
                    }, new Function1() { // from class: com.kubi.assets.bill.f1
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return AccountBillSearchCoinDialog$initObservers$3.C95621.AnonymousClass1.m15692i((AccountBillSearchCoinDialog.SearchCoinItemInfo) obj2);
                        }
                    }, new Function1() { // from class: com.kubi.assets.bill.g1
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return AccountBillSearchCoinDialog$initObservers$3.C95621.AnonymousClass1.m15693j((AccountBillSearchCoinDialog.SearchCoinItemInfo) obj2);
                        }
                    }));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C95621(AccountBillSearchCoinDialog accountBillSearchCoinDialog, Continuation<? super C95621> continuation) {
            super(2, continuation);
            this.this$0 = accountBillSearchCoinDialog;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C95621(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C95621) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41669n interfaceC41669n = this.this$0.f16666x0;
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
    public AccountBillSearchCoinDialog$initObservers$3(AccountBillSearchCoinDialog accountBillSearchCoinDialog, Continuation<? super AccountBillSearchCoinDialog$initObservers$3> continuation) {
        super(2, continuation);
        this.this$0 = accountBillSearchCoinDialog;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AccountBillSearchCoinDialog$initObservers$3(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AccountBillSearchCoinDialog$initObservers$3) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            C95621 c95621 = new C95621(accountBillSearchCoinDialog, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(accountBillSearchCoinDialog, state, c95621, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
