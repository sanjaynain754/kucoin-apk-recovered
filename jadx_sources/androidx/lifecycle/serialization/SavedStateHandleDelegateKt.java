package androidx.lifecycle.serialization;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.SavedStateHandle;
import androidx.savedstate.serialization.SavedStateConfiguration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.MagicApiIntrinsics;
import p852kotlin.properties.ReadWriteProperty;
import p852kotlin.reflect.KType;
import tg0.C44971x;
import tg0.InterfaceC44951d;
import yg0.AbstractC46494a;

/* JADX INFO: compiled from: SavedStateHandleDelegate.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aW\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00028\u00000\t\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\b\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a[\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00028\u00000\t\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\n\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, m90084d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/SavedStateHandle;", "", "key", "Landroidx/savedstate/serialization/SavedStateConfiguration;", "configuration", "Lkotlin/Function0;", "init", "Lkotlin/properties/ReadWriteProperty;", "saved", "(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Landroidx/savedstate/serialization/SavedStateConfiguration;Lkotlin/jvm/functions/Function0;)Lkotlin/properties/ReadWriteProperty;", "Ltg0/d;", "serializer", "(Landroidx/lifecycle/SavedStateHandle;Ltg0/d;Ljava/lang/String;Landroidx/savedstate/serialization/SavedStateConfiguration;Lkotlin/jvm/functions/Function0;)Lkotlin/properties/ReadWriteProperty;", "lifecycle-viewmodel-savedstate_release"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class SavedStateHandleDelegateKt {
    public static final /* synthetic */ <T> ReadWriteProperty<Object, T> saved(SavedStateHandle savedStateHandle, String str, SavedStateConfiguration configuration, Function0<? extends T> init) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "<this>");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(init, "init");
        AbstractC46494a serializersModule = configuration.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return saved(savedStateHandle, C44971x.serializer(serializersModule, (KType) null), str, configuration, init);
    }

    public static /* synthetic */ ReadWriteProperty saved$default(SavedStateHandle savedStateHandle, String str, SavedStateConfiguration configuration, Function0 init, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            configuration = SavedStateConfiguration.DEFAULT;
        }
        Intrinsics.checkNotNullParameter(savedStateHandle, "<this>");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(init, "init");
        AbstractC46494a serializersModule = configuration.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return saved(savedStateHandle, C44971x.serializer(serializersModule, (KType) null), str, configuration, init);
    }

    @NotNull
    public static final <T> ReadWriteProperty<Object, T> saved(@NotNull SavedStateHandle savedStateHandle, @NotNull InterfaceC44951d<T> serializer, @Nullable String str, @NotNull SavedStateConfiguration configuration, @NotNull Function0<? extends T> init) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "<this>");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(init, "init");
        return new SavedStateHandleDelegate(savedStateHandle, serializer, str, configuration, init);
    }

    public static /* synthetic */ ReadWriteProperty saved$default(SavedStateHandle savedStateHandle, InterfaceC44951d interfaceC44951d, String str, SavedStateConfiguration savedStateConfiguration, Function0 function0, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        return saved(savedStateHandle, interfaceC44951d, str, savedStateConfiguration, function0);
    }
}
