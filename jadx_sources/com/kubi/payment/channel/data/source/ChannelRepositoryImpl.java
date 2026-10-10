package com.kubi.payment.channel.data.source;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.payment.channel.data.entities.ChannelKycRequest;
import com.kubi.payment.channel.data.entities.ChannelKycStatus;
import com.kubi.payment.channel.data.entities.ChannelUserInfo;
import com.kubi.payment.channel.data.entities.CreateIvyOrderEntity;
import com.kubi.payment.channel.data.entities.FiatInfoEntity;
import com.kubi.payment.channel.data.entities.GuidePayment;
import com.kubi.payment.channel.data.entities.IvyConfirmPageEntity;
import com.kubi.payment.channel.data.entities.PaymentMethod;
import com.kubi.payment.channel.data.entities.PreviewWithdrawOrder;
import com.kubi.payment.channel.data.entities.Refund;
import com.kubi.payment.channel.data.entities.WhiteListEntity;
import com.kubi.payment.channel.data.entities.Withdraw;
import com.kubi.payment.channel.data.source.remote.ChannelRemoteDataSource;
import com.kubi.payment.util.RepositoryExtKt;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.List;
import kotlinx.coroutines.AbstractC41697j0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p477nt.AbstractC42878k;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChannelRepositoryImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\f\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010\u000eJ\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@¢\u0006\u0002\u0010\u0013J\"\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\f\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\tH\u0096@¢\u0006\u0002\u0010\u0017J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\t2\u0006\u0010\u001a\u001a\u00020\u001bH\u0096@¢\u0006\u0002\u0010\u001cJ(\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\t2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0 H\u0096@¢\u0006\u0002\u0010!J\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\t2\u0006\u0010\u0011\u001a\u00020$H\u0096@¢\u0006\u0002\u0010%J\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\t2\u0006\u0010\u0011\u001a\u00020(H\u0096@¢\u0006\u0002\u0010)J.\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\t2\u0006\u0010,\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\rH\u0096@¢\u0006\u0002\u0010/J\u001c\u00100\u001a\b\u0012\u0004\u0012\u0002010\t2\u0006\u0010\u0011\u001a\u000202H\u0096@¢\u0006\u0002\u00103J\u001c\u00104\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u000205\u0018\u00010\n0\tH\u0096@¢\u0006\u0002\u0010\u0017J\u001c\u00106\u001a\b\u0012\u0004\u0012\u0002070\t2\u0006\u0010\u0011\u001a\u000208H\u0096@¢\u0006\u0002\u00109J$\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\t2\u0006\u0010<\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020=H\u0096@¢\u0006\u0002\u0010>R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006?"}, m90084d2 = {"Lcom/kubi/payment/channel/data/source/ChannelRepositoryImpl;", "Lcom/kubi/payment/channel/data/source/IChannelRepository;", "remoteDataSource", "Lcom/kubi/payment/channel/data/source/remote/ChannelRemoteDataSource;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lcom/kubi/payment/channel/data/source/remote/ChannelRemoteDataSource;Lkotlinx/coroutines/CoroutineDispatcher;)V", "loadRechargePaymentMethodList", "Lcom/kubi/payment/base/Result;", "", "Lcom/kubi/payment/channel/data/entities/PaymentMethod;", "fiatCurrency", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadRechargeGuidePaymentMethod", "Lcom/kubi/payment/channel/data/entities/GuidePayment$Response;", "request", "Lcom/kubi/payment/channel/data/entities/GuidePayment$Request;", "(Lcom/kubi/payment/channel/data/entities/GuidePayment$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadWithdrawPaymentMethodList", "loadChannelUserInfo", "Lcom/kubi/payment/channel/data/entities/ChannelUserInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadCapitualKycStatus", "Lcom/kubi/payment/channel/data/entities/ChannelKycStatus;", "channelKycRequest", "Lcom/kubi/payment/channel/data/entities/ChannelKycRequest;", "(Lcom/kubi/payment/channel/data/entities/ChannelKycRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadPaymentFee", "Lcom/kubi/otc/entity/FiatFee;", ReportDataTable.COLUMN_PARAMS, "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFiatList", "Lcom/kubi/payment/channel/data/entities/FiatInfoEntity$Response;", "Lcom/kubi/payment/channel/data/entities/FiatInfoEntity$Request;", "(Lcom/kubi/payment/channel/data/entities/FiatInfoEntity$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "previewWithdrawOrder", "Lcom/kubi/payment/channel/data/entities/PreviewWithdrawOrder$Response;", "Lcom/kubi/payment/channel/data/entities/PreviewWithdrawOrder$Request;", "(Lcom/kubi/payment/channel/data/entities/PreviewWithdrawOrder$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ChannelKycRequest.SCENE_WITHDRAW, "Lcom/kubi/payment/channel/data/entities/Withdraw$Response;", "url", "Lcom/kubi/payment/channel/data/entities/Withdraw$Request;", "validationToken", "(Ljava/lang/String;Lcom/kubi/payment/channel/data/entities/Withdraw$Request;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", FirebaseAnalytics.Event.REFUND, "Lcom/kubi/payment/channel/data/entities/Refund$Response;", "Lcom/kubi/payment/channel/data/entities/Refund$Request;", "(Lcom/kubi/payment/channel/data/entities/Refund$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchQrCodeWhiteList", "Lcom/kubi/payment/channel/data/entities/WhiteListEntity;", "loadIvyConfirmPage", "Lcom/kubi/payment/channel/data/entities/IvyConfirmPageEntity$Response;", "Lcom/kubi/payment/channel/data/entities/IvyConfirmPageEntity$Request;", "(Lcom/kubi/payment/channel/data/entities/IvyConfirmPageEntity$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createIvyOrder", "Lcom/kubi/payment/channel/data/entities/CreateIvyOrderEntity$Response;", "colorTheme", "Lcom/kubi/payment/channel/data/entities/CreateIvyOrderEntity$Request;", "(Ljava/lang/String;Lcom/kubi/payment/channel/data/entities/CreateIvyOrderEntity$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ChannelRepositoryImpl implements IChannelRepository {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ChannelRemoteDataSource f38255a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final AbstractC41697j0 f38256b;

    public ChannelRepositoryImpl(@NotNull ChannelRemoteDataSource remoteDataSource, @NotNull AbstractC41697j0 ioDispatcher) {
        Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f38255a = remoteDataSource;
        this.f38256b = ioDispatcher;
    }

    @Override // com.kubi.payment.channel.data.source.IChannelRepository
    @Nullable
    /* JADX INFO: renamed from: A */
    public Object mo45739A(@NotNull Continuation<? super AbstractC42878k<? extends List<WhiteListEntity>>> continuation) {
        return RepositoryExtKt.m49807b(null, new ChannelRepositoryImpl$fetchQrCodeWhiteList$2(this, null), continuation, 1, null);
    }

    @Override // com.kubi.payment.channel.data.source.IChannelRepository
    @Nullable
    /* JADX INFO: renamed from: F */
    public Object mo45740F(@NotNull IvyConfirmPageEntity.Request request, @NotNull Continuation<? super AbstractC42878k<IvyConfirmPageEntity.Response>> continuation) {
        return RepositoryExtKt.m49806a(this.f38256b, new ChannelRepositoryImpl$loadIvyConfirmPage$2(this, request, null), continuation);
    }

    @Override // com.kubi.payment.channel.data.source.IChannelRepository
    @Nullable
    /* JADX INFO: renamed from: N */
    public Object mo45741N(@NotNull String str, @NotNull Withdraw.Request request, @Nullable String str2, @NotNull Continuation<? super AbstractC42878k<Withdraw.Response>> continuation) {
        return RepositoryExtKt.m49807b(null, new ChannelRepositoryImpl$withdraw$2(this, str, request, str2, null), continuation, 1, null);
    }

    @Override // com.kubi.payment.channel.data.source.IChannelRepository
    @Nullable
    /* JADX INFO: renamed from: V */
    public Object mo45742V(@NotNull Refund.Request request, @NotNull Continuation<? super AbstractC42878k<Refund.Response>> continuation) {
        return RepositoryExtKt.m49807b(null, new ChannelRepositoryImpl$refund$2(this, request, null), continuation, 1, null);
    }

    @Override // com.kubi.payment.channel.data.source.IChannelRepository
    @Nullable
    /* JADX INFO: renamed from: c */
    public Object mo45743c(@NotNull ChannelKycRequest channelKycRequest, @NotNull Continuation<? super AbstractC42878k<ChannelKycStatus>> continuation) {
        return RepositoryExtKt.m49807b(null, new ChannelRepositoryImpl$loadCapitualKycStatus$2(this, channelKycRequest, null), continuation, 1, null);
    }

    @Override // com.kubi.payment.channel.data.source.IChannelRepository
    @Nullable
    /* JADX INFO: renamed from: c0 */
    public Object mo45744c0(@NotNull String str, @NotNull Continuation<? super AbstractC42878k<? extends List<PaymentMethod>>> continuation) {
        return RepositoryExtKt.m49806a(this.f38256b, new ChannelRepositoryImpl$loadWithdrawPaymentMethodList$2(this, str, null), continuation);
    }

    @Override // com.kubi.payment.channel.data.source.IChannelRepository
    @Nullable
    /* JADX INFO: renamed from: g */
    public Object mo45745g(@NotNull String str, @NotNull Continuation<? super AbstractC42878k<? extends List<PaymentMethod>>> continuation) {
        return RepositoryExtKt.m49806a(this.f38256b, new ChannelRepositoryImpl$loadRechargePaymentMethodList$2(this, str, null), continuation);
    }

    @Override // com.kubi.payment.channel.data.source.IChannelRepository
    @Nullable
    /* JADX INFO: renamed from: h */
    public Object mo45746h(@NotNull PreviewWithdrawOrder.Request request, @NotNull Continuation<? super AbstractC42878k<PreviewWithdrawOrder.Response>> continuation) {
        return RepositoryExtKt.m49807b(null, new ChannelRepositoryImpl$previewWithdrawOrder$2(this, request, null), continuation, 1, null);
    }

    @Override // com.kubi.payment.channel.data.source.IChannelRepository
    @Nullable
    /* JADX INFO: renamed from: o */
    public Object mo45747o(@NotNull FiatInfoEntity.Request request, @NotNull Continuation<? super AbstractC42878k<FiatInfoEntity.Response>> continuation) {
        return RepositoryExtKt.m49807b(null, new ChannelRepositoryImpl$loadFiatList$2(this, request, null), continuation, 1, null);
    }

    @Override // com.kubi.payment.channel.data.source.IChannelRepository
    @Nullable
    /* JADX INFO: renamed from: q */
    public Object mo45748q(@NotNull String str, @NotNull CreateIvyOrderEntity.Request request, @NotNull Continuation<? super AbstractC42878k<CreateIvyOrderEntity.Response>> continuation) {
        return RepositoryExtKt.m49806a(this.f38256b, new ChannelRepositoryImpl$createIvyOrder$2(this, str, request, null), continuation);
    }

    @Override // com.kubi.payment.channel.data.source.IChannelRepository
    @Nullable
    /* JADX INFO: renamed from: w */
    public Object mo45749w(@NotNull GuidePayment.Request request, @NotNull Continuation<? super AbstractC42878k<GuidePayment.Response>> continuation) {
        return RepositoryExtKt.m49806a(this.f38256b, new ChannelRepositoryImpl$loadRechargeGuidePaymentMethod$2(this, request, null), continuation);
    }

    @Override // com.kubi.payment.channel.data.source.IChannelRepository
    @Nullable
    /* JADX INFO: renamed from: z */
    public Object mo45750z(@NotNull Continuation<? super AbstractC42878k<ChannelUserInfo>> continuation) {
        return RepositoryExtKt.m49806a(this.f38256b, new ChannelRepositoryImpl$loadChannelUserInfo$2(this, null), continuation);
    }
}
