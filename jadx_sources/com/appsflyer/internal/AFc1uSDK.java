package com.appsflyer.internal;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class AFc1uSDK {

    @NotNull
    final List<AFc1vSDK> getRevenue;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AFc1uSDK) && Intrinsics.areEqual(this.getRevenue, ((AFc1uSDK) obj).getRevenue);
    }

    public AFc1uSDK(@NotNull List<AFc1vSDK> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.getRevenue = list;
    }

    public final int hashCode() {
        return this.getRevenue.hashCode();
    }

    @NotNull
    public final String toString() {
        return "StorageConfig(typeEntries=" + this.getRevenue + ")";
    }
}
