package com.kubi.home.message.card;

import com.kubi.mvi.state.InterfaceC19282d;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MessageBoxContract.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/home/message/card/MessageBoxContract$MessageBoxIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "ClickMessageIntent", "GetMessageDataIntent", "DeleteCardIntent", "Lcom/kubi/home/message/card/MessageBoxContract$MessageBoxIntent$ClickMessageIntent;", "Lcom/kubi/home/message/card/MessageBoxContract$MessageBoxIntent$DeleteCardIntent;", "Lcom/kubi/home/message/card/MessageBoxContract$MessageBoxIntent$GetMessageDataIntent;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class MessageBoxContract$MessageBoxIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: MessageBoxContract.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/home/message/card/MessageBoxContract$MessageBoxIntent$ClickMessageIntent;", "Lcom/kubi/home/message/card/MessageBoxContract$MessageBoxIntent;", "box", "Lcom/kubi/home/message/card/MessageBox;", "<init>", "(Lcom/kubi/home/message/card/MessageBox;)V", "getBox", "()Lcom/kubi/home/message/card/MessageBox;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class ClickMessageIntent extends MessageBoxContract$MessageBoxIntent {

        @NotNull
        private final MessageBox box;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClickMessageIntent(@NotNull MessageBox box) {
            super(null);
            Intrinsics.checkNotNullParameter(box, "box");
            this.box = box;
        }

        @NotNull
        public final MessageBox getBox() {
            return this.box;
        }
    }

    /* JADX INFO: compiled from: MessageBoxContract.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/home/message/card/MessageBoxContract$MessageBoxIntent$DeleteCardIntent;", "Lcom/kubi/home/message/card/MessageBoxContract$MessageBoxIntent;", "<init>", "()V", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class DeleteCardIntent extends MessageBoxContract$MessageBoxIntent {

        @NotNull
        public static final DeleteCardIntent INSTANCE = new DeleteCardIntent();

        private DeleteCardIntent() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: MessageBoxContract.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/home/message/card/MessageBoxContract$MessageBoxIntent$GetMessageDataIntent;", "Lcom/kubi/home/message/card/MessageBoxContract$MessageBoxIntent;", "data", "", "Lcom/kubi/home/message/card/MessageBox;", "<init>", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class GetMessageDataIntent extends MessageBoxContract$MessageBoxIntent {

        @NotNull
        private final List<MessageBox> data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetMessageDataIntent(@NotNull List<MessageBox> data) {
            super(null);
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }

        @NotNull
        public final List<MessageBox> getData() {
            return this.data;
        }
    }

    public /* synthetic */ MessageBoxContract$MessageBoxIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private MessageBoxContract$MessageBoxIntent() {
    }
}
