package com.kubi.quotefacade.tradechance;

import androidx.annotation.Keep;
import com.kubi.quotefacade.entity.ChanceWhaleEntity;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ITradeChanceDataItem.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\f"}, m90084d2 = {"Lcom/kubi/quotefacade/tradechance/ChanceDataWhale;", "Lcom/kubi/quotefacade/tradechance/ITradeChanceDataItem;", "entityList", "", "Lcom/kubi/quotefacade/entity/ChanceWhaleEntity;", "<init>", "(Ljava/util/List;)V", "getEntityList", "()Ljava/util/List;", "setEntityList", "getItemType", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ChanceDataWhale implements ITradeChanceDataItem {

    @Nullable
    private List<ChanceWhaleEntity> entityList;

    /* JADX WARN: Multi-variable type inference failed */
    public ChanceDataWhale() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.chad.library.adapter.base.entity.MultiItemEntity
    /* JADX INFO: renamed from: getItemType */
    public int getF42794b() {
        return 4;
    }

    public ChanceDataWhale(@Nullable List<ChanceWhaleEntity> list) {
        this.entityList = list;
    }

    @Nullable
    public final List<ChanceWhaleEntity> getEntityList() {
        return this.entityList;
    }

    public final void setEntityList(@Nullable List<ChanceWhaleEntity> list) {
        this.entityList = list;
    }

    public /* synthetic */ ChanceDataWhale(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list);
    }
}
