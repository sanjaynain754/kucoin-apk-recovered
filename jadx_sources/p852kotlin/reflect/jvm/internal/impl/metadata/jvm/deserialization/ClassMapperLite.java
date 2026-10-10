package p852kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import androidx.exifinterface.media.ExifInterface;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.internal.ProgressionUtilKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import p852kotlin.text.Typography;

/* JADX INFO: compiled from: ClassMapperLite.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class ClassMapperLite {

    @NotNull
    public static final ClassMapperLite INSTANCE = new ClassMapperLite();

    /* JADX INFO: renamed from: kotlin, reason: collision with root package name */
    @NotNull
    private static final String f104853kotlin = CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new Character[]{'k', 'o', 't', 'l', 'i', 'n'}), "", null, null, 0, null, null, 62, null);

    @NotNull
    private static final Map<String, String> map;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listListOf = CollectionsKt.listOf((Object[]) new String[]{"Boolean", "Z", "Char", "C", "Byte", "B", "Short", ExifInterface.LATITUDE_SOUTH, "Int", "I", "Float", "F", "Long", "J", "Double", "D"});
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, listListOf.size() - 1, 2);
        if (progressionLastElement >= 0) {
            int i11 = 0;
            while (true) {
                StringBuilder sb2 = new StringBuilder();
                String str = f104853kotlin;
                sb2.append(str);
                sb2.append('/');
                sb2.append((String) listListOf.get(i11));
                int i12 = i11 + 1;
                linkedHashMap.put(sb2.toString(), listListOf.get(i12));
                linkedHashMap.put(str + '/' + ((String) listListOf.get(i11)) + "Array", '[' + ((String) listListOf.get(i12)));
                if (i11 == progressionLastElement) {
                    break;
                } else {
                    i11 += 2;
                }
            }
        }
        linkedHashMap.put(f104853kotlin + "/Unit", ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
        map$lambda$0$add(linkedHashMap, "Any", "java/lang/Object");
        map$lambda$0$add(linkedHashMap, "Nothing", "java/lang/Void");
        map$lambda$0$add(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : CollectionsKt.listOf((Object[]) new String[]{"String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum"})) {
            map$lambda$0$add(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : CollectionsKt.listOf((Object[]) new String[]{"Iterator", "Collection", "List", "Set", "Map", "ListIterator"})) {
            map$lambda$0$add(linkedHashMap, "collections/" + str3, "java/util/" + str3);
            map$lambda$0$add(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        map$lambda$0$add(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        map$lambda$0$add(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        map$lambda$0$add(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        map$lambda$0$add(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i13 = 0; i13 < 23; i13++) {
            StringBuilder sb3 = new StringBuilder();
            String str4 = f104853kotlin;
            sb3.append(str4);
            sb3.append("/jvm/functions/Function");
            sb3.append(i13);
            map$lambda$0$add(linkedHashMap, "Function" + i13, sb3.toString());
            map$lambda$0$add(linkedHashMap, "reflect/KFunction" + i13, str4 + "/reflect/KFunction");
        }
        for (String str5 : CollectionsKt.listOf((Object[]) new String[]{"Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum"})) {
            map$lambda$0$add(linkedHashMap, str5 + ".Companion", f104853kotlin + "/jvm/internal/" + str5 + "CompanionObject");
        }
        map = linkedHashMap;
    }

    private static final void map$lambda$0$add(Map<String, String> map2, String str, String str2) {
        map2.put(f104853kotlin + '/' + str, 'L' + str2 + ';');
    }

    @JvmStatic
    @NotNull
    public static final String mapClass(@NotNull String classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        String str = map.get(classId);
        if (str != null) {
            return str;
        }
        return 'L' + StringsKt.replace$default(classId, '.', Typography.dollar, false, 4, (Object) null) + ';';
    }

    private ClassMapperLite() {
    }
}
