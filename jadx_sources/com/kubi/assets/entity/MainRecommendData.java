package com.kubi.assets.entity;

import androidx.annotation.Keep;
import io.chad.library.adapter.base.entity.MultiItemEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MyAssetEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/assets/entity/MainRecommendData;", "Lio/chad/library/adapter/base/entity/MultiItemEntity;", "type", "", "data", "Lcom/kubi/assets/entity/MainRecommendDataItem;", "<init>", "(ILcom/kubi/assets/entity/MainRecommendDataItem;)V", "getType", "()I", "setType", "(I)V", "getData", "()Lcom/kubi/assets/entity/MainRecommendDataItem;", "getItemType", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MainRecommendData implements MultiItemEntity {
    public static final int TYPE_HEADER = 1;
    public static final int TYPE_ITEM = 2;

    @Nullable
    private final MainRecommendDataItem data;
    private int type;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MainRecommendData)) {
            return false;
        }
        MainRecommendData mainRecommendData = (MainRecommendData) other;
        return this.type == mainRecommendData.type && Intrinsics.areEqual(this.data, mainRecommendData.data);
    }

    public static /* synthetic */ MainRecommendData copy$default(MainRecommendData mainRecommendData, int i11, MainRecommendDataItem mainRecommendDataItem, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = mainRecommendData.type;
        }
        if ((i12 & 2) != 0) {
            mainRecommendDataItem = mainRecommendData.data;
        }
        return mainRecommendData.copy(i11, mainRecommendDataItem);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MainRecommendDataItem getData() {
        return this.data;
    }

    @NotNull
    public final MainRecommendData copy(int type, @Nullable MainRecommendDataItem data) {
        return new MainRecommendData(type, data);
    }

    @Nullable
    public final MainRecommendDataItem getData() {
        return this.data;
    }

    @Override // io.chad.library.adapter.base.entity.MultiItemEntity
    /* JADX INFO: renamed from: getItemType */
    public int getF42794b() {
        return this.type;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.type) * 31;
        MainRecommendDataItem mainRecommendDataItem = this.data;
        return iHashCode + (mainRecommendDataItem == null ? 0 : mainRecommendDataItem.hashCode());
    }

    public final void setType(int i11) {
        this.type = i11;
    }

    @NotNull
    public String toString() {
        return "MainRecommendData(type=" + this.type + ", data=" + this.data + ')';
    }

    public MainRecommendData(int i11, @Nullable MainRecommendDataItem mainRecommendDataItem) {
        this.type = i11;
        this.data = mainRecommendDataItem;
    }
}
