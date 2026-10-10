package com.kubi.payment.data.source.remote;

import com.kubi.otc.entity.FiatUserInfo;
import com.kubi.payment.data.entities.KycInfo;
import com.kubi.payment.data.entities.MiddleGroundResource;
import com.kubi.payment.data.entities.TermInfo;
import com.kubi.payment.data.entities.UserInfo;
import com.kubi.payment.data.entities.VersionCheck;
import com.kubi.sdk.base.entity.BaseEntity;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PaymentRemoteDataSource.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\rJ\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\u0006\u0010\u000b\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u0011J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\t2\u0006\u0010\u000b\u001a\u00020\u0014H\u0086@¢\u0006\u0002\u0010\u0015J\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\tH\u0086@¢\u0006\u0002\u0010\u0018J.\u0010\u0019\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001a0\t2\u0006\u0010\u001e\u001a\u00020\u001bH\u0086@¢\u0006\u0002\u0010\u001fJ\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\t2\u0006\u0010\u000b\u001a\u00020\"H\u0086@¢\u0006\u0002\u0010#R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m90084d2 = {"Lcom/kubi/payment/data/source/remote/PaymentRemoteDataSource;", "", "webService", "Lcom/kubi/payment/data/source/remote/PaymentWebService;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lcom/kubi/payment/data/source/remote/PaymentWebService;Lkotlinx/coroutines/CoroutineDispatcher;)V", "loadVersionCheck", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Lcom/kubi/payment/data/entities/VersionCheck$Response;", "request", "Lcom/kubi/payment/data/entities/VersionCheck$Request;", "(Lcom/kubi/payment/data/entities/VersionCheck$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadUserInfo", "Lcom/kubi/payment/data/entities/UserInfo$Response;", "Lcom/kubi/payment/data/entities/UserInfo$Request;", "(Lcom/kubi/payment/data/entities/UserInfo$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadKycInfo", "Lcom/kubi/payment/data/entities/KycInfo$Response;", "Lcom/kubi/payment/data/entities/KycInfo$Request;", "(Lcom/kubi/payment/data/entities/KycInfo$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadOldUserInfo", "Lcom/kubi/otc/entity/FiatUserInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadMiddleGroundResource", "", "", "", "Lcom/kubi/payment/data/entities/MiddleGroundResource;", "code", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadTermInfo", "Lcom/kubi/payment/data/entities/TermInfo$Response;", "Lcom/kubi/payment/data/entities/TermInfo$Request;", "(Lcom/kubi/payment/data/entities/TermInfo$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PaymentRemoteDataSource {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final PaymentWebService f38532a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final AbstractC41697j0 f38533b;

    public PaymentRemoteDataSource(@NotNull PaymentWebService webService, @NotNull AbstractC41697j0 ioDispatcher) {
        Intrinsics.checkNotNullParameter(webService, "webService");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f38532a = webService;
        this.f38533b = ioDispatcher;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Object m46270b(@NotNull KycInfo.Request request, @NotNull Continuation<? super BaseEntity<KycInfo.Response>> continuation) {
        return C41686h.m91049g(this.f38533b, new PaymentRemoteDataSource$loadKycInfo$2(this, request, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object m46271c(@NotNull String str, @NotNull Continuation<? super BaseEntity<Map<String, List<MiddleGroundResource>>>> continuation) {
        return C41686h.m91049g(this.f38533b, new PaymentRemoteDataSource$loadMiddleGroundResource$2(this, str, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Object m46272d(@NotNull Continuation<? super BaseEntity<FiatUserInfo>> continuation) {
        return C41686h.m91049g(this.f38533b, new PaymentRemoteDataSource$loadOldUserInfo$2(this, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final Object m46273e(@NotNull TermInfo.Request request, @NotNull Continuation<? super BaseEntity<TermInfo.Response>> continuation) {
        return C41686h.m91049g(this.f38533b, new PaymentRemoteDataSource$loadTermInfo$2(this, request, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final Object m46274f(@NotNull UserInfo.Request request, @NotNull Continuation<? super BaseEntity<UserInfo.Response>> continuation) {
        return C41686h.m91049g(this.f38533b, new PaymentRemoteDataSource$loadUserInfo$2(this, request, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final Object m46275g(@NotNull VersionCheck.Request request, @NotNull Continuation<? super BaseEntity<VersionCheck.Response>> continuation) {
        return C41686h.m91049g(this.f38533b, new PaymentRemoteDataSource$loadVersionCheck$2(this, request, null), continuation);
    }
}
