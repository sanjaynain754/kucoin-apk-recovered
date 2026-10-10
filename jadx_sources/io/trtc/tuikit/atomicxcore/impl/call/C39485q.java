package io.trtc.tuikit.atomicxcore.impl.call;

import com.tencent.cloud.tuikit.engine.call.TUICallDefine;
import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.call.CallDirection;
import io.trtc.tuikit.atomicxcore.api.call.CallInfo;
import io.trtc.tuikit.atomicxcore.api.call.CallMediaType;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.call.q */
/* JADX INFO: loaded from: classes61.dex */
public final class C39485q implements TUICommonDefine.ValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39491w f87658a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f87659b;

    public C39485q(C39491w c39491w, CompletionHandler completionHandler) {
        this.f87658a = c39491w;
        this.f87659b = completionHandler;
    }

    @Override // com.tencent.cloud.tuikit.engine.common.TUICommonDefine.ValueCallback
    public final void onError(int i11, String str) {
        CompletionHandler completionHandler = this.f87659b;
        if (completionHandler != null) {
            if (str == null) {
                str = "";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    @Override // com.tencent.cloud.tuikit.engine.common.TUICommonDefine.ValueCallback
    public final void onSuccess(Object obj) {
        LinkedHashSet linkedHashSet;
        CallDirection callDirection;
        List<TUICallDefine.CallRecords> list = (List) obj;
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (TUICallDefine.CallRecords callRecords : list) {
            String str = callRecords.callId;
            if (str == null) {
                str = "";
            } else {
                Intrinsics.checkNotNull(str);
            }
            String str2 = callRecords.inviter;
            if (str2 == null) {
                str2 = "";
            } else {
                Intrinsics.checkNotNull(str2);
            }
            List<String> list2 = callRecords.inviteList;
            if (list2 != null) {
                Intrinsics.checkNotNull(list2);
                linkedHashSet = (LinkedHashSet) CollectionsKt.toCollection(list2, new LinkedHashSet());
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
            } else {
                linkedHashSet = new LinkedHashSet();
            }
            String str3 = callRecords.groupId;
            if (str3 == null) {
                str3 = "";
            } else {
                Intrinsics.checkNotNull(str3);
            }
            CallMediaType callMediaTypeM88239a = AbstractC39470b.m88239a(callRecords.mediaType);
            TUICallDefine.CallRecords.Result callResult = callRecords.result;
            Intrinsics.checkNotNullExpressionValue(callResult, "result");
            Intrinsics.checkNotNullParameter(callResult, "callResult");
            int i11 = AbstractC39469a.f87627c[callResult.ordinal()];
            if (i11 == 1) {
                callDirection = CallDirection.Unknown;
            } else if (i11 == 2) {
                callDirection = CallDirection.Missed;
            } else if (i11 == 3) {
                callDirection = CallDirection.Incoming;
            } else {
                if (i11 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                callDirection = CallDirection.Outgoing;
            }
            arrayList.add(new CallInfo(str, null, str2, linkedHashSet, str3, callMediaTypeM88239a, callDirection, callRecords.beginTime, callRecords.totalTime, 2, null));
        }
        this.f87658a.f87672e.setValue(new LinkedHashSet(arrayList));
        CompletionHandler completionHandler = this.f87659b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
