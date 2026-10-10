package io.trtc.tuikit.atomicxcore.impl.call;

import com.tencent.imsdk.p128v2.V2TIMFriendInfo;
import com.tencent.imsdk.p128v2.V2TIMFriendInfoResult;
import com.tencent.imsdk.p128v2.V2TIMUserFullInfo;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.api.call.CallParticipantInfo;
import java.util.ArrayList;
import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.call.l */
/* JADX INFO: loaded from: classes61.dex */
public final class C39480l implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39490v f87651a;

    public C39480l(C39490v c39490v) {
        this.f87651a = c39490v;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        this.f87651a.onError(i11, str);
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        V2TIMUserFullInfo userProfile;
        V2TIMUserFullInfo userProfile2;
        List list = (List) obj;
        Intrinsics.checkNotNullParameter(list, "list");
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            V2TIMFriendInfo friendInfo = ((V2TIMFriendInfoResult) list.get(i11)).getFriendInfo();
            String faceUrl = null;
            CallParticipantInfo callParticipantInfo = new CallParticipantInfo(null, null, null, null, null, false, false, 127, null);
            String userID = friendInfo != null ? friendInfo.getUserID() : null;
            String str = "";
            if (userID == null) {
                userID = "";
            }
            callParticipantInfo.setId(userID);
            String friendRemark = friendInfo != null ? friendInfo.getFriendRemark() : null;
            if (friendRemark == null) {
                friendRemark = "";
            }
            callParticipantInfo.setRemark(friendRemark);
            String nickName = (friendInfo == null || (userProfile2 = friendInfo.getUserProfile()) == null) ? null : userProfile2.getNickName();
            if (nickName == null) {
                nickName = "";
            }
            callParticipantInfo.setName(nickName);
            if (friendInfo != null && (userProfile = friendInfo.getUserProfile()) != null) {
                faceUrl = userProfile.getFaceUrl();
            }
            if (faceUrl != null) {
                str = faceUrl;
            }
            callParticipantInfo.setAvatarUrl(str);
            arrayList.add(callParticipantInfo);
        }
        this.f87651a.onSuccess(arrayList);
    }
}
