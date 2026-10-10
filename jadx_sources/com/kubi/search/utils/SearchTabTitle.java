package com.kubi.search.utils;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.search.R$string;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.utils.C27017c;
import com.trtc.uikit.livekit.p180kc.data.entity.ClickCardReport;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.search.utils.c0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: SearchEx.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0017\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0017\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0017\u0010\r\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\t¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/search/utils/SearchTabTitle;", "", "<init>", "()V", TtmlNode.COMBINE_ALL, "", SearchCategory$Companion.SPOT, "count", "", "(Ljava/lang/Integer;)Ljava/lang/String;", ClickCardReport.ReportData.CARD_TYPE_FUTURE, SearchCategory$Companion.EARN, SearchCategory$Companion.WEB3, "alpha", "viewMore", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SearchTabTitle {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final SearchTabTitle f49156a = new SearchTabTitle();

    @NotNull
    /* JADX INFO: renamed from: j */
    public final String m59603j(@Nullable Integer num) {
        if (num == null) {
            return C27017c.f54310a.m66516f(R$string.kc_platform_search_more, new Object[0]);
        }
        return C27017c.f54310a.m66516f(R$string.kc_platform_search_more, new Object[0]) + '(' + (num.intValue() > 999 ? "999+" : String.valueOf(num)) + ')';
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m59594c(SearchTabTitle searchTabTitle, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        return searchTabTitle.m59599b(num);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m59595e(SearchTabTitle searchTabTitle, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        return searchTabTitle.m59600d(num);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ String m59596g(SearchTabTitle searchTabTitle, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        return searchTabTitle.m59601f(num);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ String m59597i(SearchTabTitle searchTabTitle, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        return searchTabTitle.m59602h(num);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m59598a() {
        return C27017c.f54310a.m66516f(R$string.kc_platform_search_all, new Object[0]);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m59599b(@Nullable Integer num) {
        if (num == null) {
            return C27017c.f54310a.m66516f(R$string.market_alpha, "");
        }
        String strValueOf = num.intValue() > 999 ? "999+" : String.valueOf(num);
        return C27017c.f54310a.m66516f(R$string.market_alpha_count, '(' + strValueOf + ')');
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final String m59600d(@Nullable Integer num) {
        if (num == null) {
            return C27017c.f54310a.m66516f(R$string.kc_platform_search_earn, "");
        }
        String strValueOf = num.intValue() > 999 ? "999+" : String.valueOf(num);
        return C27017c.f54310a.m66516f(R$string.kc_platform_search_earn, '(' + strValueOf + ')');
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final String m59601f(@Nullable Integer num) {
        if (num == null) {
            return C27017c.f54310a.m66516f(R$string.kc_platform_search_futures, "");
        }
        String strValueOf = num.intValue() > 999 ? "999+" : String.valueOf(num);
        return C27017c.f54310a.m66516f(R$string.kc_platform_search_futures, '(' + strValueOf + ')');
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final String m59602h(@Nullable Integer num) {
        if (num == null) {
            return C27017c.f54310a.m66516f(R$string.kc_platform_search_spot, "");
        }
        String strValueOf = num.intValue() > 999 ? "999+" : String.valueOf(num);
        return C27017c.f54310a.m66516f(R$string.kc_platform_search_spot, '(' + strValueOf + ')');
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final String m59604k(@Nullable Integer num) {
        if (num == null) {
            return C27017c.f54310a.m66516f(R$string.kc_platform_search_web3, "");
        }
        String strValueOf = num.intValue() > 999 ? "999+" : String.valueOf(num);
        return C27017c.f54310a.m66516f(R$string.kc_platform_search_web3, '(' + strValueOf + ')');
    }
}
