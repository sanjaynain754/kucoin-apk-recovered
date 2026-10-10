package com.github.penfeizhou.animation.gif.decode;

import com.github.penfeizhou.animation.gif.p064io.GifReader;
import com.github.penfeizhou.animation.p065io.Reader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p304h8.C38141c;
import p304h8.C38145g;
import p304h8.C38146h;
import p304h8.InterfaceC38140b;

/* JADX INFO: loaded from: classes45.dex */
public class GifParser {

    public static class FormatException extends IOException {
        public FormatException() {
            super("Gif Format error");
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m12792b(Reader reader) {
        try {
            m12791a(reader instanceof GifReader ? (GifReader) reader : new GifReader(reader));
            return true;
        } catch (IOException e11) {
            if (e11 instanceof FormatException) {
                return false;
            }
            e11.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m12791a(GifReader gifReader) throws IOException {
        byte bPeek;
        if (gifReader.peek() == 71 && gifReader.peek() == 73 && gifReader.peek() == 70 && gifReader.peek() == 56 && (((bPeek = gifReader.peek()) == 55 || bPeek == 57) && gifReader.peek() == 97)) {
        } else {
            throw new FormatException();
        }
    }

    /* JADX INFO: renamed from: c */
    public static List<InterfaceC38140b> m12793c(GifReader gifReader) throws IOException {
        InterfaceC38140b interfaceC38140bM12794b;
        m12791a(gifReader);
        ArrayList arrayList = new ArrayList();
        C38146h c38146h = new C38146h();
        c38146h.mo12795a(gifReader);
        arrayList.add(c38146h);
        if (c38146h.m86069b()) {
            C38141c c38141c = new C38141c(c38146h.m86070c());
            c38141c.mo12795a(gifReader);
            arrayList.add(c38141c);
        }
        while (true) {
            try {
                byte bPeek = gifReader.peek();
                if (bPeek != 59) {
                    if (bPeek != 33) {
                        if (bPeek != 44) {
                            interfaceC38140bM12794b = null;
                        } else {
                            interfaceC38140bM12794b = new C38145g();
                        }
                    } else {
                        interfaceC38140bM12794b = AbstractC6950a.m12794b(gifReader);
                    }
                    if (interfaceC38140bM12794b != null) {
                        interfaceC38140bM12794b.mo12795a(gifReader);
                        arrayList.add(interfaceC38140bM12794b);
                    } else {
                        throw new FormatException();
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return arrayList;
        }
    }
}
