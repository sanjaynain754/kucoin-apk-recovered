package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public enum BoundType {
    OPEN(false),
    CLOSED(true);

    final boolean inclusive;

    public static BoundType forBoolean(boolean z11) {
        return z11 ? CLOSED : OPEN;
    }

    BoundType(boolean z11) {
        this.inclusive = z11;
    }
}
