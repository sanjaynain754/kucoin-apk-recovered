package androidx.lifecycle.serialization;

import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.internal.CanonicalName_jvmKt;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.serialization.SavedStateConfiguration;
import androidx.savedstate.serialization.SavedStateDecoderKt;
import androidx.savedstate.serialization.SavedStateEncoderKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.properties.ReadWriteProperty;
import p852kotlin.reflect.KProperty;
import tg0.InterfaceC44951d;

/* JADX INFO: compiled from: SavedStateHandleDelegate.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00028\u00000\u0003B=\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0018\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00012\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00028\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u00012\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001d\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00012\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u001c\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010#R\u0016\u0010\u001c\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010$¨\u0006%"}, m90084d2 = {"Landroidx/lifecycle/serialization/SavedStateHandleDelegate;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/properties/ReadWriteProperty;", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Ltg0/d;", "serializer", "", "key", "Landroidx/savedstate/serialization/SavedStateConfiguration;", "configuration", "Lkotlin/Function0;", "init", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Ltg0/d;Ljava/lang/String;Landroidx/savedstate/serialization/SavedStateConfiguration;Lkotlin/jvm/functions/Function0;)V", "loadValue", "(Ljava/lang/String;)Ljava/lang/Object;", "", "registerSave", "(Ljava/lang/String;)V", "thisRef", "Lkotlin/reflect/KProperty;", "property", "createDefaultKey", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/String;", "getValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "value", "setValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "Landroidx/lifecycle/SavedStateHandle;", "Ltg0/d;", "Ljava/lang/String;", "Landroidx/savedstate/serialization/SavedStateConfiguration;", "Lkotlin/jvm/functions/Function0;", "Ljava/lang/Object;", "lifecycle-viewmodel-savedstate_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
final class SavedStateHandleDelegate<T> implements ReadWriteProperty<Object, T> {

    @NotNull
    private final SavedStateConfiguration configuration;

    @NotNull
    private final Function0<T> init;

    @Nullable
    private final String key;

    @NotNull
    private final SavedStateHandle savedStateHandle;

    @NotNull
    private final InterfaceC44951d<T> serializer;
    private T value;

    private final String createDefaultKey(Object thisRef, KProperty<?> property) {
        String str;
        if (thisRef != null) {
            str = CanonicalName_jvmKt.getCanonicalName(Reflection.getOrCreateKotlinClass(thisRef.getClass())) + '.';
        } else {
            str = "";
        }
        return str + property.getName();
    }

    private final T loadValue(String key) {
        Bundle bundle = (Bundle) this.savedStateHandle.get(key);
        if (bundle != null) {
            return (T) SavedStateDecoderKt.decodeFromSavedState(this.serializer, bundle, this.configuration);
        }
        return null;
    }

    private final void registerSave(String key) {
        this.savedStateHandle.setSavedStateProvider(key, new SavedStateRegistry.SavedStateProvider() { // from class: androidx.lifecycle.serialization.a
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                return SavedStateHandleDelegate.registerSave$lambda$1(this.f2783a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle registerSave$lambda$1(SavedStateHandleDelegate savedStateHandleDelegate) {
        InterfaceC44951d<T> interfaceC44951d = savedStateHandleDelegate.serializer;
        Object obj = savedStateHandleDelegate.value;
        if (obj == null) {
            Intrinsics.throwUninitializedPropertyAccessException("value");
            obj = Unit.INSTANCE;
        }
        return SavedStateEncoderKt.encodeToSavedState(interfaceC44951d, obj, savedStateHandleDelegate.configuration);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SavedStateHandleDelegate(@NotNull SavedStateHandle savedStateHandle, @NotNull InterfaceC44951d<T> serializer, @Nullable String str, @NotNull SavedStateConfiguration configuration, @NotNull Function0<? extends T> init) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(init, "init");
        this.savedStateHandle = savedStateHandle;
        this.serializer = serializer;
        this.key = str;
        this.configuration = configuration;
        this.init = init;
    }

    @Override // p852kotlin.properties.ReadWriteProperty, p852kotlin.properties.ReadOnlyProperty
    @NotNull
    public T getValue(@Nullable Object thisRef, @NotNull KProperty<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        if (this.value == null) {
            String strCreateDefaultKey = this.key;
            if (strCreateDefaultKey == null) {
                strCreateDefaultKey = createDefaultKey(thisRef, property);
            }
            registerSave(strCreateDefaultKey);
            T tLoadValue = loadValue(strCreateDefaultKey);
            if (tLoadValue == null) {
                tLoadValue = this.init.invoke();
            }
            this.value = tLoadValue;
        }
        T t11 = this.value;
        if (t11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("value");
            return (T) Unit.INSTANCE;
        }
        return t11;
    }

    @Override // p852kotlin.properties.ReadWriteProperty
    public void setValue(@Nullable Object thisRef, @NotNull KProperty<?> property, @NotNull T value) {
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.value == null) {
            String strCreateDefaultKey = this.key;
            if (strCreateDefaultKey == null) {
                strCreateDefaultKey = createDefaultKey(thisRef, property);
            }
            registerSave(strCreateDefaultKey);
        }
        this.value = value;
    }
}
