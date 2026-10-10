package ja0;

import com.kubi.assets.entity.EarnAccountItem;
import com.revolut.revolutpay.api.OrderState;
import com.revolut.revolutpay.data.OrderStateDto;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ja0.c */
/* JADX INFO: loaded from: classes59.dex */
public final class C40361c {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final OrderState m88946a(@NotNull OrderStateDto orderStateDto) {
        Intrinsics.checkNotNullParameter(orderStateDto, "<this>");
        String state = orderStateDto.getState();
        int iHashCode = state.hashCode();
        if (iHashCode == 35394935) {
            if (state.equals(EarnAccountItem.STATUS_DUAL_PENDING)) {
                return OrderState.PENDING;
            }
            return null;
        }
        if (iHashCode == 1383663147) {
            if (state.equals("COMPLETED")) {
                return OrderState.COMPLETED;
            }
            return null;
        }
        if (iHashCode == 1746537160) {
            if (state.equals("CREATED")) {
                return OrderState.CREATED;
            }
            return null;
        }
        if (iHashCode == 2066319421 && state.equals("FAILED")) {
            return OrderState.FAILED;
        }
        return null;
    }
}
