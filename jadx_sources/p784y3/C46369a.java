package p784y3;

import androidx.annotation.NonNull;
import androidx.media3.common.MimeTypes;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: y3.a */
/* JADX INFO: compiled from: MediaUtils.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u000bR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000e¨\u0006\u0010"}, m90084d2 = {"Ly3/a;", "", "<init>", "()V", "", "mimeType", "", "c", "(Ljava/lang/String;)Z", "path", "b", "(Ljava/lang/String;)Ljava/lang/String;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "Ljava/util/Map;", "ADDITIONAL_ALLOWED_MIME_TYPES", "fbcore_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C46369a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C46369a f103976a = new C46369a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final Map<String, String> ADDITIONAL_ALLOWED_MIME_TYPES = MapsKt.mapOf(TuplesKt.m90091to("mkv", MimeTypes.VIDEO_MATROSKA), TuplesKt.m90091to("glb", "model/gltf-binary"));

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final boolean m102265c(@Nullable String mimeType) {
        if (mimeType != null) {
            return StringsKt.startsWith$default(mimeType, "video/", false, 2, (Object) null);
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final String m102266a(@NonNull String path) {
        int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) path, '.', 0, false, 6, (Object) null);
        if (iLastIndexOf$default < 0 || iLastIndexOf$default == path.length() - 1) {
            return null;
        }
        String strSubstring = path.substring(iLastIndexOf$default + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final String m102264b(@NonNull @NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        String strM102266a = f103976a.m102266a(path);
        if (strM102266a != null) {
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = strM102266a.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (lowerCase != null) {
                String strM102267a = C46370b.m102267a(lowerCase);
                if (strM102267a == null) {
                    return ADDITIONAL_ALLOWED_MIME_TYPES.get(lowerCase);
                }
                return strM102267a;
            }
            return null;
        }
        return null;
    }
}
