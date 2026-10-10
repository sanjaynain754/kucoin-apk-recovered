package cn;

import com.kubi.kyc.api.KycInfoEntity;
import com.kubi.kyc.data.entity.KycClearInfoEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.GET;

/* JADX INFO: renamed from: cn.a */
/* JADX INFO: compiled from: KycRemoteService.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0002\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/kyc/data/source/KycRemoteService;", "", "loadKycResult", "Lcom/kubi/kyc/api/KycInfoEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadKycClearInfo", "Lcom/kubi/kyc/data/entity/KycClearInfoEntity;", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC5014a {
    @GET("v1/kyc/clear/info")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m5428a(@NotNull Continuation<? super KycClearInfoEntity> continuation) throws Exception;

    @GET("v1/kyc/result")
    @Nullable
    /* JADX INFO: renamed from: b */
    Object m5429b(@NotNull Continuation<? super KycInfoEntity> continuation) throws Exception;
}
