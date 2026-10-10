package com.tencent.imsdk.p128v2;

import android.content.Context;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.imsdk.BaseConstants;
import com.tencent.imsdk.common.IMCallback;
import com.tencent.imsdk.common.IMContext;
import com.tencent.imsdk.common.IMLog;
import com.tencent.imsdk.common.SystemUtil;
import com.tencent.imsdk.conversation.ConversationManager;
import com.tencent.imsdk.group.GroupManager;
import com.tencent.imsdk.group.GroupMemberInfo;
import com.tencent.imsdk.manager.BaseManager;
import com.tencent.imsdk.manager.CustomServerInfo;
import com.tencent.imsdk.manager.SDKConfig;
import com.tencent.imsdk.message.FileElement;
import com.tencent.imsdk.message.ImageElement;
import com.tencent.imsdk.message.Message;
import com.tencent.imsdk.message.MessageCenter;
import com.tencent.imsdk.message.MessageExtension;
import com.tencent.imsdk.message.MessageExtensionResult;
import com.tencent.imsdk.message.SoundElement;
import com.tencent.imsdk.message.TextElement;
import com.tencent.imsdk.message.VideoElement;
import com.tencent.imsdk.officialaccount.OfficialAccountInfo;
import com.tencent.imsdk.offlinepush.OfflinePushConfig;
import com.tencent.imsdk.offlinepush.OfflinePushEventItem;
import com.tencent.imsdk.offlinepush.OfflinePushManager;
import com.tencent.imsdk.relationship.RelationshipManager;
import com.tencent.qcloud.tim.push.TIMPushConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
public class V2TIMManagerExperimentImpl {
    private static final String TAG = "V2TIMManagerExperimentImpl";

    public static class V2TIMManagerExperimentImplHolder {
        private static final V2TIMManagerExperimentImpl v2TIMManagerExperiment = new V2TIMManagerExperimentImpl();

        private V2TIMManagerExperimentImplHolder() {
        }
    }

