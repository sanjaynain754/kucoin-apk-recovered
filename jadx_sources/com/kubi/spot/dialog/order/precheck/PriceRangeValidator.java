package com.kubi.spot.dialog.order.precheck;

import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.spot.R$string;
import com.kubi.spot.dialog.order.model.AmendContext;
import com.kubi.spot.dialog.order.model.ValidationResult;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.kubi.spot.dialog.order.precheck.d, reason: from Kotlin metadata */
/* JADX INFO: compiled from: PriceRangeValidator.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/spot/dialog/order/precheck/PriceRangeValidator;", "Lcom/kubi/spot/dialog/order/precheck/AmendPreCheck;", "<init>", "()V", "validate", "Lcom/kubi/spot/dialog/order/model/ValidationResult;", "context", "Lcom/kubi/spot/dialog/order/model/AmendContext;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/data/entity/SymbolInfoEntity;", "(Lcom/kubi/spot/dialog/order/model/AmendContext;Lcom/kubi/data/entity/SymbolInfoEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PriceRangeValidator implements AmendPreCheck {
    @Override // com.kubi.spot.dialog.order.precheck.AmendPreCheck
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo61741a(@NotNull AmendContext amendContext, @Nullable SymbolInfoEntity symbolInfoEntity, @NotNull Continuation<? super ValidationResult> continuation) {
        if (C41014a.m89919D(DowngradeExKt.m66535e(amendContext.getNewParams().getNewPrice(), null, 1, null))) {
            return ValidationResult.Companion.failure$default(ValidationResult.f50531e, "20251001", C27017c.f54310a.m66516f(R$string.price_not_zero, new Object[0]), false, 4, null);
        }
        return ValidationResult.f50531e.success();
    }
}
