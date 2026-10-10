package com.kubi.payment.chat;

import android.content.Context;
import android.os.Bundle;
import com.kubi.chat.entity.ChatMessage;
import com.kubi.chat.service.ChatClient;
import com.kubi.payment.chat.entity.ChatInfo;
import com.kubi.payment.chat.p105ui.ChatFragment;
import com.kubi.sdk.BaseActivity;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p468nb.C42792a;
import p638tb.AbstractC44914a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import pt.InterfaceC43536a;

/* JADX INFO: compiled from: OrderChatHelper.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014J4\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00052\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160 J\u0016\u0010!\u001a\u00020\u00162\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160 H\u0002J6\u0010\"\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00052\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160 H\u0002J\b\u0010#\u001a\u00020\u0016H\u0002J\u0006\u0010$\u001a\u00020\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, m90084d2 = {"Lcom/kubi/payment/chat/OrderChatHelper;", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "orderId", "", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Ljava/lang/String;)V", "chatApi", "Lcom/kubi/payment/chat/api/ChatApi;", "kotlin.jvm.PlatformType", "getChatApi", "()Lcom/kubi/payment/chat/api/ChatApi;", "chatApi$delegate", "Lkotlin/Lazy;", "chatInfo", "Lcom/kubi/payment/chat/entity/ChatInfo;", "conversation", "Lcom/kubi/chat/conversation/ChatConversation;", "hasRedAction", "Lkotlin/Function1;", "", "", "initChat", "redAction", "startChatActivity", "context", "Landroid/content/Context;", "isMerchant", "isForbid", "orderMarks", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function0;", "connectChat", "launchRouter", "registerUIListener", "unregisterUIListener", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class OrderChatHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final InterfaceC41709m0 f38403a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final String f38404b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Lazy f38405c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public ChatInfo f38406d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public C42792a f38407e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public Function1<? super Boolean, Unit> f38408f;

    /* JADX INFO: renamed from: com.kubi.payment.chat.OrderChatHelper$a */
    /* JADX INFO: compiled from: OrderChatHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/payment/chat/OrderChatHelper$registerUIListener$1", "Lcom/kubi/chat/service/AbsChatUIListener;", "onMessageReceived", "", "message", "Lcom/kubi/chat/entity/ChatMessage;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20406a extends AbstractC44914a {
        public C20406a() {
        }

        @Override // p638tb.AbstractC44914a, p638tb.InterfaceC44916c
        /* JADX INFO: renamed from: f2 */
        public void mo46076f2(ChatMessage message) {
            Function1 function1;
            Intrinsics.checkNotNullParameter(message, "message");
            if (Intrinsics.areEqual(message.getMetadata().get("oId"), OrderChatHelper.this.f38404b)) {
                ChatInfo chatInfo = OrderChatHelper.this.f38406d;
                if (message.isOutDirect(C27041f.m66668h(chatInfo != null ? chatInfo.getFrom() : null)) || (function1 = OrderChatHelper.this.f38408f) == null) {
                    return;
                }
                function1.invoke(Boolean.TRUE);
            }
        }
    }

    public OrderChatHelper(@NotNull InterfaceC41709m0 scope, @NotNull String orderId) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        this.f38403a = scope;
        this.f38404b = orderId;
        this.f38405c = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.chat.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderChatHelper.m46064m();
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m46065q(final OrderChatHelper orderChatHelper) {
        C42792a c42792a = orderChatHelper.f38407e;
        if (c42792a != null) {
            c42792a.m93793h(new Function1() { // from class: com.kubi.payment.chat.d
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OrderChatHelper.m46066r(this.f38412b, (Boolean) obj);
                }
            }, new Function1() { // from class: com.kubi.payment.chat.e
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OrderChatHelper.m46067s((Throwable) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m46066r(OrderChatHelper orderChatHelper, Boolean bool) {
        Function1<? super Boolean, Unit> function1 = orderChatHelper.f38408f;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(C27025c.m66566d(bool)));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m46067s(Throwable th2) {
        ToastCompat.m66441G(C27041f.m66668h(th2 != null ? th2.getMessage() : null), new Object[0]);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public final void m46069n(Function0<Unit> function0) {
        C41696j.m91104d(this.f38403a, null, null, new OrderChatHelper$connectChat$1(this, function0, null), 3, null);
    }

    /* JADX INFO: renamed from: o */
    public final InterfaceC43536a m46070o() {
        return (InterfaceC43536a) this.f38405c.getValue();
    }

    /* JADX INFO: renamed from: p */
    public final void m46071p(@NotNull Function1<? super Boolean, Unit> redAction) {
        Intrinsics.checkNotNullParameter(redAction, "redAction");
        this.f38408f = redAction;
        m46069n(new Function0() { // from class: com.kubi.payment.chat.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderChatHelper.m46065q(this.f38411b);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final void m46072t(Context context, boolean z11, boolean z12, String str, Function0<Unit> function0) {
        BaseActivity.Companion companion = BaseActivity.INSTANCE;
        Bundle bundle = new Bundle();
        bundle.putString("oId", this.f38404b);
        bundle.putString("adRemark", str);
        bundle.putBoolean("isMerchant", z11);
        bundle.putBoolean("isForbid", z12);
        bundle.putParcelable("info", this.f38406d);
        Unit unit = Unit.INSTANCE;
        companion.launch(context, ChatFragment.class, bundle);
        function0.invoke();
    }

    /* JADX INFO: renamed from: u */
    public final void m46073u() {
        ChatClient chatClient = ChatClient.INSTANCE.get();
        if (chatClient != null) {
            chatClient.m20395j("orderDetail", new C20406a());
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m46074v(@NotNull final Context context, final boolean z11, final boolean z12, @NotNull final String orderMarks, @NotNull final Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(orderMarks, "orderMarks");
        Intrinsics.checkNotNullParameter(action, "action");
        if (this.f38406d == null) {
            m46069n(new Function0() { // from class: com.kubi.payment.chat.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderChatHelper.m46068w(this.f38414b, context, z11, z12, orderMarks, action);
                }
            });
        } else {
            m46072t(context, z11, z12, orderMarks, action);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m46075x() {
        ChatClient chatClient = ChatClient.INSTANCE.get();
        if (chatClient != null) {
            chatClient.m20397l("orderDetail");
        }
    }

    /* JADX INFO: renamed from: m */
    public static final InterfaceC43536a m46064m() {
        return (InterfaceC43536a) C42597a.m93387c().create(InterfaceC43536a.class);
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m46068w(OrderChatHelper orderChatHelper, Context context, boolean z11, boolean z12, String str, Function0 function0) {
        orderChatHelper.m46072t(context, z11, z12, str, function0);
        return Unit.INSTANCE;
    }
}
