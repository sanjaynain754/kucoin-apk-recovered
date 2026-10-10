package io.trtc.tuikit.atomicxcore.impl.message;

import com.tencent.imsdk.p128v2.V2TIMCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.impl.common.AbstractC39512t;
import java.util.concurrent.ConcurrentHashMap;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.message.j */
/* JADX INFO: loaded from: classes61.dex */
public final class C39840j implements V2TIMCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f88534a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f88535b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f88536c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ CompletionHandler f88537d;

    public C39840j(String str, String str2, boolean z11, CompletionHandler completionHandler) {
        this.f88534a = str;
        this.f88535b = str2;
        this.f88536c = z11;
        this.f88537d = completionHandler;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onError(int i11, String str) {
        CompletionHandler completionHandler = this.f88537d;
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
        AbstractC39512t.m88254a("onMessagePinned", MapsKt.mapOf(TuplesKt.m90091to("messageID", this.f88534a), TuplesKt.m90091to("groupID", this.f88535b), TuplesKt.m90091to("isPinned", Boolean.valueOf(this.f88536c))));
        CompletionHandler completionHandler = this.f88537d;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
