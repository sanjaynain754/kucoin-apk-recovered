package com.kubi.payment.channel.data.source.remote;

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
import com.kubi.sdk.base.entity.BaseEntity;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.List;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChannelRemoteDataSource.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\f\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u000eJ\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010\u0013J\"\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\f\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\tH\u0086@¢\u0006\u0002\u0010\u0017J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\t2\u0006\u0010\u001a\u001a\u00020\u001bH\u0086@¢\u0006\u0002\u0010\u001cJ(\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\t2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0 H\u0086@¢\u0006\u0002\u0010!J\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\t2\u0006\u0010\u0011\u001a\u00020$H\u0086@¢\u0006\u0002\u0010%J\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\t2\u0006\u0010\u0011\u001a\u00020(H\u0086@¢\u0006\u0002\u0010)J.\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\t2\u0006\u0010,\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\rH\u0086@¢\u0006\u0002\u0010/J\u001c\u00100\u001a\b\u0012\u0004\u0012\u0002010\t2\u0006\u0010\u0011\u001a\u000202H\u0086@¢\u0006\u0002\u00103J\u001c\u00104\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u000205\u0018\u00010\n0\tH\u0086@¢\u0006\u0002\u0010\u0017J\u001c\u00106\u001a\b\u0012\u0004\u0012\u0002070\t2\u0006\u0010\u0011\u001a\u000208H\u0086@¢\u0006\u0002\u00109J$\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\t2\u0006\u0010<\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020=H\u0086@¢\u0006\u0002\u0010>R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006?"}, m90084d2 = {"Lcom/kubi/payment/channel/data/source/remote/ChannelRemoteDataSource;", "", "webService", "Lcom/kubi/payment/channel/data/source/remote/ChannelWebService;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lcom/kubi/payment/channel/data/source/remote/ChannelWebService;Lkotlinx/coroutines/CoroutineDispatcher;)V", "loadRechargePaymentMethodList", "Lcom/kubi/sdk/base/entity/BaseEntity;", "", "Lcom/kubi/payment/channel/data/entities/PaymentMethod;", "fiatCurrency", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadRechargeGuidePaymentMethod", "Lcom/kubi/payment/channel/data/entities/GuidePayment$Response;", "request", "Lcom/kubi/payment/channel/data/entities/GuidePayment$Request;", "(Lcom/kubi/payment/channel/data/entities/GuidePayment$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadWithdrawPaymentMethodList", "loadChannelUserInfo", "Lcom/kubi/payment/channel/data/entities/ChannelUserInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadCapitualKycStatus", "Lcom/kubi/payment/channel/data/entities/ChannelKycStatus;", "channelKycRequest", "Lcom/kubi/payment/channel/data/entities/ChannelKycRequest;", "(Lcom/kubi/payment/channel/data/entities/ChannelKycRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadPaymentFee", "Lcom/kubi/otc/entity/FiatFee;", ReportDataTable.COLUMN_PARAMS, "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFiatList", "Lcom/kubi/payment/channel/data/entities/FiatInfoEntity$Response;", "Lcom/kubi/payment/channel/data/entities/FiatInfoEntity$Request;", "(Lcom/kubi/payment/channel/data/entities/FiatInfoEntity$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "previewWithdrawOrder", "Lcom/kubi/payment/channel/data/entities/PreviewWithdrawOrder$Response;", "Lcom/kubi/payment/channel/data/entities/PreviewWithdrawOrder$Request;", "(Lcom/kubi/payment/channel/data/entities/PreviewWithdrawOrder$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ChannelKycRequest.SCENE_WITHDRAW, "Lcom/kubi/payment/channel/data/entities/Withdraw$Response;", "url", "Lcom/kubi/payment/channel/data/entities/Withdraw$Request;", "validationToken", "(Ljava/lang/String;Lcom/kubi/payment/channel/data/entities/Withdraw$Request;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", FirebaseAnalytics.Event.REFUND, "Lcom/kubi/payment/channel/data/entities/Refund$Response;", "Lcom/kubi/payment/channel/data/entities/Refund$Request;", "(Lcom/kubi/payment/channel/data/entities/Refund$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchQrCodeWhiteList", "Lcom/kubi/payment/channel/data/entities/WhiteListEntity;", "loadIvyConfirmPage", "Lcom/kubi/payment/channel/data/entities/IvyConfirmPageEntity$Response;", "Lcom/kubi/payment/channel/data/entities/IvyConfirmPageEntity$Request;", "(Lcom/kubi/payment/channel/data/entities/IvyConfirmPageEntity$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createIvyOrder", "Lcom/kubi/payment/channel/data/entities/CreateIvyOrderEntity$Response;", "colorTheme", "Lcom/kubi/payment/channel/data/entities/CreateIvyOrderEntity$Request;", "(Ljava/lang/String;Lcom/kubi/payment/channel/data/entities/CreateIvyOrderEntity$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ChannelRemoteDataSource {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ChannelWebService f38257a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final AbstractC41697j0 f38258b;

    public ChannelRemoteDataSource(@NotNull ChannelWebService webService, @NotNull AbstractC41697j0 ioDispatcher) {
        Intrinsics.checkNotNullParameter(webService, "webService");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f38257a = webService;
        this.f38258b = ioDispatcher;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Object m45752b(@NotNull String str, @NotNull CreateIvyOrderEntity.Request request, @NotNull Continuation<? super BaseEntity<CreateIvyOrderEntity.Response>> continuation) {
        return C41686h.m91049g(this.f38258b, new ChannelRemoteDataSource$createIvyOrder$2(this, str, request, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object m45753c(@NotNull Continuation<? super BaseEntity<List<WhiteListEntity>>> continuation) {
        return C41686h.m91049g(this.f38258b, new ChannelRemoteDataSource$fetchQrCodeWhiteList$2(this, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Object m45754d(@NotNull ChannelKycRequest channelKycRequest, @NotNull Continuation<? super BaseEntity<ChannelKycStatus>> continuation) {
        return C41686h.m91049g(this.f38258b, new ChannelRemoteDataSource$loadCapitualKycStatus$2(this, channelKycRequest, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final Object m45755e(@NotNull Continuation<? super BaseEntity<ChannelUserInfo>> continuation) {
        return C41686h.m91049g(this.f38258b, new ChannelRemoteDataSource$loadChannelUserInfo$2(this, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final Object m45756f(@NotNull FiatInfoEntity.Request request, @NotNull Continuation<? super BaseEntity<FiatInfoEntity.Response>> continuation) {
        return C41686h.m91049g(this.f38258b, new ChannelRemoteDataSource$loadFiatList$2(this, request, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final Object m45757g(@NotNull IvyConfirmPageEntity.Request request, @NotNull Continuation<? super BaseEntity<IvyConfirmPageEntity.Response>> continuation) {
        return C41686h.m91049g(this.f38258b, new ChannelRemoteDataSource$loadIvyConfirmPage$2(this, request, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final Object m45758h(@NotNull GuidePayment.Request request, @NotNull Continuation<? super BaseEntity<GuidePayment.Response>> continuation) {
        return C41686h.m91049g(this.f38258b, new ChannelRemoteDataSource$loadRechargeGuidePaymentMethod$2(this, request, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final Object m45759i(@NotNull String str, @NotNull Continuation<? super BaseEntity<List<PaymentMethod>>> continuation) {
        return C41686h.m91049g(this.f38258b, new ChannelRemoteDataSource$loadRechargePaymentMethodList$2(this, str, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final Object m45760j(@NotNull String str, @NotNull Continuation<? super BaseEntity<List<PaymentMethod>>> continuation) {
        return C41686h.m91049g(this.f38258b, new ChannelRemoteDataSource$loadWithdrawPaymentMethodList$2(this, str, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public final Object m45761k(@NotNull PreviewWithdrawOrder.Request request, @NotNull Continuation<? super BaseEntity<PreviewWithdrawOrder.Response>> continuation) {
        return C41686h.m91049g(this.f38258b, new ChannelRemoteDataSource$previewWithdrawOrder$2(this, request, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public final Object m45762l(@NotNull Refund.Request request, @NotNull Continuation<? super BaseEntity<Refund.Response>> continuation) {
        return C41686h.m91049g(this.f38258b, new ChannelRemoteDataSource$refund$2(this, request, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public final Object m45763m(@NotNull String str, @NotNull Withdraw.Request request, @Nullable String str2, @NotNull Continuation<? super BaseEntity<Withdraw.Response>> continuation) {
        return C41686h.m91049g(this.f38258b, new ChannelRemoteDataSource$withdraw$2(this, str, request, str2, null), continuation);
    }
}
