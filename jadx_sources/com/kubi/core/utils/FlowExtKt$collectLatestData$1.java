package com.kubi.core.utils;

import androidx.exifinterface.media.ExifInterface;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: FlowExt.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.utils.FlowExtKt$collectLatestData$1", m90122f = "FlowExt.kt", m90123i = {}, m90124l = {29}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FlowExtKt$collectLatestData$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<T, Continuation<? super Unit>, Object> $action;
    final /* synthetic */ InterfaceC41634e<T> $flow;
    int label;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.kubi.core.utils.FlowExtKt$collectLatestData$1$1 */
    /* JADX INFO: compiled from: FlowExt.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.utils.FlowExtKt$collectLatestData$1$1", m90122f = "FlowExt.kt", m90123i = {0}, m90124l = {30}, m90125m = "invokeSuspend", m90126n = {"it"}, m90127s = {"L$0"})
    public static final class C124601<T> extends SuspendLambda implements Function2<T, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<T, Continuation<? super Unit>, Object> $action;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C124601(Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C124601> continuation) {
            super(2, continuation);
            this.$action = function2;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C124601 c124601 = new C124601(this.$action, continuation);
            c124601.L$0 = obj;
            return c124601;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(T t11, Continuation<? super Unit> continuation) {
            return ((C124601) create(t11, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.kubi.core.utils.FlowExtKt$collectLatestData$1$1<T> for r4v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = r4.L$0
                java.lang.Object r1 = p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r4.label
                r3 = 1
                if (r2 == 0) goto L19
                if (r2 != r3) goto L11
                p852kotlin.ResultKt.throwOnFailure(r5)
                goto L2d
            L11:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L19:
                p852kotlin.ResultKt.throwOnFailure(r5)
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r5 = r4.$action
                java.lang.Object r2 = p852kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
                r4.L$0 = r2
                r4.label = r3
                java.lang.Object r5 = r5.invoke(r0, r4)
                if (r5 != r1) goto L2d
                return r1
            L2d:
                kotlin.Unit r5 = p852kotlin.Unit.INSTANCE
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kubi.core.utils.FlowExtKt$collectLatestData$1.C124601.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowExtKt$collectLatestData$1(InterfaceC41634e<? extends T> interfaceC41634e, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super FlowExtKt$collectLatestData$1> continuation) {
        super(2, continuation);
        this.$flow = interfaceC41634e;
        this.$action = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FlowExtKt$collectLatestData$1(this.$flow, this.$action, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FlowExtKt$collectLatestData$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC41634e<T> interfaceC41634e = this.$flow;
            C124601 c124601 = new C124601(this.$action, null);
            this.label = 1;
            if (C41636g.m90925l(interfaceC41634e, c124601, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
