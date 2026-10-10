package xa0;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: xa0.e */
/* JADX INFO: loaded from: classes59.dex */
public final class C46119e implements InterfaceC46117c {

    /* JADX INFO: renamed from: a */
    public final int f103573a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final Integer f103574b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final Integer f103575c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final Integer f103576d;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46119e)) {
            return false;
        }
        C46119e c46119e = (C46119e) obj;
        return this.f103573a == c46119e.f103573a && Intrinsics.areEqual(this.f103574b, c46119e.f103574b) && Intrinsics.areEqual(this.f103575c, c46119e.f103575c) && Intrinsics.areEqual(this.f103576d, c46119e.f103576d);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final Integer m101623a() {
        return this.f103575c;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Integer m101624b() {
        return this.f103576d;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Integer m101625c() {
        return this.f103574b;
    }

    /* JADX INFO: renamed from: d */
    public final int m101626d() {
        return this.f103573a;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f103573a) * 31;
        Integer num = this.f103574b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f103575c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f103576d;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ResourceImage(drawableRes=" + this.f103573a + ", colorRes=" + this.f103574b + ", color=" + this.f103575c + ", colorAttr=" + this.f103576d + ')';
    }
}
