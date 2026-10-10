package m50;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: m50.a, reason: from toString */
/* JADX INFO: compiled from: RobotStrategyNumEvent.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/tradingbotkit/event/RobotStrategyNumEvent;", "", "num", "", "type", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getNum", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getType", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/kubi/tradingbotkit/event/RobotStrategyNumEvent;", "equals", "", "other", "hashCode", "toString", "TradingBotKitApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RobotStrategyNumEvent {

    /* JADX INFO: renamed from: a, reason: from toString */
    @Nullable
    public final Integer num;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public final String type;

    /* JADX WARN: Multi-variable type inference failed */
    public RobotStrategyNumEvent() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RobotStrategyNumEvent)) {
            return false;
        }
        RobotStrategyNumEvent robotStrategyNumEvent = (RobotStrategyNumEvent) other;
        return Intrinsics.areEqual(this.num, robotStrategyNumEvent.num) && Intrinsics.areEqual(this.type, robotStrategyNumEvent.type);
    }

    public RobotStrategyNumEvent(@Nullable Integer num, @Nullable String str) {
        this.num = num;
        this.type = str;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getNum() {
        return this.num;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        Integer num = this.num;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.type;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RobotStrategyNumEvent(num=" + this.num + ", type=" + this.type + ')';
    }

    public /* synthetic */ RobotStrategyNumEvent(Integer num, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : str);
    }
}
