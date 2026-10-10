package com.kubi.quotefacade.tradechance;

import androidx.annotation.Keep;
import com.kubi.quotefacade.entity.ChancePlateEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ITradeChanceDataItem.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/quotefacade/tradechance/ChanceDataPlate;", "Lcom/kubi/quotefacade/tradechance/ITradeChanceDataItem;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/quotefacade/entity/ChancePlateEntity;", "<init>", "(Lcom/kubi/quotefacade/entity/ChancePlateEntity;)V", "getEntity", "()Lcom/kubi/quotefacade/entity/ChancePlateEntity;", "setEntity", "getItemType", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ChanceDataPlate implements ITradeChanceDataItem {

    @Nullable
    private ChancePlateEntity entity;

    /* JADX WARN: Multi-variable type inference failed */
    public ChanceDataPlate() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.chad.library.adapter.base.entity.MultiItemEntity
    /* JADX INFO: renamed from: getItemType */
    public int getF42794b() {
        return 1;
    }

    public ChanceDataPlate(@Nullable ChancePlateEntity chancePlateEntity) {
        this.entity = chancePlateEntity;
    }

    @Nullable
    public final ChancePlateEntity getEntity() {
        return this.entity;
    }

    public final void setEntity(@Nullable ChancePlateEntity chancePlateEntity) {
        this.entity = chancePlateEntity;
    }

    public /* synthetic */ ChanceDataPlate(ChancePlateEntity chancePlateEntity, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : chancePlateEntity);
    }
}
