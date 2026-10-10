package com.kubi.payment.kucoinpay.qrscan;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.blankj.utilcode.util.KeyboardUtils;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.facebook.react.uimanager.ViewProps;
import com.google.zxing.client.android.Intents;
import com.journeyapps.barcodescanner.C9297a;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import com.kubi.config.exception.KCConfigException;
import com.kubi.otc.R$color;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.p110rn.kline.KlineFlutterMiniConstants;
import com.kubi.payment.util.C21457l;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.kubi.sdk.util.ImagePickerHelper;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27060l0;
import com.kubi.utils.C27100x0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37677r0;
import p419l2.InterfaceC42031e;
import p445m2.InterfaceC42399j;
import p569qq.C43846g;
import p569qq.C43852m;
import p778xy.C46338a;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.math.MathKt;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45678b;

/* JADX INFO: compiled from: PaymentQrCodeScanActivity.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 P2\u00020\u00012\u00020\u0002:\u0001PB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0012\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\f\u0010&\u001a\u00020#*\u00020\u0006H\u0002J\f\u0010'\u001a\u00020#*\u00020\u0006H\u0002J\f\u0010(\u001a\u00020#*\u00020\u000eH\u0002J\b\u0010)\u001a\u00020#H\u0002J\f\u0010*\u001a\u00020#*\u00020\u000eH\u0002J\b\u0010+\u001a\u00020#H\u0016J2\u0010,\u001a\u00020-*\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u00152\u0006\u00101\u001a\u0002022\f\u00103\u001a\b\u0012\u0004\u0012\u00020#04H\u0002J+\u00105\u001a\u00020#2\u0006\u00106\u001a\u00020\u00152\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u0017082\u0006\u00109\u001a\u000202H\u0016¢\u0006\u0002\u0010:J\"\u0010;\u001a\u00020#2\u0006\u00106\u001a\u00020\u00152\u0006\u0010<\u001a\u00020\u00152\b\u0010=\u001a\u0004\u0018\u00010>H\u0015J\u0012\u0010?\u001a\u00020#2\b\u0010@\u001a\u0004\u0018\u00010\u0017H\u0002J\u0018\u0010A\u001a\u00020#2\u0006\u0010B\u001a\u00020%2\u0006\u0010C\u001a\u00020DH\u0016J\b\u0010E\u001a\u00020#H\u0014J\b\u0010F\u001a\u00020#H\u0014J\b\u0010G\u001a\u00020#H\u0014J\b\u0010H\u001a\u00020#H\u0016J\b\u0010I\u001a\u00020#H\u0016J\u0018\u0010J\u001a\u00020!2\u0006\u0010K\u001a\u00020\u00152\u0006\u0010L\u001a\u00020MH\u0016J\u0017\u0010N\u001a\u00020#2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020#04H\u0082\bR\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001e\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006Q"}, m90084d2 = {"Lcom/kubi/payment/kucoinpay/qrscan/PaymentQrCodeScanActivity;", "Lcom/kubi/sdk/BaseActivity;", "Lcom/journeyapps/barcodescanner/DecoratedBarcodeView$TorchListener;", "<init>", "()V", "binding", "Lcom/kubi/otc/databinding/PaymentActivityQrcodeScanBinding;", "getBinding", "()Lcom/kubi/otc/databinding/PaymentActivityQrcodeScanBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "captureManager", "Lcom/journeyapps/barcodescanner/CaptureManager;", "barcodeScannerLayout", "Landroid/view/ViewGroup;", "barcodeInfoInputLayout", "barcodeInfoEditText", "Landroid/widget/EditText;", "paymentBarcodeView", "Lcom/kubi/payment/kucoinpay/qrscan/PaymentBarcodeView;", "getStatusBarHeight", "", "paymentShowType", "", "viewModel", "Lcom/kubi/payment/kucoinpay/qrscan/PaymentQrCodeScanVM;", "getViewModel", "()Lcom/kubi/payment/kucoinpay/qrscan/PaymentQrCodeScanVM;", "viewModel$delegate", "Lkotlin/Lazy;", "fixIconHeight", "logoDividerWidth", "hasReportInputInfoPageId", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initView", "switchLayout", "initBarcodeScannerLayout", "initObserver", "initBarcodeInfoInputLayout", "onBackPressed", "loadImageFixHeight", "Landroid/widget/ImageView;", "qrcodeInfo", "Lcom/kubi/payment/kucoinpay/qrscan/QrcodeInfo;", "fixHeight", "totalChildWidth", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function0;", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "(I[Ljava/lang/String;[I)V", "onActivityResult", "resultCode", "data", "Landroid/content/Intent;", "feedbackResult", "scanCodeResult", "onSaveInstanceState", "outState", "outPersistentState", "Landroid/os/PersistableBundle;", "onPause", "onResume", "onDestroy", "onTorchOn", "onTorchOff", "onKeyDown", "keyCode", "event", "Landroid/view/KeyEvent;", "safeRun", "block", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPaymentQrCodeScanActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentQrCodeScanActivity.kt\ncom/kubi/payment/kucoinpay/qrscan/PaymentQrCodeScanActivity\n+ 2 ActivityViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ActivityViewBindings\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 View.kt\nandroidx/core/view/ViewKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,427:1\n413#1,4:460\n418#1:466\n413#1,4:468\n418#1:474\n413#1,4:475\n418#1:481\n413#1,4:482\n418#1:488\n413#1,4:489\n418#1:495\n45#2,19:428\n75#3,13:447\n44#4,2:464\n44#4,2:472\n44#4,2:479\n44#4,2:486\n44#4,2:493\n44#4,2:496\n1#5:467\n65#6,4:498\n37#6:502\n53#6:503\n72#6:504\n1869#7,2:505\n*S KotlinDebug\n*F\n+ 1 PaymentQrCodeScanActivity.kt\ncom/kubi/payment/kucoinpay/qrscan/PaymentQrCodeScanActivity\n*L\n126#1:460,4\n126#1:466\n385#1:468,4\n385#1:474\n390#1:475,4\n390#1:481\n395#1:482,4\n395#1:488\n400#1:489,4\n400#1:495\n68#1:428,19\n90#1:447,13\n126#1:464,2\n385#1:472,2\n390#1:479,2\n395#1:486,2\n400#1:493,2\n416#1:496,2\n235#1:498,4\n235#1:502\n235#1:503\n235#1:504\n224#1:505,2\n*E\n"})
public final class PaymentQrCodeScanActivity extends BaseActivity implements DecoratedBarcodeView.InterfaceC9294a {

    /* JADX INFO: renamed from: j */
    public C9297a f39602j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public ViewGroup f39603k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public ViewGroup f39604l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public EditText f39605m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public PaymentBarcodeView f39606n;

    /* JADX INFO: renamed from: p */
    @NotNull
    public final Lazy f39608p;

    /* JADX INFO: renamed from: s */
    public boolean f39611s;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ KProperty<Object>[] f39600u = {Reflection.property1(new PropertyReference1Impl(PaymentQrCodeScanActivity.class, "binding", "getBinding()Lcom/kubi/otc/databinding/PaymentActivityQrcodeScanBinding;", 0))};

    /* JADX INFO: renamed from: t */
    @NotNull
    public static final Companion f39599t = new Companion(null);

    /* JADX INFO: renamed from: i */
    @NotNull
    public final InterfaceC24293a f39601i = C45678b.m100788b(this, new Function1<C37677r0, Unit>() { // from class: com.kubi.payment.kucoinpay.qrscan.PaymentQrCodeScanActivity$special$$inlined$viewBindingActivity$default$1
        public final void invoke(@NotNull C37677r0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37677r0 c37677r0) {
            invoke(c37677r0);
            return Unit.INSTANCE;
        }
    }, new Function1<PaymentQrCodeScanActivity, C37677r0>() { // from class: com.kubi.payment.kucoinpay.qrscan.PaymentQrCodeScanActivity$special$$inlined$viewBindingActivity$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37677r0 invoke(@NotNull PaymentQrCodeScanActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return C37677r0.m84942a(C45678b.m100787a(activity));
        }
    });

    /* JADX INFO: renamed from: o */
    @NotNull
    public String f39607o = "SHOW_BARCODE_SCANNER";

    /* JADX INFO: renamed from: q */
    public final int f39609q = C27040e.m66658b(22);

    /* JADX INFO: renamed from: r */
    public final int f39610r = C27040e.m66658b(8);

    /* JADX INFO: compiled from: PaymentQrCodeScanActivity.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/payment/kucoinpay/qrscan/PaymentQrCodeScanActivity$Companion;", "", "<init>", "()V", "PICK_PHOTO_CODE", "", "PAGE_ID", "", "SHOW_BARCODE_SCANNER", "SHOW_BARCODE_INFO_INPUT", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.kucoinpay.qrscan.PaymentQrCodeScanActivity$a */
    /* JADX INFO: compiled from: View.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JP\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¨\u0006\u000f¸\u0006\u0010"}, m90084d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "onLayoutChange", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "left", "", ViewProps.TOP, "right", ViewProps.BOTTOM, "oldLeft", "oldTop", "oldRight", "oldBottom", "core-ktx_release", "androidx/core/view/ViewKt$doOnLayout$$inlined$doOnNextLayout$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnNextLayout$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 PaymentQrCodeScanActivity.kt\ncom/kubi/payment/kucoinpay/qrscan/PaymentQrCodeScanActivity\n*L\n1#1,414:1\n69#2:415\n70#2:428\n236#3,12:416\n*E\n"})
    public static final class ViewOnLayoutChangeListenerC21039a implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LinearLayoutCompat f39612b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int[] f39613c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ List f39614d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ PaymentQrCodeScanActivity f39615e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ HorizontalScrollView f39616f;

        public ViewOnLayoutChangeListenerC21039a(LinearLayoutCompat linearLayoutCompat, int[] iArr, List list, PaymentQrCodeScanActivity paymentQrCodeScanActivity, HorizontalScrollView horizontalScrollView) {
            this.f39612b = linearLayoutCompat;
            this.f39613c = iArr;
            this.f39614d = list;
            this.f39615e = paymentQrCodeScanActivity;
            this.f39616f = horizontalScrollView;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
            int i11;
            view.removeOnLayoutChangeListener(this);
            ViewGroup.LayoutParams layoutParams = this.f39612b.getLayoutParams();
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                if (this.f39613c[0] + ((this.f39614d.size() - 1) * this.f39615e.f39610r) < this.f39616f.getMeasuredWidth()) {
                    i11 = 17;
                } else {
                    i11 = GravityCompat.START;
                }
                layoutParams2.gravity = i11;
                this.f39612b.setLayoutParams(layoutParams);
            }
            Intrinsics.checkNotNull(this.f39616f);
            ViewExtKt.m66594y(this.f39616f);
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.kucoinpay.qrscan.PaymentQrCodeScanActivity$b */
    /* JADX INFO: compiled from: PaymentQrCodeScanActivity.kt */
    @Metadata(m90083d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J4\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J>\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¨\u0006\u0010"}, m90084d2 = {"com/kubi/payment/kucoinpay/qrscan/PaymentQrCodeScanActivity$loadImageFixHeight$1$1", "Lcom/bumptech/glide/request/RequestListener;", "Landroid/graphics/drawable/Drawable;", "onLoadFailed", "", "e", "Lcom/bumptech/glide/load/engine/GlideException;", "model", "", "target", "Lcom/bumptech/glide/request/target/Target;", "isFirstResource", "onResourceReady", InterfaceC33617e1.f69660i, KlineFlutterMiniConstants.PROP_DATA_SOURCE, "Lcom/bumptech/glide/load/DataSource;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21040b implements InterfaceC42031e<Drawable> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int[] f39617b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Function0<Unit> f39618c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ QrcodeInfo f39619d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f39620e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ImageView f39621f;

        public C21040b(int[] iArr, Function0<Unit> function0, QrcodeInfo qrcodeInfo, int i11, ImageView imageView) {
            this.f39617b = iArr;
            this.f39618c = function0;
            this.f39619d = qrcodeInfo;
            this.f39620e = i11;
            this.f39621f = imageView;
        }

        @Override // p419l2.InterfaceC42031e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean mo20017b(final Drawable drawable, Object obj, InterfaceC42399j<Drawable> interfaceC42399j, DataSource dataSource, boolean z11) {
            final QrcodeInfo qrcodeInfo = this.f39619d;
            final int i11 = this.f39620e;
            final int[] iArr = this.f39617b;
            final Function0<Unit> function0 = this.f39618c;
            final ImageView imageView = this.f39621f;
            C27100x0.m66923d(new Function0() { // from class: com.kubi.payment.kucoinpay.qrscan.v
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PaymentQrCodeScanActivity.C21040b.m48376e(qrcodeInfo, i11, drawable, iArr, function0, imageView);
                }
            });
            return false;
        }

        @Override // p419l2.InterfaceC42031e
        /* JADX INFO: renamed from: d */
        public boolean mo20018d(GlideException glideException, Object obj, InterfaceC42399j<Drawable> interfaceC42399j, boolean z11) {
            int[] iArr = this.f39617b;
            iArr[1] = iArr[1] + 1;
            this.f39618c.invoke();
            return false;
        }

        /* JADX INFO: renamed from: e */
        public static final Unit m48376e(QrcodeInfo qrcodeInfo, int i11, Drawable drawable, int[] iArr, Function0 function0, ImageView imageView) {
            Integer numValueOf;
            int iM66650j;
            int iM66650j2 = C27039d.m66650j(qrcodeInfo.getQrcodeLogoWidth());
            int iM66650j3 = C27039d.m66650j(qrcodeInfo.getQrcodeLogoHeight());
            if (iM66650j2 > 0 && iM66650j3 > 0) {
                iM66650j = (iM66650j2 * i11) / iM66650j3;
            } else {
                Integer numValueOf2 = null;
                if (drawable != null) {
                    numValueOf = Integer.valueOf(drawable.getIntrinsicWidth());
                } else {
                    numValueOf = null;
                }
                int iM66650j4 = C27039d.m66650j(numValueOf) * i11;
                if (drawable != null) {
                    numValueOf2 = Integer.valueOf(drawable.getIntrinsicHeight());
                }
                iM66650j = iM66650j4 / C27039d.m66650j(numValueOf2);
            }
            iArr[0] = iArr[0] + iM66650j;
            iArr[1] = iArr[1] + 1;
            function0.invoke();
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = iM66650j;
            layoutParams.height = i11;
            imageView.setLayoutParams(layoutParams);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.kucoinpay.qrscan.PaymentQrCodeScanActivity$c */
    /* JADX INFO: compiled from: PaymentQrCodeScanActivity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21041c implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f39622b;

        public C21041c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f39622b = function;
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
            return this.f39622b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f39622b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: x0 */
    public static final boolean m48364x0(List list) {
        return !(list == null || list.isEmpty());
    }

    /* JADX INFO: renamed from: z0 */
    public static final Unit m48366z0(int[] iArr, List list, HorizontalScrollView horizontalScrollView, LinearLayoutCompat linearLayoutCompat, PaymentQrCodeScanActivity paymentQrCodeScanActivity) {
        if (iArr[1] >= list.size()) {
            Intrinsics.checkNotNull(horizontalScrollView);
            if (!horizontalScrollView.isLaidOut() || horizontalScrollView.isLayoutRequested()) {
                horizontalScrollView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC21039a(linearLayoutCompat, iArr, list, paymentQrCodeScanActivity, horizontalScrollView));
            } else {
                ViewGroup.LayoutParams layoutParams = linearLayoutCompat.getLayoutParams();
                if (layoutParams instanceof FrameLayout.LayoutParams) {
                    ((FrameLayout.LayoutParams) layoutParams).gravity = iArr[0] + ((list.size() - 1) * paymentQrCodeScanActivity.f39610r) < horizontalScrollView.getMeasuredWidth() ? 17 : GravityCompat.START;
                    linearLayoutCompat.setLayoutParams(layoutParams);
                }
                ViewExtKt.m66594y(horizontalScrollView);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B0 */
    public static final Unit m48329B0(PaymentQrCodeScanActivity paymentQrCodeScanActivity) {
        ImagePickerHelper.m58396e(paymentQrCodeScanActivity, 1, 1, null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C0 */
    public static final Unit m48330C0(PaymentQrCodeScanActivity paymentQrCodeScanActivity, C37677r0 c37677r0) {
        paymentQrCodeScanActivity.f39607o = "SHOW_BARCODE_INFO_INPUT";
        paymentQrCodeScanActivity.m48369L0(c37677r0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H0 */
    public static final Unit m48333H0(PaymentQrCodeScanActivity paymentQrCodeScanActivity, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        C44128b.m97264h(throwable);
        ToastCompat.m66441G(paymentQrCodeScanActivity.getString(R$string.cannot_qrcode), new Object[0]);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J0 */
    public static final void m48335J0(PaymentQrCodeScanActivity paymentQrCodeScanActivity, DialogInterface dialogInterface, int i11) {
        paymentQrCodeScanActivity.startActivity(new Intent("android.settings.APPLICATION_SETTINGS"));
        paymentQrCodeScanActivity.finish();
    }

    /* JADX INFO: renamed from: M0 */
    public static final void m48337M0(PaymentQrCodeScanActivity paymentQrCodeScanActivity, C37677r0 c37677r0, View view) {
        paymentQrCodeScanActivity.f39607o = "SHOW_BARCODE_SCANNER";
        paymentQrCodeScanActivity.m48369L0(c37677r0);
        EditText editText = paymentQrCodeScanActivity.f39605m;
        if (editText != null) {
            KeyboardUtils.m6034f(editText);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public static final Unit m48361u0(PaymentQrCodeScanActivity paymentQrCodeScanActivity, Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        ViewGroup viewGroup = paymentQrCodeScanActivity.f39603k;
        if (viewGroup != null) {
            viewGroup.setBackground(new MaskDrawable(paymentQrCodeScanActivity, rect, C27040e.m66657a(18.0f)));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w0 */
    public static final Unit m48363w0(final PaymentQrCodeScanActivity paymentQrCodeScanActivity, final List list) {
        Group group = (Group) paymentQrCodeScanActivity.findViewById(R$id.supported_icon_group);
        final HorizontalScrollView horizontalScrollView = (HorizontalScrollView) paymentQrCodeScanActivity.findViewById(R$id.supported_icon_layout_container);
        final LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) paymentQrCodeScanActivity.findViewById(R$id.supported_icon_layout);
        C21457l.m49858f(new Function0() { // from class: com.kubi.payment.kucoinpay.qrscan.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(PaymentQrCodeScanActivity.m48364x0(list));
            }
        }, new View[]{group}, new Function0() { // from class: com.kubi.payment.kucoinpay.qrscan.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaymentQrCodeScanActivity.m48365y0(linearLayoutCompat, paymentQrCodeScanActivity, horizontalScrollView, list);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y0 */
    public static final Unit m48365y0(LinearLayoutCompat linearLayoutCompat, PaymentQrCodeScanActivity paymentQrCodeScanActivity, HorizontalScrollView horizontalScrollView, List list) {
        if (linearLayoutCompat != null) {
            linearLayoutCompat.removeAllViews();
            C21457l.m49856d(linearLayoutCompat, paymentQrCodeScanActivity.f39610r, 0, 2, null);
            Intrinsics.checkNotNull(horizontalScrollView);
            C27046k.m66703r(horizontalScrollView);
            final int[] iArr = new int[2];
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    QrcodeInfo qrcodeInfo = (QrcodeInfo) it.next();
                    ImageView imageView = new ImageView(linearLayoutCompat.getContext());
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setCornerRadius(C27040e.m66657a(8.0f));
                    gradientDrawable.setColor(ContextCompat.getColor(imageView.getContext(), R$color.c_white8));
                    imageView.setBackground(gradientDrawable);
                    imageView.setPadding(C27040e.m66658b(8), 0, C27040e.m66658b(8), 0);
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    imageView.setImageAlpha(MathKt.roundToInt(153.0d));
                    Unit unit = Unit.INSTANCE;
                    int i11 = paymentQrCodeScanActivity.f39609q;
                    final LinearLayoutCompat linearLayoutCompat2 = linearLayoutCompat;
                    final PaymentQrCodeScanActivity paymentQrCodeScanActivity2 = paymentQrCodeScanActivity;
                    final HorizontalScrollView horizontalScrollView2 = horizontalScrollView;
                    final List list2 = list;
                    Function0<Unit> function0 = new Function0() { // from class: com.kubi.payment.kucoinpay.qrscan.l
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PaymentQrCodeScanActivity.m48366z0(iArr, list2, horizontalScrollView2, linearLayoutCompat2, paymentQrCodeScanActivity2);
                        }
                    };
                    linearLayoutCompat = linearLayoutCompat2;
                    int[] iArr2 = iArr;
                    iArr = iArr2;
                    linearLayoutCompat.addView(paymentQrCodeScanActivity2.m48368E0(imageView, qrcodeInfo, i11, iArr2, function0));
                    list = list2;
                    horizontalScrollView = horizontalScrollView2;
                    paymentQrCodeScanActivity = paymentQrCodeScanActivity2;
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A0 */
    public final void m48367A0(final C37677r0 c37677r0) {
        Layer layer;
        Layer layer2;
        ViewGroup viewGroup = this.f39603k;
        if (viewGroup != null && (layer2 = (Layer) viewGroup.findViewById(R$id.album_layer)) != null) {
            C27046k.m66711z(layer2, 0L, new Function0() { // from class: com.kubi.payment.kucoinpay.qrscan.n
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PaymentQrCodeScanActivity.m48329B0(this.f39649b);
                }
            }, 1, null);
        }
        ViewGroup viewGroup2 = this.f39603k;
        if (viewGroup2 != null && (layer = (Layer) viewGroup2.findViewById(R$id.enter_qr_code_info_layer)) != null) {
            C27046k.m66711z(layer, 0L, new Function0() { // from class: com.kubi.payment.kucoinpay.qrscan.o
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PaymentQrCodeScanActivity.m48330C0(this.f39650b, c37677r0);
                }
            }, 1, null);
        }
        ViewGroup viewGroup3 = this.f39603k;
        if (viewGroup3 != null) {
            m48374r0(viewGroup3);
        }
        ViewGroup viewGroup4 = this.f39604l;
        if (viewGroup4 != null) {
            m48373p0(viewGroup4);
        }
        m48369L0(c37677r0);
    }

    /* JADX INFO: renamed from: L0 */
    public final void m48369L0(final C37677r0 c37677r0) {
        if (Intrinsics.areEqual(this.f39607o, "SHOW_BARCODE_SCANNER")) {
            ViewGroup viewGroup = this.f39604l;
            if (viewGroup != null) {
                ViewExtKt.m66577h(viewGroup);
            }
            ViewGroup viewGroup2 = this.f39603k;
            if (viewGroup2 != null) {
                ViewExtKt.m66594y(viewGroup2);
            }
            NavigationBar navigationBar = c37677r0.f84484c;
            navigationBar.setTitle(getString(R$string.qrcode_scanner));
            navigationBar.setLeftOnclickListener(new View.OnClickListener() { // from class: com.kubi.payment.kucoinpay.qrscan.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PaymentQrCodeScanActivity.m48338N0(this.f39630b, view);
                }
            });
            C9297a c9297a = this.f39602j;
            if (c9297a == null) {
                Intrinsics.throwUninitializedPropertyAccessException("captureManager");
                c9297a = null;
            }
            c9297a.m14372h();
            return;
        }
        ViewGroup viewGroup3 = this.f39603k;
        if (viewGroup3 != null) {
            ViewExtKt.m66577h(viewGroup3);
        }
        ViewGroup viewGroup4 = this.f39604l;
        if (viewGroup4 != null) {
            ViewExtKt.m66594y(viewGroup4);
        }
        NavigationBar navigationBar2 = c37677r0.f84484c;
        navigationBar2.setTitle(getString(R$string.payment_enter_qr_code_info));
        navigationBar2.setLeftOnclickListener(new View.OnClickListener() { // from class: com.kubi.payment.kucoinpay.qrscan.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaymentQrCodeScanActivity.m48337M0(this.f39647b, c37677r0, view);
            }
        });
        EditText editText = this.f39605m;
        if (editText != null) {
            KeyboardUtils.m6041m(editText);
        }
        PaymentBarcodeView paymentBarcodeView = this.f39606n;
        if (paymentBarcodeView != null) {
            paymentBarcodeView.m14311M();
        }
        if (this.f39611s) {
            return;
        }
        this.f39611s = true;
        C43852m.m96595g("H5KuCoinPayQRScanEnterQRCodeInfo", "QRCodeInfo", null, null, 12, null);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m48370m0(String str) {
        Intent intent = new Intent();
        intent.putExtra(Intents.Scan.RESULT, str);
        intent.putExtra("ALBUM_SOURCE_RESULT", true);
        setResult(-1, intent);
        finish();
    }

    /* JADX INFO: renamed from: n0 */
    public final C37677r0 m48371n0() {
        return (C37677r0) this.f39601i.getValue(this, f39600u[0]);
    }

    /* JADX INFO: renamed from: o0 */
    public final PaymentQrCodeScanVM m48372o0() {
        return (PaymentQrCodeScanVM) this.f39608p.getValue();
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (Intrinsics.areEqual(this.f39607o, "SHOW_BARCODE_SCANNER")) {
            super.onBackPressed();
            return;
        }
        this.f39607o = "SHOW_BARCODE_SCANNER";
        C37677r0 c37677r0M48371n0 = m48371n0();
        if (c37677r0M48371n0 != null) {
            m48369L0(c37677r0M48371n0);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, @NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (m48371n0() != null) {
            C37677r0 c37677r0M48371n0 = m48371n0();
            Intrinsics.checkNotNull(c37677r0M48371n0);
            if (c37677r0M48371n0.f84483b.onKeyDown(keyCode, event)) {
                return true;
            }
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) throws Throwable {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == C9297a.m14369l()) {
            if (grantResults.length <= 0 || grantResults[0] != 0) {
                AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54151H4(false).m54167X4(R$string.permission_apply).m54153J4(R$string.open_camera_permission).m54163T4(getString(R$string.go_set), new DialogInterface.OnClickListener() { // from class: com.kubi.payment.kucoinpay.qrscan.t
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        PaymentQrCodeScanActivity.m48335J0(this.f39656b, dialogInterface, i11);
                    }
                }).m54160Q4(getString(R$string.cancel), new DialogInterface.OnClickListener() { // from class: com.kubi.payment.kucoinpay.qrscan.u
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        PaymentQrCodeScanActivity.m48336K0(this.f39657b, dialogInterface, i11);
                    }
                }).m54172c5(getSupportFragmentManager());
            }
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState, @NotNull PersistableBundle outPersistentState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        Intrinsics.checkNotNullParameter(outPersistentState, "outPersistentState");
        super.onSaveInstanceState(outState, outPersistentState);
        try {
            C9297a c9297a = this.f39602j;
            if (c9297a == null) {
                Intrinsics.throwUninitializedPropertyAccessException("captureManager");
                c9297a = null;
            }
            c9297a.m14382s(outState);
        } catch (Exception e11) {
            C43846g.m96568c(new KCConfigException(e11, "PaymentQrCodeScanActivity", false, null, 8, null), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m48373p0(ViewGroup viewGroup) {
        final EditText editText = (EditText) viewGroup.findViewById(R$id.edit_text);
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) viewGroup.findViewById(R$id.confirm_button);
        kcPrimaryButton.setBackgroundColorRes(R$color.c_text_white);
        kcPrimaryButton.setTextColor(ContextCompat.getColor(kcPrimaryButton.getContext(), R$color.c_text_black));
        Intrinsics.checkNotNull(kcPrimaryButton);
        C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.payment.kucoinpay.qrscan.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaymentQrCodeScanActivity.m48358q0(editText, this);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m48374r0(ViewGroup viewGroup) {
        final View viewFindViewById = viewGroup.findViewById(R$id.capture_crop_layout);
        PaymentBarcodeView paymentBarcodeView = this.f39606n;
        if (paymentBarcodeView != null) {
            paymentBarcodeView.setMeasureSize(new Function0() { // from class: com.kubi.payment.kucoinpay.qrscan.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PaymentQrCodeScanActivity.m48359s0(viewFindViewById);
                }
            });
            paymentBarcodeView.setIntersectionTop(new Function0() { // from class: com.kubi.payment.kucoinpay.qrscan.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Integer.valueOf(PaymentQrCodeScanActivity.m48360t0(viewFindViewById));
                }
            });
            paymentBarcodeView.setOnFramingRectGet(new Function1() { // from class: com.kubi.payment.kucoinpay.qrscan.g
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PaymentQrCodeScanActivity.m48361u0(this.f39633b, (Rect) obj);
                }
            });
        }
        m48362v0();
        m48372o0().m48379n();
    }

    public PaymentQrCodeScanActivity() {
        final Function0 function0 = null;
        this.f39608p = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PaymentQrCodeScanVM.class), new Function0<ViewModelStore>() { // from class: com.kubi.payment.kucoinpay.qrscan.PaymentQrCodeScanActivity$special$$inlined$viewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return this.getMViewModelStore();
            }

            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.payment.kucoinpay.qrscan.PaymentQrCodeScanActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.payment.kucoinpay.qrscan.PaymentQrCodeScanActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = function0;
                return (function1 == null || (creationExtras = (CreationExtras) function1.invoke()) == null) ? this.getDefaultViewModelCreationExtras() : creationExtras;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        setPageId("H5KuCoinPayQRScan");
    }

    /* JADX INFO: renamed from: F0 */
    public static final Unit m48331F0(PaymentQrCodeScanActivity paymentQrCodeScanActivity, String str) {
        if (!TextUtils.isEmpty(str)) {
            paymentQrCodeScanActivity.m48370m0(str);
        } else {
            ToastCompat.m66441G(paymentQrCodeScanActivity.getString(R$string.cannot_qrcode), new Object[0]);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G0 */
    public static final void m48332G0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: I0 */
    public static final void m48334I0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: K0 */
    public static final void m48336K0(PaymentQrCodeScanActivity paymentQrCodeScanActivity, DialogInterface dialogInterface, int i11) {
        paymentQrCodeScanActivity.finish();
    }

    /* JADX INFO: renamed from: N0 */
    public static final void m48338N0(PaymentQrCodeScanActivity paymentQrCodeScanActivity, View view) {
        paymentQrCodeScanActivity.preformBackPressed();
    }

    /* JADX INFO: renamed from: q0 */
    public static final Unit m48358q0(EditText editText, PaymentQrCodeScanActivity paymentQrCodeScanActivity) {
        Editable text = editText.getText();
        if (text != null && text.length() != 0) {
            paymentQrCodeScanActivity.m48370m0(editText.getText().toString());
            return Unit.INSTANCE;
        }
        ToastCompat.m66441G(paymentQrCodeScanActivity.getString(R$string.payment_enter_qr_code_info_warn), new Object[0]);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s0 */
    public static final Pair m48359s0(View view) {
        return TuplesKt.m90091to(Integer.valueOf(view.getMeasuredWidth()), Integer.valueOf(view.getMeasuredHeight()));
    }

    /* JADX INFO: renamed from: t0 */
    public static final int m48360t0(View view) {
        return view.getTop();
    }

    /* JADX INFO: renamed from: v0 */
    private final void m48362v0() {
        m48372o0().m48380o().observe(this, new C21041c(new Function1() { // from class: com.kubi.payment.kucoinpay.qrscan.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentQrCodeScanActivity.m48363w0(this.f39636b, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: E0 */
    public final ImageView m48368E0(ImageView imageView, QrcodeInfo qrcodeInfo, int i11, int[] iArr, Function0<Unit> function0) {
        if (C24277v.m58537b(imageView.getContext())) {
            String qrcodeLogo = qrcodeInfo.getQrcodeLogo();
            if (qrcodeLogo == null || qrcodeLogo.length() == 0) {
                return imageView;
            }
            C46338a.m102151a(imageView.getContext()).mo6634v(qrcodeInfo.getQrcodeLogo()).mo6608s0(new C21040b(iArr, function0, qrcodeInfo, i11, imageView)).m6594E0(imageView);
            return imageView;
        }
        return imageView;
    }

    public final int getStatusBarHeight() {
        return getResources().getDimensionPixelSize(getResources().getIdentifier("status_bar_height", "dimen", "android"));
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    @SuppressLint({"CheckResult"})
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) throws Exception {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == -1 && data != null) {
            Observable observableCompose = Observable.just(C27060l0.m66762e(ImagePickerHelper.m58392a(data))).compose(C24217a1.m58387k());
            final Function1 function1 = new Function1() { // from class: com.kubi.payment.kucoinpay.qrscan.p
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PaymentQrCodeScanActivity.m48331F0(this.f39652b, (String) obj);
                }
            };
            Consumer consumer = new Consumer() { // from class: com.kubi.payment.kucoinpay.qrscan.q
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    PaymentQrCodeScanActivity.m48332G0(function1, obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: com.kubi.payment.kucoinpay.qrscan.r
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PaymentQrCodeScanActivity.m48333H0(this.f39654b, (Throwable) obj);
                }
            };
            observableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.payment.kucoinpay.qrscan.s
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    PaymentQrCodeScanActivity.m48334I0(function2, obj);
                }
            });
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws Throwable {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        EditText editText;
        DecoratedBarcodeView decoratedBarcodeView;
        DecoratedBarcodeView decoratedBarcodeView2;
        DecoratedBarcodeView decoratedBarcodeView3;
        NavigationBar navigationBar;
        super.onCreate(savedInstanceState);
        EdgeToEdgeCompat edgeToEdgeCompat = EdgeToEdgeCompat.f48106a;
        int i11 = R$color.c_white;
        edgeToEdgeCompat.m58281s(this, Integer.valueOf(i11));
        setContentView(R$layout.payment_activity_qrcode_scan);
        C37677r0 c37677r0M48371n0 = m48371n0();
        if (c37677r0M48371n0 != null && (navigationBar = c37677r0M48371n0.f84484c) != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C27040e.m66658b(44));
            layoutParams.topMargin = getStatusBarHeight();
            navigationBar.setLayoutParams(layoutParams);
            navigationBar.setMainColor(i11);
            navigationBar.setLeftIcon(R$drawable.ic2_arrow_left2_24);
            navigationBar.getLeftIcon().setImageTintList(ColorStateList.valueOf(ContextCompat.getColor(this, i11)));
        }
        edgeToEdgeCompat.m58267e(this, ContextCompat.getColor(this, R$color.c_transparent));
        PaymentBarcodeView paymentBarcodeView = null;
        try {
            C37677r0 c37677r0M48371n1 = m48371n0();
            if (c37677r0M48371n1 != null) {
                c37677r0M48371n1.f84483b.setTorchListener(this);
                this.f39602j = new C9297a(this, c37677r0M48371n1.f84483b);
            }
            C9297a c9297a = this.f39602j;
            if (c9297a == null) {
                Intrinsics.throwUninitializedPropertyAccessException("captureManager");
                c9297a = null;
            }
            c9297a.m14376m(getIntent(), savedInstanceState);
        } catch (Exception e11) {
            C43846g.m96568c(new KCConfigException(e11, "PaymentQrCodeScanActivity", false, null, 8, null), null, 2, null);
        }
        C37677r0 c37677r0M48371n2 = m48371n0();
        if (c37677r0M48371n2 != null && (decoratedBarcodeView3 = c37677r0M48371n2.f84483b) != null) {
            viewGroup = (ViewGroup) decoratedBarcodeView3.findViewById(R$id.payment_zxing_barcode_scanner);
        } else {
            viewGroup = null;
        }
        this.f39603k = viewGroup;
        C37677r0 c37677r0M48371n3 = m48371n0();
        if (c37677r0M48371n3 != null && (decoratedBarcodeView2 = c37677r0M48371n3.f84483b) != null) {
            viewGroup2 = (ViewGroup) decoratedBarcodeView2.findViewById(R$id.qr_code_info_input_layout);
        } else {
            viewGroup2 = null;
        }
        this.f39604l = viewGroup2;
        if (viewGroup2 != null) {
            editText = (EditText) viewGroup2.findViewById(R$id.edit_text);
        } else {
            editText = null;
        }
        this.f39605m = editText;
        C37677r0 c37677r0M48371n4 = m48371n0();
        if (c37677r0M48371n4 != null && (decoratedBarcodeView = c37677r0M48371n4.f84483b) != null) {
            paymentBarcodeView = (PaymentBarcodeView) decoratedBarcodeView.findViewById(R$id.zxing_barcode_surface);
        }
        this.f39606n = paymentBarcodeView;
        C37677r0 c37677r0M48371n5 = m48371n0();
        if (c37677r0M48371n5 != null) {
            m48367A0(c37677r0M48371n5);
        }
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() throws Throwable {
        super.onDestroy();
        try {
            C9297a c9297a = this.f39602j;
            if (c9297a == null) {
                Intrinsics.throwUninitializedPropertyAccessException("captureManager");
                c9297a = null;
            }
            if (c9297a != null) {
                c9297a.m14378o();
            }
        } catch (Exception e11) {
            C43846g.m96568c(new KCConfigException(e11, "PaymentQrCodeScanActivity", false, null, 8, null), null, 2, null);
        }
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            C9297a c9297a = this.f39602j;
            if (c9297a == null) {
                Intrinsics.throwUninitializedPropertyAccessException("captureManager");
                c9297a = null;
            }
            if (c9297a != null) {
                c9297a.m14379p();
            }
        } catch (Exception e11) {
            C43846g.m96568c(new KCConfigException(e11, "PaymentQrCodeScanActivity", false, null, 8, null), null, 2, null);
        }
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        try {
            C9297a c9297a = this.f39602j;
            if (c9297a == null) {
                Intrinsics.throwUninitializedPropertyAccessException("captureManager");
                c9297a = null;
            }
            if (c9297a != null) {
                c9297a.m14381r();
            }
        } catch (Exception e11) {
            C43846g.m96568c(new KCConfigException(e11, "PaymentQrCodeScanActivity", false, null, 8, null), null, 2, null);
        }
    }

    @Override // com.journeyapps.barcodescanner.DecoratedBarcodeView.InterfaceC9294a
    /* JADX INFO: renamed from: i */
    public void mo14359i() {
    }

    @Override // com.journeyapps.barcodescanner.DecoratedBarcodeView.InterfaceC9294a
    /* JADX INFO: renamed from: o */
    public void mo14360o() {
    }
}
