package tt;

import com.kubi.payment.PaymentServiceLocator;
import com.kubi.payment.fast.data.source.FastRepositoryImpl;
import com.kubi.payment.fast.data.source.IFastRepository;
import com.kubi.payment.fast.data.source.remote.FastRemoteDataSource;
import com.kubi.payment.fast.data.source.remote.FastWebService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;

/* JADX INFO: renamed from: tt.a */
/* JADX INFO: compiled from: FastServiceLocator.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\u0005H\u0007J\b\u0010\f\u001a\u00020\u0005H\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R(\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/payment/fast/FastServiceLocator;", "", "<init>", "()V", "value", "Lcom/kubi/payment/fast/data/source/IFastRepository;", "repository", "getRepository", "()Lcom/kubi/payment/fast/data/source/IFastRepository;", "setRepository", "(Lcom/kubi/payment/fast/data/source/IFastRepository;)V", "provideFastRepository", "createRepository", "createRemoteDataSource", "Lcom/kubi/payment/fast/data/source/remote/FastRemoteDataSource;", "createFastWebService", "Lcom/kubi/payment/fast/data/source/remote/FastWebService;", "retrofit", "Lretrofit2/Retrofit;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45070a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45070a f101464a = new C45070a();

    /* JADX INFO: renamed from: b */
    @Nullable
    public static volatile IFastRepository f101465b;

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final IFastRepository m99667d() {
        IFastRepository iFastRepositoryM99670c;
        C45070a c45070a = f101464a;
        synchronized (c45070a) {
            iFastRepositoryM99670c = f101465b;
            if (iFastRepositoryM99670c == null && (iFastRepositoryM99670c = f101465b) == null) {
                iFastRepositoryM99670c = c45070a.m99670c();
            }
        }
        return iFastRepositoryM99670c;
    }

    /* JADX INFO: renamed from: a */
    public final FastWebService m99668a(Retrofit retrofit) {
        Object objCreate = retrofit.create(FastWebService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        return (FastWebService) objCreate;
    }

    /* JADX INFO: renamed from: b */
    public final FastRemoteDataSource m99669b() {
        PaymentServiceLocator paymentServiceLocator = PaymentServiceLocator.f38204a;
        return new FastRemoteDataSource(m99668a(paymentServiceLocator.m45620h()), paymentServiceLocator.m45617e());
    }

    /* JADX INFO: renamed from: c */
    public final IFastRepository m99670c() {
        FastRepositoryImpl fastRepositoryImpl = new FastRepositoryImpl(m99669b(), PaymentServiceLocator.f38204a.m45617e());
        f101465b = fastRepositoryImpl;
        return fastRepositoryImpl;
    }
}
