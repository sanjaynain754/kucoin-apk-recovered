package com.jumio.commons.utils;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R\u0012\u0010\u0003\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\bÀ\u0006\u0003"}, m90084d2 = {"Lcom/jumio/commons/utils/ValueWithOffset;", ExifInterface.GPS_DIRECTION_TRUE, "", "value", "getValue", "()Ljava/lang/Object;", TypedValues.CycleType.S_WAVE_OFFSET, "getOffset", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ValueWithOffset<T> {
    T getOffset();

    T getValue();
}
