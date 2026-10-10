package p852kotlin.reflect.jvm.internal.impl.p409km.jvm.internal;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmAnnotation;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.KmExtensionType;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.KmTypeParameterExtension;

/* JADX INFO: compiled from: JvmExtensionNodes.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class JvmTypeParameterExtension implements KmTypeParameterExtension {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @JvmField
    @NotNull
    public static final KmExtensionType TYPE = new KmExtensionType(Reflection.getOrCreateKotlinClass(JvmTypeParameterExtension.class));

    @NotNull
    private final List<KmAnnotation> annotations = new ArrayList();

    /* JADX INFO: compiled from: JvmExtensionNodes.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
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
}
