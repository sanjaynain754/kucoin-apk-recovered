package p793yc;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yc.a, reason: from toString */
/* JADX INFO: compiled from: RequestPagingHandler.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B5\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003JG\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/core/base/arch/api/handler/PageData;", "ItemEntity", "", FirebaseAnalytics.Param.ITEMS, "", "page", "", "isHasNext", "", "totalCount", "totalPage", "<init>", "(Ljava/util/List;IZII)V", "getItems", "()Ljava/util/List;", "getPage", "()I", "()Z", "getTotalCount", "getTotalPage", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PageData<ItemEntity> {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final List<ItemEntity> items;

    /* JADX INFO: renamed from: b, reason: from toString */
    public final int page;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final boolean isHasNext;

    /* JADX INFO: renamed from: d, reason: from toString */
    public final int totalCount;

    /* JADX INFO: renamed from: e, reason: from toString */
    public final int totalPage;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageData)) {
            return false;
        }
        PageData pageData = (PageData) other;
        return Intrinsics.areEqual(this.items, pageData.items) && this.page == pageData.page && this.isHasNext == pageData.isHasNext && this.totalCount == pageData.totalCount && this.totalPage == pageData.totalPage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PageData(@NotNull List<? extends ItemEntity> items, int i11, boolean z11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.page = i11;
        this.isHasNext = z11;
        this.totalCount = i12;
        this.totalPage = i13;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<ItemEntity> m102503a() {
        return this.items;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getTotalCount() {
        return this.totalCount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsHasNext() {
        return this.isHasNext;
    }

    public int hashCode() {
        return (((((((this.items.hashCode() * 31) + Integer.hashCode(this.page)) * 31) + Boolean.hashCode(this.isHasNext)) * 31) + Integer.hashCode(this.totalCount)) * 31) + Integer.hashCode(this.totalPage);
    }

    @NotNull
    public String toString() {
        return "PageData(items=" + this.items + ", page=" + this.page + ", isHasNext=" + this.isHasNext + ", totalCount=" + this.totalCount + ", totalPage=" + this.totalPage + ')';
    }
}
