package com.kubi.core.biz.margininfo.dialog;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.kubi.utils.extensions.C27041f;
import java.util.ArrayList;
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
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: UnifyLoanCurrencySelectDialog.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.margininfo.dialog.UnifyLoanCurrencySelectDialog$initObservers$2", m90122f = "UnifyLoanCurrencySelectDialog.kt", m90123i = {}, m90124l = {162}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class UnifyLoanCurrencySelectDialog$initObservers$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ UnifyLoanCurrencySelectDialog this$0;

    /* JADX INFO: renamed from: com.kubi.core.biz.margininfo.dialog.UnifyLoanCurrencySelectDialog$initObservers$2$1 */
    /* JADX INFO: compiled from: UnifyLoanCurrencySelectDialog.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.margininfo.dialog.UnifyLoanCurrencySelectDialog$initObservers$2$1", m90122f = "UnifyLoanCurrencySelectDialog.kt", m90123i = {}, m90124l = {163}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C119331 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ UnifyLoanCurrencySelectDialog this$0;

        /* JADX INFO: renamed from: com.kubi.core.biz.margininfo.dialog.UnifyLoanCurrencySelectDialog$initObservers$2$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: UnifyLoanCurrencySelectDialog.kt */
        @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "text", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "com.kubi.core.biz.margininfo.dialog.UnifyLoanCurrencySelectDialog$initObservers$2$1$1", m90122f = "UnifyLoanCurrencySelectDialog.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        @SourceDebugExtension({"SMAP\nUnifyLoanCurrencySelectDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyLoanCurrencySelectDialog.kt\ncom/kubi/core/biz/margininfo/dialog/UnifyLoanCurrencySelectDialog$initObservers$2$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,250:1\n774#2:251\n865#2,2:252\n*S KotlinDebug\n*F\n+ 1 UnifyLoanCurrencySelectDialog.kt\ncom/kubi/core/biz/margininfo/dialog/UnifyLoanCurrencySelectDialog$initObservers$2$1$1\n*L\n167#1:251\n167#1:252,2\n*E\n"})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ UnifyLoanCurrencySelectDialog this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UnifyLoanCurrencySelectDialog unifyLoanCurrencySelectDialog, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = unifyLoanCurrencySelectDialog;
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
                List list;
                String str = (String) this.L$0;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (StringsKt.isBlank(C27041f.m66668h(str))) {
                    list = this.this$0.f20455u0;
                } else {
                    List list2 = this.this$0.f20455u0;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list2) {
                        UnifyLoanCurrencySelectDialog.LoanCurrencyItem loanCurrencyItem = (UnifyLoanCurrencySelectDialog.LoanCurrencyItem) obj2;
                        String currency = loanCurrencyItem.getCurrency();
                        if ((currency != null && StringsKt.contains((CharSequence) currency, (CharSequence) C27041f.m66668h(str), true)) || StringsKt.contains((CharSequence) loanCurrencyItem.getName(), (CharSequence) C27041f.m66668h(str), true)) {
                            arrayList.add(obj2);
                        }
                    }
                    list = arrayList;
                }
                this.this$0.f20453s0.setValue(list);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119331(UnifyLoanCurrencySelectDialog unifyLoanCurrencySelectDialog, Continuation<? super C119331> continuation) {
            super(2, continuation);
            this.this$0 = unifyLoanCurrencySelectDialog;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C119331(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C119331) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41669n interfaceC41669n = this.this$0.f20454t0;
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
    public UnifyLoanCurrencySelectDialog$initObservers$2(UnifyLoanCurrencySelectDialog unifyLoanCurrencySelectDialog, Continuation<? super UnifyLoanCurrencySelectDialog$initObservers$2> continuation) {
        super(2, continuation);
        this.this$0 = unifyLoanCurrencySelectDialog;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnifyLoanCurrencySelectDialog$initObservers$2(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((UnifyLoanCurrencySelectDialog$initObservers$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            UnifyLoanCurrencySelectDialog unifyLoanCurrencySelectDialog = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            C119331 c119331 = new C119331(unifyLoanCurrencySelectDialog, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(unifyLoanCurrencySelectDialog, state, c119331, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
