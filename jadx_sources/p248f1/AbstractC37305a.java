package p248f1;

import android.annotation.SuppressLint;
import android.view.animation.Interpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.C5072d;
import java.util.ArrayList;
import java.util.List;
import p522p1.C43348a;
import p522p1.C43350c;

/* JADX INFO: renamed from: f1.a */
/* JADX INFO: compiled from: BaseKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC37305a<K, A> {

    /* JADX INFO: renamed from: c */
    public final d<K> f82767c;

    /* JADX INFO: renamed from: e */
    @Nullable
    public C43350c<A> f82769e;

    /* JADX INFO: renamed from: a */
    public final List<b> f82765a = new ArrayList(1);

    /* JADX INFO: renamed from: b */
    public boolean f82766b = false;

    /* JADX INFO: renamed from: d */
    public float f82768d = 0.0f;

    /* JADX INFO: renamed from: f */
    @Nullable
    public A f82770f = null;

    /* JADX INFO: renamed from: g */
    public float f82771g = -1.0f;

    /* JADX INFO: renamed from: h */
    public float f82772h = -1.0f;

    /* JADX INFO: renamed from: f1.a$b */
    /* JADX INFO: compiled from: BaseKeyframeAnimation.java */
    public interface b {
        /* JADX INFO: renamed from: e */
        void mo5788e();
    }

    /* JADX INFO: renamed from: f1.a$c */
    /* JADX INFO: compiled from: BaseKeyframeAnimation.java */
    /* JADX INFO: loaded from: classes34.dex */
    public static final class c<T> implements d<T> {
        public c() {
        }

        @Override // p248f1.AbstractC37305a.d
        /* JADX INFO: renamed from: b */
        public float mo83840b() {
            return 0.0f;
        }

        @Override // p248f1.AbstractC37305a.d
        /* JADX INFO: renamed from: d */
        public boolean mo83842d(float f11) {
            return false;
        }

        @Override // p248f1.AbstractC37305a.d
        public boolean isEmpty() {
            return true;
        }

        @Override // p248f1.AbstractC37305a.d
        /* JADX INFO: renamed from: a */
        public C43348a<T> mo83839a() {
            throw new IllegalStateException("not implemented");
        }

        @Override // p248f1.AbstractC37305a.d
        /* JADX INFO: renamed from: c */
        public boolean mo83841c(float f11) {
            throw new IllegalStateException("not implemented");
        }

        @Override // p248f1.AbstractC37305a.d
        /* JADX INFO: renamed from: e */
        public float mo83843e() {
            return 1.0f;
        }
    }

    /* JADX INFO: renamed from: f1.a$d */
    /* JADX INFO: compiled from: BaseKeyframeAnimation.java */
    public interface d<T> {
        /* JADX INFO: renamed from: a */
        C43348a<T> mo83839a();

        @FloatRange(from = 0.0d, m1552to = 1.0d)
        /* JADX INFO: renamed from: b */
        float mo83840b();

        /* JADX INFO: renamed from: c */
        boolean mo83841c(float f11);

        /* JADX INFO: renamed from: d */
        boolean mo83842d(float f11);

        @FloatRange(from = 0.0d, m1552to = 1.0d)
        /* JADX INFO: renamed from: e */
        float mo83843e();

        boolean isEmpty();
    }

    /* JADX INFO: renamed from: f1.a$e */
    /* JADX INFO: compiled from: BaseKeyframeAnimation.java */
    public static final class e<T> implements d<T> {

        /* JADX INFO: renamed from: a */
        public final List<? extends C43348a<T>> f82773a;

        /* JADX INFO: renamed from: c */
        public C43348a<T> f82775c = null;

        /* JADX INFO: renamed from: d */
        public float f82776d = -1.0f;

        /* JADX INFO: renamed from: b */
        @NonNull
        public C43348a<T> f82774b = m83844f(0.0f);

        @Override // p248f1.AbstractC37305a.d
        public boolean isEmpty() {
            return false;
        }

        @Override // p248f1.AbstractC37305a.d
        @NonNull
        /* JADX INFO: renamed from: a */
        public C43348a<T> mo83839a() {
            return this.f82774b;
        }

        @Override // p248f1.AbstractC37305a.d
        /* JADX INFO: renamed from: b */
        public float mo83840b() {
            return this.f82773a.get(0).m95455f();
        }

        @Override // p248f1.AbstractC37305a.d
        /* JADX INFO: renamed from: c */
        public boolean mo83841c(float f11) {
            C43348a<T> c43348a = this.f82775c;
            C43348a<T> c43348a2 = this.f82774b;
            if (c43348a == c43348a2 && this.f82776d == f11) {
                return true;
            }
            this.f82775c = c43348a2;
            this.f82776d = f11;
            return false;
        }

        @Override // p248f1.AbstractC37305a.d
        /* JADX INFO: renamed from: d */
        public boolean mo83842d(float f11) {
            if (this.f82774b.m95450a(f11)) {
                return !this.f82774b.m95458i();
            }
            this.f82774b = m83844f(f11);
            return true;
        }

        @Override // p248f1.AbstractC37305a.d
        /* JADX INFO: renamed from: e */
        public float mo83843e() {
            List<? extends C43348a<T>> list = this.f82773a;
            return list.get(list.size() - 1).m95452c();
        }

        /* JADX INFO: renamed from: f */
        public final C43348a<T> m83844f(float f11) {
            List<? extends C43348a<T>> list = this.f82773a;
            C43348a<T> c43348a = list.get(list.size() - 1);
            if (f11 >= c43348a.m95455f()) {
                return c43348a;
            }
            for (int size = this.f82773a.size() - 2; size >= 1; size--) {
                C43348a<T> c43348a2 = this.f82773a.get(size);
                if (this.f82774b != c43348a2 && c43348a2.m95450a(f11)) {
                    return c43348a2;
                }
            }
            return this.f82773a.get(0);
        }

        public e(List<? extends C43348a<T>> list) {
            this.f82773a = list;
        }
    }

    /* JADX INFO: renamed from: f1.a$f */
    /* JADX INFO: compiled from: BaseKeyframeAnimation.java */
    public static final class f<T> implements d<T> {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final C43348a<T> f82777a;

        /* JADX INFO: renamed from: b */
        public float f82778b = -1.0f;

        @Override // p248f1.AbstractC37305a.d
        public boolean isEmpty() {
            return false;
        }

        @Override // p248f1.AbstractC37305a.d
        /* JADX INFO: renamed from: a */
        public C43348a<T> mo83839a() {
            return this.f82777a;
        }

        @Override // p248f1.AbstractC37305a.d
        /* JADX INFO: renamed from: b */
        public float mo83840b() {
            return this.f82777a.m95455f();
        }

        @Override // p248f1.AbstractC37305a.d
        /* JADX INFO: renamed from: c */
        public boolean mo83841c(float f11) {
            if (this.f82778b == f11) {
                return true;
            }
            this.f82778b = f11;
            return false;
        }

        @Override // p248f1.AbstractC37305a.d
        /* JADX INFO: renamed from: d */
        public boolean mo83842d(float f11) {
            return !this.f82777a.m95458i();
        }

        @Override // p248f1.AbstractC37305a.d
        /* JADX INFO: renamed from: e */
        public float mo83843e() {
            return this.f82777a.m95452c();
        }

        public f(List<? extends C43348a<T>> list) {
            this.f82777a = list.get(0);
        }
    }

    /* JADX INFO: renamed from: i */
    public abstract A mo83832i(C43348a<K> c43348a, float f11);

    /* JADX INFO: renamed from: m */
    public void m83836m() {
        this.f82766b = true;
    }

    /* JADX INFO: renamed from: a */
    public void m83824a(b bVar) {
        this.f82765a.add(bVar);
    }

    @FloatRange(from = 0.0d, m1552to = 1.0d)
    @SuppressLint({"Range"})
    /* JADX INFO: renamed from: c */
    public float mo83826c() {
        if (this.f82772h == -1.0f) {
            this.f82772h = this.f82767c.mo83843e();
        }
        return this.f82772h;
    }

    /* JADX INFO: renamed from: e */
    public float m83828e() {
        if (this.f82766b) {
            return 0.0f;
        }
        C43348a<K> c43348aM83825b = m83825b();
        if (c43348aM83825b.m95458i()) {
            return 0.0f;
        }
        return (this.f82768d - c43348aM83825b.m95455f()) / (c43348aM83825b.m95452c() - c43348aM83825b.m95455f());
    }

    /* JADX INFO: renamed from: f */
    public float m83829f() {
        return this.f82768d;
    }

    @FloatRange(from = 0.0d, m1552to = 1.0d)
    @SuppressLint({"Range"})
    /* JADX INFO: renamed from: g */
    public final float m83830g() {
        if (this.f82771g == -1.0f) {
            this.f82771g = this.f82767c.mo83840b();
        }
        return this.f82771g;
    }

    /* JADX INFO: renamed from: j */
    public A mo83833j(C43348a<K> c43348a, float f11, float f12, float f13) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    /* JADX INFO: renamed from: k */
    public boolean m83834k() {
        return this.f82769e != null;
    }

    /* JADX INFO: renamed from: o */
    public void m83838o(@Nullable C43350c<A> c43350c) {
        C43350c<A> c43350c2 = this.f82769e;
        if (c43350c2 != null) {
            c43350c2.m95468c(null);
        }
        this.f82769e = c43350c;
        if (c43350c != null) {
            c43350c.m95468c(this);
        }
    }

    public AbstractC37305a(List<? extends C43348a<K>> list) {
        this.f82767c = m83823p(list);
    }

    /* JADX INFO: renamed from: p */
    public static <T> d<T> m83823p(List<? extends C43348a<T>> list) {
        if (list.isEmpty()) {
            return new c();
        }
        if (list.size() == 1) {
            return new f(list);
        }
        return new e(list);
    }

    /* JADX INFO: renamed from: b */
    public C43348a<K> m83825b() {
        if (C5072d.m5647g()) {
            C5072d.m5642b("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        C43348a<K> c43348aMo83839a = this.f82767c.mo83839a();
        if (C5072d.m5647g()) {
            C5072d.m5643c("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        return c43348aMo83839a;
    }

    /* JADX INFO: renamed from: d */
    public float m83827d() {
        Interpolator interpolator;
        C43348a<K> c43348aM83825b = m83825b();
        if (c43348aM83825b != null && !c43348aM83825b.m95458i() && (interpolator = c43348aM83825b.f95711d) != null) {
            return interpolator.getInterpolation(m83828e());
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: h */
    public A mo83831h() {
        A aMo83832i;
        float fM83828e = m83828e();
        if (this.f82769e == null && this.f82767c.mo83841c(fM83828e)) {
            return this.f82770f;
        }
        C43348a<K> c43348aM83825b = m83825b();
        Interpolator interpolator = c43348aM83825b.f95712e;
        if (interpolator != null && c43348aM83825b.f95713f != null) {
            aMo83832i = mo83833j(c43348aM83825b, fM83828e, interpolator.getInterpolation(fM83828e), c43348aM83825b.f95713f.getInterpolation(fM83828e));
        } else {
            aMo83832i = mo83832i(c43348aM83825b, m83827d());
        }
        this.f82770f = aMo83832i;
        return aMo83832i;
    }

    /* JADX INFO: renamed from: l */
    public void mo83835l() {
        if (C5072d.m5647g()) {
            C5072d.m5642b("BaseKeyframeAnimation#notifyListeners");
        }
        for (int i11 = 0; i11 < this.f82765a.size(); i11++) {
            this.f82765a.get(i11).mo5788e();
        }
        if (C5072d.m5647g()) {
            C5072d.m5643c("BaseKeyframeAnimation#notifyListeners");
        }
    }

    /* JADX INFO: renamed from: n */
    public void mo83837n(@FloatRange(from = 0.0d, m1552to = 1.0d) float f11) {
        if (C5072d.m5647g()) {
            C5072d.m5642b("BaseKeyframeAnimation#setProgress");
        }
        if (this.f82767c.isEmpty()) {
            if (C5072d.m5647g()) {
                C5072d.m5643c("BaseKeyframeAnimation#setProgress");
                return;
            }
            return;
        }
        if (f11 < m83830g()) {
            f11 = m83830g();
        } else if (f11 > mo83826c()) {
            f11 = mo83826c();
        }
        if (f11 == this.f82768d) {
            if (C5072d.m5647g()) {
                C5072d.m5643c("BaseKeyframeAnimation#setProgress");
            }
        } else {
            this.f82768d = f11;
            if (this.f82767c.mo83842d(f11)) {
                mo83835l();
            }
            if (C5072d.m5647g()) {
                C5072d.m5643c("BaseKeyframeAnimation#setProgress");
            }
        }
    }
}
