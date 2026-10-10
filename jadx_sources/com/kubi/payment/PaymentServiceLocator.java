package com.kubi.payment;

import com.kubi.payment.data.source.PaymentRepository;
import com.kubi.payment.data.source.PaymentRepositoryImpl;
import com.kubi.payment.data.source.remote.PaymentRemoteDataSource;
import com.kubi.payment.data.source.remote.PaymentWebService;
import com.kubi.payment.track.IPaymentTrack;
import com.kubi.payment.track.PaymentTrackImpl;
import com.kubi.sdk.util.NullGson;
import kotlinx.coroutines.AbstractC41697j0;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: renamed from: com.kubi.payment.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: PaymentServiceLocator.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0019\u001a\u00020\u0013J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0006\u0010 \u001a\u00020\rJ\u0006\u0010!\u001a\u00020\fJ\b\u0010\"\u001a\u00020\fH\u0002R$\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\r@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0004\u001a\u0004\u0018\u00010\u0013@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006#"}, m90084d2 = {"Lcom/kubi/payment/PaymentServiceLocator;", "", "<init>", "()V", "value", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "getIoDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "setIoDispatcher", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "retrofit", "Lretrofit2/Retrofit;", "Lcom/kubi/payment/track/IPaymentTrack;", "paymentTrack", "getPaymentTrack", "()Lcom/kubi/payment/track/IPaymentTrack;", "setPaymentTrack", "(Lcom/kubi/payment/track/IPaymentTrack;)V", "Lcom/kubi/payment/data/source/PaymentRepository;", "repository", "getRepository", "()Lcom/kubi/payment/data/source/PaymentRepository;", "setRepository", "(Lcom/kubi/payment/data/source/PaymentRepository;)V", "providePaymentRepository", "createRepository", "Lcom/kubi/payment/data/source/PaymentRepositoryImpl;", "createRemoteDataSource", "Lcom/kubi/payment/data/source/remote/PaymentRemoteDataSource;", "createPaymentWebService", "Lcom/kubi/payment/data/source/remote/PaymentWebService;", "providePaymentTrack", "provideRetrofit", "createRetrofit", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PaymentServiceLocator {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final PaymentServiceLocator f38204a = new PaymentServiceLocator();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static volatile AbstractC41697j0 f38205b = C42911a.m94120b();

    /* JADX INFO: renamed from: c */
    @Nullable
    public static volatile Retrofit f38206c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public static volatile IPaymentTrack f38207d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public static volatile PaymentRepository f38208e;

    @NotNull
    /* JADX INFO: renamed from: f */
    public final PaymentRepository m45618f() {
        PaymentRepository paymentRepositoryM45615c;
        synchronized (this) {
            paymentRepositoryM45615c = f38208e;
            if (paymentRepositoryM45615c == null && (paymentRepositoryM45615c = f38208e) == null) {
                paymentRepositoryM45615c = f38204a.m45615c();
            }
        }
        return paymentRepositoryM45615c;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final IPaymentTrack m45619g() {
        IPaymentTrack paymentTrackImpl;
        synchronized (this) {
            paymentTrackImpl = f38207d;
            if (paymentTrackImpl == null && (paymentTrackImpl = f38207d) == null) {
                paymentTrackImpl = new PaymentTrackImpl();
            }
        }
        return paymentTrackImpl;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final Retrofit m45620h() {
        Retrofit retrofitM45616d;
        synchronized (this) {
            retrofitM45616d = f38206c;
            if (retrofitM45616d == null) {
                retrofitM45616d = f38204a.m45616d();
            }
        }
        return retrofitM45616d;
    }

    /* JADX INFO: renamed from: a */
    public final PaymentWebService m45613a(Retrofit retrofit) {
        Object objCreate = retrofit.create(PaymentWebService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        return (PaymentWebService) objCreate;
    }

    /* JADX INFO: renamed from: b */
    public final PaymentRemoteDataSource m45614b() {
        return new PaymentRemoteDataSource(m45613a(m45620h()), f38205b);
    }

    /* JADX INFO: renamed from: c */
    public final PaymentRepositoryImpl m45615c() {
        PaymentRepositoryImpl paymentRepositoryImpl = new PaymentRepositoryImpl(m45614b(), f38205b);
        f38208e = paymentRepositoryImpl;
        return paymentRepositoryImpl;
    }

    /* JADX INFO: renamed from: d */
    public final Retrofit m45616d() {
        Retrofit retrofitBuild = new Retrofit.Builder().baseUrl("https://appapi-v2.xcoinsystem.com/app/").client(C42597a.m93389e()).addConverterFactory(GsonConverterFactory.create(NullGson.m58333g())).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        return retrofitBuild;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final AbstractC41697j0 m45617e() {
        return f38205b;
    }
}
