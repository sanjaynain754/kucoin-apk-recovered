package com.kubi.payment.chat.p105ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.chat.entity.MsgStatusEnum;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.payment.chat.entity.ChatInfo;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.utils.C27057k;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import io.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.io.File;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p445m2.AbstractC42397h;
import p445m2.InterfaceC42399j;
import p460n2.InterfaceC42704b;
import p468nb.C42792a;
import p572qt.C43873a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ChatAdapter.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001 B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0002H\u0014J\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0002H\u0002J\u0018\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0002H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002JB\u0010\u001a\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rJ\u0012\u0010\u001d\u001a\u00020\u000e2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u0010\u001f\u001a\u00020\u0017H\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, m90084d2 = {"Lcom/kubi/payment/chat/ui/ChatAdapter;", "Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;", "Lcom/kubi/payment/chat/ui/ChatItem;", "Lio/chad/library/adapter/base/BaseViewHolder;", "data", "", "<init>", "(Ljava/util/List;)V", "info", "Lcom/kubi/payment/chat/entity/ChatInfo;", "conversation", "Lcom/kubi/chat/conversation/ChatConversation;", "sendTextListener", "Lkotlin/Function1;", "", "", "sendImageListener", "convert", "helper", "item", "setText", "setImage", "shouldShowTime", "", ViewProps.POSITION, "", "setInfo", "sendTextAction", "sendImageAction", "getHeadName", "name", "isActivityDestroyed", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nChatAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatAdapter.kt\ncom/kubi/payment/chat/ui/ChatAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,194:1\n1#2:195\n*E\n"})
public final class ChatAdapter extends BaseMultiItemQuickAdapter<ChatItem, BaseViewHolder> {

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final Companion f38420m = new Companion(null);

    /* JADX INFO: renamed from: i */
    @Nullable
    public ChatInfo f38421i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public C42792a f38422j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public Function1<? super String, Unit> f38423k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public Function1<? super String, Unit> f38424l;

    /* JADX INFO: compiled from: ChatAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/payment/chat/ui/ChatAdapter$Companion;", "", "<init>", "()V", "TIME_INTERVAL", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.chat.ui.ChatAdapter$a */
    /* JADX INFO: compiled from: ChatAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0010\u0010\u0006\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/payment/chat/ui/ChatAdapter$setImage$1", "Lcom/bumptech/glide/request/target/SimpleTarget;", "Ljava/io/File;", "onResourceReady", "", InterfaceC33617e1.f69660i, "transition", "Lcom/bumptech/glide/request/transition/Transition;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20415a extends AbstractC42397h<File> {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ImageView f38426f;

        public C20415a(ImageView imageView) {
            this.f38426f = imageView;
        }

        @Override // p445m2.InterfaceC42399j
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6639e(File resource, InterfaceC42704b<? super File> interfaceC42704b) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            if (ChatAdapter.this.m46094q()) {
                return;
            }
            C43873a c43873a = C43873a.f96960a;
            Context context = ((BaseQuickAdapter) ChatAdapter.this).mContext;
            Intrinsics.checkNotNullExpressionValue(context, "access$getMContext$p$s-1806934857(...)");
            String absolutePath = resource.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
            ImageView imageView = this.f38426f;
            Intrinsics.checkNotNull(imageView);
            c43873a.m96644a(context, absolutePath, imageView);
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.chat.ui.ChatAdapter$b */
    /* JADX INFO: compiled from: ChatAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0010\u0010\u0006\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/payment/chat/ui/ChatAdapter$setImage$2$1$1", "Lcom/bumptech/glide/request/target/SimpleTarget;", "Ljava/io/File;", "onResourceReady", "", InterfaceC33617e1.f69660i, "transition", "Lcom/bumptech/glide/request/transition/Transition;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20416b extends AbstractC42397h<File> {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ImageView f38428f;

        public C20416b(ImageView imageView) {
            this.f38428f = imageView;
        }

        @Override // p445m2.InterfaceC42399j
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6639e(File resource, InterfaceC42704b<? super File> interfaceC42704b) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            ComponentCallbacks2C5309c.m6556t(((BaseQuickAdapter) ChatAdapter.this).mContext).mo6631s(resource.getAbsoluteFile()).m6594E0(this.f38428f);
        }
    }

    /* JADX INFO: renamed from: p */
    public final String m46093p(String str) {
        String strM66675o;
        String upperCase = null;
        if (str != null && (strM66675o = C27041f.m66675o(str, 2, null, 2, null)) != null) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            upperCase = strM66675o.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        }
        return C27041f.m66668h(upperCase);
    }

    /* JADX INFO: renamed from: y */
    public final boolean m46098y(int i11) {
        if (i11 == 0) {
            return false;
        }
        return ((ChatItem) getData().get(i11)).getF38449b().getTimestamp() - ((ChatItem) getData().get(i11 + (-1))).getF38449b().getTimestamp() > 180000;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatAdapter(@NotNull List<ChatItem> data) {
        super(data);
        Intrinsics.checkNotNullParameter(data, "data");
        addItemType(101, R$layout.botc_item_chat_left_text);
        addItemType(102, R$layout.botc_item_chat_right_text);
        addItemType(201, R$layout.botc_item_chat_left_image);
        addItemType(202, R$layout.botc_item_chat_right_image);
        addItemType(0, R$layout.botc_item_chat_none);
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m46088s(final ChatAdapter chatAdapter, final ChatItem chatItem) {
        DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, R$layout.botc_dialog_image, 6, 0, 0, false, false, false, false, false, 508, null).m54237f4(new Function2() { // from class: com.kubi.payment.chat.ui.d
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ChatAdapter.m46089t(chatItem, chatAdapter, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
        Context context = chatAdapter.mContext;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        FragmentManager supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        dialogFragmentHelperM54237f4.show(supportFragmentManager, "ChatAdapter");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m46089t(ChatItem chatItem, ChatAdapter chatAdapter, BaseViewHolder viewHolder, final DialogFragmentHelper helper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(helper, "helper");
        ImageView imageView = (ImageView) viewHolder.getView(R$id.iv_image);
        if (chatItem.getF38449b().hasPicUrl()) {
            InterfaceC42399j interfaceC42399jM6591B0 = ComponentCallbacks2C5309c.m6556t(chatAdapter.mContext).mo6623k().mo6601L0(chatItem.getF38449b().getContent()).m6591B0(chatAdapter.new C20416b(imageView));
            Intrinsics.checkNotNull(interfaceC42399jM6591B0);
        } else {
            Intrinsics.checkNotNull(ComponentCallbacks2C5309c.m6556t(chatAdapter.mContext).mo6634v(chatItem.getF38449b().getContent()).m6594E0(imageView));
        }
        Intrinsics.checkNotNull(imageView);
        C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.payment.chat.ui.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChatAdapter.m46090u(helper);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull final BaseViewHolder helper, @NotNull final ChatItem item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        int f38450c = item.getF38450c();
        if (f38450c != 101) {
            if (f38450c != 102) {
                if (f38450c != 201) {
                    if (f38450c != 202) {
                        return;
                    }
                }
            }
            MsgStatusEnum status = item.getF38449b().getStatus();
            C42792a c42792a = this.f38422j;
            boolean zM66566d = C27025c.m66566d(c42792a != null ? Boolean.valueOf(item.getF38449b().isMsgRead(c42792a)) : null);
            int i11 = R$id.chat_right_tv_time;
            BaseViewHolder gone = helper.setText(i11, item.m46206f()).setGone(i11, m46098y(helper.getAdapterPosition())).setGone(R$id.chat_right_progressbar, status == MsgStatusEnum.SENDING);
            int i12 = R$id.chat_right_tv_error;
            BaseViewHolder gone2 = gone.setGone(i12, status == MsgStatusEnum.FAIL);
            int i13 = R$id.chat_right_tv_status;
            BaseViewHolder text = gone2.setGone(i13, status == MsgStatusEnum.DELIVERED || status == MsgStatusEnum.READED).setEnabled(i13, zM66566d).setText(i13, zM66566d ? "Read" : "Unread");
            int i14 = R$id.chat_right_tv_avatar;
            ChatInfo chatInfo = this.f38421i;
            text.setText(i14, m46093p(chatInfo != null ? chatInfo.getFromName() : null));
            final boolean z11 = item.getF38450c() == 102;
            View view = helper.getView(i12);
            Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
            C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.payment.chat.ui.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChatAdapter.m46087o(this.f38462b, helper, item, z11);
                }
            }, 1, null);
            if (!z11) {
                m46095r(helper, item);
                return;
            } else {
                m46097w(helper, item);
                helper.setGone(R$id.pay_warning_text, Intrinsics.areEqual(item.getF38449b().getMetadata().get("systemType"), "BUYER_PAYMENT_REMINDER"));
                return;
            }
        }
        int i15 = R$id.chat_left_tv_time;
        BaseViewHolder gone3 = helper.setText(i15, item.m46206f()).setGone(i15, m46098y(helper.getAdapterPosition()));
        int i16 = R$id.chat_left_tv_name;
        ChatInfo chatInfo2 = this.f38421i;
        BaseViewHolder text2 = gone3.setText(i16, C27041f.m66668h(chatInfo2 != null ? chatInfo2.getToName() : null));
        int i17 = R$id.chat_left_tv_avatar;
        ChatInfo chatInfo3 = this.f38421i;
        text2.setText(i17, m46093p(chatInfo3 != null ? chatInfo3.getToName() : null));
        if (item.getF38450c() == 101) {
            m46097w(helper, item);
        } else {
            m46095r(helper, item);
        }
    }

    /* JADX INFO: renamed from: q */
    public final boolean m46094q() {
        Context context = this.mContext;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        return activity == null || C27025c.m66566d(Boolean.valueOf(activity.isFinishing())) || C27025c.m66566d(Boolean.valueOf(activity.isDestroyed()));
    }

    /* JADX INFO: renamed from: v */
    public final void m46096v(@Nullable ChatInfo chatInfo, @Nullable C42792a c42792a, @NotNull Function1<? super String, Unit> sendTextAction, @NotNull Function1<? super String, Unit> sendImageAction) {
        Intrinsics.checkNotNullParameter(sendTextAction, "sendTextAction");
        Intrinsics.checkNotNullParameter(sendImageAction, "sendImageAction");
        this.f38421i = chatInfo;
        this.f38422j = c42792a;
        this.f38423k = sendTextAction;
        this.f38424l = sendImageAction;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m46087o(ChatAdapter chatAdapter, BaseViewHolder baseViewHolder, ChatItem chatItem, boolean z11) {
        chatAdapter.remove(baseViewHolder.getAdapterPosition());
        String content = chatItem.getF38449b().getContent();
        if (z11) {
            Function1<? super String, Unit> function1 = chatAdapter.f38423k;
            if (function1 != null) {
                function1.invoke(content);
            }
        } else {
            Function1<? super String, Unit> function2 = chatAdapter.f38424l;
            if (function2 != null) {
                function2.invoke(content);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m46090u(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static final boolean m46091x(ChatItem chatItem, View view) {
        C27057k.m66746b(chatItem.getF38449b().getContent());
        ToastCompat.m66437C(R$string.copy_success);
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final void m46095r(BaseViewHolder baseViewHolder, final ChatItem chatItem) {
        if (m46094q()) {
            return;
        }
        ImageView imageView = (ImageView) baseViewHolder.getView(R$id.chat_item_image_view);
        if (chatItem.getF38449b().hasPicUrl()) {
            Intrinsics.checkNotNull(ComponentCallbacks2C5309c.m6556t(this.mContext).mo6623k().mo6601L0(chatItem.getF38449b().getContent()).m6591B0(new C20415a(imageView)));
        } else {
            C43873a c43873a = C43873a.f96960a;
            Context mContext = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            String content = chatItem.getF38449b().getContent();
            Intrinsics.checkNotNull(imageView);
            c43873a.m96644a(mContext, content, imageView);
        }
        Intrinsics.checkNotNull(imageView);
        C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.payment.chat.ui.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChatAdapter.m46088s(this.f38470b, chatItem);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: w */
    public final void m46097w(BaseViewHolder baseViewHolder, final ChatItem chatItem) {
        String content = chatItem.getF38449b().getContent();
        TextView textView = (TextView) baseViewHolder.getView(R$id.chat_tv_content);
        textView.setText(content);
        textView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.kubi.payment.chat.ui.b
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return ChatAdapter.m46091x(chatItem, view);
            }
        });
    }
}
