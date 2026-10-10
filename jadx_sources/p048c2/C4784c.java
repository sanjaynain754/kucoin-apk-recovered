package p048c2;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.data.C5322c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p523p2.C43359f;
import p523p2.C43364k;
import p546q2.C43592b;
import p628t1.C44612d;
import p628t1.C44613e;
import p628t1.InterfaceC44615g;
import p680v1.InterfaceC45359j;
import p710w1.InterfaceC45684b;

/* JADX INFO: renamed from: c2.c */
/* JADX INFO: compiled from: BitmapEncoder.java */
/* JADX INFO: loaded from: classes.dex */
public class C4784c implements InterfaceC44615g<Bitmap> {

    /* JADX INFO: renamed from: b */
    public static final C44612d<Integer> f4802b = C44612d.m98727f("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* JADX INFO: renamed from: c */
    public static final C44612d<Bitmap.CompressFormat> f4803c = C44612d.m98726e("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    /* JADX INFO: renamed from: a */
    @Nullable
    public final InterfaceC45684b f4804a;

    @Override // p628t1.InterfaceC44615g
    @NonNull
    /* JADX INFO: renamed from: b */
    public EncodeStrategy mo4853b(@NonNull C44613e c44613e) {
        return EncodeStrategy.TRANSFORMED;
    }

    @Override // p628t1.InterfaceC44609a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo4852a(@NonNull InterfaceC45359j<Bitmap> interfaceC45359j, @NonNull File file, @NonNull C44613e c44613e) {
        boolean z11;
        Bitmap bitmap = interfaceC45359j.get();
        Bitmap.CompressFormat compressFormatM4874d = m4874d(bitmap, c44613e);
        C43592b.m95943c("encode: [%dx%d] %s", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), compressFormatM4874d);
        try {
            long jM95490b = C43359f.m95490b();
            int iIntValue = ((Integer) c44613e.m98732c(f4802b)).intValue();
            OutputStream c5322c = null;
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        c5322c = this.f4804a != null ? new C5322c(fileOutputStream, this.f4804a) : fileOutputStream;
                        bitmap.compress(compressFormatM4874d, iIntValue, c5322c);
                        c5322c.close();
                        try {
                            c5322c.close();
                        } catch (IOException unused) {
                        }
                        z11 = true;
                    } catch (IOException e11) {
                        e = e11;
                        c5322c = fileOutputStream;
                        if (Log.isLoggable("BitmapEncoder", 3)) {
                            Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                        }
                        if (c5322c != null) {
                            try {
                                c5322c.close();
                            } catch (IOException unused2) {
                            }
                        }
                        z11 = false;
                    } catch (Throwable th2) {
                        th = th2;
                        c5322c = fileOutputStream;
                        if (c5322c != null) {
                            try {
                                c5322c.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException e12) {
                e = e12;
            }
            if (Log.isLoggable("BitmapEncoder", 2)) {
                Log.v("BitmapEncoder", "Compressed with type: " + compressFormatM4874d + " of size " + C43364k.m95515h(bitmap) + " in " + C43359f.m95489a(jM95490b) + ", options format: " + c44613e.m98732c(f4803c) + ", hasAlpha: " + bitmap.hasAlpha());
            }
            C43592b.m95944d();
            return z11;
        } catch (Throwable th4) {
            C43592b.m95944d();
            throw th4;
        }
    }

    /* JADX INFO: renamed from: d */
    public final Bitmap.CompressFormat m4874d(Bitmap bitmap, C44613e c44613e) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) c44613e.m98732c(f4803c);
        if (compressFormat != null) {
            return compressFormat;
        }
        return bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    public C4784c(@NonNull InterfaceC45684b interfaceC45684b) {
        this.f4804a = interfaceC45684b;
    }
}
