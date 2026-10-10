package androidx.savedstate.serialization;

import android.os.Bundle;
import androidx.savedstate.serialization.serializers.SavedStateSerializer;
import kotlinx.serialization.modules.C41967c;
import kotlinx.serialization.modules.C41969e;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import yg0.AbstractC46494a;

/* JADX INFO: compiled from: SavedStateConfiguration.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a2\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Landroidx/savedstate/serialization/SavedStateConfiguration;", "from", "Lkotlin/Function1;", "Landroidx/savedstate/serialization/SavedStateConfiguration$Builder;", "", "Lkotlin/ExtensionFunctionType;", "builderAction", "SavedStateConfiguration", "(Landroidx/savedstate/serialization/SavedStateConfiguration;Lkotlin/jvm/functions/Function1;)Landroidx/savedstate/serialization/SavedStateConfiguration;", "Lyg0/a;", "DEFAULT_SERIALIZERS_MODULE", "Lyg0/a;", "savedstate_release"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSavedStateConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateConfiguration.kt\nandroidx/savedstate/serialization/SavedStateConfigurationKt\n+ 2 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuildersKt\n*L\n1#1,138:1\n31#2,2:139\n243#2:141\n33#2:142\n*S KotlinDebug\n*F\n+ 1 SavedStateConfiguration.kt\nandroidx/savedstate/serialization/SavedStateConfigurationKt\n*L\n137#1:139,2\n137#1:141\n137#1:142\n*E\n"})
public final class SavedStateConfigurationKt {

    @NotNull
    private static final AbstractC46494a DEFAULT_SERIALIZERS_MODULE;

    @JvmOverloads
    @NotNull
    public static final SavedStateConfiguration SavedStateConfiguration(@NotNull Function1<? super SavedStateConfiguration.Builder, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        return SavedStateConfiguration$default(null, builderAction, 1, null);
    }

    static {
        C41967c c41967c = new C41967c();
        c41967c.mo91989b(Reflection.getOrCreateKotlinClass(Bundle.class), SavedStateSerializer.INSTANCE);
        DEFAULT_SERIALIZERS_MODULE = C41969e.m92046c(c41967c.m92035f(), SavedStateConfig_androidKt.getDefaultSerializersModuleOnPlatform());
    }

    @JvmOverloads
    @NotNull
    public static final SavedStateConfiguration SavedStateConfiguration(@NotNull SavedStateConfiguration from, @NotNull Function1<? super SavedStateConfiguration.Builder, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        SavedStateConfiguration.Builder builder = new SavedStateConfiguration.Builder(from);
        builderAction.invoke(builder);
        return builder.build$savedstate_release();
    }

    public static /* synthetic */ SavedStateConfiguration SavedStateConfiguration$default(SavedStateConfiguration savedStateConfiguration, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        return SavedStateConfiguration(savedStateConfiguration, function1);
    }
}
