package kotlinx.serialization.internal;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import vg0.InterfaceC45533f;

/* JADX INFO: renamed from: kotlinx.serialization.internal.o1 */
/* JADX INFO: compiled from: Tagged.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\r\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\tJ\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"Lkotlinx/serialization/internal/o1;", "Lkotlinx/serialization/internal/a3;", "", "<init>", "()V", "Lvg0/f;", "", "index", "x", "(Lvg0/f;I)Ljava/lang/String;", "nestedName", "y", "(Ljava/lang/String;)Ljava/lang/String;", "descriptor", "w", "parentName", "childName", "v", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public abstract class AbstractC41860o1 extends AbstractC41792a3<String> {
    @NotNull
    /* JADX INFO: renamed from: v */
    public abstract String mo91667v(@NotNull String parentName, @NotNull String childName);

    @NotNull
    /* JADX INFO: renamed from: w */
    public abstract String mo91668w(@NotNull InterfaceC45533f descriptor, int index);

    @Override // kotlinx.serialization.internal.AbstractC41792a3
    @NotNull
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final String mo91480s(@NotNull InterfaceC45533f interfaceC45533f, int i11) {
        Intrinsics.checkNotNullParameter(interfaceC45533f, "<this>");
        return m91670y(mo91668w(interfaceC45533f, i11));
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final String m91670y(@NotNull String nestedName) {
        Intrinsics.checkNotNullParameter(nestedName, "nestedName");
        String strM91479r = m91479r();
        if (strM91479r == null) {
            strM91479r = "";
        }
        return mo91667v(strM91479r, nestedName);
    }
}
