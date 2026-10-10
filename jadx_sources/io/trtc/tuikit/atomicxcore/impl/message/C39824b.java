package io.trtc.tuikit.atomicxcore.impl.message;

import com.tencent.imsdk.BaseConstants;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.impl.common.AbstractC39512t;
import java.util.concurrent.ConcurrentHashMap;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.message.b */
/* JADX INFO: loaded from: classes61.dex */
public final class C39824b implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CompletionHandler f88485a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f88486b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f88487c;

    public C39824b(CompletionHandler completionHandler, String str, String str2) {
        this.f88485a = completionHandler;
        this.f88486b = str;
        this.f88487c = str2;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        CompletionHandler completionHandler = this.f88485a;
        if (completionHandler != null) {
            if (str == null) {
                str = "";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        String str = (String) obj;
        if (str == null || str.length() == 0) {
            CompletionHandler completionHandler = this.f88485a;
            if (completionHandler != null) {
                completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "Conversion result is null");
                return;
            }
            return;
        }
        ConcurrentHashMap concurrentHashMap = AbstractC39512t.f87709a;
        AbstractC39512t.m88254a("onVoiceConvertedToText", MapsKt.mapOf(TuplesKt.m90091to("messageID", this.f88486b), TuplesKt.m90091to("language", this.f88487c), TuplesKt.m90091to("asrText", str)));
        CompletionHandler completionHandler2 = this.f88485a;
        if (completionHandler2 != null) {
            completionHandler2.onSuccess();
        }
    }
}
