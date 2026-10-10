package com.kubi.spot.helper;

import com.kubi.spot.entity.OrderResultEntity;
import e20.InterfaceC37053d;
import io.reactivex.Observable;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.spot.helper.k, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ITradeTypeRequestOrder.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\b\u0010\n\u001a\u0004\u0018\u00010\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/spot/helper/ITradeTypeRequestOrder;", "", "requestOrderApi", "Lio/reactivex/Observable;", "Lcom/kubi/spot/entity/OrderResultEntity;", "marketApi", "Lcom/kubi/spot/api/MarketApi;", "requestEntity", "", "", "fingerEvent", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ITradeTypeRequestOrder {
    @NotNull
    /* JADX INFO: renamed from: d */
    Observable<OrderResultEntity> m61814d(@NotNull InterfaceC37053d interfaceC37053d, @NotNull Map<String, String> map, @Nullable String str);
}
