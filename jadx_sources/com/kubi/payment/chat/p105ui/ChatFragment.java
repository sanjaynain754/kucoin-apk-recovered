package com.kubi.payment.chat.p105ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.blankj.utilcode.util.C5258a;
import com.blankj.utilcode.util.KeyboardUtils;
import com.kubi.chat.entity.ChatMessage;
import com.kubi.chat.service.ChatClient;
import com.kubi.helpcenter.api.local.IHelpCenterService;
import com.kubi.otc.R$color;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.service.OtcDepend;
import com.kubi.payment.chat.entity.ChatInfo;
import com.kubi.payment.p2p.P2PHelper;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.TitleBar;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27100x0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33978va;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37758j;
import i10.Menu;
import io.chad.library.adapter.base.BaseViewHolder;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import lt.C42300e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37626h;
import p468nb.C42792a;
import p638tb.InterfaceC44916c;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45681e;

/* JADX INFO: compiled from: ChatFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 m2\u00020\u00012\u00020\u0002:\u0002mnB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010E2\b\u0010F\u001a\u0004\u0018\u00010GH\u0016J\u001a\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020A2\b\u0010D\u001a\u0004\u0018\u00010EH\u0017J\u0010\u0010K\u001a\u00020I2\u0006\u0010L\u001a\u00020MH\u0002J\u0018\u0010N\u001a\n **\u0004\u0018\u00010A0A2\u0006\u0010L\u001a\u00020MH\u0002J\b\u0010O\u001a\u00020IH\u0002J\n\u0010R\u001a\u0004\u0018\u00010QH\u0002J\b\u0010S\u001a\u00020IH\u0002J\b\u0010T\u001a\u00020IH\u0002J\b\u0010U\u001a\u00020IH\u0016J\b\u0010V\u001a\u00020IH\u0002J\b\u0010W\u001a\u00020IH\u0002J\"\u0010X\u001a\u00020I2\u0006\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020Z2\b\u0010\\\u001a\u0004\u0018\u00010]H\u0016J\u0010\u0010^\u001a\u00020\u000f2\u0006\u0010_\u001a\u00020\u0006H\u0002J\u0010\u0010`\u001a\u00020\u000f2\u0006\u0010_\u001a\u00020\u0006H\u0002J\u0010\u0010a\u001a\u00020I2\u0006\u0010b\u001a\u00020QH\u0016J\u0010\u0010c\u001a\u00020I2\u0006\u0010b\u001a\u00020QH\u0016J\u0010\u0010d\u001a\u00020I2\u0006\u0010b\u001a\u00020QH\u0016J\u0010\u0010e\u001a\u00020I2\u0006\u0010b\u001a\u00020QH\u0016J\u0010\u0010f\u001a\u00020I2\u0006\u0010b\u001a\u00020QH\u0016J\b\u0010g\u001a\u00020IH\u0016J\u0010\u0010h\u001a\u00020I2\u0006\u0010b\u001a\u00020QH\u0002J\u0010\u0010i\u001a\u00020I2\u0006\u0010b\u001a\u00020QH\u0002J\u0010\u0010j\u001a\u00020\u000f2\u0006\u0010k\u001a\u00020QH\u0002J\b\u0010l\u001a\u00020IH\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u000e\u0010\u0010R\u001b\u0010\u0012\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0012\u0010\u0010R\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\n\u001a\u0004\b \u0010!R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\n\u001a\u0004\b%\u0010&R#\u0010(\u001a\n **\u0004\u0018\u00010)0)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\n\u001a\u0004\b+\u0010,R\u001d\u0010.\u001a\u0004\u0018\u00010/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\n\u001a\u0004\b0\u00101R7\u00103\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000604j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`58BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010\n\u001a\u0004\b6\u00107R\u000e\u00109\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010:\u001a\u0004\u0018\u00010;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b<\u0010=R\u0010\u0010P\u001a\u0004\u0018\u00010QX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006o"}, m90084d2 = {"Lcom/kubi/payment/chat/ui/ChatFragment;", "Lcom/kubi/sdk/BaseFragment;", "Lcom/kubi/chat/service/IChatUIListener;", "<init>", "()V", "orderId", "", "getOrderId", "()Ljava/lang/String;", "orderId$delegate", "Lkotlin/Lazy;", "adRemark", "getAdRemark", "adRemark$delegate", "isForbid", "", "()Z", "isForbid$delegate", "isMerchant", "isMerchant$delegate", "info", "Lcom/kubi/payment/chat/entity/ChatInfo;", "getInfo", "()Lcom/kubi/payment/chat/entity/ChatInfo;", "info$delegate", "chatLayoutManager", "Lcom/kubi/payment/chat/ui/ChatFragment$LinearLayoutManagerWrap;", "getChatLayoutManager", "()Lcom/kubi/payment/chat/ui/ChatFragment$LinearLayoutManagerWrap;", "chatLayoutManager$delegate", "chatAdapter", "Lcom/kubi/payment/chat/ui/ChatAdapter;", "getChatAdapter", "()Lcom/kubi/payment/chat/ui/ChatAdapter;", "chatAdapter$delegate", "chatViewModel", "Lcom/kubi/payment/chat/ui/ChatViewModel;", "getChatViewModel", "()Lcom/kubi/payment/chat/ui/ChatViewModel;", "chatViewModel$delegate", "contextAct", "Landroid/app/Activity;", "kotlin.jvm.PlatformType", "getContextAct", "()Landroid/app/Activity;", "contextAct$delegate", "conversation", "Lcom/kubi/chat/conversation/ChatConversation;", "getConversation", "()Lcom/kubi/chat/conversation/ChatConversation;", "conversation$delegate", "metaData", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getMetaData", "()Ljava/util/HashMap;", "metaData$delegate", "isBlocked", "binding", "Lcom/kubi/otc/databinding/BotcFragmentChatBinding;", "getBinding", "()Lcom/kubi/otc/databinding/BotcFragmentChatBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "refreshOrderInfo", "orderInfo", "Lcom/kubi/payment/chat/ui/ChatViewModel$P2POrderCardInfo;", "titleLayout", "hideInputBar", "remarkMessage", "Lcom/kubi/chat/entity/ChatMessage;", "getRemarkMessage", "observeData", "getMessages", "onDestroy", "scrollToBottom", "scrollToTop", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "checkImageFormat", "path", "checkImageSize", "onMessageSent", "message", "onMessageReceived", "onMessageDelivered", "onMessageReaded", "onMessageFailed", "notifyMessageOffline", "notifyItemMessage", "notifyMessage", "isThisChat", "msg", "showFraudDialogIfNeeded", "Companion", "LinearLayoutManagerWrap", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nChatFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatFragment.kt\ncom/kubi/payment/chat/ui/ChatFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,538:1\n106#2,15:539\n147#3,16:554\n774#4:570\n865#4,2:571\n1563#4:573\n1634#4,3:574\n774#4:577\n865#4,2:578\n1563#4:580\n1634#4,3:581\n*S KotlinDebug\n*F\n+ 1 ChatFragment.kt\ncom/kubi/payment/chat/ui/ChatFragment\n*L\n76#1:539,15\n88#1:554,16\n336#1:570\n336#1:571,2\n336#1:573\n336#1:574,3\n358#1:577\n358#1:578,2\n358#1:580\n358#1:581,3\n*E\n"})
public final class ChatFragment extends BaseFragment implements InterfaceC44916c {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final Lazy f38431U = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.chat.ui.l0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ChatFragment.m46128N4(this.f38490b);
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f38432V = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.chat.ui.m0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ChatFragment.m46133R3(this.f38492b);
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f38433W = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.chat.ui.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(ChatFragment.m46149m4(this.f38480b));
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f38434X = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.chat.ui.h
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(ChatFragment.m46152o4(this.f38482b));
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f38435Y = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.chat.ui.i
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ChatFragment.m46146k4(this.f38484b);
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f38436Z = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.chat.ui.j
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ChatFragment.m46137T3(this.f38486b);
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f38437a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.chat.ui.k
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ChatFragment.m46135S3();
        }
    });

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f38438b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final Lazy f38439c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final Lazy f38440d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final Lazy f38441e0;

    /* JADX INFO: renamed from: f0 */
    public boolean f38442f0;

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public final InterfaceC24293a f38443g0;

    /* JADX INFO: renamed from: h0 */
    @Nullable
    public ChatMessage f38444h0;

    /* JADX INFO: renamed from: j0 */
    public static final /* synthetic */ KProperty<Object>[] f38430j0 = {Reflection.property1(new PropertyReference1Impl(ChatFragment.class, "binding", "getBinding()Lcom/kubi/otc/databinding/BotcFragmentChatBinding;", 0))};

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public static final Companion f38429i0 = new Companion(null);

    /* JADX INFO: compiled from: ChatFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/payment/chat/ui/ChatFragment$Companion;", "", "<init>", "()V", "REQUEST_IMAGE_PICK", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: ChatFragment.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0018\u00010\tR\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\r"}, m90084d2 = {"Lcom/kubi/payment/chat/ui/ChatFragment$LinearLayoutManagerWrap;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "onLayoutChildren", "", "recycler", "Landroidx/recyclerview/widget/RecyclerView$Recycler;", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class LinearLayoutManagerWrap extends LinearLayoutManager {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LinearLayoutManagerWrap(@NotNull Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void onLayoutChildren(@Nullable final RecyclerView.Recycler recycler, @Nullable final RecyclerView.State state) {
            C27100x0.m66923d(new Function0() { // from class: com.kubi.payment.chat.ui.n0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChatFragment.LinearLayoutManagerWrap.m46200b(this.f38494b, recycler, state);
                }
            });
        }

        /* JADX INFO: renamed from: b */
        public static final Unit m46200b(LinearLayoutManagerWrap linearLayoutManagerWrap, RecyclerView.Recycler recycler, RecyclerView.State state) {
            super.onLayoutChildren(recycler, state);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.chat.ui.ChatFragment$a */
    /* JADX INFO: compiled from: ChatFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20417a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f38445b;

        public C20417a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f38445b = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p852kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f38445b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f38445b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: U3 */
    public final boolean m46174U3(String str) {
        int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str, C33978va.f72339h, 0, false, 6, (Object) null);
        if (iLastIndexOf$default == -1) {
            return false;
        }
        String strSubstring = str.substring(iLastIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        if (strSubstring.length() <= 0) {
            return false;
        }
        ArrayList arrayListArrayListOf = CollectionsKt.arrayListOf(".png", ".jpg", ".jpeg");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String lowerCase = strSubstring.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return arrayListArrayListOf.contains(lowerCase);
    }

    /* JADX INFO: renamed from: B4 */
    public static final Unit m46104B4(final ChatFragment chatFragment, BaseViewHolder viewHolder, final DialogFragmentHelper helper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(helper, "helper");
        View view = viewHolder.getView(R$id.view_menu_report);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.payment.chat.ui.x
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChatFragment.m46106C4(helper);
            }
        }, 1, null);
        View view2 = viewHolder.getView(R$id.view_menu_block);
        if (chatFragment.f38442f0) {
            Intrinsics.checkNotNull(view2);
            C27046k.m66700o(view2);
        } else {
            Intrinsics.checkNotNull(view2);
            C27046k.m66685H(view2);
        }
        C27046k.m66711z(view2, 0L, new Function0() { // from class: com.kubi.payment.chat.ui.y
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChatFragment.m46108D4(this.f38517b, helper);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C4 */
    public static final Unit m46106C4(DialogFragmentHelper dialogFragmentHelper) {
        IHelpCenterService.f25326a.get().mo1472a("360001278554");
        if (dialogFragmentHelper != null) {
            dialogFragmentHelper.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D4 */
    public static final Unit m46108D4(final ChatFragment chatFragment, DialogFragmentHelper dialogFragmentHelper) {
        C42300e c42300e = C42300e.f93799a;
        FragmentManager childFragmentManager = chatFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        c42300e.m92843d(childFragmentManager, "payment_im_block", chatFragment.getStringRes(R$string.pay_p2p_black_user_dialog_title, new Object[0]), chatFragment.getStringRes(R$string.pay_p2p_black_user_dialog_msg, new Object[0]), chatFragment.getStringRes(R$string.cancel, new Object[0]), chatFragment.getStringRes(R$string.confirm, new Object[0]), new Function0() { // from class: com.kubi.payment.chat.ui.d0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChatFragment.m46110E4(this.f38475b);
            }
        });
        if (dialogFragmentHelper != null) {
            dialogFragmentHelper.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F4 */
    public static final Unit m46112F4(ChatFragment chatFragment, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C42792a c42792aM46186e4 = chatFragment.m46186e4();
        if (c42792aM46186e4 != null) {
            c42792aM46186e4.m93796l(it, chatFragment.m46189h4());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G4 */
    public static final Unit m46114G4(ChatFragment chatFragment, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C42792a c42792aM46186e4 = chatFragment.m46186e4();
        if (c42792aM46186e4 != null) {
            C42792a.m93789k(c42792aM46186e4, it, chatFragment.m46189h4(), null, null, 12, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K4 */
    public static final WindowInsetsCompat m46122K4(ChatFragment chatFragment, View v11, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(v11, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        int i11 = insets.getInsets(WindowInsetsCompat.Type.ime()).bottom;
        if (i11 <= 0) {
            v11.setPadding(0, 0, 0, i11);
            return insets;
        }
        v11.setPadding(0, 0, 0, Math.max(0, i11 - EdgeToEdgeCompat.f48106a.m58271i()));
        chatFragment.m46173Q4();
        return insets;
    }

    /* JADX INFO: renamed from: L4 */
    public static final Unit m46124L4(ChatFragment chatFragment, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C42792a c42792aM46186e4 = chatFragment.m46186e4();
        if (c42792aM46186e4 != null) {
            c42792aM46186e4.m93796l(it, chatFragment.m46189h4());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M4 */
    public static final Unit m46126M4(ChatFragment chatFragment) {
        OtcDepend.f38138a.m45469r(chatFragment, 1, 1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P4 */
    public static final Unit m46131P4(ChatViewModel.P2POrderCardInfo p2POrderCardInfo, ChatFragment chatFragment) {
        InterfaceC37758j.a.m85164m(C37304a.f82764a, C27025c.m66566d(p2POrderCardInfo.isBuy()) ? 1L : 0L, p2POrderCardInfo.getOrderId(), null, null, null, null, 60, null);
        chatFragment.preformBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S3 */
    public static final ChatAdapter m46135S3() {
        return new ChatAdapter(new ArrayList());
    }

    /* JADX INFO: renamed from: T3 */
    public static final LinearLayoutManagerWrap m46137T3(ChatFragment chatFragment) {
        Activity activityM46184d4 = chatFragment.m46184d4();
        Intrinsics.checkNotNullExpressionValue(activityM46184d4, "<get-contextAct>(...)");
        return new LinearLayoutManagerWrap(activityM46184d4);
    }

    /* JADX INFO: renamed from: T4 */
    private final void m46138T4() {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.payment.chat.ui.e0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChatFragment.m46139U4(this.f38477b);
            }
        });
    }

    /* JADX INFO: renamed from: W4 */
    private final void m46142W4() {
        P2PHelper p2PHelper = P2PHelper.f39683a;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        p2PHelper.m48411c(childFragmentManager, LifecycleOwnerKt.getLifecycleScope(this));
    }

    /* JADX INFO: renamed from: X3 */
    public static final C42792a m46143X3(ChatFragment chatFragment) {
        ChatClient chatClient = ChatClient.INSTANCE.get();
        if (chatClient == null) {
            return null;
        }
        ChatInfo chatInfoM46187f4 = chatFragment.m46187f4();
        return chatClient.m20390e(chatInfoM46187f4 != null ? chatInfoM46187f4.getTo() : null);
    }

    private final String getOrderId() {
        return (String) this.f38431U.getValue();
    }

    /* JADX INFO: renamed from: q4 */
    public static final HashMap m46155q4(ChatFragment chatFragment) {
        return MapsKt.hashMapOf(new Pair("oId", C27041f.m66668h(chatFragment.getOrderId())), new Pair("lang", MultiLanguageManager.f46811g.getLocalString()));
    }

    /* JADX INFO: renamed from: Q4 */
    public final void m46173Q4() {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.payment.chat.ui.w
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChatFragment.m46134R4(this.f38515b);
            }
        });
    }

    @Override // p638tb.InterfaceC44916c
    /* JADX INFO: renamed from: V2 */
    public void mo46175V2(@NotNull ChatMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        m46197r4(message);
        String failedInfo = message.getFailedInfo();
        if (failedInfo.length() > 0) {
            if (Intrinsics.areEqual(failedInfo, "Network error please check the connection.")) {
                ToastCompat.m66437C(R$string.p2p_chat_network_error);
            } else if (Intrinsics.areEqual(failedInfo, "webSocket un connect.")) {
                ToastCompat.m66437C(R$string.p2p_chat_chat_disconnect);
            } else {
                ToastCompat.m66441G(failedInfo, new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: V3 */
    public final boolean m46176V3(String str) {
        return new File(str).length() <= 20971520;
    }

    /* JADX INFO: renamed from: Y3 */
    public final String m46178Y3() {
        return (String) this.f38432V.getValue();
    }

    @Override // p638tb.InterfaceC44916c
    /* JADX INFO: renamed from: Z2 */
    public void mo46179Z2(@NotNull ChatMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        m46197r4(message);
    }

    /* JADX INFO: renamed from: Z3 */
    public final C37626h m46180Z3() {
        return (C37626h) this.f38443g0.getValue(this, f38430j0[0]);
    }

    /* JADX INFO: renamed from: a4 */
    public final ChatAdapter m46181a4() {
        return (ChatAdapter) this.f38437a0.getValue();
    }

    /* JADX INFO: renamed from: b4 */
    public final LinearLayoutManagerWrap m46182b4() {
        return (LinearLayoutManagerWrap) this.f38436Z.getValue();
    }

    /* JADX INFO: renamed from: c4 */
    public final ChatViewModel m46183c4() {
        return (ChatViewModel) this.f38438b0.getValue();
    }

    /* JADX INFO: renamed from: d4 */
    public final Activity m46184d4() {
        return (Activity) this.f38439c0.getValue();
    }

    /* JADX INFO: renamed from: e4 */
    public final C42792a m46186e4() {
        return (C42792a) this.f38440d0.getValue();
    }

    @Override // p638tb.InterfaceC44916c
    /* JADX INFO: renamed from: f2 */
    public void mo46076f2(@NotNull ChatMessage message) {
        C42792a c42792aM46186e4;
        Intrinsics.checkNotNullParameter(message, "message");
        if (m46196p4(message)) {
            ChatItem chatItem = new ChatItem(message);
            if (m46181a4().getData().indexOf(chatItem) != -1) {
                return;
            }
            C42792a c42792aM46186e5 = m46186e4();
            if (c42792aM46186e5 != null) {
                c42792aM46186e5.m93798n(message.getSeqId());
            }
            m46181a4().addData(chatItem);
            if (m46182b4().findLastVisibleItemPosition() == m46181a4().getItemCount() - 2) {
                m46173Q4();
            }
            ChatInfo chatInfoM46187f4 = m46187f4();
            if (message.isOutDirect(C27041f.m66668h(chatInfoM46187f4 != null ? chatInfoM46187f4.getFrom() : null)) || (c42792aM46186e4 = m46186e4()) == null) {
                return;
            }
            c42792aM46186e4.m93794i(message);
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final ChatInfo m46187f4() {
        return (ChatInfo) this.f38435Y.getValue();
    }

    /* JADX INFO: renamed from: h4 */
    public final HashMap<String, String> m46189h4() {
        return (HashMap) this.f38441e0.getValue();
    }

    @Override // p638tb.InterfaceC44916c
    /* JADX INFO: renamed from: l */
    public void mo46192l(@NotNull ChatMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        long seqId = message.getSeqId();
        C42792a c42792aM46186e4 = m46186e4();
        boolean z11 = seqId - C27039d.m66652l(c42792aM46186e4 != null ? Long.valueOf(c42792aM46186e4.getMyMessageHasReadId()) : null) > 1;
        C42792a c42792aM46186e5 = m46186e4();
        if (c42792aM46186e5 != null) {
            c42792aM46186e5.m93797m(message.getSeqId());
        }
        if (z11) {
            m46181a4().notifyDataSetChanged();
        } else {
            m46198s4(message);
        }
    }

    /* JADX INFO: renamed from: l4 */
    public final boolean m46193l4() {
        return ((Boolean) this.f38433W.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: n4 */
    public final boolean m46194n4() {
        return ((Boolean) this.f38434X.getValue()).booleanValue();
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Window window;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentActivity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(18);
        }
        View viewInflate = inflater.inflate(R$layout.botc_fragment_chat, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        ChatClient chatClient = ChatClient.INSTANCE.get();
        if (chatClient != null) {
            chatClient.m20397l("chat");
        }
        super.onDestroy();
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    @SuppressLint({"ClickableViewAccessibility"})
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        InputBottomBar inputBottomBar;
        FrameLayout frameLayout;
        InputBottomBar inputBottomBar2;
        ConstraintLayout root;
        SwipeRefreshLayout swipeRefreshLayout;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m46142W4();
        ChatClient chatClient = ChatClient.INSTANCE.get();
        if (chatClient != null) {
            chatClient.m20395j("chat", this);
        }
        getTitleBar().setTitle(getString(R$string.chat));
        getTitleBar().setMenu(new Menu(0, Integer.valueOf(R$drawable.ic2_more_20), Integer.valueOf(R$color.c_text), 0, null, 0, 0, new View.OnClickListener() { // from class: com.kubi.payment.chat.ui.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ChatFragment.m46102A4(this.f38478b, view2);
            }
        }, 0, 377, null));
        m46181a4().m46096v(m46187f4(), m46186e4(), new Function1() { // from class: com.kubi.payment.chat.ui.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChatFragment.m46112F4(this.f38500b, (String) obj);
            }
        }, new Function1() { // from class: com.kubi.payment.chat.ui.b0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChatFragment.m46114G4(this.f38469b, (String) obj);
            }
        });
        C37626h c37626hM46180Z3 = m46180Z3();
        if (c37626hM46180Z3 != null && (recyclerView2 = c37626hM46180Z3.f83939e) != null) {
            recyclerView2.setLayoutManager(m46182b4());
            recyclerView2.setAdapter(m46181a4());
            ChatItem.Companion companion = ChatItem.f38446d;
            companion.setId(getOrderId());
            ChatInfo chatInfoM46187f4 = m46187f4();
            companion.setUid(chatInfoM46187f4 != null ? chatInfoM46187f4.getFrom() : null);
        }
        C37626h c37626hM46180Z4 = m46180Z3();
        if (c37626hM46180Z4 != null && (recyclerView = c37626hM46180Z4.f83939e) != null) {
            recyclerView.setOnTouchListener(new View.OnTouchListener() { // from class: com.kubi.payment.chat.ui.g0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return ChatFragment.m46116H4(this.f38481b, view2, motionEvent);
                }
            });
        }
        C37626h c37626hM46180Z5 = m46180Z3();
        if (c37626hM46180Z5 != null && (swipeRefreshLayout = c37626hM46180Z5.f83938d) != null) {
            swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: com.kubi.payment.chat.ui.h0
                @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
                public final void onRefresh() {
                    ChatFragment.m46120J4(this.f38483b);
                }
            });
        }
        C37626h c37626hM46180Z6 = m46180Z3();
        if (c37626hM46180Z6 != null && (root = c37626hM46180Z6.getRoot()) != null) {
            ViewCompat.setOnApplyWindowInsetsListener(root, new OnApplyWindowInsetsListener() { // from class: com.kubi.payment.chat.ui.i0
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                    return ChatFragment.m46122K4(this.f38485b, view2, windowInsetsCompat);
                }
            });
        }
        if (m46193l4() || this.f38442f0) {
            m46191j4();
        } else {
            C37626h c37626hM46180Z7 = m46180Z3();
            if (c37626hM46180Z7 != null && (inputBottomBar2 = c37626hM46180Z7.f83945k) != null) {
                C27046k.m66685H(inputBottomBar2);
            }
            C37626h c37626hM46180Z8 = m46180Z3();
            if (c37626hM46180Z8 != null && (frameLayout = c37626hM46180Z8.f83944j) != null) {
                C27046k.m66700o(frameLayout);
            }
        }
        C37626h c37626hM46180Z9 = m46180Z3();
        if (c37626hM46180Z9 != null && (inputBottomBar = c37626hM46180Z9.f83945k) != null) {
            inputBottomBar.m46241j(new Function1() { // from class: com.kubi.payment.chat.ui.j0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ChatFragment.m46124L4(this.f38487b, (String) obj);
                }
            }, new Function0() { // from class: com.kubi.payment.chat.ui.k0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChatFragment.m46126M4(this.f38488b);
                }
            });
        }
        m46173Q4();
        m46188g4();
        m46159t4();
        m46183c4().m46220C(getOrderId());
        m46183c4().m46219B(getOrderId());
        if (OtcDepend.f38138a.m45466o()) {
            m46183c4().m46229x();
        }
    }

    @Override // p638tb.InterfaceC44916c
    /* JADX INFO: renamed from: p */
    public void mo46195p(@NotNull ChatMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (m46196p4(message)) {
            m46181a4().addData(new ChatItem(message));
            m46173Q4();
        }
    }

    /* JADX INFO: renamed from: p4 */
    public final boolean m46196p4(ChatMessage chatMessage) {
        return Intrinsics.areEqual(ChatItem.f38446d.getId(), chatMessage.getMetadata().get("oId"));
    }

    public ChatFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.payment.chat.ui.ChatFragment$special$$inlined$viewModels$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final Fragment invoke() {
                return this;
            }

            {
                super(0);
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.payment.chat.ui.ChatFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }

            {
                super(0);
            }
        });
        final Function0 function1 = null;
        this.f38438b0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(ChatViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.payment.chat.ui.ChatFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.payment.chat.ui.ChatFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function2 = function1;
                if (function2 != null && (creationExtras = (CreationExtras) function2.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.payment.chat.ui.ChatFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.f38439c0 = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.chat.ui.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChatFragment.m46141W3(this.f38489b);
            }
        });
        this.f38440d0 = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.chat.ui.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChatFragment.m46143X3(this.f38491b);
            }
        });
        this.f38441e0 = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.chat.ui.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChatFragment.m46155q4(this.f38493b);
            }
        });
        this.f38443g0 = C45681e.m100799e(this, new Function1<ChatFragment, C37626h>() { // from class: com.kubi.payment.chat.ui.ChatFragment$special$$inlined$viewBindingFragment$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C37626h invoke(@NotNull ChatFragment fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                return C37626h.m84833a(this.this$0.getContentView());
            }

            {
                super(1);
            }
        }, new Function1<C37626h, Unit>() { // from class: com.kubi.payment.chat.ui.ChatFragment$special$$inlined$viewBindingFragment$1
            public final void invoke(@NotNull C37626h it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C37626h c37626h) {
                invoke(c37626h);
                return Unit.INSTANCE;
            }
        });
    }

    /* JADX INFO: renamed from: A4 */
    public static final void m46102A4(final ChatFragment chatFragment, View view) {
        Boolean boolValueOf;
        if (chatFragment.getActivity() != null) {
            FragmentActivity activity = chatFragment.getActivity();
            if (activity != null) {
                boolValueOf = Boolean.valueOf(activity.isFinishing());
            } else {
                boolValueOf = null;
            }
            if (!C27025c.m66566d(boolValueOf) && !chatFragment.isDetached() && chatFragment.getContext() != null) {
                DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, R$layout.payment_dialog_im, 8, 0, 0, false, false, false, false, false, 508, null).m54237f4(new Function2() { // from class: com.kubi.payment.chat.ui.u
                    @Override // p852kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ChatFragment.m46104B4(this.f38509b, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
                    }
                });
                FragmentManager childFragmentManager = chatFragment.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                dialogFragmentHelperM54237f4.show(childFragmentManager, "payment_p2p_chat_menuDialog");
            }
        }
    }

    /* JADX INFO: renamed from: E4 */
    public static final Unit m46110E4(ChatFragment chatFragment) {
        chatFragment.m46183c4().m46221j(chatFragment.getOrderId());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H4 */
    public static final boolean m46116H4(final ChatFragment chatFragment, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            C27100x0.m66923d(new Function0() { // from class: com.kubi.payment.chat.ui.v
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChatFragment.m46118I4(this.f38513b);
                }
            });
            return false;
        }
        return false;
    }

    /* JADX INFO: renamed from: I4 */
    public static final Unit m46118I4(ChatFragment chatFragment) {
        KeyboardUtils.m6033e(chatFragment.m46184d4());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J4 */
    public static final void m46120J4(ChatFragment chatFragment) {
        chatFragment.m46188g4();
    }

    /* JADX INFO: renamed from: N4 */
    public static final String m46128N4(ChatFragment chatFragment) {
        String string;
        Bundle arguments = chatFragment.getArguments();
        if (arguments != null) {
            string = arguments.getString("oId");
        } else {
            string = null;
        }
        return C27041f.m66668h(string);
    }

    /* JADX INFO: renamed from: R3 */
    public static final String m46133R3(ChatFragment chatFragment) {
        String string;
        Bundle arguments = chatFragment.getArguments();
        if (arguments != null) {
            string = arguments.getString("adRemark");
        } else {
            string = null;
        }
        return C27041f.m66668h(string);
    }

    /* JADX INFO: renamed from: R4 */
    public static final Unit m46134R4(final ChatFragment chatFragment) {
        FragmentActivity activity = chatFragment.getActivity();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.kubi.payment.chat.ui.z
                @Override // java.lang.Runnable
                public final void run() {
                    ChatFragment.m46136S4(this.f38519b);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S4 */
    public static final void m46136S4(ChatFragment chatFragment) {
        RecyclerView recyclerView;
        C37626h c37626hM46180Z3 = chatFragment.m46180Z3();
        if (c37626hM46180Z3 != null && (recyclerView = c37626hM46180Z3.f83939e) != null) {
            recyclerView.scrollToPosition(chatFragment.m46181a4().getItemCount() - 1);
        }
    }

    /* JADX INFO: renamed from: U4 */
    public static final Unit m46139U4(final ChatFragment chatFragment) {
        FragmentActivity activity = chatFragment.getActivity();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.kubi.payment.chat.ui.f0
                @Override // java.lang.Runnable
                public final void run() {
                    ChatFragment.m46140V4(this.f38479b);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V4 */
    public static final void m46140V4(ChatFragment chatFragment) {
        RecyclerView recyclerView;
        C37626h c37626hM46180Z3 = chatFragment.m46180Z3();
        if (c37626hM46180Z3 != null && (recyclerView = c37626hM46180Z3.f83939e) != null) {
            recyclerView.scrollToPosition(0);
        }
    }

    /* JADX INFO: renamed from: W3 */
    public static final Activity m46141W3(ChatFragment chatFragment) {
        FragmentActivity activity = chatFragment.getActivity();
        if (activity != null) {
            return activity;
        }
        return C5258a.m6125h();
    }

    /* JADX INFO: renamed from: k4 */
    public static final ChatInfo m46146k4(ChatFragment chatFragment) {
        Bundle arguments = chatFragment.getArguments();
        if (arguments != null) {
            return (ChatInfo) arguments.getParcelable("info");
        }
        return null;
    }

    /* JADX INFO: renamed from: m4 */
    public static final boolean m46149m4(ChatFragment chatFragment) {
        Boolean boolValueOf;
        Bundle arguments = chatFragment.getArguments();
        if (arguments != null) {
            boolValueOf = Boolean.valueOf(arguments.getBoolean("isForbid"));
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }

    /* JADX INFO: renamed from: o4 */
    public static final boolean m46152o4(ChatFragment chatFragment) {
        Boolean boolValueOf;
        Bundle arguments = chatFragment.getArguments();
        if (arguments != null) {
            boolValueOf = Boolean.valueOf(arguments.getBoolean("isMerchant"));
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }

    /* JADX INFO: renamed from: t4 */
    private final void m46159t4() {
        m46183c4().m46226u().observe(getViewLifecycleOwner(), new C20417a(new Function1() { // from class: com.kubi.payment.chat.ui.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChatFragment.m46161u4(this.f38497b, (List) obj);
            }
        }));
        m46183c4().m46227v().observe(getViewLifecycleOwner(), new C20417a(new Function1() { // from class: com.kubi.payment.chat.ui.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChatFragment.m46165w4(this.f38499b, (List) obj);
            }
        }));
        m46183c4().m46230y().observe(getViewLifecycleOwner(), new C20417a(new Function1() { // from class: com.kubi.payment.chat.ui.r
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChatFragment.m46167x4(this.f38502b, (Boolean) obj);
            }
        }));
        m46183c4().m46225t().observe(getViewLifecycleOwner(), new C20417a(new Function1() { // from class: com.kubi.payment.chat.ui.s
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChatFragment.m46169y4(this.f38503b, (String) obj);
            }
        }));
        m46183c4().m46228w().observe(getViewLifecycleOwner(), new C20417a(new Function1() { // from class: com.kubi.payment.chat.ui.t
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChatFragment.m46171z4(this.f38505b, (ChatViewModel.P2POrderCardInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u4 */
    public static final Unit m46161u4(final ChatFragment chatFragment, List list) {
        RecyclerView recyclerView;
        SwipeRefreshLayout swipeRefreshLayout;
        C37626h c37626hM46180Z3 = chatFragment.m46180Z3();
        if (c37626hM46180Z3 != null && (swipeRefreshLayout = c37626hM46180Z3.f83938d) != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
        Intrinsics.checkNotNull(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (chatFragment.m46196p4((ChatMessage) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new ChatItem((ChatMessage) it.next()));
        }
        List listM66559b = C27024b.m66559b(CollectionsKt.toMutableList((Collection) arrayList2));
        ChatMessage chatMessageM46190i4 = chatFragment.m46190i4();
        if (chatMessageM46190i4 != null) {
            if (!chatFragment.m46183c4().m46218A()) {
                chatFragment.m46181a4().remove(0);
            }
            listM66559b.add(0, new ChatItem(chatMessageM46190i4));
        }
        chatFragment.m46181a4().addData(0, (Collection) listM66559b);
        if (chatFragment.m46183c4().m46218A()) {
            chatFragment.m46173Q4();
            C37626h c37626hM46180Z4 = chatFragment.m46180Z3();
            if (c37626hM46180Z4 != null && (recyclerView = c37626hM46180Z4.f83939e) != null) {
                recyclerView.postDelayed(new Runnable() { // from class: com.kubi.payment.chat.ui.c0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ChatFragment.m46163v4(this.f38472b);
                    }
                }, 200L);
            }
        } else {
            chatFragment.m46138T4();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v4 */
    public static final void m46163v4(ChatFragment chatFragment) {
        chatFragment.m46173Q4();
    }

    /* JADX INFO: renamed from: w4 */
    public static final Unit m46165w4(ChatFragment chatFragment, List list) {
        Intrinsics.checkNotNull(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (chatFragment.m46196p4((ChatMessage) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new ChatItem((ChatMessage) it.next()));
        }
        List listM66559b = C27024b.m66559b(CollectionsKt.toMutableList((Collection) arrayList2));
        if (listM66559b.isEmpty()) {
            return Unit.INSTANCE;
        }
        ChatMessage chatMessageM46190i4 = chatFragment.m46190i4();
        if (chatMessageM46190i4 == null) {
            return Unit.INSTANCE;
        }
        listM66559b.add(0, new ChatItem(chatMessageM46190i4));
        chatFragment.m46181a4().replaceData(listM66559b);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x4 */
    public static final Unit m46167x4(ChatFragment chatFragment, Boolean bool) {
        Intrinsics.checkNotNull(bool);
        boolean zBooleanValue = bool.booleanValue();
        chatFragment.f38442f0 = zBooleanValue;
        if (zBooleanValue) {
            chatFragment.m46191j4();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y4 */
    public static final Unit m46169y4(ChatFragment chatFragment, String str) {
        chatFragment.f38442f0 = chatFragment.m46183c4().m46231z(str);
        if (!chatFragment.m46183c4().m46222k(str)) {
            chatFragment.m46191j4();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z4 */
    public static final Unit m46171z4(ChatFragment chatFragment, ChatViewModel.P2POrderCardInfo p2POrderCardInfo) {
        Intrinsics.checkNotNull(p2POrderCardInfo);
        chatFragment.m46172O4(p2POrderCardInfo);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O4 */
    public final void m46172O4(final ChatViewModel.P2POrderCardInfo p2POrderCardInfo) {
        C37626h c37626hM46180Z3 = m46180Z3();
        if (c37626hM46180Z3 != null) {
            TitleBar titleBar = getTitleBar();
            View viewM46177X4 = m46177X4(p2POrderCardInfo);
            Intrinsics.checkNotNullExpressionValue(viewM46177X4, "titleLayout(...)");
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 17;
            Unit unit = Unit.INSTANCE;
            titleBar.m58940m(viewM46177X4, layoutParams);
            ConstraintLayout layoutOrderInfo = c37626hM46180Z3.f83937c;
            Intrinsics.checkNotNullExpressionValue(layoutOrderInfo, "layoutOrderInfo");
            C27046k.m66685H(layoutOrderInfo);
            if (C27025c.m66566d(p2POrderCardInfo.isBuy())) {
                c37626hM46180Z3.f83936b.setBackgroundResource(R$drawable.shape_oval_primary4);
                c37626hM46180Z3.f83936b.setImageResource(R$drawable.ic2_deposit_bold_20);
                AppCompatImageView ivSide = c37626hM46180Z3.f83936b;
                Intrinsics.checkNotNullExpressionValue(ivSide, "ivSide");
                int i11 = R$color.brandGreen;
                C27046k.m66701p(ivSide, getColorRes(i11));
                c37626hM46180Z3.f83942h.setText(getStringRes(R$string.payment_p2p_chat_buy, p2POrderCardInfo.getCryptoAmount(), p2POrderCardInfo.getCryptoCurrency()));
                HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
                BaseTextView tvTitle = c37626hM46180Z3.f83942h;
                Intrinsics.checkNotNullExpressionValue(tvTitle, "tvTitle");
                highlightTextHelper.m54120f(tvTitle, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(C27017c.f54310a.m66512a(i11))));
                c37626hM46180Z3.f83941g.setText(getStringRes(R$string.payment_price, p2POrderCardInfo.getFiatAmount(), p2POrderCardInfo.getFiatCurrency()));
            } else {
                c37626hM46180Z3.f83936b.setBackgroundResource(R$drawable.shape_oval_secondary4);
                c37626hM46180Z3.f83936b.setImageResource(R$drawable.ic2_withdraw_bold_20);
                AppCompatImageView ivSide2 = c37626hM46180Z3.f83936b;
                Intrinsics.checkNotNullExpressionValue(ivSide2, "ivSide");
                int i12 = R$color.brandRed;
                C27046k.m66701p(ivSide2, getColorRes(i12));
                c37626hM46180Z3.f83942h.setText(getStringRes(R$string.payment_p2p_chat_sell, p2POrderCardInfo.getCryptoAmount(), p2POrderCardInfo.getCryptoCurrency()));
                HighlightTextHelper highlightTextHelper2 = HighlightTextHelper.f43497a;
                BaseTextView tvTitle2 = c37626hM46180Z3.f83942h;
                Intrinsics.checkNotNullExpressionValue(tvTitle2, "tvTitle");
                highlightTextHelper2.m54120f(tvTitle2, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(C27017c.f54310a.m66512a(i12))));
                c37626hM46180Z3.f83941g.setText(getStringRes(R$string.payment_price, p2POrderCardInfo.getFiatAmount(), p2POrderCardInfo.getFiatCurrency()));
            }
            KcSecondaryButton tvDetails = c37626hM46180Z3.f83940f;
            Intrinsics.checkNotNullExpressionValue(tvDetails, "tvDetails");
            C27046k.m66711z(tvDetails, 0L, new Function0() { // from class: com.kubi.payment.chat.ui.a0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChatFragment.m46131P4(p2POrderCardInfo, this);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: X4 */
    public final View m46177X4(ChatViewModel.P2POrderCardInfo p2POrderCardInfo) {
        View viewInflate = LayoutInflater.from(m46184d4()).inflate(R$layout.p2p_chat_title_layout, (ViewGroup) getTitleBar(), false);
        ((BaseTextView) viewInflate.findViewById(R$id.merchant_title)).setText(p2POrderCardInfo.getNickName());
        ((BaseTextView) viewInflate.findViewById(R$id.tv_avatar)).setText(p2POrderCardInfo.getShowLetter());
        viewInflate.findViewById(R$id.view_status).setActivated(Intrinsics.areEqual(p2POrderCardInfo.getOnline(), Boolean.TRUE));
        ImageView imageView = (ImageView) viewInflate.findViewById(R$id.iv_fox_king);
        ImageView imageView2 = (ImageView) viewInflate.findViewById(R$id.iv_gold_business);
        ImageView imageView3 = (ImageView) viewInflate.findViewById(R$id.iv_approve_business);
        if (p2POrderCardInfo.getMerchantQualification() == null) {
            Intrinsics.checkNotNull(imageView);
            C27046k.m66700o(imageView);
            Intrinsics.checkNotNull(imageView2);
            C27046k.m66700o(imageView2);
            Intrinsics.checkNotNull(imageView3);
            C27046k.m66700o(imageView3);
            return viewInflate;
        }
        if (C27025c.m66566d(p2POrderCardInfo.getMerchantQualification().isFoxKing())) {
            Intrinsics.checkNotNull(imageView);
            C27046k.m66685H(imageView);
        } else {
            Intrinsics.checkNotNull(imageView);
            C27046k.m66700o(imageView);
        }
        if (C27025c.m66566d(p2POrderCardInfo.getMerchantQualification().isGoldMerchant())) {
            Intrinsics.checkNotNull(imageView2);
            C27046k.m66685H(imageView2);
        } else {
            Intrinsics.checkNotNull(imageView2);
            C27046k.m66700o(imageView2);
        }
        Intrinsics.checkNotNull(imageView3);
        C27046k.m66685H(imageView3);
        return viewInflate;
    }

    @Override // p638tb.InterfaceC44916c
    /* JADX INFO: renamed from: e2 */
    public void mo46185e2() {
        m46183c4().m46224q(m46186e4());
    }

    /* JADX INFO: renamed from: g4 */
    public final void m46188g4() {
        SwipeRefreshLayout swipeRefreshLayout;
        C37626h c37626hM46180Z3 = m46180Z3();
        if (c37626hM46180Z3 != null && (swipeRefreshLayout = c37626hM46180Z3.f83938d) != null) {
            swipeRefreshLayout.setRefreshing(true);
        }
        m46183c4().m46223n(m46186e4());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    /* JADX INFO: renamed from: i4 */
    public final ChatMessage m46190i4() {
        String to2;
        ChatMessage chatMessageM93790e = null;
        from = null;
        String from = null;
        if (m46178Y3().length() == 0) {
            return null;
        }
        ChatMessage chatMessage = this.f38444h0;
        if (chatMessage != null) {
            return chatMessage;
        }
        C42792a c42792aM46186e4 = m46186e4();
        if (c42792aM46186e4 != null) {
            if (C27025c.m66566d(Boolean.valueOf(m46194n4()))) {
                ChatInfo chatInfoM46187f4 = m46187f4();
                if (chatInfoM46187f4 != null) {
                    to2 = chatInfoM46187f4.getFrom();
                } else {
                    to2 = null;
                }
            } else {
                ChatInfo chatInfoM46187f5 = m46187f4();
                if (chatInfoM46187f5 == null) {
                    to2 = null;
                } else {
                    to2 = chatInfoM46187f5.getTo();
                }
            }
            String strM66668h = C27041f.m66668h(to2);
            if (C27025c.m66566d(Boolean.valueOf(m46194n4()))) {
                ChatInfo chatInfoM46187f6 = m46187f4();
                if (chatInfoM46187f6 != null) {
                    from = chatInfoM46187f6.getTo();
                }
            } else {
                ChatInfo chatInfoM46187f7 = m46187f4();
                if (chatInfoM46187f7 != null) {
                    from = chatInfoM46187f7.getFrom();
                }
            }
            chatMessageM93790e = c42792aM46186e4.m93790e(strM66668h, C27041f.m66668h(from), C27041f.m66668h(m46178Y3()), m46189h4());
        }
        this.f38444h0 = chatMessageM93790e;
        return chatMessageM93790e;
    }

    /* JADX INFO: renamed from: j4 */
    public final void m46191j4() {
        FrameLayout frameLayout;
        InputBottomBar inputBottomBar;
        C37626h c37626hM46180Z3 = m46180Z3();
        if (c37626hM46180Z3 != null && (inputBottomBar = c37626hM46180Z3.f83945k) != null) {
            C27046k.m66700o(inputBottomBar);
        }
        C37626h c37626hM46180Z4 = m46180Z3();
        if (c37626hM46180Z4 != null && (frameLayout = c37626hM46180Z4.f83944j) != null) {
            C27046k.m66685H(frameLayout);
        }
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        C42792a c42792aM46186e4;
        super.onActivityResult(requestCode, resultCode, data);
        if (-1 == resultCode && requestCode == 1 && data != null) {
            String strM45468q = OtcDepend.f38138a.m45468q(data);
            if (!m46174U3(strM45468q)) {
                ToastCompat.m66437C(R$string.pay_chat_pic_un_support_tip);
            } else if (m46176V3(strM45468q) && (c42792aM46186e4 = m46186e4()) != null) {
                C42792a.m93789k(c42792aM46186e4, C27041f.m66668h(strM45468q), m46189h4(), null, null, 12, null);
            }
        }
    }

    /* JADX INFO: renamed from: r4 */
    public final void m46197r4(ChatMessage chatMessage) {
        int iIndexOf = m46181a4().getData().indexOf(new ChatItem(chatMessage));
        if (iIndexOf != -1) {
            ((ChatItem) m46181a4().getData().get(iIndexOf)).getF38449b().setStatus(chatMessage.getStatus());
            m46181a4().notifyItemChanged(iIndexOf);
        }
    }

    /* JADX INFO: renamed from: s4 */
    public final void m46198s4(ChatMessage chatMessage) {
        int iIndexOf = m46181a4().getData().indexOf(new ChatItem(chatMessage));
        if (iIndexOf != -1) {
            ((ChatItem) m46181a4().getData().get(iIndexOf)).getF38449b().setStatus(chatMessage.getStatus());
            m46181a4().notifyItemChanged(iIndexOf);
        } else {
            m46181a4().notifyDataSetChanged();
        }
    }
}
