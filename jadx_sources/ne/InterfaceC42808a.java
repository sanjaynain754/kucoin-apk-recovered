package ne;

import androidx.fragment.app.FragmentManager;
import com.kubi.tradebase.tradetype.TradeType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p309hd.InterfaceC38169a;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: ne.a */
/* JADX INFO: compiled from: ITradeInputData.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/core/spot/business/holder/intercept/data/ITradeInputData;", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "getFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "symbol", "", "getSymbol", "()Ljava/lang/String;", "symbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "getSymbolInfo", "()Lcom/kubi/data/entity/SymbolInfoEntity;", "symbolDisplayName", "getSymbolDisplayName", "tradeDirection", "Lcom/kubi/core/base/setting/data/TradeDirection;", "getTradeDirection", "()Lcom/kubi/core/base/setting/data/TradeDirection;", "tradeType", "Lcom/kubi/tradebase/tradetype/TradeType;", "getTradeType", "()Lcom/kubi/tradebase/tradetype/TradeType;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC42808a {
    @NotNull
    /* JADX INFO: renamed from: a */
    TradeType mo93835a();

    @NotNull
    /* JADX INFO: renamed from: b */
    InterfaceC38169a mo93836b();

    @Nullable
    /* JADX INFO: renamed from: c */
    String mo93837c();

    @NotNull
    /* JADX INFO: renamed from: d */
    FragmentManager mo93838d();
}
