package com.kubi.widget.web.file;

import androidx.webkit.internal.AssetHelper;
import com.jumio.core.constants.ConstantsKt;
import com.tencent.bugly.proguard.C33978va;
import java.net.URI;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.sequences.SequencesKt;
import p852kotlin.text.MatchResult;
import p852kotlin.text.Regex;
import p852kotlin.text.RegexOption;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.widget.web.file.r, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FileTypeResolver.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005J\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050 2\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\"J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050 2\b\u0010!\u001a\u0004\u0018\u00010\u0005J!\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050$2\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\"¢\u0006\u0002\u0010%J\u001c\u0010&\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\u00052\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fJ\u0010\u0010'\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005J\u0012\u0010)\u001a\u0004\u0018\u00010\u00052\b\u0010'\u001a\u0004\u0018\u00010\u0005J\u0012\u0010*\u001a\u0004\u0018\u00010\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005J\u0012\u0010+\u001a\u0004\u0018\u00010\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005J\u0018\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020\u00152\b\u0010.\u001a\u0004\u0018\u00010\u0005J\u0018\u0010/\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u00152\b\u0010.\u001a\u0004\u0018\u00010\u0005J\u0010\u00101\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0005H\u0002J\u0014\u00102\u001a\u0004\u0018\u00010\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u0002J\u0012\u00103\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u00104\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\fj\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000207X\u0082T¢\u0006\u0002\n\u0000¨\u00069"}, m90084d2 = {"Lcom/kubi/widget/web/file/FileTypeResolver;", "", "<init>", "()V", "DEFAULT_FILE_NAME", "", "BINARY_MIME", "encodedFileNameRegex", "Lkotlin/text/Regex;", "fileNameRegex", "controlCharactersRegex", "extensionToMime", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "supportedExtensions", "", "getSupportedExtensions", "()Ljava/util/Set;", "mimeToExtension", "", "resolve", "Lcom/kubi/widget/web/file/FileMetadata;", "url", "requestedFileName", "contentDisposition", "contentType", "preferRequestedFileName", "", "isSupported", "fileName", "mimeType", "normalizeFileTypes", "", "fileTypes", "", "mimeTypesFor", "", "(Ljava/util/Collection;)[Ljava/lang/String;", "isAllowedExtension", "extension", "allowedTypes", "mimeForExtension", "extensionForMime", "normalizeMime", "isResponseTypeCompatible", "expected", "responseContentType", "isSupportedRemoteType", "metadata", "isGenericMime", "contentDispositionFileName", "sanitizeFileName", "decodeUrlPart", "value", "MAX_FILE_NAME_LENGTH", "", "MAX_EXTENSION_LENGTH", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFileTypeResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTypeResolver.kt\ncom/kubi/widget/web/file/FileTypeResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,202:1\n1#2:203\n1#2:214\n1617#3,9:204\n1869#3:213\n1870#3:215\n1626#3:216\n1761#3,3:221\n1193#3,2:224\n1267#3,4:226\n37#4:217\n36#4,3:218\n*S KotlinDebug\n*F\n+ 1 FileTypeResolver.kt\ncom/kubi/widget/web/file/FileTypeResolver\n*L\n121#1:214\n121#1:204,9\n121#1:213\n121#1:215\n121#1:216\n126#1:221,3\n47#1:224,2\n47#1:226,4\n121#1:217\n121#1:218,3\n*E\n"})
public final class FileTypeResolver {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FileTypeResolver f55133a = new FileTypeResolver();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Regex f55134b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Regex f55135c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Regex f55136d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final LinkedHashMap<String, String> f55137e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Set<String> f55138f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final Map<String, String> f55139g;

    /* JADX INFO: renamed from: c */
    public final String m67216c(String str) {
        String string;
        List<String> groupValues;
        String str2;
        String string2;
        if (str != null && !StringsKt.isBlank(str)) {
            MatchResult matchResultFind$default = Regex.find$default(f55134b, str, 0, 2, null);
            String strTrim = (matchResultFind$default == null || (groupValues = matchResultFind$default.getGroupValues()) == null || (str2 = (String) CollectionsKt.getOrNull(groupValues, 1)) == null || (string2 = StringsKt.trim((CharSequence) str2).toString()) == null) ? null : StringsKt.trim(string2, '\"');
            if (strTrim != null && !StringsKt.isBlank(strTrim)) {
                return m67217d(strTrim);
            }
            MatchResult matchResultFind$default2 = Regex.find$default(f55135c, str, 0, 2, null);
            if (matchResultFind$default2 != null) {
                String str3 = matchResultFind$default2.getGroupValues().get(1);
                if (StringsKt.isBlank(str3)) {
                    str3 = matchResultFind$default2.getGroupValues().get(2);
                }
                String str4 = str3;
                if (str4 != null && (string = StringsKt.trim((CharSequence) str4).toString()) != null && string.length() > 0) {
                    return string;
                }
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public final String m67230s(@Nullable String str) {
        String strSubstringBefore$default;
        String string;
        if (str != null && (strSubstringBefore$default = StringsKt.substringBefore$default(str, ';', (String) null, 2, (Object) null)) != null && (string = StringsKt.trim((CharSequence) strSubstringBefore$default).toString()) != null) {
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = string.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (lowerCase != null && lowerCase.length() > 0) {
                return lowerCase;
            }
        }
        return null;
    }

    static {
        RegexOption regexOption = RegexOption.IGNORE_CASE;
        f55134b = new Regex("filename\\*\\s*=\\s*(?:UTF-8'')?([^;]+)", regexOption);
        f55135c = new Regex("filename\\s*=\\s*(?:\"([^\"]+)\"|([^;]+))", regexOption);
        f55136d = new Regex("[\\u0000-\\u001f]");
        LinkedHashMap<String, String> linkedHashMapLinkedMapOf = MapsKt.linkedMapOf(TuplesKt.m90091to("pdf", ConstantsKt.MIME_TYPE_PDF), TuplesKt.m90091to("txt", AssetHelper.DEFAULT_MIME_TYPE), TuplesKt.m90091to("doc", "application/msword"), TuplesKt.m90091to("docx", "application/vnd.openxmlformats-officedocument.wordprocessingml.document"), TuplesKt.m90091to("xls", "application/vnd.ms-excel"), TuplesKt.m90091to("xlsx", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"), TuplesKt.m90091to("ppt", "application/vnd.ms-powerpoint"), TuplesKt.m90091to("pptx", "application/vnd.openxmlformats-officedocument.presentationml.presentation"), TuplesKt.m90091to("jpg", "image/jpeg"), TuplesKt.m90091to("jpeg", "image/jpeg"), TuplesKt.m90091to("png", "image/png"));
        f55137e = linkedHashMapLinkedMapOf;
        Set<String> setKeySet = linkedHashMapLinkedMapOf.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
        f55138f = setKeySet;
        Set<Map.Entry<String, String>> setEntrySet = linkedHashMapLinkedMapOf.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Intrinsics.checkNotNull(entry);
            Object key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "component1(...)");
            Object value = entry.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "component2(...)");
            Pair pairM90091to = TuplesKt.m90091to((String) value, (String) key);
            linkedHashMap.put(pairM90091to.getFirst(), pairM90091to.getSecond());
        }
        Map<String, String> mutableMap = MapsKt.toMutableMap(linkedHashMap);
        mutableMap.put("image/jpg", "jpg");
        mutableMap.put("application/x-pdf", "pdf");
        mutableMap.put("application/x-msexcel", "xls");
        f55139g = mutableMap;
    }

    /* JADX INFO: renamed from: q */
    public static final String m67213q(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String strRemovePrefix = StringsKt.removePrefix(StringsKt.trim((CharSequence) it).toString(), (CharSequence) C33978va.f72339h);
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = strRemovePrefix.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    /* JADX INFO: renamed from: r */
    public static final boolean m67214r(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return f55138f.contains(it);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ FileMetadata m67215u(FileTypeResolver fileTypeResolver, String str, String str2, String str3, String str4, boolean z11, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            z11 = false;
        }
        return fileTypeResolver.m67231t(str, str2, str3, str4, z11);
    }

    /* JADX INFO: renamed from: d */
    public final String m67217d(String str) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(URLDecoder.decode(str, StandardCharsets.UTF_8.name()));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Object obj = str;
        if (!Result.m103850isFailureimpl(objM103844constructorimpl)) {
            obj = objM103844constructorimpl;
        }
        return (String) obj;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final String m67218e(@Nullable String str) {
        if (str == null) {
            str = "";
        }
        String strSubstringAfterLast = StringsKt.substringAfterLast(StringsKt.substringBefore$default(StringsKt.substringBefore$default(str, '?', (String) null, 2, (Object) null), '#', (String) null, 2, (Object) null), '.', "");
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = strSubstringAfterLast.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final String m67219f(@Nullable String str) {
        return f55139g.get(m67230s(str));
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final Set<String> m67220g() {
        return f55138f;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m67221h(@NotNull String extension, @NotNull Set<String> allowedTypes) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        Intrinsics.checkNotNullParameter(allowedTypes, "allowedTypes");
        if (allowedTypes.isEmpty() || allowedTypes.contains(extension)) {
            return true;
        }
        if (!SetsKt.setOf((Object[]) new String[]{"jpg", "jpeg"}).contains(extension) || allowedTypes.isEmpty()) {
            return false;
        }
        for (String str : allowedTypes) {
            if (Intrinsics.areEqual(str, "jpg") || Intrinsics.areEqual(str, "jpeg")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m67222i(String str) {
        return SetsKt.setOf((Object[]) new String[]{ConstantsKt.MIME_TYPE_OCTET_STREAM, "binary/octet-stream", "application/force-download"}).contains(str);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m67223j(@NotNull FileMetadata expected, @Nullable String str) {
        Intrinsics.checkNotNullParameter(expected, "expected");
        String strM67230s = m67230s(str);
        if (strM67230s == null || m67222i(strM67230s)) {
            return true;
        }
        String strM67226m = m67226m(expected.getExtension());
        if (strM67226m == null) {
            strM67226m = expected.getMimeType();
        }
        if (Intrinsics.areEqual(strM67230s, strM67226m)) {
            return true;
        }
        return SetsKt.setOf((Object[]) new String[]{"jpg", "jpeg"}).contains(expected.getExtension()) && SetsKt.setOf((Object[]) new String[]{"image/jpeg", "image/jpg"}).contains(strM67230s);
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public final String m67226m(@Nullable String str) {
        LinkedHashMap<String, String> linkedHashMap = f55137e;
        if (str == null) {
            str = "";
        }
        String strRemovePrefix = StringsKt.removePrefix(StringsKt.trim((CharSequence) str).toString(), (CharSequence) C33978va.f72339h);
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = strRemovePrefix.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return linkedHashMap.get(lowerCase);
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final List<String> m67228o(@Nullable String str) {
        return m67229p(str != null ? StringsKt.split$default((CharSequence) str, new char[]{','}, false, 0, 6, (Object) null) : null);
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final List<String> m67229p(@Nullable Collection<String> collection) {
        if (collection == null) {
            collection = CollectionsKt.emptyList();
        }
        return SequencesKt.toList(SequencesKt.distinct(SequencesKt.filter(SequencesKt.map(CollectionsKt.asSequence(collection), new Function1() { // from class: com.kubi.widget.web.file.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FileTypeResolver.m67213q((String) obj);
            }
        }), new Function1() { // from class: com.kubi.widget.web.file.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(FileTypeResolver.m67214r((String) obj));
            }
        })));
    }

    /* JADX INFO: renamed from: v */
    public final String m67232v(String str) {
        if (str == null) {
            str = "";
        }
        String str2 = null;
        String string = StringsKt.trim((CharSequence) f55136d.replace(StringsKt.substringAfterLast$default(StringsKt.substringAfterLast$default(str, '/', (String) null, 2, (Object) null), '\\', (String) null, 2, (Object) null), "")).toString();
        if (string.length() <= 0 || Intrinsics.areEqual(string, C33978va.f72339h) || Intrinsics.areEqual(string, "..")) {
            string = null;
        }
        if (string == null) {
            string = "download";
        }
        if (string.length() <= 180) {
            return string;
        }
        String strSubstringAfterLast = StringsKt.substringAfterLast(string, '.', "");
        int length = strSubstringAfterLast.length();
        if (1 > length || length >= 17) {
            strSubstringAfterLast = null;
        }
        if (strSubstringAfterLast != null) {
            str2 = '.' + strSubstringAfterLast;
        }
        String str3 = str2 != null ? str2 : "";
        return StringsKt.take(string, 180 - str3.length()) + str3;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m67224k(@Nullable String str, @Nullable String str2) {
        if (!f55138f.contains(m67218e(str)) && m67219f(str2) == null) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m67225l(@NotNull FileMetadata metadata, @Nullable String str) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        String strM67230s = m67230s(str);
        if (strM67230s != null && !m67222i(strM67230s)) {
            if (m67219f(strM67230s) != null) {
                return true;
            }
            return false;
        }
        return f55138f.contains(metadata.getExtension());
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final String[] m67227n(@Nullable Collection<String> collection) {
        List<String> listM67229p = m67229p(collection);
        if (listM67229p.isEmpty()) {
            listM67229p = CollectionsKt.toList(f55138f);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listM67229p.iterator();
        while (it.hasNext()) {
            String strM67226m = m67226m((String) it.next());
            if (strM67226m != null) {
                arrayList.add(strM67226m);
            }
        }
        return (String[]) CollectionsKt.distinct(arrayList).toArray(new String[0]);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0036  */
    /* JADX WARN: Code duplicated, block: B:37:0x007c  */
    /* JADX WARN: Code duplicated, block: B:38:0x007e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00eb  */
    @NotNull
    /* JADX INFO: renamed from: t */
    public final FileMetadata m67231t(@NotNull String url, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z11) {
        Object objM103844constructorimpl;
        String strM67217d;
        String strSubstringAfterLast$default;
        Intrinsics.checkNotNullParameter(url, "url");
        String strM67230s = m67230s(str3);
        String strM67216c = m67216c(str2);
        try {
            Result.Companion companion = Result.INSTANCE;
            String rawPath = new URI(url).getRawPath();
            if (rawPath != null && (strSubstringAfterLast$default = StringsKt.substringAfterLast$default(rawPath, '/', (String) null, 2, (Object) null)) != null) {
                if (strSubstringAfterLast$default.length() <= 0) {
                    strSubstringAfterLast$default = null;
                }
                if (strSubstringAfterLast$default != null) {
                    strM67217d = m67217d(strSubstringAfterLast$default);
                } else {
                    strM67217d = null;
                }
            } else {
                strM67217d = null;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(strM67217d);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        String strM67217d2 = (String) objM103844constructorimpl;
        if (strM67217d2 == null) {
            String strSubstringAfterLast$default2 = StringsKt.substringAfterLast$default(StringsKt.substringBefore$default(StringsKt.substringBefore$default(url, '?', (String) null, 2, (Object) null), '#', (String) null, 2, (Object) null), '/', (String) null, 2, (Object) null);
            if (strSubstringAfterLast$default2.length() <= 0) {
                strSubstringAfterLast$default2 = null;
            }
            if (strSubstringAfterLast$default2 != null) {
                strM67217d2 = m67217d(strSubstringAfterLast$default2);
            } else {
                strM67217d2 = null;
            }
        }
        if (z11) {
            if (str == null) {
                if (strM67216c == null) {
                    str = strM67217d2;
                } else {
                    str = strM67216c;
                }
            }
        } else if (strM67216c == null) {
            if (str == null) {
                str = strM67217d2;
            }
        } else {
            str = strM67216c;
        }
        String strM67232v = m67232v(str);
        String strM67218e = m67218e(strM67232v);
        if (!f55138f.contains(strM67218e)) {
            strM67218e = m67219f(strM67230s);
            if (strM67218e == null) {
                strM67218e = "";
            }
            if (strM67218e.length() > 0) {
                if (!Intrinsics.areEqual(strM67232v, "download") && StringsKt.contains$default((CharSequence) strM67232v, '.', false, 2, (Object) null)) {
                    strM67232v = StringsKt.substringBeforeLast$default(strM67232v, '.', (String) null, 2, (Object) null) + '.' + strM67218e;
                } else {
                    strM67232v = strM67232v + '.' + strM67218e;
                }
            }
        }
        if (strM67230s != null) {
            if (m67222i(strM67230s)) {
                strM67230s = null;
            }
            if (strM67230s == null) {
                strM67230s = m67226m(strM67218e);
                if (strM67230s == null) {
                    strM67230s = ConstantsKt.MIME_TYPE_OCTET_STREAM;
                }
            }
        } else {
            strM67230s = m67226m(strM67218e);
            if (strM67230s == null) {
                strM67230s = ConstantsKt.MIME_TYPE_OCTET_STREAM;
            }
        }
        return new FileMetadata(strM67232v, strM67218e, strM67230s);
    }
}
