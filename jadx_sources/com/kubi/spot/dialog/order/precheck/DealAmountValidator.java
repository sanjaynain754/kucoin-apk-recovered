package com.kubi.spot.dialog.order.precheck;

import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.spot.R$string;
import com.kubi.spot.dialog.order.model.AmendContext;
import com.kubi.spot.dialog.order.model.ValidationResult;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37890n;
import java.math.BigDecimal;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.spot.dialog.order.precheck.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: DealAmountValidator.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/spot/dialog/order/precheck/DealAmountValidator;", "Lcom/kubi/spot/dialog/order/precheck/AmendPreCheck;", "<init>", "()V", "validate", "Lcom/kubi/spot/dialog/order/model/ValidationResult;", "context", "Lcom/kubi/spot/dialog/order/model/AmendContext;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/data/entity/SymbolInfoEntity;", "(Lcom/kubi/spot/dialog/order/model/AmendContext;Lcom/kubi/data/entity/SymbolInfoEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DealAmountValidator implements AmendPreCheck {
    @Override // com.kubi.spot.dialog.order.precheck.AmendPreCheck
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo61741a(@NotNull AmendContext amendContext, @Nullable SymbolInfoEntity symbolInfoEntity, @NotNull Continuation<? super ValidationResult> continuation) {
        C37890n c37890n = C37890n.f85269a;
        String symbol = amendContext.getNewParams().getSymbol();
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(c37890n.m85618z(symbol != null ? StringsKt.substringAfter$default(symbol, C33820nf.f71144W, (String) null, 2, (Object) null) : null)));
        BigDecimal bigDecimalMultiply = DowngradeExKt.m66535e(amendContext.getNewParams().getNewPrice(), null, 1, null).multiply(DowngradeExKt.m66535e(amendContext.getNewParams().getNewSize(), null, 1, null));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        if (bigDecimalMultiply.compareTo(bigDecimal) >= 0) {
            return ValidationResult.f50531e.success();
        }
        ValidationResult.Companion companion = ValidationResult.f50531e;
        String strM66516f = C27017c.f54310a.m66516f(R$string.kc_trade_vol_morethan_tip, C42180b.m92640e(bigDecimal, null, 20, false, false, false, 0, null, 125, null));
        String quoteCurrencyName = symbolInfoEntity != null ? symbolInfoEntity.getQuoteCurrencyName() : null;
        if (quoteCurrencyName == null) {
            quoteCurrencyName = "";
        }
        return ValidationResult.Companion.failure$default(companion, "20251001", C42828b.m93906g(strM66516f, quoteCurrencyName, true, false, 4, null), false, 4, null);
    }
}
