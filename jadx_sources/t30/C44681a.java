package t30;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.kubi.sdk.function.language.MultiLanguageManager;
import java.util.Locale;
import java.util.TimeZone;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42179a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: t30.a */
/* JADX INFO: compiled from: DateTimeRegulationsForTradeEx.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a4\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, m90084d2 = {"formatDateTimeForTradeOrder", "", "", "cLocale", "Ljava/util/Locale;", "noYear", "", "noSecond", RemoteConfigConstants.RequestFieldKey.TIME_ZONE, "Ljava/util/TimeZone;", "TradeBaseLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C44681a {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m98834a(long j11, @NotNull Locale cLocale, boolean z11, boolean z12, @Nullable TimeZone timeZone) {
        Intrinsics.checkNotNullParameter(cLocale, "cLocale");
        return C42179a.m92632e(j11, cLocale, z11, z12, timeZone);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m98835b(long j11, Locale locale, boolean z11, boolean z12, TimeZone timeZone, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            locale = MultiLanguageManager.f46811g.getLocale();
        }
        Locale locale2 = locale;
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        boolean z13 = z11;
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        boolean z14 = z12;
        if ((i11 & 8) != 0) {
            timeZone = null;
        }
        return m98834a(j11, locale2, z13, z14, timeZone);
    }
}