    public void callExperimentalAPI(String str, Object obj, V2TIMValueCallback<Object> v2TIMValueCallback) {
        if (TextUtils.isEmpty(str)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "invalid api");
        }
        if (str.equals("setCustomServerInfo")) {
            setCustomServerInfo(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("enableQuicChannel")) {
            setQuicChannelEnabled(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("setProxyInfo")) {
            setProxyInfo(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("setLibraryPath")) {
            setLibraryPath(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("downloadLibrary")) {
            downloadLibrary(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("initLocalStorage")) {
            initLocalStorage(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("setTestEnvironment")) {
            setTestEnvironment(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("setIPv6Prior")) {
            setIPv6Prior(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("setCosSaveRegionForConversation")) {
            setCosSaveRegion(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("setUIPlatform")) {
            setUIPlatform(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("setBuildInfo")) {
            setBuildInfo(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("setDatabaseEncryptInfo")) {
            setDatabaseEncryptInfo(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("isCommercialAbilityEnabled")) {
            isCommercialAbilityEnabled(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("setPacketRetryInfo")) {
            setPacketRetryInfo(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("setOfflinePushState")) {
            setOfflinePushState(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("getOfflinePushState")) {
            getOfflinePushState(v2TIMValueCallback);
            return;
        }
        if (str.equals("getMessageRevoker")) {
            getMessageRevoker(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("writeLog")) {
            writeLog(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("getAIDenoiseSignature")) {
            getAIDenoiseSignature(v2TIMValueCallback);
            return;
        }
        if (str.equals("getVideoEditSignature")) {
            getVideoEditSignature(v2TIMValueCallback);
            return;
        }
        if (str.equals("sendTRTCCustomData")) {
            sendTRTCCustomData(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("setMessageExtensionsBySequence")) {
            setMessageExtensionsBySequence(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("getMessageExtensionsBySequence")) {
            getMessageExtensionsBySequence(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("clearLocalHistoryMessage")) {
            clearLocalHistoryMessage(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("reportTUIComponentUsage")) {
            reportTUIComponentUsage(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("reportTUIFeatureUsage")) {
            reportTUIFeatureUsage(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("setConversationGroupOrderData")) {
            setConversationGroupOrderData(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("getConversationGroupOrderData")) {
            getConversationGroupOrderData(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("reportOfflinePushEvent")) {
            reportOfflinePushEvent(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("setOfflinePushInfo")) {
            setOfflinePushInfo(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("setApplicationID")) {
            setApplicationID(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("findMergerMessages")) {
            findMergerMessages(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("getBriefGroupMemberList")) {
            getBriefGroupMemberList(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("pushLogin")) {
            pushLogin(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("reportPushSDKEvent")) {
            reportPushSDKEvent(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("setCustomLoginInfo")) {
            setCustomLoginInfo(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("disableHttpRequest")) {
            disableHttpRequest(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("getLoginAccountType")) {
            getLoginAccountType(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("getBuiltInPushUserID")) {
            getBuiltInPushUserID(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("cancelSendingMessage")) {
            cancelSendingMessage(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("getMessageSource")) {
            getMessageSource(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("getGroupMessageReceipts")) {
            getGroupMessageReceipts(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("getPushMessageID")) {
            getPushMessageID(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("getOfficialAccountList")) {
            getOfficialAccountList(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("setForceRequestCloudMessage")) {
            setForceRequestCloudMessage(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("uploadFile")) {
            uploadFile(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("convertVoiceToText")) {
            convertVoiceToText(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("convertTextToVoice")) {
            convertTextToVoice(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("voiceClone")) {
            voiceClone(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("getCustomVoiceList")) {
            getCustomVoiceList(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("deleteCustomVoice")) {
            deleteCustomVoice(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("reportRoomEngineEvent")) {
            reportRoomEngineEvent(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("setRichStatus")) {
            setRichStatus(obj, v2TIMValueCallback);
            return;
        }
        if (str.equals("deleteRichStatus")) {
            deleteRichStatus(obj, v2TIMValueCallback);
        } else if (str.equals("getRichStatus")) {
            getRichStatus(obj, v2TIMValueCallback);
        } else {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "unsupported api");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callbackOnError(V2TIMValueCallback<Object> v2TIMValueCallback, int i11, String str) {
        if (v2TIMValueCallback != null) {
            v2TIMValueCallback.onError(i11, str);
        }
    }

    private void callbackOnSuccess(V2TIMValueCallback<Object> v2TIMValueCallback, Object obj) {
        if (v2TIMValueCallback != null) {
            v2TIMValueCallback.onSuccess(obj);
        }
    }

    private void cancelSendingMessage(Object obj, V2TIMValueCallback<Object> v2TIMValueCallback) {
        if (obj == null || !(obj instanceof String)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is not string");
        } else {
            MessageCenter.getInstance().cancelSendingMessage((String) obj, new IMCallback(v2TIMValueCallback) { // from class: com.tencent.imsdk.v2.V2TIMManagerExperimentImpl.29
                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str) {
                    super.fail(i11, str);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Object obj2) {
                    super.success(obj2);
                }
            });
        }
    }

    private void clearLocalHistoryMessage(Object obj, V2TIMValueCallback<Object> v2TIMValueCallback) {
        if (obj == null || !(obj instanceof String)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is not string");
            return;
        }
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is empty");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            MessageCenter.getInstance().clearLocalHistoryMessage(V2TIMConversationManagerImpl.getInstance().getConversationKey(jSONObject.optString("conversationID")), jSONObject.optLong("beginTimestamp"), jSONObject.optLong("endTimestamp"), new IMCallback(v2TIMValueCallback) { // from class: com.tencent.imsdk.v2.V2TIMManagerExperimentImpl.8
                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str2) {
                    super.fail(i11, str2);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Object obj2) {
                    super.success(obj2);
                }
            });
        } catch (JSONException e11) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "convert param to json failed");
            e11.printStackTrace();
        }
    }

    private void convertTextToVoice(Object obj, V2TIMValueCallback<Object> v2TIMValueCallback) {
        if (obj == null || !(obj instanceof String)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is not string");
            return;
        }
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is empty");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("text")) {
                callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "text must be set");
                return;
            }
            String strOptString = jSONObject.optString("text");
            if (TextUtils.isEmpty(strOptString)) {
                callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "text is invalid");
                return;
            }
            HashMap map = new HashMap();
            map.put("text", strOptString);
            if (jSONObject.has("voiceId")) {
                map.put("voice_id", jSONObject.optString("voiceId"));
            }
            if (jSONObject.has("audioFormat")) {
                map.put("audio_format", jSONObject.optString("audioFormat"));
            }
            if (jSONObject.has("language")) {
                map.put("language", jSONObject.optString("language"));
            }
            MessageCenter.getInstance().convertTextToVoice(map, new IMCallback(v2TIMValueCallback) { // from class: com.tencent.imsdk.v2.V2TIMManagerExperimentImpl.36
                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Object obj2) {
                    if (!(obj2 instanceof Map)) {
                        super.success(obj2);
                        return;
                    }
                    try {
                        super.success(new JSONObject((Map) obj2).toString());
                    } catch (Exception unused) {
                        super.success(obj2);
                    }
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str2) {
                    super.fail(i11, str2);
                }
            });
        } catch (JSONException e11) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "convert param to json failed");
            e11.printStackTrace();
        }
    }

    private Object createSoundMessage(Object obj) {
        if (obj == null || !(obj instanceof String)) {
            IMLog.m75914e(TAG, "param is not string");
            return null;
        }
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            IMLog.m75914e(TAG, "param is empty");
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("url") && jSONObject.has("uuid") && jSONObject.has(TypedValues.TransitionType.S_DURATION)) {
                String strOptString = jSONObject.optString("url", "");
                String strOptString2 = jSONObject.optString("uuid", "");
                int iOptInt = jSONObject.optInt(TypedValues.TransitionType.S_DURATION, 0);
                String strOptString3 = jSONObject.optString("filePath", "");
                int iOptInt2 = jSONObject.optInt("fileSize", 0);
                SoundElement soundElement = new SoundElement();
                soundElement.setSoundFilePath(strOptString3);
                soundElement.setSoundDownloadUrl(strOptString);
                soundElement.setSoundUUID(strOptString2);
                soundElement.setSoundDuration(iOptInt);
                soundElement.setSoundFileSize(iOptInt2);
                Message message = new Message();
                message.addElement(soundElement);
                V2TIMMessage v2TIMMessage = new V2TIMMessage();
                v2TIMMessage.setMessage(message);
                return v2TIMMessage;
            }
            IMLog.m75914e(TAG, "url/uuid/duration is empty");
            return null;
        } catch (JSONException unused) {
            IMLog.m75914e(TAG, "convert param to json failed");
            return null;
        }
    }

    private void deleteRichStatus(Object obj, V2TIMValueCallback<Object> v2TIMValueCallback) {
        if (obj == null || !(obj instanceof String)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is not string");
            return;
        }
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is empty");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString(FirebaseAnalytics.Param.GROUP_ID);
            if (TextUtils.isEmpty(strOptString)) {
                callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "group_id is empty");
                return;
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("keys");
            if (jSONArrayOptJSONArray != null) {
                for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i11));
                }
            }
            GroupManager.getInstance().deleteRichStatus(strOptString, arrayList, new IMCallback(v2TIMValueCallback) { // from class: com.tencent.imsdk.v2.V2TIMManagerExperimentImpl.42
                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i12, String str2) {
                    super.fail(i12, str2);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Object obj2) {
                    super.success(obj2);
                }
            });
        } catch (JSONException e11) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "convert param to json failed");
            e11.printStackTrace();
        }
    }

    private void disableHttpRequest(Object obj, V2TIMValueCallback<Object> v2TIMValueCallback) {
        if (obj != null && (obj instanceof Boolean)) {
            BaseManager.getInstance().disableHttpRequest(((Boolean) obj).booleanValue());
        }
        callbackOnSuccess(v2TIMValueCallback, null);
    }

    private void downloadLibrary(Object obj, V2TIMValueCallback<Object> v2TIMValueCallback) {
        if (obj == null || !(obj instanceof Context)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is not context");
        }
        BaseManager.getInstance().downloadLibrary((Context) obj, new IMCallback(v2TIMValueCallback) { // from class: com.tencent.imsdk.v2.V2TIMManagerExperimentImpl.18
            @Override // com.tencent.imsdk.common.IMCallback
            public void fail(int i11, String str) {
                super.fail(i11, str);
            }

            @Override // com.tencent.imsdk.common.IMCallback
            public void success(Object obj2) {
                super.success(obj2);
            }
        });
    }

    private void findMergerMessages(Object obj, final V2TIMValueCallback<Object> v2TIMValueCallback) {
        if (obj == null || !(obj instanceof String)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is not string");
            return;
        }
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is empty");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("messageID");
            if (TextUtils.isEmpty(strOptString)) {
                callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "messageID is empty");
                return;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("mergerMessageIDList");
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                    String string = jSONArrayOptJSONArray.getString(i11);
                    if (string != null && string != null) {
                        arrayList.add(string);
                    }
                    callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "mergerMessageID is empty");
                    return;
                }
            }
            if (arrayList.size() == 0) {
                callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "mergerMessageIDList is empty");
            } else {
                MessageCenter.getInstance().findRelayMessageList(strOptString, arrayList, new IMCallback<List<Message>>(new V2TIMValueCallback<List<Message>>() { // from class: com.tencent.imsdk.v2.V2TIMManagerExperimentImpl.21
                    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                    public void onError(int i12, String str2) {
                        V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                        if (v2TIMValueCallback2 != null) {
                            v2TIMValueCallback2.onError(i12, str2);
                        }
                    }

                    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                    public void onSuccess(List<Message> list) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Message message : list) {
                            V2TIMMessage v2TIMMessage = new V2TIMMessage();
                            v2TIMMessage.setMessage(message);
                            arrayList2.add(v2TIMMessage);
                        }
                        V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                        if (v2TIMValueCallback2 != null) {
                            v2TIMValueCallback2.onSuccess(arrayList2);
                        }
                    }
                }) { // from class: com.tencent.imsdk.v2.V2TIMManagerExperimentImpl.22
                    @Override // com.tencent.imsdk.common.IMCallback
                    public void success(List<Message> list) {
                        super.success(list);
                    }

                    @Override // com.tencent.imsdk.common.IMCallback
                    public void fail(int i12, String str2) {
                        super.fail(i12, str2);
                    }
                });
            }
        } catch (JSONException e11) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "convert param to json failed");
            e11.printStackTrace();
        }
    }

    private void getBriefGroupMemberList(Object obj, final V2TIMValueCallback<Object> v2TIMValueCallback) {
        if (obj == null || !(obj instanceof String)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is not string");
            return;
        }
        V2TIMValueCallback<List<GroupMemberInfo>> v2TIMValueCallback2 = new V2TIMValueCallback<List<GroupMemberInfo>>() { // from class: com.tencent.imsdk.v2.V2TIMManagerExperimentImpl.23
            @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
            public void onError(int i11, String str) {
                V2TIMValueCallback v2TIMValueCallback3 = v2TIMValueCallback;
                if (v2TIMValueCallback3 != null) {
                    v2TIMValueCallback3.onError(i11, str);
                }
            }

            @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
            public void onSuccess(List<GroupMemberInfo> list) {
                if (v2TIMValueCallback != null) {
                    ArrayList arrayList = new ArrayList();
                    for (GroupMemberInfo groupMemberInfo : list) {
                        V2TIMGroupMemberFullInfo v2TIMGroupMemberFullInfo = new V2TIMGroupMemberFullInfo();
                        v2TIMGroupMemberFullInfo.setGroupMemberInfo(groupMemberInfo);
                        arrayList.add(v2TIMGroupMemberFullInfo);
                    }
                    v2TIMValueCallback.onSuccess(arrayList);
                }
            }
        };
        BaseManager.getInstance().getBriefGroupMemberList((String) obj, new IMCallback<List<GroupMemberInfo>>(v2TIMValueCallback2) { // from class: com.tencent.imsdk.v2.V2TIMManagerExperimentImpl.24
            @Override // com.tencent.imsdk.common.IMCallback
            public void success(List<GroupMemberInfo> list) {
                super.success(list);
            }

            @Override // com.tencent.imsdk.common.IMCallback
            public void fail(int i11, String str) {
                super.fail(i11, str);
            }
        });
    }

    private void getConversationGroupOrderData(Object obj, final V2TIMValueCallback<Object> v2TIMValueCallback) {
        ConversationManager.getInstance().getConversationGroupOrderData(new IMCallback<String>(new V2TIMValueCallback<String>() { // from class: com.tencent.imsdk.v2.V2TIMManagerExperimentImpl.2
            @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
            public void onError(int i11, String str) {
                V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                if (v2TIMValueCallback2 != null) {
                    v2TIMValueCallback2.onError(i11, str);
                }
            }

            @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
            public void onSuccess(String str) {
                v2TIMValueCallback.onSuccess(str);
            }
        }) { // from class: com.tencent.imsdk.v2.V2TIMManagerExperimentImpl.3
            @Override // com.tencent.imsdk.common.IMCallback
            public void success(String str) {
                super.success(str);
            }

            @Override // com.tencent.imsdk.common.IMCallback
            public void fail(int i11, String str) {
                super.fail(i11, str);
            }
        });
    }

    private void getGroupMessageReceipts(Object obj, final V2TIMValueCallback<Object> v2TIMValueCallback) {
        if (obj == null || !(obj instanceof String)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is not string");
            return;
        }
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is empty");
            return;
        }
        HashMap map = new HashMap();
        String strOptString = "";
        try {
            JSONObject jSONObject = new JSONObject(str);
            strOptString = jSONObject.optString("groupID");
            if (TextUtils.isEmpty(strOptString)) {
                callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "groupID is empty");
                return;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("requestList");
            for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i11);
                if (jSONObject2.has("messageSequence") && jSONObject2.has("memberIDList")) {
                    int i12 = jSONObject2.getInt("messageSequence");
                    JSONArray jSONArray = jSONObject2.getJSONArray("memberIDList");
                    ArrayList arrayList = new ArrayList();
                    for (int i13 = 0; i13 < jSONArray.length(); i13++) {
                        arrayList.add(jSONArray.getString(i13));
                    }
                    map.put(Integer.valueOf(i12), arrayList);
                }
                callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "invalid param");
                return;
            }
            BaseManager.getInstance().getGroupMessageReceipt(strOptString, map, new IMCallback<Map<Integer, Map<Integer, List<String>>>>(new V2TIMValueCallback<Map<Integer, Map<Integer, List<String>>>>() { // from class: com.tencent.imsdk.v2.V2TIMManagerExperimentImpl.30
                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onError(int i14, String str2) {
                    V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                    if (v2TIMValueCallback2 != null) {
                        v2TIMValueCallback2.onError(i14, str2);
                    }
                }

                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onSuccess(Map<Integer, Map<Integer, List<String>>> map2) {
                    if (v2TIMValueCallback != null) {
                        try {
                            JSONArray jSONArray2 = new JSONArray();
                            for (Map.Entry<Integer, Map<Integer, List<String>>> entry : map2.entrySet()) {
                                Map<Integer, List<String>> value = entry.getValue();
                                if (value != null && !value.isEmpty()) {
                                    Iterator<Map.Entry<Integer, List<String>>> it = value.entrySet().iterator();
                                    if (it.hasNext()) {
                                        Map.Entry<Integer, List<String>> next = it.next();
                                        List<String> value2 = next.getValue();
                                        JSONArray jSONArray3 = new JSONArray();
                                        for (String str2 : value2) {
                                            JSONObject jSONObject3 = new JSONObject();
                                            jSONObject3.put("memberID", str2);
                                            jSONArray3.put(jSONObject3);
                                        }
                                        int iIntValue = entry.getKey().intValue();
                                        int iIntValue2 = next.getKey().intValue();
                                        JSONObject jSONObject4 = new JSONObject();
                                        jSONObject4.put("messageSequence", iIntValue);
                                        jSONObject4.put("errorCode", iIntValue2);
                                        jSONObject4.put("readInfoList", jSONArray3);
                                        jSONArray2.put(jSONObject4);
                                    }
                                }
                            }
                            v2TIMValueCallback.onSuccess(jSONArray2);
                        } catch (JSONException e11) {
                            V2TIMManagerExperimentImpl.this.callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "convert param to json failed");
                            e11.printStackTrace();
                        }
                    }
                }
            }) { // from class: com.tencent.imsdk.v2.V2TIMManagerExperimentImpl.31
                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Map<Integer, Map<Integer, List<String>>> map2) {
                    super.success(map2);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i14, String str2) {
                    super.fail(i14, str2);
                }
            });
        } catch (JSONException e11) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "convert param to json failed");
            e11.printStackTrace();
        }
    }

    private void getMessageExtensionsBySequence(Object obj, final V2TIMValueCallback<Object> v2TIMValueCallback) {
        long jOptLong;
        if (obj == null || !(obj instanceof String)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is not string");
            return;
        }
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is empty");
            return;
        }
        String strOptString = "";
        new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(str);
            strOptString = jSONObject.optString("groupID");
            jOptLong = jSONObject.optLong("messageSequence");
        } catch (JSONException e11) {
            e11.printStackTrace();
            jOptLong = 0;
        }
        V2TIMValueCallback<List<MessageExtension>> v2TIMValueCallback2 = new V2TIMValueCallback<List<MessageExtension>>() { // from class: com.tencent.imsdk.v2.V2TIMManagerExperimentImpl.6
            @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
            public void onError(int i11, String str2) {
                V2TIMValueCallback v2TIMValueCallback3 = v2TIMValueCallback;
                if (v2TIMValueCallback3 != null) {
                    v2TIMValueCallback3.onError(i11, str2);
                }
            }

            @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
            public void onSuccess(List<MessageExtension> list) {
                if (v2TIMValueCallback != null) {
                    ArrayList arrayList = new ArrayList();
                    for (MessageExtension messageExtension : list) {
                        V2TIMMessageExtension v2TIMMessageExtension = new V2TIMMessageExtension();
                        v2TIMMessageExtension.setMessageExtension(messageExtension);
                        arrayList.add(v2TIMMessageExtension);
                    }
                    v2TIMValueCallback.onSuccess(arrayList);
                }
            }
        };
        Message message = new Message();
        message.setMessageStatus(2);
        message.setSupportMessageExtension(true);
        message.addElement(new TextElement());
        message.setMessageType(2);
        message.setGroupID(strOptString);
        message.setSeq(jOptLong);
        MessageCenter.getInstance().getMessageExtensions(message, new IMCallback<List<MessageExtension>>(v2TIMValueCallback2) { // from class: com.tencent.imsdk.v2.V2TIMManagerExperimentImpl.7
            @Override // com.tencent.imsdk.common.IMCallback
            public void success(List<MessageExtension> list) {
                super.success(list);
            }

            @Override // com.tencent.imsdk.common.IMCallback
            public void fail(int i11, String str2) {
                super.fail(i11, str2);
            }
        });
    }

    private void getMessageRevoker(Object obj, final V2TIMValueCallback<Object> v2TIMValueCallback) {
        if (!(obj instanceof List)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is not list");
            return;
        }
        List<String> list = (List) obj;
        Iterator<String> it = list.iterator();
        if (it.hasNext() && !(it.next() instanceof String)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "item is no String type");
        } else {
            MessageCenter.getInstance().findMessageByMessageId(list, new IMCallback<List<Message>>(new V2TIMValueCallback<List<Message>>() { // from class: com.tencent.imsdk.v2.V2TIMManagerExperimentImpl.12
                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onError(int i11, String str) {
                    V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                    if (v2TIMValueCallback2 != null) {
                        v2TIMValueCallback2.onError(i11, str);
                    }
                }

                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onSuccess(List<Message> list2) {
                    if (list2.size() == 0) {
                        V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                        if (v2TIMValueCallback2 != null) {
                            v2TIMValueCallback2.onError(BaseConstants.ERR_INVALID_PARAMETERS, "local messages do not exist");
                            return;
                        }
                        return;
                    }
                    if (v2TIMValueCallback != null) {
                        HashMap map = new HashMap();
                        for (Message message : list2) {
                            map.put(message.getMsgID(), message.getRevokerInfo().getUserID());
                        }
                        v2TIMValueCallback.onSuccess(map);
                    }
                }
            }) { // from class: com.tencent.imsdk.v2.V2TIMManagerExperimentImpl.13
                @Override // com.tencent.imsdk.common.IMCallback
                public void success(List<Message> list2) {
                    super.success(list2);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str) {
                    super.fail(i11, str);
                }
            });
        }
    }

    private void getMessageSource(Object obj, V2TIMValueCallback<Object> v2TIMValueCallback) {
        if (obj == null || !(obj instanceof V2TIMMessage)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param invalid");
        } else {
            Message message = ((V2TIMMessage) obj).getMessage();
            callbackOnSuccess(v2TIMValueCallback, new Integer(message != null ? message.getMessageSource() : 0));
        }
    }

    private void getOfficialAccountList(Object obj, final V2TIMValueCallback<Object> v2TIMValueCallback) {
        long jOptLong;
        if (obj == null || !(obj instanceof String)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is not string");
            return;
        }
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is empty");
            return;
        }
        int iOptInt = 0;
        try {
            JSONObject jSONObject = new JSONObject(str);
            iOptInt = jSONObject.optInt("count");
            jOptLong = jSONObject.optLong(TypedValues.CycleType.S_WAVE_OFFSET);
        } catch (JSONException e11) {
            e11.printStackTrace();
            jOptLong = 0;
        }
        RelationshipManager.getInstance().getOfficialAccountList(iOptInt, jOptLong, new IMCallback<HashMap<String, Object>>(new V2TIMValueCallback<HashMap<String, Object>>() { // from class: com.tencent.imsdk.v2.V2TIMManagerExperimentImpl.32
            @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
            public void onError(int i11, String str2) {
                V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                if (v2TIMValueCallback2 != null) {
                    v2TIMValueCallback2.onError(i11, str2);
                }
            }

            @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
            public void onSuccess(HashMap<String, Object> map) {
                if (v2TIMValueCallback != null) {
                    if (map.get("official_account_list") != null) {
                        List<OfficialAccountInfo> list = (List) map.get("official_account_list");
                        ArrayList arrayList = new ArrayList();
                        for (OfficialAccountInfo officialAccountInfo : list) {
                            V2TIMOfficialAccountInfo v2TIMOfficialAccountInfo = new V2TIMOfficialAccountInfo();
                            v2TIMOfficialAccountInfo.setOfficialAccountInfo(officialAccountInfo);
                            arrayList.add(v2TIMOfficialAccountInfo);
                        }
                        map.put("official_account_list", arrayList);
                    } else {
                        map.put("official_account_list", new ArrayList());
                    }
                    v2TIMValueCallback.onSuccess(map);
                }
            }
        }) { // from class: com.tencent.imsdk.v2.V2TIMManagerExperimentImpl.33
            @Override // com.tencent.imsdk.common.IMCallback
            public void success(HashMap<String, Object> map) {
                super.success(map);
            }

            @Override // com.tencent.imsdk.common.IMCallback
            public void fail(int i11, String str2) {
                super.fail(i11, str2);
            }
        });
    }

    private void getPushMessageID(Object obj, V2TIMValueCallback<Object> v2TIMValueCallback) {
        if (obj == null || !(obj instanceof V2TIMMessage)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param invalid");
        } else {
            Message message = ((V2TIMMessage) obj).getMessage();
            callbackOnSuccess(v2TIMValueCallback, message != null ? message.getPushMessageID() : "");
        }
    }

    private void getRichStatus(Object obj, final V2TIMValueCallback<Object> v2TIMValueCallback) {
        if (obj == null || !(obj instanceof String)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is not string");
            return;
        }
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is empty");
            return;
        }
        try {
            String strOptString = new JSONObject(str).optString(FirebaseAnalytics.Param.GROUP_ID);
            if (TextUtils.isEmpty(strOptString)) {
                callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "group_id is empty");
                return;
            }
            GroupManager.getInstance().getGroupAttributes(strOptString, new ArrayList(), new IMCallback<Map<String, String>>(new V2TIMValueCallback<Map<String, String>>() { // from class: com.tencent.imsdk.v2.V2TIMManagerExperimentImpl.43
                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onError(int i11, String str2) {
                    V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                    if (v2TIMValueCallback2 != null) {
                        v2TIMValueCallback2.onError(i11, str2);
                    }
                }

                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onSuccess(Map<String, String> map) {
                    V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                    if (v2TIMValueCallback2 != null) {
                        v2TIMValueCallback2.onSuccess(map);
                    }
                }
            }) { // from class: com.tencent.imsdk.v2.V2TIMManagerExperimentImpl.44
                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Map<String, String> map) {
                    super.success(map);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str2) {
                    super.fail(i11, str2);
                }
            });
        } catch (JSONException e11) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "convert param to json failed");
            e11.printStackTrace();
        }
    }

