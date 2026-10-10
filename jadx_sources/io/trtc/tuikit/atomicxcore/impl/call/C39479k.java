package io.trtc.tuikit.atomicxcore.impl.call;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.call.CallInfo;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.call.k */
/* JADX INFO: loaded from: classes61.dex */
public final class C39479k implements TUICommonDefine.ValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39491w f87649a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f87650b;

    public C39479k(C39491w c39491w, CompletionHandler completionHandler) {
        this.f87649a = c39491w;
        this.f87650b = completionHandler;
    }

    @Override // com.tencent.cloud.tuikit.engine.common.TUICommonDefine.ValueCallback
    public final void onError(int i11, String str) {
        CompletionHandler completionHandler = this.f87650b;
        if (completionHandler != null) {
            if (str == null) {
                str = "";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.common.TUICommonDefine.ValueCallback
    public final void onSuccess(Object obj) {
        Object value;
        ArrayList arrayList;
        List list = (List) obj;
        if (list != null && !list.isEmpty()) {
            Set set = CollectionsKt.toSet(list);
            InterfaceC41669n interfaceC41669n = this.f87649a.f87672e;
            do {
                value = interfaceC41669n.getValue();
                arrayList = new ArrayList();
                for (Object obj2 : (LinkedHashSet) value) {
                    if (!set.contains(((CallInfo) obj2).getCallId())) {
                        arrayList.add(obj2);
                    }
                }
            } while (!interfaceC41669n.compareAndSet(value, (LinkedHashSet) CollectionsKt.toCollection(arrayList, new LinkedHashSet())));
        }
        CompletionHandler completionHandler = this.f87650b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
