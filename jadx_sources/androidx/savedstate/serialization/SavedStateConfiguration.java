package androidx.savedstate.serialization;

import kotlinx.serialization.modules.C41969e;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import yg0.AbstractC46494a;

/* JADX INFO: compiled from: SavedStateConfiguration.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0013B'\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m90084d2 = {"Landroidx/savedstate/serialization/SavedStateConfiguration;", "", "Lyg0/a;", "serializersModule", "", "classDiscriminatorMode", "", "encodeDefaults", "<init>", "(Lyg0/a;IZ)V", "Lyg0/a;", "getSerializersModule", "()Lyg0/a;", "I", "getClassDiscriminatorMode", "()I", "Z", "getEncodeDefaults", "()Z", "Companion", "Builder", "savedstate_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class SavedStateConfiguration {

    @JvmField
    @NotNull
    public static final SavedStateConfiguration DEFAULT = new SavedStateConfiguration(null, 0, false, 7, null);
    private final int classDiscriminatorMode;
    private final boolean encodeDefaults;

    @NotNull
    private final AbstractC46494a serializersModule;

    /* JADX INFO: compiled from: SavedStateConfiguration.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b \u0010\u0018\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, m90084d2 = {"Landroidx/savedstate/serialization/SavedStateConfiguration$Builder;", "", "Landroidx/savedstate/serialization/SavedStateConfiguration;", "configuration", "<init>", "(Landroidx/savedstate/serialization/SavedStateConfiguration;)V", "build$savedstate_release", "()Landroidx/savedstate/serialization/SavedStateConfiguration;", "build", "Lyg0/a;", "serializersModule", "Lyg0/a;", "getSerializersModule", "()Lyg0/a;", "setSerializersModule", "(Lyg0/a;)V", "", "encodeDefaults", "Z", "getEncodeDefaults", "()Z", "setEncodeDefaults", "(Z)V", "getEncodeDefaults$annotations", "()V", "", "classDiscriminatorMode", "I", "getClassDiscriminatorMode", "()I", "setClassDiscriminatorMode", "(I)V", "getClassDiscriminatorMode$annotations", "savedstate_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Builder {
        private int classDiscriminatorMode;
        private boolean encodeDefaults;

        @NotNull
        private AbstractC46494a serializersModule;

        public Builder(@NotNull SavedStateConfiguration configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.serializersModule = configuration.getSerializersModule();
            this.encodeDefaults = configuration.getEncodeDefaults();
            this.classDiscriminatorMode = configuration.getClassDiscriminatorMode();
        }

        @NotNull
        public final SavedStateConfiguration build$savedstate_release() {
            return new SavedStateConfiguration(C41969e.m92045b(SavedStateConfigurationKt.DEFAULT_SERIALIZERS_MODULE, this.serializersModule), this.classDiscriminatorMode, this.encodeDefaults, null);
        }

        public final int getClassDiscriminatorMode() {
            return this.classDiscriminatorMode;
        }

        public final boolean getEncodeDefaults() {
            return this.encodeDefaults;
        }

        @NotNull
        public final AbstractC46494a getSerializersModule() {
            return this.serializersModule;
        }

        public final void setClassDiscriminatorMode(int i11) {
            this.classDiscriminatorMode = i11;
        }

        public final void setEncodeDefaults(boolean z11) {
            this.encodeDefaults = z11;
        }

        public final void setSerializersModule(@NotNull AbstractC46494a abstractC46494a) {
            Intrinsics.checkNotNullParameter(abstractC46494a, "<set-?>");
            this.serializersModule = abstractC46494a;
        }

        public static /* synthetic */ void getClassDiscriminatorMode$annotations() {
        }

        public static /* synthetic */ void getEncodeDefaults$annotations() {
        }
    }

    public /* synthetic */ SavedStateConfiguration(AbstractC46494a abstractC46494a, int i11, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC46494a, i11, z11);
    }

    private SavedStateConfiguration(AbstractC46494a abstractC46494a, int i11, boolean z11) {
        this.serializersModule = abstractC46494a;
        this.classDiscriminatorMode = i11;
        this.encodeDefaults = z11;
    }

    public final int getClassDiscriminatorMode() {
        return this.classDiscriminatorMode;
    }

    public final boolean getEncodeDefaults() {
        return this.encodeDefaults;
    }

    @NotNull
    public final AbstractC46494a getSerializersModule() {
        return this.serializersModule;
    }

    public /* synthetic */ SavedStateConfiguration(AbstractC46494a abstractC46494a, int i11, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? SavedStateConfigurationKt.DEFAULT_SERIALIZERS_MODULE : abstractC46494a, (i12 & 2) != 0 ? 2 : i11, (i12 & 4) != 0 ? false : z11);
    }
}
