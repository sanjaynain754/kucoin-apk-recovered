package androidx.camera.core.internal;

import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ReadableConfig;

/* JADX INFO: loaded from: classes23.dex */
public interface TargetConfig<T> extends ReadableConfig {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final Config.Option<String> OPTION_TARGET_NAME = Config.Option.create("camerax.core.target.name", String.class);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final Config.Option<Class<?>> OPTION_TARGET_CLASS = Config.Option.create("camerax.core.target.class", Class.class);

    public interface Builder<T, B> {
        B setTargetClass(Class<T> cls);

        B setTargetName(String str);
    }

    default Class<T> getTargetClass(Class<T> cls) {
        return (Class) retrieveOption(OPTION_TARGET_CLASS, cls);
    }

    default String getTargetName(String str) {
        return (String) retrieveOption(OPTION_TARGET_NAME, str);
    }

    default Class<T> getTargetClass() {
        return (Class) retrieveOption(OPTION_TARGET_CLASS);
    }

    default String getTargetName() {
        return (String) retrieveOption(OPTION_TARGET_NAME);
    }
}
