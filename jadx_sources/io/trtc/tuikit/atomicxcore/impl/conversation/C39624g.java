package io.trtc.tuikit.atomicxcore.impl.conversation;

import com.tencent.imsdk.p128v2.V2TIMCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.conversation.g */
/* JADX INFO: loaded from: classes61.dex */
public final class C39624g implements V2TIMCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39627j f88024a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f88025b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f88026c;

    public C39624g(C39627j c39627j, CompletionHandler completionHandler, String str) {
        this.f88024a = c39627j;
        this.f88025b = completionHandler;
        this.f88026c = str;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onError(int i11, String str) {
        CompletionHandler completionHandler = this.f88025b;
        if (completionHandler != null) {
            if (str == null) {
                str = "Unknown error";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onSuccess() {
        Object value;
        ArrayList arrayList;
        InterfaceC41669n interfaceC41669n = this.f88024a.f88033a;
        String str = this.f88026c;
        do {
            value = interfaceC41669n.getValue();
            arrayList = new ArrayList();
            for (Object obj : (List) value) {
                if (!Intrinsics.areEqual((String) obj, str)) {
                    arrayList.add(obj);
                }
            }
        } while (!interfaceC41669n.compareAndSet(value, arrayList));
        CompletionHandler completionHandler = this.f88025b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
