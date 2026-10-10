package com.kubi.payment.service;

import org.jetbrains.annotations.NotNull;
import p705vx.InterfaceC45660a;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: IPaymentSiteService.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45660a
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\ba\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/payment/service/IPaymentSiteService;", "", "defaultFiatCurrency", "", "defaultCryptoCurrency", "fastCompanyName", "needShowCompanyAddress", "", "fastTermOfUserUrl", "fastPrivacyPolicyUrl", "isShowHigherLimited", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IPaymentSiteService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f40210a = Companion.f40211a;

    /* JADX INFO: compiled from: IPaymentSiteService.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/payment/service/IPaymentSiteService$Companion;", "", "<init>", "()V", Companion.EUR, "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        @NotNull
        public static final String EUR = "EUR";

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f40211a = new Companion();
    }

    /* JADX INFO: renamed from: f */
    default boolean mo45626f() {
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    default String mo45621a() {
        return "Eurlita";
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    default String mo45622b() {
        return Companion.EUR;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    default String mo45623c() {
        return "https://www.eurlita.com/privacy-policy/";
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    default String mo45624d() {
        return "https://www.eurlita.com/terms-of-use/";
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    default String mo45625e() {
        return "USDT";
    }
}
