package p494ob;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.chat.entity.ChatMessage;
import com.kubi.chat.service.ChatClient;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ob.b */
/* JADX INFO: compiled from: InstrumentBuilder.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/chat/entity/ChatMessage;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/chat/entity/ChatMessage;)V", "ImSDK_release"}, m90085k = 2, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class C43007b {
    /* JADX INFO: renamed from: a */
    public static final void m94445a(@NotNull ChatMessage chatMessage) {
        Intrinsics.checkNotNullParameter(chatMessage, "<this>");
        ChatClient chatClient = ChatClient.INSTANCE.get();
        if (chatClient == null) {
            return;
        }
        chatClient.m20396k(chatMessage);
    }
}
