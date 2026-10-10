package p722wd;

import org.jetbrains.annotations.Nullable;
import p756xc.TradeSymbolBalance;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: wd.e */
/* JADX INFO: compiled from: ShareEvent.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/core/biz/sharevm/SymbolBalanceEvent;", "Lcom/kubi/core/biz/sharevm/IShareCoreBizEvent;", "tradeBalance", "Lcom/kubi/core/base/arch/api/data/TradeSymbolBalance;", "<init>", "(Lcom/kubi/core/base/arch/api/data/TradeSymbolBalance;)V", "getTradeBalance", "()Lcom/kubi/core/base/arch/api/data/TradeSymbolBalance;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45796e implements InterfaceC45793b {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final TradeSymbolBalance f103217a;

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final TradeSymbolBalance getF103217a() {
        return this.f103217a;
    }

    public C45796e(@Nullable TradeSymbolBalance tradeSymbolBalance) {
        this.f103217a = tradeSymbolBalance;
    }
}
