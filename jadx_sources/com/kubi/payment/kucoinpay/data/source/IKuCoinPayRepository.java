package com.kubi.payment.kucoinpay.data.source;

import androidx.annotation.WorkerThread;
import com.kubi.payment.kucoinpay.data.entities.QrCode;
import com.kubi.payment.kucoinpay.qrscan.QrCodeLogoEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p477nt.AbstractC42878k;
import p477nt.InterfaceC42877j;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.kubi.payment.kucoinpay.data.source.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: IKuCoinPayRepository.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H§@¢\u0006\u0002\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/payment/kucoinpay/data/source/IKuCoinPayRepository;", "Lcom/kubi/payment/base/IRepository;", "loadQrCode", "Lcom/kubi/payment/base/Result;", "Lcom/kubi/payment/kucoinpay/data/entities/QrCode$Response;", "content", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchQrPayLogoList", "Lcom/kubi/payment/kucoinpay/qrscan/QrCodeLogoEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IKuCoinPayRepository extends InterfaceC42877j {
    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: G */
    Object mo48310G(@NotNull Continuation<? super AbstractC42878k<QrCodeLogoEntity>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: e0 */
    Object mo48311e0(@NotNull String str, @NotNull Continuation<? super AbstractC42878k<QrCode.Response>> continuation);
}
