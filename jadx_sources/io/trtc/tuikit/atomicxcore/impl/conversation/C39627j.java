package io.trtc.tuikit.atomicxcore.impl.conversation;

import com.tencent.imsdk.BaseConstants;
import com.tencent.imsdk.p128v2.V2TIMConversationOperationResult;
import com.tencent.imsdk.p128v2.V2TIMManager;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.conversation.ConversationGroupState;
import io.trtc.tuikit.atomicxcore.api.conversation.ConversationGroupStore;
import io.trtc.tuikit.atomicxcore.impl.common.C39505m;
import io.trtc.tuikit.atomicxcore.impl.common.C39515w;
import io.trtc.tuikit.atomicxcore.impl.common.EnumC39496d;
import java.util.List;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.conversation.j */
/* JADX INFO: loaded from: classes61.dex */
public final class C39627j extends ConversationGroupStore {

    /* JADX INFO: renamed from: a */
    public final InterfaceC41669n f88033a;

    /* JADX INFO: renamed from: b */
    public final ConversationGroupState f88034b;

    /* JADX INFO: renamed from: c */
    public volatile C39621d f88035c;

    @Override // io.trtc.tuikit.atomicxcore.api.conversation.ConversationGroupStore
    public final void addConversationsToGroup(String groupName, List conversationIDList, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        Intrinsics.checkNotNullParameter(conversationIDList, "conversationIDList");
        if (groupName.length() == 0) {
            if (completionHandler != null) {
                completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "Group name is empty");
            }
        } else if (!conversationIDList.isEmpty()) {
            V2TIMManager.getConversationManager().addConversationsToGroup(groupName, conversationIDList, new C39620c(this, completionHandler));
        } else if (completionHandler != null) {
            completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "Conversation ID list is empty");
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.api.conversation.ConversationGroupStore
    public final void createGroup(String groupName, List conversationIDList, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        Intrinsics.checkNotNullParameter(conversationIDList, "conversationIDList");
        if (groupName.length() == 0) {
            if (completionHandler != null) {
                completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "Group name is empty");
            }
        } else if (!conversationIDList.isEmpty()) {
            V2TIMManager.getConversationManager().createConversationGroup(groupName, conversationIDList, new C39622e(this, groupName, completionHandler));
        } else if (completionHandler != null) {
            completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "Conversation ID list is empty");
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.api.conversation.ConversationGroupStore
    public final void deleteConversationsFromGroup(String groupName, List conversationIDList, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        Intrinsics.checkNotNullParameter(conversationIDList, "conversationIDList");
        if (groupName.length() == 0) {
            if (completionHandler != null) {
                completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "Group name is empty");
            }
        } else if (!conversationIDList.isEmpty()) {
            V2TIMManager.getConversationManager().deleteConversationsFromGroup(groupName, conversationIDList, new C39623f(this, completionHandler));
        } else if (completionHandler != null) {
            completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "Conversation ID list is empty");
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.api.conversation.ConversationGroupStore
    public final void deleteGroup(String groupName, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        if (groupName.length() != 0) {
            V2TIMManager.getConversationManager().deleteConversationGroup(groupName, new C39624g(this, completionHandler, groupName));
        } else if (completionHandler != null) {
            completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "Group name is empty");
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.api.conversation.ConversationGroupStore
    public final void fetchGroupList(CompletionHandler completionHandler) throws JSONException {
        EnumC39496d componentType = EnumC39496d.CONVERSATION_GROUP;
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("UIComponentType", 1005);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        V2TIMManager.getInstance().callExperimentalAPI("reportTUIFeatureUsage", string, new C39505m());
        V2TIMManager.getConversationManager().getConversationGroupList(new C39625h(this, completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.conversation.ConversationGroupStore
    public final ConversationGroupState getConversationGroupState() {
        return this.f88034b;
    }

    @Override // io.trtc.tuikit.atomicxcore.api.conversation.ConversationGroupStore
    public final void renameGroup(String oldName, String newName, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(oldName, "oldName");
        Intrinsics.checkNotNullParameter(newName, "newName");
        if (oldName.length() == 0) {
            if (completionHandler != null) {
                completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "Old group name is empty");
            }
        } else if (newName.length() != 0) {
            V2TIMManager.getConversationManager().renameConversationGroup(oldName, newName, new C39626i(this, completionHandler, oldName, newName));
        } else if (completionHandler != null) {
            completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "New group name is empty");
        }
    }

    public C39627j() {
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(CollectionsKt.emptyList());
        this.f88033a = interfaceC41669nM91009a;
        this.f88034b = new ConversationGroupState(C41636g.m90907c(interfaceC41669nM91009a));
        this.f88035c = new C39621d(this);
        V2TIMManager.getConversationManager().addConversationListener(new C39515w(this.f88035c));
    }

    /* JADX INFO: renamed from: a */
    public static final void m88291a(C39627j c39627j, List list, CompletionHandler completionHandler) {
        c39627j.getClass();
        if (completionHandler == null) {
            return;
        }
        V2TIMConversationOperationResult v2TIMConversationOperationResult = null;
        Object obj = null;
        if (list != null) {
            for (Object obj2 : list) {
                if (((V2TIMConversationOperationResult) obj2).getResultCode() != 0) {
                    obj = obj2;
                    break;
                }
            }
            v2TIMConversationOperationResult = (V2TIMConversationOperationResult) obj;
        }
        if (v2TIMConversationOperationResult != null) {
            int resultCode = v2TIMConversationOperationResult.getResultCode();
            String resultInfo = v2TIMConversationOperationResult.getResultInfo();
            if (resultInfo == null) {
                resultInfo = "Unknown error";
            }
            completionHandler.onFailure(resultCode, resultInfo);
            return;
        }
        completionHandler.onSuccess();
    }
}
