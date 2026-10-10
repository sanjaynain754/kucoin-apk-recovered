package com.kubi.payment.turkey.service;

import com.kubi.payment.service.IPaymentSiteService;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: TurkeyServiceImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/payment/turkey/service/TurkeyServiceImpl;", "Lcom/kubi/payment/service/IPaymentSiteService;", "<init>", "()V", "defaultFiatCurrency", "", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TurkeyServiceImpl implements IPaymentSiteService {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f40350b = new Companion(null);

    /* JADX INFO: compiled from: TurkeyServiceImpl.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/payment/turkey/service/TurkeyServiceImpl$Companion;", "", "<init>", "()V", "TRY", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Override // com.kubi.payment.service.IPaymentSiteService
    @NotNull
    /* JADX INFO: renamed from: b */
    public String mo45622b() {
        return "TRY";
    }
}
