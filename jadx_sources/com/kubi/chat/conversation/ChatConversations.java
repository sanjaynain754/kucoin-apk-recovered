package com.kubi.chat.conversation;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p468nb.C42792a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatConversations.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\fR'\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/chat/conversation/ChatConversations;", "", "", "fromUserId", "<init>", "(Ljava/lang/String;)V", "toUserId", "Lnb/a;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)Lnb/a;", "Ljava/lang/String;", "getFromUserId", "()Ljava/lang/String;", "", "b", "Lkotlin/Lazy;", "()Ljava/util/Map;", "conversations", "ImSDK_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class ChatConversations {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String fromUserId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Lazy conversations;

    public ChatConversations(@NotNull String fromUserId) {
        Intrinsics.checkNotNullParameter(fromUserId, "fromUserId");
        this.fromUserId = fromUserId;
        this.conversations = LazyKt.lazy(new Function0<Map<String, C42792a>>() { // from class: com.kubi.chat.conversation.ChatConversations$conversations$2
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final Map<String, C42792a> invoke() {
                return new LinkedHashMap();
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final C42792a m20296a(@NotNull String toUserId) {
        Intrinsics.checkNotNullParameter(toUserId, "toUserId");
        C42792a c42792a = m20297b().get(toUserId);
        if (c42792a != null) {
            return c42792a;
        }
        C42792a c42792a2 = new C42792a(this.fromUserId, toUserId);
        m20297b().put(toUserId, c42792a2);
        return c42792a2;
    }

    /* JADX INFO: renamed from: b */
    public final Map<String, C42792a> m20297b() {
        return (Map) this.conversations.getValue();
    }
}
