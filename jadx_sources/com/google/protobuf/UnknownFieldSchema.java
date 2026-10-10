package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
abstract class UnknownFieldSchema<T, B> {
    static final int DEFAULT_RECURSION_LIMIT = 100;
    private static volatile int recursionLimit = 100;

    public abstract void addFixed32(B b11, int i11, int i12);

    public abstract void addFixed64(B b11, int i11, long j11);

    public abstract void addGroup(B b11, int i11, T t11);

    public abstract void addLengthDelimited(B b11, int i11, ByteString byteString);

    public abstract void addVarint(B b11, int i11, long j11);

    public abstract B getBuilderFromMessage(Object obj);

    public abstract T getFromMessage(Object obj);

    public abstract int getSerializedSize(T t11);

    public abstract int getSerializedSizeAsMessageSet(T t11);

    public abstract void makeImmutable(Object obj);

    public abstract T merge(T t11, T t12);

    public abstract B newBuilder();

    public abstract void setBuilderToMessage(Object obj, B b11);

    public abstract void setToMessage(Object obj, T t11);

    public abstract boolean shouldDiscardUnknownFields(Reader reader);

    public abstract T toImmutable(B b11);

    public abstract void writeAsMessageSetTo(T t11, Writer writer) throws IOException;

    public abstract void writeTo(T t11, Writer writer) throws IOException;

    public void setRecursionLimit(int i11) {
        recursionLimit = i11;
    }

    private final void mergeFrom(B b11, Reader reader, int i11) throws IOException {
        while (reader.getFieldNumber() != Integer.MAX_VALUE && mergeOneFieldFrom(b11, reader, i11)) {
        }
    }

    public final boolean mergeOneFieldFrom(B b11, Reader reader, int i11) throws IOException {
        int tag = reader.getTag();
        int tagFieldNumber = WireFormat.getTagFieldNumber(tag);
        int tagWireType = WireFormat.getTagWireType(tag);
        if (tagWireType != 0) {
            if (tagWireType != 1) {
                if (tagWireType != 2) {
                    if (tagWireType != 3) {
                        if (tagWireType != 4) {
                            if (tagWireType == 5) {
                                addFixed32(b11, tagFieldNumber, reader.readFixed32());
                                return true;
                            }
                            throw InvalidProtocolBufferException.invalidWireType();
                        }
                        return false;
                    }
                    B bNewBuilder = newBuilder();
                    int iMakeTag = WireFormat.makeTag(tagFieldNumber, 4);
                    int i12 = i11 + 1;
                    if (i12 < recursionLimit) {
                        mergeFrom(bNewBuilder, reader, i12);
                        if (iMakeTag == reader.getTag()) {
                            addGroup(b11, tagFieldNumber, toImmutable(bNewBuilder));
                            return true;
                        }
                        throw InvalidProtocolBufferException.invalidEndTag();
                    }
                    throw InvalidProtocolBufferException.recursionLimitExceeded();
                }
                addLengthDelimited(b11, tagFieldNumber, reader.readBytes());
                return true;
            }
            addFixed64(b11, tagFieldNumber, reader.readFixed64());
            return true;
        }
        addVarint(b11, tagFieldNumber, reader.readInt64());
        return true;
    }
}
