package io.trtc.tuikit.atomicxcore.impl.message;

import com.tencent.imsdk.p128v2.V2TIMCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.impl.common.AbstractC39512t;
import java.util.concurrent.ConcurrentHashMap;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.message.k */
/* JADX INFO: loaded from: classes61.dex */
public final class C39842k implements V2TIMCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f88544a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f88545b;

    public C39842k(String str, CompletionHandler completionHandler) {
        this.f88544a = str;
        this.f88545b = completionHandler;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onError(int i11, String str) {
        CompletionHandler completionHandler = this.f88545b;
        if (completionHandler != null) {
            if (str == null) {
                str = "";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onSuccess() {
        ConcurrentHashMap concurrentHashMap = AbstractC39512t.f87709a;
        AbstractC39512t.m88254a("onMessageRecalled", MapsKt.mapOf(TuplesKt.m90091to("messageID", this.f88544a)));
        CompletionHandler completionHandler = this.f88545b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
