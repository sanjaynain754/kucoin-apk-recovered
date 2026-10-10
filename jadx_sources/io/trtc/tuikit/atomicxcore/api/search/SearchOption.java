package io.trtc.tuikit.atomicxcore.api.search;

import io.trtc.tuikit.atomicxcore.api.call.AbstractC39396a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\t\u0010/\u001a\u00020\tHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000fHÆ\u0003JU\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u00104\u001a\u00020\u00052\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\tHÖ\u0001J\t\u00107\u001a\u000208HÖ\u0001R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u00069"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/search/SearchOption;", "", "keywordListMatchType", "Lio/trtc/tuikit/atomicxcore/api/search/KeywordListMatchType;", "isCloudSearch", "", "searchType", "Lio/trtc/tuikit/atomicxcore/api/search/SearchType;", "searchCount", "", "userFilter", "Lio/trtc/tuikit/atomicxcore/api/search/UserSearchFilter;", "groupMemberFilter", "Lio/trtc/tuikit/atomicxcore/api/search/GroupMemberSearchFilter;", "messageFilter", "Lio/trtc/tuikit/atomicxcore/api/search/MessageSearchFilter;", "(Lio/trtc/tuikit/atomicxcore/api/search/KeywordListMatchType;ZLio/trtc/tuikit/atomicxcore/api/search/SearchType;ILio/trtc/tuikit/atomicxcore/api/search/UserSearchFilter;Lio/trtc/tuikit/atomicxcore/api/search/GroupMemberSearchFilter;Lio/trtc/tuikit/atomicxcore/api/search/MessageSearchFilter;)V", "getGroupMemberFilter", "()Lio/trtc/tuikit/atomicxcore/api/search/GroupMemberSearchFilter;", "setGroupMemberFilter", "(Lio/trtc/tuikit/atomicxcore/api/search/GroupMemberSearchFilter;)V", "()Z", "setCloudSearch", "(Z)V", "getKeywordListMatchType", "()Lio/trtc/tuikit/atomicxcore/api/search/KeywordListMatchType;", "setKeywordListMatchType", "(Lio/trtc/tuikit/atomicxcore/api/search/KeywordListMatchType;)V", "getMessageFilter", "()Lio/trtc/tuikit/atomicxcore/api/search/MessageSearchFilter;", "setMessageFilter", "(Lio/trtc/tuikit/atomicxcore/api/search/MessageSearchFilter;)V", "getSearchCount", "()I", "setSearchCount", "(I)V", "getSearchType", "()Lio/trtc/tuikit/atomicxcore/api/search/SearchType;", "setSearchType", "(Lio/trtc/tuikit/atomicxcore/api/search/SearchType;)V", "getUserFilter", "()Lio/trtc/tuikit/atomicxcore/api/search/UserSearchFilter;", "setUserFilter", "(Lio/trtc/tuikit/atomicxcore/api/search/UserSearchFilter;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class SearchOption {

    @Nullable
    private GroupMemberSearchFilter groupMemberFilter;
    private boolean isCloudSearch;

    @NotNull
    private KeywordListMatchType keywordListMatchType;

    @Nullable
    private MessageSearchFilter messageFilter;
    private int searchCount;

    @NotNull
    private SearchType searchType;

    @Nullable
    private UserSearchFilter userFilter;

    public SearchOption() {
        this(null, false, null, 0, null, null, null, 127, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchOption)) {
            return false;
        }
        SearchOption searchOption = (SearchOption) other;
        return this.keywordListMatchType == searchOption.keywordListMatchType && this.isCloudSearch == searchOption.isCloudSearch && Intrinsics.areEqual(this.searchType, searchOption.searchType) && this.searchCount == searchOption.searchCount && Intrinsics.areEqual(this.userFilter, searchOption.userFilter) && Intrinsics.areEqual(this.groupMemberFilter, searchOption.groupMemberFilter) && Intrinsics.areEqual(this.messageFilter, searchOption.messageFilter);
    }

    public SearchOption(@NotNull KeywordListMatchType keywordListMatchType, boolean z11, @NotNull SearchType searchType, int i11, @Nullable UserSearchFilter userSearchFilter, @Nullable GroupMemberSearchFilter groupMemberSearchFilter, @Nullable MessageSearchFilter messageSearchFilter) {
        Intrinsics.checkNotNullParameter(keywordListMatchType, "keywordListMatchType");
        Intrinsics.checkNotNullParameter(searchType, "searchType");
        this.keywordListMatchType = keywordListMatchType;
        this.isCloudSearch = z11;
        this.searchType = searchType;
        this.searchCount = i11;
        this.userFilter = userSearchFilter;
        this.groupMemberFilter = groupMemberSearchFilter;
        this.messageFilter = messageSearchFilter;
    }

    public static /* synthetic */ SearchOption copy$default(SearchOption searchOption, KeywordListMatchType keywordListMatchType, boolean z11, SearchType searchType, int i11, UserSearchFilter userSearchFilter, GroupMemberSearchFilter groupMemberSearchFilter, MessageSearchFilter messageSearchFilter, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            keywordListMatchType = searchOption.keywordListMatchType;
        }
        if ((i12 & 2) != 0) {
            z11 = searchOption.isCloudSearch;
        }
        if ((i12 & 4) != 0) {
            searchType = searchOption.searchType;
        }
        if ((i12 & 8) != 0) {
            i11 = searchOption.searchCount;
        }
        if ((i12 & 16) != 0) {
            userSearchFilter = searchOption.userFilter;
        }
        if ((i12 & 32) != 0) {
            groupMemberSearchFilter = searchOption.groupMemberFilter;
        }
        if ((i12 & 64) != 0) {
            messageSearchFilter = searchOption.messageFilter;
        }
        GroupMemberSearchFilter groupMemberSearchFilter2 = groupMemberSearchFilter;
        MessageSearchFilter messageSearchFilter2 = messageSearchFilter;
        UserSearchFilter userSearchFilter2 = userSearchFilter;
        SearchType searchType2 = searchType;
        return searchOption.copy(keywordListMatchType, z11, searchType2, i11, userSearchFilter2, groupMemberSearchFilter2, messageSearchFilter2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final KeywordListMatchType getKeywordListMatchType() {
        return this.keywordListMatchType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsCloudSearch() {
        return this.isCloudSearch;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SearchType getSearchType() {
        return this.searchType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getSearchCount() {
        return this.searchCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final UserSearchFilter getUserFilter() {
        return this.userFilter;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final GroupMemberSearchFilter getGroupMemberFilter() {
        return this.groupMemberFilter;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final MessageSearchFilter getMessageFilter() {
        return this.messageFilter;
    }

    @NotNull
    public final SearchOption copy(@NotNull KeywordListMatchType keywordListMatchType, boolean isCloudSearch, @NotNull SearchType searchType, int searchCount, @Nullable UserSearchFilter userFilter, @Nullable GroupMemberSearchFilter groupMemberFilter, @Nullable MessageSearchFilter messageFilter) {
        Intrinsics.checkNotNullParameter(keywordListMatchType, "keywordListMatchType");
        Intrinsics.checkNotNullParameter(searchType, "searchType");
        return new SearchOption(keywordListMatchType, isCloudSearch, searchType, searchCount, userFilter, groupMemberFilter, messageFilter);
    }

    @Nullable
    public final GroupMemberSearchFilter getGroupMemberFilter() {
        return this.groupMemberFilter;
    }

    @NotNull
    public final KeywordListMatchType getKeywordListMatchType() {
        return this.keywordListMatchType;
    }

    @Nullable
    public final MessageSearchFilter getMessageFilter() {
        return this.messageFilter;
    }

    public final int getSearchCount() {
        return this.searchCount;
    }

    @NotNull
    public final SearchType getSearchType() {
        return this.searchType;
    }

    @Nullable
    public final UserSearchFilter getUserFilter() {
        return this.userFilter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    public int hashCode() {
        int iHashCode = this.keywordListMatchType.hashCode() * 31;
        boolean z11 = this.isCloudSearch;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int iM88225a = AbstractC39396a.m88225a(this.searchCount, (this.searchType.hashCode() + ((iHashCode + r11) * 31)) * 31, 31);
        UserSearchFilter userSearchFilter = this.userFilter;
        int iHashCode2 = (iM88225a + (userSearchFilter == null ? 0 : userSearchFilter.hashCode())) * 31;
        GroupMemberSearchFilter groupMemberSearchFilter = this.groupMemberFilter;
        int iHashCode3 = (iHashCode2 + (groupMemberSearchFilter == null ? 0 : groupMemberSearchFilter.hashCode())) * 31;
        MessageSearchFilter messageSearchFilter = this.messageFilter;
        return iHashCode3 + (messageSearchFilter != null ? messageSearchFilter.hashCode() : 0);
    }

    public final boolean isCloudSearch() {
        return this.isCloudSearch;
    }

    public final void setCloudSearch(boolean z11) {
        this.isCloudSearch = z11;
    }

    public final void setGroupMemberFilter(@Nullable GroupMemberSearchFilter groupMemberSearchFilter) {
        this.groupMemberFilter = groupMemberSearchFilter;
    }

    public final void setKeywordListMatchType(@NotNull KeywordListMatchType keywordListMatchType) {
        Intrinsics.checkNotNullParameter(keywordListMatchType, "<set-?>");
        this.keywordListMatchType = keywordListMatchType;
    }

    public final void setMessageFilter(@Nullable MessageSearchFilter messageSearchFilter) {
        this.messageFilter = messageSearchFilter;
    }

    public final void setSearchCount(int i11) {
        this.searchCount = i11;
    }

    public final void setSearchType(@NotNull SearchType searchType) {
        Intrinsics.checkNotNullParameter(searchType, "<set-?>");
        this.searchType = searchType;
    }

    public final void setUserFilter(@Nullable UserSearchFilter userSearchFilter) {
        this.userFilter = userSearchFilter;
    }

    @NotNull
    public String toString() {
        return "SearchOption(keywordListMatchType=" + this.keywordListMatchType + ", isCloudSearch=" + this.isCloudSearch + ", searchType=" + this.searchType + ", searchCount=" + this.searchCount + ", userFilter=" + this.userFilter + ", groupMemberFilter=" + this.groupMemberFilter + ", messageFilter=" + this.messageFilter + ')';
    }

    public /* synthetic */ SearchOption(KeywordListMatchType keywordListMatchType, boolean z11, SearchType searchType, int i11, UserSearchFilter userSearchFilter, GroupMemberSearchFilter groupMemberSearchFilter, MessageSearchFilter messageSearchFilter, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? KeywordListMatchType.OR : keywordListMatchType, (i12 & 2) != 0 ? false : z11, (i12 & 4) != 0 ? SearchType.Friend.m88228or(SearchType.Message).m88228or(SearchType.Group).m88228or(SearchType.GroupMember) : searchType, (i12 & 8) != 0 ? 20 : i11, (i12 & 16) != 0 ? null : userSearchFilter, (i12 & 32) != 0 ? null : groupMemberSearchFilter, (i12 & 64) != 0 ? null : messageSearchFilter);
    }
}
