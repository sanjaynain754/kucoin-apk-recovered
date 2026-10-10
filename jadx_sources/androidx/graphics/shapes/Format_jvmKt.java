package androidx.graphics.shapes;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Format.jvm.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m90084d2 = {"toStringWithLessPrecision", "", "", "graphics-shapes_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class Format_jvmKt {
    @NotNull
    public static final String toStringWithLessPrecision(float f11) {
        String str = String.format("%.3f", Arrays.copyOf(new Object[]{Float.valueOf(f11)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)");
        return str;
    }
}
