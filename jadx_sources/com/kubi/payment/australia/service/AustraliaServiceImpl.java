package com.kubi.payment.australia.service;

import com.kubi.host.HostManager;
import com.kubi.payment.service.IPaymentSiteService;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: AustraliaServiceImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\tH\u0016¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/payment/australia/service/AustraliaServiceImpl;", "Lcom/kubi/payment/service/IPaymentSiteService;", "<init>", "()V", "defaultFiatCurrency", "", "defaultCryptoCurrency", "fastCompanyName", "needShowCompanyAddress", "", "fastTermOfUserUrl", "fastPrivacyPolicyUrl", "isShowHigherLimited", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AustraliaServiceImpl implements IPaymentSiteService {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f38209b = new Companion(null);

    /* JADX INFO: compiled from: AustraliaServiceImpl.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/payment/australia/service/AustraliaServiceImpl$Companion;", "", "<init>", "()V", "AUD", "", "AU_COMPANY_NAME", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Override // com.kubi.payment.service.IPaymentSiteService
    /* JADX INFO: renamed from: f */
    public boolean mo45626f() {
        return false;
    }

    @Override // com.kubi.payment.service.IPaymentSiteService
    @NotNull
    /* JADX INFO: renamed from: a */
    public String mo45621a() {
        return "Axis One Markets";
    }

    @Override // com.kubi.payment.service.IPaymentSiteService
    @NotNull
    /* JADX INFO: renamed from: b */
    public String mo45622b() {
        return "AUD";
    }

    @Override // com.kubi.payment.service.IPaymentSiteService
    @NotNull
    /* JADX INFO: renamed from: c */
    public String mo45623c() {
        return HostManager.a.m() + "/support/47497300093812?appNeedLang=true";
    }

    @Override // com.kubi.payment.service.IPaymentSiteService
    @NotNull
    /* JADX INFO: renamed from: d */
    public String mo45624d() {
        return HostManager.a.m() + "/support/47497300093813?appNeedLang=true";
    }

    @Override // com.kubi.payment.service.IPaymentSiteService
    @NotNull
    /* JADX INFO: renamed from: e */
    public String mo45625e() {
        return "USDT";
    }
}
