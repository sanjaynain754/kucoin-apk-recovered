package ni;

import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.trade.marginMode.perpetualSwap.data.QuoteModel;
import com.kubi.kumex.data.trade.model.QuoteEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import th.InterfaceC44980d;

/* JADX INFO: renamed from: ni.a */
/* JADX INFO: compiled from: QuoteEntity.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002¨\u0006\u0005"}, m90084d2 = {"illegal", "", "Lcom/kubi/kumex/data/trade/model/QuoteEntity;", "toQuoteModel", "Lcom/kubi/futures/trade/marginMode/perpetualSwap/data/QuoteModel;", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42842a {
    /* JADX INFO: renamed from: a */
    public static final boolean m93959a(@Nullable QuoteEntity quoteEntity) {
        String symbol;
        String marginMode;
        return quoteEntity == null || (symbol = quoteEntity.getSymbol()) == null || symbol.length() == 0 || (marginMode = quoteEntity.getMarginMode()) == null || marginMode.length() == 0;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final QuoteModel m93960b(@NotNull QuoteEntity quoteEntity) {
        Intrinsics.checkNotNullParameter(quoteEntity, "<this>");
        Boolean switchable = quoteEntity.getSwitchable();
        boolean zBooleanValue = switchable != null ? switchable.booleanValue() : false;
        String marginMode = quoteEntity.getMarginMode();
        String str = marginMode == null ? "" : marginMode;
        String symbol = quoteEntity.getSymbol();
        String str2 = symbol == null ? "" : symbol;
        InterfaceC44980d interfaceC44980dM20288g = RepositoryServiceLocator.f19236a.m20288g();
        String symbol2 = quoteEntity.getSymbol();
        return new QuoteModel(zBooleanValue, str, str2, interfaceC44980dM20288g.mo24978D(symbol2 != null ? symbol2 : "", false), false);
    }
}
