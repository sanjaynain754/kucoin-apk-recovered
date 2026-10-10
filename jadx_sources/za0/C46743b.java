package za0;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: za0.b */
/* JADX INFO: loaded from: classes59.dex */
public final class C46743b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f104564a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final Object f104565b;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46743b)) {
            return false;
        }
        C46743b c46743b = (C46743b) obj;
        return Intrinsics.areEqual(this.f104564a, c46743b.f104564a) && Intrinsics.areEqual(this.f104565b, c46743b.f104565b);
    }

    public C46743b(@NotNull String id2, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f104564a = id2;
        this.f104565b = obj;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m102998a() {
        return this.f104564a;
    }

    public int hashCode() {
        int iHashCode = this.f104564a.hashCode() * 31;
        Object obj = this.f104565b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    @NotNull
    public String toString() {
        return "ClickData(id=" + this.f104564a + ", parcel=" + this.f104565b + ')';
    }
}
