package lf0;

import androidx.annotation.Nullable;

/* JADX INFO: renamed from: lf0.d */
/* JADX INFO: compiled from: ImageSize.java */
/* JADX INFO: loaded from: classes60.dex */
public class C42185d {

    /* JADX INFO: renamed from: a */
    public final a f93654a;

    /* JADX INFO: renamed from: b */
    public final a f93655b;

    /* JADX INFO: renamed from: lf0.d$a */
    /* JADX INFO: compiled from: ImageSize.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final float f93656a;

        /* JADX INFO: renamed from: b */
        public final String f93657b;

        public String toString() {
            return "Dimension{value=" + this.f93656a + ", unit='" + this.f93657b + "'}";
        }

        public a(float f11, @Nullable String str) {
            this.f93656a = f11;
            this.f93657b = str;
        }
    }

    public String toString() {
        return "ImageSize{width=" + this.f93654a + ", height=" + this.f93655b + '}';
    }

    public C42185d(@Nullable a aVar, @Nullable a aVar2) {
        this.f93654a = aVar;
        this.f93655b = aVar2;
    }
}
