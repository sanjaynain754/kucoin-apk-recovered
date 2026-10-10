package io.trtc.tuikit.atomicxcore.impl.message;

import com.tencent.imsdk.p128v2.V2TIMMessage;
import io.trtc.tuikit.atomicxcore.api.message.MessageBody;
import io.trtc.tuikit.atomicxcore.api.message.MessageEvent;
import io.trtc.tuikit.atomicxcore.api.message.MessageInfo;
import io.trtc.tuikit.atomicxcore.api.message.MessageListType;
import io.trtc.tuikit.atomicxcore.api.message.MessageStatus;
import io.trtc.tuikit.atomicxcore.api.message.MessageType;
import io.trtc.tuikit.atomicxcore.impl.common.AbstractC39504l;
import io.trtc.tuikit.atomicxcore.impl.common.InterfaceC39513u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.flow.InterfaceC41669n;
import org.json.JSONObject;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.message.n0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39849n0 implements InterfaceC39513u {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39857r0 f88559a;

    /* JADX WARN: Code duplicated, block: B:384:0x0845  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.trtc.tuikit.atomicxcore.impl.common.InterfaceC39513u
    /* JADX INFO: renamed from: a */
    public final void mo82103a(String name, Object data) {
        Object value;
        ArrayList arrayList;
        Object obj;
        List listListOf;
        Object value2;
        ArrayList arrayList2;
        Object value3;
        ArrayList arrayList3;
        Object value4;
        ArrayList arrayList4;
        Object value5;
        ArrayList arrayList5;
        V2TIMMessage rawMessage;
        String str;
        V2TIMMessage rawMessage2;
        JSONObject jSONObject;
        Object value6;
        ArrayList arrayList6;
        ArrayList arrayList7;
        Map linkedHashMap;
        MessageBody messageBodyCopy$default;
        JSONObject jSONObject2;
        Map<String, String> translatedText;
        Object value7;
        ArrayList arrayList8;
        Object value8;
        Object value9;
        ArrayList arrayList9;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(data, "data");
        Map map = data instanceof Map ? (Map) data : null;
        switch (name.hashCode()) {
            case -1440710472:
                if (name.equals("onMessageRecalled")) {
                    C39857r0 c39857r0 = this.f88559a;
                    if (c39857r0.f88588b == MessageListType.HISTORY && map != null) {
                        Object obj2 = map.get("messageID");
                        String str2 = obj2 instanceof String ? (String) obj2 : null;
                        if (str2 != null) {
                            InterfaceC41669n interfaceC41669n = c39857r0.f88591e;
                            do {
                                value = interfaceC41669n.getValue();
                                List<MessageInfo> list = (List) value;
                                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                for (MessageInfo messageInfoCopy$default : list) {
                                    if (Intrinsics.areEqual(messageInfoCopy$default.getMsgID(), str2)) {
                                        MessageStatus status = messageInfoCopy$default.getStatus();
                                        MessageStatus messageStatus = MessageStatus.RECALLED;
                                        if (status != messageStatus) {
                                            V2TIMMessage rawMessage3 = messageInfoCopy$default.getRawMessage();
                                            if (rawMessage3 != null) {
                                                obj = null;
                                                listListOf = CollectionsKt.listOf(AbstractC39504l.m88245a(rawMessage3, null, null));
                                            } else {
                                                obj = null;
                                                listListOf = null;
                                            }
                                            messageInfoCopy$default = MessageInfo.copy$default(messageInfoCopy$default, null, null, false, null, null, null, messageStatus, 0, null, false, MessageType.SYSTEM, new MessageBody(null, null, null, null, 0, 0, 0, null, null, null, null, 0, 0, null, 0, 0, 0, null, 0, 0, null, null, null, null, null, 0, 0, null, listListOf, null, null, 1342177279, null), false, null, false, null, null, null, 0, null, null, null, 4191167, null);
                                        }
                                    }
                                    arrayList.add(messageInfoCopy$default);
                                }
                            } while (!interfaceC41669n.compareAndSet(value, arrayList));
                        }
                    }
                }
                break;
            case -1102206511:
                if (name.equals("onMessageDeleted")) {
                    C39857r0 c39857r1 = this.f88559a;
                    if (c39857r1.f88588b == MessageListType.HISTORY && map != null) {
                        Object obj3 = map.get("messageIDList");
                        List list2 = obj3 instanceof List ? (List) obj3 : null;
                        if (list2 != null && !list2.isEmpty()) {
                            Set set = CollectionsKt.toSet(list2);
                            Iterable iterable = (Iterable) c39857r1.f88591e.getValue();
                            ArrayList arrayList10 = new ArrayList();
                            Iterator it = iterable.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    InterfaceC41669n interfaceC41669n2 = c39857r1.f88591e;
                                    do {
                                        value2 = interfaceC41669n2.getValue();
                                        arrayList2 = new ArrayList();
                                        for (Object obj4 : (List) value2) {
                                            String msgID = ((MessageInfo) obj4).getMsgID();
                                            if (!(msgID == null ? false : set.contains(msgID))) {
                                                arrayList2.add(obj4);
                                            }
                                        }
                                    } while (!interfaceC41669n2.compareAndSet(value2, arrayList2));
                                    if (!arrayList10.isEmpty()) {
                                        c39857r1.m88337a(new MessageEvent.DeleteMessages(arrayList10));
                                    }
                                    break;
                                } else {
                                    Object next = it.next();
                                    String msgID2 = ((MessageInfo) next).getMsgID();
                                    if (msgID2 != null ? set.contains(msgID2) : false) {
                                        arrayList10.add(next);
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case -1040485950:
                if (name.equals("onChatHistoryMessageCleared")) {
                    C39857r0.m88336a(this.f88559a, map);
                    break;
                }
                break;
            case -796622048:
                if (name.equals("onMessagePinned")) {
                    C39857r0 c39857r2 = this.f88559a;
                    if (c39857r2.f88588b == MessageListType.HISTORY && map != null) {
                        Object obj5 = map.get("messageID");
                        String str3 = obj5 instanceof String ? (String) obj5 : null;
                        if (str3 != null) {
                            Object obj6 = map.get("isPinned");
                            Boolean bool = obj6 instanceof Boolean ? (Boolean) obj6 : null;
                            if (bool != null) {
                                boolean zBooleanValue = bool.booleanValue();
                                InterfaceC41669n interfaceC41669n3 = c39857r2.f88591e;
                                do {
                                    value3 = interfaceC41669n3.getValue();
                                    List<MessageInfo> list3 = (List) value3;
                                    arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                                    for (MessageInfo messageInfoCopy$default2 : list3) {
                                        if (Intrinsics.areEqual(messageInfoCopy$default2.getMsgID(), str3)) {
                                            messageInfoCopy$default2 = MessageInfo.copy$default(messageInfoCopy$default2, null, null, false, null, null, null, null, 0, null, zBooleanValue, null, null, false, null, false, null, null, null, 0, null, null, null, 4193791, null);
                                        }
                                        arrayList3.add(messageInfoCopy$default2);
                                    }
                                } while (!interfaceC41669n3.compareAndSet(value3, arrayList3));
                            }
                        }
                    }
                }
                break;
            case -438515939:
                if (name.equals("onMessageSendProgress")) {
                    C39857r0 c39857r3 = this.f88559a;
                    if (c39857r3.f88588b == MessageListType.HISTORY && map != null) {
                        Object obj7 = map.get("conversationID");
                        String str4 = obj7 instanceof String ? (String) obj7 : null;
                        if (str4 != null) {
                            Object obj8 = map.get("messageID");
                            String str5 = obj8 instanceof String ? (String) obj8 : null;
                            if (str5 != null) {
                                Object obj9 = map.get("progress");
                                Integer num = obj9 instanceof Integer ? (Integer) obj9 : null;
                                if (num != null) {
                                    int iIntValue = num.intValue();
                                    if (Intrinsics.areEqual(str4, c39857r3.f88587a)) {
                                        InterfaceC41669n interfaceC41669n4 = c39857r3.f88591e;
                                        do {
                                            value4 = interfaceC41669n4.getValue();
                                            List<MessageInfo> list4 = (List) value4;
                                            arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
                                            for (MessageInfo messageInfoCopy$default3 : list4) {
                                                if (Intrinsics.areEqual(messageInfoCopy$default3.getMsgID(), str5)) {
                                                    messageInfoCopy$default3 = MessageInfo.copy$default(messageInfoCopy$default3, null, null, false, null, null, null, null, iIntValue, null, false, null, null, false, null, false, null, null, null, 0, null, null, null, 4194175, null);
                                                }
                                                arrayList4.add(messageInfoCopy$default3);
                                            }
                                        } while (!interfaceC41669n4.compareAndSet(value4, arrayList4));
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case -325001965:
                if (name.equals("onMessageSendSuccess")) {
                    C39857r0 c39857r4 = this.f88559a;
                    if (c39857r4.f88588b == MessageListType.HISTORY && map != null) {
                        Object obj10 = map.get("conversationID");
                        String str6 = obj10 instanceof String ? (String) obj10 : null;
                        if (str6 != null) {
                            Object obj11 = map.get("messageID");
                            String str7 = obj11 instanceof String ? (String) obj11 : null;
                            if (str7 != null && Intrinsics.areEqual(str6, c39857r4.f88587a)) {
                                InterfaceC41669n interfaceC41669n5 = c39857r4.f88591e;
                                do {
                                    value5 = interfaceC41669n5.getValue();
                                    List<MessageInfo> list5 = (List) value5;
                                    arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list5, 10));
                                    for (MessageInfo messageInfo : list5) {
                                        if (Intrinsics.areEqual(messageInfo.getMsgID(), str7) && (rawMessage = messageInfo.getRawMessage()) != null) {
                                            MessageInfo messageInfoCopy$default4 = MessageInfo.copy$default(AbstractC39504l.m88244a(rawMessage), null, null, false, null, null, null, null, 0, null, false, null, null, false, messageInfo.getReceipt(), false, messageInfo.getExtensionList(), messageInfo.getReactionList(), null, 0, null, null, null, 4087807, null);
                                            if (messageInfoCopy$default4 != null) {
                                                messageInfo = messageInfoCopy$default4;
                                            }
                                        }
                                        arrayList5.add(messageInfo);
                                    }
                                } while (!interfaceC41669n5.compareAndSet(value5, arrayList5));
                            }
                        }
                    }
                }
                break;
            case -132170905:
                if (name.equals("onVoiceConvertedToText")) {
                    C39857r0 c39857r5 = this.f88559a;
                    if (c39857r5.f88588b == MessageListType.HISTORY && map != null) {
                        Object obj12 = map.get("messageID");
                        String str8 = obj12 instanceof String ? (String) obj12 : null;
                        if (str8 != null) {
                            Object obj13 = map.get("language");
                            String str9 = obj13 instanceof String ? (String) obj13 : null;
                            if (str9 != null) {
                                Object obj14 = map.get("asrText");
                                String str10 = obj14 instanceof String ? (String) obj14 : null;
                                if (str10 != null) {
                                    InterfaceC41669n interfaceC41669n6 = c39857r5.f88591e;
                                    while (true) {
                                        Object value10 = interfaceC41669n6.getValue();
                                        List<MessageInfo> list6 = (List) value10;
                                        ArrayList arrayList11 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list6, 10));
                                        for (MessageInfo messageInfoCopy$default5 : list6) {
                                            if (Intrinsics.areEqual(messageInfoCopy$default5.getMsgID(), str8)) {
                                                MessageBody messageBody = messageInfoCopy$default5.getMessageBody();
                                                str = str10;
                                                messageInfoCopy$default5 = MessageInfo.copy$default(messageInfoCopy$default5, null, null, false, null, null, null, null, 0, null, false, null, messageBody != null ? MessageBody.copy$default(messageBody, null, null, null, null, 0, 0, 0, null, null, null, null, 0, 0, null, 0, 0, 0, null, 0, 0, null, str9, str10, null, null, 0, 0, null, null, null, null, 2141192191, null) : null, false, null, false, null, null, null, 0, null, null, null, 4192255, null);
                                                if (str.length() > 0 && (rawMessage2 = messageInfoCopy$default5.getRawMessage()) != null) {
                                                    try {
                                                        String localCustomData = rawMessage2.getLocalCustomData();
                                                        if (localCustomData != null) {
                                                            Intrinsics.checkNotNull(localCustomData);
                                                            try {
                                                                jSONObject = new JSONObject(localCustomData);
                                                            } catch (Exception unused) {
                                                                jSONObject = new JSONObject();
                                                            }
                                                        } else {
                                                            jSONObject = new JSONObject();
                                                        }
                                                        jSONObject.put("voice_to_text", str);
                                                        rawMessage2.setLocalCustomData(jSONObject.toString());
                                                        break;
                                                    } catch (Exception unused2) {
                                                    }
                                                }
                                            } else {
                                                str = str10;
                                            }
                                            arrayList11.add(messageInfoCopy$default5);
                                            str10 = str;
                                        }
                                        String str11 = str10;
                                        if (!interfaceC41669n6.compareAndSet(value10, arrayList11)) {
                                            str10 = str11;
                                        }
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case -1129442:
                if (name.equals("onMessageTranslated")) {
                    C39857r0 c39857r6 = this.f88559a;
                    if (c39857r6.f88588b == MessageListType.HISTORY && map != null) {
                        Object obj15 = map.get("messageID");
                        String str12 = obj15 instanceof String ? (String) obj15 : null;
                        if (str12 != null) {
                            Object obj16 = map.get("targetLanguage");
                            String str13 = obj16 instanceof String ? (String) obj16 : null;
                            if (str13 != null) {
                                Object obj17 = map.get("translatedTextMap");
                                Map map2 = obj17 instanceof Map ? (Map) obj17 : null;
                                if (map2 != null) {
                                    InterfaceC41669n interfaceC41669n7 = c39857r6.f88591e;
                                    do {
                                        value6 = interfaceC41669n7.getValue();
                                        List<MessageInfo> list7 = (List) value6;
                                        arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list7, 10));
                                        for (MessageInfo messageInfoCopy$default6 : list7) {
                                            if (Intrinsics.areEqual(messageInfoCopy$default6.getMsgID(), str12)) {
                                                MessageBody messageBody2 = messageInfoCopy$default6.getMessageBody();
                                                if (messageBody2 == null || (translatedText = messageBody2.getTranslatedText()) == null || (linkedHashMap = MapsKt.toMutableMap(translatedText)) == null) {
                                                    linkedHashMap = new LinkedHashMap();
                                                }
                                                Map map3 = linkedHashMap;
                                                for (Map.Entry entry : map2.entrySet()) {
                                                    map3.put((String) entry.getKey(), (String) entry.getValue());
                                                }
                                                MessageBody messageBody3 = messageInfoCopy$default6.getMessageBody();
                                                if (messageBody3 != null) {
                                                    arrayList7 = arrayList6;
                                                    messageBodyCopy$default = MessageBody.copy$default(messageBody3, null, str13, map3, null, 0, 0, 0, null, null, null, null, 0, 0, null, 0, 0, 0, null, 0, 0, null, null, null, null, null, 0, 0, null, null, null, null, 2147483641, null);
                                                } else {
                                                    arrayList7 = arrayList6;
                                                    messageBodyCopy$default = null;
                                                }
                                                messageInfoCopy$default6 = MessageInfo.copy$default(messageInfoCopy$default6, null, null, false, null, null, null, null, 0, null, false, null, messageBodyCopy$default, false, null, false, null, null, null, 0, null, null, null, 4192255, null);
                                                V2TIMMessage rawMessage4 = messageInfoCopy$default6.getRawMessage();
                                                if (rawMessage4 != null) {
                                                    try {
                                                        String localCustomData2 = rawMessage4.getLocalCustomData();
                                                        if (localCustomData2 != null) {
                                                            Intrinsics.checkNotNull(localCustomData2);
                                                            try {
                                                                jSONObject2 = new JSONObject(localCustomData2);
                                                            } catch (Exception unused3) {
                                                                jSONObject2 = new JSONObject();
                                                            }
                                                        } else {
                                                            jSONObject2 = new JSONObject();
                                                        }
                                                        JSONObject jSONObject3 = new JSONObject();
                                                        for (Map.Entry entry2 : map2.entrySet()) {
                                                            jSONObject3.put((String) entry2.getKey(), (String) entry2.getValue());
                                                        }
                                                        jSONObject2.put("text_translation", jSONObject3);
                                                        jSONObject2.put("text_translation_language", str13);
                                                        rawMessage4.setLocalCustomData(jSONObject2.toString());
                                                        break;
                                                    } catch (Exception unused4) {
                                                    }
                                                }
                                            } else {
                                                arrayList7 = arrayList6;
                                            }
                                            arrayList7.add(messageInfoCopy$default6);
                                            arrayList6 = arrayList7;
                                        }
                                    } while (!interfaceC41669n7.compareAndSet(value6, arrayList6));
                                }
                            }
                        }
                    }
                }
                break;
            case 1815811373:
                if (name.equals("onMessageSendFailed")) {
                    C39857r0 c39857r7 = this.f88559a;
                    if (c39857r7.f88588b == MessageListType.HISTORY && map != null) {
                        Object obj18 = map.get("conversationID");
                        String str14 = obj18 instanceof String ? (String) obj18 : null;
                        if (str14 != null) {
                            Object obj19 = map.get("messageID");
                            String str15 = obj19 instanceof String ? (String) obj19 : null;
                            if (str15 != null && Intrinsics.areEqual(str14, c39857r7.f88587a)) {
                                InterfaceC41669n interfaceC41669n8 = c39857r7.f88591e;
                                do {
                                    value7 = interfaceC41669n8.getValue();
                                    List<MessageInfo> list8 = (List) value7;
                                    arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list8, 10));
                                    for (MessageInfo messageInfoCopy$default7 : list8) {
                                        if (Intrinsics.areEqual(messageInfoCopy$default7.getMsgID(), str15)) {
                                            messageInfoCopy$default7 = MessageInfo.copy$default(messageInfoCopy$default7, null, null, false, null, null, null, MessageStatus.SEND_FAIL, 0, null, false, null, null, false, null, false, null, null, null, 0, null, null, null, 4194239, null);
                                        }
                                        arrayList8.add(messageInfoCopy$default7);
                                    }
                                } while (!interfaceC41669n8.compareAndSet(value7, arrayList8));
                            }
                        }
                    }
                }
                break;
            case 1833283703:
                if (name.equals("onConversationHistoryMessageCleared")) {
                    C39857r0.m88336a(this.f88559a, map);
                    break;
                }
                break;
            case 1994660281:
                if (name.equals("onMessageSendBegin")) {
                    C39857r0 c39857r8 = this.f88559a;
                    if (c39857r8.f88588b == MessageListType.HISTORY && map != null) {
                        Object obj20 = map.get("conversationID");
                        String str16 = obj20 instanceof String ? (String) obj20 : null;
                        if (str16 != null) {
                            Object obj21 = map.get("message");
                            MessageInfo messageInfo2 = obj21 instanceof MessageInfo ? (MessageInfo) obj21 : null;
                            if (messageInfo2 != null && Intrinsics.areEqual(str16, c39857r8.f88587a)) {
                                if (messageInfo2.getStatus() != MessageStatus.INIT) {
                                    InterfaceC41669n interfaceC41669n9 = c39857r8.f88591e;
                                    do {
                                        value9 = interfaceC41669n9.getValue();
                                        arrayList9 = new ArrayList();
                                        for (Object obj22 : (List) value9) {
                                            if (!Intrinsics.areEqual(((MessageInfo) obj22).getMsgID(), messageInfo2.getMsgID())) {
                                                arrayList9.add(obj22);
                                            }
                                        }
                                    } while (!interfaceC41669n9.compareAndSet(value9, arrayList9));
                                }
                                InterfaceC41669n interfaceC41669n10 = c39857r8.f88591e;
                                do {
                                    value8 = interfaceC41669n10.getValue();
                                } while (!interfaceC41669n10.compareAndSet(value8, CollectionsKt.plus((Collection<? extends MessageInfo>) value8, messageInfo2)));
                                c39857r8.m88337a(new MessageEvent.SendMessage(messageInfo2));
                            }
                            break;
                        }
                    }
                }
                break;
        }
    }

    public C39849n0(C39857r0 c39857r0) {
        this.f88559a = c39857r0;
    }
}
