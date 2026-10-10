package com.kubi.kyc.vendor.jumio.p095ui;

import android.content.Context;
import android.content.Intent;
import android.nfc.NfcAdapter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.jumio.sdk.exceptions.SDKNotConfiguredException;
import com.jumio.sdk.scanpart.JumioScanPart;
import com.kubi.kyc.R$drawable;
import com.kubi.kyc.R$layout;
import com.kubi.kyc.R$string;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27034h;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import f00.C37304a;
import g00.InterfaceC37766r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p205dn.C36897q;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import pn.C43506a;
import w00.C45682f;

/* JADX INFO: compiled from: JumioNFCLayoutScan.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000  2\u00020\u0001:\u0002 !B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0018\u001a\u00020\u0016J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0007J\u0010\u0010\u001b\u001a\u00020\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\b\u0010\u001e\u001a\u00020\u0016H\u0002J\b\u0010\u001f\u001a\u00020\u0016H\u0002R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, m90084d2 = {"Lcom/kubi/kyc/vendor/jumio/ui/JumioNFCLayoutScan;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "viewbinding", "Lcom/kubi/kyc/databinding/LayoutJumioNfcScanViewBinding;", "getViewbinding", "()Lcom/kubi/kyc/databinding/LayoutJumioNfcScanViewBinding;", "viewbinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "scanPart", "Lcom/jumio/sdk/scanpart/JumioScanPart;", "scanListener", "Lcom/kubi/kyc/vendor/jumio/ui/JumioNFCLayoutScan$OnScanListener;", "currentMode", TIMPushProvider.f75062n, "", "jumioScanPart", "checkNFCStatus", "updateNFCScanMode", "scanMode", "showNFCScanTips", "tips", "", "initView", "initClick", "Companion", "OnScanListener", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nJumioNFCLayoutScan.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JumioNFCLayoutScan.kt\ncom/kubi/kyc/vendor/jumio/ui/JumioNFCLayoutScan\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,200:1\n52#2:201\n80#2,7:202\n*S KotlinDebug\n*F\n+ 1 JumioNFCLayoutScan.kt\ncom/kubi/kyc/vendor/jumio/ui/JumioNFCLayoutScan\n*L\n26#1:201\n26#1:202,7\n*E\n"})
public final class JumioNFCLayoutScan extends FrameLayout {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f31629b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public JumioScanPart f31630c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public InterfaceC17288a f31631d;

    /* JADX INFO: renamed from: e */
    public int f31632e;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ KProperty<Object>[] f31628g = {Reflection.property1(new PropertyReference1Impl(JumioNFCLayoutScan.class, "viewbinding", "getViewbinding()Lcom/kubi/kyc/databinding/LayoutJumioNfcScanViewBinding;", 0))};

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Companion f31627f = new Companion(null);

    /* JADX INFO: compiled from: JumioNFCLayoutScan.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/kyc/vendor/jumio/ui/JumioNFCLayoutScan$Companion;", "", "<init>", "()V", "NFC_SCAN_MODE_NOT_OPEN", "", "NFC_SCAN_MODE_INITIALIZE", "NFC_SCAN_MODE_PREPARE", "NFC_SCAN_MODE_SCANNING", "NFC_SCAN_MODE_SCAN_SUCCESS", "NFC_SCAN_MODE_SCAN_FAIL", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.kyc.vendor.jumio.ui.JumioNFCLayoutScan$a */
    /* JADX INFO: compiled from: JumioNFCLayoutScan.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/kyc/vendor/jumio/ui/JumioNFCLayoutScan$OnScanListener;", "", "onScanSuccess", "", "onScanFail", "onScanCancel", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC17288a {
        /* JADX INFO: renamed from: a */
        void mo37314a();

        /* JADX INFO: renamed from: b */
        void mo37315b();

        /* JADX INFO: renamed from: c */
        void mo37316c();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public JumioNFCLayoutScan(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: k */
    public final void m37402k() {
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        ConstraintLayout constraintLayout3;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        LottieAnimationView lottieAnimationView;
        LottieAnimationView lottieAnimationView2;
        ConstraintLayout constraintLayout4;
        ConstraintLayout constraintLayout5;
        ConstraintLayout constraintLayout6;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        LottieAnimationView lottieAnimationView3;
        LottieAnimationView lottieAnimationView4;
        ConstraintLayout constraintLayout7;
        ConstraintLayout constraintLayout8;
        ConstraintLayout constraintLayout9;
        KcPrimaryButton kcPrimaryButton;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        ImageView imageView;
        ConstraintLayout constraintLayout10;
        ConstraintLayout constraintLayout11;
        ConstraintLayout constraintLayout12;
        KcPrimaryButton kcPrimaryButton2;
        BaseTextView baseTextView7;
        BaseTextView baseTextView8;
        ImageView imageView2;
        ConstraintLayout constraintLayout13;
        ConstraintLayout constraintLayout14;
        ConstraintLayout constraintLayout15;
        int i11 = this.f31632e;
        if (i11 == -1) {
            C36897q viewbinding = getViewbinding();
            if (viewbinding != null && (constraintLayout3 = viewbinding.f81528o) != null) {
                constraintLayout3.setVisibility(0);
            }
            C36897q viewbinding2 = getViewbinding();
            if (viewbinding2 != null && (constraintLayout2 = viewbinding2.f81530q) != null) {
                constraintLayout2.setVisibility(8);
            }
            C36897q viewbinding3 = getViewbinding();
            if (viewbinding3 == null || (constraintLayout = viewbinding3.f81529p) == null) {
                return;
            }
            constraintLayout.setVisibility(8);
            return;
        }
        if (i11 == 1) {
            C36897q viewbinding4 = getViewbinding();
            if (viewbinding4 != null && (constraintLayout6 = viewbinding4.f81528o) != null) {
                constraintLayout6.setVisibility(8);
            }
            C36897q viewbinding5 = getViewbinding();
            if (viewbinding5 != null && (constraintLayout5 = viewbinding5.f81530q) != null) {
                constraintLayout5.setVisibility(0);
            }
            C36897q viewbinding6 = getViewbinding();
            if (viewbinding6 != null && (constraintLayout4 = viewbinding6.f81529p) != null) {
                constraintLayout4.setVisibility(8);
            }
            C36897q viewbinding7 = getViewbinding();
            if (viewbinding7 != null && (lottieAnimationView2 = viewbinding7.f81515b) != null) {
                lottieAnimationView2.setRepeatCount(-1);
            }
            C36897q viewbinding8 = getViewbinding();
            if (viewbinding8 != null && (lottieAnimationView = viewbinding8.f81515b) != null) {
                lottieAnimationView.setAnimation("jumio_nfc_passport_show.json");
            }
            C36897q viewbinding9 = getViewbinding();
            if (viewbinding9 != null && (baseTextView2 = viewbinding9.f81527n) != null) {
                baseTextView2.setText(getContext().getString(R$string.jumio_nfc_scan_title));
            }
            C36897q viewbinding10 = getViewbinding();
            if (viewbinding10 == null || (baseTextView = viewbinding10.f81526m) == null) {
                return;
            }
            baseTextView.setText(getContext().getString(R$string.jumio_nfc_scan_hint));
            return;
        }
        if (i11 == 2) {
            C36897q viewbinding11 = getViewbinding();
            if (viewbinding11 != null && (constraintLayout9 = viewbinding11.f81528o) != null) {
                constraintLayout9.setVisibility(8);
            }
            C36897q viewbinding12 = getViewbinding();
            if (viewbinding12 != null && (constraintLayout8 = viewbinding12.f81530q) != null) {
                constraintLayout8.setVisibility(0);
            }
            C36897q viewbinding13 = getViewbinding();
            if (viewbinding13 != null && (constraintLayout7 = viewbinding13.f81529p) != null) {
                constraintLayout7.setVisibility(8);
            }
            C36897q viewbinding14 = getViewbinding();
            if (viewbinding14 != null && (lottieAnimationView4 = viewbinding14.f81515b) != null) {
                lottieAnimationView4.setRepeatCount(-1);
            }
            C36897q viewbinding15 = getViewbinding();
            if (viewbinding15 != null && (lottieAnimationView3 = viewbinding15.f81515b) != null) {
                lottieAnimationView3.setAnimation("jumio_nfc_passport_scanning.json");
            }
            C36897q viewbinding16 = getViewbinding();
            if (viewbinding16 != null && (baseTextView4 = viewbinding16.f81527n) != null) {
                baseTextView4.setText(getContext().getString(R$string.jumio_nfc_scan_reading));
            }
            C36897q viewbinding17 = getViewbinding();
            if (viewbinding17 == null || (baseTextView3 = viewbinding17.f81526m) == null) {
                return;
            }
            baseTextView3.setText(getContext().getString(R$string.jumio_nfc_scan_holding));
            return;
        }
        if (i11 == 3) {
            C36897q viewbinding18 = getViewbinding();
            if (viewbinding18 != null && (constraintLayout12 = viewbinding18.f81528o) != null) {
                constraintLayout12.setVisibility(8);
            }
            C36897q viewbinding19 = getViewbinding();
            if (viewbinding19 != null && (constraintLayout11 = viewbinding19.f81530q) != null) {
                constraintLayout11.setVisibility(8);
            }
            C36897q viewbinding20 = getViewbinding();
            if (viewbinding20 != null && (constraintLayout10 = viewbinding20.f81529p) != null) {
                constraintLayout10.setVisibility(0);
            }
            C36897q viewbinding21 = getViewbinding();
            if (viewbinding21 != null && (imageView = viewbinding21.f81524k) != null) {
                imageView.setBackground(C27034h.m66637h(this, R$drawable.ic2_common_success));
            }
            C36897q viewbinding22 = getViewbinding();
            if (viewbinding22 != null && (baseTextView6 = viewbinding22.f81525l) != null) {
                baseTextView6.setText(getContext().getString(R$string.jumio_nfc_scan_success));
            }
            C36897q viewbinding23 = getViewbinding();
            if (viewbinding23 != null && (baseTextView5 = viewbinding23.f81523j) != null) {
                baseTextView5.setText(getContext().getString(R$string.jumio_nfc_scan_success_hint));
            }
            C36897q viewbinding24 = getViewbinding();
            if (viewbinding24 == null || (kcPrimaryButton = viewbinding24.f81522i) == null) {
                return;
            }
            kcPrimaryButton.setText(getContext().getString(R$string.jumio_nfc_scan_success_next));
            return;
        }
        if (i11 != 4) {
            return;
        }
        C36897q viewbinding25 = getViewbinding();
        if (viewbinding25 != null && (constraintLayout15 = viewbinding25.f81528o) != null) {
            constraintLayout15.setVisibility(8);
        }
        C36897q viewbinding26 = getViewbinding();
        if (viewbinding26 != null && (constraintLayout14 = viewbinding26.f81530q) != null) {
            constraintLayout14.setVisibility(8);
        }
        C36897q viewbinding27 = getViewbinding();
        if (viewbinding27 != null && (constraintLayout13 = viewbinding27.f81529p) != null) {
            constraintLayout13.setVisibility(0);
        }
        C36897q viewbinding28 = getViewbinding();
        if (viewbinding28 != null && (imageView2 = viewbinding28.f81524k) != null) {
            imageView2.setBackground(C27034h.m66637h(this, R$drawable.ic2_common_error));
        }
        C36897q viewbinding29 = getViewbinding();
        if (viewbinding29 != null && (baseTextView8 = viewbinding29.f81525l) != null) {
            baseTextView8.setText(getContext().getString(R$string.jumio_nfc_scan_failed_title));
        }
        C36897q viewbinding30 = getViewbinding();
        if (viewbinding30 != null && (baseTextView7 = viewbinding30.f81523j) != null) {
            baseTextView7.setText(getContext().getString(R$string.jumio_nfc_scan_failed_content));
        }
        C36897q viewbinding31 = getViewbinding();
        if (viewbinding31 == null || (kcPrimaryButton2 = viewbinding31.f81522i) == null) {
            return;
        }
        kcPrimaryButton2.setText(getContext().getString(R$string.jumio_nfc_scan_failed_retry));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public JumioNFCLayoutScan(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m37396g(JumioNFCLayoutScan jumioNFCLayoutScan) {
        jumioNFCLayoutScan.getContext().startActivity(new Intent("android.settings.NFC_SETTINGS"));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m37397h(JumioNFCLayoutScan jumioNFCLayoutScan) throws SDKNotConfiguredException {
        JumioScanPart jumioScanPart = jumioNFCLayoutScan.f31630c;
        if (jumioScanPart != null) {
            jumioScanPart.cancel();
        }
        InterfaceC17288a interfaceC17288a = jumioNFCLayoutScan.f31631d;
        if (interfaceC17288a != null) {
            interfaceC17288a.mo37316c();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m37398i(JumioNFCLayoutScan jumioNFCLayoutScan) {
        InterfaceC17288a interfaceC17288a;
        int i11 = jumioNFCLayoutScan.f31632e;
        if (i11 == 3) {
            jumioNFCLayoutScan.setVisibility(8);
            InterfaceC17288a interfaceC17288a2 = jumioNFCLayoutScan.f31631d;
            if (interfaceC17288a2 != null) {
                interfaceC17288a2.mo37314a();
            }
        } else if (i11 == 4 && (interfaceC17288a = jumioNFCLayoutScan.f31631d) != null) {
            interfaceC17288a.mo37315b();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m37399j() {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, C43506a.f96044a.m95732a(), null, null, null, null, null, null, 126, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public final void m37400e() throws SDKNotConfiguredException {
        int i11 = this.f31632e;
        if (i11 == 0 || i11 == -1) {
            NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(getContext());
            if (defaultAdapter == null || !defaultAdapter.isEnabled()) {
                m37405n(-1);
                return;
            }
            m37405n(1);
            JumioScanPart jumioScanPart = this.f31630c;
            if (jumioScanPart != null) {
                jumioScanPart.start();
            }
        }
    }

    @Nullable
    public final C36897q getViewbinding() {
        return (C36897q) this.f31629b.getValue(this, f31628g[0]);
    }

    /* JADX INFO: renamed from: l */
    public final void m37403l(@Nullable JumioScanPart jumioScanPart, @NotNull InterfaceC17288a scanListener) throws SDKNotConfiguredException {
        Intrinsics.checkNotNullParameter(scanListener, "scanListener");
        if (jumioScanPart == null) {
            return;
        }
        this.f31630c = jumioScanPart;
        this.f31631d = scanListener;
        setVisibility(0);
        m37400e();
    }

    /* JADX INFO: renamed from: n */
    public final void m37405n(int i11) {
        this.f31632e = i11;
        m37402k();
    }

    public /* synthetic */ JumioNFCLayoutScan(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: f */
    public final void m37401f() {
        BaseTextView baseTextView;
        KcPrimaryButton kcPrimaryButton;
        KcPrimaryButton kcPrimaryButton2;
        KcPrimaryButton kcPrimaryButton3;
        C36897q viewbinding = getViewbinding();
        if (viewbinding != null && (kcPrimaryButton3 = viewbinding.f81518e) != null) {
            C27046k.m66711z(kcPrimaryButton3, 0L, new Function0() { // from class: com.kubi.kyc.vendor.jumio.ui.t0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return JumioNFCLayoutScan.m37396g(this.f31686b);
                }
            }, 1, null);
        }
        C36897q viewbinding2 = getViewbinding();
        if (viewbinding2 != null && (kcPrimaryButton2 = viewbinding2.f81516c) != null) {
            C27046k.m66711z(kcPrimaryButton2, 0L, new Function0() { // from class: com.kubi.kyc.vendor.jumio.ui.u0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return JumioNFCLayoutScan.m37397h(this.f31688b);
                }
            }, 1, null);
        }
        C36897q viewbinding3 = getViewbinding();
        if (viewbinding3 != null && (kcPrimaryButton = viewbinding3.f81522i) != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.kyc.vendor.jumio.ui.v0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return JumioNFCLayoutScan.m37398i(this.f31690b);
                }
            }, 1, null);
        }
        C36897q viewbinding4 = getViewbinding();
        if (viewbinding4 != null && (baseTextView = viewbinding4.f81519f) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.kyc.vendor.jumio.ui.w0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return JumioNFCLayoutScan.m37399j();
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m37404m(@Nullable String str) {
        BaseTextView baseTextView;
        C36897q viewbinding = getViewbinding();
        if (viewbinding != null && (baseTextView = viewbinding.f81523j) != null) {
            if (str == null || str.length() == 0) {
                str = getContext().getString(R$string.jumio_nfc_scan_failed_content);
            }
            baseTextView.setText(str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public JumioNFCLayoutScan(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f31629b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C36897q>() { // from class: com.kubi.kyc.vendor.jumio.ui.JumioNFCLayoutScan$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C36897q invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C36897q.m82663a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.layout_jumio_nfc_scan_view, (ViewGroup) this, true);
        this.f31632e = 0;
        m37401f();
    }
}
