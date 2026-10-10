package com.kubi.assets.dialog;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.SpanUtils;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.R$color;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.Phrases;
import com.kubi.assets.entity.WithdrawImgEntity;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.AlignTopTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import lb.C42149d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p637ta.C44819m3;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: WithdrawCheckDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 (2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0012\u0010\u001c\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J\b\u0010\u001f\u001a\u00020\rH\u0002J\b\u0010 \u001a\u00020\rH\u0002J\u0016\u0010!\u001a\u00020\r2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#H\u0002J\u0018\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J\b\u0010&\u001a\u00020'H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R*\u0010\n\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006)"}, m90084d2 = {"Lcom/kubi/assets/dialog/WithdrawCheckDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/DialogWithdrawCheckBinding;", "getBinding", "()Lcom/kubi/assets/databinding/DialogWithdrawCheckBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onConfirmCallback", "Lkotlin/Function1;", "", "", "getOnConfirmCallback", "()Lkotlin/jvm/functions/Function1;", "setOnConfirmCallback", "(Lkotlin/jvm/functions/Function1;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "setConfirmClickListener", "data", "Lcom/kubi/assets/entity/WithdrawImgEntity;", "setCancelClickListener", "displayImage", "handleShowList", "showList", "", "Lcom/kubi/assets/entity/Phrases;", "filterShowList", "isBottomSheet", "", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWithdrawCheckDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithdrawCheckDialog.kt\ncom/kubi/assets/dialog/WithdrawCheckDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,120:1\n143#2,20:121\n774#3:141\n865#3,2:142\n*S KotlinDebug\n*F\n+ 1 WithdrawCheckDialog.kt\ncom/kubi/assets/dialog/WithdrawCheckDialog\n*L\n32#1:121,20\n114#1:141\n114#1:142,2\n*E\n"})
public final class WithdrawCheckDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f16967q0 = C45681e.m100799e(this, new Function1<WithdrawCheckDialog, C44819m3>() { // from class: com.kubi.assets.dialog.WithdrawCheckDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44819m3 invoke(@NotNull WithdrawCheckDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44819m3.m99162a(fragment.requireView());
        }
    }, new Function1<C44819m3, Unit>() { // from class: com.kubi.assets.dialog.WithdrawCheckDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C44819m3 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44819m3 c44819m3) {
            invoke(c44819m3);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @Nullable
    public Function1<? super String, Unit> f16968r0;

    /* JADX INFO: renamed from: t0 */
    public static final /* synthetic */ KProperty<Object>[] f16966t0 = {Reflection.property1(new PropertyReference1Impl(WithdrawCheckDialog.class, "binding", "getBinding()Lcom/kubi/assets/databinding/DialogWithdrawCheckBinding;", 0))};

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public static final Companion f16965s0 = new Companion(null);

    /* JADX INFO: compiled from: WithdrawCheckDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/assets/dialog/WithdrawCheckDialog$Companion;", "", "<init>", "()V", "TAG", "", "IMG_DATA", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return false;
    }

    /* JADX INFO: renamed from: q4 */
    public static final Unit m16074q4(WithdrawCheckDialog withdrawCheckDialog) {
        C43852m.m96591c("B1withdrawPage", "tamperConfirm", "2", null, 8, null);
        withdrawCheckDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s4 */
    public static final Unit m16075s4(WithdrawCheckDialog withdrawCheckDialog, WithdrawImgEntity withdrawImgEntity) {
        C43852m.m96591c("B1withdrawPage", "tamperConfirm", "1", null, 8, null);
        withdrawCheckDialog.dismissAllowingStateLoss();
        Function1<? super String, Unit> function1 = withdrawCheckDialog.f16968r0;
        if (function1 != null) {
            function1.invoke(withdrawImgEntity != null ? withdrawImgEntity.getId() : null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l4 */
    public final void m16076l4() {
        C44819m3 c44819m3M16078n4;
        ImageView imageView;
        Bitmap bitmapM92489a = C42149d.f93586a.m92489a("imgData");
        if (bitmapM92489a == null || (c44819m3M16078n4 = m16078n4()) == null || (imageView = c44819m3M16078n4.f100454c) == null) {
            return;
        }
        imageView.setImageBitmap(bitmapM92489a);
    }

    /* JADX INFO: renamed from: m4 */
    public final List<Phrases> m16077m4(WithdrawImgEntity withdrawImgEntity) {
        List<Phrases> phrases = withdrawImgEntity != null ? withdrawImgEntity.getPhrases() : null;
        if (phrases == null) {
            phrases = CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : phrases) {
            Phrases phrases2 = (Phrases) obj;
            if (!Intrinsics.areEqual(phrases2.getType(), "MEMO") || !TextUtils.isEmpty(phrases2.getPhrase())) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.toMutableList((Collection) arrayList);
    }

    /* JADX INFO: renamed from: n4 */
    public final C44819m3 m16078n4() {
        return (C44819m3) this.f16967q0.getValue(this, f16966t0[0]);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.dialog_withdraw_check, (ViewGroup) null, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        WithdrawImgEntity withdrawImgEntity = arguments != null ? (WithdrawImgEntity) arguments.getParcelable("data") : null;
        C43852m.m96595g("B1withdrawPage", "tamperConfirm", "0", null, 8, null);
        m16079o4(m16077m4(withdrawImgEntity));
        m16076l4();
        m16081r4(withdrawImgEntity);
        m16080p4();
    }

    /* JADX INFO: renamed from: t4 */
    public final void m16082t4(@Nullable Function1<? super String, Unit> function1) {
        this.f16968r0 = function1;
    }

    /* JADX INFO: renamed from: o4 */
    public final void m16079o4(List<Phrases> list) {
        AlignTopTextView alignTopTextView;
        AlignTopTextView alignTopTextView2;
        CharSequence charSequenceM6097d;
        AlignTopTextView alignTopTextView3;
        AlignTopTextView alignTopTextView4;
        AlignTopTextView alignTopTextView5;
        AlignTopTextView alignTopTextView6;
        AlignTopTextView alignTopTextView7;
        AlignTopTextView alignTopTextView8;
        AlignTopTextView alignTopTextView9;
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                if (size != 2) {
                    if (size == 3) {
                        C44819m3 c44819m3M16078n4 = m16078n4();
                        if (c44819m3M16078n4 != null && (alignTopTextView9 = c44819m3M16078n4.f100457f) != null) {
                            AssetExKt.m15133u(alignTopTextView9, list.get(0).getPhrase());
                        }
                        C44819m3 c44819m3M16078n5 = m16078n4();
                        if (c44819m3M16078n5 != null && (alignTopTextView8 = c44819m3M16078n5.f100458g) != null) {
                            AssetExKt.m15133u(alignTopTextView8, list.get(1).getPhrase());
                        }
                        C44819m3 c44819m3M16078n6 = m16078n4();
                        if (c44819m3M16078n6 != null && (alignTopTextView7 = c44819m3M16078n6.f100459h) != null) {
                            AssetExKt.m15133u(alignTopTextView7, list.get(2).getPhrase());
                            return;
                        }
                        return;
                    }
                    return;
                }
                C44819m3 c44819m3M16078n7 = m16078n4();
                if (c44819m3M16078n7 != null && (alignTopTextView6 = c44819m3M16078n7.f100457f) != null) {
                    AssetExKt.m15133u(alignTopTextView6, list.get(0).getPhrase());
                }
                C44819m3 c44819m3M16078n8 = m16078n4();
                if (c44819m3M16078n8 != null && (alignTopTextView5 = c44819m3M16078n8.f100458g) != null) {
                    AssetExKt.m15133u(alignTopTextView5, list.get(1).getPhrase());
                    return;
                }
                return;
            }
            C44819m3 c44819m3M16078n9 = m16078n4();
            if (c44819m3M16078n9 != null && (alignTopTextView4 = c44819m3M16078n9.f100457f) != null) {
                AssetExKt.m15133u(alignTopTextView4, list.get(0).getPhrase());
            }
            C44819m3 c44819m3M16078n10 = m16078n4();
            if (c44819m3M16078n10 != null && (alignTopTextView3 = c44819m3M16078n10.f100457f) != null) {
                C27046k.m66694i(alignTopTextView3, 0, 0, GravityCompat.START, 2, null);
                return;
            }
            return;
        }
        C44819m3 c44819m3M16078n11 = m16078n4();
        if (c44819m3M16078n11 != null && (alignTopTextView2 = c44819m3M16078n11.f100457f) != null) {
            Context context = getContext();
            if (context == null || (charSequenceM6097d = new SpanUtils().m6094a(getString(R$string.asset_withdraw_pop_tip2)).m6101h(ContextCompat.getColor(context, R$color.c_text)).m6094a(getString(R$string.asset_withdraw_pop_tip3)).m6101h(ContextCompat.getColor(context, R$color.c_text40)).m6097d()) == null) {
                charSequenceM6097d = "";
            }
            alignTopTextView2.setText(charSequenceM6097d);
        }
        C44819m3 c44819m3M16078n12 = m16078n4();
        if (c44819m3M16078n12 != null && (alignTopTextView = c44819m3M16078n12.f100457f) != null) {
            C27046k.m66694i(alignTopTextView, 0, 0, GravityCompat.START, 2, null);
        }
    }

    /* JADX INFO: renamed from: p4 */
    public final void m16080p4() {
        ImageView imageView;
        C44819m3 c44819m3M16078n4 = m16078n4();
        if (c44819m3M16078n4 != null && (imageView = c44819m3M16078n4.f100453b) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.assets.dialog.m0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WithdrawCheckDialog.m16074q4(this.f17136b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: r4 */
    public final void m16081r4(final WithdrawImgEntity withdrawImgEntity) {
        KcPrimaryButton kcPrimaryButton;
        C44819m3 c44819m3M16078n4 = m16078n4();
        if (c44819m3M16078n4 != null && (kcPrimaryButton = c44819m3M16078n4.f100456e) != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.assets.dialog.l0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WithdrawCheckDialog.m16075s4(this.f17128b, withdrawImgEntity);
                }
            }, 1, null);
        }
    }
}
