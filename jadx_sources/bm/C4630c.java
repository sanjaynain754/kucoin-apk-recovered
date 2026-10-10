package bm;

import java.util.Locale;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: bm.c */
/* JADX INFO: compiled from: FuturesWelfareEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0001H\u0002¨\u0006\u0002"}, m90084d2 = {"normalizeTrialStatus", "", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C4630c {
    /* JADX WARN: Code duplicated, block: B:57:0x00a5 A[ORIG_RETURN, RETURN] */
    /* JADX INFO: renamed from: b */
    public static final String m4561b(String str) {
        String upperCase;
        if (str != null) {
            upperCase = str.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        } else {
            upperCase = null;
        }
        if (upperCase == null) {
            return str;
        }
        switch (upperCase.hashCode()) {
            case -1836143820:
                if (upperCase.equals("SWITCH")) {
                    return "RECYCLE_FINISHED";
                }
                return str;
            case -1617199657:
                if (upperCase.equals("INVALID")) {
                    return "RECYCLE_FINISHED";
                }
                return str;
            case -1303979599:
                return !upperCase.equals("ACTIVATED") ? str : "ACTIVATE_FINISHED";
            case -917017009:
                return !upperCase.equals("FINISHING") ? str : "USE_FINISHED";
            case -873347853:
                return !upperCase.equals("ACTIVATE") ? str : "ACTIVATE_FINISHED";
            case -591252731:
                if (upperCase.equals("EXPIRED")) {
                    return "RECYCLE_FINISHED";
                }
                return str;
            case -7811023:
                if (upperCase.equals("RECYCLED")) {
                    return "RECYCLE_FINISHED";
                }
                return str;
            case 68795:
                return !upperCase.equals("END") ? str : "USE_FINISHED";
            case 72642:
                return !upperCase.equals("ING") ? str : "ACTIVATE_FINISHED";
            case 2252048:
                return !upperCase.equals("INIT") ? str : "SEND_FINISHED";
            case 2614205:
                return !upperCase.equals("USED") ? str : "USE_FINISHED";
            case 1800863347:
                if (upperCase.equals("RECYCLE")) {
                    return "RECYCLE_FINISHED";
                }
                return str;
            case 1925346054:
                return !upperCase.equals("ACTIVE") ? str : "ACTIVATE_FINISHED";
            case 2059137311:
                if (upperCase.equals("EXPIRE")) {
                    return "RECYCLE_FINISHED";
                }
                return str;
            default:
                return str;
        }
    }
}
