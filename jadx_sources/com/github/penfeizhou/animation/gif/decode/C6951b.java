package com.github.penfeizhou.animation.gif.decode;

import com.github.penfeizhou.animation.gif.p064io.GifReader;
import java.io.IOException;

/* JADX INFO: renamed from: com.github.penfeizhou.animation.gif.decode.b */
/* JADX INFO: compiled from: GraphicControlExtension.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6951b extends AbstractC6950a {

    /* JADX INFO: renamed from: a */
    public int f11605a;

    /* JADX INFO: renamed from: b */
    public byte f11606b;

    /* JADX INFO: renamed from: c */
    public int f11607c;

    /* JADX INFO: renamed from: d */
    public int f11608d;

    /* JADX INFO: renamed from: c */
    public int m12796c() {
        return (this.f11606b >> 2) & 7;
    }

    /* JADX INFO: renamed from: d */
    public boolean m12797d() {
        return (this.f11606b & 1) == 1;
    }

    @Override // p304h8.InterfaceC38140b
    /* JADX INFO: renamed from: a */
    public void mo12795a(GifReader gifReader) throws IOException {
        this.f11605a = gifReader.peek() & 255;
        this.f11606b = gifReader.peek();
        this.f11607c = gifReader.readUInt16();
        this.f11608d = gifReader.peek() & 255;
        if (gifReader.peek() == 0) {
        } else {
            throw new GifParser.FormatException();
        }
    }
}
