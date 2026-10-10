package com.kubi.user.view;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import c70.C4892q0;
import com.blankj.utilcode.util.C5259a0;
import com.blankj.utilcode.util.KeyboardUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.kucoin.ChoosePhoneAreaActivity;
import com.kubi.kucoin.CountryCodeViewLayout;
import com.kubi.kucoin.SceneCode;
import com.kubi.kucoin.data.OpenCountryCodeFromWhereEnum;
import com.kubi.kucoin.data.platform.model.CountryEntity;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.resources.widget.KcTextInputLayout;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.user.R$color;
import com.kubi.user.R$layout;
import com.kubi.user.R$string;
import com.kubi.user.loginv2.n;
import com.kubi.user.service.b;
import com.kubi.user.signupv2.ui.EmailAutoHintPop;
import com.kubi.user.view.EmailPhoneInputView;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27052h0;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import e70.InterfaceC37090e;
import io.reactivex.functions.Consumer;
import java.lang.reflect.Type;
import m70.C42449c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45682f;

/* JADX INFO: compiled from: EmailPhoneInputView.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 V2\u00020\u00012\u00020\u0002:\u0001VB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJb\u0010*\u001a\u00020'2\b\u0010+\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010,\u001a\u00020-2\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010)2\u0016\b\u0002\u0010$\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0018\u00010%J\u0006\u0010.\u001a\u00020'J\u0006\u0010/\u001a\u00020'J\b\u00100\u001a\u0004\u0018\u000101J\b\u00102\u001a\u0004\u0018\u000103J\u0018\u00104\u001a\u00020'2\u0006\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u00020\"J\u0006\u00108\u001a\u00020'J\u0006\u00109\u001a\u00020'J\u0006\u0010:\u001a\u00020\u0012J\u0006\u0010;\u001a\u00020\"J\u0006\u0010<\u001a\u00020\"J\u0010\u0010=\u001a\u00020'2\u0006\u0010>\u001a\u00020\u0012H\u0002J\b\u0010?\u001a\u00020'H\u0014J\b\u0010@\u001a\u00020'H\u0014J*\u0010A\u001a\u00020'2\b\u0010B\u001a\u0004\u0018\u0001062\u0006\u0010C\u001a\u00020\b2\u0006\u0010D\u001a\u00020\b2\u0006\u0010E\u001a\u00020\bH\u0016J*\u0010F\u001a\u00020'2\b\u0010B\u001a\u0004\u0018\u0001062\u0006\u0010C\u001a\u00020\b2\u0006\u0010G\u001a\u00020\b2\u0006\u0010D\u001a\u00020\bH\u0016J\u0012\u0010H\u001a\u00020'2\b\u0010B\u001a\u0004\u0018\u00010IH\u0016J\u0010\u0010J\u001a\u00020\"2\u0006\u0010K\u001a\u00020\u0012H\u0002J\u0006\u0010L\u001a\u00020'J\u0010\u0010M\u001a\u00020'2\u0006\u0010N\u001a\u00020\u0012H\u0002J\u0010\u0010O\u001a\u00020'2\u0006\u0010;\u001a\u00020\"H\u0002J\u0010\u0010R\u001a\u00020'2\u0006\u0010S\u001a\u00020\u0012H\u0002J \u0010T\u001a\u00020'2\u0016\b\u0002\u0010U\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0018\u00010%H\u0002R\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010$\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006W"}, m90084d2 = {"Lcom/kubi/user/view/EmailPhoneInputView;", "Landroid/widget/FrameLayout;", "Landroid/text/TextWatcher;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/kubi/user/databinding/BusercenterViewEmailPhoneInputBinding;", "getBinding$UserCenterLib_googleRelease", "()Lcom/kubi/user/databinding/BusercenterViewEmailPhoneInputBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "areaCode", "", "getAreaCode", "()Ljava/lang/String;", "setAreaCode", "(Ljava/lang/String;)V", "currentInputMode", "getCurrentInputMode", "()I", "setCurrentInputMode", "(I)V", "activity", "Lcom/kubi/sdk/BaseActivity;", "pageId", "emailAutoHintPop", "Lcom/kubi/user/signupv2/ui/EmailAutoHintPop;", "enableEmailPop", "", "chooseCountryCodeType", "chooseCountryCodeCallback", "Lkotlin/Function1;", "Lcom/kubi/kucoin/data/platform/model/CountryEntity;", "", "countryCodeViewClick", "Lkotlin/Function0;", "attachHost", "act", "openCountryCodeFromWherePage", "Lcom/kubi/kucoin/data/OpenCountryCodeFromWhereEnum;", "hideEmailAutoHint", "hideKeyboard", "editText", "Lcom/kubi/resources/widget/ClearEditText;", "textInputLayout", "Lcom/kubi/resources/widget/KcTextInputLayout;", "showError", "errorMsg", "", TIMPushProvider.f75062n, "disable", "showKeyboard", "getAccountText", "isPhone", "checkPassed", "trackCheckError", FirebaseAnalytics.Param.LOCATION, "onAttachedToWindow", "onDetachedFromWindow", "beforeTextChanged", CmcdData.Factory.STREAMING_FORMAT_SS, "start", "count", TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "afterTextChanged", "Landroid/text/Editable;", "isNeedShowAreaCode", "txt", "tryDisplayAreaCode", "displayEmailAutoHint", "input", "displayAreaCode", "trackPhone", "trackEmail", "trackInput", "inputContent", "chooseAreaCode", "callBack", "Companion", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nEmailPhoneInputView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmailPhoneInputView.kt\ncom/kubi/user/view/EmailPhoneInputView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 4 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 5 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 6 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,345:1\n52#2:346\n80#2,7:347\n35#3,4:354\n39#3:360\n44#4,2:358\n106#5:361\n78#5,22:362\n106#5:384\n78#5,22:385\n106#5:407\n78#5,22:408\n106#5:430\n78#5,22:431\n25#6,3:453\n*S KotlinDebug\n*F\n+ 1 EmailPhoneInputView.kt\ncom/kubi/user/view/EmailPhoneInputView\n*L\n53#1:346\n53#1:347,7\n79#1:354,4\n79#1:360\n79#1:358,2\n161#1:361\n161#1:362,22\n163#1:384\n163#1:385,22\n238#1:407\n238#1:408,22\n255#1:430\n255#1:431,22\n286#1:453,3\n*E\n"})
public final class EmailPhoneInputView extends FrameLayout implements TextWatcher {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f53902b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public String f53903c;

    /* JADX INFO: renamed from: d */
    public int f53904d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public BaseActivity f53905e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public String f53906f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public EmailAutoHintPop f53907g;

    /* JADX INFO: renamed from: h */
    public boolean f53908h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public String f53909i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public Function1<? super CountryEntity, Unit> f53910j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public Function0<Unit> f53911k;

    /* JADX INFO: renamed from: l */
    public boolean f53912l;

    /* JADX INFO: renamed from: m */
    public boolean f53913m;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ KProperty<Object>[] f53901o = {Reflection.property1(new PropertyReference1Impl(EmailPhoneInputView.class, "binding", "getBinding$UserCenterLib_googleRelease()Lcom/kubi/user/databinding/BusercenterViewEmailPhoneInputBinding;", 0))};

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final Companion f53900n = new Companion(null);

    /* JADX INFO: compiled from: EmailPhoneInputView.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/user/view/EmailPhoneInputView$Companion;", "", "<init>", "()V", "MAX_COUNT_START_CHECK", "", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.user.view.EmailPhoneInputView$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C26845a extends TypeToken<Boolean> {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EmailPhoneInputView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: l */
    public final void m65925l() {
        CountryCodeViewLayout countryCodeViewLayout;
        setEnabled(false);
        KcTextInputLayout kcTextInputLayoutM65918B = m65918B();
        if (kcTextInputLayoutM65918B != null) {
            kcTextInputLayoutM65918B.setEnabled(false);
        }
        ClearEditText clearEditTextM65928s = m65928s();
        if (clearEditTextM65928s != null) {
            clearEditTextM65928s.setEnabled(false);
        }
        C4892q0 binding$UserCenterLib_googleRelease = getBinding$UserCenterLib_googleRelease();
        if (binding$UserCenterLib_googleRelease != null && (countryCodeViewLayout = binding$UserCenterLib_googleRelease.f5284b) != null) {
            countryCodeViewLayout.m31918c();
        }
        KcTextInputLayout kcTextInputLayoutM65918B2 = m65918B();
        if (kcTextInputLayoutM65918B2 != null) {
            kcTextInputLayoutM65918B2.setBoxBackgroundColor(C27017c.f54310a.m66512a(R$color.c_cover2));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EmailPhoneInputView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: k */
    public static final void m65912k(EmailPhoneInputView emailPhoneInputView, Function1 function1, Intent intent) {
        CountryEntity countryEntity;
        CountryCodeViewLayout countryCodeViewLayout;
        TextView countryCodeTextView;
        KcTextInputLayout kcTextInputLayout;
        if (intent == null || (countryEntity = (CountryEntity) RouteExKt.m56272s(intent, "data")) == null) {
            return;
        }
        emailPhoneInputView.f53903c = countryEntity.getMobileCode();
        C4892q0 binding$UserCenterLib_googleRelease = emailPhoneInputView.getBinding$UserCenterLib_googleRelease();
        if (binding$UserCenterLib_googleRelease != null && (kcTextInputLayout = binding$UserCenterLib_googleRelease.f5285c) != null) {
            n.d(kcTextInputLayout, emailPhoneInputView.f53903c);
        }
        C4892q0 binding$UserCenterLib_googleRelease2 = emailPhoneInputView.getBinding$UserCenterLib_googleRelease();
        if (binding$UserCenterLib_googleRelease2 != null && (countryCodeViewLayout = binding$UserCenterLib_googleRelease2.f5284b) != null && (countryCodeTextView = countryCodeViewLayout.getCountryCodeTextView()) != null) {
            countryCodeTextView.setText(emailPhoneInputView.f53903c);
        }
        if (function1 != null) {
            function1.invoke(countryEntity);
        }
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m65913n(EmailPhoneInputView emailPhoneInputView) {
        Object objM56186h = Router.f46192a.m56186h(InterfaceC37090e.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            ((InterfaceC37090e) objM56186h).m83019a();
        } else {
            Function0<Unit> function0 = emailPhoneInputView.f53911k;
            if (function0 != null) {
                function0.invoke();
            }
            emailPhoneInputView.m65924j(emailPhoneInputView.f53910j);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m65914p(final EmailPhoneInputView emailPhoneInputView, String str) {
        KcTextInputLayout kcTextInputLayout;
        EditText editText;
        BaseActivity baseActivity = emailPhoneInputView.f53905e;
        if (baseActivity == null) {
            return Unit.INSTANCE;
        }
        if (baseActivity.isFinishing() || baseActivity.isDestroyed()) {
            return Unit.INSTANCE;
        }
        C4892q0 binding$UserCenterLib_googleRelease = emailPhoneInputView.getBinding$UserCenterLib_googleRelease();
        if (binding$UserCenterLib_googleRelease == null || (kcTextInputLayout = binding$UserCenterLib_googleRelease.f5285c) == null || (editText = kcTextInputLayout.getEditText()) == null) {
            return Unit.INSTANCE;
        }
        if (editText.getWindowToken() != null) {
            if (emailPhoneInputView.f53907g == null) {
                emailPhoneInputView.f53907g = new EmailAutoHintPop(baseActivity);
            }
            EmailAutoHintPop emailAutoHintPop = emailPhoneInputView.f53907g;
            if (emailAutoHintPop != null) {
                emailAutoHintPop.g(editText, str, new Function1() { // from class: m70.h
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return EmailPhoneInputView.m65915q(this.f94079b, (String) obj);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m65915q(final EmailPhoneInputView emailPhoneInputView, final String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        C27100x0.m66924e(new Function0() { // from class: m70.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EmailPhoneInputView.m65916r(this.f94083b, email);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m65917y(EmailPhoneInputView emailPhoneInputView, CharSequence charSequence, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        emailPhoneInputView.m65933x(charSequence, z11);
    }

    /* JADX INFO: renamed from: C */
    public final void m65919C(String str) {
        if (this.f53906f.length() > 0) {
            C43852m.m96595g(this.f53906f, "createCheckError", str, null, 8, null);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m65920D(String str) {
        if (this.f53906f.length() <= 0 && str.length() >= 3) {
            if (this.f53904d == 1) {
                this.f53913m = false;
                if (this.f53912l) {
                    return;
                }
                C43852m.m96591c(this.f53906f, "phoneInsert", null, null, 12, null);
                this.f53912l = true;
                return;
            }
            this.f53912l = false;
            if (this.f53913m) {
                return;
            }
            C43852m.m96591c(this.f53906f, "emailInsert", null, null, 12, null);
            this.f53913m = true;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getAreaCode, reason: from getter */
    public final String getF53903c() {
        return this.f53903c;
    }

    @Nullable
    public final C4892q0 getBinding$UserCenterLib_googleRelease() {
        return (C4892q0) this.f53902b.getValue(this, f53901o[0]);
    }

    /* JADX INFO: renamed from: getCurrentInputMode, reason: from getter */
    public final int getF53904d() {
        return this.f53904d;
    }

    /* JADX INFO: renamed from: j */
    public final void m65924j(final Function1<? super CountryEntity, Unit> function1) {
        BaseActivity baseActivity = this.f53905e;
        if (baseActivity != null) {
            Intent intent = new Intent(getContext(), (Class<?>) ChoosePhoneAreaActivity.class);
            intent.putExtra(this.f53909i, true);
            intent.putExtra("codeAndMobileCodeStr", b.c().m56315i());
            if (this.f53906f.length() > 0) {
                intent.putExtra("spm", C43852m.m96601m(this.f53906f, "phcountry", "1"));
            }
            baseActivity.startActivityWithResult(intent, new Consumer() { // from class: m70.j
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    EmailPhoneInputView.m65912k(this.f94081b, function1, (Intent) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m65926m(boolean z11) {
        KcTextInputLayout kcTextInputLayout;
        CountryCodeViewLayout countryCodeViewLayout;
        CountryCodeViewLayout countryCodeViewLayout2;
        CountryCodeViewLayout countryCodeViewLayout3;
        CountryCodeViewLayout countryCodeViewLayout4;
        TextView countryCodeTextView;
        KcTextInputLayout kcTextInputLayout2;
        if (!z11) {
            this.f53904d = 0;
            C4892q0 binding$UserCenterLib_googleRelease = getBinding$UserCenterLib_googleRelease();
            if (binding$UserCenterLib_googleRelease != null && (countryCodeViewLayout = binding$UserCenterLib_googleRelease.f5284b) != null) {
                C27046k.m66700o(countryCodeViewLayout);
            }
            C4892q0 binding$UserCenterLib_googleRelease2 = getBinding$UserCenterLib_googleRelease();
            if (binding$UserCenterLib_googleRelease2 == null || (kcTextInputLayout = binding$UserCenterLib_googleRelease2.f5285c) == null) {
                return;
            }
            kcTextInputLayout.setStartIconDrawable((Drawable) null);
            return;
        }
        this.f53904d = 1;
        C4892q0 binding$UserCenterLib_googleRelease3 = getBinding$UserCenterLib_googleRelease();
        if (binding$UserCenterLib_googleRelease3 != null && (kcTextInputLayout2 = binding$UserCenterLib_googleRelease3.f5285c) != null) {
            n.d(kcTextInputLayout2, this.f53903c);
        }
        C4892q0 binding$UserCenterLib_googleRelease4 = getBinding$UserCenterLib_googleRelease();
        if (binding$UserCenterLib_googleRelease4 != null && (countryCodeViewLayout4 = binding$UserCenterLib_googleRelease4.f5284b) != null && (countryCodeTextView = countryCodeViewLayout4.getCountryCodeTextView()) != null) {
            countryCodeTextView.setText(this.f53903c);
        }
        C4892q0 binding$UserCenterLib_googleRelease5 = getBinding$UserCenterLib_googleRelease();
        if (binding$UserCenterLib_googleRelease5 != null && (countryCodeViewLayout3 = binding$UserCenterLib_googleRelease5.f5284b) != null) {
            C27046k.m66685H(countryCodeViewLayout3);
        }
        C4892q0 binding$UserCenterLib_googleRelease6 = getBinding$UserCenterLib_googleRelease();
        if (binding$UserCenterLib_googleRelease6 == null || (countryCodeViewLayout2 = binding$UserCenterLib_googleRelease6.f5284b) == null) {
            return;
        }
        C27046k.m66710y(countryCodeViewLayout2, 800L, new Function0() { // from class: m70.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EmailPhoneInputView.m65913n(this.f94076b);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final void m65927o(final String str) {
        C27100x0.m66924e(new Function0() { // from class: m70.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EmailPhoneInputView.m65914p(this.f94077b, str);
            }
        });
    }

    public final void setAreaCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f53903c = str;
    }

    public final void setCurrentInputMode(int i11) {
        this.f53904d = i11;
    }

    /* JADX INFO: renamed from: t */
    public final void m65929t() {
        EmailAutoHintPop emailAutoHintPop = this.f53907g;
        if (emailAutoHintPop != null) {
            emailAutoHintPop.d();
        }
    }

    /* JADX INFO: renamed from: v */
    public final boolean m65931v(String str) {
        return C5259a0.m6132b("\\d{3,}", str);
    }

    /* JADX INFO: renamed from: w */
    public final boolean m65932w() {
        return this.f53904d == 1;
    }

    /* JADX INFO: renamed from: x */
    public final void m65933x(@NotNull CharSequence errorMsg, boolean z11) {
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        KcTextInputLayout kcTextInputLayoutM65918B = m65918B();
        if (kcTextInputLayoutM65918B != null) {
            kcTextInputLayoutM65918B.m54604j(errorMsg, z11);
        }
    }

    public /* synthetic */ EmailPhoneInputView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: A */
    public static final void m65904A(EmailPhoneInputView emailPhoneInputView) {
        ClearEditText clearEditTextM65928s = emailPhoneInputView.m65928s();
        if (clearEditTextM65928s != null && clearEditTextM65928s.isAttachedToWindow()) {
            KeyboardUtils.m6041m(clearEditTextM65928s);
        }
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m65916r(EmailPhoneInputView emailPhoneInputView, String str) {
        KcTextInputLayout kcTextInputLayout;
        EditText editText;
        KcTextInputLayout kcTextInputLayout2;
        EditText editText2;
        C4892q0 binding$UserCenterLib_googleRelease = emailPhoneInputView.getBinding$UserCenterLib_googleRelease();
        if (binding$UserCenterLib_googleRelease != null && (kcTextInputLayout2 = binding$UserCenterLib_googleRelease.f5285c) != null && (editText2 = kcTextInputLayout2.getEditText()) != null) {
            editText2.setText(str);
        }
        C4892q0 binding$UserCenterLib_googleRelease2 = emailPhoneInputView.getBinding$UserCenterLib_googleRelease();
        if (binding$UserCenterLib_googleRelease2 != null && (kcTextInputLayout = binding$UserCenterLib_googleRelease2.f5285c) != null && (editText = kcTextInputLayout.getEditText()) != null) {
            editText.setSelection(str.length());
        }
        return Unit.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: B */
    public final KcTextInputLayout m65918B() {
        C4892q0 binding$UserCenterLib_googleRelease = getBinding$UserCenterLib_googleRelease();
        if (binding$UserCenterLib_googleRelease != null) {
            return binding$UserCenterLib_googleRelease.f5285c;
        }
        return null;
    }

    /* JADX INFO: renamed from: E */
    public final void m65921E() {
        Editable text;
        String string;
        int i11;
        boolean z11;
        ClearEditText clearEditTextM65928s = m65928s();
        if (clearEditTextM65928s != null && (text = clearEditTextM65928s.getText()) != null && (string = text.toString()) != null) {
            int length = string.length() - 1;
            int i12 = 0;
            boolean z12 = false;
            while (i12 <= length) {
                if (!z12) {
                    i11 = i12;
                } else {
                    i11 = length;
                }
                if (Intrinsics.compare((int) string.charAt(i11), 32) <= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z12) {
                    if (!z11) {
                        z12 = true;
                    } else {
                        i12++;
                    }
                } else if (!z11) {
                    break;
                } else {
                    length--;
                }
            }
            String string2 = string.subSequence(i12, length + 1).toString();
            if (string2 != null && m65931v(string2)) {
                m65926m(true);
            }
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(@Nullable Editable s11) {
        String string;
        int i11;
        boolean z11;
        KcTextInputLayout kcTextInputLayout;
        C4892q0 binding$UserCenterLib_googleRelease = getBinding$UserCenterLib_googleRelease();
        if (binding$UserCenterLib_googleRelease != null && (kcTextInputLayout = binding$UserCenterLib_googleRelease.f5285c) != null) {
            KcTextInputLayout.m54596f(kcTextInputLayout, false, 1, null);
        }
        if (s11 != null && (string = s11.toString()) != null) {
            int length = string.length() - 1;
            int i12 = 0;
            boolean z12 = false;
            while (i12 <= length) {
                if (!z12) {
                    i11 = i12;
                } else {
                    i11 = length;
                }
                if (Intrinsics.compare((int) string.charAt(i11), 32) <= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z12) {
                    if (!z11) {
                        z12 = true;
                    } else {
                        i12++;
                    }
                } else if (!z11) {
                    break;
                } else {
                    length--;
                }
            }
            String string2 = string.subSequence(i12, length + 1).toString();
            if (string2 != null) {
                m65926m(m65931v(string2));
                if (this.f53908h && !C5259a0.m6132b("\\+?\\d*", string2)) {
                    m65927o(string2);
                } else {
                    EmailAutoHintPop emailAutoHintPop = this.f53907g;
                    if (emailAutoHintPop != null) {
                        emailAutoHintPop.d();
                    }
                }
                m65920D(string2);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m65922g(@Nullable BaseActivity baseActivity, @NotNull String pageId, boolean z11, @NotNull String chooseCountryCodeType, @NotNull OpenCountryCodeFromWhereEnum openCountryCodeFromWherePage, @Nullable Function0<Unit> function0, @Nullable Function1<? super CountryEntity, Unit> function1) {
        CountryCodeViewLayout countryCodeViewLayout;
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(chooseCountryCodeType, "chooseCountryCodeType");
        Intrinsics.checkNotNullParameter(openCountryCodeFromWherePage, "openCountryCodeFromWherePage");
        this.f53905e = baseActivity;
        this.f53906f = pageId;
        this.f53908h = z11;
        this.f53909i = chooseCountryCodeType;
        C4892q0 binding$UserCenterLib_googleRelease = getBinding$UserCenterLib_googleRelease();
        if (binding$UserCenterLib_googleRelease != null && (countryCodeViewLayout = binding$UserCenterLib_googleRelease.f5284b) != null) {
            countryCodeViewLayout.m31919d(openCountryCodeFromWherePage);
        }
        this.f53911k = function0;
        this.f53910j = function1;
    }

    @NotNull
    public final String getAccountText() {
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        ClearEditText clearEditTextM65928s = m65928s();
        if (clearEditTextM65928s == null) {
            return "";
        }
        if (m65932w() && !StringsKt.isBlank(this.f53903c)) {
            String str = this.f53903c + '-' + ((Object) clearEditTextM65928s.getText());
            int length = str.length() - 1;
            int i13 = 0;
            boolean z13 = false;
            while (i13 <= length) {
                if (!z13) {
                    i12 = i13;
                } else {
                    i12 = length;
                }
                if (Intrinsics.compare((int) str.charAt(i12), 32) <= 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z13) {
                    if (!z12) {
                        z13 = true;
                    } else {
                        i13++;
                    }
                } else {
                    if (!z12) {
                        break;
                    }
                    length--;
                }
            }
            return str.subSequence(i13, length + 1).toString();
        }
        String strValueOf = String.valueOf(clearEditTextM65928s.getText());
        int length2 = strValueOf.length() - 1;
        int i14 = 0;
        boolean z14 = false;
        while (i14 <= length2) {
            if (!z14) {
                i11 = i14;
            } else {
                i11 = length2;
            }
            if (Intrinsics.compare((int) strValueOf.charAt(i11), 32) <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z14) {
                if (!z11) {
                    z14 = true;
                } else {
                    i14++;
                }
            } else {
                if (!z11) {
                    break;
                }
                length2--;
            }
        }
        return strValueOf.subSequence(i14, length2 + 1).toString();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m65923i() {
        Editable text;
        KcTextInputLayout kcTextInputLayout;
        KcTextInputLayout kcTextInputLayout2;
        KcTextInputLayout kcTextInputLayout3;
        KcTextInputLayout kcTextInputLayout4;
        KcTextInputLayout kcTextInputLayout5;
        KcTextInputLayout kcTextInputLayout6;
        KcTextInputLayout kcTextInputLayout7;
        KcTextInputLayout kcTextInputLayout8;
        EditText editText;
        C4892q0 binding$UserCenterLib_googleRelease = getBinding$UserCenterLib_googleRelease();
        if (binding$UserCenterLib_googleRelease != null && (kcTextInputLayout8 = binding$UserCenterLib_googleRelease.f5285c) != null && (editText = kcTextInputLayout8.getEditText()) != null) {
            text = editText.getText();
        } else {
            text = null;
        }
        String strValueOf = String.valueOf(text);
        if (C5259a0.m6132b("\\+\\d+", strValueOf)) {
            C4892q0 binding$UserCenterLib_googleRelease2 = getBinding$UserCenterLib_googleRelease();
            if (binding$UserCenterLib_googleRelease2 != null && (kcTextInputLayout7 = binding$UserCenterLib_googleRelease2.f5285c) != null) {
                KcTextInputLayout.m54597k(kcTextInputLayout7, R$string.signupv2_input_error_phone_areacode, false, 2, null);
            }
            m65919C("4");
            return false;
        }
        if (this.f53904d == 0) {
            if (StringsKt.isBlank(strValueOf)) {
                C4892q0 binding$UserCenterLib_googleRelease3 = getBinding$UserCenterLib_googleRelease();
                if (binding$UserCenterLib_googleRelease3 != null && (kcTextInputLayout6 = binding$UserCenterLib_googleRelease3.f5285c) != null) {
                    KcTextInputLayout.m54597k(kcTextInputLayout6, R$string.login_account_invalid, false, 2, null);
                }
                m65919C("2");
                return false;
            }
            if (!C27052h0.m66728c(strValueOf)) {
                C4892q0 binding$UserCenterLib_googleRelease4 = getBinding$UserCenterLib_googleRelease();
                if (binding$UserCenterLib_googleRelease4 != null && (kcTextInputLayout5 = binding$UserCenterLib_googleRelease4.f5285c) != null) {
                    KcTextInputLayout.m54597k(kcTextInputLayout5, R$string.login_email_invalid, false, 2, null);
                }
                m65919C("2");
                return false;
            }
            C4892q0 binding$UserCenterLib_googleRelease5 = getBinding$UserCenterLib_googleRelease();
            if (binding$UserCenterLib_googleRelease5 != null && (kcTextInputLayout4 = binding$UserCenterLib_googleRelease5.f5285c) != null) {
                KcTextInputLayout.m54596f(kcTextInputLayout4, false, 1, null);
            }
            m65919C("1");
            return true;
        }
        if (StringsKt.isBlank(strValueOf)) {
            C4892q0 binding$UserCenterLib_googleRelease6 = getBinding$UserCenterLib_googleRelease();
            if (binding$UserCenterLib_googleRelease6 != null && (kcTextInputLayout3 = binding$UserCenterLib_googleRelease6.f5285c) != null) {
                KcTextInputLayout.m54597k(kcTextInputLayout3, R$string.login_account_invalid, false, 2, null);
            }
            m65919C("3");
            return false;
        }
        if (StringsKt.isBlank(this.f53903c)) {
            C4892q0 binding$UserCenterLib_googleRelease7 = getBinding$UserCenterLib_googleRelease();
            if (binding$UserCenterLib_googleRelease7 != null && (kcTextInputLayout2 = binding$UserCenterLib_googleRelease7.f5285c) != null) {
                KcTextInputLayout.m54597k(kcTextInputLayout2, R$string.signupv2_input_error_phone_areacode, false, 2, null);
            }
            m65919C("3");
            return false;
        }
        C4892q0 binding$UserCenterLib_googleRelease8 = getBinding$UserCenterLib_googleRelease();
        if (binding$UserCenterLib_googleRelease8 != null && (kcTextInputLayout = binding$UserCenterLib_googleRelease8.f5285c) != null) {
            KcTextInputLayout.m54596f(kcTextInputLayout, false, 1, null);
        }
        m65919C("1");
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        KcTextInputLayout kcTextInputLayout;
        EditText editText;
        super.onAttachedToWindow();
        C4892q0 binding$UserCenterLib_googleRelease = getBinding$UserCenterLib_googleRelease();
        if (binding$UserCenterLib_googleRelease != null && (kcTextInputLayout = binding$UserCenterLib_googleRelease.f5285c) != null && (editText = kcTextInputLayout.getEditText()) != null) {
            editText.addTextChangedListener(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        KcTextInputLayout kcTextInputLayout;
        EditText editText;
        C4892q0 binding$UserCenterLib_googleRelease = getBinding$UserCenterLib_googleRelease();
        if (binding$UserCenterLib_googleRelease != null && (kcTextInputLayout = binding$UserCenterLib_googleRelease.f5285c) != null && (editText = kcTextInputLayout.getEditText()) != null) {
            editText.removeTextChangedListener(this);
        }
        EmailAutoHintPop emailAutoHintPop = this.f53907g;
        if (emailAutoHintPop != null) {
            emailAutoHintPop.d();
        }
        super.onDetachedFromWindow();
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public final ClearEditText m65928s() {
        EditText editText;
        KcTextInputLayout kcTextInputLayout;
        C4892q0 binding$UserCenterLib_googleRelease = getBinding$UserCenterLib_googleRelease();
        if (binding$UserCenterLib_googleRelease != null && (kcTextInputLayout = binding$UserCenterLib_googleRelease.f5285c) != null) {
            editText = kcTextInputLayout.getEditText();
        } else {
            editText = null;
        }
        if (!(editText instanceof ClearEditText)) {
            return null;
        }
        return (ClearEditText) editText;
    }

    /* JADX INFO: renamed from: u */
    public final void m65930u() {
        Object systemService;
        ClearEditText clearEditTextM65928s = m65928s();
        if (clearEditTextM65928s != null) {
            clearEditTextM65928s.clearFocus();
            BaseActivity baseActivity = this.f53905e;
            InputMethodManager inputMethodManager = null;
            if (baseActivity != null) {
                systemService = baseActivity.getSystemService("input_method");
            } else {
                systemService = null;
            }
            if (systemService instanceof InputMethodManager) {
                inputMethodManager = (InputMethodManager) systemService;
            }
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(clearEditTextM65928s.getWindowToken(), 0);
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m65934z() {
        ClearEditText clearEditTextM65928s = m65928s();
        if (clearEditTextM65928s != null) {
            clearEditTextM65928s.postDelayed(new Runnable() { // from class: m70.i
                @Override // java.lang.Runnable
                public final void run() {
                    EmailPhoneInputView.m65904A(this.f94080b);
                }
            }, 300L);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EmailPhoneInputView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        KcTextInputLayout kcTextInputLayout;
        Object objM20457a;
        KcTextInputLayout kcTextInputLayout2;
        KcTextInputLayout kcTextInputLayout3;
        EditText editText;
        KcTextInputLayout kcTextInputLayout4;
        EditText editText2;
        CountryCodeViewLayout countryCodeViewLayout;
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f53902b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C4892q0>() { // from class: com.kubi.user.view.EmailPhoneInputView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C4892q0 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C4892q0.m5063a(C45682f.m100800a(viewGroup));
            }
        });
        this.f53903c = "";
        this.f53906f = "";
        this.f53909i = SceneCode.KEY_CHOOSE_TYPE_FOR_DEFAULT.toString();
        LayoutInflater.from(context).inflate(R$layout.busercenter_view_email_phone_input, (ViewGroup) this, true);
        C4892q0 binding$UserCenterLib_googleRelease = getBinding$UserCenterLib_googleRelease();
        if (binding$UserCenterLib_googleRelease != null && (countryCodeViewLayout = binding$UserCenterLib_googleRelease.f5284b) != null) {
            C27046k.m66700o(countryCodeViewLayout);
        }
        C4892q0 binding$UserCenterLib_googleRelease2 = getBinding$UserCenterLib_googleRelease();
        if (binding$UserCenterLib_googleRelease2 != null && (kcTextInputLayout4 = binding$UserCenterLib_googleRelease2.f5285c) != null && (editText2 = kcTextInputLayout4.getEditText()) != null) {
            editText2.addTextChangedListener(this);
        }
        C4892q0 binding$UserCenterLib_googleRelease3 = getBinding$UserCenterLib_googleRelease();
        if (binding$UserCenterLib_googleRelease3 != null && (kcTextInputLayout3 = binding$UserCenterLib_googleRelease3.f5285c) != null && (editText = kcTextInputLayout3.getEditText()) != null) {
            InputFilter[] filters = editText.getFilters();
            Intrinsics.checkNotNullExpressionValue(filters, "getFilters(...)");
            editText.setFilters((InputFilter[]) ArraysKt.plus((C42449c0[]) filters, new C42449c0()));
        }
        C4892q0 binding$UserCenterLib_googleRelease4 = getBinding$UserCenterLib_googleRelease();
        EditText editText3 = (binding$UserCenterLib_googleRelease4 == null || (kcTextInputLayout2 = binding$UserCenterLib_googleRelease4.f5285c) == null) ? null : kcTextInputLayout2.getEditText();
        ClearEditText clearEditText = editText3 instanceof ClearEditText ? (ClearEditText) editText3 : null;
        if (clearEditText != null) {
            try {
                RemoteConfig remoteConfig = RemoteConfig.f19636a;
                Type type = new C26845a().getType();
                Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
                objM20457a = RemoteConfig.m20457a("support_sys_auto_fill", type);
            } catch (Throwable th2) {
                C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
                objM20457a = null;
            }
            clearEditText.setSupportSysAutoFill(C27025c.m66567e((Boolean) objM20457a, true));
        }
        C4892q0 binding$UserCenterLib_googleRelease5 = getBinding$UserCenterLib_googleRelease();
        if (binding$UserCenterLib_googleRelease5 == null || (kcTextInputLayout = binding$UserCenterLib_googleRelease5.f5285c) == null) {
            return;
        }
        kcTextInputLayout.setStartIconDrawable((Drawable) null);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@Nullable CharSequence s11, int start, int count, int after) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@Nullable CharSequence s11, int start, int before, int count) {
    }
}
