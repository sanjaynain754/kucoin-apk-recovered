package com.kubi.core.biz.margininfo;

import com.kubi.core.base.arch.mvi.AbsTradeBaseBizVM;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import p827zc.AbstractC46753c;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import se.InterfaceC44395a;

/* JADX INFO: renamed from: com.kubi.core.biz.margininfo.h, reason: from Kotlin metadata */
/* JADX INFO: compiled from: MarginInfoVM.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R#\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/core/biz/margininfo/MarginInfoVM;", "Lcom/kubi/core/base/arch/mvi/AbsTradeBaseBizVM;", "Lcom/kubi/core/biz/margininfo/MarginInfoContract$UiIntent;", "Lcom/kubi/core/biz/margininfo/MarginInfoContract$UiState;", "repoProvider", "Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;", "<init>", "(Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;)V", "mApi", "Lcom/kubi/core/spot/business/mvi/ISpotTradeApi;", "kotlin.jvm.PlatformType", "getMApi", "()Lcom/kubi/core/spot/business/mvi/ISpotTradeApi;", "mApi$delegate", "Lkotlin/Lazy;", "initState", "getInitState", "()Lcom/kubi/core/biz/margininfo/MarginInfoContract$UiState;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MarginInfoVM extends AbsTradeBaseBizVM<Object, UiState> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f20494X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginInfoVM(@NotNull AbstractC46753c repoProvider) {
        super(repoProvider);
        Intrinsics.checkNotNullParameter(repoProvider, "repoProvider");
        this.f20494X = LazyKt.lazy(new Function0() { // from class: com.kubi.core.biz.margininfo.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginInfoVM.m21950s();
            }
        });
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public UiState getInitState() {
        return new UiState(null, 1, null);
    }

    /* JADX INFO: renamed from: s */
    public static final InterfaceC44395a m21950s() {
        return (InterfaceC44395a) C42597a.m93388d().create(InterfaceC44395a.class);
    }
}
