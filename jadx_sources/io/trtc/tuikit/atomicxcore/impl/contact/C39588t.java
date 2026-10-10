package io.trtc.tuikit.atomicxcore.impl.contact;

import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.contact.FriendApplicationInfo;
import java.util.ArrayList;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.t */
/* JADX INFO: loaded from: classes61.dex */
public final class C39588t implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39539O f87926a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f87927b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ FriendApplicationInfo f87928c;

    public C39588t(C39539O c39539o, CompletionHandler completionHandler, FriendApplicationInfo friendApplicationInfo) {
        this.f87926a = c39539o;
        this.f87927b = completionHandler;
        this.f87928c = friendApplicationInfo;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        CompletionHandler completionHandler = this.f87927b;
        if (completionHandler != null) {
            if (str == null) {
                str = "Accept friend application failed";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        InterfaceC41669n interfaceC41669n = this.f87926a.f87801d;
        Iterable iterable = (Iterable) interfaceC41669n.getValue();
        FriendApplicationInfo friendApplicationInfo = this.f87928c;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : iterable) {
            if (!Intrinsics.areEqual(((FriendApplicationInfo) obj2).getApplicationID(), friendApplicationInfo.getApplicationID())) {
                arrayList.add(obj2);
            }
        }
        interfaceC41669n.setValue(arrayList);
        CompletionHandler completionHandler = this.f87927b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
