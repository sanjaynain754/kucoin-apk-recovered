package com.kubi.payment.third.data.source;

import com.kubi.otc.entity.FiatUserInfo;
import com.kubi.payment.third.data.entities.ThirdKycInfo;
import com.kubi.payment.third.data.entities.ThirdOrder;
import com.kubi.payment.third.data.entities.ThirdOrderRequest;
import com.kubi.payment.third.data.entities.ThirdQuoteInfo;
import com.kubi.payment.third.data.entities.ThirdQuoteRequest;
import com.kubi.payment.third.data.source.remote.ThirdRemoteDataSource;
import com.kubi.payment.util.RepositoryExtKt;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.Map;
import kotlinx.coroutines.AbstractC41697j0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p477nt.AbstractC42878k;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ThirdRepositoryImpl.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0096@¢\u0006\u0002\u0010\u000bJ\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\tH\u0096@¢\u0006\u0002\u0010\u000bJ\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010\u0012J\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\t2\u0006\u0010\u0015\u001a\u00020\u0016H\u0096@¢\u0006\u0002\u0010\u0017J(\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\t2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0\u001bH\u0096@¢\u0006\u0002\u0010\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/payment/third/data/source/ThirdRepositoryImpl;", "Lcom/kubi/payment/third/data/source/IThirdRepository;", "remoteDataSource", "Lcom/kubi/payment/third/data/source/remote/ThirdRemoteDataSource;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lcom/kubi/payment/third/data/source/remote/ThirdRemoteDataSource;Lkotlinx/coroutines/CoroutineDispatcher;)V", "loadUserInfo", "Lcom/kubi/payment/base/Result;", "Lcom/kubi/otc/entity/FiatUserInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadCheckKycExist", "Lcom/kubi/payment/third/data/entities/ThirdKycInfo;", "loadQuoteThirdInfo", "Lcom/kubi/payment/third/data/entities/ThirdQuoteInfo;", "quoteRequest", "Lcom/kubi/payment/third/data/entities/ThirdQuoteRequest;", "(Lcom/kubi/payment/third/data/entities/ThirdQuoteRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadCreateOrder", "Lcom/kubi/payment/third/data/entities/ThirdOrder;", "orderRequest", "Lcom/kubi/payment/third/data/entities/ThirdOrderRequest;", "(Lcom/kubi/payment/third/data/entities/ThirdOrderRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadCompleteKycInfo", "", ReportDataTable.COLUMN_PARAMS, "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ThirdRepositoryImpl implements IThirdRepository {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ThirdRemoteDataSource f40225a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final AbstractC41697j0 f40226b;

    public ThirdRepositoryImpl(@NotNull ThirdRemoteDataSource remoteDataSource, @NotNull AbstractC41697j0 dispatcher) {
        Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f40225a = remoteDataSource;
        this.f40226b = dispatcher;
    }

    @Override // com.kubi.payment.third.data.source.IThirdRepository
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo49540a(@NotNull Continuation<? super AbstractC42878k<FiatUserInfo>> continuation) {
        return RepositoryExtKt.m49806a(this.f40226b, new ThirdRepositoryImpl$loadUserInfo$2(this, null), continuation);
    }

    @Override // com.kubi.payment.third.data.source.IThirdRepository
    @Nullable
    /* JADX INFO: renamed from: b */
    public Object mo49541b(@NotNull Continuation<? super AbstractC42878k<ThirdKycInfo>> continuation) {
        return RepositoryExtKt.m49806a(this.f40226b, new ThirdRepositoryImpl$loadCheckKycExist$2(this, null), continuation);
    }

    @Override // com.kubi.payment.third.data.source.IThirdRepository
    @Nullable
    /* JADX INFO: renamed from: c */
    public Object mo49542c(@NotNull Map<String, String> map, @NotNull Continuation<? super AbstractC42878k<? extends Object>> continuation) {
        return RepositoryExtKt.m49806a(this.f40226b, new ThirdRepositoryImpl$loadCompleteKycInfo$2(this, map, null), continuation);
    }

    @Override // com.kubi.payment.third.data.source.IThirdRepository
    @Nullable
    /* JADX INFO: renamed from: d */
    public Object mo49543d(@NotNull ThirdQuoteRequest thirdQuoteRequest, @NotNull Continuation<? super AbstractC42878k<ThirdQuoteInfo>> continuation) {
        return RepositoryExtKt.m49806a(this.f40226b, new ThirdRepositoryImpl$loadQuoteThirdInfo$2(this, thirdQuoteRequest, null), continuation);
    }

    @Override // com.kubi.payment.third.data.source.IThirdRepository
    @Nullable
    /* JADX INFO: renamed from: e */
    public Object mo49544e(@NotNull ThirdOrderRequest thirdOrderRequest, @NotNull Continuation<? super AbstractC42878k<ThirdOrder>> continuation) {
        return RepositoryExtKt.m49806a(this.f40226b, new ThirdRepositoryImpl$loadCreateOrder$2(this, thirdOrderRequest, null), continuation);
    }
}
