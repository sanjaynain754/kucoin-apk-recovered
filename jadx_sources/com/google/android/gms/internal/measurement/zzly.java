package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class zzly {
    public abstract zzlq zza();

    public static zzlq zzb(Class cls) {
        String str;
        ClassLoader classLoader = zzly.class.getClassLoader();
        if (cls.equals(zzlq.class)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!cls.getPackage().equals(zzly.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            str = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        }
        try {
            try {
                try {
                    return (zzlq) cls.cast(((zzly) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).zza());
                } catch (IllegalAccessException e11) {
                    throw new IllegalStateException(e11);
                } catch (InvocationTargetException e12) {
                    throw new IllegalStateException(e12);
                }
            } catch (InstantiationException e13) {
                throw new IllegalStateException(e13);
            } catch (NoSuchMethodException e14) {
                throw new IllegalStateException(e14);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(zzly.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((zzlq) cls.cast(((zzly) it.next()).zza()));
                } catch (ServiceConfigurationError e15) {
                    Logger.getLogger(zzll.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(cls.getSimpleName()), (Throwable) e15);
                }
            }
            if (arrayList.size() == 1) {
                return (zzlq) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (zzlq) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e16) {
                throw new IllegalStateException(e16);
            } catch (NoSuchMethodException e17) {
                throw new IllegalStateException(e17);
            } catch (InvocationTargetException e18) {
                throw new IllegalStateException(e18);
            }
        }
    }
}
