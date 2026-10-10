package com.kubi.sdk.flutter.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.blankj.utilcode.util.C5270g;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.flutter.KCFlutterRouteManager;
import com.kubi.sdk.flutter.delegate.FlutterViewDelegate;
import com.kubi.sdk.flutter.exception.FlutterIssueException;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.kubi.sdk.util.PermissionAspect;
import com.kubi.utils.C27059l;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import dh0.C36686b;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.aspectj.lang.InterfaceC43175a;
import org.aspectj.runtime.internal.C43179b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p514ou.C43330a;
import p569qq.C43846g;
import p609ry.C44199a;
import p813yy.C46611a;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: FlutterDialogActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u000e\u001a\u00020\u000bH\u0014J\b\u0010\u000f\u001a\u00020\u000bH\u0014J\b\u0010\u0010\u001a\u00020\u000bH\u0014J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0014J\b\u0010\u0015\u001a\u00020\u000bH\u0014J\u0012\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\"\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0018H\u0015J\b\u0010\u001e\u001a\u00020\u000bH\u0017J-\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001b2\u000e\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020$H\u0016¢\u0006\u0002\u0010%J\u0010\u0010&\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u001bH\u0016J\b\u0010(\u001a\u00020\u000bH\u0014J\b\u0010)\u001a\u00020\u000bH\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, m90084d2 = {"Lcom/kubi/sdk/flutter/ui/FlutterDialogActivity;", "Lcom/kubi/sdk/BaseActivity;", "<init>", "()V", "delegate", "Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;", "getDelegate$LFlutter_googleRelease", "()Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;", "isLoaded", "Ljava/util/concurrent/atomic/AtomicBoolean;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onPostResume", "onStart", "onWindowFocusChanged", "hasFocus", "", "onStop", "onPause", "onNewIntent", "intent", "Landroid/content/Intent;", "onActivityResult", "requestCode", "", "resultCode", "data", "onBackPressed", "onRequestPermissionsResult", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onTrimMemory", FirebaseAnalytics.Param.LEVEL, "onUserLeaveHint", "onDestroy", "Companion", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFlutterDialogActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlutterDialogActivity.kt\ncom/kubi/sdk/flutter/ui/FlutterDialogActivity\n+ 2 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,184:1\n28#2:185\n76#3,7:186\n*S KotlinDebug\n*F\n+ 1 FlutterDialogActivity.kt\ncom/kubi/sdk/flutter/ui/FlutterDialogActivity\n*L\n74#1:185\n100#1:186,7\n*E\n"})
public final class FlutterDialogActivity extends BaseActivity {

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final Companion f46738k;

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ InterfaceC43175a.a f46739l;

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ InterfaceC43175a.a f46740m;

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ InterfaceC43175a.a f46741n;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final FlutterViewDelegate f46742i = new FlutterViewDelegate();

    /* JADX INFO: renamed from: j */
    @NotNull
    public final AtomicBoolean f46743j = new AtomicBoolean(false);

    /* JADX INFO: compiled from: FlutterDialogActivity.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2 \u0010\n\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f\u0012\u0004\u0012\u00020\u00050\u000bJ0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2 \u0010\n\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f\u0012\u0004\u0012\u00020\u00050\u000b¨\u0006\r"}, m90084d2 = {"Lcom/kubi/sdk/flutter/ui/FlutterDialogActivity$Companion;", "", "<init>", "()V", "showFlutterDialog", "", "context", "Landroid/content/Context;", "route", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nFlutterDialogActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlutterDialogActivity.kt\ncom/kubi/sdk/flutter/ui/FlutterDialogActivity$Companion\n+ 2 FlutterIssue.kt\ncom/kubi/sdk/flutter/exception/FlutterIssueKt\n*L\n1#1,184:1\n44#2,15:185\n*S KotlinDebug\n*F\n+ 1 FlutterDialogActivity.kt\ncom/kubi/sdk/flutter/ui/FlutterDialogActivity$Companion\n*L\n58#1:185,15\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void showFlutterDialog(@NotNull Context context, @NotNull String route, @NotNull final Function1<? super Map<String, ? extends Object>, Unit> callback) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(route, "route");
            Intrinsics.checkNotNullParameter(callback, "callback");
            try {
                Intent intent = new Intent(context, (Class<?>) FlutterDialogActivity.class);
                RouteExKt.m56281w0(intent, "flutterInitialRoute", route);
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                KCFlutterRouteManager.f46704a.m56853t(intent, new Function1() { // from class: com.kubi.sdk.flutter.ui.e
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FlutterDialogActivity.Companion.m56928b(callback, (Map) obj);
                    }
                });
                context.startActivity(intent);
            } catch (Exception e11) {
                String message = e11.getMessage();
                if (message == null || !(StringsKt.contains$default((CharSequence) message, (CharSequence) "SocketException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "HandshakeException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "Connection closed", false, 2, (Object) null))) {
                    C44199a.m97421b(e11, "FlutterDialogActivity");
                } else {
                    C43846g.m96568c(new FlutterIssueException(e11, "FlutterDialogActivity", true, null, 8, null), null, 2, null);
                }
            }
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: b */
        public static final Unit m56928b(Function1 function1, Map map) {
            function1.invoke(map);
            return Unit.INSTANCE;
        }

