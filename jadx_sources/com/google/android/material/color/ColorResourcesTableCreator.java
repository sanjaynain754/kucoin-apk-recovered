package com.google.android.material.color;

import android.content.Context;
import android.util.Pair;
import androidx.annotation.ColorInt;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes45.dex */
final class ColorResourcesTableCreator {
    private static final byte ANDROID_PACKAGE_ID = 1;
    private static final byte APPLICATION_PACKAGE_ID = 127;
    private static final short HEADER_TYPE_PACKAGE = 512;
    private static final short HEADER_TYPE_RES_TABLE = 2;
    private static final short HEADER_TYPE_STRING_POOL = 1;
    private static final short HEADER_TYPE_TYPE = 513;
    private static final short HEADER_TYPE_TYPE_SPEC = 514;
    private static final String RESOURCE_TYPE_NAME_COLOR = "color";
    private static byte typeIdColor;
    private static final PackageInfo ANDROID_PACKAGE_INFO = new PackageInfo(1, "android");
    private static final Comparator<ColorResource> COLOR_RESOURCE_COMPARATOR = new Comparator<ColorResource>() { // from class: com.google.android.material.color.ColorResourcesTableCreator.1
        @Override // java.util.Comparator
        public int compare(ColorResource colorResource, ColorResource colorResource2) {
            return colorResource.entryId - colorResource2.entryId;
        }
    };

    public static class ColorResource {
        private final short entryId;
        private final String name;
        private final byte packageId;
        private final byte typeId;

        @ColorInt
        private final int value;

        public ColorResource(int i11, String str, int i12) {
            this.name = str;
            this.value = i12;
            this.entryId = (short) (65535 & i11);
            this.typeId = (byte) ((i11 >> 16) & 255);
            this.packageId = (byte) ((i11 >> 24) & 255);
        }
    }

    public static class PackageChunk {
        private static final short HEADER_SIZE = 288;
        private static final int PACKAGE_NAME_MAX_LENGTH = 128;
        private final ResChunkHeader header = new ResChunkHeader(ColorResourcesTableCreator.HEADER_TYPE_PACKAGE, HEADER_SIZE, getChunkSize());
        private final StringPoolChunk keyStrings;
        private final PackageInfo packageInfo;
        private final TypeSpecChunk typeSpecChunk;
        private final StringPoolChunk typeStrings;

        public int getChunkSize() {
            return this.typeStrings.getChunkSize() + 288 + this.keyStrings.getChunkSize() + this.typeSpecChunk.getChunkSizeWithTypeChunk();
        }

