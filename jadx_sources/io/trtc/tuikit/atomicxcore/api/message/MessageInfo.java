package io.trtc.tuikit.atomicxcore.api.message;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.imsdk.p128v2.V2TIMMessage;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.call.AbstractC39396a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\ba\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0011\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0011\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\b\b\u0002\u0010!\u001a\u00020\u000f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&¢\u0006\u0002\u0010'J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010n\u001a\u00020\u0007HÆ\u0003J\t\u0010o\u001a\u00020\u0014HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\t\u0010q\u001a\u00020\u0007HÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\t\u0010s\u001a\u00020\u0007HÆ\u0003J\u000f\u0010t\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0011HÆ\u0003J\u000f\u0010u\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0011HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010 HÆ\u0003J\t\u0010w\u001a\u00020\u000fHÆ\u0003J\t\u0010x\u001a\u00020\u0005HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010 HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010$HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010&HÆ\u0003J\t\u0010|\u001a\u00020\u0007HÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u007f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010iJ\n\u0010\u0080\u0001\u001a\u00020\rHÆ\u0003J\n\u0010\u0081\u0001\u001a\u00020\u000fHÆ\u0003J\u0010\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011HÆ\u0003J\u0092\u0002\u0010\u0083\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00072\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00112\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00112\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010!\u001a\u00020\u000f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&HÆ\u0001¢\u0006\u0003\u0010\u0084\u0001J\n\u0010\u0085\u0001\u001a\u00020\u000fHÖ\u0001J\u0016\u0010\u0086\u0001\u001a\u00020\u00072\n\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0088\u0001HÖ\u0003J\n\u0010\u0089\u0001\u001a\u00020\u000fHÖ\u0001J\n\u0010\u008a\u0001\u001a\u00020\u0003HÖ\u0001J\u001e\u0010\u008b\u0001\u001a\u00030\u008c\u00012\b\u0010\u008d\u0001\u001a\u00030\u008e\u00012\u0007\u0010\u008f\u0001\u001a\u00020\u000fHÖ\u0001R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010)\"\u0004\b-\u0010+R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u0010\u0012\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u00102\"\u0004\b3\u00104R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u00102\"\u0004\b5\u00104R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010/\"\u0004\b?\u00101R\u001a\u0010\u0017\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u00102\"\u0004\bA\u00104R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001c\u0010\"\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001c\u0010%\u001a\u0004\u0018\u00010&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010)\"\u0004\bS\u0010+R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010/\"\u0004\bY\u00101R\u001a\u0010!\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010G\"\u0004\b[\u0010IR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010K\"\u0004\b]\u0010MR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u001a\u0010\u001a\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u00102\"\u0004\bg\u00104R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010l\u001a\u0004\bh\u0010i\"\u0004\bj\u0010k¨\u0006\u0090\u0001"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;", "Landroid/os/Parcelable;", "msgID", "", TUIConstants.TUICalling.SENDER, "Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;", "isSelf", "", "receiver", "groupID", "timestamp", "", "status", "Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;", "progress", "", "atUserList", "", "isPinned", "messageType", "Lio/trtc/tuikit/atomicxcore/api/message/MessageType;", "messageBody", "Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;", "needReadReceipt", "receipt", "Lio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;", "supportExtension", "extensionList", "Lio/trtc/tuikit/atomicxcore/api/message/MessageExtension;", "reactionList", "Lio/trtc/tuikit/atomicxcore/api/message/MessageReaction;", "replyMessageInfo", "Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;", "repliedMessageCount", "quoteMessageInfo", "offlinePushInfo", "Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;", "rawMessage", "Lcom/tencent/imsdk/v2/V2TIMMessage;", "(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;ILjava/util/List;ZLio/trtc/tuikit/atomicxcore/api/message/MessageType;Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;ZLio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;ZLjava/util/List;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;ILio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;Lcom/tencent/imsdk/v2/V2TIMMessage;)V", "getAtUserList", "()Ljava/util/List;", "setAtUserList", "(Ljava/util/List;)V", "getExtensionList", "setExtensionList", "getGroupID", "()Ljava/lang/String;", "setGroupID", "(Ljava/lang/String;)V", "()Z", "setPinned", "(Z)V", "setSelf", "getMessageBody", "()Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;", "setMessageBody", "(Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;)V", "getMessageType", "()Lio/trtc/tuikit/atomicxcore/api/message/MessageType;", "setMessageType", "(Lio/trtc/tuikit/atomicxcore/api/message/MessageType;)V", "getMsgID", "setMsgID", "getNeedReadReceipt", "setNeedReadReceipt", "getOfflinePushInfo", "()Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;", "setOfflinePushInfo", "(Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;)V", "getProgress", "()I", "setProgress", "(I)V", "getQuoteMessageInfo", "()Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;", "setQuoteMessageInfo", "(Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;)V", "getRawMessage", "()Lcom/tencent/imsdk/v2/V2TIMMessage;", "setRawMessage", "(Lcom/tencent/imsdk/v2/V2TIMMessage;)V", "getReactionList", "setReactionList", "getReceipt", "()Lio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;", "setReceipt", "(Lio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;)V", "getReceiver", "setReceiver", "getRepliedMessageCount", "setRepliedMessageCount", "getReplyMessageInfo", "setReplyMessageInfo", "getSender", "()Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;", "setSender", "(Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;)V", "getStatus", "()Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;", "setStatus", "(Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;)V", "getSupportExtension", "setSupportExtension", "getTimestamp", "()Ljava/lang/Long;", "setTimestamp", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;ILjava/util/List;ZLio/trtc/tuikit/atomicxcore/api/message/MessageType;Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;ZLio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;ZLjava/util/List;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;ILio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;Lcom/tencent/imsdk/v2/V2TIMMessage;)Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class MessageInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MessageInfo> CREATOR = new Creator();

    @NotNull
    private List<String> atUserList;

    @NotNull
    private List<MessageExtension> extensionList;

    @Nullable
    private String groupID;
    private boolean isPinned;
    private boolean isSelf;

    @Nullable
    private MessageBody messageBody;

    @NotNull
    private MessageType messageType;

    @Nullable
    private String msgID;
    private boolean needReadReceipt;

    @Nullable
    private OfflinePushInfo offlinePushInfo;
    private int progress;

    @Nullable
    private ReplyMessageInfo quoteMessageInfo;

    @Nullable
    private V2TIMMessage rawMessage;

    @NotNull
    private List<MessageReaction> reactionList;

    @Nullable
    private MessageReceipt receipt;

    @Nullable
    private String receiver;
    private int repliedMessageCount;

    @Nullable
    private ReplyMessageInfo replyMessageInfo;

    @NotNull
    private MessageSenderInfo sender;

    @NotNull
    private MessageStatus status;
    private boolean supportExtension;

    @Nullable
    private Long timestamp;

    @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<MessageInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MessageInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            MessageSenderInfo messageSenderInfoCreateFromParcel = MessageSenderInfo.CREATOR.createFromParcel(parcel);
            boolean z11 = true;
            if (parcel.readInt() == 0) {
                z11 = false;
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            MessageStatus messageStatusValueOf = MessageStatus.valueOf(parcel.readString());
            int i11 = parcel.readInt();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            boolean z12 = parcel.readInt() != 0;
            MessageType messageTypeValueOf = MessageType.valueOf(parcel.readString());
            MessageBody messageBody = (MessageBody) (parcel.readInt() == 0 ? r12 : MessageBody.CREATOR.createFromParcel(parcel));
            boolean z13 = parcel.readInt() != 0 ? z11 : false;
            MessageReceipt messageReceiptCreateFromParcel = parcel.readInt() == 0 ? null : MessageReceipt.CREATOR.createFromParcel(parcel);
            boolean z14 = parcel.readInt() != 0;
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int i13 = 0;
            while (i13 != i12) {
                arrayList.add(MessageExtension.CREATOR.createFromParcel(parcel));
                i13++;
                i12 = i12;
            }
            int i14 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                arrayList2.add(MessageReaction.CREATOR.createFromParcel(parcel));
            }
            ReplyMessageInfo replyMessageInfoCreateFromParcel = parcel.readInt() == 0 ? r12 : ReplyMessageInfo.CREATOR.createFromParcel(parcel);
            int i16 = parcel.readInt();
            ReplyMessageInfo replyMessageInfoCreateFromParcel2 = parcel.readInt() == 0 ? r12 : ReplyMessageInfo.CREATOR.createFromParcel(parcel);
            Parcelable parcelableCreateFromParcel = r12;
            if (parcel.readInt() != 0) {
                parcelableCreateFromParcel = OfflinePushInfo.CREATOR.createFromParcel(parcel);
            }
            return new MessageInfo(string, messageSenderInfoCreateFromParcel, z11, string2, string3, lValueOf, messageStatusValueOf, i11, arrayListCreateStringArrayList, z12, messageTypeValueOf, messageBody, z13, messageReceiptCreateFromParcel, z14, arrayList, arrayList2, replyMessageInfoCreateFromParcel, i16, replyMessageInfoCreateFromParcel2, (OfflinePushInfo) parcelableCreateFromParcel, (V2TIMMessage) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MessageInfo[] newArray(int i11) {
            return new MessageInfo[i11];
        }
    }

    public MessageInfo() {
        this(null, null, false, null, null, null, null, 0, null, false, null, null, false, null, false, null, null, null, 0, null, null, null, 4194303, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessageInfo copy$default(MessageInfo messageInfo, String str, MessageSenderInfo messageSenderInfo, boolean z11, String str2, String str3, Long l11, MessageStatus messageStatus, int i11, List list, boolean z12, MessageType messageType, MessageBody messageBody, boolean z13, MessageReceipt messageReceipt, boolean z14, List list2, List list3, ReplyMessageInfo replyMessageInfo, int i12, ReplyMessageInfo replyMessageInfo2, OfflinePushInfo offlinePushInfo, V2TIMMessage v2TIMMessage, int i13, Object obj) {
        V2TIMMessage v2TIMMessage2;
        OfflinePushInfo offlinePushInfo2;
        String str4 = (i13 & 1) != 0 ? messageInfo.msgID : str;
        MessageSenderInfo messageSenderInfo2 = (i13 & 2) != 0 ? messageInfo.sender : messageSenderInfo;
        boolean z15 = (i13 & 4) != 0 ? messageInfo.isSelf : z11;
        String str5 = (i13 & 8) != 0 ? messageInfo.receiver : str2;
        String str6 = (i13 & 16) != 0 ? messageInfo.groupID : str3;
        Long l12 = (i13 & 32) != 0 ? messageInfo.timestamp : l11;
        MessageStatus messageStatus2 = (i13 & 64) != 0 ? messageInfo.status : messageStatus;
        int i14 = (i13 & 128) != 0 ? messageInfo.progress : i11;
        List list4 = (i13 & 256) != 0 ? messageInfo.atUserList : list;
        boolean z16 = (i13 & 512) != 0 ? messageInfo.isPinned : z12;
        MessageType messageType2 = (i13 & 1024) != 0 ? messageInfo.messageType : messageType;
        MessageBody messageBody2 = (i13 & 2048) != 0 ? messageInfo.messageBody : messageBody;
        boolean z17 = (i13 & 4096) != 0 ? messageInfo.needReadReceipt : z13;
        MessageReceipt messageReceipt2 = (i13 & 8192) != 0 ? messageInfo.receipt : messageReceipt;
        String str7 = str4;
        boolean z18 = (i13 & 16384) != 0 ? messageInfo.supportExtension : z14;
        List list5 = (i13 & 32768) != 0 ? messageInfo.extensionList : list2;
        List list6 = (i13 & 65536) != 0 ? messageInfo.reactionList : list3;
        ReplyMessageInfo replyMessageInfo3 = (i13 & 131072) != 0 ? messageInfo.replyMessageInfo : replyMessageInfo;
        int i15 = (i13 & 262144) != 0 ? messageInfo.repliedMessageCount : i12;
        ReplyMessageInfo replyMessageInfo4 = (i13 & 524288) != 0 ? messageInfo.quoteMessageInfo : replyMessageInfo2;
        OfflinePushInfo offlinePushInfo3 = (i13 & 1048576) != 0 ? messageInfo.offlinePushInfo : offlinePushInfo;
        if ((i13 & 2097152) != 0) {
            offlinePushInfo2 = offlinePushInfo3;
            v2TIMMessage2 = messageInfo.rawMessage;
        } else {
            v2TIMMessage2 = v2TIMMessage;
            offlinePushInfo2 = offlinePushInfo3;
        }
        return messageInfo.copy(str7, messageSenderInfo2, z15, str5, str6, l12, messageStatus2, i14, list4, z16, messageType2, messageBody2, z17, messageReceipt2, z18, list5, list6, replyMessageInfo3, i15, replyMessageInfo4, offlinePushInfo2, v2TIMMessage2);
    }

    @NotNull
    public final MessageInfo copy(@Nullable String msgID, @NotNull MessageSenderInfo sender, boolean isSelf, @Nullable String receiver, @Nullable String groupID, @Nullable Long timestamp, @NotNull MessageStatus status, int progress, @NotNull List<String> atUserList, boolean isPinned, @NotNull MessageType messageType, @Nullable MessageBody messageBody, boolean needReadReceipt, @Nullable MessageReceipt receipt, boolean supportExtension, @NotNull List<MessageExtension> extensionList, @NotNull List<MessageReaction> reactionList, @Nullable ReplyMessageInfo replyMessageInfo, int repliedMessageCount, @Nullable ReplyMessageInfo quoteMessageInfo, @Nullable OfflinePushInfo offlinePushInfo, @Nullable V2TIMMessage rawMessage) {
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(atUserList, "atUserList");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(extensionList, "extensionList");
        Intrinsics.checkNotNullParameter(reactionList, "reactionList");
        return new MessageInfo(msgID, sender, isSelf, receiver, groupID, timestamp, status, progress, atUserList, isPinned, messageType, messageBody, needReadReceipt, receipt, supportExtension, extensionList, reactionList, replyMessageInfo, repliedMessageCount, quoteMessageInfo, offlinePushInfo, rawMessage);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageInfo)) {
            return false;
        }
        MessageInfo messageInfo = (MessageInfo) other;
        return Intrinsics.areEqual(this.msgID, messageInfo.msgID) && Intrinsics.areEqual(this.sender, messageInfo.sender) && this.isSelf == messageInfo.isSelf && Intrinsics.areEqual(this.receiver, messageInfo.receiver) && Intrinsics.areEqual(this.groupID, messageInfo.groupID) && Intrinsics.areEqual(this.timestamp, messageInfo.timestamp) && this.status == messageInfo.status && this.progress == messageInfo.progress && Intrinsics.areEqual(this.atUserList, messageInfo.atUserList) && this.isPinned == messageInfo.isPinned && this.messageType == messageInfo.messageType && Intrinsics.areEqual(this.messageBody, messageInfo.messageBody) && this.needReadReceipt == messageInfo.needReadReceipt && Intrinsics.areEqual(this.receipt, messageInfo.receipt) && this.supportExtension == messageInfo.supportExtension && Intrinsics.areEqual(this.extensionList, messageInfo.extensionList) && Intrinsics.areEqual(this.reactionList, messageInfo.reactionList) && Intrinsics.areEqual(this.replyMessageInfo, messageInfo.replyMessageInfo) && this.repliedMessageCount == messageInfo.repliedMessageCount && Intrinsics.areEqual(this.quoteMessageInfo, messageInfo.quoteMessageInfo) && Intrinsics.areEqual(this.offlinePushInfo, messageInfo.offlinePushInfo) && Intrinsics.areEqual(this.rawMessage, messageInfo.rawMessage);
    }

    public MessageInfo(@Nullable String str, @NotNull MessageSenderInfo sender, boolean z11, @Nullable String str2, @Nullable String str3, @Nullable Long l11, @NotNull MessageStatus status, int i11, @NotNull List<String> atUserList, boolean z12, @NotNull MessageType messageType, @Nullable MessageBody messageBody, boolean z13, @Nullable MessageReceipt messageReceipt, boolean z14, @NotNull List<MessageExtension> extensionList, @NotNull List<MessageReaction> reactionList, @Nullable ReplyMessageInfo replyMessageInfo, int i12, @Nullable ReplyMessageInfo replyMessageInfo2, @Nullable OfflinePushInfo offlinePushInfo, @Nullable V2TIMMessage v2TIMMessage) {
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(atUserList, "atUserList");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(extensionList, "extensionList");
        Intrinsics.checkNotNullParameter(reactionList, "reactionList");
        this.msgID = str;
        this.sender = sender;
        this.isSelf = z11;
        this.receiver = str2;
        this.groupID = str3;
        this.timestamp = l11;
        this.status = status;
        this.progress = i11;
        this.atUserList = atUserList;
        this.isPinned = z12;
        this.messageType = messageType;
        this.messageBody = messageBody;
        this.needReadReceipt = z13;
        this.receipt = messageReceipt;
        this.supportExtension = z14;
        this.extensionList = extensionList;
        this.reactionList = reactionList;
        this.replyMessageInfo = replyMessageInfo;
        this.repliedMessageCount = i12;
        this.quoteMessageInfo = replyMessageInfo2;
        this.offlinePushInfo = offlinePushInfo;
        this.rawMessage = v2TIMMessage;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMsgID() {
        return this.msgID;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIsPinned() {
        return this.isPinned;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final MessageType getMessageType() {
        return this.messageType;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final MessageBody getMessageBody() {
        return this.messageBody;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getNeedReadReceipt() {
        return this.needReadReceipt;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final MessageReceipt getReceipt() {
        return this.receipt;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getSupportExtension() {
        return this.supportExtension;
    }

    @NotNull
    public final List<MessageExtension> component16() {
        return this.extensionList;
    }

    @NotNull
    public final List<MessageReaction> component17() {
        return this.reactionList;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final ReplyMessageInfo getReplyMessageInfo() {
        return this.replyMessageInfo;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getRepliedMessageCount() {
        return this.repliedMessageCount;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MessageSenderInfo getSender() {
        return this.sender;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final ReplyMessageInfo getQuoteMessageInfo() {
        return this.quoteMessageInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final OfflinePushInfo getOfflinePushInfo() {
        return this.offlinePushInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final V2TIMMessage getRawMessage() {
        return this.rawMessage;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsSelf() {
        return this.isSelf;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getReceiver() {
        return this.receiver;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getGroupID() {
        return this.groupID;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final MessageStatus getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    @NotNull
    public final List<String> component9() {
        return this.atUserList;
    }

    @NotNull
    public final List<String> getAtUserList() {
        return this.atUserList;
    }

    @NotNull
    public final List<MessageExtension> getExtensionList() {
        return this.extensionList;
    }

    @Nullable
    public final String getGroupID() {
        return this.groupID;
    }

    @Nullable
    public final MessageBody getMessageBody() {
        return this.messageBody;
    }

    @NotNull
    public final MessageType getMessageType() {
        return this.messageType;
    }

    @Nullable
    public final String getMsgID() {
        return this.msgID;
    }

    public final boolean getNeedReadReceipt() {
        return this.needReadReceipt;
    }

    @Nullable
    public final OfflinePushInfo getOfflinePushInfo() {
        return this.offlinePushInfo;
    }

    public final int getProgress() {
        return this.progress;
    }

    @Nullable
    public final ReplyMessageInfo getQuoteMessageInfo() {
        return this.quoteMessageInfo;
    }

    @Nullable
    public final V2TIMMessage getRawMessage() {
        return this.rawMessage;
    }

    @NotNull
    public final List<MessageReaction> getReactionList() {
        return this.reactionList;
    }

    @Nullable
    public final MessageReceipt getReceipt() {
        return this.receipt;
    }

    @Nullable
    public final String getReceiver() {
        return this.receiver;
    }

    public final int getRepliedMessageCount() {
        return this.repliedMessageCount;
    }

    @Nullable
    public final ReplyMessageInfo getReplyMessageInfo() {
        return this.replyMessageInfo;
    }

    @NotNull
    public final MessageSenderInfo getSender() {
        return this.sender;
    }

    @NotNull
    public final MessageStatus getStatus() {
        return this.status;
    }

    public final boolean getSupportExtension() {
        return this.supportExtension;
    }

    @Nullable
    public final Long getTimestamp() {
        return this.timestamp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r0v28, types: [int] */
    /* JADX WARN: Type inference failed for: r0v32, types: [int] */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r3v17, types: [int] */
    /* JADX WARN: Type inference failed for: r3v23, types: [int] */
    /* JADX WARN: Type inference failed for: r3v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public int hashCode() {
        String str = this.msgID;
        int iHashCode = (this.sender.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        boolean z11 = this.isSelf;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (iHashCode + r11) * 31;
        String str2 = this.receiver;
        int iHashCode2 = (i11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.groupID;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l11 = this.timestamp;
        int iHashCode4 = (this.atUserList.hashCode() + AbstractC39396a.m88225a(this.progress, (this.status.hashCode() + ((iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31)) * 31, 31)) * 31;
        boolean z12 = this.isPinned;
        ?? r12 = z12;
        if (z12) {
            r12 = 1;
        }
        int iHashCode5 = (this.messageType.hashCode() + ((iHashCode4 + r12) * 31)) * 31;
        MessageBody messageBody = this.messageBody;
        int iHashCode6 = (iHashCode5 + (messageBody == null ? 0 : messageBody.hashCode())) * 31;
        boolean z13 = this.needReadReceipt;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        int i12 = (iHashCode6 + r13) * 31;
        MessageReceipt messageReceipt = this.receipt;
        int iHashCode7 = (i12 + (messageReceipt == null ? 0 : messageReceipt.hashCode())) * 31;
        boolean z14 = this.supportExtension;
        int iHashCode8 = (this.reactionList.hashCode() + ((this.extensionList.hashCode() + ((iHashCode7 + (z14 ? 1 : z14)) * 31)) * 31)) * 31;
        ReplyMessageInfo replyMessageInfo = this.replyMessageInfo;
        int iM88225a = AbstractC39396a.m88225a(this.repliedMessageCount, (iHashCode8 + (replyMessageInfo == null ? 0 : replyMessageInfo.hashCode())) * 31, 31);
        ReplyMessageInfo replyMessageInfo2 = this.quoteMessageInfo;
        int iHashCode9 = (iM88225a + (replyMessageInfo2 == null ? 0 : replyMessageInfo2.hashCode())) * 31;
        OfflinePushInfo offlinePushInfo = this.offlinePushInfo;
        int iHashCode10 = (iHashCode9 + (offlinePushInfo == null ? 0 : offlinePushInfo.hashCode())) * 31;
        V2TIMMessage v2TIMMessage = this.rawMessage;
        return iHashCode10 + (v2TIMMessage != null ? v2TIMMessage.hashCode() : 0);
    }

    public final boolean isPinned() {
        return this.isPinned;
    }

    public final boolean isSelf() {
        return this.isSelf;
    }

    public final void setAtUserList(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.atUserList = list;
    }

    public final void setExtensionList(@NotNull List<MessageExtension> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.extensionList = list;
    }

    public final void setGroupID(@Nullable String str) {
        this.groupID = str;
    }

    public final void setMessageBody(@Nullable MessageBody messageBody) {
        this.messageBody = messageBody;
    }

    public final void setMessageType(@NotNull MessageType messageType) {
        Intrinsics.checkNotNullParameter(messageType, "<set-?>");
        this.messageType = messageType;
    }

    public final void setMsgID(@Nullable String str) {
        this.msgID = str;
    }

    public final void setNeedReadReceipt(boolean z11) {
        this.needReadReceipt = z11;
    }

    public final void setOfflinePushInfo(@Nullable OfflinePushInfo offlinePushInfo) {
        this.offlinePushInfo = offlinePushInfo;
    }

    public final void setPinned(boolean z11) {
        this.isPinned = z11;
    }

    public final void setProgress(int i11) {
        this.progress = i11;
    }

    public final void setQuoteMessageInfo(@Nullable ReplyMessageInfo replyMessageInfo) {
        this.quoteMessageInfo = replyMessageInfo;
    }

    public final void setRawMessage(@Nullable V2TIMMessage v2TIMMessage) {
        this.rawMessage = v2TIMMessage;
    }

    public final void setReactionList(@NotNull List<MessageReaction> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.reactionList = list;
    }

    public final void setReceipt(@Nullable MessageReceipt messageReceipt) {
        this.receipt = messageReceipt;
    }

    public final void setReceiver(@Nullable String str) {
        this.receiver = str;
    }

    public final void setRepliedMessageCount(int i11) {
        this.repliedMessageCount = i11;
    }

    public final void setReplyMessageInfo(@Nullable ReplyMessageInfo replyMessageInfo) {
        this.replyMessageInfo = replyMessageInfo;
    }

    public final void setSelf(boolean z11) {
        this.isSelf = z11;
    }

    public final void setSender(@NotNull MessageSenderInfo messageSenderInfo) {
        Intrinsics.checkNotNullParameter(messageSenderInfo, "<set-?>");
        this.sender = messageSenderInfo;
    }

    public final void setStatus(@NotNull MessageStatus messageStatus) {
        Intrinsics.checkNotNullParameter(messageStatus, "<set-?>");
        this.status = messageStatus;
    }

    public final void setSupportExtension(boolean z11) {
        this.supportExtension = z11;
    }

    public final void setTimestamp(@Nullable Long l11) {
        this.timestamp = l11;
    }

    @NotNull
    public String toString() {
        return "MessageInfo(msgID=" + this.msgID + ", sender=" + this.sender + ", isSelf=" + this.isSelf + ", receiver=" + this.receiver + ", groupID=" + this.groupID + ", timestamp=" + this.timestamp + ", status=" + this.status + ", progress=" + this.progress + ", atUserList=" + this.atUserList + ", isPinned=" + this.isPinned + ", messageType=" + this.messageType + ", messageBody=" + this.messageBody + ", needReadReceipt=" + this.needReadReceipt + ", receipt=" + this.receipt + ", supportExtension=" + this.supportExtension + ", extensionList=" + this.extensionList + ", reactionList=" + this.reactionList + ", replyMessageInfo=" + this.replyMessageInfo + ", repliedMessageCount=" + this.repliedMessageCount + ", quoteMessageInfo=" + this.quoteMessageInfo + ", offlinePushInfo=" + this.offlinePushInfo + ", rawMessage=" + this.rawMessage + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.msgID);
        this.sender.writeToParcel(parcel, flags);
        parcel.writeInt(this.isSelf ? 1 : 0);
        parcel.writeString(this.receiver);
        parcel.writeString(this.groupID);
        Long l11 = this.timestamp;
        if (l11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l11.longValue());
        }
        parcel.writeString(this.status.name());
        parcel.writeInt(this.progress);
        parcel.writeStringList(this.atUserList);
        parcel.writeInt(this.isPinned ? 1 : 0);
        parcel.writeString(this.messageType.name());
        MessageBody messageBody = this.messageBody;
        if (messageBody == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messageBody.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.needReadReceipt ? 1 : 0);
        MessageReceipt messageReceipt = this.receipt;
        if (messageReceipt == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messageReceipt.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.supportExtension ? 1 : 0);
        List<MessageExtension> list = this.extensionList;
        parcel.writeInt(list.size());
        Iterator<MessageExtension> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
        List<MessageReaction> list2 = this.reactionList;
        parcel.writeInt(list2.size());
        Iterator<MessageReaction> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, flags);
        }
        ReplyMessageInfo replyMessageInfo = this.replyMessageInfo;
        if (replyMessageInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            replyMessageInfo.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.repliedMessageCount);
        ReplyMessageInfo replyMessageInfo2 = this.quoteMessageInfo;
        if (replyMessageInfo2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            replyMessageInfo2.writeToParcel(parcel, flags);
        }
        OfflinePushInfo offlinePushInfo = this.offlinePushInfo;
        if (offlinePushInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            offlinePushInfo.writeToParcel(parcel, flags);
        }
        parcel.writeSerializable(this.rawMessage);
    }

    public /* synthetic */ MessageInfo(String str, MessageSenderInfo messageSenderInfo, boolean z11, String str2, String str3, Long l11, MessageStatus messageStatus, int i11, List list, boolean z12, MessageType messageType, MessageBody messageBody, boolean z13, MessageReceipt messageReceipt, boolean z14, List list2, List list3, ReplyMessageInfo replyMessageInfo, int i12, ReplyMessageInfo replyMessageInfo2, OfflinePushInfo offlinePushInfo, V2TIMMessage v2TIMMessage, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? new MessageSenderInfo(null, null, null, null, null, 31, null) : messageSenderInfo, (i13 & 4) != 0 ? false : z11, (i13 & 8) != 0 ? null : str2, (i13 & 16) != 0 ? null : str3, (i13 & 32) != 0 ? null : l11, (i13 & 64) != 0 ? MessageStatus.INIT : messageStatus, (i13 & 128) != 0 ? 0 : i11, (i13 & 256) != 0 ? CollectionsKt.emptyList() : list, (i13 & 512) != 0 ? false : z12, (i13 & 1024) != 0 ? MessageType.UNKNOWN : messageType, (i13 & 2048) != 0 ? null : messageBody, (i13 & 4096) != 0 ? false : z13, (i13 & 8192) != 0 ? null : messageReceipt, (i13 & 16384) != 0 ? false : z14, (i13 & 32768) != 0 ? CollectionsKt.emptyList() : list2, (i13 & 65536) != 0 ? CollectionsKt.emptyList() : list3, (i13 & 131072) != 0 ? null : replyMessageInfo, (i13 & 262144) != 0 ? 0 : i12, (i13 & 524288) != 0 ? null : replyMessageInfo2, (i13 & 1048576) != 0 ? null : offlinePushInfo, (i13 & 2097152) != 0 ? null : v2TIMMessage);
    }
}
