package com.kubi.market.monitor.lib.p100ui.floating.setting;

import androidx.annotation.Keep;
import com.kubi.sdk.widget.dialog.SelectEntity;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FloatWindowSettingContract.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/setting/SelectData;", "", "type", "", "dataList", "", "Lcom/kubi/sdk/widget/dialog/SelectEntity;", "<init>", "(ILjava/util/List;)V", "getType", "()I", "getDataList", "()Ljava/util/List;", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SelectData {

    @NotNull
    private final List<SelectEntity> dataList;
    private final int type;

    public SelectData(int i11, @NotNull List<SelectEntity> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.type = i11;
        this.dataList = dataList;
    }

    @NotNull
    public final List<SelectEntity> getDataList() {
        return this.dataList;
    }

    public final int getType() {
        return this.type;
    }
}
