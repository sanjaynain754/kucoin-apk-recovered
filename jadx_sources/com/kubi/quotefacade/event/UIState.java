package com.kubi.quotefacade.event;

import com.kubi.mvi.state.InterfaceC19284f;
import com.kubi.quotefacade.entity.RecommendItemBean;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.quotefacade.event.RecommendCommonContract$UIState, reason: from toString */
/* JADX INFO: compiled from: RecommendCommonContract.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/quotefacade/event/RecommendCommonContract$UIState;", "Lcom/kubi/mvi/state/IState;", "recommendBeanList", "", "Lcom/kubi/quotefacade/entity/RecommendItemBean;", "selectSize", "", "empty", "", "<init>", "(Ljava/util/List;ILjava/lang/Object;)V", "getRecommendBeanList", "()Ljava/util/List;", "getSelectSize", "()I", "getEmpty", "()Ljava/lang/Object;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UIState implements InterfaceC19284f {

    @Nullable
    private final Object empty;

    @Nullable
    private final List<RecommendItemBean> recommendBeanList;
    private final int selectSize;

    public UIState() {
        this(null, 0, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UIState)) {
            return false;
        }
        UIState uIState = (UIState) other;
        return Intrinsics.areEqual(this.recommendBeanList, uIState.recommendBeanList) && this.selectSize == uIState.selectSize && Intrinsics.areEqual(this.empty, uIState.empty);
    }

    public UIState(@Nullable List<RecommendItemBean> list, int i11, @Nullable Object obj) {
        this.recommendBeanList = list;
        this.selectSize = i11;
        this.empty = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UIState copy$default(UIState uIState, List list, int i11, Object obj, int i12, Object obj2) {
        if ((i12 & 1) != 0) {
            list = uIState.recommendBeanList;
        }
        if ((i12 & 2) != 0) {
            i11 = uIState.selectSize;
        }
        if ((i12 & 4) != 0) {
            obj = uIState.empty;
        }
        return uIState.copy(list, i11, obj);
    }

    @NotNull
    public final UIState copy(@Nullable List<RecommendItemBean> recommendBeanList, int selectSize, @Nullable Object empty) {
        return new UIState(recommendBeanList, selectSize, empty);
    }

    @Nullable
    public final Object getEmpty() {
        return this.empty;
    }

    @Nullable
    public final List<RecommendItemBean> getRecommendBeanList() {
        return this.recommendBeanList;
    }

    public final int getSelectSize() {
        return this.selectSize;
    }

    public int hashCode() {
        List<RecommendItemBean> list = this.recommendBeanList;
        int iHashCode = (((list == null ? 0 : list.hashCode()) * 31) + Integer.hashCode(this.selectSize)) * 31;
        Object obj = this.empty;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UIState(recommendBeanList=" + this.recommendBeanList + ", selectSize=" + this.selectSize + ", empty=" + this.empty + ')';
    }

    public /* synthetic */ UIState(List list, int i11, Object obj, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? null : list, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? null : obj);
    }
}
