package com.kubi.futures;

import androidx.exifinterface.media.ExifInterface;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.futures.l */
/* JADX INFO: compiled from: Observers.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a,\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0004¨\u0006\u0005"}, m90084d2 = {"handleFirst", "Lio/reactivex/Observable;", ExifInterface.GPS_DIRECTION_TRUE, "consumer", "Lio/reactivex/functions/Consumer;", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C13228l {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> Observable<T> m25657a(@NotNull Observable<T> observable, @NotNull Consumer<? super T> consumer) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        return new ObservableFirstSource(observable, consumer);
    }
}
