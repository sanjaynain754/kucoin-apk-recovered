package io.trtc.tuikit.atomicxcore.impl.common;

import android.content.Context;
import com.tencent.imsdk.common.IMContext;
import com.tencent.imsdk.p128v2.V2TIMCustomElem;
import com.tencent.imsdk.p128v2.V2TIMFaceElem;
import com.tencent.imsdk.p128v2.V2TIMFileElem;
import com.tencent.imsdk.p128v2.V2TIMGroupChangeInfo;
import com.tencent.imsdk.p128v2.V2TIMGroupMemberChangeInfo;
import com.tencent.imsdk.p128v2.V2TIMGroupMemberInfo;
import com.tencent.imsdk.p128v2.V2TIMGroupTipsElem;
import com.tencent.imsdk.p128v2.V2TIMImageElem;
import com.tencent.imsdk.p128v2.V2TIMMergerElem;
import com.tencent.imsdk.p128v2.V2TIMMessage;
import com.tencent.imsdk.p128v2.V2TIMSoundElem;
import com.tencent.imsdk.p128v2.V2TIMTextElem;
import com.tencent.imsdk.p128v2.V2TIMUserFullInfo;
import com.tencent.imsdk.p128v2.V2TIMVideoElem;
import com.tencent.qcloud.tuicore.TUIConfig;
import io.trtc.tuikit.atomicxcore.api.contact.GroupJoinOption;
import io.trtc.tuikit.atomicxcore.api.login.LoginStore;
import io.trtc.tuikit.atomicxcore.api.login.UserProfile;
import io.trtc.tuikit.atomicxcore.api.message.CustomMessageInfo;
import io.trtc.tuikit.atomicxcore.api.message.MergedMessageInfo;
import io.trtc.tuikit.atomicxcore.api.message.MessageBody;
import io.trtc.tuikit.atomicxcore.api.message.MessageInfo;
import io.trtc.tuikit.atomicxcore.api.message.MessageSenderInfo;
import io.trtc.tuikit.atomicxcore.api.message.MessageStatus;
import io.trtc.tuikit.atomicxcore.api.message.MessageType;
import io.trtc.tuikit.atomicxcore.api.message.SystemMessageInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.text.Charsets;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.common.l */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC39504l {
    /* JADX INFO: renamed from: a */
    public static String m88246a(V2TIMGroupMemberInfo v2TIMGroupMemberInfo) {
        if (v2TIMGroupMemberInfo == null) {
            return "";
        }
        String nameCard = v2TIMGroupMemberInfo.getNameCard();
        if (nameCard != null && nameCard.length() != 0) {
            String nameCard2 = v2TIMGroupMemberInfo.getNameCard();
            Intrinsics.checkNotNull(nameCard2);
            return nameCard2;
        }
        String nickName = v2TIMGroupMemberInfo.getNickName();
        if (nickName == null || nickName.length() == 0) {
            String userID = v2TIMGroupMemberInfo.getUserID();
            Intrinsics.checkNotNullExpressionValue(userID, "getUserID(...)");
            return userID;
        }
        String nickName2 = v2TIMGroupMemberInfo.getNickName();
        Intrinsics.checkNotNull(nickName2);
        return nickName2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:267:0x0863 A[PHI: r14 r17 r23 r60 r61
      0x0863: PHI (r14v27 io.trtc.tuikit.atomicxcore.api.message.MessageBody) = 
      (r14v3 io.trtc.tuikit.atomicxcore.api.message.MessageBody)
      (r14v4 io.trtc.tuikit.atomicxcore.api.message.MessageBody)
      (r14v7 io.trtc.tuikit.atomicxcore.api.message.MessageBody)
      (r14v28 io.trtc.tuikit.atomicxcore.api.message.MessageBody)
     binds: [B:266:0x0861, B:243:0x0789, B:230:0x06e4, B:45:0x012b] A[DONT_GENERATE, DONT_INLINE]
      0x0863: PHI (r17v30 java.lang.String) = (r17v1 java.lang.String), (r17v2 java.lang.String), (r17v3 java.lang.String), (r17v31 java.lang.String) binds: [B:266:0x0861, B:243:0x0789, B:230:0x06e4, B:45:0x012b] A[DONT_GENERATE, DONT_INLINE]
      0x0863: PHI (r23v21 java.lang.String) = (r23v1 java.lang.String), (r23v2 java.lang.String), (r23v3 java.lang.String), (r23v22 java.lang.String) binds: [B:266:0x0861, B:243:0x0789, B:230:0x06e4, B:45:0x012b] A[DONT_GENERATE, DONT_INLINE]
      0x0863: PHI (r60v12 java.lang.String) = (r60v1 java.lang.String), (r60v2 java.lang.String), (r60v3 java.lang.String), (r60v13 java.lang.String) binds: [B:266:0x0861, B:243:0x0789, B:230:0x06e4, B:45:0x012b] A[DONT_GENERATE, DONT_INLINE]
      0x0863: PHI (r61v12 boolean) = (r61v1 boolean), (r61v2 boolean), (r61v3 boolean), (r61v13 boolean) binds: [B:266:0x0861, B:243:0x0789, B:230:0x06e4, B:45:0x012b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x0123  */
    /* JADX INFO: renamed from: a */
    public static MessageInfo m88244a(V2TIMMessage imMessage) {
        MessageStatus messageStatus;
        MessageType messageType;
        MessageBody messageBody;
        MessageBody messageBody2;
        MessageBody messageBody3;
        MessageBody messageBody4;
        List userList;
        List listListOf;
        List list;
        String value;
        GroupJoinOption groupJoinOption;
        GroupJoinOption groupJoinOption2;
        List listEmptyList;
        List<V2TIMGroupMemberInfo> memberList;
        MessageBody messageBody5;
        Intrinsics.checkNotNullParameter(imMessage, "imMessage");
        String sender = imMessage.getSender();
        String strM88246a = "";
        MessageSenderInfo messageSenderInfo = new MessageSenderInfo(sender == null ? "" : sender, imMessage.getFaceUrl(), imMessage.getNickName(), imMessage.getFriendRemark(), imMessage.getNameCard());
        String msgID = imMessage.getMsgID();
        if (imMessage.hasRiskContent()) {
            messageStatus = MessageStatus.VIOLATION;
        } else {
            switch (imMessage.getStatus()) {
                case 1:
                    messageStatus = MessageStatus.SENDING;
                    break;
                case 2:
                    messageStatus = MessageStatus.SEND_SUCCESS;
                    break;
                case 3:
                    messageStatus = MessageStatus.SEND_FAIL;
                    break;
                case 4:
                    messageStatus = MessageStatus.DELETED;
                    break;
                case 5:
                    messageStatus = MessageStatus.LOCAL_IMPORTED;
                    break;
                case 6:
                    messageStatus = MessageStatus.RECALLED;
                    break;
                default:
                    messageStatus = MessageStatus.INIT;
                    break;
            }
        }
        MessageStatus messageStatus2 = messageStatus;
        String sender2 = imMessage.getSender();
        UserProfile value2 = LoginStore.shared.getLoginState().getLoginUserInfo().getValue();
        boolean zAreEqual = Intrinsics.areEqual(sender2, value2 != null ? value2.getUserID() : null);
        String userID = imMessage.getUserID();
        String groupID = imMessage.getGroupID();
        long timestamp = imMessage.getTimestamp();
        boolean zIsNeedReadReceipt = imMessage.isNeedReadReceipt();
        boolean zIsSupportMessageExtension = imMessage.isSupportMessageExtension();
        List<String> groupAtUserList = imMessage.getGroupAtUserList();
        if (imMessage.getStatus() == 6) {
            messageType = MessageType.SYSTEM;
        } else {
            switch (imMessage.getElemType()) {
                case 1:
                    messageType = MessageType.TEXT;
                    break;
                case 2:
                    messageType = MessageType.CUSTOM;
                    break;
                case 3:
                    messageType = MessageType.IMAGE;
                    break;
                case 4:
                    messageType = MessageType.SOUND;
                    break;
                case 5:
                    messageType = MessageType.VIDEO;
                    break;
                case 6:
                    messageType = MessageType.FILE;
                    break;
                case 7:
                default:
                    messageType = MessageType.UNKNOWN;
                    break;
                case 8:
                    messageType = MessageType.FACE;
                    break;
                case 9:
                    messageType = MessageType.SYSTEM;
                    break;
                case 10:
                    messageType = MessageType.MERGED;
                    break;
            }
        }
        if (imMessage.getStatus() == 6) {
            messageBody5 = new MessageBody(null, null, null, null, 0, 0, 0, null, null, null, null, 0, 0, null, 0, 0, 0, null, 0, 0, null, null, null, null, null, 0, 0, null, CollectionsKt.listOf(m88245a(imMessage, null, null)), null, null, 1879048191, null);
        } else {
            switch (imMessage.getElemType()) {
                case 1:
                    msgID = msgID;
                    zAreEqual = zAreEqual;
                    userID = userID;
                    groupID = groupID;
                    V2TIMTextElem textElem = imMessage.getTextElem();
                    messageBody = new MessageBody(textElem != null ? textElem.getText() : null, null, null, null, 0, 0, 0, null, null, null, null, 0, 0, null, 0, 0, 0, null, 0, 0, null, null, null, null, null, 0, 0, null, null, null, null, 2147483646, null);
                    String localCustomData = imMessage.getLocalCustomData();
                    if (localCustomData != null) {
                        try {
                            JSONObject jSONObject = new JSONObject(localCustomData);
                            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("text_translation");
                            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() > 0) {
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                                while (itKeys.hasNext()) {
                                    String next = itKeys.next();
                                    Intrinsics.checkNotNull(next);
                                    String strOptString = jSONObjectOptJSONObject.optString(next, "");
                                    Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
                                    linkedHashMap.put(next, strOptString);
                                    jSONObjectOptJSONObject = jSONObjectOptJSONObject;
                                }
                                messageBody.setTranslatedText(linkedHashMap);
                            }
                            String strOptString2 = jSONObject.optString("text_translation_language", "");
                            Intrinsics.checkNotNull(strOptString2);
                            if (strOptString2.length() > 0) {
                                messageBody.setTranslateLanguage(strOptString2);
                            }
                            break;
                        } catch (Exception unused) {
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                    break;
                case 2:
                    msgID = msgID;
                    zAreEqual = zAreEqual;
                    userID = userID;
                    groupID = groupID;
                    messageBody2 = null;
                    V2TIMCustomElem customElem = imMessage.getCustomElem();
                    if (customElem == null) {
                        messageBody = messageBody2;
                    } else {
                        messageBody3 = new MessageBody(null, null, null, null, 0, 0, 0, null, null, null, null, 0, 0, null, 0, 0, 0, null, 0, 0, null, null, null, null, null, 0, 0, null, null, new CustomMessageInfo(customElem.getData(), customElem.getDescription(), customElem.getExtension()), null, 1610612735, null);
                        messageBody = messageBody3;
                    }
                    break;
                case 3:
                    msgID = msgID;
                    zAreEqual = zAreEqual;
                    userID = userID;
                    groupID = groupID;
                    messageBody2 = null;
                    V2TIMImageElem imageElem = imMessage.getImageElem();
                    if (imageElem == null) {
                        messageBody = messageBody2;
                    } else {
                        messageBody4 = new MessageBody(null, null, null, null, 0, 0, 0, null, null, null, null, 0, 0, null, 0, 0, 0, null, 0, 0, null, null, null, null, null, 0, 0, null, null, null, null, Integer.MAX_VALUE, null);
                        Iterator<V2TIMImageElem.V2TIMImage> it = imageElem.getImageList().iterator();
                        while (it.hasNext()) {
                            V2TIMImageElem.V2TIMImage next2 = it.next();
                            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                            V2TIMImageElem v2TIMImageElem = imageElem;
                            Iterator<V2TIMImageElem.V2TIMImage> it2 = it;
                            String strM88247a = m88247a(MessageType.IMAGE, imageElem.getPath(), next2.getUUID(), String.valueOf(next2.getType()), new C39503k(booleanRef));
                            if (next2.getType() == 0) {
                                if (booleanRef.element) {
                                    messageBody4.setOriginalImagePath(strM88247a);
                                }
                                messageBody4.setOriginalImageSize(next2.getSize());
                                messageBody4.setOriginalImageWidth(next2.getWidth());
                                messageBody4.setOriginalImageHeight(next2.getHeight());
                            } else if (next2.getType() == 1) {
                                if (booleanRef.element) {
                                    messageBody4.setThumbImagePath(strM88247a);
                                }
                            } else if (next2.getType() == 2 && booleanRef.element) {
                                messageBody4.setLargeImagePath(strM88247a);
                            }
                            it = it2;
                            imageElem = v2TIMImageElem;
                        }
                        messageBody = messageBody4;
                    }
                    break;
                case 4:
                    msgID = msgID;
                    zAreEqual = zAreEqual;
                    userID = userID;
                    groupID = groupID;
                    messageBody2 = null;
                    V2TIMSoundElem soundElem = imMessage.getSoundElem();
                    if (soundElem == null) {
                        messageBody = messageBody2;
                    } else {
                        messageBody4 = new MessageBody(null, null, null, null, 0, 0, 0, null, null, null, null, 0, 0, null, 0, 0, 0, null, soundElem.getDataSize(), soundElem.getDuration(), null, null, null, null, null, 0, 0, null, null, null, null, 2146697215, null);
                        Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                        String strM88247a2 = m88247a(MessageType.SOUND, soundElem.getPath(), soundElem.getUUID(), "amr", new C39499g(booleanRef2));
                        if (booleanRef2.element) {
                            messageBody4.setSoundPath(strM88247a2);
                        }
                        String localCustomData2 = imMessage.getLocalCustomData();
                        if (localCustomData2 != null) {
                            Intrinsics.checkNotNull(localCustomData2);
                            try {
                                String strOptString3 = new JSONObject(localCustomData2).optString("voice_to_text", "");
                                Intrinsics.checkNotNull(strOptString3);
                                if (strOptString3.length() > 0) {
                                    messageBody4.setAsrText(strOptString3);
                                }
                                break;
                            } catch (Exception unused2) {
                            }
                            Unit unit2 = Unit.INSTANCE;
                        }
                        messageBody = messageBody4;
                    }
                    break;
                case 5:
                    msgID = msgID;
                    zAreEqual = zAreEqual;
                    userID = userID;
                    groupID = groupID;
                    V2TIMVideoElem videoElem = imMessage.getVideoElem();
                    if (videoElem != null) {
                        messageBody4 = new MessageBody(null, null, null, null, 0, 0, 0, null, null, null, null, videoElem.getVideoSize(), videoElem.getDuration(), null, videoElem.getSnapshotWidth(), videoElem.getSnapshotHeight(), videoElem.getSnapshotSize(), null, 0, 0, null, null, null, null, null, 0, 0, null, null, null, null, 2147362815, null);
                        Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
                        MessageType messageType2 = MessageType.VIDEO;
                        String strM88247a3 = m88247a(messageType2, videoElem.getSnapshotPath(), videoElem.getSnapshotUUID(), null, new C39501i(booleanRef3));
                        if (booleanRef3.element) {
                            messageBody4.setVideoSnapshotPath(strM88247a3);
                        }
                        Ref.BooleanRef booleanRef4 = new Ref.BooleanRef();
                        String strM88247a4 = m88247a(messageType2, videoElem.getVideoPath(), videoElem.getVideoUUID(), null, new C39502j(booleanRef4));
                        if (booleanRef4.element) {
                            messageBody4.setVideoPath(strM88247a4);
                        }
                        messageBody = messageBody4;
                    }
                    messageBody2 = null;
                    messageBody = messageBody2;
                    break;
                case 6:
                    msgID = msgID;
                    zAreEqual = zAreEqual;
                    userID = userID;
                    groupID = groupID;
                    V2TIMFileElem fileElem = imMessage.getFileElem();
                    if (fileElem != null) {
                        messageBody4 = new MessageBody(null, null, null, null, 0, 0, 0, null, null, null, null, 0, 0, null, 0, 0, 0, null, 0, 0, null, null, null, null, fileElem.getFileName(), fileElem.getFileSize(), 0, null, null, null, null, 2097151999, null);
                        Ref.BooleanRef booleanRef5 = new Ref.BooleanRef();
                        String strM88247a5 = m88247a(MessageType.FILE, fileElem.getPath(), fileElem.getUUID(), fileElem.getFileName(), new C39500h(booleanRef5));
                        if (booleanRef5.element) {
                            messageBody4.setFilePath(strM88247a5);
                        }
                        messageBody = messageBody4;
                    }
                    messageBody2 = null;
                    messageBody = messageBody2;
                    break;
                case 7:
                default:
                    msgID = msgID;
                    zAreEqual = zAreEqual;
                    userID = userID;
                    groupID = groupID;
                    messageBody2 = null;
                    messageBody = messageBody2;
                    break;
                case 8:
                    msgID = msgID;
                    zAreEqual = zAreEqual;
                    userID = userID;
                    groupID = groupID;
                    V2TIMFaceElem faceElem = imMessage.getFaceElem();
                    if (faceElem != null) {
                        int index = faceElem.getIndex();
                        byte[] data = faceElem.getData();
                        messageBody3 = new MessageBody(null, null, null, null, 0, 0, 0, null, null, null, null, 0, 0, null, 0, 0, 0, null, 0, 0, null, null, null, null, null, 0, index, data != null ? new String(data, Charsets.UTF_8) : null, null, null, null, 1946157055, null);
                        messageBody = messageBody3;
                    }
                    messageBody2 = null;
                    messageBody = messageBody2;
                    break;
                case 9:
                    V2TIMGroupTipsElem tips = imMessage.getGroupTipsElem();
                    if (tips != null && (tips.getType() == 1 || tips.getType() == 2 || tips.getType() == 4 || tips.getType() == 7 || tips.getType() == 3 || tips.getType() == 10 || tips.getType() == 11 || tips.getType() == 8 || tips.getType() == 5 || tips.getType() == 6)) {
                        String groupID2 = imMessage.getGroupID();
                        Intrinsics.checkNotNullParameter(tips, "tipsElem");
                        String opUser = m88246a(tips.getOpMember());
                        List<V2TIMGroupMemberInfo> memberList2 = tips.getMemberList();
                        if (memberList2 == null) {
                            userList = CollectionsKt.emptyList();
                        } else {
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(memberList2, 10));
                            Iterator<T> it3 = memberList2.iterator();
                            while (it3.hasNext()) {
                                arrayList.add(m88246a((V2TIMGroupMemberInfo) it3.next()));
                            }
                            userList = arrayList;
                        }
                        String groupID3 = groupID2 == null ? "" : groupID2;
                        switch (tips.getType()) {
                            case 1:
                                List list2 = userList;
                                if (!list2.isEmpty()) {
                                    opUser = CollectionsKt.joinToString$default(list2, ", ", null, null, 0, null, null, 62, null);
                                }
                                listListOf = CollectionsKt.listOf(new SystemMessageInfo.JoinGroup(groupID3, opUser));
                                list = listListOf;
                                break;
                            case 2:
                                listListOf = CollectionsKt.listOf(new SystemMessageInfo.InviteToGroup(groupID3, opUser, CollectionsKt.joinToString$default(userList, "、", null, null, 0, null, null, 62, null)));
                                list = listListOf;
                                break;
                            case 3:
                                listListOf = CollectionsKt.listOf(new SystemMessageInfo.QuitGroup(groupID3, opUser));
                                list = listListOf;
                                break;
                            case 4:
                                listListOf = CollectionsKt.listOf(new SystemMessageInfo.KickedFromGroup(groupID3, opUser, CollectionsKt.joinToString$default(userList, "、", null, null, 0, null, null, 62, null)));
                                list = listListOf;
                                break;
                            case 5:
                                listListOf = CollectionsKt.listOf(new SystemMessageInfo.SetGroupAdmin(groupID3, opUser, CollectionsKt.joinToString$default(userList, "、", null, null, 0, null, null, 62, null)));
                                list = listListOf;
                                break;
                            case 6:
                                listListOf = CollectionsKt.listOf(new SystemMessageInfo.CancelGroupAdmin(groupID3, opUser, CollectionsKt.joinToString$default(userList, "、", null, null, 0, null, null, 62, null)));
                                list = listListOf;
                                break;
                            case 7:
                                Intrinsics.checkNotNullParameter(groupID3, "groupID");
                                Intrinsics.checkNotNullParameter(opUser, "opUser");
                                Intrinsics.checkNotNullParameter(userList, "userList");
                                Intrinsics.checkNotNullParameter(tips, "tips");
                                ArrayList arrayList2 = new ArrayList();
                                List<V2TIMGroupChangeInfo> groupChangeInfoList = tips.getGroupChangeInfoList();
                                if (groupChangeInfoList != null) {
                                    for (V2TIMGroupChangeInfo v2TIMGroupChangeInfo : groupChangeInfoList) {
                                        List list3 = userList;
                                        int type = v2TIMGroupChangeInfo.getType();
                                        String str = userID;
                                        String str2 = groupID;
                                        if (type == 1) {
                                            String value3 = v2TIMGroupChangeInfo.getValue();
                                            if (value3 != null && value3.length() != 0) {
                                                String value4 = v2TIMGroupChangeInfo.getValue();
                                                Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                                                arrayList2.add(new SystemMessageInfo.ChangeGroupName(groupID3, opUser, value4));
                                            }
                                        } else if (type == 2) {
                                            String value5 = v2TIMGroupChangeInfo.getValue();
                                            if (value5 != null && value5.length() != 0) {
                                                String value6 = v2TIMGroupChangeInfo.getValue();
                                                Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                                                arrayList2.add(new SystemMessageInfo.ChangeGroupIntroduction(groupID3, opUser, value6));
                                            }
                                        } else if (type == 3) {
                                            String value7 = v2TIMGroupChangeInfo.getValue();
                                            if (value7 == null) {
                                                value7 = "";
                                            } else {
                                                Intrinsics.checkNotNull(value7);
                                            }
                                            arrayList2.add(new SystemMessageInfo.ChangeGroupNotification(groupID3, opUser, value7));
                                        } else if (type == 4) {
                                            String value8 = v2TIMGroupChangeInfo.getValue();
                                            if (value8 == null) {
                                                value8 = "";
                                            } else {
                                                Intrinsics.checkNotNull(value8);
                                            }
                                            arrayList2.add(new SystemMessageInfo.ChangeGroupAvatar(groupID3, opUser, value8));
                                        } else if (type == 5) {
                                            if (list3.isEmpty()) {
                                                value = v2TIMGroupChangeInfo.getValue();
                                                if (value == null) {
                                                    value = "";
                                                } else {
                                                    Intrinsics.checkNotNull(value);
                                                }
                                            } else {
                                                value = (String) CollectionsKt.first(list3);
                                            }
                                            arrayList2.add(new SystemMessageInfo.ChangeGroupOwner(groupID3, opUser, value));
                                        } else if (type == 8) {
                                            arrayList2.add(new SystemMessageInfo.ChangeGroupMuteAll(groupID3, opUser, v2TIMGroupChangeInfo.getBoolValue()));
                                        } else if (type == 11) {
                                            int intValue = v2TIMGroupChangeInfo.getIntValue();
                                            if (intValue == 0) {
                                                groupJoinOption = GroupJoinOption.FORBID;
                                            } else if (intValue == 1) {
                                                groupJoinOption = GroupJoinOption.AUTH;
                                            } else if (intValue != 2) {
                                                groupJoinOption = GroupJoinOption.ANY;
                                            } else {
                                                groupJoinOption = GroupJoinOption.ANY;
                                            }
                                            arrayList2.add(new SystemMessageInfo.ChangeJoinGroupApproval(groupID3, opUser, groupJoinOption));
                                        } else if (type == 12) {
                                            int intValue2 = v2TIMGroupChangeInfo.getIntValue();
                                            if (intValue2 == 0) {
                                                groupJoinOption2 = GroupJoinOption.FORBID;
                                            } else if (intValue2 == 1) {
                                                groupJoinOption2 = GroupJoinOption.AUTH;
                                            } else if (intValue2 != 2) {
                                                groupJoinOption2 = GroupJoinOption.ANY;
                                            } else {
                                                groupJoinOption2 = GroupJoinOption.ANY;
                                            }
                                            arrayList2.add(new SystemMessageInfo.ChangeInviteToGroupApproval(groupID3, opUser, groupJoinOption2));
                                        }
                                        userID = str;
                                        groupID = str2;
                                        userList = list3;
                                    }
                                }
                                userID = userID;
                                groupID = groupID;
                                list = arrayList2;
                                break;
                            case 8:
                                List<V2TIMGroupMemberChangeInfo> memberChangeInfoList = tips.getMemberChangeInfoList();
                                if (memberChangeInfoList != null && !memberChangeInfoList.isEmpty()) {
                                    Intrinsics.checkNotNull(memberChangeInfoList);
                                    V2TIMGroupMemberChangeInfo v2TIMGroupMemberChangeInfo = (V2TIMGroupMemberChangeInfo) CollectionsKt.first((List) memberChangeInfoList);
                                    String userID2 = v2TIMGroupMemberChangeInfo.getUserID();
                                    UserProfile value9 = LoginStore.shared.getLoginState().getLoginUserInfo().getValue();
                                    boolean zAreEqual2 = Intrinsics.areEqual(userID2, value9 != null ? value9.getUserID() : null);
                                    if (userID2 != null && (memberList = tips.getMemberList()) != null) {
                                        Iterator it4 = memberList.iterator();
                                        while (it4.hasNext()) {
                                            V2TIMGroupMemberInfo v2TIMGroupMemberInfo = (V2TIMGroupMemberInfo) it4.next();
                                            Iterator it5 = it4;
                                            if (Intrinsics.areEqual(v2TIMGroupMemberInfo.getUserID(), userID2)) {
                                                strM88246a = m88246a(v2TIMGroupMemberInfo);
                                            } else {
                                                it4 = it5;
                                            }
                                        }
                                    }
                                    listEmptyList = CollectionsKt.listOf(new SystemMessageInfo.MuteGroupMember(groupID3, opUser, zAreEqual2, strM88246a, v2TIMGroupMemberChangeInfo.getMuteTime()));
                                } else {
                                    listEmptyList = CollectionsKt.emptyList();
                                }
                                list = listEmptyList;
                                userID = userID;
                                groupID = groupID;
                                break;
                            case 9:
                            default:
                                listEmptyList = CollectionsKt.emptyList();
                                list = listEmptyList;
                                userID = userID;
                                groupID = groupID;
                                break;
                            case 10:
                                listEmptyList = CollectionsKt.listOf(new SystemMessageInfo.PinGroupMessage(groupID3, opUser));
                                list = listEmptyList;
                                userID = userID;
                                groupID = groupID;
                                break;
                            case 11:
                                listEmptyList = CollectionsKt.listOf(new SystemMessageInfo.UnpinGroupMessage(groupID3, opUser));
                                list = listEmptyList;
                                userID = userID;
                                groupID = groupID;
                                break;
                        }
                        messageBody = new MessageBody(null, null, null, null, 0, 0, 0, null, null, null, null, 0, 0, null, 0, 0, 0, null, 0, 0, null, null, null, null, null, 0, 0, null, list, null, null, 1879048191, null);
                    } else {
                        msgID = msgID;
                        zAreEqual = zAreEqual;
                        userID = userID;
                        groupID = groupID;
                        messageBody2 = null;
                        messageBody = messageBody2;
                    }
                    break;
                case 10:
                    V2TIMMergerElem mergerElem = imMessage.getMergerElem();
                    if (mergerElem != null) {
                        String title = mergerElem.getTitle();
                        messageBody5 = new MessageBody(null, null, null, null, 0, 0, 0, null, null, null, null, 0, 0, null, 0, 0, 0, null, 0, 0, null, null, null, null, null, 0, 0, null, null, null, new MergedMessageInfo(title != null ? title : "", mergerElem.getAbstractList()), 1073741823, null);
                    }
                    msgID = msgID;
                    zAreEqual = zAreEqual;
                    userID = userID;
                    groupID = groupID;
                    messageBody2 = null;
                    messageBody = messageBody2;
                    break;
            }
            Long lValueOf = Long.valueOf(timestamp);
            Intrinsics.checkNotNull(groupAtUserList);
            return new MessageInfo(msgID, messageSenderInfo, zAreEqual, userID, groupID, lValueOf, messageStatus2, 0, groupAtUserList, false, messageType, messageBody, zIsNeedReadReceipt, null, zIsSupportMessageExtension, null, null, null, 0, null, null, imMessage, 2073216, null);
        }
        msgID = msgID;
        zAreEqual = zAreEqual;
        groupID = groupID;
        messageBody = messageBody5;
        userID = userID;
        Long lValueOf2 = Long.valueOf(timestamp);
        Intrinsics.checkNotNull(groupAtUserList);
        return new MessageInfo(msgID, messageSenderInfo, zAreEqual, userID, groupID, lValueOf2, messageStatus2, 0, groupAtUserList, false, messageType, messageBody, zIsNeedReadReceipt, null, zIsSupportMessageExtension, null, null, null, 0, null, null, imMessage, 2073216, null);
    }

    /* JADX INFO: renamed from: a */
    public static String m88247a(MessageType messageType, String str, String str2, String str3, Function1 isLocalExistRef) {
        String str4;
        File filesDir;
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(isLocalExistRef, "isLocalExistRef");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        StringBuilder sb2 = new StringBuilder();
        Context applicationContext = IMContext.getInstance().getApplicationContext();
        sb2.append((applicationContext == null || (filesDir = applicationContext.getFilesDir()) == null) ? null : filesDir.getAbsolutePath());
        sb2.append("/atomicx_core_data");
        String string = sb2.toString();
        int[] iArr = AbstractC39498f.f87696a;
        int i11 = iArr[messageType.ordinal()];
        boolean z11 = true;
        if (i11 == 1) {
            str4 = string + TUIConfig.IMAGE_BASE_DIR_SUFFIX;
        } else if (i11 == 2) {
            str4 = string + TUIConfig.VIDEO_BASE_DIR_SUFFIX;
        } else if (i11 == 3) {
            str4 = string + "/voice/";
        } else if (i11 != 4) {
            str4 = string + "/file/";
        } else {
            str4 = string + "/file/";
        }
        String string2 = "";
        boolean z12 = false;
        if (str == null || str.length() == 0) {
            str = "";
        } else {
            File file = new File(str);
            if (file.exists() && file.isFile()) {
                z12 = true;
            }
        }
        if (z12) {
            z11 = z12;
        } else {
            int i12 = iArr[messageType.ordinal()];
            if (i12 == 1) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str4);
                if (str2 == null) {
                    str2 = "";
                }
                sb3.append(str2);
                sb3.append('_');
                if (str3 == null) {
                    str3 = "";
                }
                sb3.append(str3);
                string2 = sb3.toString();
            } else if (i12 == 2 || i12 == 3) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str4);
                if (str2 == null) {
                    str2 = "";
                }
                sb4.append(str2);
                string2 = sb4.toString();
                if (str3 != null) {
                    string2 = string2 + '.' + str3;
                }
            } else if (i12 == 4) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str4);
                if (str2 == null) {
                    str2 = "";
                }
                sb5.append(str2);
                if (str3 == null) {
                    str3 = "";
                }
                sb5.append(str3);
                string2 = sb5.toString();
            }
            File file2 = new File(string2);
            if (file2.exists() && file2.isFile()) {
                str = string2;
            } else {
                str = string2;
                z11 = z12;
            }
        }
        isLocalExistRef.invoke(Boolean.valueOf(z11));
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c4  */
    /* JADX INFO: renamed from: a */
    public static SystemMessageInfo.RecallMessage m88245a(V2TIMMessage message, V2TIMUserFullInfo v2TIMUserFullInfo, String str) {
        String sender;
        boolean z11;
        String groupID;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(message, "message");
        V2TIMUserFullInfo revokerInfo = message.getRevokerInfo();
        String userID = revokerInfo != null ? revokerInfo.getUserID() : null;
        if (userID != null && userID.length() != 0) {
            v2TIMUserFullInfo = message.getRevokerInfo();
        }
        String sender2 = message.getSender();
        if (sender2 == null) {
            sender2 = "";
        }
        String nickName = v2TIMUserFullInfo != null ? v2TIMUserFullInfo.getNickName() : null;
        if (nickName == null || nickName.length() == 0) {
            String userID2 = v2TIMUserFullInfo != null ? v2TIMUserFullInfo.getUserID() : null;
            if (userID2 == null || userID2.length() == 0) {
                String nickName2 = message.getNickName();
                sender = (nickName2 == null || nickName2.length() == 0) ? message.getSender() : message.getNickName();
            } else if (v2TIMUserFullInfo != null) {
                sender = v2TIMUserFullInfo.getUserID();
            } else {
                sender = null;
            }
        } else if (v2TIMUserFullInfo != null) {
            sender = v2TIMUserFullInfo.getNickName();
        } else {
            sender = null;
        }
        String str4 = sender == null ? "" : sender;
        String groupID2 = message.getGroupID();
        boolean zIsSelf = false;
        boolean z12 = !(groupID2 == null || groupID2.length() == 0);
        String userID3 = v2TIMUserFullInfo != null ? v2TIMUserFullInfo.getUserID() : null;
        if (userID3 == null || userID3.length() == 0) {
            zIsSelf = message.isSelf();
        } else {
            if (Intrinsics.areEqual(v2TIMUserFullInfo != null ? v2TIMUserFullInfo.getUserID() : null, sender2) && message.isSelf()) {
                z11 = true;
            }
            groupID = message.getGroupID();
            if (groupID == null) {
                str2 = "";
            } else {
                str2 = groupID;
            }
            if (str == null) {
                str3 = "";
            } else {
                str3 = str;
            }
            return new SystemMessageInfo.RecallMessage(str2, str4, z11, z12, str3);
        }
        z11 = zIsSelf;
        groupID = message.getGroupID();
        if (groupID == null) {
            str2 = "";
        } else {
            str2 = groupID;
        }
        if (str == null) {
            str3 = "";
        } else {
            str3 = str;
        }
        return new SystemMessageInfo.RecallMessage(str2, str4, z11, z12, str3);
    }
}
