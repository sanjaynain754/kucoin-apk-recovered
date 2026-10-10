package xa0;

import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: xa0.g */
/* JADX INFO: loaded from: classes59.dex */
public final class C46121g implements InterfaceC46117c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f103579a;

    /* JADX INFO: renamed from: b */
    public final int f103580b;

    /* JADX INFO: renamed from: c */
    public final int f103581c;

    /* JADX INFO: renamed from: d */
    public final int f103582d;

    /* JADX INFO: renamed from: e */
    public final int f103583e;

    /* JADX INFO: renamed from: f */
    public final int f103584f;

    public C46121g(@NotNull String text, @ColorInt int i11, @ColorInt int i12, @ColorInt int i13, @Dimension(unit = 0) int i14, @Dimension(unit = 0) int i15) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f103579a = text;
        this.f103580b = i11;
        this.f103581c = i12;
        this.f103582d = i13;
        this.f103583e = i14;
        this.f103584f = i15;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46121g)) {
            return false;
        }
        C46121g c46121g = (C46121g) obj;
        return Intrinsics.areEqual(this.f103579a, c46121g.f103579a) && this.f103580b == c46121g.f103580b && this.f103581c == c46121g.f103581c && this.f103582d == c46121g.f103582d && this.f103583e == c46121g.f103583e && this.f103584f == c46121g.f103584f;
    }

    public /* synthetic */ C46121g(String str, int i11, int i12, int i13, int i14, int i15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i16 & 2) != 0 ? -1 : i11, (i16 & 4) != 0 ? 0 : i12, (i16 & 8) != 0 ? 0 : i13, i14, i15);
    }

    /* JADX INFO: renamed from: a */
    public final int m101629a() {
        return this.f103581c;
    }

    /* JADX INFO: renamed from: b */
    public final int m101630b() {
        return this.f103582d;
    }

    /* JADX INFO: renamed from: c */
    public final int m101631c() {
        return this.f103584f;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final String m101632d() {
        return this.f103579a;
    }

    /* JADX INFO: renamed from: e */
    public final int m101633e() {
        return this.f103580b;
    }

    /* JADX INFO: renamed from: f */
    public final int m101634f() {
        return this.f103583e;
    }

    public int hashCode() {
        return (((((((((this.f103579a.hashCode() * 31) + Integer.hashCode(this.f103580b)) * 31) + Integer.hashCode(this.f103581c)) * 31) + Integer.hashCode(this.f103582d)) * 31) + Integer.hashCode(this.f103583e)) * 31) + Integer.hashCode(this.f103584f);
    }

    @NotNull
    public String toString() {
        return "TextImage(text=" + this.f103579a + ", textColor=" + this.f103580b + ", backgroundColor=" + this.f103581c + ", borderColor=" + this.f103582d + ", textSize=" + this.f103583e + ", imageSize=" + this.f103584f + ')';
    }
}
