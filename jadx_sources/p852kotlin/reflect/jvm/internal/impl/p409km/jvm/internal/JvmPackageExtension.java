package p852kotlin.reflect.jvm.internal.impl.p409km.jvm.internal;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmProperty;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.KmExtensionType;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.KmPackageExtension;

/* JADX INFO: compiled from: JvmExtensionNodes.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class JvmPackageExtension implements KmPackageExtension {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @JvmField
    @NotNull
    public static final KmExtensionType TYPE = new KmExtensionType(Reflection.getOrCreateKotlinClass(JvmPackageExtension.class));

    @NotNull
    private final List<KmProperty> localDelegatedProperties = new ArrayList(0);

    @Nullable
    private String moduleName;

    /* JADX INFO: compiled from: JvmExtensionNodes.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @NotNull
    public final List<KmProperty> getLocalDelegatedProperties() {
        return this.localDelegatedProperties;
    }

    @Nullable
    public final String getModuleName() {
        return this.moduleName;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.KmExtension
    @NotNull
    public KmExtensionType getType() {
        return TYPE;
    }

    public final void setModuleName(@Nullable String str) {
        this.moduleName = str;
    }
}