    private void initLocalStorage(Object obj, V2TIMValueCallback<Object> v2TIMValueCallback) {
        if (!(obj instanceof String)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is not string");
            return;
        }
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "invalid userID");
        } else {
            BaseManager.getInstance().initLocalStorage(str, new IMCallback(v2TIMValueCallback) { // from class: com.tencent.imsdk.v2.V2TIMManagerExperimentImpl.19
                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str2) {
                    super.fail(i11, str2);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Object obj2) {
                    super.success(obj2);
                }
            });
        }
    }

    private void isCommercialAbilityEnabled(Object obj, V2TIMValueCallback<Object> v2TIMValueCallback) {
        if (obj == null || !(obj instanceof Long)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is not int");
        } else {
            BaseManager.getInstance().isCommercialAbilityEnabled(((Long) obj).longValue(), new IMCallback<Object>(v2TIMValueCallback) { // from class: com.tencent.imsdk.v2.V2TIMManagerExperimentImpl.16
                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str) {
                    super.fail(i11, str);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Object obj2) {
                    super.success(obj2);
                }
            });
        }
    }

    private void pushLogin(Object obj, V2TIMValueCallback<Object> v2TIMValueCallback) {
        if (obj == null || !(obj instanceof String)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is not string");
            return;
        }
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is empty");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            BaseManager.getInstance().login(jSONObject.optString("userID"), jSONObject.optString("appKey"), new IMCallback(v2TIMValueCallback) { // from class: com.tencent.imsdk.v2.V2TIMManagerExperimentImpl.26
                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str2) {
                    super.fail(i11, str2);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Object obj2) {
                    super.success(obj2);
                }
            }, 2);
        } catch (JSONException e11) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "convert param to json failed");
            e11.printStackTrace();
        }
    }

    private void reportOfflinePushEvent(Object obj, V2TIMValueCallback<Object> v2TIMValueCallback) {
        if (obj == null || !(obj instanceof String)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is not string");
            return;
        }
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is empty");
            return;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray(TIMPushConstants.PUSH_REPORT_EVENT_LIST_KEY);
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                    JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i11);
                    OfflinePushEventItem offlinePushEventItem = new OfflinePushEventItem();
                    offlinePushEventItem.setEventType(jSONObject.optInt("type"));
                    offlinePushEventItem.setEventTime(jSONObject.getLong("time"));
                    offlinePushEventItem.setPushId(jSONObject.optString("pushId"));
                    arrayList.add(offlinePushEventItem);
                }
            }
            OfflinePushManager.getInstance().reportOfflinePushEvent(arrayList, new IMCallback(v2TIMValueCallback) { // from class: com.tencent.imsdk.v2.V2TIMManagerExperimentImpl.25
                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i12, String str2) {
                    super.fail(i12, str2);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Object obj2) {
                    super.success(obj2);
                }
            });
        } catch (JSONException e11) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "convert param to json failed");
            e11.printStackTrace();
        }
    }

    private void reportPushSDKEvent(Object obj, V2TIMValueCallback<Object> v2TIMValueCallback) {
        if (obj == null || !(obj instanceof String)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is not string");
            return;
        }
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is empty");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            BaseManager.getInstance().reportPushSDKEvent(jSONObject.optLong("event_id"), jSONObject.optLong("event_code"), jSONObject.optLong("event_result"), jSONObject.optString("event_message"), jSONObject.optString("more_message"), jSONObject.optString("extension_message"), new IMCallback(v2TIMValueCallback) { // from class: com.tencent.imsdk.v2.V2TIMManagerExperimentImpl.27
                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str2) {
                    super.fail(i11, str2);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Object obj2) {
                    super.success(obj2);
                }
            });
        } catch (JSONException e11) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "convert param to json failed");
            e11.printStackTrace();
        }
    }

    private void reportRoomEngineEvent(Object obj, V2TIMValueCallback<Object> v2TIMValueCallback) {
        if (obj == null || !(obj instanceof String)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is not string");
            return;
        }
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is empty");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            BaseManager.getInstance().reportRoomEngineEvent(jSONObject.optLong("event_id"), jSONObject.optLong("event_code"), jSONObject.optLong("event_result"), jSONObject.optString("event_message"), jSONObject.optString("more_message"), jSONObject.optString("extension_message"), new IMCallback(v2TIMValueCallback) { // from class: com.tencent.imsdk.v2.V2TIMManagerExperimentImpl.40
                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str2) {
                    super.fail(i11, str2);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Object obj2) {
                    super.success(obj2);
                }
            });
        } catch (JSONException e11) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "convert param to json failed");
            e11.printStackTrace();
        }
    }

    private void reportTUIComponentUsage(Object obj, V2TIMValueCallback<Object> v2TIMValueCallback) {
        if (obj == null || !(obj instanceof String)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is not string");
            return;
        }
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is empty");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            BaseManager.getInstance().reportTUIComponentUsage(jSONObject.optLong("UIComponentType"), jSONObject.optLong("UIStyleType"));
            callbackOnSuccess(v2TIMValueCallback, null);
        } catch (JSONException e11) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "convert param to json failed");
            e11.printStackTrace();
        }
    }

    private void reportTUIFeatureUsage(Object obj, V2TIMValueCallback<Object> v2TIMValueCallback) {
        if (obj == null || !(obj instanceof String)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is not string");
            return;
        }
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is empty");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("UIComponentType") && !jSONObject.has("UIFeatureType")) {
                callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "invalid param");
            } else {
                BaseManager.getInstance().reportTUIFeatureUsage(jSONObject.has("UIComponentType") ? jSONObject.optLong("UIComponentType") : 0L, jSONObject.has("UIFeatureType") ? jSONObject.optLong("UIFeatureType") : 0L);
                callbackOnSuccess(v2TIMValueCallback, null);
            }
        } catch (JSONException e11) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "convert param to json failed");
            e11.printStackTrace();
        }
    }

    private void sendTRTCCustomData(Object obj, V2TIMValueCallback<Object> v2TIMValueCallback) {
        if (obj == null || !(obj instanceof byte[])) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is not byte array");
        } else {
            BaseManager.getInstance().sendTRTCCustomData((byte[]) obj, new IMCallback(v2TIMValueCallback) { // from class: com.tencent.imsdk.v2.V2TIMManagerExperimentImpl.9
                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str) {
                    super.fail(i11, str);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Object obj2) {
                    super.success(obj2);
                }
            });
        }
    }

    private void setApplicationID(Object obj, V2TIMValueCallback<Object> v2TIMValueCallback) {
        if (obj != null && (obj instanceof Integer)) {
            BaseManager.getInstance().setApplicationID(((Integer) obj).intValue());
        }
        callbackOnSuccess(v2TIMValueCallback, null);
    }

    private void setBuildInfo(Object obj, V2TIMValueCallback<Object> v2TIMValueCallback) {
        if (obj == null || !(obj instanceof String)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is not string");
            return;
        }
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is empty");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("buildBrand");
            String strOptString2 = jSONObject.optString("buildManufacturer");
            String strOptString3 = jSONObject.optString("buildModel");
            String strOptString4 = jSONObject.optString("buildVersionRelease");
            int iOptInt = jSONObject.optInt("buildVersionSDKInt");
            SystemUtil.setBuildBrand(strOptString);
            SystemUtil.setBuildManufacturer(strOptString2);
            SystemUtil.setBuildModel(strOptString3);
            SystemUtil.setBuildVersionRelease(strOptString4);
            SystemUtil.setBuildVersionSDKInt(iOptInt);
            callbackOnSuccess(v2TIMValueCallback, null);
        } catch (JSONException e11) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "convert param to json failed");
            e11.printStackTrace();
        }
    }

    private void setConversationGroupOrderData(Object obj, V2TIMValueCallback<Object> v2TIMValueCallback) {
        if (obj == null || !(obj instanceof String)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is not string");
        } else {
            ConversationManager.getInstance().setConversationGroupOrderData((String) obj, new IMCallback(v2TIMValueCallback) { // from class: com.tencent.imsdk.v2.V2TIMManagerExperimentImpl.1
                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str) {
                    super.fail(i11, str);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Object obj2) {
                    super.success(obj2);
                }
            });
        }
    }

    private void setCosSaveRegion(Object obj, V2TIMValueCallback<Object> v2TIMValueCallback) {
        if (obj == null || !(obj instanceof String)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is not string");
            return;
        }
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is empty");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("conversationID");
            String strOptString2 = jSONObject.optString("cosSaveRegion");
            if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                ConversationManager.getInstance().setCosSaveRegionForConversation(V2TIMConversationManagerImpl.getInstance().getConversationKey(strOptString), strOptString2, new IMCallback(v2TIMValueCallback) { // from class: com.tencent.imsdk.v2.V2TIMManagerExperimentImpl.17
                    @Override // com.tencent.imsdk.common.IMCallback
                    public void fail(int i11, String str2) {
                        super.fail(i11, str2);
                    }

                    @Override // com.tencent.imsdk.common.IMCallback
                    public void success(Object obj2) {
                        super.success(obj2);
                    }
                });
                return;
            }
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "invalid param");
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }

    private void setCustomLoginInfo(Object obj, V2TIMValueCallback<Object> v2TIMValueCallback) {
        if (obj == null || !(obj instanceof String)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is not string");
            return;
        }
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is empty");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("userID") && jSONObject.has("customLoginInfo")) {
                BaseManager.getInstance().setCustomLoginInfo(jSONObject.optString("userID"), jSONObject.optString("customLoginInfo"), new IMCallback(v2TIMValueCallback) { // from class: com.tencent.imsdk.v2.V2TIMManagerExperimentImpl.28
                    @Override // com.tencent.imsdk.common.IMCallback
                    public void fail(int i11, String str2) {
                        super.fail(i11, str2);
                    }

                    @Override // com.tencent.imsdk.common.IMCallback
                    public void success(Object obj2) {
                        super.success(obj2);
                    }
                });
                return;
            }
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "invalid param");
        } catch (JSONException e11) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "convert param to json failed");
            e11.printStackTrace();
        }
    }

    private void setCustomServerInfo(Object obj, V2TIMValueCallback<Object> v2TIMValueCallback) {
        if (obj == null || !(obj instanceof String)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is not string");
            return;
        }
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is empty");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("serverType")) {
                BaseManager.getInstance().setServerType(Integer.valueOf(jSONObject.getInt("serverType")));
                callbackOnSuccess(v2TIMValueCallback, null);
                return;
            }
            CustomServerInfo customServerInfo = new CustomServerInfo();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("longconnectionAddressList");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i11);
                    CustomServerInfo.ServerAddress serverAddress = new CustomServerInfo.ServerAddress();
                    serverAddress.f73266ip = jSONObject2.optString("ip");
                    serverAddress.port = jSONObject2.optInt("port");
                    serverAddress.isIPv6 = jSONObject2.has("isIPv6") ? jSONObject2.optBoolean("isIPv6") : false;
                    serverAddress.isQuic = jSONObject2.has("isQuic") ? jSONObject2.optBoolean("isQuic") : false;
                    serverAddress.isTLS = jSONObject2.has("isTLS") ? jSONObject2.optBoolean("isTLS") : false;
                    arrayList.add(serverAddress);
                }
                customServerInfo.longconnectionAddressList = arrayList;
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("shortconnectionAddressList");
            if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                ArrayList arrayList2 = new ArrayList();
                for (int i12 = 0; i12 < jSONArrayOptJSONArray2.length(); i12++) {
                    JSONObject jSONObject3 = jSONArrayOptJSONArray2.getJSONObject(i12);
                    CustomServerInfo.ServerAddress serverAddress2 = new CustomServerInfo.ServerAddress();
                    serverAddress2.f73266ip = jSONObject3.optString("ip");
                    serverAddress2.port = jSONObject3.optInt("port");
                    serverAddress2.isIPv6 = jSONObject3.has("isIPv6") ? jSONObject3.optBoolean("isIPv6") : false;
                    serverAddress2.isTLS = jSONObject3.has("isTLS") ? jSONObject3.optBoolean("isTLS") : false;
                    arrayList2.add(serverAddress2);
                }
                customServerInfo.shortconnectionAddressList = arrayList2;
            }
            customServerInfo.serverPublicKey = jSONObject.optString("serverPublicKey");
            BaseManager.getInstance().setCustomServerInfo(customServerInfo);
            callbackOnSuccess(v2TIMValueCallback, null);
        } catch (JSONException e11) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "convert param to json failed");
            e11.printStackTrace();
        }
    }

    private void setDatabaseEncryptInfo(Object obj, V2TIMValueCallback<Object> v2TIMValueCallback) {
        if (obj == null || !(obj instanceof String)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is not string");
            return;
        }
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is empty");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("encryptType")) {
                callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "encryptType must be set");
                return;
            }
            SDKConfig.DatabaseEncryptInfo databaseEncryptInfo = new SDKConfig.DatabaseEncryptInfo();
            databaseEncryptInfo.encryptType = jSONObject.optInt("encryptType");
            if (jSONObject.has("encryptKey")) {
                databaseEncryptInfo.encryptKey = jSONObject.optString("encryptKey");
            }
            BaseManager.getInstance().setDatabaseEncryptInfo(databaseEncryptInfo);
            callbackOnSuccess(v2TIMValueCallback, null);
        } catch (JSONException e11) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "convert param to json failed");
            e11.printStackTrace();
        }
    }

    private void setForceRequestCloudMessage(Object obj, V2TIMValueCallback<Object> v2TIMValueCallback) {
        if (obj != null && (obj instanceof Boolean)) {
            BaseManager.getInstance().setForceRequestCloudMessage(((Boolean) obj).booleanValue());
        }
        callbackOnSuccess(v2TIMValueCallback, null);
    }

    private void setIPv6Prior(Object obj, V2TIMValueCallback<Object> v2TIMValueCallback) {
        if (obj != null && (obj instanceof Boolean)) {
            BaseManager.getInstance().setIPv6Prior(((Boolean) obj).booleanValue());
        }
        callbackOnSuccess(v2TIMValueCallback, null);
    }

    private void setLibraryPath(Object obj, V2TIMValueCallback<Object> v2TIMValueCallback) {
        if (!(obj instanceof String)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is not string");
            return;
        }
        if (BaseManager.getInstance().setLibraryPath((String) obj)) {
            callbackOnSuccess(v2TIMValueCallback, null);
        } else {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "system load so library failed");
        }
    }

    private void setMessageExtensionsBySequence(Object obj, final V2TIMValueCallback<Object> v2TIMValueCallback) {
        if (obj == null || !(obj instanceof String)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is not string");
            return;
        }
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is empty");
            return;
        }
        String strOptString = "";
        ArrayList arrayList = new ArrayList();
        long jOptLong = 0;
        try {
            JSONObject jSONObject = new JSONObject(str);
            strOptString = jSONObject.optString("groupID");
            jOptLong = jSONObject.optLong("messageSequence");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("messageExtensionList");
            for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i11);
                MessageExtension messageExtension = new MessageExtension();
                messageExtension.setExtensionKey(jSONObject2.optString("extensionKey"));
                messageExtension.setExtensionValue(jSONObject2.optString("extensionValue"));
                arrayList.add(messageExtension);
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        V2TIMValueCallback<List<MessageExtensionResult>> v2TIMValueCallback2 = new V2TIMValueCallback<List<MessageExtensionResult>>() { // from class: com.tencent.imsdk.v2.V2TIMManagerExperimentImpl.4
            @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
            public void onError(int i12, String str2) {
                V2TIMValueCallback v2TIMValueCallback3 = v2TIMValueCallback;
                if (v2TIMValueCallback3 != null) {
                    v2TIMValueCallback3.onError(i12, str2);
                }
            }

            @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
            public void onSuccess(List<MessageExtensionResult> list) {
                if (v2TIMValueCallback != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (MessageExtensionResult messageExtensionResult : list) {
                        V2TIMMessageExtensionResult v2TIMMessageExtensionResult = new V2TIMMessageExtensionResult();
                        v2TIMMessageExtensionResult.setMessageExtensionResult(messageExtensionResult);
                        arrayList2.add(v2TIMMessageExtensionResult);
                    }
                    v2TIMValueCallback.onSuccess(arrayList2);
                }
            }
        };
        Message message = new Message();
        message.setMessageStatus(2);
        message.setSupportMessageExtension(true);
        message.addElement(new TextElement());
        message.setMessageType(2);
        message.setGroupID(strOptString);
        message.setSeq(jOptLong);
        MessageCenter.getInstance().setMessageExtensions(message, arrayList, new IMCallback<List<MessageExtensionResult>>(v2TIMValueCallback2) { // from class: com.tencent.imsdk.v2.V2TIMManagerExperimentImpl.5
            @Override // com.tencent.imsdk.common.IMCallback
            public void success(List<MessageExtensionResult> list) {
                super.success(list);
            }

            @Override // com.tencent.imsdk.common.IMCallback
            public void fail(int i12, String str2) {
                super.fail(i12, str2);
            }
        });
    }

    private void setOfflinePushInfo(Object obj, V2TIMValueCallback<Object> v2TIMValueCallback) {
        if (obj == null || !(obj instanceof String)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is not string");
            return;
        }
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is empty");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("notification_bar_state");
            String strOptString = jSONObject.optString("tim_push_plugin_version");
            String strOptString2 = jSONObject.optString("system_language");
            int iOptInt2 = jSONObject.optInt("token_error_code");
            String strOptString3 = jSONObject.optString("token_error_msg");
            if (iOptInt < 0 || iOptInt > 2) {
                iOptInt = 0;
            }
            OfflinePushManager.getInstance().setOfflinePushInfo(strOptString, iOptInt, strOptString2, iOptInt2, strOptString3);
            callbackOnSuccess(v2TIMValueCallback, null);
        } catch (JSONException e11) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "convert param to json failed");
            e11.printStackTrace();
        }
    }

    private void setOfflinePushState(Object obj, V2TIMValueCallback<Object> v2TIMValueCallback) {
        if (obj == null || !(obj instanceof Integer)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is not int");
            return;
        }
        OfflinePushConfig offlinePushConfig = new OfflinePushConfig();
        offlinePushConfig.setOpenOfflinePush(((Integer) obj).intValue());
        OfflinePushManager.getInstance().setOfflinePushConfig(offlinePushConfig, new IMCallback(v2TIMValueCallback) { // from class: com.tencent.imsdk.v2.V2TIMManagerExperimentImpl.14
            @Override // com.tencent.imsdk.common.IMCallback
            public void fail(int i11, String str) {
                super.fail(i11, str);
            }

            @Override // com.tencent.imsdk.common.IMCallback
            public void success(Object obj2) {
                super.success(obj2);
            }
        });
    }

    private void setQuicChannelEnabled(Object obj, V2TIMValueCallback<Object> v2TIMValueCallback) {
        if (obj == null || !(obj instanceof String)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is not string");
            return;
        }
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is empty");
            return;
        }
        try {
            BaseManager.getInstance().setQuicEnabled(new JSONObject(str).optBoolean("enableQuic"));
            callbackOnSuccess(v2TIMValueCallback, null);
        } catch (JSONException e11) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "convert param to json failed");
            e11.printStackTrace();
        }
    }

    private void setRichStatus(Object obj, V2TIMValueCallback<Object> v2TIMValueCallback) {
        if (obj == null || !(obj instanceof String)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is not string");
            return;
        }
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is empty");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString(FirebaseAnalytics.Param.GROUP_ID);
            if (TextUtils.isEmpty(strOptString)) {
                callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "group_id is empty");
                return;
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("rich_status");
            if (jSONObjectOptJSONObject == null) {
                callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "rich_status is null");
                return;
            }
            HashMap<String, String> map = new HashMap<>();
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObjectOptJSONObject.optString(next));
            }
            GroupManager.getInstance().setRichStatus(strOptString, map, new IMCallback(v2TIMValueCallback) { // from class: com.tencent.imsdk.v2.V2TIMManagerExperimentImpl.41
                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str2) {
                    super.fail(i11, str2);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Object obj2) {
                    super.success(obj2);
                }
            });
        } catch (JSONException e11) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "convert param to json failed");
            e11.printStackTrace();
        }
    }

    private void setTestEnvironment(Object obj, V2TIMValueCallback<Object> v2TIMValueCallback) {
        if (obj != null && (obj instanceof Boolean)) {
            BaseManager.getInstance().setTestEnvironment(((Boolean) obj).booleanValue());
        }
        callbackOnSuccess(v2TIMValueCallback, null);
    }

    private void setUIPlatform(Object obj, V2TIMValueCallback<Object> v2TIMValueCallback) {
        String str;
        if (obj == null) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is null");
            return;
        }
        int iIntValue = 0;
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            if (obj instanceof Integer) {
                iIntValue = ((Integer) obj).intValue();
            } else {
                callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is invalid");
            }
            str = "";
        }
        BaseManager.getInstance().setCustomUIPlatform(str, iIntValue);
        callbackOnSuccess(v2TIMValueCallback, null);
    }

    private void uploadFile(Object obj, V2TIMValueCallback<Object> v2TIMValueCallback) {
        if (obj == null || !(obj instanceof String)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is not string");
            return;
        }
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is empty");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("filePath")) {
                callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "filePath must be set");
                return;
            }
            String strOptString = jSONObject.optString("filePath");
            int iOptInt = jSONObject.optInt("fileType", 0);
            if (TextUtils.isEmpty(strOptString)) {
                callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "filePath is invalid");
            } else {
                BaseManager.getInstance().uploadFile(strOptString, iOptInt, new IMCallback(v2TIMValueCallback) { // from class: com.tencent.imsdk.v2.V2TIMManagerExperimentImpl.34
                    @Override // com.tencent.imsdk.common.IMCallback
                    public void fail(int i11, String str2) {
                        super.fail(i11, str2);
                    }

                    @Override // com.tencent.imsdk.common.IMCallback
                    public void success(Object obj2) {
                        super.success(obj2);
                    }
                });
            }
        } catch (JSONException e11) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "convert param to json failed");
            e11.printStackTrace();
        }
    }

    private void voiceClone(Object obj, V2TIMValueCallback<Object> v2TIMValueCallback) {
        if (obj == null || !(obj instanceof String)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is not string");
            return;
        }
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is empty");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("voiceName")) {
                callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "voiceName must be set");
                return;
            }
            String strOptString = jSONObject.optString("voiceName");
            if (TextUtils.isEmpty(strOptString)) {
                callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "voiceName is invalid");
                return;
            }
            if (!jSONObject.has("audioUrl")) {
                callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "audioUrl must be set");
                return;
            }
            String strOptString2 = jSONObject.optString("audioUrl");
            if (TextUtils.isEmpty(strOptString2)) {
                callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "audioUrl is invalid");
                return;
            }
            MessageCenter.getInstance().voiceClone(strOptString2, strOptString, jSONObject.optString("promptText", ""), jSONObject.optString("language", ""), new IMCallback(v2TIMValueCallback) { // from class: com.tencent.imsdk.v2.V2TIMManagerExperimentImpl.37
                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Object obj2) {
                    if (!(obj2 instanceof Map)) {
                        super.success(obj2);
                        return;
                    }
                    try {
                        super.success(new JSONObject((Map) obj2).toString());
                    } catch (Exception unused) {
                        super.success(obj2);
                    }
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str2) {
                    super.fail(i11, str2);
                }
            });
        } catch (JSONException e11) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "convert param to json failed");
            e11.printStackTrace();
        }
    }

    private void writeLog(Object obj, V2TIMValueCallback<Object> v2TIMValueCallback) {
        if (obj == null || !(obj instanceof String)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is not string");
            return;
        }
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is empty");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("logLevel");
            String strOptString = jSONObject.optString("logContent");
            String strOptString2 = jSONObject.optString("fileName");
            if (iOptInt == 2) {
                IMLog.m75916v(strOptString2, strOptString);
            } else if (iOptInt == 3) {
                IMLog.m75913d(strOptString2, strOptString);
            } else if (iOptInt == 4) {
                IMLog.m75915i(strOptString2, strOptString);
            } else if (iOptInt == 5) {
                IMLog.m75917w(strOptString2, strOptString);
            } else {
                if (iOptInt != 6) {
                    callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "invalid logLevel");
                    return;
                }
                IMLog.m75914e(strOptString2, strOptString);
            }
            callbackOnSuccess(v2TIMValueCallback, null);
        } catch (JSONException e11) {
            callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "convert param to json failed");
            e11.printStackTrace();
        }
    }

    private void convertVoiceToText(Object obj, V2TIMValueCallback<Object> v2TIMValueCallback) {
        if (obj != null && (obj instanceof String)) {
            String str = (String) obj;
            if (TextUtils.isEmpty(str)) {
                callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is empty");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (!jSONObject.has("url")) {
                    callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "url must be set");
                    return;
                }
                String strOptString = jSONObject.optString("url");
                String strOptString2 = jSONObject.optString("language", "");
                if (TextUtils.isEmpty(strOptString)) {
                    callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "url is invalid");
                    return;
                } else {
                    MessageCenter.getInstance().convertVoiceToText(strOptString, strOptString2, new IMCallback(v2TIMValueCallback) { // from class: com.tencent.imsdk.v2.V2TIMManagerExperimentImpl.35
                        @Override // com.tencent.imsdk.common.IMCallback
                        public void fail(int i11, String str2) {
                            super.fail(i11, str2);
                        }

                        @Override // com.tencent.imsdk.common.IMCallback
                        public void success(Object obj2) {
                            super.success(obj2);
                        }
                    });
                    return;
                }
            } catch (JSONException e11) {
                callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "convert param to json failed");
                e11.printStackTrace();
                return;
            }
        }
        callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is not string");
    }

    private Object createFileMessage(Object obj) {
        if (obj != null && (obj instanceof String)) {
            String str = (String) obj;
            if (TextUtils.isEmpty(str)) {
                IMLog.m75914e(TAG, "param is empty");
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("url") && jSONObject.has("uuid")) {
                    String strOptString = jSONObject.optString("url", "");
                    String strOptString2 = jSONObject.optString("uuid", "");
                    String strOptString3 = jSONObject.optString("filePath", "");
                    int iOptInt = jSONObject.optInt("fileSize", 0);
                    String strOptString4 = jSONObject.optString("fileName", "");
                    FileElement fileElement = new FileElement();
                    fileElement.setFilePath(strOptString3);
                    fileElement.setFileDownloadUrl(strOptString);
                    fileElement.setFileUUID(strOptString2);
                    fileElement.setFileSize(iOptInt);
                    fileElement.setFileName(strOptString4);
                    Message message = new Message();
                    message.addElement(fileElement);
                    V2TIMMessage v2TIMMessage = new V2TIMMessage();
                    v2TIMMessage.setMessage(message);
                    return v2TIMMessage;
                }
                IMLog.m75914e(TAG, "url/uuid is empty");
                return null;
            } catch (JSONException unused) {
                IMLog.m75914e(TAG, "convert param to json failed");
                return null;
            }
        }
        IMLog.m75914e(TAG, "param is not string");
        return null;
    }

    private Object createImageMessage(Object obj) {
        if (obj != null && (obj instanceof String)) {
            String str = (String) obj;
            if (TextUtils.isEmpty(str)) {
                IMLog.m75914e(TAG, "param is empty");
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("originImageUrl") && jSONObject.has("originImageUuid")) {
                    String strOptString = jSONObject.optString("originImageUrl", "");
                    String strOptString2 = jSONObject.optString("originImageUuid", "");
                    String strOptString3 = jSONObject.optString("filePath", "");
                    int iOptInt = jSONObject.optInt("originFileSize", 0);
                    int iOptInt2 = jSONObject.optInt("originImageWidth", 0);
                    int iOptInt3 = jSONObject.optInt("originImageHeight", 0);
                    ImageElement imageElement = new ImageElement();
                    imageElement.setOriginImageFilePath(strOptString3);
                    imageElement.setOriginImageUrl(strOptString);
                    imageElement.setOriginImageUUID(strOptString2);
                    imageElement.setOriginImageFileSize(iOptInt);
                    imageElement.setOriginImageWidth(iOptInt2);
                    imageElement.setOriginImageHeight(iOptInt3);
                    String strOptString4 = jSONObject.optString("thumbImageUrl", "");
                    String strOptString5 = jSONObject.optString("thumbImageUuid", "");
                    int iOptInt4 = jSONObject.optInt("thumbFileSize", 0);
                    int iOptInt5 = jSONObject.optInt("thumbImageWidth", 0);
                    int iOptInt6 = jSONObject.optInt("thumbImageHeight", 0);
                    imageElement.setThumbImageUrl(strOptString4);
                    imageElement.setThumbImageUUID(strOptString5);
                    imageElement.setThumbImageFileSize(iOptInt4);
                    imageElement.setThumbImageWidth(iOptInt5);
                    imageElement.setThumbImageHeight(iOptInt6);
                    String strOptString6 = jSONObject.optString("largeImageUrl", "");
                    String strOptString7 = jSONObject.optString("largeImageUuid", "");
                    int iOptInt7 = jSONObject.optInt("largeFileSize", 0);
                    int iOptInt8 = jSONObject.optInt("largeImageWidth", 0);
                    int iOptInt9 = jSONObject.optInt("largeImageHeight", 0);
                    imageElement.setLargeImageUrl(strOptString6);
                    imageElement.setLargeImageUUID(strOptString7);
                    imageElement.setLargeImageFileSize(iOptInt7);
                    imageElement.setLargeImageWidth(iOptInt8);
                    imageElement.setLargeImageHeight(iOptInt9);
                    Message message = new Message();
                    message.addElement(imageElement);
                    V2TIMMessage v2TIMMessage = new V2TIMMessage();
                    v2TIMMessage.setMessage(message);
                    return v2TIMMessage;
                }
                IMLog.m75914e(TAG, "originImageUrl/originImageUuid is empty");
                return null;
            } catch (JSONException unused) {
                IMLog.m75914e(TAG, "convert param to json failed");
                return null;
            }
        }
        IMLog.m75914e(TAG, "param is not string");
        return null;
    }

    private Object createVideoMessage(Object obj) {
        if (obj != null && (obj instanceof String)) {
            String str = (String) obj;
            if (TextUtils.isEmpty(str)) {
                IMLog.m75914e(TAG, "param is empty");
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("videoUrl") && jSONObject.has("videoUuid") && jSONObject.has(TypedValues.TransitionType.S_DURATION) && jSONObject.has("snapshotUrl") && jSONObject.has("snapshotUuid")) {
                    String strOptString = jSONObject.optString("videoUrl", "");
                    String strOptString2 = jSONObject.optString("videoUuid", "");
                    int iOptInt = jSONObject.optInt(TypedValues.TransitionType.S_DURATION, 0);
                    String strOptString3 = jSONObject.optString("snapshotUrl", "");
                    String strOptString4 = jSONObject.optString("snapshotUuid", "");
                    String strOptString5 = jSONObject.optString("videoFilePath", "");
                    String strOptString6 = jSONObject.optString("videoType", "");
                    int iOptInt2 = jSONObject.optInt("videoFileSize", 0);
                    int iOptInt3 = jSONObject.optInt("snapshotWidth", 0);
                    int iOptInt4 = jSONObject.optInt("snapshotHeight", 0);
                    String strOptString7 = jSONObject.optString("snapshotFilePath", "");
                    int iOptInt5 = jSONObject.optInt("snapshotFileSize", 0);
                    VideoElement videoElement = new VideoElement();
                    videoElement.setVideoFilePath(strOptString5);
                    videoElement.setVideoType(strOptString6);
                    videoElement.setVideoDownloadUrl(strOptString);
                    videoElement.setVideoUUID(strOptString2);
                    videoElement.setVideoDuration(iOptInt);
                    videoElement.setSnapshotFilePath(strOptString7);
                    videoElement.setSnapshotDownloadUrl(strOptString3);
                    videoElement.setSnapshotUUID(strOptString4);
                    videoElement.setVideoFileSize(iOptInt2);
                    videoElement.setSnapshotWidth(iOptInt3);
                    videoElement.setSnapshotHeight(iOptInt4);
                    videoElement.setSnapshotFileSize(iOptInt5);
                    Message message = new Message();
                    message.addElement(videoElement);
                    V2TIMMessage v2TIMMessage = new V2TIMMessage();
                    v2TIMMessage.setMessage(message);
                    return v2TIMMessage;
                }
                IMLog.m75914e(TAG, "videoUrl/videoUuid/duration/snapshotUrl/snapshotUuid is empty");
                return null;
            } catch (JSONException unused) {
                IMLog.m75914e(TAG, "convert param to json failed");
                return null;
            }
        }
        IMLog.m75914e(TAG, "param is not string");
        return null;
    }

    private void deleteCustomVoice(Object obj, V2TIMValueCallback<Object> v2TIMValueCallback) {
        if (obj != null && (obj instanceof String)) {
            String str = (String) obj;
            if (TextUtils.isEmpty(str)) {
                callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is empty");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (!jSONObject.has("voiceId")) {
                    callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "voiceId must be set");
                    return;
                } else {
                    MessageCenter.getInstance().deleteCustomVoice(jSONObject.optString("voiceId"), new IMCallback(v2TIMValueCallback) { // from class: com.tencent.imsdk.v2.V2TIMManagerExperimentImpl.39
                        @Override // com.tencent.imsdk.common.IMCallback
                        public void fail(int i11, String str2) {
                            super.fail(i11, str2);
                        }

                        @Override // com.tencent.imsdk.common.IMCallback
                        public void success(Object obj2) {
                            super.success(obj2);
                        }
                    });
                    return;
                }
            } catch (JSONException e11) {
                callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "convert param to json failed");
                e11.printStackTrace();
                return;
            }
        }
        callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is not string");
    }

    private void getAIDenoiseSignature(V2TIMValueCallback<Object> v2TIMValueCallback) {
        BaseManager.getInstance().getAIDenoiseSignature(new IMCallback(v2TIMValueCallback) { // from class: com.tencent.imsdk.v2.V2TIMManagerExperimentImpl.10
            @Override // com.tencent.imsdk.common.IMCallback
            public void fail(int i11, String str) {
                super.fail(i11, str);
            }

            @Override // com.tencent.imsdk.common.IMCallback
            public void success(Object obj) {
                super.success(obj);
            }
        });
    }

    private void getBuiltInPushUserID(Object obj, V2TIMValueCallback<Object> v2TIMValueCallback) {
        String builtInPushUserID = BaseManager.getInstance().getBuiltInPushUserID();
        if (builtInPushUserID == null) {
            builtInPushUserID = "";
        }
        callbackOnSuccess(v2TIMValueCallback, builtInPushUserID);
    }

    private void getCustomVoiceList(Object obj, V2TIMValueCallback<Object> v2TIMValueCallback) {
        MessageCenter.getInstance().getCustomVoiceList(new IMCallback(v2TIMValueCallback) { // from class: com.tencent.imsdk.v2.V2TIMManagerExperimentImpl.38
            @Override // com.tencent.imsdk.common.IMCallback
            public void success(Object obj2) {
                if (!(obj2 instanceof Map)) {
                    super.success(obj2);
                    return;
                }
                try {
                    super.success(new JSONObject((Map) obj2).toString());
                } catch (Exception unused) {
                    super.success(obj2);
                }
            }

            @Override // com.tencent.imsdk.common.IMCallback
            public void fail(int i11, String str) {
                super.fail(i11, str);
            }
        });
    }

    public static V2TIMManagerExperimentImpl getInstance() {
        return V2TIMManagerExperimentImplHolder.v2TIMManagerExperiment;
    }

    private void getLoginAccountType(Object obj, V2TIMValueCallback<Object> v2TIMValueCallback) {
        BaseManager.getInstance().getLoginAccountType(new IMCallback(v2TIMValueCallback) { // from class: com.tencent.imsdk.v2.V2TIMManagerExperimentImpl.20
            @Override // com.tencent.imsdk.common.IMCallback
            public void fail(int i11, String str) {
                super.fail(i11, str);
            }

            @Override // com.tencent.imsdk.common.IMCallback
            public void success(Object obj2) {
                super.success(obj2);
            }
        });
    }

    private void getOfflinePushState(V2TIMValueCallback<Object> v2TIMValueCallback) {
        OfflinePushManager.getInstance().getOfflinePushConfig(new IMCallback(v2TIMValueCallback) { // from class: com.tencent.imsdk.v2.V2TIMManagerExperimentImpl.15
            @Override // com.tencent.imsdk.common.IMCallback
            public void success(Object obj) {
                final int openOfflinePush = ((OfflinePushConfig) obj).getOpenOfflinePush();
                IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.imsdk.v2.V2TIMManagerExperimentImpl.15.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((IMCallback) C3450115.this).valueCallback != null) {
                            ((IMCallback) C3450115.this).valueCallback.onSuccess(Integer.valueOf(openOfflinePush));
                        }
                    }
                });
            }

            @Override // com.tencent.imsdk.common.IMCallback
            public void fail(int i11, String str) {
                super.fail(i11, str);
            }
        });
    }

    private void getVideoEditSignature(V2TIMValueCallback<Object> v2TIMValueCallback) {
        BaseManager.getInstance().getVideoEditSignature(new IMCallback(v2TIMValueCallback) { // from class: com.tencent.imsdk.v2.V2TIMManagerExperimentImpl.11
            @Override // com.tencent.imsdk.common.IMCallback
            public void fail(int i11, String str) {
                super.fail(i11, str);
            }

            @Override // com.tencent.imsdk.common.IMCallback
            public void success(Object obj) {
                super.success(obj);
            }
        });
    }

    private void setPacketRetryInfo(Object obj, V2TIMValueCallback<Object> v2TIMValueCallback) {
        if (obj != null && (obj instanceof String)) {
            String str = (String) obj;
            if (TextUtils.isEmpty(str)) {
                callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is empty");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                SDKConfig.PacketRetryInfo packetRetryInfo = new SDKConfig.PacketRetryInfo();
                if (jSONObject.has("maxRetryCount")) {
                    packetRetryInfo.maxRetryCount = jSONObject.optInt("maxRetryCount");
                }
                if (jSONObject.has("packetRequestTimeout")) {
                    packetRetryInfo.packetRequestTimeout = jSONObject.optInt("packetRequestTimeout");
                }
                BaseManager.getInstance().setPacketRetryInfo(packetRetryInfo);
                callbackOnSuccess(v2TIMValueCallback, null);
                return;
            } catch (JSONException e11) {
                callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "convert param to json failed");
                e11.printStackTrace();
                return;
            }
        }
        callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is not string");
    }

    private void setProxyInfo(Object obj, V2TIMValueCallback<Object> v2TIMValueCallback) {
        if (obj != null && (obj instanceof String)) {
            String str = (String) obj;
            if (TextUtils.isEmpty(str)) {
                callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is empty");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (!jSONObject.has("proxyType")) {
                    callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "proxyType must be set");
                    return;
                }
                if ((jSONObject.has("proxyHost") && !jSONObject.has("proxyPort")) || (!jSONObject.has("proxyHost") && jSONObject.has("proxyPort"))) {
                    callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "proxyHost and proxyPort must be set together if need");
                    return;
                }
                SDKConfig.ProxyInfo proxyInfo = new SDKConfig.ProxyInfo();
                proxyInfo.proxyType = jSONObject.optInt("proxyType");
                if (jSONObject.has("proxyHost") && jSONObject.has("proxyPort")) {
                    proxyInfo.proxyHost = jSONObject.optString("proxyHost");
                    proxyInfo.proxyPort = jSONObject.optInt("proxyPort");
                }
                if (jSONObject.has("proxyUsername")) {
                    proxyInfo.proxyUsername = jSONObject.optString("proxyUsername");
                }
                if (jSONObject.has("proxyPassword")) {
                    proxyInfo.proxyPassword = jSONObject.optString("proxyPassword");
                }
                BaseManager.getInstance().setProxyInfo(proxyInfo);
                callbackOnSuccess(v2TIMValueCallback, null);
                return;
            } catch (JSONException e11) {
                callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "convert param to json failed");
                e11.printStackTrace();
                return;
            }
        }
        callbackOnError(v2TIMValueCallback, BaseConstants.ERR_INVALID_PARAMETERS, "param is not string");
    }

    public Object callExperimentalAPI(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            IMLog.m75914e(TAG, "empty api");
            return null;
        }
        if (str.equals("createImageMessage")) {
            return createImageMessage(obj);
        }
        if (str.equals("createSoundMessage")) {
            return createSoundMessage(obj);
        }
        if (str.equals("createVideoMessage")) {
            return createVideoMessage(obj);
        }
        if (str.equals("createFileMessage")) {
            return createFileMessage(obj);
        }
        IMLog.m75914e(TAG, "invalid api: " + str);
        return null;
    }
}
