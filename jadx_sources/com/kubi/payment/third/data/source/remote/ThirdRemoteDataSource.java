package com.kubi.payment.third.data.source.remote;

import com.kubi.otc.entity.FiatUserInfo;
import com.kubi.payment.third.data.entities.ThirdKycInfo;
import com.kubi.payment.third.data.entities.ThirdOrder;
import com.kubi.payment.third.data.entities.ThirdOrderRequest;
import com.kubi.payment.third.data.entities.ThirdQuoteInfo;
import com.kubi.payment.third.data.entities.ThirdQuoteRequest;
import com.kubi.sdk.base.entity.BaseEntity;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.Map;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ThirdRemoteDataSource.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0086@¢\u0006\u0002\u0010\u000bJ\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\tH\u0086@¢\u0006\u0002\u0010\u000bJ\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@¢\u0006\u0002\u0010\u0012J\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\t2\u0006\u0010\u0015\u001a\u00020\u0016H\u0086@¢\u0006\u0002\u0010\u0017J(\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0086@¢\u0006\u0002\u0010\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/payment/third/data/source/remote/ThirdRemoteDataSource;", "", "webService", "Lcom/kubi/payment/third/data/source/remote/ThirdWebService;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lcom/kubi/payment/third/data/source/remote/ThirdWebService;Lkotlinx/coroutines/CoroutineDispatcher;)V", "loadUserInfo", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Lcom/kubi/otc/entity/FiatUserInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadCheckKycExist", "Lcom/kubi/payment/third/data/entities/ThirdKycInfo;", "loadQuoteThirdInfo", "Lcom/kubi/payment/third/data/entities/ThirdQuoteInfo;", "quoteRequest", "Lcom/kubi/payment/third/data/entities/ThirdQuoteRequest;", "(Lcom/kubi/payment/third/data/entities/ThirdQuoteRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadCreateOrder", "Lcom/kubi/payment/third/data/entities/ThirdOrder;", "orderRequest", "Lcom/kubi/payment/third/data/entities/ThirdOrderRequest;", "(Lcom/kubi/payment/third/data/entities/ThirdOrderRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadCompleteKycInfo", ReportDataTable.COLUMN_PARAMS, "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ThirdRemoteDataSource {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ThirdWebService f40227a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final AbstractC41697j0 f40228b;

    public ThirdRemoteDataSource(@NotNull ThirdWebService webService, @NotNull AbstractC41697j0 dispatcher) {
        Intrinsics.checkNotNullParameter(webService, "webService");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f40227a = webService;
        this.f40228b = dispatcher;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Object m49546b(@NotNull Continuation<? super BaseEntity<ThirdKycInfo>> continuation) {
        return C41686h.m91049g(this.f40228b, new ThirdRemoteDataSource$loadCheckKycExist$2(this, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object m49547c(@NotNull Map<String, String> map, @NotNull Continuation<? super BaseEntity<Object>> continuation) {
        return C41686h.m91049g(this.f40228b, new ThirdRemoteDataSource$loadCompleteKycInfo$2(this, map, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Object m49548d(@NotNull ThirdOrderRequest thirdOrderRequest, @NotNull Continuation<? super BaseEntity<ThirdOrder>> continuation) {
        return C41686h.m91049g(this.f40228b, new ThirdRemoteDataSource$loadCreateOrder$2(this, thirdOrderRequest, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final Object m49549e(@NotNull ThirdQuoteRequest thirdQuoteRequest, @NotNull Continuation<? super BaseEntity<ThirdQuoteInfo>> continuation) {
        return C41686h.m91049g(this.f40228b, new ThirdRemoteDataSource$loadQuoteThirdInfo$2(this, thirdQuoteRequest, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final Object m49550f(@NotNull Continuation<? super BaseEntity<FiatUserInfo>> continuation) {
        return C41686h.m91049g(this.f40228b, new ThirdRemoteDataSource$loadUserInfo$2(this, null), continuation);
    }
}
