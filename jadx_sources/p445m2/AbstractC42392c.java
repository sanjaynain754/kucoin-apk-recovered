package p445m2;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p419l2.InterfaceC42029c;
import p523p2.C43364k;

/* JADX INFO: renamed from: m2.c */
/* JADX INFO: compiled from: CustomTarget.java */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC42392c<T> implements InterfaceC42399j<T> {

    /* JADX INFO: renamed from: b */
    public final int f93986b;

    /* JADX INFO: renamed from: c */
    public final int f93987c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public InterfaceC42029c f93988d;

    public AbstractC42392c() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public AbstractC42392c(int i11, int i12) {
        if (C43364k.m95528u(i11, i12)) {
            this.f93986b = i11;
            this.f93987c = i12;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i11 + " and height: " + i12);
    }

    @Override // p445m2.InterfaceC42399j
    /* JADX INFO: renamed from: a */
    public final void mo92228a(@NonNull InterfaceC42398i interfaceC42398i) {
        interfaceC42398i.mo6939e(this.f93986b, this.f93987c);
    }

    @Override // p445m2.InterfaceC42399j
    /* JADX INFO: renamed from: g */
    public final void mo92230g(@Nullable InterfaceC42029c interfaceC42029c) {
        this.f93988d = interfaceC42029c;
    }

    @Override // p445m2.InterfaceC42399j
    @Nullable
    public final InterfaceC42029c getRequest() {
        return this.f93988d;
    }

    @Override // p329i2.InterfaceC38421m
    public void onDestroy() {
    }

    @Override // p329i2.InterfaceC38421m
    public void onStart() {
    }

    @Override // p329i2.InterfaceC38421m
    public void onStop() {
    }

    @Override // p445m2.InterfaceC42399j
    /* JADX INFO: renamed from: f */
    public final void mo92229f(@NonNull InterfaceC42398i interfaceC42398i) {
    }

    @Override // p445m2.InterfaceC42399j
    /* JADX INFO: renamed from: h */
    public void mo92231h(@Nullable Drawable drawable) {
    }

    @Override // p445m2.InterfaceC42399j
    /* JADX INFO: renamed from: i */
    public void mo6640i(@Nullable Drawable drawable) {
    }
}
