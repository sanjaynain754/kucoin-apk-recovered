package io.trtc.tuikit.atomicxcore.api.search;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.impl.search.C39981p;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J*\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J\u001c\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0014"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/search/SearchStore;", "", "()V", "searchState", "Lio/trtc/tuikit/atomicxcore/api/search/SearchState;", "getSearchState", "()Lio/trtc/tuikit/atomicxcore/api/search/SearchState;", FirebaseAnalytics.Event.SEARCH, "", "keywordList", "", "", TUIConstants.TUIPollPlugin.PLUGIN_POLL_OPTION_CONTENT, "Lio/trtc/tuikit/atomicxcore/api/search/SearchOption;", "completion", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "searchMore", "searchType", "Lio/trtc/tuikit/atomicxcore/api/search/SearchType;", "Companion", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public abstract class SearchStore {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/search/SearchStore$Companion;", "", "()V", "create", "Lio/trtc/tuikit/atomicxcore/api/search/SearchStore;", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final SearchStore create() {
            return new C39981p();
        }
    }

    @NotNull
    public abstract SearchState getSearchState();

    public abstract void search(@NotNull List<String> keywordList, @NotNull SearchOption option, @Nullable CompletionHandler completion);

    public abstract void searchMore(@NotNull SearchType searchType, @Nullable CompletionHandler completion);

    @JvmStatic
    @NotNull
    public static final SearchStore create() {
        return INSTANCE.create();
    }

    public static /* synthetic */ void search$default(SearchStore searchStore, List list, SearchOption searchOption, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: search");
        }
        if ((i11 & 4) != 0) {
            completionHandler = null;
        }
        searchStore.search(list, searchOption, completionHandler);
    }

    public static /* synthetic */ void searchMore$default(SearchStore searchStore, SearchType searchType, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: searchMore");
        }
        if ((i11 & 2) != 0) {
            completionHandler = null;
        }
        searchStore.searchMore(searchType, completionHandler);
    }
}
