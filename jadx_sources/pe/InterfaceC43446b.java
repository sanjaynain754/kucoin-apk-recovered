package pe;

import com.kubi.core.spot.business.holder.ITradeHolderDependDelegate;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: pe.b */
/* JADX INFO: compiled from: SpotMarketTradeInputIntercept.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J[\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\b2!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00030\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/core/spot/business/holder/intercept/input/IMarketTradeInputIntercept;", "", "checkInterceptFailed", "", "parentBehavior", "Lcom/kubi/core/spot/business/holder/ITradeHolderDependDelegate;", "isBuyHolder", "inputTriggerPrice", "Ljava/math/BigDecimal;", "inputNumber", "showErrorTip", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "numString", "balanceNotEnough", "Lkotlin/Function0;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC43446b {
    /* JADX INFO: renamed from: a */
    boolean mo95654a(@NotNull ITradeHolderDependDelegate iTradeHolderDependDelegate, boolean z11, @Nullable BigDecimal bigDecimal, @NotNull BigDecimal bigDecimal2, @NotNull Function1<? super String, Boolean> function1, @NotNull Function0<Boolean> function0);
}
