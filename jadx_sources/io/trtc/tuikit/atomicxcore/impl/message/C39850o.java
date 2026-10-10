package io.trtc.tuikit.atomicxcore.impl.message;

import com.tencent.imsdk.BaseConstants;
import com.tencent.imsdk.p128v2.V2TIMManager;
import com.tencent.imsdk.p128v2.V2TIMMessage;
import com.tencent.imsdk.p128v2.V2TIMMessageExtension;
import com.tencent.imsdk.p128v2.V2TIMSoundElem;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.message.MessageActionState;
import io.trtc.tuikit.atomicxcore.api.message.MessageActionStore;
import io.trtc.tuikit.atomicxcore.api.message.MessageExtension;
import io.trtc.tuikit.atomicxcore.api.message.MessageInfo;
import io.trtc.tuikit.atomicxcore.impl.common.AbstractC39512t;
import io.trtc.tuikit.atomicxcore.impl.common.C39505m;
import io.trtc.tuikit.atomicxcore.impl.common.EnumC39496d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.message.o */
/* JADX INFO: loaded from: classes61.dex */
public final class C39850o extends MessageActionStore {

    /* JADX INFO: renamed from: a */
    public final MessageInfo f88560a;

    /* JADX INFO: renamed from: b */
    public long f88561b;

    /* JADX INFO: renamed from: c */
    public long f88562c;

    /* JADX INFO: renamed from: d */
    public int f88563d;

    /* JADX INFO: renamed from: e */
    public int f88564e;

    /* JADX INFO: renamed from: f */
    public String f88565f;

    /* JADX INFO: renamed from: g */
    public int f88566g;

    /* JADX INFO: renamed from: h */
    public int f88567h;

    /* JADX INFO: renamed from: i */
    public boolean f88568i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC41669n f88569j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC41669n f88570k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC41669n f88571l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC41669n f88572m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC41669n f88573n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC41669n f88574o;

    /* JADX INFO: renamed from: p */
    public final MessageActionState f88575p;

