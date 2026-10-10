package com.kubi.kumex.utils;

import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46396e;

/* JADX INFO: renamed from: com.kubi.kumex.utils.g0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: Persistence.kt */
/* JADX INFO: loaded from: classes20.dex */
@Deprecated(message = "use KVStore", replaceWith = @ReplaceWith(expression = "KVStore", imports = {}))
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\nJ\u0016\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u000eJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u000eJ\u0016\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0005J\u0016\u0010\u0012\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0013J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0013J\u000e\u0010\u0015\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J0\u0010\u0016\u001a\u0004\u0018\u0001H\u0017\"\n\b\u0000\u0010\u0017\u0018\u0001*\u00020\u00182\u0006\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u0001H\u0017H\u0086\b¢\u0006\u0002\u0010\u0019J*\u0010\u001a\u001a\u00020\u0007\"\n\b\u0000\u0010\u0017\u0018\u0001*\u00020\u00182\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u0002H\u0017H\u0086\b¢\u0006\u0002\u0010\u001bJ3\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00170\u001d\"\n\b\u0000\u0010\u0017\u0018\u0001*\u00020\u00182\u0006\u0010\b\u001a\u00020\u00052\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00170\u001dH\u0086\bJ&\u0010\u001e\u001a\u00020\u0007\"\b\b\u0000\u0010\u0017*\u00020\u00182\u0006\u0010\b\u001a\u00020\u00052\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00170\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006 "}, m90084d2 = {"Lcom/kubi/kumex/utils/Persistence;", "", "<init>", "()V", "CATEGORY", "", "putBoolean", "", "key", "value", "", "getBoolean", "defaultValue", "putInt", "", "getInt", "putString", "getString", "putLong", "", "getLong", "removeString", "getObj", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/os/Parcelable;", "(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/os/Parcelable;", "putObj", "(Ljava/lang/String;Landroid/os/Parcelable;)V", "getObjList", "", "putObjList", "jsonList", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPersistence.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Persistence.kt\ncom/kubi/kumex/utils/Persistence\n+ 2 MMKVHelper.kt\ncom/kubi/utils/storage/MMKVHelper\n+ 3 KVStore.kt\ncom/kubi/utils/storage/KVStore\n*L\n1#1,116:1\n139#2:117\n17#2:118\n172#2:120\n17#2:121\n172#2:122\n17#2:123\n178#3:119\n*S KotlinDebug\n*F\n+ 1 Persistence.kt\ncom/kubi/kumex/utils/Persistence\n*L\n83#1:117\n83#1:118\n100#1:120\n100#1:121\n100#1:122\n100#1:123\n83#1:119\n*E\n"})
public final class Persistence {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Persistence f30799a = new Persistence();

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m36514b(Persistence persistence, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return persistence.m36516a(str, z11);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m36515e(Persistence persistence, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = "";
        }
        return persistence.m36518d(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m36516a(@NotNull String key, boolean z11) {
        Intrinsics.checkNotNullParameter(key, "key");
        return C46396e.m102347d("BKuMex", key, z11);
    }

    /* JADX INFO: renamed from: c */
    public final int m36517c(@NotNull String key, int i11) {
        Intrinsics.checkNotNullParameter(key, "key");
        return C46396e.m102348e("BKuMex", key, i11);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final String m36518d(@NotNull String key, @NotNull String defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return C46396e.m102351h("BKuMex", key, defaultValue);
    }

    /* JADX INFO: renamed from: f */
    public final void m36519f(@NotNull String key, boolean z11) {
        Intrinsics.checkNotNullParameter(key, "key");
        C46396e.m102354k("BKuMex", key, z11);
    }

    /* JADX INFO: renamed from: g */
    public final void m36520g(@NotNull String key, int i11) {
        Intrinsics.checkNotNullParameter(key, "key");
        C46396e.m102355l("BKuMex", key, i11);
    }

    /* JADX INFO: renamed from: h */
    public final void m36521h(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        C46396e.m102358o("BKuMex", key, value);
    }
}
