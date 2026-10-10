package com.kubi.payment.data.source;

import com.kubi.otc.entity.FiatUserInfo;
import com.kubi.payment.data.entities.KycInfo;
import com.kubi.payment.data.entities.MiddleGroundResource;
import com.kubi.payment.data.entities.TermInfo;
import com.kubi.payment.data.entities.UserInfo;
import com.kubi.payment.data.entities.VersionCheck;
import com.kubi.payment.data.source.remote.PaymentRemoteDataSource;
import com.kubi.payment.util.RepositoryExtKt;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.AbstractC41697j0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p477nt.AbstractC42878k;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PaymentRepositoryImpl.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010\rJ\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\u0006\u0010\u000b\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\t2\u0006\u0010\u000b\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015J\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\tH\u0096@¢\u0006\u0002\u0010\u0018J.\u0010\u0019\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001a0\t2\u0006\u0010\u001e\u001a\u00020\u001bH\u0096@¢\u0006\u0002\u0010\u001fJ\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\t2\u0006\u0010\u000b\u001a\u00020\"H\u0096@¢\u0006\u0002\u0010#R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m90084d2 = {"Lcom/kubi/payment/data/source/PaymentRepositoryImpl;", "Lcom/kubi/payment/data/source/PaymentRepository;", "remoteDataSource", "Lcom/kubi/payment/data/source/remote/PaymentRemoteDataSource;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lcom/kubi/payment/data/source/remote/PaymentRemoteDataSource;Lkotlinx/coroutines/CoroutineDispatcher;)V", "loadVersionCheck", "Lcom/kubi/payment/base/Result;", "Lcom/kubi/payment/data/entities/VersionCheck$Response;", "request", "Lcom/kubi/payment/data/entities/VersionCheck$Request;", "(Lcom/kubi/payment/data/entities/VersionCheck$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadUserInfo", "Lcom/kubi/payment/data/entities/UserInfo$Response;", "Lcom/kubi/payment/data/entities/UserInfo$Request;", "(Lcom/kubi/payment/data/entities/UserInfo$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadKycInfo", "Lcom/kubi/payment/data/entities/KycInfo$Response;", "Lcom/kubi/payment/data/entities/KycInfo$Request;", "(Lcom/kubi/payment/data/entities/KycInfo$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadOldUserInfo", "Lcom/kubi/otc/entity/FiatUserInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadMiddleGroundResource", "", "", "", "Lcom/kubi/payment/data/entities/MiddleGroundResource;", "code", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadTermInfo", "Lcom/kubi/payment/data/entities/TermInfo$Response;", "Lcom/kubi/payment/data/entities/TermInfo$Request;", "(Lcom/kubi/payment/data/entities/TermInfo$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PaymentRepositoryImpl implements PaymentRepository {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final PaymentRemoteDataSource f38530a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final AbstractC41697j0 f38531b;

    public PaymentRepositoryImpl(@NotNull PaymentRemoteDataSource remoteDataSource, @NotNull AbstractC41697j0 ioDispatcher) {
        Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f38530a = remoteDataSource;
        this.f38531b = ioDispatcher;
    }

    @Override // com.kubi.payment.data.source.PaymentRepository
    @Nullable
    /* JADX INFO: renamed from: C */
    public Object mo46263C(@NotNull Continuation<? super AbstractC42878k<FiatUserInfo>> continuation) {
        return RepositoryExtKt.m49806a(this.f38531b, new PaymentRepositoryImpl$loadOldUserInfo$2(this, null), continuation);
    }

    @Override // com.kubi.payment.data.source.PaymentRepository
    @Nullable
    /* JADX INFO: renamed from: E */
    public Object mo46264E(@NotNull UserInfo.Request request, @NotNull Continuation<? super AbstractC42878k<UserInfo.Response>> continuation) {
        return RepositoryExtKt.m49806a(this.f38531b, new PaymentRepositoryImpl$loadUserInfo$2(this, request, null), continuation);
    }

    @Override // com.kubi.payment.data.source.PaymentRepository
    @Nullable
    /* JADX INFO: renamed from: K */
    public Object mo46265K(@NotNull String str, @NotNull Continuation<? super AbstractC42878k<? extends Map<String, ? extends List<MiddleGroundResource>>>> continuation) {
        return RepositoryExtKt.m49806a(this.f38531b, new PaymentRepositoryImpl$loadMiddleGroundResource$2(this, str, null), continuation);
    }

    @Override // com.kubi.payment.data.source.PaymentRepository
    @Nullable
    /* JADX INFO: renamed from: U */
    public Object mo46266U(@NotNull TermInfo.Request request, @NotNull Continuation<? super AbstractC42878k<TermInfo.Response>> continuation) {
        return RepositoryExtKt.m49806a(this.f38531b, new PaymentRepositoryImpl$loadTermInfo$2(this, request, null), continuation);
    }

    @Override // com.kubi.payment.data.source.PaymentRepository
    @Nullable
    /* JADX INFO: renamed from: f */
    public Object mo46267f(@NotNull KycInfo.Request request, @NotNull Continuation<? super AbstractC42878k<KycInfo.Response>> continuation) {
        return RepositoryExtKt.m49806a(this.f38531b, new PaymentRepositoryImpl$loadKycInfo$2(this, request, null), continuation);
    }

    @Override // com.kubi.payment.data.source.PaymentRepository
    @Nullable
    /* JADX INFO: renamed from: n */
    public Object mo46268n(@NotNull VersionCheck.Request request, @NotNull Continuation<? super AbstractC42878k<VersionCheck.Response>> continuation) {
        return RepositoryExtKt.m49806a(this.f38531b, new PaymentRepositoryImpl$loadVersionCheck$2(this, request, null), continuation);
    }
}
