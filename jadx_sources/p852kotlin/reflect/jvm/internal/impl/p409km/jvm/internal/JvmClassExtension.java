package p852kotlin.reflect.jvm.internal.impl.p409km.jvm.internal;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmProperty;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.KmClassExtension;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.KmExtensionType;

/* JADX INFO: compiled from: JvmExtensionNodes.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class JvmClassExtension implements KmClassExtension {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final KmExtensionType TYPE = new KmExtensionType(Reflection.getOrCreateKotlinClass(JvmClassExtension.class));

    @Nullable
    private String anonymousObjectOriginName;
    private int jvmFlags;

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

        @NotNull
        public final KmExtensionType getTYPE() {
            return JvmClassExtension.TYPE;
        }
    }

    @Nullable
    public final String getAnonymousObjectOriginName() {
        return this.anonymousObjectOriginName;
    }

    public final int getJvmFlags() {
        return this.jvmFlags;
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

    public final void setAnonymousObjectOriginName(@Nullable String str) {
        this.anonymousObjectOriginName = str;
    }

    public final void setJvmFlags(int i11) {
        this.jvmFlags = i11;
    }

    public final void setModuleName(@Nullable String str) {
        this.moduleName = str;
    }
}
