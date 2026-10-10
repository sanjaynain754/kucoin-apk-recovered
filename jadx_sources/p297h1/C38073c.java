package p297h1;

import androidx.annotation.RestrictTo;
import java.util.List;
import p355j1.C40208k;

/* JADX INFO: renamed from: h1.c */
/* JADX INFO: compiled from: FontCharacter.java */
/* JADX INFO: loaded from: classes34.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class C38073c {

    /* JADX INFO: renamed from: a */
    public final List<C40208k> f85708a;

    /* JADX INFO: renamed from: b */
    public final char f85709b;

    /* JADX INFO: renamed from: c */
    public final double f85710c;

    /* JADX INFO: renamed from: d */
    public final double f85711d;

    /* JADX INFO: renamed from: e */
    public final String f85712e;

    /* JADX INFO: renamed from: f */
    public final String f85713f;

    /* JADX INFO: renamed from: c */
    public static int m85962c(char c11, String str, String str2) {
        return (((c11 * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    /* JADX INFO: renamed from: a */
    public List<C40208k> m85963a() {
        return this.f85708a;
    }

    /* JADX INFO: renamed from: b */
    public double m85964b() {
        return this.f85711d;
    }

    public int hashCode() {
        return m85962c(this.f85709b, this.f85713f, this.f85712e);
    }

    public C38073c(List<C40208k> list, char c11, double d11, double d12, String str, String str2) {
        this.f85708a = list;
        this.f85709b = c11;
        this.f85710c = d11;
        this.f85711d = d12;
        this.f85712e = str;
        this.f85713f = str2;
    }
}
