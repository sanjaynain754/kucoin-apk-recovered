package androidx.datastore.core;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: DataMigrationInitializer.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(m90083d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u0001H\u008a@"}, m90084d2 = {"<anonymous>", "T", "startingData"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", m90122f = "DataMigrationInitializer.kt", m90123i = {0, 0}, m90124l = {44, 46}, m90125m = "invokeSuspend", m90126n = {"migration", "data"}, m90127s = {"L$2", "L$3"})
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDataMigrationInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataMigrationInitializer.kt\nandroidx/datastore/core/DataMigrationInitializer$Companion$runMigrations$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,72:1\n1789#2,3:73\n*S KotlinDebug\n*F\n+ 1 DataMigrationInitializer.kt\nandroidx/datastore/core/DataMigrationInitializer$Companion$runMigrations$2\n*L\n43#1:73,3\n*E\n"})
public final class DataMigrationInitializer$Companion$runMigrations$2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> {
    final /* synthetic */ java.util.List<kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> $cleanUps;
    final /* synthetic */ java.util.List<androidx.datastore.core.DataMigration<T>> $migrations;
    /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    int label;

    public DataMigrationInitializer$Companion$runMigrations$2(java.util.List<? extends androidx.datastore.core.DataMigration<T>> r1, java.util.List<kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> r2, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2> r3) {
            r0 = this;
            r0.$migrations = r1
            r0.$cleanUps = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r5) {
            r3 = this;
            androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2 r0 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2
            java.util.List<androidx.datastore.core.DataMigration<T>> r1 = r3.$migrations
            java.util.List<kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> r2 = r3.$cleanUps
            r0.<init>(r1, r2, r5)
            r0.L$0 = r4
            return r0
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r1 = r0.invoke(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(T r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super T> r2) {
            r0 = this;
            kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
            androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2 r1 = (androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L37
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            java.lang.Object r1 = r9.L$1
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r4 = r9.L$0
            java.util.List r4 = (java.util.List) r4
            kotlin.ResultKt.throwOnFailure(r10)
            goto L44
        L1a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L22:
            java.lang.Object r1 = r9.L$3
            java.lang.Object r4 = r9.L$2
            androidx.datastore.core.DataMigration r4 = (androidx.datastore.core.DataMigration) r4
            java.lang.Object r5 = r9.L$1
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r9.L$0
            java.util.List r6 = (java.util.List) r6
            kotlin.ResultKt.throwOnFailure(r10)
            r8 = r6
            r6 = r4
            r4 = r8
            goto L66
        L37:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.Object r10 = r9.L$0
            java.util.List<androidx.datastore.core.DataMigration<T>> r1 = r9.$migrations
            java.util.List<kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> r4 = r9.$cleanUps
            java.util.Iterator r1 = r1.iterator()
        L44:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L8c
            java.lang.Object r5 = r1.next()
            androidx.datastore.core.DataMigration r5 = (androidx.datastore.core.DataMigration) r5
            r9.L$0 = r4
            r9.L$1 = r1
            r9.L$2 = r5
            r9.L$3 = r10
            r9.label = r3
            java.lang.Object r6 = r5.shouldMigrate(r10, r9)
            if (r6 != r0) goto L61
            goto L87
        L61:
            r8 = r1
            r1 = r10
            r10 = r6
            r6 = r5
            r5 = r8
        L66:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L8a
            androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1 r10 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1
            r7 = 0
            r10.<init>(r6, r7)
            r4.add(r10)
            r9.L$0 = r4
            r9.L$1 = r5
            r9.L$2 = r7
            r9.L$3 = r7
            r9.label = r2
            java.lang.Object r10 = r6.migrate(r1, r9)
            if (r10 != r0) goto L88
        L87:
            return r0
        L88:
            r1 = r5
            goto L44
        L8a:
            r10 = r1
            goto L88
        L8c:
            return r10
    }
}
