package com.kubi.widget.web.startup;

import androidx.lifecycle.Observer;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.sdk.function.language.LanguageType;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.mode.AppMode;
import com.kubi.sdk.site.SiteType;
import com.kubi.widget.web.helper.WebPathLanguageHelper;
import d10.InterfaceC36593a;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p694vk.C45590s;
import p848zz.C46951a;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import v80.C45475f;
import v80.KWebViewSiteInfo;
import x00.C45977b;

/* JADX INFO: renamed from: com.kubi.widget.web.startup.i, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KWebStartupDependencies.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010\b\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/widget/web/startup/KWebSiteBaseConfigurator;", "", "<init>", "()V", "TAG", "", "configure", "", "updateSiteChannel", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKWebStartupDependencies.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KWebStartupDependencies.kt\ncom/kubi/widget/web/startup/KWebSiteBaseConfigurator\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,131:1\n11228#2:132\n11563#2,3:133\n*S KotlinDebug\n*F\n+ 1 KWebStartupDependencies.kt\ncom/kubi/widget/web/startup/KWebSiteBaseConfigurator\n*L\n83#1:132\n83#1:133,3\n*E\n"})
public final class KWebSiteBaseConfigurator {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final KWebSiteBaseConfigurator f55241a = new KWebSiteBaseConfigurator();

    /* JADX INFO: renamed from: com.kubi.widget.web.startup.i$a */
    /* JADX INFO: compiled from: KWebStartupDependencies.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/widget/web/startup/KWebSiteBaseConfigurator$configure$4", "Lcom/kubi/sdk/function/language/MultiLanguageManager$OnLanguageChangeListener;", "onLanguageChange", "", "language", "Lcom/kubi/sdk/function/language/LanguageType;", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a implements MultiLanguageManager.a {
        @Override // com.kubi.sdk.function.language.MultiLanguageManager.a
        public void onLanguageChange(LanguageType language) {
            Intrinsics.checkNotNullParameter(language, "language");
            C45977b.f103426a.m101418d(WebPathLanguageHelper.f55187a.m67322a(language));
        }
    }

    /* JADX INFO: renamed from: com.kubi.widget.web.startup.i$b */
    /* JADX INFO: compiled from: KWebStartupDependencies.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f55242b;

        public b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f55242b = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p852kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f55242b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f55242b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m67403e() {
        AppMode.INSTANCE.getCurrentMode().observeForever(new b(new Function1() { // from class: com.kubi.widget.web.startup.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KWebSiteBaseConfigurator.m67404f((AppMode) obj);
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m67404f(AppMode appMode) {
        f55241a.m67407h();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static final String m67405g() {
        return DayNightThemeManager.f28592a.m33187l() ? "light" : "dark";
    }

    /* JADX INFO: renamed from: h */
    public final void m67407h() {
        C45475f c45475f = C45475f.f102497a;
        KWebViewSiteInfo kWebViewSiteInfoM100431c = c45475f.m100431c();
        InterfaceC36593a interfaceC36593aM100432d = c45475f.m100432d();
        String currentSiteType = SiteType.INSTANCE.getCurrentSiteType();
        String modeType = AppMode.Companion.getCurrentMode$default(AppMode.INSTANCE, null, 1, null).getModeType();
        C44128b.m97266j("KWebWidgetStartupTask", "siteType=" + currentSiteType + ", mode=" + modeType + ", shareSite=" + interfaceC36593aM100432d.getClass().getSimpleName());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(kWebViewSiteInfoM100431c.getAgent());
        sb2.append(' ');
        sb2.append(modeType);
        sb2.append('/');
        sb2.append(C45590s.f102687a.m100675Z());
        String string = sb2.toString();
        C44128b.m97259c("KWebWidgetStartupTask", "appendUA updated");
        C45977b.f103426a.m101422h(interfaceC36593aM100432d, kWebViewSiteInfoM100431c.getDefaultLanPath(), kWebViewSiteInfoM100431c.getDefaultLan(), string, currentSiteType);
        C46951a.f104822a.m103436a(string);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: d */
    public final void m67406d() {
        m67407h();
        new KWebModeObserverRegistrar(null, 1, null).m67399e(new Function0() { // from class: com.kubi.widget.web.startup.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KWebSiteBaseConfigurator.m67403e();
            }
        });
        C45977b c45977b = C45977b.f103426a;
        c45977b.m101424j("KuCoin");
        c45977b.m101423i(C45590s.f102687a.m100666Q());
        LanguageType[] languageTypeArrValues = LanguageType.values();
        ArrayList arrayList = new ArrayList(languageTypeArrValues.length);
        for (LanguageType languageType : languageTypeArrValues) {
            arrayList.add(languageType.getLocale().getLanguage());
        }
        c45977b.m101425k(arrayList);
        C45977b c45977b2 = C45977b.f103426a;
        c45977b2.m101427m(new Function0() { // from class: com.kubi.widget.web.startup.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KWebSiteBaseConfigurator.m67405g();
            }
        });
        c45977b2.m101418d(WebPathLanguageHelper.f55187a.m67322a(MultiLanguageManager.f46811g));
        MultiLanguageManager.f46805a.addOnLanguageChangeListener(new a());
    }
}
