package com.kubi.spot.dialog.order.precheck;

import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.spot.R$string;
import com.kubi.spot.dialog.order.model.AmendContext;
import com.kubi.spot.dialog.order.model.ValidationResult;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import h30.C38104b;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.kubi.spot.dialog.order.precheck.e, reason: from Kotlin metadata */
/* JADX INFO: compiled from: QuantityRangeValidator.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/spot/dialog/order/precheck/QuantityRangeValidator;", "Lcom/kubi/spot/dialog/order/precheck/AmendPreCheck;", "<init>", "()V", "validate", "Lcom/kubi/spot/dialog/order/model/ValidationResult;", "context", "Lcom/kubi/spot/dialog/order/model/AmendContext;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/data/entity/SymbolInfoEntity;", "(Lcom/kubi/spot/dialog/order/model/AmendContext;Lcom/kubi/data/entity/SymbolInfoEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class QuantityRangeValidator implements AmendPreCheck {
    @Override // com.kubi.spot.dialog.order.precheck.AmendPreCheck
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo61741a(@NotNull AmendContext amendContext, @Nullable SymbolInfoEntity symbolInfoEntity, @NotNull Continuation<? super ValidationResult> continuation) {
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        BigDecimal bigDecimalM66535e = DowngradeExKt.m66535e(amendContext.getNewParams().getNewSize(), null, 1, null);
        if (symbolInfoEntity != null) {
            bigDecimal = new BigDecimal(String.valueOf(symbolInfoEntity.getBaseMinSize()));
        } else {
            bigDecimal = null;
        }
        BigDecimal bigDecimalM89922G = C41014a.m89922G(bigDecimal, null, 1, null);
        if (symbolInfoEntity != null) {
            bigDecimal2 = new BigDecimal(String.valueOf(symbolInfoEntity.getBaseMaxSize()));
        } else {
            bigDecimal2 = null;
        }
        if (!C38104b.m86031c(bigDecimalM66535e, bigDecimalM89922G, C41014a.m89922G(bigDecimal2, null, 1, null))) {
            ValidationResult.Companion companion = ValidationResult.f50531e;
            C27017c c27017c = C27017c.f54310a;
            int i11 = R$string.quantity_must_range;
            if (symbolInfoEntity != null) {
                bigDecimal3 = new BigDecimal(String.valueOf(symbolInfoEntity.getBaseMinSize()));
            } else {
                bigDecimal3 = null;
            }
            String strM92640e = C42180b.m92640e(C41014a.m89922G(bigDecimal3, null, 1, null), null, 20, false, false, false, 0, null, 125, null);
            if (symbolInfoEntity != null) {
                bigDecimal4 = new BigDecimal(String.valueOf(symbolInfoEntity.getBaseMaxSize()));
            } else {
                bigDecimal4 = null;
            }
            return ValidationResult.Companion.failure$default(companion, "20251002", c27017c.m66516f(i11, strM92640e, C42180b.m92640e(C41014a.m89922G(bigDecimal4, null, 1, null), null, 20, false, false, false, 0, null, 125, null)), false, 4, null);
        }
        return ValidationResult.f50531e.success();
    }
}
