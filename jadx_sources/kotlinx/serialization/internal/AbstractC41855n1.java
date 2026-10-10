package kotlinx.serialization.internal;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.bugly.proguard.C33978va;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import vg0.InterfaceC45533f;

/* JADX INFO: renamed from: kotlinx.serialization.internal.n1 */
/* JADX INFO: compiled from: Tagged.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\tJ\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0004¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m90084d2 = {"Lkotlinx/serialization/internal/n1;", "Lkotlinx/serialization/internal/z2;", "", "<init>", "()V", "Lvg0/f;", "", "index", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "(Lvg0/f;I)Ljava/lang/String;", "nestedName", "B", "(Ljava/lang/String;)Ljava/lang/String;", "descriptor", "z", "parentName", "childName", "y", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "C", "()Ljava/lang/String;", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public abstract class AbstractC41855n1 extends AbstractC41909z2<String> {
    @NotNull
    /* JADX INFO: renamed from: y */
    public abstract String mo91652y(@NotNull String parentName, @NotNull String childName);

    @Override // kotlinx.serialization.internal.AbstractC41909z2
    @NotNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final String mo91651t(@NotNull InterfaceC45533f interfaceC45533f, int i11) {
        Intrinsics.checkNotNullParameter(interfaceC45533f, "<this>");
        return m91649B(mo91653z(interfaceC45533f, i11));
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final String m91649B(@NotNull String nestedName) {
        Intrinsics.checkNotNullParameter(nestedName, "nestedName");
        String strM91770s = m91770s();
        if (strM91770s == null) {
            strM91770s = "";
        }
        return mo91652y(strM91770s, nestedName);
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public String mo91653z(@NotNull InterfaceC45533f descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return descriptor.mo91527f(index);
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final String m91650C() {
        if (m91771u().isEmpty()) {
            return "$";
        }
        return CollectionsKt.joinToString$default(m91771u(), C33978va.f72339h, "$.", null, 0, null, null, 60, null);
    }
}
