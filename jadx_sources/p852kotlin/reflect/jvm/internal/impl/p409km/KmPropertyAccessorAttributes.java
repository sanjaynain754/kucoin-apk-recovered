package p852kotlin.reflect.jvm.internal.impl.p409km;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Nodes.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class KmPropertyAccessorAttributes {

    @NotNull
    private final List<KmAnnotation> annotations;
    private int flags;

    public KmPropertyAccessorAttributes(int i11) {
        this.flags = i11;
        this.annotations = new ArrayList(0);
    }

    @NotNull
    public final List<KmAnnotation> getAnnotations() {
        return this.annotations;
    }

    public final int getFlags$kotlin_metadata() {
        return this.flags;
    }

    public final void setFlags$kotlin_metadata(int i11) {
        this.flags = i11;
    }

    public KmPropertyAccessorAttributes() {
        this(0);
    }
}
