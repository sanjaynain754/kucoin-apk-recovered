package p343ii;

import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.service.KuMexDepend;
import org.jetbrains.annotations.Nullable;
import p314hi.InterfaceC38215c;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import th.InterfaceC44980d;

/* JADX INFO: renamed from: ii.b */
/* JADX INFO: compiled from: FuturesEnvironmentConfigImpl.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u0013\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/futures/trade/config/impl/FuturesEnvironmentConfigImpl;", "Lcom/kubi/futures/trade/config/IFuturesEnvironmentConfig;", "<init>", "()V", "isLogin", "", "isOpenContract", "isMaintain", "equals", "other", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C38646b implements InterfaceC38215c {
    @Override // p314hi.InterfaceC38215c
    /* JADX INFO: renamed from: b0 */
    public boolean mo86266b0() {
        String strM99530V = InterfaceC44980d.m99530V(RepositoryServiceLocator.f19236a.m20288g(), null, 1, null);
        return Intrinsics.areEqual(strM99530V, "Paused") || Intrinsics.areEqual(strM99530V, "CancelOnly");
    }

    @Override // p314hi.InterfaceC38215c
    /* JADX INFO: renamed from: c0 */
    public boolean mo86267c0() {
        return KuMexDepend.f30378a.m35906h();
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof C38646b)) {
            return false;
        }
        C38646b c38646b = (C38646b) other;
        return mo86268m() == c38646b.mo86268m() && mo86267c0() == c38646b.mo86267c0() && mo86266b0() == c38646b.mo86266b0();
    }

    @Override // p314hi.InterfaceC38215c
    /* JADX INFO: renamed from: m */
    public boolean mo86268m() {
        return KuMexDepend.f30378a.m35905g().c();
    }
}
