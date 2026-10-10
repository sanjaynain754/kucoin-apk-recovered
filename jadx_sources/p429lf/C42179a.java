package p429lf;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.kubi.data.util.BuddhistCalendar;
import com.kubi.sdk.function.language.LanguageType;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.C33627eb;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.TimeZone;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Triple;
import p852kotlin.collections.MapsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: lf.a */
/* JADX INFO: compiled from: DateTimeRegulationsEx.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a4\u0010\b\u001a\u00020\u0002*\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\r\u001a*\u0010\u0011\u001a\u00020\u0002*\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u001a4\u0010\u0013\u001a\u00020\u0002*\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u001a@\u0010\u0014\u001a\u00020\u0002*\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002\"N\u0010\u0000\u001aB\u0012\u0004\u0012\u00020\u0002\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00030\u0001j \u0012\u0004\u0012\u00020\u0002\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0003`\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0006j\b\u0012\u0004\u0012\u00020\u0002`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"dateTimePattern", "Ljava/util/HashMap;", "", "Lkotlin/Triple;", "Lkotlin/collections/HashMap;", "timeBeforeDate", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "formatDate", "", "cLocale", "Ljava/util/Locale;", "noYear", "", RemoteConfigConstants.RequestFieldKey.TIME_ZONE, "Ljava/util/TimeZone;", "isDate", "formatTime", "noSecond", "formatDateTime", "formatDateOrTime", "LDataProvider_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDateTimeRegulationsEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateTimeRegulationsEx.kt\ncom/kubi/data/regulations/DateTimeRegulationsExKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1#2:154\n*E\n"})
public final class C42179a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final HashMap<String, Triple<String, String, String>> f93645a = MapsKt.hashMapOf(new Pair("ar_AE", new Triple("yyyy/MM/dd", "HH:mm:ss", C33627eb.f69716f)), new Pair("bn_BD", new Triple("dd/MM/yyyy", "HH:mm:ss", ", ")), new Pair("de_DE", new Triple("dd.MM.yyyy", "HH:mm:ss", ", ")), new Pair("en_US", new Triple("MM/dd/yyyy", "HH:mm:ss", C33627eb.f69716f)), new Pair("es_ES", new Triple("dd/MM/yyyy", "HH:mm:ss", ", ")), new Pair("fil_PH", new Triple("MM/dd/yyyy", "HH:mm:ss", ", ")), new Pair("fr_FR", new Triple("dd/MM/yyyy", "HH:mm:ss", C33627eb.f69716f)), new Pair("hi_IN", new Triple("dd/MM/yyyy", "HH:mm:ss", ", ")), new Pair("in_ID", new Triple("dd/MM/yyyy", "HH:mm:ss", ", ")), new Pair("it_IT", new Triple("dd/MM/yyyy", "HH:mm:ss", ", ")), new Pair("ja_JP", new Triple("yyyy/MM/dd", "HH:mm:ss", C33627eb.f69716f)), new Pair("ko_KR", new Triple("yyyy.MM.dd", "HH시 mm분 ss초", ". ")), new Pair("ms_MY", new Triple("dd/MM/yyyy", "HH:mm:ss", ", ")), new Pair("nl_NL", new Triple("dd-MM-yyyy", "HH:mm:ss", ", ")), new Pair("pl_PL", new Triple("dd.MM.yyyy", "HH:mm:ss", ", ")), new Pair("pt_PT", new Triple("dd/MM/yyyy", "HH:mm:ss", ", ")), new Pair("ru_RU", new Triple("dd.MM.yyyy", "HH:mm:ss", ", ")), new Pair("th_TH", new Triple("dd/MM/yyyy", "HH:mm:ss", C33627eb.f69716f)), new Pair("tr_TR", new Triple("dd.MM.yyyy", "HH:mm:ss", C33627eb.f69716f)), new Pair("ur_PK", new Triple("yyyy/MM/dd", "HH:mm:ss", C33627eb.f69716f)), new Pair("vi_VN", new Triple("dd/MM/yyyy", "HH:mm:ss", C33627eb.f69716f)), new Pair("zh_CN", new Triple("yyyy/MM/dd", "HH:mm:ss", C33627eb.f69716f)), new Pair("zh_HK", new Triple("dd/MM/yyyy", "HH:mm:ss", C33627eb.f69716f)), new Pair("uk_UA", new Triple("yyyy-MM-dd", "HH:mm:ss", C33627eb.f69716f)));

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final HashSet<String> f93646b = SetsKt.hashSetOf("vi_VN");

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m92628a(long j11, @NotNull Locale cLocale, boolean z11, @Nullable TimeZone timeZone, boolean z12) {
        Intrinsics.checkNotNullParameter(cLocale, "cLocale");
        return m92631d(j11, cLocale, z12, z11, false, timeZone, 8, null);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m92629b(long j11, Locale locale, boolean z11, TimeZone timeZone, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            locale = MultiLanguageManager.f46811g.getLocale();
        }
        Locale locale2 = locale;
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        boolean z13 = z11;
        if ((i11 & 4) != 0) {
            timeZone = null;
        }
        TimeZone timeZone2 = timeZone;
        if ((i11 & 8) != 0) {
            z12 = true;
        }
        return m92628a(j11, locale2, z13, timeZone2, z12);
    }

    /* JADX INFO: renamed from: c */
    public static final String m92630c(long j11, Locale locale, boolean z11, boolean z12, boolean z13, TimeZone timeZone) {
        String strM66669i;
        if (z11) {
            Triple<String, String, String> triple = f93645a.get(locale.toString());
            strM66669i = C27041f.m66669i(triple != null ? triple.getFirst() : null, "MM/dd/yyyy");
        } else {
            Triple<String, String, String> triple2 = f93645a.get(locale.toString());
            strM66669i = C27041f.m66669i(triple2 != null ? triple2.getSecond() : null, "HH:mm:ss");
        }
        String strReplace$default = strM66669i;
        if (z11 && z12) {
            strReplace$default = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(strReplace$default, "yyyy/", "", false, 4, (Object) null), "/yyyy", "", false, 4, (Object) null), ".yyyy", "", false, 4, (Object) null), "yyyy.", "", false, 4, (Object) null), "-yyyy", "", false, 4, (Object) null), "yyyy-", "", false, 4, (Object) null);
        }
        String strReplace$default2 = strReplace$default;
        if (!z11 && z13) {
            strReplace$default2 = StringsKt.replace$default(StringsKt.replace$default(strReplace$default2, ":ss", "", false, 4, (Object) null), " ss초", "", false, 4, (Object) null);
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(strReplace$default2, locale);
        if (timeZone != null) {
            simpleDateFormat.setTimeZone(timeZone);
        }
        if (Intrinsics.areEqual(locale, LanguageType.f46798TH.getLocale())) {
            simpleDateFormat.setCalendar(new BuddhistCalendar());
        }
        C42181c c42181c = C42181c.f93650a;
        String str = simpleDateFormat.format(Long.valueOf(j11));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return c42181c.m92652a(c42181c.m92653b(str, locale), locale);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m92631d(long j11, Locale locale, boolean z11, boolean z12, boolean z13, TimeZone timeZone, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            locale = MultiLanguageManager.f46811g.getLocale();
        }
        Locale locale2 = locale;
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        boolean z14 = z11;
        boolean z15 = (i11 & 4) != 0 ? false : z12;
        boolean z16 = (i11 & 8) != 0 ? false : z13;
        if ((i11 & 16) != 0) {
            timeZone = null;
        }
        return m92630c(j11, locale2, z14, z15, z16, timeZone);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m92632e(long j11, @NotNull Locale cLocale, boolean z11, boolean z12, @Nullable TimeZone timeZone) {
        Intrinsics.checkNotNullParameter(cLocale, "cLocale");
        String strM92629b = m92629b(j11, cLocale, z11, timeZone, false, 8, null);
        String strM92634g = m92634g(j11, cLocale, z12, timeZone);
        Triple<String, String, String> triple = f93645a.get(cLocale.toString());
        String strM66669i = C27041f.m66669i(triple != null ? triple.getThird() : null, C33627eb.f69716f);
        if (f93646b.contains(cLocale.toString())) {
            return strM92634g + strM66669i + strM92629b;
        }
        return strM92629b + strM66669i + strM92634g;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ String m92633f(long j11, Locale locale, boolean z11, boolean z12, TimeZone timeZone, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            locale = MultiLanguageManager.f46811g.getLocale();
        }
        Locale locale2 = locale;
        boolean z13 = (i11 & 2) != 0 ? false : z11;
        boolean z14 = (i11 & 4) != 0 ? false : z12;
        if ((i11 & 8) != 0) {
            timeZone = null;
        }
        return m92632e(j11, locale2, z13, z14, timeZone);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final String m92634g(long j11, @NotNull Locale cLocale, boolean z11, @Nullable TimeZone timeZone) {
        Intrinsics.checkNotNullParameter(cLocale, "cLocale");
        return m92631d(j11, cLocale, false, false, z11, timeZone, 4, null);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ String m92635h(long j11, Locale locale, boolean z11, TimeZone timeZone, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            locale = MultiLanguageManager.f46811g.getLocale();
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            timeZone = null;
        }
        return m92634g(j11, locale, z11, timeZone);
    }
}
