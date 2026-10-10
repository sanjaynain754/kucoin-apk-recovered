package sa0;

import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;
import sa0.InterfaceC44373c;

/* JADX INFO: renamed from: sa0.a */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC44371a<V extends InterfaceC44373c> implements InterfaceC44372b<V> {

    /* JADX INFO: renamed from: a */
    public boolean f98032a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public WeakReference<V> f98033b = new WeakReference<>(null);

    /* JADX INFO: renamed from: e */
    public abstract void mo68337e();

    /* JADX INFO: renamed from: f */
    public abstract void mo68338f();

    @Nullable
    /* JADX INFO: renamed from: d */
    public final V m97872d() {
        return this.f98033b.get();
    }

    @Override // sa0.InterfaceC44372b
    /* JADX INFO: renamed from: a */
    public void mo97870a(@NotNull V view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f98033b = new WeakReference<>(view);
        this.f98032a = true;
        mo68337e();
    }

    @Override // sa0.InterfaceC44372b
    /* JADX INFO: renamed from: c */
    public void mo97871c() {
        mo68338f();
        this.f98033b.clear();
    }
}
