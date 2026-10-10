package com.facebook.imagepipeline.producers;

import android.annotation.SuppressLint;
import p747x3.C45999a;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.c */
/* JADX INFO: compiled from: BaseConsumer.java */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC5682c<T> implements InterfaceC5712m<T> {

    /* JADX INFO: renamed from: a */
    public boolean f9295a = false;

    /* JADX INFO: renamed from: d */
    public static boolean m9645d(int i11) {
        return (i11 & 1) == 1;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m9648l(int i11, int i12) {
        return (i11 & i12) != 0;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m9649m(int i11, int i12) {
        return (i11 & i12) == i12;
    }

    /* JADX INFO: renamed from: n */
    public static int m9650n(int i11, int i12) {
        return i11 & (~i12);
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5712m
    /* JADX INFO: renamed from: a */
    public synchronized void mo9651a() {
        if (this.f9295a) {
            return;
        }
        this.f9295a = true;
        try {
            mo9549f();
        } catch (Exception e11) {
            m9654j(e11);
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5712m
    /* JADX INFO: renamed from: b */
    public synchronized void mo9652b(T t11, int i11) {
        if (this.f9295a) {
            return;
        }
        this.f9295a = m9645d(i11);
        try {
            mo9551h(t11, i11);
        } catch (Exception e11) {
            m9654j(e11);
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5712m
    /* JADX INFO: renamed from: c */
    public synchronized void mo9653c(float f11) {
        if (this.f9295a) {
            return;
        }
        try {
            mo9552i(f11);
        } catch (Exception e11) {
            m9654j(e11);
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo9549f();

    /* JADX INFO: renamed from: g */
    public abstract void mo9550g(Throwable th2);

    /* JADX INFO: renamed from: h */
    public abstract void mo9551h(T t11, int i11);

    /* JADX INFO: renamed from: i */
    public abstract void mo9552i(float f11);

    @Override // com.facebook.imagepipeline.producers.InterfaceC5712m
    public synchronized void onFailure(Throwable th2) {
        if (this.f9295a) {
            return;
        }
        this.f9295a = true;
        try {
            mo9550g(th2);
        } catch (Exception e11) {
            m9654j(e11);
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m9646e(int i11) {
        return !m9645d(i11);
    }

    /* JADX INFO: renamed from: j */
    public void m9654j(Exception exc) {
        C45999a.m101492M(getClass(), "unhandled exception", exc);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: k */
    public static int m9647k(boolean z11) {
        return z11 ? 1 : 0;
    }
}
