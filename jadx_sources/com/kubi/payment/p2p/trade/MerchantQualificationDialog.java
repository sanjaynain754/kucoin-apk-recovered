package com.kubi.payment.p2p.trade;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Keep;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.otc.R$color;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.resources.ColorClickSpan;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import et.C37242d;
import f00.C37304a;
import g00.InterfaceC37766r;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37598b1;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: MerchantQualificationDialog.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016J\u0012\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u001c\u001a\u00020\u000fH\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/payment/p2p/trade/MerchantQualificationDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "viewBinding", "Lcom/kubi/otc/databinding/PaymentDialogP2pMerchantQualificationBinding;", "getViewBinding", "()Lcom/kubi/otc/databinding/PaymentDialogP2pMerchantQualificationBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "mContext", "Landroid/content/Context;", "merchantQualification", "Lcom/kubi/payment/p2p/trade/MerchantQualificationDialog$MerchantQualification;", "onAttach", "", "context", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initViews", "MerchantQualification", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMerchantQualificationDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MerchantQualificationDialog.kt\ncom/kubi/payment/p2p/trade/MerchantQualificationDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,149:1\n143#2,20:150\n*S KotlinDebug\n*F\n+ 1 MerchantQualificationDialog.kt\ncom/kubi/payment/p2p/trade/MerchantQualificationDialog\n*L\n42#1:150,20\n*E\n"})
public final class MerchantQualificationDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f39974q0 = C45681e.m100799e(this, new Function1<MerchantQualificationDialog, C37598b1>() { // from class: com.kubi.payment.p2p.trade.MerchantQualificationDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37598b1 invoke(@NotNull MerchantQualificationDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37598b1.m84780a(fragment.requireView());
        }
    }, new Function1<C37598b1, Unit>() { // from class: com.kubi.payment.p2p.trade.MerchantQualificationDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C37598b1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37598b1 c37598b1) {
            invoke(c37598b1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    public Context f39975r0;

    /* JADX INFO: renamed from: s0 */
    @Nullable
    public MerchantQualification f39976s0;

    /* JADX INFO: renamed from: u0 */
    public static final /* synthetic */ KProperty<Object>[] f39973u0 = {Reflection.property1(new PropertyReference1Impl(MerchantQualificationDialog.class, "viewBinding", "getViewBinding()Lcom/kubi/otc/databinding/PaymentDialogP2pMerchantQualificationBinding;", 0))};

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public static final Companion f39972t0 = new Companion(null);

    /* JADX INFO: compiled from: MerchantQualificationDialog.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/payment/p2p/trade/MerchantQualificationDialog$Companion;", "", "<init>", "()V", "KYE_MERCHANT_QUALIFICATION", "", "showMerchantQualificationDialog", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "merchantQualification", "Lcom/kubi/payment/p2p/trade/MerchantQualificationDialog$MerchantQualification;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void showMerchantQualificationDialog(@NotNull FragmentManager fragmentManager, @Nullable MerchantQualification merchantQualification) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            MerchantQualificationDialog merchantQualificationDialog = new MerchantQualificationDialog();
            merchantQualificationDialog.setArguments(BundleKt.bundleOf(TuplesKt.m90091to("type", 8), TuplesKt.m90091to("key_merchantQualification", merchantQualification)));
            merchantQualificationDialog.show(fragmentManager, "payment_p2p_merchant_qualification");
        }
    }

    /* JADX INFO: compiled from: MerchantQualificationDialog.kt */
    @Keep
    @Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ>\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0005\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0007\u0010\r¨\u0006!"}, m90084d2 = {"Lcom/kubi/payment/p2p/trade/MerchantQualificationDialog$MerchantQualification;", "Landroid/os/Parcelable;", "amount", "", FirebaseAnalytics.Param.CURRENCY, "isFoxKing", "", "isGoldMerchant", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getAmount", "()Ljava/lang/String;", "getCurrency", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/kubi/payment/p2p/trade/MerchantQualificationDialog$MerchantQualification;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class MerchantQualification implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<MerchantQualification> CREATOR = new C21237a();

        @Nullable
        private final String amount;

        @Nullable
        private final String currency;

        @Nullable
        private final Boolean isFoxKing;

        @Nullable
        private final Boolean isGoldMerchant;

        /* JADX INFO: renamed from: com.kubi.payment.p2p.trade.MerchantQualificationDialog$MerchantQualification$a */
        /* JADX INFO: compiled from: MerchantQualificationDialog.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C21237a implements Parcelable.Creator<MerchantQualification> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final MerchantQualification createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                Boolean boolValueOf2 = null;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() != 0) {
                    boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new MerchantQualification(string, string2, boolValueOf, boolValueOf2);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final MerchantQualification[] newArray(int i11) {
                return new MerchantQualification[i11];
            }
        }

        public MerchantQualification(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable Boolean bool2) {
            this.amount = str;
            this.currency = str2;
            this.isFoxKing = bool;
            this.isGoldMerchant = bool2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MerchantQualification)) {
                return false;
            }
            MerchantQualification merchantQualification = (MerchantQualification) other;
            return Intrinsics.areEqual(this.amount, merchantQualification.amount) && Intrinsics.areEqual(this.currency, merchantQualification.currency) && Intrinsics.areEqual(this.isFoxKing, merchantQualification.isFoxKing) && Intrinsics.areEqual(this.isGoldMerchant, merchantQualification.isGoldMerchant);
        }

        public static /* synthetic */ MerchantQualification copy$default(MerchantQualification merchantQualification, String str, String str2, Boolean bool, Boolean bool2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = merchantQualification.amount;
            }
            if ((i11 & 2) != 0) {
                str2 = merchantQualification.currency;
            }
            if ((i11 & 4) != 0) {
                bool = merchantQualification.isFoxKing;
            }
            if ((i11 & 8) != 0) {
                bool2 = merchantQualification.isGoldMerchant;
            }
            return merchantQualification.copy(str, str2, bool, bool2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAmount() {
            return this.amount;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Boolean getIsFoxKing() {
            return this.isFoxKing;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Boolean getIsGoldMerchant() {
            return this.isGoldMerchant;
        }

        @NotNull
        public final MerchantQualification copy(@Nullable String amount, @Nullable String currency, @Nullable Boolean isFoxKing, @Nullable Boolean isGoldMerchant) {
            return new MerchantQualification(amount, currency, isFoxKing, isGoldMerchant);
        }

        @Nullable
        public final String getAmount() {
            return this.amount;
        }

        @Nullable
        public final String getCurrency() {
            return this.currency;
        }

        public int hashCode() {
            String str = this.amount;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.currency;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.isFoxKing;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isGoldMerchant;
            return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
        }

        @Nullable
        public final Boolean isFoxKing() {
            return this.isFoxKing;
        }

        @Nullable
        public final Boolean isGoldMerchant() {
            return this.isGoldMerchant;
        }

        @NotNull
        public String toString() {
            return "MerchantQualification(amount=" + this.amount + ", currency=" + this.currency + ", isFoxKing=" + this.isFoxKing + ", isGoldMerchant=" + this.isGoldMerchant + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.amount);
            dest.writeString(this.currency);
            Boolean bool = this.isFoxKing;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool.booleanValue() ? 1 : 0);
            }
            Boolean bool2 = this.isGoldMerchant;
            if (bool2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool2.booleanValue() ? 1 : 0);
            }
        }

        public /* synthetic */ MerchantQualification(String str, String str2, Boolean bool, Boolean bool2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? Boolean.FALSE : bool, bool2);
        }
    }

    /* JADX INFO: renamed from: r4 */
    public static final Unit m49050r4(MerchantQualificationDialog merchantQualificationDialog, TextPaint ds2) {
        Intrinsics.checkNotNullParameter(ds2, "ds");
        Context context = merchantQualificationDialog.f39975r0;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        ds2.setColor(ContextCompat.getColor(context, R$color.c_text));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s4 */
    public static final void m49051s4(View view) {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, C37242d.f82569a.m83351d() + "?appNeedLang=true", null, null, null, null, null, null, 126, null);
    }

    /* JADX INFO: renamed from: n4 */
    public final C37598b1 m49052n4() {
        return (C37598b1) this.f39974q0.getValue(this, f39973u0[0]);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.f39975r0 = context;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.payment_dialog_p2p_merchant_qualification, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m49047o4();
    }

    /* JADX INFO: renamed from: o4 */
    private final void m49047o4() {
        Boolean boolIsFoxKing;
        String amount;
        String strM92640e;
        String currency;
        C37598b1 c37598b1M49052n4 = m49052n4();
        if (c37598b1M49052n4 == null) {
            return;
        }
        AppCompatImageView ivClose = c37598b1M49052n4.f83628f;
        Intrinsics.checkNotNullExpressionValue(ivClose, "ivClose");
        C27046k.m66711z(ivClose, 0L, new Function0() { // from class: com.kubi.payment.p2p.trade.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MerchantQualificationDialog.m49048p4(this.f40057b);
            }
        }, 1, null);
        KcSecondaryButton tvConfirm = c37598b1M49052n4.f83632j;
        Intrinsics.checkNotNullExpressionValue(tvConfirm, "tvConfirm");
        C27046k.m66711z(tvConfirm, 0L, new Function0() { // from class: com.kubi.payment.p2p.trade.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MerchantQualificationDialog.m49049q4(this.f40067b);
            }
        }, 1, null);
        MerchantQualification merchantQualification = this.f39976s0;
        Boolean boolIsGoldMerchant = null;
        if (merchantQualification != null) {
            boolIsFoxKing = merchantQualification.isFoxKing();
        } else {
            boolIsFoxKing = null;
        }
        if (C27025c.m66566d(boolIsFoxKing)) {
            Group foxKingGroup = c37598b1M49052n4.f83626d;
            Intrinsics.checkNotNullExpressionValue(foxKingGroup, "foxKingGroup");
            C27046k.m66685H(foxKingGroup);
            MerchantQualification merchantQualification2 = this.f39976s0;
            if (merchantQualification2 != null) {
                amount = merchantQualification2.getAmount();
            } else {
                amount = null;
            }
            BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(C27041f.m66669i(amount, "5000"));
            if (bigDecimalM66536f != null) {
                strM92640e = C42180b.m92640e(bigDecimalM66536f, null, 0, false, false, false, 0, null, 127, null);
            } else {
                strM92640e = null;
            }
            String strM66669i = C27041f.m66669i(strM92640e, "5000");
            BaseTextView baseTextView = c37598b1M49052n4.f83634l;
            Context context = this.f39975r0;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
                context = null;
            }
            int i11 = R$string.payment_p2p_foxking_detail;
            MerchantQualification merchantQualification3 = this.f39976s0;
            if (merchantQualification3 != null) {
                currency = merchantQualification3.getCurrency();
            } else {
                currency = null;
            }
            baseTextView.setText(context.getString(i11, strM66669i, C27041f.m66669i(currency, "USDT")));
            HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
            BaseTextView tvFoxKingDescription = c37598b1M49052n4.f83634l;
            Intrinsics.checkNotNullExpressionValue(tvFoxKingDescription, "tvFoxKingDescription");
            HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
            Context context2 = this.f39975r0;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
                context2 = null;
            }
            highlightTextHelper.m54120f(tvFoxKingDescription, new Pair(textTagEnum, new ForegroundColorSpan(context2.getColor(R$color.c_text))));
        } else {
            Group foxKingGroup2 = c37598b1M49052n4.f83626d;
            Intrinsics.checkNotNullExpressionValue(foxKingGroup2, "foxKingGroup");
            C27046k.m66700o(foxKingGroup2);
        }
        MerchantQualification merchantQualification4 = this.f39976s0;
        if (merchantQualification4 != null) {
            boolIsGoldMerchant = merchantQualification4.isGoldMerchant();
        }
        if (C27025c.m66566d(boolIsGoldMerchant)) {
            Group goldMerchantGroup = c37598b1M49052n4.f83627e;
            Intrinsics.checkNotNullExpressionValue(goldMerchantGroup, "goldMerchantGroup");
            C27046k.m66685H(goldMerchantGroup);
        } else {
            Group goldMerchantGroup2 = c37598b1M49052n4.f83627e;
            Intrinsics.checkNotNullExpressionValue(goldMerchantGroup2, "goldMerchantGroup");
            C27046k.m66700o(goldMerchantGroup2);
        }
        HighlightTextHelper highlightTextHelper2 = HighlightTextHelper.f43497a;
        BaseTextView tvVerifiedMerchantDescription = c37598b1M49052n4.f83639q;
        Intrinsics.checkNotNullExpressionValue(tvVerifiedMerchantDescription, "tvVerifiedMerchantDescription");
        HighlightTextHelper.TextTagEnum textTagEnum2 = HighlightTextHelper.TextTagEnum.SPAN;
        highlightTextHelper2.m54120f(tvVerifiedMerchantDescription, new Pair(textTagEnum2, new UnderlineSpan()), new Pair(textTagEnum2, new ColorClickSpan(new Function1() { // from class: com.kubi.payment.p2p.trade.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MerchantQualificationDialog.m49050r4(this.f40072b, (TextPaint) obj);
            }
        }, new View.OnClickListener() { // from class: com.kubi.payment.p2p.trade.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MerchantQualificationDialog.m49051s4(view);
            }
        })));
        c37598b1M49052n4.f83639q.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: renamed from: p4 */
    public static final Unit m49048p4(MerchantQualificationDialog merchantQualificationDialog) {
        merchantQualificationDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q4 */
    public static final Unit m49049q4(MerchantQualificationDialog merchantQualificationDialog) {
        merchantQualificationDialog.dismiss();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        MerchantQualification merchantQualification;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            merchantQualification = (MerchantQualification) RouteExKt.m56274t(arguments, "key_merchantQualification");
        } else {
            merchantQualification = null;
        }
        this.f39976s0 = merchantQualification;
    }
}
