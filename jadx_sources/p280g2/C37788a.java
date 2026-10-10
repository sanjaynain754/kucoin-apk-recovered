package p280g2;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.C5318a;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import p030b2.C4467m;
import p523p2.C43359f;
import p523p2.C43364k;
import p581r1.C43898c;
import p581r1.C43899d;
import p581r1.C43900e;
import p581r1.InterfaceC43896a;
import p628t1.C44613e;
import p628t1.InterfaceC44614f;
import p710w1.InterfaceC45684b;
import p710w1.InterfaceC45686d;

/* JADX INFO: renamed from: g2.a */
/* JADX INFO: compiled from: ByteBufferGifDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public class C37788a implements InterfaceC44614f<ByteBuffer, C37790c> {

    /* JADX INFO: renamed from: f */
    public static final a f85106f = new a();

    /* JADX INFO: renamed from: g */
    public static final b f85107g = new b();

    /* JADX INFO: renamed from: a */
    public final Context f85108a;

    /* JADX INFO: renamed from: b */
    public final List<ImageHeaderParser> f85109b;

    /* JADX INFO: renamed from: c */
    public final b f85110c;

    /* JADX INFO: renamed from: d */
    public final a f85111d;

    /* JADX INFO: renamed from: e */
    public final C37789b f85112e;

    /* JADX INFO: renamed from: g2.a$a */
    /* JADX INFO: compiled from: ByteBufferGifDecoder.java */
    @VisibleForTesting
    public static class a {
        /* JADX INFO: renamed from: a */
        public InterfaceC43896a m85243a(InterfaceC43896a.a aVar, C43898c c43898c, ByteBuffer byteBuffer, int i11) {
            return new C43900e(aVar, c43898c, byteBuffer, i11);
        }
    }

    /* JADX INFO: renamed from: g2.a$b */
    /* JADX INFO: compiled from: ByteBufferGifDecoder.java */
    @VisibleForTesting
    public static class b {

        /* JADX INFO: renamed from: a */
        public final Queue<C43899d> f85113a = C43364k.m95513f(0);

        /* JADX INFO: renamed from: a */
        public synchronized C43899d m85244a(ByteBuffer byteBuffer) {
            C43899d c43899dPoll;
            try {
                c43899dPoll = this.f85113a.poll();
                if (c43899dPoll == null) {
                    c43899dPoll = new C43899d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return c43899dPoll.m96699p(byteBuffer);
        }

        /* JADX INFO: renamed from: b */
        public synchronized void m85245b(C43899d c43899d) {
            c43899d.m96684a();
            this.f85113a.offer(c43899d);
        }
    }

    public C37788a(Context context, List<ImageHeaderParser> list, InterfaceC45686d interfaceC45686d, InterfaceC45684b interfaceC45684b) {
        this(context, list, interfaceC45686d, interfaceC45684b, f85107g, f85106f);
    }

    @VisibleForTesting
    public C37788a(Context context, List<ImageHeaderParser> list, InterfaceC45686d interfaceC45686d, InterfaceC45684b interfaceC45684b, b bVar, a aVar) {
        this.f85108a = context.getApplicationContext();
        this.f85109b = list;
        this.f85111d = aVar;
        this.f85112e = new C37789b(interfaceC45686d, interfaceC45684b);
        this.f85110c = bVar;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final C37792e m85240c(ByteBuffer byteBuffer, int i11, int i12, C43899d c43899d, C44613e c44613e) {
        StringBuilder sb2;
        long jM95490b = C43359f.m95490b();
        try {
            C43898c c43898cM96686c = c43899d.m96686c();
            if (c43898cM96686c.m96681b() > 0 && c43898cM96686c.m96682c() == 0) {
                Bitmap.Config config = c44613e.m98732c(C37796i.f85153a) == DecodeFormat.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                InterfaceC43896a interfaceC43896aM85243a = this.f85111d.m85243a(this.f85112e, c43898cM96686c, byteBuffer, m85239e(c43898cM96686c, i11, i12));
                interfaceC43896aM85243a.mo96672b(config);
                interfaceC43896aM85243a.mo96677g();
                Bitmap bitmapMo96676f = interfaceC43896aM85243a.mo96676f();
                if (bitmapMo96676f == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb2 = new StringBuilder();
                    }
                    return null;
                }
                C37792e c37792e = new C37792e(new C37790c(this.f85108a, interfaceC43896aM85243a, C4467m.m4267c(), i11, i12, bitmapMo96676f));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C43359f.m95489a(jM95490b));
                }
                return c37792e;
            }
            if (!Log.isLoggable("BufferGifDecoder", 2)) {
                return null;
            }
            sb2 = new StringBuilder();
            sb2.append("Decoded GIF from stream in ");
            sb2.append(C43359f.m95489a(jM95490b));
            Log.v("BufferGifDecoder", sb2.toString());
            return null;
        } catch (Throwable th2) {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C43359f.m95489a(jM95490b));
            }
            throw th2;
        }
    }

    @Override // p628t1.InterfaceC44614f
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public C37792e mo4261a(@NonNull ByteBuffer byteBuffer, int i11, int i12, @NonNull C44613e c44613e) {
        C43899d c43899dM85244a = this.f85110c.m85244a(byteBuffer);
        try {
            return m85240c(byteBuffer, i11, i12, c43899dM85244a, c44613e);
        } finally {
            this.f85110c.m85245b(c43899dM85244a);
        }
    }

    @Override // p628t1.InterfaceC44614f
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean mo4262b(@NonNull ByteBuffer byteBuffer, @NonNull C44613e c44613e) throws IOException {
        return !((Boolean) c44613e.m98732c(C37796i.f85154b)).booleanValue() && C5318a.m6655f(this.f85109b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    /* JADX INFO: renamed from: e */
    public static int m85239e(C43898c c43898c, int i11, int i12) {
        int iHighestOneBit;
        int iMin = Math.min(c43898c.m96680a() / i12, c43898c.m96683d() / i11);
        if (iMin == 0) {
            iHighestOneBit = 0;
        } else {
            iHighestOneBit = Integer.highestOneBit(iMin);
        }
        int iMax = Math.max(1, iHighestOneBit);
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + iMax + ", target dimens: [" + i11 + "x" + i12 + "], actual dimens: [" + c43898c.m96683d() + "x" + c43898c.m96680a() + "]");
        }
        return iMax;
    }
}
