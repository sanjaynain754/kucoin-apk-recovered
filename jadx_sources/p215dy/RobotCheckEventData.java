package p215dy;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.safe.api.track.RobotCheckEvent;
import com.kubi.safe.api.track.RobotCheckMethod;
import com.kubi.safe.api.track.RobotCheckScene;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: dy.b, reason: from toString */
/* JADX INFO: compiled from: IRobotCheckEventReceiver.kt */
/* JADX INFO: loaded from: classes40.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003J?\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, m90084d2 = {"Lcom/kubi/safe/api/track/RobotCheckEventData;", "", "event", "Lcom/kubi/safe/api/track/RobotCheckEvent;", "bizType", "", "robotCheckScene", "Lcom/kubi/safe/api/track/RobotCheckScene;", FirebaseAnalytics.Param.METHOD, "Lcom/kubi/safe/api/track/RobotCheckMethod;", "throwable", "", "<init>", "(Lcom/kubi/safe/api/track/RobotCheckEvent;Ljava/lang/String;Lcom/kubi/safe/api/track/RobotCheckScene;Lcom/kubi/safe/api/track/RobotCheckMethod;Ljava/lang/Throwable;)V", "getEvent", "()Lcom/kubi/safe/api/track/RobotCheckEvent;", "getBizType", "()Ljava/lang/String;", "getRobotCheckScene", "()Lcom/kubi/safe/api/track/RobotCheckScene;", "getMethod", "()Lcom/kubi/safe/api/track/RobotCheckMethod;", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "SafeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RobotCheckEventData {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final RobotCheckEvent event;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final String bizType;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final RobotCheckScene robotCheckScene;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public final RobotCheckMethod method;

    /* JADX INFO: renamed from: e, reason: from toString */
    @Nullable
    public final Throwable throwable;

    public RobotCheckEventData(@NotNull RobotCheckEvent event, @NotNull String bizType, @NotNull RobotCheckScene robotCheckScene, @Nullable RobotCheckMethod robotCheckMethod, @Nullable Throwable th2) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        Intrinsics.checkNotNullParameter(robotCheckScene, "robotCheckScene");
        this.event = event;
        this.bizType = bizType;
        this.robotCheckScene = robotCheckScene;
        this.method = robotCheckMethod;
        this.throwable = th2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RobotCheckEventData)) {
            return false;
        }
        RobotCheckEventData robotCheckEventData = (RobotCheckEventData) other;
        return this.event == robotCheckEventData.event && Intrinsics.areEqual(this.bizType, robotCheckEventData.bizType) && this.robotCheckScene == robotCheckEventData.robotCheckScene && this.method == robotCheckEventData.method && Intrinsics.areEqual(this.throwable, robotCheckEventData.throwable);
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBizType() {
        return this.bizType;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final RobotCheckEvent getEvent() {
        return this.event;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final RobotCheckMethod getMethod() {
        return this.method;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final RobotCheckScene getRobotCheckScene() {
        return this.robotCheckScene;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Throwable getThrowable() {
        return this.throwable;
    }

    public int hashCode() {
        int iHashCode = ((((this.event.hashCode() * 31) + this.bizType.hashCode()) * 31) + this.robotCheckScene.hashCode()) * 31;
        RobotCheckMethod robotCheckMethod = this.method;
        int iHashCode2 = (iHashCode + (robotCheckMethod == null ? 0 : robotCheckMethod.hashCode())) * 31;
        Throwable th2 = this.throwable;
        return iHashCode2 + (th2 != null ? th2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RobotCheckEventData(event=" + this.event + ", bizType=" + this.bizType + ", robotCheckScene=" + this.robotCheckScene + ", method=" + this.method + ", throwable=" + this.throwable + ')';
    }

    public /* synthetic */ RobotCheckEventData(RobotCheckEvent robotCheckEvent, String str, RobotCheckScene robotCheckScene, RobotCheckMethod robotCheckMethod, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(robotCheckEvent, str, robotCheckScene, (i11 & 8) != 0 ? null : robotCheckMethod, (i11 & 16) != 0 ? null : th2);
    }
}
