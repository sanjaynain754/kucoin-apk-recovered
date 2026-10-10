package com.kubi.search.searchresult.datasource;

import com.kubi.search.searchresult.SearchCategory$Companion;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: RemoteSearchDataSource.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.search.searchresult.datasource.RemoteSearchDataSource", m90122f = "RemoteSearchDataSource.kt", m90123i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, m90124l = {51, 89}, m90125m = "doSearch", m90126n = {"key", "spots", SearchCategory$Companion.FUTURES, "earns", SearchCategory$Companion.WEB3, "alpha", "depositInfo", "searchResultType", "success", "$i$f$measureTimeMillis", "start$iv", "$i$a$-measureTimeMillis-RemoteSearchDataSource$doSearch$loadTime$1", "key", "spots", SearchCategory$Companion.FUTURES, "earns", SearchCategory$Companion.WEB3, "alpha", "depositInfo", "searchResultType", "success", "$i$f$measureTimeMillis", "start$iv", "$i$a$-measureTimeMillis-RemoteSearchDataSource$doSearch$loadTime$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "I$0", "J$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "I$0", "J$0", "I$1"})
public final class RemoteSearchDataSource$doSearch$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RemoteSearchDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteSearchDataSource$doSearch$1(RemoteSearchDataSource remoteSearchDataSource, Continuation<? super RemoteSearchDataSource$doSearch$1> continuation) {
        super(continuation);
        this.this$0 = remoteSearchDataSource;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m59492g(null, this);
    }
}
