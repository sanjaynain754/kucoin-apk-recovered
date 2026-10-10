package io.trtc.tuikit.atomicxcore.impl.conversation;

import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.conversation.e */
/* JADX INFO: loaded from: classes61.dex */
public final class C39622e implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39627j f88019a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f88020b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CompletionHandler f88021c;

    public C39622e(C39627j c39627j, String str, CompletionHandler completionHandler) {
        this.f88019a = c39627j;
        this.f88020b = str;
        this.f88021c = completionHandler;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        CompletionHandler completionHandler = this.f88021c;
        if (completionHandler != null) {
            if (str == null) {
                str = "Unknown error";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        Object value;
        List listPlus;
        List list = (List) obj;
        C39627j c39627j = this.f88019a;
        String str = this.f88020b;
        c39627j.getClass();
        if (str.length() != 0) {
            InterfaceC41669n interfaceC41669n = c39627j.f88033a;
            do {
                value = interfaceC41669n.getValue();
                listPlus = (List) value;
                if (!listPlus.contains(str)) {
                    listPlus = CollectionsKt.plus((Collection<? extends String>) listPlus, str);
                }
            } while (!interfaceC41669n.compareAndSet(value, listPlus));
        }
        C39627j.m88291a(this.f88019a, list, this.f88021c);
    }
}
