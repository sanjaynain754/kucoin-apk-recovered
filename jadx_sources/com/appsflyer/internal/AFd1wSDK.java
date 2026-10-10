package com.appsflyer.internal;

import androidx.annotation.WorkerThread;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@WorkerThread
public final class AFd1wSDK implements AFd1vSDK {

    @NotNull
    private final AFc1cSDK getRevenue;

    public AFd1wSDK(@NotNull AFc1cSDK aFc1cSDK) {
        Intrinsics.checkNotNullParameter(aFc1cSDK, "");
        this.getRevenue = aFc1cSDK;
    }

    @Override // com.appsflyer.internal.AFd1vSDK
    public final void getRevenue(@NotNull byte[] bArr, @Nullable Map<String, String> map, int i11) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        if (new AFd1qSDK(bArr, map, 2000).getRevenue()) {
            this.getRevenue.getMediationNetwork();
        }
    }
}
