package com.kubi.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.kubi.user.protocol.entity.SignTermItem;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarketBean.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b8\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B»\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010!J\u0010\u0010>\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010!J\t\u0010?\u001a\u00020\tHÆ\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010A\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010!J\u0010\u0010B\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010!J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010)J\u000b\u0010F\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0011\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015HÆ\u0003J\u0010\u0010J\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u00109JÒ\u0001\u0010K\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0002\u0010LJ\u0006\u0010M\u001a\u00020\u0017J\u0013\u0010N\u001a\u00020\t2\b\u0010O\u001a\u0004\u0018\u00010PHÖ\u0003J\t\u0010Q\u001a\u00020\u0017HÖ\u0001J\t\u0010R\u001a\u00020\u0003HÖ\u0001J\u0016\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020\u0017R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b#\u0010!R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001e\u0010\n\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010,\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b-\u0010!R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b.\u0010!R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001bR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010,\u001a\u0004\b1\u0010)R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b4\u00103R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b5\u00103R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\n\n\u0002\u0010:\u001a\u0004\b8\u00109¨\u0006X"}, m90084d2 = {"Lcom/kubi/data/entity/MaintenanceEntity;", "Landroid/os/Parcelable;", "title", "", SignTermItem.LINK, "endAt", "", "startAt", "maintenance", "", "maintenanceV2", "cancelStartAt", "cancelEndAt", "redirectContent", "appNoticeLocation", "allowCancelOrder", "titleList", "Lcom/kubi/data/entity/ContentEntity;", "linkUrlList", "linkTextList", "symbolList", "", "maintenanceScope", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;ZLjava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/kubi/data/entity/ContentEntity;Lcom/kubi/data/entity/ContentEntity;Lcom/kubi/data/entity/ContentEntity;Ljava/util/List;Ljava/lang/Integer;)V", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "getLink", "setLink", "getEndAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getStartAt", "getMaintenance", "()Z", "setMaintenance", "(Z)V", "getMaintenanceV2", "()Ljava/lang/Boolean;", "setMaintenanceV2", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getCancelStartAt", "getCancelEndAt", "getRedirectContent", "getAppNoticeLocation", "getAllowCancelOrder", "getTitleList", "()Lcom/kubi/data/entity/ContentEntity;", "getLinkUrlList", "getLinkTextList", "getSymbolList", "()Ljava/util/List;", "getMaintenanceScope", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;ZLjava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/kubi/data/entity/ContentEntity;Lcom/kubi/data/entity/ContentEntity;Lcom/kubi/data/entity/ContentEntity;Ljava/util/List;Ljava/lang/Integer;)Lcom/kubi/data/entity/MaintenanceEntity;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MaintenanceEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MaintenanceEntity> CREATOR = new Creator();

    @Nullable
    private final Boolean allowCancelOrder;

    @Nullable
    private final String appNoticeLocation;

    @Nullable
    private final Long cancelEndAt;

    @Nullable
    private final Long cancelStartAt;

    @Nullable
    private final Long endAt;

    @Nullable
    private String link;

    @Nullable
    private final ContentEntity linkTextList;

    @Nullable
    private final ContentEntity linkUrlList;
    private boolean maintenance;

    @Nullable
    private final Integer maintenanceScope;

    @Nullable
    private Boolean maintenanceV2;

    @Nullable
    private final String redirectContent;

    @Nullable
    private final Long startAt;

    @Nullable
    private final List<String> symbolList;

    @Nullable
    private String title;

    @Nullable
    private final ContentEntity titleList;

    /* JADX INFO: compiled from: MarketBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<MaintenanceEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MaintenanceEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            boolean z11 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Long lValueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf4 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long l11 = lValueOf3;
            String string3 = parcel.readString();
            boolean z12 = false;
            Boolean bool = boolValueOf;
            Long l12 = lValueOf4;
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z12 = true;
                }
                boolValueOf2 = Boolean.valueOf(z12);
            }
            return new MaintenanceEntity(string, string2, lValueOf, lValueOf2, z11, bool, l11, l12, string3, string4, boolValueOf2, parcel.readInt() == 0 ? null : ContentEntity.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ContentEntity.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ContentEntity.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MaintenanceEntity[] newArray(int i11) {
            return new MaintenanceEntity[i11];
        }
    }

    public MaintenanceEntity(@Nullable String str, @Nullable String str2, @Nullable Long l11, @Nullable Long l12, boolean z11, @Nullable Boolean bool, @Nullable Long l13, @Nullable Long l14, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool2, @Nullable ContentEntity contentEntity, @Nullable ContentEntity contentEntity2, @Nullable ContentEntity contentEntity3, @Nullable List<String> list, @Nullable Integer num) {
        this.title = str;
        this.link = str2;
        this.endAt = l11;
        this.startAt = l12;
        this.maintenance = z11;
        this.maintenanceV2 = bool;
        this.cancelStartAt = l13;
        this.cancelEndAt = l14;
        this.redirectContent = str3;
        this.appNoticeLocation = str4;
        this.allowCancelOrder = bool2;
        this.titleList = contentEntity;
        this.linkUrlList = contentEntity2;
        this.linkTextList = contentEntity3;
        this.symbolList = list;
        this.maintenanceScope = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MaintenanceEntity)) {
            return false;
        }
        MaintenanceEntity maintenanceEntity = (MaintenanceEntity) other;
        return Intrinsics.areEqual(this.title, maintenanceEntity.title) && Intrinsics.areEqual(this.link, maintenanceEntity.link) && Intrinsics.areEqual(this.endAt, maintenanceEntity.endAt) && Intrinsics.areEqual(this.startAt, maintenanceEntity.startAt) && this.maintenance == maintenanceEntity.maintenance && Intrinsics.areEqual(this.maintenanceV2, maintenanceEntity.maintenanceV2) && Intrinsics.areEqual(this.cancelStartAt, maintenanceEntity.cancelStartAt) && Intrinsics.areEqual(this.cancelEndAt, maintenanceEntity.cancelEndAt) && Intrinsics.areEqual(this.redirectContent, maintenanceEntity.redirectContent) && Intrinsics.areEqual(this.appNoticeLocation, maintenanceEntity.appNoticeLocation) && Intrinsics.areEqual(this.allowCancelOrder, maintenanceEntity.allowCancelOrder) && Intrinsics.areEqual(this.titleList, maintenanceEntity.titleList) && Intrinsics.areEqual(this.linkUrlList, maintenanceEntity.linkUrlList) && Intrinsics.areEqual(this.linkTextList, maintenanceEntity.linkTextList) && Intrinsics.areEqual(this.symbolList, maintenanceEntity.symbolList) && Intrinsics.areEqual(this.maintenanceScope, maintenanceEntity.maintenanceScope);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getAppNoticeLocation() {
        return this.appNoticeLocation;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getAllowCancelOrder() {
        return this.allowCancelOrder;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final ContentEntity getTitleList() {
        return this.titleList;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final ContentEntity getLinkUrlList() {
        return this.linkUrlList;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final ContentEntity getLinkTextList() {
        return this.linkTextList;
    }

    @Nullable
    public final List<String> component15() {
        return this.symbolList;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Integer getMaintenanceScope() {
        return this.maintenanceScope;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getEndAt() {
        return this.endAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getStartAt() {
        return this.startAt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getMaintenance() {
        return this.maintenance;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getMaintenanceV2() {
        return this.maintenanceV2;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getCancelStartAt() {
        return this.cancelStartAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getCancelEndAt() {
        return this.cancelEndAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getRedirectContent() {
        return this.redirectContent;
    }

    @NotNull
    public final MaintenanceEntity copy(@Nullable String title, @Nullable String link, @Nullable Long endAt, @Nullable Long startAt, boolean maintenance, @Nullable Boolean maintenanceV2, @Nullable Long cancelStartAt, @Nullable Long cancelEndAt, @Nullable String redirectContent, @Nullable String appNoticeLocation, @Nullable Boolean allowCancelOrder, @Nullable ContentEntity titleList, @Nullable ContentEntity linkUrlList, @Nullable ContentEntity linkTextList, @Nullable List<String> symbolList, @Nullable Integer maintenanceScope) {
        return new MaintenanceEntity(title, link, endAt, startAt, maintenance, maintenanceV2, cancelStartAt, cancelEndAt, redirectContent, appNoticeLocation, allowCancelOrder, titleList, linkUrlList, linkTextList, symbolList, maintenanceScope);
    }

    @Nullable
    public final Boolean getAllowCancelOrder() {
        return this.allowCancelOrder;
    }

    @Nullable
    public final String getAppNoticeLocation() {
        return this.appNoticeLocation;
    }

    @Nullable
    public final Long getCancelEndAt() {
        return this.cancelEndAt;
    }

    @Nullable
    public final Long getCancelStartAt() {
        return this.cancelStartAt;
    }

    @Nullable
    public final Long getEndAt() {
        return this.endAt;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final ContentEntity getLinkTextList() {
        return this.linkTextList;
    }

    @Nullable
    public final ContentEntity getLinkUrlList() {
        return this.linkUrlList;
    }

    public final boolean getMaintenance() {
        return this.maintenance;
    }

    @Nullable
    public final Integer getMaintenanceScope() {
        return this.maintenanceScope;
    }

    @Nullable
    public final Boolean getMaintenanceV2() {
        return this.maintenanceV2;
    }

    @Nullable
    public final String getRedirectContent() {
        return this.redirectContent;
    }

    @Nullable
    public final Long getStartAt() {
        return this.startAt;
    }

    @Nullable
    public final List<String> getSymbolList() {
        return this.symbolList;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final ContentEntity getTitleList() {
        return this.titleList;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.link;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.endAt;
        int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.startAt;
        int iHashCode4 = (((iHashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31) + Boolean.hashCode(this.maintenance)) * 31;
        Boolean bool = this.maintenanceV2;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l13 = this.cancelStartAt;
        int iHashCode6 = (iHashCode5 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.cancelEndAt;
        int iHashCode7 = (iHashCode6 + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str3 = this.redirectContent;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.appNoticeLocation;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool2 = this.allowCancelOrder;
        int iHashCode10 = (iHashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        ContentEntity contentEntity = this.titleList;
        int iHashCode11 = (iHashCode10 + (contentEntity == null ? 0 : contentEntity.hashCode())) * 31;
        ContentEntity contentEntity2 = this.linkUrlList;
        int iHashCode12 = (iHashCode11 + (contentEntity2 == null ? 0 : contentEntity2.hashCode())) * 31;
        ContentEntity contentEntity3 = this.linkTextList;
        int iHashCode13 = (iHashCode12 + (contentEntity3 == null ? 0 : contentEntity3.hashCode())) * 31;
        List<String> list = this.symbolList;
        int iHashCode14 = (iHashCode13 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.maintenanceScope;
        return iHashCode14 + (num != null ? num.hashCode() : 0);
    }

    public final void setLink(@Nullable String str) {
        this.link = str;
    }

    public final void setMaintenance(boolean z11) {
        this.maintenance = z11;
    }

    public final void setMaintenanceV2(@Nullable Boolean bool) {
        this.maintenanceV2 = bool;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    @NotNull
    public String toString() {
        return "MaintenanceEntity(title=" + this.title + ", link=" + this.link + ", endAt=" + this.endAt + ", startAt=" + this.startAt + ", maintenance=" + this.maintenance + ", maintenanceV2=" + this.maintenanceV2 + ", cancelStartAt=" + this.cancelStartAt + ", cancelEndAt=" + this.cancelEndAt + ", redirectContent=" + this.redirectContent + ", appNoticeLocation=" + this.appNoticeLocation + ", allowCancelOrder=" + this.allowCancelOrder + ", titleList=" + this.titleList + ", linkUrlList=" + this.linkUrlList + ", linkTextList=" + this.linkTextList + ", symbolList=" + this.symbolList + ", maintenanceScope=" + this.maintenanceScope + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.link);
        Long l11 = this.endAt;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        Long l12 = this.startAt;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
        dest.writeInt(this.maintenance ? 1 : 0);
        Boolean bool = this.maintenanceV2;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Long l13 = this.cancelStartAt;
        if (l13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l13.longValue());
        }
        Long l14 = this.cancelEndAt;
        if (l14 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l14.longValue());
        }
        dest.writeString(this.redirectContent);
        dest.writeString(this.appNoticeLocation);
        Boolean bool2 = this.allowCancelOrder;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        ContentEntity contentEntity = this.titleList;
        if (contentEntity == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            contentEntity.writeToParcel(dest, flags);
        }
        ContentEntity contentEntity2 = this.linkUrlList;
        if (contentEntity2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            contentEntity2.writeToParcel(dest, flags);
        }
        ContentEntity contentEntity3 = this.linkTextList;
        if (contentEntity3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            contentEntity3.writeToParcel(dest, flags);
        }
        dest.writeStringList(this.symbolList);
        Integer num = this.maintenanceScope;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
    }

    public /* synthetic */ MaintenanceEntity(String str, String str2, Long l11, Long l12, boolean z11, Boolean bool, Long l13, Long l14, String str3, String str4, Boolean bool2, ContentEntity contentEntity, ContentEntity contentEntity2, ContentEntity contentEntity3, List list, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, l11, l12, (i11 & 16) != 0 ? false : z11, (i11 & 32) != 0 ? Boolean.FALSE : bool, l13, l14, str3, str4, (i11 & 1024) != 0 ? Boolean.TRUE : bool2, (i11 & 2048) != 0 ? null : contentEntity, (i11 & 4096) != 0 ? null : contentEntity2, (i11 & 8192) != 0 ? null : contentEntity3, (i11 & 16384) != 0 ? null : list, (i11 & 32768) != 0 ? null : num);
    }
}
