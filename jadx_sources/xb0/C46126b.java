package xb0;

import android.annotation.TargetApi;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.tbruyelle.rxpermissions2.RxPermissionsFragment;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: xb0.b */
/* JADX INFO: compiled from: RxPermissions.java */
/* JADX INFO: loaded from: classes23.dex */
public class C46126b {

    /* JADX INFO: renamed from: b */
    public static final String f103593b = "b";

    /* JADX INFO: renamed from: c */
    public static final Object f103594c = new Object();

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public d<RxPermissionsFragment> f103595a;

    /* JADX INFO: renamed from: xb0.b$a */
    /* JADX INFO: compiled from: RxPermissions.java */
    public class a implements d<RxPermissionsFragment> {

        /* JADX INFO: renamed from: a */
        public RxPermissionsFragment f103596a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ FragmentManager f103597b;

        @Override // xb0.C46126b.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public synchronized RxPermissionsFragment get() {
            try {
                if (this.f103596a == null) {
                    this.f103596a = C46126b.this.m101648g(this.f103597b);
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return this.f103596a;
        }

        public a(FragmentManager fragmentManager) {
            this.f103597b = fragmentManager;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: xb0.b$b */
    /* JADX INFO: compiled from: RxPermissions.java */
    public class b<T> implements ObservableTransformer<T, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String[] f103599a;

        /* JADX INFO: renamed from: xb0.b$b$a */
        /* JADX INFO: compiled from: RxPermissions.java */
        public class a implements Function<List<C46125a>, ObservableSource<Boolean>> {
            public a() {
            }

            @Override // io.reactivex.functions.Function
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public ObservableSource<Boolean> apply(List<C46125a> list) {
                if (list.isEmpty()) {
                    return Observable.empty();
                }
                Iterator<C46125a> it = list.iterator();
                while (it.hasNext()) {
                    if (!it.next().f103591b) {
                        return Observable.just(Boolean.FALSE);
                    }
                }
                return Observable.just(Boolean.TRUE);
            }
        }

        public b(String[] strArr) {
            this.f103599a = strArr;
        }

        @Override // io.reactivex.ObservableTransformer
        public ObservableSource<Boolean> apply(Observable<T> observable) {
            return C46126b.this.m101654m(observable, this.f103599a).buffer(this.f103599a.length).flatMap(new a());
        }
    }

    /* JADX INFO: renamed from: xb0.b$c */
    /* JADX INFO: compiled from: RxPermissions.java */
    public class c implements Function<Object, Observable<C46125a>> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String[] f103602b;

        public c(String[] strArr) {
            this.f103602b = strArr;
        }

        @Override // io.reactivex.functions.Function
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Observable<C46125a> apply(Object obj) {
            return C46126b.this.m101656o(this.f103602b);
        }
    }

    /* JADX INFO: renamed from: xb0.b$d */
    /* JADX INFO: compiled from: RxPermissions.java */
    @FunctionalInterface
    public interface d<V> {
        V get();
    }

    public C46126b(@NonNull FragmentActivity fragmentActivity) {
        this.f103595a = m101647f(fragmentActivity.getSupportFragmentManager());
    }

    /* JADX INFO: renamed from: i */
    public boolean m101650i() {
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final Observable<?> m101653l(String... strArr) {
        for (String str : strArr) {
            if (!this.f103595a.get().m72133d3(str)) {
                return Observable.empty();
            }
        }
        return Observable.just(f103594c);
    }

    /* JADX INFO: renamed from: d */
    public <T> ObservableTransformer<T, Boolean> m101645d(String... strArr) {
        return new b(strArr);
    }

    /* JADX INFO: renamed from: e */
    public final RxPermissionsFragment m101646e(@NonNull FragmentManager fragmentManager) {
        return (RxPermissionsFragment) fragmentManager.findFragmentByTag(f103593b);
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public final d<RxPermissionsFragment> m101647f(@NonNull FragmentManager fragmentManager) {
        return new a(fragmentManager);
    }

    /* JADX INFO: renamed from: k */
    public final Observable<?> m101652k(Observable<?> observable, Observable<?> observable2) {
        return observable == null ? Observable.just(f103594c) : Observable.merge(observable, observable2);
    }

    /* JADX INFO: renamed from: m */
    public final Observable<C46125a> m101654m(Observable<?> observable, String... strArr) {
        if (strArr == null || strArr.length == 0) {
            throw new IllegalArgumentException("RxPermissions.request/requestEach requires at least one input permission");
        }
        return m101652k(observable, m101653l(strArr)).flatMap(new c(strArr));
    }

    /* JADX INFO: renamed from: n */
    public Observable<Boolean> m101655n(String... strArr) {
        return Observable.just(f103594c).compose(m101645d(strArr));
    }

    @TargetApi(23)
    /* JADX INFO: renamed from: o */
    public final Observable<C46125a> m101656o(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        ArrayList arrayList2 = new ArrayList();
        for (String str : strArr) {
            this.f103595a.get().m72137h3("Requesting permission " + str);
            if (m101649h(str)) {
                arrayList.add(Observable.just(new C46125a(str, true, false)));
            } else if (m101651j(str)) {
                arrayList.add(Observable.just(new C46125a(str, false, false)));
            } else {
                PublishSubject<C46125a> publishSubjectM72134e3 = this.f103595a.get().m72134e3(str);
                if (publishSubjectM72134e3 == null) {
                    arrayList2.add(str);
                    publishSubjectM72134e3 = PublishSubject.create();
                    this.f103595a.get().m72140k3(str, publishSubjectM72134e3);
                }
                arrayList.add(publishSubjectM72134e3);
            }
        }
        if (!arrayList2.isEmpty()) {
            m101657p((String[]) arrayList2.toArray(new String[arrayList2.size()]));
        }
        return Observable.concat(Observable.fromIterable(arrayList));
    }

    @TargetApi(23)
    /* JADX INFO: renamed from: p */
    public void m101657p(String[] strArr) {
        this.f103595a.get().m72137h3("requestPermissionsFromFragment " + TextUtils.join(", ", strArr));
        this.f103595a.get().m72139j3(strArr);
    }

    public C46126b(@NonNull Fragment fragment) {
        this.f103595a = m101647f(fragment.getChildFragmentManager());
    }

    /* JADX INFO: renamed from: g */
    public final RxPermissionsFragment m101648g(@NonNull FragmentManager fragmentManager) {
        RxPermissionsFragment rxPermissionsFragmentM101646e = m101646e(fragmentManager);
        if (rxPermissionsFragmentM101646e == null) {
            RxPermissionsFragment rxPermissionsFragment = new RxPermissionsFragment();
            fragmentManager.beginTransaction().add(rxPermissionsFragment, f103593b).commitNow();
            return rxPermissionsFragment;
        }
        return rxPermissionsFragmentM101646e;
    }

    /* JADX INFO: renamed from: h */
    public boolean m101649h(String str) {
        if (m101650i() && !this.f103595a.get().m72135f3(str)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: j */
    public boolean m101651j(String str) {
        if (m101650i() && this.f103595a.get().m72136g3(str)) {
            return true;
        }
        return false;
    }
}
