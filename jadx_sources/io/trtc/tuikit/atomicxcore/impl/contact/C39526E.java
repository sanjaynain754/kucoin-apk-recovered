package io.trtc.tuikit.atomicxcore.impl.contact;

import com.tencent.imsdk.BaseConstants;
import com.tencent.imsdk.p128v2.V2TIMGroupInfo;
import com.tencent.imsdk.p128v2.V2TIMGroupInfoResult;
import com.tencent.imsdk.p128v2.V2TIMManager;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import java.util.List;
import p852kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.E */
/* JADX INFO: loaded from: classes61.dex */
public final class C39526E implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39539O f87736a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f87737b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f87738c;

    public C39526E(C39539O c39539o, CompletionHandler completionHandler, String str) {
        this.f87736a = c39539o;
        this.f87737b = completionHandler;
        this.f87738c = str;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        this.f87736a.f87806i.setValue(null);
        CompletionHandler completionHandler = this.f87737b;
        if (completionHandler != null) {
            if (str == null) {
                str = "Get group info failed";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        List list = (List) obj;
        V2TIMGroupInfoResult v2TIMGroupInfoResult = list != null ? (V2TIMGroupInfoResult) CollectionsKt.firstOrNull(list) : null;
        if (v2TIMGroupInfoResult == null || v2TIMGroupInfoResult.getResultCode() != 0) {
            this.f87736a.f87806i.setValue(null);
            CompletionHandler completionHandler = this.f87737b;
            if (completionHandler != null) {
                int resultCode = v2TIMGroupInfoResult != null ? v2TIMGroupInfoResult.getResultCode() : BaseConstants.ERR_SVR_GROUP_INVALID_GROUPID;
                String resultMessage = v2TIMGroupInfoResult != null ? v2TIMGroupInfoResult.getResultMessage() : null;
                if (resultMessage == null) {
                    resultMessage = "Get group info failed";
                }
                completionHandler.onFailure(resultCode, resultMessage);
                return;
            }
            return;
        }
        V2TIMGroupInfo groupInfo = v2TIMGroupInfoResult.getGroupInfo();
        if (groupInfo != null) {
            V2TIMManager.getGroupManager().getJoinedGroupList(new C39524D(this.f87736a, groupInfo, this.f87737b, this.f87738c));
            return;
        }
        this.f87736a.f87806i.setValue(null);
        CompletionHandler completionHandler2 = this.f87737b;
        if (completionHandler2 != null) {
            completionHandler2.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "group not exist");
        }
    }
}
