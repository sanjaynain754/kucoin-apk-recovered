package p852kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IndexedValue;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import p852kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import p852kotlin.text.StringsKt;
import p852kotlin.text.Typography;

/* JADX INFO: compiled from: JvmNameResolverBase.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nJvmNameResolverBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmNameResolverBase.kt\norg/jetbrains/kotlin/metadata/jvm/deserialization/JvmNameResolverBase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,106:1\n1222#2,2:107\n1252#2,4:109\n*S KotlinDebug\n*F\n+ 1 JvmNameResolverBase.kt\norg/jetbrains/kotlin/metadata/jvm/deserialization/JvmNameResolverBase\n*L\n101#1:107,2\n101#1:109,4\n*E\n"})
public class JvmNameResolverBase implements NameResolver {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final List<String> PREDEFINED_STRINGS;

    @NotNull
    private static final Map<String, Integer> PREDEFINED_STRINGS_MAP;

    /* JADX INFO: renamed from: kotlin, reason: collision with root package name */
    @NotNull
    private static final String f104854kotlin;

    @NotNull
    private final Set<Integer> localNameIndices;

    @NotNull
    private final List<JvmProtoBuf.StringTableTypes.Record> records;

    @NotNull
    private final String[] strings;

    /* JADX INFO: compiled from: JvmNameResolverBase.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        String strJoinToString$default = CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new Character[]{'k', 'o', 't', 'l', 'i', 'n'}), "", null, null, 0, null, null, 62, null);
        f104854kotlin = strJoinToString$default;
        List<String> listListOf = CollectionsKt.listOf((Object[]) new String[]{strJoinToString$default + "/Any", strJoinToString$default + "/Nothing", strJoinToString$default + "/Unit", strJoinToString$default + "/Throwable", strJoinToString$default + "/Number", strJoinToString$default + "/Byte", strJoinToString$default + "/Double", strJoinToString$default + "/Float", strJoinToString$default + "/Int", strJoinToString$default + "/Long", strJoinToString$default + "/Short", strJoinToString$default + "/Boolean", strJoinToString$default + "/Char", strJoinToString$default + "/CharSequence", strJoinToString$default + "/String", strJoinToString$default + "/Comparable", strJoinToString$default + "/Enum", strJoinToString$default + "/Array", strJoinToString$default + "/ByteArray", strJoinToString$default + "/DoubleArray", strJoinToString$default + "/FloatArray", strJoinToString$default + "/IntArray", strJoinToString$default + "/LongArray", strJoinToString$default + "/ShortArray", strJoinToString$default + "/BooleanArray", strJoinToString$default + "/CharArray", strJoinToString$default + "/Cloneable", strJoinToString$default + "/Annotation", strJoinToString$default + "/collections/Iterable", strJoinToString$default + "/collections/MutableIterable", strJoinToString$default + "/collections/Collection", strJoinToString$default + "/collections/MutableCollection", strJoinToString$default + "/collections/List", strJoinToString$default + "/collections/MutableList", strJoinToString$default + "/collections/Set", strJoinToString$default + "/collections/MutableSet", strJoinToString$default + "/collections/Map", strJoinToString$default + "/collections/MutableMap", strJoinToString$default + "/collections/Map.Entry", strJoinToString$default + "/collections/MutableMap.MutableEntry", strJoinToString$default + "/collections/Iterator", strJoinToString$default + "/collections/MutableIterator", strJoinToString$default + "/collections/ListIterator", strJoinToString$default + "/collections/MutableListIterator"});
        PREDEFINED_STRINGS = listListOf;
        Iterable<IndexedValue> iterableWithIndex = CollectionsKt.withIndex(listListOf);
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterableWithIndex, 10)), 16));
        for (IndexedValue indexedValue : iterableWithIndex) {
            linkedHashMap.put((String) indexedValue.getValue(), Integer.valueOf(indexedValue.getIndex()));
        }
        PREDEFINED_STRINGS_MAP = linkedHashMap;
    }

    /* JADX INFO: compiled from: JvmNameResolverBase.kt */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JvmProtoBuf.StringTableTypes.Record.Operation.values().length];
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.DESC_TO_CLASS_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0032  */
    @Override // p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    @NotNull
    public String getString(int i11) {
        String strSubstring;
        JvmProtoBuf.StringTableTypes.Record record = this.records.get(i11);
        if (record.hasString()) {
            strSubstring = record.getString();
        } else if (record.hasPredefinedIndex()) {
            List<String> list = PREDEFINED_STRINGS;
            int size = list.size();
            int predefinedIndex = record.getPredefinedIndex();
            if (predefinedIndex < 0 || predefinedIndex >= size) {
                strSubstring = this.strings[i11];
            } else {
                strSubstring = list.get(record.getPredefinedIndex());
            }
        } else {
            strSubstring = this.strings[i11];
        }
        if (record.getSubstringIndexCount() >= 2) {
            List<Integer> substringIndexList = record.getSubstringIndexList();
            Intrinsics.checkNotNull(substringIndexList);
            Integer num = substringIndexList.get(0);
            Integer num2 = substringIndexList.get(1);
            if (num.intValue() >= 0 && num.intValue() <= num2.intValue() && num2.intValue() <= strSubstring.length()) {
                Intrinsics.checkNotNull(strSubstring);
                Intrinsics.checkNotNull(num);
                int iIntValue = num.intValue();
                Intrinsics.checkNotNull(num2);
                strSubstring = strSubstring.substring(iIntValue, num2.intValue());
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            }
        }
        String strReplace$default = strSubstring;
        if (record.getReplaceCharCount() >= 2) {
            List<Integer> replaceCharList = record.getReplaceCharList();
            Intrinsics.checkNotNull(replaceCharList);
            Integer num3 = replaceCharList.get(0);
            Integer num4 = replaceCharList.get(1);
            Intrinsics.checkNotNull(strReplace$default);
            strReplace$default = StringsKt.replace$default(strReplace$default, (char) num3.intValue(), (char) num4.intValue(), false, 4, (Object) null);
        }
        String strReplace$default2 = strReplace$default;
        JvmProtoBuf.StringTableTypes.Record.Operation operation = record.getOperation();
        if (operation == null) {
            operation = JvmProtoBuf.StringTableTypes.Record.Operation.NONE;
        }
        int i12 = WhenMappings.$EnumSwitchMapping$0[operation.ordinal()];
        if (i12 != 1) {
            if (i12 == 2) {
                Intrinsics.checkNotNull(strReplace$default2);
                strReplace$default2 = StringsKt.replace$default(strReplace$default2, Typography.dollar, '.', false, 4, (Object) null);
            } else {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (strReplace$default2.length() >= 2) {
                    Intrinsics.checkNotNull(strReplace$default2);
                    strReplace$default2 = strReplace$default2.substring(1, strReplace$default2.length() - 1);
                    Intrinsics.checkNotNullExpressionValue(strReplace$default2, "substring(...)");
                }
                String str = strReplace$default2;
                Intrinsics.checkNotNull(str);
                strReplace$default2 = StringsKt.replace$default(str, Typography.dollar, '.', false, 4, (Object) null);
            }
        }
        Intrinsics.checkNotNull(strReplace$default2);
        return strReplace$default2;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public boolean isLocalClassName(int i11) {
        return this.localNameIndices.contains(Integer.valueOf(i11));
    }

    public JvmNameResolverBase(@NotNull String[] strings, @NotNull Set<Integer> localNameIndices, @NotNull List<JvmProtoBuf.StringTableTypes.Record> records) {
        Intrinsics.checkNotNullParameter(strings, "strings");
        Intrinsics.checkNotNullParameter(localNameIndices, "localNameIndices");
        Intrinsics.checkNotNullParameter(records, "records");
        this.strings = strings;
        this.localNameIndices = localNameIndices;
        this.records = records;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    @NotNull
    public String getQualifiedClassName(int i11) {
        return getString(i11);
    }
}
