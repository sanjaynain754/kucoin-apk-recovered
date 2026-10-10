package io.trtc.tuikit.atomicxcore.impl.common;

import com.tencent.imsdk.BaseConstants;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.common.e */
/* JADX INFO: loaded from: classes61.dex */
public final class C39497e extends Exception {

    /* JADX INFO: renamed from: a */
    public final int f87694a;

    /* JADX INFO: renamed from: b */
    public final String f87695b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39497e(int i11, String errorMessage) {
        super(errorMessage);
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.f87694a = i11;
        this.f87695b = errorMessage;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C39497e(Integer num, String errorMessage) {
        int iIntValue = num != null ? num.intValue() : BaseConstants.ERR_INVALID_PARAMETERS;
        errorMessage = errorMessage == null ? "" : errorMessage;
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        super(errorMessage);
        this.f87694a = iIntValue;
        this.f87695b = errorMessage;
    }
}
