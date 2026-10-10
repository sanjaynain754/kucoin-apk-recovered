package com.kubi.spot.dialog.order.precheck;

import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.spot.dialog.order.model.AmendContext;
import com.kubi.spot.dialog.order.model.ValidationResult;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.kubi.spot.dialog.order.precheck.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AmendPreCheck.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H¦@¢\u0006\u0002\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/spot/dialog/order/precheck/AmendPreCheck;", "", "validate", "Lcom/kubi/spot/dialog/order/model/ValidationResult;", "context", "Lcom/kubi/spot/dialog/order/model/AmendContext;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/data/entity/SymbolInfoEntity;", "(Lcom/kubi/spot/dialog/order/model/AmendContext;Lcom/kubi/data/entity/SymbolInfoEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface AmendPreCheck {
    @Nullable
    /* JADX INFO: renamed from: a */
    Object mo61741a(@NotNull AmendContext amendContext, @Nullable SymbolInfoEntity symbolInfoEntity, @NotNull Continuation<? super ValidationResult> continuation);
}
