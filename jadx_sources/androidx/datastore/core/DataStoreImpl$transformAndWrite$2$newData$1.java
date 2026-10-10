package androidx.datastore.core;

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

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: DataStoreImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/m0;", "<anonymous>"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1", m90122f = "DataStoreImpl.kt", m90123i = {}, m90124l = {331}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class DataStoreImpl$transformAndWrite$2$newData$1<T> extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super T>, Object> {
    final /* synthetic */ Data<T> $curData;
    final /* synthetic */ Function2<T, Continuation<? super T>, Object> $transform;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DataStoreImpl$transformAndWrite$2$newData$1(Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, Data<T> data, Continuation<? super DataStoreImpl$transformAndWrite$2$newData$1> continuation) {
        super(2, continuation);
        this.$transform = function2;
        this.$curData = data;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new DataStoreImpl$transformAndWrite$2$newData$1(this.$transform, this.$curData, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super T> continuation) {
        return ((DataStoreImpl$transformAndWrite$2$newData$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1<T> for r3v1 'this'  java.lang.Object
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
            return r4
        Lf:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L17:
            p852kotlin.ResultKt.throwOnFailure(r4)
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> r4 = r3.$transform
            androidx.datastore.core.Data<T> r1 = r3.$curData
            java.lang.Object r1 = r1.getValue()
            r3.label = r2
            java.lang.Object r4 = r4.invoke(r1, r3)
            if (r4 != r0) goto L2b
            return r0
        L2b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
