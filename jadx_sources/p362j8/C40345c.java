package p362j8;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.github.penfeizhou.animation.decode.FrameSeqDecoder;
import java.io.IOException;
import p048c2.C4788e;
import p298h2.InterfaceC38084e;
import p628t1.C44613e;
import p680v1.InterfaceC45359j;
import p710w1.InterfaceC45686d;

/* JADX INFO: renamed from: j8.c */
/* JADX INFO: compiled from: FrameBitmapTranscoder.java */
/* JADX INFO: loaded from: classes.dex */
public class C40345c implements InterfaceC38084e<FrameSeqDecoder, Bitmap> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC45686d f89611a;

    public C40345c(InterfaceC45686d interfaceC45686d) {
        this.f89611a = interfaceC45686d;
    }

    @Override // p298h2.InterfaceC38084e
    @Nullable
    /* JADX INFO: renamed from: a */
    public InterfaceC45359j<Bitmap> mo85980a(@NonNull InterfaceC45359j<FrameSeqDecoder> interfaceC45359j, @NonNull C44613e c44613e) {
        try {
            return C4788e.m4879c(interfaceC45359j.get().mo12784v(0), this.f89611a);
        } catch (IOException e11) {
            e11.printStackTrace();
            return null;
        }
    }
}
