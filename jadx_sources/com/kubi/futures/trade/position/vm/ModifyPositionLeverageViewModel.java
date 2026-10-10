package com.kubi.futures.trade.position.vm;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.trade.position.PositionRenderInfo;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.kumex.utils.C17054k0;
import com.kubi.sdk.BaseViewModel;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import fm.C37567b;
import fm.C37569d;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlinx.coroutines.C41696j;
import nf.C42828b;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p236em.C37213a;
import p429lf.C42180b;
import p599rk.C44110b;
import p599rk.C44111c;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.internal.Intrinsics;
import th.InterfaceC44980d;
import uk.C45257b;
import uk.C45258c;

/* JADX INFO: compiled from: ModifyPositionLeverageViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000eJ\u000e\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0006J\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u000eJ\u0010\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u0006H\u0002J \u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\b\u0001\u0010#\u001a\u00020 J\b\u0010$\u001a\u00020\u0017H\u0002J\"\u0010%\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0004\u001a\u00020\u00062\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u000eH\u0002R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR#\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\bR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\bR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0014*\u0004\u0018\u00010\u000e0\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n \u0014*\u0004\u0018\u00010\u000e0\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, m90084d2 = {"Lcom/kubi/futures/trade/position/vm/ModifyPositionLeverageViewModel;", "Lcom/kubi/sdk/BaseViewModel;", "<init>", "()V", ViewProps.POSITION, "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "getPosition", "()Landroidx/lifecycle/MutableLiveData;", "currentPositionRender", "Lcom/kubi/futures/trade/position/PositionRenderInfo;", "getCurrentPositionRender", "leverageRange", "Lkotlin/Pair;", "Ljava/math/BigDecimal;", "getLeverageRange", "releaseMargin", "getReleaseMargin", "positionEntity", "reduceMargin", "kotlin.jvm.PlatformType", "increaseMargin", "handleBalanceChanged", "", "balance", "handlePositionChanged", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "handleLeverageChanged", "leverage", "sendCurrentPositionInfo", "fetchMaxReduceMargin", "symbol", "", "isTrial", "", "positionSide", "processCalculatorLeverageRange", "calculatorLeverage", "contract", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "inputValue", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ModifyPositionLeverageViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MutableLiveData<PositionEntity> f24305X = new MutableLiveData<>();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final MutableLiveData<PositionRenderInfo> f24306Y = new MutableLiveData<>();

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final MutableLiveData<Pair<BigDecimal, BigDecimal>> f24307Z = new MutableLiveData<>();

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final MutableLiveData<BigDecimal> f24308a0 = new MutableLiveData<>();

    /* JADX INFO: renamed from: b0 */
    @Nullable
    public volatile PositionEntity f24309b0;

    /* JADX INFO: renamed from: c0 */
    public volatile BigDecimal f24310c0;

    /* JADX INFO: renamed from: d0 */
    public volatile BigDecimal f24311d0;

    /* JADX INFO: renamed from: B */
    private final void m27921B(PositionEntity positionEntity) {
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(positionEntity.getSymbol()), false, 2, null);
        MutableLiveData<PositionRenderInfo> mutableLiveData = this.f24306Y;
        BigDecimal bigDecimalM66656p = C27039d.m66656p(positionEntity.getPosMargin());
        int iM84613c = C37567b.m84613c(contractEntityM99529O);
        RoundingMode roundingMode = RoundingMode.DOWN;
        mutableLiveData.postValue(new PositionRenderInfo(C42180b.m92640e(bigDecimalM66656p, roundingMode, iM84613c, true, true, true, 0, null, 96, null), C42828b.m93905f(C42180b.m92640e(C27039d.m66656p(positionEntity.getRealLeverage()), RoundingMode.HALF_UP, 2, true, true, false, 0, null, 112, null), "x", true, false), C17054k0.m36540n(C27039d.m66656p(positionEntity.getLiquidationPrice()), contractEntityM99529O, C37569d.m84683x(positionEntity), false, false, 12, null), C42180b.m92640e(C27039d.m66656p(positionEntity.getAvgEntryPrice()), roundingMode, C27039d.m66651k(contractEntityM99529O != null ? Integer.valueOf(C37567b.m84618h(contractEntityM99529O)) : null, 2), true, false, true, 0, null, 104, null)));
    }

    /* JADX INFO: renamed from: A */
    public final void m27924A() throws Throwable {
        PositionEntity positionEntity = this.f24309b0;
        if (positionEntity == null) {
            return;
        }
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(positionEntity.getSymbol()), false, 2, null);
        if (contractEntityM99529O == null) {
            return;
        }
        BigDecimal increaseMargin = this.f24311d0;
        Intrinsics.checkNotNullExpressionValue(increaseMargin, "increaseMargin");
        BigDecimal bigDecimalM27925r = m27925r(positionEntity, contractEntityM99529O, increaseMargin);
        BigDecimal scale = bigDecimalM27925r != null ? bigDecimalM27925r.setScale(2, RoundingMode.UP) : null;
        BigDecimal bigDecimalMultiply = this.f24310c0.multiply(new BigDecimal(-1));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        BigDecimal bigDecimalM27925r2 = m27925r(positionEntity, contractEntityM99529O, bigDecimalMultiply);
        BigDecimal scale2 = bigDecimalM27925r2 != null ? bigDecimalM27925r2.setScale(2, RoundingMode.DOWN) : null;
        if (scale == null && scale2 == null) {
            return;
        }
        BigDecimal scale3 = C27039d.m66656p(positionEntity.getRealLeverage()).setScale(2, RoundingMode.HALF_UP);
        if (scale2 == null) {
            scale2 = scale3;
        }
        if (scale2.compareTo(scale3) < 0) {
            scale2 = scale3;
        }
        MutableLiveData<Pair<BigDecimal, BigDecimal>> mutableLiveData = this.f24307Z;
        if (scale == null) {
            scale = scale3;
        }
        mutableLiveData.postValue(new Pair<>(scale, scale2));
    }

    /* JADX INFO: renamed from: r */
    public final BigDecimal m27925r(PositionEntity positionEntity, ContractEntity contractEntity, BigDecimal bigDecimal) throws Throwable {
        C45257b c45257b = C45257b.f101798a;
        boolean zM66566d = C27025c.m66566d(Boolean.valueOf(contractEntity.isInverse()));
        BigDecimal multiplier = contractEntity.getMultiplier();
        C44110b c44110bM97191b = C44111c.m97191b(multiplier != null ? C44111c.m97192c(multiplier) : null, null, 1, null);
        BigDecimal markPrice = positionEntity.getMarkPrice();
        C44110b c44110bM97191b2 = C44111c.m97191b(markPrice != null ? C44111c.m97192c(markPrice) : null, null, 1, null);
        BigDecimal currentQty = positionEntity.getCurrentQty();
        C44110b c44110bM97191b3 = C44111c.m97191b(c45257b.m100039g(zM66566d, c44110bM97191b, c44110bM97191b2, C44111c.m97191b(currentQty != null ? C44111c.m97192c(currentQty) : null, null, 1, null)), null, 1, null);
        C45258c c45258c = C45258c.f101799a;
        BigDecimal posMargin = positionEntity.getPosMargin();
        C44110b c44110bM100045f = c45258c.m100045f(c44110bM97191b3, C44111c.m97191b(posMargin != null ? C44111c.m97192c(posMargin) : null, null, 1, null), C44111c.m97192c(bigDecimal));
        if (c44110bM100045f != null) {
            return c44110bM100045f.getDecimal();
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public final void m27926s(@NotNull String symbol, boolean z11, @NotNull String positionSide) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(positionSide, "positionSide");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b().plus(C37213a.m83254d()), null, new ModifyPositionLeverageViewModel$fetchMaxReduceMargin$1(z11, symbol, positionSide, this, null), 2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final MutableLiveData<PositionRenderInfo> m27927t() {
        return this.f24306Y;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final MutableLiveData<Pair<BigDecimal, BigDecimal>> m27928u() {
        return this.f24307Z;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final MutableLiveData<PositionEntity> m27929v() {
        return this.f24305X;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final MutableLiveData<BigDecimal> m27930w() {
        return this.f24308a0;
    }

    /* JADX INFO: renamed from: x */
    public final void m27931x(@NotNull BigDecimal balance) throws Throwable {
        Intrinsics.checkNotNullParameter(balance, "balance");
        this.f24311d0 = balance;
        m27924A();
    }

    /* JADX INFO: renamed from: y */
    public final void m27932y(@NotNull BigDecimal leverage) throws Throwable {
        ContractEntity contractEntityM99529O;
        BigDecimal bigDecimalMultiply;
        BigDecimal decimal;
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        PositionEntity positionEntity = this.f24309b0;
        if (positionEntity == null || (contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(positionEntity.getSymbol()), false, 2, null)) == null) {
            return;
        }
        C45257b c45257b = C45257b.f101798a;
        boolean zM66566d = C27025c.m66566d(Boolean.valueOf(contractEntityM99529O.isInverse()));
        BigDecimal multiplier = contractEntityM99529O.getMultiplier();
        C44110b c44110bM97191b = C44111c.m97191b(multiplier != null ? C44111c.m97192c(multiplier) : null, null, 1, null);
        BigDecimal markPrice = positionEntity.getMarkPrice();
        C44110b c44110bM97191b2 = C44111c.m97191b(markPrice != null ? C44111c.m97192c(markPrice) : null, null, 1, null);
        BigDecimal currentQty = positionEntity.getCurrentQty();
        C44110b c44110bM97191b3 = C44111c.m97191b(c45257b.m100039g(zM66566d, c44110bM97191b, c44110bM97191b2, C44111c.m97191b(currentQty != null ? C44111c.m97192c(currentQty) : null, null, 1, null)), null, 1, null);
        C45258c c45258c = C45258c.f101799a;
        BigDecimal posMargin = positionEntity.getPosMargin();
        C44110b c44110bM97191b4 = C44111c.m97191b(posMargin != null ? C44111c.m97192c(posMargin) : null, null, 1, null);
        BigDecimal posCost = positionEntity.getPosCost();
        C44110b c44110bM100043d = c45258c.m100043d(c44110bM97191b3, c44110bM97191b4, C44111c.m97191b(posCost != null ? C44111c.m97192c(posCost) : null, null, 1, null), C44111c.m97192c(leverage));
        if (c44110bM100043d == null || (decimal = c44110bM100043d.getDecimal()) == null || (bigDecimalMultiply = decimal.multiply(new BigDecimal(-1))) == null) {
            bigDecimalMultiply = BigDecimal.ZERO;
        }
        this.f24308a0.setValue(bigDecimalMultiply);
    }

    /* JADX INFO: renamed from: z */
    public final void m27933z(@NotNull PositionEntity entity) throws Throwable {
        Intrinsics.checkNotNullParameter(entity, "entity");
        this.f24305X.postValue(entity);
        this.f24309b0 = entity;
        m27921B(entity);
        m27924A();
    }

    public ModifyPositionLeverageViewModel() {
        BigDecimal bigDecimal = BigDecimal.ZERO;
        this.f24310c0 = bigDecimal;
        this.f24311d0 = bigDecimal;
    }
}
