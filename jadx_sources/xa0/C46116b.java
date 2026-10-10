package xa0;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: xa0.b */
/* JADX INFO: loaded from: classes59.dex */
public final class C46116b implements InterfaceC46117c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f103572a;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C46116b) && Intrinsics.areEqual(this.f103572a, ((C46116b) obj).f103572a);
    }

    public C46116b(@NotNull String countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f103572a = countryCode;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m101622a() {
        return this.f103572a;
    }

    public int hashCode() {
        return this.f103572a.hashCode();
    }

    @NotNull
    public String toString() {
        return "CountryImage(countryCode=" + this.f103572a + ')';
    }
}
