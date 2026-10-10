package com.kubi.sdk;

import android.R;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.blankj.utilcode.util.C5258a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.mine.lib.jsapi.KCTurboSystemSettingsModuleImpl;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.applet.IAppletService;
import com.kubi.sdk.exception.AppBaseException;
import com.kubi.sdk.exception.AppBaseMessage;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.kubi.sdk.widget.TitleBar;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27063n;
import com.kubi.utils.C27097w;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import dh0.C36686b;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import k10.DialogC40864b;
import k10.InterfaceC40863a;
import org.aspectj.lang.InterfaceC43175a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p569qq.C43853n;
import p569qq.InterfaceC43845f;
import p694vk.C45590s;
import p813yy.C46611a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BaseActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 }2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001}B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0014J\b\u00100\u001a\u000201H\u0002J\b\u00102\u001a\u00020-H\u0002J\u0010\u00103\u001a\u00020-2\u0006\u00104\u001a\u000205H\u0016J\u001c\u00103\u001a\u00020-2\b\u00106\u001a\u0004\u0018\u0001072\b\u00108\u001a\u0004\u0018\u000109H\u0016J\u0010\u00103\u001a\u00020-2\u0006\u00106\u001a\u000207H\u0016J\u0010\u0010:\u001a\u00020-2\u0006\u0010;\u001a\u00020/H\u0014J\b\u0010<\u001a\u000205H\u0016J\b\u0010=\u001a\u00020-H\u0014J\b\u0010>\u001a\u00020-H\u0014J\b\u0010?\u001a\u00020-H\u0014J\u0018\u0010@\u001a\u00020-2\u0006\u0010A\u001a\u00020$2\b\b\u0002\u0010B\u001a\u00020/J \u0010C\u001a\u00020-2\u0006\u0010A\u001a\u00020$2\u0006\u0010D\u001a\u00020&2\b\b\u0002\u0010E\u001a\u000201J\u0012\u0010F\u001a\u00020-2\b\u0010G\u001a\u0004\u0018\u00010HH\u0014J\u0006\u0010I\u001a\u00020-J\b\u0010J\u001a\u00020-H\u0016J\b\u0010K\u001a\u00020-H\u0016J\u0006\u0010L\u001a\u00020-J\u0010\u0010M\u001a\u00020-2\b\b\u0002\u0010N\u001a\u000201J\b\u0010O\u001a\u00020\u0019H\u0007J\u0006\u0010P\u001a\u00020-J\u0006\u0010Q\u001a\u00020-J&\u0010R\u001a\u00020-2\b\b\u0002\u0010S\u001a\u0002052\b\b\u0002\u0010T\u001a\u0002052\n\b\u0002\u0010U\u001a\u0004\u0018\u00010VJ\u001c\u0010W\u001a\u00020-2\b\b\u0002\u0010S\u001a\u0002052\n\b\u0002\u0010U\u001a\u0004\u0018\u00010VJ$\u0010W\u001a\u00020-2\u0006\u0010S\u001a\u00020X2\b\b\u0002\u0010T\u001a\u0002052\n\b\u0002\u0010U\u001a\u0004\u0018\u00010VJ\u0006\u0010Y\u001a\u00020-J\u0006\u0010Z\u001a\u00020-J\n\u0010[\u001a\u000201*\u00020\\J\b\u0010]\u001a\u00020-H\u0002J\b\u0010^\u001a\u00020-H\u0002J\b\u0010_\u001a\u00020`H\u0016J\u001c\u0010a\u001a\u00020-2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020-0c2\u0006\u0010d\u001a\u00020eJ\b\u0010f\u001a\u000205H\u0002J\"\u0010l\u001a\u00020-2\u0006\u0010m\u001a\u0002052\u0006\u0010n\u001a\u0002052\b\u0010o\u001a\u0004\u0018\u00010pH\u0014J \u0010q\u001a\u00020-2\u0006\u0010r\u001a\u00020p2\u000e\u0010s\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010p0tH\u0016J\n\u0010u\u001a\u0004\u0018\u00010vH\u0016J\b\u0010w\u001a\u000201H\u0014J\u001c\u0010x\u001a\u00020-2\b\u0010r\u001a\u0004\u0018\u00010p2\b\u0010y\u001a\u0004\u0018\u00010/H\u0016J\u0010\u0010z\u001a\u0002012\u0006\u0010{\u001a\u00020|H\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0012\u001a\u0004\b\u001f\u0010 R \u0010\"\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010'\u001a\u0004\u0018\u00010$X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001b\u0010g\u001a\u00020h8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bk\u0010\u0012\u001a\u0004\bi\u0010j¨\u0006~"}, m90084d2 = {"Lcom/kubi/sdk/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/kubi/sdk/IContentCallback;", "Lcom/kubi/monitor/ITrackPage;", "Lcom/kubi/sdk/IActivityWithResult;", "<init>", "()V", "visibleDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getVisibleDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "destroyDisposable", "getDestroyDisposable", "titleBar", "Lcom/kubi/sdk/widget/TitleBar;", "getTitleBar", "()Lcom/kubi/sdk/widget/TitleBar;", "titleBar$delegate", "Lkotlin/Lazy;", "content", "Landroid/widget/FrameLayout;", "getContent", "()Landroid/widget/FrameLayout;", "content$delegate", "loadingDialog", "Lcom/kubi/sdk/widget/loading/LoadingDialog;", "getLoadingDialog", "()Lcom/kubi/sdk/widget/loading/LoadingDialog;", "loadingDialog$delegate", "loadingView", "Lcom/kubi/sdk/widget/loading/ILoadingView;", "getLoadingView", "()Lcom/kubi/sdk/widget/loading/ILoadingView;", "loadingView$delegate", "resultListeners", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Ljava/lang/ref/WeakReference;", "Lcom/kubi/sdk/FragmentResultListener;", "pageId", "getPageId", "()Ljava/lang/String;", "setPageId", "(Ljava/lang/String;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "safeCheckContentView", "", "attachLayout", "setContentView", "layoutResID", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", ReportDataTable.COLUMN_PARAMS, "Landroid/view/ViewGroup$LayoutParams;", "onSaveInstanceState", "outState", "getBundleSizeLimit", "onResume", "onPause", "onDestroy", "setFragmentResult", "requestKey", DbParams.KEY_CHANNEL_RESULT, "setFragmentResultListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addTo", "attachBaseContext", "newBase", "Landroid/content/Context;", "preformBackPressed", "onBackPressed", "onPreFinish", "showLoadingDialog", "hideLoadingDialog", "dismiss", "getLoadingDialogForTest", "showLoadingView", "showContentView", "showEmptyView", "tips", TUIConstants.TUIChat.INPUT_MORE_ICON, "click", "Landroid/view/View$OnClickListener;", "showFailView", "", "hideTitleBar", "showTitleBar", "dispatchBackPress", "Landroidx/fragment/app/FragmentManager;", "processTitleBar", "processFragment", "getResources", "Landroid/content/res/Resources;", "runOnUiThread", "block", "Lkotlin/Function0;", "delay", "", "getStatusBarHeight", "resultDelegate", "Lcom/kubi/sdk/ResultDelegate;", "getResultDelegate", "()Lcom/kubi/sdk/ResultDelegate;", "resultDelegate$delegate", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "startActivityWithResult", "intent", "callBack", "Lio/reactivex/functions/Consumer;", "onBackBitmap", "Landroid/graphics/Bitmap;", "needHandleActivityNotFoundException", "startActivity", "options", "dispatchKeyEvent", "event", "Landroid/view/KeyEvent;", "Companion", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBaseActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseActivity.kt\ncom/kubi/sdk/BaseActivity\n+ 2 AppBaseIssue.kt\ncom/kubi/sdk/exception/AppBaseIssueKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,484:1\n45#2,2:485\n45#2,2:487\n45#2,2:490\n45#2,2:492\n49#2,2:494\n45#2,2:496\n45#2,2:500\n49#2,2:502\n45#2,2:504\n1#3:489\n1869#4,2:498\n*S KotlinDebug\n*F\n+ 1 BaseActivity.kt\ncom/kubi/sdk/BaseActivity\n*L\n85#1:485,2\n95#1:487,2\n106#1:490,2\n125#1:492,2\n206#1:494,2\n224#1:496,2\n369#1:500,2\n462#1:502,2\n464#1:504,2\n359#1:498,2\n*E\n"})
public class BaseActivity extends AppCompatActivity implements InterfaceC43845f, IActivityWithResult {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    public static final String FRAGMENT = "fragment";

    @NotNull
    public static final String STATUS_BAR = "status_bar";

    @NotNull
    public static final String THEME = "theme";

    @NotNull
    public static final String TITLE_BAR = "title_bar";

    @NotNull
    public static final String TITLE_TEXT = "title";

    @NotNull
    public static final String WEB_DEBUG_TAG = "MyKcWebView-BaseActivity";
    private static /* synthetic */ InterfaceC43175a.a ajc$tjp_0;
    private static /* synthetic */ InterfaceC43175a.a ajc$tjp_1;
    private static /* synthetic */ InterfaceC43175a.a ajc$tjp_2;
    private static /* synthetic */ InterfaceC43175a.a ajc$tjp_3;

    @Nullable
    private String pageId;

    @NotNull
    private final CompositeDisposable visibleDisposable = new CompositeDisposable();

    @NotNull
    private final CompositeDisposable destroyDisposable = new CompositeDisposable();

    /* JADX INFO: renamed from: titleBar$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy titleBar = LazyKt.lazy(new Function0() { // from class: com.kubi.sdk.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseActivity.titleBar_delegate$lambda$0(this.f46560b);
        }
    });

    /* JADX INFO: renamed from: content$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy content = LazyKt.lazy(new Function0() { // from class: com.kubi.sdk.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseActivity.content_delegate$lambda$2(this.f46832b);
        }
    });

    /* JADX INFO: renamed from: loadingDialog$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy loadingDialog = LazyKt.lazy(new Function0() { // from class: com.kubi.sdk.h
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseActivity.loadingDialog_delegate$lambda$3(this.f46841b);
        }
    });

    /* JADX INFO: renamed from: loadingView$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy loadingView = LazyKt.lazy(new Function0() { // from class: com.kubi.sdk.i
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseActivity.loadingView_delegate$lambda$4(this.f46851b);
        }
    });

    @NotNull
    private final ConcurrentHashMap<String, WeakReference<FragmentResultListener>> resultListeners = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: resultDelegate$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy resultDelegate = LazyKt.lazy(new Function0() { // from class: com.kubi.sdk.j
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseActivity.resultDelegate_delegate$lambda$29();
        }
    });

    /* JADX INFO: compiled from: BaseActivity.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0013\u001a\u00020\u0005J*\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/sdk/BaseActivity$Companion;", "", "<init>", "()V", "WEB_DEBUG_TAG", "", "TITLE_TEXT", "TITLE_BAR", "STATUS_BAR", "FRAGMENT", "THEME", InterfaceC33617e1.f69659h, "", "context", "Landroid/content/Context;", "fragment", "Ljava/lang/Class;", "bundle", "Landroid/os/Bundle;", "title", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nBaseActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseActivity.kt\ncom/kubi/sdk/BaseActivity$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,484:1\n1#2:485\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@NotNull Context context, @NotNull Class<?> fragment, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intent intent = new Intent(context, (Class<?>) BaseActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.putExtra("fragment", fragment.getName());
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            context.startActivity(intent);
        }

        public Companion() {
        }

        public static /* synthetic */ void launch$default(Companion companion, Context context, Class cls, Bundle bundle, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                bundle = null;
            }
            companion.launch(context, (Class<?>) cls, bundle);
        }

        public final void launch(@NotNull Context context, @NotNull Class<?> fragment, @NotNull String title) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(title, "title");
            Intent intent = new Intent(context, (Class<?>) BaseActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.putExtra("fragment", fragment.getName());
            intent.putExtra("title", title);
            context.startActivity(intent);
        }

        public final void launch(@NotNull Context context, @NotNull Class<?> fragment, @NotNull String title, @NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intent intent = new Intent(context, (Class<?>) BaseActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.putExtra("fragment", fragment.getName());
            intent.putExtra("title", title);
            intent.putExtras(bundle);
            context.startActivity(intent);
        }
    }

    public static /* synthetic */ void showFailView$default(BaseActivity baseActivity, int i11, View.OnClickListener onClickListener, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showFailView");
        }
        if ((i12 & 1) != 0) {
            i11 = R$string.load_failed_click_retry;
        }
        if ((i12 & 2) != 0) {
            onClickListener = null;
        }
        baseActivity.showFailView(i11, onClickListener);
    }

    public boolean needHandleActivityNotFoundException() {
        return false;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int layoutResID) {
        if (safeCheckContentView()) {
            return;
        }
        super.setContentView(layoutResID);
    }

    public final void showFailView(int tips, @Nullable View.OnClickListener click) {
        getLoadingView().showError(tips, click);
    }

    private static /* synthetic */ void ajc$preClinit() {
        C36686b c36686b = new C36686b("BaseActivity.kt", BaseActivity.class);
        ajc$tjp_0 = c36686b.m82128h("method-execution", c36686b.m82127g("4", "onCreate", "com.kubi.sdk.BaseActivity", "android.os.Bundle", "savedInstanceState", "", "void"), 81);
        ajc$tjp_1 = c36686b.m82128h("method-execution", c36686b.m82127g("4", "onDestroy", "com.kubi.sdk.BaseActivity", "", "", "", "void"), 221);
        ajc$tjp_2 = c36686b.m82128h("method-execution", c36686b.m82127g("4", "attachBaseContext", "com.kubi.sdk.BaseActivity", "android.content.Context", "newBase", "", "void"), 0);
        ajc$tjp_3 = c36686b.m82128h("method-execution", c36686b.m82127g("1", "getResources", "com.kubi.sdk.BaseActivity", "", "", "", "android.content.res.Resources"), 0);
    }

    private final void attachLayout() {
        String stringExtra;
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setId(R$id.base_activity_layout);
        TitleBar titleBar = getTitleBar();
        ViewParent parent = titleBar.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(titleBar);
        }
        linearLayout.addView(titleBar, new FrameLayout.LayoutParams(-1, TitleBar.f48580r.dp2px(this, 44)));
        FrameLayout content = getContent();
        ViewParent parent2 = content.getParent();
        ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
        if (viewGroup2 != null) {
            viewGroup2.removeView(content);
        }
        linearLayout.addView(content, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        Intent intent = getIntent();
        layoutParams.topMargin = (intent == null || (stringExtra = intent.getStringExtra(STATUS_BAR)) == null || !Boolean.parseBoolean(stringExtra)) ? 0 : getStatusBarHeight();
        Unit unit = Unit.INSTANCE;
        super.setContentView(linearLayout, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FrameLayout content_delegate$lambda$2(BaseActivity baseActivity) {
        FrameLayout frameLayout = new FrameLayout(baseActivity);
        frameLayout.setId(R$id.content);
        return frameLayout;
    }

    private final DialogC40864b getLoadingDialog() {
        return (DialogC40864b) this.loadingDialog.getValue();
    }

    private final InterfaceC40863a getLoadingView() {
        Object value = this.loadingView.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (InterfaceC40863a) value;
    }

    private final ResultDelegate getResultDelegate() {
        return (ResultDelegate) this.resultDelegate.getValue();
    }

    private final int getStatusBarHeight() {
        return EdgeToEdgeCompat.f48106a.m58272j();
    }

    public static /* synthetic */ void hideLoadingDialog$default(BaseActivity baseActivity, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hideLoadingDialog");
        }
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        baseActivity.hideLoadingDialog(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DialogC40864b loadingDialog_delegate$lambda$3(BaseActivity baseActivity) {
        return new DialogC40864b(baseActivity, false, 2, null);
    }

    private final void processFragment() {
        Object objM103844constructorimpl;
        if (Intrinsics.areEqual(getClass(), BaseActivity.class)) {
            try {
                Result.Companion companion = Result.INSTANCE;
                List<Fragment> fragments = getSupportFragmentManager().getFragments();
                Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
                if (!fragments.isEmpty()) {
                    FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
                    List<Fragment> fragments2 = getSupportFragmentManager().getFragments();
                    Intrinsics.checkNotNullExpressionValue(fragments2, "getFragments(...)");
                    Iterator<T> it = fragments2.iterator();
                    while (it.hasNext()) {
                        fragmentTransactionBeginTransaction.remove((Fragment) it.next());
                    }
                    fragmentTransactionBeginTransaction.commitAllowingStateLoss();
                }
                String stringExtra = getIntent().getStringExtra("fragment");
                objM103844constructorimpl = Result.m103844constructorimpl(stringExtra != null ? Integer.valueOf(getSupportFragmentManager().beginTransaction().add(R$id.content, Fragment.instantiate(this, stringExtra, getIntent().getExtras())).addToBackStack(null).commitAllowingStateLoss()) : null);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                String simpleName = getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                C43846g.m96568c(new AppBaseException(thM103847exceptionOrNullimpl, simpleName, false, null, 8, null), null, 2, null);
                finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ResultDelegate resultDelegate_delegate$lambda$29() {
        return new ResultDelegate();
    }

    private final boolean safeCheckContentView() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(getWindow().findViewById(R.id.content));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            String simpleName = getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            C43846g.m96568c(new AppBaseException(thM103847exceptionOrNullimpl, simpleName, false, null, 8, null), null, 2, null);
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        if (objM103844constructorimpl != null) {
            return false;
        }
        C27100x0.m66924e(new Function0() { // from class: com.kubi.sdk.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseActivity.safeCheckContentView$lambda$13(this.f46865b);
            }
        });
        return true;
    }

    public static /* synthetic */ void setFragmentResult$default(BaseActivity baseActivity, String str, Bundle bundle, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFragmentResult");
        }
        if ((i11 & 2) != 0) {
            bundle = new Bundle();
        }
        baseActivity.setFragmentResult(str, bundle);
    }

    public static /* synthetic */ void setFragmentResultListener$default(BaseActivity baseActivity, String str, FragmentResultListener fragmentResultListener, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFragmentResultListener");
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        baseActivity.setFragmentResultListener(str, fragmentResultListener, z11);
    }

    public static /* synthetic */ void showEmptyView$default(BaseActivity baseActivity, int i11, int i12, View.OnClickListener onClickListener, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showEmptyView");
        }
        if ((i13 & 1) != 0) {
            i11 = R$string.load_failed_click_retry;
        }
        if ((i13 & 2) != 0) {
            i12 = R$drawable.ic2_common_empty;
        }
        if ((i13 & 4) != 0) {
            onClickListener = null;
        }
        baseActivity.showEmptyView(i11, i12, onClickListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TitleBar titleBar_delegate$lambda$0(BaseActivity baseActivity) {
        return new TitleBar(baseActivity);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(@Nullable Context newBase) throws Throwable {
        C46611a.m102764b().m102765c(new C23897n(new Object[]{this, newBase, C36686b.m82123c(ajc$tjp_2, this, this, newBase)}).linkClosureAndJoinPoint(69648));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean dispatchBackPress(@NotNull FragmentManager fragmentManager) {
        int size;
        Intrinsics.checkNotNullParameter(fragmentManager, "<this>");
        List<Fragment> fragments = fragmentManager.getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        if (fragments.isEmpty() || (size = fragmentManager.getFragments().size() - 1) < 0) {
            return false;
        }
        while (true) {
            int i11 = size - 1;
            Fragment fragment = fragmentManager.getFragments().get(size);
            if (fragment != 0 && !(fragment instanceof DialogFragment) && fragment.getContext() != null) {
                FragmentManager childFragmentManager = fragment.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                if (dispatchBackPress(childFragmentManager)) {
                    return true;
                }
                if (fragment.isResumed() && fragment.isVisible() && fragment.getUserVisibleHint() && (fragment instanceof IBackCallback) && ((IBackCallback) fragment).onBackPressed()) {
                    return true;
                }
            }
            if (i11 < 0) {
                return false;
            }
            size = i11;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(@NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (C45590s.f102687a.m100666Q() && (event.getKeyCode() == 5 || event.getKeyCode() == 6)) {
            return true;
        }
        return super.dispatchKeyEvent(event);
    }

    public int getBundleSizeLimit() {
        return 500;
    }

    @NotNull
    public final FrameLayout getContent() {
        return (FrameLayout) this.content.getValue();
    }

    @NotNull
    public final CompositeDisposable getDestroyDisposable() {
        return this.destroyDisposable;
    }

    @Nullable
    /* JADX INFO: renamed from: getPageId, reason: from getter */
    public String getF79322n() {
        return this.pageId;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    @NotNull
    public Resources getResources() {
        return C46611a.m102764b().m102768f(new C23902o(new Object[]{this, C36686b.m82122b(ajc$tjp_3, this, this)}).linkClosureAndJoinPoint(69648));
    }

    @NotNull
    public final TitleBar getTitleBar() {
        return (TitleBar) this.titleBar.getValue();
    }

    @NotNull
    public final CompositeDisposable getVisibleDisposable() {
        return this.visibleDisposable;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        IAppletService.f46452a.get().mo15069d(this, new Function0() { // from class: com.kubi.sdk.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseActivity.onBackPressed$lambda$20(this.f46538b);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws Throwable {
        boolean zM66909a;
        Object objM103844constructorimpl;
        C46611a.m102764b().m102770h(C36686b.m82123c(ajc$tjp_0, this, this, savedInstanceState));
        try {
            zM66909a = C27097w.f54454a.m66909a(this, savedInstanceState);
        } catch (Throwable th2) {
            C43846g.m96568c(new AppBaseException(th2, "FragmentStateFixer", false, null, 8, null), null, 2, null);
            zM66909a = false;
        }
        super.onCreate(savedInstanceState);
        try {
            String simpleName = getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            C43846g.m96571f("LAST_ACTIVITY", simpleName);
            getWindow().getDecorView();
            try {
                Result.Companion companion = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(Integer.valueOf(C27063n.m66765c(KCTurboSystemSettingsModuleImpl.KV_KEY_UP_DOWN, 0, 1, null)));
            } catch (Throwable th3) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th3));
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                C43846g.m96568c(new AppBaseException(thM103847exceptionOrNullimpl, "BaseActivityTheme", false, null, 8, null), null, 2, null);
            }
            if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
                objM103844constructorimpl = 0;
            }
            int intExtra = ((Number) objM103844constructorimpl).intValue() == 0 ? R$style.kucoin_AppTheme_1 : R$style.kucoin_AppTheme_2;
            Intent intent = getIntent();
            if (intent != null) {
                intExtra = intent.getIntExtra(THEME, intExtra);
            }
            setTheme(intExtra);
            AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
            if (safeCheckContentView()) {
                return;
            }
            attachLayout();
            processTitleBar();
            processFragment();
        } catch (Throwable th4) {
            if (zM66909a) {
                C43846g.m96568c(new AppBaseException(th4, "FragmentStateFixer", false, null, 8, null), null, 2, null);
            }
            if (C45590s.f102687a.m100666Q()) {
                throw th4;
            }
            C27100x0.m66924e(new Function0() { // from class: com.kubi.sdk.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseActivity.onCreate$lambda$6(this.f46519b);
                }
            });
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() throws Throwable {
        Object objM103844constructorimpl;
        InterfaceC43175a interfaceC43175aM82122b = C36686b.m82122b(ajc$tjp_1, this, this);
        try {
            try {
                Result.Companion companion = Result.INSTANCE;
                super.onDestroy();
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                C43846g.m96568c(new AppBaseException(thM103847exceptionOrNullimpl, "BaseActivity", false, null, 8, null), null, 2, null);
            }
            this.destroyDisposable.dispose();
        } finally {
            C46611a.m102764b().m102771i(interfaceC43175aM82122b);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 == 24 || i11 == 25) {
            try {
                super.onResume();
            } catch (IllegalArgumentException unused) {
                C43846g.m96568c(new AppBaseMessage("onResume isTopOfTask crash", "BaseActivity", false, 4, null), null, 2, null);
            }
        } else {
            super.onResume();
        }
        C43853n.m96608b(this);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        if (C27025c.m66563a(outState) > getBundleSizeLimit() * 1024) {
            outState.clear();
        }
    }

    public final void runOnUiThread(@NotNull final Function0<Unit> block, long delay) {
        Intrinsics.checkNotNullParameter(block, "block");
        Flowable<Long> flowableObserveOn = Flowable.timer(delay, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.sdk.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseActivity.runOnUiThread$lambda$27(block, (Long) obj);
            }
        };
        Disposable disposableSubscribe = flowableObserveOn.subscribe(new Consumer() { // from class: com.kubi.sdk.m
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, this.destroyDisposable);
    }

    public final void setFragmentResult(@NotNull String requestKey, @NotNull Bundle result) {
        FragmentResultListener fragmentResultListener;
        Intrinsics.checkNotNullParameter(requestKey, "requestKey");
        Intrinsics.checkNotNullParameter(result, "result");
        WeakReference<FragmentResultListener> weakReference = this.resultListeners.get(requestKey);
        if (weakReference == null || (fragmentResultListener = weakReference.get()) == null) {
            return;
        }
        fragmentResultListener.mo26171a(result);
    }

    public final void setFragmentResultListener(@NotNull String requestKey, @NotNull FragmentResultListener listener, boolean z11) {
        Intrinsics.checkNotNullParameter(requestKey, "requestKey");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (z11) {
            RouteExKt.m56238b(listener, this);
        }
        this.resultListeners.put(requestKey, new WeakReference<>(listener));
    }

    public void setPageId(@Nullable String str) {
        this.pageId = str;
    }

    public final void showFailView(@NotNull CharSequence tips, int icon, @Nullable View.OnClickListener click) {
        Intrinsics.checkNotNullParameter(tips, "tips");
        getLoadingView().showEmpty(tips, icon, click);
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(@Nullable Intent intent, @Nullable Bundle options) throws Throwable {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            super.startActivity(intent, options);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            if (!(thM103847exceptionOrNullimpl instanceof ActivityNotFoundException)) {
                String simpleName = getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                C43846g.m96568c(new AppBaseException(thM103847exceptionOrNullimpl, simpleName, false, null, 8, null), null, 2, null);
            } else {
                if (needHandleActivityNotFoundException()) {
                    throw thM103847exceptionOrNullimpl;
                }
                String strValueOf = String.valueOf(thM103847exceptionOrNullimpl.getMessage());
                String simpleName2 = getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName2, "getSimpleName(...)");
                C43846g.m96568c(new AppBaseMessage(strValueOf, simpleName2, false, 4, null), null, 2, null);
            }
        }
    }

    @Override // com.kubi.sdk.IActivityWithResult
    public void startActivityWithResult(@NotNull Intent intent, @NotNull Consumer<Intent> callBack) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        getResultDelegate().m56599c(this, intent, callBack);
    }

    static {
        ajc$preClinit();
        INSTANCE = new Companion(null);
    }

    public static final /* synthetic */ Resources getResources_aroundBody2(BaseActivity baseActivity, InterfaceC43175a interfaceC43175a) {
        Resources resources = super.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return resources;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WrapperLoadingView loadingView_delegate$lambda$4(BaseActivity baseActivity) {
        return WrapperLoadingView.injectView(baseActivity.getContent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBackPressed$lambda$20(BaseActivity baseActivity) {
        FragmentManager supportFragmentManager = baseActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        if (!baseActivity.dispatchBackPress(supportFragmentManager)) {
            baseActivity.onPreFinish();
            baseActivity.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$6(final BaseActivity baseActivity) {
        baseActivity.getWindow().getDecorView().post(new Runnable() { // from class: com.kubi.sdk.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f46445b.finish();
            }
        });
        return Unit.INSTANCE;
    }

    private final void processTitleBar() {
        String stringExtra;
        String stringExtra2;
        getTitleBar().setOnNavigationListener(new View.OnClickListener() { // from class: com.kubi.sdk.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46486b.onBackPressed();
            }
        });
        TitleBar titleBar = getTitleBar();
        Intent intent = getIntent();
        if (intent != null) {
            stringExtra = intent.getStringExtra("title");
        } else {
            stringExtra = null;
        }
        titleBar.setTitle(stringExtra);
        Intent intent2 = getIntent();
        if (intent2 != null && (stringExtra2 = intent2.getStringExtra(TITLE_BAR)) != null && !Boolean.parseBoolean(stringExtra2)) {
            getTitleBar().m58934f();
        } else {
            getTitleBar().m58941n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runOnUiThread$lambda$27(Function0 function0, Long l11) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit safeCheckContentView$lambda$13(final BaseActivity baseActivity) {
        baseActivity.getWindow().getDecorView().post(new Runnable() { // from class: com.kubi.sdk.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f46544b.recreate();
            }
        });
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void showFailView$default(BaseActivity baseActivity, CharSequence charSequence, int i11, View.OnClickListener onClickListener, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showFailView");
        }
        if ((i12 & 2) != 0) {
            i11 = R$drawable.ic2_common_system_busy;
        }
        if ((i12 & 4) != 0) {
            onClickListener = null;
        }
        baseActivity.showFailView(charSequence, i11, onClickListener);
    }

    @VisibleForTesting
    @NotNull
    public final DialogC40864b getLoadingDialogForTest() {
        return getLoadingDialog();
    }

    public final void hideLoadingDialog(boolean dismiss) {
        getLoadingDialog().m89436a(dismiss);
    }

    public final void hideTitleBar() {
        getTitleBar().m58934f();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) throws Exception {
        super.onActivityResult(requestCode, resultCode, data);
        getResultDelegate().m56597a(this, requestCode, resultCode, data);
    }

    @Nullable
    public Bitmap onBackBitmap() {
        View decorView;
        Window window = getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            return ViewExtKt.m66588s(decorView, C27017c.f54310a.m66512a(R$color.c_overlay));
        }
        return null;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.visibleDisposable.clear();
        C43853n.m96607a(this);
    }

    public void onPreFinish() {
        if (C5258a.m6124g().size() == 1) {
            Router.f46192a.m56184f("home").m4048k();
        }
    }

    public final void preformBackPressed() {
        onBackPressed();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(@Nullable View view, @Nullable ViewGroup.LayoutParams params) {
        if (safeCheckContentView()) {
            return;
        }
        super.setContentView(view, params);
    }

    public final void showContentView() {
        getLoadingView().showContent();
    }

    public final void showEmptyView(int tips, int icon, @Nullable View.OnClickListener click) {
        getLoadingView().showEmpty(tips, icon, click);
    }

    public final void showLoadingDialog() {
        getLoadingDialog().show();
    }

    public final void showLoadingView() {
        getLoadingView().showLoading();
    }

    public final void showTitleBar() {
        getTitleBar().m58941n();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (safeCheckContentView()) {
            return;
        }
        getContent().removeAllViews();
        getContent().addView(view, new FrameLayout.LayoutParams(-1, -1));
    }
}
