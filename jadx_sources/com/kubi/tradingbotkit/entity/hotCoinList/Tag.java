package com.kubi.tradingbotkit.entity.hotCoinList;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: HotCoinListEntity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\t¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/tradingbotkit/entity/hotCoinList/Tag;", "", "<init>", "()V", "order", "", "getOrder", "()Ljava/lang/Long;", "setOrder", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "tagId", "getTagId", "setTagId", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class Tag {

    @Nullable
    private Long order;

    @Nullable
    private Long tagId;

    @Nullable
    public final Long getOrder() {
        return this.order;
    }

    @Nullable
    public final Long getTagId() {
        return this.tagId;
    }

    public final void setOrder(@Nullable Long l11) {
        this.order = l11;
    }

    public final void setTagId(@Nullable Long l11) {
        this.tagId = l11;
    }
}
