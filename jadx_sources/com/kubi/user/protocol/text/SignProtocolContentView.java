package com.kubi.user.protocol.text;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewTreeObserver;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.annotation.StringRes;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c70.C4878j0;
import com.google.firebase.messaging.Constants;
import com.kubi.host.HostManager;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.web.KWebView;
import com.kubi.sdk.web.core.WebLoadError;
import com.kubi.user.exception.UserCenterMessage;
import com.kubi.user.protocol.entity.SignProtocolContentItem;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.kubi.widget.web.ui.KWebContainer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import s80.C44363a;
import z00.InterfaceC46620b;

/* JADX INFO: compiled from: SignProtocolContentView.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u001e\u0018\u0000 N2\u00020\u0001:\u0001NB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ.\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020%2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010'\u001a\u00020\u00072\b\b\u0002\u0010(\u001a\u00020)J\u001a\u0010*\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020)H\u0002J(\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020-2\u0006\u0010$\u001a\u00020%2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0002J\u0018\u00102\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020-2\u0006\u00100\u001a\u000201H\u0002J \u00103\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020%2\u0006\u0010,\u001a\u00020-2\u0006\u00100\u001a\u000201H\u0002J\b\u00104\u001a\u00020\u001cH\u0002J\b\u00105\u001a\u00020\u001cH\u0002J\b\u00106\u001a\u00020\u001cH\u0002J-\u00107\u001a\u00020\u001c2%\b\u0002\u00108\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0019J-\u00109\u001a\u00020\u001c2%\b\u0002\u0010:\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0019J7\u0010;\u001a\u00020\u001c2\b\b\u0003\u0010<\u001a\u00020\u00072%\b\u0002\u0010=\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0019J^\u0010>\u001a\u00020\u001c2\b\b\u0002\u0010?\u001a\u00020\u00152%\b\u0002\u0010@\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00192%\b\u0002\u0010A\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0019J7\u0010B\u001a\u00020\u001c2\b\b\u0002\u0010C\u001a\u00020)2%\b\u0002\u0010D\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0019J\u000e\u0010E\u001a\u00020\u001c2\u0006\u0010F\u001a\u000201J\b\u0010G\u001a\u00020\u001cH\u0002J\b\u0010H\u001a\u00020\u001cH\u0002J\b\u0010I\u001a\u00020\u001cH\u0002J\u0012\u0010J\u001a\u00020\u001c2\b\b\u0002\u0010K\u001a\u00020)H\u0002J\u0012\u0010L\u001a\u00020\u00152\b\b\u0002\u0010M\u001a\u00020\u0015H\u0002R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R+\u0010\u0018\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\u001d\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001e\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R+\u0010\u001f\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010 \u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010!\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\"\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006O"}, m90084d2 = {"Lcom/kubi/user/protocol/text/SignProtocolContentView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "protocolList", "", "Lcom/kubi/user/protocol/entity/SignProtocolContentItem;", "currentProtocolIndex", "protocolListAdapter", "Lcom/kubi/user/protocol/text/SignProtocolProcessListAdapter;", "binding", "Lcom/kubi/user/databinding/BusercenterSignProtocolContentViewBinding;", "webViewContentHeightJob", "Lkotlinx/coroutines/Job;", "baseSupportUrl", "", "getBaseSupportUrl", "()Ljava/lang/String;", "onProtocolLoadContentListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "onProtocolHasReadListener", "protocolNotReadToast", "onProtocolCheckedListener", "onNextButtonClickListener", "onNextButtonClickFinishListener", "onExitButtonClickListener", "initProtocolContainer", "currentActivity", "Lcom/kubi/sdk/BaseActivity;", "initProtocolList", "activeIndex", "isShowInDialog", "", "initWebContainer", "addOnPageMountListener", "signupProtocolWebView", "Lcom/kubi/sdk/web/KWebView;", "signProtocolWebContainer", "Lcom/kubi/widget/web/ui/KWebContainer;", "webViewScale", "", "listenCurrentPageContentScrollToBottom", "listenCurrentPageContentHeight", "initProtocolCheckBox", "initNextProtocolButton", "initExitProtocolButton", "setOnProtocolLoadContentListener", "protocolLoadContentListener", "setOnProtocolHasReadListener", "protocolHasReadListener", "setOnProtocolCheckBoxListener", "notReadToast", "protocolCheckedListener", "setOnNextButtonListener", "nextBtnString", "nextBtnClickListener", "nextBtnClickFinishListener", "setOnExitButtonListener", "isShowExitBtn", "exitBtnClickListener", "setProtocolTitleTextSize", "titleTextSize", "loadProtocolTitle", "initProtocolProcessList", "showNextProtocol", "loadProtocolContent", "isReLoad", "getOnlyContentUrl", "termId", "Companion", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSignProtocolContentView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignProtocolContentView.kt\ncom/kubi/user/protocol/text/SignProtocolContentView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,374:1\n1563#2:375\n1634#2,3:376\n*S KotlinDebug\n*F\n+ 1 SignProtocolContentView.kt\ncom/kubi/user/protocol/text/SignProtocolContentView\n*L\n336#1:375\n336#1:376,3\n*E\n"})
public final class SignProtocolContentView extends LinearLayout {

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final Companion f53752n = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public List<SignProtocolContentItem> f53753b;

    /* JADX INFO: renamed from: c */
    public int f53754c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public SignProtocolProcessListAdapter f53755d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public C4878j0 f53756e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public InterfaceC41775x1 f53757f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public Function1<? super Integer, Unit> f53758g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public Function1<? super Integer, Unit> f53759h;

    /* JADX INFO: renamed from: i */
    @StringRes
    public int f53760i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public Function1<? super Integer, Unit> f53761j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public Function1<? super Integer, Unit> f53762k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public Function1<? super Integer, Unit> f53763l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public Function1<? super Integer, Unit> f53764m;

    /* JADX INFO: compiled from: SignProtocolContentView.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/user/protocol/text/SignProtocolContentView$Companion;", "", "<init>", "()V", "TAG", "", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.user.protocol.text.SignProtocolContentView$a */
    /* JADX INFO: compiled from: SignProtocolContentView.kt */
    @Metadata(m90083d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J(\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¨\u0006\u0012"}, m90084d2 = {"com/kubi/user/protocol/text/SignProtocolContentView$addOnPageMountListener$1", "Lcom/kubi/sdk/web/listener/IViewLoadingListener;", "onLoadFailed", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/kubi/sdk/web/core/WebLoadError;", "onLoadStart", "onLoadSuccess", "onMount", "pageType", "", "dclTime", "", "currentProjectName", "currentProjectVersion", "onProgressChanged", "progress", "", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSignProtocolContentView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignProtocolContentView.kt\ncom/kubi/user/protocol/text/SignProtocolContentView$addOnPageMountListener$1\n+ 2 UserCenterIssue.kt\ncom/kubi/user/exception/UserCenterIssueKt\n*L\n1#1,374:1\n67#2,2:375\n*S KotlinDebug\n*F\n+ 1 SignProtocolContentView.kt\ncom/kubi/user/protocol/text/SignProtocolContentView$addOnPageMountListener$1\n*L\n148#1:375,2\n*E\n"})
    public static final class C26767a implements InterfaceC46620b {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BaseActivity f53766b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ KWebView f53767c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ float f53768d;

        public C26767a(BaseActivity baseActivity, KWebView kWebView, float f11) {
            this.f53766b = baseActivity;
            this.f53767c = kWebView;
            this.f53768d = f11;
        }

        @Override // z00.InterfaceC46620b
        /* JADX INFO: renamed from: a */
        public void mo65497a(String pageType, double d11, String currentProjectName, String currentProjectVersion) {
            Intrinsics.checkNotNullParameter(pageType, "pageType");
            Intrinsics.checkNotNullParameter(currentProjectName, "currentProjectName");
            Intrinsics.checkNotNullParameter(currentProjectVersion, "currentProjectVersion");
            SignProtocolContentView.this.m65685w(this.f53766b, this.f53767c, this.f53768d);
        }

        @Override // z00.InterfaceC46620b
        /* JADX INFO: renamed from: b */
        public void mo65498b(int i11) {
            C44128b.m97259c("SignProtocolContentView", "onProgressChanged progress is " + i11);
        }

        @Override // z00.InterfaceC46620b
        /* JADX INFO: renamed from: c */
        public void mo65499c() {
            C44128b.m97259c("SignProtocolContentView", "onLoadSuccess");
        }

        @Override // z00.InterfaceC46620b
        /* JADX INFO: renamed from: d */
        public void mo65500d() {
            C44128b.m97259c("SignProtocolContentView", "onLoadStart");
        }

        @Override // z00.InterfaceC46620b
        /* JADX INFO: renamed from: e */
        public void mo65501e(WebLoadError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            C44128b.m97261e("SignProtocolContentView", "onLoadFailed error is " + error);
            C43846g.m96568c(new UserCenterMessage("currentProtocolIndex is " + SignProtocolContentView.this.f53754c + ", onLoadFailed error is " + error, "SignProtocolContentView", false, 4, null), null, 2, null);
        }

        @Override // z00.InterfaceC46620b
        /* JADX INFO: renamed from: f */
        public void mo65502f() {
            InterfaceC46620b.a.m102788a(this);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SignProtocolContentView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: q */
    public static final void m65668q(SignProtocolContentView signProtocolContentView, CompoundButton compoundButton, boolean z11) {
        if (!z11) {
            signProtocolContentView.f53756e.f5164b.setEnabled(false);
            return;
        }
        if (C27025c.m66566d(signProtocolContentView.f53753b.get(signProtocolContentView.f53754c).getHasRead())) {
            signProtocolContentView.f53756e.f5164b.setEnabled(true);
        } else {
            compoundButton.setChecked(false);
            ToastCompat.m66465z(signProtocolContentView.f53760i);
        }
        Function1<? super Integer, Unit> function1 = signProtocolContentView.f53761j;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(signProtocolContentView.f53754c));
        }
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m65670v(SignProtocolContentView signProtocolContentView) {
        signProtocolContentView.m65687y(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public final void m65684t(BaseActivity baseActivity, boolean z11) {
        KWebContainer signProtocolWebContainer = this.f53756e.f5169g;
        Intrinsics.checkNotNullExpressionValue(signProtocolWebContainer, "signProtocolWebContainer");
        final KWebView f55267b = signProtocolWebContainer.getF55267b();
        if (f55267b == null) {
            return;
        }
        final float f11 = f55267b.getResources().getDisplayMetrics().density;
        f55267b.m58561a(new HttpUrlInterceptor());
        f55267b.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: com.kubi.user.protocol.text.j
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                SignProtocolContentView.m65669u(this.f53777b, f55267b, f11);
            }
        });
        f55267b.setVisibility(z11 ? 4 : 0);
        signProtocolWebContainer.setOnReload(new Function0() { // from class: com.kubi.user.protocol.text.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SignProtocolContentView.m65670v(this.f53780b);
            }
        });
        m65677j(f55267b, baseActivity, signProtocolWebContainer, f11);
        m65671z(this, false, 1, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SignProtocolContentView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m65656E(SignProtocolContentView signProtocolContentView, int i11, Function1 function1, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        if ((i12 & 2) != 0) {
            function1 = null;
        }
        signProtocolContentView.m65675D(i11, function1);
    }

    private final String getBaseSupportUrl() {
        return HostManager.a.m() + "/support";
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m65666m(SignProtocolContentView signProtocolContentView) {
        Function1<? super Integer, Unit> function1 = signProtocolContentView.f53764m;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(signProtocolContentView.f53754c));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m65667o(SignProtocolContentView signProtocolContentView) {
        Function1<? super Integer, Unit> function1 = signProtocolContentView.f53762k;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(signProtocolContentView.f53754c));
        }
        InterfaceC41775x1 interfaceC41775x1 = signProtocolContentView.f53757f;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        if (signProtocolContentView.f53754c < signProtocolContentView.f53753b.size() - 1) {
            signProtocolContentView.m65676F();
        } else {
            Function1<? super Integer, Unit> function2 = signProtocolContentView.f53763l;
            if (function2 != null) {
                function2.invoke(Integer.valueOf(signProtocolContentView.f53754c));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m65671z(SignProtocolContentView signProtocolContentView, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        signProtocolContentView.m65687y(z11);
    }

    /* JADX INFO: renamed from: A */
    public final void m65672A() {
        this.f53756e.f5171i.setText(this.f53753b.get(this.f53754c).getProtocolTitle());
        this.f53756e.f5170h.setText(this.f53753b.get(this.f53754c).getProtocolTips());
    }

    /* JADX INFO: renamed from: B */
    public final void m65673B(boolean z11, @Nullable Function1<? super Integer, Unit> function1) {
        this.f53756e.f5165c.setVisibility(z11 ? 0 : 8);
        this.f53764m = function1;
    }

    /* JADX INFO: renamed from: C */
    public final void m65674C(@NotNull String nextBtnString, @Nullable Function1<? super Integer, Unit> function1, @Nullable Function1<? super Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(nextBtnString, "nextBtnString");
        this.f53756e.f5164b.setText(nextBtnString);
        this.f53762k = function1;
        this.f53763l = function2;
    }

    /* JADX INFO: renamed from: D */
    public final void m65675D(@StringRes int i11, @Nullable Function1<? super Integer, Unit> function1) {
        this.f53760i = i11;
        this.f53761j = function1;
    }

    /* JADX INFO: renamed from: F */
    public final void m65676F() {
        int i11 = this.f53754c + 1;
        this.f53754c = i11;
        SignProtocolProcessListAdapter signProtocolProcessListAdapter = this.f53755d;
        if (signProtocolProcessListAdapter != null) {
            signProtocolProcessListAdapter.m65693i(i11);
        }
        m65672A();
        m65671z(this, false, 1, null);
        this.f53756e.f5166d.setChecked(false);
    }

    /* JADX INFO: renamed from: j */
    public final void m65677j(KWebView kWebView, BaseActivity baseActivity, KWebContainer kWebContainer, float f11) {
        C44363a.f98027a.m97858b(kWebView, baseActivity);
        kWebContainer.setLoadingListener(new C26767a(baseActivity, kWebView, f11));
    }

    /* JADX INFO: renamed from: k */
    public final String m65678k(String str) {
        return getBaseSupportUrl() + '/' + str + "?appNeedLang=true&only_content=true";
    }

    /* JADX INFO: renamed from: l */
    public final void m65679l() {
        BaseTextView btnExitProtocol = this.f53756e.f5165c;
        Intrinsics.checkNotNullExpressionValue(btnExitProtocol, "btnExitProtocol");
        C27046k.m66711z(btnExitProtocol, 0L, new Function0() { // from class: com.kubi.user.protocol.text.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SignProtocolContentView.m65666m(this.f53776b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: n */
    public final void m65680n() {
        KcPrimaryButton btnAgreeProtocol = this.f53756e.f5164b;
        Intrinsics.checkNotNullExpressionValue(btnAgreeProtocol, "btnAgreeProtocol");
        C27046k.m66711z(btnAgreeProtocol, 0L, new Function0() { // from class: com.kubi.user.protocol.text.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SignProtocolContentView.m65667o(this.f53781b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: p */
    public final void m65681p() {
        this.f53756e.f5166d.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.kubi.user.protocol.text.h
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                SignProtocolContentView.m65668q(this.f53775b, compoundButton, z11);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final void m65682r(@NotNull BaseActivity currentActivity, @NotNull List<SignProtocolContentItem> initProtocolList, int i11, boolean z11) {
        Intrinsics.checkNotNullParameter(currentActivity, "currentActivity");
        Intrinsics.checkNotNullParameter(initProtocolList, "initProtocolList");
        this.f53753b = initProtocolList;
        this.f53754c = i11;
        m65672A();
        m65683s();
        m65684t(currentActivity, z11);
        m65681p();
        m65680n();
        m65679l();
    }

    /* JADX INFO: renamed from: s */
    public final void m65683s() {
        RecyclerView rvSignProtocol = this.f53756e.f5168f;
        Intrinsics.checkNotNullExpressionValue(rvSignProtocol, "rvSignProtocol");
        Context context = getContext();
        if (context == null) {
            return;
        }
        if (this.f53753b.size() <= 1) {
            ViewExtKt.m66577h(rvSignProtocol);
        }
        List<SignProtocolContentItem> list = this.f53753b;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String protocolName = ((SignProtocolContentItem) it.next()).getProtocolName();
            if (protocolName == null) {
                protocolName = "";
            }
            arrayList.add(protocolName);
        }
        this.f53755d = new SignProtocolProcessListAdapter(arrayList, this.f53754c);
        rvSignProtocol.setLayoutManager(new LinearLayoutManager(context, 0, false));
        rvSignProtocol.setAdapter(this.f53755d);
    }

    public final void setOnProtocolHasReadListener(@Nullable Function1<? super Integer, Unit> protocolHasReadListener) {
        this.f53759h = protocolHasReadListener;
    }

    public final void setOnProtocolLoadContentListener(@Nullable Function1<? super Integer, Unit> protocolLoadContentListener) {
        this.f53758g = protocolLoadContentListener;
    }

    public final void setProtocolTitleTextSize(float titleTextSize) {
        this.f53756e.f5171i.setTextSize(titleTextSize);
    }

    /* JADX INFO: renamed from: y */
    public final void m65687y(boolean z11) {
        Function1<? super Integer, Unit> function1;
        KWebView f55267b = this.f53756e.f5169g.getF55267b();
        if (f55267b != null) {
            f55267b.scrollTo(0, 0);
        }
        String termId = this.f53753b.get(this.f53754c).getTermId();
        if (termId == null) {
            termId = "";
        }
        String strM65678k = m65678k(termId);
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this);
        if (lifecycleOwner != null) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new SignProtocolContentView$loadProtocolContent$1(this, strM65678k, null), 3, null);
        } else {
            this.f53756e.f5169g.m67477C(strM65678k);
        }
        if (z11 || (function1 = this.f53758g) == null) {
            return;
        }
        function1.invoke(Integer.valueOf(this.f53754c));
    }

    public /* synthetic */ SignProtocolContentView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: u */
    public static final void m65669u(SignProtocolContentView signProtocolContentView, KWebView kWebView, float f11) {
        signProtocolContentView.m65686x(kWebView, f11);
    }

    /* JADX INFO: renamed from: w */
    public final void m65685w(BaseActivity baseActivity, KWebView kWebView, float f11) {
        this.f53757f = C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(baseActivity), null, null, new SignProtocolContentView$listenCurrentPageContentHeight$1(kWebView, f11, this, null), 3, null);
    }

    /* JADX INFO: renamed from: x */
    public final void m65686x(KWebView kWebView, float f11) {
        int scrollY = kWebView.getScrollY();
        Integer lastWebViewScrollY = this.f53753b.get(this.f53754c).getLastWebViewScrollY();
        if (lastWebViewScrollY == null || scrollY != lastWebViewScrollY.intValue()) {
            int iFloor = (int) Math.floor(kWebView.getContentHeight() * f11);
            if (iFloor > 0 && kWebView.getHeight() + kWebView.getScrollY() >= iFloor - 10) {
                Function1<? super Integer, Unit> function1 = this.f53759h;
                if (function1 != null) {
                    function1.invoke(Integer.valueOf(this.f53754c));
                }
                this.f53753b.get(this.f53754c).setHasRead(Boolean.TRUE);
                C44128b.m97259c("SignProtocolContentView", "Scroll to bottom, currentProtocolIndex is " + this.f53754c + ",webViewScale is " + f11 + ", signupProtocolWebView.scrollY is " + kWebView.getScrollY() + ", signupProtocolWebView.contentHeight * webViewScale is " + iFloor + ", signupProtocolWebView.height is " + kWebView.getHeight());
            }
            this.f53753b.get(this.f53754c).setLastWebViewScrollY(Integer.valueOf(kWebView.getScrollY()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SignProtocolContentView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f53753b = CollectionsKt.emptyList();
        C4878j0 c4878j0M5035c = C4878j0.m5035c(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c4878j0M5035c, "inflate(...)");
        this.f53756e = c4878j0M5035c;
    }
}
