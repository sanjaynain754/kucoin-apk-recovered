package com.kubi.kweb.p093ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.kweb.R$layout;
import com.kubi.kweb.R$string;
import com.kubi.kweb.exception.KWebException;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import r80.C43945a;
import w00.C45681e;

/* JADX INFO: compiled from: KWebExternalFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/kweb/ui/KWebExternalFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/widget/web/databinding/KwebLayoutWebviewWhiteBinding;", "getBinding", "()Lcom/kubi/widget/web/databinding/KwebLayoutWebviewWhiteBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "showSafeTips", "url", "", "gotoOsWeb", "KWebLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKWebExternalFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KWebExternalFragment.kt\ncom/kubi/kweb/ui/KWebExternalFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 KWebIssue.kt\ncom/kubi/kweb/exception/KWebIssueKt\n*L\n1#1,70:1\n147#2,16:71\n44#3,2:87\n*S KotlinDebug\n*F\n+ 1 KWebExternalFragment.kt\ncom/kubi/kweb/ui/KWebExternalFragment\n*L\n28#1:71,16\n66#1:87,2\n*E\n"})
public final class KWebExternalFragment extends BaseFragment {

    /* JADX INFO: renamed from: V */
    public static final /* synthetic */ KProperty<Object>[] f31030V = {Reflection.property1(new PropertyReference1Impl(KWebExternalFragment.class, "binding", "getBinding()Lcom/kubi/widget/web/databinding/KwebLayoutWebviewWhiteBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f31031U = C45681e.m100799e(this, new Function1<KWebExternalFragment, C43945a>() { // from class: com.kubi.kweb.ui.KWebExternalFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C43945a invoke(@NotNull KWebExternalFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C43945a.m96902a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C43945a, Unit>() { // from class: com.kubi.kweb.ui.KWebExternalFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C43945a it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C43945a c43945a) {
            invoke(c43945a);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: n3 */
    public static final Unit m36743n3(KWebExternalFragment kWebExternalFragment, String str, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        kWebExternalFragment.m36745l3(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k3 */
    public final C43945a m36744k3() {
        return (C43945a) this.f31031U.getValue(this, f31030V[0]);
    }

    /* JADX INFO: renamed from: l3 */
    public final void m36745l3(String str) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C43846g.m96568c(new KWebException(thM103847exceptionOrNullimpl, "KWebExternalFragment", false, null, 8, null), null, 2, null);
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.kweb_layout_webview_white, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        String string;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("url")) == null) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        Bundle arguments2 = getArguments();
        if (TextUtils.isEmpty(arguments2 != null ? arguments2.getString("biz_source") : null)) {
            m36745l3(string);
        } else {
            m36746m3(string);
        }
    }

    /* JADX INFO: renamed from: m3 */
    public final void m36746m3(final String str) {
        TextView textView;
        TextView textView2;
        LinearLayout root;
        getTitleBar().setTitleIfEmpty(R$string.web_safe_center);
        C43945a c43945aM36744k3 = m36744k3();
        if (c43945aM36744k3 != null && (root = c43945aM36744k3.getRoot()) != null) {
            C27046k.m66685H(root);
        }
        C43945a c43945aM36744k4 = m36744k3();
        if (c43945aM36744k4 != null && (textView2 = c43945aM36744k4.f97163c) != null) {
            textView2.setText(str);
        }
        C43945a c43945aM36744k5 = m36744k3();
        if (c43945aM36744k5 != null && (textView = c43945aM36744k5.f97162b) != null) {
            ViewExtKt.m66575f(textView, new Function1() { // from class: com.kubi.kweb.ui.a
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KWebExternalFragment.m36743n3(this.f31035b, str, (View) obj);
                }
            });
        }
    }
}
