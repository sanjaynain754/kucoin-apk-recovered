package com.kubi.utils;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import io.reactivex.Observable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.utils.g0 */
/* JADX INFO: compiled from: ObservableLast.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\u0006\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00018\u00008\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lio/reactivex/Observable;", "Lcom/kubi/utils/a0;", "predicate", "Lcom/kubi/utils/ObservableLast;", "kotlin.jvm.PlatformType", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lio/reactivex/Observable;Lcom/kubi/utils/a0;)Lcom/kubi/utils/ObservableLast;", "Utils_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C27050g0 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> ObservableLast<T> m66716a(@NotNull Observable<T> observable, @NotNull AbstractC27013a0<T> predicate) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new ObservableLast<>(observable, predicate);
    }
}
