package com.kubi.kucoin.utils;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.kucoin.utils.f, reason: from Kotlin metadata */
/* JADX INFO: compiled from: BottomCompositionStore.kt */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&J\u0016\u0010\u0007\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&J\u0016\u0010\b\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H&J\u0016\u0010\n\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/kucoin/utils/BottomCompositionTask;", ExifInterface.GPS_DIRECTION_TRUE, "", "addSuccessListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/kubi/kucoin/utils/BottomTaskListener;", "removeSuccessListener", "addFailureListener", "", "removeFailureListener", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface BottomCompositionTask<T> {
    /* JADX INFO: renamed from: a */
    void mo33077a(@NotNull BottomTaskListener<Throwable> bottomTaskListener);

    /* JADX INFO: renamed from: b */
    void mo33078b(@NotNull BottomTaskListener<T> bottomTaskListener);

    /* JADX INFO: renamed from: c */
    void mo33079c(@NotNull BottomTaskListener<T> bottomTaskListener);

    /* JADX INFO: renamed from: d */
    void mo33080d(@NotNull BottomTaskListener<Throwable> bottomTaskListener);
}
