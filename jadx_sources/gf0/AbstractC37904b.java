package gf0;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: gf0.b */
/* JADX INFO: compiled from: CssInlineStyleParser.java */
/* JADX INFO: loaded from: classes60.dex */
public abstract class AbstractC37904b {

    /* JADX INFO: renamed from: gf0.b$b */
    /* JADX INFO: compiled from: CssInlineStyleParser.java */
    public static class b extends AbstractC37904b {

        /* JADX INFO: renamed from: gf0.b$b$a */
        /* JADX INFO: compiled from: CssInlineStyleParser.java */
        public static class a implements Iterable<C37905c> {

            /* JADX INFO: renamed from: b */
            public final String f85282b;

            /* JADX INFO: renamed from: gf0.b$b$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: CssInlineStyleParser.java */
            public class C47008a implements Iterator<C37905c> {

                /* JADX INFO: renamed from: b */
                public final C37905c f85283b;

                /* JADX INFO: renamed from: c */
                public final StringBuilder f85284c;

                /* JADX INFO: renamed from: d */
                public final int f85285d;

                /* JADX INFO: renamed from: e */
                public int f85286e;

                public C47008a() {
                    this.f85283b = new C37905c();
                    this.f85284c = new StringBuilder();
                    this.f85285d = a.this.f85282b.length();
                }

                /* JADX INFO: renamed from: a */
                public final boolean m85682a() {
                    return m85683b(this.f85283b.m85686a(), this.f85283b.m85688c());
                }

                /* JADX INFO: renamed from: d */
                public final void m85685d() {
                    this.f85283b.m85687b("", "");
                    this.f85284c.setLength(0);
                    String strTrim = null;
                    boolean z11 = false;
                    String strTrim2 = null;
                    for (int i11 = this.f85286e; i11 < this.f85285d; i11++) {
                        char cCharAt = a.this.f85282b.charAt(i11);
                        if (strTrim == null) {
                            if (':' == cCharAt) {
                                if (this.f85284c.length() > 0) {
                                    strTrim = this.f85284c.toString().trim();
                                }
                                this.f85284c.setLength(0);
                            } else if (';' == cCharAt) {
                                this.f85284c.setLength(0);
                            } else if (Character.isWhitespace(cCharAt)) {
                                if (this.f85284c.length() > 0) {
                                    z11 = true;
                                }
                            } else if (z11) {
                                this.f85284c.setLength(0);
                                this.f85284c.append(cCharAt);
                                z11 = false;
                            } else {
                                this.f85284c.append(cCharAt);
                            }
                        } else if (strTrim2 != null) {
                            continue;
                        } else if (Character.isWhitespace(cCharAt)) {
                            if (this.f85284c.length() > 0) {
                                this.f85284c.append(cCharAt);
                            }
                        } else if (';' == cCharAt) {
                            strTrim2 = this.f85284c.toString().trim();
                            this.f85284c.setLength(0);
                            if (m85683b(strTrim, strTrim2)) {
                                this.f85286e = i11 + 1;
                                this.f85283b.m85687b(strTrim, strTrim2);
                                return;
                            }
                        } else {
                            this.f85284c.append(cCharAt);
                        }
                    }
                    if (strTrim == null || this.f85284c.length() <= 0) {
                        return;
                    }
                    this.f85283b.m85687b(strTrim, this.f85284c.toString().trim());
                    this.f85286e = this.f85285d;
                }

                /* JADX INFO: renamed from: b */
                public final boolean m85683b(@Nullable String str, @Nullable String str2) {
                    if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                        return true;
                    }
                    return false;
                }

                @Override // java.util.Iterator
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public C37905c next() {
                    if (m85682a()) {
                        return this.f85283b;
                    }
                    throw new NoSuchElementException();
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    m85685d();
                    return m85682a();
                }
            }

            @Override // java.lang.Iterable
            @NonNull
            public Iterator<C37905c> iterator() {
                return new C47008a();
            }

            public a(@NonNull String str) {
                this.f85282b = str;
            }
        }

        @Override // gf0.AbstractC37904b
        @NonNull
        /* JADX INFO: renamed from: b */
        public Iterable<C37905c> mo85680b(@NonNull String str) {
            return new a(str);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public abstract Iterable<C37905c> mo85680b(@NonNull String str);

    @NonNull
    /* JADX INFO: renamed from: a */
    public static AbstractC37904b m85679a() {
        return new b();
    }
}
