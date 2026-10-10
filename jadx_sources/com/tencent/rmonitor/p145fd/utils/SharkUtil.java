package com.tencent.rmonitor.p145fd.utils;

import com.tencent.bugly.proguard.C33580c6;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import shark.C44455h;
import shark.C44488j;
import shark.HeapObject;
import shark.Hprof;
import shark.HprofHeapGraph;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0007J\"\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007J\u001a\u0010\r\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0007J \u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007J\"\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007R\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m90084d2 = {"Lcom/tencent/rmonitor/fd/utils/SharkUtil;", "", "Ljava/io/File;", "dumpFile", "Lcom/tencent/bugly/proguard/c6;", "getHprofHeapGraph", "Lshark/HeapObject$HeapInstance;", "instance", "", "filedName", "", "getIntField", "declaringClass", "getStringField", "getInstanceField", "TAG", "Ljava/lang/String;", "<init>", "()V", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0})
public final class SharkUtil {

    @NotNull
    public static final SharkUtil INSTANCE = new SharkUtil();

    @NotNull
    private static final String TAG = "SharkUtil";

    @JvmStatic
    public static final int getIntField(@Nullable HeapObject.HeapInstance instance, @NotNull String filedName) {
        C44455h c44455hM98028j;
        C44488j value;
        Integer numM98433a;
        Intrinsics.checkNotNullParameter(filedName, "filedName");
        if (instance == null || (c44455hM98028j = instance.m98028j(instance.m98034p(), filedName)) == null || (value = c44455hM98028j.getValue()) == null || (numM98433a = value.m98433a()) == null) {
            return -1;
        }
        return numM98433a.intValue();
    }

    @JvmStatic
    @NotNull
    public static final String getStringField(@Nullable HeapObject.HeapInstance instance, @NotNull String filedName) {
        C44455h c44455hM98028j;
        C44488j value;
        String strM98439g;
        Intrinsics.checkNotNullParameter(filedName, "filedName");
        return (instance == null || (c44455hM98028j = instance.m98028j(instance.m98034p(), filedName)) == null || (value = c44455hM98028j.getValue()) == null || (strM98439g = value.m98439g()) == null) ? "" : strM98439g;
    }

    @JvmStatic
    @NotNull
    public static final C33580c6 getHprofHeapGraph(@NotNull File dumpFile) {
        Intrinsics.checkNotNullParameter(dumpFile, "dumpFile");
        Hprof hprofOpen = Hprof.INSTANCE.open(dumpFile);
        return new C33580c6(hprofOpen, HprofHeapGraph.Companion.indexHprof$default(HprofHeapGraph.INSTANCE, hprofOpen, null, null, 6, null));
    }

    @JvmStatic
    @Nullable
    public static final HeapObject.HeapInstance getInstanceField(@NotNull HeapObject.HeapInstance instance, @NotNull String declaringClass, @NotNull String filedName) {
        C44488j value;
        HeapObject heapObjectM98436d;
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(declaringClass, "declaringClass");
        Intrinsics.checkNotNullParameter(filedName, "filedName");
        C44455h c44455hM98028j = instance.m98028j(declaringClass, filedName);
        if (c44455hM98028j == null || (value = c44455hM98028j.getValue()) == null || (heapObjectM98436d = value.m98436d()) == null) {
            return null;
        }
        return heapObjectM98436d.m98004d();
    }

    @JvmStatic
    public static final int getIntField(@Nullable HeapObject.HeapInstance instance, @NotNull String declaringClass, @NotNull String filedName) {
        C44455h c44455hM98028j;
        C44488j value;
        Integer numM98433a;
        Intrinsics.checkNotNullParameter(declaringClass, "declaringClass");
        Intrinsics.checkNotNullParameter(filedName, "filedName");
        if (instance == null || (c44455hM98028j = instance.m98028j(declaringClass, filedName)) == null || (value = c44455hM98028j.getValue()) == null || (numM98433a = value.m98433a()) == null) {
            return -1;
        }
        return numM98433a.intValue();
    }

    @JvmStatic
    @NotNull
    public static final String getStringField(@NotNull HeapObject.HeapInstance instance, @NotNull String declaringClass, @NotNull String filedName) {
        C44488j value;
        String strM98439g;
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(declaringClass, "declaringClass");
        Intrinsics.checkNotNullParameter(filedName, "filedName");
        C44455h c44455hM98028j = instance.m98028j(declaringClass, filedName);
        return (c44455hM98028j == null || (value = c44455hM98028j.getValue()) == null || (strM98439g = value.m98439g()) == null) ? "" : strM98439g;
    }

    private SharkUtil() {
    }
}
