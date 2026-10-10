package p284g6;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.io.IOException;
import java.io.InputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p747x3.C45999a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;

/* JADX INFO: renamed from: g6.d */
/* JADX INFO: compiled from: HeifExifUtil.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lg6/d;", "", "<init>", "()V", "Ljava/io/InputStream;", "inputStream", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/io/InputStream;)I", "imagepipeline-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C37819d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C37819d f85194a = new C37819d();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final int m85347a(@Nullable InputStream inputStream) {
        if (inputStream == null) {
            C45999a.m101496b("HeifExifUtil", "Trying to read Heif Exif from null inputStream -> ignoring");
            return 0;
        }
        try {
            return new ExifInterface(inputStream).getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
        } catch (IOException e11) {
            C45999a.m101501g("HeifExifUtil", "Failed reading Heif Exif orientation -> ignoring", e11);
            return 0;
        }
    }
}
