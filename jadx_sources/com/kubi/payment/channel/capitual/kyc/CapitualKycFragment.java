package com.kubi.payment.channel.capitual.kyc;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CompoundButton;
import androidx.credentials.provider.CredentialEntry;
import androidx.lifecycle.Observer;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.FastQuoteModel;
import com.kubi.payment.channel.base.OldBaseChannelFragment;
import com.kubi.payment.channel.data.entities.ChannelKycRequest;
import com.kubi.payment.channel.data.entities.ChannelKycStatus;
import com.kubi.payment.channel.data.entities.ChannelUserInfo;
import com.kubi.payment.common.data.entities.Country;
import com.kubi.payment.flutter.FlutterUtils;
import com.kubi.payment.track.IPaymentTrack;
import com.kubi.payment.track.RechargeTrackData;
import com.kubi.payment.track.WithdrawTrackData;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.AlignTopCheckBox;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.FilterEmojiEditText;
import com.kubi.router.core.Router;
import com.kubi.router.model.IRedirect;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37758j;
import g00.InterfaceC37766r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37621g;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45681e;

/* JADX INFO: compiled from: CapitualKycFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0014J\u001a\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020!H\u0016J\u0012\u0010'\u001a\u00020!2\b\b\u0002\u0010(\u001a\u00020\u0015H\u0002J\b\u0010)\u001a\u00020!H\u0002J\b\u0010*\u001a\u00020!H\u0015J\b\u0010+\u001a\u00020!H\u0016J\b\u0010,\u001a\u00020!H\u0002J\b\u0010-\u001a\u00020!H\u0002J\b\u0010.\u001a\u00020\u0015H\u0002J\u0010\u0010/\u001a\u00020!2\u0006\u00100\u001a\u00020\u0006H\u0002J\u0010\u00101\u001a\u00020!2\u0006\u00100\u001a\u00020\u0006H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\bR\u001b\u0010\u000e\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u000f\u0010\bR\u001b\u0010\u0011\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0012\u0010\bR\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019¨\u00062"}, m90084d2 = {"Lcom/kubi/payment/channel/capitual/kyc/CapitualKycFragment;", "Lcom/kubi/payment/channel/base/OldBaseChannelFragment;", "Lcom/kubi/payment/channel/capitual/kyc/CapitualKycViewModel;", "<init>", "()V", "tradeType", "", "getTradeType", "()Ljava/lang/String;", "tradeType$delegate", "Lkotlin/Lazy;", "paymentMethodCode", "getPaymentMethodCode", "paymentMethodCode$delegate", "channelId", "getChannelId", "channelId$delegate", "fiatCurrency", "getFiatCurrency", "fiatCurrency$delegate", "needShowCompleteDialog", "", "binding", "Lcom/kubi/otc/databinding/BotcFragmentCapitualKycBinding;", "getBinding", "()Lcom/kubi/otc/databinding/BotcFragmentCapitualKycBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "viewModelClass", "Lkotlin/reflect/KClass;", "getLayout", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "initViews", "submit", "isDoubleCheck", "enabledConfirm", "observeData", "onResume", "showCompleteDialog", "showUnverifiedDialog", "isWithdraw", "trackCheckChannelUserInfo", "errorInfo", "trackCheckKycComplete", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCapitualKycFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CapitualKycFragment.kt\ncom/kubi/payment/channel/capitual/kyc/CapitualKycFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,252:1\n147#2,16:253\n76#3,7:269\n58#4,23:276\n93#4,3:299\n58#4,23:302\n93#4,3:325\n58#4,23:328\n93#4,3:351\n*S KotlinDebug\n*F\n+ 1 CapitualKycFragment.kt\ncom/kubi/payment/channel/capitual/kyc/CapitualKycFragment\n*L\n59#1:253,16\n72#1:269,7\n94#1:276,23\n94#1:299,3\n97#1:302,23\n97#1:325,3\n100#1:328,23\n100#1:351,3\n*E\n"})
public final class CapitualKycFragment extends OldBaseChannelFragment<CapitualKycViewModel> {

    /* JADX INFO: renamed from: b0 */
    public static final /* synthetic */ KProperty<Object>[] f38220b0 = {Reflection.property1(new PropertyReference1Impl(CapitualKycFragment.class, "binding", "getBinding()Lcom/kubi/otc/databinding/BotcFragmentCapitualKycBinding;", 0))};

    /* JADX INFO: renamed from: Z */
    public boolean f38225Z;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f38221V = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.channel.capitual.kyc.m
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CapitualKycFragment.m45693m4(this.f38252b);
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f38222W = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.channel.capitual.kyc.n
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CapitualKycFragment.m45689d4(this.f38253b);
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f38223X = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.channel.capitual.kyc.o
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CapitualKycFragment.m45676M3(this.f38254b);
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f38224Y = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.channel.capitual.kyc.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CapitualKycFragment.m45677O3(this.f38241b);
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final InterfaceC24293a f38226a0 = C45681e.m100799e(this, new Function1<CapitualKycFragment, C37621g>() { // from class: com.kubi.payment.channel.capitual.kyc.CapitualKycFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37621g invoke(@NotNull CapitualKycFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37621g.m84822a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37621g, Unit>() { // from class: com.kubi.payment.channel.capitual.kyc.CapitualKycFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37621g it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37621g c37621g) {
            invoke(c37621g);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: com.kubi.payment.channel.capitual.kyc.CapitualKycFragment$a */
    /* JADX INFO: compiled from: TextView.kt */
    /* JADX INFO: loaded from: classes33.dex */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0010"}, m90084d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "core-ktx_release", "androidx/core/widget/TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 CapitualKycFragment.kt\ncom/kubi/payment/channel/capitual/kyc/CapitualKycFragment\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n95#2,2:98\n71#3:100\n77#4:101\n*E\n"})
    public static final class C20300a implements TextWatcher {
        public C20300a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable s11) {
            CapitualKycFragment.this.m45700N3();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.channel.capitual.kyc.CapitualKycFragment$b */
    /* JADX INFO: compiled from: TextView.kt */
    /* JADX INFO: loaded from: classes33.dex */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0010"}, m90084d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "core-ktx_release", "androidx/core/widget/TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 CapitualKycFragment.kt\ncom/kubi/payment/channel/capitual/kyc/CapitualKycFragment\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n98#2,2:98\n71#3:100\n77#4:101\n*E\n"})
    public static final class C20301b implements TextWatcher {
        public C20301b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable s11) {
            CapitualKycFragment.this.m45700N3();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.channel.capitual.kyc.CapitualKycFragment$c */
    /* JADX INFO: compiled from: TextView.kt */
    /* JADX INFO: loaded from: classes33.dex */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0010"}, m90084d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "core-ktx_release", "androidx/core/widget/TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 CapitualKycFragment.kt\ncom/kubi/payment/channel/capitual/kyc/CapitualKycFragment\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n101#2,2:98\n71#3:100\n77#4:101\n*E\n"})
    public static final class C20302c implements TextWatcher {
        public C20302c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable s11) {
            CapitualKycFragment.this.m45700N3();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.channel.capitual.kyc.CapitualKycFragment$d */
    /* JADX INFO: compiled from: CapitualKycFragment.kt */
    /* JADX INFO: loaded from: classes33.dex */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/payment/channel/capitual/kyc/CapitualKycFragment$observeData$2$1", "Lcom/kubi/router/model/IRedirect;", "redirect", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20303d implements IRedirect {
        public C20303d() {
        }

        @Override // com.kubi.router.model.IRedirect
        /* JADX INFO: renamed from: a */
        public void mo45709a() {
            CapitualKycFragment.this.f38225Z = true;
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.channel.capitual.kyc.CapitualKycFragment$e */
    /* JADX INFO: compiled from: CapitualKycFragment.kt */
    /* JADX INFO: loaded from: classes33.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20304e implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f38231b;

        public C20304e(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f38231b = function;
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
            return this.f38231b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f38231b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: U3 */
    public static final Unit m45681U3(CapitualKycFragment capitualKycFragment) {
        m45692j4(capitualKycFragment, false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f4 */
    public static final void m45690f4(CapitualKycFragment capitualKycFragment, DialogInterface dialogInterface, int i11) {
        capitualKycFragment.m45706i4(true);
    }

    /* JADX INFO: renamed from: K2 */
    private final String m45673K2() {
        return (String) this.f38224Y.getValue();
    }

    /* JADX INFO: renamed from: Q3 */
    private final String m45678Q3() {
        return (String) this.f38223X.getValue();
    }

    /* JADX INFO: renamed from: S3 */
    private final String m45679S3() {
        return (String) this.f38221V.getValue();
    }

    /* JADX INFO: renamed from: T3 */
    public static final Unit m45680T3(CapitualKycFragment capitualKycFragment) {
        Router.f46192a.m56184f(FlutterUtils.m48217b(FlutterUtils.f39512a, "payment/channel/selectCountry", false, 2, null)).m4038a("isFromNative", CredentialEntry.TRUE_STRING).m4038a("mode", "1").m4038a("paymentMethodCode", capitualKycFragment.m45702R3()).m4038a("channelId", capitualKycFragment.m45678Q3()).m4048k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V3 */
    public static final Unit m45682V3(CapitualKycFragment capitualKycFragment, CompoundButton compoundButton, boolean z11) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        capitualKycFragment.m45700N3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z3 */
    public static final Unit m45685Z3(CapitualKycFragment capitualKycFragment, String str) {
        if (Intrinsics.areEqual(str, ChannelKycStatus.UNVERIFIED)) {
            capitualKycFragment.m45705g4();
        } else {
            InterfaceC37758j.a.m85152a(C37304a.f82764a, capitualKycFragment.m45679S3(), capitualKycFragment.m45678Q3(), capitualKycFragment.m45673K2(), null, null, null, 56, null);
            capitualKycFragment.preformBackPressed();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j4 */
    public static /* synthetic */ void m45692j4(CapitualKycFragment capitualKycFragment, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        capitualKycFragment.m45706i4(z11);
    }

    /* JADX INFO: renamed from: P3 */
    public final C37621g m45701P3() {
        return (C37621g) this.f38226a0.getValue(this, f38220b0[0]);
    }

    /* JADX INFO: renamed from: R3 */
    public final String m45702R3() {
        return (String) this.f38222W.getValue();
    }

    /* JADX INFO: renamed from: e4 */
    public final void m45704e4() {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.pay_fiat_capitual_kyc_completed_dialog_title).m54153J4(R$string.pay_fiat_capitual_kyc_completed_dialog_message).m54162S4(R$string.pay_fiat_capitual_i_have_completed, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.channel.capitual.kyc.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                CapitualKycFragment.m45690f4(this.f38240b, dialogInterface, i11);
            }
        }).m54151H4(false).m54172c5(getChildFragmentManager());
    }

    /* JADX INFO: renamed from: g4 */
    public final void m45705g4() {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.pay_fiat_kyc_verification_not_submitted).m54153J4(R$string.pay_fiat_kyc_verification_not_submitted_description).m54162S4(R$string.pay_advcash_withdraw_result_retry, null).m54159P4(R$string.pay_fiat_capitual_i_will_do_it_later, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.channel.capitual.kyc.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                CapitualKycFragment.m45691h4(this.f38245b, dialogInterface, i11);
            }
        }).m54172c5(getChildFragmentManager());
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.botc_fragment_capitual_kyc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.base.BaseFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (C12573b.f21598a.m23696a()) {
            "PAYMENT_EVENT_SELECT_COUNTRY".length();
        }
        C12572a.m23692a(this, false, new C20305x218d8d3e("PAYMENT_EVENT_SELECT_COUNTRY", null, this));
        ((CapitualKycViewModel) m45631m3()).m45728J();
    }

    @Override // com.kubi.payment.base.BaseFragment
    @NotNull
    /* JADX INFO: renamed from: s3 */
    public KClass<CapitualKycViewModel> mo45635s3() {
        return Reflection.getOrCreateKotlinClass(CapitualKycViewModel.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K3 */
    public static final /* synthetic */ CapitualKycViewModel m45674K3(CapitualKycFragment capitualKycFragment) {
        return (CapitualKycViewModel) capitualKycFragment.m45631m3();
    }

    /* JADX INFO: renamed from: M3 */
    public static final String m45676M3(CapitualKycFragment capitualKycFragment) {
        String string;
        Bundle arguments = capitualKycFragment.getArguments();
        if (arguments != null) {
            string = arguments.getString("channelId");
        } else {
            string = null;
        }
        return C27041f.m66668h(string);
    }

    /* JADX INFO: renamed from: O3 */
    public static final String m45677O3(CapitualKycFragment capitualKycFragment) {
        String string;
        Bundle arguments = capitualKycFragment.getArguments();
        if (arguments != null) {
            string = arguments.getString("fiatCurrency");
        } else {
            string = null;
        }
        return C27041f.m66668h(string);
    }

    /* JADX INFO: renamed from: X3 */
    public static final Unit m45683X3(CapitualKycFragment capitualKycFragment, ChannelUserInfo channelUserInfo) {
        FilterEmojiEditText filterEmojiEditText;
        FilterEmojiEditText filterEmojiEditText2;
        Editable text;
        FilterEmojiEditText filterEmojiEditText3;
        FilterEmojiEditText filterEmojiEditText4;
        Integer numValueOf;
        FilterEmojiEditText filterEmojiEditText5;
        Editable text2;
        FilterEmojiEditText filterEmojiEditText6;
        FilterEmojiEditText filterEmojiEditText7;
        Integer numValueOf2;
        FilterEmojiEditText filterEmojiEditText8;
        Editable text3;
        FilterEmojiEditText filterEmojiEditText9;
        BaseTextView baseTextView;
        C37621g c37621gM45701P3 = capitualKycFragment.m45701P3();
        if (c37621gM45701P3 != null && (baseTextView = c37621gM45701P3.f83893g) != null) {
            baseTextView.setText('+' + channelUserInfo.getPhoneAreaCode());
        }
        C37621g c37621gM45701P4 = capitualKycFragment.m45701P3();
        if (c37621gM45701P4 != null && (filterEmojiEditText9 = c37621gM45701P4.f83891e) != null) {
            filterEmojiEditText9.setText(C27041f.m66668h(channelUserInfo.getRealPhoneNumber()));
        }
        C37621g c37621gM45701P5 = capitualKycFragment.m45701P3();
        Integer numValueOf3 = null;
        if (c37621gM45701P5 != null && (filterEmojiEditText7 = c37621gM45701P5.f83891e) != null) {
            C37621g c37621gM45701P6 = capitualKycFragment.m45701P3();
            if (c37621gM45701P6 != null && (filterEmojiEditText8 = c37621gM45701P6.f83891e) != null && (text3 = filterEmojiEditText8.getText()) != null) {
                numValueOf2 = Integer.valueOf(text3.length());
            } else {
                numValueOf2 = null;
            }
            filterEmojiEditText7.setSelection(C27039d.m66650j(numValueOf2));
        }
        C37621g c37621gM45701P7 = capitualKycFragment.m45701P3();
        if (c37621gM45701P7 != null && (filterEmojiEditText6 = c37621gM45701P7.f83889c) != null) {
            filterEmojiEditText6.setText(channelUserInfo.getEmailAddress());
        }
        C37621g c37621gM45701P8 = capitualKycFragment.m45701P3();
        if (c37621gM45701P8 != null && (filterEmojiEditText4 = c37621gM45701P8.f83889c) != null) {
            C37621g c37621gM45701P9 = capitualKycFragment.m45701P3();
            if (c37621gM45701P9 != null && (filterEmojiEditText5 = c37621gM45701P9.f83889c) != null && (text2 = filterEmojiEditText5.getText()) != null) {
                numValueOf = Integer.valueOf(text2.length());
            } else {
                numValueOf = null;
            }
            filterEmojiEditText4.setSelection(C27039d.m66650j(numValueOf));
        }
        C37621g c37621gM45701P10 = capitualKycFragment.m45701P3();
        if (c37621gM45701P10 != null && (filterEmojiEditText3 = c37621gM45701P10.f83890d) != null) {
            filterEmojiEditText3.setText(C27041f.m66668h(channelUserInfo.getName()));
        }
        C37621g c37621gM45701P11 = capitualKycFragment.m45701P3();
        if (c37621gM45701P11 != null && (filterEmojiEditText = c37621gM45701P11.f83890d) != null) {
            C37621g c37621gM45701P12 = capitualKycFragment.m45701P3();
            if (c37621gM45701P12 != null && (filterEmojiEditText2 = c37621gM45701P12.f83890d) != null && (text = filterEmojiEditText2.getText()) != null) {
                numValueOf3 = Integer.valueOf(text.length());
            }
            filterEmojiEditText.setSelection(C27039d.m66650j(numValueOf3));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y3 */
    public static final Unit m45684Y3(CapitualKycFragment capitualKycFragment, String str) {
        CapitualKycViewModel capitualKycViewModel = (CapitualKycViewModel) capitualKycFragment.m45631m3();
        Intrinsics.checkNotNull(str);
        InterfaceC37766r.a.m85190a(C37304a.f82764a, capitualKycViewModel.m45719A(str, capitualKycFragment.m45679S3(), capitualKycFragment.m45673K2()), null, null, null, null, capitualKycFragment.new C20303d(), null, 94, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a4 */
    public static final Unit m45686a4(CapitualKycFragment capitualKycFragment, String str) {
        Intrinsics.checkNotNull(str);
        capitualKycFragment.m45707k4(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b4 */
    public static final Unit m45687b4(CapitualKycFragment capitualKycFragment, String str) {
        Intrinsics.checkNotNull(str);
        capitualKycFragment.m45708l4(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c4 */
    public static final Unit m45688c4(CapitualKycFragment capitualKycFragment, Country country) {
        C37621g c37621gM45701P3;
        BaseTextView baseTextView;
        String strM66668h = C27041f.m66668h(country.getPhoneAreaCode());
        if (strM66668h.length() > 0 && (c37621gM45701P3 = capitualKycFragment.m45701P3()) != null && (baseTextView = c37621gM45701P3.f83893g) != null) {
            baseTextView.setText(strM66668h);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d4 */
    public static final String m45689d4(CapitualKycFragment capitualKycFragment) {
        String string;
        Bundle arguments = capitualKycFragment.getArguments();
        if (arguments != null) {
            string = arguments.getString("paymentMethodCode");
        } else {
            string = null;
        }
        return C27041f.m66668h(string);
    }

    /* JADX INFO: renamed from: h4 */
    public static final void m45691h4(CapitualKycFragment capitualKycFragment, DialogInterface dialogInterface, int i11) {
        capitualKycFragment.preformBackPressed();
    }

    /* JADX INFO: renamed from: m4 */
    public static final String m45693m4(CapitualKycFragment capitualKycFragment) {
        String string;
        Bundle arguments = capitualKycFragment.getArguments();
        if (arguments != null) {
            string = arguments.getString("tradeType");
        } else {
            string = null;
        }
        return C27041f.m66669i(string, FastQuoteModel.PAY_RECHARGE);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x008d  */
    /* JADX INFO: renamed from: N3 */
    public final void m45700N3() {
        BaseTextView baseTextView;
        CharSequence text;
        boolean z11;
        Editable text2;
        Editable text3;
        Editable text4;
        AlignTopCheckBox alignTopCheckBox;
        FilterEmojiEditText filterEmojiEditText;
        FilterEmojiEditText filterEmojiEditText2;
        FilterEmojiEditText filterEmojiEditText3;
        BaseTextView baseTextView2;
        C37621g c37621gM45701P3 = m45701P3();
        if (c37621gM45701P3 != null && (baseTextView = c37621gM45701P3.f83894h) != null) {
            C37621g c37621gM45701P4 = m45701P3();
            Boolean boolValueOf = null;
            if (c37621gM45701P4 != null && (baseTextView2 = c37621gM45701P4.f83893g) != null) {
                text = baseTextView2.getText();
            } else {
                text = null;
            }
            if (String.valueOf(text).length() > 0) {
                C37621g c37621gM45701P5 = m45701P3();
                if (c37621gM45701P5 != null && (filterEmojiEditText3 = c37621gM45701P5.f83891e) != null) {
                    text2 = filterEmojiEditText3.getText();
                } else {
                    text2 = null;
                }
                if (String.valueOf(text2).length() > 0) {
                    C37621g c37621gM45701P6 = m45701P3();
                    if (c37621gM45701P6 != null && (filterEmojiEditText2 = c37621gM45701P6.f83889c) != null) {
                        text3 = filterEmojiEditText2.getText();
                    } else {
                        text3 = null;
                    }
                    if (String.valueOf(text3).length() > 0) {
                        C37621g c37621gM45701P7 = m45701P3();
                        if (c37621gM45701P7 != null && (filterEmojiEditText = c37621gM45701P7.f83890d) != null) {
                            text4 = filterEmojiEditText.getText();
                        } else {
                            text4 = null;
                        }
                        if (String.valueOf(text4).length() > 0) {
                            C37621g c37621gM45701P8 = m45701P3();
                            if (c37621gM45701P8 != null && (alignTopCheckBox = c37621gM45701P8.f83888b) != null) {
                                boolValueOf = Boolean.valueOf(alignTopCheckBox.isChecked());
                            }
                            if (C27025c.m66566d(boolValueOf)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                        } else {
                            z11 = false;
                        }
                    } else {
                        z11 = false;
                    }
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            baseTextView.setEnabled(z11);
        }
    }

    /* JADX INFO: renamed from: W3 */
    public final boolean m45703W3() {
        return Intrinsics.areEqual(m45679S3(), "WITHDRAW");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i4 */
    public final void m45706i4(boolean z11) {
        Editable text;
        Editable text2;
        String str;
        CharSequence text3;
        FilterEmojiEditText filterEmojiEditText;
        BaseTextView baseTextView;
        FilterEmojiEditText filterEmojiEditText2;
        FilterEmojiEditText filterEmojiEditText3;
        CapitualKycViewModel capitualKycViewModel = (CapitualKycViewModel) m45631m3();
        String strM45678Q3 = m45678Q3();
        C37621g c37621gM45701P3 = m45701P3();
        if (c37621gM45701P3 != null && (filterEmojiEditText3 = c37621gM45701P3.f83890d) != null) {
            text = filterEmojiEditText3.getText();
        } else {
            text = null;
        }
        String strValueOf = String.valueOf(text);
        C37621g c37621gM45701P4 = m45701P3();
        if (c37621gM45701P4 != null && (filterEmojiEditText2 = c37621gM45701P4.f83889c) != null) {
            text2 = filterEmojiEditText2.getText();
        } else {
            text2 = null;
        }
        String strValueOf2 = String.valueOf(text2);
        Editable text4 = null;
        String strM45673K2 = m45673K2();
        if (Intrinsics.areEqual(m45679S3(), "WITHDRAW")) {
            str = ChannelKycRequest.SCENE_WITHDRAW;
        } else {
            str = ChannelKycRequest.SCENE_DEPOSIT;
        }
        StringBuilder sb2 = new StringBuilder();
        C37621g c37621gM45701P5 = m45701P3();
        if (c37621gM45701P5 != null && (baseTextView = c37621gM45701P5.f83893g) != null) {
            text3 = baseTextView.getText();
        } else {
            text3 = null;
        }
        sb2.append(StringsKt.trim((CharSequence) StringsKt.replace$default(String.valueOf(text3), "+", "", false, 4, (Object) null)).toString());
        sb2.append('-');
        C37621g c37621gM45701P6 = m45701P3();
        if (c37621gM45701P6 != null && (filterEmojiEditText = c37621gM45701P6.f83891e) != null) {
            text4 = filterEmojiEditText.getText();
        }
        sb2.append(StringsKt.trim((CharSequence) String.valueOf(text4)).toString());
        capitualKycViewModel.m45727I(new ChannelKycRequest(strM45678Q3, strValueOf, strValueOf2, strM45673K2, str, null, sb2.toString(), 32, null), z11);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m45707k4(String str) {
        if (m45703W3()) {
            IPaymentTrack track = IPaymentTrack.f40346a.getTrack();
            WithdrawTrackData withdrawTrackData = new WithdrawTrackData(m45678Q3());
            withdrawTrackData.setFiatCurrency(m45673K2());
            Unit unit = Unit.INSTANCE;
            IPaymentTrack.m49795f(track, "CHECK_CHANNEL_USERINFO", false, str, withdrawTrackData, 2, null);
            return;
        }
        IPaymentTrack track2 = IPaymentTrack.f40346a.getTrack();
        RechargeTrackData rechargeTrackData = new RechargeTrackData(m45678Q3());
        rechargeTrackData.setFiatCurrency(m45673K2());
        Unit unit2 = Unit.INSTANCE;
        IPaymentTrack.m49794e(track2, "CHECK_CHANNEL_USERINFO", false, str, rechargeTrackData, 2, null);
    }

    /* JADX INFO: renamed from: l4 */
    public final void m45708l4(String str) {
        if (m45703W3()) {
            IPaymentTrack track = IPaymentTrack.f40346a.getTrack();
            WithdrawTrackData withdrawTrackData = new WithdrawTrackData(m45678Q3());
            withdrawTrackData.setFiatCurrency(m45673K2());
            Unit unit = Unit.INSTANCE;
            IPaymentTrack.m49795f(track, "CHECK_CAPITUAL_KYC_COMPLETE", false, str, withdrawTrackData, 2, null);
            return;
        }
        IPaymentTrack track2 = IPaymentTrack.f40346a.getTrack();
        RechargeTrackData rechargeTrackData = new RechargeTrackData(m45678Q3());
        rechargeTrackData.setFiatCurrency(m45673K2());
        Unit unit2 = Unit.INSTANCE;
        IPaymentTrack.m49794e(track2, "CHECK_CAPITUAL_KYC_COMPLETE", false, str, rechargeTrackData, 2, null);
    }

    @Override // com.kubi.payment.base.BaseFragment
    /* JADX INFO: renamed from: n3 */
    public void mo45632n3() {
        FilterEmojiEditText filterEmojiEditText;
        FilterEmojiEditText filterEmojiEditText2;
        FilterEmojiEditText filterEmojiEditText3;
        AlignTopCheckBox alignTopCheckBox;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        C37621g c37621gM45701P3 = m45701P3();
        if (c37621gM45701P3 != null && (baseTextView2 = c37621gM45701P3.f83893g) != null) {
            C27046k.m66711z(baseTextView2, 0L, new Function0() { // from class: com.kubi.payment.channel.capitual.kyc.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CapitualKycFragment.m45680T3(this.f38242b);
                }
            }, 1, null);
        }
        C37621g c37621gM45701P4 = m45701P3();
        if (c37621gM45701P4 != null && (baseTextView = c37621gM45701P4.f83894h) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.payment.channel.capitual.kyc.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CapitualKycFragment.m45681U3(this.f38243b);
                }
            }, 1, null);
        }
        C37621g c37621gM45701P5 = m45701P3();
        if (c37621gM45701P5 != null && (alignTopCheckBox = c37621gM45701P5.f83888b) != null) {
            C27046k.m66708w(alignTopCheckBox, new Function2() { // from class: com.kubi.payment.channel.capitual.kyc.e
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CapitualKycFragment.m45682V3(this.f38244b, (CompoundButton) obj, ((Boolean) obj2).booleanValue());
                }
            });
        }
        C37621g c37621gM45701P6 = m45701P3();
        if (c37621gM45701P6 != null && (filterEmojiEditText3 = c37621gM45701P6.f83891e) != null) {
            filterEmojiEditText3.addTextChangedListener(new C20300a());
        }
        C37621g c37621gM45701P7 = m45701P3();
        if (c37621gM45701P7 != null && (filterEmojiEditText2 = c37621gM45701P7.f83889c) != null) {
            filterEmojiEditText2.addTextChangedListener(new C20301b());
        }
        C37621g c37621gM45701P8 = m45701P3();
        if (c37621gM45701P8 != null && (filterEmojiEditText = c37621gM45701P8.f83890d) != null) {
            filterEmojiEditText.addTextChangedListener(new C20302c());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.base.BaseFragment
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: o3 */
    public void mo45633o3() {
        super.mo45633o3();
        ((CapitualKycViewModel) m45631m3()).m45725G().observe(getViewLifecycleOwner(), new C20304e(new Function1() { // from class: com.kubi.payment.channel.capitual.kyc.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CapitualKycFragment.m45683X3(this.f38246b, (ChannelUserInfo) obj);
            }
        }));
        ((CapitualKycViewModel) m45631m3()).m45726H().observe(getViewLifecycleOwner(), new C20304e(new Function1() { // from class: com.kubi.payment.channel.capitual.kyc.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CapitualKycFragment.m45684Y3(this.f38247b, (String) obj);
            }
        }));
        ((CapitualKycViewModel) m45631m3()).m45721C().observe(getViewLifecycleOwner(), new C20304e(new Function1() { // from class: com.kubi.payment.channel.capitual.kyc.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CapitualKycFragment.m45685Z3(this.f38248b, (String) obj);
            }
        }));
        ((CapitualKycViewModel) m45631m3()).m45723E().observe(getViewLifecycleOwner(), new C20304e(new Function1() { // from class: com.kubi.payment.channel.capitual.kyc.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CapitualKycFragment.m45686a4(this.f38249b, (String) obj);
            }
        }));
        ((CapitualKycViewModel) m45631m3()).m45722D().observe(getViewLifecycleOwner(), new C20304e(new Function1() { // from class: com.kubi.payment.channel.capitual.kyc.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CapitualKycFragment.m45687b4(this.f38250b, (String) obj);
            }
        }));
        ((CapitualKycViewModel) m45631m3()).m45720B().observe(getViewLifecycleOwner(), new C20304e(new Function1() { // from class: com.kubi.payment.channel.capitual.kyc.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CapitualKycFragment.m45688c4(this.f38251b, (Country) obj);
            }
        }));
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f38225Z) {
            this.f38225Z = false;
            m45704e4();
        }
    }
}
