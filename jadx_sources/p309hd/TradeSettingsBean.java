package p309hd;

import com.kubi.core.biz.bottomtab.Tabs;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: hd.c, reason: from toString */
/* JADX INFO: compiled from: TradeSettingsBean.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J7\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, m90084d2 = {"Lcom/kubi/core/base/setting/data/TradeSettingsBean;", "", "tradeDirection", "Lcom/kubi/core/base/setting/data/TradeDirection;", "tradePanelModel", "Lcom/kubi/core/base/setting/data/TradePanelModel;", "defaultBottomTabIndex", "", "supportBizTabs", "", "Lcom/kubi/core/biz/bottomtab/Tabs;", "<init>", "(Lcom/kubi/core/base/setting/data/TradeDirection;Lcom/kubi/core/base/setting/data/TradePanelModel;ILjava/util/List;)V", "getTradeDirection", "()Lcom/kubi/core/base/setting/data/TradeDirection;", "getTradePanelModel", "()Lcom/kubi/core/base/setting/data/TradePanelModel;", "getDefaultBottomTabIndex", "()I", "getSupportBizTabs", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TradeSettingsBean {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final InterfaceC38169a tradeDirection;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final InterfaceC38170b tradePanelModel;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final int defaultBottomTabIndex;

    /* JADX INFO: renamed from: d, reason: from toString */
    @NotNull
    public final List<Tabs> supportBizTabs;

    public TradeSettingsBean() {
        this(null, null, 0, null, 15, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TradeSettingsBean)) {
            return false;
        }
        TradeSettingsBean tradeSettingsBean = (TradeSettingsBean) other;
        return Intrinsics.areEqual(this.tradeDirection, tradeSettingsBean.tradeDirection) && Intrinsics.areEqual(this.tradePanelModel, tradeSettingsBean.tradePanelModel) && this.defaultBottomTabIndex == tradeSettingsBean.defaultBottomTabIndex && Intrinsics.areEqual(this.supportBizTabs, tradeSettingsBean.supportBizTabs);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TradeSettingsBean(@NotNull InterfaceC38169a tradeDirection, @NotNull InterfaceC38170b tradePanelModel, int i11, @NotNull List<? extends Tabs> supportBizTabs) {
        Intrinsics.checkNotNullParameter(tradeDirection, "tradeDirection");
        Intrinsics.checkNotNullParameter(tradePanelModel, "tradePanelModel");
        Intrinsics.checkNotNullParameter(supportBizTabs, "supportBizTabs");
        this.tradeDirection = tradeDirection;
        this.tradePanelModel = tradePanelModel;
        this.defaultBottomTabIndex = i11;
        this.supportBizTabs = supportBizTabs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ TradeSettingsBean m86129b(TradeSettingsBean tradeSettingsBean, InterfaceC38169a interfaceC38169a, InterfaceC38170b interfaceC38170b, int i11, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            interfaceC38169a = tradeSettingsBean.tradeDirection;
        }
        if ((i12 & 2) != 0) {
            interfaceC38170b = tradeSettingsBean.tradePanelModel;
        }
        if ((i12 & 4) != 0) {
            i11 = tradeSettingsBean.defaultBottomTabIndex;
        }
        if ((i12 & 8) != 0) {
            list = tradeSettingsBean.supportBizTabs;
        }
        return tradeSettingsBean.m86130a(interfaceC38169a, interfaceC38170b, i11, list);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final TradeSettingsBean m86130a(@NotNull InterfaceC38169a tradeDirection, @NotNull InterfaceC38170b tradePanelModel, int i11, @NotNull List<? extends Tabs> supportBizTabs) {
        Intrinsics.checkNotNullParameter(tradeDirection, "tradeDirection");
        Intrinsics.checkNotNullParameter(tradePanelModel, "tradePanelModel");
        Intrinsics.checkNotNullParameter(supportBizTabs, "supportBizTabs");
        return new TradeSettingsBean(tradeDirection, tradePanelModel, i11, supportBizTabs);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getDefaultBottomTabIndex() {
        return this.defaultBottomTabIndex;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final List<Tabs> m86132d() {
        return this.supportBizTabs;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC38169a getTradeDirection() {
        return this.tradeDirection;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final InterfaceC38170b getTradePanelModel() {
        return this.tradePanelModel;
    }

    public int hashCode() {
        return (((((this.tradeDirection.hashCode() * 31) + this.tradePanelModel.hashCode()) * 31) + Integer.hashCode(this.defaultBottomTabIndex)) * 31) + this.supportBizTabs.hashCode();
    }

    @NotNull
    public String toString() {
        return "TradeSettingsBean(tradeDirection=" + this.tradeDirection + ", tradePanelModel=" + this.tradePanelModel + ", defaultBottomTabIndex=" + this.defaultBottomTabIndex + ", supportBizTabs=" + this.supportBizTabs + ')';
    }

    public /* synthetic */ TradeSettingsBean(InterfaceC38169a interfaceC38169a, InterfaceC38170b interfaceC38170b, int i11, List list, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? InterfaceC38169a.a.f85864a : interfaceC38169a, (i12 & 2) != 0 ? C38172d.m86137c() : interfaceC38170b, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? C38172d.m86138d() : list);
    }
}
