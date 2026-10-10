package com.kubi.payment.data.source;

import androidx.annotation.WorkerThread;
import com.kubi.otc.entity.FiatUserInfo;
import com.kubi.payment.data.entities.KycInfo;
import com.kubi.payment.data.entities.MiddleGroundResource;
import com.kubi.payment.data.entities.TermInfo;
import com.kubi.payment.data.entities.UserInfo;
import com.kubi.payment.data.entities.VersionCheck;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p477nt.AbstractC42878k;
import p477nt.InterfaceC42877j;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.kubi.payment.data.source.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: PaymentRepository.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\u0005\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\u0006\u0010\u0005\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u000fJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003H§@¢\u0006\u0002\u0010\u0012J.\u0010\u0013\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00140\u00032\u0006\u0010\u0018\u001a\u00020\u0015H¦@¢\u0006\u0002\u0010\u0019J\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00032\u0006\u0010\u0005\u001a\u00020\u001cH§@¢\u0006\u0002\u0010\u001dø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001eÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/payment/data/source/PaymentRepository;", "Lcom/kubi/payment/base/IRepository;", "loadVersionCheck", "Lcom/kubi/payment/base/Result;", "Lcom/kubi/payment/data/entities/VersionCheck$Response;", "request", "Lcom/kubi/payment/data/entities/VersionCheck$Request;", "(Lcom/kubi/payment/data/entities/VersionCheck$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadUserInfo", "Lcom/kubi/payment/data/entities/UserInfo$Response;", "Lcom/kubi/payment/data/entities/UserInfo$Request;", "(Lcom/kubi/payment/data/entities/UserInfo$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadKycInfo", "Lcom/kubi/payment/data/entities/KycInfo$Response;", "Lcom/kubi/payment/data/entities/KycInfo$Request;", "(Lcom/kubi/payment/data/entities/KycInfo$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadOldUserInfo", "Lcom/kubi/otc/entity/FiatUserInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadMiddleGroundResource", "", "", "", "Lcom/kubi/payment/data/entities/MiddleGroundResource;", "code", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadTermInfo", "Lcom/kubi/payment/data/entities/TermInfo$Response;", "Lcom/kubi/payment/data/entities/TermInfo$Request;", "(Lcom/kubi/payment/data/entities/TermInfo$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface PaymentRepository extends InterfaceC42877j {
    @Deprecated(message = "Please use loadUserInfo(), This method will be removed", replaceWith = @ReplaceWith(expression = "loadUserInfo()", imports = {}))
    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: C */
    Object mo46263C(@NotNull Continuation<? super AbstractC42878k<FiatUserInfo>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: E */
    Object mo46264E(@NotNull UserInfo.Request request, @NotNull Continuation<? super AbstractC42878k<UserInfo.Response>> continuation);

    @Nullable
    /* JADX INFO: renamed from: K */
    Object mo46265K(@NotNull String str, @NotNull Continuation<? super AbstractC42878k<? extends Map<String, ? extends List<MiddleGroundResource>>>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: U */
    Object mo46266U(@NotNull TermInfo.Request request, @NotNull Continuation<? super AbstractC42878k<TermInfo.Response>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: f */
    Object mo46267f(@NotNull KycInfo.Request request, @NotNull Continuation<? super AbstractC42878k<KycInfo.Response>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: n */
    Object mo46268n(@NotNull VersionCheck.Request request, @NotNull Continuation<? super AbstractC42878k<VersionCheck.Response>> continuation);
}
