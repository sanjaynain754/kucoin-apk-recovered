package com.kubi.sdk.function.language.dynamic;

import android.content.res.Resources;
import androidx.annotation.RequiresApi;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.function.language.dynamic.DynamicResourceHook;
import com.kubi.sdk.function.language.issue.LangConfigMessage;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p847zy.C46942d;
import p847zy.C46943e;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.sequences.SequencesKt;
import p852kotlin.text.MatchResult;
import p852kotlin.text.Regex;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: DynamicResourceHook.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\t\u0018\u0000 '2\u00020\u0001:\u0001'B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0017J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010\u0016\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000fH\u0016J\u001e\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u001a\u001a\b\u0018\u00010\u001bR\u00020\u0001H\u0016J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J-\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0016\u0010\u001d\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001f0\u001e\"\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0002\u0010 J\u0010\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007H\u0002J'\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00072\u0010\u0010$\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001f0\u001eH\u0002¢\u0006\u0002\u0010%J\u0010\u0010&\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u0007H\u0002R\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006("}, m90084d2 = {"Lcom/kubi/sdk/function/language/dynamic/DynamicResourceHook;", "Landroid/content/res/Resources;", "resources", "<init>", "(Landroid/content/res/Resources;)V", "baseRes", "appPackageName", "", "getAppPackageName", "()Ljava/lang/String;", "appPackageName$delegate", "Lkotlin/Lazy;", "getBoolean", "", "id", "", "getInteger", "getFloat", "", "getDimension", "getDimensionPixelSize", "getDimensionPixelOffset", "getFraction", TtmlNode.RUBY_BASE, "pbase", "getColor", BaseActivity.THEME, "Landroid/content/res/Resources$Theme;", "getString", "formatArgs", "", "", "(I[Ljava/lang/Object;)Ljava/lang/String;", "escapeLiteralPercent", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "safeFormat", "args", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "countPlaceholders", "Companion", "LLanguage_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDynamicResourceHook.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DynamicResourceHook.kt\ncom/kubi/sdk/function/language/dynamic/DynamicResourceHook\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LangConfigIssue.kt\ncom/kubi/sdk/function/language/issue/LangConfigIssueKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,339:1\n1#2:340\n48#3,2:341\n48#3,2:343\n48#3,2:349\n48#3,2:351\n37#4:345\n36#4,3:346\n*S KotlinDebug\n*F\n+ 1 DynamicResourceHook.kt\ncom/kubi/sdk/function/language/dynamic/DynamicResourceHook\n*L\n197#1:341,2\n225#1:343,2\n283#1:349,2\n26#1:351,2\n280#1:345\n280#1:346,3\n*E\n"})
public final class DynamicResourceHook extends Resources {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Companion f46812c = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Lazy<Field> f46813d = LazyKt.lazy(new Function0() { // from class: zy.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DynamicResourceHook.m56999h();
        }
    });

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Resources f46814a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f46815b;

    /* JADX INFO: compiled from: DynamicResourceHook.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/sdk/function/language/dynamic/DynamicResourceHook$Companion;", "", "<init>", "()V", "TAG", "", "mResourcesImplField", "Ljava/lang/reflect/Field;", "getMResourcesImplField", "()Ljava/lang/reflect/Field;", "mResourcesImplField$delegate", "Lkotlin/Lazy;", "create", "Lcom/kubi/sdk/function/language/dynamic/DynamicResourceHook;", "resources", "Landroid/content/res/Resources;", "LLanguage_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nDynamicResourceHook.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DynamicResourceHook.kt\ncom/kubi/sdk/function/language/dynamic/DynamicResourceHook$Companion\n+ 2 LangConfigIssue.kt\ncom/kubi/sdk/function/language/issue/LangConfigIssueKt\n*L\n1#1,339:1\n48#2,2:340\n48#2,2:342\n48#2,2:344\n*S KotlinDebug\n*F\n+ 1 DynamicResourceHook.kt\ncom/kubi/sdk/function/language/dynamic/DynamicResourceHook$Companion\n*L\n46#1:340,2\n57#1:342,2\n62#1:344,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @Nullable
        public final DynamicResourceHook create(@NotNull Resources resources) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            Field fieldM57004a = m57004a();
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (fieldM57004a == null) {
                C44128b.m97270n("DynamicResources", "mResourcesImpl field not available, skip hook");
                return null;
            }
            try {
                Object obj = fieldM57004a.get(resources);
                if (obj == null) {
                    C44128b.m97270n("DynamicResources", "Original mResourcesImpl is null, skip hook");
                    C43846g.m96568c(new LangConfigMessage("Original mResourcesImpl is null, skip hook", "DynamicResources", false, 4, null), null, 2, null);
                    return null;
                }
                DynamicResourceHook dynamicResourceHook = new DynamicResourceHook(resources, defaultConstructorMarker);
                fieldM57004a.set(dynamicResourceHook, obj);
                if (fieldM57004a.get(dynamicResourceHook) == obj) {
                    return dynamicResourceHook;
                }
                C44128b.m97270n("DynamicResources", "mResourcesImpl set but verify failed, skip hook");
                C43846g.m96568c(new LangConfigMessage("mResourcesImpl set but verify failed, skip hook", "DynamicResources", false, 4, null), null, 2, null);
                return null;
            } catch (Exception e11) {
                C44128b.m97270n("DynamicResources", "Failed to copy ResourcesImpl: " + e11.getMessage());
                C43846g.m96568c(new LangConfigMessage("Failed to copy ResourcesImpl: " + e11.getMessage(), "DynamicResources", false, 4, null), null, 2, null);
                return null;
            }
        }

        /* JADX INFO: renamed from: a */
        public final Field m57004a() {
            return (Field) DynamicResourceHook.f46813d.getValue();
        }
    }

    public /* synthetic */ DynamicResourceHook(Resources resources, DefaultConstructorMarker defaultConstructorMarker) {
        this(resources);
    }

    @Override // android.content.res.Resources
    @NotNull
    public String getString(int id2) {
        Object objM103844constructorimpl;
        String string;
        try {
            Result.Companion companion = Result.INSTANCE;
            String resourceEntryName = this.f46814a.getResourceEntryName(id2);
            if (!Intrinsics.areEqual(this.f46814a.getResourcePackageName(id2), m57002g())) {
                String string2 = super.getString(id2);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }
            C46943e c46943e = C46943e.f104811a;
            Intrinsics.checkNotNull(resourceEntryName);
            String strM103423e = c46943e.m103423e(resourceEntryName);
            if (strM103423e.length() > 0) {
                string = C46942d.m103418b(strM103423e);
            } else {
                string = super.getString(id2);
                Intrinsics.checkNotNull(string);
            }
            objM103844constructorimpl = Result.m103844constructorimpl(string);
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                C44128b.m97270n("DynamicResources", "getString failed, id=" + id2 + ", error=" + thM103847exceptionOrNullimpl.getMessage());
                C43846g.m96568c(new LangConfigMessage("getString failed, id=" + id2 + ", error=" + thM103847exceptionOrNullimpl.getMessage(), "DynamicResources", false, 4, null), null, 2, null);
                objM103844constructorimpl = super.getString(id2);
                Intrinsics.checkNotNullExpressionValue(objM103844constructorimpl, "getString(...)");
            }
            return (String) objM103844constructorimpl;
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    public DynamicResourceHook(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f46814a = resources;
        this.f46815b = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: zy.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DynamicResourceHook.m56998d();
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static final String m56998d() {
        String packageName = BaseApplication.INSTANCE.get().getPackageName();
        if (packageName == null) {
            packageName = "";
        }
        return StringsKt.removeSuffix(packageName, (CharSequence) ".debug");
    }

    /* JADX INFO: renamed from: h */
    public static final Field m56999h() {
        try {
            Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Exception e11) {
            C44128b.m97270n("DynamicResources", "Cannot find mResourcesImpl field: " + e11.getMessage());
            C43846g.m96568c(new LangConfigMessage("Cannot find mResourcesImpl field: " + e11.getMessage(), "DynamicResources", false, 4, null), null, 2, null);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m57000e(String str) {
        return SequencesKt.count(Regex.findAll$default(new Regex("%(\\d+\\$)?[sdf]"), str, 0, 2, null));
    }

    /* JADX INFO: renamed from: f */
    public final String m57001f(String str) {
        Regex regex = new Regex("%(%|\\d+\\$[sdfSDF]|[sdfSDF])");
        StringBuilder sb2 = new StringBuilder();
        int length = 0;
        while (length < str.length()) {
            if (str.charAt(length) == '%') {
                String strSubstring = str.substring(length);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                MatchResult matchResultFind$default = Regex.find$default(regex, strSubstring, 0, 2, null);
                if (matchResultFind$default == null || matchResultFind$default.getRange().getFirst() != 0) {
                    sb2.append("%%");
                } else {
                    sb2.append(matchResultFind$default.getValue());
                    length += matchResultFind$default.getValue().length();
                }
            } else {
                sb2.append(str.charAt(length));
            }
            length++;
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: g */
    public final String m57002g() {
        return (String) this.f46815b.getValue();
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int id2) {
        Object objM103844constructorimpl;
        Object objM103844constructorimpl2;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(Boolean.valueOf(super.getBoolean(id2)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            try {
                C44128b.m97270n("DynamicResources", "getBoolean fallback to baseRes: " + thM103847exceptionOrNullimpl.getMessage());
                objM103844constructorimpl2 = Result.m103844constructorimpl(Boolean.valueOf(this.f46814a.getBoolean(id2)));
            } catch (Throwable th3) {
                Result.Companion companion3 = Result.INSTANCE;
                objM103844constructorimpl2 = Result.m103844constructorimpl(ResultKt.createFailure(th3));
            }
            objM103844constructorimpl = objM103844constructorimpl2;
        }
        Throwable thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl2 != null) {
            C44128b.m97270n("DynamicResources", "getBoolean all failed, return false: " + thM103847exceptionOrNullimpl2.getMessage());
            objM103844constructorimpl = Boolean.FALSE;
        }
        return ((Boolean) objM103844constructorimpl).booleanValue();
    }

    @Override // android.content.res.Resources
    public int getColor(int id2, @Nullable Resources.Theme theme) {
        Object objM103844constructorimpl;
        Object objM103844constructorimpl2;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(Integer.valueOf(super.getColor(id2, theme)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            try {
                C44128b.m97270n("DynamicResources", "getColor fallback to baseRes: " + thM103847exceptionOrNullimpl.getMessage());
                objM103844constructorimpl2 = Result.m103844constructorimpl(Integer.valueOf(this.f46814a.getColor(id2, theme)));
            } catch (Throwable th3) {
                Result.Companion companion3 = Result.INSTANCE;
                objM103844constructorimpl2 = Result.m103844constructorimpl(ResultKt.createFailure(th3));
            }
            objM103844constructorimpl = objM103844constructorimpl2;
        }
        Throwable thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl2 != null) {
            C44128b.m97270n("DynamicResources", "getColor all failed, return 0: " + thM103847exceptionOrNullimpl2.getMessage());
            objM103844constructorimpl = 0;
        }
        return ((Number) objM103844constructorimpl).intValue();
    }

    @Override // android.content.res.Resources
    public float getDimension(int id2) {
        Object objM103844constructorimpl;
        Object objM103844constructorimpl2;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(Float.valueOf(super.getDimension(id2)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            try {
                C44128b.m97270n("DynamicResources", "getDimension fallback to baseRes: " + thM103847exceptionOrNullimpl.getMessage());
                objM103844constructorimpl2 = Result.m103844constructorimpl(Float.valueOf(this.f46814a.getDimension(id2)));
            } catch (Throwable th3) {
                Result.Companion companion3 = Result.INSTANCE;
                objM103844constructorimpl2 = Result.m103844constructorimpl(ResultKt.createFailure(th3));
            }
            objM103844constructorimpl = objM103844constructorimpl2;
        }
        Throwable thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl2 != null) {
            C44128b.m97270n("DynamicResources", "getDimension all failed, return 0f: " + thM103847exceptionOrNullimpl2.getMessage());
            objM103844constructorimpl = Float.valueOf(0.0f);
        }
        return ((Number) objM103844constructorimpl).floatValue();
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int id2) {
        Object objM103844constructorimpl;
        Object objM103844constructorimpl2;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(Integer.valueOf(super.getDimensionPixelOffset(id2)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            try {
                C44128b.m97270n("DynamicResources", "getDimensionPixelOffset fallback to baseRes: " + thM103847exceptionOrNullimpl.getMessage());
                objM103844constructorimpl2 = Result.m103844constructorimpl(Integer.valueOf(this.f46814a.getDimensionPixelOffset(id2)));
            } catch (Throwable th3) {
                Result.Companion companion3 = Result.INSTANCE;
                objM103844constructorimpl2 = Result.m103844constructorimpl(ResultKt.createFailure(th3));
            }
            objM103844constructorimpl = objM103844constructorimpl2;
        }
        Throwable thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl2 != null) {
            C44128b.m97270n("DynamicResources", "getDimensionPixelOffset all failed, return 0: " + thM103847exceptionOrNullimpl2.getMessage());
            objM103844constructorimpl = 0;
        }
        return ((Number) objM103844constructorimpl).intValue();
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int id2) {
        Object objM103844constructorimpl;
        Object objM103844constructorimpl2;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(Integer.valueOf(super.getDimensionPixelSize(id2)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            try {
                C44128b.m97270n("DynamicResources", "getDimensionPixelSize fallback to baseRes: " + thM103847exceptionOrNullimpl.getMessage());
                objM103844constructorimpl2 = Result.m103844constructorimpl(Integer.valueOf(this.f46814a.getDimensionPixelSize(id2)));
            } catch (Throwable th3) {
                Result.Companion companion3 = Result.INSTANCE;
                objM103844constructorimpl2 = Result.m103844constructorimpl(ResultKt.createFailure(th3));
            }
            objM103844constructorimpl = objM103844constructorimpl2;
        }
        Throwable thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl2 != null) {
            C44128b.m97270n("DynamicResources", "getDimensionPixelSize all failed, return 0: " + thM103847exceptionOrNullimpl2.getMessage());
            objM103844constructorimpl = 0;
        }
        return ((Number) objM103844constructorimpl).intValue();
    }

    @Override // android.content.res.Resources
    @RequiresApi(29)
    public float getFloat(int id2) {
        Object objM103844constructorimpl;
        Object objM103844constructorimpl2;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(Float.valueOf(super.getFloat(id2)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            try {
                C44128b.m97270n("DynamicResources", "getFloat fallback to baseRes: " + thM103847exceptionOrNullimpl.getMessage());
                objM103844constructorimpl2 = Result.m103844constructorimpl(Float.valueOf(this.f46814a.getFloat(id2)));
            } catch (Throwable th3) {
                Result.Companion companion3 = Result.INSTANCE;
                objM103844constructorimpl2 = Result.m103844constructorimpl(ResultKt.createFailure(th3));
            }
            objM103844constructorimpl = objM103844constructorimpl2;
        }
        Throwable thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl2 != null) {
            C44128b.m97270n("DynamicResources", "getFloat all failed, return 0f: " + thM103847exceptionOrNullimpl2.getMessage());
            objM103844constructorimpl = Float.valueOf(0.0f);
        }
        return ((Number) objM103844constructorimpl).floatValue();
    }

    @Override // android.content.res.Resources
    public float getFraction(int id2, int base, int pbase) {
        Object objM103844constructorimpl;
        Object objM103844constructorimpl2;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(Float.valueOf(super.getFraction(id2, base, pbase)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            try {
                C44128b.m97270n("DynamicResources", "getFraction fallback to baseRes: " + thM103847exceptionOrNullimpl.getMessage());
                objM103844constructorimpl2 = Result.m103844constructorimpl(Float.valueOf(this.f46814a.getFraction(id2, base, pbase)));
            } catch (Throwable th3) {
                Result.Companion companion3 = Result.INSTANCE;
                objM103844constructorimpl2 = Result.m103844constructorimpl(ResultKt.createFailure(th3));
            }
            objM103844constructorimpl = objM103844constructorimpl2;
        }
        Throwable thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl2 != null) {
            C44128b.m97270n("DynamicResources", "getFraction all failed, return 0f: " + thM103847exceptionOrNullimpl2.getMessage());
            objM103844constructorimpl = Float.valueOf(0.0f);
        }
        return ((Number) objM103844constructorimpl).floatValue();
    }

    @Override // android.content.res.Resources
    public int getInteger(int id2) {
        Object objM103844constructorimpl;
        Object objM103844constructorimpl2;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(Integer.valueOf(super.getInteger(id2)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            try {
                C44128b.m97270n("DynamicResources", "getInteger fallback to baseRes: " + thM103847exceptionOrNullimpl.getMessage());
                objM103844constructorimpl2 = Result.m103844constructorimpl(Integer.valueOf(this.f46814a.getInteger(id2)));
            } catch (Throwable th3) {
                Result.Companion companion3 = Result.INSTANCE;
                objM103844constructorimpl2 = Result.m103844constructorimpl(ResultKt.createFailure(th3));
            }
            objM103844constructorimpl = objM103844constructorimpl2;
        }
        Throwable thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl2 != null) {
            C44128b.m97270n("DynamicResources", "getInteger all failed, return 0: " + thM103847exceptionOrNullimpl2.getMessage());
            objM103844constructorimpl = 0;
        }
        return ((Number) objM103844constructorimpl).intValue();
    }

    /* JADX INFO: renamed from: i */
    public final String m57003i(String str, Object[] objArr) {
        String strM57001f = m57001f(str);
        try {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            String str2 = String.format(strM57001f, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            return str2;
        } catch (Exception e11) {
            int iM57000e = m57000e(strM57001f);
            List mutableList = ArraysKt.toMutableList(objArr);
            while (mutableList.size() < iM57000e) {
                mutableList.add("");
            }
            try {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                Object[] array = mutableList.toArray(new Object[0]);
                Object[] objArrCopyOf2 = Arrays.copyOf(array, array.length);
                String str3 = String.format(strM57001f, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
                Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                return str3;
            } catch (Exception unused) {
                C43846g.m96568c(new LangConfigMessage("getString(id,args) failed, format=" + str + ", error=" + e11.getMessage(), "DynamicResources", false, 4, null), null, 2, null);
                return str;
            }
        }
    }

    @Override // android.content.res.Resources
    @NotNull
    public String getString(int id2, @NotNull Object... formatArgs) {
        Object objM103844constructorimpl;
        Object objM103844constructorimpl2;
        String string;
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        try {
            Result.Companion companion = Result.INSTANCE;
            String resourceEntryName = this.f46814a.getResourceEntryName(id2);
            if (!Intrinsics.areEqual(this.f46814a.getResourcePackageName(id2), m57002g())) {
                String string2 = super.getString(id2, Arrays.copyOf(formatArgs, formatArgs.length));
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }
            C46943e c46943e = C46943e.f104811a;
            Intrinsics.checkNotNull(resourceEntryName);
            String strM103423e = c46943e.m103423e(resourceEntryName);
            if (strM103423e.length() > 0) {
                string = m57003i(C46942d.m103418b(strM103423e), formatArgs);
            } else {
                string = super.getString(id2, Arrays.copyOf(formatArgs, formatArgs.length));
                Intrinsics.checkNotNull(string);
            }
            objM103844constructorimpl = Result.m103844constructorimpl(string);
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                C44128b.m97270n("DynamicResources", "getString(id, args) failed, id=" + id2 + ", error=" + thM103847exceptionOrNullimpl.getMessage());
                C43846g.m96568c(new LangConfigMessage("getString(id,args) failed, id=" + id2 + ", error=" + thM103847exceptionOrNullimpl.getMessage(), "DynamicResources", false, 4, null), null, 2, null);
                try {
                    objM103844constructorimpl2 = Result.m103844constructorimpl(super.getString(id2, Arrays.copyOf(formatArgs, formatArgs.length)));
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM103844constructorimpl2 = Result.m103844constructorimpl(ResultKt.createFailure(th2));
                }
                if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl2) != null) {
                    objM103844constructorimpl2 = super.getString(id2);
                }
                Intrinsics.checkNotNullExpressionValue(objM103844constructorimpl2, "getOrElse(...)");
                objM103844constructorimpl = (String) objM103844constructorimpl2;
            }
            return (String) objM103844constructorimpl;
        } catch (Throwable th3) {
            Result.Companion companion3 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th3));
        }
    }
}
