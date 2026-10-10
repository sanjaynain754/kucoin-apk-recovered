package tf0;

import java.util.ServiceConfigurationError;

/* JADX INFO: renamed from: tf0.a */
/* JADX INFO: compiled from: Provider.java */
/* JADX INFO: loaded from: classes60.dex */
public final class C44940a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static <T> T m99387a(Class<?> cls, Class<T> cls2) {
        try {
            return (T) cls.asSubclass(cls2).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e11) {
            throw new ServiceConfigurationError("Provider " + cls.getName() + " could not be instantiated.", e11);
        }
    }
}
