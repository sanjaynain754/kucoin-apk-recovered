package com.kubi.otc.security;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Keep;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.security.SecuritySettingDialog;
import com.kubi.otc.service.OtcDepend;
import com.kubi.payment.helper.PreCheckHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.router.utils.RouteExKt;
import com.kubi.safe.api.service.ISafeService;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import f00.C37304a;
import g00.InterfaceC37755g;
import g00.InterfaceC37759k;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SecuritySettingDialog.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0002\u001e\u001fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0012\u0010\u0012\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0001H\u0016J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000¨\u0006 "}, m90084d2 = {"Lcom/kubi/otc/security/SecuritySettingDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "Lcom/kubi/resources/dialog/DialogFragmentHelper$InitViewListener;", "<init>", "()V", "showBindPhoneNumber", "", "showSetTradingPassword", "showBindEmail", "showCheckKyc", "show2fa", "securitySetting", "Lcom/kubi/otc/security/SecuritySettingDialog$SecuritySetting;", "mContext", "Landroid/content/Context;", "onAttach", "", "context", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setupView", "viewHolder", "Lio/chad/library/adapter/base/BaseViewHolder;", "dialogFragmentHelper", "initPhoneNumberView", "initTradingPasswordView", "initEmailVIew", "initCheckKycView", "init2faView", "Companion", "SecuritySetting", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SecuritySettingDialog extends DialogFragmentHelper implements DialogFragmentHelper.InterfaceC22882b {

    /* JADX INFO: renamed from: x0 */
    @NotNull
    public static final Companion f38120x0 = new Companion(null);

    /* JADX INFO: renamed from: q0 */
    public boolean f38121q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f38122r0;

    /* JADX INFO: renamed from: s0 */
    public boolean f38123s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f38124t0;

    /* JADX INFO: renamed from: u0 */
    public boolean f38125u0;

    /* JADX INFO: renamed from: v0 */
    @Nullable
    public SecuritySetting f38126v0;

    /* JADX INFO: renamed from: w0 */
    public Context f38127w0;

    /* JADX INFO: compiled from: SecuritySettingDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/otc/security/SecuritySettingDialog$Companion;", "", "<init>", "()V", TIMPushProvider.f75062n, "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "securitySetting", "Lcom/kubi/otc/security/SecuritySettingDialog$SecuritySetting;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void show(@NotNull FragmentManager fragmentManager, @NotNull SecuritySetting securitySetting) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(securitySetting, "securitySetting");
            SecuritySettingDialog securitySettingDialog = new SecuritySettingDialog();
            Bundle bundle = new Bundle();
            bundle.putInt(TtmlNode.TAG_LAYOUT, R$layout.payment_dialog_security_setting);
            bundle.putInt("type", 8);
            bundle.putParcelable("data", securitySetting);
            securitySettingDialog.setArguments(bundle);
            securitySettingDialog.show(fragmentManager, "payment_dialog_security_setting");
        }
    }

    /* JADX INFO: compiled from: SecuritySettingDialog.kt */
    @Keep
    @Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011JL\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001cHÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\b\u0010\u0011¨\u0006("}, m90084d2 = {"Lcom/kubi/otc/security/SecuritySettingDialog$SecuritySetting;", "Landroid/os/Parcelable;", "showBindPhoneNumber", "", "showSetTradingPassword", "showBindEmail", "showCheckKyc", "show2fa", "isHighKyc", "<init>", "(ZZZZZLjava/lang/Boolean;)V", "getShowBindPhoneNumber", "()Z", "getShowSetTradingPassword", "getShowBindEmail", "getShowCheckKyc", "getShow2fa", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(ZZZZZLjava/lang/Boolean;)Lcom/kubi/otc/security/SecuritySettingDialog$SecuritySetting;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class SecuritySetting implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SecuritySetting> CREATOR = new C20269a();

        @Nullable
        private final Boolean isHighKyc;
        private final boolean show2fa;
        private final boolean showBindEmail;
        private final boolean showBindPhoneNumber;
        private final boolean showCheckKyc;
        private final boolean showSetTradingPassword;

        /* JADX INFO: renamed from: com.kubi.otc.security.SecuritySettingDialog$SecuritySetting$a */
        /* JADX INFO: compiled from: SecuritySettingDialog.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C20269a implements Parcelable.Creator<SecuritySetting> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SecuritySetting createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z11 = false;
                boolean z12 = true;
                if (parcel.readInt() != 0) {
                    z11 = true;
                }
                if (parcel.readInt() == 0) {
                    z12 = z11;
                }
                if (parcel.readInt() == 0) {
                    z12 = z11;
                }
                if (parcel.readInt() == 0) {
                    z12 = z11;
                }
                if (parcel.readInt() == 0) {
                    z12 = z11;
                }
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new SecuritySetting(z11, z12, z12, z12, z12, boolValueOf);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SecuritySetting[] newArray(int i11) {
                return new SecuritySetting[i11];
            }
        }

        public SecuritySetting() {
            this(false, false, false, false, false, null, 63, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SecuritySetting)) {
                return false;
            }
            SecuritySetting securitySetting = (SecuritySetting) other;
            return this.showBindPhoneNumber == securitySetting.showBindPhoneNumber && this.showSetTradingPassword == securitySetting.showSetTradingPassword && this.showBindEmail == securitySetting.showBindEmail && this.showCheckKyc == securitySetting.showCheckKyc && this.show2fa == securitySetting.show2fa && Intrinsics.areEqual(this.isHighKyc, securitySetting.isHighKyc);
        }

        public SecuritySetting(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, @Nullable Boolean bool) {
            this.showBindPhoneNumber = z11;
            this.showSetTradingPassword = z12;
            this.showBindEmail = z13;
            this.showCheckKyc = z14;
            this.show2fa = z15;
            this.isHighKyc = bool;
        }

        public static /* synthetic */ SecuritySetting copy$default(SecuritySetting securitySetting, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = securitySetting.showBindPhoneNumber;
            }
            if ((i11 & 2) != 0) {
                z12 = securitySetting.showSetTradingPassword;
            }
            if ((i11 & 4) != 0) {
                z13 = securitySetting.showBindEmail;
            }
            if ((i11 & 8) != 0) {
                z14 = securitySetting.showCheckKyc;
            }
            if ((i11 & 16) != 0) {
                z15 = securitySetting.show2fa;
            }
            if ((i11 & 32) != 0) {
                bool = securitySetting.isHighKyc;
            }
            boolean z16 = z15;
            Boolean bool2 = bool;
            return securitySetting.copy(z11, z12, z13, z14, z16, bool2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getShowBindPhoneNumber() {
            return this.showBindPhoneNumber;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getShowSetTradingPassword() {
            return this.showSetTradingPassword;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getShowBindEmail() {
            return this.showBindEmail;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getShowCheckKyc() {
            return this.showCheckKyc;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getShow2fa() {
            return this.show2fa;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Boolean getIsHighKyc() {
            return this.isHighKyc;
        }

        @NotNull
        public final SecuritySetting copy(boolean showBindPhoneNumber, boolean showSetTradingPassword, boolean showBindEmail, boolean showCheckKyc, boolean show2fa, @Nullable Boolean isHighKyc) {
            return new SecuritySetting(showBindPhoneNumber, showSetTradingPassword, showBindEmail, showCheckKyc, show2fa, isHighKyc);
        }

        public final boolean getShow2fa() {
            return this.show2fa;
        }

        public final boolean getShowBindEmail() {
            return this.showBindEmail;
        }

        public final boolean getShowBindPhoneNumber() {
            return this.showBindPhoneNumber;
        }

        public final boolean getShowCheckKyc() {
            return this.showCheckKyc;
        }

        public final boolean getShowSetTradingPassword() {
            return this.showSetTradingPassword;
        }

        public int hashCode() {
            int iHashCode = ((((((((Boolean.hashCode(this.showBindPhoneNumber) * 31) + Boolean.hashCode(this.showSetTradingPassword)) * 31) + Boolean.hashCode(this.showBindEmail)) * 31) + Boolean.hashCode(this.showCheckKyc)) * 31) + Boolean.hashCode(this.show2fa)) * 31;
            Boolean bool = this.isHighKyc;
            return iHashCode + (bool == null ? 0 : bool.hashCode());
        }

        @Nullable
        public final Boolean isHighKyc() {
            return this.isHighKyc;
        }

        @NotNull
        public String toString() {
            return "SecuritySetting(showBindPhoneNumber=" + this.showBindPhoneNumber + ", showSetTradingPassword=" + this.showSetTradingPassword + ", showBindEmail=" + this.showBindEmail + ", showCheckKyc=" + this.showCheckKyc + ", show2fa=" + this.show2fa + ", isHighKyc=" + this.isHighKyc + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.showBindPhoneNumber ? 1 : 0);
            dest.writeInt(this.showSetTradingPassword ? 1 : 0);
            dest.writeInt(this.showBindEmail ? 1 : 0);
            dest.writeInt(this.showCheckKyc ? 1 : 0);
            dest.writeInt(this.show2fa ? 1 : 0);
            Boolean bool = this.isHighKyc;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool.booleanValue() ? 1 : 0);
            }
        }

        public /* synthetic */ SecuritySetting(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) != 0 ? false : z13, (i11 & 8) != 0 ? false : z14, (i11 & 16) != 0 ? false : z15, (i11 & 32) != 0 ? null : bool);
        }
    }

    /* JADX INFO: renamed from: p4 */
    public static final Unit m45426p4(SecuritySettingDialog securitySettingDialog) {
        InterfaceC37759k.a.m85172f(C37304a.f82764a, null, null, null, 7, null);
        securitySettingDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r4 */
    public static final Unit m45427r4(SecuritySettingDialog securitySettingDialog) {
        InterfaceC37755g.a.m85142a(C37304a.f82764a, null, null, null, null, null, 31, null);
        securitySettingDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t4 */
    public static final Unit m45428t4(SecuritySettingDialog securitySettingDialog) {
        OtcDepend otcDepend = OtcDepend.f38138a;
        Context context = securitySettingDialog.f38127w0;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        otcDepend.m45454b(context);
        securitySettingDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v4 */
    public static final Unit m45429v4(SecuritySettingDialog securitySettingDialog) {
        ISafeService iSafeServiceM45470t = OtcDepend.f38138a.m45470t();
        Context context = securitySettingDialog.f38127w0;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        iSafeServiceM45470t.m56316j(context);
        securitySettingDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x4 */
    public static final Unit m45430x4(SecuritySettingDialog securitySettingDialog) {
        InterfaceC37759k.a.m85171e(C37304a.f82764a, "SET_WITHDRAWAL_PASSWORD", null, null, null, null, 30, null);
        securitySettingDialog.dismiss();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
    /* JADX INFO: renamed from: b3 */
    public void mo16191b3(@NotNull BaseViewHolder viewHolder, @NotNull DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        m45434u4(viewHolder);
        m45435w4(viewHolder);
        m45433s4(viewHolder);
        m45432q4(viewHolder);
        m45431o4(viewHolder);
    }

    /* JADX INFO: renamed from: o4 */
    public final void m45431o4(BaseViewHolder baseViewHolder) {
        View view = baseViewHolder.getView(R$id.layout_2fa);
        Intrinsics.checkNotNull(view);
        C27046k.m66711z(view, 0L, new Function0() { // from class: kt.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SecuritySettingDialog.m45426p4(this.f92191b);
            }
        }, 1, null);
        if (this.f38125u0) {
            C27046k.m66685H(view);
        } else {
            C27046k.m66700o(view);
        }
        if (!PreCheckHelper.f39543a.m48234e()) {
            view.setEnabled(true);
            view.setAlpha(1.0f);
        } else {
            view.setEnabled(false);
            ((ImageView) baseViewHolder.getView(R$id.iv_2fa_end)).setImageResource(R$drawable.ic2_hook_20);
            view.setAlpha(0.4f);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.f38127w0 = context;
    }

    /* JADX INFO: renamed from: q4 */
    public final void m45432q4(BaseViewHolder baseViewHolder) {
        View view = baseViewHolder.getView(R$id.layout_kyc);
        Intrinsics.checkNotNull(view);
        C27046k.m66711z(view, 0L, new Function0() { // from class: kt.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SecuritySettingDialog.m45427r4(this.f92188b);
            }
        }, 1, null);
        if (this.f38124t0) {
            C27046k.m66685H(view);
        } else {
            C27046k.m66700o(view);
        }
        SecuritySetting securitySetting = this.f38126v0;
        if ((securitySetting != null ? securitySetting.isHighKyc() : null) == null) {
            if (!PreCheckHelper.f39543a.m48238i()) {
                view.setEnabled(true);
                view.setAlpha(1.0f);
                return;
            } else {
                view.setEnabled(false);
                ((ImageView) baseViewHolder.getView(R$id.iv_kyc_end)).setImageResource(R$drawable.ic2_hook_20);
                view.setAlpha(0.4f);
                return;
            }
        }
        SecuritySetting securitySetting2 = this.f38126v0;
        if (!C27025c.m66566d(securitySetting2 != null ? securitySetting2.isHighKyc() : null)) {
            view.setEnabled(true);
            view.setAlpha(1.0f);
        } else {
            view.setEnabled(false);
            ((ImageView) baseViewHolder.getView(R$id.iv_kyc_end)).setImageResource(R$drawable.ic2_hook_20);
            view.setAlpha(0.4f);
        }
    }

    /* JADX INFO: renamed from: s4 */
    public final void m45433s4(BaseViewHolder baseViewHolder) {
        View view = baseViewHolder.getView(R$id.layout_email);
        Intrinsics.checkNotNull(view);
        C27046k.m66711z(view, 0L, new Function0() { // from class: kt.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SecuritySettingDialog.m45428t4(this.f92189b);
            }
        }, 1, null);
        if (this.f38123s0) {
            C27046k.m66685H(view);
        } else {
            C27046k.m66700o(view);
        }
        if (!PreCheckHelper.f39543a.m48235f()) {
            view.setEnabled(true);
            view.setAlpha(1.0f);
        } else {
            view.setEnabled(false);
            ((ImageView) baseViewHolder.getView(R$id.iv_email_end)).setImageResource(R$drawable.ic2_hook_20);
            view.setAlpha(0.4f);
        }
    }

    /* JADX INFO: renamed from: u4 */
    public final void m45434u4(BaseViewHolder baseViewHolder) {
        View view = baseViewHolder.getView(R$id.layout_phone_number);
        Intrinsics.checkNotNull(view);
        C27046k.m66711z(view, 0L, new Function0() { // from class: kt.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SecuritySettingDialog.m45429v4(this.f92190b);
            }
        }, 1, null);
        if (this.f38121q0) {
            C27046k.m66685H(view);
        } else {
            C27046k.m66700o(view);
        }
        if (!PreCheckHelper.f39543a.m48236g()) {
            view.setEnabled(true);
            view.setAlpha(1.0f);
        } else {
            view.setEnabled(false);
            ((ImageView) baseViewHolder.getView(R$id.iv_phone_number_end)).setImageResource(R$drawable.ic2_hook_20);
            view.setAlpha(0.4f);
        }
    }

    /* JADX INFO: renamed from: w4 */
    public final void m45435w4(BaseViewHolder baseViewHolder) {
        View view = baseViewHolder.getView(R$id.layout_trading_password);
        Intrinsics.checkNotNull(view);
        C27046k.m66711z(view, 0L, new Function0() { // from class: kt.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SecuritySettingDialog.m45430x4(this.f92192b);
            }
        }, 1, null);
        if (this.f38122r0) {
            C27046k.m66685H(view);
        } else {
            C27046k.m66700o(view);
        }
        if (!PreCheckHelper.f39543a.m48237h()) {
            view.setEnabled(true);
            view.setAlpha(1.0f);
        } else {
            view.setEnabled(false);
            ((ImageView) baseViewHolder.getView(R$id.iv_trading_password_end)).setImageResource(R$drawable.ic2_hook_20);
            view.setAlpha(0.4f);
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        SecuritySetting securitySetting;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        Boolean boolValueOf4;
        super.onCreate(savedInstanceState);
        m54236e4(this);
        Bundle arguments = getArguments();
        Boolean boolValueOf5 = null;
        if (arguments != null) {
            securitySetting = (SecuritySetting) RouteExKt.m56274t(arguments, "data");
        } else {
            securitySetting = null;
        }
        this.f38126v0 = securitySetting;
        if (securitySetting != null) {
            boolValueOf = Boolean.valueOf(securitySetting.getShowBindPhoneNumber());
        } else {
            boolValueOf = null;
        }
        this.f38121q0 = C27025c.m66566d(boolValueOf);
        SecuritySetting securitySetting2 = this.f38126v0;
        if (securitySetting2 != null) {
            boolValueOf2 = Boolean.valueOf(securitySetting2.getShowSetTradingPassword());
        } else {
            boolValueOf2 = null;
        }
        this.f38122r0 = C27025c.m66566d(boolValueOf2);
        SecuritySetting securitySetting3 = this.f38126v0;
        if (securitySetting3 != null) {
            boolValueOf3 = Boolean.valueOf(securitySetting3.getShowBindEmail());
        } else {
            boolValueOf3 = null;
        }
        this.f38123s0 = C27025c.m66566d(boolValueOf3);
        SecuritySetting securitySetting4 = this.f38126v0;
        if (securitySetting4 != null) {
            boolValueOf4 = Boolean.valueOf(securitySetting4.getShowCheckKyc());
        } else {
            boolValueOf4 = null;
        }
        this.f38124t0 = C27025c.m66566d(boolValueOf4);
        SecuritySetting securitySetting5 = this.f38126v0;
        if (securitySetting5 != null) {
            boolValueOf5 = Boolean.valueOf(securitySetting5.getShow2fa());
        }
        this.f38125u0 = C27025c.m66566d(boolValueOf5);
    }
}
