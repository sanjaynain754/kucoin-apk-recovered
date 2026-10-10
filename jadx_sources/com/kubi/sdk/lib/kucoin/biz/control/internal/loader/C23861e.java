package com.kubi.sdk.lib.kucoin.biz.control.internal.loader;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.sdk.lib.kucoin.bizcontrol.api.BizControlConfigState;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import p294gz.InterfaceC38061e;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.sdk.lib.kucoin.biz.control.internal.loader.e */
/* JADX INFO: compiled from: StateMachine.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0003R\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/e;", "", "<init>", "()V", "Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/BizControlConfigState;", "b", "()Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/BizControlConfigState;", "nextState", "", "e", "(Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/BizControlConfigState;)V", "Lgz/e;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lgz/e;)V", "d", "c", "Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/BizControlConfigState;", "state", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "listeners", "biz-control-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nStateMachine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateMachine.kt\ncom/kubi/sdk/lib/kucoin/biz/control/internal/loader/StateMachine\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,52:1\n1855#2,2:53\n*S KotlinDebug\n*F\n+ 1 StateMachine.kt\ncom/kubi/sdk/lib/kucoin/biz/control/internal/loader/StateMachine\n*L\n46#1:53,2\n*E\n"})
public final class C23861e {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C23861e f46911a = new C23861e();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static volatile BizControlConfigState state = BizControlConfigState.INIT;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final CopyOnWriteArrayList<InterfaceC38061e> listeners = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: a */
    public final void m57107a(@NotNull InterfaceC38061e listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        listeners.add(listener);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final BizControlConfigState m57108b() {
        return state;
    }

    /* JADX INFO: renamed from: c */
    public final void m57109c() {
        Iterator<T> it = listeners.iterator();
        while (it.hasNext()) {
            ((InterfaceC38061e) it.next()).mo14990r(state);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m57110d(@NotNull InterfaceC38061e listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        listeners.remove(listener);
    }

    /* JADX INFO: renamed from: e */
    public final void m57111e(@NotNull BizControlConfigState nextState) {
        Intrinsics.checkNotNullParameter(nextState, "nextState");
        C44128b.m97259c("BizControl::StateMachine", "currentStatus " + state + " updateState: " + nextState);
        state = nextState;
        m57109c();
    }
}
