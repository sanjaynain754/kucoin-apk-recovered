package com.kubi.app.bizcontrol;

import com.kubi.sdk.lib.kucoin.bizcontrol.api.BizControlConfigState;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.C41777y;
import kotlinx.coroutines.InterfaceC41769w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p294gz.C38057a;
import p294gz.C38058b;
import p294gz.InterfaceC38061e;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: BizControlLoader.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\f\u0010\u000b\u001a\u00020\n*\u00020\fH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0006\u0010\u0011\u001a\u00020\u000eJ\u0006\u0010\u0012\u001a\u00020\u000eJ\u000e\u0010\u0013\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/app/bizcontrol/BizControlLoader;", "Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/IStateListener;", "spmId", "", "<init>", "(Ljava/lang/String;)V", "hasListener", "Ljava/util/concurrent/atomic/AtomicBoolean;", "completableDeferred", "Lkotlinx/coroutines/CompletableDeferred;", "", "isFinish", "Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/BizControlConfigState;", "complete", "", "onStateUpdated", "state", "preload", "reset", "getBizControl", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "LBizControl_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BizControlLoader implements InterfaceC38061e {

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Companion f15434e = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public final String f15435b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final AtomicBoolean f15436c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public InterfaceC41769w<Boolean> f15437d;

    /* JADX INFO: compiled from: BizControlLoader.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/app/bizcontrol/BizControlLoader$Companion;", "", "<init>", "()V", "TAG", "", "LBizControl_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m14986a() {
        C38058b.f85672a.m85939k(this);
        boolean zM85928a = C38057a.f85671a.m85928a(this.f15435b, true);
        C44128b.m97266j("SignupGuidance", "BizControlLoader updateBizControl " + zM85928a);
        this.f15437d.mo91370n(Boolean.valueOf(zM85928a));
    }

    /* JADX INFO: renamed from: c */
    public final boolean m14988c(BizControlConfigState bizControlConfigState) {
        return bizControlConfigState == BizControlConfigState.FAILED || bizControlConfigState == BizControlConfigState.SUCCESS;
    }

    /* JADX INFO: renamed from: d */
    public final void m14989d() {
        C38058b c38058b = C38058b.f85672a;
        BizControlConfigState bizControlConfigStateM85935g = c38058b.m85935g();
        if (!m14988c(bizControlConfigStateM85935g)) {
            if (this.f15436c.getAndSet(true)) {
                return;
            }
            c38058b.m85929a(this);
        } else {
            C44128b.m97266j("SignupGuidance", "BizControlLoader preload " + bizControlConfigStateM85935g);
            m14986a();
        }
    }

    public BizControlLoader(@NotNull String spmId) {
        Intrinsics.checkNotNullParameter(spmId, "spmId");
        this.f15435b = spmId;
        this.f15436c = new AtomicBoolean(false);
        this.f15437d = C41777y.m91388c(null, 1, null);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Object m14987b(@NotNull Continuation<? super Boolean> continuation) {
        m14989d();
        return this.f15437d.mo91198h(continuation);
    }

    @Override // p294gz.InterfaceC38061e
    /* JADX INFO: renamed from: r */
    public void mo14990r(@NotNull BizControlConfigState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (m14988c(state)) {
            C44128b.m97266j("SignupGuidance", "BizControlLoader onStateUpdated " + state);
            m14986a();
        }
    }
}
