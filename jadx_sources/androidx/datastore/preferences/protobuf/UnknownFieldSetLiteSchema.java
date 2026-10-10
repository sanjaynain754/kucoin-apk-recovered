package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
class UnknownFieldSetLiteSchema extends UnknownFieldSchema<UnknownFieldSetLite, UnknownFieldSetLite> {
    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public boolean shouldDiscardUnknownFields(Reader reader) {
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public void addFixed32(UnknownFieldSetLite unknownFieldSetLite, int i11, int i12) {
        unknownFieldSetLite.storeField(WireFormat.makeTag(i11, 5), Integer.valueOf(i12));
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public void addFixed64(UnknownFieldSetLite unknownFieldSetLite, int i11, long j11) {
        unknownFieldSetLite.storeField(WireFormat.makeTag(i11, 1), Long.valueOf(j11));
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public void addGroup(UnknownFieldSetLite unknownFieldSetLite, int i11, UnknownFieldSetLite unknownFieldSetLite2) {
        unknownFieldSetLite.storeField(WireFormat.makeTag(i11, 3), unknownFieldSetLite2);
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public void addLengthDelimited(UnknownFieldSetLite unknownFieldSetLite, int i11, ByteString byteString) {
        unknownFieldSetLite.storeField(WireFormat.makeTag(i11, 2), byteString);
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public void addVarint(UnknownFieldSetLite unknownFieldSetLite, int i11, long j11) {
        unknownFieldSetLite.storeField(WireFormat.makeTag(i11, 0), Long.valueOf(j11));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public UnknownFieldSetLite getBuilderFromMessage(Object obj) {
        UnknownFieldSetLite fromMessage = getFromMessage(obj);
        if (fromMessage != UnknownFieldSetLite.getDefaultInstance()) {
            return fromMessage;
        }
        UnknownFieldSetLite unknownFieldSetLiteNewInstance = UnknownFieldSetLite.newInstance();
        setToMessage(obj, unknownFieldSetLiteNewInstance);
        return unknownFieldSetLiteNewInstance;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public UnknownFieldSetLite getFromMessage(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public int getSerializedSize(UnknownFieldSetLite unknownFieldSetLite) {
        return unknownFieldSetLite.getSerializedSize();
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public int getSerializedSizeAsMessageSet(UnknownFieldSetLite unknownFieldSetLite) {
        return unknownFieldSetLite.getSerializedSizeAsMessageSet();
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public UnknownFieldSetLite merge(UnknownFieldSetLite unknownFieldSetLite, UnknownFieldSetLite unknownFieldSetLite2) {
        if (UnknownFieldSetLite.getDefaultInstance().equals(unknownFieldSetLite2)) {
            return unknownFieldSetLite;
        }
        return UnknownFieldSetLite.getDefaultInstance().equals(unknownFieldSetLite) ? UnknownFieldSetLite.mutableCopyOf(unknownFieldSetLite, unknownFieldSetLite2) : unknownFieldSetLite.mergeFrom(unknownFieldSetLite2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public UnknownFieldSetLite newBuilder() {
        return UnknownFieldSetLite.newInstance();
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public void setBuilderToMessage(Object obj, UnknownFieldSetLite unknownFieldSetLite) {
        setToMessage(obj, unknownFieldSetLite);
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public void setToMessage(Object obj, UnknownFieldSetLite unknownFieldSetLite) {
        ((GeneratedMessageLite) obj).unknownFields = unknownFieldSetLite;
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public UnknownFieldSetLite toImmutable(UnknownFieldSetLite unknownFieldSetLite) {
        unknownFieldSetLite.makeImmutable();
        return unknownFieldSetLite;
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public void writeAsMessageSetTo(UnknownFieldSetLite unknownFieldSetLite, Writer writer) throws IOException {
        unknownFieldSetLite.writeAsMessageSetTo(writer);
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public void writeTo(UnknownFieldSetLite unknownFieldSetLite, Writer writer) throws IOException {
        unknownFieldSetLite.writeTo(writer);
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public void makeImmutable(Object obj) {
        getFromMessage(obj).makeImmutable();
    }
}
