package com.kubi.core.spot.business.holder.intercept.input;

import ne.InterfaceC42808a;
import ne.InterfaceC42809b;
import ne.LimitTradeInputData;
import ne.LimitTradeInputInterceptResult;
import org.jetbrains.annotations.NotNull;
import p497oe.C43029e;
import p557qe.InterfaceC43720b;
import p557qe.InterfaceC43722d;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import pe.C43448d;

/* JADX INFO: compiled from: LimitPriceProtectVerifyIntercept.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016J$\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0011H\u0016R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/core/spot/business/holder/intercept/input/LimitPriceProtectVerifyIntercept;", "Lcom/kubi/core/spot/business/holder/intercept/taskchain/ITask;", "Lcom/kubi/core/spot/business/holder/intercept/data/ITradeInputData;", "Lcom/kubi/core/spot/business/holder/intercept/data/ITradeInputInterceptResult;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "onPassed", "", "data", "onIntercept", "exception", "run", "dispatcher", "Lcom/kubi/core/spot/business/holder/intercept/taskchain/TaskDispatcher;", "Companion", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class LimitPriceProtectVerifyIntercept implements InterfaceC43720b<InterfaceC42808a, InterfaceC42809b> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f21135a = new Companion(null);

    /* JADX INFO: compiled from: LimitPriceProtectVerifyIntercept.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/core/spot/business/holder/intercept/input/LimitPriceProtectVerifyIntercept$Companion;", "", "<init>", "()V", "REMEMBER_GAP_HOURS", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Override // p557qe.InterfaceC43720b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo23274a(@NotNull InterfaceC42809b exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (exception instanceof LimitTradeInputInterceptResult) {
            ((LimitTradeInputInterceptResult) exception).getSource().getDiffTradeImp().mo23216b().mo23266f();
        }
    }

    @Override // p557qe.InterfaceC43720b
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo23275b(@NotNull InterfaceC42808a data) {
        Intrinsics.checkNotNullParameter(data, "data");
    }

    @Override // p557qe.InterfaceC43720b
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo23276c(@NotNull InterfaceC42808a data, @NotNull InterfaceC43722d<InterfaceC42808a, InterfaceC42809b> dispatcher) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        if (!(data instanceof LimitTradeInputData)) {
            dispatcher.mo96274a(this, data);
            return;
        }
        C43448d c43448d = C43448d.f95977a;
        if (!c43448d.m95660e()) {
            dispatcher.mo96274a(this, data);
            return;
        }
        LimitTradeInputData limitTradeInputData = (LimitTradeInputData) data;
        if (!c43448d.m95661f(limitTradeInputData)) {
            dispatcher.mo96274a(this, data);
            return;
        }
        if (!c43448d.m95662g(limitTradeInputData)) {
            dispatcher.mo96274a(this, data);
            return;
        }
        if (!c43448d.m95656a()) {
            dispatcher.mo96274a(this, data);
        } else if (c43448d.m95658c(limitTradeInputData)) {
            new C43029e(this).m94516h(limitTradeInputData, dispatcher);
        } else {
            dispatcher.mo96274a(this, data);
        }
    }
}
