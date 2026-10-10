package com.kubi.payment.helper;

import com.kubi.host.HostManager;
import f00.C37304a;
import g00.InterfaceC37766r;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.payment.helper.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: H5Helper.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/payment/helper/H5Helper;", "", "<init>", "()V", "BLOCK_TRADE_URL", "", "UPDATE_ADDRESS_URL", "launchBlockTradePage", "", "launchUpdateAddressPage", "cardId", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class H5Helper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final H5Helper f39544a = new H5Helper();

    /* JADX INFO: renamed from: a */
    public final void m48245a() {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, HostManager.a.m() + "/block-trade?appNeedLang=true&loading=2", null, null, null, null, null, null, 126, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m48246b(@NotNull String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        InterfaceC37766r.a.m85190a(C37304a.f82764a, HostManager.a.m() + "/express/pay-with-new-card/update-billing-address?needLogin=true&appNeedLang=true&loading=2&cardId=" + cardId, null, null, null, null, null, null, 126, null);
    }
}
