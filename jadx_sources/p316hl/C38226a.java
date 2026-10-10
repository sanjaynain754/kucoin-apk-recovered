package p316hl;

import android.os.Bundle;
import androidx.camera.view.C1454t;
import com.kubi.router.core.Router;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: hl.a */
/* JADX INFO: compiled from: BackButtonHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000eJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bJ\u0006\u0010\u0012\u001a\u00020\u000bJ\u0006\u0010\u0013\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u000bR\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/kucoin/helper/BackButtonHelper;", "", "<init>", "()V", "backButtonRouter", "Ljava/util/concurrent/atomic/AtomicReference;", "", "markTokenRef", "Lcom/kubi/kucoin/helper/BackButtonHelper$MarkToken;", "GO_BACK_KEY", "intercept", "", "bundle", "Landroid/os/Bundle;", "intercept$LAppRouter_googleRelease", "canGoBack", "", "markToken", "onChangeMainTab", "handleOnBackPressed", "clean", "MarkToken", "LAppRouter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C38226a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C38226a f85925a = new C38226a();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final AtomicReference<String> f85926b = new AtomicReference<>(null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final AtomicReference<a> f85927c = new AtomicReference<>(null);

    /* JADX INFO: renamed from: hl.a$a */
    /* JADX INFO: compiled from: BackButtonHelper.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/kucoin/helper/BackButtonHelper$MarkToken;", "", "<init>", "()V", "LAppRouter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a {
    }

    /* JADX INFO: renamed from: a */
    public final boolean m86299a(@NotNull a markToken) {
        Intrinsics.checkNotNullParameter(markToken, "markToken");
        if (f85926b.get() == null) {
            return false;
        }
        AtomicReference<a> atomicReference = f85927c;
        return C1454t.m2255a(atomicReference, null, markToken) || Intrinsics.areEqual(atomicReference.get(), markToken);
    }

    /* JADX INFO: renamed from: b */
    public final void m86300b() {
        f85926b.set(null);
        f85927c.set(null);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m86301c() {
        String andSet = f85926b.getAndSet(null);
        if (andSet == null || andSet.length() == 0) {
            return false;
        }
        f85927c.set(null);
        return Router.f46192a.m56184f(andSet).m4048k();
    }

    /* JADX INFO: renamed from: d */
    public final void m86302d(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        String string = bundle.getString("goBackUrl", null);
        if (string == null || string.length() == 0) {
            return;
        }
        f85926b.set(string);
    }

    /* JADX INFO: renamed from: e */
    public final void m86303e() {
        if (f85926b.get() == null || f85927c.get() == null) {
            return;
        }
        m86300b();
    }
}
