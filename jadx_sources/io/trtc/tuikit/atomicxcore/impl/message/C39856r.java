package io.trtc.tuikit.atomicxcore.impl.message;

import com.tencent.imsdk.BaseConstants;
import com.tencent.imsdk.p128v2.V2TIMManager;
import com.tencent.imsdk.p128v2.V2TIMMessage;
import com.tencent.imsdk.p128v2.V2TIMMessageManager;
import com.tencent.imsdk.p128v2.V2TIMOfflinePushInfo;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.login.LoginStore;
import io.trtc.tuikit.atomicxcore.api.login.UserProfile;
import io.trtc.tuikit.atomicxcore.api.message.CustomMessageInfo;
import io.trtc.tuikit.atomicxcore.api.message.MessageBody;
import io.trtc.tuikit.atomicxcore.api.message.MessageInfo;
import io.trtc.tuikit.atomicxcore.api.message.MessageInputStore;
import io.trtc.tuikit.atomicxcore.api.message.MessageSenderInfo;
import io.trtc.tuikit.atomicxcore.api.message.MessageStatus;
import io.trtc.tuikit.atomicxcore.api.message.OfflinePushInfo;
import io.trtc.tuikit.atomicxcore.impl.common.AbstractC39512t;
import io.trtc.tuikit.atomicxcore.impl.common.C39505m;
import io.trtc.tuikit.atomicxcore.impl.common.EnumC39496d;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.Charsets;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.message.r */
/* JADX INFO: loaded from: classes61.dex */
public final class C39856r extends MessageInputStore {

    /* JADX INFO: renamed from: a */
    public final String f88585a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39856r(String conversationID) {
        super(conversationID);
        Intrinsics.checkNotNullParameter(conversationID, "conversationID");
        this.f88585a = conversationID;
    }

