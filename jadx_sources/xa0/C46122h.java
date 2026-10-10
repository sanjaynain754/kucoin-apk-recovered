package xa0;

import com.revolut.revolutpay.ui_kit.model.AbstractC27592b;
import com.revolut.revolutpay.ui_kit.model.C27594e;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: xa0.h */
/* JADX INFO: loaded from: classes59.dex */
public final class C46122h implements InterfaceC46115a {

    /* JADX INFO: renamed from: a */
    public final int f103585a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final List<Object> f103586b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final AbstractC27592b f103587c;

    public C46122h(int i11, @NotNull List<? extends Object> args, @NotNull AbstractC27592b style) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f103585a = i11;
        this.f103586b = args;
        this.f103587c = style;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46122h)) {
            return false;
        }
        C46122h c46122h = (C46122h) obj;
        return this.f103585a == c46122h.f103585a && Intrinsics.areEqual(this.f103586b, c46122h.f103586b) && Intrinsics.areEqual(this.f103587c, c46122h.f103587c);
    }

    public /* synthetic */ C46122h(int i11, List list, AbstractC27592b abstractC27592b, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i12 & 2) != 0 ? CollectionsKt.emptyList() : list, (i12 & 4) != 0 ? C27594e.f56383a : abstractC27592b);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<Object> m101635a() {
        return this.f103586b;
    }

    /* JADX INFO: renamed from: b */
    public final int m101636b() {
        return this.f103585a;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final AbstractC27592b m101637c() {
        return this.f103587c;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f103585a) * 31) + this.f103586b.hashCode()) * 31) + this.f103587c.hashCode();
    }

    @NotNull
    public String toString() {
        return "TextLocalisedClause(stringId=" + this.f103585a + ", args=" + this.f103586b + ", style=" + this.f103587c + ')';
    }
}
