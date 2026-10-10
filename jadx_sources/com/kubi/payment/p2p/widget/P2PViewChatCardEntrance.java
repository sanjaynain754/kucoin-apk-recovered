package com.kubi.payment.p2p.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Keep;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.otc.R$layout;
import com.kubi.payment.p2p.trade.MerchantQualificationDialog;
import com.kubi.payment.p2p.widget.P2PViewChatCardEntrance;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27046k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37660n3;
import p658ub.C45148b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: P2PViewChatCardEntrance.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001cB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\u000bJ\u0016\u0010\u0015\u001a\u00020\u00142\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013J\b\u0010\u0017\u001a\u00020\u0014H\u0014J\b\u0010\u0018\u001a\u00020\u0014H\u0002J\u000e\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001bR\u001d\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/payment/p2p/widget/P2PViewChatCardEntrance;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "binding", "Lcom/kubi/otc/databinding/PaymentViewP2pChatCardEntranceBinding;", "getBinding", "()Lcom/kubi/otc/databinding/PaymentViewP2pChatCardEntranceBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onChatListener", "Lkotlin/Function0;", "", "setOnChatClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "onFinishInflate", "initViews", "refreshUI", "p2pChatCardEntranceInfo", "Lcom/kubi/payment/p2p/widget/P2PViewChatCardEntrance$P2PChatCardEntranceInfo;", "P2PChatCardEntranceInfo", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nP2PViewChatCardEntrance.kt\nKotlin\n*S Kotlin\n*F\n+ 1 P2PViewChatCardEntrance.kt\ncom/kubi/payment/p2p/widget/P2PViewChatCardEntrance\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,106:1\n41#2:107\n65#2:108\n80#2,7:109\n*S KotlinDebug\n*F\n+ 1 P2PViewChatCardEntrance.kt\ncom/kubi/payment/p2p/widget/P2PViewChatCardEntrance\n*L\n29#1:107\n29#1:108\n29#1:109,7\n*E\n"})
public final class P2PViewChatCardEntrance extends ConstraintLayout {

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ KProperty<Object>[] f40161p = {Reflection.property1(new PropertyReference1Impl(P2PViewChatCardEntrance.class, "binding", "getBinding()Lcom/kubi/otc/databinding/PaymentViewP2pChatCardEntranceBinding;", 0))};

    /* JADX INFO: renamed from: n */
    @NotNull
    public final InterfaceC24293a f40162n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public Function0<Unit> f40163o;

