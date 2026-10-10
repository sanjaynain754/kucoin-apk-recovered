package xa0;

import com.revolut.revolutpay.ui_kit.model.AbstractC27592b;
import com.revolut.revolutpay.ui_kit.model.C27594e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: xa0.f */
/* JADX INFO: loaded from: classes59.dex */
public final class C46120f implements InterfaceC46115a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f103577a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final AbstractC27592b f103578b;

    public C46120f(@NotNull String text, @NotNull AbstractC27592b style) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f103577a = text;
        this.f103578b = style;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46120f)) {
            return false;
        }
        C46120f c46120f = (C46120f) obj;
        return Intrinsics.areEqual(this.f103577a, c46120f.f103577a) && Intrinsics.areEqual(this.f103578b, c46120f.f103578b);
    }

    public /* synthetic */ C46120f(String str, AbstractC27592b abstractC27592b, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? C27594e.f56383a : abstractC27592b);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final AbstractC27592b m101627a() {
        return this.f103578b;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m101628b() {
        return this.f103577a;
    }

    public int hashCode() {
        return (this.f103577a.hashCode() * 31) + this.f103578b.hashCode();
    }

    @NotNull
    public String toString() {
        return "TextClause(text=" + this.f103577a + ", style=" + this.f103578b + ')';
    }
}
