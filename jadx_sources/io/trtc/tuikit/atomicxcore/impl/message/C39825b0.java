package io.trtc.tuikit.atomicxcore.impl.message;

import com.tencent.imsdk.p128v2.V2TIMMessageReaction;
import com.tencent.imsdk.p128v2.V2TIMMessageReactionResult;
import com.tencent.imsdk.p128v2.V2TIMUserInfo;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.login.UserProfile;
import io.trtc.tuikit.atomicxcore.api.message.MessageInfo;
import io.trtc.tuikit.atomicxcore.api.message.MessageReaction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.message.b0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39825b0 implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CompletionHandler f88488a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C39857r0 f88489b;

    public C39825b0(CompletionHandler completionHandler, C39857r0 c39857r0) {
        this.f88488a = completionHandler;
        this.f88489b = c39857r0;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        CompletionHandler completionHandler = this.f88488a;
        if (completionHandler != null) {
            if (str == null) {
                str = "";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        Object value;
        ArrayList arrayList;
        Object next;
        List list = (List) obj;
        if (list != null) {
            InterfaceC41669n interfaceC41669n = this.f88489b.f88591e;
            do {
                value = interfaceC41669n.getValue();
                List<MessageInfo> list2 = (List) value;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                for (MessageInfo messageInfoCopy$default : list2) {
                    Iterator it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!Intrinsics.areEqual(((V2TIMMessageReactionResult) next).getMessageID(), messageInfoCopy$default.getMsgID()));
                    V2TIMMessageReactionResult v2TIMMessageReactionResult = (V2TIMMessageReactionResult) next;
                    if (v2TIMMessageReactionResult != null && v2TIMMessageReactionResult.getReactionList() != null) {
                        List<V2TIMMessageReaction> v2Reactions = v2TIMMessageReactionResult.getReactionList();
                        Intrinsics.checkNotNullExpressionValue(v2Reactions, "getReactionList(...)");
                        Intrinsics.checkNotNullParameter(v2Reactions, "v2Reactions");
                        ArrayList arrayList2 = new ArrayList();
                        for (V2TIMMessageReaction v2TIMMessageReaction : v2Reactions) {
                            String reactionID = v2TIMMessageReaction.getReactionID();
                            if (reactionID == null) {
                                reactionID = "";
                            }
                            MessageReaction messageReaction = new MessageReaction(reactionID, 0, null, false, 14, null);
                            messageReaction.setTotalUserCount(v2TIMMessageReaction.getTotalUserCount());
                            messageReaction.setReactedByMyself(v2TIMMessageReaction.getReactedByMyself());
                            ArrayList arrayList3 = new ArrayList();
                            List<V2TIMUserInfo> partialUserList = v2TIMMessageReaction.getPartialUserList();
                            if (partialUserList != null) {
                                Intrinsics.checkNotNull(partialUserList);
                                for (V2TIMUserInfo v2UserInfo : partialUserList) {
                                    Intrinsics.checkNotNull(v2UserInfo);
                                    Intrinsics.checkNotNullParameter(v2UserInfo, "v2UserInfo");
                                    String userID = v2UserInfo.getUserID();
                                    UserProfile userProfile = new UserProfile(userID == null ? "" : userID, v2UserInfo.getNickName(), v2UserInfo.getFaceUrl(), null, null, null, null, null, null, null, 1016, null);
                                    userProfile.setBirthday(Long.valueOf(v2UserInfo.getBirthday()));
                                    arrayList3.add(userProfile);
                                }
                            }
                            messageReaction.setPartialUserList(arrayList3);
                            arrayList2.add(messageReaction);
                        }
                        messageInfoCopy$default = MessageInfo.copy$default(messageInfoCopy$default, null, null, false, null, null, null, null, 0, null, false, null, null, false, null, false, null, arrayList2, null, 0, null, null, null, 4128767, null);
                    }
                    arrayList.add(messageInfoCopy$default);
                }
            } while (!interfaceC41669n.compareAndSet(value, arrayList));
        }
        CompletionHandler completionHandler = this.f88488a;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
