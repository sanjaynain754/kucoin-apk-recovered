package p211du;

import com.kubi.payment.PaymentServiceLocator;
import com.kubi.payment.kucard.data.source.IKuCardRepository;
import com.kubi.payment.kucard.data.source.KuCardRepositoryImpl;
import com.kubi.payment.kucard.data.source.remote.KuCardRemoteDataSource;
import com.kubi.payment.kucard.data.source.remote.KuCardWebService;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;

/* JADX INFO: renamed from: du.a */
/* JADX INFO: compiled from: KuCardServiceLocator.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\f"}, m90084d2 = {"Lcom/kubi/payment/kucard/KuCardServiceLocator;", "", "<init>", "()V", "provideKuCardRepository", "Lcom/kubi/payment/kucard/data/source/IKuCardRepository;", "createRemoteDataSource", "Lcom/kubi/payment/kucard/data/source/remote/KuCardRemoteDataSource;", "createWebService", "Lcom/kubi/payment/kucard/data/source/remote/KuCardWebService;", "retrofit", "Lretrofit2/Retrofit;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C36960a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C36960a f82075a = new C36960a();

    /* JADX INFO: renamed from: a */
    public final KuCardRemoteDataSource m82775a() {
        PaymentServiceLocator paymentServiceLocator = PaymentServiceLocator.f38204a;
        return new KuCardRemoteDataSource(m82776b(paymentServiceLocator.m45620h()), paymentServiceLocator.m45617e());
    }

    /* JADX INFO: renamed from: b */
    public final KuCardWebService m82776b(Retrofit retrofit) {
        Object objCreate = retrofit.create(KuCardWebService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        return (KuCardWebService) objCreate;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final IKuCardRepository m82777c() {
        return new KuCardRepositoryImpl(m82775a(), PaymentServiceLocator.f38204a.m45617e());
    }
}
