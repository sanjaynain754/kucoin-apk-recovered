package io.trtc.tuikit.atomicxcore.impl.message;

import com.tencent.imsdk.BaseConstants;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.impl.common.AbstractC39512t;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.message.n */
/* JADX INFO: loaded from: classes61.dex */
public final class C39848n implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CompletionHandler f88556a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f88557b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f88558c;

    public C39848n(CompletionHandler completionHandler, String str, String str2) {
        this.f88556a = completionHandler;
        this.f88557b = str;
        this.f88558c = str2;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        CompletionHandler completionHandler = this.f88556a;
        if (completionHandler != null) {
            if (str == null) {
                str = "";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        HashMap map = (HashMap) obj;
        if (map == null) {
            CompletionHandler completionHandler = this.f88556a;
            if (completionHandler != null) {
                completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "Translation result is null");
                return;
            }
            return;
        }
        ConcurrentHashMap concurrentHashMap = AbstractC39512t.f87709a;
        AbstractC39512t.m88254a("onMessageTranslated", MapsKt.mapOf(TuplesKt.m90091to("messageID", this.f88557b), TuplesKt.m90091to("targetLanguage", this.f88558c), TuplesKt.m90091to("translatedTextMap", map)));
        CompletionHandler completionHandler2 = this.f88556a;
        if (completionHandler2 != null) {
            completionHandler2.onSuccess();
        }
    }
}
