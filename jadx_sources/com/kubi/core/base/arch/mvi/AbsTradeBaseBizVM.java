package com.kubi.core.base.arch.mvi;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModelKt;
import com.kubi.core.base.TradeAccountType;
import com.kubi.mvi.state.BaseStateVM;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.mvi.state.InterfaceC19284f;
import com.tencent.qcloud.tuicore.TUIConstants;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import p827zc.AbstractC46753c;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AbsTradeBaseBizVM.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJP\u0010\u0010\u001a\u00020\u0011\"\u0004\b\u0002\u0010\u0012*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00120\u001321\u0010\u0014\u001a-\b\u0001\u0012\u0013\u0012\u0011H\u0012¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0015¢\u0006\u0002\u0010\u001cJN\u0010\u001d\u001a\u00020\u0011\"\u0004\b\u0002\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u001321\u0010\u0014\u001a-\b\u0001\u0012\u0013\u0012\u0011H\u0012¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0015¢\u0006\u0002\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010 R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m90084d2 = {"Lcom/kubi/core/base/arch/mvi/AbsTradeBaseBizVM;", "I", "Lcom/kubi/mvi/state/IIntent;", ExifInterface.LATITUDE_SOUTH, "Lcom/kubi/mvi/state/IState;", "Lcom/kubi/mvi/state/BaseStateVM;", "repoProvider", "Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;", "<init>", "(Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;)V", "getRepoProvider", "()Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;", "tradeAccountType", "Lcom/kubi/core/base/TradeAccountType;", "getTradeAccountType", "()Lcom/kubi/core/base/TradeAccountType;", "collectNotNullLatest", "Lkotlinx/coroutines/Job;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/Flow;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/coroutines/Continuation;", "", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "collectLatestData", "sendBizIntent", "intent", "(Lcom/kubi/mvi/state/IIntent;)V", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class AbsTradeBaseBizVM<I extends InterfaceC19282d, S extends InterfaceC19284f> extends BaseStateVM<I, S> {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final AbstractC46753c f20069V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final TradeAccountType f20070W;

    public AbsTradeBaseBizVM(@NotNull AbstractC46753c repoProvider) {
        Intrinsics.checkNotNullParameter(repoProvider, "repoProvider");
        this.f20069V = repoProvider;
        this.f20070W = repoProvider.mo96896e();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final <T> InterfaceC41775x1 m21022b(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(interfaceC41634e, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        return C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new AbsTradeBaseBizVM$collectLatestData$1(interfaceC41634e, action, null), 3, null);
    }

    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public final AbstractC46753c getF20069V() {
        return this.f20069V;
    }

    @NotNull
    /* JADX INFO: renamed from: o, reason: from getter */
    public final TradeAccountType getF20070W() {
        return this.f20070W;
    }

    /* JADX INFO: renamed from: p */
    public void m21025p(@NotNull I intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
    }
}
