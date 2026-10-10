package p513ot;

import com.kubi.payment.PaymentServiceLocator;
import com.kubi.payment.channel.data.source.ChannelRepositoryImpl;
import com.kubi.payment.channel.data.source.IChannelRepository;
import com.kubi.payment.channel.data.source.remote.ChannelRemoteDataSource;
import com.kubi.payment.channel.data.source.remote.ChannelWebService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;

/* JADX INFO: renamed from: ot.a */
/* JADX INFO: compiled from: ChannelServiceLocator.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\u0005H\u0002J\u0006\u0010\f\u001a\u00020\u0005J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R(\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/payment/channel/ChannelServiceLocator;", "", "<init>", "()V", "value", "Lcom/kubi/payment/channel/data/source/IChannelRepository;", "repository", "getRepository", "()Lcom/kubi/payment/channel/data/source/IChannelRepository;", "setRepository", "(Lcom/kubi/payment/channel/data/source/IChannelRepository;)V", "createRepository", "provideRepository", "createRemoteDataSource", "Lcom/kubi/payment/channel/data/source/remote/ChannelRemoteDataSource;", "createWebService", "Lcom/kubi/payment/channel/data/source/remote/ChannelWebService;", "retrofit", "Lretrofit2/Retrofit;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43328a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43328a f95644a = new C43328a();

    /* JADX INFO: renamed from: b */
    @Nullable
    public static volatile IChannelRepository f95645b;

    @NotNull
    /* JADX INFO: renamed from: d */
    public final IChannelRepository m95366d() {
        IChannelRepository iChannelRepositoryM95364b;
        synchronized (this) {
            iChannelRepositoryM95364b = f95645b;
            if (iChannelRepositoryM95364b == null && (iChannelRepositoryM95364b = f95645b) == null) {
                iChannelRepositoryM95364b = f95644a.m95364b();
            }
        }
        return iChannelRepositoryM95364b;
    }

    /* JADX INFO: renamed from: a */
    public final ChannelRemoteDataSource m95363a() {
        PaymentServiceLocator paymentServiceLocator = PaymentServiceLocator.f38204a;
        return new ChannelRemoteDataSource(m95365c(paymentServiceLocator.m45620h()), paymentServiceLocator.m45617e());
    }

    /* JADX INFO: renamed from: b */
    public final IChannelRepository m95364b() {
        ChannelRepositoryImpl channelRepositoryImpl = new ChannelRepositoryImpl(m95363a(), PaymentServiceLocator.f38204a.m45617e());
        f95645b = channelRepositoryImpl;
        return channelRepositoryImpl;
    }

    /* JADX INFO: renamed from: c */
    public final ChannelWebService m95365c(Retrofit retrofit) {
        Object objCreate = retrofit.create(ChannelWebService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        return (ChannelWebService) objCreate;
    }
}
