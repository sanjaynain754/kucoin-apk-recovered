package com.kubi.payment.channel.data.source;

import androidx.annotation.WorkerThread;
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
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p477nt.AbstractC42878k;
import p477nt.InterfaceC42877j;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.kubi.payment.channel.data.source.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: IChannelRepository.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u0006\u0010\u000b\u001a\u00020\fH§@¢\u0006\u0002\u0010\rJ\"\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\bJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003H§@¢\u0006\u0002\u0010\u0011J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\u0006\u0010\u0014\u001a\u00020\u0015H§@¢\u0006\u0002\u0010\u0016J(\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00032\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u001aH§@¢\u0006\u0002\u0010\u001bJ\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00032\u0006\u0010\u000b\u001a\u00020\u001eH§@¢\u0006\u0002\u0010\u001fJ\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00032\u0006\u0010\u000b\u001a\u00020\"H§@¢\u0006\u0002\u0010#J.\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00032\u0006\u0010&\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010)J\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u00032\u0006\u0010\u000b\u001a\u00020,H§@¢\u0006\u0002\u0010-J\u001c\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020/\u0018\u00010\u00040\u0003H§@¢\u0006\u0002\u0010\u0011J\u001c\u00100\u001a\b\u0012\u0004\u0012\u0002010\u00032\u0006\u0010\u000b\u001a\u000202H§@¢\u0006\u0002\u00103J$\u00104\u001a\b\u0012\u0004\u0012\u0002050\u00032\u0006\u00106\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u000207H§@¢\u0006\u0002\u00108ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00069À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/payment/channel/data/source/IChannelRepository;", "Lcom/kubi/payment/base/IRepository;", "loadRechargePaymentMethodList", "Lcom/kubi/payment/base/Result;", "", "Lcom/kubi/payment/channel/data/entities/PaymentMethod;", "fiatCurrency", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadRechargeGuidePaymentMethod", "Lcom/kubi/payment/channel/data/entities/GuidePayment$Response;", "request", "Lcom/kubi/payment/channel/data/entities/GuidePayment$Request;", "(Lcom/kubi/payment/channel/data/entities/GuidePayment$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadWithdrawPaymentMethodList", "loadChannelUserInfo", "Lcom/kubi/payment/channel/data/entities/ChannelUserInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadCapitualKycStatus", "Lcom/kubi/payment/channel/data/entities/ChannelKycStatus;", "channelKycRequest", "Lcom/kubi/payment/channel/data/entities/ChannelKycRequest;", "(Lcom/kubi/payment/channel/data/entities/ChannelKycRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadPaymentFee", "Lcom/kubi/otc/entity/FiatFee;", ReportDataTable.COLUMN_PARAMS, "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFiatList", "Lcom/kubi/payment/channel/data/entities/FiatInfoEntity$Response;", "Lcom/kubi/payment/channel/data/entities/FiatInfoEntity$Request;", "(Lcom/kubi/payment/channel/data/entities/FiatInfoEntity$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "previewWithdrawOrder", "Lcom/kubi/payment/channel/data/entities/PreviewWithdrawOrder$Response;", "Lcom/kubi/payment/channel/data/entities/PreviewWithdrawOrder$Request;", "(Lcom/kubi/payment/channel/data/entities/PreviewWithdrawOrder$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ChannelKycRequest.SCENE_WITHDRAW, "Lcom/kubi/payment/channel/data/entities/Withdraw$Response;", "url", "Lcom/kubi/payment/channel/data/entities/Withdraw$Request;", "validationToken", "(Ljava/lang/String;Lcom/kubi/payment/channel/data/entities/Withdraw$Request;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", FirebaseAnalytics.Event.REFUND, "Lcom/kubi/payment/channel/data/entities/Refund$Response;", "Lcom/kubi/payment/channel/data/entities/Refund$Request;", "(Lcom/kubi/payment/channel/data/entities/Refund$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchQrCodeWhiteList", "Lcom/kubi/payment/channel/data/entities/WhiteListEntity;", "loadIvyConfirmPage", "Lcom/kubi/payment/channel/data/entities/IvyConfirmPageEntity$Response;", "Lcom/kubi/payment/channel/data/entities/IvyConfirmPageEntity$Request;", "(Lcom/kubi/payment/channel/data/entities/IvyConfirmPageEntity$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createIvyOrder", "Lcom/kubi/payment/channel/data/entities/CreateIvyOrderEntity$Response;", "colorTheme", "Lcom/kubi/payment/channel/data/entities/CreateIvyOrderEntity$Request;", "(Ljava/lang/String;Lcom/kubi/payment/channel/data/entities/CreateIvyOrderEntity$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IChannelRepository extends InterfaceC42877j {
    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: A */
    Object mo45739A(@NotNull Continuation<? super AbstractC42878k<? extends List<WhiteListEntity>>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: F */
    Object mo45740F(@NotNull IvyConfirmPageEntity.Request request, @NotNull Continuation<? super AbstractC42878k<IvyConfirmPageEntity.Response>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: N */
    Object mo45741N(@NotNull String str, @NotNull Withdraw.Request request, @Nullable String str2, @NotNull Continuation<? super AbstractC42878k<Withdraw.Response>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: V */
    Object mo45742V(@NotNull Refund.Request request, @NotNull Continuation<? super AbstractC42878k<Refund.Response>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: c */
    Object mo45743c(@NotNull ChannelKycRequest channelKycRequest, @NotNull Continuation<? super AbstractC42878k<ChannelKycStatus>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: c0 */
    Object mo45744c0(@NotNull String str, @NotNull Continuation<? super AbstractC42878k<? extends List<PaymentMethod>>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: g */
    Object mo45745g(@NotNull String str, @NotNull Continuation<? super AbstractC42878k<? extends List<PaymentMethod>>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: h */
    Object mo45746h(@NotNull PreviewWithdrawOrder.Request request, @NotNull Continuation<? super AbstractC42878k<PreviewWithdrawOrder.Response>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: o */
    Object mo45747o(@NotNull FiatInfoEntity.Request request, @NotNull Continuation<? super AbstractC42878k<FiatInfoEntity.Response>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: q */
    Object mo45748q(@NotNull String str, @NotNull CreateIvyOrderEntity.Request request, @NotNull Continuation<? super AbstractC42878k<CreateIvyOrderEntity.Response>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: w */
    Object mo45749w(@NotNull GuidePayment.Request request, @NotNull Continuation<? super AbstractC42878k<GuidePayment.Response>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: z */
    Object mo45750z(@NotNull Continuation<? super AbstractC42878k<ChannelUserInfo>> continuation);
}
