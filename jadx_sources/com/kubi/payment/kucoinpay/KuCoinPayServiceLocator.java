package com.kubi.payment.kucoinpay;

import com.kubi.payment.PaymentServiceLocator;
import com.kubi.payment.kucoinpay.data.source.IKuCoinPayRepository;
import com.kubi.payment.kucoinpay.data.source.KuCoinPayRepositoryImpl;
import com.kubi.payment.kucoinpay.data.source.remote.KuCoinPayRemoteDataSource;
import com.kubi.payment.kucoinpay.data.source.remote.KuCoinPayWebService;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;

/* JADX INFO: renamed from: com.kubi.payment.kucoinpay.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KuCoinPayServiceLocator.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\f"}, m90084d2 = {"Lcom/kubi/payment/kucoinpay/KuCoinPayServiceLocator;", "", "<init>", "()V", "provideRepository", "Lcom/kubi/payment/kucoinpay/data/source/IKuCoinPayRepository;", "createRemoteDataSource", "Lcom/kubi/payment/kucoinpay/data/source/remote/KuCoinPayRemoteDataSource;", "createWebService", "Lcom/kubi/payment/kucoinpay/data/source/remote/KuCoinPayWebService;", "retrofit", "Lretrofit2/Retrofit;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KuCoinPayServiceLocator {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final KuCoinPayServiceLocator f39583a = new KuCoinPayServiceLocator();

    /* JADX INFO: renamed from: a */
    public final KuCoinPayRemoteDataSource m48306a() {
        PaymentServiceLocator paymentServiceLocator = PaymentServiceLocator.f38204a;
        return new KuCoinPayRemoteDataSource(m48307b(paymentServiceLocator.m45620h()), paymentServiceLocator.m45617e());
    }

    /* JADX INFO: renamed from: b */
    public final KuCoinPayWebService m48307b(Retrofit retrofit) {
        Object objCreate = retrofit.create(KuCoinPayWebService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        return (KuCoinPayWebService) objCreate;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final IKuCoinPayRepository m48308c() {
        return new KuCoinPayRepositoryImpl(m48306a(), PaymentServiceLocator.f38204a.m45617e());
    }
}
