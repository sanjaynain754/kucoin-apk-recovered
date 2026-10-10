package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
final class SchemaUtil {
    private static final int DEFAULT_LOOK_UP_START_NUMBER = 40;
    private static final Class<?> GENERATED_MESSAGE_CLASS = getGeneratedMessageClass();
    private static final UnknownFieldSchema<?, ?> UNKNOWN_FIELD_SET_FULL_SCHEMA = getUnknownFieldSetSchema();
    private static final UnknownFieldSchema<?, ?> UNKNOWN_FIELD_SET_LITE_SCHEMA = new UnknownFieldSetLiteSchema();

    public static int computeSizeGroupList(int i11, List<MessageLite> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeGroupSize = 0;
        for (int i12 = 0; i12 < size; i12++) {
            iComputeGroupSize += CodedOutputStream.computeGroupSize(i11, list.get(i12));
        }
        return iComputeGroupSize;
    }

    public static int computeSizeMessageList(int i11, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = CodedOutputStream.computeTagSize(i11) * size;
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            iComputeTagSize += obj instanceof LazyFieldLite ? CodedOutputStream.computeLazyFieldSizeNoTag((LazyFieldLite) obj) : CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj);
        }
        return iComputeTagSize;
    }

    @CanIgnoreReturnValue
    public static <UT, UB> UB filterUnknownEnumList(Object obj, int i11, List<Integer> list, Internal.EnumLiteMap<?> enumLiteMap, UB ub2, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (enumLiteMap == null) {
            return ub2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (enumLiteMap.findValueByNumber(iIntValue) == null) {
                    ub2 = (UB) storeUnknownEnum(obj, i11, iIntValue, ub2, unknownFieldSchema);
                    it.remove();
                }
            }
            return ub2;
        }
        int size = list.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            Integer num = list.get(i13);
            int iIntValue2 = num.intValue();
            if (enumLiteMap.findValueByNumber(iIntValue2) != null) {
                if (i13 != i12) {
                    list.set(i12, num);
                }
                i12++;
            } else {
                ub2 = (UB) storeUnknownEnum(obj, i11, iIntValue2, ub2, unknownFieldSchema);
            }
        }
        if (i12 != size) {
            list.subList(i12, size).clear();
        }
        return ub2;
    }

    private static UnknownFieldSchema<?, ?> getUnknownFieldSetSchema() {
        try {
            Class<?> unknownFieldSetSchemaClass = getUnknownFieldSetSchemaClass();
            if (unknownFieldSetSchemaClass == null) {
                return null;
            }
            return (UnknownFieldSchema) unknownFieldSetSchemaClass.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean shouldUseTableSwitch(int i11, int i12, int i13) {
        if (i12 < 40) {
            return true;
        }
        long j11 = ((long) i12) - ((long) i11);
        long j12 = i13;
        return j11 + 10 <= ((2 * j12) + 3) + ((j12 + 3) * 3);
    }

    public static void writeGroupList(int i11, List<?> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeGroupList(i11, list);
    }

    public static void writeMessageList(int i11, List<?> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeMessageList(i11, list);
    }

    public static int computeSizeMessage(int i11, Object obj, Schema schema) {
        return obj instanceof LazyFieldLite ? CodedOutputStream.computeLazyFieldSize(i11, (LazyFieldLite) obj) : CodedOutputStream.computeMessageSize(i11, (MessageLite) obj, schema);
    }

    private static Class<?> getGeneratedMessageClass() {
        if (Protobuf.assumeLiteRuntime) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Object getMapDefaultEntry(Class<?> cls, String str) {
        try {
            java.lang.reflect.Field[] declaredFields = Class.forName(cls.getName() + "$" + toCamelCase(str, true) + "DefaultEntryHolder").getDeclaredFields();
            if (declaredFields.length == 1) {
                return UnsafeUtil.getStaticObject(declaredFields[0]);
            }
            throw new IllegalStateException("Unable to look up map field default entry holder class for " + str + " in " + cls.getName());
        } catch (Throwable th2) {
            throw new RuntimeException(th2);
        }
    }

    private static Class<?> getUnknownFieldSetSchemaClass() {
        if (Protobuf.assumeLiteRuntime) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void requireGeneratedMessage(Class<?> cls) {
        Class<?> cls2;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && !Protobuf.assumeLiteRuntime && (cls2 = GENERATED_MESSAGE_CLASS) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean safeEquals(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static boolean shouldUseTableSwitch(FieldInfo[] fieldInfoArr) {
        if (fieldInfoArr.length == 0) {
            return false;
        }
        return shouldUseTableSwitch(fieldInfoArr[0].getFieldNumber(), fieldInfoArr[fieldInfoArr.length - 1].getFieldNumber(), fieldInfoArr.length);
    }

    @CanIgnoreReturnValue
    public static <UT, UB> UB storeUnknownEnum(Object obj, int i11, int i12, UB ub2, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (ub2 == null) {
            ub2 = unknownFieldSchema.getBuilderFromMessage(obj);
        }
        unknownFieldSchema.addVarint(ub2, i11, i12);
        return ub2;
    }

    public static String toCamelCase(String str, boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if ('a' > cCharAt || cCharAt > 'z') {
                if ('A' > cCharAt || cCharAt > 'Z') {
                    if ('0' <= cCharAt && cCharAt <= '9') {
                        sb2.append(cCharAt);
                    }
                    z11 = true;
                } else if (i11 != 0 || z11) {
                    sb2.append(cCharAt);
                } else {
                    sb2.append((char) (cCharAt + ' '));
                }
            } else if (z11) {
                sb2.append((char) (cCharAt - ' '));
            } else {
                sb2.append(cCharAt);
            }
            z11 = false;
        }
        return sb2.toString();
    }

    public static UnknownFieldSchema<?, ?> unknownFieldSetFullSchema() {
        return UNKNOWN_FIELD_SET_FULL_SCHEMA;
    }

    public static UnknownFieldSchema<?, ?> unknownFieldSetLiteSchema() {
        return UNKNOWN_FIELD_SET_LITE_SCHEMA;
    }

    public static void writeBool(int i11, boolean z11, Writer writer) throws IOException {
        if (z11) {
            writer.writeBool(i11, true);
        }
    }

    public static void writeBoolList(int i11, List<Boolean> list, Writer writer, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeBoolList(i11, list, z11);
    }

    public static void writeBytes(int i11, ByteString byteString, Writer writer) throws IOException {
        if (byteString == null || byteString.isEmpty()) {
            return;
        }
        writer.writeBytes(i11, byteString);
    }

    public static void writeBytesList(int i11, List<ByteString> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeBytesList(i11, list);
    }

    public static void writeDoubleList(int i11, List<Double> list, Writer writer, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeDoubleList(i11, list, z11);
    }

    public static void writeEnum(int i11, int i12, Writer writer) throws IOException {
        if (i12 != 0) {
            writer.writeEnum(i11, i12);
        }
    }

    public static void writeEnumList(int i11, List<Integer> list, Writer writer, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeEnumList(i11, list, z11);
    }

    public static void writeFixed32(int i11, int i12, Writer writer) throws IOException {
        if (i12 != 0) {
            writer.writeFixed32(i11, i12);
        }
    }

    public static void writeFixed32List(int i11, List<Integer> list, Writer writer, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeFixed32List(i11, list, z11);
    }

    public static void writeFixed64(int i11, long j11, Writer writer) throws IOException {
        if (j11 != 0) {
            writer.writeFixed64(i11, j11);
        }
    }

    public static void writeFixed64List(int i11, List<Long> list, Writer writer, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeFixed64List(i11, list, z11);
    }

    public static void writeFloatList(int i11, List<Float> list, Writer writer, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeFloatList(i11, list, z11);
    }

    public static void writeInt32(int i11, int i12, Writer writer) throws IOException {
        if (i12 != 0) {
            writer.writeInt32(i11, i12);
        }
    }

    public static void writeInt32List(int i11, List<Integer> list, Writer writer, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeInt32List(i11, list, z11);
    }

    public static void writeInt64(int i11, long j11, Writer writer) throws IOException {
        if (j11 != 0) {
            writer.writeInt64(i11, j11);
        }
    }

    public static void writeInt64List(int i11, List<Long> list, Writer writer, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeInt64List(i11, list, z11);
    }

    public static void writeLazyFieldList(int i11, List<?> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            ((LazyFieldLite) it.next()).writeTo(writer, i11);
        }
    }

    public static void writeMessage(int i11, Object obj, Writer writer) throws IOException {
        if (obj != null) {
            writer.writeMessage(i11, obj);
        }
    }

    public static void writeSFixed32(int i11, int i12, Writer writer) throws IOException {
        if (i12 != 0) {
            writer.writeSFixed32(i11, i12);
        }
    }

    public static void writeSFixed32List(int i11, List<Integer> list, Writer writer, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSFixed32List(i11, list, z11);
    }

    public static void writeSFixed64(int i11, long j11, Writer writer) throws IOException {
        if (j11 != 0) {
            writer.writeSFixed64(i11, j11);
        }
    }

    public static void writeSFixed64List(int i11, List<Long> list, Writer writer, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSFixed64List(i11, list, z11);
    }

    public static void writeSInt32(int i11, int i12, Writer writer) throws IOException {
        if (i12 != 0) {
            writer.writeSInt32(i11, i12);
        }
    }

    public static void writeSInt32List(int i11, List<Integer> list, Writer writer, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSInt32List(i11, list, z11);
    }

    public static void writeSInt64(int i11, long j11, Writer writer) throws IOException {
        if (j11 != 0) {
            writer.writeSInt64(i11, j11);
        }
    }

    public static void writeSInt64List(int i11, List<Long> list, Writer writer, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSInt64List(i11, list, z11);
    }

    public static void writeString(int i11, Object obj, Writer writer) throws IOException {
        if (obj instanceof String) {
            writeStringInternal(i11, (String) obj, writer);
        } else {
            writeBytes(i11, (ByteString) obj, writer);
        }
    }

    private static void writeStringInternal(int i11, String str, Writer writer) throws IOException {
        if (str == null || str.isEmpty()) {
            return;
        }
        writer.writeString(i11, str);
    }

    public static void writeStringList(int i11, List<String> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeStringList(i11, list);
    }

    public static void writeUInt32(int i11, int i12, Writer writer) throws IOException {
        if (i12 != 0) {
            writer.writeUInt32(i11, i12);
        }
    }

    public static void writeUInt32List(int i11, List<Integer> list, Writer writer, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeUInt32List(i11, list, z11);
    }

    public static void writeUInt64(int i11, long j11, Writer writer) throws IOException {
        if (j11 != 0) {
            writer.writeUInt64(i11, j11);
        }
    }

    public static void writeUInt64List(int i11, List<Long> list, Writer writer, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeUInt64List(i11, list, z11);
    }

    private SchemaUtil() {
    }

    public static int computeSizeBoolList(int i11, List<?> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z11) {
            return CodedOutputStream.computeTagSize(i11) + CodedOutputStream.computeLengthDelimitedFieldSize(size);
        }
        return size * CodedOutputStream.computeBoolSize(i11, true);
    }

    public static int computeSizeBoolListNoTag(List<?> list) {
        return list.size();
    }

    public static int computeSizeByteStringList(int i11, List<ByteString> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = size * CodedOutputStream.computeTagSize(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeTagSize += CodedOutputStream.computeBytesSizeNoTag(list.get(i12));
        }
        return iComputeTagSize;
    }

    public static int computeSizeEnumList(int i11, List<Integer> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeEnumListNoTag = computeSizeEnumListNoTag(list);
        if (z11) {
            return CodedOutputStream.computeTagSize(i11) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeEnumListNoTag);
        }
        return iComputeSizeEnumListNoTag + (size * CodedOutputStream.computeTagSize(i11));
    }

    public static int computeSizeEnumListNoTag(List<Integer> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            int iComputeEnumSizeNoTag = 0;
            while (i11 < size) {
                iComputeEnumSizeNoTag += CodedOutputStream.computeEnumSizeNoTag(intArrayList.getInt(i11));
                i11++;
            }
            return iComputeEnumSizeNoTag;
        }
        int iComputeEnumSizeNoTag2 = 0;
        while (i11 < size) {
            iComputeEnumSizeNoTag2 += CodedOutputStream.computeEnumSizeNoTag(list.get(i11).intValue());
            i11++;
        }
        return iComputeEnumSizeNoTag2;
    }

    public static int computeSizeFixed32List(int i11, List<?> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z11) {
            return CodedOutputStream.computeTagSize(i11) + CodedOutputStream.computeLengthDelimitedFieldSize(size * 4);
        }
        return size * CodedOutputStream.computeFixed32Size(i11, 0);
    }

    public static int computeSizeFixed32ListNoTag(List<?> list) {
        return list.size() * 4;
    }

    public static int computeSizeFixed64List(int i11, List<?> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z11) {
            return CodedOutputStream.computeTagSize(i11) + CodedOutputStream.computeLengthDelimitedFieldSize(size * 8);
        }
        return size * CodedOutputStream.computeFixed64Size(i11, 0L);
    }

    public static int computeSizeFixed64ListNoTag(List<?> list) {
        return list.size() * 8;
    }

    public static int computeSizeGroupList(int i11, List<MessageLite> list, Schema schema) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeGroupSize = 0;
        for (int i12 = 0; i12 < size; i12++) {
            iComputeGroupSize += CodedOutputStream.computeGroupSize(i11, list.get(i12), schema);
        }
        return iComputeGroupSize;
    }

    public static int computeSizeInt32List(int i11, List<Integer> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeInt32ListNoTag = computeSizeInt32ListNoTag(list);
        if (z11) {
            return CodedOutputStream.computeTagSize(i11) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeInt32ListNoTag);
        }
        return iComputeSizeInt32ListNoTag + (size * CodedOutputStream.computeTagSize(i11));
    }

    public static int computeSizeInt32ListNoTag(List<Integer> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            int iComputeInt32SizeNoTag = 0;
            while (i11 < size) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(intArrayList.getInt(i11));
                i11++;
            }
            return iComputeInt32SizeNoTag;
        }
        int iComputeInt32SizeNoTag2 = 0;
        while (i11 < size) {
            iComputeInt32SizeNoTag2 += CodedOutputStream.computeInt32SizeNoTag(list.get(i11).intValue());
            i11++;
        }
        return iComputeInt32SizeNoTag2;
    }

    public static int computeSizeInt64List(int i11, List<Long> list, boolean z11) {
        if (list.size() == 0) {
            return 0;
        }
        int iComputeSizeInt64ListNoTag = computeSizeInt64ListNoTag(list);
        if (z11) {
            return CodedOutputStream.computeTagSize(i11) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeInt64ListNoTag);
        }
        return iComputeSizeInt64ListNoTag + (list.size() * CodedOutputStream.computeTagSize(i11));
    }

    public static int computeSizeInt64ListNoTag(List<Long> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            int iComputeInt64SizeNoTag = 0;
            while (i11 < size) {
                iComputeInt64SizeNoTag += CodedOutputStream.computeInt64SizeNoTag(longArrayList.getLong(i11));
                i11++;
            }
            return iComputeInt64SizeNoTag;
        }
        int iComputeInt64SizeNoTag2 = 0;
        while (i11 < size) {
            iComputeInt64SizeNoTag2 += CodedOutputStream.computeInt64SizeNoTag(list.get(i11).longValue());
            i11++;
        }
        return iComputeInt64SizeNoTag2;
    }

    public static int computeSizeSInt32List(int i11, List<Integer> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeSInt32ListNoTag = computeSizeSInt32ListNoTag(list);
        if (z11) {
            return CodedOutputStream.computeTagSize(i11) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeSInt32ListNoTag);
        }
        return iComputeSizeSInt32ListNoTag + (size * CodedOutputStream.computeTagSize(i11));
    }

    public static int computeSizeSInt32ListNoTag(List<Integer> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            int iComputeSInt32SizeNoTag = 0;
            while (i11 < size) {
                iComputeSInt32SizeNoTag += CodedOutputStream.computeSInt32SizeNoTag(intArrayList.getInt(i11));
                i11++;
            }
            return iComputeSInt32SizeNoTag;
        }
        int iComputeSInt32SizeNoTag2 = 0;
        while (i11 < size) {
            iComputeSInt32SizeNoTag2 += CodedOutputStream.computeSInt32SizeNoTag(list.get(i11).intValue());
            i11++;
        }
        return iComputeSInt32SizeNoTag2;
    }

    public static int computeSizeSInt64List(int i11, List<Long> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeSInt64ListNoTag = computeSizeSInt64ListNoTag(list);
        if (z11) {
            return CodedOutputStream.computeTagSize(i11) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeSInt64ListNoTag);
        }
        return iComputeSizeSInt64ListNoTag + (size * CodedOutputStream.computeTagSize(i11));
    }

    public static int computeSizeSInt64ListNoTag(List<Long> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            int iComputeSInt64SizeNoTag = 0;
            while (i11 < size) {
                iComputeSInt64SizeNoTag += CodedOutputStream.computeSInt64SizeNoTag(longArrayList.getLong(i11));
                i11++;
            }
            return iComputeSInt64SizeNoTag;
        }
        int iComputeSInt64SizeNoTag2 = 0;
        while (i11 < size) {
            iComputeSInt64SizeNoTag2 += CodedOutputStream.computeSInt64SizeNoTag(list.get(i11).longValue());
            i11++;
        }
        return iComputeSInt64SizeNoTag2;
    }

    public static int computeSizeStringList(int i11, List<?> list) {
        int iComputeStringSizeNoTag;
        int iComputeStringSizeNoTag2;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = CodedOutputStream.computeTagSize(i11) * size;
        if (list instanceof LazyStringList) {
            LazyStringList lazyStringList = (LazyStringList) list;
            while (i12 < size) {
                Object raw = lazyStringList.getRaw(i12);
                if (raw instanceof ByteString) {
                    iComputeStringSizeNoTag2 = CodedOutputStream.computeBytesSizeNoTag((ByteString) raw);
                } else {
                    iComputeStringSizeNoTag2 = CodedOutputStream.computeStringSizeNoTag((String) raw);
                }
                iComputeTagSize += iComputeStringSizeNoTag2;
                i12++;
            }
            return iComputeTagSize;
        }
        while (i12 < size) {
            Object obj = list.get(i12);
            if (obj instanceof ByteString) {
                iComputeStringSizeNoTag = CodedOutputStream.computeBytesSizeNoTag((ByteString) obj);
            } else {
                iComputeStringSizeNoTag = CodedOutputStream.computeStringSizeNoTag((String) obj);
            }
            iComputeTagSize += iComputeStringSizeNoTag;
            i12++;
        }
        return iComputeTagSize;
    }

    public static int computeSizeUInt32List(int i11, List<Integer> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeUInt32ListNoTag = computeSizeUInt32ListNoTag(list);
        if (z11) {
            return CodedOutputStream.computeTagSize(i11) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeUInt32ListNoTag);
        }
        return iComputeSizeUInt32ListNoTag + (size * CodedOutputStream.computeTagSize(i11));
    }

    public static int computeSizeUInt32ListNoTag(List<Integer> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            int iComputeUInt32SizeNoTag = 0;
            while (i11 < size) {
                iComputeUInt32SizeNoTag += CodedOutputStream.computeUInt32SizeNoTag(intArrayList.getInt(i11));
                i11++;
            }
            return iComputeUInt32SizeNoTag;
        }
        int iComputeUInt32SizeNoTag2 = 0;
        while (i11 < size) {
            iComputeUInt32SizeNoTag2 += CodedOutputStream.computeUInt32SizeNoTag(list.get(i11).intValue());
            i11++;
        }
        return iComputeUInt32SizeNoTag2;
    }

    public static int computeSizeUInt64List(int i11, List<Long> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeUInt64ListNoTag = computeSizeUInt64ListNoTag(list);
        if (z11) {
            return CodedOutputStream.computeTagSize(i11) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeUInt64ListNoTag);
        }
        return iComputeSizeUInt64ListNoTag + (size * CodedOutputStream.computeTagSize(i11));
    }

    public static int computeSizeUInt64ListNoTag(List<Long> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            int iComputeUInt64SizeNoTag = 0;
            while (i11 < size) {
                iComputeUInt64SizeNoTag += CodedOutputStream.computeUInt64SizeNoTag(longArrayList.getLong(i11));
                i11++;
            }
            return iComputeUInt64SizeNoTag;
        }
        int iComputeUInt64SizeNoTag2 = 0;
        while (i11 < size) {
            iComputeUInt64SizeNoTag2 += CodedOutputStream.computeUInt64SizeNoTag(list.get(i11).longValue());
            i11++;
        }
        return iComputeUInt64SizeNoTag2;
    }

    public static <T, FT extends FieldSet.FieldDescriptorLite<FT>> void mergeExtensions(ExtensionSchema<FT> extensionSchema, T t11, T t12) {
        FieldSet<T> extensions = extensionSchema.getExtensions(t12);
        if (!extensions.isEmpty()) {
            extensionSchema.getMutableExtensions(t11).mergeFrom(extensions);
        }
    }

    public static <T> void mergeMap(MapFieldSchema mapFieldSchema, T t11, T t12, long j11) {
        UnsafeUtil.putObject(t11, j11, mapFieldSchema.mergeFrom(UnsafeUtil.getObject(t11, j11), UnsafeUtil.getObject(t12, j11)));
    }

    public static <T, UT, UB> void mergeUnknownFields(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t11, T t12) {
        unknownFieldSchema.setToMessage(t11, unknownFieldSchema.merge(unknownFieldSchema.getFromMessage(t11), unknownFieldSchema.getFromMessage(t12)));
    }

    public static void writeDouble(int i11, double d11, Writer writer) throws IOException {
        if (Double.doubleToRawLongBits(d11) != 0) {
            writer.writeDouble(i11, d11);
        }
    }

    public static void writeFloat(int i11, float f11, Writer writer) throws IOException {
        if (Float.floatToRawIntBits(f11) != 0) {
            writer.writeFloat(i11, f11);
        }
    }

    public static void writeGroupList(int i11, List<?> list, Writer writer, Schema schema) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeGroupList(i11, list, schema);
    }

    public static void writeMessageList(int i11, List<?> list, Writer writer, Schema schema) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeMessageList(i11, list, schema);
    }

    public static int computeSizeMessageList(int i11, List<?> list, Schema schema) {
        int iComputeMessageSizeNoTag;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = CodedOutputStream.computeTagSize(i11) * size;
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            if (obj instanceof LazyFieldLite) {
                iComputeMessageSizeNoTag = CodedOutputStream.computeLazyFieldSizeNoTag((LazyFieldLite) obj);
            } else {
                iComputeMessageSizeNoTag = CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj, schema);
            }
            iComputeTagSize += iComputeMessageSizeNoTag;
        }
        return iComputeTagSize;
    }

    @CanIgnoreReturnValue
    public static <UT, UB> UB filterUnknownEnumList(Object obj, int i11, List<Integer> list, Internal.EnumVerifier enumVerifier, UB ub2, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (enumVerifier == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                Integer num = list.get(i13);
                int iIntValue = num.intValue();
                if (enumVerifier.isInRange(iIntValue)) {
                    if (i13 != i12) {
                        list.set(i12, num);
                    }
                    i12++;
                } else {
                    ub2 = (UB) storeUnknownEnum(obj, i11, iIntValue, ub2, unknownFieldSchema);
                }
            }
            if (i12 != size) {
                list.subList(i12, size).clear();
            }
            return ub2;
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int iIntValue2 = it.next().intValue();
            if (!enumVerifier.isInRange(iIntValue2)) {
                ub2 = (UB) storeUnknownEnum(obj, i11, iIntValue2, ub2, unknownFieldSchema);
                it.remove();
            }
        }
        return ub2;
    }
}
