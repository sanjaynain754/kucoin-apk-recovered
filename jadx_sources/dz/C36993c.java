package dz;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.kubi.sdk.base.p113ui.BaseUiActivity;
import com.kubi.sdk.base.p113ui.OldBaseActivity;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.function.looper.KuCoinLooper;

/* JADX INFO: renamed from: dz.c */
/* JADX INFO: compiled from: KuCoinLooperTask.java */
/* JADX INFO: loaded from: classes12.dex */
public class C36993c implements LifecycleObserver {

    /* JADX INFO: renamed from: b */
    public boolean f82110b;

    /* JADX INFO: renamed from: c */
    public OldBaseFragment f82111c;

    /* JADX INFO: renamed from: d */
    public long f82112d;

    /* JADX INFO: renamed from: e */
    public Runnable f82113e;

    /* JADX INFO: renamed from: f */
    public String f82114f;

    /* JADX INFO: renamed from: dz.c$b */
    /* JADX INFO: compiled from: KuCoinLooperTask.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public long f82115a;

        /* JADX INFO: renamed from: b */
        public Runnable f82116b;

        /* JADX INFO: renamed from: c */
        public String f82117c;

        /* JADX INFO: renamed from: d */
        public LifecycleOwner f82118d;

        /* JADX INFO: renamed from: e */
        public OldBaseFragment f82119e;

        /* JADX INFO: renamed from: f */
        public b m82826f(Runnable runnable) {
            this.f82116b = runnable;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public b m82827g(LifecycleOwner lifecycleOwner) {
            this.f82118d = lifecycleOwner;
            if (lifecycleOwner instanceof OldBaseFragment) {
                this.f82119e = (OldBaseFragment) lifecycleOwner;
            }
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C36993c m82828h() {
            return new C36993c(this);
        }

        /* JADX INFO: renamed from: i */
        public b m82829i(long j11) {
            this.f82115a = j11;
            return this;
        }

        public b(String str) {
            this.f82117c = str;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        this.f82110b = false;
        KuCoinLooper.INSTANCE.removeTask(this);
        lifecycleOwner.getLifecycle().removeObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop(LifecycleOwner lifecycleOwner) {
        this.f82110b = false;
    }

    public C36993c(b bVar) {
        this.f82110b = true;
        this.f82112d = bVar.f82115a;
        this.f82113e = bVar.f82116b;
        this.f82114f = bVar.f82117c;
        this.f82111c = bVar.f82119e;
        if (bVar.f82118d != null) {
            if (bVar.f82118d instanceof OldBaseFragment) {
                this.f82110b = ((OldBaseFragment) bVar.f82118d).isCurrentlyVisible();
            } else if (bVar.f82118d instanceof BaseUiActivity) {
                this.f82110b = ((BaseUiActivity) bVar.f82118d).m56589d0();
            }
            bVar.f82118d.getLifecycle().addObserver(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public Runnable m82816a() {
        return this.f82113e;
    }

    /* JADX INFO: renamed from: b */
    public long m82817b() {
        return this.f82112d;
    }

    /* JADX INFO: renamed from: c */
    public String m82818c() {
        return this.f82114f;
    }

    /* JADX INFO: renamed from: d */
    public boolean m82819d() {
        return this.f82110b;
    }

    /* JADX INFO: renamed from: e */
    public void m82820e(OldBaseFragment oldBaseFragment, boolean z11) {
        OldBaseFragment oldBaseFragment2 = this.f82111c;
        if (oldBaseFragment2 == null || !oldBaseFragment2.equals(oldBaseFragment)) {
            return;
        }
        this.f82110b = z11;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner instanceof OldBaseActivity) {
            this.f82110b = true;
            return;
        }
        if (lifecycleOwner instanceof OldBaseFragment) {
            OldBaseFragment oldBaseFragment = (OldBaseFragment) lifecycleOwner;
            if (!oldBaseFragment.getUserVisibleHint() || oldBaseFragment.isHidden()) {
                return;
            }
            this.f82110b = true;
        }
    }
}
