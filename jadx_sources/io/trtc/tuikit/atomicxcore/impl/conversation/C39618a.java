package io.trtc.tuikit.atomicxcore.impl.conversation;

import io.trtc.tuikit.atomicxcore.api.conversation.ConversationInfo;
import java.util.Comparator;
import p852kotlin.comparisons.ComparisonsKt;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.conversation.a */
/* JADX INFO: loaded from: classes61.dex */
public final class C39618a implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.compareValues(Long.valueOf(((ConversationInfo) obj2).getOrderKey()), Long.valueOf(((ConversationInfo) obj).getOrderKey()));
    }
}
