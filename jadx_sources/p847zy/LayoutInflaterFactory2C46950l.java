package p847zy;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatCallback;
import androidx.appcompat.app.AppCompatDelegate;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.sdk.function.language.issue.LangConfigMessage;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.bugly.proguard.C33978va;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: zy.l */
/* JADX INFO: compiled from: LanguageLayoutInflaterFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J,\u0010\u001d\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\"\u0010\u001e\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\"\u0010\u001d\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J,\u0010!\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\"\u001a\u0004\u0018\u00010\u0016H\u0002J\u0018\u0010#\u001a\u00020$2\u0006\u0010\"\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\f\u0010%\u001a\u00020\t*\u00020&H\u0002J\"\u0010'\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\tH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013¨\u0006*"}, m90084d2 = {"Lcom/kubi/sdk/function/language/dynamic/LanguageLayoutInflaterFactory;", "Landroid/view/LayoutInflater$Factory2;", "activity", "Landroid/app/Activity;", "<init>", "(Landroid/app/Activity;)V", "getActivity", "()Landroid/app/Activity;", "TAG", "", "createViewOpen", "", "getCreateViewOpen", "()Z", "createViewOpen$delegate", "Lkotlin/Lazy;", "delegate", "Landroidx/appcompat/app/AppCompatDelegate;", "getDelegate", "()Landroidx/appcompat/app/AppCompatDelegate;", "delegate$delegate", "checkAndCreateView", "Landroid/view/View;", "parent", "name", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "onCreateView", "tryCreateView", "inflater", "Landroid/view/LayoutInflater;", "checkAndReturnView", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "handlerXmlText", "", "toText", "", "getStringValue", "isAndroidSystem", "valueName", "LLanguage_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLanguageLayoutInflaterFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageLayoutInflaterFactory.kt\ncom/kubi/sdk/function/language/dynamic/LanguageLayoutInflaterFactory\n+ 2 LangConfigIssue.kt\ncom/kubi/sdk/function/language/issue/LangConfigIssueKt\n+ 3 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 4 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,161:1\n48#2,2:162\n48#2,2:164\n48#2,2:166\n48#2,2:168\n48#2,2:170\n48#2,2:172\n48#2,2:174\n35#3,4:176\n39#3:182\n44#4,2:180\n*S KotlinDebug\n*F\n+ 1 LanguageLayoutInflaterFactory.kt\ncom/kubi/sdk/function/language/dynamic/LanguageLayoutInflaterFactory\n*L\n48#1:162,2\n62#1:164,2\n70#1:166,2\n79#1:168,2\n103#1:170,2\n107#1:172,2\n126#1:174,2\n24#1:176,4\n24#1:182\n24#1:180,2\n*E\n"})
public final class LayoutInflaterFactory2C46950l implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Activity f104818b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final String f104819c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Lazy f104820d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Lazy f104821e;

    /* JADX INFO: renamed from: zy.l$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: d */
    public final View m103429d(String str, Context context, AttributeSet attributeSet, View view) {
        if (view == null) {
            return null;
        }
        try {
            m103433j(view, attributeSet);
            return view;
        } catch (Exception e11) {
            C43846g.m96568c(new LangConfigMessage("checkAndReturnView exception name=" + str + ", e=" + e11, this.f104819c, false, 4, null), null, 2, null);
            return view;
        }
    }

    @Override // android.view.LayoutInflater.Factory
    @Nullable
    public View onCreateView(@NotNull String name, @NotNull Context context, @NotNull AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        return null;
    }

    public LayoutInflaterFactory2C46950l(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f104818b = activity;
        this.f104819c = "LanguageLayoutInflaterFactory";
        this.f104820d = LazyKt.lazy(new Function0() { // from class: zy.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(LayoutInflaterFactory2C46950l.m103426e());
            }
        });
        this.f104821e = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: zy.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LayoutInflaterFactory2C46950l.m103427f(this.f104817b);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m103426e() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kc_language_createview_anr", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX INFO: renamed from: f */
    public static final AppCompatDelegate m103427f(LayoutInflaterFactory2C46950l layoutInflaterFactory2C46950l) {
        AppCompatDelegate appCompatDelegateCreate = AppCompatDelegate.create(layoutInflaterFactory2C46950l.f104818b, (AppCompatCallback) null);
        Intrinsics.checkNotNullExpressionValue(appCompatDelegateCreate, "create(...)");
        return appCompatDelegateCreate;
    }

    /* JADX INFO: renamed from: c */
    public final View m103428c(View view, String str, Context context, AttributeSet attributeSet) {
        try {
            Activity activity = this.f104818b;
            return activity instanceof AppCompatActivity ? ((AppCompatActivity) activity).getDelegate().createView(view, str, context, attributeSet) : m103431h().createView(view, str, context, attributeSet);
        } catch (Exception e11) {
            C43846g.m96568c(new LangConfigMessage("checkAndCreateView exception name=" + str + ", e=" + e11, this.f104819c, false, 4, null), null, 2, null);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m103430g() {
        return ((Boolean) this.f104820d.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: h */
    public final AppCompatDelegate m103431h() {
        return (AppCompatDelegate) this.f104821e.getValue();
    }

    /* JADX INFO: renamed from: i */
    public final String m103432i(AttributeSet attributeSet, boolean z11, String str) {
        String attributeValue = attributeSet.getAttributeValue(z11 ? "http://schemas.android.com/apk/res/android" : "http://schemas.android.com/apk/res-auto", str);
        if (attributeValue != null && StringsKt.startsWith$default(attributeValue, "@", false, 2, (Object) null)) {
            try {
                String strSubstring = attributeValue.substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                Integer numM66544n = DowngradeExKt.m66544n(strSubstring);
                if (numM66544n != null) {
                    return m103434k(numM66544n.intValue());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m103433j(View view, AttributeSet attributeSet) {
        String strM103432i;
        String strM103432i2;
        if ((view instanceof TextView) && (strM103432i2 = m103432i(attributeSet, true, "text")) != null) {
            ((TextView) view).setText(strM103432i2);
        }
        if (!(view instanceof EditText) || (strM103432i = m103432i(attributeSet, true, "hint")) == null) {
            return;
        }
        ((EditText) view).setHint(strM103432i);
    }

    /* JADX INFO: renamed from: k */
    public final String m103434k(int i11) {
        String string = this.f104818b.getString(i11);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    /* JADX INFO: renamed from: l */
    public final View m103435l(LayoutInflater layoutInflater, String str, AttributeSet attributeSet) {
        try {
            try {
                return StringsKt.contains$default((CharSequence) str, (CharSequence) C33978va.f72339h, false, 2, (Object) null) ? layoutInflater.createView(str, null, attributeSet) : layoutInflater.createView(str, "android.widget.", attributeSet);
            } catch (ClassNotFoundException unused) {
                return null;
            } catch (Exception e11) {
                C43846g.m96568c(new LangConfigMessage("tryCreateView exception name=" + str + ", e=" + e11, this.f104819c, false, 4, null), null, 2, null);
                return null;
            }
        } catch (ClassNotFoundException unused2) {
            return layoutInflater.createView(str, "android.view.", attributeSet);
        } catch (Exception e12) {
            C43846g.m96568c(new LangConfigMessage("tryCreateView exception2 name=" + str + ", e=" + e12, this.f104819c, false, 4, null), null, 2, null);
            return null;
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    @Nullable
    public View onCreateView(@Nullable View parent, @NotNull String name, @NotNull Context context, @NotNull AttributeSet attrs) {
        View viewM103435l;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        View viewCreateView = null;
        try {
            viewM103435l = m103428c(parent, name, context, attrs);
        } catch (Exception e11) {
            C43846g.m96568c(new LangConfigMessage("onCreateView exception name=" + name + ", e=" + e11, this.f104819c, false, 4, null), null, 2, null);
            viewM103435l = null;
        }
        if (m103430g()) {
            if (viewM103435l == null && StringsKt.contains$default((CharSequence) name, '.', false, 2, (Object) null)) {
                try {
                    viewCreateView = LayoutInflater.from(context).createView(name, null, attrs);
                } catch (Exception e12) {
                    C43846g.m96568c(new LangConfigMessage("onCreateView exception2 name=" + name + ", e=" + e12, this.f104819c, false, 4, null), null, 2, null);
                }
                viewM103435l = viewCreateView;
            }
        } else if (viewM103435l == null) {
            try {
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
                Intrinsics.checkNotNullExpressionValue(layoutInflaterFrom, "from(...)");
                viewM103435l = m103435l(layoutInflaterFrom, name, attrs);
            } catch (Exception e13) {
                C43846g.m96568c(new LangConfigMessage("onCreateView exception3 name=" + name + ", e=" + e13, this.f104819c, false, 4, null), null, 2, null);
            }
        }
        return m103429d(name, context, attrs, viewM103435l);
    }
}
