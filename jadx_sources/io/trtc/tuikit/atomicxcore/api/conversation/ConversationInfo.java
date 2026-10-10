package io.trtc.tuikit.atomicxcore.api.conversation;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.imsdk.p128v2.V2TIMConversation;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.call.AbstractC39396a;
import io.trtc.tuikit.atomicxcore.api.contact.GroupType;
import io.trtc.tuikit.atomicxcore.api.contact.ReceiveMessageOpt;
import io.trtc.tuikit.atomicxcore.api.message.MessageInfo;
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
@Metadata(m90083d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b6\b\u0087\b\u0018\u00002\u00020\u0001BÇ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0016\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010!J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010!J\u0012\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010!J\u0010\u0010+\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b1\u0010,J\u0010\u00102\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b2\u00103J\u0018\u00104\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b4\u00105J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016HÆ\u0003¢\u0006\u0004\b6\u00105J\u0016\u00107\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0016HÆ\u0003¢\u0006\u0004\b7\u00105J\u0012\u0010:\u001a\u0004\u0018\u00010\u001cHÀ\u0003¢\u0006\u0004\b8\u00109JÒ\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00162\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÆ\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b=\u0010!J\u0010\u0010>\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b>\u0010.J\u001a\u0010A\u001a\u00020\u00112\b\u0010@\u001a\u0004\u0018\u00010?HÖ\u0003¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\bC\u0010.J \u0010H\u001a\u00020G2\u0006\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\bH\u0010IR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010J\u001a\u0004\bK\u0010!\"\u0004\bL\u0010MR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010N\u001a\u0004\bO\u0010#\"\u0004\bP\u0010QR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010R\u001a\u0004\bS\u0010%\"\u0004\bT\u0010UR$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010J\u001a\u0004\bV\u0010!\"\u0004\bW\u0010MR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010J\u001a\u0004\bX\u0010!\"\u0004\bY\u0010MR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010Z\u001a\u0004\b[\u0010)\"\u0004\b\\\u0010]R$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010J\u001a\u0004\b^\u0010!\"\u0004\b_\u0010MR\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010`\u001a\u0004\ba\u0010,\"\u0004\bb\u0010cR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010d\u001a\u0004\be\u0010.\"\u0004\bf\u0010gR\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010h\u001a\u0004\b\u0012\u00100\"\u0004\bi\u0010jR\"\u0010\u0013\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010`\u001a\u0004\bk\u0010,\"\u0004\bl\u0010cR\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010m\u001a\u0004\bn\u00103\"\u0004\bo\u0010pR*\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010q\u001a\u0004\br\u00105\"\u0004\bs\u0010tR(\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010q\u001a\u0004\bu\u00105\"\u0004\bv\u0010tR(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010q\u001a\u0004\bw\u00105\"\u0004\bx\u0010tR$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010y\u001a\u0004\bz\u00109\"\u0004\b{\u0010|¨\u0006}"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;", "Landroid/os/Parcelable;", "", "conversationID", "Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationType;", "type", "Lio/trtc/tuikit/atomicxcore/api/contact/GroupType;", TUIConstants.TUIChat.GROUP_TYPE, "avatarURL", "title", "Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;", "lastMessage", "draft", "", "timestamp", "", "unreadCount", "", "isPinned", "orderKey", "Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt;", TUIConstants.TUIChat.RECEIVE_OPTION, "", "Lio/trtc/tuikit/atomicxcore/api/conversation/GroupAtInfo;", "groupAtInfoList", "conversationGroupList", "Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationMarkType;", "markList", "Lcom/tencent/imsdk/v2/V2TIMConversation;", "rawConversation", "<init>", "(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationType;Lio/trtc/tuikit/atomicxcore/api/contact/GroupType;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;Ljava/lang/String;JIZJLio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/tencent/imsdk/v2/V2TIMConversation;)V", "component1", "()Ljava/lang/String;", "component2", "()Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationType;", "component3", "()Lio/trtc/tuikit/atomicxcore/api/contact/GroupType;", "component4", "component5", "component6", "()Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;", "component7", "component8", "()J", "component9", "()I", "component10", "()Z", "component11", "component12", "()Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt;", "component13", "()Ljava/util/List;", "component14", "component15", "component16$atomicxcore_release", "()Lcom/tencent/imsdk/v2/V2TIMConversation;", "component16", "copy", "(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationType;Lio/trtc/tuikit/atomicxcore/api/contact/GroupType;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;Ljava/lang/String;JIZJLio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/tencent/imsdk/v2/V2TIMConversation;)Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getConversationID", "setConversationID", "(Ljava/lang/String;)V", "Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationType;", "getType", "setType", "(Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationType;)V", "Lio/trtc/tuikit/atomicxcore/api/contact/GroupType;", "getGroupType", "setGroupType", "(Lio/trtc/tuikit/atomicxcore/api/contact/GroupType;)V", "getAvatarURL", "setAvatarURL", "getTitle", "setTitle", "Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;", "getLastMessage", "setLastMessage", "(Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;)V", "getDraft", "setDraft", "J", "getTimestamp", "setTimestamp", "(J)V", "I", "getUnreadCount", "setUnreadCount", "(I)V", "Z", "setPinned", "(Z)V", "getOrderKey", "setOrderKey", "Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt;", "getReceiveOption", "setReceiveOption", "(Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt;)V", "Ljava/util/List;", "getGroupAtInfoList", "setGroupAtInfoList", "(Ljava/util/List;)V", "getConversationGroupList", "setConversationGroupList", "getMarkList", "setMarkList", "Lcom/tencent/imsdk/v2/V2TIMConversation;", "getRawConversation$atomicxcore_release", "setRawConversation$atomicxcore_release", "(Lcom/tencent/imsdk/v2/V2TIMConversation;)V", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class ConversationInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ConversationInfo> CREATOR = new Creator();

    @Nullable
    private String avatarURL;

    @NotNull
    private List<String> conversationGroupList;

    @NotNull
    private String conversationID;

    @Nullable
    private String draft;

    @Nullable
    private List<GroupAtInfo> groupAtInfoList;

    @Nullable
    private GroupType groupType;
    private boolean isPinned;

    @Nullable
    private MessageInfo lastMessage;

    @NotNull
    private List<? extends ConversationMarkType> markList;
    private long orderKey;

    @Nullable
    private V2TIMConversation rawConversation;

    @NotNull
    private ReceiveMessageOpt receiveOption;
    private long timestamp;

    @Nullable
    private String title;

    @Nullable
    private ConversationType type;
    private int unreadCount;

    @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<ConversationInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ConversationInfo createFromParcel(@NotNull Parcel parcel) {
            boolean z11;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            ArrayList arrayList = null;
            ConversationType conversationTypeValueOf = parcel.readInt() == 0 ? null : ConversationType.valueOf(parcel.readString());
            GroupType groupTypeValueOf = parcel.readInt() == 0 ? null : GroupType.valueOf(parcel.readString());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            MessageInfo messageInfoCreateFromParcel = parcel.readInt() == 0 ? null : MessageInfo.CREATOR.createFromParcel(parcel);
            String string4 = parcel.readString();
            long j11 = parcel.readLong();
            int i11 = parcel.readInt();
            boolean z12 = parcel.readInt() != 0;
            long j12 = parcel.readLong();
            ReceiveMessageOpt receiveMessageOptValueOf = ReceiveMessageOpt.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                z11 = z12;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                boolean z13 = z12;
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList2.add(GroupAtInfo.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
                z11 = z13;
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i14 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i14);
            ArrayList arrayList4 = arrayList;
            int i15 = 0;
            while (i15 != i14) {
                arrayList3.add(ConversationMarkType.valueOf(parcel.readString()));
                i15++;
                i14 = i14;
            }
            return new ConversationInfo(string, conversationTypeValueOf, groupTypeValueOf, string2, string3, messageInfoCreateFromParcel, string4, j11, i11, z11, j12, receiveMessageOptValueOf, arrayList4, arrayListCreateStringArrayList, arrayList3, (V2TIMConversation) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ConversationInfo[] newArray(int i11) {
            return new ConversationInfo[i11];
        }
    }

    public ConversationInfo(@NotNull String conversationID, @Nullable ConversationType conversationType, @Nullable GroupType groupType, @Nullable String str, @Nullable String str2, @Nullable MessageInfo messageInfo, @Nullable String str3, long j11, int i11, boolean z11, long j12, @NotNull ReceiveMessageOpt receiveOption, @Nullable List<GroupAtInfo> list, @NotNull List<String> conversationGroupList, @NotNull List<? extends ConversationMarkType> markList, @Nullable V2TIMConversation v2TIMConversation) {
        Intrinsics.checkNotNullParameter(conversationID, "conversationID");
        Intrinsics.checkNotNullParameter(receiveOption, "receiveOption");
        Intrinsics.checkNotNullParameter(conversationGroupList, "conversationGroupList");
        Intrinsics.checkNotNullParameter(markList, "markList");
        this.conversationID = conversationID;
        this.type = conversationType;
        this.groupType = groupType;
        this.avatarURL = str;
        this.title = str2;
        this.lastMessage = messageInfo;
        this.draft = str3;
        this.timestamp = j11;
        this.unreadCount = i11;
        this.isPinned = z11;
        this.orderKey = j12;
        this.receiveOption = receiveOption;
        this.groupAtInfoList = list;
        this.conversationGroupList = conversationGroupList;
        this.markList = markList;
        this.rawConversation = v2TIMConversation;
    }

    @NotNull
    public final ConversationInfo copy(@NotNull String conversationID, @Nullable ConversationType type, @Nullable GroupType groupType, @Nullable String avatarURL, @Nullable String title, @Nullable MessageInfo lastMessage, @Nullable String draft, long timestamp, int unreadCount, boolean isPinned, long orderKey, @NotNull ReceiveMessageOpt receiveOption, @Nullable List<GroupAtInfo> groupAtInfoList, @NotNull List<String> conversationGroupList, @NotNull List<? extends ConversationMarkType> markList, @Nullable V2TIMConversation rawConversation) {
        Intrinsics.checkNotNullParameter(conversationID, "conversationID");
        Intrinsics.checkNotNullParameter(receiveOption, "receiveOption");
        Intrinsics.checkNotNullParameter(conversationGroupList, "conversationGroupList");
        Intrinsics.checkNotNullParameter(markList, "markList");
        return new ConversationInfo(conversationID, type, groupType, avatarURL, title, lastMessage, draft, timestamp, unreadCount, isPinned, orderKey, receiveOption, groupAtInfoList, conversationGroupList, markList, rawConversation);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationInfo)) {
            return false;
        }
        ConversationInfo conversationInfo = (ConversationInfo) other;
        return Intrinsics.areEqual(this.conversationID, conversationInfo.conversationID) && this.type == conversationInfo.type && this.groupType == conversationInfo.groupType && Intrinsics.areEqual(this.avatarURL, conversationInfo.avatarURL) && Intrinsics.areEqual(this.title, conversationInfo.title) && Intrinsics.areEqual(this.lastMessage, conversationInfo.lastMessage) && Intrinsics.areEqual(this.draft, conversationInfo.draft) && this.timestamp == conversationInfo.timestamp && this.unreadCount == conversationInfo.unreadCount && this.isPinned == conversationInfo.isPinned && this.orderKey == conversationInfo.orderKey && this.receiveOption == conversationInfo.receiveOption && Intrinsics.areEqual(this.groupAtInfoList, conversationInfo.groupAtInfoList) && Intrinsics.areEqual(this.conversationGroupList, conversationInfo.conversationGroupList) && Intrinsics.areEqual(this.markList, conversationInfo.markList) && Intrinsics.areEqual(this.rawConversation, conversationInfo.rawConversation);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getConversationID() {
        return this.conversationID;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIsPinned() {
        return this.isPinned;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getOrderKey() {
        return this.orderKey;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final ReceiveMessageOpt getReceiveOption() {
        return this.receiveOption;
    }

    @Nullable
    public final List<GroupAtInfo> component13() {
        return this.groupAtInfoList;
    }

    @NotNull
    public final List<String> component14() {
        return this.conversationGroupList;
    }

    @NotNull
    public final List<ConversationMarkType> component15() {
        return this.markList;
    }

    @Nullable
    /* JADX INFO: renamed from: component16$atomicxcore_release, reason: from getter */
    public final V2TIMConversation getRawConversation() {
        return this.rawConversation;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ConversationType getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final GroupType getGroupType() {
        return this.groupType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAvatarURL() {
        return this.avatarURL;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final MessageInfo getLastMessage() {
        return this.lastMessage;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDraft() {
        return this.draft;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getUnreadCount() {
        return this.unreadCount;
    }

    @Nullable
    public final String getAvatarURL() {
        return this.avatarURL;
    }

    @NotNull
    public final List<String> getConversationGroupList() {
        return this.conversationGroupList;
    }

    @NotNull
    public final String getConversationID() {
        return this.conversationID;
    }

    @Nullable
    public final String getDraft() {
        return this.draft;
    }

    @Nullable
    public final List<GroupAtInfo> getGroupAtInfoList() {
        return this.groupAtInfoList;
    }

    @Nullable
    public final GroupType getGroupType() {
        return this.groupType;
    }

    @Nullable
    public final MessageInfo getLastMessage() {
        return this.lastMessage;
    }

    @NotNull
    public final List<ConversationMarkType> getMarkList() {
        return this.markList;
    }

    public final long getOrderKey() {
        return this.orderKey;
    }

    @Nullable
    public final V2TIMConversation getRawConversation$atomicxcore_release() {
        return this.rawConversation;
    }

    @NotNull
    public final ReceiveMessageOpt getReceiveOption() {
        return this.receiveOption;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final ConversationType getType() {
        return this.type;
    }

    public final int getUnreadCount() {
        return this.unreadCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v22, types: [int] */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v41 */
    public int hashCode() {
        int iHashCode = this.conversationID.hashCode() * 31;
        ConversationType conversationType = this.type;
        int iHashCode2 = (iHashCode + (conversationType == null ? 0 : conversationType.hashCode())) * 31;
        GroupType groupType = this.groupType;
        int iHashCode3 = (iHashCode2 + (groupType == null ? 0 : groupType.hashCode())) * 31;
        String str = this.avatarURL;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        MessageInfo messageInfo = this.lastMessage;
        int iHashCode6 = (iHashCode5 + (messageInfo == null ? 0 : messageInfo.hashCode())) * 31;
        String str3 = this.draft;
        int iM88225a = AbstractC39396a.m88225a(this.unreadCount, (Long.hashCode(this.timestamp) + ((iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31, 31);
        boolean z11 = this.isPinned;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int iHashCode7 = (this.receiveOption.hashCode() + ((Long.hashCode(this.orderKey) + ((iM88225a + r11) * 31)) * 31)) * 31;
        List<GroupAtInfo> list = this.groupAtInfoList;
        int iHashCode8 = (this.markList.hashCode() + ((this.conversationGroupList.hashCode() + ((iHashCode7 + (list == null ? 0 : list.hashCode())) * 31)) * 31)) * 31;
        V2TIMConversation v2TIMConversation = this.rawConversation;
        return iHashCode8 + (v2TIMConversation != null ? v2TIMConversation.hashCode() : 0);
    }

    public final boolean isPinned() {
        return this.isPinned;
    }

    public final void setAvatarURL(@Nullable String str) {
        this.avatarURL = str;
    }

    public final void setConversationGroupList(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.conversationGroupList = list;
    }

    public final void setConversationID(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.conversationID = str;
    }

    public final void setDraft(@Nullable String str) {
        this.draft = str;
    }

    public final void setGroupAtInfoList(@Nullable List<GroupAtInfo> list) {
        this.groupAtInfoList = list;
    }

    public final void setGroupType(@Nullable GroupType groupType) {
        this.groupType = groupType;
    }

    public final void setLastMessage(@Nullable MessageInfo messageInfo) {
        this.lastMessage = messageInfo;
    }

    public final void setMarkList(@NotNull List<? extends ConversationMarkType> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.markList = list;
    }

    public final void setOrderKey(long j11) {
        this.orderKey = j11;
    }

    public final void setPinned(boolean z11) {
        this.isPinned = z11;
    }

    public final void setRawConversation$atomicxcore_release(@Nullable V2TIMConversation v2TIMConversation) {
        this.rawConversation = v2TIMConversation;
    }

    public final void setReceiveOption(@NotNull ReceiveMessageOpt receiveMessageOpt) {
        Intrinsics.checkNotNullParameter(receiveMessageOpt, "<set-?>");
        this.receiveOption = receiveMessageOpt;
    }

    public final void setTimestamp(long j11) {
        this.timestamp = j11;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setType(@Nullable ConversationType conversationType) {
        this.type = conversationType;
    }

    public final void setUnreadCount(int i11) {
        this.unreadCount = i11;
    }

    @NotNull
    public String toString() {
        return "ConversationInfo(conversationID=" + this.conversationID + ", type=" + this.type + ", groupType=" + this.groupType + ", avatarURL=" + this.avatarURL + ", title=" + this.title + ", lastMessage=" + this.lastMessage + ", draft=" + this.draft + ", timestamp=" + this.timestamp + ", unreadCount=" + this.unreadCount + ", isPinned=" + this.isPinned + ", orderKey=" + this.orderKey + ", receiveOption=" + this.receiveOption + ", groupAtInfoList=" + this.groupAtInfoList + ", conversationGroupList=" + this.conversationGroupList + ", markList=" + this.markList + ", rawConversation=" + this.rawConversation + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.conversationID);
        ConversationType conversationType = this.type;
        if (conversationType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(conversationType.name());
        }
        GroupType groupType = this.groupType;
        if (groupType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(groupType.name());
        }
        parcel.writeString(this.avatarURL);
        parcel.writeString(this.title);
        MessageInfo messageInfo = this.lastMessage;
        if (messageInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messageInfo.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.draft);
        parcel.writeLong(this.timestamp);
        parcel.writeInt(this.unreadCount);
        parcel.writeInt(this.isPinned ? 1 : 0);
        parcel.writeLong(this.orderKey);
        parcel.writeString(this.receiveOption.name());
        List<GroupAtInfo> list = this.groupAtInfoList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<GroupAtInfo> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, flags);
            }
        }
        parcel.writeStringList(this.conversationGroupList);
        List<? extends ConversationMarkType> list2 = this.markList;
        parcel.writeInt(list2.size());
        Iterator<? extends ConversationMarkType> it2 = list2.iterator();
        while (it2.hasNext()) {
            parcel.writeString(it2.next().name());
        }
        parcel.writeSerializable(this.rawConversation);
    }

    public /* synthetic */ ConversationInfo(String str, ConversationType conversationType, GroupType groupType, String str2, String str3, MessageInfo messageInfo, String str4, long j11, int i11, boolean z11, long j12, ReceiveMessageOpt receiveMessageOpt, List list, List list2, List list3, V2TIMConversation v2TIMConversation, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i12 & 2) != 0 ? null : conversationType, (i12 & 4) != 0 ? null : groupType, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? null : str3, (i12 & 32) != 0 ? null : messageInfo, (i12 & 64) != 0 ? null : str4, (i12 & 128) != 0 ? 0L : j11, (i12 & 256) != 0 ? 0 : i11, (i12 & 512) == 0 ? z11 : false, (i12 & 1024) == 0 ? j12 : 0L, (i12 & 2048) != 0 ? ReceiveMessageOpt.RECEIVE : receiveMessageOpt, (i12 & 4096) != 0 ? null : list, (i12 & 8192) != 0 ? CollectionsKt.emptyList() : list2, (i12 & 16384) != 0 ? CollectionsKt.emptyList() : list3, (i12 & 32768) != 0 ? null : v2TIMConversation);
    }
}
