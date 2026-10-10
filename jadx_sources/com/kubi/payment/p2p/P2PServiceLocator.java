package com.kubi.payment.p2p;

import android.app.Application;
import androidx.media3.common.MimeTypes;
import com.kubi.payment.PaymentServiceLocator;
import com.kubi.payment.p2p.data.source.IP2PRepository;
import com.kubi.payment.p2p.data.source.P2PRepositoryImpl;
import com.kubi.payment.p2p.data.source.remote.P2PRemoteDataSource;
import com.kubi.payment.p2p.data.source.remote.P2PWebService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;

/* JADX INFO: renamed from: com.kubi.payment.p2p.b0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: P2PServiceLocator.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\u0005H\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R(\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/payment/p2p/P2PServiceLocator;", "", "<init>", "()V", "value", "Lcom/kubi/payment/p2p/data/source/IP2PRepository;", "repository", "getRepository", "()Lcom/kubi/payment/p2p/data/source/IP2PRepository;", "setRepository", "(Lcom/kubi/payment/p2p/data/source/IP2PRepository;)V", "provideP2PRepository", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "createRepository", "createRemoteDataSource", "Lcom/kubi/payment/p2p/data/source/remote/P2PRemoteDataSource;", "createP2PWebService", "Lcom/kubi/payment/p2p/data/source/remote/P2PWebService;", "retrofit", "Lretrofit2/Retrofit;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class P2PServiceLocator {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final P2PServiceLocator f39697a = new P2PServiceLocator();

    /* JADX INFO: renamed from: b */
    @Nullable
    public static volatile IP2PRepository f39698b;

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final IP2PRepository m48466d(@NotNull Application application) {
        IP2PRepository iP2PRepositoryM48469c;
        Intrinsics.checkNotNullParameter(application, "application");
        P2PServiceLocator p2PServiceLocator = f39697a;
        synchronized (p2PServiceLocator) {
            iP2PRepositoryM48469c = f39698b;
            if (iP2PRepositoryM48469c == null && (iP2PRepositoryM48469c = f39698b) == null) {
                iP2PRepositoryM48469c = p2PServiceLocator.m48469c();
            }
        }
        return iP2PRepositoryM48469c;
    }

    /* JADX INFO: renamed from: a */
    public final P2PWebService m48467a(Retrofit retrofit) {
        Object objCreate = retrofit.create(P2PWebService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        return (P2PWebService) objCreate;
    }

    /* JADX INFO: renamed from: b */
    public final P2PRemoteDataSource m48468b() {
        PaymentServiceLocator paymentServiceLocator = PaymentServiceLocator.f38204a;
        return new P2PRemoteDataSource(m48467a(paymentServiceLocator.m45620h()), paymentServiceLocator.m45617e());
    }

    /* JADX INFO: renamed from: c */
    public final IP2PRepository m48469c() {
        P2PRepositoryImpl p2PRepositoryImpl = new P2PRepositoryImpl(m48468b(), PaymentServiceLocator.f38204a.m45617e());
        f39698b = p2PRepositoryImpl;
        return p2PRepositoryImpl;
    }
}