    /* JADX INFO: compiled from: P2PViewChatCardEntrance.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/payment/p2p/widget/P2PViewChatCardEntrance$P2PChatCardEntranceInfo;", "", "avatar", "", "name", "merchantQualification", "Lcom/kubi/payment/p2p/trade/MerchantQualificationDialog$MerchantQualification;", "chatCount", "", CustomTabsCallback.ONLINE_EXTRAS_KEY, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/payment/p2p/trade/MerchantQualificationDialog$MerchantQualification;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getAvatar", "()Ljava/lang/String;", "getName", "getMerchantQualification", "()Lcom/kubi/payment/p2p/trade/MerchantQualificationDialog$MerchantQualification;", "getChatCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOnline", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class P2PChatCardEntranceInfo {

        @Nullable
        private final String avatar;

        @Nullable
        private final Integer chatCount;

        @Nullable
        private final MerchantQualificationDialog.MerchantQualification merchantQualification;

        @Nullable
        private final String name;

        @Nullable
        private final Boolean online;

        @Nullable
        public final String getAvatar() {
            return this.avatar;
        }

        @Nullable
        public final Integer getChatCount() {
            return this.chatCount;
        }

        @Nullable
        public final MerchantQualificationDialog.MerchantQualification getMerchantQualification() {
            return this.merchantQualification;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        @Nullable
        public final Boolean getOnline() {
            return this.online;
        }

        public P2PChatCardEntranceInfo(@Nullable String str, @Nullable String str2, @Nullable MerchantQualificationDialog.MerchantQualification merchantQualification, @Nullable Integer num, @Nullable Boolean bool) {
            this.avatar = str;
            this.name = str2;
            this.merchantQualification = merchantQualification;
            this.chatCount = num;
            this.online = bool;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2PViewChatCardEntrance(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f40162n = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C37660n3>() { // from class: com.kubi.payment.p2p.widget.P2PViewChatCardEntrance$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C37660n3 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C37660n3.m84904a(C45682f.m100801b(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.payment_view_p2p_chat_card_entrance, this);
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m49413g(P2PViewChatCardEntrance p2PViewChatCardEntrance, C37660n3 c37660n3) {
        Function0<Unit> function0 = p2PViewChatCardEntrance.f40163o;
        if (function0 != null) {
            function0.invoke();
        }
        BaseTextView tvDot = c37660n3.f84338h;
        Intrinsics.checkNotNullExpressionValue(tvDot, "tvDot");
        C27046k.m66700o(tvDot);
        return Unit.INSTANCE;
    }

    private final C37660n3 getBinding() {
        return (C37660n3) this.f40162n.getValue(this, f40161p[0]);
    }

    /* JADX INFO: renamed from: h */
    public final void m49414h(@NotNull P2PChatCardEntranceInfo p2pChatCardEntranceInfo) {
        Intrinsics.checkNotNullParameter(p2pChatCardEntranceInfo, "p2pChatCardEntranceInfo");
        C37660n3 binding = getBinding();
        if (binding == null) {
            return;
        }
        MerchantQualificationDialog.MerchantQualification merchantQualification = p2pChatCardEntranceInfo.getMerchantQualification();
        binding.f84336f.setText(p2pChatCardEntranceInfo.getAvatar());
        View view = binding.f84340j;
        Boolean online = p2pChatCardEntranceInfo.getOnline();
        view.setActivated(online != null ? online.booleanValue() : false);
        binding.f84339i.setText(p2pChatCardEntranceInfo.getName());
        if (merchantQualification == null) {
            LinearLayoutCompat llMerchantQualification = binding.f84335e;
            Intrinsics.checkNotNullExpressionValue(llMerchantQualification, "llMerchantQualification");
            C27046k.m66700o(llMerchantQualification);
        } else {
            LinearLayoutCompat llMerchantQualification2 = binding.f84335e;
            Intrinsics.checkNotNullExpressionValue(llMerchantQualification2, "llMerchantQualification");
            C27046k.m66685H(llMerchantQualification2);
            if (C45148b.m99792b(merchantQualification.isFoxKing())) {
                ImageView ivFoxKing = binding.f84333c;
                Intrinsics.checkNotNullExpressionValue(ivFoxKing, "ivFoxKing");
                C27046k.m66685H(ivFoxKing);
            } else {
                ImageView ivFoxKing2 = binding.f84333c;
                Intrinsics.checkNotNullExpressionValue(ivFoxKing2, "ivFoxKing");
                C27046k.m66700o(ivFoxKing2);
            }
            if (C45148b.m99792b(merchantQualification.isGoldMerchant())) {
                ImageView ivHuangjinBusiness = binding.f84334d;
                Intrinsics.checkNotNullExpressionValue(ivHuangjinBusiness, "ivHuangjinBusiness");
                C27046k.m66685H(ivHuangjinBusiness);
            } else {
                ImageView ivHuangjinBusiness2 = binding.f84334d;
                Intrinsics.checkNotNullExpressionValue(ivHuangjinBusiness2, "ivHuangjinBusiness");
                C27046k.m66700o(ivHuangjinBusiness2);
            }
        }
        int iM66650j = C27039d.m66650j(p2pChatCardEntranceInfo.getChatCount());
        if (iM66650j <= 0) {
            BaseTextView tvDot = binding.f84338h;
            Intrinsics.checkNotNullExpressionValue(tvDot, "tvDot");
            C27046k.m66700o(tvDot);
        } else {
            if (iM66650j > 9) {
                BaseTextView tvDot2 = binding.f84338h;
                Intrinsics.checkNotNullExpressionValue(tvDot2, "tvDot");
                C27046k.m66685H(tvDot2);
                binding.f84338h.setText("9+");
                return;
            }
            BaseTextView tvDot3 = binding.f84338h;
            Intrinsics.checkNotNullExpressionValue(tvDot3, "tvDot");
            C27046k.m66685H(tvDot3);
            binding.f84338h.setText(String.valueOf(iM66650j));
        }
    }

    public final void setOnChatClickListener(@Nullable Function0<Unit> listener) {
        this.f40163o = listener;
    }

    /* JADX INFO: renamed from: f */
    private final void m49412f() {
        final C37660n3 binding = getBinding();
        if (binding == null) {
            return;
        }
        KcPrimaryButton tvChat = binding.f84337g;
        Intrinsics.checkNotNullExpressionValue(tvChat, "tvChat");
        C27046k.m66711z(tvChat, 0L, new Function0() { // from class: hu.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P2PViewChatCardEntrance.m49413g(this.f86122b, binding);
            }
        }, 1, null);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49412f();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public P2PViewChatCardEntrance(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public P2PViewChatCardEntrance(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
