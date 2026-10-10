package com.kubi.search.utils;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.search.utils.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: SearchConst.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/search/utils/SearchConst;", "", "<init>", "()V", "SEARCH_TAG", "", "PAGE_ID", "PREFIX", "EVENT_RESULT_CLICK", "EVENT_REALTIME_COUNTDOWN_FINISH", "EVENT_RESULT_FAV_CHANGE", "EVENT_RESULT_CHAIN_FAV_CHANGE", "EVENT_RESULT_ALPHA_FAV_CHANGE", "EVENT_VIEW_MORE_TAB", "EVENT_INIT_FINISH_HAS_DATA", "COUNT_MAX_HISTORY", "", "COUNT_MAX_HOT_SPOT", "COUNT_MAX_HOT_SPOT_PER_PAGE", "COUNT_MAX_FUTURE_EARN", "currentSearchSessionId", "getCurrentSearchSessionId", "()Ljava/lang/String;", "setCurrentSearchSessionId", "(Ljava/lang/String;)V", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SearchConst {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final SearchConst f49150a = new SearchConst();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static String f49151b = "";

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m59592a() {
        return f49151b;
    }

    /* JADX INFO: renamed from: b */
    public final void m59593b(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        f49151b = str;
    }
}
