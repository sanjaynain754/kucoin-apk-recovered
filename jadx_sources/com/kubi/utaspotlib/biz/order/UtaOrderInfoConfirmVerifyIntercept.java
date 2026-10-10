package com.kubi.utaspotlib.biz.order;

import ne.InterfaceC42808a;
import ne.InterfaceC42809b;
import org.jetbrains.annotations.NotNull;
import p557qe.InterfaceC43720b;
import p557qe.InterfaceC43722d;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.utaspotlib.biz.order.f, reason: from Kotlin metadata */
/* JADX INFO: compiled from: UtaOrderInfoConfirmVerifyIntercept.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016J$\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0011H\u0016R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/utaspotlib/biz/order/UtaOrderInfoConfirmVerifyIntercept;", "Lcom/kubi/core/spot/business/holder/intercept/taskchain/ITask;", "Lcom/kubi/core/spot/business/holder/intercept/data/ITradeInputData;", "Lcom/kubi/core/spot/business/holder/intercept/data/ITradeInputInterceptResult;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "onPassed", "", "data", "onIntercept", "exception", "run", "dispatcher", "Lcom/kubi/core/spot/business/holder/intercept/taskchain/TaskDispatcher;", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class UtaOrderInfoConfirmVerifyIntercept implements InterfaceC43720b<InterfaceC42808a, InterfaceC42809b> {
    @Override // p557qe.InterfaceC43720b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo23274a(@NotNull InterfaceC42809b exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
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
        if (C26914a.m66168j(false, 1, null)) {
            new UtaOrderConfirmationDialog(data, this, dispatcher).show(data.mo93838d(), "UtaOrderInfoConfirmVerifyIntercept");
        } else {
            dispatcher.mo96274a(this, data);
        }
    }
}
