package jumio.core;

import java.nio.charset.Charset;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.m */
/* JADX INFO: loaded from: classes61.dex */
public final class C40692m {

    /* JADX INFO: renamed from: a */
    public final String f90322a;

    /* JADX INFO: renamed from: b */
    public final Charset f90323b;

    /* JADX INFO: renamed from: c */
    public final byte[] f90324c;

    /* JADX INFO: renamed from: a */
    public final C40692m m89260a(C40692m other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return new C40692m(this.f90322a + other.f90322a, this.f90323b);
    }

    public final String toString() {
        return this.f90322a;
    }

    public C40692m(String text, Charset charset) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        this.f90322a = text;
        this.f90323b = charset;
        byte[] bytes = text.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        this.f90324c = bytes;
    }
}
