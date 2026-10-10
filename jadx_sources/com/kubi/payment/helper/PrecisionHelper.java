package com.kubi.payment.helper;

import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.utils.extensions.C27039d;
import gf.C37890n;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.payment.helper.d, reason: from Kotlin metadata */
/* JADX INFO: compiled from: PrecisionHelper.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/payment/helper/PrecisionHelper;", "", "<init>", "()V", "FIAT_PRECISION", "", "CRYPTO_PRECISION", "fiatCurrencyPrecision", "fiatCurrency", "", "cryptoCurrencyPrecision", "cryptoCurrency", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PrecisionHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final PrecisionHelper f39545a = new PrecisionHelper();

    /* JADX INFO: renamed from: a */
    public final int m48247a(@NotNull String cryptoCurrency) {
        Intrinsics.checkNotNullParameter(cryptoCurrency, "cryptoCurrency");
        CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(cryptoCurrency);
        return C27039d.m66651k(coinInfoEntityM85613u != null ? Integer.valueOf(coinInfoEntityM85613u.getPrecision()) : null, 8);
    }

    /* JADX INFO: renamed from: b */
    public final int m48248b(@NotNull String fiatCurrency) {
        Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
        CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(fiatCurrency);
        return C27039d.m66651k(coinInfoEntityM85613u != null ? Integer.valueOf(coinInfoEntityM85613u.getPrecision()) : null, 2);
    }
}
