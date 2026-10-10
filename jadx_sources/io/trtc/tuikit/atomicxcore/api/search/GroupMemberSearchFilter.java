package io.trtc.tuikit.atomicxcore.api.search;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0011"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/search/GroupMemberSearchFilter;", "", "groupIDList", "", "", "(Ljava/util/List;)V", "getGroupIDList", "()Ljava/util/List;", "setGroupIDList", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class GroupMemberSearchFilter {

    @NotNull
    private List<String> groupIDList;

    /* JADX WARN: Multi-variable type inference failed */
    public GroupMemberSearchFilter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GroupMemberSearchFilter) && Intrinsics.areEqual(this.groupIDList, ((GroupMemberSearchFilter) other).groupIDList);
    }

    public GroupMemberSearchFilter(@NotNull List<String> groupIDList) {
        Intrinsics.checkNotNullParameter(groupIDList, "groupIDList");
        this.groupIDList = groupIDList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GroupMemberSearchFilter copy$default(GroupMemberSearchFilter groupMemberSearchFilter, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = groupMemberSearchFilter.groupIDList;
        }
        return groupMemberSearchFilter.copy(list);
    }

    @NotNull
    public final List<String> component1() {
        return this.groupIDList;
    }

    @NotNull
    public final GroupMemberSearchFilter copy(@NotNull List<String> groupIDList) {
        Intrinsics.checkNotNullParameter(groupIDList, "groupIDList");
        return new GroupMemberSearchFilter(groupIDList);
    }

    @NotNull
    public final List<String> getGroupIDList() {
        return this.groupIDList;
    }

    public int hashCode() {
        return this.groupIDList.hashCode();
    }

    public final void setGroupIDList(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.groupIDList = list;
    }

    @NotNull
    public String toString() {
        return "GroupMemberSearchFilter(groupIDList=" + this.groupIDList + ')';
    }

    public /* synthetic */ GroupMemberSearchFilter(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? CollectionsKt.emptyList() : list);
    }
}
