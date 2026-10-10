package com.kubi.core.biz;

import androidx.lifecycle.ViewModel;
import be.InterfaceC4578a;
import java.util.List;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41669n;
import org.jetbrains.annotations.NotNull;
import p722wd.C45792a;
import p722wd.C45794c;
import p722wd.C45795d;
import p722wd.C45796e;
import p722wd.InterfaceC45793b;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.core.biz.g, reason: from Kotlin metadata */
/* JADX INFO: compiled from: CoreBizShareViewModel.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000bR\u0016\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/core/biz/CoreBizShareViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "_bizShowHideEventFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/kubi/core/biz/sharevm/BizSupportChangeEvent;", "bizShowHideEventFlow", "Lkotlinx/coroutines/flow/Flow;", "getBizShowHideEventFlow", "()Lkotlinx/coroutines/flow/Flow;", "_kLineVisibleEventFlow", "Lcom/kubi/core/biz/sharevm/KLineVisibleChangeEvent;", "kLineVisibleEventFlow", "getKLineVisibleEventFlow", "_moreDialogEventFlow", "Lcom/kubi/core/biz/sharevm/MoreDialogEvent;", "moreDialogEventFlow", "getMoreDialogEventFlow", "_balanceChangeEventFlow", "Lcom/kubi/core/biz/sharevm/SymbolBalanceEvent;", "balanceChangeEventFlow", "getBalanceChangeEventFlow", "sendEvent", "", "event", "Lcom/kubi/core/biz/sharevm/IShareCoreBizEvent;", "defaultHideList", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CoreBizShareViewModel extends ViewModel {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final InterfaceC41669n<List<C45792a>> f20392V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final InterfaceC41634e<List<C45792a>> f20393W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC41669n<C45794c> f20394X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final InterfaceC41634e<C45794c> f20395Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final InterfaceC41669n<C45795d> f20396Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final InterfaceC41634e<C45795d> f20397a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final InterfaceC41669n<C45796e> f20398b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final InterfaceC41634e<C45796e> f20399c0;

    /* JADX INFO: renamed from: n */
    public final List<C45792a> m21735n() {
        return CollectionsKt.listOf((Object[]) new C45792a[]{new C45792a(InterfaceC4578a.c.f4048a, null, false), new C45792a(InterfaceC4578a.h.f4053a, null, false), new C45792a(InterfaceC4578a.d.f4049a, null, false)});
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final InterfaceC41634e<C45796e> m21736o() {
        return this.f20399c0;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final InterfaceC41634e<List<C45792a>> m21737p() {
        return this.f20393W;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final InterfaceC41634e<C45794c> m21738q() {
        return this.f20395Y;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final InterfaceC41634e<C45795d> m21739r() {
        return this.f20397a0;
    }

    /* JADX INFO: renamed from: s */
    public final void m21740s(@NotNull InterfaceC45793b event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof C45792a) {
            this.f20392V.setValue(CollectionsKt.listOf(event));
            return;
        }
        if (event instanceof C45794c) {
            this.f20394X.setValue(event);
        } else if (event instanceof C45796e) {
            this.f20398b0.setValue(event);
        } else if (event instanceof C45795d) {
            this.f20396Z.setValue(event);
        }
    }

    public CoreBizShareViewModel() {
        InterfaceC41669n<List<C45792a>> interfaceC41669nM91009a = C41679x.m91009a(m21735n());
        this.f20392V = interfaceC41669nM91009a;
        this.f20393W = interfaceC41669nM91009a;
        InterfaceC41669n<C45794c> interfaceC41669nM91009a2 = C41679x.m91009a(null);
        this.f20394X = interfaceC41669nM91009a2;
        this.f20395Y = interfaceC41669nM91009a2;
        InterfaceC41669n<C45795d> interfaceC41669nM91009a3 = C41679x.m91009a(null);
        this.f20396Z = interfaceC41669nM91009a3;
        this.f20397a0 = interfaceC41669nM91009a3;
        InterfaceC41669n<C45796e> interfaceC41669nM91009a4 = C41679x.m91009a(null);
        this.f20398b0 = interfaceC41669nM91009a4;
        this.f20399c0 = interfaceC41669nM91009a4;
    }
}
