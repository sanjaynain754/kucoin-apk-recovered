package o50;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: renamed from: o50.j */
/* JADX INFO: compiled from: TimeExt.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0004"}, m90084d2 = {"getTime", "", "", "getDdHh", "TradingBotKitLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42976j {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m94382a(long j11) {
        long j12 = 86400000;
        long j13 = j11 / j12;
        long j14 = j11 - (j12 * j13);
        long j15 = 3600000;
        long j16 = j14 / j15;
        String str = "" + j13;
        String str2 = "" + j16;
        String str3 = "" + ((j14 - (j15 * j16)) / ((long) 60000));
        if (j11 >= 86400000) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str4 = String.format("%sD %sH", Arrays.copyOf(new Object[]{str, str2}, 2));
            Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
            return str4;
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String str5 = String.format("%sH %sM", Arrays.copyOf(new Object[]{str2, str3}, 2));
        Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
        return str5;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m94383b(long j11) {
        long j12 = 86400000;
        long j13 = j11 / j12;
        long j14 = j11 - (j12 * j13);
        long j15 = 3600000;
        long j16 = j14 / j15;
        long j17 = (j14 - (j15 * j16)) / ((long) 60000);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%sD %sH %sM", Arrays.copyOf(new Object[]{"" + j13, "" + j16, "" + j17}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
