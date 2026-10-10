package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AccountDetailFreezeEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b\u0012\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b\u0012\u0010\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b\u0012\u0010\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0013\u0010(\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000bHÆ\u0003J\u0013\u0010)\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000bHÆ\u0003J\u0013\u0010*\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000bHÆ\u0003J\u0013\u0010+\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000bHÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J¸\u0001\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0012\b\u0002\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b2\u0012\b\u0002\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b2\u0012\b\u0002\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b2\u0012\b\u0002\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010.J\u0006\u0010/\u001a\u000200J\u0013\u00101\u001a\u00020\u00032\b\u00102\u001a\u0004\u0018\u000103HÖ\u0003J\t\u00104\u001a\u000200HÖ\u0001J\t\u00105\u001a\u000206HÖ\u0001J\u0016\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u000200R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0017\u0010\u0014R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0018\u0010\u0014R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0019\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u001b\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u001b\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001d¨\u0006<"}, m90084d2 = {"Lcom/kubi/assets/entity/AccountDetailFreezeEntity;", "Landroid/os/Parcelable;", "hasMoreWithdrawOrder", "", "hasMoreTradeOrder", "hasMoreP2pOrder", "hasMoreGreyMarketOrder", "hasMoreGemPool", "projectFreeze", "Lcom/kubi/assets/entity/ProjectFreeze;", "withdrawFreeze", "", "Lcom/kubi/assets/entity/FreezeData;", "tradeFreeze", "p2pFreeze", "greyMarketFreeze", "gemPoolList", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/kubi/assets/entity/ProjectFreeze;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getHasMoreWithdrawOrder", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHasMoreTradeOrder", "getHasMoreP2pOrder", "getHasMoreGreyMarketOrder", "getHasMoreGemPool", "getProjectFreeze", "()Lcom/kubi/assets/entity/ProjectFreeze;", "getWithdrawFreeze", "()Ljava/util/List;", "getTradeFreeze", "getP2pFreeze", "getGreyMarketFreeze", "getGemPoolList", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/kubi/assets/entity/ProjectFreeze;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/kubi/assets/entity/AccountDetailFreezeEntity;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AccountDetailFreezeEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AccountDetailFreezeEntity> CREATOR = new Creator();

    @Nullable
    private final List<FreezeData> gemPoolList;

    @Nullable
    private final List<FreezeData> greyMarketFreeze;

    @Nullable
    private final Boolean hasMoreGemPool;

    @Nullable
    private final Boolean hasMoreGreyMarketOrder;

    @Nullable
    private final Boolean hasMoreP2pOrder;

    @Nullable
    private final Boolean hasMoreTradeOrder;

    @Nullable
    private final Boolean hasMoreWithdrawOrder;

    @Nullable
    private final List<FreezeData> p2pFreeze;

    @Nullable
    private final ProjectFreeze projectFreeze;

    @Nullable
    private final List<FreezeData> tradeFreeze;

    @Nullable
    private final List<FreezeData> withdrawFreeze;

    /* JADX INFO: compiled from: AccountDetailFreezeEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<AccountDetailFreezeEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountDetailFreezeEntity createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ArrayList arrayList5 = null;
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf3 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf4 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf5 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            ProjectFreeze projectFreezeCreateFromParcel = parcel.readInt() == 0 ? null : ProjectFreeze.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList6.add(parcel.readInt() == 0 ? null : FreezeData.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList6;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList7.add(parcel.readInt() == 0 ? null : FreezeData.CREATOR.createFromParcel(parcel));
                }
                arrayList2 = arrayList7;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i15 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(i15);
                for (int i16 = 0; i16 != i15; i16++) {
                    arrayList8.add(parcel.readInt() == 0 ? null : FreezeData.CREATOR.createFromParcel(parcel));
                }
                arrayList3 = arrayList8;
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int i17 = parcel.readInt();
                ArrayList arrayList9 = new ArrayList(i17);
                for (int i18 = 0; i18 != i17; i18++) {
                    arrayList9.add(parcel.readInt() == 0 ? null : FreezeData.CREATOR.createFromParcel(parcel));
                }
                arrayList4 = arrayList9;
            }
            if (parcel.readInt() != 0) {
                int i19 = parcel.readInt();
                arrayList5 = new ArrayList(i19);
                for (int i21 = 0; i21 != i19; i21++) {
                    arrayList5.add(FreezeData.CREATOR.createFromParcel(parcel));
                }
            }
            return new AccountDetailFreezeEntity(boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4, boolValueOf5, projectFreezeCreateFromParcel, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountDetailFreezeEntity[] newArray(int i11) {
            return new AccountDetailFreezeEntity[i11];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountDetailFreezeEntity)) {
            return false;
        }
        AccountDetailFreezeEntity accountDetailFreezeEntity = (AccountDetailFreezeEntity) other;
        return Intrinsics.areEqual(this.hasMoreWithdrawOrder, accountDetailFreezeEntity.hasMoreWithdrawOrder) && Intrinsics.areEqual(this.hasMoreTradeOrder, accountDetailFreezeEntity.hasMoreTradeOrder) && Intrinsics.areEqual(this.hasMoreP2pOrder, accountDetailFreezeEntity.hasMoreP2pOrder) && Intrinsics.areEqual(this.hasMoreGreyMarketOrder, accountDetailFreezeEntity.hasMoreGreyMarketOrder) && Intrinsics.areEqual(this.hasMoreGemPool, accountDetailFreezeEntity.hasMoreGemPool) && Intrinsics.areEqual(this.projectFreeze, accountDetailFreezeEntity.projectFreeze) && Intrinsics.areEqual(this.withdrawFreeze, accountDetailFreezeEntity.withdrawFreeze) && Intrinsics.areEqual(this.tradeFreeze, accountDetailFreezeEntity.tradeFreeze) && Intrinsics.areEqual(this.p2pFreeze, accountDetailFreezeEntity.p2pFreeze) && Intrinsics.areEqual(this.greyMarketFreeze, accountDetailFreezeEntity.greyMarketFreeze) && Intrinsics.areEqual(this.gemPoolList, accountDetailFreezeEntity.gemPoolList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccountDetailFreezeEntity copy$default(AccountDetailFreezeEntity accountDetailFreezeEntity, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, ProjectFreeze projectFreeze, List list, List list2, List list3, List list4, List list5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = accountDetailFreezeEntity.hasMoreWithdrawOrder;
        }
        if ((i11 & 2) != 0) {
            bool2 = accountDetailFreezeEntity.hasMoreTradeOrder;
        }
        if ((i11 & 4) != 0) {
            bool3 = accountDetailFreezeEntity.hasMoreP2pOrder;
        }
        if ((i11 & 8) != 0) {
            bool4 = accountDetailFreezeEntity.hasMoreGreyMarketOrder;
        }
        if ((i11 & 16) != 0) {
            bool5 = accountDetailFreezeEntity.hasMoreGemPool;
        }
        if ((i11 & 32) != 0) {
            projectFreeze = accountDetailFreezeEntity.projectFreeze;
        }
        if ((i11 & 64) != 0) {
            list = accountDetailFreezeEntity.withdrawFreeze;
        }
        if ((i11 & 128) != 0) {
            list2 = accountDetailFreezeEntity.tradeFreeze;
        }
        if ((i11 & 256) != 0) {
            list3 = accountDetailFreezeEntity.p2pFreeze;
        }
        if ((i11 & 512) != 0) {
            list4 = accountDetailFreezeEntity.greyMarketFreeze;
        }
        if ((i11 & 1024) != 0) {
            list5 = accountDetailFreezeEntity.gemPoolList;
        }
        List list6 = list4;
        List list7 = list5;
        List list8 = list2;
        List list9 = list3;
        ProjectFreeze projectFreeze2 = projectFreeze;
        List list10 = list;
        Boolean bool6 = bool5;
        Boolean bool7 = bool3;
        return accountDetailFreezeEntity.copy(bool, bool2, bool7, bool4, bool6, projectFreeze2, list10, list8, list9, list6, list7);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getHasMoreWithdrawOrder() {
        return this.hasMoreWithdrawOrder;
    }

    @Nullable
    public final List<FreezeData> component10() {
        return this.greyMarketFreeze;
    }

    @Nullable
    public final List<FreezeData> component11() {
        return this.gemPoolList;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getHasMoreTradeOrder() {
        return this.hasMoreTradeOrder;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getHasMoreP2pOrder() {
        return this.hasMoreP2pOrder;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getHasMoreGreyMarketOrder() {
        return this.hasMoreGreyMarketOrder;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getHasMoreGemPool() {
        return this.hasMoreGemPool;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ProjectFreeze getProjectFreeze() {
        return this.projectFreeze;
    }

    @Nullable
    public final List<FreezeData> component7() {
        return this.withdrawFreeze;
    }

    @Nullable
    public final List<FreezeData> component8() {
        return this.tradeFreeze;
    }

    @Nullable
    public final List<FreezeData> component9() {
        return this.p2pFreeze;
    }

    @NotNull
    public final AccountDetailFreezeEntity copy(@Nullable Boolean hasMoreWithdrawOrder, @Nullable Boolean hasMoreTradeOrder, @Nullable Boolean hasMoreP2pOrder, @Nullable Boolean hasMoreGreyMarketOrder, @Nullable Boolean hasMoreGemPool, @Nullable ProjectFreeze projectFreeze, @Nullable List<FreezeData> withdrawFreeze, @Nullable List<FreezeData> tradeFreeze, @Nullable List<FreezeData> p2pFreeze, @Nullable List<FreezeData> greyMarketFreeze, @Nullable List<FreezeData> gemPoolList) {
        return new AccountDetailFreezeEntity(hasMoreWithdrawOrder, hasMoreTradeOrder, hasMoreP2pOrder, hasMoreGreyMarketOrder, hasMoreGemPool, projectFreeze, withdrawFreeze, tradeFreeze, p2pFreeze, greyMarketFreeze, gemPoolList);
    }

    @Nullable
    public final List<FreezeData> getGemPoolList() {
        return this.gemPoolList;
    }

    @Nullable
    public final List<FreezeData> getGreyMarketFreeze() {
        return this.greyMarketFreeze;
    }

    @Nullable
    public final Boolean getHasMoreGemPool() {
        return this.hasMoreGemPool;
    }

    @Nullable
    public final Boolean getHasMoreGreyMarketOrder() {
        return this.hasMoreGreyMarketOrder;
    }

    @Nullable
    public final Boolean getHasMoreP2pOrder() {
        return this.hasMoreP2pOrder;
    }

    @Nullable
    public final Boolean getHasMoreTradeOrder() {
        return this.hasMoreTradeOrder;
    }

    @Nullable
    public final Boolean getHasMoreWithdrawOrder() {
        return this.hasMoreWithdrawOrder;
    }

    @Nullable
    public final List<FreezeData> getP2pFreeze() {
        return this.p2pFreeze;
    }

    @Nullable
    public final ProjectFreeze getProjectFreeze() {
        return this.projectFreeze;
    }

    @Nullable
    public final List<FreezeData> getTradeFreeze() {
        return this.tradeFreeze;
    }

    @Nullable
    public final List<FreezeData> getWithdrawFreeze() {
        return this.withdrawFreeze;
    }

    public int hashCode() {
        Boolean bool = this.hasMoreWithdrawOrder;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.hasMoreTradeOrder;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.hasMoreP2pOrder;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.hasMoreGreyMarketOrder;
        int iHashCode4 = (iHashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.hasMoreGemPool;
        int iHashCode5 = (iHashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        ProjectFreeze projectFreeze = this.projectFreeze;
        int iHashCode6 = (iHashCode5 + (projectFreeze == null ? 0 : projectFreeze.hashCode())) * 31;
        List<FreezeData> list = this.withdrawFreeze;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List<FreezeData> list2 = this.tradeFreeze;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<FreezeData> list3 = this.p2pFreeze;
        int iHashCode9 = (iHashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<FreezeData> list4 = this.greyMarketFreeze;
        int iHashCode10 = (iHashCode9 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<FreezeData> list5 = this.gemPoolList;
        return iHashCode10 + (list5 != null ? list5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AccountDetailFreezeEntity(hasMoreWithdrawOrder=" + this.hasMoreWithdrawOrder + ", hasMoreTradeOrder=" + this.hasMoreTradeOrder + ", hasMoreP2pOrder=" + this.hasMoreP2pOrder + ", hasMoreGreyMarketOrder=" + this.hasMoreGreyMarketOrder + ", hasMoreGemPool=" + this.hasMoreGemPool + ", projectFreeze=" + this.projectFreeze + ", withdrawFreeze=" + this.withdrawFreeze + ", tradeFreeze=" + this.tradeFreeze + ", p2pFreeze=" + this.p2pFreeze + ", greyMarketFreeze=" + this.greyMarketFreeze + ", gemPoolList=" + this.gemPoolList + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Boolean bool = this.hasMoreWithdrawOrder;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.hasMoreTradeOrder;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.hasMoreP2pOrder;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Boolean bool4 = this.hasMoreGreyMarketOrder;
        if (bool4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Boolean bool5 = this.hasMoreGemPool;
        if (bool5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        ProjectFreeze projectFreeze = this.projectFreeze;
        if (projectFreeze == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            projectFreeze.writeToParcel(dest, flags);
        }
        List<FreezeData> list = this.withdrawFreeze;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            for (FreezeData freezeData : list) {
                if (freezeData == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    freezeData.writeToParcel(dest, flags);
                }
            }
        }
        List<FreezeData> list2 = this.tradeFreeze;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list2.size());
            for (FreezeData freezeData2 : list2) {
                if (freezeData2 == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    freezeData2.writeToParcel(dest, flags);
                }
            }
        }
        List<FreezeData> list3 = this.p2pFreeze;
        if (list3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list3.size());
            for (FreezeData freezeData3 : list3) {
                if (freezeData3 == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    freezeData3.writeToParcel(dest, flags);
                }
            }
        }
        List<FreezeData> list4 = this.greyMarketFreeze;
        if (list4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list4.size());
            for (FreezeData freezeData4 : list4) {
                if (freezeData4 == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    freezeData4.writeToParcel(dest, flags);
                }
            }
        }
        List<FreezeData> list5 = this.gemPoolList;
        if (list5 == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list5.size());
        Iterator<FreezeData> it = list5.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public AccountDetailFreezeEntity(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable ProjectFreeze projectFreeze, @Nullable List<FreezeData> list, @Nullable List<FreezeData> list2, @Nullable List<FreezeData> list3, @Nullable List<FreezeData> list4, @Nullable List<FreezeData> list5) {
        this.hasMoreWithdrawOrder = bool;
        this.hasMoreTradeOrder = bool2;
        this.hasMoreP2pOrder = bool3;
        this.hasMoreGreyMarketOrder = bool4;
        this.hasMoreGemPool = bool5;
        this.projectFreeze = projectFreeze;
        this.withdrawFreeze = list;
        this.tradeFreeze = list2;
        this.p2pFreeze = list3;
        this.greyMarketFreeze = list4;
        this.gemPoolList = list5;
    }
}
