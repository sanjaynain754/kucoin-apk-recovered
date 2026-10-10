package com.kubi.data.entity;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarginOfflineInfo.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0002¢\u0006\u0002\u0010\u0005\u001a\f\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\u0002\u001a\n\u0010\b\u001a\u00020\u0007*\u00020\u0002¨\u0006\t"}, m90084d2 = {"isOffline", "", "Lcom/kubi/data/entity/MarginSymbolInfo;", "offlineTime", "", "(Lcom/kubi/data/entity/MarginSymbolInfo;)Ljava/lang/Long;", "offlineLink", "", "getOfflineTag", "LDataProvider_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MarginOfflineInfoKt {
    @NotNull
    public static final String getOfflineTag(@NotNull MarginSymbolInfo marginSymbolInfo) {
        Intrinsics.checkNotNullParameter(marginSymbolInfo, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(marginSymbolInfo.getSymbolName());
        MarginOfflineInfo offlineInfo = marginSymbolInfo.getOfflineInfo();
        sb2.append(offlineInfo != null ? offlineInfo.getTime() : null);
        return sb2.toString();
    }

    public static final boolean isOffline(@NotNull MarginSymbolInfo marginSymbolInfo) {
        Intrinsics.checkNotNullParameter(marginSymbolInfo, "<this>");
        return marginSymbolInfo.getOfflineInfo() != null;
    }

    @Nullable
    public static final String offlineLink(@NotNull MarginSymbolInfo marginSymbolInfo) {
        Intrinsics.checkNotNullParameter(marginSymbolInfo, "<this>");
        MarginOfflineInfo offlineInfo = marginSymbolInfo.getOfflineInfo();
        if (offlineInfo != null) {
            return offlineInfo.getLink();
        }
        return null;
    }

    @Nullable
    public static final Long offlineTime(@NotNull MarginSymbolInfo marginSymbolInfo) {
        Intrinsics.checkNotNullParameter(marginSymbolInfo, "<this>");
        MarginOfflineInfo offlineInfo = marginSymbolInfo.getOfflineInfo();
        if (offlineInfo != null) {
            return offlineInfo.getTime();
        }
        return null;
    }
}
