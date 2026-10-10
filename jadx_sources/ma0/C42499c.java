package ma0;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ma0.c */
/* JADX INFO: loaded from: classes59.dex */
public final class C42499c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f94164a;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C42499c) && Intrinsics.areEqual(this.f94164a, ((C42499c) obj).f94164a);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m93184a() {
        return this.f94164a;
    }

    public int hashCode() {
        return this.f94164a.hashCode();
    }

    @NotNull
    public String toString() {
        return "Session(token=" + this.f94164a + ')';
    }

    public C42499c(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.f94164a = token;
    }
}
