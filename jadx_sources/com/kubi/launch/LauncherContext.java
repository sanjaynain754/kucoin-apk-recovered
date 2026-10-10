package com.kubi.launch;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.kubi.app.facade.R$id;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.startup.IStartupActivity;
import com.kubi.utils.C27012a;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.launch.l, reason: from Kotlin metadata */
/* JADX INFO: compiled from: LauncherContext.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010+\u001a\u00020,H\u0000¢\u0006\u0002\b-R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u0018X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001cX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020 8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020$8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u001b\u0010'\u001a\u00020\u000f8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0011¨\u0006."}, m90084d2 = {"Lcom/kubi/launch/LauncherContext;", "", "activity", "Lcom/kubi/sdk/BaseActivity;", "<init>", "(Lcom/kubi/sdk/BaseActivity;)V", "getActivity$LAppFacade_googleRelease", "()Lcom/kubi/sdk/BaseActivity;", "path", "", "getPath$LAppFacade_googleRelease", "()Ljava/lang/String;", "setPath$LAppFacade_googleRelease", "(Ljava/lang/String;)V", "clearActivityStack", "", "getClearActivityStack$LAppFacade_googleRelease", "()Z", "setClearActivityStack$LAppFacade_googleRelease", "(Z)V", BaseGmsClient.KEY_PENDING_INTENT, "getPendingIntent$LAppFacade_googleRelease", "setPendingIntent$LAppFacade_googleRelease", ReportDataTable.COLUMN_PARAMS, "", "getParams$LAppFacade_googleRelease", "()Ljava/util/Map;", "state", "Lcom/kubi/launch/LauncherState;", "getState$LAppFacade_googleRelease", "()Lcom/kubi/launch/LauncherState;", "intent", "Landroid/content/Intent;", "getIntent$LAppFacade_googleRelease", "()Landroid/content/Intent;", "lifecycleScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "getLifecycleScope$LAppFacade_googleRelease", "()Landroidx/lifecycle/LifecycleCoroutineScope;", "hasAnyBizActivity", "getHasAnyBizActivity$LAppFacade_googleRelease", "hasAnyBizActivity$delegate", "Lkotlin/Lazy;", "getSplashView", "Landroid/view/View;", "getSplashView$LAppFacade_googleRelease", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLauncherContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LauncherContext.kt\ncom/kubi/launch/LauncherContext\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,46:1\n1761#2,3:47\n*S KotlinDebug\n*F\n+ 1 LauncherContext.kt\ncom/kubi/launch/LauncherContext\n*L\n35#1:47,3\n*E\n"})
public final class LauncherContext {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final BaseActivity f31802a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public String f31803b;

    /* JADX INFO: renamed from: c */
    public boolean f31804c;

    /* JADX INFO: renamed from: d */
    public boolean f31805d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Map<String, Object> f31806e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final LauncherState f31807f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final Lazy f31808g;

    public LauncherContext(@NotNull BaseActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f31802a = activity;
        this.f31806e = new LinkedHashMap();
        this.f31807f = new LauncherState();
        this.f31808g = LazyKt.lazy(new Function0() { // from class: com.kubi.launch.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(LauncherContext.m37482l());
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final BaseActivity getF31802a() {
        return this.f31802a;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getF31804c() {
        return this.f31804c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m37485d() {
        return ((Boolean) this.f31808g.getValue()).booleanValue();
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final Intent m37486e() {
        Intent intent = this.f31802a.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        return intent;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final LifecycleCoroutineScope m37487f() {
        return LifecycleOwnerKt.getLifecycleScope(this.f31802a);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final Map<String, Object> m37488g() {
        return this.f31806e;
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getF31803b() {
        return this.f31803b;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getF31805d() {
        return this.f31805d;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final View m37491j() {
        View viewFindViewById = this.f31802a.findViewById(R$id.splash_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        return viewFindViewById;
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public final LauncherState getF31807f() {
        return this.f31807f;
    }

    /* JADX INFO: renamed from: m */
    public final void m37493m(boolean z11) {
        this.f31804c = z11;
    }

    /* JADX INFO: renamed from: n */
    public final void m37494n(@Nullable String str) {
        this.f31803b = str;
    }

    /* JADX INFO: renamed from: o */
    public final void m37495o(boolean z11) {
        this.f31805d = z11;
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m37482l() {
        Stack<Activity> stackM66493g = C27012a.m66486i().m66493g();
        Intrinsics.checkNotNullExpressionValue(stackM66493g, "getActivityStack(...)");
        if (stackM66493g != null && stackM66493g.isEmpty()) {
            return false;
        }
        Iterator<T> it = stackM66493g.iterator();
        while (it.hasNext()) {
            if (!(((Activity) it.next()) instanceof IStartupActivity)) {
                return true;
            }
        }
        return false;
    }
}
