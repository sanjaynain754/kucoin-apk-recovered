package com.journeyapps.barcodescanner.camera;

/* JADX INFO: loaded from: classes56.dex */
public class CameraSettings {

    /* JADX INFO: renamed from: a */
    public int f13353a = -1;

    /* JADX INFO: renamed from: b */
    public boolean f13354b = false;

    /* JADX INFO: renamed from: c */
    public boolean f13355c = false;

    /* JADX INFO: renamed from: d */
    public boolean f13356d = false;

    /* JADX INFO: renamed from: e */
    public boolean f13357e = true;

    /* JADX INFO: renamed from: f */
    public boolean f13358f = false;

    /* JADX INFO: renamed from: g */
    public boolean f13359g = false;

    /* JADX INFO: renamed from: h */
    public boolean f13360h = false;

    /* JADX INFO: renamed from: i */
    public FocusMode f13361i = FocusMode.AUTO;

    public enum FocusMode {
        AUTO,
        CONTINUOUS,
        INFINITY,
        MACRO
    }

    /* JADX INFO: renamed from: a */
    public FocusMode m14386a() {
        return this.f13361i;
    }

    /* JADX INFO: renamed from: b */
    public int m14387b() {
        return this.f13353a;
    }

    /* JADX INFO: renamed from: c */
    public boolean m14388c() {
        return this.f13357e;
    }

    /* JADX INFO: renamed from: d */
    public boolean m14389d() {
        return this.f13360h;
    }

    /* JADX INFO: renamed from: e */
    public boolean m14390e() {
        return this.f13355c;
    }

    /* JADX INFO: renamed from: f */
    public boolean m14391f() {
        return this.f13359g;
    }

    /* JADX INFO: renamed from: g */
    public boolean m14392g() {
        return this.f13356d;
    }

    /* JADX INFO: renamed from: h */
    public boolean m14393h() {
        return this.f13354b;
    }

    /* JADX INFO: renamed from: i */
    public void m14394i(int i11) {
        this.f13353a = i11;
    }
}
