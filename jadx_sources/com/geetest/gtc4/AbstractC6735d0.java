package com.geetest.gtc4;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.geetest.gtc4.d0 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6735d0 extends AbstractC6905w implements InterfaceC6785i5 {

    /* JADX INFO: renamed from: a */
    public final int f11333a;

    /* JADX INFO: renamed from: b */
    public final int f11334b;

    /* JADX INFO: renamed from: c */
    public final int f11335c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC6752f f11336d;

    public AbstractC6735d0(boolean z11, int i11, InterfaceC6752f interfaceC6752f) {
        this(z11 ? 1 : 2, 128, i11, interfaceC6752f);
    }

    /* JADX INFO: renamed from: c */
    public abstract AbstractC6931z mo12623c(AbstractC6905w abstractC6905w);

    public AbstractC6735d0(int i11, int i12, int i13, InterfaceC6752f interfaceC6752f) {
        if (interfaceC6752f == null) {
            throw new NullPointerException("'obj' cannot be null");
        }
        if (i12 == 0 || (i12 & 192) != i12) {
            throw new IllegalArgumentException("invalid tag class: " + i12);
        }
        this.f11333a = i11;
        this.f11334b = i12;
        this.f11335c = i13;
        this.f11336d = interfaceC6752f;
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final boolean mo12606a(AbstractC6905w abstractC6905w) {
        if (!(abstractC6905w instanceof AbstractC6735d0)) {
            return false;
        }
        AbstractC6735d0 abstractC6735d0 = (AbstractC6735d0) abstractC6905w;
        if (this.f11335c != abstractC6735d0.f11335c || this.f11334b != abstractC6735d0.f11334b) {
            return false;
        }
        if (this.f11333a != abstractC6735d0.f11333a && m12624i() != abstractC6735d0.m12624i()) {
            return false;
        }
        AbstractC6905w abstractC6905wMo12598d = this.f11336d.mo12598d();
        AbstractC6905w abstractC6905wMo12598d2 = abstractC6735d0.f11336d.mo12598d();
        if (abstractC6905wMo12598d == abstractC6905wMo12598d2) {
            return true;
        }
        if (m12624i()) {
            return abstractC6905wMo12598d.mo12606a(abstractC6905wMo12598d2);
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            mo12613a(new C6887u(byteArrayOutputStream), true);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            abstractC6735d0.mo12613a(new C6887u(byteArrayOutputStream2), true);
            return Arrays.equals(byteArray, byteArrayOutputStream2.toByteArray());
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: g */
    public AbstractC6905w mo12600g() {
        return new C6845p2(this.f11333a, this.f11334b, this.f11335c, this.f11336d);
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: h */
    public AbstractC6905w mo12601h() {
        return new C6738d3(this.f11333a, this.f11334b, this.f11335c, this.f11336d);
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    public final int hashCode() {
        return (((this.f11334b * 7919) ^ this.f11335c) ^ (m12624i() ? 15 : 240)) ^ this.f11336d.mo12598d().hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m12624i() {
        int i11 = this.f11333a;
        return i11 == 1 || i11 == 3;
    }

    public final String toString() {
        return AbstractC6762g0.m12635a(this.f11334b, this.f11335c) + this.f11336d;
    }

    @Override // com.geetest.gtc4.InterfaceC6785i5
    /* JADX INFO: renamed from: b */
    public final AbstractC6905w mo12597b() {
        return this;
    }
}
