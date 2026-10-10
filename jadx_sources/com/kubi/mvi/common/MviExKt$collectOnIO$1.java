package com.kubi.mvi.common;

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
/* JADX INFO: compiled from: MviEx.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it"}, m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mvi.common.MviExKt$collectOnIO$1", m90122f = "MviEx.kt", m90123i = {}, m90124l = {296}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class MviExKt$collectOnIO$1<T> extends SuspendLambda implements Function2<T, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function3<InterfaceC41709m0, T, Continuation<? super Unit>, Object> $block;
    final /* synthetic */ InterfaceC41709m0 $scope;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MviExKt$collectOnIO$1(Function3<? super InterfaceC41709m0, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, InterfaceC41709m0 interfaceC41709m0, Continuation<? super MviExKt$collectOnIO$1> continuation) {
        super(2, continuation);
        this.$block = function3;
        this.$scope = interfaceC41709m0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        MviExKt$collectOnIO$1 mviExKt$collectOnIO$1 = new MviExKt$collectOnIO$1(this.$block, this.$scope, continuation);
        mviExKt$collectOnIO$1.L$0 = obj;
        return mviExKt$collectOnIO$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(T t11, @Nullable Continuation<? super Unit> continuation) {
        return ((MviExKt$collectOnIO$1) create(t11, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.kubi.mvi.common.MviExKt$collectOnIO$1<T> for r4v1 'this'  java.lang.Object
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
            goto L29
        Lf:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L17:
            p852kotlin.ResultKt.throwOnFailure(r5)
            java.lang.Object r5 = r4.L$0
            kotlin.jvm.functions.Function3<kotlinx.coroutines.m0, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r1 = r4.$block
            kotlinx.coroutines.m0 r3 = r4.$scope
            r4.label = r2
            java.lang.Object r5 = r1.invoke(r3, r5, r4)
            if (r5 != r0) goto L29
            return r0
        L29:
            kotlin.Unit r5 = p852kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kubi.mvi.common.MviExKt$collectOnIO$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
