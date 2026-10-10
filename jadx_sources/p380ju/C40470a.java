package p380ju;

import android.app.Application;
import androidx.media3.common.MimeTypes;
import com.kubi.payment.PaymentServiceLocator;
import com.kubi.payment.third.data.source.IThirdRepository;
import com.kubi.payment.third.data.source.ThirdRepositoryImpl;
import com.kubi.payment.third.data.source.remote.ThirdRemoteDataSource;
import com.kubi.payment.third.data.source.remote.ThirdWebService;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;

/* JADX INFO: renamed from: ju.a */
/* JADX INFO: compiled from: ThirdServiceLocator.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/payment/third/ThirdServiceLocator;", "", "<init>", "()V", "provideFastRepository", "Lcom/kubi/payment/third/data/source/IThirdRepository;", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "createRemoteDataSource", "Lcom/kubi/payment/third/data/source/remote/ThirdRemoteDataSource;", "createThirdWebService", "Lcom/kubi/payment/third/data/source/remote/ThirdWebService;", "retrofit", "Lretrofit2/Retrofit;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C40470a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C40470a f89848a = new C40470a();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final IThirdRepository m89115c(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return new ThirdRepositoryImpl(f89848a.m89116a(), PaymentServiceLocator.f38204a.m45617e());
    }

    /* JADX INFO: renamed from: a */
    public final ThirdRemoteDataSource m89116a() {
        PaymentServiceLocator paymentServiceLocator = PaymentServiceLocator.f38204a;
        return new ThirdRemoteDataSource(m89117b(paymentServiceLocator.m45620h()), paymentServiceLocator.m45617e());
    }

    /* JADX INFO: renamed from: b */
    public final ThirdWebService m89117b(Retrofit retrofit) {
        Object objCreate = retrofit.create(ThirdWebService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        return (ThirdWebService) objCreate;
    }
}
