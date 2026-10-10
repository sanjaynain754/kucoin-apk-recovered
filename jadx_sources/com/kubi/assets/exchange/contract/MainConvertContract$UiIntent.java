package com.kubi.assets.exchange.contract;

import com.kubi.assets.entity.RedeemableEntity;
import com.kubi.mvi.state.InterfaceC19282d;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MainConvertContract.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/assets/exchange/contract/MainConvertContract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "QueryMainConvertList", "MainConvert", "Lcom/kubi/assets/exchange/contract/MainConvertContract$UiIntent$MainConvert;", "Lcom/kubi/assets/exchange/contract/MainConvertContract$UiIntent$QueryMainConvertList;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class MainConvertContract$UiIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: MainConvertContract.kt */
    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J#\u0010\u000b\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/assets/exchange/contract/MainConvertContract$UiIntent$MainConvert;", "Lcom/kubi/assets/exchange/contract/MainConvertContract$UiIntent;", TUIConstants.TUIContact.SELECTED_LIST, "Ljava/util/ArrayList;", "Lcom/kubi/assets/entity/RedeemableEntity;", "Lkotlin/collections/ArrayList;", "<init>", "(Ljava/util/ArrayList;)V", "getSelectedList", "()Ljava/util/ArrayList;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class MainConvert extends MainConvertContract$UiIntent {

        @NotNull
        private final ArrayList<RedeemableEntity> selectedList;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MainConvert) && Intrinsics.areEqual(this.selectedList, ((MainConvert) other).selectedList);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MainConvert(@NotNull ArrayList<RedeemableEntity> selectedList) {
            super(null);
            Intrinsics.checkNotNullParameter(selectedList, "selectedList");
            this.selectedList = selectedList;
        }

        @NotNull
        public final ArrayList<RedeemableEntity> getSelectedList() {
            return this.selectedList;
        }

        public int hashCode() {
            return this.selectedList.hashCode();
        }

        @NotNull
        public String toString() {
            return "MainConvert(selectedList=" + this.selectedList + ')';
        }
    }

    /* JADX INFO: compiled from: MainConvertContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/assets/exchange/contract/MainConvertContract$UiIntent$QueryMainConvertList;", "Lcom/kubi/assets/exchange/contract/MainConvertContract$UiIntent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class QueryMainConvertList extends MainConvertContract$UiIntent {

        @NotNull
        public static final QueryMainConvertList INSTANCE = new QueryMainConvertList();

        private QueryMainConvertList() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof QueryMainConvertList);
        }

        @NotNull
        public String toString() {
            return "QueryMainConvertList";
        }

        public int hashCode() {
            return -1790256352;
        }
    }

    public /* synthetic */ MainConvertContract$UiIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private MainConvertContract$UiIntent() {
    }
}
