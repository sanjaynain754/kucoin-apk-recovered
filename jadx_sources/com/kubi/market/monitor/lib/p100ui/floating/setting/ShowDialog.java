package com.kubi.market.monitor.lib.p100ui.floating.setting;

import com.kubi.sdk.widget.dialog.SelectEntity;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p208dr.InterfaceC36952a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.setting.p1, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FloatWindowSettingContract.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/setting/ShowDialog;", "Lcom/kubi/mvi/event/ISingleEvent;", "type", "", "list", "", "Lcom/kubi/sdk/widget/dialog/SelectEntity;", "<init>", "(ILjava/util/List;)V", "getType", "()I", "getList", "()Ljava/util/List;", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ShowDialog implements InterfaceC36952a {

    /* JADX INFO: renamed from: a */
    public final int f34407a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final List<SelectEntity> f34408b;

    public ShowDialog(int i11, @NotNull List<SelectEntity> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f34407a = i11;
        this.f34408b = list;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<SelectEntity> m40967a() {
        return this.f34408b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getF34407a() {
        return this.f34407a;
    }
}
