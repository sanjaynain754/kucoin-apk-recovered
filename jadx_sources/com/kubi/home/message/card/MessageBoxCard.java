package com.kubi.home.message.card;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.home.R$layout;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.kucoin.home.cards.SimpleStateCard;
import com.kubi.notice.api.service.INoticeService;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.core.ViewExtKt;
import dj.C36716a;
import fj.C37507a;
import io.chad.library.adapter.base.BaseQuickAdapter;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: MessageBoxCard.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0014J\f\u0010\u0012\u001a\u00020\u000e*\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u000eH\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0014R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/home/message/card/MessageBoxCard;", "Lcom/kubi/kucoin/home/cards/SimpleStateCard;", "Lcom/kubi/home/message/card/MessageBoxContract$MessageBoxUIState;", "<init>", "()V", "fragmentCardMessageBoxBinding", "Lcom/kubi/home/databinding/FragmentCardMessageBoxBinding;", "getFragmentCardMessageBoxBinding", "()Lcom/kubi/home/databinding/FragmentCardMessageBoxBinding;", "fragmentCardMessageBoxBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "mAdapter", "Lcom/kubi/home/message/card/MessageBoxListAdapter;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initView", "handleItemJump", "Lcom/kubi/home/message/card/MessageBox;", "bindState", "getLayout", "", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/home/message/card/MessageBoxVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMessageBoxCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageBoxCard.kt\ncom/kubi/home/message/card/MessageBoxCard\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,95:1\n147#2,16:96\n158#3,2:112\n81#3,2:114\n*S KotlinDebug\n*F\n+ 1 MessageBoxCard.kt\ncom/kubi/home/message/card/MessageBoxCard\n*L\n30#1:96,16\n41#1:112,2\n61#1:114,2\n*E\n"})
public final class MessageBoxCard extends SimpleStateCard<MessageBoxUIState> {

    /* JADX INFO: renamed from: a0 */
    public static final /* synthetic */ KProperty<Object>[] f25837a0 = {Reflection.property1(new PropertyReference1Impl(MessageBoxCard.class, "fragmentCardMessageBoxBinding", "getFragmentCardMessageBoxBinding()Lcom/kubi/home/databinding/FragmentCardMessageBoxBinding;", 0))};

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC24293a f25838X = C45681e.m100799e(this, new Function1<MessageBoxCard, C37507a>() { // from class: com.kubi.home.message.card.MessageBoxCard$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37507a invoke(@NotNull MessageBoxCard fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37507a.m84472a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37507a, Unit>() { // from class: com.kubi.home.message.card.MessageBoxCard$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37507a it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37507a c37507a) {
            invoke(c37507a);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final MessageBoxListAdapter f25839Y = new MessageBoxListAdapter(new ArrayList());

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final KClass<MessageBoxVM> f25840Z = Reflection.getOrCreateKotlinClass(MessageBoxVM.class);

    /* JADX INFO: renamed from: com.kubi.home.message.card.MessageBoxCard$bindState$2 */
    /* JADX INFO: compiled from: MessageBoxCard.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "data", "", "Lcom/kubi/home/message/card/MessageBox;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.home.message.card.MessageBoxCard$bindState$2", m90122f = "MessageBoxCard.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C146642 extends SuspendLambda implements Function2<List<? extends MessageBox>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends MessageBox> list, Continuation<? super Unit> continuation) {
            return invoke2((List<MessageBox>) list, continuation);
        }

        public C146642(Continuation<? super C146642> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C146642 c146642 = MessageBoxCard.this.new C146642(continuation);
            c146642.L$0 = obj;
            return c146642;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<MessageBox> list, Continuation<? super Unit> continuation) {
            return ((C146642) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MessageBoxCard.this.f25839Y.replaceData(list);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: q3 */
    public static final Unit m29517q3(MessageBoxCard messageBoxCard, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        messageBoxCard.sendIntent(MessageBoxContract$MessageBoxIntent.DeleteCardIntent.INSTANCE);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardFragment
    public int getLayout() {
        return R$layout.fragment_card_message_box;
    }

    @Override // com.kubi.kucoin.home.cards.BaseStateCard
    @NotNull
    public KClass<MessageBoxVM> getVmClass() {
        return this.f25840Z;
    }

    /* JADX INFO: renamed from: n3 */
    public final C37507a m29518n3() {
        return (C37507a) this.f25838X.getValue(this, f25837a0[0]);
    }

    /* JADX INFO: renamed from: p3 */
    public static final void m29516p3(MessageBoxListAdapter messageBoxListAdapter, MessageBoxCard messageBoxCard, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        MessageBox item = messageBoxListAdapter.getItem(i11);
        if (item != null) {
            messageBoxCard.sendIntent(new MessageBoxContract$MessageBoxIntent.ClickMessageIntent(item));
            messageBoxCard.m29519o3(item);
        }
    }

    @Override // com.kubi.kucoin.home.cards.BaseStateCard
    public void bindState() {
        super.bindState();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.home.message.card.MessageBoxCard.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((MessageBoxUIState) obj).getData();
            }
        }, new C146642(null));
    }

    @Override // com.kubi.kucoin.home.cards.BaseStateCard
    public void initView() {
        FrameLayout frameLayout;
        RecyclerView recyclerView;
        super.initView();
        C37507a c37507aM29518n3 = m29518n3();
        if (c37507aM29518n3 != null && (recyclerView = c37507aM29518n3.f83205c) != null) {
            final MessageBoxListAdapter messageBoxListAdapter = this.f25839Y;
            messageBoxListAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.home.message.card.b
                @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
                public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                    MessageBoxCard.m29516p3(messageBoxListAdapter, this, baseQuickAdapter, view, i11);
                }
            });
            recyclerView.setAdapter(messageBoxListAdapter);
        }
        C37507a c37507aM29518n4 = m29518n3();
        if (c37507aM29518n4 != null && (frameLayout = c37507aM29518n4.f83204b) != null) {
            ViewExtKt.m66575f(frameLayout, new Function1() { // from class: com.kubi.home.message.card.c
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MessageBoxCard.m29517q3(this.f25847b, (View) obj);
                }
            });
        }
        if (C12573b.f21598a.m23696a()) {
            "message_box_data".length();
        }
        C12572a.m23692a(this, false, new MessageBoxCard$initView$$inlined$bindFlowEvent$1("message_box_data", null, this));
        C36716a.m82245h(HomeCardViewHolderProxy.PAGE_ID, "messageBoxClose", "1", null, 8, null);
    }

    /* JADX INFO: renamed from: o3 */
    public final void m29519o3(MessageBox messageBox) {
        Integer boxType = messageBox.getBoxType();
        if (boxType != null && boxType.intValue() == 1) {
            INoticeService.f36364a.get().mo43134c();
            return;
        }
        String url = messageBox.getUrl();
        if (url != null && url.length() != 0) {
            RouteExKt.m56217H(messageBox.getUrl());
        } else {
            INoticeService.f36364a.get().mo43134c();
        }
    }

    @Override // com.kubi.kucoin.home.cards.BaseStateCard, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (C12573b.f21598a.m23696a()) {
            "remove_message_box_card".length();
        }
        C12572a.m23692a(this, false, new MessageBoxCard$onCreate$$inlined$bindFlowEvent$1("remove_message_box_card", null, this));
    }
}
