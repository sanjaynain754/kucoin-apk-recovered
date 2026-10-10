package com.kubi.network.retrofit.utils;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.sequences.SequencesKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: ApiMonitor.kt */
/* JADX INFO: loaded from: classes64.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\fR8\u0010\u0011\u001a&\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u00050\u0005 \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u000f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/network/retrofit/utils/ApiMonitor;", "", "<init>", "()V", "", "", "paths", "", "b", "(Ljava/util/List;)V", "path", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)Ljava/lang/String;", "", "kotlin.jvm.PlatformType", "", "Ljava/util/Set;", "apiPaths", "network-core-retrofit_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nApiMonitor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiMonitor.kt\ncom/kubi/network/retrofit/utils/ApiMonitor\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,45:1\n1295#2,2:46\n*S KotlinDebug\n*F\n+ 1 ApiMonitor.kt\ncom/kubi/network/retrofit/utils/ApiMonitor\n*L\n21#1:46,2\n*E\n"})
public final class ApiMonitor {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ApiMonitor f35967a = new ApiMonitor();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Set<String> apiPaths = Collections.newSetFromMap(new ConcurrentHashMap());

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final String m42818a(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        String string = StringsKt.trim((CharSequence) path).toString();
        if (apiPaths.contains(string)) {
            return string;
        }
        return null;
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m42819b(@NotNull List<String> paths) {
        Intrinsics.checkNotNullParameter(paths, "paths");
        Iterator it = SequencesKt.filter(SequencesKt.map(CollectionsKt.asSequence(paths), new Function1<String, String>() { // from class: com.kubi.network.retrofit.utils.ApiMonitor$saveApiPaths$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final String invoke(@NotNull String it2) {
                Intrinsics.checkNotNullParameter(it2, "it");
                return StringsKt.trim((CharSequence) it2).toString();
            }
        }), new Function1<String, Boolean>() { // from class: com.kubi.network.retrofit.utils.ApiMonitor$saveApiPaths$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull String it2) {
                Intrinsics.checkNotNullParameter(it2, "it");
                return Boolean.valueOf(it2.length() > 0);
            }
        }).iterator();
        while (it.hasNext()) {
            apiPaths.add((String) it.next());
        }
    }
}
