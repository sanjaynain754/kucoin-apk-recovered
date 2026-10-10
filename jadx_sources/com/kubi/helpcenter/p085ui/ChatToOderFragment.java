package com.kubi.helpcenter.p085ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.helpcenter.R$layout;
import com.kubi.helpcenter.api.local.IHelpCenterService;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p762xi.C46250a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: ChatToOderFragment.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016R\u001d\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/helpcenter/ui/ChatToOderFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "binding", "Lcom/kubi/helpcenter/databinding/FragmentChatToOrderBinding;", "getBinding", "()Lcom/kubi/helpcenter/databinding/FragmentChatToOrderBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "HelpCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nChatToOderFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatToOderFragment.kt\ncom/kubi/helpcenter/ui/ChatToOderFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,37:1\n147#2,16:38\n*S KotlinDebug\n*F\n+ 1 ChatToOderFragment.kt\ncom/kubi/helpcenter/ui/ChatToOderFragment\n*L\n29#1:38,16\n*E\n"})
public final class ChatToOderFragment extends BaseFragment {

    /* JADX INFO: renamed from: V */
    public static final /* synthetic */ KProperty<Object>[] f25338V = {Reflection.property1(new PropertyReference1Impl(ChatToOderFragment.class, "binding", "getBinding()Lcom/kubi/helpcenter/databinding/FragmentChatToOrderBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f25339U = C45681e.m100799e(this, new Function1<ChatToOderFragment, C46250a>() { // from class: com.kubi.helpcenter.ui.ChatToOderFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C46250a invoke(@NotNull ChatToOderFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C46250a.m102005a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C46250a, Unit>() { // from class: com.kubi.helpcenter.ui.ChatToOderFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C46250a it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C46250a c46250a) {
            invoke(c46250a);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l3 */
    public static final Unit m28931l3() {
        IHelpCenterService.m28903c(IHelpCenterService.f25326a.get(), null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k3 */
    public final C46250a m28932k3() {
        return (C46250a) this.f25339U.getValue(this, f25338V[0]);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.fragment_chat_to_order, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Button button;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C46250a c46250aM28932k3 = m28932k3();
        if (c46250aM28932k3 == null || (button = c46250aM28932k3.f103815b) == null) {
            return;
        }
        C27046k.m66711z(button, 0L, new Function0() { // from class: com.kubi.helpcenter.ui.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChatToOderFragment.m28931l3();
            }
        }, 1, null);
    }
}
