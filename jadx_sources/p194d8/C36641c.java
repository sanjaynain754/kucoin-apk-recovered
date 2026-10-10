package p194d8;

import com.github.penfeizhou.animation.p065io.Reader;
import java.io.IOException;
import org.aomedia.avif.android.AvifDecoder;
import p225e8.C37096a;

/* JADX INFO: renamed from: d8.c */
/* JADX INFO: compiled from: AVIFParser.java */
/* JADX INFO: loaded from: classes.dex */
public class C36641c {
    /* JADX INFO: renamed from: a */
    public static boolean m81978a(Reader reader) {
        try {
            return AvifDecoder.isAvifImage((reader instanceof C37096a ? (C37096a) reader : new C37096a(reader)).m83025a());
        } catch (IOException unused) {
            return false;
        }
    }
}
