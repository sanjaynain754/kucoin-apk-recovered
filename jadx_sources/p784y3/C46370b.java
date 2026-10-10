package p784y3;

import android.webkit.MimeTypeMap;
import androidx.media3.common.MimeTypes;
import com.facebook.common.internal.ImmutableMap;
import java.util.Map;

/* JADX INFO: renamed from: y3.b */
/* JADX INFO: compiled from: MimeTypeMapWrapper.java */
/* JADX INFO: loaded from: classes34.dex */
public class C46370b {

    /* JADX INFO: renamed from: a */
    public static final MimeTypeMap f103978a = MimeTypeMap.getSingleton();

    /* JADX INFO: renamed from: b */
    public static final Map<String, String> f103979b = ImmutableMap.m8534of(MimeTypes.IMAGE_HEIF, "heif", MimeTypes.IMAGE_HEIC, "heic");

    /* JADX INFO: renamed from: c */
    public static final Map<String, String> f103980c = ImmutableMap.m8534of("heif", MimeTypes.IMAGE_HEIF, "heic", MimeTypes.IMAGE_HEIC);

    /* JADX INFO: renamed from: a */
    public static String m102267a(String str) {
        String str2 = f103980c.get(str);
        return str2 != null ? str2 : f103978a.getMimeTypeFromExtension(str);
    }
}
