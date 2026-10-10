package fh0;

import kh0.AbstractC41046f;
import kh0.InterfaceC41044d;

/* JADX INFO: renamed from: fh0.d */
/* JADX INFO: compiled from: BlockStartImpl.java */
/* JADX INFO: loaded from: classes61.dex */
public class C37483d extends AbstractC41046f {

    /* JADX INFO: renamed from: a */
    public final InterfaceC41044d[] f83100a;

    /* JADX INFO: renamed from: b */
    public int f83101b = -1;

    /* JADX INFO: renamed from: c */
    public int f83102c = -1;

    /* JADX INFO: renamed from: d */
    public boolean f83103d = false;

    @Override // kh0.AbstractC41046f
    /* JADX INFO: renamed from: e */
    public AbstractC41046f mo84318e() {
        this.f83103d = true;
        return this;
    }

    @Override // kh0.AbstractC41046f
    /* JADX INFO: renamed from: a */
    public AbstractC41046f mo84316a(int i11) {
        this.f83102c = i11;
        return this;
    }

    @Override // kh0.AbstractC41046f
    /* JADX INFO: renamed from: b */
    public AbstractC41046f mo84317b(int i11) {
        this.f83101b = i11;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC41044d[] m84319f() {
        return this.f83100a;
    }

    /* JADX INFO: renamed from: g */
    public int m84320g() {
        return this.f83102c;
    }

    /* JADX INFO: renamed from: h */
    public int m84321h() {
        return this.f83101b;
    }

    /* JADX INFO: renamed from: i */
    public boolean m84322i() {
        return this.f83103d;
    }

    public C37483d(InterfaceC41044d... interfaceC41044dArr) {
        this.f83100a = interfaceC41044dArr;
    }
}
