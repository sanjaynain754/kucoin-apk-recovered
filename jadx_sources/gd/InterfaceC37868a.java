package gd;

import android.os.Bundle;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p309hd.InterfaceC38169a;
import p309hd.InterfaceC38170b;
import p309hd.TradeSettingsBean;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: gd.a */
/* JADX INFO: compiled from: ITradeSettingsRepo.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H&J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/core/base/setting/ITradeSettingsRepo;", "", "tradeSettingsFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/kubi/core/base/setting/data/TradeSettingsBean;", "getTradeSettingsFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "supportMenuBiz", "", "menu", "Lcom/kubi/core/base/setting/MenusBiz;", "parseArguments", "", "arguments", "Landroid/os/Bundle;", "setTradePanelModel", "model", "Lcom/kubi/core/base/setting/data/TradePanelModel;", "setTradeDirection", "direction", "Lcom/kubi/core/base/setting/data/TradeDirection;", "supportBottomBizTab", "", "Lcom/kubi/core/biz/bottomtab/Tabs;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC37868a {
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41678w<TradeSettingsBean> mo85483a();

    /* JADX INFO: renamed from: b */
    void mo85484b(@NotNull InterfaceC38169a interfaceC38169a);

    /* JADX INFO: renamed from: c */
    void mo85485c(@NotNull InterfaceC38170b interfaceC38170b);

    /* JADX INFO: renamed from: d */
    void mo85486d(@Nullable Bundle bundle);
}
