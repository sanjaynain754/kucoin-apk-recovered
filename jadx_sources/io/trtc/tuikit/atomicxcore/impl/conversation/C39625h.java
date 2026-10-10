package io.trtc.tuikit.atomicxcore.impl.conversation;

import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.conversation.h */
/* JADX INFO: loaded from: classes61.dex */
public final class C39625h implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39627j f88027a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f88028b;

    public C39625h(C39627j c39627j, CompletionHandler completionHandler) {
        this.f88027a = c39627j;
        this.f88028b = completionHandler;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        CompletionHandler completionHandler = this.f88028b;
        if (completionHandler != null) {
            if (str == null) {
                str = "Unknown error";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        List listEmptyList = (List) obj;
        InterfaceC41669n interfaceC41669n = this.f88027a.f88033a;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        interfaceC41669n.setValue(listEmptyList);
        CompletionHandler completionHandler = this.f88028b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
