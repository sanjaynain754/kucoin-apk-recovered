package com.kubi.mvi.state;

import androidx.exifinterface.media.ExifInterface;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: UniqueTaskChannel.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/m0;", "it", "", "<anonymous>"}, m90085k = 3, m90086mv = {1, 9, 0})
@DebugMetadata(m90121c = "com.kubi.mvi.state.UniqueTaskChannel$collect$1", m90122f = "UniqueTaskChannel.kt", m90123i = {0}, m90124l = {74}, m90125m = "invokeSuspend", m90126n = {"it"}, m90127s = {"L$0"})
public final class UniqueTaskChannel$collect$1<T> extends SuspendLambda implements Function3<InterfaceC41709m0, T, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<T, Continuation<? super Unit>, Object> $block;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ UniqueTaskChannel<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UniqueTaskChannel$collect$1(Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, UniqueTaskChannel<T> uniqueTaskChannel, Continuation<? super UniqueTaskChannel$collect$1> continuation) {
        super(3, continuation);
        this.$block = function2;
        this.this$0 = uniqueTaskChannel;
    }

    @Override // p852kotlin.jvm.functions.Function3
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, T t11, @Nullable Continuation<? super Unit> continuation) {
        UniqueTaskChannel$collect$1 uniqueTaskChannel$collect$1 = new UniqueTaskChannel$collect$1(this.$block, this.this$0, continuation);
        uniqueTaskChannel$collect$1.L$0 = t11;
        return uniqueTaskChannel$collect$1.invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.kubi.mvi.state.UniqueTaskChannel$collect$1<T> for r3v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r3.label
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            java.lang.Object r0 = r3.L$0
            p852kotlin.ResultKt.throwOnFailure(r4)
            goto L2c
        L11:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L19:
            p852kotlin.ResultKt.throwOnFailure(r4)
            java.lang.Object r4 = r3.L$0
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r1 = r3.$block
            r3.L$0 = r4
            r3.label = r2
            java.lang.Object r1 = r1.invoke(r4, r3)
            if (r1 != r0) goto L2b
            return r0
        L2b:
            r0 = r4
        L2c:
            com.kubi.mvi.state.UniqueTaskChannel<T> r4 = r3.this$0
            com.kubi.mvi.state.UniqueTaskChannel.m42660b(r4, r0)
            kotlin.Unit r4 = p852kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kubi.mvi.state.UniqueTaskChannel$collect$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
