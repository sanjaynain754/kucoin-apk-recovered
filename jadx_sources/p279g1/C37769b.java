package p279g1;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import androidx.annotation.Nullable;
import com.airbnb.lottie.C5083i0;
import com.airbnb.lottie.InterfaceC5068b;
import java.io.IOException;
import java.util.Map;
import p484o1.C42924f;
import p484o1.C42930l;

/* JADX INFO: renamed from: g1.b */
/* JADX INFO: compiled from: ImageAssetManager.java */
/* JADX INFO: loaded from: classes.dex */
public class C37769b {

    /* JADX INFO: renamed from: d */
    public static final Object f85077d = new Object();

    /* JADX INFO: renamed from: a */
    @Nullable
    public final Context f85078a;

    /* JADX INFO: renamed from: b */
    public final String f85079b;

    /* JADX INFO: renamed from: c */
    public final Map<String, C5083i0> f85080c;

    @Nullable
    /* JADX INFO: renamed from: a */
    public Bitmap m85200a(String str) {
        C5083i0 c5083i0 = this.f85080c.get(str);
        if (c5083i0 == null) {
            return null;
        }
        Bitmap bitmapM5673b = c5083i0.m5673b();
        if (bitmapM5673b != null) {
            return bitmapM5673b;
        }
        Context context = this.f85078a;
        if (context == null) {
            return null;
        }
        String strM5674c = c5083i0.m5674c();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (strM5674c.startsWith("data:") && strM5674c.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(strM5674c.substring(strM5674c.indexOf(44) + 1), 0);
                return m85202c(str, C42930l.m94209l(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options), c5083i0.m5677f(), c5083i0.m5675d()));
            } catch (IllegalArgumentException e11) {
                C42924f.m94159d("data URL did not have correct base64 format.", e11);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.f85079b)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context.getAssets().open(this.f85079b + strM5674c), null, options);
                if (bitmapDecodeStream != null) {
                    return m85202c(str, C42930l.m94209l(bitmapDecodeStream, c5083i0.m5677f(), c5083i0.m5675d()));
                }
                C42924f.m94158c("Decoded image `" + str + "` is null.");
                return null;
            } catch (IllegalArgumentException e12) {
                C42924f.m94159d("Unable to decode image `" + str + "`.", e12);
                return null;
            }
        } catch (IOException e13) {
            C42924f.m94159d("Unable to open asset.", e13);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m85201b(Context context) {
        if (this.f85078a instanceof Application) {
            context = context.getApplicationContext();
        }
        return context == this.f85078a;
    }

    /* JADX INFO: renamed from: c */
    public final Bitmap m85202c(String str, @Nullable Bitmap bitmap) {
        synchronized (f85077d) {
            this.f85080c.get(str).m5678g(bitmap);
        }
        return bitmap;
    }

    public C37769b(Drawable.Callback callback, String str, InterfaceC5068b interfaceC5068b, Map<String, C5083i0> map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.f85079b = str + '/';
        } else {
            this.f85079b = str;
        }
        this.f85080c = map;
        m85203d(interfaceC5068b);
        if (!(callback instanceof View)) {
            this.f85078a = null;
        } else {
            this.f85078a = ((View) callback).getContext().getApplicationContext();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m85203d(@Nullable InterfaceC5068b interfaceC5068b) {
    }
}