    /* JADX INFO: renamed from: a */
    public final boolean m88333a(CompletionHandler completionHandler) {
        boolean z11 = (this.f88560a.getMsgID() == null || this.f88560a.getRawMessage() == null) ? false : true;
        if (!z11 && completionHandler != null) {
            completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "Message not found for operation");
        }
        return z11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39850o(MessageInfo message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
        this.f88560a = message;
        this.f88565f = "";
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(CollectionsKt.emptyList());
        this.f88569j = interfaceC41669nM91009a;
        Boolean bool = Boolean.TRUE;
        InterfaceC41669n interfaceC41669nM91009a2 = C41679x.m91009a(bool);
        this.f88570k = interfaceC41669nM91009a2;
        InterfaceC41669n interfaceC41669nM91009a3 = C41679x.m91009a(CollectionsKt.emptyList());
        this.f88571l = interfaceC41669nM91009a3;
        InterfaceC41669n interfaceC41669nM91009a4 = C41679x.m91009a(bool);
        this.f88572m = interfaceC41669nM91009a4;
        InterfaceC41669n interfaceC41669nM91009a5 = C41679x.m91009a(CollectionsKt.emptyList());
        this.f88573n = interfaceC41669nM91009a5;
        InterfaceC41669n interfaceC41669nM91009a6 = C41679x.m91009a(bool);
        this.f88574o = interfaceC41669nM91009a6;
        this.f88575p = new MessageActionState(C41636g.m90907c(interfaceC41669nM91009a), C41636g.m90907c(interfaceC41669nM91009a2), C41636g.m90907c(interfaceC41669nM91009a3), C41636g.m90907c(interfaceC41669nM91009a4), C41636g.m90907c(interfaceC41669nM91009a5), C41636g.m90907c(interfaceC41669nM91009a6));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.message.MessageActionStore
    public final void addMessageReaction(String reactionID, CompletionHandler completionHandler) throws JSONException {
        Intrinsics.checkNotNullParameter(reactionID, "reactionID");
        m88332a();
        if (reactionID.length() == 0) {
            if (completionHandler != null) {
                completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "reactionID cannot be empty");
                return;
            }
            return;
        }
        V2TIMMessage rawMessage = this.f88560a.getRawMessage();
        if (rawMessage != null) {
            V2TIMManager.getMessageManager().addMessageReaction(rawMessage, reactionID, new C39822a(completionHandler));
        } else if (completionHandler != null) {
            completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "Message not found for operation");
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.api.message.MessageActionStore
    public final void convertVoiceToText(String language, CompletionHandler completionHandler) throws JSONException {
        Intrinsics.checkNotNullParameter(language, "language");
        m88332a();
        String msgID = this.f88560a.getMsgID();
        if (msgID == null || msgID.length() == 0) {
            if (completionHandler != null) {
                completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "Message ID not found");
                return;
            }
            return;
        }
        V2TIMMessage rawMessage = this.f88560a.getRawMessage();
        if (rawMessage == null) {
            if (completionHandler != null) {
                completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "Message not found for operation");
                return;
            }
            return;
        }
        V2TIMSoundElem soundElem = rawMessage.getSoundElem();
        if (soundElem == null) {
            if (completionHandler != null) {
                completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "This is not a voice message");
                return;
            }
            return;
        }
        String localCustomData = rawMessage.getLocalCustomData();
        if (localCustomData != null) {
            try {
                String strOptString = new JSONObject(localCustomData).optString("voice_to_text", "");
                Intrinsics.checkNotNull(strOptString);
                if (strOptString.length() > 0) {
                    ConcurrentHashMap concurrentHashMap = AbstractC39512t.f87709a;
                    AbstractC39512t.m88254a("onVoiceConvertedToText", MapsKt.mapOf(TuplesKt.m90091to("messageID", msgID), TuplesKt.m90091to("language", language), TuplesKt.m90091to("asrText", strOptString)));
                    if (completionHandler != null) {
                        completionHandler.onSuccess();
                        return;
                    }
                    return;
                }
            } catch (Exception unused) {
            }
        }
        soundElem.convertVoiceToText(language, new C39824b(completionHandler, msgID, language));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.message.MessageActionStore
    public final void deleteMessageExtensions(List list, CompletionHandler completionHandler) {
        V2TIMMessage rawMessage = this.f88560a.getRawMessage();
        if (rawMessage != null) {
            V2TIMManager.getMessageManager().deleteMessageExtensions(rawMessage, list, new C39828d(completionHandler));
        } else if (completionHandler != null) {
            completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "Message not found for operation");
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.api.message.MessageActionStore
    public final void fetchMessageReactionUsers(String reactionID, int i11, CompletionHandler completionHandler) throws JSONException {
        Intrinsics.checkNotNullParameter(reactionID, "reactionID");
        m88332a();
        if (reactionID.length() == 0) {
            if (completionHandler != null) {
                completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "reactionID cannot be empty");
            }
        } else {
            if (i11 <= 0) {
                if (completionHandler != null) {
                    completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "count cannot be 0");
                    return;
                }
                return;
            }
            V2TIMMessage rawMessage = this.f88560a.getRawMessage();
            if (rawMessage == null) {
                if (completionHandler != null) {
                    completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "Message not found for operation");
                }
            } else {
                this.f88565f = reactionID;
                this.f88567h = i11;
                V2TIMManager.getMessageManager().getAllUserListOfMessageReaction(rawMessage, reactionID, 0, i11, new C39830e(this, completionHandler));
            }
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.api.message.MessageActionStore
    public final void fetchMoreMessageMembers(boolean z11, CompletionHandler completionHandler) {
        if ((z11 && !((Boolean) this.f88570k.getValue()).booleanValue()) || (!z11 && !((Boolean) this.f88572m.getValue()).booleanValue())) {
            if (completionHandler != null) {
                completionHandler.onSuccess();
                return;
            }
            return;
        }
        V2TIMMessage rawMessage = this.f88560a.getRawMessage();
        if (rawMessage != null) {
            V2TIMManager.getMessageManager().getGroupMessageReadMemberList(rawMessage, !z11 ? 1 : 0, z11 ? this.f88561b : this.f88562c, z11 ? this.f88563d : this.f88564e, new C39836h(completionHandler, z11, this));
        } else if (completionHandler != null) {
            completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "Message not found for operation");
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.api.message.MessageActionStore
    public final void fetchMoreMessageReactionUsers(CompletionHandler completionHandler) {
        if (!((Boolean) this.f88574o.getValue()).booleanValue()) {
            if (completionHandler != null) {
                completionHandler.onSuccess();
            }
        } else {
            if (this.f88565f.length() == 0) {
                if (completionHandler != null) {
                    completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "Please call fetchMessageReactionUsers first");
                    return;
                }
                return;
            }
            V2TIMMessage rawMessage = this.f88560a.getRawMessage();
            if (rawMessage != null) {
                V2TIMManager.getMessageManager().getAllUserListOfMessageReaction(rawMessage, this.f88565f, this.f88566g, this.f88567h, new C39838i(this, completionHandler));
            } else if (completionHandler != null) {
                completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "Message not found for operation");
            }
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.api.message.MessageActionStore
    public final MessageInfo getMessage() {
        return this.f88560a;
    }

    @Override // io.trtc.tuikit.atomicxcore.api.message.MessageActionStore
    public final MessageActionState getMessageActionState() {
        return this.f88575p;
    }

    @Override // io.trtc.tuikit.atomicxcore.api.message.MessageActionStore
    public final void removeMessageReaction(String reactionID, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(reactionID, "reactionID");
        if (reactionID.length() == 0) {
            if (completionHandler != null) {
                completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "reactionID cannot be empty");
                return;
            }
            return;
        }
        V2TIMMessage rawMessage = this.f88560a.getRawMessage();
        if (rawMessage != null) {
            V2TIMManager.getMessageManager().removeMessageReaction(rawMessage, reactionID, new C39844l(completionHandler));
        } else if (completionHandler != null) {
            completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "Message not found for operation");
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.api.message.MessageActionStore
    public final void setMessageExtensions(List extensions, CompletionHandler completionHandler) throws JSONException {
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        m88332a();
        if (extensions.isEmpty()) {
            if (completionHandler != null) {
                completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "extensions cannot be empty");
                return;
            }
            return;
        }
        V2TIMMessage rawMessage = this.f88560a.getRawMessage();
        if (rawMessage == null) {
            if (completionHandler != null) {
                completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "Message not found for operation");
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = extensions.iterator();
        while (it.hasNext()) {
            MessageExtension messageExtension = (MessageExtension) it.next();
            V2TIMMessageExtension v2TIMMessageExtension = new V2TIMMessageExtension();
            v2TIMMessageExtension.setExtensionKey(messageExtension.getExtensionKey());
            v2TIMMessageExtension.setExtensionValue(messageExtension.getExtensionValue());
            arrayList.add(v2TIMMessageExtension);
        }
        V2TIMManager.getMessageManager().setMessageExtensions(rawMessage, arrayList, new C39846m(completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.message.MessageActionStore
    public final void translateText(List sourceTextList, String str, String targetLanguage, CompletionHandler completionHandler) throws JSONException {
        Intrinsics.checkNotNullParameter(sourceTextList, "sourceTextList");
        Intrinsics.checkNotNullParameter(targetLanguage, "targetLanguage");
        m88332a();
        if (sourceTextList.isEmpty()) {
            if (completionHandler != null) {
                completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "sourceTextList cannot be empty");
                return;
            }
            return;
        }
        if (targetLanguage.length() == 0) {
            if (completionHandler != null) {
                completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "targetLanguage cannot be empty");
                return;
            }
            return;
        }
        String msgID = this.f88560a.getMsgID();
        if (msgID == null || msgID.length() == 0) {
            if (completionHandler != null) {
                completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "Message ID not found");
                return;
            }
            return;
        }
        V2TIMMessage rawMessage = this.f88560a.getRawMessage();
        if (rawMessage == null) {
            if (completionHandler != null) {
                completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "Message not found for operation");
                return;
            }
            return;
        }
        String localCustomData = rawMessage.getLocalCustomData();
        if (localCustomData != null) {
            try {
                JSONObject jSONObject = new JSONObject(localCustomData);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("text_translation");
                String strOptString = jSONObject.optString("text_translation_language", "");
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() > 0 && Intrinsics.areEqual(strOptString, targetLanguage)) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        Intrinsics.checkNotNull(next);
                        String strOptString2 = jSONObjectOptJSONObject.optString(next, "");
                        Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
                        linkedHashMap.put(next, strOptString2);
                    }
                    if (!linkedHashMap.isEmpty()) {
                        ConcurrentHashMap concurrentHashMap = AbstractC39512t.f87709a;
                        AbstractC39512t.m88254a("onMessageTranslated", MapsKt.mapOf(TuplesKt.m90091to("messageID", msgID), TuplesKt.m90091to("targetLanguage", targetLanguage), TuplesKt.m90091to("translatedTextMap", linkedHashMap)));
                        if (completionHandler != null) {
                            completionHandler.onSuccess();
                            return;
                        }
                        return;
                    }
                }
            } catch (Exception unused) {
            }
        }
        V2TIMManager.getMessageManager().translateText(sourceTextList, str, targetLanguage, new C39848n(completionHandler, msgID, targetLanguage));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.message.MessageActionStore
    public final void deleteMessage(CompletionHandler completionHandler) throws JSONException {
        m88332a();
        if (!m88333a(completionHandler)) {
            return;
        }
        String msgID = this.f88560a.getMsgID();
        V2TIMManager.getMessageManager().deleteMessages(CollectionsKt.listOf(this.f88560a.getRawMessage()), new C39826c(msgID, completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.message.MessageActionStore
    public final void fetchMessageReadMembers(int i11, CompletionHandler completionHandler) throws JSONException {
        m88332a();
        if (i11 <= 0) {
            if (completionHandler != null) {
                completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "count cannot be 0");
                return;
            }
            return;
        }
        V2TIMMessage rawMessage = this.f88560a.getRawMessage();
        if (rawMessage == null) {
            if (completionHandler != null) {
                completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "Message not found for operation");
            }
        } else {
            this.f88563d = i11;
            V2TIMManager.getMessageManager().getGroupMessageReadMemberList(rawMessage, 0, 0L, i11, new C39832f(completionHandler, this));
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.api.message.MessageActionStore
    public final void fetchMessageUnreadMembers(int i11, CompletionHandler completionHandler) throws JSONException {
        m88332a();
        if (i11 <= 0) {
            if (completionHandler != null) {
                completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "count cannot be 0");
                return;
            }
            return;
        }
        V2TIMMessage rawMessage = this.f88560a.getRawMessage();
        if (rawMessage == null) {
            if (completionHandler != null) {
                completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "Message not found for operation");
            }
        } else {
            this.f88564e = i11;
            V2TIMManager.getMessageManager().getGroupMessageReadMemberList(rawMessage, 1, 0L, i11, new C39834g(completionHandler, this));
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.api.message.MessageActionStore
    public final void pinMessage(boolean z11, CompletionHandler completionHandler) throws JSONException {
        m88332a();
        if (m88333a(completionHandler)) {
            String msgID = this.f88560a.getMsgID();
            V2TIMMessage rawMessage = this.f88560a.getRawMessage();
            String groupID = this.f88560a.getGroupID();
            if (groupID != null && groupID.length() != 0) {
                V2TIMManager.getMessageManager().pinGroupMessage(groupID, rawMessage, z11, new C39840j(msgID, groupID, z11, completionHandler));
            } else if (completionHandler != null) {
                completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "Only group messages can be pinned");
            }
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.api.message.MessageActionStore
    public final void recallMessage(CompletionHandler completionHandler) throws JSONException {
        m88332a();
        if (!m88333a(completionHandler)) {
            return;
        }
        String msgID = this.f88560a.getMsgID();
        V2TIMManager.getMessageManager().revokeMessage(this.f88560a.getRawMessage(), new C39842k(msgID, completionHandler));
    }

    /* JADX INFO: renamed from: a */
    public final void m88332a() throws JSONException {
        if (this.f88568i) {
            return;
        }
        this.f88568i = true;
        EnumC39496d componentType = EnumC39496d.MESSAGE_ACTION;
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("UIComponentType", 1003);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        V2TIMManager.getInstance().callExperimentalAPI("reportTUIFeatureUsage", string, new C39505m());
    }
}
