package q50;

import com.kubi.tradingbotkit.entity.CurrencyBalanceEntity;
import com.kubi.tradingbotkit.model.CurrencyBalanceModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import v50.C45428a;

/* JADX INFO: renamed from: q50.a */
/* JADX INFO: compiled from: CurrencyBalanceMapper.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/tradingbotkit/mapper/CurrencyBalanceMapper;", "Lcom/kubi/tradingbotkit/mapper/IMapper;", "Lcom/kubi/tradingbotkit/entity/CurrencyBalanceEntity;", "Lcom/kubi/tradingbotkit/model/CurrencyBalanceModel;", "<init>", "()V", "map", "input", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43633a {
    @NotNull
    /* JADX INFO: renamed from: a */
    public CurrencyBalanceModel m96029a(@Nullable CurrencyBalanceEntity currencyBalanceEntity) throws IllegalAccessException {
        CurrencyBalanceModel currencyBalanceModel = new CurrencyBalanceModel();
        if (currencyBalanceEntity != null) {
            C45428a.m100399a(currencyBalanceModel, currencyBalanceEntity);
        }
        return currencyBalanceModel;
    }
}