    @Override // io.trtc.tuikit.atomicxcore.api.message.MessageInputStore
    public final String getConversationID() {
        return this.f88585a;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a8  */
    @Override // io.trtc.tuikit.atomicxcore.api.message.MessageInputStore
    public final void sendMessage(MessageInfo message, CompletionHandler completionHandler) throws JSONException {
        V2TIMOfflinePushInfo v2TIMOfflinePushInfo;
        byte[] bytes;
        byte[] data;
        Intrinsics.checkNotNullParameter(message, "message");
        EnumC39496d componentType = EnumC39496d.MESSAGE_INPUT;
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("UIComponentType", 1002);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        V2TIMManager.getInstance().callExperimentalAPI("reportTUIFeatureUsage", string, new C39505m());
        V2TIMMessage rawMessage = message.getRawMessage();
        if (rawMessage == null) {
            MessageBody messageBody = message.getMessageBody();
            if (messageBody != null) {
                switch (AbstractC39852p.f88579a[message.getMessageType().ordinal()]) {
                    case 1:
                        String text = messageBody.getText();
                        if (text == null) {
                            rawMessage = null;
                        } else {
                            rawMessage = V2TIMManager.getMessageManager().createTextMessage(text);
                            if (!message.getAtUserList().isEmpty() && rawMessage != null) {
                                rawMessage = V2TIMManager.getMessageManager().createAtSignedGroupMessage(rawMessage, new ArrayList(message.getAtUserList()));
                            }
                        }
                        break;
                    case 2:
                        String originalImagePath = messageBody.getOriginalImagePath();
                        rawMessage = originalImagePath == null ? null : V2TIMManager.getMessageManager().createImageMessage(originalImagePath);
                        break;
                    case 3:
                        rawMessage = messageBody.getSoundPath() == null ? null : V2TIMManager.getMessageManager().createSoundMessage(messageBody.getSoundPath(), messageBody.getSoundDuration());
                        break;
                    case 4:
                        rawMessage = (messageBody.getFilePath() != null && messageBody.getFileName() != null) ? V2TIMManager.getMessageManager().createFileMessage(messageBody.getFilePath(), messageBody.getFileName()) : null;
                        break;
                    case 5:
                        rawMessage = (messageBody.getVideoPath() != null && messageBody.getVideoSnapshotPath() != null && messageBody.getVideoType() != null) ? V2TIMManager.getMessageManager().createVideoMessage(messageBody.getVideoPath(), messageBody.getVideoType(), messageBody.getVideoDuration(), messageBody.getVideoSnapshotPath()) : null;
                        break;
                    case 6:
                        if (messageBody.getFaceName() == null) {
                            rawMessage = null;
                        } else {
                            V2TIMMessageManager messageManager = V2TIMManager.getMessageManager();
                            int faceIndex = messageBody.getFaceIndex();
                            String faceName = messageBody.getFaceName();
                            if (faceName != null) {
                                bytes = faceName.getBytes(Charsets.UTF_8);
                                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                                if (bytes == null) {
                                    bytes = new byte[0];
                                }
                            } else {
                                bytes = new byte[0];
                            }
                            rawMessage = messageManager.createFaceMessage(faceIndex, bytes);
                        }
                        break;
                    case 7:
                        CustomMessageInfo customMessage = messageBody.getCustomMessage();
                        if (customMessage == null || (data = customMessage.getData()) == null) {
                            rawMessage = null;
                        } else {
                            V2TIMMessageManager messageManager2 = V2TIMManager.getMessageManager();
                            CustomMessageInfo customMessage2 = messageBody.getCustomMessage();
                            String description = customMessage2 != null ? customMessage2.getDescription() : null;
                            CustomMessageInfo customMessage3 = messageBody.getCustomMessage();
                            rawMessage = messageManager2.createCustomMessage(data, description, customMessage3 != null ? customMessage3.getExtensionInfo() : null);
                        }
                        break;
                    default:
                        rawMessage = null;
                        break;
                }
            } else {
                rawMessage = null;
            }
        }
        if (rawMessage == null) {
            if (completionHandler != null) {
                completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "Failed to create im message");
                return;
            }
            return;
        }
        rawMessage.setNeedReadReceipt(message.getNeedReadReceipt());
        rawMessage.setSupportMessageExtension(message.getSupportExtension());
        String conversationID = this.f88585a;
        Intrinsics.checkNotNullParameter(conversationID, "conversationID");
        String strReplaceFirst$default = StringsKt.startsWith$default(conversationID, TUIConstants.TUIConversation.CONVERSATION_C2C_PREFIX, false, 2, (Object) null) ? StringsKt.replaceFirst$default(conversationID, TUIConstants.TUIConversation.CONVERSATION_C2C_PREFIX, "", false, 4, (Object) null) : null;
        String conversationID2 = this.f88585a;
        Intrinsics.checkNotNullParameter(conversationID2, "conversationID");
        String strReplaceFirst$default2 = StringsKt.startsWith$default(conversationID2, TUIConstants.TUIConversation.CONVERSATION_GROUP_PREFIX, false, 2, (Object) null) ? StringsKt.replaceFirst$default(conversationID2, TUIConstants.TUIConversation.CONVERSATION_GROUP_PREFIX, "", false, 4, (Object) null) : null;
        OfflinePushInfo offlinePushInfo = message.getOfflinePushInfo();
        if (offlinePushInfo == null) {
            v2TIMOfflinePushInfo = null;
        } else {
            V2TIMOfflinePushInfo v2TIMOfflinePushInfo2 = new V2TIMOfflinePushInfo();
            v2TIMOfflinePushInfo2.setTitle(offlinePushInfo.getTitle());
            v2TIMOfflinePushInfo2.setDesc(offlinePushInfo.getDescription());
            Map<String, Object> extensionInfo = offlinePushInfo.getExtensionInfo();
            Object obj = extensionInfo.get("ext");
            String str = obj instanceof String ? (String) obj : null;
            if (str != null) {
                byte[] bytes2 = str.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
                v2TIMOfflinePushInfo2.setExt(bytes2);
            }
            Object obj2 = extensionInfo.get("iOSSound");
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            if (str2 != null) {
                v2TIMOfflinePushInfo2.setIOSSound(str2);
            }
            Object obj3 = extensionInfo.get("iOSInterruptionLevel");
            String str3 = obj3 instanceof String ? (String) obj3 : null;
            if (str3 != null) {
                v2TIMOfflinePushInfo2.setIOSInterruptionLevel(str3);
            }
            Object obj4 = extensionInfo.get("iOSImage");
            String str4 = obj4 instanceof String ? (String) obj4 : null;
            if (str4 != null) {
                v2TIMOfflinePushInfo2.setIOSImage(str4);
            }
            Object obj5 = extensionInfo.get("iOSPushType");
            Integer num = obj5 instanceof Integer ? (Integer) obj5 : null;
            if (num != null) {
                v2TIMOfflinePushInfo2.setIOSPushType(num.intValue());
            }
            Object obj6 = extensionInfo.get("ignoreIOSBadge");
            Boolean bool = obj6 instanceof Boolean ? (Boolean) obj6 : null;
            if (bool != null) {
                v2TIMOfflinePushInfo2.setIgnoreIOSBadge(bool.booleanValue());
            }
            Object obj7 = extensionInfo.get("enableIOSBackgroundNotification");
            Boolean bool2 = obj7 instanceof Boolean ? (Boolean) obj7 : null;
            if (bool2 != null) {
                v2TIMOfflinePushInfo2.enableIOSBackgroundNotification(bool2.booleanValue());
            }
            Object obj8 = extensionInfo.get("AndroidSound");
            String str5 = obj8 instanceof String ? (String) obj8 : null;
            if (str5 != null) {
                v2TIMOfflinePushInfo2.setAndroidSound(str5);
            }
            Object obj9 = extensionInfo.get("AndroidOPPOChannelID");
            String str6 = obj9 instanceof String ? (String) obj9 : null;
            if (str6 != null) {
                v2TIMOfflinePushInfo2.setAndroidOPPOChannelID(str6);
            }
            Object obj10 = extensionInfo.get("AndroidFCMChannelID");
            String str7 = obj10 instanceof String ? (String) obj10 : null;
            if (str7 != null) {
                v2TIMOfflinePushInfo2.setAndroidFCMChannelID(str7);
            }
            Object obj11 = extensionInfo.get("AndroidXiaoMiChannelID");
            String str8 = obj11 instanceof String ? (String) obj11 : null;
            if (str8 != null) {
                v2TIMOfflinePushInfo2.setAndroidXiaoMiChannelID(str8);
            }
            Object obj12 = extensionInfo.get("AndroidVIVOCategory");
            String str9 = obj12 instanceof String ? (String) obj12 : null;
            if (str9 != null) {
                v2TIMOfflinePushInfo2.setAndroidVIVOCategory(str9);
            }
            Object obj13 = extensionInfo.get("AndroidHuaWeiCategory");
            String str10 = obj13 instanceof String ? (String) obj13 : null;
            if (str10 != null) {
                v2TIMOfflinePushInfo2.setAndroidHuaWeiCategory(str10);
            }
            Object obj14 = extensionInfo.get("AndroidOPPOCategory");
            String str11 = obj14 instanceof String ? (String) obj14 : null;
            if (str11 != null) {
                v2TIMOfflinePushInfo2.setAndroidOPPOCategory(str11);
            }
            Object obj15 = extensionInfo.get("AndroidHonorImportance");
            String str12 = obj15 instanceof String ? (String) obj15 : null;
            if (str12 != null) {
                v2TIMOfflinePushInfo2.setAndroidHonorImportance(str12);
            }
            Object obj16 = extensionInfo.get("AndroidHuaWeiImage");
            String str13 = obj16 instanceof String ? (String) obj16 : null;
            if (str13 != null) {
                v2TIMOfflinePushInfo2.setAndroidHuaWeiImage(str13);
            }
            Object obj17 = extensionInfo.get("AndroidHonorImage");
            String str14 = obj17 instanceof String ? (String) obj17 : null;
            if (str14 != null) {
                v2TIMOfflinePushInfo2.setAndroidHonorImage(str14);
            }
            Object obj18 = extensionInfo.get("AndroidFCMImage");
            String str15 = obj18 instanceof String ? (String) obj18 : null;
            if (str15 != null) {
                v2TIMOfflinePushInfo2.setAndroidFCMImage(str15);
            }
            Object obj19 = extensionInfo.get("AndroidVIVOClassification");
            Integer num2 = obj19 instanceof Integer ? (Integer) obj19 : null;
            if (num2 != null) {
                v2TIMOfflinePushInfo2.setAndroidVIVOClassification(num2.intValue());
            }
            Object obj20 = extensionInfo.get("AndroidOPPONotifyLevel");
            Integer num3 = obj20 instanceof Integer ? (Integer) obj20 : null;
            if (num3 != null) {
                v2TIMOfflinePushInfo2.setAndroidOPPONotifyLevel(num3.intValue());
            }
            Object obj21 = extensionInfo.get("AndroidMeizuNotifyType");
            Integer num4 = obj21 instanceof Integer ? (Integer) obj21 : null;
            if (num4 != null) {
                v2TIMOfflinePushInfo2.setAndroidMeizuNotifyType(num4.intValue());
            }
            Object obj22 = extensionInfo.get("HarmonyImage");
            String str16 = obj22 instanceof String ? (String) obj22 : null;
            if (str16 != null) {
                v2TIMOfflinePushInfo2.setHarmonyImage(str16);
            }
            Object obj23 = extensionInfo.get("HarmonyCategory");
            String str17 = obj23 instanceof String ? (String) obj23 : null;
            if (str17 != null) {
                v2TIMOfflinePushInfo2.setHarmonyCategory(str17);
            }
            Object obj24 = extensionInfo.get("ignoreHarmonyBadge");
            Boolean bool3 = obj24 instanceof Boolean ? (Boolean) obj24 : null;
            if (bool3 != null) {
                v2TIMOfflinePushInfo2.setIgnoreHarmonyBadge(bool3.booleanValue());
            }
            Object obj25 = extensionInfo.get("disablePush");
            Boolean bool4 = obj25 instanceof Boolean ? (Boolean) obj25 : null;
            if (bool4 != null) {
                v2TIMOfflinePushInfo2.disablePush(bool4.booleanValue());
            }
            v2TIMOfflinePushInfo = v2TIMOfflinePushInfo2;
        }
        V2TIMMessage v2TIMMessage = rawMessage;
        MessageInfo messageInfoCopy$default = MessageInfo.copy$default(message, null, null, false, null, null, null, null, 0, null, false, null, null, false, null, false, null, null, null, 0, null, null, null, 4194303, null);
        messageInfoCopy$default.setMsgID(V2TIMManager.getMessageManager().sendMessage(v2TIMMessage, strReplaceFirst$default, strReplaceFirst$default2, 2, false, v2TIMOfflinePushInfo, new C39854q(this, messageInfoCopy$default, completionHandler)));
        messageInfoCopy$default.setSelf(true);
        messageInfoCopy$default.setRawMessage(v2TIMMessage);
        messageInfoCopy$default.setTimestamp(Long.valueOf(v2TIMMessage.getTimestamp()));
        messageInfoCopy$default.setStatus(MessageStatus.SENDING);
        UserProfile value = LoginStore.shared.getLoginState().getLoginUserInfo().getValue();
        if (value != null) {
            messageInfoCopy$default.setSender(new MessageSenderInfo(value.getUserID(), value.getAvatarURL(), value.getNickname(), null, null, 24, null));
        }
        ConcurrentHashMap concurrentHashMap = AbstractC39512t.f87709a;
        AbstractC39512t.m88254a("onMessageSendBegin", MapsKt.mapOf(TuplesKt.m90091to("conversationID", this.f88585a), TuplesKt.m90091to("message", messageInfoCopy$default)));
    }
}
