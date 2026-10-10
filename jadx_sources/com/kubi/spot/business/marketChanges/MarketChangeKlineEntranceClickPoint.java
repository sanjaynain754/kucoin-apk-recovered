package com.kubi.spot.business.marketChanges;

import com.kubi.spot.business.discover.entity.MarketChangesItemEntity;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;

/* JADX INFO: renamed from: com.kubi.spot.business.marketChanges.f, reason: from Kotlin metadata */
/* JADX INFO: compiled from: MarketChangeKlineEntranceClickPoint.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/spot/business/marketChanges/MarketChangeKlineEntranceClickPoint;", "", "<init>", "()V", "onClickMarketChange", "", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/spot/business/discover/entity/MarketChangesItemEntity;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MarketChangeKlineEntranceClickPoint {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final MarketChangeKlineEntranceClickPoint f50250a = new MarketChangeKlineEntranceClickPoint();

    /* JADX INFO: renamed from: a */
    public final void m61220a(@Nullable MarketChangesItemEntity marketChangesItemEntity) throws JSONException {
        if (marketChangesItemEntity == null) {
            C43852m.m96590b("B5candle", "volatile", "1", new Pair("postType", "more"));
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("postType", "item");
        jSONObject.put("contentType", C27041f.m66668h(marketChangesItemEntity.getItem()));
        jSONObject.put("messageId", C27041f.m66668h(marketChangesItemEntity.getTemplate()));
        jSONObject.put("sortPosition", C27041f.m66668h(marketChangesItemEntity.getTemplateCode()));
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a("B5candle", "volatile", "1", jSONObject);
    }
}
