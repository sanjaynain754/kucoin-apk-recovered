package io.trtc.tuikit.atomicxcore.impl.message;

import com.tencent.imsdk.BaseConstants;
import com.tencent.imsdk.p128v2.V2TIMFileElem;
import com.tencent.imsdk.p128v2.V2TIMImageElem;
import com.tencent.imsdk.p128v2.V2TIMManager;
import com.tencent.imsdk.p128v2.V2TIMMergerElem;
import com.tencent.imsdk.p128v2.V2TIMMessage;
import com.tencent.imsdk.p128v2.V2TIMMessageListGetOption;
import com.tencent.imsdk.p128v2.V2TIMSoundElem;
import com.tencent.imsdk.p128v2.V2TIMVideoElem;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.message.MergedForwardInfo;
import io.trtc.tuikit.atomicxcore.api.message.MergedMessageInfo;
import io.trtc.tuikit.atomicxcore.api.message.MessageBody;
import io.trtc.tuikit.atomicxcore.api.message.MessageEvent;
import io.trtc.tuikit.atomicxcore.api.message.MessageFetchDirection;
import io.trtc.tuikit.atomicxcore.api.message.MessageFetchOption;
import io.trtc.tuikit.atomicxcore.api.message.MessageFilterType;
import io.trtc.tuikit.atomicxcore.api.message.MessageForwardOption;
import io.trtc.tuikit.atomicxcore.api.message.MessageForwardType;
import io.trtc.tuikit.atomicxcore.api.message.MessageInfo;
import io.trtc.tuikit.atomicxcore.api.message.MessageInputStore;
import io.trtc.tuikit.atomicxcore.api.message.MessageListState;
import io.trtc.tuikit.atomicxcore.api.message.MessageListStore;
import io.trtc.tuikit.atomicxcore.api.message.MessageListType;
import io.trtc.tuikit.atomicxcore.api.message.MessageMediaFileType;
import io.trtc.tuikit.atomicxcore.api.message.MessageStatus;
import io.trtc.tuikit.atomicxcore.api.message.MessageType;
import io.trtc.tuikit.atomicxcore.impl.common.AbstractC39504l;
import io.trtc.tuikit.atomicxcore.impl.common.AbstractC39512t;
import io.trtc.tuikit.atomicxcore.impl.common.C39505m;
import io.trtc.tuikit.atomicxcore.impl.common.C39514v;
import io.trtc.tuikit.atomicxcore.impl.common.EnumC39496d;
import io.trtc.tuikit.atomicxcore.impl.common.InterfaceC39513u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41716o;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41674s;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41668m;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41673r;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.message.r0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39857r0 extends MessageListStore {

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ int f88586n = 0;

    /* JADX INFO: renamed from: a */
    public final String f88587a;

    /* JADX INFO: renamed from: b */
    public final MessageListType f88588b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC41709m0 f88589c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC41709m0 f88590d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC41669n f88591e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC41669n f88592f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC41669n f88593g;

    /* JADX INFO: renamed from: h */
    public MessageFetchOption f88594h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC41668m f88595i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC41673r f88596j;

    /* JADX INFO: renamed from: k */
    public final MessageListState f88597k;

    /* JADX INFO: renamed from: l */
    public volatile C39847m0 f88598l;

    /* JADX INFO: renamed from: m */
    public volatile C39849n0 f88599m;

    /* JADX INFO: renamed from: a */
    public static final Object m88334a(C39857r0 c39857r0, MessageInfo messageInfo, String str, C39843k0 c39843k0) {
        c39857r0.getClass();
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(c39843k0), 1);
        c41716o.m91142E();
        MessageInputStore.INSTANCE.create(str).sendMessage(messageInfo, new C39855q0(c41716o));
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(c39843k0);
        }
        return objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91171w : Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39857r0(String conversationID, MessageListType messageListType) {
        super(conversationID, messageListType);
        Intrinsics.checkNotNullParameter(conversationID, "conversationID");
        Intrinsics.checkNotNullParameter(messageListType, "messageListType");
        this.f88587a = conversationID;
        this.f88588b = messageListType;
        InterfaceC41709m0 interfaceC41709m0M91125a = C41713n0.m91125a(C41782z0.m91393c().plus(JobKt__JobKt.m90358b(null, 1, null)));
        this.f88589c = interfaceC41709m0M91125a;
        this.f88590d = C41713n0.m91125a(C41782z0.m91392b().plus(JobKt__JobKt.m90358b(null, 1, null)));
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(CollectionsKt.emptyList());
        this.f88591e = interfaceC41669nM91009a;
        Boolean bool = Boolean.FALSE;
        InterfaceC41669n interfaceC41669nM91009a2 = C41679x.m91009a(bool);
        this.f88592f = interfaceC41669nM91009a2;
        InterfaceC41669n interfaceC41669nM91009a3 = C41679x.m91009a(bool);
        this.f88593g = interfaceC41669nM91009a3;
        InterfaceC41668m interfaceC41668mM91000a = C41674s.m91000a(0, 0, BufferOverflow.SUSPEND);
        this.f88595i = interfaceC41668mM91000a;
        this.f88596j = C41636g.m90905b(interfaceC41668mM91000a);
        this.f88597k = new MessageListState(C41636g.m90907c(interfaceC41669nM91009a), C41636g.m90907c(interfaceC41669nM91009a2), C41636g.m90907c(interfaceC41669nM91009a3));
        this.f88598l = new C39847m0(this);
        C39514v c39514v = new C39514v(this.f88598l);
        this.f88599m = new C39849n0(this);
        ConcurrentHashMap concurrentHashMap = AbstractC39512t.f87709a;
        AbstractC39512t.m88253a("onMessageSendBegin", (InterfaceC39513u) this.f88599m);
        AbstractC39512t.m88253a("onMessageSendProgress", (InterfaceC39513u) this.f88599m);
        AbstractC39512t.m88253a("onMessageSendSuccess", (InterfaceC39513u) this.f88599m);
        AbstractC39512t.m88253a("onMessageSendFailed", (InterfaceC39513u) this.f88599m);
        AbstractC39512t.m88253a("onMessageDeleted", (InterfaceC39513u) this.f88599m);
        AbstractC39512t.m88253a("onMessageRecalled", (InterfaceC39513u) this.f88599m);
        AbstractC39512t.m88253a("onChatHistoryMessageCleared", (InterfaceC39513u) this.f88599m);
        AbstractC39512t.m88253a("onMessagePinned", (InterfaceC39513u) this.f88599m);
        AbstractC39512t.m88253a("onMessageTranslated", (InterfaceC39513u) this.f88599m);
        AbstractC39512t.m88253a("onVoiceConvertedToText", (InterfaceC39513u) this.f88599m);
        AbstractC39512t.m88253a("onConversationHistoryMessageCleared", (InterfaceC39513u) this.f88599m);
        V2TIMManager.getMessageManager().addAdvancedMsgListener(c39514v);
        C41696j.m91104d(interfaceC41709m0M91125a, null, null, new C39859t(this, null), 3, null);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.message.MessageListStore
    public final void deleteMessages(List messageList, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(messageList, "messageList");
        if (messageList.isEmpty()) {
            if (completionHandler != null) {
                completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "messageList cannot be empty");
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = messageList.iterator();
        while (it.hasNext()) {
            MessageInfo messageInfo = (MessageInfo) it.next();
            V2TIMMessage rawMessage = messageInfo.getRawMessage();
            if (rawMessage == null) {
                if (completionHandler != null) {
                    completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "MessageInfo.rawMessage cannot be null");
                    return;
                }
                return;
            }
            String msgID = messageInfo.getMsgID();
            if (msgID == null || msgID.length() == 0) {
                if (completionHandler != null) {
                    completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "MessageInfo.msgID cannot be null");
                    return;
                }
                return;
            }
            arrayList.add(rawMessage);
            arrayList2.add(msgID);
        }
        V2TIMManager.getMessageManager().deleteMessages(arrayList, new C39861v(arrayList2, completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.message.MessageListStore
    public final void downloadMessageResource(MessageInfo message, MessageMediaFileType resourceType, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(resourceType, "resourceType");
        V2TIMMessage rawMessage = message.getRawMessage();
        if (rawMessage == null) {
            if (completionHandler != null) {
                completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "Message not found for operation");
            }
            return;
        }
        switch (AbstractC39860u.f88605c[resourceType.ordinal()]) {
            case 1:
                V2TIMImageElem imageElem = rawMessage.getImageElem();
                List<V2TIMImageElem.V2TIMImage> imageList = imageElem != null ? imageElem.getImageList() : null;
                if (imageList == null) {
                    imageList = CollectionsKt.emptyList();
                }
                for (V2TIMImageElem.V2TIMImage v2TIMImage : imageList) {
                    if (v2TIMImage.getType() == 1) {
                        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                        MessageType messageType = MessageType.IMAGE;
                        MessageBody messageBody = message.getMessageBody();
                        String strM88247a = AbstractC39504l.m88247a(messageType, messageBody != null ? messageBody.getThumbImagePath() : null, v2TIMImage.getUUID(), String.valueOf(v2TIMImage.getType()), new C39812P(booleanRef));
                        if (booleanRef.element) {
                            m88339a(message, new C39809M(strM88247a));
                            if (completionHandler != null) {
                                completionHandler.onSuccess();
                            }
                        } else {
                            v2TIMImage.downloadImage(strM88247a, new C39811O(this, message, completionHandler, strM88247a));
                        }
                        break;
                    }
                }
                break;
            case 2:
                V2TIMImageElem imageElem2 = rawMessage.getImageElem();
                List<V2TIMImageElem.V2TIMImage> imageList2 = imageElem2 != null ? imageElem2.getImageList() : null;
                if (imageList2 == null) {
                    imageList2 = CollectionsKt.emptyList();
                }
                for (V2TIMImageElem.V2TIMImage v2TIMImage2 : imageList2) {
                    if (v2TIMImage2.getType() == 2) {
                        Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                        MessageType messageType2 = MessageType.IMAGE;
                        MessageBody messageBody2 = message.getMessageBody();
                        String strM88247a2 = AbstractC39504l.m88247a(messageType2, messageBody2 != null ? messageBody2.getLargeImagePath() : null, v2TIMImage2.getUUID(), String.valueOf(v2TIMImage2.getType()), new C39800D(booleanRef2));
                        if (booleanRef2.element) {
                            m88339a(message, new C39797A(strM88247a2));
                            if (completionHandler != null) {
                                completionHandler.onSuccess();
                            }
                        } else {
                            v2TIMImage2.downloadImage(strM88247a2, new C39799C(this, message, completionHandler, strM88247a2));
                        }
                        break;
                    }
                }
                break;
            case 3:
                V2TIMImageElem imageElem3 = rawMessage.getImageElem();
                List<V2TIMImageElem.V2TIMImage> imageList3 = imageElem3 != null ? imageElem3.getImageList() : null;
                if (imageList3 == null) {
                    imageList3 = CollectionsKt.emptyList();
                }
                for (V2TIMImageElem.V2TIMImage v2TIMImage3 : imageList3) {
                    if (v2TIMImage3.getType() == 0) {
                        Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
                        MessageType messageType3 = MessageType.IMAGE;
                        MessageBody messageBody3 = message.getMessageBody();
                        String strM88247a3 = AbstractC39504l.m88247a(messageType3, messageBody3 != null ? messageBody3.getOriginalImagePath() : null, v2TIMImage3.getUUID(), String.valueOf(v2TIMImage3.getType()), new C39804H(booleanRef3));
                        if (booleanRef3.element) {
                            m88339a(message, new C39801E(strM88247a3));
                            if (completionHandler != null) {
                                completionHandler.onSuccess();
                            }
                        } else {
                            v2TIMImage3.downloadImage(strM88247a3, new C39803G(this, message, completionHandler, strM88247a3));
                        }
                        break;
                    }
                }
                break;
            case 4:
                Ref.BooleanRef booleanRef4 = new Ref.BooleanRef();
                MessageType messageType4 = MessageType.VIDEO;
                MessageBody messageBody4 = message.getMessageBody();
                String videoSnapshotPath = messageBody4 != null ? messageBody4.getVideoSnapshotPath() : null;
                V2TIMVideoElem videoElem = rawMessage.getVideoElem();
                String strM88247a4 = AbstractC39504l.m88247a(messageType4, videoSnapshotPath, videoElem != null ? videoElem.getSnapshotUUID() : null, null, new C39820Y(booleanRef4));
                if (booleanRef4.element) {
                    m88339a(message, new C39817V(strM88247a4));
                    if (completionHandler != null) {
                        completionHandler.onSuccess();
                    }
                } else {
                    V2TIMVideoElem videoElem2 = rawMessage.getVideoElem();
                    if (videoElem2 != null) {
                        videoElem2.downloadSnapshot(strM88247a4, new C39819X(this, message, completionHandler, strM88247a4));
                    }
                }
                break;
            case 5:
                Ref.BooleanRef booleanRef5 = new Ref.BooleanRef();
                MessageType messageType5 = MessageType.VIDEO;
                MessageBody messageBody5 = message.getMessageBody();
                String videoPath = messageBody5 != null ? messageBody5.getVideoPath() : null;
                V2TIMVideoElem videoElem3 = rawMessage.getVideoElem();
                String strM88247a5 = AbstractC39504l.m88247a(messageType5, videoPath, videoElem3 != null ? videoElem3.getVideoUUID() : null, "", new C39816U(booleanRef5));
                if (booleanRef5.element) {
                    m88339a(message, new C39813Q(strM88247a5));
                    if (completionHandler != null) {
                        completionHandler.onSuccess();
                    }
                } else {
                    V2TIMVideoElem videoElem4 = rawMessage.getVideoElem();
                    if (videoElem4 != null) {
                        videoElem4.downloadVideo(strM88247a5, new C39815T(this, message, completionHandler, strM88247a5));
                    }
                }
                break;
            case 6:
                Ref.BooleanRef booleanRef6 = new Ref.BooleanRef();
                MessageType messageType6 = MessageType.SOUND;
                MessageBody messageBody6 = message.getMessageBody();
                String soundPath = messageBody6 != null ? messageBody6.getSoundPath() : null;
                V2TIMSoundElem soundElem = rawMessage.getSoundElem();
                String strM88247a6 = AbstractC39504l.m88247a(messageType6, soundPath, soundElem != null ? soundElem.getUUID() : null, "amr", new C39808L(booleanRef6));
                if (booleanRef6.element) {
                    m88339a(message, new C39805I(strM88247a6));
                    if (completionHandler != null) {
                        completionHandler.onSuccess();
                    }
                } else {
                    V2TIMSoundElem soundElem2 = rawMessage.getSoundElem();
                    if (soundElem2 != null) {
                        soundElem2.downloadSound(strM88247a6, new C39807K(this, message, completionHandler, strM88247a6));
                    }
                }
                break;
            case 7:
                Ref.BooleanRef booleanRef7 = new Ref.BooleanRef();
                MessageType messageType7 = MessageType.FILE;
                MessageBody messageBody7 = message.getMessageBody();
                String filePath = messageBody7 != null ? messageBody7.getFilePath() : null;
                V2TIMFileElem fileElem = rawMessage.getFileElem();
                String uuid = fileElem != null ? fileElem.getUUID() : null;
                V2TIMFileElem fileElem2 = rawMessage.getFileElem();
                String strM88247a7 = AbstractC39504l.m88247a(messageType7, filePath, uuid, fileElem2 != null ? fileElem2.getFileName() : null, new C39865z(booleanRef7));
                if (booleanRef7.element) {
                    m88339a(message, new C39862w(strM88247a7));
                    if (completionHandler != null) {
                        completionHandler.onSuccess();
                    }
                } else {
                    V2TIMFileElem fileElem3 = rawMessage.getFileElem();
                    if (fileElem3 != null) {
                        fileElem3.downloadFile(strM88247a7, new C39864y(this, message, completionHandler, strM88247a7));
                    }
                }
                break;
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.api.message.MessageListStore
    public final void fetchMessageList(MessageFetchOption option, CompletionHandler completionHandler) throws JSONException {
        Intrinsics.checkNotNullParameter(option, "option");
        EnumC39496d componentType = EnumC39496d.MESSAGE_LIST;
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("UIComponentType", 1001);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        V2TIMManager.getInstance().callExperimentalAPI("reportTUIFeatureUsage", string, new C39505m());
        this.f88594h = option;
        this.f88591e.setValue(CollectionsKt.emptyList());
        InterfaceC41669n interfaceC41669n = this.f88592f;
        Boolean bool = Boolean.FALSE;
        interfaceC41669n.setValue(bool);
        this.f88593g.setValue(bool);
        C39829d0 c39829d0 = new C39829d0(completionHandler);
        int i11 = AbstractC39860u.f88603a[this.f88588b.ordinal()];
        if (i11 == 1) {
            if (option.getDirection() == MessageFetchDirection.OLDER || option.getDirection() == MessageFetchDirection.NEWER) {
                m88338a(option, false, (CompletionHandler) c39829d0);
                return;
            } else {
                C41696j.m91104d(this.f88590d, null, null, new C39839i0(this, option, c39829d0, null), 3, null);
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        MessageInfo message = option.getMessage();
        V2TIMMessage rawMessage = message != null ? message.getRawMessage() : null;
        if (rawMessage == null || rawMessage.getElemType() != 10) {
            Intrinsics.checkNotNullParameter("Invalid merged message", "desc");
            if (completionHandler != null) {
                completionHandler.onFailure(-1, "Invalid merged message");
                return;
            }
            return;
        }
        V2TIMMergerElem mergerElem = rawMessage.getMergerElem();
        if (mergerElem != null) {
            mergerElem.downloadMergerMessage(new C39821Z(c39829d0, this, option));
            return;
        }
        Intrinsics.checkNotNullParameter("Invalid merged message", "desc");
        if (completionHandler != null) {
            completionHandler.onFailure(-1, "Invalid merged message");
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.api.message.MessageListStore
    public final void fetchMessageReactions(List messageList, int i11, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(messageList, "messageList");
        if (messageList.isEmpty()) {
            if (completionHandler != null) {
                completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "messageList cannot be empty");
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = messageList.iterator();
        while (it.hasNext()) {
            V2TIMMessage rawMessage = ((MessageInfo) it.next()).getRawMessage();
            if (rawMessage == null) {
                if (completionHandler != null) {
                    completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "MessageInfo.rawMessage cannot be nil");
                    return;
                }
                return;
            }
            arrayList.add(rawMessage);
        }
        V2TIMManager.getMessageManager().getMessageReactions(arrayList, i11, new C39825b0(completionHandler, this));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.message.MessageListStore
    public final void fetchMoreMessageList(MessageFetchDirection direction, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        MessageFetchOption messageFetchOption = this.f88594h;
        if (messageFetchOption == null) {
            if (completionHandler != null) {
                completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "Please call fetchMessagesInternal first");
                return;
            }
            return;
        }
        MessageFetchOption messageFetchOptionCopy$default = MessageFetchOption.copy$default(messageFetchOption, null, 0L, direction, null, 0, 27, null);
        int i11 = AbstractC39860u.f88604b[direction.ordinal()];
        Object obj = null;
        if (i11 == 1) {
            if (!((Boolean) this.f88592f.getValue()).booleanValue()) {
                if (completionHandler != null) {
                    completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "No more older message");
                    return;
                }
                return;
            }
            for (Object obj2 : (Iterable) this.f88591e.getValue()) {
                if (((MessageInfo) obj2).getRawMessage() != null) {
                    obj = obj2;
                    break;
                }
            }
            MessageInfo messageInfo = (MessageInfo) obj;
            if (messageInfo == null) {
                if (completionHandler != null) {
                    completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "No more older message");
                    return;
                }
                return;
            }
            messageFetchOptionCopy$default = MessageFetchOption.copy$default(messageFetchOptionCopy$default, messageInfo, 0L, null, null, 0, 30, null);
        } else if (i11 == 2) {
            if (!((Boolean) this.f88593g.getValue()).booleanValue()) {
                if (completionHandler != null) {
                    completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "No more newer message");
                    return;
                }
                return;
            }
            List list = (List) this.f88591e.getValue();
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                Object objPrevious = listIterator.previous();
                if (((MessageInfo) objPrevious).getRawMessage() != null) {
                    obj = objPrevious;
                    break;
                }
            }
            MessageInfo messageInfo2 = (MessageInfo) obj;
            if (messageInfo2 == null) {
                if (completionHandler != null) {
                    completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "No more newer message");
                    return;
                }
                return;
            }
            messageFetchOptionCopy$default = MessageFetchOption.copy$default(messageFetchOptionCopy$default, messageInfo2, 0L, null, null, 0, 30, null);
        }
        m88338a(messageFetchOptionCopy$default, true, completionHandler);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.message.MessageListStore
    public final void forwardMessages(List messageList, MessageForwardOption forwardOption, String str, CompletionHandler completionHandler) {
        String conversationID = str;
        Intrinsics.checkNotNullParameter(messageList, "messageList");
        Intrinsics.checkNotNullParameter(forwardOption, "forwardOption");
        Intrinsics.checkNotNullParameter(conversationID, "conversationID");
        if (messageList.isEmpty()) {
            if (completionHandler != null) {
                completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "messageList cannot be empty");
                return;
            }
            return;
        }
        Iterator it = messageList.iterator();
        while (it.hasNext()) {
            MessageInfo messageInfo = (MessageInfo) it.next();
            if (messageInfo.getRawMessage() == null) {
                if (completionHandler != null) {
                    completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "MessageInfo.rawMessage cannot be null");
                    return;
                }
                return;
            } else if (messageInfo.getStatus() != MessageStatus.SEND_SUCCESS) {
                if (completionHandler != null) {
                    completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "Only successfully sent messages can be forwarded");
                    return;
                }
                return;
            } else if (messageInfo.getMessageType() == MessageType.SYSTEM || messageInfo.getMessageType() == MessageType.UNKNOWN) {
                if (completionHandler != null) {
                    completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "System messages and unknown messages cannot be forwarded");
                    return;
                }
                return;
            }
        }
        if (conversationID.length() == 0) {
            if (completionHandler != null) {
                completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "conversationID cannot be empty");
                return;
            }
            return;
        }
        if (forwardOption.getForwardType() != MessageForwardType.MERGED) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = messageList.iterator();
            int i11 = 0;
            while (it2.hasNext()) {
                int i12 = i11 + 1;
                MessageInfo messageInfo2 = (MessageInfo) it2.next();
                V2TIMMessage rawMessage = messageInfo2.getRawMessage();
                if (rawMessage != null) {
                    V2TIMMessage v2TIMMessageCreateForwardMessage = V2TIMManager.getMessageManager().createForwardMessage(rawMessage);
                    if (v2TIMMessageCreateForwardMessage == null) {
                        if (completionHandler != null) {
                            completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "Failed to create forward message");
                            return;
                        }
                        return;
                    }
                    arrayList.add(C41696j.m91102b(this.f88590d, null, null, new C39843k0(((long) i11) * 100, this, new MessageInfo(null, null, false, null, null, null, null, 0, null, false, messageInfo2.getMessageType(), messageInfo2.getMessageBody(), messageInfo2.getNeedReadReceipt(), null, messageInfo2.getSupportExtension(), null, null, null, 0, null, messageInfo2.getOfflinePushInfo(), v2TIMMessageCreateForwardMessage, 1025023, null), conversationID, null), 3, null));
                }
                conversationID = str;
                i11 = i12;
            }
            C41696j.m91104d(this.f88590d, null, null, new C39841j0(arrayList, completionHandler, null), 3, null);
            return;
        }
        if (messageList.size() > 300) {
            if (completionHandler != null) {
                completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "messageList count cannot exceed 300 when forwardType is MERGED");
                return;
            }
            return;
        }
        MergedForwardInfo mergedForwardInfo = forwardOption.getMergedForwardInfo();
        if (mergedForwardInfo == null || mergedForwardInfo.getTitle().length() == 0) {
            if (completionHandler != null) {
                completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "mergedForwardInfo and mergedForwardInfo.title cannot be empty when forwardType is MERGED");
                return;
            }
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = messageList.iterator();
        while (it3.hasNext()) {
            V2TIMMessage rawMessage2 = ((MessageInfo) it3.next()).getRawMessage();
            if (rawMessage2 != null) {
                arrayList2.add(rawMessage2);
            }
        }
        V2TIMMessage v2TIMMessageCreateMergerMessage = V2TIMManager.getMessageManager().createMergerMessage(arrayList2, mergedForwardInfo.getTitle(), mergedForwardInfo.getAbstractList(), mergedForwardInfo.getCompatibleText());
        if (v2TIMMessageCreateMergerMessage == null) {
            if (completionHandler != null) {
                completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "Failed to create merger message");
            }
        } else {
            MessageInputStore.INSTANCE.create(conversationID).sendMessage(new MessageInfo(null, null, false, null, null, null, null, 0, null, false, MessageType.MERGED, new MessageBody(null, null, null, null, 0, 0, 0, null, null, null, null, 0, 0, null, 0, 0, 0, null, 0, 0, null, null, null, null, null, 0, 0, null, null, null, new MergedMessageInfo(mergedForwardInfo.getTitle(), mergedForwardInfo.getAbstractList()), 1073741823, null), mergedForwardInfo.getNeedReadReceipt(), null, mergedForwardInfo.getSupportExtension(), null, null, null, 0, null, mergedForwardInfo.getOfflinePushInfo(), v2TIMMessageCreateMergerMessage, 1025023, null), completionHandler);
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.api.message.MessageListStore
    public final String getConversationID() {
        return this.f88587a;
    }

    @Override // io.trtc.tuikit.atomicxcore.api.message.MessageListStore
    public final InterfaceC41673r getMessageEventFlow() {
        return this.f88596j;
    }

    @Override // io.trtc.tuikit.atomicxcore.api.message.MessageListStore
    public final MessageListState getMessageListState() {
        return this.f88597k;
    }

    @Override // io.trtc.tuikit.atomicxcore.api.message.MessageListStore
    public final MessageListType getMessageListType() {
        return this.f88588b;
    }

    @Override // io.trtc.tuikit.atomicxcore.api.message.MessageListStore
    public final void sendMessageReadReceipts(List messageList, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(messageList, "messageList");
        if (messageList.isEmpty()) {
            if (completionHandler != null) {
                completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "messageList cannot be empty");
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = messageList.iterator();
        while (it.hasNext()) {
            V2TIMMessage rawMessage = ((MessageInfo) it.next()).getRawMessage();
            if (rawMessage == null) {
                if (completionHandler != null) {
                    completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "MessageInfo.rawMessage cannot be null");
                    return;
                }
                return;
            }
            arrayList.add(rawMessage);
        }
        V2TIMManager.getMessageManager().sendMessageReadReceipts(arrayList, new C39853p0(completionHandler));
    }

    /* JADX INFO: renamed from: a */
    public static final void m88335a(C39857r0 c39857r0, String str, int i11) {
        if (str == null) {
            c39857r0.getClass();
            return;
        }
        List mutableList = CollectionsKt.toMutableList((Collection) c39857r0.f88591e.getValue());
        Iterator it = mutableList.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            } else if (Intrinsics.areEqual(((MessageInfo) it.next()).getMsgID(), str)) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 != -1) {
            mutableList.set(i12, MessageInfo.copy$default((MessageInfo) mutableList.get(i12), null, null, false, null, null, null, null, i11, null, false, null, null, false, null, false, null, null, null, 0, null, null, null, 4194175, null));
            c39857r0.f88591e.setValue(mutableList);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m88336a(C39857r0 c39857r0, Map map) {
        Object obj;
        if (c39857r0.f88588b != MessageListType.HISTORY || map == null || (obj = map.get("conversationID")) == null || !Intrinsics.areEqual(obj, c39857r0.f88587a)) {
            return;
        }
        List list = (List) c39857r0.f88591e.getValue();
        c39857r0.f88591e.setValue(CollectionsKt.emptyList());
        if (list.isEmpty()) {
            return;
        }
        c39857r0.m88337a(new MessageEvent.DeleteMessages(list));
    }

    /* JADX INFO: renamed from: a */
    public final void m88338a(MessageFetchOption messageFetchOption, boolean z11, CompletionHandler completionHandler) {
        V2TIMMessageListGetOption v2TIMMessageListGetOption = new V2TIMMessageListGetOption();
        String conversationID = this.f88587a;
        Intrinsics.checkNotNullParameter(conversationID, "conversationID");
        int i11 = 2;
        v2TIMMessageListGetOption.setUserID(StringsKt.startsWith$default(conversationID, TUIConstants.TUIConversation.CONVERSATION_C2C_PREFIX, false, 2, (Object) null) ? StringsKt.replaceFirst$default(conversationID, TUIConstants.TUIConversation.CONVERSATION_C2C_PREFIX, "", false, 4, (Object) null) : null);
        String conversationID2 = this.f88587a;
        Intrinsics.checkNotNullParameter(conversationID2, "conversationID");
        v2TIMMessageListGetOption.setGroupID(StringsKt.startsWith$default(conversationID2, TUIConstants.TUIConversation.CONVERSATION_GROUP_PREFIX, false, 2, (Object) null) ? StringsKt.replaceFirst$default(conversationID2, TUIConstants.TUIConversation.CONVERSATION_GROUP_PREFIX, "", false, 4, (Object) null) : null);
        MessageInfo message = messageFetchOption.getMessage();
        v2TIMMessageListGetOption.setLastMsg(message != null ? message.getRawMessage() : null);
        v2TIMMessageListGetOption.setCount(messageFetchOption.getPageCount());
        ArrayList arrayList = new ArrayList();
        if (messageFetchOption.getFilterType().contains(MessageFilterType.Image)) {
            arrayList.add(3);
        }
        if (messageFetchOption.getFilterType().contains(MessageFilterType.Video)) {
            arrayList.add(5);
        }
        v2TIMMessageListGetOption.setMessageTypeList(arrayList);
        if (messageFetchOption.getDirection() == MessageFetchDirection.NEWER) {
            if (!arrayList.isEmpty()) {
                i11 = 4;
            }
        } else {
            i11 = !arrayList.isEmpty() ? 3 : 1;
        }
        v2TIMMessageListGetOption.setGetType(i11);
        V2TIMManager.getMessageManager().getHistoryMessageList(v2TIMMessageListGetOption, new C39831e0(messageFetchOption, this, z11, completionHandler));
    }

    /* JADX INFO: renamed from: a */
    public final void m88339a(MessageInfo messageInfo, Function1 function1) {
        String msgID = messageInfo.getMsgID();
        if (msgID == null) {
            return;
        }
        List mutableList = CollectionsKt.toMutableList((Collection) this.f88591e.getValue());
        Iterator it = mutableList.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (Intrinsics.areEqual(((MessageInfo) it.next()).getMsgID(), msgID)) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 != -1) {
            MessageInfo messageInfo2 = (MessageInfo) mutableList.get(i11);
            MessageBody messageBody = messageInfo2.getMessageBody();
            mutableList.set(i11, MessageInfo.copy$default(messageInfo2, null, null, false, null, null, null, null, 100, null, false, null, messageBody != null ? (MessageBody) function1.invoke(messageBody) : null, false, null, false, null, null, null, 0, null, null, null, 4192127, null));
            this.f88591e.setValue(mutableList);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m88337a(MessageEvent messageEvent) {
        C41696j.m91104d(this.f88589c, null, null, new C39851o0(this, messageEvent, null), 3, null);
    }
}
