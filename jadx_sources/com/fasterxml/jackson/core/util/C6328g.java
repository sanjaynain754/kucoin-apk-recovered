package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.AbstractC6302f;
import com.fasterxml.jackson.core.AbstractC6304g;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.InterfaceC6299c;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: renamed from: com.fasterxml.jackson.core.util.g */
/* JADX INFO: compiled from: JsonParserDelegate.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6328g extends JsonParser {

    /* JADX INFO: renamed from: e */
    public JsonParser f10161e;

    @Override // com.fasterxml.jackson.core.JsonParser
    @Deprecated
    /* JADX INFO: renamed from: A0 */
    public JsonParser mo10853A0(int i11) {
        this.f10161e.mo10853A0(i11);
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: B0 */
    public void mo10854B0(InterfaceC6299c interfaceC6299c) {
        this.f10161e.mo10854B0(interfaceC6299c);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: C */
    public BigDecimal mo10855C() throws IOException {
        return this.f10161e.mo10855C();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: E */
    public double mo10857E() throws IOException {
        return this.f10161e.mo10857E();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: J */
    public Object mo10858J() throws IOException {
        return this.f10161e.mo10858J();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: L */
    public float mo10859L() throws IOException {
        return this.f10161e.mo10859L();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: M */
    public int mo10860M() throws IOException {
        return this.f10161e.mo10860M();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: O */
    public long mo10861O() throws IOException {
        return this.f10161e.mo10861O();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: P */
    public JsonParser.NumberType mo10862P() throws IOException {
        return this.f10161e.mo10862P();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: Q */
    public Number mo10863Q() throws IOException {
        return this.f10161e.mo10863Q();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: R */
    public Number mo10864R() throws IOException {
        return this.f10161e.mo10864R();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: S */
    public Object mo10865S() throws IOException {
        return this.f10161e.mo10865S();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: T */
    public AbstractC6302f mo10866T() {
        return this.f10161e.mo10866T();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: U */
    public C6327f<StreamReadCapability> mo10867U() {
        return this.f10161e.mo10867U();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: V */
    public short mo10868V() throws IOException {
        return this.f10161e.mo10868V();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: W */
    public String mo10869W() throws IOException {
        return this.f10161e.mo10869W();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: X */
    public char[] mo10870X() throws IOException {
        return this.f10161e.mo10870X();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: Y */
    public int mo10871Y() throws IOException {
        return this.f10161e.mo10871Y();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: Z */
    public int mo10872Z() throws IOException {
        return this.f10161e.mo10872Z();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: a0 */
    public JsonLocation mo10874a0() {
        return this.f10161e.mo10874a0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: b0 */
    public Object mo10876b0() throws IOException {
        return this.f10161e.mo10876b0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: c0 */
    public int mo10877c0() throws IOException {
        return this.f10161e.mo10877c0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f10161e.close();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: d0 */
    public int mo10878d0(int i11) throws IOException {
        return this.f10161e.mo10878d0(i11);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: e0 */
    public long mo10879e0() throws IOException {
        return this.f10161e.mo10879e0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: f0 */
    public long mo10880f0(long j11) throws IOException {
        return this.f10161e.mo10880f0(j11);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: g */
    public boolean mo10881g() {
        return this.f10161e.mo10881g();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: g0 */
    public String mo10882g0() throws IOException {
        return this.f10161e.mo10882g0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: h */
    public boolean mo10883h() {
        return this.f10161e.mo10883h();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: h0 */
    public String mo10884h0(String str) throws IOException {
        return this.f10161e.mo10884h0(str);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: i */
    public void mo10885i() {
        this.f10161e.mo10885i();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: i0 */
    public boolean mo10886i0() {
        return this.f10161e.mo10886i0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: j */
    public String mo10887j() throws IOException {
        return this.f10161e.mo10887j();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: j0 */
    public boolean mo10888j0() {
        return this.f10161e.mo10888j0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: k */
    public JsonToken mo10889k() {
        return this.f10161e.mo10889k();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: k0 */
    public boolean mo10890k0(JsonToken jsonToken) {
        return this.f10161e.mo10890k0(jsonToken);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: l */
    public int mo10891l() {
        return this.f10161e.mo10891l();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: l0 */
    public boolean mo10892l0(int i11) {
        return this.f10161e.mo10892l0(i11);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: m */
    public JsonParser mo10893m(JsonParser.Feature feature) {
        this.f10161e.mo10893m(feature);
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: n */
    public BigInteger mo10895n() throws IOException {
        return this.f10161e.mo10895n();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: n0 */
    public boolean mo10896n0() {
        return this.f10161e.mo10896n0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: o0 */
    public boolean mo10898o0() {
        return this.f10161e.mo10898o0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: p */
    public byte[] mo10899p(Base64Variant base64Variant) throws IOException {
        return this.f10161e.mo10899p(base64Variant);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: p0 */
    public boolean mo10900p0() {
        return this.f10161e.mo10900p0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: q */
    public byte mo10901q() throws IOException {
        return this.f10161e.mo10901q();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: q0 */
    public boolean mo10902q0() throws IOException {
        return this.f10161e.mo10902q0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: u */
    public AbstractC6304g mo10906u() {
        return this.f10161e.mo10906u();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: u0 */
    public JsonToken mo10907u0() throws IOException {
        return this.f10161e.mo10907u0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: v */
    public JsonLocation mo10908v() {
        return this.f10161e.mo10908v();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: v0 */
    public JsonParser mo10909v0(int i11, int i12) {
        this.f10161e.mo10909v0(i11, i12);
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: w */
    public String mo10910w() throws IOException {
        return this.f10161e.mo10910w();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: w0 */
    public JsonParser mo10911w0(int i11, int i12) {
        this.f10161e.mo10911w0(i11, i12);
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: x */
    public JsonToken mo10912x() {
        return this.f10161e.mo10912x();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: x0 */
    public int mo10913x0(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        return this.f10161e.mo10913x0(base64Variant, outputStream);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: y0 */
    public boolean mo10914y0() {
        return this.f10161e.mo10914y0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    @Deprecated
    /* JADX INFO: renamed from: z */
    public int mo10915z() {
        return this.f10161e.mo10915z();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: z0 */
    public void mo10916z0(Object obj) {
        this.f10161e.mo10916z0(obj);
    }

    public C6328g(JsonParser jsonParser) {
        this.f10161e = jsonParser;
    }
}
