package pe;

import com.kubi.core.spot.business.holder.ITradeHolderDependDelegate;
import io.reactivex.functions.Consumer;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: pe.a */
/* JADX INFO: compiled from: SpotLimitTradeInputIntercept.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001JH\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u00072\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\rH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/core/spot/business/holder/intercept/input/ILimitTradeInputIntercept;", "", "checkInterceptFailed", "", "parentBehavior", "Lcom/kubi/core/spot/business/holder/ITradeHolderDependDelegate;", "inputLimitPrice", "Ljava/math/BigDecimal;", "inputTriggerPrice", "inputNumber", "volumeErrorCallBack", "Lio/reactivex/functions/Consumer;", "balanceNotEnough", "Lkotlin/Function0;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC43445a {
    /* JADX INFO: renamed from: a */
    boolean mo95653a(@NotNull ITradeHolderDependDelegate iTradeHolderDependDelegate, @NotNull BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @NotNull BigDecimal bigDecimal3, @Nullable Consumer<BigDecimal> consumer, @NotNull Function0<Boolean> function0);
}
