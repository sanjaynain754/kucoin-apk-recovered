package com.kubi.kumex.market.tradingArea;

import androidx.exifinterface.media.ExifInterface;
import com.kubi.kumex.data.market.model.AvailableTradeAreaEntity;
import com.kubi.mvi.state.BaseStateVM;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.mvi.state.InterfaceC19284f;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kumex.market.tradingArea.f, reason: from Kotlin metadata */
/* JADX INFO: compiled from: BaseTradingAreaVM.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0004¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/kumex/market/tradingArea/BaseTradingAreaVM;", "I", "Lcom/kubi/mvi/state/IIntent;", ExifInterface.LATITUDE_SOUTH, "Lcom/kubi/mvi/state/IState;", "Lcom/kubi/mvi/state/BaseStateVM;", "<init>", "()V", "diff", "", "current", "", "Lcom/kubi/kumex/data/market/model/AvailableTradeAreaEntity;", "olds", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class BaseTradingAreaVM<I extends InterfaceC19282d, S extends InterfaceC19284f> extends BaseStateVM<I, S> {
    /* JADX INFO: renamed from: b */
    public final boolean m34615b(@NotNull List<AvailableTradeAreaEntity> current, @Nullable List<AvailableTradeAreaEntity> list) {
        Intrinsics.checkNotNullParameter(current, "current");
        if (list == null || current.size() != list.size()) {
            return true;
        }
        int size = current.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (!Intrinsics.areEqual(current.get(i11), list.get(i11))) {
                return true;
            }
        }
        return false;
    }
}
