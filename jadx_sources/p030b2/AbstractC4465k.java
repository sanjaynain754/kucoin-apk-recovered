package p030b2;

import android.annotation.SuppressLint;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.resource.bitmap.C5368a;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import java.io.IOException;
import p048c2.C4805v;
import p628t1.C44612d;
import p628t1.C44613e;
import p628t1.InterfaceC44614f;
import p680v1.InterfaceC45359j;

/* JADX INFO: renamed from: b2.k */
/* JADX INFO: compiled from: ImageDecoderResourceDecoder.java */
/* JADX INFO: loaded from: classes34.dex */
@RequiresApi(api = 28)
public abstract class AbstractC4465k<T> implements InterfaceC44614f<ImageDecoder.Source, T> {

    /* JADX INFO: renamed from: a */
    public final C4805v f3857a = C4805v.m4899b();

    /* JADX INFO: renamed from: b2.k$a */
    /* JADX INFO: compiled from: ImageDecoderResourceDecoder.java */
    public class a implements ImageDecoder$OnHeaderDecodedListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f3858a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f3859b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f3860c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ DecodeFormat f3861d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ DownsampleStrategy f3862e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ PreferredColorSpace f3863f;

        /* JADX INFO: renamed from: b2.k$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ImageDecoderResourceDecoder.java */
        public class C46959a implements ImageDecoder$OnPartialImageListener {
            public boolean onPartialImage(@NonNull ImageDecoder.DecodeException decodeException) {
                return false;
            }

            public C46959a() {
            }
        }

        public a(int i11, int i12, boolean z11, DecodeFormat decodeFormat, DownsampleStrategy downsampleStrategy, PreferredColorSpace preferredColorSpace) {
            this.f3858a = i11;
            this.f3859b = i12;
            this.f3860c = z11;
            this.f3861d = decodeFormat;
            this.f3862e = downsampleStrategy;
            this.f3863f = preferredColorSpace;
        }

        @SuppressLint({"Override"})
        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            if (AbstractC4465k.this.f3857a.m4906e(this.f3858a, this.f3859b, this.f3860c, false)) {
                imageDecoder.setAllocator(3);
            } else {
                imageDecoder.setAllocator(1);
            }
            if (this.f3861d == DecodeFormat.PREFER_RGB_565) {
                imageDecoder.setMemorySizePolicy(0);
            }
            imageDecoder.setOnPartialImageListener(new C46959a());
            Size size = imageInfo.getSize();
            int width = this.f3858a;
            if (width == Integer.MIN_VALUE) {
                width = size.getWidth();
            }
            int height = this.f3859b;
            if (height == Integer.MIN_VALUE) {
                height = size.getHeight();
            }
            float fMo6850b = this.f3862e.mo6850b(size.getWidth(), size.getHeight(), width, height);
            int iRound = Math.round(size.getWidth() * fMo6850b);
            int iRound2 = Math.round(size.getHeight() * fMo6850b);
            if (Log.isLoggable("ImageDecoder", 2)) {
                Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fMo6850b);
            }
            imageDecoder.setTargetSize(iRound, iRound2);
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((this.f3863f == PreferredColorSpace.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (i11 >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract InterfaceC45359j<T> mo4263c(ImageDecoder.Source source, int i11, int i12, ImageDecoder$OnHeaderDecodedListener imageDecoder$OnHeaderDecodedListener) throws IOException;

    /* JADX INFO: renamed from: e */
    public final boolean m4265e(@NonNull ImageDecoder.Source source, @NonNull C44613e c44613e) {
        return true;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final InterfaceC45359j<T> m4264d(@NonNull ImageDecoder.Source source, int i11, int i12, @NonNull C44613e c44613e) throws IOException {
        DecodeFormat decodeFormat = (DecodeFormat) c44613e.m98732c(C5368a.f6986f);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) c44613e.m98732c(DownsampleStrategy.f6967h);
        C44612d<Boolean> c44612d = C5368a.f6990j;
        return mo4263c(source, i11, i12, new a(i11, i12, c44613e.m98732c(c44612d) != null && ((Boolean) c44613e.m98732c(c44612d)).booleanValue(), decodeFormat, downsampleStrategy, (PreferredColorSpace) c44613e.m98732c(C5368a.f6987g)));
    }

    @Override // p628t1.InterfaceC44614f
    @Nullable
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ InterfaceC45359j mo4261a(@NonNull ImageDecoder.Source source, int i11, int i12, @NonNull C44613e c44613e) throws IOException {
        return m4264d(C4455a.m4251a(source), i11, i12, c44613e);
    }

    @Override // p628t1.InterfaceC44614f
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo4262b(@NonNull ImageDecoder.Source source, @NonNull C44613e c44613e) throws IOException {
        return m4265e(C4455a.m4251a(source), c44613e);
    }
}
