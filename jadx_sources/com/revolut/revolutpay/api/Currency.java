package com.revolut.revolutpay.api;

import com.kubi.payment.service.IPaymentSiteService;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b \b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"¨\u0006#"}, m90084d2 = {"Lcom/revolut/revolutpay/api/Currency;", "", "subunit", "", "(Ljava/lang/String;II)V", "getSubunit", "()I", "AED", "AUD", "BGN", "CAD", "CHF", "CZK", "DKK", IPaymentSiteService.Companion.EUR, "GBP", "HKD", "HUF", "ILS", "JPY", "MXN", "NOK", "NZD", "PLN", "QAR", "RON", "RUB", "SAR", "SEK", "SGD", "THB", "TRY", "USD", "ZAR", "OTHER", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
public enum Currency {
    AED(2),
    AUD(2),
    BGN(2),
    CAD(2),
    CHF(2),
    CZK(2),
    DKK(2),
    EUR(2),
    GBP(2),
    HKD(2),
    HUF(2),
    ILS(2),
    JPY(0),
    MXN(2),
    NOK(2),
    NZD(2),
    PLN(2),
    QAR(2),
    RON(2),
    RUB(2),
    SAR(2),
    SEK(2),
    SGD(2),
    THB(2),
    TRY(2),
    USD(2),
    ZAR(2),
    OTHER(0);

    private final int subunit;

    public final int getSubunit() {
        return this.subunit;
    }

    Currency(int i11) {
        this.subunit = i11;
    }
}
