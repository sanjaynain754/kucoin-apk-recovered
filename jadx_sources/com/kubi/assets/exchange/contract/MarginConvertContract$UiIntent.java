package com.kubi.assets.exchange.contract;

import com.kubi.mvi.state.InterfaceC19282d;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p754xa.TokenItem;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarginConvertContract.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/assets/exchange/contract/MarginConvertContract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "QueryMarginConvertList", "MarginConvert", "Lcom/kubi/assets/exchange/contract/MarginConvertContract$UiIntent$MarginConvert;", "Lcom/kubi/assets/exchange/contract/MarginConvertContract$UiIntent$QueryMarginConvertList;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class MarginConvertContract$UiIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: MarginConvertContract.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/assets/exchange/contract/MarginConvertContract$UiIntent$MarginConvert;", "Lcom/kubi/assets/exchange/contract/MarginConvertContract$UiIntent;", TUIConstants.TUIContact.SELECTED_LIST, "", "Lcom/kubi/assets/exchange/model/TokenItem;", "<init>", "(Ljava/util/List;)V", "getSelectedList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class MarginConvert extends MarginConvertContract$UiIntent {

        @Nullable
        private final List<TokenItem> selectedList;

        public MarginConvert(@Nullable List<TokenItem> list) {
            super(null);
            this.selectedList = list;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MarginConvert) && Intrinsics.areEqual(this.selectedList, ((MarginConvert) other).selectedList);
        }

        @Nullable
        public final List<TokenItem> getSelectedList() {
            return this.selectedList;
        }

        public int hashCode() {
            List<TokenItem> list = this.selectedList;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @NotNull
        public String toString() {
            return "MarginConvert(selectedList=" + this.selectedList + ')';
        }
    }

    /* JADX INFO: compiled from: MarginConvertContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/assets/exchange/contract/MarginConvertContract$UiIntent$QueryMarginConvertList;", "Lcom/kubi/assets/exchange/contract/MarginConvertContract$UiIntent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class QueryMarginConvertList extends MarginConvertContract$UiIntent {

        @NotNull
        public static final QueryMarginConvertList INSTANCE = new QueryMarginConvertList();

        private QueryMarginConvertList() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof QueryMarginConvertList);
        }

        @NotNull
        public String toString() {
            return "QueryMarginConvertList";
        }

        public int hashCode() {
            return -2010577802;
        }
    }

    public /* synthetic */ MarginConvertContract$UiIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private MarginConvertContract$UiIntent() {
    }
}
