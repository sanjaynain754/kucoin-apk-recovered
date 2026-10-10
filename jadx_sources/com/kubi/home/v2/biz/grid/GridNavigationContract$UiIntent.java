package com.kubi.home.v2.biz.grid;

import com.kubi.mvi.state.InterfaceC19282d;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GridNavigationContract.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/home/v2/biz/grid/GridNavigationContract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "LoadData", "RefreshData", "ResetHomeData", "SaveHomeData", "Lcom/kubi/home/v2/biz/grid/GridNavigationContract$UiIntent$LoadData;", "Lcom/kubi/home/v2/biz/grid/GridNavigationContract$UiIntent$RefreshData;", "Lcom/kubi/home/v2/biz/grid/GridNavigationContract$UiIntent$ResetHomeData;", "Lcom/kubi/home/v2/biz/grid/GridNavigationContract$UiIntent$SaveHomeData;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class GridNavigationContract$UiIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: GridNavigationContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/home/v2/biz/grid/GridNavigationContract$UiIntent$LoadData;", "Lcom/kubi/home/v2/biz/grid/GridNavigationContract$UiIntent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class LoadData extends GridNavigationContract$UiIntent {

        @NotNull
        public static final LoadData INSTANCE = new LoadData();

        private LoadData() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof LoadData);
        }

        @NotNull
        public String toString() {
            return "LoadData";
        }

        public int hashCode() {
            return -1567964218;
        }
    }

    /* JADX INFO: compiled from: GridNavigationContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/home/v2/biz/grid/GridNavigationContract$UiIntent$RefreshData;", "Lcom/kubi/home/v2/biz/grid/GridNavigationContract$UiIntent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class RefreshData extends GridNavigationContract$UiIntent {

        @NotNull
        public static final RefreshData INSTANCE = new RefreshData();

        private RefreshData() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof RefreshData);
        }

        @NotNull
        public String toString() {
            return "RefreshData";
        }

        public int hashCode() {
            return -1475816625;
        }
    }

    /* JADX INFO: compiled from: GridNavigationContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/home/v2/biz/grid/GridNavigationContract$UiIntent$ResetHomeData;", "Lcom/kubi/home/v2/biz/grid/GridNavigationContract$UiIntent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ResetHomeData extends GridNavigationContract$UiIntent {

        @NotNull
        public static final ResetHomeData INSTANCE = new ResetHomeData();

        private ResetHomeData() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof ResetHomeData);
        }

        @NotNull
        public String toString() {
            return "ResetHomeData";
        }

        public int hashCode() {
            return -426216638;
        }
    }

    /* JADX INFO: compiled from: GridNavigationContract.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/home/v2/biz/grid/GridNavigationContract$UiIntent$SaveHomeData;", "Lcom/kubi/home/v2/biz/grid/GridNavigationContract$UiIntent;", "needClosePage", "", "ids", "", "", "<init>", "(ZLjava/util/List;)V", "getNeedClosePage", "()Z", "getIds", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class SaveHomeData extends GridNavigationContract$UiIntent {

        @NotNull
        private final List<String> ids;
        private final boolean needClosePage;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SaveHomeData)) {
                return false;
            }
            SaveHomeData saveHomeData = (SaveHomeData) other;
            return this.needClosePage == saveHomeData.needClosePage && Intrinsics.areEqual(this.ids, saveHomeData.ids);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SaveHomeData(boolean z11, @NotNull List<String> ids) {
            super(null);
            Intrinsics.checkNotNullParameter(ids, "ids");
            this.needClosePage = z11;
            this.ids = ids;
        }

        @NotNull
        public final List<String> getIds() {
            return this.ids;
        }

        public final boolean getNeedClosePage() {
            return this.needClosePage;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.needClosePage) * 31) + this.ids.hashCode();
        }

        @NotNull
        public String toString() {
            return "SaveHomeData(needClosePage=" + this.needClosePage + ", ids=" + this.ids + ')';
        }
    }

    public /* synthetic */ GridNavigationContract$UiIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private GridNavigationContract$UiIntent() {
    }
}
