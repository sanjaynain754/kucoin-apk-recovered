package androidx.datastore.core;

/* JADX INFO: compiled from: DataMigrationInitializer.kt */
/* JADX INFO: loaded from: classes34.dex */
@kotlin.Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0002H\u008a@"}, m90084d2 = {"<anonymous>", "", "T"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", m90122f = "DataMigrationInitializer.kt", m90123i = {}, m90124l = {45}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class DataMigrationInitializer$Companion$runMigrations$2$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.datastore.core.DataMigration<T> $migration;
    int label;

    public DataMigrationInitializer$Companion$runMigrations$2$1$1(androidx.datastore.core.DataMigration<T> r1, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1> r2) {
            r0 = this;
            r0.$migration = r1
            r1 = 1
            r0.<init>(r1, r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r3) {
            r2 = this;
            androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1 r0 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1
            androidx.datastore.core.DataMigration<T> r1 = r2.$migration
            r0.<init>(r1, r3)
            return r0
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> r1) {
            r0 = this;
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r0.invoke2(r1)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(@org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r1 = this;
            kotlin.coroutines.Continuation r2 = r1.create(r2)
            androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1 r2 = (androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1) r2
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            java.lang.Object r2 = r2.invokeSuspend(r0)
            return r2
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
            r3 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r3.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.ResultKt.throwOnFailure(r4)
            goto L25
        Lf:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L17:
            kotlin.ResultKt.throwOnFailure(r4)
            androidx.datastore.core.DataMigration<T> r4 = r3.$migration
            r3.label = r2
            java.lang.Object r4 = r4.cleanUp(r3)
            if (r4 != r0) goto L25
            return r0
        L25:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
    }
}
