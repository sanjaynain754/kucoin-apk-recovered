package p813yy;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.function.language.dynamic.LangDynamicManager;
import org.aspectj.lang.InterfaceC43175a;
import org.aspectj.lang.InterfaceC43176b;
import org.aspectj.lang.NoAspectBoundException;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yy.a */
/* JADX INFO: compiled from: LanguageAspect.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000bH\u0007J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000bH\u0007J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000bH\u0007J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/sdk/function/language/LanguageAspect;", "", "<init>", "()V", "onCreate", "", "point", "Lorg/aspectj/lang/JoinPoint;", "onDestroy", "getResources", "Landroid/content/res/Resources;", "Lorg/aspectj/lang/ProceedingJoinPoint;", "attachActivityContext", "attachHoldActivityContext", "attachApplicationContext", "onConfigurationChanged", "LLanguage_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46611a {

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Throwable f104364a;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C46611a f104365b;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m102763a() {
        f104365b = new C46611a();
    }

    /* JADX INFO: renamed from: b */
    public static C46611a m102764b() {
        C46611a c46611a = f104365b;
        if (c46611a != null) {
            return c46611a;
        }
        throw new NoAspectBoundException("com.kubi.sdk.function.language.LanguageAspect", f104364a);
    }

    /* JADX INFO: renamed from: c */
    public final void m102765c(@NotNull InterfaceC43176b point) throws Throwable {
        Intrinsics.checkNotNullParameter(point, "point");
        MultiLanguageManager multiLanguageManager = MultiLanguageManager.f46805a;
        Object obj = point.mo82131b()[0];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.content.Context");
        point.mo82133d(new Context[]{multiLanguageManager.m56994p((Context) obj)});
    }

    /* JADX INFO: renamed from: d */
    public final void m102766d(@NotNull InterfaceC43176b point) throws Throwable {
        Intrinsics.checkNotNullParameter(point, "point");
        MultiLanguageManager multiLanguageManager = MultiLanguageManager.f46805a;
        Object obj = point.mo82131b()[0];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.content.Context");
        point.mo82133d(new Context[]{multiLanguageManager.m56994p((Context) obj)});
    }

    /* JADX INFO: renamed from: e */
    public final void m102767e(@NotNull InterfaceC43176b point) throws Throwable {
        Intrinsics.checkNotNullParameter(point, "point");
        MultiLanguageManager multiLanguageManager = MultiLanguageManager.f46805a;
        Object obj = point.mo82131b()[0];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.content.Context");
        point.mo82133d(new Context[]{multiLanguageManager.m56994p((Context) obj)});
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final Resources m102768f(@NotNull InterfaceC43176b point) throws Throwable {
        Intrinsics.checkNotNullParameter(point, "point");
        LangDynamicManager langDynamicManager = LangDynamicManager.f46816a;
        Object objMo82130a = point.mo82130a();
        Intrinsics.checkNotNull(objMo82130a, "null cannot be cast to non-null type android.content.res.Resources");
        Resources resourcesM57014f = langDynamicManager.m57014f((Resources) objMo82130a);
        if (resourcesM57014f.getConfiguration().fontScale == 1.0f) {
            return resourcesM57014f;
        }
        Configuration configuration = resourcesM57014f.getConfiguration();
        configuration.fontScale = 1.0f;
        resourcesM57014f.updateConfiguration(configuration, resourcesM57014f.getDisplayMetrics());
        return resourcesM57014f;
    }

    /* JADX INFO: renamed from: g */
    public final void m102769g(@NotNull InterfaceC43175a point) throws Throwable {
        Intrinsics.checkNotNullParameter(point, "point");
        MultiLanguageManager.f46805a.m56990k(BaseApplication.INSTANCE.get());
    }

    /* JADX INFO: renamed from: h */
    public final void m102770h(@NotNull InterfaceC43175a point) throws Throwable {
        Intrinsics.checkNotNullParameter(point, "point");
        LangDynamicManager langDynamicManager = LangDynamicManager.f46816a;
        Object target = point.getTarget();
        Intrinsics.checkNotNull(target, "null cannot be cast to non-null type android.app.Activity");
        langDynamicManager.m57015g((Activity) target);
    }

    /* JADX INFO: renamed from: i */
    public final void m102771i(@NotNull InterfaceC43175a point) throws Throwable {
        Intrinsics.checkNotNullParameter(point, "point");
        Object target = point.getTarget();
        Activity activity = target instanceof Activity ? (Activity) target : null;
        if (activity == null) {
            return;
        }
        LangDynamicManager.f46816a.m57016i(activity);
    }

    static {
        try {
            m102763a();
        } catch (Throwable th2) {
            f104364a = th2;
        }
    }
}
