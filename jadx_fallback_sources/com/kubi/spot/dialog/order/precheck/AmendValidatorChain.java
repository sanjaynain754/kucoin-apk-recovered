package com.kubi.spot.dialog.order.precheck;

/* JADX INFO: compiled from: AmendValidatorChain.kt */
/* JADX INFO: loaded from: classes47.dex */
@kotlin.Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0086@¢\u0006\u0002\u0010\rR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/spot/dialog/order/precheck/AmendValidatorChain;", "", "validators", "", "Lcom/kubi/spot/dialog/order/precheck/AmendPreCheck;", "<init>", "(Ljava/util/List;)V", "validate", "Lcom/kubi/spot/dialog/order/model/ValidationResult;", "context", "Lcom/kubi/spot/dialog/order/model/AmendContext;", "entity", "Lcom/kubi/data/entity/SymbolInfoEntity;", "(Lcom/kubi/spot/dialog/order/model/AmendContext;Lcom/kubi/data/entity/SymbolInfoEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAmendValidatorChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AmendValidatorChain.kt\ncom/kubi/spot/dialog/order/precheck/AmendValidatorChain\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,21:1\n1869#2,2:22\n*S KotlinDebug\n*F\n+ 1 AmendValidatorChain.kt\ncom/kubi/spot/dialog/order/precheck/AmendValidatorChain\n*L\n15#1:22,2\n*E\n"})
public final class AmendValidatorChain {

    /* JADX INFO: renamed from: a */
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.kubi.spot.dialog.order.precheck.InterfaceC25301a> f50541a;

    public AmendValidatorChain(@org.jetbrains.annotations.NotNull java.util.List<? extends com.kubi.spot.dialog.order.precheck.InterfaceC25301a> r2) {
            r1 = this;
            java.lang.String r0 = "validators"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.f50541a = r2
            return
    }

    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: a */
    public final java.lang.Object m61740a(@org.jetbrains.annotations.NotNull com.kubi.spot.dialog.order.model.AmendContext r11, @org.jetbrains.annotations.Nullable com.kubi.data.entity.SymbolInfoEntity r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.kubi.spot.dialog.order.model.ValidationResult> r13) {
            r10 = this;
            boolean r0 = r13 instanceof com.kubi.spot.dialog.order.precheck.AmendValidatorChain$validate$1
            if (r0 == 0) goto L13
            r0 = r13
            com.kubi.spot.dialog.order.precheck.AmendValidatorChain$validate$1 r0 = (com.kubi.spot.dialog.order.precheck.AmendValidatorChain$validate$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.kubi.spot.dialog.order.precheck.AmendValidatorChain$validate$1 r0 = new com.kubi.spot.dialog.order.precheck.AmendValidatorChain$validate$1
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L4d
            if (r2 != r4) goto L45
            int r11 = r0.I$0
            java.lang.Object r12 = r0.L$5
            com.kubi.spot.dialog.order.precheck.a r12 = (com.kubi.spot.dialog.order.precheck.InterfaceC25301a) r12
            java.lang.Object r12 = r0.L$3
            java.util.Iterator r12 = (java.util.Iterator) r12
            java.lang.Object r2 = r0.L$2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.Object r5 = r0.L$1
            com.kubi.data.entity.SymbolInfoEntity r5 = (com.kubi.data.entity.SymbolInfoEntity) r5
            java.lang.Object r6 = r0.L$0
            com.kubi.spot.dialog.order.model.AmendContext r6 = (com.kubi.spot.dialog.order.model.AmendContext) r6
            kotlin.ResultKt.throwOnFailure(r13)
            r9 = r12
            r12 = r11
            r11 = r6
            r6 = r2
            r2 = r9
            goto L8f
        L45:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L4d:
            kotlin.ResultKt.throwOnFailure(r13)
            java.util.List<com.kubi.spot.dialog.order.precheck.a> r13 = r10.f50541a
            java.util.Iterator r2 = r13.iterator()
            r5 = r13
            r13 = r12
            r12 = r3
        L59:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L9b
            java.lang.Object r6 = r2.next()
            r7 = r6
            com.kubi.spot.dialog.order.precheck.a r7 = (com.kubi.spot.dialog.order.precheck.InterfaceC25301a) r7
            r0.L$0 = r11
            r0.L$1 = r13
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r0.L$2 = r8
            r0.L$3 = r2
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r0.L$4 = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r0.L$5 = r6
            r0.I$0 = r12
            r0.I$1 = r3
            r0.label = r4
            java.lang.Object r6 = r7.mo61741a(r11, r13, r0)
            if (r6 != r1) goto L8b
            return r1
        L8b:
            r9 = r5
            r5 = r13
            r13 = r6
            r6 = r9
        L8f:
            com.kubi.spot.dialog.order.model.ValidationResult r13 = (com.kubi.spot.dialog.order.model.ValidationResult) r13
            boolean r7 = r13.m61737b()
            if (r7 != 0) goto L98
            return r13
        L98:
            r13 = r5
            r5 = r6
            goto L59
        L9b:
            com.kubi.spot.dialog.order.model.ValidationResult$Companion r11 = com.kubi.spot.dialog.order.model.ValidationResult.f50531e
            com.kubi.spot.dialog.order.model.ValidationResult r11 = r11.success()
            return r11
    }
}
