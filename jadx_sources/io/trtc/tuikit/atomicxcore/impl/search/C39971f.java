package io.trtc.tuikit.atomicxcore.impl.search;

import com.tencent.imsdk.p128v2.V2TIMFriendInfo;
import com.tencent.imsdk.p128v2.V2TIMFriendInfoResult;
import com.tencent.imsdk.p128v2.V2TIMUserFullInfo;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.api.login.AllowType;
import io.trtc.tuikit.atomicxcore.api.login.Gender;
import io.trtc.tuikit.atomicxcore.api.login.UserProfile;
import io.trtc.tuikit.atomicxcore.api.search.FriendSearchInfo;
import io.trtc.tuikit.atomicxcore.impl.common.C39497e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.SafeContinuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.search.f */
/* JADX INFO: loaded from: classes61.dex */
public final class C39971f implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39981p f88863a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SafeContinuation f88864b;

    public C39971f(C39981p c39981p, SafeContinuation safeContinuation) {
        this.f88863a = c39981p;
        this.f88864b = safeContinuation;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        SafeContinuation safeContinuation = this.f88864b;
        Result.Companion companion = Result.INSTANCE;
        if (str == null) {
            str = "Friend search failed";
        }
        safeContinuation.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(new C39497e(i11, str))));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00e0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        ?? EmptyList;
        FriendSearchInfo friendSearchInfo;
        UserProfile userProfile;
        List list = (List) obj;
        if (list != null) {
            C39981p c39981p = this.f88863a;
            EmptyList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                V2TIMFriendInfo friendInfo = ((V2TIMFriendInfoResult) it.next()).getFriendInfo();
                if (friendInfo != null) {
                    Intrinsics.checkNotNull(friendInfo);
                    c39981p.getClass();
                    String userID = friendInfo.getUserID();
                    if (userID == null) {
                        friendSearchInfo = null;
                    } else {
                        String friendRemark = friendInfo.getFriendRemark();
                        long friendAddTime = friendInfo.getFriendAddTime();
                        HashMap<String, byte[]> friendCustomInfo = friendInfo.getFriendCustomInfo();
                        V2TIMUserFullInfo v2UserInfo = friendInfo.getUserProfile();
                        if (v2UserInfo != null) {
                            Intrinsics.checkNotNullParameter(v2UserInfo, "v2UserInfo");
                            String userID2 = v2UserInfo.getUserID();
                            if (userID2 == null) {
                                userID2 = "";
                            }
                            userProfile = new UserProfile(userID2, v2UserInfo.getNickName(), v2UserInfo.getFaceUrl(), null, null, null, null, null, null, null, 1016, null);
                            userProfile.setGender(Gender.INSTANCE.parse(v2UserInfo.getGender()));
                            userProfile.setBirthday(Long.valueOf(v2UserInfo.getBirthday()));
                            userProfile.setLevel(Integer.valueOf(v2UserInfo.getLevel()));
                            userProfile.setRole(Integer.valueOf(v2UserInfo.getRole()));
                            userProfile.setSelfSignature(v2UserInfo.getSelfSignature());
                            userProfile.setAllowType(AllowType.INSTANCE.parse(v2UserInfo.getAllowType()));
                            userProfile.setCustomInfo(v2UserInfo.getCustomInfo());
                        } else {
                            userProfile = new UserProfile(userID, null, null, null, null, null, null, null, null, null, 1022, null);
                        }
                        friendSearchInfo = new FriendSearchInfo(userID, friendRemark, friendAddTime, friendCustomInfo, userProfile);
                    }
                } else {
                    friendSearchInfo = null;
                }
                if (friendSearchInfo != null) {
                    EmptyList.add(friendSearchInfo);
                }
            }
        } else {
            EmptyList = CollectionsKt.emptyList();
        }
        this.f88863a.f88902k.setValue(EmptyList);
        this.f88863a.f88903l.setValue(Integer.valueOf(EmptyList.size()));
        this.f88863a.f88904m.setValue(Boolean.FALSE);
        SafeContinuation safeContinuation = this.f88864b;
        Result.Companion companion = Result.INSTANCE;
        safeContinuation.resumeWith(Result.m103844constructorimpl(Unit.INSTANCE));
    }
}
