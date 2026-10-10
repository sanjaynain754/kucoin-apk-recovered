package wd0;

import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: wd0.e, reason: from toString */
/* JADX INFO: compiled from: AnchorCoHostStore.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J=\u0010\u001b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\nHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u000f\"\u0004\b\u0012\u0010\u0011R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006!"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorCoHostState;", "", "recommendUsers", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/CoHostAnchor;", "isLoadMore", "", "isLastPage", "coHostTemplateId", "", "<init>", "(Lkotlinx/coroutines/flow/StateFlow;ZZI)V", "getRecommendUsers", "()Lkotlinx/coroutines/flow/StateFlow;", "()Z", "setLoadMore", "(Z)V", "setLastPage", "getCoHostTemplateId", "()I", "setCoHostTemplateId", "(I)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AnchorCoHostState {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final InterfaceC41678w<List<CoHostAnchor>> recommendUsers;

    /* JADX INFO: renamed from: b, reason: from toString */
    public boolean isLoadMore;

    /* JADX INFO: renamed from: c, reason: from toString */
    public boolean isLastPage;

    /* JADX INFO: renamed from: d, reason: from toString */
    public int coHostTemplateId;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnchorCoHostState)) {
            return false;
        }
        AnchorCoHostState anchorCoHostState = (AnchorCoHostState) other;
        return Intrinsics.areEqual(this.recommendUsers, anchorCoHostState.recommendUsers) && this.isLoadMore == anchorCoHostState.isLoadMore && this.isLastPage == anchorCoHostState.isLastPage && this.coHostTemplateId == anchorCoHostState.coHostTemplateId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnchorCoHostState(@NotNull InterfaceC41678w<? extends List<CoHostAnchor>> recommendUsers, boolean z11, boolean z12, int i11) {
        Intrinsics.checkNotNullParameter(recommendUsers, "recommendUsers");
        this.recommendUsers = recommendUsers;
        this.isLoadMore = z11;
        this.isLastPage = z12;
        this.coHostTemplateId = i11;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final InterfaceC41678w<List<CoHostAnchor>> m101136a() {
        return this.recommendUsers;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsLastPage() {
        return this.isLastPage;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsLoadMore() {
        return this.isLoadMore;
    }

    /* JADX INFO: renamed from: d */
    public final void m101139d(int i11) {
        this.coHostTemplateId = i11;
    }

    /* JADX INFO: renamed from: e */
    public final void m101140e(boolean z11) {
        this.isLoadMore = z11;
    }

    public int hashCode() {
        return (((((this.recommendUsers.hashCode() * 31) + Boolean.hashCode(this.isLoadMore)) * 31) + Boolean.hashCode(this.isLastPage)) * 31) + Integer.hashCode(this.coHostTemplateId);
    }

    @NotNull
    public String toString() {
        return "AnchorCoHostState(recommendUsers=" + this.recommendUsers + ", isLoadMore=" + this.isLoadMore + ", isLastPage=" + this.isLastPage + ", coHostTemplateId=" + this.coHostTemplateId + ')';
    }
}
