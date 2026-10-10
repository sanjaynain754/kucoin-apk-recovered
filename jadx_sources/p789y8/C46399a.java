package p789y8;

import androidx.annotation.RestrictTo;
import io.reactivex.functions.Predicate;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: y8.a */
/* JADX INFO: compiled from: Functions.java */
/* JADX INFO: loaded from: classes56.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class C46399a {

    /* JADX INFO: renamed from: a */
    public static final a f104057a;

    /* JADX INFO: renamed from: b */
    public static final Callable<Boolean> f104058b;

    /* JADX INFO: renamed from: c */
    public static final Predicate<Object> f104059c;

    /* JADX INFO: renamed from: y8.a$a */
    /* JADX INFO: compiled from: Functions.java */
    public static final class a implements Callable<Boolean>, Predicate<Object> {

        /* JADX INFO: renamed from: b */
        public final Boolean f104060b;

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            return this.f104060b;
        }

        @Override // io.reactivex.functions.Predicate
        public boolean test(Object obj) {
            return this.f104060b.booleanValue();
        }

        public a(Boolean bool) {
            this.f104060b = bool;
        }
    }

    static {
        a aVar = new a(Boolean.TRUE);
        f104057a = aVar;
        f104058b = aVar;
        f104059c = aVar;
    }
}
