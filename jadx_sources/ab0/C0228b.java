package ab0;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ab0.b */
/* JADX INFO: loaded from: classes59.dex */
public final class C0228b {

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final a f684e = new a(null);

    /* JADX INFO: renamed from: a */
    public final int f685a;

    /* JADX INFO: renamed from: b */
    public final int f686b;

    /* JADX INFO: renamed from: c */
    public final int f687c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final String f688d;

    /* JADX INFO: renamed from: ab0.b$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C0228b m836a() {
            return new C0228b(0, Color.parseColor("#0666EB"), Color.parseColor("#F7F7F7"), "");
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0228b)) {
            return false;
        }
        C0228b c0228b = (C0228b) obj;
        return this.f685a == c0228b.f685a && this.f686b == c0228b.f686b && this.f687c == c0228b.f687c && Intrinsics.areEqual(this.f688d, c0228b.f688d);
    }

    /* JADX INFO: renamed from: a */
    public final int m832a() {
        return this.f686b;
    }

    /* JADX INFO: renamed from: b */
    public final int m833b() {
        return this.f687c;
    }

    /* JADX INFO: renamed from: c */
    public final int m834c() {
        return this.f685a;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final String m835d() {
        return this.f688d;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f685a) * 31) + Integer.hashCode(this.f686b)) * 31) + Integer.hashCode(this.f687c)) * 31) + this.f688d.hashCode();
    }

    @NotNull
    public String toString() {
        return "LargeActionButtonParams(styleId=" + this.f685a + ", colorAccent=" + this.f686b + ", colorBackground=" + this.f687c + ", text=" + this.f688d + ')';
    }

    public C0228b(int i11, @ColorInt int i12, @ColorInt int i13, @NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f685a = i11;
        this.f686b = i12;
        this.f687c = i13;
        this.f688d = text;
    }
}
