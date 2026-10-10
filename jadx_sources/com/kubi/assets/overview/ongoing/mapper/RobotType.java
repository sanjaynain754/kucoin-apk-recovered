package com.kubi.assets.overview.ongoing.mapper;

import com.kubi.assets.R$mipmap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: RobotMapper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/assets/overview/ongoing/mapper/RobotType;", "", "type", "", "drawableId", "<init>", "(Ljava/lang/String;III)V", "getType", "()I", "getDrawableId", "SPOT_GRID", "AIP", "CONTRACT_GRID", "POSITION", "INFINITY_GRID", "MARTINGALE", "SUPERAI", "AI_FUTURE_BILATER", "LEVERAGE_GRID", "AI_SPOT_TREND", "FUTURE_MARTINGALE", "AI_FUTURE_TREND", "UNKNOWN", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum RobotType {
    SPOT_GRID(1, R$mipmap.asset_ic_spot_grid),
    AIP(2, R$mipmap.asset_ic_aip),
    CONTRACT_GRID(3, R$mipmap.asset_ic_contract_gird),
    POSITION(4, R$mipmap.asset_ic_position),
    INFINITY_GRID(5, R$mipmap.asset_ic_infinity_grid),
    MARTINGALE(7, R$mipmap.asset_ic_martingale),
    SUPERAI(8, R$mipmap.asset_ic_super_ai),
    AI_FUTURE_BILATER(9, R$mipmap.asset_ic_ai_future_bilater),
    LEVERAGE_GRID(10, R$mipmap.asset_ic_leverage_grid),
    AI_SPOT_TREND(11, R$mipmap.asset_ic_ai_spot_trend),
    FUTURE_MARTINGALE(12, R$mipmap.asset_ic_future_martingale),
    AI_FUTURE_TREND(13, R$mipmap.asset_ic_ai_future_trend),
    UNKNOWN(-1, R$mipmap.asset_ic_bot);

    private final int drawableId;
    private final int type;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f18525c = EnumEntriesKt.enumEntries(m18866a());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: RobotMapper.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/assets/overview/ongoing/mapper/RobotType$Companion;", "", "<init>", "()V", "fromType", "Lcom/kubi/assets/overview/ongoing/mapper/RobotType;", "type", "", "(Ljava/lang/Integer;)Lcom/kubi/assets/overview/ongoing/mapper/RobotType;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRobotMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RobotMapper.kt\ncom/kubi/assets/overview/ongoing/mapper/RobotType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n1#2:89\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX WARN: Code duplicated, block: B:13:0x001e  */
        /* JADX WARN: Code duplicated, block: B:15:0x0021 A[RETURN] */
        @NotNull
        public final RobotType fromType(@Nullable Integer type) {
            for (RobotType robotType : RobotType.values()) {
                int type2 = robotType.getType();
                if (type != null && type2 == type.intValue()) {
                    if (robotType == null) {
                        return RobotType.UNKNOWN;
                    }
                    return robotType;
                }
            }
            robotType = null;
            if (robotType == null) {
                return RobotType.UNKNOWN;
            }
            return robotType;
        }
    }

    @NotNull
    public static EnumEntries<RobotType> getEntries() {
        return f18525c;
    }

    public final int getDrawableId() {
        return this.drawableId;
    }

    public final int getType() {
        return this.type;
    }

    RobotType(int i11, int i12) {
        this.type = i11;
        this.drawableId = i12;
    }
}
