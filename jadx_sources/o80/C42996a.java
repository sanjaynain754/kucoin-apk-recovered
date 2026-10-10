package o80;

import android.content.Context;
import com.kubi.utils.TimeUtils;
import com.kubi.welfare.R$string;
import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o80.a */
/* JADX INFO: compiled from: FilterTimeHelper.kt */
/* JADX INFO: loaded from: classes58.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, m90084d2 = {"Lcom/kubi/welfare/utils/FilterTimeHelper;", "", "<init>", "()V", "getNormalTimeTypeMap", "Ljava/util/LinkedHashMap;", "", "context", "Landroid/content/Context;", "getStart", "time", "beforeGet", "Lcom/kubi/utils/TimeUtils$BeforeGet;", "WelfareLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42996a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42996a f95143a = new C42996a();

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m94427b(@NotNull String time, @NotNull TimeUtils.C27004b beforeGet) {
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(beforeGet, "beforeGet");
        switch (time.hashCode()) {
            case -1480287667:
                return time.equals("ONE_WEEK") ? String.valueOf(beforeGet.m66434a(7, 6)) : "";
            case -1480228202:
                return !time.equals("ONE_YEAR") ? "" : String.valueOf(beforeGet.m66434a(365, 6));
            case -170154913:
                return !time.equals("THREE_MONTH") ? "" : String.valueOf(beforeGet.m66434a(90, 6));
            case 1151117513:
                return !time.equals("HALF_YEAR") ? "" : String.valueOf(beforeGet.m66434a(180, 6));
            case 1346794279:
                return !time.equals("ONE_MONTH") ? "" : String.valueOf(beforeGet.m66434a(30, 6));
            default:
                return "";
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final LinkedHashMap<String, String> m94426a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("ONE_WEEK", context.getString(R$string.one_week));
        linkedHashMap.put("ONE_MONTH", context.getString(R$string.one_month));
        linkedHashMap.put("THREE_MONTH", context.getString(R$string.three_month));
        linkedHashMap.put("HALF_YEAR", context.getString(R$string.half_year));
        linkedHashMap.put("ONE_YEAR", context.getString(R$string.one_year));
        return linkedHashMap;
    }
}
