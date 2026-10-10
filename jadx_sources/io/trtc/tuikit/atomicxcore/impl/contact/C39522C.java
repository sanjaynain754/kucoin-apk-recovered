package io.trtc.tuikit.atomicxcore.impl.contact;

import com.tencent.imsdk.p128v2.V2TIMGroupApplication;
import com.tencent.imsdk.p128v2.V2TIMGroupApplicationResult;
import com.tencent.imsdk.p128v2.V2TIMManager;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.contact.GroupApplicationHandledResult;
import io.trtc.tuikit.atomicxcore.api.contact.GroupApplicationHandledStatus;
import io.trtc.tuikit.atomicxcore.api.contact.GroupApplicationInfo;
import io.trtc.tuikit.atomicxcore.api.contact.GroupApplicationType;
import java.util.ArrayList;
import java.util.List;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.C */
/* JADX INFO: loaded from: classes61.dex */
public final class C39522C implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39539O f87725a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f87726b;

    public C39522C(C39539O c39539o, CompletionHandler completionHandler) {
        this.f87725a = c39539o;
        this.f87726b = completionHandler;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        if (i11 == 6015) {
            C39539O c39539o = this.f87725a;
            CompletionHandler completionHandler = this.f87726b;
            c39539o.getClass();
            V2TIMManager.getGroupManager().getGroupApplicationList(new C39522C(c39539o, completionHandler));
            return;
        }
        CompletionHandler completionHandler2 = this.f87726b;
        if (completionHandler2 != null) {
            if (str == null) {
                str = "Get friend application list failed";
            }
            completionHandler2.onFailure(i11, str);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        List<V2TIMGroupApplication> groupApplicationList;
        V2TIMGroupApplicationResult v2TIMGroupApplicationResult = (V2TIMGroupApplicationResult) obj;
        this.f87725a.f87804g.setValue(Integer.valueOf(v2TIMGroupApplicationResult != null ? v2TIMGroupApplicationResult.getUnreadCount() : 0));
        if (v2TIMGroupApplicationResult != null && (groupApplicationList = v2TIMGroupApplicationResult.getGroupApplicationList()) != null) {
            C39539O c39539o = this.f87725a;
            c39539o.getClass();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(groupApplicationList, 10));
            for (V2TIMGroupApplication v2TIMGroupApplication : groupApplicationList) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(v2TIMGroupApplication.getGroupID());
                sb2.append('_');
                sb2.append(v2TIMGroupApplication.getApplicationType());
                sb2.append('_');
                sb2.append(v2TIMGroupApplication.getAddTime());
                sb2.append('_');
                String fromUser = v2TIMGroupApplication.getFromUser();
                String str = "";
                if (fromUser == null) {
                    fromUser = "";
                }
                sb2.append(fromUser);
                sb2.append('_');
                String toUser = v2TIMGroupApplication.getToUser();
                if (toUser != null) {
                    str = toUser;
                }
                sb2.append(str);
                String string = sb2.toString();
                String fromUserFaceUrl = v2TIMGroupApplication.getFromUserFaceUrl();
                String fromUser2 = v2TIMGroupApplication.getFromUser();
                String fromUserNickName = v2TIMGroupApplication.getFromUserNickName();
                String groupID = v2TIMGroupApplication.getGroupID();
                String toUser2 = v2TIMGroupApplication.getToUser();
                long addTime = v2TIMGroupApplication.getAddTime();
                String requestMsg = v2TIMGroupApplication.getRequestMsg();
                GroupApplicationType groupApplicationType = GroupApplicationType.INSTANCE.parse(v2TIMGroupApplication.getApplicationType());
                GroupApplicationHandledResult groupApplicationHandledResult = GroupApplicationHandledResult.INSTANCE.parse(v2TIMGroupApplication.getHandleResult());
                GroupApplicationHandledStatus groupApplicationHandledStatus = GroupApplicationHandledStatus.INSTANCE.parse(v2TIMGroupApplication.getHandleStatus());
                String handledMsg = v2TIMGroupApplication.getHandledMsg();
                Intrinsics.checkNotNull(groupID);
                arrayList.add(new GroupApplicationInfo(string, groupID, fromUser2, fromUserNickName, fromUserFaceUrl, toUser2, addTime, requestMsg, handledMsg, groupApplicationHandledStatus, groupApplicationHandledResult, groupApplicationType, v2TIMGroupApplication));
            }
            c39539o.f87802e.setValue(arrayList);
        }
        CompletionHandler completionHandler = this.f87726b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
