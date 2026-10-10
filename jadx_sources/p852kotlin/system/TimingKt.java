package p852kotlin.system;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Timing.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a'\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0006"}, m90084d2 = {"measureTimeMillis", "", "block", "Lkotlin/Function0;", "", "measureNanoTime", "kotlin-stdlib"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@JvmName(name = "TimingKt")
public final class TimingKt {
    public static final long measureNanoTime(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long jNanoTime = System.nanoTime();
        block.invoke();
        return System.nanoTime() - jNanoTime;
    }

    public static final long measureTimeMillis(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long jCurrentTimeMillis = System.currentTimeMillis();
        block.invoke();
        return System.currentTimeMillis() - jCurrentTimeMillis;
    }
}
