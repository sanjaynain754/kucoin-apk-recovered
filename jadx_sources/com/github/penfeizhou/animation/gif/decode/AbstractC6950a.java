package com.github.penfeizhou.animation.gif.decode;

import com.github.penfeizhou.animation.gif.p064io.GifReader;
import java.io.IOException;
import p304h8.C38139a;
import p304h8.C38142d;
import p304h8.C38147i;
import p304h8.InterfaceC38140b;

/* JADX INFO: renamed from: com.github.penfeizhou.animation.gif.decode.a */
/* JADX INFO: compiled from: ExtensionBlock.java */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6950a implements InterfaceC38140b {
    /* JADX INFO: renamed from: b */
    public static AbstractC6950a m12794b(GifReader gifReader) throws IOException {
        byte bPeek = gifReader.peek();
        if (bPeek != -7) {
            if (bPeek != 1) {
                if (bPeek != -2) {
                    if (bPeek == -1) {
                        return new C38139a();
                    }
                    throw new GifParser.FormatException();
                }
                return new C38142d();
            }
            return new C38147i();
        }
        return new C6951b();
    }
}
