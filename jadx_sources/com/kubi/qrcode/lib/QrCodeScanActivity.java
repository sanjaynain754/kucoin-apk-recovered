package com.kubi.qrcode.lib;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import com.google.zxing.client.android.Intents;
import com.journeyapps.barcodescanner.C9297a;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import com.kubi.config.exception.KCConfigException;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.kubi.sdk.util.ImagePickerHelper;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27060l0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27040e;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p674uu.C45314a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45678b;

/* JADX INFO: compiled from: QrCodeScanActivity.kt */
/* JADX INFO: loaded from: classes36.dex */
@Metadata(m90083d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J+\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0016¢\u0006\u0002\u0010\u001aJ\"\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0015J\u0018\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u0010H\u0014J\b\u0010$\u001a\u00020\u0010H\u0014J\b\u0010%\u001a\u00020\u0010H\u0014J\b\u0010&\u001a\u00020\u0010H\u0016J\b\u0010'\u001a\u00020\u0010H\u0016J\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020,H\u0016J\u0017\u0010-\u001a\u00020\u00102\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00100/H\u0082\bR\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000¨\u00061"}, m90084d2 = {"Lcom/kubi/qrcode/lib/QrCodeScanActivity;", "Lcom/kubi/sdk/BaseActivity;", "Lcom/journeyapps/barcodescanner/DecoratedBarcodeView$TorchListener;", "<init>", "()V", "binding", "Lcom/kubi/qrcode/lib/databinding/KucoinActivityQrcodeScanBinding;", "getBinding", "()Lcom/kubi/qrcode/lib/databinding/KucoinActivityQrcodeScanBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "captureManager", "Lcom/journeyapps/barcodescanner/CaptureManager;", "getStatusBarHeight", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "requestCode", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onActivityResult", "resultCode", "data", "Landroid/content/Intent;", "onSaveInstanceState", "outState", "outPersistentState", "Landroid/os/PersistableBundle;", "onPause", "onResume", "onDestroy", "onTorchOn", "onTorchOff", "onKeyDown", "", "keyCode", "event", "Landroid/view/KeyEvent;", "safeRun", "block", "Lkotlin/Function0;", "Companion", "QrCodeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nQrCodeScanActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QrCodeScanActivity.kt\ncom/kubi/qrcode/lib/QrCodeScanActivity\n+ 2 ActivityViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ActivityViewBindings\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,183:1\n172#1,4:203\n177#1:209\n172#1,4:210\n177#1:216\n172#1,4:217\n177#1:223\n172#1,4:224\n177#1:230\n172#1,4:231\n177#1:237\n45#2,19:184\n44#3,2:207\n44#3,2:214\n44#3,2:221\n44#3,2:228\n44#3,2:235\n44#3,2:238\n*S KotlinDebug\n*F\n+ 1 QrCodeScanActivity.kt\ncom/kubi/qrcode/lib/QrCodeScanActivity\n*L\n83#1:203,4\n83#1:209\n144#1:210,4\n144#1:216\n149#1:217,4\n149#1:223\n154#1:224,4\n154#1:230\n159#1:231,4\n159#1:237\n38#1:184,19\n83#1:207,2\n144#1:214,2\n149#1:221,2\n154#1:228,2\n159#1:235,2\n175#1:238,2\n*E\n"})
public final class QrCodeScanActivity extends BaseActivity implements DecoratedBarcodeView.InterfaceC9294a {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final InterfaceC24293a f40834i = C45678b.m100788b(this, new Function1<C45314a, Unit>() { // from class: com.kubi.qrcode.lib.QrCodeScanActivity$special$$inlined$viewBindingActivity$default$1
        public final void invoke(@NotNull C45314a it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C45314a c45314a) {
            invoke(c45314a);
            return Unit.INSTANCE;
        }
    }, new Function1<QrCodeScanActivity, C45314a>() { // from class: com.kubi.qrcode.lib.QrCodeScanActivity$special$$inlined$viewBindingActivity$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C45314a invoke(@NotNull QrCodeScanActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return C45314a.m100182a(C45678b.m100787a(activity));
        }
    });

    /* JADX INFO: renamed from: j */
    public C9297a f40835j;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ KProperty<Object>[] f40833l = {Reflection.property1(new PropertyReference1Impl(QrCodeScanActivity.class, "binding", "getBinding()Lcom/kubi/qrcode/lib/databinding/KucoinActivityQrcodeScanBinding;", 0))};

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final Companion f40832k = new Companion(null);

    /* JADX INFO: compiled from: QrCodeScanActivity.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/qrcode/lib/QrCodeScanActivity$Companion;", "", "<init>", "()V", "PICK_PHOTO_CODE", "", "PAGE_ID", "", "QrCodeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static final Unit m50094f0(QrCodeScanActivity qrCodeScanActivity, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        C44128b.m97264h(throwable);
        ToastCompat.m66441G(qrCodeScanActivity.getString(R$string.cannot_qrcode), new Object[0]);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h0 */
    public static final void m50096h0(QrCodeScanActivity qrCodeScanActivity, View view) {
        ImagePickerHelper.m58396e(qrCodeScanActivity, 1, 1, null, 8, null);
    }

    /* JADX INFO: renamed from: i0 */
    public static final void m50097i0(QrCodeScanActivity qrCodeScanActivity, DialogInterface dialogInterface, int i11) {
        qrCodeScanActivity.startActivity(new Intent("android.settings.APPLICATION_SETTINGS"));
        qrCodeScanActivity.finish();
    }

    /* JADX INFO: renamed from: b0 */
    public final C45314a m50099b0() {
        return (C45314a) this.f40834i.getValue(this, f40833l[0]);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, @NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (m50099b0() != null) {
            C45314a c45314aM50099b0 = m50099b0();
            Intrinsics.checkNotNull(c45314aM50099b0);
            if (c45314aM50099b0.f101877b.onKeyDown(keyCode, event)) {
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
                AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54151H4(false).m54167X4(R$string.permission_apply).m54153J4(R$string.open_camera_permission).m54163T4(getString(R$string.go_set), new DialogInterface.OnClickListener() { // from class: com.kubi.qrcode.lib.m
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        QrCodeScanActivity.m50097i0(this.f40931b, dialogInterface, i11);
                    }
                }).m54160Q4(getString(R$string.cancel), new DialogInterface.OnClickListener() { // from class: com.kubi.qrcode.lib.n
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        QrCodeScanActivity.m50098j0(this.f40932b, dialogInterface, i11);
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
            C9297a c9297a = this.f40835j;
            if (c9297a == null) {
                Intrinsics.throwUninitializedPropertyAccessException("captureManager");
                c9297a = null;
            }
            c9297a.m14382s(outState);
        } catch (Exception e11) {
            C43846g.m96568c(new KCConfigException(e11, "QrCodeScanActivity", false, null, 8, null), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static final void m50091c0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: d0 */
    public static final Unit m50092d0(QrCodeScanActivity qrCodeScanActivity, String str) {
        if (!TextUtils.isEmpty(str)) {
            Intent intent = new Intent();
            intent.putExtra(Intents.Scan.RESULT, str);
            intent.putExtra("ALBUM_SOURCE_RESULT", true);
            qrCodeScanActivity.setResult(-1, intent);
            qrCodeScanActivity.finish();
        } else {
            ToastCompat.m66441G(qrCodeScanActivity.getString(R$string.cannot_qrcode), new Object[0]);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e0 */
    public static final void m50093e0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g0 */
    public static final void m50095g0(QrCodeScanActivity qrCodeScanActivity, View view) {
        qrCodeScanActivity.preformBackPressed();
    }

    private final int getStatusBarHeight() {
        return getResources().getDimensionPixelSize(getResources().getIdentifier("status_bar_height", "dimen", "android"));
    }

    /* JADX INFO: renamed from: j0 */
    public static final void m50098j0(QrCodeScanActivity qrCodeScanActivity, DialogInterface dialogInterface, int i11) {
        qrCodeScanActivity.finish();
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    @SuppressLint({"CheckResult"})
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) throws Exception {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == -1 && data != null) {
            Observable observableCompose = Observable.just(C27060l0.m66762e(ImagePickerHelper.m58392a(data))).compose(C24217a1.m58387k());
            final Function1 function1 = new Function1() { // from class: com.kubi.qrcode.lib.q
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return QrCodeScanActivity.m50092d0(this.f40935b, (String) obj);
                }
            };
            Consumer consumer = new Consumer() { // from class: com.kubi.qrcode.lib.r
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    QrCodeScanActivity.m50093e0(function1, obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: com.kubi.qrcode.lib.s
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return QrCodeScanActivity.m50094f0(this.f40937b, (Throwable) obj);
                }
            };
            observableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.qrcode.lib.t
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    QrCodeScanActivity.m50091c0(function2, obj);
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
        NavigationBar navigationBar;
        super.onCreate(savedInstanceState);
        setContentView(R$layout.kucoin_activity_qrcode_scan);
        setPageId("B1ScanQR");
        C45314a c45314aM50099b0 = m50099b0();
        if (c45314aM50099b0 != null && (navigationBar = c45314aM50099b0.f101878c) != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C27040e.m66658b(44));
            layoutParams.topMargin = getStatusBarHeight();
            navigationBar.setLayoutParams(layoutParams);
            navigationBar.setTitle(getString(R$string.qrcode_scanner));
            int i11 = R$color.c_white;
            navigationBar.setMainColor(i11);
            navigationBar.setLeftIcon(R$drawable.ic2_arrow_left2_24);
            navigationBar.getLeftIcon().setImageTintList(ColorStateList.valueOf(ContextCompat.getColor(this, i11)));
            navigationBar.setLeftOnclickListener(new View.OnClickListener() { // from class: com.kubi.qrcode.lib.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    QrCodeScanActivity.m50095g0(this.f40933b, view);
                }
            });
            navigationBar.m54697h(R$string.album, R$color.brandGreen);
            navigationBar.setRightTextOnclickListener(new View.OnClickListener() { // from class: com.kubi.qrcode.lib.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    QrCodeScanActivity.m50096h0(this.f40934b, view);
                }
            });
        }
        EdgeToEdgeCompat.f48106a.m58267e(this, ContextCompat.getColor(this, R$color.c_transparent));
        try {
            C45314a c45314aM50099b1 = m50099b0();
            if (c45314aM50099b1 != null) {
                c45314aM50099b1.f101877b.setTorchListener(this);
                this.f40835j = new C9297a(this, c45314aM50099b1.f101877b);
            }
            C9297a c9297a = this.f40835j;
            if (c9297a == null) {
                Intrinsics.throwUninitializedPropertyAccessException("captureManager");
                c9297a = null;
            }
            c9297a.m14376m(getIntent(), savedInstanceState);
            C9297a c9297a2 = this.f40835j;
            if (c9297a2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("captureManager");
                c9297a2 = null;
            }
            c9297a2.m14372h();
        } catch (Exception e11) {
            C43846g.m96568c(new KCConfigException(e11, "QrCodeScanActivity", false, null, 8, null), null, 2, null);
        }
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() throws Throwable {
        super.onDestroy();
        try {
            C9297a c9297a = this.f40835j;
            if (c9297a == null) {
                Intrinsics.throwUninitializedPropertyAccessException("captureManager");
                c9297a = null;
            }
            if (c9297a != null) {
                c9297a.m14378o();
            }
        } catch (Exception e11) {
            C43846g.m96568c(new KCConfigException(e11, "QrCodeScanActivity", false, null, 8, null), null, 2, null);
        }
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            C9297a c9297a = this.f40835j;
            if (c9297a == null) {
                Intrinsics.throwUninitializedPropertyAccessException("captureManager");
                c9297a = null;
            }
            if (c9297a != null) {
                c9297a.m14379p();
            }
        } catch (Exception e11) {
            C43846g.m96568c(new KCConfigException(e11, "QrCodeScanActivity", false, null, 8, null), null, 2, null);
        }
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        try {
            C9297a c9297a = this.f40835j;
            if (c9297a == null) {
                Intrinsics.throwUninitializedPropertyAccessException("captureManager");
                c9297a = null;
            }
            if (c9297a != null) {
                c9297a.m14381r();
            }
        } catch (Exception e11) {
            C43846g.m96568c(new KCConfigException(e11, "QrCodeScanActivity", false, null, 8, null), null, 2, null);
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
