package com.kubi.search.config;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: DataSource.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.search.config.DataSource", m90122f = "DataSource.kt", m90123i = {0, 0, 0, 0, 1, 1, 1}, m90124l = {72, 78}, m90125m = "fetchFuturesData", m90126n = {"service$iv", "$this$fetchFuturesData_u24lambda_u240", "$i$f$flavor", "$i$a$-flavor-DataSource$fetchFuturesData$2", "service$iv", "$i$f$flavor", "$i$a$-flavor-DataSource$fetchFuturesData$3"}, m90127s = {"L$0", "L$1", "I$0", "I$1", "L$0", "I$0", "I$1"})
public final class DataSource$fetchFuturesData$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataSource$fetchFuturesData$1(DataSource dataSource, Continuation<? super DataSource$fetchFuturesData$1> continuation) {
        super(continuation);
        this.this$0 = dataSource;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m59112d(this);
    }
}
