package com.kubi.assets.bill;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.kubi.assets.AssetExKt;
import com.kubi.utils.extensions.C27024b;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p637ta.C44785i0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: AccountBillSearchCoinDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.bill.AccountBillSearchCoinDialog$initObservers$2", m90122f = "AccountBillSearchCoinDialog.kt", m90123i = {}, m90124l = {137}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AccountBillSearchCoinDialog$initObservers$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AccountBillSearchCoinDialog this$0;

    /* JADX INFO: renamed from: com.kubi.assets.bill.AccountBillSearchCoinDialog$initObservers$2$1 */
    /* JADX INFO: compiled from: AccountBillSearchCoinDialog.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.bill.AccountBillSearchCoinDialog$initObservers$2$1", m90122f = "AccountBillSearchCoinDialog.kt", m90123i = {}, m90124l = {138}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C95611 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AccountBillSearchCoinDialog this$0;

        /* JADX INFO: renamed from: com.kubi.assets.bill.AccountBillSearchCoinDialog$initObservers$2$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: AccountBillSearchCoinDialog.kt */
        @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "selectCurrency", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "com.kubi.assets.bill.AccountBillSearchCoinDialog$initObservers$2$1$1", m90122f = "AccountBillSearchCoinDialog.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        @SourceDebugExtension({"SMAP\nAccountBillSearchCoinDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountBillSearchCoinDialog.kt\ncom/kubi/assets/bill/AccountBillSearchCoinDialog$initObservers$2$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,283:1\n1869#2,2:284\n*S KotlinDebug\n*F\n+ 1 AccountBillSearchCoinDialog.kt\ncom/kubi/assets/bill/AccountBillSearchCoinDialog$initObservers$2$1$1\n*L\n142#1:284,2\n*E\n"})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AccountBillSearchCoinDialog this$0;

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

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(String str, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object next;
                AppCompatImageView appCompatImageView;
                String str = (String) this.L$0;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                C44128b.m97259c("SearchCoinDialog", "selectCurrency: " + str);
                C44785i0 c44785i0M15672A4 = this.this$0.m15672A4();
                if (c44785i0M15672A4 != null && (appCompatImageView = c44785i0M15672A4.f100104d) != null) {
                    AssetExKt.m15138z(appCompatImageView, str == null || StringsKt.isBlank(str));
                }
                List listM66558a = C27024b.m66558a((List) this.this$0.f16664v0.getValue());
                Iterator it = listM66558a.iterator();
                while (it.hasNext()) {
                    ((AccountBillSearchCoinDialog.SearchCoinItemInfo) it.next()).m15684h(false);
                }
                Iterator it2 = listM66558a.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!Intrinsics.areEqual(((AccountBillSearchCoinDialog.SearchCoinItemInfo) next).getCurrency(), str));
                AccountBillSearchCoinDialog.SearchCoinItemInfo searchCoinItemInfo = (AccountBillSearchCoinDialog.SearchCoinItemInfo) next;
                if (searchCoinItemInfo != null) {
                    searchCoinItemInfo.m15684h(true);
                }
                this.this$0.f16664v0.setValue(listM66558a);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C95611(AccountBillSearchCoinDialog accountBillSearchCoinDialog, Continuation<? super C95611> continuation) {
            super(2, continuation);
            this.this$0 = accountBillSearchCoinDialog;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C95611(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C95611) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41669n interfaceC41669n = this.this$0.f16665w0;
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
    public AccountBillSearchCoinDialog$initObservers$2(AccountBillSearchCoinDialog accountBillSearchCoinDialog, Continuation<? super AccountBillSearchCoinDialog$initObservers$2> continuation) {
        super(2, continuation);
        this.this$0 = accountBillSearchCoinDialog;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AccountBillSearchCoinDialog$initObservers$2(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AccountBillSearchCoinDialog$initObservers$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            C95611 c95611 = new C95611(accountBillSearchCoinDialog, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(accountBillSearchCoinDialog, state, c95611, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
