package com.kubi.assets.entity;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: LineChartEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/assets/entity/ProfitEventPoint;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "PNL1D", "PnL7D", "PnL30D", "PnL3M", "PnL6M", "PnLUpdating", "Profit", "Loss", "DescriptionHover", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum ProfitEventPoint {
    PNL1D(0),
    PnL7D(1),
    PnL30D(2),
    PnL3M(3),
    PnL6M(4),
    PnLUpdating(5),
    Profit(6),
    Loss(7),
    DescriptionHover(8);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    private final int value;

    @NotNull
    public static EnumEntries<ProfitEventPoint> getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }

    ProfitEventPoint(int i11) {
        this.value = i11;
    }
}
