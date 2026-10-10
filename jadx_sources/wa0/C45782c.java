package wa0;

import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: wa0.c */
/* JADX INFO: loaded from: classes59.dex */
public final class C45782c {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m101107a(@NotNull String str) throws IOException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == '+' || Character.isDigit(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "filterTo(StringBuilder(), predicate).toString()");
        return string;
    }
}
