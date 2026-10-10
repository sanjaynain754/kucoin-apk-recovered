package com.kubi.tradefacade.interceptor;

import java.util.Map;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TradeRnMigrationRouteInterceptor.kt */
/* JADX INFO: loaded from: classes50.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* synthetic */ class TradeRnMigrationRouteInterceptor$migrationRoutes$1 extends FunctionReferenceImpl implements Function1<Map<String, ? extends String>, String> {
    @Override // p852kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ String invoke(Map<String, ? extends String> map) {
        return invoke2((Map<String, String>) map);
    }

    public TradeRnMigrationRouteInterceptor$migrationRoutes$1(Object obj) {
        super(1, obj, TradeRnMigrationRouteInterceptor.class, "buildMarginBorrowRepayNativeUrl", "buildMarginBorrowRepayNativeUrl(Ljava/util/Map;)Ljava/lang/String;", 0);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final String invoke2(Map<String, String> p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((TradeRnMigrationRouteInterceptor) this.receiver).m63600h(p11);
    }
}