        public final void showFlutterDialog(@NotNull String route, @NotNull Function1<? super Map<String, ? extends Object>, Unit> callback) {
            Intrinsics.checkNotNullParameter(route, "route");
            Intrinsics.checkNotNullParameter(callback, "callback");
            showFlutterDialog(C27059l.f54343a.m66757a(), route, callback);
        }
    }

    private static /* synthetic */ void ajc$preClinit() {
        C36686b c36686b = new C36686b("FlutterDialogActivity.kt", FlutterDialogActivity.class);
        f46739l = c36686b.m82128h("method-execution", c36686b.m82127g("4", "onCreate", "com.kubi.sdk.flutter.ui.FlutterDialogActivity", "android.os.Bundle", "savedInstanceState", "", "void"), 0);
        f46740m = c36686b.m82128h("method-execution", c36686b.m82127g("1", "onRequestPermissionsResult", "com.kubi.sdk.flutter.ui.FlutterDialogActivity", "int:[Ljava.lang.String;:[I", "requestCode:permissions:grantResults", "", "void"), 0);
        f46741n = c36686b.m82128h("method-execution", c36686b.m82127g("4", "onDestroy", "com.kubi.sdk.flutter.ui.FlutterDialogActivity", "", "", "", "void"), 0);
    }

    @NotNull
    /* JADX INFO: renamed from: V, reason: from getter */
    public final FlutterViewDelegate getF46742i() {
        return this.f46742i;
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    @Deprecated(message = "Deprecated in Java")
    @SuppressLint({"MissingSuperCall"})
    public void onBackPressed() {
        if (this.f46742i.m56739B()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws Throwable {
        C46611a.m102764b().m102770h(C36686b.m82123c(f46739l, this, this, savedInstanceState));
        super.onCreate(savedInstanceState);
        EdgeToEdgeCompat.f48106a.m58265c(this);
        C5270g.m6203q(new View(this));
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        hideTitleBar();
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(0);
        setContentView(frameLayout);
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        if (C27041f.m66668h(RouteExKt.m56280w(intent, "flutterInitialRoute")).length() == 0) {
            C27100x0.m66924e(new Function0() { // from class: com.kubi.sdk.flutter.ui.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FlutterDialogActivity.m56924W(this.f46773b);
                }
            });
            int i11 = Build.VERSION.SDK_INT;
            if (i11 != 26 && i11 != 27) {
                return;
            }
        }
        this.f46742i.m56761i();
        this.f46742i.m56764l(this);
        FlutterViewDelegate flutterViewDelegate = this.f46742i;
        Intent intent2 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
        String strM56280w = RouteExKt.m56280w(intent2, "flutterInitialRoute");
        if (strM56280w == null) {
            strM56280w = "/";
        }
        flutterViewDelegate.m56756V(strM56280w);
        this.f46742i.m56740C(this, frameLayout, true);
        if (C12573b.f21598a.m23696a()) {
            "com.kubi.event.FlutterEvent:flutterCommonEvent".length();
        }
        C12572a.m23692a(this, false, new FlutterDialogActivity$onCreate$$inlined$bindFlowEvent$default$1("com.kubi.event.FlutterEvent:flutterCommonEvent", null, this));
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() throws Throwable {
        InterfaceC43175a interfaceC43175aM82122b = C36686b.m82122b(f46741n, this, this);
        try {
            super.onDestroy();
            this.f46742i.m56741E();
        } finally {
            C46611a.m102764b().m102771i(interfaceC43175aM82122b);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) throws Throwable {
        InterfaceC43175a interfaceC43175aM82125e = C36686b.m82125e(f46740m, this, this, new Object[]{C43179b.m94790c(requestCode), permissions, grantResults});
        PermissionAspect.m58339c().m58340d(interfaceC43175aM82125e);
        C43330a.m95368b().m95370d(interfaceC43175aM82125e);
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        this.f46742i.m56747M(requestCode, permissions, grantResults);
    }

    static {
        ajc$preClinit();
        f46738k = new Companion(null);
    }

    /* JADX INFO: renamed from: W */
    public static final Unit m56924W(final FlutterDialogActivity flutterDialogActivity) {
        flutterDialogActivity.getWindow().getDecorView().post(new Runnable() { // from class: com.kubi.sdk.flutter.ui.d
            @Override // java.lang.Runnable
            public final void run() {
                FlutterDialogActivity.m56925X(this.f46774b);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X */
    public static final void m56925X(FlutterDialogActivity flutterDialogActivity) {
        flutterDialogActivity.finish();
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    @Deprecated(message = "Deprecated in Java")
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) throws Exception {
        super.onActivityResult(requestCode, resultCode, data);
        this.f46742i.m56774z(requestCode, resultCode, data);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            this.f46742i.m56744I(intent);
        }
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f46742i.m56745K();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f46742i.m56746L();
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() throws JSONException {
        super.onResume();
        if (!this.f46743j.getAndSet(true)) {
            this.f46742i.m56773y();
            this.f46742i.m56738A();
        }
        this.f46742i.m56748N();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        this.f46742i.m56749O();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        this.f46742i.m56742G();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        this.f46742i.m56750P(level);
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        this.f46742i.m56751Q();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        this.f46742i.m56752R(hasFocus);
    }
}
