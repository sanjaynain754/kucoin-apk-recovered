package com.revolut.revolutpay.p123ui.picker;

import com.revolut.revolutpay.ui_kit.delegate.C27591a;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.revolut.revolutpay.ui.picker.f */
/* JADX INFO: loaded from: classes59.dex */
public final class C27569f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public List<C27591a.b> f56310a;

    /* JADX WARN: Multi-variable type inference failed */
    public C27569f() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C27569f) && Intrinsics.areEqual(this.f56310a, ((C27569f) obj).f56310a);
    }

    public C27569f(@NotNull List<C27591a.b> allItems) {
        Intrinsics.checkNotNullParameter(allItems, "allItems");
        this.f56310a = allItems;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<C27591a.b> m68403a() {
        return this.f56310a;
    }

    /* JADX INFO: renamed from: b */
    public final void m68404b(@NotNull List<C27591a.b> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f56310a = list;
    }

    public int hashCode() {
        return this.f56310a.hashCode();
    }

    @NotNull
    public String toString() {
        return "UiState(allItems=" + this.f56310a + ')';
    }

    public /* synthetic */ C27569f(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? CollectionsKt.emptyList() : list);
    }
}
