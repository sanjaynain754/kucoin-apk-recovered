package io.trtc.tuikit.atomicxcore.impl.message;

import com.tencent.imsdk.p128v2.V2TIMCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.impl.common.AbstractC39512t;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.message.v */
/* JADX INFO: loaded from: classes61.dex */
public final class C39861v implements V2TIMCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ArrayList f88606a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f88607b;

    public C39861v(ArrayList arrayList, CompletionHandler completionHandler) {
        this.f88606a = arrayList;
        this.f88607b = completionHandler;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onError(int i11, String str) {
        CompletionHandler completionHandler = this.f88607b;
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
        AbstractC39512t.m88254a("onMessageDeleted", MapsKt.mapOf(TuplesKt.m90091to("messageIDList", this.f88606a)));
        CompletionHandler completionHandler = this.f88607b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
