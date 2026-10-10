package com.kubi.network.retrofit.utils;

import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: RetrofitFlowEx.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u0001H\u0002H\u008a@"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.network.retrofit.utils.RetrofitFlowExKt$onSuccess$3", m90122f = "RetrofitFlowEx.kt", m90123i = {}, m90124l = {118}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nRetrofitFlowEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt$onSuccess$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,184:1\n1#2:185\n*E\n"})
public final class RetrofitFlowExKt$onSuccess$3<T> extends SuspendLambda implements Function2<T, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<T, Continuation<? super Unit>, Object> $block;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RetrofitFlowExKt$onSuccess$3(Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super RetrofitFlowExKt$onSuccess$3> continuation) {
        super(2, continuation);
        this.$block = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        RetrofitFlowExKt$onSuccess$3 retrofitFlowExKt$onSuccess$3 = new RetrofitFlowExKt$onSuccess$3(this.$block, continuation);
        retrofitFlowExKt$onSuccess$3.L$0 = obj;
        return retrofitFlowExKt$onSuccess$3;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@Nullable T t11, @Nullable Continuation<? super Unit> continuation) {
        return ((RetrofitFlowExKt$onSuccess$3) create(t11, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.kubi.network.retrofit.utils.RetrofitFlowExKt$onSuccess$3<T> for r3v1 'this'  java.lang.Object
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
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            p852kotlin.ResultKt.throwOnFailure(r4)
            goto L29
        Lf:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L17:
            p852kotlin.ResultKt.throwOnFailure(r4)
            java.lang.Object r4 = r3.L$0
            if (r4 == 0) goto L29
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r1 = r3.$block
            r3.label = r2
            java.lang.Object r4 = r1.invoke(r4, r3)
            if (r4 != r0) goto L29
            return r0
        L29:
            kotlin.Unit r4 = p852kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kubi.network.retrofit.utils.RetrofitFlowExKt$onSuccess$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
