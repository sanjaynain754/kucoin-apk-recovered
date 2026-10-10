package com.kubi.user.pwd;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import c70.C4865d;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.resources.widget.KcTextInputLayout;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.user.R$drawable;
import com.kubi.user.R$layout;
import com.kubi.user.R$string;
import com.kubi.user.signup.SignupExtKt;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45681e;

/* JADX INFO: compiled from: SetLoginPwdFragment.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0003\u0018\u0000 )2\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J$\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u001b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\"\u001a\u00020\u0017H\u0002J\b\u0010#\u001a\u00020\u0017H\u0003J\b\u0010$\u001a\u00020\u0017H\u0002J\u0015\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020'H\u0001¢\u0006\u0002\b(R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006*"}, m90084d2 = {"Lcom/kubi/user/pwd/SetLoginPwdFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "pageId", "", "getPageId", "()Ljava/lang/String;", "setPageId", "(Ljava/lang/String;)V", "binding", "Lcom/kubi/user/databinding/BusercenterFangmentSetUserPwdBinding;", "getBinding", "()Lcom/kubi/user/databinding/BusercenterFangmentSetUserPwdBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "viewModel", "Lcom/kubi/user/pwd/SetLoginPwdVM;", "getViewModel", "()Lcom/kubi/user/pwd/SetLoginPwdVM;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "setSystemInput", "initConfirmBtn", "initPwdInput", "changePwdRuleState", "input", "", "changePwdRuleState$UserCenterLib_googleRelease", "Companion", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSetLoginPwdFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SetLoginPwdFragment.kt\ncom/kubi/user/pwd/SetLoginPwdFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,201:1\n147#2,16:202\n106#3,15:218\n48#4,19:233\n84#4,3:252\n48#4,19:255\n84#4,3:274\n*S KotlinDebug\n*F\n+ 1 SetLoginPwdFragment.kt\ncom/kubi/user/pwd/SetLoginPwdFragment\n*L\n38#1:202,16\n40#1:218,15\n137#1:233,19\n137#1:252,3\n163#1:255,19\n163#1:274,3\n*E\n"})
public final class SetLoginPwdFragment extends BaseFragment {

    /* JADX INFO: renamed from: U */
    @Nullable
    public String f53793U = "B1setLoginPassword";

    /* JADX INFO: renamed from: V */
    @NotNull
    public final InterfaceC24293a f53794V = C45681e.m100799e(this, new Function1<SetLoginPwdFragment, C4865d>() { // from class: com.kubi.user.pwd.SetLoginPwdFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4865d invoke(@NotNull SetLoginPwdFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C4865d.m5008a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C4865d, Unit>() { // from class: com.kubi.user.pwd.SetLoginPwdFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4865d it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4865d c4865d) {
            invoke(c4865d);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f53795W;

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ KProperty<Object>[] f53792Y = {Reflection.property1(new PropertyReference1Impl(SetLoginPwdFragment.class, "binding", "getBinding()Lcom/kubi/user/databinding/BusercenterFangmentSetUserPwdBinding;", 0))};

    /* JADX INFO: renamed from: X */
    @NotNull
    public static final Companion f53791X = new Companion(null);

    /* JADX INFO: compiled from: SetLoginPwdFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/user/pwd/SetLoginPwdFragment$Companion;", "", "<init>", "()V", "PAGE_ID", "", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.user.pwd.SetLoginPwdFragment$a */
    /* JADX INFO: compiled from: TextView.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0010"}, m90084d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "core-ktx_release", "androidx/core/widget/TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 SetLoginPwdFragment.kt\ncom/kubi/user/pwd/SetLoginPwdFragment\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n164#2,4:83\n59#3:87\n62#4:88\n*E\n"})
    public static final class C26782a implements TextWatcher {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ClearEditText f53797c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C4865d f53798d;

        public C26782a(ClearEditText clearEditText, C4865d c4865d) {
            this.f53797c = clearEditText;
            this.f53798d = c4865d;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s11) {
            SetLoginPwdFragment.this.m65718s3(String.valueOf(this.f53797c.getText()));
            this.f53798d.f5062c.f5101d.setVisibility(String.valueOf(s11).length() > 0 ? 0 : 8);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence text, int start, int before, int count) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.user.pwd.SetLoginPwdFragment$b */
    /* JADX INFO: compiled from: TextView.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0010"}, m90084d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "core-ktx_release", "androidx/core/widget/TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 SetLoginPwdFragment.kt\ncom/kubi/user/pwd/SetLoginPwdFragment\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n138#2,4:83\n59#3:87\n62#4:88\n*E\n"})
    public static final class C26783b implements TextWatcher {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C4865d f53800c;

        public C26783b(C4865d c4865d) {
            this.f53800c = c4865d;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s11) {
            SetLoginPwdFragment.this.m65718s3(String.valueOf(s11));
            this.f53800c.f5061b.f5101d.setVisibility(String.valueOf(s11).length() > 0 ? 0 : 8);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence text, int start, int before, int count) {
        }
    }

    /* JADX INFO: renamed from: A3 */
    public static final Unit m65698A3(final ClearEditText clearEditText) {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.user.pwd.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SetLoginPwdFragment.m65699B3(clearEditText);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C3 */
    public static final Unit m65700C3(final ClearEditText clearEditText) {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.user.pwd.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SetLoginPwdFragment.m65701D3(clearEditText);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E3 */
    public static final void m65702E3(C4865d c4865d, View view, boolean z11) {
        if (z11) {
            BaseTextView tvPwdRule1 = c4865d.f5067h;
            Intrinsics.checkNotNullExpressionValue(tvPwdRule1, "tvPwdRule1");
            ViewExtKt.m66594y(tvPwdRule1);
            BaseTextView tvPwdRule2 = c4865d.f5068i;
            Intrinsics.checkNotNullExpressionValue(tvPwdRule2, "tvPwdRule2");
            ViewExtKt.m66594y(tvPwdRule2);
            BaseTextView tvPwdRule3 = c4865d.f5069j;
            Intrinsics.checkNotNullExpressionValue(tvPwdRule3, "tvPwdRule3");
            ViewExtKt.m66594y(tvPwdRule3);
        }
    }

    /* JADX INFO: renamed from: w3 */
    public static final Unit m65713w3(C4865d c4865d, SetLoginPwdFragment setLoginPwdFragment, FragmentActivity fragmentActivity) {
        if (C27025c.m66566d(Boolean.valueOf(c4865d.f5063d.getF44406k()))) {
            return Unit.INSTANCE;
        }
        EditText editText = c4865d.f5061b.f5100c.getEditText();
        String strValueOf = String.valueOf(editText != null ? editText.getText() : null);
        EditText editText2 = c4865d.f5062c.f5100c.getEditText();
        if (Intrinsics.areEqual(strValueOf, String.valueOf(editText2 != null ? editText2.getText() : null))) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(setLoginPwdFragment), null, null, new SetLoginPwdFragment$initConfirmBtn$1$1(c4865d, setLoginPwdFragment, fragmentActivity, strValueOf, null), 3, null);
            return Unit.INSTANCE;
        }
        KcTextInputLayout.m54597k(c4865d.f5062c.f5100c, R$string.my_pwd_diff, false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y3 */
    public static final void m65715y3(ClearEditText clearEditText, final C4865d c4865d, View view, boolean z11) {
        if (z11) {
            clearEditText.postDelayed(new Runnable() { // from class: com.kubi.user.pwd.f
                @Override // java.lang.Runnable
                public final void run() {
                    SetLoginPwdFragment.m65716z3(c4865d);
                }
            }, 300L);
        }
    }

    /* JADX INFO: renamed from: z3 */
    public static final void m65716z3(C4865d c4865d) {
        c4865d.f5066g.scrollTo(0, c4865d.f5065f.getHeight() - c4865d.f5066g.getHeight());
    }

    @Override // com.kubi.sdk.BaseFragment, p569qq.InterfaceC43845f
    @Nullable
    /* JADX INFO: renamed from: getPageId, reason: from getter */
    public String getF53793U() {
        return this.f53793U;
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.busercenter_fangment_set_user_pwd, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m65717F3();
        m65714x3();
        m65712v3();
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: s3 */
    public final void m65718s3(@NotNull CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        C4865d c4865dM65719t3 = m65719t3();
        if (c4865dM65719t3 == null) {
            return;
        }
        int length = input.length();
        boolean z11 = 10 <= length && length < 33;
        c4865dM65719t3.f5067h.setSelected(z11);
        SignupExtKt.m65736i(c4865dM65719t3.f5067h, z11 ? R$drawable.ucenter_shape_pwd_ok : R$drawable.busercenter_signup_pwd_normal);
        boolean zMatches = com.kubi.user.signupv2.b.b().matcher(input).matches();
        c4865dM65719t3.f5068i.setSelected(zMatches);
        SignupExtKt.m65736i(c4865dM65719t3.f5068i, zMatches ? R$drawable.ucenter_shape_pwd_ok : R$drawable.busercenter_signup_pwd_normal);
        boolean z12 = input.length() > 0 && !StringsKt.contains$default(input, ' ', false, 2, (Object) null);
        c4865dM65719t3.f5069j.setSelected(z12);
        SignupExtKt.m65736i(c4865dM65719t3.f5069j, z12 ? R$drawable.ucenter_shape_pwd_ok : R$drawable.busercenter_signup_pwd_normal);
        CharSequence error = c4865dM65719t3.f5061b.f5100c.getError();
        if (error != null && error.length() != 0) {
            KcTextInputLayout.m54596f(c4865dM65719t3.f5061b.f5100c, false, 1, null);
        }
        boolean z13 = z11 && zMatches && z12;
        EditText editText = c4865dM65719t3.f5061b.f5100c.getEditText();
        String strValueOf = String.valueOf(editText != null ? editText.getText() : null);
        EditText editText2 = c4865dM65719t3.f5062c.f5100c.getEditText();
        String strValueOf2 = String.valueOf(editText2 != null ? editText2.getText() : null);
        if (Intrinsics.areEqual(strValueOf, strValueOf2)) {
            KcTextInputLayout.m54596f(c4865dM65719t3.f5062c.f5100c, false, 1, null);
        }
        c4865dM65719t3.f5063d.setEnabled(z13 && strValueOf2.length() > 0);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setPageId(@Nullable String str) {
        this.f53793U = str;
    }

    /* JADX INFO: renamed from: t3 */
    public final C4865d m65719t3() {
        return (C4865d) this.f53794V.getValue(this, f53792Y[0]);
    }

    /* JADX INFO: renamed from: u3 */
    public final SetLoginPwdVM m65720u3() {
        return (SetLoginPwdVM) this.f53795W.getValue();
    }

    public SetLoginPwdFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.user.pwd.SetLoginPwdFragment$special$$inlined$viewModels$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final Fragment invoke() {
                return this;
            }

            {
                super(0);
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.user.pwd.SetLoginPwdFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }

            {
                super(0);
            }
        });
        final Function0 function1 = null;
        this.f53795W = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(SetLoginPwdVM.class), new Function0<ViewModelStore>() { // from class: com.kubi.user.pwd.SetLoginPwdFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.user.pwd.SetLoginPwdFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function2 = function1;
                if (function2 != null && (creationExtras = (CreationExtras) function2.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.user.pwd.SetLoginPwdFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
    }

    /* JADX INFO: renamed from: B3 */
    public static final Unit m65699B3(ClearEditText clearEditText) {
        Editable text = clearEditText.getText();
        if (text != null) {
            text.clear();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D3 */
    public static final Unit m65701D3(ClearEditText clearEditText) {
        Editable text = clearEditText.getText();
        if (text != null) {
            text.clear();
        }
        return Unit.INSTANCE;
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: v3 */
    private final void m65712v3() {
        final FragmentActivity activity;
        final C4865d c4865dM65719t3 = m65719t3();
        if (c4865dM65719t3 == null || (activity = getActivity()) == null) {
            return;
        }
        c4865dM65719t3.f5070k.setText(getString(R$string.safesetting_setpwd_subtitle1) + '\n' + getString(R$string.safesetting_setpwd_subtitle2));
        KcPrimaryButton btnConfirm = c4865dM65719t3.f5063d;
        Intrinsics.checkNotNullExpressionValue(btnConfirm, "btnConfirm");
        C27046k.m66710y(btnConfirm, 800L, new Function0() { // from class: com.kubi.user.pwd.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SetLoginPwdFragment.m65713w3(c4865dM65719t3, this, activity);
            }
        });
    }

    /* JADX INFO: renamed from: x3 */
    private final void m65714x3() {
        final ClearEditText clearEditText;
        final C4865d c4865dM65719t3 = m65719t3();
        if (c4865dM65719t3 != null) {
            EditText editText = c4865dM65719t3.f5061b.f5100c.getEditText();
            final ClearEditText clearEditText2 = null;
            if (editText instanceof ClearEditText) {
                clearEditText = (ClearEditText) editText;
            } else {
                clearEditText = null;
            }
            if (clearEditText != null) {
                EditText editText2 = c4865dM65719t3.f5062c.f5100c.getEditText();
                if (editText2 instanceof ClearEditText) {
                    clearEditText2 = (ClearEditText) editText2;
                }
                if (clearEditText2 == null) {
                    return;
                }
                c4865dM65719t3.f5061b.f5100c.setHint(getString(R$string.safesetting_setpwd_newpassword_title));
                c4865dM65719t3.f5062c.f5100c.setHint(getString(R$string.safesetting_setpwd_confirmpassword_title));
                ImageView ivClean = c4865dM65719t3.f5061b.f5101d;
                Intrinsics.checkNotNullExpressionValue(ivClean, "ivClean");
                C27046k.m66711z(ivClean, 0L, new Function0() { // from class: com.kubi.user.pwd.a
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SetLoginPwdFragment.m65700C3(clearEditText);
                    }
                }, 1, null);
                clearEditText.setInnerFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.kubi.user.pwd.b
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z11) {
                        SetLoginPwdFragment.m65702E3(c4865dM65719t3, view, z11);
                    }
                });
                clearEditText.addTextChangedListener(new C26783b(c4865dM65719t3));
                ImageView ivClean2 = c4865dM65719t3.f5062c.f5101d;
                Intrinsics.checkNotNullExpressionValue(ivClean2, "ivClean");
                C27046k.m66711z(ivClean2, 0L, new Function0() { // from class: com.kubi.user.pwd.c
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SetLoginPwdFragment.m65698A3(clearEditText2);
                    }
                }, 1, null);
                clearEditText2.setInnerFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.kubi.user.pwd.d
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z11) {
                        SetLoginPwdFragment.m65715y3(clearEditText2, c4865dM65719t3, view, z11);
                    }
                });
                clearEditText2.addTextChangedListener(new C26782a(clearEditText, c4865dM65719t3));
            }
        }
    }

    /* JADX INFO: renamed from: F3 */
    public final void m65717F3() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        activity.getWindow().setSoftInputMode(20);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getTitleBar().m58934f();
    }
}
