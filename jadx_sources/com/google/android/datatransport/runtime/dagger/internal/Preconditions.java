package com.google.android.datatransport.runtime.dagger.internal;

/* JADX INFO: loaded from: classes.dex */
public final class Preconditions {
    public static <T> T checkNotNull(T t11) {
        t11.getClass();
        return t11;
    }

    public static <T> void checkBuilderRequirement(T t11, Class<T> cls) {
        if (t11 != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    public static <T> T checkNotNull(T t11, String str) {
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException(str);
    }

    public static <T> T checkNotNullFromComponent(T t11) {
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }

    public static <T> T checkNotNullFromProvides(T t11) {
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    private Preconditions() {
    }

    public static <T> T checkNotNull(T t11, String str, Object obj) {
        String strValueOf;
        if (t11 != null) {
            return t11;
        }
        if (str.contains("%s")) {
            if (str.indexOf("%s") == str.lastIndexOf("%s")) {
                if (obj instanceof Class) {
                    strValueOf = ((Class) obj).getCanonicalName();
                } else {
                    strValueOf = String.valueOf(obj);
                }
                throw new NullPointerException(str.replace("%s", strValueOf));
            }
            throw new IllegalArgumentException("errorMessageTemplate has more than one format specifier");
        }
        throw new IllegalArgumentException("errorMessageTemplate has no format specifiers");
    }
}
