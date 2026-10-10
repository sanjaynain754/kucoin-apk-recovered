package com.bumptech.glide.integration.okhttp3;

import androidx.annotation.NonNull;
import java.io.InputStream;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import p613s1.C44266a;
import p628t1.C44613e;
import p817z1.C46628g;
import p817z1.C46639r;
import p817z1.InterfaceC46635n;
import p817z1.InterfaceC46636o;

/* JADX INFO: renamed from: com.bumptech.glide.integration.okhttp3.b */
/* JADX INFO: compiled from: OkHttpUrlLoader.java */
/* JADX INFO: loaded from: classes.dex */
public class C5317b implements InterfaceC46635n<C46628g, InputStream> {

    /* JADX INFO: renamed from: a */
    public final Call.Factory f6729a;

    /* JADX INFO: renamed from: com.bumptech.glide.integration.okhttp3.b$a */
    /* JADX INFO: compiled from: OkHttpUrlLoader.java */
    public static class a implements InterfaceC46636o<C46628g, InputStream> {

        /* JADX INFO: renamed from: b */
        public static volatile Call.Factory f6730b;

        /* JADX INFO: renamed from: a */
        public final Call.Factory f6731a;

        public a() {
            this(m6649b());
        }

        public a(@NonNull Call.Factory factory) {
            this.f6731a = factory;
        }

        /* JADX INFO: renamed from: b */
        public static Call.Factory m6649b() {
            if (f6730b == null) {
                synchronized (a.class) {
                    try {
                        if (f6730b == null) {
                            f6730b = new OkHttpClient();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return f6730b;
        }

        @Override // p817z1.InterfaceC46636o
        @NonNull
        /* JADX INFO: renamed from: a */
        public InterfaceC46635n<C46628g, InputStream> mo14a(C46639r c46639r) {
            return new C5317b(this.f6731a);
        }

        @Override // p817z1.InterfaceC46636o
        /* JADX INFO: renamed from: c */
        public void mo15c() {
        }
    }

    @Override // p817z1.InterfaceC46635n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo11b(@NonNull C46628g c46628g) {
        return true;
    }

    @Override // p817z1.InterfaceC46635n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC46635n.a<InputStream> mo10a(@NonNull C46628g c46628g, int i11, int i12, @NonNull C44613e c44613e) {
        return new InterfaceC46635n.a<>(c46628g, new C44266a(this.f6729a, c46628g));
    }

    public C5317b(@NonNull Call.Factory factory) {
        this.f6729a = factory;
    }
}
