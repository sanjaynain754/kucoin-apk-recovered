package androidx.savedstate.serialization;

import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.MagicApiIntrinsics;
import p852kotlin.reflect.KType;
import tg0.C44971x;
import tg0.InterfaceC44949c;
import yg0.AbstractC46494a;

/* JADX INFO: compiled from: SavedStateDecoder.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a2\u0010\u0007\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086\b¢\u0006\u0004\b\u0007\u0010\b\u001a=\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, m90084d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "savedState", "Landroidx/savedstate/serialization/SavedStateConfiguration;", "configuration", "decodeFromSavedState", "(Landroid/os/Bundle;Landroidx/savedstate/serialization/SavedStateConfiguration;)Ljava/lang/Object;", "Ltg0/c;", "deserializer", "(Ltg0/c;Landroid/os/Bundle;Landroidx/savedstate/serialization/SavedStateConfiguration;)Ljava/lang/Object;", "savedstate_release"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class SavedStateDecoderKt {
    @JvmOverloads
    @NotNull
    public static final <T> T decodeFromSavedState(@NotNull InterfaceC44949c<? extends T> deserializer, @NotNull Bundle savedState) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(savedState, "savedState");
        return (T) decodeFromSavedState$default(deserializer, savedState, null, 4, null);
    }

    public static /* synthetic */ Object decodeFromSavedState$default(Bundle savedState, SavedStateConfiguration configuration, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            configuration = SavedStateConfiguration.DEFAULT;
        }
        Intrinsics.checkNotNullParameter(savedState, "savedState");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        AbstractC46494a serializersModule = configuration.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return decodeFromSavedState(C44971x.serializer(serializersModule, (KType) null), savedState, configuration);
    }

    public static final /* synthetic */ <T> T decodeFromSavedState(Bundle savedState, SavedStateConfiguration configuration) {
        Intrinsics.checkNotNullParameter(savedState, "savedState");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        AbstractC46494a serializersModule = configuration.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (T) decodeFromSavedState(C44971x.serializer(serializersModule, (KType) null), savedState, configuration);
    }

    @JvmOverloads
    @NotNull
    public static final <T> T decodeFromSavedState(@NotNull InterfaceC44949c<? extends T> deserializer, @NotNull Bundle savedState, @NotNull SavedStateConfiguration configuration) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(savedState, "savedState");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return (T) new SavedStateDecoder(savedState, configuration).decodeSerializableValue(deserializer);
    }

    public static /* synthetic */ Object decodeFromSavedState$default(InterfaceC44949c interfaceC44949c, Bundle bundle, SavedStateConfiguration savedStateConfiguration, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        return decodeFromSavedState(interfaceC44949c, bundle, savedStateConfiguration);
    }
}
