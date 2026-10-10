package kotlinx.serialization.internal;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import vg0.InterfaceC45533f;

/* JADX INFO: renamed from: kotlinx.serialization.internal.n0 */
/* JADX INFO: compiled from: CollectionDescriptors.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lkotlinx/serialization/internal/n0;", "Lkotlinx/serialization/internal/j1;", "Lvg0/f;", "keyDesc", "valueDesc", "<init>", "(Lvg0/f;Lvg0/f;)V", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C41854n0 extends AbstractC41835j1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41854n0(@NotNull InterfaceC45533f keyDesc, @NotNull InterfaceC45533f valueDesc) {
        super("kotlin.collections.HashMap", keyDesc, valueDesc, null);
        Intrinsics.checkNotNullParameter(keyDesc, "keyDesc");
        Intrinsics.checkNotNullParameter(valueDesc, "valueDesc");
    }
}
