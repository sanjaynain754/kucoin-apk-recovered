package p852kotlin.reflect.jvm.internal.impl.p409km.jvm.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.KmExtensionType;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.KmPropertyExtension;
import p852kotlin.reflect.jvm.internal.impl.p409km.jvm.JvmFieldSignature;
import p852kotlin.reflect.jvm.internal.impl.p409km.jvm.JvmMethodSignature;

/* JADX INFO: compiled from: JvmExtensionNodes.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class JvmPropertyExtension implements KmPropertyExtension {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @JvmField
    @NotNull
    public static final KmExtensionType TYPE = new KmExtensionType(Reflection.getOrCreateKotlinClass(JvmPropertyExtension.class));

    @Nullable
    private JvmFieldSignature fieldSignature;

    @Nullable
    private JvmMethodSignature getterSignature;
    private int jvmFlags;

    @Nullable
    private JvmMethodSignature setterSignature;

    @Nullable
    private JvmMethodSignature syntheticMethodForAnnotations;

    @Nullable
    private JvmMethodSignature syntheticMethodForDelegate;

    /* JADX INFO: compiled from: JvmExtensionNodes.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Nullable
    public final JvmFieldSignature getFieldSignature() {
        return this.fieldSignature;
    }

    @Nullable
    public final JvmMethodSignature getGetterSignature() {
        return this.getterSignature;
    }

    public final int getJvmFlags() {
        return this.jvmFlags;
    }

    @Nullable
    public final JvmMethodSignature getSetterSignature() {
        return this.setterSignature;
    }

    @Nullable
    public final JvmMethodSignature getSyntheticMethodForAnnotations() {
        return this.syntheticMethodForAnnotations;
    }

    @Nullable
    public final JvmMethodSignature getSyntheticMethodForDelegate() {
        return this.syntheticMethodForDelegate;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.KmExtension
    @NotNull
    public KmExtensionType getType() {
        return TYPE;
    }

    public final void setFieldSignature(@Nullable JvmFieldSignature jvmFieldSignature) {
        this.fieldSignature = jvmFieldSignature;
    }

    public final void setGetterSignature(@Nullable JvmMethodSignature jvmMethodSignature) {
        this.getterSignature = jvmMethodSignature;
    }

    public final void setJvmFlags(int i11) {
        this.jvmFlags = i11;
    }

    public final void setSetterSignature(@Nullable JvmMethodSignature jvmMethodSignature) {
        this.setterSignature = jvmMethodSignature;
    }

    public final void setSyntheticMethodForAnnotations(@Nullable JvmMethodSignature jvmMethodSignature) {
        this.syntheticMethodForAnnotations = jvmMethodSignature;
    }

    public final void setSyntheticMethodForDelegate(@Nullable JvmMethodSignature jvmMethodSignature) {
        this.syntheticMethodForDelegate = jvmMethodSignature;
    }
}
