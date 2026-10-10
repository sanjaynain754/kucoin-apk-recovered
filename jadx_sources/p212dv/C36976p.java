package p212dv;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: dv.p */
/* JADX INFO: compiled from: KlineCoinInfoTabManager.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005J\b\u0010\t\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\n\u001a\u00020\u000bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/quotefacade/event/KlineCoinInfoTabManager;", "", "<init>", "()V", "provider", "Lcom/kubi/quotefacade/event/IKlineCoinInfoTabProvider;", "register", "", "unregister", "getProvider", "containsCoinInfoTab", "", "QuoteFacadeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C36976p {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C36976p f82091a = new C36976p();

    /* JADX INFO: renamed from: b */
    @Nullable
    public static volatile InterfaceC36975o f82092b;

    /* JADX INFO: renamed from: a */
    public final boolean m82792a() {
        InterfaceC36975o interfaceC36975o = f82092b;
        if (interfaceC36975o != null) {
            return interfaceC36975o.mo32806P2();
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m82793b(@NotNull InterfaceC36975o provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        f82092b = provider;
    }

    /* JADX INFO: renamed from: c */
    public final void m82794c(@NotNull InterfaceC36975o provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        if (Intrinsics.areEqual(f82092b, provider)) {
            f82092b = null;
        }
    }
}
