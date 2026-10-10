package com.kubi.assets.dialog;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.assets.AssetRemoteConfig;
import com.kubi.assets.AssetV2Api;
import com.kubi.assets.R$color;
import com.kubi.assets.R$drawable;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$mipmap;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.ContactAddrAddChild;
import com.kubi.assets.entity.WithdrawAddrAddChild;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.assets.withdraw.address.ContactsAddFragment;
import com.kubi.assets.withdraw.address.WithdrawAddressAddFragment;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.AlignTopTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.resources.widget.round.widget.RoundTextView;
import com.kubi.sdk.base.p113ui.BaseFragmentActivity;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27051h;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p637ta.C44734b5;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45681e;

/* JADX INFO: compiled from: WithdrawResultDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 \\2\u00020\u0001:\u0002\\]B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010C\u001a\u0004\u0018\u00010D2\u0006\u0010E\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010H2\b\u0010I\u001a\u0004\u0018\u00010JH\u0016J\u001a\u0010K\u001a\u00020\u00062\u0006\u0010L\u001a\u00020D2\b\u0010I\u001a\u0004\u0018\u00010JH\u0016J\b\u0010M\u001a\u00020\u0006H\u0002J\b\u0010N\u001a\u00020\u0006H\u0002J\b\u0010O\u001a\u00020\u0006H\u0002J\b\u0010P\u001a\u00020\u0006H\u0002J\b\u0010Q\u001a\u00020\u0006H\u0002J\b\u0010R\u001a\u00020\u0006H\u0002J\u0010\u0010S\u001a\u00020\u00062\u0006\u0010T\u001a\u00020\fH\u0002J\u0012\u0010U\u001a\u00020\f2\b\u0010V\u001a\u0004\u0018\u00010.H\u0002J\"\u0010W\u001a\u00020\u00062\u0006\u0010X\u001a\u00020\f2\u0006\u0010Y\u001a\u00020\f2\b\b\u0002\u0010Z\u001a\u00020%H\u0002J\b\u0010[\u001a\u00020%H\u0016R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0012\u0010\u000eR\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u001a\u0010\u000eR\u001d\u0010\u001c\u001a\u0004\u0018\u00010\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0010\u001a\u0004\b\u001d\u0010\u000eR\u001d\u0010\u001f\u001a\u0004\u0018\u00010 8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0010\u001a\u0004\b!\u0010\"R\u001d\u0010$\u001a\u0004\u0018\u00010%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0010\u001a\u0004\b$\u0010&R\u001d\u0010(\u001a\u0004\u0018\u00010)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u0010\u001a\u0004\b*\u0010+R\u001d\u0010-\u001a\u0004\u0018\u00010.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u0010\u001a\u0004\b/\u00100R#\u00102\u001a\n 4*\u0004\u0018\u000103038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\u0010\u001a\u0004\b5\u00106R\u001b\u00108\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\u0010\u001a\u0004\b:\u0010;R\u001d\u0010=\u001a\u0004\u0018\u00010>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\b?\u0010@¨\u0006^"}, m90084d2 = {"Lcom/kubi/assets/dialog/WithdrawResultDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "onConfirmCallback", "Lkotlin/Function0;", "", "getOnConfirmCallback", "()Lkotlin/jvm/functions/Function0;", "setOnConfirmCallback", "(Lkotlin/jvm/functions/Function0;)V", "type", "", "getType", "()Ljava/lang/String;", "type$delegate", "Lkotlin/Lazy;", "tip", "getTip", "tip$delegate", "mCoinInfo", "Lcom/kubi/data/entity/CoinInfoEntity;", "getMCoinInfo", "()Lcom/kubi/data/entity/CoinInfoEntity;", "mCoinInfo$delegate", "code", "getCode", "code$delegate", "chainId", "getChainId", "chainId$delegate", "from", "", "getFrom", "()Ljava/lang/Integer;", "from$delegate", "isUsual", "", "()Ljava/lang/Boolean;", "isUsual$delegate", "addrInfo", "Lcom/kubi/assets/entity/WithdrawAddrAddChild;", "getAddrInfo", "()Lcom/kubi/assets/entity/WithdrawAddrAddChild;", "addrInfo$delegate", "contactInfo", "Lcom/kubi/assets/entity/ContactAddrAddChild;", "getContactInfo", "()Lcom/kubi/assets/entity/ContactAddrAddChild;", "contactInfo$delegate", "mAssetApi", "Lcom/kubi/assets/AssetV2Api;", "kotlin.jvm.PlatformType", "getMAssetApi", "()Lcom/kubi/assets/AssetV2Api;", "mAssetApi$delegate", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "compositeDisposable$delegate", "binding", "Lcom/kubi/assets/databinding/KucoinFragmentWithdrawResultDialogBinding;", "getBinding", "()Lcom/kubi/assets/databinding/KucoinFragmentWithdrawResultDialogBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initUI", "showSaveAdder", "initListener", "saveAddress", "toSaveAddr", "toSaveContact", "setClickSpan", "content", "getAccount", "item", "limitPoint", "blockId", "locationId", "isExpose", "isBottomSheet", "Companion", "MyClickableSpan", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWithdrawResultDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithdrawResultDialog.kt\ncom/kubi/assets/dialog/WithdrawResultDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,383:1\n143#2,20:384\n*S KotlinDebug\n*F\n+ 1 WithdrawResultDialog.kt\ncom/kubi/assets/dialog/WithdrawResultDialog\n*L\n126#1:384,20\n*E\n"})
public final class WithdrawResultDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @Nullable
    public Function0<Unit> f16988q0;

    /* JADX INFO: renamed from: E0 */
    public static final /* synthetic */ KProperty<Object>[] f16984E0 = {Reflection.property1(new PropertyReference1Impl(WithdrawResultDialog.class, "binding", "getBinding()Lcom/kubi/assets/databinding/KucoinFragmentWithdrawResultDialogBinding;", 0))};

    /* JADX INFO: renamed from: D0 */
    @NotNull
    public static final Companion f16983D0 = new Companion(null);

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f16989r0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.dialog.e1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WithdrawResultDialog.m16138h5(this.f17033b);
        }
    });

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f16990s0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.dialog.g1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WithdrawResultDialog.m16136d5(this.f17108b);
        }
    });

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final Lazy f16991t0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.dialog.h1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WithdrawResultDialog.m16135Y4(this.f17113b);
        }
    });

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public final Lazy f16992u0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.dialog.i1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WithdrawResultDialog.m16119A4(this.f17118b);
        }
    });

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public final Lazy f16993v0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.dialog.j1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WithdrawResultDialog.m16155z4(this.f17123b);
        }
    });

    /* JADX INFO: renamed from: w0 */
    @NotNull
    public final Lazy f16994w0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.dialog.k1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WithdrawResultDialog.m16122D4(this.f17126b);
        }
    });

    /* JADX INFO: renamed from: x0 */
    @NotNull
    public final Lazy f16995x0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.dialog.x0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WithdrawResultDialog.m16132U4(this.f17223b);
        }
    });

    /* JADX INFO: renamed from: y0 */
    @NotNull
    public final Lazy f16996y0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.dialog.y0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WithdrawResultDialog.m16154y4(this.f17225b);
        }
    });

    /* JADX INFO: renamed from: z0 */
    @NotNull
    public final Lazy f16997z0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.dialog.z0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WithdrawResultDialog.m16121C4(this.f17227b);
        }
    });

    /* JADX INFO: renamed from: A0 */
    @NotNull
    public final Lazy f16985A0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.dialog.a1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WithdrawResultDialog.m16134X4();
        }
    });

    /* JADX INFO: renamed from: B0 */
    @NotNull
    public final Lazy f16986B0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.dialog.f1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WithdrawResultDialog.m16120B4();
        }
    });

    /* JADX INFO: renamed from: C0 */
    @NotNull
    public final InterfaceC24293a f16987C0 = C45681e.m100799e(this, new Function1<WithdrawResultDialog, C44734b5>() { // from class: com.kubi.assets.dialog.WithdrawResultDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44734b5 invoke(@NotNull WithdrawResultDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44734b5.m98978a(fragment.requireView());
        }
    }, new Function1<C44734b5, Unit>() { // from class: com.kubi.assets.dialog.WithdrawResultDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C44734b5 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44734b5 c44734b5) {
            invoke(c44734b5);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: compiled from: WithdrawResultDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/assets/dialog/WithdrawResultDialog$Companion;", "", "<init>", "()V", "TAG", "", "WITHDRAW_CONFIRM_SUCCESS", "WITHDRAW_CONFIRM_FAIL", "WITHDRAW_CONFIRM_LIMIT", "FROM_ONCHAIN", "", "FROM_INTERNEL", "ERROR_CODE", "ERROR_CODE_260341", "BIZ_TYPE", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.dialog.WithdrawResultDialog$a */
    /* JADX INFO: compiled from: WithdrawResultDialog.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/assets/dialog/WithdrawResultDialog$MyClickableSpan;", "Landroid/text/style/ClickableSpan;", "activity", "Landroidx/fragment/app/FragmentActivity;", "color", "", "<init>", "(Lcom/kubi/assets/dialog/WithdrawResultDialog;Landroidx/fragment/app/FragmentActivity;I)V", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "getColor", "()I", "updateDrawState", "", "ds", "Landroid/text/TextPaint;", "onClick", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class C9723a extends ClickableSpan {

        /* JADX INFO: renamed from: b */
        @NotNull
        public final FragmentActivity f16998b;

        /* JADX INFO: renamed from: c */
        public final int f16999c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ WithdrawResultDialog f17000d;

        public C9723a(@NotNull WithdrawResultDialog withdrawResultDialog, FragmentActivity activity, int i11) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f17000d = withdrawResultDialog;
            this.f16998b = activity;
            this.f16999c = i11;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NotNull View view) throws JSONException {
            Intrinsics.checkNotNullParameter(view, "view");
            if (Intrinsics.areEqual(this.f17000d.getType(), "withdraw_confirm_limit")) {
                WithdrawResultDialog.m16133W4(this.f17000d, "stopWithdraw", "2", false, 4, null);
            } else {
                WithdrawResultDialog.m16133W4(this.f17000d, "applyFail", "1", false, 4, null);
            }
            AssetsHelper.f18684a.m19154H(this.f16998b);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NotNull TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            super.updateDrawState(ds2);
            ds2.setColor(this.f16999c);
        }
    }

    /* JADX INFO: renamed from: P4 */
    public static final Unit m16128P4(WithdrawResultDialog withdrawResultDialog) throws JSONException {
        m16133W4(withdrawResultDialog, "stopWithdraw", "3", false, 4, null);
        withdrawResultDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R4 */
    public static final Unit m16130R4(WithdrawResultDialog withdrawResultDialog) throws JSONException {
        Function0<Unit> function0;
        m16133W4(withdrawResultDialog, "applySuc", "1", false, 4, null);
        withdrawResultDialog.dismissAllowingStateLoss();
        if (!Intrinsics.areEqual(withdrawResultDialog.m16159I4(), "260341") && (function0 = withdrawResultDialog.f16988q0) != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E4 */
    public final String m16156E4(ContactAddrAddChild contactAddrAddChild) {
        String type = contactAddrAddChild != null ? contactAddrAddChild.getType() : null;
        if (type == null) {
            return "";
        }
        int iHashCode = type.hashCode();
        if (iHashCode == 84016) {
            if (!type.equals("UID")) {
                return "";
            }
            return "UID : " + contactAddrAddChild.getAccount();
        }
        if (iHashCode == 2358711) {
            if (!type.equals("MAIL")) {
                return "";
            }
            StringBuilder sb2 = new StringBuilder();
            Context context = getContext();
            sb2.append(context != null ? context.getString(R$string.email) : null);
            sb2.append(" : ");
            sb2.append(contactAddrAddChild.getAccount());
            return sb2.toString();
        }
        if (iHashCode != 76105038 || !type.equals("PHONE")) {
            return "";
        }
        StringBuilder sb3 = new StringBuilder();
        Context context2 = getContext();
        sb3.append(context2 != null ? context2.getString(R$string.phone_number) : null);
        sb3.append(" : +");
        sb3.append(contactAddrAddChild.getCountryCode());
        sb3.append('-');
        sb3.append(contactAddrAddChild.getAccount());
        return sb3.toString();
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return false;
    }

    /* JADX INFO: renamed from: B4 */
    public static final CompositeDisposable m16120B4() {
        return new CompositeDisposable();
    }

    /* JADX INFO: renamed from: F4 */
    private final WithdrawAddrAddChild m16123F4() {
        return (WithdrawAddrAddChild) this.f16996y0.getValue();
    }

    /* JADX INFO: renamed from: J4 */
    private final ContactAddrAddChild m16124J4() {
        return (ContactAddrAddChild) this.f16997z0.getValue();
    }

    /* JADX INFO: renamed from: L4 */
    private final AssetV2Api m16125L4() {
        return (AssetV2Api) this.f16985A0.getValue();
    }

    /* JADX INFO: renamed from: N4 */
    private final String m16126N4() {
        return (String) this.f16990s0.getValue();
    }

    /* JADX INFO: renamed from: W4 */
    public static /* synthetic */ void m16133W4(WithdrawResultDialog withdrawResultDialog, String str, String str2, boolean z11, int i11, Object obj) throws JSONException {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        withdrawResultDialog.m16163V4(str, str2, z11);
    }

    /* JADX INFO: renamed from: f5 */
    public static final void m16137f5(WithdrawResultDialog withdrawResultDialog, ArrayList arrayList) {
        C43852m.m96591c("B1LitePortfolioWithdrawType", "onChainResult", "addAdress", null, 8, null);
        withdrawResultDialog.dismissAllowingStateLoss();
        BaseFragmentActivity.m56574n0(withdrawResultDialog.getContext(), withdrawResultDialog.getString(R$string.asset_add_address), WithdrawAddressAddFragment.class.getName(), new C27051h().m66721e("coinInfo", withdrawResultDialog.m16161M4()).m66721e("data", withdrawResultDialog.m16123F4()).m66722f("parcelable_list", arrayList).m66717a());
    }

    private final CompositeDisposable getCompositeDisposable() {
        return (CompositeDisposable) this.f16986B0.getValue();
    }

    /* JADX INFO: renamed from: G4 */
    public final C44734b5 m16157G4() {
        return (C44734b5) this.f16987C0.getValue(this, f16984E0[0]);
    }

    @Nullable
    /* JADX INFO: renamed from: H4 */
    public final String m16158H4() {
        return (String) this.f16993v0.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: I4 */
    public final String m16159I4() {
        return (String) this.f16992u0.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: K4 */
    public final Integer m16160K4() {
        return (Integer) this.f16994w0.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: M4 */
    public final CoinInfoEntity m16161M4() {
        return (CoinInfoEntity) this.f16991t0.getValue();
    }

    /* JADX INFO: renamed from: T4 */
    public final Boolean m16162T4() {
        return (Boolean) this.f16995x0.getValue();
    }

    /* JADX INFO: renamed from: V4 */
    public final void m16163V4(String str, String str2, boolean z11) throws JSONException {
        if (!z11) {
            C43852m.m96591c("B1withdrawPage", str, str2, null, 8, null);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        CoinInfoEntity coinInfoEntityM16161M4 = m16161M4();
        jSONObject.put("coin", C27041f.m66668h(coinInfoEntityM16161M4 != null ? coinInfoEntityM16161M4.getCode() : null));
        jSONObject.put("chain", m16158H4());
        Unit unit = Unit.INSTANCE;
        C43852m.m96593e("B1withdrawPage", str, str2, jSONObject);
    }

    /* JADX INFO: renamed from: a5 */
    public final void m16165a5(String str) {
        AlignTopTextView alignTopTextView;
        String string = getString(R$string.asset_contact_custom_service);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        SpannableString spannableString = new SpannableString(str);
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) spannableString, string, 0, true, 2, (Object) null);
        int length = string.length();
        if (iIndexOf$default < 0) {
            length = str.length();
            iIndexOf$default = 0;
        }
        FragmentActivity activity = getActivity();
        spannableString.setSpan(activity != null ? new C9723a(this, activity, ContextCompat.getColor(activity, R$color.primary)) : null, iIndexOf$default, length + iIndexOf$default, 17);
        C44734b5 c44734b5M16157G4 = m16157G4();
        if (c44734b5M16157G4 == null || (alignTopTextView = c44734b5M16157G4.f99630g) == null) {
            return;
        }
        alignTopTextView.setMovementMethod(LinkMovementMethod.getInstance());
        alignTopTextView.setHighlightColor(0);
        alignTopTextView.setText(spannableString);
    }

    /* JADX INFO: renamed from: b5 */
    public final void m16166b5(@Nullable Function0<Unit> function0) {
        this.f16988q0 = function0;
    }

    /* JADX INFO: renamed from: g5 */
    public final void m16169g5() {
        C43852m.m96591c("B1LitePortfolioWithdrawType", "internaResult", "addAdress", null, 8, null);
        dismissAllowingStateLoss();
        BaseFragmentActivity.m56574n0(getContext(), getString(R$string.assets_add_contact), ContactsAddFragment.class.getName(), new C27051h().m66721e("data", m16124J4()).m66717a());
    }

    @Nullable
    public final String getType() {
        return (String) this.f16989r0.getValue();
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.kucoin_fragment_withdraw_result_dialog, (ViewGroup) null, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws JSONException {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m16131S4();
        m16127O4();
    }

    /* JADX INFO: renamed from: A4 */
    public static final String m16119A4(WithdrawResultDialog withdrawResultDialog) {
        Bundle arguments = withdrawResultDialog.getArguments();
        if (arguments != null) {
            return arguments.getString("error_code");
        }
        return null;
    }

    /* JADX INFO: renamed from: C4 */
    public static final ContactAddrAddChild m16121C4(WithdrawResultDialog withdrawResultDialog) {
        Bundle arguments = withdrawResultDialog.getArguments();
        if (arguments != null) {
            return (ContactAddrAddChild) arguments.getParcelable("data_3");
        }
        return null;
    }

    /* JADX INFO: renamed from: D4 */
    public static final Integer m16122D4(WithdrawResultDialog withdrawResultDialog) {
        Bundle arguments = withdrawResultDialog.getArguments();
        if (arguments != null) {
            return Integer.valueOf(arguments.getInt("from"));
        }
        return null;
    }

    /* JADX INFO: renamed from: O4 */
    private final void m16127O4() {
        KcSecondaryButton kcSecondaryButton;
        KcPrimaryButton kcPrimaryButton;
        ImageView imageView;
        C44734b5 c44734b5M16157G4 = m16157G4();
        if (c44734b5M16157G4 != null && (imageView = c44734b5M16157G4.f99625b) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.assets.dialog.w0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WithdrawResultDialog.m16128P4(this.f17220b);
                }
            }, 1, null);
        }
        C44734b5 c44734b5M16157G5 = m16157G4();
        if (c44734b5M16157G5 != null && (kcPrimaryButton = c44734b5M16157G5.f99631h) != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.assets.dialog.c1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WithdrawResultDialog.m16129Q4(this.f17026b);
                }
            }, 1, null);
        }
        C44734b5 c44734b5M16157G6 = m16157G4();
        if (c44734b5M16157G6 != null && (kcSecondaryButton = c44734b5M16157G6.f99634k) != null) {
            C27046k.m66711z(kcSecondaryButton, 0L, new Function0() { // from class: com.kubi.assets.dialog.d1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WithdrawResultDialog.m16130R4(this.f17030b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: Q4 */
    public static final Unit m16129Q4(WithdrawResultDialog withdrawResultDialog) throws JSONException {
        String type = withdrawResultDialog.getType();
        if (type != null) {
            int iHashCode = type.hashCode();
            if (iHashCode != -1153033649) {
                if (iHashCode != -400949166) {
                    if (iHashCode == 461261063 && type.equals("withdraw_confirm_limit")) {
                        m16133W4(withdrawResultDialog, "stopWithdraw", "3", false, 4, null);
                        withdrawResultDialog.dismissAllowingStateLoss();
                    }
                } else if (type.equals("withdraw_confirm_fail")) {
                    if (Intrinsics.areEqual(withdrawResultDialog.m16159I4(), "260341")) {
                        AssetsHelper.f18684a.m19157L();
                    }
                    m16133W4(withdrawResultDialog, "applyFail", "2", false, 4, null);
                    withdrawResultDialog.dismissAllowingStateLoss();
                }
            } else if (type.equals("withdraw_confirm_success")) {
                withdrawResultDialog.m16164Z4();
                m16133W4(withdrawResultDialog, "applySuc", "2", false, 4, null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S4 */
    private final void m16131S4() throws JSONException {
        ImageView imageView;
        BaseTextView baseTextView;
        KcSecondaryButton kcSecondaryButton;
        KcPrimaryButton kcPrimaryButton;
        KcSecondaryButton kcSecondaryButton2;
        KcSecondaryButton kcSecondaryButton3;
        LinearLayout linearLayout;
        AlignTopTextView alignTopTextView;
        ImageView imageView2;
        BaseTextView baseTextView2;
        LinearLayout linearLayout2;
        KcSecondaryButton kcSecondaryButton4;
        AlignTopTextView alignTopTextView2;
        ImageView imageView3;
        KcPrimaryButton kcPrimaryButton2;
        BaseTextView baseTextView3;
        String type = getType();
        if (type != null) {
            int iHashCode = type.hashCode();
            if (iHashCode != -1153033649) {
                if (iHashCode != -400949166) {
                    if (iHashCode == 461261063 && type.equals("withdraw_confirm_limit")) {
                        C44734b5 c44734b5M16157G4 = m16157G4();
                        if (c44734b5M16157G4 != null && (baseTextView3 = c44734b5M16157G4.f99633j) != null) {
                            baseTextView3.setText(getString(R$string.asset_confirm_limit));
                        }
                        C44734b5 c44734b5M16157G5 = m16157G4();
                        if (c44734b5M16157G5 != null && (kcPrimaryButton2 = c44734b5M16157G5.f99631h) != null) {
                            kcPrimaryButton2.setText(getString(R$string.asset_confirm_back));
                        }
                        C44734b5 c44734b5M16157G6 = m16157G4();
                        if (c44734b5M16157G6 != null && (imageView3 = c44734b5M16157G6.f99626c) != null) {
                            imageView3.setImageResource(R$mipmap.icon_asset_withdraw_limit);
                        }
                        String string = getString(R$string.asset_confirm_contact);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        m16165a5(string);
                        C44734b5 c44734b5M16157G7 = m16157G4();
                        if (c44734b5M16157G7 != null && (alignTopTextView2 = c44734b5M16157G7.f99632i) != null) {
                            alignTopTextView2.setText(m16126N4());
                        }
                        C44734b5 c44734b5M16157G8 = m16157G4();
                        if (c44734b5M16157G8 != null && (kcSecondaryButton4 = c44734b5M16157G8.f99634k) != null) {
                            ViewExtKt.m66577h(kcSecondaryButton4);
                        }
                        C44734b5 c44734b5M16157G9 = m16157G4();
                        if (c44734b5M16157G9 != null && (linearLayout2 = c44734b5M16157G9.f99627d) != null) {
                            ViewExtKt.m66594y(linearLayout2);
                        }
                        m16163V4("stopWithdraw", "0", true);
                        return;
                    }
                    return;
                }
                if (type.equals("withdraw_confirm_fail")) {
                    C44734b5 c44734b5M16157G10 = m16157G4();
                    if (c44734b5M16157G10 != null && (baseTextView2 = c44734b5M16157G10.f99633j) != null) {
                        baseTextView2.setText(getString(R$string.withdraw_confirm_fail));
                    }
                    C44734b5 c44734b5M16157G11 = m16157G4();
                    if (c44734b5M16157G11 != null && (imageView2 = c44734b5M16157G11.f99626c) != null) {
                        imageView2.setImageResource(R$drawable.ic2_common_warning);
                    }
                    String string2 = getString(R$string.asset_confirm_contact);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    m16165a5(string2);
                    C44734b5 c44734b5M16157G12 = m16157G4();
                    if (c44734b5M16157G12 != null && (alignTopTextView = c44734b5M16157G12.f99632i) != null) {
                        alignTopTextView.setText(m16126N4());
                    }
                    C44734b5 c44734b5M16157G13 = m16157G4();
                    if (c44734b5M16157G13 != null && (linearLayout = c44734b5M16157G13.f99627d) != null) {
                        ViewExtKt.m66594y(linearLayout);
                    }
                    if (Intrinsics.areEqual(m16159I4(), "260341")) {
                        C44734b5 c44734b5M16157G14 = m16157G4();
                        if (c44734b5M16157G14 != null && (kcSecondaryButton3 = c44734b5M16157G14.f99634k) != null) {
                            ViewExtKt.m66594y(kcSecondaryButton3);
                        }
                        C44734b5 c44734b5M16157G15 = m16157G4();
                        if (c44734b5M16157G15 != null && (kcSecondaryButton2 = c44734b5M16157G15.f99634k) != null) {
                            kcSecondaryButton2.setText(R$string.asset_confirm_back);
                        }
                        C44734b5 c44734b5M16157G16 = m16157G4();
                        if (c44734b5M16157G16 != null && (kcPrimaryButton = c44734b5M16157G16.f99631h) != null) {
                            kcPrimaryButton.setText(R$string.withdraw_fail_viewrecord);
                        }
                    } else {
                        C44734b5 c44734b5M16157G17 = m16157G4();
                        if (c44734b5M16157G17 != null && (kcSecondaryButton = c44734b5M16157G17.f99634k) != null) {
                            ViewExtKt.m66577h(kcSecondaryButton);
                        }
                    }
                    m16163V4("applyFail", "0", true);
                    return;
                }
                return;
            }
            if (type.equals("withdraw_confirm_success")) {
                C44734b5 c44734b5M16157G18 = m16157G4();
                if (c44734b5M16157G18 != null && (baseTextView = c44734b5M16157G18.f99633j) != null) {
                    baseTextView.setText(getString(R$string.withdraw_confirm_success));
                }
                C44734b5 c44734b5M16157G19 = m16157G4();
                if (c44734b5M16157G19 != null && (imageView = c44734b5M16157G19.f99626c) != null) {
                    imageView.setImageResource(R$mipmap.icon_asset_withdraw_success);
                }
                m16167c5();
                m16163V4("applySuc", "0", true);
            }
        }
    }

    /* JADX INFO: renamed from: U4 */
    public static final Boolean m16132U4(WithdrawResultDialog withdrawResultDialog) {
        Bundle arguments = withdrawResultDialog.getArguments();
        if (arguments != null) {
            return Boolean.valueOf(arguments.getBoolean("isFrom"));
        }
        return null;
    }

    /* JADX INFO: renamed from: X4 */
    public static final AssetV2Api m16134X4() {
        return (AssetV2Api) C42597a.m93386b().create(AssetV2Api.class);
    }

    /* JADX INFO: renamed from: Y4 */
    public static final CoinInfoEntity m16135Y4(WithdrawResultDialog withdrawResultDialog) {
        Bundle arguments = withdrawResultDialog.getArguments();
        if (arguments != null) {
            return (CoinInfoEntity) arguments.getParcelable("coinInfo");
        }
        return null;
    }

    /* JADX INFO: renamed from: d5 */
    public static final String m16136d5(WithdrawResultDialog withdrawResultDialog) {
        Bundle arguments = withdrawResultDialog.getArguments();
        if (arguments != null) {
            return arguments.getString("data");
        }
        return null;
    }

    /* JADX INFO: renamed from: h5 */
    public static final String m16138h5(WithdrawResultDialog withdrawResultDialog) {
        Bundle arguments = withdrawResultDialog.getArguments();
        if (arguments != null) {
            return arguments.getString("biz_type", "withdraw_confirm_success");
        }
        return null;
    }

    /* JADX INFO: renamed from: y4 */
    public static final WithdrawAddrAddChild m16154y4(WithdrawResultDialog withdrawResultDialog) {
        Bundle arguments = withdrawResultDialog.getArguments();
        if (arguments != null) {
            return (WithdrawAddrAddChild) arguments.getParcelable("data_2");
        }
        return null;
    }

    /* JADX INFO: renamed from: z4 */
    public static final String m16155z4(WithdrawResultDialog withdrawResultDialog) {
        Bundle arguments = withdrawResultDialog.getArguments();
        if (arguments != null) {
            return arguments.getString("data_1");
        }
        return null;
    }

    /* JADX INFO: renamed from: Z4 */
    public final void m16164Z4() {
        Integer numM16160K4 = m16160K4();
        if (numM16160K4 != null && numM16160K4.intValue() == 1) {
            m16168e5();
        } else {
            m16169g5();
        }
    }

    /* JADX INFO: renamed from: c5 */
    public final void m16167c5() {
        Integer numM16160K4;
        Integer numM16160K5;
        String address;
        C44734b5 c44734b5M16157G4 = m16157G4();
        if (c44734b5M16157G4 != null) {
            if (!C27025c.m66566d(m16162T4()) && (numM16160K5 = m16160K4()) != null && numM16160K5.intValue() == 1) {
                c44734b5M16157G4.f99628e.setMaxWidth(C5275i0.m6236a(120.0f));
                BaseTextView tvAddressTip = c44734b5M16157G4.f99629f;
                Intrinsics.checkNotNullExpressionValue(tvAddressTip, "tvAddressTip");
                ViewExtKt.m66594y(tvAddressTip);
                RoundTextView tvAddress = c44734b5M16157G4.f99628e;
                Intrinsics.checkNotNullExpressionValue(tvAddress, "tvAddress");
                ViewExtKt.m66594y(tvAddress);
                c44734b5M16157G4.f99631h.setText(getString(R$string.wallet_add_address));
                RoundTextView roundTextView = c44734b5M16157G4.f99628e;
                WithdrawAddrAddChild withdrawAddrAddChildM16123F4 = m16123F4();
                if (withdrawAddrAddChildM16123F4 != null) {
                    address = withdrawAddrAddChildM16123F4.getAddress();
                } else {
                    address = null;
                }
                roundTextView.setText(C27041f.m66668h(address));
            } else if (!C27025c.m66566d(m16162T4()) && (numM16160K4 = m16160K4()) != null && numM16160K4.intValue() == 2) {
                c44734b5M16157G4.f99629f.setText(getString(R$string.assets_address_tip1));
                c44734b5M16157G4.f99631h.setText(getString(R$string.assets_add_contact));
                c44734b5M16157G4.f99628e.setText(m16156E4(m16124J4()));
                BaseTextView tvAddressTip2 = c44734b5M16157G4.f99629f;
                Intrinsics.checkNotNullExpressionValue(tvAddressTip2, "tvAddressTip");
                ViewExtKt.m66594y(tvAddressTip2);
                RoundTextView tvAddress2 = c44734b5M16157G4.f99628e;
                Intrinsics.checkNotNullExpressionValue(tvAddress2, "tvAddress");
                ViewExtKt.m66594y(tvAddress2);
            }
            c44734b5M16157G4.f99634k.setText(getString(R$string.assets_withdraw_finish_notadd));
        }
    }

    /* JADX INFO: renamed from: e5 */
    public final void m16168e5() {
        String code;
        CompositeDisposable compositeDisposable = getCompositeDisposable();
        AssetV2Api assetV2ApiM16125L4 = m16125L4();
        CoinInfoEntity coinInfoEntityM16161M4 = m16161M4();
        if (coinInfoEntityM16161M4 != null) {
            code = coinInfoEntityM16161M4.getCode();
        } else {
            code = null;
        }
        compositeDisposable.add(assetV2ApiM16125L4.m17169v(C27041f.m66668h(code), Boolean.valueOf(AssetRemoteConfig.f18903a.m19565A())).compose(C24217a1.m58389m()).subscribe(new Consumer() { // from class: com.kubi.assets.dialog.b1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                WithdrawResultDialog.m16137f5(this.f17022b, (ArrayList) obj);
            }
        }, new C24223c1(null)));
    }
}
