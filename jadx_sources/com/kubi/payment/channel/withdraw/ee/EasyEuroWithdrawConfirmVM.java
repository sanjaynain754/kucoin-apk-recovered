package com.kubi.payment.channel.withdraw.ee;

import com.kubi.payment.channel.data.source.IChannelRepository;
import com.kubi.payment.channel.withdraw.common.confirm.CommonWithDrawConfirmVM;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.payment.channel.withdraw.ee.c, reason: from Kotlin metadata */
/* JADX INFO: compiled from: EasyEuroWithdrawConfirmVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/payment/channel/withdraw/ee/EasyEuroWithdrawConfirmVM;", "Lcom/kubi/payment/channel/withdraw/common/confirm/CommonWithDrawConfirmVM;", "repository", "Lcom/kubi/payment/channel/data/source/IChannelRepository;", "<init>", "(Lcom/kubi/payment/channel/data/source/IChannelRepository;)V", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class EasyEuroWithdrawConfirmVM extends CommonWithDrawConfirmVM {

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final IChannelRepository f38400d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EasyEuroWithdrawConfirmVM(@NotNull IChannelRepository repository) {
        super(repository);
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f38400d0 = repository;
    }
}
