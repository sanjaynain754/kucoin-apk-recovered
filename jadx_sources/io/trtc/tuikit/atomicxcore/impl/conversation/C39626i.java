package io.trtc.tuikit.atomicxcore.impl.conversation;

import com.tencent.imsdk.p128v2.V2TIMCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.conversation.i */
/* JADX INFO: loaded from: classes61.dex */
public final class C39626i implements V2TIMCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39627j f88029a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f88030b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f88031c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f88032d;

    public C39626i(C39627j c39627j, CompletionHandler completionHandler, String str, String str2) {
        this.f88029a = c39627j;
        this.f88030b = completionHandler;
        this.f88031c = str;
        this.f88032d = str2;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onError(int i11, String str) {
        CompletionHandler completionHandler = this.f88030b;
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
        List<String> list;
        InterfaceC41669n interfaceC41669n = this.f88029a.f88033a;
        String str = this.f88031c;
        String str2 = this.f88032d;
        do {
            value = interfaceC41669n.getValue();
            list = (List) value;
            if (list.contains(str)) {
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (String str3 : list) {
                    if (Intrinsics.areEqual(str3, str)) {
                        str3 = str2;
                    }
                    arrayList.add(str3);
                }
                list = arrayList;
            }
        } while (!interfaceC41669n.compareAndSet(value, list));
        CompletionHandler completionHandler = this.f88030b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
