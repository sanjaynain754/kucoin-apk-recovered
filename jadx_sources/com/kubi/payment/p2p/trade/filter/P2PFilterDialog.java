package com.kubi.payment.p2p.trade.filter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import androidx.annotation.Keep;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.payment.p2p.trade.filter.P2PFilterDialog;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KcSmallSwitchButton;
import com.kubi.router.utils.RouteExKt;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: P2PFilterDialog.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0002\u0019\u001aB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0001H\u0017R\u001c\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/payment/p2p/trade/filter/P2PFilterDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "Lcom/kubi/resources/dialog/DialogFragmentHelper$InitViewListener;", "<init>", "()V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "Lcom/kubi/payment/p2p/trade/filter/P2PFilterDialog$P2PFilterData;", "", "switchMerchantEnabled", "", "switchTradableEnabled", "isSell", "sortCode", "", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setupView", "viewHolder", "Lio/chad/library/adapter/base/BaseViewHolder;", "dialogFragmentHelper", "P2PFilterData", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class P2PFilterDialog extends DialogFragmentHelper implements DialogFragmentHelper.InterfaceC22882b {

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public static final Companion f40061v0 = new Companion(null);

    /* JADX INFO: renamed from: q0 */
    @Nullable
    public Function1<? super P2PFilterData, Unit> f40062q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f40063r0;

    /* JADX INFO: renamed from: s0 */
    public boolean f40064s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f40065t0;

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public String f40066u0 = "PRICE";

    /* JADX INFO: compiled from: P2PFilterDialog.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0014\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\t0\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/payment/p2p/trade/filter/P2PFilterDialog$Companion;", "", "<init>", "()V", "SORT_CODE_PRICE", "", "SORT_CODE_DEAL_ORDER", "SORT_CODE_SUCCESSFUL_RATE", TIMPushProvider.f75062n, "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "p2pFilterData", "Lcom/kubi/payment/p2p/trade/filter/P2PFilterDialog$P2PFilterData;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ void show$default(Companion companion, FragmentManager fragmentManager, P2PFilterData p2PFilterData, Function1 function1, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                p2PFilterData = null;
            }
            companion.show(fragmentManager, p2PFilterData, function1);
        }

        public final void show(@NotNull FragmentManager fragmentManager, @Nullable P2PFilterData p2pFilterData, @NotNull Function1<? super P2PFilterData, Unit> listener) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(listener, "listener");
            P2PFilterDialog p2PFilterDialog = new P2PFilterDialog();
            p2PFilterDialog.f40062q0 = listener;
            Bundle bundle = new Bundle();
            bundle.putInt(TtmlNode.TAG_LAYOUT, R$layout.payment_dialog_p2p_filter);
            bundle.putInt("type", 8);
            bundle.putParcelable("data", p2pFilterData);
            p2PFilterDialog.setArguments(bundle);
            p2PFilterDialog.show(fragmentManager, "payment_dialog_p2p_filter");
        }
    }

    /* JADX INFO: compiled from: P2PFilterDialog.kt */
    @Keep
    @Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006 "}, m90084d2 = {"Lcom/kubi/payment/p2p/trade/filter/P2PFilterDialog$P2PFilterData;", "Landroid/os/Parcelable;", "isSell", "", "switchMerchantEnabled", "sortCode", "", "switchTradableEnabled", "<init>", "(ZZLjava/lang/String;Z)V", "()Z", "getSwitchMerchantEnabled", "getSortCode", "()Ljava/lang/String;", "getSwitchTradableEnabled", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class P2PFilterData implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<P2PFilterData> CREATOR = new C21279a();
        private final boolean isSell;

        @NotNull
        private final String sortCode;
        private final boolean switchMerchantEnabled;
        private final boolean switchTradableEnabled;

        /* JADX INFO: renamed from: com.kubi.payment.p2p.trade.filter.P2PFilterDialog$P2PFilterData$a */
        /* JADX INFO: compiled from: P2PFilterDialog.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C21279a implements Parcelable.Creator<P2PFilterData> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final P2PFilterData createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new P2PFilterData(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final P2PFilterData[] newArray(int i11) {
                return new P2PFilterData[i11];
            }
        }

        public P2PFilterData() {
            this(false, false, null, false, 15, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof P2PFilterData)) {
                return false;
            }
            P2PFilterData p2PFilterData = (P2PFilterData) other;
            return this.isSell == p2PFilterData.isSell && this.switchMerchantEnabled == p2PFilterData.switchMerchantEnabled && Intrinsics.areEqual(this.sortCode, p2PFilterData.sortCode) && this.switchTradableEnabled == p2PFilterData.switchTradableEnabled;
        }

        public P2PFilterData(boolean z11, boolean z12, @NotNull String sortCode, boolean z13) {
            Intrinsics.checkNotNullParameter(sortCode, "sortCode");
            this.isSell = z11;
            this.switchMerchantEnabled = z12;
            this.sortCode = sortCode;
            this.switchTradableEnabled = z13;
        }

        public static /* synthetic */ P2PFilterData copy$default(P2PFilterData p2PFilterData, boolean z11, boolean z12, String str, boolean z13, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = p2PFilterData.isSell;
            }
            if ((i11 & 2) != 0) {
                z12 = p2PFilterData.switchMerchantEnabled;
            }
            if ((i11 & 4) != 0) {
                str = p2PFilterData.sortCode;
            }
            if ((i11 & 8) != 0) {
                z13 = p2PFilterData.switchTradableEnabled;
            }
            return p2PFilterData.copy(z11, z12, str, z13);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsSell() {
            return this.isSell;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getSwitchMerchantEnabled() {
            return this.switchMerchantEnabled;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getSortCode() {
            return this.sortCode;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getSwitchTradableEnabled() {
            return this.switchTradableEnabled;
        }

        @NotNull
        public final P2PFilterData copy(boolean isSell, boolean switchMerchantEnabled, @NotNull String sortCode, boolean switchTradableEnabled) {
            Intrinsics.checkNotNullParameter(sortCode, "sortCode");
            return new P2PFilterData(isSell, switchMerchantEnabled, sortCode, switchTradableEnabled);
        }

        @NotNull
        public final String getSortCode() {
            return this.sortCode;
        }

        public final boolean getSwitchMerchantEnabled() {
            return this.switchMerchantEnabled;
        }

        public final boolean getSwitchTradableEnabled() {
            return this.switchTradableEnabled;
        }

        public int hashCode() {
            return (((((Boolean.hashCode(this.isSell) * 31) + Boolean.hashCode(this.switchMerchantEnabled)) * 31) + this.sortCode.hashCode()) * 31) + Boolean.hashCode(this.switchTradableEnabled);
        }

        public final boolean isSell() {
            return this.isSell;
        }

        @NotNull
        public String toString() {
            return "P2PFilterData(isSell=" + this.isSell + ", switchMerchantEnabled=" + this.switchMerchantEnabled + ", sortCode=" + this.sortCode + ", switchTradableEnabled=" + this.switchTradableEnabled + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isSell ? 1 : 0);
            dest.writeInt(this.switchMerchantEnabled ? 1 : 0);
            dest.writeString(this.sortCode);
            dest.writeInt(this.switchTradableEnabled ? 1 : 0);
        }

        public /* synthetic */ P2PFilterData(boolean z11, boolean z12, String str, boolean z13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) != 0 ? "PRICE" : str, (i11 & 8) != 0 ? false : z13);
        }
    }

    /* JADX INFO: renamed from: w4 */
    public static final Unit m49356w4(KcSmallSwitchButton kcSmallSwitchButton, KcSmallSwitchButton kcSmallSwitchButton2, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, P2PFilterDialog p2PFilterDialog) {
        kcSmallSwitchButton.setChecked(false);
        kcSmallSwitchButton2.setChecked(false);
        radioButton.setChecked(true);
        radioButton2.setChecked(false);
        radioButton3.setChecked(false);
        p2PFilterDialog.f40063r0 = false;
        p2PFilterDialog.f40064s0 = false;
        p2PFilterDialog.f40066u0 = "PRICE";
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r4 */
    public static final void m49351r4(P2PFilterDialog p2PFilterDialog, CompoundButton compoundButton, boolean z11) throws JSONException {
        p2PFilterDialog.f40063r0 = z11;
        String str = p2PFilterDialog.f40064s0 ? "1" : "0";
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pay_side", p2PFilterDialog.f40065t0 ? "sell" : "buy");
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a("B7P2P", "premiumfiltertoggle", str, jSONObject);
    }

    /* JADX INFO: renamed from: s4 */
    public static final void m49352s4(P2PFilterDialog p2PFilterDialog, CompoundButton compoundButton, boolean z11) throws JSONException {
        p2PFilterDialog.f40064s0 = z11;
        String str = z11 ? "1" : "0";
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pay_side", p2PFilterDialog.f40065t0 ? "sell" : "buy");
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a("B7P2P", "tradablefiltertoggle", str, jSONObject);
    }

    /* JADX INFO: renamed from: t4 */
    public static final void m49353t4(RadioButton radioButton, RadioButton radioButton2, P2PFilterDialog p2PFilterDialog, CompoundButton compoundButton, boolean z11) {
        if (z11) {
            radioButton.setChecked(false);
            radioButton2.setChecked(false);
            p2PFilterDialog.f40066u0 = "PRICE";
        }
    }

    /* JADX INFO: renamed from: u4 */
    public static final void m49354u4(RadioButton radioButton, RadioButton radioButton2, P2PFilterDialog p2PFilterDialog, CompoundButton compoundButton, boolean z11) {
        if (z11) {
            radioButton.setChecked(false);
            radioButton2.setChecked(false);
            p2PFilterDialog.f40066u0 = "DEAL_ORDER";
        }
    }

    /* JADX INFO: renamed from: v4 */
    public static final void m49355v4(RadioButton radioButton, RadioButton radioButton2, P2PFilterDialog p2PFilterDialog, CompoundButton compoundButton, boolean z11) {
        if (z11) {
            radioButton.setChecked(false);
            radioButton2.setChecked(false);
            p2PFilterDialog.f40066u0 = "SUCC_RATE";
        }
    }

    /* JADX INFO: renamed from: x4 */
    public static final Unit m49357x4(P2PFilterDialog p2PFilterDialog) {
        P2PFilterData p2PFilterData = new P2PFilterData(p2PFilterDialog.f40065t0, p2PFilterDialog.f40063r0, p2PFilterDialog.f40066u0, p2PFilterDialog.f40064s0);
        Function1<? super P2PFilterData, Unit> function1 = p2PFilterDialog.f40062q0;
        if (function1 != null) {
            function1.invoke(p2PFilterData);
        }
        p2PFilterDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00a4 A[ADDED_TO_REGION, REMOVE] */
    @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
    @SuppressLint({"KCCyclomaticComplexityCheck"})
    /* JADX INFO: renamed from: b3 */
    public void mo16191b3(@NotNull BaseViewHolder viewHolder, @NotNull DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        final KcSmallSwitchButton kcSmallSwitchButton = (KcSmallSwitchButton) viewHolder.getView(R$id.switchMerchant);
        kcSmallSwitchButton.setChecked(this.f40063r0);
        kcSmallSwitchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: fu.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) throws JSONException {
                P2PFilterDialog.m49351r4(this.f84979b, compoundButton, z11);
            }
        });
        final KcSmallSwitchButton kcSmallSwitchButton2 = (KcSmallSwitchButton) viewHolder.getView(R$id.switchTradable);
        kcSmallSwitchButton2.setChecked(this.f40064s0);
        kcSmallSwitchButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: fu.b
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) throws JSONException {
                P2PFilterDialog.m49352s4(this.f84980b, compoundButton, z11);
            }
        });
        BaseTextView baseTextView = (BaseTextView) viewHolder.getView(R$id.tvFilterPrice);
        if (this.f40065t0) {
            baseTextView.setText(C27017c.f54310a.m66516f(R$string.payment_p2p_list_price_high_to_low, new Object[0]));
        }
        final RadioButton radioButton = (RadioButton) viewHolder.getView(R$id.rbPrice);
        final RadioButton radioButton2 = (RadioButton) viewHolder.getView(R$id.rbTrades);
        final RadioButton radioButton3 = (RadioButton) viewHolder.getView(R$id.rbTransactions);
        String str = this.f40066u0;
        int iHashCode = str.hashCode();
        if (iHashCode != -1793727077) {
            if (iHashCode != -538241859) {
                if (iHashCode == 76396841 && !str.equals("PRICE")) {
                    radioButton.setChecked(true);
                } else {
                    radioButton.setChecked(true);
                }
            } else if (str.equals("SUCC_RATE")) {
                radioButton3.setChecked(true);
            } else {
                radioButton.setChecked(true);
            }
        } else if (str.equals("DEAL_ORDER")) {
            radioButton2.setChecked(true);
        } else {
            radioButton.setChecked(true);
        }
        radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: fu.c
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                P2PFilterDialog.m49353t4(radioButton2, radioButton3, this, compoundButton, z11);
            }
        });
        radioButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: fu.d
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                P2PFilterDialog.m49354u4(radioButton, radioButton3, this, compoundButton, z11);
            }
        });
        radioButton3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: fu.e
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                P2PFilterDialog.m49355v4(radioButton, radioButton2, this, compoundButton, z11);
            }
        });
        View view = viewHolder.getView(R$id.tvReset);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: fu.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P2PFilterDialog.m49356w4(kcSmallSwitchButton, kcSmallSwitchButton2, radioButton, radioButton2, radioButton3, this);
            }
        }, 1, null);
        View view2 = viewHolder.getView(R$id.tvConfirm);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C27046k.m66711z(view2, 0L, new Function0() { // from class: fu.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P2PFilterDialog.m49357x4(this.f84996b);
            }
        }, 1, null);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        m54236e4(this);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            P2PFilterData p2PFilterData = (P2PFilterData) RouteExKt.m56274t(arguments, "data");
            String sortCode = null;
            if (p2PFilterData != null) {
                boolValueOf = Boolean.valueOf(p2PFilterData.isSell());
            } else {
                boolValueOf = null;
            }
            this.f40065t0 = C27025c.m66566d(boolValueOf);
            if (p2PFilterData != null) {
                boolValueOf2 = Boolean.valueOf(p2PFilterData.getSwitchMerchantEnabled());
            } else {
                boolValueOf2 = null;
            }
            this.f40063r0 = C27025c.m66566d(boolValueOf2);
            if (p2PFilterData != null) {
                boolValueOf3 = Boolean.valueOf(p2PFilterData.getSwitchTradableEnabled());
            } else {
                boolValueOf3 = null;
            }
            this.f40064s0 = C27025c.m66566d(boolValueOf3);
            if (p2PFilterData != null) {
                sortCode = p2PFilterData.getSortCode();
            }
            this.f40066u0 = C27041f.m66669i(sortCode, "PRICE");
        }
    }
}
