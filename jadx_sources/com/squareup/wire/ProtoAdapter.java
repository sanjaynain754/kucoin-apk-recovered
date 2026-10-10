package com.squareup.wire;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;

/* JADX INFO: loaded from: classes59.dex */
public abstract class ProtoAdapter<E> {
    public static final ProtoAdapter<Boolean> BOOL;
    public static final ProtoAdapter<ByteString> BYTES;
    public static final ProtoAdapter<Double> DOUBLE;
    public static final ProtoAdapter<Integer> FIXED32;
    public static final ProtoAdapter<Long> FIXED64;
    private static final int FIXED_32_SIZE = 4;
    private static final int FIXED_64_SIZE = 8;
    private static final int FIXED_BOOL_SIZE = 1;
    public static final ProtoAdapter<Float> FLOAT;
    public static final ProtoAdapter<Integer> INT32;
    public static final ProtoAdapter<Long> INT64;
    public static final ProtoAdapter<Integer> SFIXED32;
    public static final ProtoAdapter<Long> SFIXED64;
    public static final ProtoAdapter<Integer> SINT32;
    public static final ProtoAdapter<Long> SINT64;
    public static final ProtoAdapter<String> STRING;
    public static final ProtoAdapter<Integer> UINT32;
    public static final ProtoAdapter<Long> UINT64;
    private final FieldEncoding fieldEncoding;
    final Class<?> javaType;
    ProtoAdapter<List<E>> packedAdapter;
    ProtoAdapter<List<E>> repeatedAdapter;

    public static final class EnumConstantNotFoundException extends IllegalArgumentException {
        public final int value;

        public EnumConstantNotFoundException(int i11, Class<?> cls) {
            super("Unknown enum tag " + i11 + " for " + cls.getCanonicalName());
            this.value = i11;
        }
    }

    public static final class MapEntryProtoAdapter<K, V> extends ProtoAdapter<Map.Entry<K, V>> {
        final ProtoAdapter<K> keyAdapter;
        final ProtoAdapter<V> valueAdapter;

