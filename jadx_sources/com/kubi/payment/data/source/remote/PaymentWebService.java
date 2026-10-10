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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: com.kubi.payment.data.source.remote.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: PaymentWebService.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u000fJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003H§@¢\u0006\u0002\u0010\u0012J0\u0010\u0013\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00140\u00032\b\b\u0001\u0010\u0018\u001a\u00020\u0015H§@¢\u0006\u0002\u0010\u0019J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u001cH§@¢\u0006\u0002\u0010\u001dø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001eÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/payment/data/source/remote/PaymentWebService;", "", "loadVersionCheck", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Lcom/kubi/payment/data/entities/VersionCheck$Response;", "request", "Lcom/kubi/payment/data/entities/VersionCheck$Request;", "(Lcom/kubi/payment/data/entities/VersionCheck$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadUserInfo", "Lcom/kubi/payment/data/entities/UserInfo$Response;", "Lcom/kubi/payment/data/entities/UserInfo$Request;", "(Lcom/kubi/payment/data/entities/UserInfo$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadKycInfo", "Lcom/kubi/payment/data/entities/KycInfo$Response;", "Lcom/kubi/payment/data/entities/KycInfo$Request;", "(Lcom/kubi/payment/data/entities/KycInfo$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadOldUserInfo", "Lcom/kubi/otc/entity/FiatUserInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadMiddleGroundResource", "", "", "", "Lcom/kubi/payment/data/entities/MiddleGroundResource;", "code", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadTermInfo", "Lcom/kubi/payment/data/entities/TermInfo$Response;", "Lcom/kubi/payment/data/entities/TermInfo$Request;", "(Lcom/kubi/payment/data/entities/TermInfo$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface PaymentWebService {
    @GET("v1/common/get/userInfo")
    @Nullable
    /* JADX INFO: renamed from: C */
    Object m46276C(@NotNull Continuation<? super BaseEntity<FiatUserInfo>> continuation);

    @POST("pmtapi/user/info")
    @Nullable
    /* JADX INFO: renamed from: E */
    Object m46277E(@Body @NotNull UserInfo.Request request, @NotNull Continuation<? super BaseEntity<UserInfo.Response>> continuation);

    @GET("v1/platform-resource-position/position")
    @Nullable
    /* JADX INFO: renamed from: K */
    Object m46278K(@NotNull @Query("code") String str, @NotNull Continuation<? super BaseEntity<Map<String, List<MiddleGroundResource>>>> continuation);

    @POST("pmtapi/config/agreement/query")
    @Nullable
    /* JADX INFO: renamed from: U */
    Object m46279U(@Body @NotNull TermInfo.Request request, @NotNull Continuation<? super BaseEntity<TermInfo.Response>> continuation);

    @POST("pmtapi/v1/user/kyc/info")
    @Nullable
    /* JADX INFO: renamed from: f */
    Object m46280f(@Body @NotNull KycInfo.Request request, @NotNull Continuation<? super BaseEntity<KycInfo.Response>> continuation);

    @POST("pmtapi/v1/app/limit/check")
    @Nullable
    /* JADX INFO: renamed from: n */
    Object m46281n(@Body @NotNull VersionCheck.Request request, @NotNull Continuation<? super BaseEntity<VersionCheck.Response>> continuation);
}
