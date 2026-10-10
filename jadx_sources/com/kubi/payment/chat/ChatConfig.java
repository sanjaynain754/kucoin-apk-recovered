package com.kubi.payment.chat;

import org.jetbrains.annotations.NotNull;
import p638tb.InterfaceC44915b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.payment.chat.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ChatConfig.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/payment/chat/ChatConfig;", "Lcom/kubi/chat/service/IChatConfig;", "chatUidData", "", "<init>", "(Ljava/lang/String;)V", "getContext", "Landroid/content/Context;", "getChatUid", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ChatConfig implements InterfaceC44915b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f38410a;

    public ChatConfig(@NotNull String chatUidData) {
        Intrinsics.checkNotNullParameter(chatUidData, "chatUidData");
        this.f38410a = chatUidData;
    }

    @Override // p638tb.InterfaceC44915b
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public String getF38410a() {
        return this.f38410a;
    }
}
