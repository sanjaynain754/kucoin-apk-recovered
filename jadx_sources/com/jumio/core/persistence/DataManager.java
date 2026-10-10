package com.jumio.core.persistence;

import androidx.exifinterface.media.ExifInterface;
import com.jumio.commons.PersistWith;
import com.jumio.commons.log.Log;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import jumio.core.C40574O2;
import jumio.core.C40579P2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\b\"\b\b\u0000\u0010\t*\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u000bJ#\u0010\f\u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u000b¢\u0006\u0002\u0010\rJ+\u0010\u000e\u001a\u00020\u000f\"\b\b\u0000\u0010\t*\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u000b2\u0006\u0010\u0010\u001a\u0002H\t¢\u0006\u0002\u0010\u0011J'\u0010\u0012\u001a\u00020\u000f2\u001a\u0010\u0013\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\u0014\"\u0006\u0012\u0002\b\u00030\u000b¢\u0006\u0002\u0010\u0015J\u0006\u0010\u0016\u001a\u00020\u000fJ\u000e\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0014\u0010\u001d\u001a\u00020\u00062\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m90084d2 = {"Lcom/jumio/core/persistence/DataManager;", "Ljava/io/Serializable;", "<init>", "()V", "objectStore", "Ljava/util/concurrent/ConcurrentHashMap;", "", "has", "", ExifInterface.GPS_DIRECTION_TRUE, "clazz", "Ljava/lang/Class;", "get", "(Ljava/lang/Class;)Ljava/io/Serializable;", "put", "", "model", "(Ljava/lang/Class;Ljava/io/Serializable;)V", "remove", "clazzes", "", "([Ljava/lang/Class;)V", "removeAll", "persist", "persistor", "Lcom/jumio/core/persistence/PersistenceUtil$Persist;", "restore", "restorer", "Lcom/jumio/core/persistence/PersistenceUtil$Restore;", "checkAnnotated", "c", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDataManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataManager.kt\ncom/jumio/core/persistence/DataManager\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,91:1\n13402#2,2:92\n*S KotlinDebug\n*F\n+ 1 DataManager.kt\ncom/jumio/core/persistence/DataManager\n*L\n61#1:92,2\n*E\n"})
public final class DataManager implements Serializable {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f14464a = new ConcurrentHashMap();

    @NotNull
    public final synchronized <T extends Serializable> T get(@NotNull Class<T> clazz) throws IllegalAccessException, InstantiationException, SecurityException {
        T t11;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        try {
            t11 = (T) this.f14464a.get(m14578a(clazz));
            if (t11 == null) {
                T tNewInstance = clazz.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                T t12 = tNewInstance;
                Intrinsics.checkNotNull(t12);
                put(clazz, t12);
                t11 = tNewInstance;
            }
            Intrinsics.checkNotNull(t11);
        } catch (Exception e11) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.ENGLISH, "Error loading %s", Arrays.copyOf(new Object[]{clazz.getName()}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            Log.m14485w("DataAccess", str, e11);
            T tNewInstance2 = clazz.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            T t13 = tNewInstance2;
            Intrinsics.checkNotNull(t13);
            put(clazz, t13);
            Intrinsics.checkNotNull(tNewInstance2);
            return t13;
        }
        return t11;
    }

    public final synchronized <T extends Serializable> boolean has(@NotNull Class<T> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        try {
        } catch (Exception e11) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.ENGLISH, "Error looking for %s", Arrays.copyOf(new Object[]{clazz.getName()}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            Log.m14485w("DataAccess", str, e11);
            return false;
        }
        return this.f14464a.containsKey(m14578a(clazz));
    }

    public final synchronized void persist(@NotNull C40574O2 persistor) {
        Intrinsics.checkNotNullParameter(persistor, "persistor");
        persistor.m89207a(this.f14464a);
    }

    public final synchronized <T extends Serializable> void put(@NotNull Class<T> clazz, @NotNull T model) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(model, "model");
        try {
            this.f14464a.put(m14578a(clazz), model);
        } catch (RuntimeException e11) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.ENGLISH, "Error persisting %s", Arrays.copyOf(new Object[]{clazz.getName()}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            Log.m14485w("DataAccess", str, e11);
        }
    }

    public final synchronized void remove(@NotNull Class<?>... clazzes) {
        Intrinsics.checkNotNullParameter(clazzes, "clazzes");
        for (Class<?> cls : clazzes) {
            this.f14464a.remove(m14578a(cls));
        }
    }

    public final synchronized void removeAll() {
        this.f14464a.clear();
    }

    public final synchronized void restore(@NotNull C40579P2 restorer) {
        Intrinsics.checkNotNullParameter(restorer, "restorer");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) restorer.m89209a();
        if (concurrentHashMap != null) {
            this.f14464a.putAll(concurrentHashMap);
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m14578a(Class cls) {
        PersistWith persistWith = (PersistWith) cls.getAnnotation(PersistWith.class);
        if (persistWith != null) {
            return persistWith.value();
        }
        throw new RuntimeException("Class " + cls.getName() + " must be annotated with PersistWith!");
    }
}
