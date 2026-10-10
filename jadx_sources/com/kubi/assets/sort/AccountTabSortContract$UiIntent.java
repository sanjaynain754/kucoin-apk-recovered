package com.kubi.assets.sort;

import com.kubi.mvi.state.InterfaceC19282d;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AccountTabSortContract.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/assets/sort/AccountTabSortContract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "LoadData", "UpdateSortMode", "OnSortChanged", "SortByAssetValue", "Lcom/kubi/assets/sort/AccountTabSortContract$UiIntent$LoadData;", "Lcom/kubi/assets/sort/AccountTabSortContract$UiIntent$OnSortChanged;", "Lcom/kubi/assets/sort/AccountTabSortContract$UiIntent$SortByAssetValue;", "Lcom/kubi/assets/sort/AccountTabSortContract$UiIntent$UpdateSortMode;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class AccountTabSortContract$UiIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: AccountTabSortContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/assets/sort/AccountTabSortContract$UiIntent$LoadData;", "Lcom/kubi/assets/sort/AccountTabSortContract$UiIntent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class LoadData extends AccountTabSortContract$UiIntent {

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
            return -132070931;
        }
    }

    /* JADX INFO: compiled from: AccountTabSortContract.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/assets/sort/AccountTabSortContract$UiIntent$OnSortChanged;", "Lcom/kubi/assets/sort/AccountTabSortContract$UiIntent;", "accounts", "", "Lcom/kubi/assets/sort/AccountTabSortData;", "<init>", "(Ljava/util/List;)V", "getAccounts", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class OnSortChanged extends AccountTabSortContract$UiIntent {

        @NotNull
        private final List<AccountTabSortData> accounts;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnSortChanged) && Intrinsics.areEqual(this.accounts, ((OnSortChanged) other).accounts);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnSortChanged(@NotNull List<AccountTabSortData> accounts) {
            super(null);
            Intrinsics.checkNotNullParameter(accounts, "accounts");
            this.accounts = accounts;
        }

        @NotNull
        public final List<AccountTabSortData> getAccounts() {
            return this.accounts;
        }

        public int hashCode() {
            return this.accounts.hashCode();
        }

        @NotNull
        public String toString() {
            return "OnSortChanged(accounts=" + this.accounts + ')';
        }
    }

    /* JADX INFO: compiled from: AccountTabSortContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/assets/sort/AccountTabSortContract$UiIntent$SortByAssetValue;", "Lcom/kubi/assets/sort/AccountTabSortContract$UiIntent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class SortByAssetValue extends AccountTabSortContract$UiIntent {

        @NotNull
        public static final SortByAssetValue INSTANCE = new SortByAssetValue();

        private SortByAssetValue() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof SortByAssetValue);
        }

        @NotNull
        public String toString() {
            return "SortByAssetValue";
        }

        public int hashCode() {
            return -1037668333;
        }
    }

    /* JADX INFO: compiled from: AccountTabSortContract.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/assets/sort/AccountTabSortContract$UiIntent$UpdateSortMode;", "Lcom/kubi/assets/sort/AccountTabSortContract$UiIntent;", "mode", "Lcom/kubi/assets/sort/DisplayMode;", "<init>", "(Lcom/kubi/assets/sort/DisplayMode;)V", "getMode", "()Lcom/kubi/assets/sort/DisplayMode;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class UpdateSortMode extends AccountTabSortContract$UiIntent {

        @NotNull
        private final DisplayMode mode;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdateSortMode) && this.mode == ((UpdateSortMode) other).mode;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateSortMode(@NotNull DisplayMode mode) {
            super(null);
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.mode = mode;
        }

        @NotNull
        public final DisplayMode getMode() {
            return this.mode;
        }

        public int hashCode() {
            return this.mode.hashCode();
        }

        @NotNull
        public String toString() {
            return "UpdateSortMode(mode=" + this.mode + ')';
        }
    }

    public /* synthetic */ AccountTabSortContract$UiIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AccountTabSortContract$UiIntent() {
    }
}
