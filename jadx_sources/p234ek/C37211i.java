package p234ek;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.httpdns.ServerConfig;
import com.kubi.httpdns.interpret.NoServerException;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p345ik.C38654b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46396e;

/* JADX INFO: renamed from: ek.i */
/* JADX INFO: compiled from: ServerControlImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019¨\u0006\u001c"}, m90084d2 = {"Lek/i;", "Lek/b;", "Lcom/kubi/httpdns/ServerConfig;", "", "serverConfigs", "<init>", "(Ljava/util/List;)V", "d", "()Lcom/kubi/httpdns/ServerConfig;", "", "b", "()V", "c", "", "e", "()I", "pos", "Ly70/e;", "f", "(I)Ly70/e;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/List;", "", "Ljava/lang/Object;", "lock", "I", "lastSuccessPos", "currentUsePos", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nServerControlImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerControlImpl.kt\ncom/kubi/httpdns/interpret/ServerControlImpl\n+ 2 DnsIssueException.kt\ncom/kubi/httpdns/exception/DnsIssueExceptionKt\n*L\n1#1,58:1\n36#2,14:59\n*S KotlinDebug\n*F\n+ 1 ServerControlImpl.kt\ncom/kubi/httpdns/interpret/ServerControlImpl\n*L\n39#1:59,14\n*E\n"})
public final class C37211i implements InterfaceC37204b<ServerConfig> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<ServerConfig> serverConfigs;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Object lock;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int lastSuccessPos;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int currentUsePos;

    public C37211i(@NotNull List<ServerConfig> serverConfigs) {
        Intrinsics.checkNotNullParameter(serverConfigs, "serverConfigs");
        this.serverConfigs = serverConfigs;
        this.lock = new Object();
        int iMin = Math.min(m83249e(), serverConfigs.size() - 1);
        this.lastSuccessPos = iMin;
        this.currentUsePos = iMin;
    }

    @Override // p234ek.InterfaceC37204b
    /* JADX INFO: renamed from: b */
    public void mo31470b() {
        boolean z11;
        synchronized (this.lock) {
            try {
                int i11 = this.currentUsePos;
                if (i11 == this.serverConfigs.size() - 1) {
                    this.currentUsePos = 0;
                } else {
                    this.currentUsePos++;
                }
                z11 = this.lastSuccessPos == i11;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z11) {
            C44128b.m97263g("ServerControlImpl", new NoServerException());
        }
    }

    @Override // p234ek.InterfaceC37204b
    /* JADX INFO: renamed from: c */
    public void mo31471c() {
        synchronized (this.lock) {
            int i11 = this.currentUsePos;
            this.lastSuccessPos = i11;
            m83250f(i11);
        }
    }

    @Override // p234ek.InterfaceC37204b
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ServerConfig mo31469a() throws NoServerException {
        ServerConfig serverConfig = this.serverConfigs.get(this.currentUsePos);
        if (serverConfig != null) {
            return serverConfig;
        }
        throw new NoServerException();
    }

    /* JADX INFO: renamed from: e */
    public final int m83249e() {
        return C46396e.m102348e(C38654b.f86659a.m87382c(), "last_success_pos", 0);
    }

    /* JADX INFO: renamed from: f */
    public final C46396e m83250f(int pos) {
        return C46396e.m102355l(C38654b.f86659a.m87382c(), "last_success_pos", pos);
    }
}
