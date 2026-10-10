package com.kubi.kucoin.utils;

import android.content.DialogInterface;
import androidx.core.content.ContextCompat;
import com.kubi.location.R$string;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseApplication;
import com.kubi.utils.DataMapUtil;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;
import xb0.C46126b;

/* JADX INFO: renamed from: com.kubi.kucoin.utils.p0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: Locate.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\bH\u0016J0\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0016J\u001e\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/kucoin/utils/Locate;", "", "onStart", "", "activity", "Lcom/kubi/sdk/BaseActivity;", "onStop", "checkPermission", "", "requestPermissions", "openGPS", "Lkotlin/Function0;", TUIConstants.TUIChat.CALL_BACK, "startRequestPermission", "addRefuseNums", "resetRefuseNums", "LLocation_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface Locate {
    void onStop();

    /* JADX INFO: renamed from: q */
    void mo33094q(@NotNull BaseActivity baseActivity);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    static /* synthetic */ void m33156b(Locate locate, BaseActivity baseActivity, Function0 function0, Function0 function1, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestPermissions");
        }
        if ((i11 & 2) != 0) {
            function0 = null;
        }
        locate.m33172s(baseActivity, function0, function1);
    }

    /* JADX INFO: renamed from: h */
    static void m33161h(Function0 function0, Locate locate, BaseActivity baseActivity, Function0 function1, DialogInterface dialogInterface, int i11) {
        if (function0 != null) {
            function0.invoke();
        }
        locate.m33169k();
        locate.m33170m(baseActivity, function1);
    }

    /* JADX INFO: renamed from: i */
    static Unit m33162i(BaseActivity baseActivity, Throwable th2) {
        C44128b.m97267k("Locate: 系统弹窗申请异常 " + th2.getMessage());
        LocateManager.f28544a.m33106i(null, false, baseActivity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    default boolean m33168g() {
        return ContextCompat.checkSelfPermission(BaseApplication.INSTANCE.get(), "android.permission.ACCESS_COARSE_LOCATION") != 0;
    }

    /* JADX INFO: renamed from: k */
    default void m33169k() {
        DataMapUtil dataMapUtil = DataMapUtil.f54245a;
        dataMapUtil.m66379n("REQUEST_PERMISSION_TIME", 0L);
        if (DataMapUtil.m66367d(dataMapUtil, "REFUSE_PERMISSION", 0, 2, null) > 0) {
            C44128b.m97267k("Locate: 重置拒绝次数");
            dataMapUtil.m66378m("REFUSE_PERMISSION", 0);
        }
    }

    /* JADX INFO: renamed from: m */
    default void m33170m(@NotNull final BaseActivity activity, @NotNull final Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Observable<Boolean> observableM101655n = new C46126b(activity).m101655n("android.permission.ACCESS_COARSE_LOCATION");
        final Function1 function1 = new Function1() { // from class: com.kubi.kucoin.utils.l0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Locate.m33167p(callback, this, activity, (Boolean) obj);
            }
        };
        Consumer<? super Boolean> consumer = new Consumer() { // from class: com.kubi.kucoin.utils.m0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                Locate.m33155a(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.kucoin.utils.n0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Locate.m33162i(activity, (Throwable) obj);
            }
        };
        RouteExKt.m56238b(observableM101655n.subscribe(consumer, new Consumer() { // from class: com.kubi.kucoin.utils.o0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                Locate.m33160f(function2, obj);
            }
        }), activity);
    }

    /* JADX INFO: renamed from: r */
    default void m33171r() {
        C44128b.m97267k("Locate: 拒绝次数+1");
        DataMapUtil dataMapUtil = DataMapUtil.f54245a;
        dataMapUtil.m66379n("REQUEST_PERMISSION_TIME", System.currentTimeMillis());
        dataMapUtil.m66378m("REFUSE_PERMISSION", DataMapUtil.m66367d(dataMapUtil, "REFUSE_PERMISSION", 0, 2, null) + 1);
    }

    /* JADX INFO: renamed from: s */
    default void m33172s(@NotNull final BaseActivity activity, @Nullable final Function0<Unit> function0, @NotNull final Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        DataMapUtil dataMapUtil = DataMapUtil.f54245a;
        if (DataMapUtil.m66367d(dataMapUtil, "REFUSE_PERMISSION", 0, 2, null) >= 3) {
            LocateManager.f28544a.m33106i(null, false, activity);
            return;
        }
        if ((System.currentTimeMillis() - DataMapUtil.m66368f(dataMapUtil, "REQUEST_PERMISSION_TIME", 0L, 2, null)) / ((double) 86400000) > 7.0d) {
            AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54153J4(R$string.gps_ios_authorization_tips).m54162S4(R$string.authorize, new DialogInterface.OnClickListener() { // from class: com.kubi.kucoin.utils.j0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    Locate.m33161h(function0, this, activity, callback, dialogInterface, i11);
                }
            }).m54159P4(R$string.cancel, new DialogInterface.OnClickListener() { // from class: com.kubi.kucoin.utils.k0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    Locate.m33164l(this.f28580b, activity, dialogInterface, i11);
                }
            }).m54172c5(activity.getSupportFragmentManager());
        } else {
            C44128b.m97267k("Locate: 7天内不重复请求权限");
            LocateManager.f28544a.m33106i(null, false, activity);
        }
    }

    /* JADX INFO: renamed from: a */
    static void m33155a(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: f */
    static void m33160f(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l */
    static void m33164l(Locate locate, BaseActivity baseActivity, DialogInterface dialogInterface, int i11) {
        locate.m33171r();
        LocateManager.f28544a.m33106i(null, false, baseActivity);
    }

    /* JADX INFO: renamed from: p */
    static Unit m33167p(Function0 function0, Locate locate, BaseActivity baseActivity, Boolean bool) {
        if (bool.booleanValue()) {
            function0.invoke();
            locate.m33169k();
        } else {
            C44128b.m97267k("Locate: 系统弹窗拒绝+1");
            locate.m33171r();
            LocateManager.f28544a.m33106i(null, false, baseActivity);
        }
        return Unit.INSTANCE;
    }
}
