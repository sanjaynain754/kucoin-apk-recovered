package com.kubi.kumex.utils;

import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kumex.utils.b */
/* JADX INFO: compiled from: CollectionEx.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a*\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0005¨\u0006\u0006"}, m90084d2 = {"removeIfc", "", ExifInterface.GPS_DIRECTION_TRUE, "", "predicate", "Lkotlin/Function1;", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C17035b {
    /* JADX INFO: renamed from: a */
    public static final <T> boolean m36494a(@NotNull Collection<T> collection, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Iterator<T> it = collection.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue()) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }
}
