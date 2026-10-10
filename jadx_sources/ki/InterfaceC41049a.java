package ki;

import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p314hi.InterfaceC38213a;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: ki.a */
/* JADX INFO: compiled from: IQtyUnitStrategy.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J$\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH&J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H&J,\u0010\r\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH&J,\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH&J0\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH&J0\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH&J0\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH&J&\u0010\u0015\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH&J.\u0010\u0016\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u000b\u001a\u0004\u0018\u00010\tH&J0\u0010\u0019\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/futures/trade/config/qty/IQtyUnitStrategy;", "", "precision", "", "contract", "Lcom/kubi/futures/trade/config/IFuturesContractConfig;", "unit", "", "stepOfAdd", "Ljava/math/BigDecimal;", FirebaseAnalytics.Param.PRICE, "singleCost", "step", "getQtyByUnit", "anyLotSize", "formatQtyByUnit", "", "getQtyOfLot", "inputQty", ViewProps.TRANSFORM, "transformNoScale", "getMinQtyByUnit", "getMaxQtyByUnit", "isLimit", "", "getValue", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC41049a {
    @Nullable
    /* JADX INFO: renamed from: a */
    BigDecimal mo90007a(@NotNull InterfaceC38213a interfaceC38213a, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3);

    @NotNull
    /* JADX INFO: renamed from: b */
    CharSequence mo90008b(@NotNull InterfaceC38213a interfaceC38213a, @Nullable BigDecimal bigDecimal, @NotNull BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3);

    @NotNull
    /* JADX INFO: renamed from: c */
    BigDecimal mo90009c(@NotNull InterfaceC38213a interfaceC38213a, @Nullable BigDecimal bigDecimal, @NotNull BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3);

    @Nullable
    /* JADX INFO: renamed from: d */
    BigDecimal mo90010d(@NotNull InterfaceC38213a interfaceC38213a, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2);

    @Nullable
    /* JADX INFO: renamed from: e */
    BigDecimal mo90011e(@NotNull InterfaceC38213a interfaceC38213a, @Nullable BigDecimal bigDecimal, boolean z11, @Nullable BigDecimal bigDecimal2);

    @Nullable
    /* JADX INFO: renamed from: f */
    BigDecimal mo90012f(@NotNull InterfaceC38213a interfaceC38213a, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3);

    @NotNull
    /* JADX INFO: renamed from: g */
    BigDecimal mo90013g(@NotNull InterfaceC38213a interfaceC38213a);

    @NotNull
    /* JADX INFO: renamed from: h */
    String mo90014h(@NotNull InterfaceC38213a interfaceC38213a);

    @Nullable
    /* JADX INFO: renamed from: i */
    BigDecimal mo90015i(@NotNull InterfaceC38213a interfaceC38213a, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3);

    @NotNull
    /* JADX INFO: renamed from: j */
    BigDecimal mo90016j(@NotNull InterfaceC38213a interfaceC38213a, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2);

    /* JADX INFO: renamed from: k */
    int mo90017k(@NotNull InterfaceC38213a interfaceC38213a);
}
