package com.kubi.assets.entity;

import androidx.annotation.Keep;
import com.kubi.data.entity.CoinInfoEntity;
import io.chad.library.adapter.base.entity.MultiItemEntity;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: SearchCoinEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/assets/entity/SearchCoinEntity;", "Lio/chad/library/adapter/base/entity/MultiItemEntity;", "type", "", "coinEntity", "Lcom/kubi/data/entity/CoinInfoEntity;", "coinList", "", "<init>", "(ILcom/kubi/data/entity/CoinInfoEntity;Ljava/util/List;)V", "getType", "()I", "getCoinEntity", "()Lcom/kubi/data/entity/CoinInfoEntity;", "getCoinList", "()Ljava/util/List;", "getItemType", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SearchCoinEntity implements MultiItemEntity {

    @Nullable
    private final CoinInfoEntity coinEntity;

    @Nullable
    private final List<CoinInfoEntity> coinList;
    private final int type;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchCoinEntity(int i11, @Nullable CoinInfoEntity coinInfoEntity, @Nullable List<? extends CoinInfoEntity> list) {
        this.type = i11;
        this.coinEntity = coinInfoEntity;
        this.coinList = list;
    }

    @Nullable
    public final CoinInfoEntity getCoinEntity() {
        return this.coinEntity;
    }

    @Nullable
    public final List<CoinInfoEntity> getCoinList() {
        return this.coinList;
    }

    @Override // io.chad.library.adapter.base.entity.MultiItemEntity
    /* JADX INFO: renamed from: getItemType, reason: from getter */
    public int getType() {
        return this.type;
    }

    public final int getType() {
        return this.type;
    }

    public /* synthetic */ SearchCoinEntity(int i11, CoinInfoEntity coinInfoEntity, List list, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i12 & 2) != 0 ? null : coinInfoEntity, (i12 & 4) != 0 ? null : list);
    }
}
