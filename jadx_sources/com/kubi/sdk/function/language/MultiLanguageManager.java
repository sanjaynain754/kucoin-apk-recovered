package com.kubi.sdk.function.language;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import bz.InterfaceC4749e;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.blankj.utilcode.util.C5287o0;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.gson.reflect.TypeToken;
import com.kubi.router.core.Router;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.function.language.entity.LanguageEntity;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.utils.C27099x;
import com.kubi.utils.C27100x0;
import com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p813yy.C46612b;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.enums.EnumEntries;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: renamed from: com.kubi.sdk.function.language.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: MultiLanguageManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001>B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001b\u001a\u00020\u001cH\u0007J\b\u0010\u001d\u001a\u00020\u001cH\u0007J\u0006\u0010\u001e\u001a\u00020\u001cJ\u0006\u0010\u001f\u001a\u00020\u001cJ\r\u0010 \u001a\u00020!H\u0000¢\u0006\u0002\b\"J\u000e\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020\u0019J\u000e\u0010%\u001a\u00020!2\u0006\u0010$\u001a\u00020\u0019J\b\u0010&\u001a\u00020!H\u0002J\u0012\u0010'\u001a\u00020\u001c2\b\u0010(\u001a\u0004\u0018\u00010\u0005H\u0007J\u0018\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0005J\u0010\u0010-\u001a\u00020\f2\u0006\u0010*\u001a\u00020+H\u0002J\u000e\u0010.\u001a\u00020+2\u0006\u0010*\u001a\u00020+J\u0010\u0010/\u001a\u00020!2\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u00100\u001a\u00020+2\u0006\u0010*\u001a\u00020+H\u0002J\u0014\u00101\u001a\u00020\u001c2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u001303J\u000e\u00104\u001a\u00020!2\u0006\u0010*\u001a\u00020+JC\u00105\u001a\u0002H6\"\u0006\b\u0000\u00107\u0018\u0001\"\u0004\b\u0001\u001062\u0017\u00108\u001a\u0013\u0012\u0004\u0012\u0002H7\u0012\u0004\u0012\u0002H609¢\u0006\u0002\b:2\f\u0010;\u001a\b\u0012\u0004\u0012\u0002H60<H\u0082\b¢\u0006\u0002\u0010=R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001a\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006?"}, m90084d2 = {"Lcom/kubi/sdk/function/language/MultiLanguageManager;", "", "<init>", "()V", "LANGUAGE_CATEGORY", "", "KEY_CACHE_LANGUAGE_LIST", "KEY_DEFAULT_LANGUAGE", "languageListSid", "Lcom/kubi/utils/storage/StorageId;", "defaultLanguageSid", "defaultLanguage", "Lcom/kubi/sdk/function/language/LanguageType;", "getDefaultLanguage", "()Lcom/kubi/sdk/function/language/LanguageType;", "setDefaultLanguage", "(Lcom/kubi/sdk/function/language/LanguageType;)V", "supportLanguages", "", "Lcom/kubi/sdk/function/language/entity/LanguageEntity;", "getSupportLanguages", "()Ljava/util/List;", "LANGUAGE_TYPE", "listeners", "", "Lcom/kubi/sdk/function/language/MultiLanguageManager$OnLanguageChangeListener;", "currentLanguageType", "isCn", "", "isZh", "isTH", "isTR", "initPresentLanguage", "", "initPresentLanguage$LLanguage_googleRelease", "addOnLanguageChangeListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeOnLanguageChangeListener", "callLanguageChange", "setLanguageByLocal", ImagesContract.LOCAL, "saveLanguage", "context", "Landroid/content/Context;", "language", "getLanguageLocale", "updateResources", "setApplicationLanguage", "getApplicationContext", "updateLanguageList", LanguageSelectionViewModel.ARG_LANGS, "", "onConfigurationChanged", "flavor", "R", "F", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "default", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "OnLanguageChangeListener", "LLanguage_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMultiLanguageManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiLanguageManager.kt\ncom/kubi/sdk/function/language/MultiLanguageManager\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 JsonEx.kt\ncom/kubi/utils/extensions/JsonExKt\n+ 4 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 7 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,331:1\n327#1,2:332\n327#1,2:343\n32#2:334\n32#2:335\n23#2,2:399\n32#2:404\n23#2,2:405\n57#3,2:336\n25#3:338\n59#3,3:340\n35#3,3:401\n149#4:339\n1563#5:345\n1634#5,3:346\n1563#5:349\n1634#5,3:350\n1563#5:353\n1634#5,3:354\n295#5,2:397\n37#6:357\n36#6,3:358\n39#7,12:361\n39#7,12:373\n39#7,12:385\n*S KotlinDebug\n*F\n+ 1 MultiLanguageManager.kt\ncom/kubi/sdk/function/language/MultiLanguageManager\n*L\n88#1:332,2\n98#1:343,2\n88#1:334\n93#1:335\n283#1:399,2\n293#1:404\n299#1:405,2\n93#1:336,2\n93#1:338\n93#1:340,3\n292#1:401,3\n93#1:339\n101#1:345\n101#1:346,3\n107#1:349\n107#1:350,3\n107#1:353\n107#1:354,3\n277#1:397,2\n147#1:357\n147#1:358,3\n167#1:361,12\n193#1:373,12\n207#1:385,12\n*E\n"})
public final class MultiLanguageManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final MultiLanguageManager f46805a = new MultiLanguageManager();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final StorageId<String> f46806b = new StorageId<>("language", "cache_language_list", null, false, 12, null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final StorageId<String> f46807c = new StorageId<>("language", "default_language", null, false, 12, null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static LanguageType f46808d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final List<LanguageEntity> f46809e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Set<a> f46810f;

    /* JADX INFO: renamed from: g */
    @JvmField
    @NotNull
    public static LanguageType f46811g;

    /* JADX INFO: renamed from: com.kubi.sdk.function.language.a$a */
    /* JADX INFO: compiled from: MultiLanguageManager.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/sdk/function/language/MultiLanguageManager$OnLanguageChangeListener;", "", "onLanguageChange", "", "language", "Lcom/kubi/sdk/function/language/LanguageType;", "LLanguage_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface a {
        void onLanguageChange(@NotNull LanguageType language);
    }

    /* JADX INFO: renamed from: com.kubi.sdk.function.language.a$b */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0004"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/utils/extensions/JsonExKt$parseJson$$inlined$fromJson$1", "com/kubi/utils/extensions/JsonExKt$toEntity$lambda$1$$inlined$parseJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,300:1\n*E\n"})
    public static final class b extends TypeToken<List<? extends LanguageEntity>> {
    }

    static {
        LanguageType languageType = LanguageType.ENGLISH;
        f46808d = languageType;
        f46809e = new ArrayList();
        f46810f = new HashSet();
        f46811g = languageType;
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final boolean m56979h() {
        return Intrinsics.areEqual(f46811g.getLocale(), Locale.CHINA);
    }

    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final boolean m56980j() {
        return Intrinsics.areEqual(f46811g.getLocale(), Locale.CHINA) || Intrinsics.areEqual("HK", f46811g.getLocale().getCountry());
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m56982q() {
        C43846g.m96571f("LANGUAGE", f46811g.getLocalString());
        return Unit.INSTANCE;
    }

    public final void addOnLanguageChangeListener(@NotNull a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Set<a> set = f46810f;
        synchronized (set) {
            set.add(listener);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m56983b() {
        Set<a> set = f46810f;
        synchronized (set) {
            try {
                Iterator<a> it = set.iterator();
                while (it.hasNext()) {
                    it.next().onLanguageChange(f46811g);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final LanguageType m56985d() {
        return f46808d;
    }

    /* JADX INFO: renamed from: e */
    public final LanguageType m56986e(Context context) {
        String string = context.getSharedPreferences(MultiLanguageManager.class.getName(), 0).getString("language_type", "");
        if (string != null && string.length() != 0) {
            return LanguageType.INSTANCE.toLanguageType(string, f46808d);
        }
        String language = C46612b.f104366a.m102772a().getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String lowerCase = language.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        LanguageType languageType = LanguageType.HONGKONG;
        String language2 = languageType.getLocale().getLanguage();
        Intrinsics.checkNotNullExpressionValue(language2, "getLanguage(...)");
        Locale locale2 = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale2, "getDefault(...)");
        String lowerCase2 = language2.toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        if (Intrinsics.areEqual(lowerCase, lowerCase2)) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(MultiLanguageManager.class.getName(), 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString("language_type", languageType.getLocalString());
            editorEdit.apply();
            return languageType;
        }
        for (LanguageEntity languageEntity : f46809e) {
            C46612b c46612b = C46612b.f104366a;
            String language3 = c46612b.m102772a().getLanguage();
            Intrinsics.checkNotNullExpressionValue(language3, "getLanguage(...)");
            Locale locale3 = Locale.ROOT;
            String lowerCase3 = language3.toLowerCase(locale3);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
            String language4 = c46612b.m102774c(languageEntity.getType()).getLanguage();
            Intrinsics.checkNotNullExpressionValue(language4, "getLanguage(...)");
            String lowerCase4 = language4.toLowerCase(locale3);
            Intrinsics.checkNotNullExpressionValue(lowerCase4, "toLowerCase(...)");
            if (Intrinsics.areEqual(lowerCase3, lowerCase4)) {
                LanguageType languageType$default = LanguageType.Companion.toLanguageType$default(LanguageType.INSTANCE, languageEntity, (LanguageType) null, 1, (Object) null);
                SharedPreferences sharedPreferences2 = context.getSharedPreferences(MultiLanguageManager.class.getName(), 0);
                Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "getSharedPreferences(...)");
                SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                editorEdit2.putString("language_type", languageType$default.getLocalString());
                editorEdit2.apply();
                return languageType$default;
            }
        }
        return f46808d;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final List<LanguageEntity> m56987f() {
        return f46809e;
    }

    /* JADX INFO: renamed from: g */
    public final void m56988g() {
        String strMo4787b;
        Object objM103844constructorimpl;
        Set<String> setEmptySet;
        LanguageType.Companion companion = LanguageType.INSTANCE;
        StorageId<String> storageId = f46807c;
        Object objM56186h = Router.f46192a.m56186h(InterfaceC4749e.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h == null || (strMo4787b = ((InterfaceC4749e) objM56186h).mo4787b()) == null) {
            strMo4787b = "";
        }
        f46808d = LanguageType.Companion.toLanguageType$default(companion, C46392a.m102326h(storageId, strMo4787b), (LanguageType) null, 1, (Object) null);
        String strM102326h = C46392a.m102326h(f46806b, "");
        try {
            Result.Companion companion2 = Result.INSTANCE;
            C27099x c27099x = C27099x.f54458a;
            objM103844constructorimpl = Result.m103844constructorimpl(C27099x.m66914d(strM102326h, new b().getType()));
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C44128b.m97262f(JPushConstants.Analysis.KEY_JSON, "数据转换失败", thM103847exceptionOrNullimpl);
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        List list = (List) objM103844constructorimpl;
        if (list != null && !list.isEmpty()) {
            f46809e.addAll(list);
            return;
        }
        Object objM56186h2 = Router.f46192a.m56186h(InterfaceC4749e.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h2 == null || (setEmptySet = ((InterfaceC4749e) objM56186h2).mo4786a()) == null) {
            setEmptySet = SetsKt.emptySet();
        }
        if (setEmptySet.isEmpty()) {
            List<LanguageEntity> list2 = f46809e;
            EnumEntries<LanguageType> entries = LanguageType.getEntries();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(entries, 10));
            for (LanguageType languageType : entries) {
                arrayList.add(new LanguageEntity(languageType.getLocalString(), languageType.getLanguage(), null, 4, null));
            }
            list2.addAll(arrayList);
            return;
        }
        List<LanguageEntity> list3 = f46809e;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(setEmptySet, 10));
        Iterator<T> it = setEmptySet.iterator();
        while (it.hasNext()) {
            arrayList2.add(LanguageType.Companion.toLanguageType$default(LanguageType.INSTANCE, (String) it.next(), (LanguageType) null, 1, (Object) null));
        }
        List<LanguageType> listDistinct = CollectionsKt.distinct(arrayList2);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listDistinct, 10));
        for (LanguageType languageType2 : listDistinct) {
            arrayList3.add(new LanguageEntity(languageType2.getLocalString(), languageType2.getLanguage(), null, 4, null));
        }
        list3.addAll(arrayList3);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m56989i() {
        return f46811g == LanguageType.f46798TH;
    }

    /* JADX INFO: renamed from: k */
    public final void m56990k(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        m56994p(context);
        m56992m(context);
    }

    /* JADX INFO: renamed from: l */
    public final void m56991l(@NotNull Context context, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences(MultiLanguageManager.class.getName(), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString("language_type", str);
        editorEdit.apply();
        m56992m(context);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005a  */
    /* JADX INFO: renamed from: o */
    public final boolean m56993o(@NotNull List<LanguageEntity> languages) {
        Object next;
        boolean z11;
        boolean z12;
        Intrinsics.checkNotNullParameter(languages, "languages");
        Iterator<T> it = languages.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((LanguageEntity) next).getIsDefault(), Boolean.TRUE));
        LanguageEntity languageEntity = (LanguageEntity) next;
        if (languageEntity == null || Intrinsics.areEqual(f46808d.getLocalString(), languageEntity.getType())) {
            z11 = false;
        } else {
            f46808d = LanguageType.Companion.toLanguageType$default(LanguageType.INSTANCE, languageEntity, (LanguageType) null, 1, (Object) null);
            StorageId<String> storageId = f46807c;
            String type = languageEntity.getType();
            if (type == null) {
                type = "";
            }
            C46392a.m102333p(storageId, type);
            z11 = true;
        }
        if (languages.isEmpty()) {
            z12 = false;
        } else {
            String strM66919i = C27099x.m66919i(languages, false, 2, null);
            if (strM66919i == null) {
                strM66919i = "";
            }
            StorageId<String> storageId2 = f46806b;
            if (Intrinsics.areEqual(strM66919i, C46392a.m102326h(storageId2, ""))) {
                z12 = false;
            } else {
                List<LanguageEntity> list = f46809e;
                list.clear();
                list.addAll(languages);
                C46392a.m102333p(storageId2, strM66919i);
                z12 = true;
            }
        }
        return z11 || z12;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final Context m56994p(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        LanguageType languageTypeM56986e = m56986e(context);
        f46811g = languageTypeM56986e;
        Locale locale = languageTypeM56986e.getLocale();
        C27100x0.m66923d(new Function0() { // from class: yy.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MultiLanguageManager.m56982q();
            }
        });
        Locale.setDefault(locale);
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(locale);
        Context contextCreateConfigurationContext = context.createConfigurationContext(configuration);
        Intrinsics.checkNotNullExpressionValue(contextCreateConfigurationContext, "createConfigurationContext(...)");
        return contextCreateConfigurationContext;
    }

    public final void removeOnLanguageChangeListener(@NotNull a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Set<a> set = f46810f;
        synchronized (set) {
            set.remove(listener);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: n */
    public static final boolean m56981n(@Nullable String str) {
        if (!TextUtils.isEmpty(str) && !Intrinsics.areEqual(f46811g.getLocalString(), str)) {
            int length = LanguageType.getEntries().toArray(new LanguageType[0]).length;
            for (int i11 = 0; i11 < length; i11++) {
                if (Intrinsics.areEqual(LanguageType.getEntries().get(i11).getLocalString(), str)) {
                    if (Intrinsics.areEqual(str, f46811g.getLocalString())) {
                        break;
                    }
                    MultiLanguageManager multiLanguageManager = f46805a;
                    Application applicationM6331a = C5287o0.m6331a();
                    Intrinsics.checkNotNullExpressionValue(applicationM6331a, "getApp(...)");
                    multiLanguageManager.m56991l(applicationM6331a, str);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final Context m56984c(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return context;
        }
        return applicationContext;
    }

    /* JADX INFO: renamed from: m */
    public final void m56992m(Context context) {
        Resources resources = m56984c(context).getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        Configuration configuration = resources.getConfiguration();
        LanguageType languageTypeM56986e = m56986e(context);
        f46811g = languageTypeM56986e;
        Locale locale = languageTypeM56986e.getLocale();
        configuration.locale = locale;
        LocaleList localeList = new LocaleList(locale);
        LocaleList.setDefault(localeList);
        configuration.setLocales(localeList);
        m56984c(context).createConfigurationContext(configuration);
        Locale.setDefault(locale);
        resources.updateConfiguration(configuration, displayMetrics);
        m56983b();
    }
}
