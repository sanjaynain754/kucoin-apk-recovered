package la0;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: la0.b */
/* JADX INFO: loaded from: classes59.dex */
public final class C42145b {

    /* JADX INFO: renamed from: a */
    @SerializedName("transactionToken")
    @NotNull
    public final String f93585a;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C42145b) && Intrinsics.areEqual(this.f93585a, ((C42145b) obj).f93585a);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m92483a() {
        return this.f93585a;
    }

    public int hashCode() {
        return this.f93585a.hashCode();
    }

    @NotNull
    public String toString() {
        return "SandboxAuthenticationResponseDto(transactionToken=" + this.f93585a + ')';
    }
}