        public MapEntryProtoAdapter(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
            super(FieldEncoding.LENGTH_DELIMITED, null);
            this.keyAdapter = protoAdapter;
            this.valueAdapter = protoAdapter2;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public Map.Entry<K, V> decode(ProtoReader protoReader) {
            throw new UnsupportedOperationException();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, Map.Entry<K, V> entry) throws IOException {
            this.keyAdapter.encodeWithTag(protoWriter, 1, entry.getKey());
            this.valueAdapter.encodeWithTag(protoWriter, 2, entry.getValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(Map.Entry<K, V> entry) {
            return this.keyAdapter.encodedSizeWithTag(1, entry.getKey()) + this.valueAdapter.encodedSizeWithTag(2, entry.getValue());
        }
    }

    public static final class MapProtoAdapter<K, V> extends ProtoAdapter<Map<K, V>> {
        private final MapEntryProtoAdapter<K, V> entryAdapter;

        public MapProtoAdapter(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
            super(FieldEncoding.LENGTH_DELIMITED, null);
            this.entryAdapter = new MapEntryProtoAdapter<>(protoAdapter, protoAdapter2);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public Map<K, V> decode(ProtoReader protoReader) throws IOException {
            long jBeginMessage = protoReader.beginMessage();
            K kDecode = null;
            V vDecode = null;
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag == -1) {
                    break;
                }
                if (iNextTag == 1) {
                    kDecode = this.entryAdapter.keyAdapter.decode(protoReader);
                } else if (iNextTag == 2) {
                    vDecode = this.entryAdapter.valueAdapter.decode(protoReader);
                }
            }
            protoReader.endMessage(jBeginMessage);
            if (kDecode == null) {
                throw new IllegalStateException("Map entry with null key");
            }
            if (vDecode != null) {
                return Collections.singletonMap(kDecode, vDecode);
            }
            throw new IllegalStateException("Map entry with null value");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, Map<K, V> map) {
            throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encodeWithTag(ProtoWriter protoWriter, int i11, Map<K, V> map) throws IOException {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                this.entryAdapter.encodeWithTag(protoWriter, i11, it.next());
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(Map<K, V> map) {
            throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSizeWithTag(int i11, Map<K, V> map) {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            int iEncodedSizeWithTag = 0;
            while (it.hasNext()) {
                iEncodedSizeWithTag += this.entryAdapter.encodedSizeWithTag(i11, it.next());
            }
            return iEncodedSizeWithTag;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public Map<K, V> redact(Map<K, V> map) {
            return Collections.EMPTY_MAP;
        }
    }

    public static <M extends Message> ProtoAdapter<M> get(M m11) {
        return get(m11.getClass());
    }

    public abstract E decode(ProtoReader protoReader) throws IOException;

    public final E decode(byte[] bArr) throws IOException {
        Preconditions.checkNotNull(bArr, "bytes == null");
        return decode(new Buffer().write(bArr));
    }

    public abstract void encode(ProtoWriter protoWriter, E e11) throws IOException;

    public final void encode(BufferedSink bufferedSink, E e11) throws IOException {
        Preconditions.checkNotNull(e11, "value == null");
        Preconditions.checkNotNull(bufferedSink, "sink == null");
        encode(new ProtoWriter(bufferedSink), e11);
    }

    public abstract int encodedSize(E e11);

    public E redact(E e11) {
        return null;
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        BOOL = new ProtoAdapter<Boolean>(fieldEncoding, Boolean.class) { // from class: com.squareup.wire.ProtoAdapter.1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Boolean bool) {
                return 1;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Boolean decode(ProtoReader protoReader) throws IOException {
                int varint32 = protoReader.readVarint32();
                if (varint32 == 0) {
                    return Boolean.FALSE;
                }
                if (varint32 == 1) {
                    return Boolean.TRUE;
                }
                throw new IOException(String.format("Invalid boolean value 0x%02x", Integer.valueOf(varint32)));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Boolean bool) throws IOException {
                protoWriter.writeVarint32(bool.booleanValue() ? 1 : 0);
            }
        };
        Class<Integer> cls = Integer.class;
        INT32 = new ProtoAdapter<Integer>(fieldEncoding, cls) { // from class: com.squareup.wire.ProtoAdapter.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader protoReader) throws IOException {
                return Integer.valueOf(protoReader.readVarint32());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Integer num) throws IOException {
                protoWriter.writeSignedVarint32(num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Integer num) {
                return ProtoWriter.int32Size(num.intValue());
            }
        };
        UINT32 = new ProtoAdapter<Integer>(fieldEncoding, cls) { // from class: com.squareup.wire.ProtoAdapter.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader protoReader) throws IOException {
                return Integer.valueOf(protoReader.readVarint32());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Integer num) throws IOException {
                protoWriter.writeVarint32(num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Integer num) {
                return ProtoWriter.varint32Size(num.intValue());
            }
        };
        SINT32 = new ProtoAdapter<Integer>(fieldEncoding, cls) { // from class: com.squareup.wire.ProtoAdapter.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader protoReader) throws IOException {
                return Integer.valueOf(ProtoWriter.decodeZigZag32(protoReader.readVarint32()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Integer num) throws IOException {
                protoWriter.writeVarint32(ProtoWriter.encodeZigZag32(num.intValue()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Integer num) {
                return ProtoWriter.varint32Size(ProtoWriter.encodeZigZag32(num.intValue()));
            }
        };
        FieldEncoding fieldEncoding2 = FieldEncoding.FIXED32;
        ProtoAdapter<Integer> protoAdapter = new ProtoAdapter<Integer>(fieldEncoding2, cls) { // from class: com.squareup.wire.ProtoAdapter.5
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Integer num) {
                return 4;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader protoReader) throws IOException {
                return Integer.valueOf(protoReader.readFixed32());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Integer num) throws IOException {
                protoWriter.writeFixed32(num.intValue());
            }
        };
        FIXED32 = protoAdapter;
        SFIXED32 = protoAdapter;
        Class<Long> cls2 = Long.class;
        INT64 = new ProtoAdapter<Long>(fieldEncoding, cls2) { // from class: com.squareup.wire.ProtoAdapter.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader protoReader) throws IOException {
                return Long.valueOf(protoReader.readVarint64());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Long l11) throws IOException {
                protoWriter.writeVarint64(l11.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Long l11) {
                return ProtoWriter.varint64Size(l11.longValue());
            }
        };
        UINT64 = new ProtoAdapter<Long>(fieldEncoding, cls2) { // from class: com.squareup.wire.ProtoAdapter.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader protoReader) throws IOException {
                return Long.valueOf(protoReader.readVarint64());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Long l11) throws IOException {
                protoWriter.writeVarint64(l11.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Long l11) {
                return ProtoWriter.varint64Size(l11.longValue());
            }
        };
        SINT64 = new ProtoAdapter<Long>(fieldEncoding, cls2) { // from class: com.squareup.wire.ProtoAdapter.8
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader protoReader) throws IOException {
                return Long.valueOf(ProtoWriter.decodeZigZag64(protoReader.readVarint64()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Long l11) throws IOException {
                protoWriter.writeVarint64(ProtoWriter.encodeZigZag64(l11.longValue()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Long l11) {
                return ProtoWriter.varint64Size(ProtoWriter.encodeZigZag64(l11.longValue()));
            }
        };
        FieldEncoding fieldEncoding3 = FieldEncoding.FIXED64;
        ProtoAdapter<Long> protoAdapter2 = new ProtoAdapter<Long>(fieldEncoding3, cls2) { // from class: com.squareup.wire.ProtoAdapter.9
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Long l11) {
                return 8;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader protoReader) throws IOException {
                return Long.valueOf(protoReader.readFixed64());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Long l11) throws IOException {
                protoWriter.writeFixed64(l11.longValue());
            }
        };
        FIXED64 = protoAdapter2;
        SFIXED64 = protoAdapter2;
        FLOAT = new ProtoAdapter<Float>(fieldEncoding2, Float.class) { // from class: com.squareup.wire.ProtoAdapter.10
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Float f11) {
                return 4;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Float decode(ProtoReader protoReader) throws IOException {
                return Float.valueOf(Float.intBitsToFloat(protoReader.readFixed32()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Float f11) throws IOException {
                protoWriter.writeFixed32(Float.floatToIntBits(f11.floatValue()));
            }
        };
        DOUBLE = new ProtoAdapter<Double>(fieldEncoding3, Double.class) { // from class: com.squareup.wire.ProtoAdapter.11
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Double d11) {
                return 8;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Double decode(ProtoReader protoReader) throws IOException {
                return Double.valueOf(Double.longBitsToDouble(protoReader.readFixed64()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Double d11) throws IOException {
                protoWriter.writeFixed64(Double.doubleToLongBits(d11.doubleValue()));
            }
        };
        FieldEncoding fieldEncoding4 = FieldEncoding.LENGTH_DELIMITED;
        STRING = new ProtoAdapter<String>(fieldEncoding4, String.class) { // from class: com.squareup.wire.ProtoAdapter.12
            @Override // com.squareup.wire.ProtoAdapter
            public String decode(ProtoReader protoReader) throws IOException {
                return protoReader.readString();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, String str) throws IOException {
                protoWriter.writeString(str);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(String str) {
                return ProtoWriter.utf8Length(str);
            }
        };
        BYTES = new ProtoAdapter<ByteString>(fieldEncoding4, ByteString.class) { // from class: com.squareup.wire.ProtoAdapter.13
            @Override // com.squareup.wire.ProtoAdapter
            public ByteString decode(ProtoReader protoReader) throws IOException {
                return protoReader.readBytes();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, ByteString byteString) throws IOException {
                protoWriter.writeBytes(byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ByteString byteString) {
                return byteString.size();
            }
        };
    }

    private ProtoAdapter<List<E>> createPacked() {
        FieldEncoding fieldEncoding = this.fieldEncoding;
        FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
        if (fieldEncoding != fieldEncoding2) {
            return new ProtoAdapter<List<E>>(fieldEncoding2, List.class) { // from class: com.squareup.wire.ProtoAdapter.14
                @Override // com.squareup.wire.ProtoAdapter
                public List<E> decode(ProtoReader protoReader) throws IOException {
                    return Collections.singletonList(ProtoAdapter.this.decode(protoReader));
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter protoWriter, List<E> list) throws IOException {
                    int size = list.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        ProtoAdapter.this.encode(protoWriter, list.get(i11));
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encodeWithTag(ProtoWriter protoWriter, int i11, List<E> list) throws IOException {
                    if (list.isEmpty()) {
                        return;
                    }
                    super.encodeWithTag(protoWriter, i11, list);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(List<E> list) {
                    int size = list.size();
                    int iEncodedSize = 0;
                    for (int i11 = 0; i11 < size; i11++) {
                        iEncodedSize += ProtoAdapter.this.encodedSize(list.get(i11));
                    }
                    return iEncodedSize;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSizeWithTag(int i11, List<E> list) {
                    if (list.isEmpty()) {
                        return 0;
                    }
                    return super.encodedSizeWithTag(i11, list);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public List<E> redact(List<E> list) {
                    return Collections.EMPTY_LIST;
                }
            };
        }
        throw new IllegalArgumentException("Unable to pack a length-delimited type.");
    }

    private ProtoAdapter<List<E>> createRepeated() {
        return new ProtoAdapter<List<E>>(this.fieldEncoding, List.class) { // from class: com.squareup.wire.ProtoAdapter.15
            @Override // com.squareup.wire.ProtoAdapter
            public List<E> decode(ProtoReader protoReader) throws IOException {
                return Collections.singletonList(ProtoAdapter.this.decode(protoReader));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, List<E> list) {
                throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encodeWithTag(ProtoWriter protoWriter, int i11, List<E> list) throws IOException {
                int size = list.size();
                for (int i12 = 0; i12 < size; i12++) {
                    ProtoAdapter.this.encodeWithTag(protoWriter, i11, list.get(i12));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(List<E> list) {
                throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSizeWithTag(int i11, List<E> list) {
                int size = list.size();
                int iEncodedSizeWithTag = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    iEncodedSizeWithTag += ProtoAdapter.this.encodedSizeWithTag(i11, list.get(i12));
                }
                return iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public List<E> redact(List<E> list) {
                return Collections.EMPTY_LIST;
            }
        };
    }

    public static <M> ProtoAdapter<M> get(Class<M> cls) {
        try {
            return (ProtoAdapter) cls.getField("ADAPTER").get(null);
        } catch (IllegalAccessException | NoSuchFieldException e11) {
            throw new IllegalArgumentException("failed to access " + cls.getName() + "#ADAPTER", e11);
        }
    }

    public static <E extends WireEnum> RuntimeEnumAdapter<E> newEnumAdapter(Class<E> cls) {
        return new RuntimeEnumAdapter<>(cls);
    }

    public static <K, V> ProtoAdapter<Map<K, V>> newMapAdapter(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
        return new MapProtoAdapter(protoAdapter, protoAdapter2);
    }

    public final ProtoAdapter<List<E>> asPacked() {
        ProtoAdapter<List<E>> protoAdapter = this.packedAdapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        ProtoAdapter<List<E>> protoAdapterCreatePacked = createPacked();
        this.packedAdapter = protoAdapterCreatePacked;
        return protoAdapterCreatePacked;
    }

    public final ProtoAdapter<List<E>> asRepeated() {
        ProtoAdapter<List<E>> protoAdapter = this.repeatedAdapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        ProtoAdapter<List<E>> protoAdapterCreateRepeated = createRepeated();
        this.repeatedAdapter = protoAdapterCreateRepeated;
        return protoAdapterCreateRepeated;
    }

    public void encodeWithTag(ProtoWriter protoWriter, int i11, E e11) throws IOException {
        if (e11 == null) {
            return;
        }
        protoWriter.writeTag(i11, this.fieldEncoding);
        if (this.fieldEncoding == FieldEncoding.LENGTH_DELIMITED) {
            protoWriter.writeVarint32(encodedSize(e11));
        }
        encode(protoWriter, e11);
    }

    public int encodedSizeWithTag(int i11, E e11) {
        if (e11 == null) {
            return 0;
        }
        int iEncodedSize = encodedSize(e11);
        if (this.fieldEncoding == FieldEncoding.LENGTH_DELIMITED) {
            iEncodedSize += ProtoWriter.varint32Size(iEncodedSize);
        }
        return iEncodedSize + ProtoWriter.tagSize(i11);
    }

    public ProtoAdapter(FieldEncoding fieldEncoding, Class<?> cls) {
        this.fieldEncoding = fieldEncoding;
        this.javaType = cls;
    }

    public static <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> cls) {
        return RuntimeMessageAdapter.create(cls);
    }

    public final E decode(ByteString byteString) throws IOException {
        Preconditions.checkNotNull(byteString, "bytes == null");
        return decode(new Buffer().write(byteString));
    }

    public String toString(E e11) {
        return e11.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProtoAdapter<?> withLabel(WireField.Label label) {
        if (label.isRepeated()) {
            if (label.isPacked()) {
                return asPacked();
            }
            return asRepeated();
        }
        return this;
    }

    public static ProtoAdapter<?> get(String str) {
        try {
            int iIndexOf = str.indexOf(35);
            return (ProtoAdapter) Class.forName(str.substring(0, iIndexOf)).getField(str.substring(iIndexOf + 1)).get(null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e11) {
            throw new IllegalArgumentException("failed to access " + str, e11);
        }
    }

    public final byte[] encode(E e11) {
        Preconditions.checkNotNull(e11, "value == null");
        Buffer buffer = new Buffer();
        try {
            encode(buffer, e11);
            return buffer.readByteArray();
        } catch (IOException e12) {
            throw new AssertionError(e12);
        }
    }

    public final E decode(InputStream inputStream) throws IOException {
        Preconditions.checkNotNull(inputStream, "stream == null");
        return decode(Okio.buffer(Okio.source(inputStream)));
    }

    public final E decode(BufferedSource bufferedSource) throws IOException {
        Preconditions.checkNotNull(bufferedSource, "source == null");
        return decode(new ProtoReader(bufferedSource));
    }

    public final void encode(OutputStream outputStream, E e11) throws IOException {
        Preconditions.checkNotNull(e11, "value == null");
        Preconditions.checkNotNull(outputStream, "stream == null");
        BufferedSink bufferedSinkBuffer = Okio.buffer(Okio.sink(outputStream));
        encode(bufferedSinkBuffer, e11);
        bufferedSinkBuffer.emit();
    }
}
