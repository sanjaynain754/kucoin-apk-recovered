package p700vr;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.api.subscribe.model.SubscribeRequest;
import com.kubi.network.socket.C19343b;
import com.kubi.network.socket.InterfaceC19342a;
import com.kubi.network.subscribe.period.OnetimeExecutor;
import com.kubi.network.subscribe.period.PeriodExecutor;
import er.InterfaceC37236a;
import fr.C37584e;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p771xr.C46327a;
import p771xr.C46328b;
import p807yr.C46559b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: vr.a */
/* JADX INFO: compiled from: SubscribeClient.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\u0003R\u0016\u0010\r\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010\fR$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u001c\u001a\u0004\u0018\u00010\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u000f\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\"\u001a\u0004\u0018\u00010\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b\u0017\u0010\u001f\"\u0004\b \u0010!¨\u0006#"}, m90084d2 = {"Lvr/a;", "Lcom/kubi/network/socket/a;", "<init>", "()V", "Lcom/kubi/network/socket/b;", "config", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/network/socket/b;)V", "connect", "disconnect", "cancelAll", "Lcom/kubi/network/socket/b;", "subscribeConfig", "Lyr/b;", "b", "Lyr/b;", "d", "()Lyr/b;", "setSubscribeQueue$network_core_subscribe_release", "(Lyr/b;)V", "subscribeQueue", "Lcom/kubi/network/subscribe/period/OnetimeExecutor;", "c", "Lcom/kubi/network/subscribe/period/OnetimeExecutor;", "()Lcom/kubi/network/subscribe/period/OnetimeExecutor;", "setOnetimeExecutor$network_core_subscribe_release", "(Lcom/kubi/network/subscribe/period/OnetimeExecutor;)V", "onetimeExecutor", "Lcom/kubi/network/subscribe/period/PeriodExecutor;", "Lcom/kubi/network/subscribe/period/PeriodExecutor;", "()Lcom/kubi/network/subscribe/period/PeriodExecutor;", "setPeriodExecutor$network_core_subscribe_release", "(Lcom/kubi/network/subscribe/period/PeriodExecutor;)V", "periodExecutor", "network-core-subscribe_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C45623a implements InterfaceC19342a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public C19343b subscribeConfig;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public C46559b subscribeQueue;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public OnetimeExecutor onetimeExecutor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PeriodExecutor periodExecutor;

    /* JADX INFO: renamed from: vr.a$a */
    /* JADX INFO: compiled from: SubscribeClient.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"vr/a$a", "Lfr/e;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()V", "network-core-subscribe_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSubscribeClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubscribeClient.kt\ncom/kubi/network/subscribe/SubscribeClient$init$1\n+ 2 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,73:1\n32#2,2:74\n*S KotlinDebug\n*F\n+ 1 SubscribeClient.kt\ncom/kubi/network/subscribe/SubscribeClient$init$1\n*L\n44#1:74,2\n*E\n"})
    public static final class a extends C37584e {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C19343b f102757c;

        public a(C19343b c19343b) {
            this.f102757c = c19343b;
        }

        @Override // fr.C37584e
        /* JADX INFO: renamed from: a */
        public void mo84723a() {
            Iterator<SubscribeRequest> it;
            C46559b subscribeQueue = C45623a.this.getSubscribeQueue();
            if (subscribeQueue == null || (it = subscribeQueue.iterator()) == null) {
                return;
            }
            C19343b c19343b = this.f102757c;
            while (it.hasNext()) {
                c19343b.m42897d().invoke(it.next());
            }
        }
    }

    @Override // com.kubi.network.socket.InterfaceC19342a
    /* JADX INFO: renamed from: a */
    public void mo42893a(@NotNull C19343b config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.subscribeConfig = config;
        config.getSocketClient().mo42856a(new a(config));
        config.m42896c().add(new C46327a(this));
        config.m42896c().add(new C46328b(this));
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final OnetimeExecutor getOnetimeExecutor() {
        return this.onetimeExecutor;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final PeriodExecutor getPeriodExecutor() {
        return this.periodExecutor;
    }

    @Override // com.kubi.network.socket.InterfaceC19342a
    public void cancelAll() {
        C46559b c46559b = this.subscribeQueue;
        if (c46559b != null) {
            c46559b.clear();
        }
        PeriodExecutor periodExecutor = this.periodExecutor;
        if (periodExecutor != null) {
            periodExecutor.m43086c();
        }
    }

    @Override // com.kubi.network.socket.InterfaceC19342a
    public void connect() {
        this.subscribeQueue = new C46559b();
        C19343b c19343b = this.subscribeConfig;
        C19343b c19343b2 = null;
        if (c19343b == null) {
            Intrinsics.throwUninitializedPropertyAccessException("subscribeConfig");
            c19343b = null;
        }
        this.onetimeExecutor = new OnetimeExecutor(c19343b);
        C19343b c19343b3 = this.subscribeConfig;
        if (c19343b3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("subscribeConfig");
        } else {
            c19343b2 = c19343b3;
        }
        InterfaceC37236a socketClient = c19343b2.getSocketClient();
        OnetimeExecutor onetimeExecutor = this.onetimeExecutor;
        Intrinsics.checkNotNull(onetimeExecutor);
        this.periodExecutor = new PeriodExecutor(socketClient, onetimeExecutor);
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final C46559b getSubscribeQueue() {
        return this.subscribeQueue;
    }

    @Override // com.kubi.network.socket.InterfaceC19342a
    public void disconnect() {
        cancelAll();
        PeriodExecutor periodExecutor = this.periodExecutor;
        if (periodExecutor != null) {
            periodExecutor.quit();
        }
        this.periodExecutor = null;
        this.onetimeExecutor = null;
        this.subscribeQueue = null;
    }
}
