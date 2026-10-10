package uz;

import com.kubi.router.core.Router;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: uz.e */
/* JADX INFO: compiled from: ModeDepend.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/sdk/mode/spi/ModeDepend;", "", "<init>", "()V", "modeLite", "Lcom/kubi/sdk/mode/spi/IModeLiteSPI;", "getModeLite", "()Lcom/kubi/sdk/mode/spi/IModeLiteSPI;", "modeLite$delegate", "Lkotlin/Lazy;", "modeWallet", "Lcom/kubi/sdk/mode/spi/IModeWalletSPI;", "getModeWallet", "()Lcom/kubi/sdk/mode/spi/IModeWalletSPI;", "modeWallet$delegate", "LMode_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45337e {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45337e f101936a = new C45337e();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f101937b = LazyKt.lazy(new Function0() { // from class: uz.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45337e.m100227e();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy f101938c = LazyKt.lazy(new Function0() { // from class: uz.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45337e.m100228f();
        }
    });

    /* JADX INFO: renamed from: e */
    public static final InterfaceC45333a m100227e() {
        return (InterfaceC45333a) Router.f46192a.m56192n(InterfaceC45333a.class);
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC45334b m100228f() {
        return (InterfaceC45334b) Router.f46192a.m56192n(InterfaceC45334b.class);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final InterfaceC45333a m100229c() {
        return (InterfaceC45333a) f101937b.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final InterfaceC45334b m100230d() {
        return (InterfaceC45334b) f101938c.getValue();
    }
}
