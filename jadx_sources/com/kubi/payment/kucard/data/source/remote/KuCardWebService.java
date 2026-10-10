package com.kubi.payment.kucard.data.source.remote;

import com.kubi.payment.kucard.data.entities.KuCardEntranceConfig;
import com.kubi.sdk.base.entity.BaseEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.GET;

/* JADX INFO: renamed from: com.kubi.payment.kucard.data.source.remote.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KuCardWebService.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@¢\u0006\u0002\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/payment/kucard/data/source/remote/KuCardWebService;", "", "loadKuCardEntranceConfig", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Lcom/kubi/payment/kucard/data/entities/KuCardEntranceConfig;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface KuCardWebService {
    @GET("crdapi/v1/kucard/ifHasEntrance")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m48292a(@NotNull Continuation<? super BaseEntity<KuCardEntranceConfig>> continuation);
}
