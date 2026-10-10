package wd0;

import java.util.LinkedHashSet;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: wd0.o, reason: from toString */
/* JADX INFO: compiled from: UserStore.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u001c\u0010\u0002\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00060\u0003HÆ\u0003J)\u0010\f\u001a\u00020\u00002\u001e\b\u0002\u0010\u0002\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00060\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R'\u0010\u0002\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/store/UserState;", "", "followingUserList", "Lkotlinx/coroutines/flow/StateFlow;", "Ljava/util/LinkedHashSet;", "", "Lkotlin/collections/LinkedHashSet;", "<init>", "(Lkotlinx/coroutines/flow/StateFlow;)V", "getFollowingUserList", "()Lkotlinx/coroutines/flow/StateFlow;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UserState {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final InterfaceC41678w<LinkedHashSet<String>> followingUserList;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UserState) && Intrinsics.areEqual(this.followingUserList, ((UserState) other).followingUserList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserState(@NotNull InterfaceC41678w<? extends LinkedHashSet<String>> followingUserList) {
        Intrinsics.checkNotNullParameter(followingUserList, "followingUserList");
        this.followingUserList = followingUserList;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final InterfaceC41678w<LinkedHashSet<String>> m101186a() {
        return this.followingUserList;
    }

    public int hashCode() {
        return this.followingUserList.hashCode();
    }

    @NotNull
    public String toString() {
        return "UserState(followingUserList=" + this.followingUserList + ')';
    }
}
