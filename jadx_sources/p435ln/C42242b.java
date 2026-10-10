package p435ln;

import android.text.Spannable;
import io.reactivex.functions.Consumer;

/* JADX INFO: renamed from: ln.b */
/* JADX INFO: compiled from: CheckCell.java */
/* JADX INFO: loaded from: classes21.dex */
public class C42242b {

    /* JADX INFO: renamed from: a */
    public Spannable f93697a;

    /* JADX INFO: renamed from: b */
    public boolean f93698b;

    /* JADX INFO: renamed from: c */
    public Consumer<Boolean> f93699c;

    /* JADX INFO: renamed from: a */
    public Consumer<Boolean> m92681a() {
        return this.f93699c;
    }

    /* JADX INFO: renamed from: b */
    public Spannable m92682b() {
        return this.f93697a;
    }

    /* JADX INFO: renamed from: c */
    public boolean m92683c() {
        return this.f93698b;
    }

    /* JADX INFO: renamed from: d */
    public C42242b m92684d(Consumer<Boolean> consumer) {
        this.f93699c = consumer;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public C42242b m92685e(boolean z11) {
        this.f93698b = z11;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public C42242b m92686f(Spannable spannable) {
        this.f93697a = spannable;
        return this;
    }
}
