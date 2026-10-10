package p048c2;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.exifinterface.media.ExifInterface;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p710w1.InterfaceC45684b;

/* JADX INFO: renamed from: c2.t */
/* JADX INFO: compiled from: ExifInterfaceImageHeaderParser.java */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(27)
public final class C4803t implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    /* JADX INFO: renamed from: a */
    public ImageHeaderParser.ImageType mo4896a(@NonNull InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* JADX INFO: renamed from: b */
    public int mo4897b(@NonNull InputStream inputStream, @NonNull InterfaceC45684b interfaceC45684b) throws IOException {
        int attributeInt = new ExifInterface(inputStream).getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
        if (attributeInt == 0) {
            return -1;
        }
        return attributeInt;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    /* JADX INFO: renamed from: c */
    public ImageHeaderParser.ImageType mo4898c(@NonNull ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
