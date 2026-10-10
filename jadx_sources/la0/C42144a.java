package la0;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: la0.a */
/* JADX INFO: loaded from: classes59.dex */
public final class C42144a {

    /* JADX INFO: renamed from: a */
    @SerializedName("browserColorDepth")
    public final int f93582a;

    /* JADX INFO: renamed from: b */
    @SerializedName("browserScreenWidth")
    public final int f93583b;

    /* JADX INFO: renamed from: c */
    @SerializedName("browserScreenHeight")
    public final int f93584c;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42144a)) {
            return false;
        }
        C42144a c42144a = (C42144a) obj;
        return this.f93582a == c42144a.f93582a && this.f93583b == c42144a.f93583b && this.f93584c == c42144a.f93584c;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f93582a) * 31) + Integer.hashCode(this.f93583b)) * 31) + Integer.hashCode(this.f93584c);
    }

    @NotNull
    public String toString() {
        return "SandboxAuthenticationRequestDto(browserColorDepth=" + this.f93582a + ", browserScreenWidth=" + this.f93583b + ", browserScreenHeight=" + this.f93584c + ')';
    }

    public C42144a(int i11, int i12, int i13) {
        this.f93582a = i11;
        this.f93583b = i12;
        this.f93584c = i13;
    }
}
