package com.kubi.spot.business.delegation;

import com.kubi.spot.entity.DelegationEntity;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.spot.business.delegation.k, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TSOActivePricePrefix.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/spot/business/delegation/TSOActivePricePrefix;", "", "<init>", "()V", "getActPricePrefix", "", "item", "Lcom/kubi/spot/entity/DelegationEntity;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TSOActivePricePrefix {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final TSOActivePricePrefix f50074a = new TSOActivePricePrefix();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m60968a(@NotNull DelegationEntity item) {
        Intrinsics.checkNotNullParameter(item, "item");
        String activateCondition = item.getActivateCondition();
        if (Intrinsics.areEqual(activateCondition, "0")) {
            return StringsKt.equals(item.getSide(), "buy", true) ? "≤" : "≥";
        }
        return Intrinsics.areEqual(activateCondition, "2") ? "≤" : "≥";
    }
}
