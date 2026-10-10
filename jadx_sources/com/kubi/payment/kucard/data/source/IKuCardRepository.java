package com.kubi.payment.kucard.data.source;

import com.kubi.payment.kucard.data.entities.KuCardEntranceConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p477nt.AbstractC42878k;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.kubi.payment.kucard.data.source.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: IKuCardRepository.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0002\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/payment/kucard/data/source/IKuCardRepository;", "", "loadKuCardEntranceConfig", "Lcom/kubi/payment/base/Result;", "Lcom/kubi/payment/kucard/data/entities/KuCardEntranceConfig;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IKuCardRepository {
    @Nullable
    /* JADX INFO: renamed from: a */
    Object mo48289a(@NotNull Continuation<? super AbstractC42878k<KuCardEntranceConfig>> continuation);
}
