package io.trtc.tuikit.atomicxcore.impl.search;

import com.tencent.imsdk.p128v2.V2TIMMessageSearchResult;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.impl.common.C39497e;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.SafeContinuation;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.search.l */
/* JADX INFO: loaded from: classes61.dex */
public final class C39977l implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SafeContinuation f88882a;

    public C39977l(SafeContinuation safeContinuation) {
        this.f88882a = safeContinuation;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        SafeContinuation safeContinuation = this.f88882a;
        Result.Companion companion = Result.INSTANCE;
        if (str == null) {
            str = "Message search failed";
        }
        safeContinuation.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(new C39497e(i11, str))));
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        Unit unit;
        V2TIMMessageSearchResult v2TIMMessageSearchResult = (V2TIMMessageSearchResult) obj;
        if (v2TIMMessageSearchResult != null) {
            this.f88882a.resumeWith(Result.m103844constructorimpl(v2TIMMessageSearchResult));
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            SafeContinuation safeContinuation = this.f88882a;
            Result.Companion companion = Result.INSTANCE;
            safeContinuation.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(new C39497e(-1, "Internal error"))));
        }
    }
}
