package com.kubi.sdk.flutter.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.C11352b;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.lflutter.R$id;
import com.kubi.lflutter.R$layout;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.flutter.delegate.FlutterViewDelegate;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: FlutterDelegateFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0016\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001f\u001a\u00020\u000bH\u0016J\b\u0010 \u001a\u00020\u001dH\u0016J\b\u0010!\u001a\u00020\u001dH\u0016J\b\u0010\"\u001a\u00020\u001dH\u0016J\b\u0010#\u001a\u00020\u001dH\u0016J\b\u0010$\u001a\u00020\u001dH\u0016J\b\u0010%\u001a\u00020\u001dH\u0002R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m90084d2 = {"Lcom/kubi/sdk/flutter/ui/FlutterDelegateFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "loadingView", "Landroid/widget/ImageView;", "getLoadingView", "()Landroid/widget/ImageView;", "setLoadingView", "(Landroid/widget/ImageView;)V", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "delegate", "Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;", "getDelegate", "()Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "getTextureMode", "onLoad", "onResume", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "onDestroyView", "bindFlowEvent", "Companion", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFlutterDelegateFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlutterDelegateFragment.kt\ncom/kubi/sdk/flutter/ui/FlutterDelegateFragment\n+ 2 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,108:1\n76#2,7:109\n*S KotlinDebug\n*F\n+ 1 FlutterDelegateFragment.kt\ncom/kubi/sdk/flutter/ui/FlutterDelegateFragment\n*L\n103#1:109,7\n*E\n"})
public class FlutterDelegateFragment extends BaseFragment {

    /* JADX INFO: renamed from: X */
    @NotNull
    public static final Companion f46734X = new Companion(null);

    /* JADX INFO: renamed from: U */
    @Nullable
    public ImageView f46735U;

    /* JADX INFO: renamed from: V */
    public boolean f46736V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final FlutterViewDelegate f46737W = new FlutterViewDelegate();

    /* JADX INFO: compiled from: FlutterDelegateFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/sdk/flutter/ui/FlutterDelegateFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/sdk/flutter/ui/FlutterDelegateFragment;", "initialRoute", "", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final FlutterDelegateFragment newInstance(@NotNull String initialRoute) {
            Intrinsics.checkNotNullParameter(initialRoute, "initialRoute");
            FlutterDelegateFragment flutterDelegateFragment = new FlutterDelegateFragment();
            Bundle bundle = new Bundle();
            bundle.putString("flutterInitialRoute", initialRoute);
            flutterDelegateFragment.setArguments(bundle);
            return flutterDelegateFragment;
        }
    }

    /* JADX INFO: renamed from: l3 */
    public boolean mo37561l3() {
        return false;
    }

    private final void bindFlowEvent() {
        if (C12573b.f21598a.m23696a()) {
            "com.kubi.event.FlutterEvent:flutterCommonEvent".length();
        }
        C12572a.m23692a(this, false, new C23789x30065ec4("com.kubi.event.FlutterEvent:flutterCommonEvent", null, this));
    }

    /* JADX INFO: renamed from: m3 */
    public static final Unit m56920m3(FlutterDelegateFragment flutterDelegateFragment) {
        ImageView imageView = flutterDelegateFragment.f46735U;
        if (imageView != null) {
            ViewExtKt.m66577h(imageView);
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF46736V() {
        return this.f46736V;
    }

    @NotNull
    /* JADX INFO: renamed from: k3, reason: from getter */
    public final FlutterViewDelegate getF46737W() {
        return this.f46737W;
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.flutter_entry_fragment_layout, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() throws JSONException {
        String strM56284y;
        ImageView imageView = this.f46735U;
        if (imageView != null) {
            ViewExtKt.m66594y(imageView);
        }
        ImageView imageView2 = this.f46735U;
        if (imageView2 != null) {
            C11352b.m20197a(imageView2);
        }
        Bundle arguments = getArguments();
        if (arguments == null || (strM56284y = RouteExKt.m56284y(arguments, "flutterInitialRoute")) == null) {
            strM56284y = "/";
        }
        this.f46737W.m56756V(strM56284y);
        this.f46737W.m56757W(new Function0() { // from class: com.kubi.sdk.flutter.ui.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FlutterDelegateFragment.m56920m3(this.f46772b);
            }
        });
        this.f46737W.m56758X();
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.f46735U = (ImageView) view.findViewById(R$id.loading);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R$id.container);
        this.f46737W.m56761i();
        FragmentActivity activity = getActivity();
        if (activity instanceof BaseActivity) {
            C44128b.m97259c("FlutterDelegateFragment", "Binding to parent activity: " + activity.getClass().getSimpleName());
            this.f46737W.m56764l((BaseActivity) activity);
        }
        FlutterViewDelegate flutterViewDelegate = this.f46737W;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNull(frameLayout);
        flutterViewDelegate.m56740C(context, frameLayout, mo37561l3());
        bindFlowEvent();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f46736V = z11;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f46737W.m56741E();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        this.f46737W.m56742G();
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f46737W.m56748N();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        this.f46737W.m56749O();
    }
}
