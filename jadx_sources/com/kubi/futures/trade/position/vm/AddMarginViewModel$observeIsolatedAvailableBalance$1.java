package com.kubi.futures.trade.position.vm;

import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.kumex.utils.Log;
import java.math.BigDecimal;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AddMarginViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.trade.position.vm.AddMarginViewModel$observeIsolatedAvailableBalance$1", m90122f = "AddMarginViewModel.kt", m90123i = {}, m90124l = {287, 296}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AddMarginViewModel$observeIsolatedAvailableBalance$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $currency;
    int label;
    final /* synthetic */ AddMarginViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.futures.trade.position.vm.AddMarginViewModel$observeIsolatedAvailableBalance$1$1 */
    /* JADX INFO: compiled from: AddMarginViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.futures.trade.position.vm.AddMarginViewModel$observeIsolatedAvailableBalance$1$1", m90122f = "AddMarginViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C140361 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ String $currency;
        int label;
        final /* synthetic */ AddMarginViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140361(String str, AddMarginViewModel addMarginViewModel, Continuation<? super C140361> continuation) {
            super(1, continuation);
            this.$currency = str;
            this.this$0 = addMarginViewModel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C140361(this.$currency, this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C140361) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BigDecimal bigDecimalMo93940t = MultiBizFacadeManager.m20259p(MultiBizFacadeManager.f19232a, null, 1, null).mo93940t(this.$currency);
                if (bigDecimalMo93940t != null) {
                    this.this$0.m27790a0().postValue(bigDecimalMo93940t);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddMarginViewModel$observeIsolatedAvailableBalance$1(String str, AddMarginViewModel addMarginViewModel, Continuation<? super AddMarginViewModel$observeIsolatedAvailableBalance$1> continuation) {
        super(2, continuation);
        this.$currency = str;
        this.this$0 = addMarginViewModel;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m27801f(AddMarginViewModel addMarginViewModel, Throwable th2) {
        Log.f30813a.m36615a(addMarginViewModel.f24265a0, "observeIsolatedAvailableBalance poll error: " + th2.getMessage());
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddMarginViewModel$observeIsolatedAvailableBalance$1(this.$currency, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AddMarginViewModel$observeIsolatedAvailableBalance$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0038  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0040 -> B:11:0x001e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L1b
        Lf:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L17:
            p852kotlin.ResultKt.throwOnFailure(r7)
            goto L38
        L1b:
            p852kotlin.ResultKt.throwOnFailure(r7)
        L1e:
            com.kubi.futures.trade.position.vm.AddMarginViewModel$observeIsolatedAvailableBalance$1$1 r7 = new com.kubi.futures.trade.position.vm.AddMarginViewModel$observeIsolatedAvailableBalance$1$1
            java.lang.String r1 = r6.$currency
            com.kubi.futures.trade.position.vm.AddMarginViewModel r4 = r6.this$0
            r5 = 0
            r7.<init>(r1, r4, r5)
            com.kubi.futures.trade.position.vm.AddMarginViewModel r1 = r6.this$0
            com.kubi.futures.trade.position.vm.g r4 = new com.kubi.futures.trade.position.vm.g
            r4.<init>()
            r6.label = r3
            java.lang.Object r7 = com.kubi.kumex.utils.CoroutineExKt.m36471a(r7, r4, r6)
            if (r7 != r0) goto L38
            goto L42
        L38:
            r6.label = r2
            r4 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r7 = kotlinx.coroutines.DelayKt.m90350b(r4, r6)
            if (r7 != r0) goto L1e
        L42:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kubi.futures.trade.position.vm.AddMarginViewModel$observeIsolatedAvailableBalance$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
