package p431lh;

import com.kubi.kumex.data.trade.model.AutoDepositStatusEntity;
import com.kubi.kumex.data.trade.model.ClosePositionSizeEntity;
import com.kubi.kumex.data.trade.model.PositionModeEntity;
import com.kubi.kumex.data.trade.model.SubmitAutoDepositEntity;
import com.kubi.kumex.service.KuMexDepend;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import java.util.concurrent.CancellationException;
import kh.InterfaceC41036a;
import kh.InterfaceC41038c;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import p236em.C37214b;
import p836zl.C46894j;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import tg.InterfaceC44944c;
import y70.C46392a;

/* JADX INFO: renamed from: lh.c */
/* JADX INFO: compiled from: IHedgeApiDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\b\u0010 \u001a\u00020\u0016H\u0016R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR#\u0010\u000b\u001a\n \u0006*\u0004\u0018\u00010\f0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000e¨\u0006!"}, m90084d2 = {"Lcom/kubi/futures/classic/hedge/delegate/IHedgeApiDelegate;", "Lcom/kubi/function/hedge/IIHedgeAssetsApi;", "<init>", "()V", "api", "Lcom/kubi/futures/classic/hedge/api/IHedgeApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/futures/classic/hedge/api/IHedgeApi;", "api$delegate", "Lkotlin/Lazy;", "trialApi", "Lcom/kubi/futures/classic/hedge/api/IHedgeTrialApi;", "getTrialApi", "()Lcom/kubi/futures/classic/hedge/api/IHedgeTrialApi;", "trialApi$delegate", "fetchHedgeClosePositionSize", "", "Lcom/kubi/kumex/data/trade/model/ClosePositionSizeEntity;", "symbol", "", "isTrial", "", "submitHedgeAutoDepositMargin", "", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/kumex/data/trade/model/SubmitAutoDepositEntity;", "fetchHedgeAutoDepositMargin", "Lcom/kubi/kumex/data/trade/model/AutoDepositStatusEntity;", "submitPositionMode", "Lcom/kubi/kumex/data/trade/model/PositionModeEntity;", "positionMode", "hedgeFeatureAvailable", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nIHedgeApiDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IHedgeApiDelegate.kt\ncom/kubi/futures/classic/hedge/delegate/IHedgeApiDelegate\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,95:1\n126#2,2:96\n136#2:98\n*S KotlinDebug\n*F\n+ 1 IHedgeApiDelegate.kt\ncom/kubi/futures/classic/hedge/delegate/IHedgeApiDelegate\n*L\n84#1:96,2\n91#1:98\n*E\n"})
public final class C42223c implements InterfaceC44944c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f93686a = LazyKt.lazy(new Function0() { // from class: lh.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C42223c.m92665c();
        }
    });

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f93687b = LazyKt.lazy(new Function0() { // from class: lh.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C42223c.m92666g();
        }
    });

    @Override // tg.InterfaceC44944c
    @NotNull
    /* JADX INFO: renamed from: F0 */
    public PositionModeEntity mo89032F0(boolean z11, @NotNull PositionModeEntity positionMode) {
        Intrinsics.checkNotNullParameter(positionMode, "positionMode");
        return z11 ? m92669f().m89994a(positionMode) : m92668e().m89982a(positionMode);
    }

    @Override // tg.InterfaceC44944c
    @NotNull
    /* JADX INFO: renamed from: T0 */
    public Object mo89033T0(boolean z11, @NotNull SubmitAutoDepositEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        return z11 ? m92669f().m89995b(entity) : m92668e().m89983b(entity);
    }

    @Override // tg.InterfaceC44944c
    /* JADX INFO: renamed from: U */
    public boolean mo89034U() {
        if (!KuMexDepend.f30378a.m35905g().c()) {
            return false;
        }
        try {
            boolean zM89987h = m92668e().m89987h("hedgeModePosition");
            C46392a.m102328k(C46894j.f104736a.m103274m("hedgeModePosition"), zM89987h);
            return zM89987h;
        } catch (Throwable th2) {
            if (th2 instanceof CancellationException) {
                throw th2;
            }
            C37214b.m83255a(th2, "fetchFeatureAvailable-hedgeModePosition");
            return C46392a.m102322d(C46894j.f104736a.m103274m("hedgeModePosition"), false);
        }
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC41036a m92668e() {
        return (InterfaceC41036a) this.f93686a.getValue();
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC41038c m92669f() {
        return (InterfaceC41038c) this.f93687b.getValue();
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC41036a m92665c() {
        return (InterfaceC41036a) C42597a.m93391g().create(InterfaceC41036a.class);
    }

    /* JADX INFO: renamed from: g */
    public static final InterfaceC41038c m92666g() {
        return (InterfaceC41038c) C42597a.m93391g().create(InterfaceC41038c.class);
    }

    @Override // tg.InterfaceC44944c
    @NotNull
    /* JADX INFO: renamed from: W0 */
    public List<ClosePositionSizeEntity> mo89036W0(@NotNull String symbol, boolean z11) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        if (z11) {
            return m92669f().m89998f(symbol);
        }
        return m92668e().m89986g(symbol);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public List<AutoDepositStatusEntity> m92667d(boolean z11, @NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        if (z11) {
            return m92669f().m89996c(symbol);
        }
        return m92668e().m89984c(symbol);
    }
}
