package com.kubi.futures.trade.challenge;

import java.util.Locale;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.futures.trade.challenge.k */
/* JADX INFO: compiled from: TradeProTrialState.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"TRADE_PRO_TIMER_TAG", "", "isHiddenTradeProTrialStatus", "", "status", "normalizeTradeProChallengeStatus", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C13713k {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final String m26979b(@Nullable String str) {
        String upperCase;
        if (str != null) {
            Locale ROOT = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            upperCase = str.toUpperCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        } else {
            upperCase = null;
        }
        if (upperCase != null) {
            switch (upperCase.hashCode()) {
                case -1836143820:
                    if (upperCase.equals("SWITCH")) {
                        return "RECYCLE_FINISHED";
                    }
                    break;
                case -1617199657:
                    if (upperCase.equals("INVALID")) {
                        return "RECYCLE_FINISHED";
                    }
                    break;
                case -1303979599:
                    if (upperCase.equals("ACTIVATED")) {
                        return "ACTIVATE_FINISHED";
                    }
                    break;
                case -917017009:
                    if (upperCase.equals("FINISHING")) {
                        return "USE_FINISHED";
                    }
                    break;
                case -873347853:
                    if (upperCase.equals("ACTIVATE")) {
                        return "ACTIVATE_FINISHED";
                    }
                    break;
                case -591252731:
                    if (upperCase.equals("EXPIRED")) {
                        return "RECYCLE_FINISHED";
                    }
                    break;
                case -7811023:
                    if (upperCase.equals("RECYCLED")) {
                        return "RECYCLE_FINISHED";
                    }
                    break;
                case 68795:
                    if (upperCase.equals("END")) {
                        return "USE_FINISHED";
                    }
                    break;
                case 72642:
                    if (upperCase.equals("ING")) {
                        return "USE_FINISHED";
                    }
                    break;
                case 2252048:
                    if (upperCase.equals("INIT")) {
                        return "SEND_FINISHED";
                    }
                    break;
                case 2614205:
                    if (upperCase.equals("USED")) {
                        return "USE_FINISHED";
                    }
                    break;
                case 1800863347:
                    if (upperCase.equals("RECYCLE")) {
                        return "RECYCLE_FINISHED";
                    }
                    break;
                case 1925346054:
                    if (upperCase.equals("ACTIVE")) {
                        return "ACTIVATE_FINISHED";
                    }
                    break;
                case 2059137311:
                    if (upperCase.equals("EXPIRE")) {
                        return "RECYCLE_FINISHED";
                    }
                    break;
            }
        }
        if (str == null) {
            return null;
        }
        Locale ROOT2 = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT2, "ROOT");
        String upperCase2 = str.toUpperCase(ROOT2);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
        return upperCase2;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m26978a(@Nullable String str) {
        String upperCase;
        if (str != null) {
            Locale ROOT = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            upperCase = str.toUpperCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        } else {
            upperCase = null;
        }
        return Intrinsics.areEqual(upperCase, "RECYCLE_FINISHED") || Intrinsics.areEqual(upperCase, "WAIT_SEND");
    }
}
