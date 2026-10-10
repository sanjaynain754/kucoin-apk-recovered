package p362j8;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import com.bumptech.glide.Registry;
import com.github.penfeizhou.animation.decode.FrameSeqDecoder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p356j2.AbstractC40248c;

/* JADX INFO: renamed from: j8.e */
/* JADX INFO: compiled from: GlideAnimationModule.java */
/* JADX INFO: loaded from: classes.dex */
public class C40347e extends AbstractC40248c {
    @Override // p356j2.AbstractC40248c
    /* JADX INFO: renamed from: a */
    public void mo6523a(@NonNull Context context, @NonNull ComponentCallbacks2C5309c componentCallbacks2C5309c, @NonNull Registry registry) {
        super.mo6523a(context, componentCallbacks2C5309c, registry);
        C40344b c40344b = new C40344b();
        registry.m6541o(InputStream.class, FrameSeqDecoder.class, new C40348f(c40344b));
        registry.m6541o(ByteBuffer.class, FrameSeqDecoder.class, c40344b);
        registry.m6545s(FrameSeqDecoder.class, Drawable.class, new C40346d());
        registry.m6545s(FrameSeqDecoder.class, Bitmap.class, new C40345c(componentCallbacks2C5309c.m6562f()));
    }
}
