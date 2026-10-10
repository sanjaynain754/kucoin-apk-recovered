package p852kotlin.reflect.jvm.internal.impl.p409km.jvm.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.KmExtensionType;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.KmFunctionExtension;
import p852kotlin.reflect.jvm.internal.impl.p409km.jvm.JvmMethodSignature;

/* JADX INFO: compiled from: JvmExtensionNodes.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class JvmFunctionExtension implements KmFunctionExtension {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @JvmField
    @NotNull
    public static final KmExtensionType TYPE = new KmExtensionType(Reflection.getOrCreateKotlinClass(JvmFunctionExtension.class));

    @Nullable
    private String lambdaClassOriginName;

    @Nullable
    private JvmMethodSignature signature;

    /* JADX INFO: compiled from: JvmExtensionNodes.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Nullable
    public final String getLambdaClassOriginName() {
        return this.lambdaClassOriginName;
    }

    @Nullable
    public final JvmMethodSignature getSignature() {
        return this.signature;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.KmExtension
    @NotNull
    public KmExtensionType getType() {
        return TYPE;
    }

    public final void setLambdaClassOriginName(@Nullable String str) {
        this.lambdaClassOriginName = str;
    }

    public final void setSignature(@Nullable JvmMethodSignature jvmMethodSignature) {
        this.signature = jvmMethodSignature;
    }
}
