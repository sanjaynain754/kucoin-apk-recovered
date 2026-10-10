package com.kubi.assets.dialog.evm;

import com.facebook.react.uimanager.ViewProps;
import com.kubi.assets.entity.EvmRepeatAddressResponseEntity;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.assets.dialog.evm.s, reason: from Kotlin metadata */
/* JADX INFO: compiled from: EvmRepeatChainVM.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/assets/dialog/evm/EvmRepeatChainIntent;", "", "<init>", "()V", "LoadRepeatAddressList", "SetInitialData", "ToggleGroupExpand", "DeleteItem", "DeleteRepeatAddress", "Lcom/kubi/assets/dialog/evm/EvmRepeatChainIntent$DeleteItem;", "Lcom/kubi/assets/dialog/evm/EvmRepeatChainIntent$DeleteRepeatAddress;", "Lcom/kubi/assets/dialog/evm/EvmRepeatChainIntent$LoadRepeatAddressList;", "Lcom/kubi/assets/dialog/evm/EvmRepeatChainIntent$SetInitialData;", "Lcom/kubi/assets/dialog/evm/EvmRepeatChainIntent$ToggleGroupExpand;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class EvmRepeatChainIntent {

    /* JADX INFO: renamed from: com.kubi.assets.dialog.evm.s$a, reason: from toString */
    /* JADX INFO: compiled from: EvmRepeatChainVM.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/assets/dialog/evm/EvmRepeatChainIntent$DeleteItem;", "Lcom/kubi/assets/dialog/evm/EvmRepeatChainIntent;", ViewProps.POSITION, "", "<init>", "(I)V", "getPosition", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class DeleteItem extends EvmRepeatChainIntent {

        /* JADX INFO: renamed from: a, reason: from toString */
        public final int position;

        public DeleteItem(int i11) {
            super(null);
            this.position = i11;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DeleteItem) && this.position == ((DeleteItem) other).position;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getPosition() {
            return this.position;
        }

        public int hashCode() {
            return Integer.hashCode(this.position);
        }

        @NotNull
        public String toString() {
            return "DeleteItem(position=" + this.position + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.dialog.evm.s$b */
    /* JADX INFO: compiled from: EvmRepeatChainVM.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/assets/dialog/evm/EvmRepeatChainIntent$DeleteRepeatAddress;", "Lcom/kubi/assets/dialog/evm/EvmRepeatChainIntent;", "<init>", "()V", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b extends EvmRepeatChainIntent {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final b f17083a = new b();

        public b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.dialog.evm.s$c, reason: from toString */
    /* JADX INFO: compiled from: EvmRepeatChainVM.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/assets/dialog/evm/EvmRepeatChainIntent$LoadRepeatAddressList;", "Lcom/kubi/assets/dialog/evm/EvmRepeatChainIntent;", "address", "", "memo", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getMemo", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class LoadRepeatAddressList extends EvmRepeatChainIntent {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final String address;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final String memo;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadRepeatAddressList)) {
                return false;
            }
            LoadRepeatAddressList loadRepeatAddressList = (LoadRepeatAddressList) other;
            return Intrinsics.areEqual(this.address, loadRepeatAddressList.address) && Intrinsics.areEqual(this.memo, loadRepeatAddressList.memo);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadRepeatAddressList(@NotNull String address, @NotNull String memo) {
            super(null);
            Intrinsics.checkNotNullParameter(address, "address");
            Intrinsics.checkNotNullParameter(memo, "memo");
            this.address = address;
            this.memo = memo;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAddress() {
            return this.address;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getMemo() {
            return this.memo;
        }

        public int hashCode() {
            return (this.address.hashCode() * 31) + this.memo.hashCode();
        }

        @NotNull
        public String toString() {
            return "LoadRepeatAddressList(address=" + this.address + ", memo=" + this.memo + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.dialog.evm.s$d, reason: from toString */
    /* JADX INFO: compiled from: EvmRepeatChainVM.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/assets/dialog/evm/EvmRepeatChainIntent$SetInitialData;", "Lcom/kubi/assets/dialog/evm/EvmRepeatChainIntent;", "list", "", "Lcom/kubi/assets/entity/EvmRepeatAddressResponseEntity;", "<init>", "(Ljava/util/List;)V", "getList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class SetInitialData extends EvmRepeatChainIntent {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final List<EvmRepeatAddressResponseEntity> list;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SetInitialData) && Intrinsics.areEqual(this.list, ((SetInitialData) other).list);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetInitialData(@NotNull List<EvmRepeatAddressResponseEntity> list) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "list");
            this.list = list;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final List<EvmRepeatAddressResponseEntity> m16299a() {
            return this.list;
        }

        public int hashCode() {
            return this.list.hashCode();
        }

        @NotNull
        public String toString() {
            return "SetInitialData(list=" + this.list + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.dialog.evm.s$e, reason: from toString */
    /* JADX INFO: compiled from: EvmRepeatChainVM.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/assets/dialog/evm/EvmRepeatChainIntent$ToggleGroupExpand;", "Lcom/kubi/assets/dialog/evm/EvmRepeatChainIntent;", ViewProps.POSITION, "", "<init>", "(I)V", "getPosition", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ToggleGroupExpand extends EvmRepeatChainIntent {

        /* JADX INFO: renamed from: a, reason: from toString */
        public final int position;

        public ToggleGroupExpand(int i11) {
            super(null);
            this.position = i11;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ToggleGroupExpand) && this.position == ((ToggleGroupExpand) other).position;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getPosition() {
            return this.position;
        }

        public int hashCode() {
            return Integer.hashCode(this.position);
        }

        @NotNull
        public String toString() {
            return "ToggleGroupExpand(position=" + this.position + ')';
        }
    }

    public /* synthetic */ EvmRepeatChainIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public EvmRepeatChainIntent() {
    }
}
