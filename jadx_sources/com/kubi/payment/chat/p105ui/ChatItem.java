package com.kubi.payment.chat.p105ui;

import com.kubi.chat.entity.ChatMessage;
import com.kubi.chat.entity.MsgTypeEnum;
import com.kubi.utils.TimeUtils;
import com.kubi.utils.extensions.C27041f;
import io.chad.library.adapter.base.entity.MultiItemEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatItem.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0006\u0010\t\u001a\u00020\u0003J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/payment/chat/ui/ChatItem;", "Lio/chad/library/adapter/base/entity/MultiItemEntity;", "msg", "Lcom/kubi/chat/entity/ChatMessage;", "<init>", "(Lcom/kubi/chat/entity/ChatMessage;)V", "itemChatType", "", "getItemType", "getMsg", "getTimeRecord", "", "equals", "", "other", "", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ChatItem implements MultiItemEntity {

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Companion f38446d = new Companion(null);

    /* JADX INFO: renamed from: e */
    @Nullable
    public static String f38447e = "";

    /* JADX INFO: renamed from: f */
    @Nullable
    public static String f38448f = "";

    /* JADX INFO: renamed from: b */
    @NotNull
    public final ChatMessage f38449b;

    /* JADX INFO: renamed from: c */
    public int f38450c;

    /* JADX INFO: compiled from: ChatItem.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/payment/chat/ui/ChatItem$Companion;", "", "<init>", "()V", "ITEM_LEFT_TEXT", "", "ITEM_RIGHT_TEXT", "ITEM_LEFT_IMAGE", "ITEM_RIGHT_IMAGE", "ITEM_NONE", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "uid", "getUid", "setUid", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @Nullable
        public final String getId() {
            return ChatItem.f38447e;
        }

        @Nullable
        public final String getUid() {
            return ChatItem.f38448f;
        }

        public final void setId(@Nullable String str) {
            ChatItem.f38447e = str;
        }

        public final void setUid(@Nullable String str) {
            ChatItem.f38448f = str;
        }
    }

    public ChatItem(@NotNull ChatMessage msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.f38449b = msg;
        int i11 = 0;
        if (Intrinsics.areEqual(f38447e, msg.getMetadata().get("oId"))) {
            boolean zIsOutDirect = msg.isOutDirect(C27041f.m66668h(f38448f));
            boolean z11 = msg.getMsgType() == MsgTypeEnum.IMAGE;
            boolean z12 = msg.getMsgType() == MsgTypeEnum.TEXT;
            if (zIsOutDirect) {
                if (z11) {
                    i11 = 202;
                } else if (z12) {
                    i11 = 102;
                }
            } else if (z11) {
                i11 = 201;
            } else if (z12) {
                i11 = 101;
            }
        }
        this.f38450c = i11;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final ChatMessage getF38449b() {
        return this.f38449b;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.areEqual(ChatItem.class, other.getClass())) {
            return false;
        }
        return ((ChatItem) other).getF38449b().isTheSame(this.f38449b);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final String m46206f() {
        String strM66418e = TimeUtils.m66418e(this.f38449b.getTimestamp());
        Intrinsics.checkNotNullExpressionValue(strM66418e, "getIMTime(...)");
        return strM66418e;
    }

    @Override // io.chad.library.adapter.base.entity.MultiItemEntity
    /* JADX INFO: renamed from: getItemType, reason: from getter */
    public int getF38450c() {
        return this.f38450c;
    }
}
