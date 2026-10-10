package com.kubi.home.gembox;

import com.kubi.mvi.state.InterfaceC19284f;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.home.gembox.GemboxContract$UIState, reason: from toString */
/* JADX INFO: compiled from: GemboxContract.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/home/gembox/GemboxContract$UIState;", "Lcom/kubi/mvi/state/IState;", "data", "Lcom/kubi/home/gembox/GemboxCardData$Data;", "heatEntityList", "", "Lcom/kubi/home/gembox/HeatEntity;", "highLights", "Lcom/kubi/home/gembox/TextItem;", "<init>", "(Lcom/kubi/home/gembox/GemboxCardData$Data;Ljava/util/List;Ljava/util/List;)V", "getData", "()Lcom/kubi/home/gembox/GemboxCardData$Data;", "getHeatEntityList", "()Ljava/util/List;", "getHighLights", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UIState implements InterfaceC19284f {

    @NotNull
    private final GemboxCardData.Data data;

    @NotNull
    private final List<HeatEntity> heatEntityList;

    @NotNull
    private final List<TextItem> highLights;

    public UIState() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UIState)) {
            return false;
        }
        UIState uIState = (UIState) other;
        return Intrinsics.areEqual(this.data, uIState.data) && Intrinsics.areEqual(this.heatEntityList, uIState.heatEntityList) && Intrinsics.areEqual(this.highLights, uIState.highLights);
    }

    public UIState(@NotNull GemboxCardData.Data data, @NotNull List<HeatEntity> heatEntityList, @NotNull List<TextItem> highLights) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(heatEntityList, "heatEntityList");
        Intrinsics.checkNotNullParameter(highLights, "highLights");
        this.data = data;
        this.heatEntityList = heatEntityList;
        this.highLights = highLights;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UIState copy$default(UIState uIState, GemboxCardData.Data data, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            data = uIState.data;
        }
        if ((i11 & 2) != 0) {
            list = uIState.heatEntityList;
        }
        if ((i11 & 4) != 0) {
            list2 = uIState.highLights;
        }
        return uIState.copy(data, list, list2);
    }

    @NotNull
    public final UIState copy(@NotNull GemboxCardData.Data data, @NotNull List<HeatEntity> heatEntityList, @NotNull List<TextItem> highLights) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(heatEntityList, "heatEntityList");
        Intrinsics.checkNotNullParameter(highLights, "highLights");
        return new UIState(data, heatEntityList, highLights);
    }

    @NotNull
    public final GemboxCardData.Data getData() {
        return this.data;
    }

    @NotNull
    public final List<HeatEntity> getHeatEntityList() {
        return this.heatEntityList;
    }

    @NotNull
    public final List<TextItem> getHighLights() {
        return this.highLights;
    }

    public int hashCode() {
        return (((this.data.hashCode() * 31) + this.heatEntityList.hashCode()) * 31) + this.highLights.hashCode();
    }

    @NotNull
    public String toString() {
        return "UIState(data=" + this.data + ", heatEntityList=" + this.heatEntityList + ", highLights=" + this.highLights + ')';
    }

    public /* synthetic */ UIState(GemboxCardData.Data data, List list, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new GemboxCardData.Data(null, null, null, null, null, null, null, null, null, null, 1023, null) : data, (i11 & 2) != 0 ? CollectionsKt.emptyList() : list, (i11 & 4) != 0 ? CollectionsKt.emptyList() : list2);
    }
}
