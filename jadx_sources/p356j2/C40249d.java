package p356j2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: j2.d */
/* JADX INFO: compiled from: ManifestParser.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C40249d {

    /* JADX INFO: renamed from: a */
    public final Context f89472a;

    /* JADX INFO: renamed from: c */
    public static void m88602c(Class<?> cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }

    /* JADX INFO: renamed from: a */
    public List<InterfaceC40247b> m88603a() {
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = this.f89472a.getPackageManager().getApplicationInfo(this.f89472a.getPackageName(), 128);
            if (applicationInfo.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                }
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        arrayList.add(m88601b(str));
                        if (Log.isLoggable("ManifestParser", 3)) {
                            Log.d("ManifestParser", "Loaded Glide module: " + str);
                        }
                    }
                }
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Finished loading Glide modules");
                }
            } else if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Got null app info metadata");
                return arrayList;
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException e11) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e11);
        }
    }

    public C40249d(Context context) {
        this.f89472a = context;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC40247b m88601b(String str) {
        Object objNewInstance;
        try {
            Class<?> cls = Class.forName(str);
            try {
                objNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException e11) {
                m88602c(cls, e11);
                objNewInstance = null;
            } catch (InstantiationException e12) {
                m88602c(cls, e12);
                objNewInstance = null;
            } catch (NoSuchMethodException e13) {
                m88602c(cls, e13);
                objNewInstance = null;
            } catch (InvocationTargetException e14) {
                m88602c(cls, e14);
                objNewInstance = null;
            }
            if (objNewInstance instanceof InterfaceC40247b) {
                return (InterfaceC40247b) objNewInstance;
            }
            throw new RuntimeException("Expected instanceof GlideModule, but found: " + objNewInstance);
        } catch (ClassNotFoundException e15) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e15);
        }
    }
}
