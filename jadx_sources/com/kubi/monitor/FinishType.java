package com.kubi.monitor;

import com.kubi.payment.fast.data.entities.RecurringPlan;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: FinishType.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/monitor/FinishType;", "", "index", "", "(Ljava/lang/String;II)V", "getIndex", "()I", "setIndex", "(I)V", "OK", "ABORTED", RecurringPlan.CANCELLED, "DATA_LOSS", "NOT_FOUND", "INTERNAL_ERROR", "UNKNOWN_ERROR", "UNAUTHENTICATED", "UNKNOWN", "Companion", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public enum FinishType {
    OK(0),
    ABORTED(12),
    CANCELLED(1),
    DATA_LOSS(16),
    NOT_FOUND(7),
    INTERNAL_ERROR(2),
    UNKNOWN_ERROR(4),
    UNAUTHENTICATED(17),
    UNKNOWN(3);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private int index;

    /* JADX INFO: compiled from: FinishType.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/monitor/FinishType$Companion;", "", "()V", "fromHttpCode", "Lcom/kubi/monitor/FinishType;", "code", "", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final FinishType fromHttpCode(int code) {
            if (200 <= code && code < 300) {
                return FinishType.OK;
            }
            if (300 <= code && code < 400) {
                return FinishType.UNAUTHENTICATED;
            }
            if (400 > code || code >= 500) {
                return (500 > code || code >= 600) ? FinishType.UNKNOWN : FinishType.DATA_LOSS;
            }
            return FinishType.NOT_FOUND;
        }
    }

    @JvmStatic
    @NotNull
    public static final FinishType fromHttpCode(int i11) {
        return INSTANCE.fromHttpCode(i11);
    }

    public final int getIndex() {
        return this.index;
    }

    public final void setIndex(int i11) {
        this.index = i11;
    }

    FinishType(int i11) {
        this.index = i11;
    }
}
