package io.trtc.tuikit.atomicxcore.api.conversation;

import com.tencent.imsdk.p128v2.V2TIMConversation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\t\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationMarkType;", "", "value", "", "(Ljava/lang/String;IJ)V", "getValue", "()J", "STAR", "UNREAD", "FOLD", "HIDE", "Companion", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public enum ConversationMarkType {
    STAR(V2TIMConversation.V2TIM_CONVERSATION_MARK_TYPE_STAR),
    UNREAD(V2TIMConversation.V2TIM_CONVERSATION_MARK_TYPE_UNREAD),
    FOLD(V2TIMConversation.V2TIM_CONVERSATION_MARK_TYPE_FOLD),
    HIDE(V2TIMConversation.V2TIM_CONVERSATION_MARK_TYPE_HIDE);

    private final long value;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0007¨\u0006\b"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationMarkType$Companion;", "", "()V", "parseList", "", "Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationMarkType;", "sdkMarkList", "", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final List<ConversationMarkType> parseList(@NotNull List<Long> sdkMarkList) {
            Intrinsics.checkNotNullParameter(sdkMarkList, "sdkMarkList");
            ArrayList arrayList = new ArrayList();
            Iterator<Long> it = sdkMarkList.iterator();
            while (it.hasNext()) {
                long jLongValue = it.next().longValue();
                ConversationMarkType conversationMarkType = ConversationMarkType.STAR;
                if (jLongValue == conversationMarkType.getValue()) {
                    arrayList.add(conversationMarkType);
                } else {
                    ConversationMarkType conversationMarkType2 = ConversationMarkType.UNREAD;
                    if (jLongValue == conversationMarkType2.getValue()) {
                        arrayList.add(conversationMarkType2);
                    } else {
                        ConversationMarkType conversationMarkType3 = ConversationMarkType.FOLD;
                        if (jLongValue == conversationMarkType3.getValue()) {
                            arrayList.add(conversationMarkType3);
                        } else {
                            ConversationMarkType conversationMarkType4 = ConversationMarkType.HIDE;
                            if (jLongValue == conversationMarkType4.getValue()) {
                                arrayList.add(conversationMarkType4);
                            }
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    @NotNull
    public static EnumEntries<ConversationMarkType> getEntries() {
        return $ENTRIES;
    }

    @JvmStatic
    @NotNull
    public static final List<ConversationMarkType> parseList(@NotNull List<Long> list) {
        return INSTANCE.parseList(list);
    }

    public final long getValue() {
        return this.value;
    }

    ConversationMarkType(long j11) {
        this.value = j11;
    }
}
