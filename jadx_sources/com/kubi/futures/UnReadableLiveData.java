package com.kubi.futures;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.MutableLiveData;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.futures.m, reason: from Kotlin metadata */
/* JADX INFO: compiled from: UnReadableLiveData.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/futures/UnReadableLiveData;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/MutableLiveData;", "<init>", "()V", "getValue", "()Ljava/lang/Object;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class UnReadableLiveData<T> extends MutableLiveData<T> {
    @Override // androidx.lifecycle.LiveData
    @Nullable
    public T getValue() {
        throw new RuntimeException("Prohibited call getValue().");
    }
}
