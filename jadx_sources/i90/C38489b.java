package i90;

import android.graphics.Path;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.bugly.proguard.C33627eb;
import j90.C40353b;
import java.util.StringTokenizer;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: i90.b */
/* JADX INFO: compiled from: SVGAPathEntity.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013¨\u0006\u0015"}, m90084d2 = {"Li90/b;", "", "", "originValue", "<init>", "(Ljava/lang/String;)V", "Landroid/graphics/Path;", "toPath", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/graphics/Path;)V", "finalPath", FirebaseAnalytics.Param.METHOD, "Ljava/util/StringTokenizer;", "args", "b", "(Landroid/graphics/Path;Ljava/lang/String;Ljava/util/StringTokenizer;)V", "Ljava/lang/String;", "replacedValue", "Landroid/graphics/Path;", "cachedPath", "com.opensource.svgaplayer"}, m90085k = 1, m90086mv = {1, 4, 0})
public final class C38489b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String replacedValue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public Path cachedPath;

    /* JADX WARN: Code duplicated, block: B:35:0x0089  */
    /* JADX WARN: Code duplicated, block: B:36:0x008d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0095  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00af  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00db  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:65:0x010a  */
    /* JADX WARN: Code duplicated, block: B:66:0x010e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0117  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public final void m87088b(Path finalPath, String method, StringTokenizer args) {
        C40353b c40353b;
        float f11;
        int i11 = 0;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        while (args.hasMoreTokens()) {
            try {
                String s11 = args.nextToken();
                Intrinsics.checkExpressionValueIsNotNull(s11, "s");
                if (s11.length() != 0) {
                    if (i11 == 0) {
                        f12 = Float.parseFloat(s11);
                    }
                    if (i11 == 1) {
                        f13 = Float.parseFloat(s11);
                    }
                    if (i11 == 2) {
                        f14 = Float.parseFloat(s11);
                    }
                    if (i11 == 3) {
                        f15 = Float.parseFloat(s11);
                    }
                    if (i11 == 4) {
                        f16 = Float.parseFloat(s11);
                    }
                    if (i11 == 5) {
                        f17 = Float.parseFloat(s11);
                    }
                    i11++;
                }
            } catch (Exception unused) {
            }
        }
        float f18 = f12;
        float f19 = f13;
        float f21 = f14;
        float f22 = f15;
        float f23 = f16;
        C40353b c40353b2 = new C40353b(0.0f, 0.0f, 0.0f);
        if (!Intrinsics.areEqual(method, "M")) {
            if (Intrinsics.areEqual(method, "m")) {
                finalPath.rMoveTo(f18, f19);
                c40353b = new C40353b(c40353b2.getX() + f18, c40353b2.getY() + f19, 0.0f);
            }
            if (Intrinsics.areEqual(method, "L")) {
                finalPath.lineTo(f18, f19);
            } else if (Intrinsics.areEqual(method, CmcdData.Factory.STREAM_TYPE_LIVE)) {
                finalPath.rLineTo(f18, f19);
            }
            if (Intrinsics.areEqual(method, "C")) {
                finalPath.cubicTo(f18, f19, f21, f22, f23, f17);
            } else {
                f11 = f17;
                if (Intrinsics.areEqual(method, "c")) {
                    finalPath.rCubicTo(f18, f19, f21, f22, f23, f11);
                }
            }
            if (Intrinsics.areEqual(method, "Q")) {
                finalPath.quadTo(f18, f19, f21, f22);
            } else if (Intrinsics.areEqual(method, "q")) {
                finalPath.rQuadTo(f18, f19, f21, f22);
            }
            if (Intrinsics.areEqual(method, "H")) {
                finalPath.lineTo(f18, c40353b.getY());
            } else if (Intrinsics.areEqual(method, CmcdData.Factory.STREAMING_FORMAT_HLS)) {
                finalPath.rLineTo(f18, 0.0f);
            }
            if (Intrinsics.areEqual(method, ExifInterface.GPS_MEASUREMENT_INTERRUPTED)) {
                finalPath.lineTo(c40353b.getX(), f18);
            } else if (Intrinsics.areEqual(method, "v")) {
                finalPath.rLineTo(0.0f, f18);
            }
            if (Intrinsics.areEqual(method, "Z")) {
                finalPath.close();
            } else if (Intrinsics.areEqual(method, "z")) {
                finalPath.close();
            }
        }
        finalPath.moveTo(f18, f19);
        c40353b2 = new C40353b(f18, f19, 0.0f);
        c40353b = c40353b2;
        if (Intrinsics.areEqual(method, "L")) {
            finalPath.lineTo(f18, f19);
        } else if (Intrinsics.areEqual(method, CmcdData.Factory.STREAM_TYPE_LIVE)) {
            finalPath.rLineTo(f18, f19);
        }
        if (Intrinsics.areEqual(method, "C")) {
            finalPath.cubicTo(f18, f19, f21, f22, f23, f17);
        } else {
            f11 = f17;
            if (Intrinsics.areEqual(method, "c")) {
                finalPath.rCubicTo(f18, f19, f21, f22, f23, f11);
            }
        }
        if (Intrinsics.areEqual(method, "Q")) {
            finalPath.quadTo(f18, f19, f21, f22);
        } else if (Intrinsics.areEqual(method, "q")) {
            finalPath.rQuadTo(f18, f19, f21, f22);
        }
        if (Intrinsics.areEqual(method, "H")) {
            finalPath.lineTo(f18, c40353b.getY());
        } else if (Intrinsics.areEqual(method, CmcdData.Factory.STREAMING_FORMAT_HLS)) {
            finalPath.rLineTo(f18, 0.0f);
        }
        if (Intrinsics.areEqual(method, ExifInterface.GPS_MEASUREMENT_INTERRUPTED)) {
            finalPath.lineTo(c40353b.getX(), f18);
        } else if (Intrinsics.areEqual(method, "v")) {
            finalPath.rLineTo(0.0f, f18);
        }
        if (Intrinsics.areEqual(method, "Z")) {
            finalPath.close();
        } else if (Intrinsics.areEqual(method, "z")) {
            finalPath.close();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m87087a(@NotNull Path toPath) {
        Path path = this.cachedPath;
        if (path != null) {
            toPath.set(path);
            return;
        }
        Path path2 = new Path();
        StringTokenizer stringTokenizer = new StringTokenizer(this.replacedValue, "MLHVCSQRAZmlhvcsqraz", true);
        String str = "";
        while (stringTokenizer.hasMoreTokens()) {
            String segment = stringTokenizer.nextToken();
            Intrinsics.checkExpressionValueIsNotNull(segment, "segment");
            if (segment.length() != 0) {
                if (C38490c.f86432a.contains(segment)) {
                    if (Intrinsics.areEqual(segment, "Z") || Intrinsics.areEqual(segment, "z")) {
                        m87088b(path2, segment, new StringTokenizer("", ""));
                    }
                    str = segment;
                } else {
                    m87088b(path2, str, new StringTokenizer(segment, C33627eb.f69716f));
                }
            }
        }
        this.cachedPath = path2;
        toPath.set(path2);
    }

    public C38489b(@NotNull String str) {
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) ",", false, 2, (Object) null)) {
            str = StringsKt.replace$default(str, ",", C33627eb.f69716f, false, 4, (Object) null);
        }
        this.replacedValue = str;
    }
}
