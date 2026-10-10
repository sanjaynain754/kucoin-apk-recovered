package com.kubi.assets.entity;

import androidx.annotation.Keep;
import com.kubi.data.entity.CustomOrderEntity;
import com.kubi.data.entity.SubAssetEntity;
import com.kubi.sdk.widget.dialog.SelectEntity;
import io.chad.library.adapter.base.entity.MultiItemEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetV2SettingEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0001.B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\"\u001a\u00020\u0007H\u0016J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J+\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020\u0007HÖ\u0001J\t\u0010,\u001a\u00020-HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006/"}, m90084d2 = {"Lcom/kubi/assets/entity/AssetV2SettingEntity;", "Lio/chad/library/adapter/base/entity/MultiItemEntity;", "selectEntity", "Lcom/kubi/sdk/widget/dialog/SelectEntity;", "fiatCurrency", "Lcom/kubi/assets/entity/FiatCurrency;", "type", "", "<init>", "(Lcom/kubi/sdk/widget/dialog/SelectEntity;Lcom/kubi/assets/entity/FiatCurrency;I)V", "getSelectEntity", "()Lcom/kubi/sdk/widget/dialog/SelectEntity;", "setSelectEntity", "(Lcom/kubi/sdk/widget/dialog/SelectEntity;)V", "getFiatCurrency", "()Lcom/kubi/assets/entity/FiatCurrency;", "setFiatCurrency", "(Lcom/kubi/assets/entity/FiatCurrency;)V", "getType", "()I", "setType", "(I)V", "subAssetEntity", "Lcom/kubi/data/entity/SubAssetEntity;", "getSubAssetEntity", "()Lcom/kubi/data/entity/SubAssetEntity;", "setSubAssetEntity", "(Lcom/kubi/data/entity/SubAssetEntity;)V", "customOrderEntity", "Lcom/kubi/data/entity/CustomOrderEntity;", "getCustomOrderEntity", "()Lcom/kubi/data/entity/CustomOrderEntity;", "setCustomOrderEntity", "(Lcom/kubi/data/entity/CustomOrderEntity;)V", "getItemType", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AssetV2SettingEntity implements MultiItemEntity {
    public static final int TYPE_BTC = 1;
    public static final int TYPE_BTC_HEADER = 5;
    public static final int TYPE_CUSTOM_HEADER = 7;
    public static final int TYPE_DIVIDER = 4;
    public static final int TYPE_FIAT_CURRENCY = 2;
    public static final int TYPE_FIAT_HEADER = 6;
    public static final int TYPE_SUB_HEADER = 3;

    @Nullable
    private CustomOrderEntity customOrderEntity;

    @Nullable
    private FiatCurrency fiatCurrency;

    @Nullable
    private SelectEntity selectEntity;

    @Nullable
    private SubAssetEntity subAssetEntity;
    private int type;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssetV2SettingEntity)) {
            return false;
        }
        AssetV2SettingEntity assetV2SettingEntity = (AssetV2SettingEntity) other;
        return Intrinsics.areEqual(this.selectEntity, assetV2SettingEntity.selectEntity) && Intrinsics.areEqual(this.fiatCurrency, assetV2SettingEntity.fiatCurrency) && this.type == assetV2SettingEntity.type;
    }

    public static /* synthetic */ AssetV2SettingEntity copy$default(AssetV2SettingEntity assetV2SettingEntity, SelectEntity selectEntity, FiatCurrency fiatCurrency, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            selectEntity = assetV2SettingEntity.selectEntity;
        }
        if ((i12 & 2) != 0) {
            fiatCurrency = assetV2SettingEntity.fiatCurrency;
        }
        if ((i12 & 4) != 0) {
            i11 = assetV2SettingEntity.type;
        }
        return assetV2SettingEntity.copy(selectEntity, fiatCurrency, i11);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SelectEntity getSelectEntity() {
        return this.selectEntity;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final FiatCurrency getFiatCurrency() {
        return this.fiatCurrency;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    public final AssetV2SettingEntity copy(@Nullable SelectEntity selectEntity, @Nullable FiatCurrency fiatCurrency, int i11) {
        return new AssetV2SettingEntity(selectEntity, fiatCurrency, i11);
    }

    @Nullable
    public final CustomOrderEntity getCustomOrderEntity() {
        return this.customOrderEntity;
    }

    @Nullable
    public final FiatCurrency getFiatCurrency() {
        return this.fiatCurrency;
    }

    @Override // io.chad.library.adapter.base.entity.MultiItemEntity
    /* JADX INFO: renamed from: getItemType */
    public int getF42794b() {
        return this.type;
    }

    @Nullable
    public final SelectEntity getSelectEntity() {
        return this.selectEntity;
    }

    @Nullable
    public final SubAssetEntity getSubAssetEntity() {
        return this.subAssetEntity;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        SelectEntity selectEntity = this.selectEntity;
        int iHashCode = (selectEntity == null ? 0 : selectEntity.hashCode()) * 31;
        FiatCurrency fiatCurrency = this.fiatCurrency;
        return ((iHashCode + (fiatCurrency != null ? fiatCurrency.hashCode() : 0)) * 31) + Integer.hashCode(this.type);
    }

    public final void setCustomOrderEntity(@Nullable CustomOrderEntity customOrderEntity) {
        this.customOrderEntity = customOrderEntity;
    }

    public final void setFiatCurrency(@Nullable FiatCurrency fiatCurrency) {
        this.fiatCurrency = fiatCurrency;
    }

    public final void setSelectEntity(@Nullable SelectEntity selectEntity) {
        this.selectEntity = selectEntity;
    }

    public final void setSubAssetEntity(@Nullable SubAssetEntity subAssetEntity) {
        this.subAssetEntity = subAssetEntity;
    }

    public final void setType(int i11) {
        this.type = i11;
    }

    @NotNull
    public String toString() {
        return "AssetV2SettingEntity(selectEntity=" + this.selectEntity + ", fiatCurrency=" + this.fiatCurrency + ", type=" + this.type + ')';
    }

    public AssetV2SettingEntity(@Nullable SelectEntity selectEntity, @Nullable FiatCurrency fiatCurrency, int i11) {
        this.selectEntity = selectEntity;
        this.fiatCurrency = fiatCurrency;
        this.type = i11;
    }
}
