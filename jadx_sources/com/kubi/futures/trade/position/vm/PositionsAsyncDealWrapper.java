package com.kubi.futures.trade.position.vm;

import java.util.List;
import org.jetbrains.annotations.Nullable;
import p640ti.InterfaceC45033h;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.kubi.futures.trade.position.vm.g2, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FuturesPositionViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B%\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/futures/trade/position/vm/PositionsAsyncDealWrapper;", "", "positions", "", "Lcom/kubi/futures/trade/position/data/IPositionEntityWrapper;", "asyncDealTag", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getPositions", "()Ljava/util/List;", "setPositions", "(Ljava/util/List;)V", "getAsyncDealTag", "()Ljava/lang/String;", "setAsyncDealTag", "(Ljava/lang/String;)V", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PositionsAsyncDealWrapper {

    /* JADX INFO: renamed from: a */
    @Nullable
    public List<? extends InterfaceC45033h> f24355a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public String f24356b;

    /* JADX WARN: Multi-variable type inference failed */
    public PositionsAsyncDealWrapper() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public PositionsAsyncDealWrapper(@Nullable List<? extends InterfaceC45033h> list, @Nullable String str) {
        this.f24355a = list;
        this.f24356b = str;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF24356b() {
        return this.f24356b;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final List<InterfaceC45033h> m28034b() {
        return this.f24355a;
    }

    /* JADX INFO: renamed from: c */
    public final void m28035c(@Nullable String str) {
        this.f24356b = str;
    }

    /* JADX INFO: renamed from: d */
    public final void m28036d(@Nullable List<? extends InterfaceC45033h> list) {
        this.f24355a = list;
    }

    public /* synthetic */ PositionsAsyncDealWrapper(List list, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : str);
    }
}
