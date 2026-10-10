package com.otaliastudios.transcoder.internal.transcode;

import android.os.Handler;
import androidx.annotation.NonNull;
import q90.C43674e;
import q90.InterfaceC43673d;

/* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.transcode.a */
/* JADX INFO: compiled from: TranscodeDispatcher.java */
/* JADX INFO: loaded from: classes59.dex */
public class C27364a {

    /* JADX INFO: renamed from: a */
    public final Handler f55782a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC43673d f55783b;

    /* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.transcode.a$a */
    /* JADX INFO: compiled from: TranscodeDispatcher.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C27364a.this.f55783b.mo7553a();
        }
    }

    /* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.transcode.a$b */
    /* JADX INFO: compiled from: TranscodeDispatcher.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f55785b;

        public b(int i11) {
            this.f55785b = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            C27364a.this.f55783b.mo7554b(this.f55785b);
        }
    }

    /* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.transcode.a$c */
    /* JADX INFO: compiled from: TranscodeDispatcher.java */
    public class c implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Throwable f55787b;

        public c(Throwable th2) {
            this.f55787b = th2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C27364a.this.f55783b.mo7556d(this.f55787b);
        }
    }

    /* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.transcode.a$d */
    /* JADX INFO: compiled from: TranscodeDispatcher.java */
    public class d implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ double f55789b;

        public d(double d11) {
            this.f55789b = d11;
        }

        @Override // java.lang.Runnable
        public void run() {
            C27364a.this.f55783b.mo7555c(this.f55789b);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m68069b() {
        this.f55782a.post(new a());
    }

    /* JADX INFO: renamed from: c */
    public void m68070c(@NonNull Throwable th2) {
        this.f55782a.post(new c(th2));
    }

    /* JADX INFO: renamed from: d */
    public void m68071d(double d11) {
        this.f55782a.post(new d(d11));
    }

    /* JADX INFO: renamed from: e */
    public void m68072e(int i11) {
        this.f55782a.post(new b(i11));
    }

    public C27364a(@NonNull C43674e c43674e) {
        this.f55782a = c43674e.m96116s();
        this.f55783b = c43674e.m96115r();
    }
}