        public void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.header.writeTo(byteArrayOutputStream);
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.packageInfo.f11763id));
            char[] charArray = this.packageInfo.name.toCharArray();
            for (int i11 = 0; i11 < 128; i11++) {
                if (i11 < charArray.length) {
                    byteArrayOutputStream.write(ColorResourcesTableCreator.charToByteArray(charArray[i11]));
                } else {
                    byteArrayOutputStream.write(ColorResourcesTableCreator.charToByteArray((char) 0));
                }
            }
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(288));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(0));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.typeStrings.getChunkSize() + 288));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(0));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(0));
            this.typeStrings.writeTo(byteArrayOutputStream);
            this.keyStrings.writeTo(byteArrayOutputStream);
            this.typeSpecChunk.writeTo(byteArrayOutputStream);
        }

        public PackageChunk(PackageInfo packageInfo, List<ColorResource> list) {
            this.packageInfo = packageInfo;
            this.typeStrings = new StringPoolChunk(false, generateTypeStrings(list));
            this.keyStrings = new StringPoolChunk(true, generateKeyStrings(list));
            this.typeSpecChunk = new TypeSpecChunk(list);
        }

        private String[] generateKeyStrings(List<ColorResource> list) {
            String[] strArr = new String[list.size()];
            for (int i11 = 0; i11 < list.size(); i11++) {
                strArr[i11] = list.get(i11).name;
            }
            return strArr;
        }

        private String[] generateTypeStrings(List<ColorResource> list) {
            int i11 = 0;
            if (!list.isEmpty()) {
                int i12 = list.get(0).typeId;
                String[] strArr = new String[i12];
                while (true) {
                    int i13 = i12 - 1;
                    if (i11 < i13) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("?");
                        int i14 = i11 + 1;
                        sb2.append(i14);
                        strArr[i11] = sb2.toString();
                        i11 = i14;
                    } else {
                        strArr[i13] = "color";
                        return strArr;
                    }
                }
            } else {
                return new String[0];
            }
        }
    }

    public static class PackageInfo {

        /* JADX INFO: renamed from: id */
        private final int f11763id;
        private final String name;

        public PackageInfo(int i11, String str) {
            this.f11763id = i11;
            this.name = str;
        }
    }

    public static class ResChunkHeader {
        private final int chunkSize;
        private final short headerSize;
        private final short type;

        public void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(ColorResourcesTableCreator.shortToByteArray(this.type));
            byteArrayOutputStream.write(ColorResourcesTableCreator.shortToByteArray(this.headerSize));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.chunkSize));
        }

        public ResChunkHeader(short s11, short s12, int i11) {
            this.type = s11;
            this.headerSize = s12;
            this.chunkSize = i11;
        }
    }

    public static class ResEntry {
        private static final byte DATA_TYPE_AARRGGBB = 28;
        private static final short ENTRY_SIZE = 8;
        private static final short FLAG_PUBLIC = 2;
        private static final int SIZE = 16;
        private static final short VALUE_SIZE = 8;
        private final int data;
        private final int keyStringIndex;

        public void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(ColorResourcesTableCreator.shortToByteArray((short) 8));
            byteArrayOutputStream.write(ColorResourcesTableCreator.shortToByteArray((short) 2));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.keyStringIndex));
            byteArrayOutputStream.write(ColorResourcesTableCreator.shortToByteArray((short) 8));
            byteArrayOutputStream.write(new byte[]{0, 28});
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.data));
        }

        public ResEntry(int i11, @ColorInt int i12) {
            this.keyStringIndex = i11;
            this.data = i12;
        }
    }

    public static class ResTable {
        private static final short HEADER_SIZE = 12;
        private final ResChunkHeader header;
        private final int packageCount;
        private final List<PackageChunk> packageChunks = new ArrayList();
        private final StringPoolChunk stringPool = new StringPoolChunk(new String[0]);

        private int getOverallSize() {
            Iterator<PackageChunk> it = this.packageChunks.iterator();
            int chunkSize = 0;
            while (it.hasNext()) {
                chunkSize += it.next().getChunkSize();
            }
            return this.stringPool.getChunkSize() + 12 + chunkSize;
        }

        public void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.header.writeTo(byteArrayOutputStream);
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.packageCount));
            this.stringPool.writeTo(byteArrayOutputStream);
            Iterator<PackageChunk> it = this.packageChunks.iterator();
            while (it.hasNext()) {
                it.next().writeTo(byteArrayOutputStream);
            }
        }

        public ResTable(Map<PackageInfo, List<ColorResource>> map) {
            this.packageCount = map.size();
            for (Map.Entry<PackageInfo, List<ColorResource>> entry : map.entrySet()) {
                List<ColorResource> value = entry.getValue();
                Collections.sort(value, ColorResourcesTableCreator.COLOR_RESOURCE_COMPARATOR);
                this.packageChunks.add(new PackageChunk(entry.getKey(), value));
            }
            this.header = new ResChunkHeader((short) 2, (short) 12, getOverallSize());
        }
    }

    public static class StringPoolChunk {
        private static final int FLAG_UTF8 = 256;
        private static final short HEADER_SIZE = 28;
        private static final int STYLED_SPAN_LIST_END = -1;
        private final int chunkSize;
        private final ResChunkHeader header;
        private final int stringCount;
        private final List<Integer> stringIndex;
        private final List<byte[]> strings;
        private final int stringsPaddingSize;
        private final int stringsStart;
        private final int styledSpanCount;
        private final List<Integer> styledSpanIndex;
        private final List<List<StringStyledSpan>> styledSpans;
        private final int styledSpansStart;
        private final boolean utf8Encode;

        public StringPoolChunk(String... strArr) {
            this(false, strArr);
        }

        public StringPoolChunk(boolean z11, String... strArr) {
            this.stringIndex = new ArrayList();
            this.styledSpanIndex = new ArrayList();
            this.strings = new ArrayList();
            this.styledSpans = new ArrayList();
            this.utf8Encode = z11;
            int length = 0;
            for (String str : strArr) {
                Pair<byte[], List<StringStyledSpan>> pairProcessString = processString(str);
                this.stringIndex.add(Integer.valueOf(length));
                Object obj = pairProcessString.first;
                length += ((byte[]) obj).length;
                this.strings.add((byte[]) obj);
                this.styledSpans.add((List) pairProcessString.second);
            }
            int size = 0;
            for (List<StringStyledSpan> list : this.styledSpans) {
                for (StringStyledSpan stringStyledSpan : list) {
                    this.stringIndex.add(Integer.valueOf(length));
                    length += stringStyledSpan.styleString.length;
                    this.strings.add(stringStyledSpan.styleString);
                }
                this.styledSpanIndex.add(Integer.valueOf(size));
                size += (list.size() * 12) + 4;
            }
            int i11 = length % 4;
            int i12 = i11 == 0 ? 0 : 4 - i11;
            this.stringsPaddingSize = i12;
            int size2 = this.strings.size();
            this.stringCount = size2;
            this.styledSpanCount = this.strings.size() - strArr.length;
            boolean z12 = this.strings.size() - strArr.length > 0;
            if (!z12) {
                this.styledSpanIndex.clear();
                this.styledSpans.clear();
            }
            int size3 = (size2 * 4) + 28 + (this.styledSpanIndex.size() * 4);
            this.stringsStart = size3;
            int i13 = length + i12;
            this.styledSpansStart = z12 ? size3 + i13 : 0;
            int i14 = size3 + i13 + (z12 ? size : 0);
            this.chunkSize = i14;
            this.header = new ResChunkHeader((short) 1, HEADER_SIZE, i14);
        }

        private Pair<byte[], List<StringStyledSpan>> processString(String str) {
            return new Pair<>(this.utf8Encode ? ColorResourcesTableCreator.stringToByteArrayUtf8(str) : ColorResourcesTableCreator.stringToByteArray(str), Collections.EMPTY_LIST);
        }

        public int getChunkSize() {
            return this.chunkSize;
        }

        public void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.header.writeTo(byteArrayOutputStream);
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.stringCount));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.styledSpanCount));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.utf8Encode ? 256 : 0));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.stringsStart));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.styledSpansStart));
            Iterator<Integer> it = this.stringIndex.iterator();
            while (it.hasNext()) {
                byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(it.next().intValue()));
            }
            Iterator<Integer> it2 = this.styledSpanIndex.iterator();
            while (it2.hasNext()) {
                byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(it2.next().intValue()));
            }
            Iterator<byte[]> it3 = this.strings.iterator();
            while (it3.hasNext()) {
                byteArrayOutputStream.write(it3.next());
            }
            int i11 = this.stringsPaddingSize;
            if (i11 > 0) {
                byteArrayOutputStream.write(new byte[i11]);
            }
            Iterator<List<StringStyledSpan>> it4 = this.styledSpans.iterator();
            while (it4.hasNext()) {
                Iterator<StringStyledSpan> it5 = it4.next().iterator();
                while (it5.hasNext()) {
                    it5.next().writeTo(byteArrayOutputStream);
                }
                byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(-1));
            }
        }
    }

    public static class StringStyledSpan {
        private int firstCharacterIndex;
        private int lastCharacterIndex;
        private int nameReference;
        private byte[] styleString;

        public void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.nameReference));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.firstCharacterIndex));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.lastCharacterIndex));
        }

        private StringStyledSpan() {
        }
    }

    public static class TypeChunk {
        private static final byte CONFIG_SIZE = 64;
        private static final short HEADER_SIZE = 84;
        private static final int OFFSET_NO_ENTRY = -1;
        private final byte[] config;
        private final int entryCount;
        private final ResChunkHeader header;
        private final int[] offsetTable;
        private final ResEntry[] resEntries;

        private int getOffsetTableSize() {
            return this.offsetTable.length * 4;
        }

        public void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.header.writeTo(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{ColorResourcesTableCreator.typeIdColor, 0, 0, 0});
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.entryCount));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(getEntryStart()));
            byteArrayOutputStream.write(this.config);
            for (int i11 : this.offsetTable) {
                byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(i11));
            }
            for (ResEntry resEntry : this.resEntries) {
                resEntry.writeTo(byteArrayOutputStream);
            }
        }

        public TypeChunk(List<ColorResource> list, Set<Short> set, int i11) {
            byte[] bArr = new byte[64];
            this.config = bArr;
            this.entryCount = i11;
            bArr[0] = 64;
            this.resEntries = new ResEntry[list.size()];
            for (int i12 = 0; i12 < list.size(); i12++) {
                this.resEntries[i12] = new ResEntry(i12, list.get(i12).value);
            }
            this.offsetTable = new int[i11];
            int i13 = 0;
            for (short s11 = 0; s11 < i11; s11 = (short) (s11 + 1)) {
                if (set.contains(Short.valueOf(s11))) {
                    this.offsetTable[s11] = i13;
                    i13 += 16;
                } else {
                    this.offsetTable[s11] = -1;
                }
            }
            this.header = new ResChunkHeader(ColorResourcesTableCreator.HEADER_TYPE_TYPE, HEADER_SIZE, getChunkSize());
        }

        private int getEntryStart() {
            return getOffsetTableSize() + 84;
        }

        public int getChunkSize() {
            return getEntryStart() + (this.resEntries.length * 16);
        }
    }

    public static class TypeSpecChunk {
        private static final short HEADER_SIZE = 16;
        private static final int SPEC_PUBLIC = 1073741824;
        private final int entryCount;
        private final int[] entryFlags;
        private final ResChunkHeader header;
        private final TypeChunk typeChunk;

        private int getChunkSize() {
            return (this.entryCount * 4) + 16;
        }

        public void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.header.writeTo(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{ColorResourcesTableCreator.typeIdColor, 0, 0, 0});
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.entryCount));
            for (int i11 : this.entryFlags) {
                byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(i11));
            }
            this.typeChunk.writeTo(byteArrayOutputStream);
        }

        public TypeSpecChunk(List<ColorResource> list) {
            this.entryCount = list.get(list.size() - 1).entryId + 1;
            HashSet hashSet = new HashSet();
            Iterator<ColorResource> it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(Short.valueOf(it.next().entryId));
            }
            this.entryFlags = new int[this.entryCount];
            for (short s11 = 0; s11 < this.entryCount; s11 = (short) (s11 + 1)) {
                if (hashSet.contains(Short.valueOf(s11))) {
                    this.entryFlags[s11] = 1073741824;
                }
            }
            this.header = new ResChunkHeader(ColorResourcesTableCreator.HEADER_TYPE_TYPE_SPEC, (short) 16, getChunkSize());
            this.typeChunk = new TypeChunk(list, hashSet, this.entryCount);
        }

        public int getChunkSizeWithTypeChunk() {
            return getChunkSize() + this.typeChunk.getChunkSize();
        }
    }

    private static byte[] concat(byte[]... bArr) {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            length += bArr2.length;
        }
        byte[] bArr3 = new byte[length];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }

    private static byte[] encodeLengthUtf8(short s11) {
        return s11 > 127 ? new byte[]{(byte) ((127 & (s11 >> 8)) | 128), (byte) (s11 & 255)} : new byte[]{(byte) (s11 & 255)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] charToByteArray(char c11) {
        return new byte[]{(byte) (c11 & 255), (byte) ((c11 >> '\b') & 255)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] intToByteArray(int i11) {
        return new byte[]{(byte) (i11 & 255), (byte) ((i11 >> 8) & 255), (byte) ((i11 >> 16) & 255), (byte) ((i11 >> 24) & 255)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] shortToByteArray(short s11) {
        return new byte[]{(byte) (s11 & 255), (byte) ((s11 >> 8) & 255)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] stringToByteArrayUtf8(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        return concat(encodeLengthUtf8((short) str.length()), encodeLengthUtf8((short) bytes.length), bytes, new byte[]{0});
    }

    private ColorResourcesTableCreator() {
    }

    public static byte[] create(Context context, Map<Integer, Integer> map) throws IOException {
        PackageInfo packageInfo;
        if (!map.entrySet().isEmpty()) {
            PackageInfo packageInfo2 = new PackageInfo(127, context.getPackageName());
            HashMap map2 = new HashMap();
            ColorResource colorResource = null;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                ColorResource colorResource2 = new ColorResource(entry.getKey().intValue(), context.getResources().getResourceEntryName(entry.getKey().intValue()), entry.getValue().intValue());
                if (context.getResources().getResourceTypeName(entry.getKey().intValue()).equals("color")) {
                    if (colorResource2.packageId == 1) {
                        packageInfo = ANDROID_PACKAGE_INFO;
                    } else if (colorResource2.packageId == 127) {
                        packageInfo = packageInfo2;
                    } else {
                        throw new IllegalArgumentException("Not supported with unknown package id: " + ((int) colorResource2.packageId));
                    }
                    if (!map2.containsKey(packageInfo)) {
                        map2.put(packageInfo, new ArrayList());
                    }
                    ((List) map2.get(packageInfo)).add(colorResource2);
                    colorResource = colorResource2;
                } else {
                    throw new IllegalArgumentException("Non color resource found: name=" + colorResource2.name + ", typeId=" + Integer.toHexString(colorResource2.typeId & 255));
                }
            }
            byte b11 = colorResource.typeId;
            typeIdColor = b11;
            if (b11 != 0) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                new ResTable(map2).writeTo(byteArrayOutputStream);
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalArgumentException("No color resources found for harmonization.");
        }
        throw new IllegalArgumentException("No color resources provided for harmonization.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] stringToByteArray(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length * 2;
        byte[] bArr = new byte[length + 4];
        byte[] bArrShortToByteArray = shortToByteArray((short) charArray.length);
        bArr[0] = bArrShortToByteArray[0];
        bArr[1] = bArrShortToByteArray[1];
        for (int i11 = 0; i11 < charArray.length; i11++) {
            byte[] bArrCharToByteArray = charToByteArray(charArray[i11]);
            int i12 = i11 * 2;
            bArr[i12 + 2] = bArrCharToByteArray[0];
            bArr[i12 + 3] = bArrCharToByteArray[1];
        }
        bArr[length + 2] = 0;
        bArr[length + 3] = 0;
        return bArr;
    }
}
