package com.kubi.mvi.common;

import androidx.exifinterface.media.ExifInterface;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: MviEx.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
@DebugMetadata(m90121c = "com.kubi.mvi.common.MviExKt$collectWhenStart$1", m90122f = "MviEx.kt", m90123i = {}, m90124l = {38}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class MviExKt$collectWhenStart$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<T, Continuation<? super Unit>, Object> $action;
    final /* synthetic */ InterfaceC41634e<T> $this_collectWhenStart;
    int label;

    /* JADX INFO: renamed from: com.kubi.mvi.common.MviExKt$collectWhenStart$1$a */
    /* JADX INFO: compiled from: MviEx.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class C19238a<T> implements InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function2<T, Continuation<? super Unit>, Object> f35619b;

        /* JADX WARN: Multi-variable type inference failed */
        public C19238a(Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2) {
            this.f35619b = function2;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        @Nullable
        public final Object emit(T t11, @NotNull Continuation<? super Unit> continuation) {
            Object objInvoke = this.f35619b.invoke(t11, continuation);
            return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MviExKt$collectWhenStart$1(InterfaceC41634e<? extends T> interfaceC41634e, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super MviExKt$collectWhenStart$1> continuation) {
        super(2, continuation);
        this.$this_collectWhenStart = interfaceC41634e;
        this.$action = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new MviExKt$collectWhenStart$1(this.$this_collectWhenStart, this.$action, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
        return ((MviExKt$collectWhenStart$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to com.kubi.mvi.common.MviExKt$collectWhenStart$1 for r4v1 'this'  kotlin.coroutines.Continuation
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            p852kotlin.ResultKt.throwOnFailure(r5)
            goto L2c
        Lf:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L17:
            p852kotlin.ResultKt.throwOnFailure(r5)
            kotlinx.coroutines.flow.e<T> r5 = r4.$this_collectWhenStart
            com.kubi.mvi.common.MviExKt$collectWhenStart$1$a r1 = new com.kubi.mvi.common.MviExKt$collectWhenStart$1$a
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r3 = r4.$action
            r1.<init>(r3)
            r4.label = r2
            java.lang.Object r5 = r5.collect(r1, r4)
            if (r5 != r0) goto L2c
            return r0
        L2c:
            kotlin.Unit r5 = p852kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kubi.mvi.common.MviExKt$collectWhenStart$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
