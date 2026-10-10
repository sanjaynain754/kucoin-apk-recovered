package gf0;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: gf0.c */
/* JADX INFO: compiled from: CssProperty.java */
/* JADX INFO: loaded from: classes60.dex */
public class C37905c {

    /* JADX INFO: renamed from: a */
    public String f85288a;

    /* JADX INFO: renamed from: b */
    public String f85289b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public String m85686a() {
        return this.f85288a;
    }

    /* JADX INFO: renamed from: b */
    public void m85687b(@NonNull String str, @NonNull String str2) {
        this.f85288a = str;
        this.f85289b = str2;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public String m85688c() {
        return this.f85289b;
    }

    public String toString() {
        return "CssProperty{key='" + this.f85288a + "', value='" + this.f85289b + "'}";
    }
}
