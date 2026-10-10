package p852kotlin.reflect.jvm.internal.impl.p409km.jvm.internal;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmAnnotation;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.KmExtensionType;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.KmTypeExtension;

/* JADX INFO: compiled from: JvmExtensionNodes.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class JvmTypeExtension implements KmTypeExtension {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @JvmField
    @NotNull
    public static final KmExtensionType TYPE = new KmExtensionType(Reflection.getOrCreateKotlinClass(JvmTypeExtension.class));

    @NotNull
    private final List<KmAnnotation> annotations = new ArrayList();
    private boolean isRaw;

    /* JADX INFO: compiled from: JvmExtensionNodes.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(JvmTypeExtension.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.metadata.jvm.internal.JvmTypeExtension");
        JvmTypeExtension jvmTypeExtension = (JvmTypeExtension) obj;
        return this.isRaw == jvmTypeExtension.isRaw && Intrinsics.areEqual(this.annotations, jvmTypeExtension.annotations);
    }

    @NotNull
    public final List<KmAnnotation> getAnnotations() {
        return this.annotations;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.KmExtension
    @NotNull
    public KmExtensionType getType() {
        return TYPE;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isRaw) * 31) + this.annotations.hashCode();
    }

    public final boolean isRaw() {
        return this.isRaw;
    }

    public final void setRaw(boolean z11) {
        this.isRaw = z11;
    }
}
