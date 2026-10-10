package com.google.protobuf;

import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class MapEntryLite<K, V> {
    private static final int KEY_FIELD_NUMBER = 1;
    private static final int VALUE_FIELD_NUMBER = 2;
    private final K key;
    private final Metadata<K, V> metadata;
    private final V value;

    private MapEntryLite(WireFormat.FieldType fieldType, K k11, WireFormat.FieldType fieldType2, V v11) {
        this.metadata = new Metadata<>(fieldType, k11, fieldType2, v11);
        this.key = k11;
        this.value = v11;
    }

    public Map.Entry<K, V> parseEntry(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return parseEntry(byteString.newCodedInput(), this.metadata, extensionRegistryLite);
    }

    public void serializeTo(CodedOutputStream codedOutputStream, int i11, K k11, V v11) throws IOException {
        codedOutputStream.writeTag(i11, 2);
        codedOutputStream.writeUInt32NoTag(computeSerializedSize(this.metadata, k11, v11));
        writeTo(codedOutputStream, this.metadata, k11, v11);
    }

    /* JADX INFO: renamed from: com.google.protobuf.MapEntryLite$1 */
    /* JADX INFO: loaded from: classes56.dex */
    public static /* synthetic */ class C90801 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.GROUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class Metadata<K, V> {
        public final K defaultKey;
        public final V defaultValue;
        public final WireFormat.FieldType keyType;
        public final WireFormat.FieldType valueType;

        public Metadata(WireFormat.FieldType fieldType, K k11, WireFormat.FieldType fieldType2, V v11) {
            this.keyType = fieldType;
            this.defaultKey = k11;
            this.valueType = fieldType2;
            this.defaultValue = v11;
        }
    }

    public static <K, V> int computeSerializedSize(Metadata<K, V> metadata, K k11, V v11) {
        return FieldSet.computeElementSize(metadata.keyType, 1, k11) + FieldSet.computeElementSize(metadata.valueType, 2, v11);
    }

    public static <K, V> MapEntryLite<K, V> newDefaultInstance(WireFormat.FieldType fieldType, K k11, WireFormat.FieldType fieldType2, V v11) {
        return new MapEntryLite<>(fieldType, k11, fieldType2, v11);
    }

    public static <K, V> Map.Entry<K, V> parseEntry(CodedInputStream codedInputStream, Metadata<K, V> metadata, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        Object field = metadata.defaultKey;
        Object field2 = metadata.defaultValue;
        while (true) {
            int tag = codedInputStream.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == WireFormat.makeTag(1, metadata.keyType.getWireType())) {
                field = parseField(codedInputStream, extensionRegistryLite, metadata.keyType, field);
            } else if (tag == WireFormat.makeTag(2, metadata.valueType.getWireType())) {
                field2 = parseField(codedInputStream, extensionRegistryLite, metadata.valueType, field2);
            } else if (!codedInputStream.skipField(tag)) {
                break;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(field, field2);
    }

    public static <T> T parseField(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, WireFormat.FieldType fieldType, T t11) throws IOException {
        int i11 = C90801.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()];
        if (i11 == 1) {
            MessageLite.Builder builder = ((MessageLite) t11).toBuilder();
            codedInputStream.readMessage(builder, extensionRegistryLite);
            return (T) builder.buildPartial();
        }
        if (i11 == 2) {
            return (T) Integer.valueOf(codedInputStream.readEnum());
        }
        if (i11 != 3) {
            return (T) FieldSet.readPrimitiveField(codedInputStream, fieldType, true);
        }
        throw new RuntimeException("Groups are not allowed in maps.");
    }

    public static <K, V> void writeTo(CodedOutputStream codedOutputStream, Metadata<K, V> metadata, K k11, V v11) throws IOException {
        FieldSet.writeElement(codedOutputStream, metadata.keyType, 1, k11);
        FieldSet.writeElement(codedOutputStream, metadata.valueType, 2, v11);
    }

    public K getKey() {
        return this.key;
    }

    public Metadata<K, V> getMetadata() {
        return this.metadata;
    }

    public V getValue() {
        return this.value;
    }

    public int computeMessageSize(int i11, K k11, V v11) {
        return CodedOutputStream.computeTagSize(i11) + CodedOutputStream.computeLengthDelimitedFieldSize(computeSerializedSize(this.metadata, k11, v11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void parseInto(MapFieldLite<K, V> mapFieldLite, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
        Metadata<K, V> metadata = this.metadata;
        Object field = metadata.defaultKey;
        Object field2 = metadata.defaultValue;
        while (true) {
            int tag = codedInputStream.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == WireFormat.makeTag(1, this.metadata.keyType.getWireType())) {
                field = parseField(codedInputStream, extensionRegistryLite, this.metadata.keyType, field);
            } else if (tag == WireFormat.makeTag(2, this.metadata.valueType.getWireType())) {
                field2 = parseField(codedInputStream, extensionRegistryLite, this.metadata.valueType, field2);
            } else if (!codedInputStream.skipField(tag)) {
                break;
            }
        }
        codedInputStream.checkLastTagWas(0);
        codedInputStream.popLimit(iPushLimit);
        mapFieldLite.put(field, field2);
    }

    private MapEntryLite(Metadata<K, V> metadata, K k11, V v11) {
        this.metadata = metadata;
        this.key = k11;
        this.value = v11;
    }
}
