package q90;

import aa0.InterfaceC0214b;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ba0.C4524a;
import ba0.C4525b;
import ba0.InterfaceC4528e;
import ca0.C4922c;
import ca0.InterfaceC4920a;
import da0.C36654a;
import da0.InterfaceC36655b;
import ea0.C37125a;
import ea0.InterfaceC37126b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import x90.C46105b;
import x90.InterfaceC46104a;
import z90.C46736b;
import z90.InterfaceC46735a;

/* JADX INFO: renamed from: q90.e */
/* JADX INFO: compiled from: TranscoderOptions.java */
/* JADX INFO: loaded from: classes59.dex */
public class C43674e {

    /* JADX INFO: renamed from: a */
    public InterfaceC46735a f96483a;

    /* JADX INFO: renamed from: b */
    public List<InterfaceC0214b> f96484b;

    /* JADX INFO: renamed from: c */
    public List<InterfaceC0214b> f96485c;

    /* JADX INFO: renamed from: d */
    public InterfaceC4528e f96486d;

    /* JADX INFO: renamed from: e */
    public InterfaceC4528e f96487e;

    /* JADX INFO: renamed from: f */
    public InterfaceC37126b f96488f;

    /* JADX INFO: renamed from: g */
    public int f96489g;

    /* JADX INFO: renamed from: h */
    public InterfaceC36655b f96490h;

    /* JADX INFO: renamed from: i */
    public InterfaceC4920a f96491i;

    /* JADX INFO: renamed from: j */
    public InterfaceC46104a f96492j;

    /* JADX INFO: renamed from: k */
    public InterfaceC43673d f96493k;

    /* JADX INFO: renamed from: l */
    public Handler f96494l;

    /* JADX INFO: renamed from: q90.e$b */
    /* JADX INFO: compiled from: TranscoderOptions.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final InterfaceC46735a f96495a;

        /* JADX INFO: renamed from: b */
        public final List<InterfaceC0214b> f96496b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public final List<InterfaceC0214b> f96497c = new ArrayList();

        /* JADX INFO: renamed from: d */
        public InterfaceC43673d f96498d;

        /* JADX INFO: renamed from: e */
        public Handler f96499e;

        /* JADX INFO: renamed from: f */
        public InterfaceC4528e f96500f;

        /* JADX INFO: renamed from: g */
        public InterfaceC4528e f96501g;

        /* JADX INFO: renamed from: h */
        public InterfaceC37126b f96502h;

        /* JADX INFO: renamed from: i */
        public int f96503i;

        /* JADX INFO: renamed from: j */
        public InterfaceC36655b f96504j;

        /* JADX INFO: renamed from: k */
        public InterfaceC4920a f96505k;

        /* JADX INFO: renamed from: l */
        public InterfaceC46104a f96506l;

        @NonNull
        /* JADX INFO: renamed from: a */
        public b m96122a(@NonNull InterfaceC0214b interfaceC0214b) {
            this.f96496b.add(interfaceC0214b);
            this.f96497c.add(interfaceC0214b);
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public C43674e m96123b() {
            if (this.f96498d == null) {
                throw new IllegalStateException("listener can't be null");
            }
            if (this.f96496b.isEmpty() && this.f96497c.isEmpty()) {
                throw new IllegalStateException("we need at least one data source");
            }
            int i11 = this.f96503i;
            if (i11 != 0 && i11 != 90 && i11 != 180 && i11 != 270) {
                throw new IllegalArgumentException("Accepted values for rotation are 0, 90, 180, 270");
            }
            if (this.f96499e == null) {
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper == null) {
                    looperMyLooper = Looper.getMainLooper();
                }
                this.f96499e = new Handler(looperMyLooper);
            }
            if (this.f96500f == null) {
                this.f96500f = C4524a.m4365b().m4369a();
            }
            if (this.f96501g == null) {
                this.f96501g = C4525b.m4381a();
            }
            if (this.f96502h == null) {
                this.f96502h = new C37125a();
            }
            if (this.f96504j == null) {
                this.f96504j = new C36654a();
            }
            if (this.f96505k == null) {
                this.f96505k = new C4922c();
            }
            if (this.f96506l == null) {
                this.f96506l = new C46105b();
            }
            C43674e c43674e = new C43674e();
            c43674e.f96493k = this.f96498d;
            c43674e.f96485c = this.f96496b;
            c43674e.f96484b = this.f96497c;
            c43674e.f96483a = this.f96495a;
            c43674e.f96494l = this.f96499e;
            c43674e.f96486d = this.f96500f;
            c43674e.f96487e = this.f96501g;
            c43674e.f96488f = this.f96502h;
            c43674e.f96489g = this.f96503i;
            c43674e.f96490h = this.f96504j;
            c43674e.f96491i = this.f96505k;
            c43674e.f96492j = this.f96506l;
            return c43674e;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public b m96124c(@Nullable InterfaceC4528e interfaceC4528e) {
            this.f96500f = interfaceC4528e;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: d */
        public b m96125d(@NonNull InterfaceC43673d interfaceC43673d) {
            this.f96498d = interfaceC43673d;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: e */
        public b m96126e(@Nullable InterfaceC4528e interfaceC4528e) {
            this.f96501g = interfaceC4528e;
            return this;
        }

        public b(@NonNull String str) {
            this.f96495a = new C46736b(str);
        }

        @NonNull
        /* JADX INFO: renamed from: f */
        public Future<Void> m96127f() {
            return C43672c.m96094a().m96096c(m96123b());
        }
    }

    public C43674e() {
    }

    @NonNull
    /* JADX INFO: renamed from: m */
    public List<InterfaceC0214b> m96110m() {
        return this.f96485c;
    }

    @NonNull
    /* JADX INFO: renamed from: n */
    public InterfaceC46104a m96111n() {
        return this.f96492j;
    }

    @NonNull
    /* JADX INFO: renamed from: o */
    public InterfaceC4920a m96112o() {
        return this.f96491i;
    }

    @NonNull
    /* JADX INFO: renamed from: p */
    public InterfaceC4528e m96113p() {
        return this.f96486d;
    }

    @NonNull
    /* JADX INFO: renamed from: q */
    public InterfaceC46735a m96114q() {
        return this.f96483a;
    }

    @NonNull
    /* JADX INFO: renamed from: r */
    public InterfaceC43673d m96115r() {
        return this.f96493k;
    }

    @NonNull
    /* JADX INFO: renamed from: s */
    public Handler m96116s() {
        return this.f96494l;
    }

    @NonNull
    /* JADX INFO: renamed from: t */
    public InterfaceC36655b m96117t() {
        return this.f96490h;
    }

    @NonNull
    /* JADX INFO: renamed from: u */
    public InterfaceC37126b m96118u() {
        return this.f96488f;
    }

    @NonNull
    /* JADX INFO: renamed from: v */
    public List<InterfaceC0214b> m96119v() {
        return this.f96484b;
    }

    /* JADX INFO: renamed from: w */
    public int m96120w() {
        return this.f96489g;
    }

    @NonNull
    /* JADX INFO: renamed from: x */
    public InterfaceC4528e m96121x() {
        return this.f96487e;
    }
}
