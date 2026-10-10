package com.kubi.sdk.function.language.dynamic;

import android.app.Activity;
import android.content.res.Resources;
import android.view.LayoutInflater;
import androidx.core.view.LayoutInflaterCompat;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.sdk.function.language.dynamic.LangDynamicManager;
import com.kubi.sdk.function.language.issue.LangConfigMessage;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27025c;
import java.lang.reflect.Type;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p847zy.LayoutInflaterFactory2C46950l;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.sdk.function.language.dynamic.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: LangDynamicManager.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/sdk/function/language/dynamic/LangDynamicManager;", "", "<init>", "()V", "TAG", "", "languageOpen", "", "getLanguageOpen", "()Z", "languageOpen$delegate", "Lkotlin/Lazy;", "langReleaseOpen", "hookCache", "Ljava/util/IdentityHashMap;", "Landroid/content/res/Resources;", "Lcom/kubi/sdk/function/language/dynamic/DynamicResourceHook;", "getResource", "resources", "hookLayoutInflaterFactor", "", "activity", "Landroid/app/Activity;", "release", "LLanguage_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLangDynamicManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LangDynamicManager.kt\ncom/kubi/sdk/function/language/dynamic/LangDynamicManager\n+ 2 LangConfigIssue.kt\ncom/kubi/sdk/function/language/issue/LangConfigIssueKt\n+ 3 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 4 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,98:1\n48#2,2:99\n48#2,2:101\n35#3,4:103\n39#3:109\n35#3,4:110\n39#3:116\n44#4,2:107\n44#4,2:114\n*S KotlinDebug\n*F\n+ 1 LangDynamicManager.kt\ncom/kubi/sdk/function/language/dynamic/LangDynamicManager\n*L\n56#1:99,2\n79#1:101,2\n16#1:103,4\n16#1:109\n19#1:110,4\n19#1:116\n16#1:107,2\n19#1:114,2\n*E\n"})
public final class LangDynamicManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final LangDynamicManager f46816a = new LangDynamicManager();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f46817b = LazyKt.lazy(new Function0() { // from class: zy.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(LangDynamicManager.m57009h());
        }
    });

    /* JADX INFO: renamed from: c */
    public static final boolean f46818c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final IdentityHashMap<Resources, DynamicResourceHook> f46819d;

    /* JADX INFO: renamed from: com.kubi.sdk.function.language.dynamic.a$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: com.kubi.sdk.function.language.dynamic.a$b */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class b extends TypeToken<Boolean> {
    }

    static {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new b().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("lang_dynamic_release_open", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        f46818c = C27025c.m66567e((Boolean) objM20457a, true);
        f46819d = new IdentityHashMap<>();
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m57009h() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kc_language_open", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m57010j(Activity activity) {
        IdentityHashMap<Resources, DynamicResourceHook> identityHashMap = f46819d;
        synchronized (identityHashMap) {
            try {
                final Resources resources = activity.getResources();
                if (resources instanceof DynamicResourceHook) {
                    Set<Map.Entry<Resources, DynamicResourceHook>> setEntrySet = identityHashMap.entrySet();
                    final Function1 function1 = new Function1() { // from class: zy.h
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Boolean.valueOf(LangDynamicManager.m57011k(resources, (Map.Entry) obj));
                        }
                    };
                    setEntrySet.removeIf(new Predicate() { // from class: zy.i
                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return LangDynamicManager.m57012l(function1, obj);
                        }
                    });
                } else {
                    identityHashMap.remove(resources);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m57011k(Resources resources, Map.Entry it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getValue() == resources;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m57013e() {
        return ((Boolean) f46817b.getValue()).booleanValue();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final Resources m57014f(@NotNull Resources resources) {
        DynamicResourceHook dynamicResourceHookCreate;
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (!m57013e()) {
            return resources;
        }
        try {
            if (resources instanceof DynamicResourceHook) {
                return resources;
            }
            IdentityHashMap<Resources, DynamicResourceHook> identityHashMap = f46819d;
            synchronized (identityHashMap) {
                dynamicResourceHookCreate = identityHashMap.get(resources);
                if (dynamicResourceHookCreate == null) {
                    dynamicResourceHookCreate = DynamicResourceHook.f46812c.create(resources);
                    if (dynamicResourceHookCreate != null) {
                        identityHashMap.put(resources, (DynamicResourceHook) dynamicResourceHookCreate);
                    } else {
                        dynamicResourceHookCreate = resources;
                    }
                }
            }
            return dynamicResourceHookCreate;
        } catch (Exception e11) {
            C43846g.m96568c(new LangConfigMessage("getResource error: " + e11.getMessage(), "LangDynamicManager", false, 4, null), null, 2, null);
            return resources;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m57015g(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (m57013e()) {
            try {
                LayoutInflater layoutInflater = activity.getLayoutInflater();
                Intrinsics.checkNotNullExpressionValue(layoutInflater, "getLayoutInflater(...)");
                if (layoutInflater.getFactory2() instanceof LayoutInflaterFactory2C46950l) {
                    return;
                }
                LayoutInflaterCompat.setFactory2(layoutInflater, new LayoutInflaterFactory2C46950l(activity));
            } catch (Exception e11) {
                C43846g.m96568c(new LangConfigMessage("hookLayoutInflaterFactor error: " + e11.getMessage(), "LangDynamicManager", false, 4, null), null, 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m57016i(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (f46818c) {
            C27100x0.m66923d(new Function0() { // from class: zy.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LangDynamicManager.m57010j(activity);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m57012l(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }
}
