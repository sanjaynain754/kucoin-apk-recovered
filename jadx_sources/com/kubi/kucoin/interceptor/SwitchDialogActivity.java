package com.kubi.kucoin.interceptor;

import al.RunnableC0377a;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.kubi.sdk.mode.AppMode;
import il.C38674p;
import java.io.File;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: RouteAppModeInterceptor.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010\b\u001a\u00020\u0005H\u0002¨\u0006\n"}, m90084d2 = {"Lcom/kubi/kucoin/interceptor/SwitchDialogActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "loadBackground", "Companion", "LAppRouter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRouteAppModeInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteAppModeInterceptor.kt\ncom/kubi/kucoin/interceptor/SwitchDialogActivity\n+ 2 AppRouterIssue.kt\ncom/kubi/kucoin/exception/AppRouterIssueKt\n+ 3 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n*L\n1#1,239:1\n49#2:240\n70#2:243\n15#3,2:241\n*S KotlinDebug\n*F\n+ 1 RouteAppModeInterceptor.kt\ncom/kubi/kucoin/interceptor/SwitchDialogActivity\n*L\n229#1:240\n229#1:243\n229#1:241,2\n*E\n"})
public final class SwitchDialogActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final Companion f27950i = new Companion(null);

    /* JADX INFO: compiled from: RouteAppModeInterceptor.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kucoin/interceptor/SwitchDialogActivity$Companion;", "", "<init>", "()V", "EXTRA_SWITCH_MODE", "", "EXTRA_SWITCH_BG", "EXTRA_JUMP_URI", "LAppRouter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m32296G() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            String stringExtra = getIntent().getStringExtra("extra_switch_bg");
            Boolean boolValueOf = null;
            if (stringExtra != null) {
                if (!new File(stringExtra).exists()) {
                    stringExtra = null;
                }
                if (stringExtra != null) {
                    getWindow().setBackgroundDrawable(Drawable.createFromPath(stringExtra));
                    boolValueOf = Boolean.valueOf(new File(stringExtra).delete());
                }
            }
            objM103844constructorimpl = Result.m103844constructorimpl(boolValueOf);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C42917g.m94137c().execute(new RunnableC0377a(thM103847exceptionOrNullimpl, "SwitchDialogActivity"));
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppMode appModeFromStringDefault$default = AppMode.Companion.fromStringDefault$default(AppMode.INSTANCE, getIntent().getStringExtra("extra_switch_mode"), null, 2, null);
        String stringExtra = getIntent().getStringExtra("extra_jump_uri");
        if (stringExtra == null) {
            stringExtra = "home";
        }
        C38674p.f86692a.m87418i(this, appModeFromStringDefault$default, stringExtra, true);
        m32296G();
    }
}
