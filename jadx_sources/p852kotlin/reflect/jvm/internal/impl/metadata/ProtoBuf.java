package p852kotlin.reflect.jvm.internal.impl.metadata;

import com.tencent.thumbplayer.tcmedia.core.common.TPCodecParamers;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p852kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import p852kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser;
import p852kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import p852kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream;
import p852kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import p852kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import p852kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import p852kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import p852kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p852kotlin.reflect.jvm.internal.impl.protobuf.LazyStringArrayList;
import p852kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList;
import p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder;
import p852kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import p852kotlin.reflect.jvm.internal.impl.protobuf.ProtocolStringList;

/* JADX INFO: loaded from: classes61.dex */
public final class ProtoBuf {

    public static final class Annotation extends GeneratedMessageLite implements AnnotationOrBuilder {
        public static Parser<Annotation> PARSER = new AbstractParser<Annotation>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.1
            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public Annotation parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Annotation(codedInputStream, extensionRegistryLite);
            }
        };
        private static final Annotation defaultInstance;
        private List<Argument> argument_;
        private int bitField0_;
        private int id_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final ByteString unknownFields;

        public static final class Argument extends GeneratedMessageLite implements ArgumentOrBuilder {
            public static Parser<Argument> PARSER = new AbstractParser<Argument>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.1
                @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.Parser
                public Argument parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new Argument(codedInputStream, extensionRegistryLite);
                }
            };
            private static final Argument defaultInstance;
            private int bitField0_;
            private byte memoizedIsInitialized;
            private int memoizedSerializedSize;
            private int nameId_;
            private final ByteString unknownFields;
            private Value value_;

            public static final class Builder extends GeneratedMessageLite.Builder<Argument, Builder> implements ArgumentOrBuilder {
                private int bitField0_;
                private int nameId_;
                private Value value_ = Value.getDefaultInstance();

                /* JADX INFO: Access modifiers changed from: private */
                public static Builder create() {
                    return new Builder();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public Argument build() {
                    Argument argumentBuildPartial = buildPartial();
                    if (argumentBuildPartial.isInitialized()) {
                        return argumentBuildPartial;
                    }
                    throw AbstractMessageLite.Builder.newUninitializedMessageException(argumentBuildPartial);
                }

                public Argument buildPartial() {
                    Argument argument = new Argument(this);
                    int i11 = this.bitField0_;
                    int i12 = (i11 & 1) != 1 ? 0 : 1;
                    argument.nameId_ = this.nameId_;
                    if ((i11 & 2) == 2) {
                        i12 |= 2;
                    }
                    argument.value_ = this.value_;
                    argument.bitField0_ = i12;
                    return argument;
                }

                public Value getValue() {
                    return this.value_;
                }

                public boolean hasNameId() {
                    return (this.bitField0_ & 1) == 1;
                }

                public boolean hasValue() {
                    return (this.bitField0_ & 2) == 2;
                }

                public Builder mergeValue(Value value) {
                    if ((this.bitField0_ & 2) != 2 || this.value_ == Value.getDefaultInstance()) {
                        this.value_ = value;
                    } else {
                        this.value_ = Value.newBuilder(this.value_).mergeFrom(value).buildPartial();
                    }
                    this.bitField0_ |= 2;
                    return this;
                }

                public Builder setNameId(int i11) {
                    this.bitField0_ |= 1;
                    this.nameId_ = i11;
                    return this;
                }

                private Builder() {
                    maybeForceBuilderInitialization();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public Argument getDefaultInstanceForType() {
                    return Argument.getDefaultInstance();
                }

                @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    if (!hasNameId() || !hasValue() || !getValue().isInitialized()) {
                        return false;
                    }
                    return true;
                }

                public Builder setValue(Value value) {
                    value.getClass();
                    this.value_ = value;
                    this.bitField0_ |= 2;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
                public Builder mo105124clone() {
                    return create().mergeFrom(buildPartial());
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                public Builder mergeFrom(Argument argument) {
                    if (argument == Argument.getDefaultInstance()) {
                        return this;
                    }
                    if (argument.hasNameId()) {
                        setNameId(argument.getNameId());
                    }
                    if (argument.hasValue()) {
                        mergeValue(argument.getValue());
                    }
                    setUnknownFields(getUnknownFields().concat(argument.unknownFields));
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    Argument argument = null;
                    try {
                        try {
                            Argument partialFrom = Argument.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (partialFrom != null) {
                                mergeFrom(partialFrom);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e11) {
                            Argument argument2 = (Argument) e11.getUnfinishedMessage();
                            try {
                                throw e11;
                            } catch (Throwable th2) {
                                th = th2;
                                argument = argument2;
                                if (argument != null) {
                                    mergeFrom(argument);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (argument != null) {
                            mergeFrom(argument);
                        }
                        throw th;
                    }
                }

                private void maybeForceBuilderInitialization() {
                }
            }

            public static final class Value extends GeneratedMessageLite implements ValueOrBuilder {
                public static Parser<Value> PARSER = new AbstractParser<Value>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.1
                    @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.Parser
                    public Value parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return new Value(codedInputStream, extensionRegistryLite);
                    }
                };
                private static final Value defaultInstance;
                private Annotation annotation_;
                private int arrayDimensionCount_;
                private List<Value> arrayElement_;
                private int bitField0_;
                private int classId_;
                private double doubleValue_;
                private int enumValueId_;
                private int flags_;
                private float floatValue_;
                private long intValue_;
                private byte memoizedIsInitialized;
                private int memoizedSerializedSize;
                private int stringValue_;
                private Type type_;
                private final ByteString unknownFields;

                public static final class Builder extends GeneratedMessageLite.Builder<Value, Builder> implements ValueOrBuilder {
                    private int arrayDimensionCount_;
                    private int bitField0_;
                    private int classId_;
                    private double doubleValue_;
                    private int enumValueId_;
                    private int flags_;
                    private float floatValue_;
                    private long intValue_;
                    private int stringValue_;
                    private Type type_ = Type.BYTE;
                    private Annotation annotation_ = Annotation.getDefaultInstance();
                    private List<Value> arrayElement_ = Collections.EMPTY_LIST;

                    /* JADX INFO: Access modifiers changed from: private */
                    public static Builder create() {
                        return new Builder();
                    }

                    private void ensureArrayElementIsMutable() {
                        if ((this.bitField0_ & 256) != 256) {
                            this.arrayElement_ = new ArrayList(this.arrayElement_);
                            this.bitField0_ |= 256;
                        }
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                    public Value build() {
                        Value valueBuildPartial = buildPartial();
                        if (valueBuildPartial.isInitialized()) {
                            return valueBuildPartial;
                        }
                        throw AbstractMessageLite.Builder.newUninitializedMessageException(valueBuildPartial);
                    }

                    public Value buildPartial() {
                        Value value = new Value(this);
                        int i11 = this.bitField0_;
                        int i12 = (i11 & 1) != 1 ? 0 : 1;
                        value.type_ = this.type_;
                        if ((i11 & 2) == 2) {
                            i12 |= 2;
                        }
                        value.intValue_ = this.intValue_;
                        if ((i11 & 4) == 4) {
                            i12 |= 4;
                        }
                        value.floatValue_ = this.floatValue_;
                        if ((i11 & 8) == 8) {
                            i12 |= 8;
                        }
                        value.doubleValue_ = this.doubleValue_;
                        if ((i11 & 16) == 16) {
                            i12 |= 16;
                        }
                        value.stringValue_ = this.stringValue_;
                        if ((i11 & 32) == 32) {
                            i12 |= 32;
                        }
                        value.classId_ = this.classId_;
                        if ((i11 & 64) == 64) {
                            i12 |= 64;
                        }
                        value.enumValueId_ = this.enumValueId_;
                        if ((i11 & 128) == 128) {
                            i12 |= 128;
                        }
                        value.annotation_ = this.annotation_;
                        if ((this.bitField0_ & 256) == 256) {
                            this.arrayElement_ = Collections.unmodifiableList(this.arrayElement_);
                            this.bitField0_ &= -257;
                        }
                        value.arrayElement_ = this.arrayElement_;
                        if ((i11 & 512) == 512) {
                            i12 |= 256;
                        }
                        value.arrayDimensionCount_ = this.arrayDimensionCount_;
                        if ((i11 & 1024) == 1024) {
                            i12 |= 512;
                        }
                        value.flags_ = this.flags_;
                        value.bitField0_ = i12;
                        return value;
                    }

                    public Annotation getAnnotation() {
                        return this.annotation_;
                    }

                    public Value getArrayElement(int i11) {
                        return this.arrayElement_.get(i11);
                    }

                    public int getArrayElementCount() {
                        return this.arrayElement_.size();
                    }

                    public boolean hasAnnotation() {
                        return (this.bitField0_ & 128) == 128;
                    }

                    public Builder mergeAnnotation(Annotation annotation) {
                        if ((this.bitField0_ & 128) != 128 || this.annotation_ == Annotation.getDefaultInstance()) {
                            this.annotation_ = annotation;
                        } else {
                            this.annotation_ = Annotation.newBuilder(this.annotation_).mergeFrom(annotation).buildPartial();
                        }
                        this.bitField0_ |= 128;
                        return this;
                    }

                    public Builder setArrayDimensionCount(int i11) {
                        this.bitField0_ |= 512;
                        this.arrayDimensionCount_ = i11;
                        return this;
                    }

                    public Builder setClassId(int i11) {
                        this.bitField0_ |= 32;
                        this.classId_ = i11;
                        return this;
                    }

                    public Builder setDoubleValue(double d11) {
                        this.bitField0_ |= 8;
                        this.doubleValue_ = d11;
                        return this;
                    }

                    public Builder setEnumValueId(int i11) {
                        this.bitField0_ |= 64;
                        this.enumValueId_ = i11;
                        return this;
                    }

                    public Builder setFlags(int i11) {
                        this.bitField0_ |= 1024;
                        this.flags_ = i11;
                        return this;
                    }

                    public Builder setFloatValue(float f11) {
                        this.bitField0_ |= 4;
                        this.floatValue_ = f11;
                        return this;
                    }

                    public Builder setIntValue(long j11) {
                        this.bitField0_ |= 2;
                        this.intValue_ = j11;
                        return this;
                    }

                    public Builder setStringValue(int i11) {
                        this.bitField0_ |= 16;
                        this.stringValue_ = i11;
                        return this;
                    }

                    private Builder() {
                        maybeForceBuilderInitialization();
                    }

                    public Builder addArrayElement(Builder builder) {
                        ensureArrayElementIsMutable();
                        this.arrayElement_.add(builder.build());
                        return this;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                    public Value getDefaultInstanceForType() {
                        return Value.getDefaultInstance();
                    }

                    @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        if (hasAnnotation() && !getAnnotation().isInitialized()) {
                            return false;
                        }
                        for (int i11 = 0; i11 < getArrayElementCount(); i11++) {
                            if (!getArrayElement(i11).isInitialized()) {
                                return false;
                            }
                        }
                        return true;
                    }

                    public Builder setAnnotation(Annotation annotation) {
                        annotation.getClass();
                        this.annotation_ = annotation;
                        this.bitField0_ |= 128;
                        return this;
                    }

                    public Builder setType(Type type) {
                        type.getClass();
                        this.bitField0_ |= 1;
                        this.type_ = type;
                        return this;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                    /* JADX INFO: renamed from: clone */
                    public Builder mo105124clone() {
                        return create().mergeFrom(buildPartial());
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                    public Builder mergeFrom(Value value) {
                        if (value == Value.getDefaultInstance()) {
                            return this;
                        }
                        if (value.hasType()) {
                            setType(value.getType());
                        }
                        if (value.hasIntValue()) {
                            setIntValue(value.getIntValue());
                        }
                        if (value.hasFloatValue()) {
                            setFloatValue(value.getFloatValue());
                        }
                        if (value.hasDoubleValue()) {
                            setDoubleValue(value.getDoubleValue());
                        }
                        if (value.hasStringValue()) {
                            setStringValue(value.getStringValue());
                        }
                        if (value.hasClassId()) {
                            setClassId(value.getClassId());
                        }
                        if (value.hasEnumValueId()) {
                            setEnumValueId(value.getEnumValueId());
                        }
                        if (value.hasAnnotation()) {
                            mergeAnnotation(value.getAnnotation());
                        }
                        if (!value.arrayElement_.isEmpty()) {
                            if (this.arrayElement_.isEmpty()) {
                                this.arrayElement_ = value.arrayElement_;
                                this.bitField0_ &= -257;
                            } else {
                                ensureArrayElementIsMutable();
                                this.arrayElement_.addAll(value.arrayElement_);
                            }
                        }
                        if (value.hasArrayDimensionCount()) {
                            setArrayDimensionCount(value.getArrayDimensionCount());
                        }
                        if (value.hasFlags()) {
                            setFlags(value.getFlags());
                        }
                        setUnknownFields(getUnknownFields().concat(value.unknownFields));
                        return this;
                    }

                    private void maybeForceBuilderInitialization() {
                    }

                    /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                    public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                        Value value = null;
                        try {
                            try {
                                Value partialFrom = Value.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                                if (partialFrom != null) {
                                    mergeFrom(partialFrom);
                                }
                                return this;
                            } catch (InvalidProtocolBufferException e11) {
                                Value value2 = (Value) e11.getUnfinishedMessage();
                                try {
                                    throw e11;
                                } catch (Throwable th2) {
                                    th = th2;
                                    value = value2;
                                    if (value != null) {
                                        mergeFrom(value);
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            if (value != null) {
                                mergeFrom(value);
                            }
                            throw th;
                        }
                    }
                }

                public enum Type implements Internal.EnumLite {
                    BYTE(0, 0),
                    CHAR(1, 1),
                    SHORT(2, 2),
                    INT(3, 3),
                    LONG(4, 4),
                    FLOAT(5, 5),
                    DOUBLE(6, 6),
                    BOOLEAN(7, 7),
                    STRING(8, 8),
                    CLASS(9, 9),
                    ENUM(10, 10),
                    ANNOTATION(11, 11),
                    ARRAY(12, 12);

                    private static Internal.EnumLiteMap<Type> internalValueMap = new Internal.EnumLiteMap<Type>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.1
                        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                        public Type findValueByNumber(int i11) {
                            return Type.valueOf(i11);
                        }
                    };
                    private final int value;

                    public static Type valueOf(int i11) {
                        switch (i11) {
                            case 0:
                                return BYTE;
                            case 1:
                                return CHAR;
                            case 2:
                                return SHORT;
                            case 3:
                                return INT;
                            case 4:
                                return LONG;
                            case 5:
                                return FLOAT;
                            case 6:
                                return DOUBLE;
                            case 7:
                                return BOOLEAN;
                            case 8:
                                return STRING;
                            case 9:
                                return CLASS;
                            case 10:
                                return ENUM;
                            case 11:
                                return ANNOTATION;
                            case 12:
                                return ARRAY;
                            default:
                                return null;
                        }
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                    public final int getNumber() {
                        return this.value;
                    }

                    Type(int i11, int i12) {
                        this.value = i12;
                    }
                }

                public static Builder newBuilder() {
                    return Builder.create();
                }

                static {
                    Value value = new Value(true);
                    defaultInstance = value;
                    value.initFields();
                }

                public static Value getDefaultInstance() {
                    return defaultInstance;
                }

                private void initFields() {
                    this.type_ = Type.BYTE;
                    this.intValue_ = 0L;
                    this.floatValue_ = 0.0f;
                    this.doubleValue_ = 0.0d;
                    this.stringValue_ = 0;
                    this.classId_ = 0;
                    this.enumValueId_ = 0;
                    this.annotation_ = Annotation.getDefaultInstance();
                    this.arrayElement_ = Collections.EMPTY_LIST;
                    this.arrayDimensionCount_ = 0;
                    this.flags_ = 0;
                }

                public static Builder newBuilder(Value value) {
                    return newBuilder().mergeFrom(value);
                }

                public Annotation getAnnotation() {
                    return this.annotation_;
                }

                public int getArrayDimensionCount() {
                    return this.arrayDimensionCount_;
                }

                public Value getArrayElement(int i11) {
                    return this.arrayElement_.get(i11);
                }

                public int getArrayElementCount() {
                    return this.arrayElement_.size();
                }

                public List<Value> getArrayElementList() {
                    return this.arrayElement_;
                }

                public int getClassId() {
                    return this.classId_;
                }

                @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public Value getDefaultInstanceForType() {
                    return defaultInstance;
                }

                public double getDoubleValue() {
                    return this.doubleValue_;
                }

                public int getEnumValueId() {
                    return this.enumValueId_;
                }

                public int getFlags() {
                    return this.flags_;
                }

                public float getFloatValue() {
                    return this.floatValue_;
                }

                public long getIntValue() {
                    return this.intValue_;
                }

                @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public Parser<Value> getParserForType() {
                    return PARSER;
                }

                @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public int getSerializedSize() {
                    int i11 = this.memoizedSerializedSize;
                    if (i11 != -1) {
                        return i11;
                    }
                    int iComputeEnumSize = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeEnumSize(1, this.type_.getNumber()) : 0;
                    if ((this.bitField0_ & 2) == 2) {
                        iComputeEnumSize += CodedOutputStream.computeSInt64Size(2, this.intValue_);
                    }
                    if ((this.bitField0_ & 4) == 4) {
                        iComputeEnumSize += CodedOutputStream.computeFloatSize(3, this.floatValue_);
                    }
                    if ((this.bitField0_ & 8) == 8) {
                        iComputeEnumSize += CodedOutputStream.computeDoubleSize(4, this.doubleValue_);
                    }
                    if ((this.bitField0_ & 16) == 16) {
                        iComputeEnumSize += CodedOutputStream.computeInt32Size(5, this.stringValue_);
                    }
                    if ((this.bitField0_ & 32) == 32) {
                        iComputeEnumSize += CodedOutputStream.computeInt32Size(6, this.classId_);
                    }
                    if ((this.bitField0_ & 64) == 64) {
                        iComputeEnumSize += CodedOutputStream.computeInt32Size(7, this.enumValueId_);
                    }
                    if ((this.bitField0_ & 128) == 128) {
                        iComputeEnumSize += CodedOutputStream.computeMessageSize(8, this.annotation_);
                    }
                    for (int i12 = 0; i12 < this.arrayElement_.size(); i12++) {
                        iComputeEnumSize += CodedOutputStream.computeMessageSize(9, this.arrayElement_.get(i12));
                    }
                    if ((this.bitField0_ & 512) == 512) {
                        iComputeEnumSize += CodedOutputStream.computeInt32Size(10, this.flags_);
                    }
                    if ((this.bitField0_ & 256) == 256) {
                        iComputeEnumSize += CodedOutputStream.computeInt32Size(11, this.arrayDimensionCount_);
                    }
                    int size = iComputeEnumSize + this.unknownFields.size();
                    this.memoizedSerializedSize = size;
                    return size;
                }

                public int getStringValue() {
                    return this.stringValue_;
                }

                public Type getType() {
                    return this.type_;
                }

                public boolean hasAnnotation() {
                    return (this.bitField0_ & 128) == 128;
                }

                public boolean hasArrayDimensionCount() {
                    return (this.bitField0_ & 256) == 256;
                }

                public boolean hasClassId() {
                    return (this.bitField0_ & 32) == 32;
                }

                public boolean hasDoubleValue() {
                    return (this.bitField0_ & 8) == 8;
                }

                public boolean hasEnumValueId() {
                    return (this.bitField0_ & 64) == 64;
                }

                public boolean hasFlags() {
                    return (this.bitField0_ & 512) == 512;
                }

                public boolean hasFloatValue() {
                    return (this.bitField0_ & 4) == 4;
                }

                public boolean hasIntValue() {
                    return (this.bitField0_ & 2) == 2;
                }

                public boolean hasStringValue() {
                    return (this.bitField0_ & 16) == 16;
                }

                public boolean hasType() {
                    return (this.bitField0_ & 1) == 1;
                }

                @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b11 = this.memoizedIsInitialized;
                    if (b11 == 1) {
                        return true;
                    }
                    if (b11 == 0) {
                        return false;
                    }
                    if (hasAnnotation() && !getAnnotation().isInitialized()) {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    }
                    for (int i11 = 0; i11 < getArrayElementCount(); i11++) {
                        if (!getArrayElement(i11).isInitialized()) {
                            this.memoizedIsInitialized = (byte) 0;
                            return false;
                        }
                    }
                    this.memoizedIsInitialized = (byte) 1;
                    return true;
                }

                @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public Builder newBuilderForType() {
                    return newBuilder();
                }

                @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public Builder toBuilder() {
                    return newBuilder(this);
                }

                private Value(GeneratedMessageLite.Builder builder) {
                    super(builder);
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = builder.getUnknownFields();
                }

                @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    getSerializedSize();
                    if ((this.bitField0_ & 1) == 1) {
                        codedOutputStream.writeEnum(1, this.type_.getNumber());
                    }
                    if ((this.bitField0_ & 2) == 2) {
                        codedOutputStream.writeSInt64(2, this.intValue_);
                    }
                    if ((this.bitField0_ & 4) == 4) {
                        codedOutputStream.writeFloat(3, this.floatValue_);
                    }
                    if ((this.bitField0_ & 8) == 8) {
                        codedOutputStream.writeDouble(4, this.doubleValue_);
                    }
                    if ((this.bitField0_ & 16) == 16) {
                        codedOutputStream.writeInt32(5, this.stringValue_);
                    }
                    if ((this.bitField0_ & 32) == 32) {
                        codedOutputStream.writeInt32(6, this.classId_);
                    }
                    if ((this.bitField0_ & 64) == 64) {
                        codedOutputStream.writeInt32(7, this.enumValueId_);
                    }
                    if ((this.bitField0_ & 128) == 128) {
                        codedOutputStream.writeMessage(8, this.annotation_);
                    }
                    for (int i11 = 0; i11 < this.arrayElement_.size(); i11++) {
                        codedOutputStream.writeMessage(9, this.arrayElement_.get(i11));
                    }
                    if ((this.bitField0_ & 512) == 512) {
                        codedOutputStream.writeInt32(10, this.flags_);
                    }
                    if ((this.bitField0_ & 256) == 256) {
                        codedOutputStream.writeInt32(11, this.arrayDimensionCount_);
                    }
                    codedOutputStream.writeRawBytes(this.unknownFields);
                }

                private Value(boolean z11) {
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = ByteString.EMPTY;
                }

                private Value(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    initFields();
                    ByteString.Output outputNewOutput = ByteString.newOutput();
                    CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
                    boolean z11 = false;
                    char c11 = 0;
                    while (!z11) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                switch (tag) {
                                    case 0:
                                        break;
                                    case 8:
                                        int i11 = codedInputStream.readEnum();
                                        Type typeValueOf = Type.valueOf(i11);
                                        if (typeValueOf == null) {
                                            codedOutputStreamNewInstance.writeRawVarint32(tag);
                                            codedOutputStreamNewInstance.writeRawVarint32(i11);
                                        } else {
                                            this.bitField0_ |= 1;
                                            this.type_ = typeValueOf;
                                            continue;
                                        }
                                        break;
                                    case 16:
                                        this.bitField0_ |= 2;
                                        this.intValue_ = codedInputStream.readSInt64();
                                        continue;
                                    case 29:
                                        this.bitField0_ |= 4;
                                        this.floatValue_ = codedInputStream.readFloat();
                                        continue;
                                    case 33:
                                        this.bitField0_ |= 8;
                                        this.doubleValue_ = codedInputStream.readDouble();
                                        continue;
                                    case 40:
                                        this.bitField0_ |= 16;
                                        this.stringValue_ = codedInputStream.readInt32();
                                        continue;
                                    case 48:
                                        this.bitField0_ |= 32;
                                        this.classId_ = codedInputStream.readInt32();
                                        continue;
                                    case 56:
                                        this.bitField0_ |= 64;
                                        this.enumValueId_ = codedInputStream.readInt32();
                                        continue;
                                    case 66:
                                        Builder builder = (this.bitField0_ & 128) == 128 ? this.annotation_.toBuilder() : null;
                                        Annotation annotation = (Annotation) codedInputStream.readMessage(Annotation.PARSER, extensionRegistryLite);
                                        this.annotation_ = annotation;
                                        if (builder != null) {
                                            builder.mergeFrom(annotation);
                                            this.annotation_ = builder.buildPartial();
                                        }
                                        this.bitField0_ |= 128;
                                        continue;
                                    case 74:
                                        if ((c11 & 256) != 256) {
                                            this.arrayElement_ = new ArrayList();
                                            c11 = 256;
                                        }
                                        this.arrayElement_.add((Value) codedInputStream.readMessage(PARSER, extensionRegistryLite));
                                        continue;
                                    case 80:
                                        this.bitField0_ |= 512;
                                        this.flags_ = codedInputStream.readInt32();
                                        continue;
                                    case 88:
                                        this.bitField0_ |= 256;
                                        this.arrayDimensionCount_ = codedInputStream.readInt32();
                                        continue;
                                    default:
                                        if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                            break;
                                        }
                                        break;
                                }
                                z11 = true;
                            } catch (Throwable th2) {
                                if ((c11 & 256) == 256) {
                                    this.arrayElement_ = Collections.unmodifiableList(this.arrayElement_);
                                }
                                try {
                                    codedOutputStreamNewInstance.flush();
                                } catch (IOException unused) {
                                } finally {
                                    this.unknownFields = outputNewOutput.toByteString();
                                }
                                makeExtensionsImmutable();
                                throw th2;
                            }
                        } catch (InvalidProtocolBufferException e11) {
                            throw e11.setUnfinishedMessage(this);
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                        }
                    }
                    if ((c11 & 256) == 256) {
                        this.arrayElement_ = Collections.unmodifiableList(this.arrayElement_);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused2) {
                    } finally {
                        this.unknownFields = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                }
            }

            public interface ValueOrBuilder extends MessageLiteOrBuilder {
            }

            private void initFields() {
                this.nameId_ = 0;
                this.value_ = Value.getDefaultInstance();
            }

            public static Builder newBuilder() {
                return Builder.create();
            }

            static {
                Argument argument = new Argument(true);
                defaultInstance = argument;
                argument.initFields();
            }

            public static Argument getDefaultInstance() {
                return defaultInstance;
            }

            public static Builder newBuilder(Argument argument) {
                return newBuilder().mergeFrom(argument);
            }

            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Argument getDefaultInstanceForType() {
                return defaultInstance;
            }

            public int getNameId() {
                return this.nameId_;
            }

            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Parser<Argument> getParserForType() {
                return PARSER;
            }

            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int getSerializedSize() {
                int i11 = this.memoizedSerializedSize;
                if (i11 != -1) {
                    return i11;
                }
                int iComputeInt32Size = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.nameId_) : 0;
                if ((this.bitField0_ & 2) == 2) {
                    iComputeInt32Size += CodedOutputStream.computeMessageSize(2, this.value_);
                }
                int size = iComputeInt32Size + this.unknownFields.size();
                this.memoizedSerializedSize = size;
                return size;
            }

            public Value getValue() {
                return this.value_;
            }

            public boolean hasNameId() {
                return (this.bitField0_ & 1) == 1;
            }

            public boolean hasValue() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b11 = this.memoizedIsInitialized;
                if (b11 == 1) {
                    return true;
                }
                if (b11 == 0) {
                    return false;
                }
                if (!hasNameId()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                if (!hasValue()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                if (getValue().isInitialized()) {
                    this.memoizedIsInitialized = (byte) 1;
                    return true;
                }
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }

            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder newBuilderForType() {
                return newBuilder();
            }

            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder toBuilder() {
                return newBuilder(this);
            }

            private Argument(GeneratedMessageLite.Builder builder) {
                super(builder);
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = builder.getUnknownFields();
            }

            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if ((this.bitField0_ & 1) == 1) {
                    codedOutputStream.writeInt32(1, this.nameId_);
                }
                if ((this.bitField0_ & 2) == 2) {
                    codedOutputStream.writeMessage(2, this.value_);
                }
                codedOutputStream.writeRawBytes(this.unknownFields);
            }

            private Argument(boolean z11) {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = ByteString.EMPTY;
            }

            private Argument(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                initFields();
                ByteString.Output outputNewOutput = ByteString.newOutput();
                CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
                boolean z11 = false;
                while (!z11) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.bitField0_ |= 1;
                                    this.nameId_ = codedInputStream.readInt32();
                                } else if (tag != 18) {
                                    if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    Value.Builder builder = (this.bitField0_ & 2) == 2 ? this.value_.toBuilder() : null;
                                    Value value = (Value) codedInputStream.readMessage(Value.PARSER, extensionRegistryLite);
                                    this.value_ = value;
                                    if (builder != null) {
                                        builder.mergeFrom(value);
                                        this.value_ = builder.buildPartial();
                                    }
                                    this.bitField0_ |= 2;
                                }
                            }
                            z11 = true;
                        } catch (Throwable th2) {
                            try {
                                codedOutputStreamNewInstance.flush();
                            } catch (IOException unused) {
                            } finally {
                                this.unknownFields = outputNewOutput.toByteString();
                            }
                            makeExtensionsImmutable();
                            throw th2;
                        }
                    } catch (InvalidProtocolBufferException e11) {
                        throw e11.setUnfinishedMessage(this);
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                    }
                }
                try {
                    codedOutputStreamNewInstance.flush();
                } catch (IOException unused2) {
                } finally {
                    this.unknownFields = outputNewOutput.toByteString();
                }
                makeExtensionsImmutable();
            }
        }

        public interface ArgumentOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Annotation, Builder> implements AnnotationOrBuilder {
            private List<Argument> argument_ = Collections.EMPTY_LIST;
            private int bitField0_;
            private int id_;

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            private void ensureArgumentIsMutable() {
                if ((this.bitField0_ & 2) != 2) {
                    this.argument_ = new ArrayList(this.argument_);
                    this.bitField0_ |= 2;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Annotation build() {
                Annotation annotationBuildPartial = buildPartial();
                if (annotationBuildPartial.isInitialized()) {
                    return annotationBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(annotationBuildPartial);
            }

            public Annotation buildPartial() {
                Annotation annotation = new Annotation(this);
                int i11 = (this.bitField0_ & 1) != 1 ? 0 : 1;
                annotation.id_ = this.id_;
                if ((this.bitField0_ & 2) == 2) {
                    this.argument_ = Collections.unmodifiableList(this.argument_);
                    this.bitField0_ &= -3;
                }
                annotation.argument_ = this.argument_;
                annotation.bitField0_ = i11;
                return annotation;
            }

            public Argument getArgument(int i11) {
                return this.argument_.get(i11);
            }

            public int getArgumentCount() {
                return this.argument_.size();
            }

            public boolean hasId() {
                return (this.bitField0_ & 1) == 1;
            }

            public Builder setId(int i11) {
                this.bitField0_ |= 1;
                this.id_ = i11;
                return this;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            public Builder addArgument(Argument.Builder builder) {
                ensureArgumentIsMutable();
                this.argument_.add(builder.build());
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Annotation getDefaultInstanceForType() {
                return Annotation.getDefaultInstance();
            }

            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasId()) {
                    return false;
                }
                for (int i11 = 0; i11 < getArgumentCount(); i11++) {
                    if (!getArgument(i11).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo105124clone() {
                return create().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Annotation annotation) {
                if (annotation == Annotation.getDefaultInstance()) {
                    return this;
                }
                if (annotation.hasId()) {
                    setId(annotation.getId());
                }
                if (!annotation.argument_.isEmpty()) {
                    if (this.argument_.isEmpty()) {
                        this.argument_ = annotation.argument_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureArgumentIsMutable();
                        this.argument_.addAll(annotation.argument_);
                    }
                }
                setUnknownFields(getUnknownFields().concat(annotation.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Annotation annotation = null;
                try {
                    try {
                        Annotation partialFrom = Annotation.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        Annotation annotation2 = (Annotation) e11.getUnfinishedMessage();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            annotation = annotation2;
                            if (annotation != null) {
                                mergeFrom(annotation);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (annotation != null) {
                        mergeFrom(annotation);
                    }
                    throw th;
                }
            }

            private void maybeForceBuilderInitialization() {
            }
        }

        private void initFields() {
            this.id_ = 0;
            this.argument_ = Collections.EMPTY_LIST;
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        static {
            Annotation annotation = new Annotation(true);
            defaultInstance = annotation;
            annotation.initFields();
        }

        public static Annotation getDefaultInstance() {
            return defaultInstance;
        }

        public static Builder newBuilder(Annotation annotation) {
            return newBuilder().mergeFrom(annotation);
        }

        public Argument getArgument(int i11) {
            return this.argument_.get(i11);
        }

        public int getArgumentCount() {
            return this.argument_.size();
        }

        public List<Argument> getArgumentList() {
            return this.argument_;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Annotation getDefaultInstanceForType() {
            return defaultInstance;
        }

        public int getId() {
            return this.id_;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Annotation> getParserForType() {
            return PARSER;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i11 = this.memoizedSerializedSize;
            if (i11 != -1) {
                return i11;
            }
            int iComputeInt32Size = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.id_) : 0;
            for (int i12 = 0; i12 < this.argument_.size(); i12++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(2, this.argument_.get(i12));
            }
            int size = iComputeInt32Size + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public boolean hasId() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b11 = this.memoizedIsInitialized;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            if (!hasId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i11 = 0; i11 < getArgumentCount(); i11++) {
                if (!getArgument(i11).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private Annotation(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.id_);
            }
            for (int i11 = 0; i11 < this.argument_.size(); i11++) {
                codedOutputStream.writeMessage(2, this.argument_.get(i11));
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        private Annotation(boolean z11) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        private Annotation(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z11 = false;
            char c11 = 0;
            while (!z11) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.bitField0_ |= 1;
                                this.id_ = codedInputStream.readInt32();
                            } else if (tag != 18) {
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                if ((c11 & 2) != 2) {
                                    this.argument_ = new ArrayList();
                                    c11 = 2;
                                }
                                this.argument_.add((Argument) codedInputStream.readMessage(Argument.PARSER, extensionRegistryLite));
                            }
                        }
                        z11 = true;
                    } catch (Throwable th2) {
                        if ((c11 & 2) == 2) {
                            this.argument_ = Collections.unmodifiableList(this.argument_);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.unknownFields = outputNewOutput.toByteString();
                        }
                        makeExtensionsImmutable();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.setUnfinishedMessage(this);
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                }
            }
            if ((c11 & 2) == 2) {
                this.argument_ = Collections.unmodifiableList(this.argument_);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface AnnotationOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Class extends GeneratedMessageLite.ExtendableMessage<Class> implements ClassOrBuilder {
        public static Parser<Class> PARSER = new AbstractParser<Class>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.1
            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public Class parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Class(codedInputStream, extensionRegistryLite);
            }
        };
        private static final Class defaultInstance;
        private List<Annotation> annotation_;
        private int bitField0_;
        private int companionObjectName_;
        private List<CompilerPluginData> compilerPluginData_;
        private List<Constructor> constructor_;
        private int contextReceiverTypeIdMemoizedSerializedSize;
        private List<Integer> contextReceiverTypeId_;
        private List<Type> contextReceiverType_;
        private List<EnumEntry> enumEntry_;
        private int flags_;
        private int fqName_;
        private List<Function> function_;
        private int inlineClassUnderlyingPropertyName_;
        private int inlineClassUnderlyingTypeId_;
        private Type inlineClassUnderlyingType_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int multiFieldValueClassUnderlyingNameMemoizedSerializedSize;
        private List<Integer> multiFieldValueClassUnderlyingName_;
        private int multiFieldValueClassUnderlyingTypeIdMemoizedSerializedSize;
        private List<Integer> multiFieldValueClassUnderlyingTypeId_;
        private List<Type> multiFieldValueClassUnderlyingType_;
        private int nestedClassNameMemoizedSerializedSize;
        private List<Integer> nestedClassName_;
        private List<Property> property_;
        private int sealedSubclassFqNameMemoizedSerializedSize;
        private List<Integer> sealedSubclassFqName_;
        private int supertypeIdMemoizedSerializedSize;
        private List<Integer> supertypeId_;
        private List<Type> supertype_;
        private List<TypeAlias> typeAlias_;
        private List<TypeParameter> typeParameter_;
        private TypeTable typeTable_;
        private final ByteString unknownFields;
        private VersionRequirementTable versionRequirementTable_;
        private List<Integer> versionRequirement_;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Class, Builder> implements ClassOrBuilder {
            private List<Annotation> annotation_;
            private int bitField0_;
            private int companionObjectName_;
            private List<CompilerPluginData> compilerPluginData_;
            private List<Constructor> constructor_;
            private List<Integer> contextReceiverTypeId_;
            private List<Type> contextReceiverType_;
            private List<EnumEntry> enumEntry_;
            private int flags_ = 6;
            private int fqName_;
            private List<Function> function_;
            private int inlineClassUnderlyingPropertyName_;
            private int inlineClassUnderlyingTypeId_;
            private Type inlineClassUnderlyingType_;
            private List<Integer> multiFieldValueClassUnderlyingName_;
            private List<Integer> multiFieldValueClassUnderlyingTypeId_;
            private List<Type> multiFieldValueClassUnderlyingType_;
            private List<Integer> nestedClassName_;
            private List<Property> property_;
            private List<Integer> sealedSubclassFqName_;
            private List<Integer> supertypeId_;
            private List<Type> supertype_;
            private List<TypeAlias> typeAlias_;
            private List<TypeParameter> typeParameter_;
            private TypeTable typeTable_;
            private VersionRequirementTable versionRequirementTable_;
            private List<Integer> versionRequirement_;

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            private void ensureAnnotationIsMutable() {
                if ((this.bitField0_ & 2097152) != 2097152) {
                    this.annotation_ = new ArrayList(this.annotation_);
                    this.bitField0_ |= 2097152;
                }
            }

            private void ensureCompilerPluginDataIsMutable() {
                if ((this.bitField0_ & 33554432) != 33554432) {
                    this.compilerPluginData_ = new ArrayList(this.compilerPluginData_);
                    this.bitField0_ |= 33554432;
                }
            }

            private void ensureConstructorIsMutable() {
                if ((this.bitField0_ & 512) != 512) {
                    this.constructor_ = new ArrayList(this.constructor_);
                    this.bitField0_ |= 512;
                }
            }

            private void ensureContextReceiverTypeIdIsMutable() {
                if ((this.bitField0_ & 256) != 256) {
                    this.contextReceiverTypeId_ = new ArrayList(this.contextReceiverTypeId_);
                    this.bitField0_ |= 256;
                }
            }

            private void ensureContextReceiverTypeIsMutable() {
                if ((this.bitField0_ & 128) != 128) {
                    this.contextReceiverType_ = new ArrayList(this.contextReceiverType_);
                    this.bitField0_ |= 128;
                }
            }

            private void ensureEnumEntryIsMutable() {
                if ((this.bitField0_ & 8192) != 8192) {
                    this.enumEntry_ = new ArrayList(this.enumEntry_);
                    this.bitField0_ |= 8192;
                }
            }

            private void ensureFunctionIsMutable() {
                if ((this.bitField0_ & 1024) != 1024) {
                    this.function_ = new ArrayList(this.function_);
                    this.bitField0_ |= 1024;
                }
            }

            private void ensureMultiFieldValueClassUnderlyingNameIsMutable() {
                if ((this.bitField0_ & 262144) != 262144) {
                    this.multiFieldValueClassUnderlyingName_ = new ArrayList(this.multiFieldValueClassUnderlyingName_);
                    this.bitField0_ |= 262144;
                }
            }

            private void ensureMultiFieldValueClassUnderlyingTypeIdIsMutable() {
                if ((this.bitField0_ & 1048576) != 1048576) {
                    this.multiFieldValueClassUnderlyingTypeId_ = new ArrayList(this.multiFieldValueClassUnderlyingTypeId_);
                    this.bitField0_ |= 1048576;
                }
            }

            private void ensureMultiFieldValueClassUnderlyingTypeIsMutable() {
                if ((this.bitField0_ & 524288) != 524288) {
                    this.multiFieldValueClassUnderlyingType_ = new ArrayList(this.multiFieldValueClassUnderlyingType_);
                    this.bitField0_ |= 524288;
                }
            }

            private void ensureNestedClassNameIsMutable() {
                if ((this.bitField0_ & 64) != 64) {
                    this.nestedClassName_ = new ArrayList(this.nestedClassName_);
                    this.bitField0_ |= 64;
                }
            }

            private void ensurePropertyIsMutable() {
                if ((this.bitField0_ & 2048) != 2048) {
                    this.property_ = new ArrayList(this.property_);
                    this.bitField0_ |= 2048;
                }
            }

            private void ensureSealedSubclassFqNameIsMutable() {
                if ((this.bitField0_ & 16384) != 16384) {
                    this.sealedSubclassFqName_ = new ArrayList(this.sealedSubclassFqName_);
                    this.bitField0_ |= 16384;
                }
            }

            private void ensureSupertypeIdIsMutable() {
                if ((this.bitField0_ & 32) != 32) {
                    this.supertypeId_ = new ArrayList(this.supertypeId_);
                    this.bitField0_ |= 32;
                }
            }

            private void ensureSupertypeIsMutable() {
                if ((this.bitField0_ & 16) != 16) {
                    this.supertype_ = new ArrayList(this.supertype_);
                    this.bitField0_ |= 16;
                }
            }

            private void ensureTypeAliasIsMutable() {
                if ((this.bitField0_ & 4096) != 4096) {
                    this.typeAlias_ = new ArrayList(this.typeAlias_);
                    this.bitField0_ |= 4096;
                }
            }

            private void ensureTypeParameterIsMutable() {
                if ((this.bitField0_ & 8) != 8) {
                    this.typeParameter_ = new ArrayList(this.typeParameter_);
                    this.bitField0_ |= 8;
                }
            }

            private void ensureVersionRequirementIsMutable() {
                if ((this.bitField0_ & 8388608) != 8388608) {
                    this.versionRequirement_ = new ArrayList(this.versionRequirement_);
                    this.bitField0_ |= 8388608;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Class build() {
                Class classBuildPartial = buildPartial();
                if (classBuildPartial.isInitialized()) {
                    return classBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(classBuildPartial);
            }

            public Class buildPartial() {
                Class r11 = new Class(this);
                int i11 = this.bitField0_;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                r11.flags_ = this.flags_;
                if ((i11 & 2) == 2) {
                    i12 |= 2;
                }
                r11.fqName_ = this.fqName_;
                if ((i11 & 4) == 4) {
                    i12 |= 4;
                }
                r11.companionObjectName_ = this.companionObjectName_;
                if ((this.bitField0_ & 8) == 8) {
                    this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                    this.bitField0_ &= -9;
                }
                r11.typeParameter_ = this.typeParameter_;
                if ((this.bitField0_ & 16) == 16) {
                    this.supertype_ = Collections.unmodifiableList(this.supertype_);
                    this.bitField0_ &= -17;
                }
                r11.supertype_ = this.supertype_;
                if ((this.bitField0_ & 32) == 32) {
                    this.supertypeId_ = Collections.unmodifiableList(this.supertypeId_);
                    this.bitField0_ &= -33;
                }
                r11.supertypeId_ = this.supertypeId_;
                if ((this.bitField0_ & 64) == 64) {
                    this.nestedClassName_ = Collections.unmodifiableList(this.nestedClassName_);
                    this.bitField0_ &= -65;
                }
                r11.nestedClassName_ = this.nestedClassName_;
                if ((this.bitField0_ & 128) == 128) {
                    this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                    this.bitField0_ &= -129;
                }
                r11.contextReceiverType_ = this.contextReceiverType_;
                if ((this.bitField0_ & 256) == 256) {
                    this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                    this.bitField0_ &= -257;
                }
                r11.contextReceiverTypeId_ = this.contextReceiverTypeId_;
                if ((this.bitField0_ & 512) == 512) {
                    this.constructor_ = Collections.unmodifiableList(this.constructor_);
                    this.bitField0_ &= -513;
                }
                r11.constructor_ = this.constructor_;
                if ((this.bitField0_ & 1024) == 1024) {
                    this.function_ = Collections.unmodifiableList(this.function_);
                    this.bitField0_ &= -1025;
                }
                r11.function_ = this.function_;
                if ((this.bitField0_ & 2048) == 2048) {
                    this.property_ = Collections.unmodifiableList(this.property_);
                    this.bitField0_ &= -2049;
                }
                r11.property_ = this.property_;
                if ((this.bitField0_ & 4096) == 4096) {
                    this.typeAlias_ = Collections.unmodifiableList(this.typeAlias_);
                    this.bitField0_ &= -4097;
                }
                r11.typeAlias_ = this.typeAlias_;
                if ((this.bitField0_ & 8192) == 8192) {
                    this.enumEntry_ = Collections.unmodifiableList(this.enumEntry_);
                    this.bitField0_ &= -8193;
                }
                r11.enumEntry_ = this.enumEntry_;
                if ((this.bitField0_ & 16384) == 16384) {
                    this.sealedSubclassFqName_ = Collections.unmodifiableList(this.sealedSubclassFqName_);
                    this.bitField0_ &= -16385;
                }
                r11.sealedSubclassFqName_ = this.sealedSubclassFqName_;
                if ((i11 & 32768) == 32768) {
                    i12 |= 8;
                }
                r11.inlineClassUnderlyingPropertyName_ = this.inlineClassUnderlyingPropertyName_;
                if ((i11 & 65536) == 65536) {
                    i12 |= 16;
                }
                r11.inlineClassUnderlyingType_ = this.inlineClassUnderlyingType_;
                if ((i11 & 131072) == 131072) {
                    i12 |= 32;
                }
                r11.inlineClassUnderlyingTypeId_ = this.inlineClassUnderlyingTypeId_;
                if ((this.bitField0_ & 262144) == 262144) {
                    this.multiFieldValueClassUnderlyingName_ = Collections.unmodifiableList(this.multiFieldValueClassUnderlyingName_);
                    this.bitField0_ &= -262145;
                }
                r11.multiFieldValueClassUnderlyingName_ = this.multiFieldValueClassUnderlyingName_;
                if ((this.bitField0_ & 524288) == 524288) {
                    this.multiFieldValueClassUnderlyingType_ = Collections.unmodifiableList(this.multiFieldValueClassUnderlyingType_);
                    this.bitField0_ &= -524289;
                }
                r11.multiFieldValueClassUnderlyingType_ = this.multiFieldValueClassUnderlyingType_;
                if ((this.bitField0_ & 1048576) == 1048576) {
                    this.multiFieldValueClassUnderlyingTypeId_ = Collections.unmodifiableList(this.multiFieldValueClassUnderlyingTypeId_);
                    this.bitField0_ &= -1048577;
                }
                r11.multiFieldValueClassUnderlyingTypeId_ = this.multiFieldValueClassUnderlyingTypeId_;
                if ((this.bitField0_ & 2097152) == 2097152) {
                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
                    this.bitField0_ &= -2097153;
                }
                r11.annotation_ = this.annotation_;
                if ((4194304 & i11) == 4194304) {
                    i12 |= 64;
                }
                r11.typeTable_ = this.typeTable_;
                if ((this.bitField0_ & 8388608) == 8388608) {
                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    this.bitField0_ &= -8388609;
                }
                r11.versionRequirement_ = this.versionRequirement_;
                if ((i11 & 16777216) == 16777216) {
                    i12 |= 128;
                }
                r11.versionRequirementTable_ = this.versionRequirementTable_;
                if ((this.bitField0_ & 33554432) == 33554432) {
                    this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                    this.bitField0_ &= -33554433;
                }
                r11.compilerPluginData_ = this.compilerPluginData_;
                r11.bitField0_ = i12;
                return r11;
            }

            public Annotation getAnnotation(int i11) {
                return this.annotation_.get(i11);
            }

            public int getAnnotationCount() {
                return this.annotation_.size();
            }

            public CompilerPluginData getCompilerPluginData(int i11) {
                return this.compilerPluginData_.get(i11);
            }

            public int getCompilerPluginDataCount() {
                return this.compilerPluginData_.size();
            }

            public Constructor getConstructor(int i11) {
                return this.constructor_.get(i11);
            }

            public int getConstructorCount() {
                return this.constructor_.size();
            }

            public Type getContextReceiverType(int i11) {
                return this.contextReceiverType_.get(i11);
            }

            public int getContextReceiverTypeCount() {
                return this.contextReceiverType_.size();
            }

            public EnumEntry getEnumEntry(int i11) {
                return this.enumEntry_.get(i11);
            }

            public int getEnumEntryCount() {
                return this.enumEntry_.size();
            }

            public Function getFunction(int i11) {
                return this.function_.get(i11);
            }

            public int getFunctionCount() {
                return this.function_.size();
            }

            public Type getInlineClassUnderlyingType() {
                return this.inlineClassUnderlyingType_;
            }

            public Type getMultiFieldValueClassUnderlyingType(int i11) {
                return this.multiFieldValueClassUnderlyingType_.get(i11);
            }

            public int getMultiFieldValueClassUnderlyingTypeCount() {
                return this.multiFieldValueClassUnderlyingType_.size();
            }

            public Property getProperty(int i11) {
                return this.property_.get(i11);
            }

            public int getPropertyCount() {
                return this.property_.size();
            }

            public Type getSupertype(int i11) {
                return this.supertype_.get(i11);
            }

            public int getSupertypeCount() {
                return this.supertype_.size();
            }

            public TypeAlias getTypeAlias(int i11) {
                return this.typeAlias_.get(i11);
            }

            public int getTypeAliasCount() {
                return this.typeAlias_.size();
            }

            public TypeParameter getTypeParameter(int i11) {
                return this.typeParameter_.get(i11);
            }

            public int getTypeParameterCount() {
                return this.typeParameter_.size();
            }

            public TypeTable getTypeTable() {
                return this.typeTable_;
            }

            public boolean hasFqName() {
                return (this.bitField0_ & 2) == 2;
            }

            public boolean hasInlineClassUnderlyingType() {
                return (this.bitField0_ & 65536) == 65536;
            }

            public boolean hasTypeTable() {
                return (this.bitField0_ & 4194304) == 4194304;
            }

            public Builder mergeInlineClassUnderlyingType(Type type) {
                if ((this.bitField0_ & 65536) != 65536 || this.inlineClassUnderlyingType_ == Type.getDefaultInstance()) {
                    this.inlineClassUnderlyingType_ = type;
                } else {
                    this.inlineClassUnderlyingType_ = Type.newBuilder(this.inlineClassUnderlyingType_).mergeFrom(type).buildPartial();
                }
                this.bitField0_ |= 65536;
                return this;
            }

            public Builder mergeTypeTable(TypeTable typeTable) {
                if ((this.bitField0_ & 4194304) != 4194304 || this.typeTable_ == TypeTable.getDefaultInstance()) {
                    this.typeTable_ = typeTable;
                } else {
                    this.typeTable_ = TypeTable.newBuilder(this.typeTable_).mergeFrom(typeTable).buildPartial();
                }
                this.bitField0_ |= 4194304;
                return this;
            }

            public Builder mergeVersionRequirementTable(VersionRequirementTable versionRequirementTable) {
                if ((this.bitField0_ & 16777216) != 16777216 || this.versionRequirementTable_ == VersionRequirementTable.getDefaultInstance()) {
                    this.versionRequirementTable_ = versionRequirementTable;
                } else {
                    this.versionRequirementTable_ = VersionRequirementTable.newBuilder(this.versionRequirementTable_).mergeFrom(versionRequirementTable).buildPartial();
                }
                this.bitField0_ |= 16777216;
                return this;
            }

            public Builder setCompanionObjectName(int i11) {
                this.bitField0_ |= 4;
                this.companionObjectName_ = i11;
                return this;
            }

            public Builder setFlags(int i11) {
                this.bitField0_ |= 1;
                this.flags_ = i11;
                return this;
            }

            public Builder setFqName(int i11) {
                this.bitField0_ |= 2;
                this.fqName_ = i11;
                return this;
            }

            public Builder setInlineClassUnderlyingPropertyName(int i11) {
                this.bitField0_ |= 32768;
                this.inlineClassUnderlyingPropertyName_ = i11;
                return this;
            }

            public Builder setInlineClassUnderlyingTypeId(int i11) {
                this.bitField0_ |= 131072;
                this.inlineClassUnderlyingTypeId_ = i11;
                return this;
            }

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.typeParameter_ = list;
                this.supertype_ = list;
                this.supertypeId_ = list;
                this.nestedClassName_ = list;
                this.contextReceiverType_ = list;
                this.contextReceiverTypeId_ = list;
                this.constructor_ = list;
                this.function_ = list;
                this.property_ = list;
                this.typeAlias_ = list;
                this.enumEntry_ = list;
                this.sealedSubclassFqName_ = list;
                this.inlineClassUnderlyingType_ = Type.getDefaultInstance();
                this.multiFieldValueClassUnderlyingName_ = list;
                this.multiFieldValueClassUnderlyingType_ = list;
                this.multiFieldValueClassUnderlyingTypeId_ = list;
                this.annotation_ = list;
                this.typeTable_ = TypeTable.getDefaultInstance();
                this.versionRequirement_ = list;
                this.versionRequirementTable_ = VersionRequirementTable.getDefaultInstance();
                this.compilerPluginData_ = list;
                maybeForceBuilderInitialization();
            }

            public Builder addAllAnnotation(Iterable<? extends Annotation> iterable) {
                ensureAnnotationIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.annotation_);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Class getDefaultInstanceForType() {
                return Class.getDefaultInstance();
            }

            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasFqName()) {
                    return false;
                }
                for (int i11 = 0; i11 < getTypeParameterCount(); i11++) {
                    if (!getTypeParameter(i11).isInitialized()) {
                        return false;
                    }
                }
                for (int i12 = 0; i12 < getSupertypeCount(); i12++) {
                    if (!getSupertype(i12).isInitialized()) {
                        return false;
                    }
                }
                for (int i13 = 0; i13 < getContextReceiverTypeCount(); i13++) {
                    if (!getContextReceiverType(i13).isInitialized()) {
                        return false;
                    }
                }
                for (int i14 = 0; i14 < getConstructorCount(); i14++) {
                    if (!getConstructor(i14).isInitialized()) {
                        return false;
                    }
                }
                for (int i15 = 0; i15 < getFunctionCount(); i15++) {
                    if (!getFunction(i15).isInitialized()) {
                        return false;
                    }
                }
                for (int i16 = 0; i16 < getPropertyCount(); i16++) {
                    if (!getProperty(i16).isInitialized()) {
                        return false;
                    }
                }
                for (int i17 = 0; i17 < getTypeAliasCount(); i17++) {
                    if (!getTypeAlias(i17).isInitialized()) {
                        return false;
                    }
                }
                for (int i18 = 0; i18 < getEnumEntryCount(); i18++) {
                    if (!getEnumEntry(i18).isInitialized()) {
                        return false;
                    }
                }
                if (hasInlineClassUnderlyingType() && !getInlineClassUnderlyingType().isInitialized()) {
                    return false;
                }
                for (int i19 = 0; i19 < getMultiFieldValueClassUnderlyingTypeCount(); i19++) {
                    if (!getMultiFieldValueClassUnderlyingType(i19).isInitialized()) {
                        return false;
                    }
                }
                for (int i21 = 0; i21 < getAnnotationCount(); i21++) {
                    if (!getAnnotation(i21).isInitialized()) {
                        return false;
                    }
                }
                if (hasTypeTable() && !getTypeTable().isInitialized()) {
                    return false;
                }
                for (int i22 = 0; i22 < getCompilerPluginDataCount(); i22++) {
                    if (!getCompilerPluginData(i22).isInitialized()) {
                        return false;
                    }
                }
                if (!extensionsAreInitialized()) {
                    return false;
                }
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Class r11) {
                if (r11 == Class.getDefaultInstance()) {
                    return this;
                }
                if (r11.hasFlags()) {
                    setFlags(r11.getFlags());
                }
                if (r11.hasFqName()) {
                    setFqName(r11.getFqName());
                }
                if (r11.hasCompanionObjectName()) {
                    setCompanionObjectName(r11.getCompanionObjectName());
                }
                if (!r11.typeParameter_.isEmpty()) {
                    if (this.typeParameter_.isEmpty()) {
                        this.typeParameter_ = r11.typeParameter_;
                        this.bitField0_ &= -9;
                    } else {
                        ensureTypeParameterIsMutable();
                        this.typeParameter_.addAll(r11.typeParameter_);
                    }
                }
                if (!r11.supertype_.isEmpty()) {
                    if (this.supertype_.isEmpty()) {
                        this.supertype_ = r11.supertype_;
                        this.bitField0_ &= -17;
                    } else {
                        ensureSupertypeIsMutable();
                        this.supertype_.addAll(r11.supertype_);
                    }
                }
                if (!r11.supertypeId_.isEmpty()) {
                    if (this.supertypeId_.isEmpty()) {
                        this.supertypeId_ = r11.supertypeId_;
                        this.bitField0_ &= -33;
                    } else {
                        ensureSupertypeIdIsMutable();
                        this.supertypeId_.addAll(r11.supertypeId_);
                    }
                }
                if (!r11.nestedClassName_.isEmpty()) {
                    if (this.nestedClassName_.isEmpty()) {
                        this.nestedClassName_ = r11.nestedClassName_;
                        this.bitField0_ &= -65;
                    } else {
                        ensureNestedClassNameIsMutable();
                        this.nestedClassName_.addAll(r11.nestedClassName_);
                    }
                }
                if (!r11.contextReceiverType_.isEmpty()) {
                    if (this.contextReceiverType_.isEmpty()) {
                        this.contextReceiverType_ = r11.contextReceiverType_;
                        this.bitField0_ &= -129;
                    } else {
                        ensureContextReceiverTypeIsMutable();
                        this.contextReceiverType_.addAll(r11.contextReceiverType_);
                    }
                }
                if (!r11.contextReceiverTypeId_.isEmpty()) {
                    if (this.contextReceiverTypeId_.isEmpty()) {
                        this.contextReceiverTypeId_ = r11.contextReceiverTypeId_;
                        this.bitField0_ &= -257;
                    } else {
                        ensureContextReceiverTypeIdIsMutable();
                        this.contextReceiverTypeId_.addAll(r11.contextReceiverTypeId_);
                    }
                }
                if (!r11.constructor_.isEmpty()) {
                    if (this.constructor_.isEmpty()) {
                        this.constructor_ = r11.constructor_;
                        this.bitField0_ &= -513;
                    } else {
                        ensureConstructorIsMutable();
                        this.constructor_.addAll(r11.constructor_);
                    }
                }
                if (!r11.function_.isEmpty()) {
                    if (this.function_.isEmpty()) {
                        this.function_ = r11.function_;
                        this.bitField0_ &= -1025;
                    } else {
                        ensureFunctionIsMutable();
                        this.function_.addAll(r11.function_);
                    }
                }
                if (!r11.property_.isEmpty()) {
                    if (this.property_.isEmpty()) {
                        this.property_ = r11.property_;
                        this.bitField0_ &= -2049;
                    } else {
                        ensurePropertyIsMutable();
                        this.property_.addAll(r11.property_);
                    }
                }
                if (!r11.typeAlias_.isEmpty()) {
                    if (this.typeAlias_.isEmpty()) {
                        this.typeAlias_ = r11.typeAlias_;
                        this.bitField0_ &= -4097;
                    } else {
                        ensureTypeAliasIsMutable();
                        this.typeAlias_.addAll(r11.typeAlias_);
                    }
                }
                if (!r11.enumEntry_.isEmpty()) {
                    if (this.enumEntry_.isEmpty()) {
                        this.enumEntry_ = r11.enumEntry_;
                        this.bitField0_ &= -8193;
                    } else {
                        ensureEnumEntryIsMutable();
                        this.enumEntry_.addAll(r11.enumEntry_);
                    }
                }
                if (!r11.sealedSubclassFqName_.isEmpty()) {
                    if (this.sealedSubclassFqName_.isEmpty()) {
                        this.sealedSubclassFqName_ = r11.sealedSubclassFqName_;
                        this.bitField0_ &= -16385;
                    } else {
                        ensureSealedSubclassFqNameIsMutable();
                        this.sealedSubclassFqName_.addAll(r11.sealedSubclassFqName_);
                    }
                }
                if (r11.hasInlineClassUnderlyingPropertyName()) {
                    setInlineClassUnderlyingPropertyName(r11.getInlineClassUnderlyingPropertyName());
                }
                if (r11.hasInlineClassUnderlyingType()) {
                    mergeInlineClassUnderlyingType(r11.getInlineClassUnderlyingType());
                }
                if (r11.hasInlineClassUnderlyingTypeId()) {
                    setInlineClassUnderlyingTypeId(r11.getInlineClassUnderlyingTypeId());
                }
                if (!r11.multiFieldValueClassUnderlyingName_.isEmpty()) {
                    if (this.multiFieldValueClassUnderlyingName_.isEmpty()) {
                        this.multiFieldValueClassUnderlyingName_ = r11.multiFieldValueClassUnderlyingName_;
                        this.bitField0_ &= -262145;
                    } else {
                        ensureMultiFieldValueClassUnderlyingNameIsMutable();
                        this.multiFieldValueClassUnderlyingName_.addAll(r11.multiFieldValueClassUnderlyingName_);
                    }
                }
                if (!r11.multiFieldValueClassUnderlyingType_.isEmpty()) {
                    if (this.multiFieldValueClassUnderlyingType_.isEmpty()) {
                        this.multiFieldValueClassUnderlyingType_ = r11.multiFieldValueClassUnderlyingType_;
                        this.bitField0_ &= -524289;
                    } else {
                        ensureMultiFieldValueClassUnderlyingTypeIsMutable();
                        this.multiFieldValueClassUnderlyingType_.addAll(r11.multiFieldValueClassUnderlyingType_);
                    }
                }
                if (!r11.multiFieldValueClassUnderlyingTypeId_.isEmpty()) {
                    if (this.multiFieldValueClassUnderlyingTypeId_.isEmpty()) {
                        this.multiFieldValueClassUnderlyingTypeId_ = r11.multiFieldValueClassUnderlyingTypeId_;
                        this.bitField0_ &= -1048577;
                    } else {
                        ensureMultiFieldValueClassUnderlyingTypeIdIsMutable();
                        this.multiFieldValueClassUnderlyingTypeId_.addAll(r11.multiFieldValueClassUnderlyingTypeId_);
                    }
                }
                if (!r11.annotation_.isEmpty()) {
                    if (this.annotation_.isEmpty()) {
                        this.annotation_ = r11.annotation_;
                        this.bitField0_ &= -2097153;
                    } else {
                        ensureAnnotationIsMutable();
                        this.annotation_.addAll(r11.annotation_);
                    }
                }
                if (r11.hasTypeTable()) {
                    mergeTypeTable(r11.getTypeTable());
                }
                if (!r11.versionRequirement_.isEmpty()) {
                    if (this.versionRequirement_.isEmpty()) {
                        this.versionRequirement_ = r11.versionRequirement_;
                        this.bitField0_ &= -8388609;
                    } else {
                        ensureVersionRequirementIsMutable();
                        this.versionRequirement_.addAll(r11.versionRequirement_);
                    }
                }
                if (r11.hasVersionRequirementTable()) {
                    mergeVersionRequirementTable(r11.getVersionRequirementTable());
                }
                if (!r11.compilerPluginData_.isEmpty()) {
                    if (this.compilerPluginData_.isEmpty()) {
                        this.compilerPluginData_ = r11.compilerPluginData_;
                        this.bitField0_ &= -33554433;
                    } else {
                        ensureCompilerPluginDataIsMutable();
                        this.compilerPluginData_.addAll(r11.compilerPluginData_);
                    }
                }
                mergeExtensionFields(r11);
                setUnknownFields(getUnknownFields().concat(r11.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo105124clone() {
                return create().mergeFrom(buildPartial());
            }

            private void maybeForceBuilderInitialization() {
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Class r11 = null;
                try {
                    try {
                        Class partialFrom = Class.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        Class r12 = (Class) e11.getUnfinishedMessage();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            r11 = r12;
                            if (r11 != null) {
                                mergeFrom(r11);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (r11 != null) {
                        mergeFrom(r11);
                    }
                    throw th;
                }
            }
        }

        public enum Kind implements Internal.EnumLite {
            CLASS(0, 0),
            INTERFACE(1, 1),
            ENUM_CLASS(2, 2),
            ENUM_ENTRY(3, 3),
            ANNOTATION_CLASS(4, 4),
            OBJECT(5, 5),
            COMPANION_OBJECT(6, 6);

            private static Internal.EnumLiteMap<Kind> internalValueMap = new Internal.EnumLiteMap<Kind>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.1
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                public Kind findValueByNumber(int i11) {
                    return Kind.valueOf(i11);
                }
            };
            private final int value;

            public static Kind valueOf(int i11) {
                switch (i11) {
                    case 0:
                        return CLASS;
                    case 1:
                        return INTERFACE;
                    case 2:
                        return ENUM_CLASS;
                    case 3:
                        return ENUM_ENTRY;
                    case 4:
                        return ANNOTATION_CLASS;
                    case 5:
                        return OBJECT;
                    case 6:
                        return COMPANION_OBJECT;
                    default:
                        return null;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            Kind(int i11, int i12) {
                this.value = i12;
            }
        }

        private void initFields() {
            this.flags_ = 6;
            this.fqName_ = 0;
            this.companionObjectName_ = 0;
            List list = Collections.EMPTY_LIST;
            this.typeParameter_ = list;
            this.supertype_ = list;
            this.supertypeId_ = list;
            this.nestedClassName_ = list;
            this.contextReceiverType_ = list;
            this.contextReceiverTypeId_ = list;
            this.constructor_ = list;
            this.function_ = list;
            this.property_ = list;
            this.typeAlias_ = list;
            this.enumEntry_ = list;
            this.sealedSubclassFqName_ = list;
            this.inlineClassUnderlyingPropertyName_ = 0;
            this.inlineClassUnderlyingType_ = Type.getDefaultInstance();
            this.inlineClassUnderlyingTypeId_ = 0;
            this.multiFieldValueClassUnderlyingName_ = list;
            this.multiFieldValueClassUnderlyingType_ = list;
            this.multiFieldValueClassUnderlyingTypeId_ = list;
            this.annotation_ = list;
            this.typeTable_ = TypeTable.getDefaultInstance();
            this.versionRequirement_ = list;
            this.versionRequirementTable_ = VersionRequirementTable.getDefaultInstance();
            this.compilerPluginData_ = list;
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i11 = this.memoizedSerializedSize;
            if (i11 != -1) {
                return i11;
            }
            int iComputeInt32Size = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.flags_) : 0;
            int iComputeInt32SizeNoTag = 0;
            for (int i12 = 0; i12 < this.supertypeId_.size(); i12++) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(this.supertypeId_.get(i12).intValue());
            }
            int iComputeMessageSize = iComputeInt32Size + iComputeInt32SizeNoTag;
            if (!getSupertypeIdList().isEmpty()) {
                iComputeMessageSize = iComputeMessageSize + 1 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag);
            }
            this.supertypeIdMemoizedSerializedSize = iComputeInt32SizeNoTag;
            if ((this.bitField0_ & 2) == 2) {
                iComputeMessageSize += CodedOutputStream.computeInt32Size(3, this.fqName_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeMessageSize += CodedOutputStream.computeInt32Size(4, this.companionObjectName_);
            }
            for (int i13 = 0; i13 < this.typeParameter_.size(); i13++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, this.typeParameter_.get(i13));
            }
            for (int i14 = 0; i14 < this.supertype_.size(); i14++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, this.supertype_.get(i14));
            }
            int iComputeInt32SizeNoTag2 = 0;
            for (int i15 = 0; i15 < this.nestedClassName_.size(); i15++) {
                iComputeInt32SizeNoTag2 += CodedOutputStream.computeInt32SizeNoTag(this.nestedClassName_.get(i15).intValue());
            }
            int iComputeMessageSize2 = iComputeMessageSize + iComputeInt32SizeNoTag2;
            if (!getNestedClassNameList().isEmpty()) {
                iComputeMessageSize2 = iComputeMessageSize2 + 1 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag2);
            }
            this.nestedClassNameMemoizedSerializedSize = iComputeInt32SizeNoTag2;
            for (int i16 = 0; i16 < this.constructor_.size(); i16++) {
                iComputeMessageSize2 += CodedOutputStream.computeMessageSize(8, this.constructor_.get(i16));
            }
            for (int i17 = 0; i17 < this.function_.size(); i17++) {
                iComputeMessageSize2 += CodedOutputStream.computeMessageSize(9, this.function_.get(i17));
            }
            for (int i18 = 0; i18 < this.property_.size(); i18++) {
                iComputeMessageSize2 += CodedOutputStream.computeMessageSize(10, this.property_.get(i18));
            }
            for (int i19 = 0; i19 < this.typeAlias_.size(); i19++) {
                iComputeMessageSize2 += CodedOutputStream.computeMessageSize(11, this.typeAlias_.get(i19));
            }
            for (int i21 = 0; i21 < this.enumEntry_.size(); i21++) {
                iComputeMessageSize2 += CodedOutputStream.computeMessageSize(13, this.enumEntry_.get(i21));
            }
            int iComputeInt32SizeNoTag3 = 0;
            for (int i22 = 0; i22 < this.sealedSubclassFqName_.size(); i22++) {
                iComputeInt32SizeNoTag3 += CodedOutputStream.computeInt32SizeNoTag(this.sealedSubclassFqName_.get(i22).intValue());
            }
            int iComputeMessageSize3 = iComputeMessageSize2 + iComputeInt32SizeNoTag3;
            if (!getSealedSubclassFqNameList().isEmpty()) {
                iComputeMessageSize3 = iComputeMessageSize3 + 2 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag3);
            }
            this.sealedSubclassFqNameMemoizedSerializedSize = iComputeInt32SizeNoTag3;
            if ((this.bitField0_ & 8) == 8) {
                iComputeMessageSize3 += CodedOutputStream.computeInt32Size(17, this.inlineClassUnderlyingPropertyName_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iComputeMessageSize3 += CodedOutputStream.computeMessageSize(18, this.inlineClassUnderlyingType_);
            }
            if ((this.bitField0_ & 32) == 32) {
                iComputeMessageSize3 += CodedOutputStream.computeInt32Size(19, this.inlineClassUnderlyingTypeId_);
            }
            for (int i23 = 0; i23 < this.contextReceiverType_.size(); i23++) {
                iComputeMessageSize3 += CodedOutputStream.computeMessageSize(20, this.contextReceiverType_.get(i23));
            }
            int iComputeInt32SizeNoTag4 = 0;
            for (int i24 = 0; i24 < this.contextReceiverTypeId_.size(); i24++) {
                iComputeInt32SizeNoTag4 += CodedOutputStream.computeInt32SizeNoTag(this.contextReceiverTypeId_.get(i24).intValue());
            }
            int iComputeInt32SizeNoTag5 = iComputeMessageSize3 + iComputeInt32SizeNoTag4;
            if (!getContextReceiverTypeIdList().isEmpty()) {
                iComputeInt32SizeNoTag5 = iComputeInt32SizeNoTag5 + 2 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag4);
            }
            this.contextReceiverTypeIdMemoizedSerializedSize = iComputeInt32SizeNoTag4;
            int iComputeInt32SizeNoTag6 = 0;
            for (int i25 = 0; i25 < this.multiFieldValueClassUnderlyingName_.size(); i25++) {
                iComputeInt32SizeNoTag6 += CodedOutputStream.computeInt32SizeNoTag(this.multiFieldValueClassUnderlyingName_.get(i25).intValue());
            }
            int iComputeMessageSize4 = iComputeInt32SizeNoTag5 + iComputeInt32SizeNoTag6;
            if (!getMultiFieldValueClassUnderlyingNameList().isEmpty()) {
                iComputeMessageSize4 = iComputeMessageSize4 + 2 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag6);
            }
            this.multiFieldValueClassUnderlyingNameMemoizedSerializedSize = iComputeInt32SizeNoTag6;
            for (int i26 = 0; i26 < this.multiFieldValueClassUnderlyingType_.size(); i26++) {
                iComputeMessageSize4 += CodedOutputStream.computeMessageSize(23, this.multiFieldValueClassUnderlyingType_.get(i26));
            }
            int iComputeInt32SizeNoTag7 = 0;
            for (int i27 = 0; i27 < this.multiFieldValueClassUnderlyingTypeId_.size(); i27++) {
                iComputeInt32SizeNoTag7 += CodedOutputStream.computeInt32SizeNoTag(this.multiFieldValueClassUnderlyingTypeId_.get(i27).intValue());
            }
            int iComputeMessageSize5 = iComputeMessageSize4 + iComputeInt32SizeNoTag7;
            if (!getMultiFieldValueClassUnderlyingTypeIdList().isEmpty()) {
                iComputeMessageSize5 = iComputeMessageSize5 + 2 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag7);
            }
            this.multiFieldValueClassUnderlyingTypeIdMemoizedSerializedSize = iComputeInt32SizeNoTag7;
            for (int i28 = 0; i28 < this.annotation_.size(); i28++) {
                iComputeMessageSize5 += CodedOutputStream.computeMessageSize(25, this.annotation_.get(i28));
            }
            if ((this.bitField0_ & 64) == 64) {
                iComputeMessageSize5 += CodedOutputStream.computeMessageSize(30, this.typeTable_);
            }
            int iComputeInt32SizeNoTag8 = 0;
            for (int i29 = 0; i29 < this.versionRequirement_.size(); i29++) {
                iComputeInt32SizeNoTag8 += CodedOutputStream.computeInt32SizeNoTag(this.versionRequirement_.get(i29).intValue());
            }
            int size = iComputeMessageSize5 + iComputeInt32SizeNoTag8 + (getVersionRequirementList().size() * 2);
            if ((this.bitField0_ & 128) == 128) {
                size += CodedOutputStream.computeMessageSize(32, this.versionRequirementTable_);
            }
            for (int i31 = 0; i31 < this.compilerPluginData_.size(); i31++) {
                size += CodedOutputStream.computeMessageSize(33, this.compilerPluginData_.get(i31));
            }
            int iExtensionsSerializedSize = size + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = iExtensionsSerializedSize;
            return iExtensionsSerializedSize;
        }

        static {
            Class r11 = new Class(true);
            defaultInstance = r11;
            r11.initFields();
        }

        public static Class getDefaultInstance() {
            return defaultInstance;
        }

        public static Builder newBuilder(Class r11) {
            return newBuilder().mergeFrom(r11);
        }

        public static Class parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public Annotation getAnnotation(int i11) {
            return this.annotation_.get(i11);
        }

        public int getAnnotationCount() {
            return this.annotation_.size();
        }

        public List<Annotation> getAnnotationList() {
            return this.annotation_;
        }

        public int getCompanionObjectName() {
            return this.companionObjectName_;
        }

        public CompilerPluginData getCompilerPluginData(int i11) {
            return this.compilerPluginData_.get(i11);
        }

        public int getCompilerPluginDataCount() {
            return this.compilerPluginData_.size();
        }

        public Constructor getConstructor(int i11) {
            return this.constructor_.get(i11);
        }

        public int getConstructorCount() {
            return this.constructor_.size();
        }

        public List<Constructor> getConstructorList() {
            return this.constructor_;
        }

        public Type getContextReceiverType(int i11) {
            return this.contextReceiverType_.get(i11);
        }

        public int getContextReceiverTypeCount() {
            return this.contextReceiverType_.size();
        }

        public List<Integer> getContextReceiverTypeIdList() {
            return this.contextReceiverTypeId_;
        }

        public List<Type> getContextReceiverTypeList() {
            return this.contextReceiverType_;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Class getDefaultInstanceForType() {
            return defaultInstance;
        }

        public EnumEntry getEnumEntry(int i11) {
            return this.enumEntry_.get(i11);
        }

        public int getEnumEntryCount() {
            return this.enumEntry_.size();
        }

        public List<EnumEntry> getEnumEntryList() {
            return this.enumEntry_;
        }

        public int getFlags() {
            return this.flags_;
        }

        public int getFqName() {
            return this.fqName_;
        }

        public Function getFunction(int i11) {
            return this.function_.get(i11);
        }

        public int getFunctionCount() {
            return this.function_.size();
        }

        public List<Function> getFunctionList() {
            return this.function_;
        }

        public int getInlineClassUnderlyingPropertyName() {
            return this.inlineClassUnderlyingPropertyName_;
        }

        public Type getInlineClassUnderlyingType() {
            return this.inlineClassUnderlyingType_;
        }

        public int getInlineClassUnderlyingTypeId() {
            return this.inlineClassUnderlyingTypeId_;
        }

        public int getMultiFieldValueClassUnderlyingNameCount() {
            return this.multiFieldValueClassUnderlyingName_.size();
        }

        public List<Integer> getMultiFieldValueClassUnderlyingNameList() {
            return this.multiFieldValueClassUnderlyingName_;
        }

        public Type getMultiFieldValueClassUnderlyingType(int i11) {
            return this.multiFieldValueClassUnderlyingType_.get(i11);
        }

        public int getMultiFieldValueClassUnderlyingTypeCount() {
            return this.multiFieldValueClassUnderlyingType_.size();
        }

        public int getMultiFieldValueClassUnderlyingTypeIdCount() {
            return this.multiFieldValueClassUnderlyingTypeId_.size();
        }

        public List<Integer> getMultiFieldValueClassUnderlyingTypeIdList() {
            return this.multiFieldValueClassUnderlyingTypeId_;
        }

        public List<Type> getMultiFieldValueClassUnderlyingTypeList() {
            return this.multiFieldValueClassUnderlyingType_;
        }

        public List<Integer> getNestedClassNameList() {
            return this.nestedClassName_;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Class> getParserForType() {
            return PARSER;
        }

        public Property getProperty(int i11) {
            return this.property_.get(i11);
        }

        public int getPropertyCount() {
            return this.property_.size();
        }

        public List<Property> getPropertyList() {
            return this.property_;
        }

        public List<Integer> getSealedSubclassFqNameList() {
            return this.sealedSubclassFqName_;
        }

        public Type getSupertype(int i11) {
            return this.supertype_.get(i11);
        }

        public int getSupertypeCount() {
            return this.supertype_.size();
        }

        public List<Integer> getSupertypeIdList() {
            return this.supertypeId_;
        }

        public List<Type> getSupertypeList() {
            return this.supertype_;
        }

        public TypeAlias getTypeAlias(int i11) {
            return this.typeAlias_.get(i11);
        }

        public int getTypeAliasCount() {
            return this.typeAlias_.size();
        }

        public List<TypeAlias> getTypeAliasList() {
            return this.typeAlias_;
        }

        public TypeParameter getTypeParameter(int i11) {
            return this.typeParameter_.get(i11);
        }

        public int getTypeParameterCount() {
            return this.typeParameter_.size();
        }

        public List<TypeParameter> getTypeParameterList() {
            return this.typeParameter_;
        }

        public TypeTable getTypeTable() {
            return this.typeTable_;
        }

        public List<Integer> getVersionRequirementList() {
            return this.versionRequirement_;
        }

        public VersionRequirementTable getVersionRequirementTable() {
            return this.versionRequirementTable_;
        }

        public boolean hasCompanionObjectName() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean hasFlags() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasFqName() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasInlineClassUnderlyingPropertyName() {
            return (this.bitField0_ & 8) == 8;
        }

        public boolean hasInlineClassUnderlyingType() {
            return (this.bitField0_ & 16) == 16;
        }

        public boolean hasInlineClassUnderlyingTypeId() {
            return (this.bitField0_ & 32) == 32;
        }

        public boolean hasTypeTable() {
            return (this.bitField0_ & 64) == 64;
        }

        public boolean hasVersionRequirementTable() {
            return (this.bitField0_ & 128) == 128;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b11 = this.memoizedIsInitialized;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            if (!hasFqName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i11 = 0; i11 < getTypeParameterCount(); i11++) {
                if (!getTypeParameter(i11).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i12 = 0; i12 < getSupertypeCount(); i12++) {
                if (!getSupertype(i12).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i13 = 0; i13 < getContextReceiverTypeCount(); i13++) {
                if (!getContextReceiverType(i13).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i14 = 0; i14 < getConstructorCount(); i14++) {
                if (!getConstructor(i14).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i15 = 0; i15 < getFunctionCount(); i15++) {
                if (!getFunction(i15).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i16 = 0; i16 < getPropertyCount(); i16++) {
                if (!getProperty(i16).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i17 = 0; i17 < getTypeAliasCount(); i17++) {
                if (!getTypeAlias(i17).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i18 = 0; i18 < getEnumEntryCount(); i18++) {
                if (!getEnumEntry(i18).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasInlineClassUnderlyingType() && !getInlineClassUnderlyingType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i19 = 0; i19 < getMultiFieldValueClassUnderlyingTypeCount(); i19++) {
                if (!getMultiFieldValueClassUnderlyingType(i19).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i21 = 0; i21 < getAnnotationCount(); i21++) {
                if (!getAnnotation(i21).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasTypeTable() && !getTypeTable().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i22 = 0; i22 < getCompilerPluginDataCount(); i22++) {
                if (!getCompilerPluginData(i22).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private Class(GeneratedMessageLite.ExtendableBuilder<Class, ?> extendableBuilder) {
            super(extendableBuilder);
            this.supertypeIdMemoizedSerializedSize = -1;
            this.nestedClassNameMemoizedSerializedSize = -1;
            this.contextReceiverTypeIdMemoizedSerializedSize = -1;
            this.sealedSubclassFqNameMemoizedSerializedSize = -1;
            this.multiFieldValueClassUnderlyingNameMemoizedSerializedSize = -1;
            this.multiFieldValueClassUnderlyingTypeIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.flags_);
            }
            if (getSupertypeIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(18);
                codedOutputStream.writeRawVarint32(this.supertypeIdMemoizedSerializedSize);
            }
            for (int i11 = 0; i11 < this.supertypeId_.size(); i11++) {
                codedOutputStream.writeInt32NoTag(this.supertypeId_.get(i11).intValue());
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(3, this.fqName_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeInt32(4, this.companionObjectName_);
            }
            for (int i12 = 0; i12 < this.typeParameter_.size(); i12++) {
                codedOutputStream.writeMessage(5, this.typeParameter_.get(i12));
            }
            for (int i13 = 0; i13 < this.supertype_.size(); i13++) {
                codedOutputStream.writeMessage(6, this.supertype_.get(i13));
            }
            if (getNestedClassNameList().size() > 0) {
                codedOutputStream.writeRawVarint32(58);
                codedOutputStream.writeRawVarint32(this.nestedClassNameMemoizedSerializedSize);
            }
            for (int i14 = 0; i14 < this.nestedClassName_.size(); i14++) {
                codedOutputStream.writeInt32NoTag(this.nestedClassName_.get(i14).intValue());
            }
            for (int i15 = 0; i15 < this.constructor_.size(); i15++) {
                codedOutputStream.writeMessage(8, this.constructor_.get(i15));
            }
            for (int i16 = 0; i16 < this.function_.size(); i16++) {
                codedOutputStream.writeMessage(9, this.function_.get(i16));
            }
            for (int i17 = 0; i17 < this.property_.size(); i17++) {
                codedOutputStream.writeMessage(10, this.property_.get(i17));
            }
            for (int i18 = 0; i18 < this.typeAlias_.size(); i18++) {
                codedOutputStream.writeMessage(11, this.typeAlias_.get(i18));
            }
            for (int i19 = 0; i19 < this.enumEntry_.size(); i19++) {
                codedOutputStream.writeMessage(13, this.enumEntry_.get(i19));
            }
            if (getSealedSubclassFqNameList().size() > 0) {
                codedOutputStream.writeRawVarint32(130);
                codedOutputStream.writeRawVarint32(this.sealedSubclassFqNameMemoizedSerializedSize);
            }
            for (int i21 = 0; i21 < this.sealedSubclassFqName_.size(); i21++) {
                codedOutputStream.writeInt32NoTag(this.sealedSubclassFqName_.get(i21).intValue());
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeInt32(17, this.inlineClassUnderlyingPropertyName_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeMessage(18, this.inlineClassUnderlyingType_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeInt32(19, this.inlineClassUnderlyingTypeId_);
            }
            for (int i22 = 0; i22 < this.contextReceiverType_.size(); i22++) {
                codedOutputStream.writeMessage(20, this.contextReceiverType_.get(i22));
            }
            if (getContextReceiverTypeIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(170);
                codedOutputStream.writeRawVarint32(this.contextReceiverTypeIdMemoizedSerializedSize);
            }
            for (int i23 = 0; i23 < this.contextReceiverTypeId_.size(); i23++) {
                codedOutputStream.writeInt32NoTag(this.contextReceiverTypeId_.get(i23).intValue());
            }
            if (getMultiFieldValueClassUnderlyingNameList().size() > 0) {
                codedOutputStream.writeRawVarint32(178);
                codedOutputStream.writeRawVarint32(this.multiFieldValueClassUnderlyingNameMemoizedSerializedSize);
            }
            for (int i24 = 0; i24 < this.multiFieldValueClassUnderlyingName_.size(); i24++) {
                codedOutputStream.writeInt32NoTag(this.multiFieldValueClassUnderlyingName_.get(i24).intValue());
            }
            for (int i25 = 0; i25 < this.multiFieldValueClassUnderlyingType_.size(); i25++) {
                codedOutputStream.writeMessage(23, this.multiFieldValueClassUnderlyingType_.get(i25));
            }
            if (getMultiFieldValueClassUnderlyingTypeIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(TPCodecParamers.TP_PROFILE_MJPEG_HUFFMAN_PROGRESSIVE_DCT);
                codedOutputStream.writeRawVarint32(this.multiFieldValueClassUnderlyingTypeIdMemoizedSerializedSize);
            }
            for (int i26 = 0; i26 < this.multiFieldValueClassUnderlyingTypeId_.size(); i26++) {
                codedOutputStream.writeInt32NoTag(this.multiFieldValueClassUnderlyingTypeId_.get(i26).intValue());
            }
            for (int i27 = 0; i27 < this.annotation_.size(); i27++) {
                codedOutputStream.writeMessage(25, this.annotation_.get(i27));
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.writeMessage(30, this.typeTable_);
            }
            for (int i28 = 0; i28 < this.versionRequirement_.size(); i28++) {
                codedOutputStream.writeInt32(31, this.versionRequirement_.get(i28).intValue());
            }
            if ((this.bitField0_ & 128) == 128) {
                codedOutputStream.writeMessage(32, this.versionRequirementTable_);
            }
            for (int i29 = 0; i29 < this.compilerPluginData_.size(); i29++) {
                codedOutputStream.writeMessage(33, this.compilerPluginData_.get(i29));
            }
            extensionWriterNewExtensionWriter.writeUntil(19000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        private Class(boolean z11) {
            this.supertypeIdMemoizedSerializedSize = -1;
            this.nestedClassNameMemoizedSerializedSize = -1;
            this.contextReceiverTypeIdMemoizedSerializedSize = -1;
            this.sealedSubclassFqNameMemoizedSerializedSize = -1;
            this.multiFieldValueClassUnderlyingNameMemoizedSerializedSize = -1;
            this.multiFieldValueClassUnderlyingTypeIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        /*  JADX ERROR: Types fix failed
            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v0 ??, new type: int
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
            Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
            	... 5 more
            */
        private Class(p852kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r23, p852kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r24) throws p852kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            /*
                Method dump skipped, instruction units count: 1922
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.<init>(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
        }
    }

    public interface ClassOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class CompilerPluginData extends GeneratedMessageLite implements CompilerPluginDataOrBuilder {
        public static Parser<CompilerPluginData> PARSER = new AbstractParser<CompilerPluginData>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData.1
            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public CompilerPluginData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new CompilerPluginData(codedInputStream, extensionRegistryLite);
            }
        };
        private static final CompilerPluginData defaultInstance;
        private int bitField0_;
        private ByteString data_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int pluginId_;
        private final ByteString unknownFields;

        public static final class Builder extends GeneratedMessageLite.Builder<CompilerPluginData, Builder> implements CompilerPluginDataOrBuilder {
            private int bitField0_;
            private ByteString data_ = ByteString.EMPTY;
            private int pluginId_;

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public CompilerPluginData build() {
                CompilerPluginData compilerPluginDataBuildPartial = buildPartial();
                if (compilerPluginDataBuildPartial.isInitialized()) {
                    return compilerPluginDataBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(compilerPluginDataBuildPartial);
            }

            public CompilerPluginData buildPartial() {
                CompilerPluginData compilerPluginData = new CompilerPluginData(this);
                int i11 = this.bitField0_;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                compilerPluginData.pluginId_ = this.pluginId_;
                if ((i11 & 2) == 2) {
                    i12 |= 2;
                }
                compilerPluginData.data_ = this.data_;
                compilerPluginData.bitField0_ = i12;
                return compilerPluginData;
            }

            public boolean hasData() {
                return (this.bitField0_ & 2) == 2;
            }

            public boolean hasPluginId() {
                return (this.bitField0_ & 1) == 1;
            }

            public Builder setPluginId(int i11) {
                this.bitField0_ |= 1;
                this.pluginId_ = i11;
                return this;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public CompilerPluginData getDefaultInstanceForType() {
                return CompilerPluginData.getDefaultInstance();
            }

            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasPluginId() || !hasData()) {
                    return false;
                }
                return true;
            }

            public Builder setData(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 2;
                this.data_ = byteString;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo105124clone() {
                return create().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(CompilerPluginData compilerPluginData) {
                if (compilerPluginData == CompilerPluginData.getDefaultInstance()) {
                    return this;
                }
                if (compilerPluginData.hasPluginId()) {
                    setPluginId(compilerPluginData.getPluginId());
                }
                if (compilerPluginData.hasData()) {
                    setData(compilerPluginData.getData());
                }
                setUnknownFields(getUnknownFields().concat(compilerPluginData.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                CompilerPluginData compilerPluginData = null;
                try {
                    try {
                        CompilerPluginData partialFrom = CompilerPluginData.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        CompilerPluginData compilerPluginData2 = (CompilerPluginData) e11.getUnfinishedMessage();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            compilerPluginData = compilerPluginData2;
                            if (compilerPluginData != null) {
                                mergeFrom(compilerPluginData);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (compilerPluginData != null) {
                        mergeFrom(compilerPluginData);
                    }
                    throw th;
                }
            }

            private void maybeForceBuilderInitialization() {
            }
        }

        private void initFields() {
            this.pluginId_ = 0;
            this.data_ = ByteString.EMPTY;
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        static {
            CompilerPluginData compilerPluginData = new CompilerPluginData(true);
            defaultInstance = compilerPluginData;
            compilerPluginData.initFields();
        }

        public static CompilerPluginData getDefaultInstance() {
            return defaultInstance;
        }

        public static Builder newBuilder(CompilerPluginData compilerPluginData) {
            return newBuilder().mergeFrom(compilerPluginData);
        }

        public ByteString getData() {
            return this.data_;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public CompilerPluginData getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<CompilerPluginData> getParserForType() {
            return PARSER;
        }

        public int getPluginId() {
            return this.pluginId_;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i11 = this.memoizedSerializedSize;
            if (i11 != -1) {
                return i11;
            }
            int iComputeInt32Size = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.pluginId_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeBytesSize(2, this.data_);
            }
            int size = iComputeInt32Size + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public boolean hasData() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasPluginId() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b11 = this.memoizedIsInitialized;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            if (!hasPluginId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasData()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private CompilerPluginData(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.pluginId_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeBytes(2, this.data_);
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        private CompilerPluginData(boolean z11) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        private CompilerPluginData(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z11 = false;
            while (!z11) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.bitField0_ |= 1;
                                this.pluginId_ = codedInputStream.readInt32();
                            } else if (tag != 18) {
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.bitField0_ |= 2;
                                this.data_ = codedInputStream.readBytes();
                            }
                        }
                        z11 = true;
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.unknownFields = outputNewOutput.toByteString();
                        }
                        makeExtensionsImmutable();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.setUnfinishedMessage(this);
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                }
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface CompilerPluginDataOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Constructor extends GeneratedMessageLite.ExtendableMessage<Constructor> implements ConstructorOrBuilder {
        public static Parser<Constructor> PARSER = new AbstractParser<Constructor>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.1
            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public Constructor parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Constructor(codedInputStream, extensionRegistryLite);
            }
        };
        private static final Constructor defaultInstance;
        private List<Annotation> annotation_;
        private int bitField0_;
        private List<CompilerPluginData> compilerPluginData_;
        private int flags_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final ByteString unknownFields;
        private List<ValueParameter> valueParameter_;
        private List<Integer> versionRequirement_;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Constructor, Builder> implements ConstructorOrBuilder {
            private List<Annotation> annotation_;
            private int bitField0_;
            private List<CompilerPluginData> compilerPluginData_;
            private int flags_ = 6;
            private List<ValueParameter> valueParameter_;
            private List<Integer> versionRequirement_;

            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i11 = 0; i11 < getValueParameterCount(); i11++) {
                    if (!getValueParameter(i11).isInitialized()) {
                        return false;
                    }
                }
                for (int i12 = 0; i12 < getCompilerPluginDataCount(); i12++) {
                    if (!getCompilerPluginData(i12).isInitialized()) {
                        return false;
                    }
                }
                for (int i13 = 0; i13 < getAnnotationCount(); i13++) {
                    if (!getAnnotation(i13).isInitialized()) {
                        return false;
                    }
                }
                return extensionsAreInitialized();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            private void ensureAnnotationIsMutable() {
                if ((this.bitField0_ & 16) != 16) {
                    this.annotation_ = new ArrayList(this.annotation_);
                    this.bitField0_ |= 16;
                }
            }

            private void ensureCompilerPluginDataIsMutable() {
                if ((this.bitField0_ & 8) != 8) {
                    this.compilerPluginData_ = new ArrayList(this.compilerPluginData_);
                    this.bitField0_ |= 8;
                }
            }

            private void ensureValueParameterIsMutable() {
                if ((this.bitField0_ & 2) != 2) {
                    this.valueParameter_ = new ArrayList(this.valueParameter_);
                    this.bitField0_ |= 2;
                }
            }

            private void ensureVersionRequirementIsMutable() {
                if ((this.bitField0_ & 4) != 4) {
                    this.versionRequirement_ = new ArrayList(this.versionRequirement_);
                    this.bitField0_ |= 4;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Constructor build() {
                Constructor constructorBuildPartial = buildPartial();
                if (constructorBuildPartial.isInitialized()) {
                    return constructorBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(constructorBuildPartial);
            }

            public Constructor buildPartial() {
                Constructor constructor = new Constructor(this);
                int i11 = (this.bitField0_ & 1) != 1 ? 0 : 1;
                constructor.flags_ = this.flags_;
                if ((this.bitField0_ & 2) == 2) {
                    this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
                    this.bitField0_ &= -3;
                }
                constructor.valueParameter_ = this.valueParameter_;
                if ((this.bitField0_ & 4) == 4) {
                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    this.bitField0_ &= -5;
                }
                constructor.versionRequirement_ = this.versionRequirement_;
                if ((this.bitField0_ & 8) == 8) {
                    this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                    this.bitField0_ &= -9;
                }
                constructor.compilerPluginData_ = this.compilerPluginData_;
                if ((this.bitField0_ & 16) == 16) {
                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
                    this.bitField0_ &= -17;
                }
                constructor.annotation_ = this.annotation_;
                constructor.bitField0_ = i11;
                return constructor;
            }

            public Annotation getAnnotation(int i11) {
                return this.annotation_.get(i11);
            }

            public int getAnnotationCount() {
                return this.annotation_.size();
            }

            public CompilerPluginData getCompilerPluginData(int i11) {
                return this.compilerPluginData_.get(i11);
            }

            public int getCompilerPluginDataCount() {
                return this.compilerPluginData_.size();
            }

            public ValueParameter getValueParameter(int i11) {
                return this.valueParameter_.get(i11);
            }

            public int getValueParameterCount() {
                return this.valueParameter_.size();
            }

            public Builder setFlags(int i11) {
                this.bitField0_ |= 1;
                this.flags_ = i11;
                return this;
            }

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.valueParameter_ = list;
                this.versionRequirement_ = list;
                this.compilerPluginData_ = list;
                this.annotation_ = list;
                maybeForceBuilderInitialization();
            }

            public Builder addAllAnnotation(Iterable<? extends Annotation> iterable) {
                ensureAnnotationIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.annotation_);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Constructor getDefaultInstanceForType() {
                return Constructor.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Constructor constructor) {
                if (constructor == Constructor.getDefaultInstance()) {
                    return this;
                }
                if (constructor.hasFlags()) {
                    setFlags(constructor.getFlags());
                }
                if (!constructor.valueParameter_.isEmpty()) {
                    if (this.valueParameter_.isEmpty()) {
                        this.valueParameter_ = constructor.valueParameter_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureValueParameterIsMutable();
                        this.valueParameter_.addAll(constructor.valueParameter_);
                    }
                }
                if (!constructor.versionRequirement_.isEmpty()) {
                    if (this.versionRequirement_.isEmpty()) {
                        this.versionRequirement_ = constructor.versionRequirement_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureVersionRequirementIsMutable();
                        this.versionRequirement_.addAll(constructor.versionRequirement_);
                    }
                }
                if (!constructor.compilerPluginData_.isEmpty()) {
                    if (this.compilerPluginData_.isEmpty()) {
                        this.compilerPluginData_ = constructor.compilerPluginData_;
                        this.bitField0_ &= -9;
                    } else {
                        ensureCompilerPluginDataIsMutable();
                        this.compilerPluginData_.addAll(constructor.compilerPluginData_);
                    }
                }
                if (!constructor.annotation_.isEmpty()) {
                    if (this.annotation_.isEmpty()) {
                        this.annotation_ = constructor.annotation_;
                        this.bitField0_ &= -17;
                    } else {
                        ensureAnnotationIsMutable();
                        this.annotation_.addAll(constructor.annotation_);
                    }
                }
                mergeExtensionFields(constructor);
                setUnknownFields(getUnknownFields().concat(constructor.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo105124clone() {
                return create().mergeFrom(buildPartial());
            }

            private void maybeForceBuilderInitialization() {
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Constructor constructor = null;
                try {
                    try {
                        Constructor partialFrom = Constructor.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        Constructor constructor2 = (Constructor) e11.getUnfinishedMessage();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            constructor = constructor2;
                            if (constructor != null) {
                                mergeFrom(constructor);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (constructor != null) {
                        mergeFrom(constructor);
                    }
                    throw th;
                }
            }
        }

        private void initFields() {
            this.flags_ = 6;
            List list = Collections.EMPTY_LIST;
            this.valueParameter_ = list;
            this.versionRequirement_ = list;
            this.compilerPluginData_ = list;
            this.annotation_ = list;
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        static {
            Constructor constructor = new Constructor(true);
            defaultInstance = constructor;
            constructor.initFields();
        }

        public static Constructor getDefaultInstance() {
            return defaultInstance;
        }

        public static Builder newBuilder(Constructor constructor) {
            return newBuilder().mergeFrom(constructor);
        }

        public Annotation getAnnotation(int i11) {
            return this.annotation_.get(i11);
        }

        public int getAnnotationCount() {
            return this.annotation_.size();
        }

        public List<Annotation> getAnnotationList() {
            return this.annotation_;
        }

        public CompilerPluginData getCompilerPluginData(int i11) {
            return this.compilerPluginData_.get(i11);
        }

        public int getCompilerPluginDataCount() {
            return this.compilerPluginData_.size();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Constructor getDefaultInstanceForType() {
            return defaultInstance;
        }

        public int getFlags() {
            return this.flags_;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Constructor> getParserForType() {
            return PARSER;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i11 = this.memoizedSerializedSize;
            if (i11 != -1) {
                return i11;
            }
            int iComputeInt32Size = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.flags_) : 0;
            for (int i12 = 0; i12 < this.valueParameter_.size(); i12++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(2, this.valueParameter_.get(i12));
            }
            for (int i13 = 0; i13 < this.annotation_.size(); i13++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(3, this.annotation_.get(i13));
            }
            int iComputeInt32SizeNoTag = 0;
            for (int i14 = 0; i14 < this.versionRequirement_.size(); i14++) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(this.versionRequirement_.get(i14).intValue());
            }
            int size = iComputeInt32Size + iComputeInt32SizeNoTag + (getVersionRequirementList().size() * 2);
            for (int i15 = 0; i15 < this.compilerPluginData_.size(); i15++) {
                size += CodedOutputStream.computeMessageSize(32, this.compilerPluginData_.get(i15));
            }
            int iExtensionsSerializedSize = size + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = iExtensionsSerializedSize;
            return iExtensionsSerializedSize;
        }

        public ValueParameter getValueParameter(int i11) {
            return this.valueParameter_.get(i11);
        }

        public int getValueParameterCount() {
            return this.valueParameter_.size();
        }

        public List<ValueParameter> getValueParameterList() {
            return this.valueParameter_;
        }

        public List<Integer> getVersionRequirementList() {
            return this.versionRequirement_;
        }

        public boolean hasFlags() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b11 = this.memoizedIsInitialized;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            for (int i11 = 0; i11 < getValueParameterCount(); i11++) {
                if (!getValueParameter(i11).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i12 = 0; i12 < getCompilerPluginDataCount(); i12++) {
                if (!getCompilerPluginData(i12).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i13 = 0; i13 < getAnnotationCount(); i13++) {
                if (!getAnnotation(i13).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private Constructor(GeneratedMessageLite.ExtendableBuilder<Constructor, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.flags_);
            }
            for (int i11 = 0; i11 < this.valueParameter_.size(); i11++) {
                codedOutputStream.writeMessage(2, this.valueParameter_.get(i11));
            }
            for (int i12 = 0; i12 < this.annotation_.size(); i12++) {
                codedOutputStream.writeMessage(3, this.annotation_.get(i12));
            }
            for (int i13 = 0; i13 < this.versionRequirement_.size(); i13++) {
                codedOutputStream.writeInt32(31, this.versionRequirement_.get(i13).intValue());
            }
            for (int i14 = 0; i14 < this.compilerPluginData_.size(); i14++) {
                codedOutputStream.writeMessage(32, this.compilerPluginData_.get(i14));
            }
            extensionWriterNewExtensionWriter.writeUntil(19000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        private Constructor(boolean z11) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        private Constructor(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z11 = false;
            int i11 = 0;
            while (!z11) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.bitField0_ |= 1;
                                this.flags_ = codedInputStream.readInt32();
                            } else if (tag == 18) {
                                if ((i11 & 2) != 2) {
                                    this.valueParameter_ = new ArrayList();
                                    i11 |= 2;
                                }
                                this.valueParameter_.add((ValueParameter) codedInputStream.readMessage(ValueParameter.PARSER, extensionRegistryLite));
                            } else if (tag == 26) {
                                if ((i11 & 16) != 16) {
                                    this.annotation_ = new ArrayList();
                                    i11 |= 16;
                                }
                                this.annotation_.add((Annotation) codedInputStream.readMessage(Annotation.PARSER, extensionRegistryLite));
                            } else if (tag == 248) {
                                if ((i11 & 4) != 4) {
                                    this.versionRequirement_ = new ArrayList();
                                    i11 |= 4;
                                }
                                this.versionRequirement_.add(Integer.valueOf(codedInputStream.readInt32()));
                            } else if (tag == 250) {
                                int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i11 & 4) != 4 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.versionRequirement_ = new ArrayList();
                                    i11 |= 4;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.versionRequirement_.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit);
                            } else if (tag != 258) {
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                if ((i11 & 8) != 8) {
                                    this.compilerPluginData_ = new ArrayList();
                                    i11 |= 8;
                                }
                                this.compilerPluginData_.add((CompilerPluginData) codedInputStream.readMessage(CompilerPluginData.PARSER, extensionRegistryLite));
                            }
                        }
                        z11 = true;
                    } catch (InvalidProtocolBufferException e11) {
                        throw e11.setUnfinishedMessage(this);
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if ((i11 & 2) == 2) {
                        this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
                    }
                    if ((i11 & 16) == 16) {
                        this.annotation_ = Collections.unmodifiableList(this.annotation_);
                    }
                    if ((i11 & 4) == 4) {
                        this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    }
                    if ((i11 & 8) == 8) {
                        this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.unknownFields = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if ((i11 & 2) == 2) {
                this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
            }
            if ((i11 & 16) == 16) {
                this.annotation_ = Collections.unmodifiableList(this.annotation_);
            }
            if ((i11 & 4) == 4) {
                this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
            }
            if ((i11 & 8) == 8) {
                this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface ConstructorOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class Contract extends GeneratedMessageLite implements ContractOrBuilder {
        public static Parser<Contract> PARSER = new AbstractParser<Contract>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.1
            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public Contract parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Contract(codedInputStream, extensionRegistryLite);
            }
        };
        private static final Contract defaultInstance;
        private List<Effect> effect_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final ByteString unknownFields;

        public static final class Builder extends GeneratedMessageLite.Builder<Contract, Builder> implements ContractOrBuilder {
            private int bitField0_;
            private List<Effect> effect_ = Collections.EMPTY_LIST;

            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i11 = 0; i11 < getEffectCount(); i11++) {
                    if (!getEffect(i11).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            private void ensureEffectIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.effect_ = new ArrayList(this.effect_);
                    this.bitField0_ |= 1;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Contract build() {
                Contract contractBuildPartial = buildPartial();
                if (contractBuildPartial.isInitialized()) {
                    return contractBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(contractBuildPartial);
            }

            public Contract buildPartial() {
                Contract contract = new Contract(this);
                if ((this.bitField0_ & 1) == 1) {
                    this.effect_ = Collections.unmodifiableList(this.effect_);
                    this.bitField0_ &= -2;
                }
                contract.effect_ = this.effect_;
                return contract;
            }

            public Effect getEffect(int i11) {
                return this.effect_.get(i11);
            }

            public int getEffectCount() {
                return this.effect_.size();
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Contract getDefaultInstanceForType() {
                return Contract.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo105124clone() {
                return create().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Contract contract) {
                if (contract == Contract.getDefaultInstance()) {
                    return this;
                }
                if (!contract.effect_.isEmpty()) {
                    if (this.effect_.isEmpty()) {
                        this.effect_ = contract.effect_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureEffectIsMutable();
                        this.effect_.addAll(contract.effect_);
                    }
                }
                setUnknownFields(getUnknownFields().concat(contract.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Contract contract = null;
                try {
                    try {
                        Contract partialFrom = Contract.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        Contract contract2 = (Contract) e11.getUnfinishedMessage();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            contract = contract2;
                            if (contract != null) {
                                mergeFrom(contract);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (contract != null) {
                        mergeFrom(contract);
                    }
                    throw th;
                }
            }

            private void maybeForceBuilderInitialization() {
            }
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        static {
            Contract contract = new Contract(true);
            defaultInstance = contract;
            contract.initFields();
        }

        public static Contract getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.effect_ = Collections.EMPTY_LIST;
        }

        public static Builder newBuilder(Contract contract) {
            return newBuilder().mergeFrom(contract);
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Contract getDefaultInstanceForType() {
            return defaultInstance;
        }

        public Effect getEffect(int i11) {
            return this.effect_.get(i11);
        }

        public int getEffectCount() {
            return this.effect_.size();
        }

        public List<Effect> getEffectList() {
            return this.effect_;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Contract> getParserForType() {
            return PARSER;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i11 = this.memoizedSerializedSize;
            if (i11 != -1) {
                return i11;
            }
            int iComputeMessageSize = 0;
            for (int i12 = 0; i12 < this.effect_.size(); i12++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.effect_.get(i12));
            }
            int size = iComputeMessageSize + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b11 = this.memoizedIsInitialized;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            for (int i11 = 0; i11 < getEffectCount(); i11++) {
                if (!getEffect(i11).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private Contract(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i11 = 0; i11 < this.effect_.size(); i11++) {
                codedOutputStream.writeMessage(1, this.effect_.get(i11));
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        private Contract(boolean z11) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        private Contract(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z11 = false;
            boolean z12 = false;
            while (!z11) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag != 10) {
                                    if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    if (!z12) {
                                        this.effect_ = new ArrayList();
                                        z12 = true;
                                    }
                                    this.effect_.add((Effect) codedInputStream.readMessage(Effect.PARSER, extensionRegistryLite));
                                }
                            }
                            z11 = true;
                        } catch (InvalidProtocolBufferException e11) {
                            throw e11.setUnfinishedMessage(this);
                        }
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if (z12) {
                        this.effect_ = Collections.unmodifiableList(this.effect_);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.unknownFields = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (z12) {
                this.effect_ = Collections.unmodifiableList(this.effect_);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface ContractOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Effect extends GeneratedMessageLite implements EffectOrBuilder {
        public static Parser<Effect> PARSER = new AbstractParser<Effect>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.1
            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public Effect parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Effect(codedInputStream, extensionRegistryLite);
            }
        };
        private static final Effect defaultInstance;
        private int bitField0_;
        private Expression conclusionOfConditionalEffect_;
        private List<Expression> effectConstructorArgument_;
        private EffectType effectType_;
        private InvocationKind kind_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final ByteString unknownFields;

        public static final class Builder extends GeneratedMessageLite.Builder<Effect, Builder> implements EffectOrBuilder {
            private int bitField0_;
            private EffectType effectType_ = EffectType.RETURNS_CONSTANT;
            private List<Expression> effectConstructorArgument_ = Collections.EMPTY_LIST;
            private Expression conclusionOfConditionalEffect_ = Expression.getDefaultInstance();
            private InvocationKind kind_ = InvocationKind.AT_MOST_ONCE;

            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i11 = 0; i11 < getEffectConstructorArgumentCount(); i11++) {
                    if (!getEffectConstructorArgument(i11).isInitialized()) {
                        return false;
                    }
                }
                return !hasConclusionOfConditionalEffect() || getConclusionOfConditionalEffect().isInitialized();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            private void ensureEffectConstructorArgumentIsMutable() {
                if ((this.bitField0_ & 2) != 2) {
                    this.effectConstructorArgument_ = new ArrayList(this.effectConstructorArgument_);
                    this.bitField0_ |= 2;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Effect build() {
                Effect effectBuildPartial = buildPartial();
                if (effectBuildPartial.isInitialized()) {
                    return effectBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(effectBuildPartial);
            }

            public Effect buildPartial() {
                Effect effect = new Effect(this);
                int i11 = this.bitField0_;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                effect.effectType_ = this.effectType_;
                if ((this.bitField0_ & 2) == 2) {
                    this.effectConstructorArgument_ = Collections.unmodifiableList(this.effectConstructorArgument_);
                    this.bitField0_ &= -3;
                }
                effect.effectConstructorArgument_ = this.effectConstructorArgument_;
                if ((i11 & 4) == 4) {
                    i12 |= 2;
                }
                effect.conclusionOfConditionalEffect_ = this.conclusionOfConditionalEffect_;
                if ((i11 & 8) == 8) {
                    i12 |= 4;
                }
                effect.kind_ = this.kind_;
                effect.bitField0_ = i12;
                return effect;
            }

            public Expression getConclusionOfConditionalEffect() {
                return this.conclusionOfConditionalEffect_;
            }

            public Expression getEffectConstructorArgument(int i11) {
                return this.effectConstructorArgument_.get(i11);
            }

            public int getEffectConstructorArgumentCount() {
                return this.effectConstructorArgument_.size();
            }

            public boolean hasConclusionOfConditionalEffect() {
                return (this.bitField0_ & 4) == 4;
            }

            public Builder mergeConclusionOfConditionalEffect(Expression expression) {
                if ((this.bitField0_ & 4) != 4 || this.conclusionOfConditionalEffect_ == Expression.getDefaultInstance()) {
                    this.conclusionOfConditionalEffect_ = expression;
                } else {
                    this.conclusionOfConditionalEffect_ = Expression.newBuilder(this.conclusionOfConditionalEffect_).mergeFrom(expression).buildPartial();
                }
                this.bitField0_ |= 4;
                return this;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Effect getDefaultInstanceForType() {
                return Effect.getDefaultInstance();
            }

            public Builder setEffectType(EffectType effectType) {
                effectType.getClass();
                this.bitField0_ |= 1;
                this.effectType_ = effectType;
                return this;
            }

            public Builder setKind(InvocationKind invocationKind) {
                invocationKind.getClass();
                this.bitField0_ |= 8;
                this.kind_ = invocationKind;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo105124clone() {
                return create().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Effect effect) {
                if (effect == Effect.getDefaultInstance()) {
                    return this;
                }
                if (effect.hasEffectType()) {
                    setEffectType(effect.getEffectType());
                }
                if (!effect.effectConstructorArgument_.isEmpty()) {
                    if (this.effectConstructorArgument_.isEmpty()) {
                        this.effectConstructorArgument_ = effect.effectConstructorArgument_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureEffectConstructorArgumentIsMutable();
                        this.effectConstructorArgument_.addAll(effect.effectConstructorArgument_);
                    }
                }
                if (effect.hasConclusionOfConditionalEffect()) {
                    mergeConclusionOfConditionalEffect(effect.getConclusionOfConditionalEffect());
                }
                if (effect.hasKind()) {
                    setKind(effect.getKind());
                }
                setUnknownFields(getUnknownFields().concat(effect.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Effect effect = null;
                try {
                    try {
                        Effect partialFrom = Effect.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        Effect effect2 = (Effect) e11.getUnfinishedMessage();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            effect = effect2;
                            if (effect != null) {
                                mergeFrom(effect);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (effect != null) {
                        mergeFrom(effect);
                    }
                    throw th;
                }
            }

            private void maybeForceBuilderInitialization() {
            }
        }

        public enum EffectType implements Internal.EnumLite {
            RETURNS_CONSTANT(0, 0),
            CALLS(1, 1),
            RETURNS_NOT_NULL(2, 2);

            private static Internal.EnumLiteMap<EffectType> internalValueMap = new Internal.EnumLiteMap<EffectType>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectType.1
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                public EffectType findValueByNumber(int i11) {
                    return EffectType.valueOf(i11);
                }
            };
            private final int value;

            public static EffectType valueOf(int i11) {
                if (i11 == 0) {
                    return RETURNS_CONSTANT;
                }
                if (i11 == 1) {
                    return CALLS;
                }
                if (i11 != 2) {
                    return null;
                }
                return RETURNS_NOT_NULL;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            EffectType(int i11, int i12) {
                this.value = i12;
            }
        }

        public enum InvocationKind implements Internal.EnumLite {
            AT_MOST_ONCE(0, 0),
            EXACTLY_ONCE(1, 1),
            AT_LEAST_ONCE(2, 2);

            private static Internal.EnumLiteMap<InvocationKind> internalValueMap = new Internal.EnumLiteMap<InvocationKind>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.InvocationKind.1
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                public InvocationKind findValueByNumber(int i11) {
                    return InvocationKind.valueOf(i11);
                }
            };
            private final int value;

            public static InvocationKind valueOf(int i11) {
                if (i11 == 0) {
                    return AT_MOST_ONCE;
                }
                if (i11 == 1) {
                    return EXACTLY_ONCE;
                }
                if (i11 != 2) {
                    return null;
                }
                return AT_LEAST_ONCE;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            InvocationKind(int i11, int i12) {
                this.value = i12;
            }
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        static {
            Effect effect = new Effect(true);
            defaultInstance = effect;
            effect.initFields();
        }

        public static Effect getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.effectType_ = EffectType.RETURNS_CONSTANT;
            this.effectConstructorArgument_ = Collections.EMPTY_LIST;
            this.conclusionOfConditionalEffect_ = Expression.getDefaultInstance();
            this.kind_ = InvocationKind.AT_MOST_ONCE;
        }

        public static Builder newBuilder(Effect effect) {
            return newBuilder().mergeFrom(effect);
        }

        public Expression getConclusionOfConditionalEffect() {
            return this.conclusionOfConditionalEffect_;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Effect getDefaultInstanceForType() {
            return defaultInstance;
        }

        public Expression getEffectConstructorArgument(int i11) {
            return this.effectConstructorArgument_.get(i11);
        }

        public int getEffectConstructorArgumentCount() {
            return this.effectConstructorArgument_.size();
        }

        public List<Expression> getEffectConstructorArgumentList() {
            return this.effectConstructorArgument_;
        }

        public EffectType getEffectType() {
            return this.effectType_;
        }

        public InvocationKind getKind() {
            return this.kind_;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Effect> getParserForType() {
            return PARSER;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i11 = this.memoizedSerializedSize;
            if (i11 != -1) {
                return i11;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeEnumSize(1, this.effectType_.getNumber()) : 0;
            for (int i12 = 0; i12 < this.effectConstructorArgument_.size(); i12++) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, this.effectConstructorArgument_.get(i12));
            }
            if ((this.bitField0_ & 2) == 2) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(3, this.conclusionOfConditionalEffect_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(4, this.kind_.getNumber());
            }
            int size = iComputeEnumSize + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public boolean hasConclusionOfConditionalEffect() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasEffectType() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasKind() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b11 = this.memoizedIsInitialized;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            for (int i11 = 0; i11 < getEffectConstructorArgumentCount(); i11++) {
                if (!getEffectConstructorArgument(i11).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (!hasConclusionOfConditionalEffect() || getConclusionOfConditionalEffect().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private Effect(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeEnum(1, this.effectType_.getNumber());
            }
            for (int i11 = 0; i11 < this.effectConstructorArgument_.size(); i11++) {
                codedOutputStream.writeMessage(2, this.effectConstructorArgument_.get(i11));
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeMessage(3, this.conclusionOfConditionalEffect_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeEnum(4, this.kind_.getNumber());
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        private Effect(boolean z11) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        private Effect(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z11 = false;
            char c11 = 0;
            while (!z11) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                int i11 = codedInputStream.readEnum();
                                EffectType effectTypeValueOf = EffectType.valueOf(i11);
                                if (effectTypeValueOf == null) {
                                    codedOutputStreamNewInstance.writeRawVarint32(tag);
                                    codedOutputStreamNewInstance.writeRawVarint32(i11);
                                } else {
                                    this.bitField0_ |= 1;
                                    this.effectType_ = effectTypeValueOf;
                                }
                            } else if (tag == 18) {
                                if ((c11 & 2) != 2) {
                                    this.effectConstructorArgument_ = new ArrayList();
                                    c11 = 2;
                                }
                                this.effectConstructorArgument_.add((Expression) codedInputStream.readMessage(Expression.PARSER, extensionRegistryLite));
                            } else if (tag == 26) {
                                Expression.Builder builder = (this.bitField0_ & 2) == 2 ? this.conclusionOfConditionalEffect_.toBuilder() : null;
                                Expression expression = (Expression) codedInputStream.readMessage(Expression.PARSER, extensionRegistryLite);
                                this.conclusionOfConditionalEffect_ = expression;
                                if (builder != null) {
                                    builder.mergeFrom(expression);
                                    this.conclusionOfConditionalEffect_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 2;
                            } else if (tag != 32) {
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                int i12 = codedInputStream.readEnum();
                                InvocationKind invocationKindValueOf = InvocationKind.valueOf(i12);
                                if (invocationKindValueOf == null) {
                                    codedOutputStreamNewInstance.writeRawVarint32(tag);
                                    codedOutputStreamNewInstance.writeRawVarint32(i12);
                                } else {
                                    this.bitField0_ |= 4;
                                    this.kind_ = invocationKindValueOf;
                                }
                            }
                        }
                        z11 = true;
                    } catch (Throwable th2) {
                        if ((c11 & 2) == 2) {
                            this.effectConstructorArgument_ = Collections.unmodifiableList(this.effectConstructorArgument_);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.unknownFields = outputNewOutput.toByteString();
                        }
                        makeExtensionsImmutable();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.setUnfinishedMessage(this);
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                }
            }
            if ((c11 & 2) == 2) {
                this.effectConstructorArgument_ = Collections.unmodifiableList(this.effectConstructorArgument_);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface EffectOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class EnumEntry extends GeneratedMessageLite.ExtendableMessage<EnumEntry> implements EnumEntryOrBuilder {
        public static Parser<EnumEntry> PARSER = new AbstractParser<EnumEntry>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.1
            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public EnumEntry parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new EnumEntry(codedInputStream, extensionRegistryLite);
            }
        };
        private static final EnumEntry defaultInstance;
        private List<Annotation> annotation_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int name_;
        private final ByteString unknownFields;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<EnumEntry, Builder> implements EnumEntryOrBuilder {
            private List<Annotation> annotation_ = Collections.EMPTY_LIST;
            private int bitField0_;
            private int name_;

            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i11 = 0; i11 < getAnnotationCount(); i11++) {
                    if (!getAnnotation(i11).isInitialized()) {
                        return false;
                    }
                }
                return extensionsAreInitialized();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            private void ensureAnnotationIsMutable() {
                if ((this.bitField0_ & 2) != 2) {
                    this.annotation_ = new ArrayList(this.annotation_);
                    this.bitField0_ |= 2;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public EnumEntry build() {
                EnumEntry enumEntryBuildPartial = buildPartial();
                if (enumEntryBuildPartial.isInitialized()) {
                    return enumEntryBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(enumEntryBuildPartial);
            }

            public EnumEntry buildPartial() {
                EnumEntry enumEntry = new EnumEntry(this);
                int i11 = (this.bitField0_ & 1) != 1 ? 0 : 1;
                enumEntry.name_ = this.name_;
                if ((this.bitField0_ & 2) == 2) {
                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
                    this.bitField0_ &= -3;
                }
                enumEntry.annotation_ = this.annotation_;
                enumEntry.bitField0_ = i11;
                return enumEntry;
            }

            public Annotation getAnnotation(int i11) {
                return this.annotation_.get(i11);
            }

            public int getAnnotationCount() {
                return this.annotation_.size();
            }

            public Builder setName(int i11) {
                this.bitField0_ |= 1;
                this.name_ = i11;
                return this;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            public Builder addAnnotation(Annotation annotation) {
                annotation.getClass();
                ensureAnnotationIsMutable();
                this.annotation_.add(annotation);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public EnumEntry getDefaultInstanceForType() {
                return EnumEntry.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(EnumEntry enumEntry) {
                if (enumEntry == EnumEntry.getDefaultInstance()) {
                    return this;
                }
                if (enumEntry.hasName()) {
                    setName(enumEntry.getName());
                }
                if (!enumEntry.annotation_.isEmpty()) {
                    if (this.annotation_.isEmpty()) {
                        this.annotation_ = enumEntry.annotation_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureAnnotationIsMutable();
                        this.annotation_.addAll(enumEntry.annotation_);
                    }
                }
                mergeExtensionFields(enumEntry);
                setUnknownFields(getUnknownFields().concat(enumEntry.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo105124clone() {
                return create().mergeFrom(buildPartial());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                EnumEntry enumEntry = null;
                try {
                    try {
                        EnumEntry partialFrom = EnumEntry.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        EnumEntry enumEntry2 = (EnumEntry) e11.getUnfinishedMessage();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            enumEntry = enumEntry2;
                            if (enumEntry != null) {
                                mergeFrom(enumEntry);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (enumEntry != null) {
                        mergeFrom(enumEntry);
                    }
                    throw th;
                }
            }

            private void maybeForceBuilderInitialization() {
            }
        }

        private void initFields() {
            this.name_ = 0;
            this.annotation_ = Collections.EMPTY_LIST;
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        static {
            EnumEntry enumEntry = new EnumEntry(true);
            defaultInstance = enumEntry;
            enumEntry.initFields();
        }

        public static EnumEntry getDefaultInstance() {
            return defaultInstance;
        }

        public static Builder newBuilder(EnumEntry enumEntry) {
            return newBuilder().mergeFrom(enumEntry);
        }

        public Annotation getAnnotation(int i11) {
            return this.annotation_.get(i11);
        }

        public int getAnnotationCount() {
            return this.annotation_.size();
        }

        public List<Annotation> getAnnotationList() {
            return this.annotation_;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public EnumEntry getDefaultInstanceForType() {
            return defaultInstance;
        }

        public int getName() {
            return this.name_;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<EnumEntry> getParserForType() {
            return PARSER;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i11 = this.memoizedSerializedSize;
            if (i11 != -1) {
                return i11;
            }
            int iComputeInt32Size = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.name_) : 0;
            for (int i12 = 0; i12 < this.annotation_.size(); i12++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(2, this.annotation_.get(i12));
            }
            int iExtensionsSerializedSize = iComputeInt32Size + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = iExtensionsSerializedSize;
            return iExtensionsSerializedSize;
        }

        public boolean hasName() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b11 = this.memoizedIsInitialized;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            for (int i11 = 0; i11 < getAnnotationCount(); i11++) {
                if (!getAnnotation(i11).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private EnumEntry(GeneratedMessageLite.ExtendableBuilder<EnumEntry, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.name_);
            }
            for (int i11 = 0; i11 < this.annotation_.size(); i11++) {
                codedOutputStream.writeMessage(2, this.annotation_.get(i11));
            }
            extensionWriterNewExtensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        private EnumEntry(boolean z11) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        private EnumEntry(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z11 = false;
            char c11 = 0;
            while (!z11) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.bitField0_ |= 1;
                                this.name_ = codedInputStream.readInt32();
                            } else if (tag != 18) {
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                if ((c11 & 2) != 2) {
                                    this.annotation_ = new ArrayList();
                                    c11 = 2;
                                }
                                this.annotation_.add((Annotation) codedInputStream.readMessage(Annotation.PARSER, extensionRegistryLite));
                            }
                        }
                        z11 = true;
                    } catch (Throwable th2) {
                        if ((c11 & 2) == 2) {
                            this.annotation_ = Collections.unmodifiableList(this.annotation_);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.unknownFields = outputNewOutput.toByteString();
                        }
                        makeExtensionsImmutable();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.setUnfinishedMessage(this);
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                }
            }
            if ((c11 & 2) == 2) {
                this.annotation_ = Collections.unmodifiableList(this.annotation_);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface EnumEntryOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class Expression extends GeneratedMessageLite implements ExpressionOrBuilder {
        public static Parser<Expression> PARSER = new AbstractParser<Expression>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.1
            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public Expression parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Expression(codedInputStream, extensionRegistryLite);
            }
        };
        private static final Expression defaultInstance;
        private List<Expression> andArgument_;
        private int bitField0_;
        private ConstantValue constantValue_;
        private int flags_;
        private int isInstanceTypeId_;
        private Type isInstanceType_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List<Expression> orArgument_;
        private final ByteString unknownFields;
        private int valueParameterReference_;

        public static final class Builder extends GeneratedMessageLite.Builder<Expression, Builder> implements ExpressionOrBuilder {
            private List<Expression> andArgument_;
            private int bitField0_;
            private int flags_;
            private int isInstanceTypeId_;
            private List<Expression> orArgument_;
            private int valueParameterReference_;
            private ConstantValue constantValue_ = ConstantValue.TRUE;
            private Type isInstanceType_ = Type.getDefaultInstance();

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            private void ensureAndArgumentIsMutable() {
                if ((this.bitField0_ & 32) != 32) {
                    this.andArgument_ = new ArrayList(this.andArgument_);
                    this.bitField0_ |= 32;
                }
            }

            private void ensureOrArgumentIsMutable() {
                if ((this.bitField0_ & 64) != 64) {
                    this.orArgument_ = new ArrayList(this.orArgument_);
                    this.bitField0_ |= 64;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Expression build() {
                Expression expressionBuildPartial = buildPartial();
                if (expressionBuildPartial.isInitialized()) {
                    return expressionBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(expressionBuildPartial);
            }

            public Expression buildPartial() {
                Expression expression = new Expression(this);
                int i11 = this.bitField0_;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                expression.flags_ = this.flags_;
                if ((i11 & 2) == 2) {
                    i12 |= 2;
                }
                expression.valueParameterReference_ = this.valueParameterReference_;
                if ((i11 & 4) == 4) {
                    i12 |= 4;
                }
                expression.constantValue_ = this.constantValue_;
                if ((i11 & 8) == 8) {
                    i12 |= 8;
                }
                expression.isInstanceType_ = this.isInstanceType_;
                if ((i11 & 16) == 16) {
                    i12 |= 16;
                }
                expression.isInstanceTypeId_ = this.isInstanceTypeId_;
                if ((this.bitField0_ & 32) == 32) {
                    this.andArgument_ = Collections.unmodifiableList(this.andArgument_);
                    this.bitField0_ &= -33;
                }
                expression.andArgument_ = this.andArgument_;
                if ((this.bitField0_ & 64) == 64) {
                    this.orArgument_ = Collections.unmodifiableList(this.orArgument_);
                    this.bitField0_ &= -65;
                }
                expression.orArgument_ = this.orArgument_;
                expression.bitField0_ = i12;
                return expression;
            }

            public Expression getAndArgument(int i11) {
                return this.andArgument_.get(i11);
            }

            public int getAndArgumentCount() {
                return this.andArgument_.size();
            }

            public Type getIsInstanceType() {
                return this.isInstanceType_;
            }

            public Expression getOrArgument(int i11) {
                return this.orArgument_.get(i11);
            }

            public int getOrArgumentCount() {
                return this.orArgument_.size();
            }

            public boolean hasIsInstanceType() {
                return (this.bitField0_ & 8) == 8;
            }

            public Builder mergeIsInstanceType(Type type) {
                if ((this.bitField0_ & 8) != 8 || this.isInstanceType_ == Type.getDefaultInstance()) {
                    this.isInstanceType_ = type;
                } else {
                    this.isInstanceType_ = Type.newBuilder(this.isInstanceType_).mergeFrom(type).buildPartial();
                }
                this.bitField0_ |= 8;
                return this;
            }

            public Builder setFlags(int i11) {
                this.bitField0_ |= 1;
                this.flags_ = i11;
                return this;
            }

            public Builder setIsInstanceTypeId(int i11) {
                this.bitField0_ |= 16;
                this.isInstanceTypeId_ = i11;
                return this;
            }

            public Builder setValueParameterReference(int i11) {
                this.bitField0_ |= 2;
                this.valueParameterReference_ = i11;
                return this;
            }

            private Builder() {
                List<Expression> list = Collections.EMPTY_LIST;
                this.andArgument_ = list;
                this.orArgument_ = list;
                maybeForceBuilderInitialization();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Expression getDefaultInstanceForType() {
                return Expression.getDefaultInstance();
            }

            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasIsInstanceType() && !getIsInstanceType().isInitialized()) {
                    return false;
                }
                for (int i11 = 0; i11 < getAndArgumentCount(); i11++) {
                    if (!getAndArgument(i11).isInitialized()) {
                        return false;
                    }
                }
                for (int i12 = 0; i12 < getOrArgumentCount(); i12++) {
                    if (!getOrArgument(i12).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder setConstantValue(ConstantValue constantValue) {
                constantValue.getClass();
                this.bitField0_ |= 4;
                this.constantValue_ = constantValue;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo105124clone() {
                return create().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Expression expression) {
                if (expression == Expression.getDefaultInstance()) {
                    return this;
                }
                if (expression.hasFlags()) {
                    setFlags(expression.getFlags());
                }
                if (expression.hasValueParameterReference()) {
                    setValueParameterReference(expression.getValueParameterReference());
                }
                if (expression.hasConstantValue()) {
                    setConstantValue(expression.getConstantValue());
                }
                if (expression.hasIsInstanceType()) {
                    mergeIsInstanceType(expression.getIsInstanceType());
                }
                if (expression.hasIsInstanceTypeId()) {
                    setIsInstanceTypeId(expression.getIsInstanceTypeId());
                }
                if (!expression.andArgument_.isEmpty()) {
                    if (this.andArgument_.isEmpty()) {
                        this.andArgument_ = expression.andArgument_;
                        this.bitField0_ &= -33;
                    } else {
                        ensureAndArgumentIsMutable();
                        this.andArgument_.addAll(expression.andArgument_);
                    }
                }
                if (!expression.orArgument_.isEmpty()) {
                    if (this.orArgument_.isEmpty()) {
                        this.orArgument_ = expression.orArgument_;
                        this.bitField0_ &= -65;
                    } else {
                        ensureOrArgumentIsMutable();
                        this.orArgument_.addAll(expression.orArgument_);
                    }
                }
                setUnknownFields(getUnknownFields().concat(expression.unknownFields));
                return this;
            }

            private void maybeForceBuilderInitialization() {
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Expression expression = null;
                try {
                    try {
                        Expression partialFrom = Expression.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        Expression expression2 = (Expression) e11.getUnfinishedMessage();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            expression = expression2;
                            if (expression != null) {
                                mergeFrom(expression);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (expression != null) {
                        mergeFrom(expression);
                    }
                    throw th;
                }
            }
        }

        public enum ConstantValue implements Internal.EnumLite {
            TRUE(0, 0),
            FALSE(1, 1),
            NULL(2, 2);

            private static Internal.EnumLiteMap<ConstantValue> internalValueMap = new Internal.EnumLiteMap<ConstantValue>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.ConstantValue.1
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                public ConstantValue findValueByNumber(int i11) {
                    return ConstantValue.valueOf(i11);
                }
            };
            private final int value;

            public static ConstantValue valueOf(int i11) {
                if (i11 == 0) {
                    return TRUE;
                }
                if (i11 == 1) {
                    return FALSE;
                }
                if (i11 != 2) {
                    return null;
                }
                return NULL;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            ConstantValue(int i11, int i12) {
                this.value = i12;
            }
        }

        private void initFields() {
            this.flags_ = 0;
            this.valueParameterReference_ = 0;
            this.constantValue_ = ConstantValue.TRUE;
            this.isInstanceType_ = Type.getDefaultInstance();
            this.isInstanceTypeId_ = 0;
            List<Expression> list = Collections.EMPTY_LIST;
            this.andArgument_ = list;
            this.orArgument_ = list;
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        static {
            Expression expression = new Expression(true);
            defaultInstance = expression;
            expression.initFields();
        }

        public static Expression getDefaultInstance() {
            return defaultInstance;
        }

        public static Builder newBuilder(Expression expression) {
            return newBuilder().mergeFrom(expression);
        }

        public Expression getAndArgument(int i11) {
            return this.andArgument_.get(i11);
        }

        public int getAndArgumentCount() {
            return this.andArgument_.size();
        }

        public List<Expression> getAndArgumentList() {
            return this.andArgument_;
        }

        public ConstantValue getConstantValue() {
            return this.constantValue_;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Expression getDefaultInstanceForType() {
            return defaultInstance;
        }

        public int getFlags() {
            return this.flags_;
        }

        public Type getIsInstanceType() {
            return this.isInstanceType_;
        }

        public int getIsInstanceTypeId() {
            return this.isInstanceTypeId_;
        }

        public Expression getOrArgument(int i11) {
            return this.orArgument_.get(i11);
        }

        public int getOrArgumentCount() {
            return this.orArgument_.size();
        }

        public List<Expression> getOrArgumentList() {
            return this.orArgument_;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Expression> getParserForType() {
            return PARSER;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i11 = this.memoizedSerializedSize;
            if (i11 != -1) {
                return i11;
            }
            int iComputeInt32Size = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.flags_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.valueParameterReference_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeEnumSize(3, this.constantValue_.getNumber());
            }
            if ((this.bitField0_ & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(4, this.isInstanceType_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(5, this.isInstanceTypeId_);
            }
            for (int i12 = 0; i12 < this.andArgument_.size(); i12++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(6, this.andArgument_.get(i12));
            }
            for (int i13 = 0; i13 < this.orArgument_.size(); i13++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(7, this.orArgument_.get(i13));
            }
            int size = iComputeInt32Size + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public int getValueParameterReference() {
            return this.valueParameterReference_;
        }

        public boolean hasConstantValue() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean hasFlags() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasIsInstanceType() {
            return (this.bitField0_ & 8) == 8;
        }

        public boolean hasIsInstanceTypeId() {
            return (this.bitField0_ & 16) == 16;
        }

        public boolean hasValueParameterReference() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b11 = this.memoizedIsInitialized;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            if (hasIsInstanceType() && !getIsInstanceType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i11 = 0; i11 < getAndArgumentCount(); i11++) {
                if (!getAndArgument(i11).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i12 = 0; i12 < getOrArgumentCount(); i12++) {
                if (!getOrArgument(i12).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private Expression(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.flags_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(2, this.valueParameterReference_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeEnum(3, this.constantValue_.getNumber());
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeMessage(4, this.isInstanceType_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeInt32(5, this.isInstanceTypeId_);
            }
            for (int i11 = 0; i11 < this.andArgument_.size(); i11++) {
                codedOutputStream.writeMessage(6, this.andArgument_.get(i11));
            }
            for (int i12 = 0; i12 < this.orArgument_.size(); i12++) {
                codedOutputStream.writeMessage(7, this.orArgument_.get(i12));
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        private Expression(boolean z11) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        private Expression(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z11 = false;
            int i11 = 0;
            while (!z11) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.bitField0_ |= 1;
                                this.flags_ = codedInputStream.readInt32();
                            } else if (tag == 16) {
                                this.bitField0_ |= 2;
                                this.valueParameterReference_ = codedInputStream.readInt32();
                            } else if (tag == 24) {
                                int i12 = codedInputStream.readEnum();
                                ConstantValue constantValueValueOf = ConstantValue.valueOf(i12);
                                if (constantValueValueOf == null) {
                                    codedOutputStreamNewInstance.writeRawVarint32(tag);
                                    codedOutputStreamNewInstance.writeRawVarint32(i12);
                                } else {
                                    this.bitField0_ |= 4;
                                    this.constantValue_ = constantValueValueOf;
                                }
                            } else if (tag == 34) {
                                Type.Builder builder = (this.bitField0_ & 8) == 8 ? this.isInstanceType_.toBuilder() : null;
                                Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                this.isInstanceType_ = type;
                                if (builder != null) {
                                    builder.mergeFrom(type);
                                    this.isInstanceType_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 8;
                            } else if (tag == 40) {
                                this.bitField0_ |= 16;
                                this.isInstanceTypeId_ = codedInputStream.readInt32();
                            } else if (tag == 50) {
                                if ((i11 & 32) != 32) {
                                    this.andArgument_ = new ArrayList();
                                    i11 |= 32;
                                }
                                this.andArgument_.add((Expression) codedInputStream.readMessage(PARSER, extensionRegistryLite));
                            } else if (tag != 58) {
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                if ((i11 & 64) != 64) {
                                    this.orArgument_ = new ArrayList();
                                    i11 |= 64;
                                }
                                this.orArgument_.add((Expression) codedInputStream.readMessage(PARSER, extensionRegistryLite));
                            }
                        }
                        z11 = true;
                    } catch (Throwable th2) {
                        if ((i11 & 32) == 32) {
                            this.andArgument_ = Collections.unmodifiableList(this.andArgument_);
                        }
                        if ((i11 & 64) == 64) {
                            this.orArgument_ = Collections.unmodifiableList(this.orArgument_);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.unknownFields = outputNewOutput.toByteString();
                        }
                        makeExtensionsImmutable();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.setUnfinishedMessage(this);
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                }
            }
            if ((i11 & 32) == 32) {
                this.andArgument_ = Collections.unmodifiableList(this.andArgument_);
            }
            if ((i11 & 64) == 64) {
                this.orArgument_ = Collections.unmodifiableList(this.orArgument_);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface ExpressionOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Function extends GeneratedMessageLite.ExtendableMessage<Function> implements FunctionOrBuilder {
        public static Parser<Function> PARSER = new AbstractParser<Function>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.1
            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public Function parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Function(codedInputStream, extensionRegistryLite);
            }
        };
        private static final Function defaultInstance;
        private List<Annotation> annotation_;
        private int bitField0_;
        private List<CompilerPluginData> compilerPluginData_;
        private List<ValueParameter> contextParameter_;
        private int contextReceiverTypeIdMemoizedSerializedSize;
        private List<Integer> contextReceiverTypeId_;
        private List<Type> contextReceiverType_;
        private Contract contract_;
        private List<Annotation> extensionReceiverAnnotation_;
        private int flags_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int name_;
        private int oldFlags_;
        private int receiverTypeId_;
        private Type receiverType_;
        private int returnTypeId_;
        private Type returnType_;
        private List<TypeParameter> typeParameter_;
        private TypeTable typeTable_;
        private final ByteString unknownFields;
        private List<ValueParameter> valueParameter_;
        private List<Integer> versionRequirement_;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Function, Builder> implements FunctionOrBuilder {
            private List<Annotation> annotation_;
            private int bitField0_;
            private List<CompilerPluginData> compilerPluginData_;
            private List<ValueParameter> contextParameter_;
            private List<Integer> contextReceiverTypeId_;
            private List<Type> contextReceiverType_;
            private Contract contract_;
            private List<Annotation> extensionReceiverAnnotation_;
            private int name_;
            private int receiverTypeId_;
            private Type receiverType_;
            private int returnTypeId_;
            private List<TypeParameter> typeParameter_;
            private TypeTable typeTable_;
            private List<ValueParameter> valueParameter_;
            private List<Integer> versionRequirement_;
            private int flags_ = 6;
            private int oldFlags_ = 6;
            private Type returnType_ = Type.getDefaultInstance();

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            private void ensureAnnotationIsMutable() {
                if ((this.bitField0_ & 65536) != 65536) {
                    this.annotation_ = new ArrayList(this.annotation_);
                    this.bitField0_ |= 65536;
                }
            }

            private void ensureCompilerPluginDataIsMutable() {
                if ((this.bitField0_ & 32768) != 32768) {
                    this.compilerPluginData_ = new ArrayList(this.compilerPluginData_);
                    this.bitField0_ |= 32768;
                }
            }

            private void ensureContextParameterIsMutable() {
                if ((this.bitField0_ & 1024) != 1024) {
                    this.contextParameter_ = new ArrayList(this.contextParameter_);
                    this.bitField0_ |= 1024;
                }
            }

            private void ensureContextReceiverTypeIdIsMutable() {
                if ((this.bitField0_ & 512) != 512) {
                    this.contextReceiverTypeId_ = new ArrayList(this.contextReceiverTypeId_);
                    this.bitField0_ |= 512;
                }
            }

            private void ensureContextReceiverTypeIsMutable() {
                if ((this.bitField0_ & 256) != 256) {
                    this.contextReceiverType_ = new ArrayList(this.contextReceiverType_);
                    this.bitField0_ |= 256;
                }
            }

            private void ensureExtensionReceiverAnnotationIsMutable() {
                if ((this.bitField0_ & 131072) != 131072) {
                    this.extensionReceiverAnnotation_ = new ArrayList(this.extensionReceiverAnnotation_);
                    this.bitField0_ |= 131072;
                }
            }

            private void ensureTypeParameterIsMutable() {
                if ((this.bitField0_ & 32) != 32) {
                    this.typeParameter_ = new ArrayList(this.typeParameter_);
                    this.bitField0_ |= 32;
                }
            }

            private void ensureValueParameterIsMutable() {
                if ((this.bitField0_ & 2048) != 2048) {
                    this.valueParameter_ = new ArrayList(this.valueParameter_);
                    this.bitField0_ |= 2048;
                }
            }

            private void ensureVersionRequirementIsMutable() {
                if ((this.bitField0_ & 8192) != 8192) {
                    this.versionRequirement_ = new ArrayList(this.versionRequirement_);
                    this.bitField0_ |= 8192;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Function build() {
                Function functionBuildPartial = buildPartial();
                if (functionBuildPartial.isInitialized()) {
                    return functionBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(functionBuildPartial);
            }

            public Function buildPartial() {
                Function function = new Function(this);
                int i11 = this.bitField0_;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                function.flags_ = this.flags_;
                if ((i11 & 2) == 2) {
                    i12 |= 2;
                }
                function.oldFlags_ = this.oldFlags_;
                if ((i11 & 4) == 4) {
                    i12 |= 4;
                }
                function.name_ = this.name_;
                if ((i11 & 8) == 8) {
                    i12 |= 8;
                }
                function.returnType_ = this.returnType_;
                if ((i11 & 16) == 16) {
                    i12 |= 16;
                }
                function.returnTypeId_ = this.returnTypeId_;
                if ((this.bitField0_ & 32) == 32) {
                    this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                    this.bitField0_ &= -33;
                }
                function.typeParameter_ = this.typeParameter_;
                if ((i11 & 64) == 64) {
                    i12 |= 32;
                }
                function.receiverType_ = this.receiverType_;
                if ((i11 & 128) == 128) {
                    i12 |= 64;
                }
                function.receiverTypeId_ = this.receiverTypeId_;
                if ((this.bitField0_ & 256) == 256) {
                    this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                    this.bitField0_ &= -257;
                }
                function.contextReceiverType_ = this.contextReceiverType_;
                if ((this.bitField0_ & 512) == 512) {
                    this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                    this.bitField0_ &= -513;
                }
                function.contextReceiverTypeId_ = this.contextReceiverTypeId_;
                if ((this.bitField0_ & 1024) == 1024) {
                    this.contextParameter_ = Collections.unmodifiableList(this.contextParameter_);
                    this.bitField0_ &= -1025;
                }
                function.contextParameter_ = this.contextParameter_;
                if ((this.bitField0_ & 2048) == 2048) {
                    this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
                    this.bitField0_ &= -2049;
                }
                function.valueParameter_ = this.valueParameter_;
                if ((i11 & 4096) == 4096) {
                    i12 |= 128;
                }
                function.typeTable_ = this.typeTable_;
                if ((this.bitField0_ & 8192) == 8192) {
                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    this.bitField0_ &= -8193;
                }
                function.versionRequirement_ = this.versionRequirement_;
                if ((i11 & 16384) == 16384) {
                    i12 |= 256;
                }
                function.contract_ = this.contract_;
                if ((this.bitField0_ & 32768) == 32768) {
                    this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                    this.bitField0_ &= -32769;
                }
                function.compilerPluginData_ = this.compilerPluginData_;
                if ((this.bitField0_ & 65536) == 65536) {
                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
                    this.bitField0_ &= -65537;
                }
                function.annotation_ = this.annotation_;
                if ((this.bitField0_ & 131072) == 131072) {
                    this.extensionReceiverAnnotation_ = Collections.unmodifiableList(this.extensionReceiverAnnotation_);
                    this.bitField0_ &= -131073;
                }
                function.extensionReceiverAnnotation_ = this.extensionReceiverAnnotation_;
                function.bitField0_ = i12;
                return function;
            }

            public Annotation getAnnotation(int i11) {
                return this.annotation_.get(i11);
            }

            public int getAnnotationCount() {
                return this.annotation_.size();
            }

            public CompilerPluginData getCompilerPluginData(int i11) {
                return this.compilerPluginData_.get(i11);
            }

            public int getCompilerPluginDataCount() {
                return this.compilerPluginData_.size();
            }

            public ValueParameter getContextParameter(int i11) {
                return this.contextParameter_.get(i11);
            }

            public int getContextParameterCount() {
                return this.contextParameter_.size();
            }

            public Type getContextReceiverType(int i11) {
                return this.contextReceiverType_.get(i11);
            }

            public int getContextReceiverTypeCount() {
                return this.contextReceiverType_.size();
            }

            public Contract getContract() {
                return this.contract_;
            }

            public Annotation getExtensionReceiverAnnotation(int i11) {
                return this.extensionReceiverAnnotation_.get(i11);
            }

            public int getExtensionReceiverAnnotationCount() {
                return this.extensionReceiverAnnotation_.size();
            }

            public Type getReceiverType() {
                return this.receiverType_;
            }

            public Type getReturnType() {
                return this.returnType_;
            }

            public TypeParameter getTypeParameter(int i11) {
                return this.typeParameter_.get(i11);
            }

            public int getTypeParameterCount() {
                return this.typeParameter_.size();
            }

            public TypeTable getTypeTable() {
                return this.typeTable_;
            }

            public ValueParameter getValueParameter(int i11) {
                return this.valueParameter_.get(i11);
            }

            public int getValueParameterCount() {
                return this.valueParameter_.size();
            }

            public boolean hasContract() {
                return (this.bitField0_ & 16384) == 16384;
            }

            public boolean hasName() {
                return (this.bitField0_ & 4) == 4;
            }

            public boolean hasReceiverType() {
                return (this.bitField0_ & 64) == 64;
            }

            public boolean hasReturnType() {
                return (this.bitField0_ & 8) == 8;
            }

            public boolean hasTypeTable() {
                return (this.bitField0_ & 4096) == 4096;
            }

            public Builder mergeContract(Contract contract) {
                if ((this.bitField0_ & 16384) != 16384 || this.contract_ == Contract.getDefaultInstance()) {
                    this.contract_ = contract;
                } else {
                    this.contract_ = Contract.newBuilder(this.contract_).mergeFrom(contract).buildPartial();
                }
                this.bitField0_ |= 16384;
                return this;
            }

            public Builder mergeReceiverType(Type type) {
                if ((this.bitField0_ & 64) != 64 || this.receiverType_ == Type.getDefaultInstance()) {
                    this.receiverType_ = type;
                } else {
                    this.receiverType_ = Type.newBuilder(this.receiverType_).mergeFrom(type).buildPartial();
                }
                this.bitField0_ |= 64;
                return this;
            }

            public Builder mergeReturnType(Type type) {
                if ((this.bitField0_ & 8) != 8 || this.returnType_ == Type.getDefaultInstance()) {
                    this.returnType_ = type;
                } else {
                    this.returnType_ = Type.newBuilder(this.returnType_).mergeFrom(type).buildPartial();
                }
                this.bitField0_ |= 8;
                return this;
            }

            public Builder mergeTypeTable(TypeTable typeTable) {
                if ((this.bitField0_ & 4096) != 4096 || this.typeTable_ == TypeTable.getDefaultInstance()) {
                    this.typeTable_ = typeTable;
                } else {
                    this.typeTable_ = TypeTable.newBuilder(this.typeTable_).mergeFrom(typeTable).buildPartial();
                }
                this.bitField0_ |= 4096;
                return this;
            }

            public Builder setFlags(int i11) {
                this.bitField0_ |= 1;
                this.flags_ = i11;
                return this;
            }

            public Builder setName(int i11) {
                this.bitField0_ |= 4;
                this.name_ = i11;
                return this;
            }

            public Builder setOldFlags(int i11) {
                this.bitField0_ |= 2;
                this.oldFlags_ = i11;
                return this;
            }

            public Builder setReceiverTypeId(int i11) {
                this.bitField0_ |= 128;
                this.receiverTypeId_ = i11;
                return this;
            }

            public Builder setReturnTypeId(int i11) {
                this.bitField0_ |= 16;
                this.returnTypeId_ = i11;
                return this;
            }

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.typeParameter_ = list;
                this.receiverType_ = Type.getDefaultInstance();
                this.contextReceiverType_ = list;
                this.contextReceiverTypeId_ = list;
                this.contextParameter_ = list;
                this.valueParameter_ = list;
                this.typeTable_ = TypeTable.getDefaultInstance();
                this.versionRequirement_ = list;
                this.contract_ = Contract.getDefaultInstance();
                this.compilerPluginData_ = list;
                this.annotation_ = list;
                this.extensionReceiverAnnotation_ = list;
                maybeForceBuilderInitialization();
            }

            public Builder addAllAnnotation(Iterable<? extends Annotation> iterable) {
                ensureAnnotationIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.annotation_);
                return this;
            }

            public Builder addAllExtensionReceiverAnnotation(Iterable<? extends Annotation> iterable) {
                ensureExtensionReceiverAnnotationIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.extensionReceiverAnnotation_);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Function getDefaultInstanceForType() {
                return Function.getDefaultInstance();
            }

            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                if (hasReturnType() && !getReturnType().isInitialized()) {
                    return false;
                }
                for (int i11 = 0; i11 < getTypeParameterCount(); i11++) {
                    if (!getTypeParameter(i11).isInitialized()) {
                        return false;
                    }
                }
                if (hasReceiverType() && !getReceiverType().isInitialized()) {
                    return false;
                }
                for (int i12 = 0; i12 < getContextReceiverTypeCount(); i12++) {
                    if (!getContextReceiverType(i12).isInitialized()) {
                        return false;
                    }
                }
                for (int i13 = 0; i13 < getContextParameterCount(); i13++) {
                    if (!getContextParameter(i13).isInitialized()) {
                        return false;
                    }
                }
                for (int i14 = 0; i14 < getValueParameterCount(); i14++) {
                    if (!getValueParameter(i14).isInitialized()) {
                        return false;
                    }
                }
                if (hasTypeTable() && !getTypeTable().isInitialized()) {
                    return false;
                }
                if (hasContract() && !getContract().isInitialized()) {
                    return false;
                }
                for (int i15 = 0; i15 < getCompilerPluginDataCount(); i15++) {
                    if (!getCompilerPluginData(i15).isInitialized()) {
                        return false;
                    }
                }
                for (int i16 = 0; i16 < getAnnotationCount(); i16++) {
                    if (!getAnnotation(i16).isInitialized()) {
                        return false;
                    }
                }
                for (int i17 = 0; i17 < getExtensionReceiverAnnotationCount(); i17++) {
                    if (!getExtensionReceiverAnnotation(i17).isInitialized()) {
                        return false;
                    }
                }
                if (!extensionsAreInitialized()) {
                    return false;
                }
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Function function) {
                if (function == Function.getDefaultInstance()) {
                    return this;
                }
                if (function.hasFlags()) {
                    setFlags(function.getFlags());
                }
                if (function.hasOldFlags()) {
                    setOldFlags(function.getOldFlags());
                }
                if (function.hasName()) {
                    setName(function.getName());
                }
                if (function.hasReturnType()) {
                    mergeReturnType(function.getReturnType());
                }
                if (function.hasReturnTypeId()) {
                    setReturnTypeId(function.getReturnTypeId());
                }
                if (!function.typeParameter_.isEmpty()) {
                    if (this.typeParameter_.isEmpty()) {
                        this.typeParameter_ = function.typeParameter_;
                        this.bitField0_ &= -33;
                    } else {
                        ensureTypeParameterIsMutable();
                        this.typeParameter_.addAll(function.typeParameter_);
                    }
                }
                if (function.hasReceiverType()) {
                    mergeReceiverType(function.getReceiverType());
                }
                if (function.hasReceiverTypeId()) {
                    setReceiverTypeId(function.getReceiverTypeId());
                }
                if (!function.contextReceiverType_.isEmpty()) {
                    if (this.contextReceiverType_.isEmpty()) {
                        this.contextReceiverType_ = function.contextReceiverType_;
                        this.bitField0_ &= -257;
                    } else {
                        ensureContextReceiverTypeIsMutable();
                        this.contextReceiverType_.addAll(function.contextReceiverType_);
                    }
                }
                if (!function.contextReceiverTypeId_.isEmpty()) {
                    if (this.contextReceiverTypeId_.isEmpty()) {
                        this.contextReceiverTypeId_ = function.contextReceiverTypeId_;
                        this.bitField0_ &= -513;
                    } else {
                        ensureContextReceiverTypeIdIsMutable();
                        this.contextReceiverTypeId_.addAll(function.contextReceiverTypeId_);
                    }
                }
                if (!function.contextParameter_.isEmpty()) {
                    if (this.contextParameter_.isEmpty()) {
                        this.contextParameter_ = function.contextParameter_;
                        this.bitField0_ &= -1025;
                    } else {
                        ensureContextParameterIsMutable();
                        this.contextParameter_.addAll(function.contextParameter_);
                    }
                }
                if (!function.valueParameter_.isEmpty()) {
                    if (this.valueParameter_.isEmpty()) {
                        this.valueParameter_ = function.valueParameter_;
                        this.bitField0_ &= -2049;
                    } else {
                        ensureValueParameterIsMutable();
                        this.valueParameter_.addAll(function.valueParameter_);
                    }
                }
                if (function.hasTypeTable()) {
                    mergeTypeTable(function.getTypeTable());
                }
                if (!function.versionRequirement_.isEmpty()) {
                    if (this.versionRequirement_.isEmpty()) {
                        this.versionRequirement_ = function.versionRequirement_;
                        this.bitField0_ &= -8193;
                    } else {
                        ensureVersionRequirementIsMutable();
                        this.versionRequirement_.addAll(function.versionRequirement_);
                    }
                }
                if (function.hasContract()) {
                    mergeContract(function.getContract());
                }
                if (!function.compilerPluginData_.isEmpty()) {
                    if (this.compilerPluginData_.isEmpty()) {
                        this.compilerPluginData_ = function.compilerPluginData_;
                        this.bitField0_ &= -32769;
                    } else {
                        ensureCompilerPluginDataIsMutable();
                        this.compilerPluginData_.addAll(function.compilerPluginData_);
                    }
                }
                if (!function.annotation_.isEmpty()) {
                    if (this.annotation_.isEmpty()) {
                        this.annotation_ = function.annotation_;
                        this.bitField0_ &= -65537;
                    } else {
                        ensureAnnotationIsMutable();
                        this.annotation_.addAll(function.annotation_);
                    }
                }
                if (!function.extensionReceiverAnnotation_.isEmpty()) {
                    if (this.extensionReceiverAnnotation_.isEmpty()) {
                        this.extensionReceiverAnnotation_ = function.extensionReceiverAnnotation_;
                        this.bitField0_ &= -131073;
                    } else {
                        ensureExtensionReceiverAnnotationIsMutable();
                        this.extensionReceiverAnnotation_.addAll(function.extensionReceiverAnnotation_);
                    }
                }
                mergeExtensionFields(function);
                setUnknownFields(getUnknownFields().concat(function.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo105124clone() {
                return create().mergeFrom(buildPartial());
            }

            private void maybeForceBuilderInitialization() {
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Function function = null;
                try {
                    try {
                        Function partialFrom = Function.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        Function function2 = (Function) e11.getUnfinishedMessage();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            function = function2;
                            if (function != null) {
                                mergeFrom(function);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (function != null) {
                        mergeFrom(function);
                    }
                    throw th;
                }
            }
        }

        private void initFields() {
            this.flags_ = 6;
            this.oldFlags_ = 6;
            this.name_ = 0;
            this.returnType_ = Type.getDefaultInstance();
            this.returnTypeId_ = 0;
            List list = Collections.EMPTY_LIST;
            this.typeParameter_ = list;
            this.receiverType_ = Type.getDefaultInstance();
            this.receiverTypeId_ = 0;
            this.contextReceiverType_ = list;
            this.contextReceiverTypeId_ = list;
            this.contextParameter_ = list;
            this.valueParameter_ = list;
            this.typeTable_ = TypeTable.getDefaultInstance();
            this.versionRequirement_ = list;
            this.contract_ = Contract.getDefaultInstance();
            this.compilerPluginData_ = list;
            this.annotation_ = list;
            this.extensionReceiverAnnotation_ = list;
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        static {
            Function function = new Function(true);
            defaultInstance = function;
            function.initFields();
        }

        public static Function getDefaultInstance() {
            return defaultInstance;
        }

        public static Builder newBuilder(Function function) {
            return newBuilder().mergeFrom(function);
        }

        public static Function parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public Annotation getAnnotation(int i11) {
            return this.annotation_.get(i11);
        }

        public int getAnnotationCount() {
            return this.annotation_.size();
        }

        public List<Annotation> getAnnotationList() {
            return this.annotation_;
        }

        public CompilerPluginData getCompilerPluginData(int i11) {
            return this.compilerPluginData_.get(i11);
        }

        public int getCompilerPluginDataCount() {
            return this.compilerPluginData_.size();
        }

        public ValueParameter getContextParameter(int i11) {
            return this.contextParameter_.get(i11);
        }

        public int getContextParameterCount() {
            return this.contextParameter_.size();
        }

        public Type getContextReceiverType(int i11) {
            return this.contextReceiverType_.get(i11);
        }

        public int getContextReceiverTypeCount() {
            return this.contextReceiverType_.size();
        }

        public List<Integer> getContextReceiverTypeIdList() {
            return this.contextReceiverTypeId_;
        }

        public List<Type> getContextReceiverTypeList() {
            return this.contextReceiverType_;
        }

        public Contract getContract() {
            return this.contract_;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Function getDefaultInstanceForType() {
            return defaultInstance;
        }

        public Annotation getExtensionReceiverAnnotation(int i11) {
            return this.extensionReceiverAnnotation_.get(i11);
        }

        public int getExtensionReceiverAnnotationCount() {
            return this.extensionReceiverAnnotation_.size();
        }

        public List<Annotation> getExtensionReceiverAnnotationList() {
            return this.extensionReceiverAnnotation_;
        }

        public int getFlags() {
            return this.flags_;
        }

        public int getName() {
            return this.name_;
        }

        public int getOldFlags() {
            return this.oldFlags_;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Function> getParserForType() {
            return PARSER;
        }

        public Type getReceiverType() {
            return this.receiverType_;
        }

        public int getReceiverTypeId() {
            return this.receiverTypeId_;
        }

        public Type getReturnType() {
            return this.returnType_;
        }

        public int getReturnTypeId() {
            return this.returnTypeId_;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i11 = this.memoizedSerializedSize;
            if (i11 != -1) {
                return i11;
            }
            int iComputeInt32Size = (this.bitField0_ & 2) == 2 ? CodedOutputStream.computeInt32Size(1, this.oldFlags_) : 0;
            if ((this.bitField0_ & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.name_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(3, this.returnType_);
            }
            for (int i12 = 0; i12 < this.typeParameter_.size(); i12++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(4, this.typeParameter_.get(i12));
            }
            if ((this.bitField0_ & 32) == 32) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(5, this.receiverType_);
            }
            for (int i13 = 0; i13 < this.valueParameter_.size(); i13++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(6, this.valueParameter_.get(i13));
            }
            if ((this.bitField0_ & 16) == 16) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(7, this.returnTypeId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(8, this.receiverTypeId_);
            }
            if ((this.bitField0_ & 1) == 1) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(9, this.flags_);
            }
            for (int i14 = 0; i14 < this.contextReceiverType_.size(); i14++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(10, this.contextReceiverType_.get(i14));
            }
            int iComputeInt32SizeNoTag = 0;
            for (int i15 = 0; i15 < this.contextReceiverTypeId_.size(); i15++) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(this.contextReceiverTypeId_.get(i15).intValue());
            }
            int iComputeMessageSize = iComputeInt32Size + iComputeInt32SizeNoTag;
            if (!getContextReceiverTypeIdList().isEmpty()) {
                iComputeMessageSize = iComputeMessageSize + 1 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag);
            }
            this.contextReceiverTypeIdMemoizedSerializedSize = iComputeInt32SizeNoTag;
            for (int i16 = 0; i16 < this.annotation_.size(); i16++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(12, this.annotation_.get(i16));
            }
            for (int i17 = 0; i17 < this.contextParameter_.size(); i17++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(13, this.contextParameter_.get(i17));
            }
            if ((this.bitField0_ & 128) == 128) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(30, this.typeTable_);
            }
            int iComputeInt32SizeNoTag2 = 0;
            for (int i18 = 0; i18 < this.versionRequirement_.size(); i18++) {
                iComputeInt32SizeNoTag2 += CodedOutputStream.computeInt32SizeNoTag(this.versionRequirement_.get(i18).intValue());
            }
            int size = iComputeMessageSize + iComputeInt32SizeNoTag2 + (getVersionRequirementList().size() * 2);
            if ((this.bitField0_ & 256) == 256) {
                size += CodedOutputStream.computeMessageSize(32, this.contract_);
            }
            for (int i19 = 0; i19 < this.compilerPluginData_.size(); i19++) {
                size += CodedOutputStream.computeMessageSize(33, this.compilerPluginData_.get(i19));
            }
            for (int i21 = 0; i21 < this.extensionReceiverAnnotation_.size(); i21++) {
                size += CodedOutputStream.computeMessageSize(34, this.extensionReceiverAnnotation_.get(i21));
            }
            int iExtensionsSerializedSize = size + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = iExtensionsSerializedSize;
            return iExtensionsSerializedSize;
        }

        public TypeParameter getTypeParameter(int i11) {
            return this.typeParameter_.get(i11);
        }

        public int getTypeParameterCount() {
            return this.typeParameter_.size();
        }

        public List<TypeParameter> getTypeParameterList() {
            return this.typeParameter_;
        }

        public TypeTable getTypeTable() {
            return this.typeTable_;
        }

        public ValueParameter getValueParameter(int i11) {
            return this.valueParameter_.get(i11);
        }

        public int getValueParameterCount() {
            return this.valueParameter_.size();
        }

        public List<ValueParameter> getValueParameterList() {
            return this.valueParameter_;
        }

        public List<Integer> getVersionRequirementList() {
            return this.versionRequirement_;
        }

        public boolean hasContract() {
            return (this.bitField0_ & 256) == 256;
        }

        public boolean hasFlags() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasName() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean hasOldFlags() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasReceiverType() {
            return (this.bitField0_ & 32) == 32;
        }

        public boolean hasReceiverTypeId() {
            return (this.bitField0_ & 64) == 64;
        }

        public boolean hasReturnType() {
            return (this.bitField0_ & 8) == 8;
        }

        public boolean hasReturnTypeId() {
            return (this.bitField0_ & 16) == 16;
        }

        public boolean hasTypeTable() {
            return (this.bitField0_ & 128) == 128;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b11 = this.memoizedIsInitialized;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            if (!hasName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasReturnType() && !getReturnType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i11 = 0; i11 < getTypeParameterCount(); i11++) {
                if (!getTypeParameter(i11).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasReceiverType() && !getReceiverType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i12 = 0; i12 < getContextReceiverTypeCount(); i12++) {
                if (!getContextReceiverType(i12).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i13 = 0; i13 < getContextParameterCount(); i13++) {
                if (!getContextParameter(i13).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i14 = 0; i14 < getValueParameterCount(); i14++) {
                if (!getValueParameter(i14).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasTypeTable() && !getTypeTable().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasContract() && !getContract().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i15 = 0; i15 < getCompilerPluginDataCount(); i15++) {
                if (!getCompilerPluginData(i15).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i16 = 0; i16 < getAnnotationCount(); i16++) {
                if (!getAnnotation(i16).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i17 = 0; i17 < getExtensionReceiverAnnotationCount(); i17++) {
                if (!getExtensionReceiverAnnotation(i17).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private Function(GeneratedMessageLite.ExtendableBuilder<Function, ?> extendableBuilder) {
            super(extendableBuilder);
            this.contextReceiverTypeIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(1, this.oldFlags_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeInt32(2, this.name_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeMessage(3, this.returnType_);
            }
            for (int i11 = 0; i11 < this.typeParameter_.size(); i11++) {
                codedOutputStream.writeMessage(4, this.typeParameter_.get(i11));
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeMessage(5, this.receiverType_);
            }
            for (int i12 = 0; i12 < this.valueParameter_.size(); i12++) {
                codedOutputStream.writeMessage(6, this.valueParameter_.get(i12));
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeInt32(7, this.returnTypeId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.writeInt32(8, this.receiverTypeId_);
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(9, this.flags_);
            }
            for (int i13 = 0; i13 < this.contextReceiverType_.size(); i13++) {
                codedOutputStream.writeMessage(10, this.contextReceiverType_.get(i13));
            }
            if (getContextReceiverTypeIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(90);
                codedOutputStream.writeRawVarint32(this.contextReceiverTypeIdMemoizedSerializedSize);
            }
            for (int i14 = 0; i14 < this.contextReceiverTypeId_.size(); i14++) {
                codedOutputStream.writeInt32NoTag(this.contextReceiverTypeId_.get(i14).intValue());
            }
            for (int i15 = 0; i15 < this.annotation_.size(); i15++) {
                codedOutputStream.writeMessage(12, this.annotation_.get(i15));
            }
            for (int i16 = 0; i16 < this.contextParameter_.size(); i16++) {
                codedOutputStream.writeMessage(13, this.contextParameter_.get(i16));
            }
            if ((this.bitField0_ & 128) == 128) {
                codedOutputStream.writeMessage(30, this.typeTable_);
            }
            for (int i17 = 0; i17 < this.versionRequirement_.size(); i17++) {
                codedOutputStream.writeInt32(31, this.versionRequirement_.get(i17).intValue());
            }
            if ((this.bitField0_ & 256) == 256) {
                codedOutputStream.writeMessage(32, this.contract_);
            }
            for (int i18 = 0; i18 < this.compilerPluginData_.size(); i18++) {
                codedOutputStream.writeMessage(33, this.compilerPluginData_.get(i18));
            }
            for (int i19 = 0; i19 < this.extensionReceiverAnnotation_.size(); i19++) {
                codedOutputStream.writeMessage(34, this.extensionReceiverAnnotation_.get(i19));
            }
            extensionWriterNewExtensionWriter.writeUntil(19000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        private Function(boolean z11) {
            this.contextReceiverTypeIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:10:0x0044  */
        /* JADX WARN: Code duplicated, block: B:134:0x0330  */
        /* JADX WARN: Code duplicated, block: B:137:0x033c  */
        /* JADX WARN: Code duplicated, block: B:140:0x0348  */
        /* JADX WARN: Code duplicated, block: B:143:0x0354  */
        /* JADX WARN: Code duplicated, block: B:146:0x0360  */
        /* JADX WARN: Code duplicated, block: B:149:0x036c  */
        /* JADX WARN: Code duplicated, block: B:152:0x0378  */
        /* JADX WARN: Code duplicated, block: B:155:0x0386  */
        /* JADX WARN: Code duplicated, block: B:158:0x0394  */
        /* JADX WARN: Multi-variable type inference failed */
        private Function(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            int i11;
            this.contextReceiverTypeIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            boolean z11 = true;
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z12 = false;
            int i12 = 0;
            while (true) {
                int i13 = 32768;
                int i14 = 131072;
                boolean z13 = z11;
                if (!z12) {
                    try {
                        int tag = codedInputStream.readTag();
                        switch (tag) {
                            case 0:
                                z12 = z13;
                                z11 = z13;
                                break;
                            case 8:
                                this.bitField0_ |= 2;
                                this.oldFlags_ = codedInputStream.readInt32();
                                z11 = z13;
                                break;
                            case 16:
                                this.bitField0_ |= 4;
                                this.name_ = codedInputStream.readInt32();
                                z11 = z13;
                                break;
                            case 26:
                                Type.Builder builder = (this.bitField0_ & 8) == 8 ? this.returnType_.toBuilder() : null;
                                Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                this.returnType_ = type;
                                if (builder != 0) {
                                    builder.mergeFrom(type);
                                    this.returnType_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 8;
                                z11 = z13;
                                break;
                            case 34:
                                if ((i12 & 32) != 32) {
                                    this.typeParameter_ = new ArrayList();
                                    i12 |= 32;
                                }
                                this.typeParameter_.add((TypeParameter) codedInputStream.readMessage(TypeParameter.PARSER, extensionRegistryLite));
                                z11 = z13;
                                break;
                            case 42:
                                Type.Builder builder2 = (this.bitField0_ & 32) == 32 ? this.receiverType_.toBuilder() : null;
                                Type type2 = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                this.receiverType_ = type2;
                                if (builder2 != 0) {
                                    builder2.mergeFrom(type2);
                                    this.receiverType_ = builder2.buildPartial();
                                }
                                this.bitField0_ |= 32;
                                z11 = z13;
                                break;
                            case 50:
                                if ((i12 & 2048) != 2048) {
                                    this.valueParameter_ = new ArrayList();
                                    i12 |= 2048;
                                }
                                this.valueParameter_.add((ValueParameter) codedInputStream.readMessage(ValueParameter.PARSER, extensionRegistryLite));
                                z11 = z13;
                                break;
                            case 56:
                                this.bitField0_ |= 16;
                                this.returnTypeId_ = codedInputStream.readInt32();
                                z11 = z13;
                                break;
                            case 64:
                                this.bitField0_ |= 64;
                                this.receiverTypeId_ = codedInputStream.readInt32();
                                z11 = z13;
                                break;
                            case 72:
                                this.bitField0_ |= 1;
                                this.flags_ = codedInputStream.readInt32();
                                z11 = z13;
                                break;
                            case 82:
                                if ((i12 & 256) != 256) {
                                    this.contextReceiverType_ = new ArrayList();
                                    i12 |= 256;
                                }
                                this.contextReceiverType_.add((Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite));
                                z11 = z13;
                                break;
                            case 88:
                                if ((i12 & 512) != 512) {
                                    this.contextReceiverTypeId_ = new ArrayList();
                                    i12 |= 512;
                                }
                                this.contextReceiverTypeId_.add(Integer.valueOf(codedInputStream.readInt32()));
                                z11 = z13;
                                break;
                            case 90:
                                int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i12 & 512) != 512 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.contextReceiverTypeId_ = new ArrayList();
                                    i12 |= 512;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.contextReceiverTypeId_.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit);
                                z11 = z13;
                                break;
                            case 98:
                                if ((i12 & 65536) != 65536) {
                                    this.annotation_ = new ArrayList();
                                    i12 |= 65536;
                                }
                                this.annotation_.add((Annotation) codedInputStream.readMessage(Annotation.PARSER, extensionRegistryLite));
                                z11 = z13;
                                break;
                            case 106:
                                if ((i12 & 1024) != 1024) {
                                    this.contextParameter_ = new ArrayList();
                                    i12 |= 1024;
                                }
                                this.contextParameter_.add((ValueParameter) codedInputStream.readMessage(ValueParameter.PARSER, extensionRegistryLite));
                                z11 = z13;
                                break;
                            case 242:
                                TypeTable.Builder builder3 = (this.bitField0_ & 128) == 128 ? this.typeTable_.toBuilder() : null;
                                TypeTable typeTable = (TypeTable) codedInputStream.readMessage(TypeTable.PARSER, extensionRegistryLite);
                                this.typeTable_ = typeTable;
                                if (builder3 != 0) {
                                    builder3.mergeFrom(typeTable);
                                    this.typeTable_ = builder3.buildPartial();
                                }
                                this.bitField0_ |= 128;
                                z11 = z13;
                                break;
                            case 248:
                                if ((i12 & 8192) != 8192) {
                                    this.versionRequirement_ = new ArrayList();
                                    i12 |= 8192;
                                }
                                this.versionRequirement_.add(Integer.valueOf(codedInputStream.readInt32()));
                                z11 = z13;
                                break;
                            case 250:
                                i14 = 131072;
                                int iPushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i12 & 8192) != 8192 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.versionRequirement_ = new ArrayList();
                                    i12 |= 8192;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    i11 = i13;
                                    try {
                                        try {
                                            this.versionRequirement_.add(Integer.valueOf(codedInputStream.readInt32()));
                                            i13 = i11;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            if ((i12 & 32) == 32) {
                                                this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                                            }
                                            if ((i12 & 2048) == 2048) {
                                                this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
                                            }
                                            if ((i12 & 256) == 256) {
                                                this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                                            }
                                            if ((i12 & 512) == 512) {
                                                this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                                            }
                                            if ((i12 & 65536) == 65536) {
                                                this.annotation_ = Collections.unmodifiableList(this.annotation_);
                                            }
                                            if ((i12 & 1024) == 1024) {
                                                this.contextParameter_ = Collections.unmodifiableList(this.contextParameter_);
                                            }
                                            if ((i12 & 8192) == 8192) {
                                                this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                                            }
                                            if ((i12 & i11) == i11) {
                                                this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                                            }
                                            if ((i12 & i14) == i14) {
                                                this.extensionReceiverAnnotation_ = Collections.unmodifiableList(this.extensionReceiverAnnotation_);
                                            }
                                            try {
                                                codedOutputStreamNewInstance.flush();
                                                break;
                                            } catch (IOException unused) {
                                            } finally {
                                                this.unknownFields = outputNewOutput.toByteString();
                                            }
                                            makeExtensionsImmutable();
                                            throw th;
                                        }
                                    } catch (InvalidProtocolBufferException e11) {
                                        e = e11;
                                        throw e.setUnfinishedMessage(this);
                                    } catch (IOException e12) {
                                        e = e12;
                                        throw new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
                                    }
                                }
                                codedInputStream.popLimit(iPushLimit2);
                                z11 = z13;
                                break;
                            case 258:
                                Contract.Builder builder4 = (this.bitField0_ & 256) == 256 ? this.contract_.toBuilder() : null;
                                Contract contract = (Contract) codedInputStream.readMessage(Contract.PARSER, extensionRegistryLite);
                                this.contract_ = contract;
                                if (builder4 != 0) {
                                    builder4.mergeFrom(contract);
                                    this.contract_ = builder4.buildPartial();
                                }
                                this.bitField0_ |= 256;
                                z11 = z13;
                                break;
                            case 266:
                                if ((i12 & 32768) != 32768) {
                                    this.compilerPluginData_ = new ArrayList();
                                    i12 |= 32768;
                                }
                                this.compilerPluginData_.add((CompilerPluginData) codedInputStream.readMessage(CompilerPluginData.PARSER, extensionRegistryLite));
                                z11 = z13;
                                break;
                            case 274:
                                if ((i12 & 131072) != 131072) {
                                    this.extensionReceiverAnnotation_ = new ArrayList();
                                    i12 |= 131072;
                                }
                                try {
                                    try {
                                        this.extensionReceiverAnnotation_.add((Annotation) codedInputStream.readMessage(Annotation.PARSER, extensionRegistryLite));
                                        z11 = z13;
                                    } catch (InvalidProtocolBufferException e13) {
                                        e = e13;
                                        throw e.setUnfinishedMessage(this);
                                    } catch (IOException e14) {
                                        e = e14;
                                        throw new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        i11 = 32768;
                                        if ((i12 & 32) == 32) {
                                            this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                                        }
                                        if ((i12 & 2048) == 2048) {
                                            this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
                                        }
                                        if ((i12 & 256) == 256) {
                                            this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                                        }
                                        if ((i12 & 512) == 512) {
                                            this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                                        }
                                        if ((i12 & 65536) == 65536) {
                                            this.annotation_ = Collections.unmodifiableList(this.annotation_);
                                        }
                                        if ((i12 & 1024) == 1024) {
                                            this.contextParameter_ = Collections.unmodifiableList(this.contextParameter_);
                                        }
                                        if ((i12 & 8192) == 8192) {
                                            this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                                        }
                                        if ((i12 & i11) == i11) {
                                            this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                                        }
                                        if ((i12 & i14) == i14) {
                                            this.extensionReceiverAnnotation_ = Collections.unmodifiableList(this.extensionReceiverAnnotation_);
                                        }
                                        codedOutputStreamNewInstance.flush();
                                        makeExtensionsImmutable();
                                        throw th;
                                    }
                                } catch (InvalidProtocolBufferException e15) {
                                    e = e15;
                                } catch (IOException e16) {
                                    e = e16;
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                                break;
                            default:
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    z12 = z13;
                                }
                                z11 = z13;
                                break;
                        }
                    } catch (InvalidProtocolBufferException e17) {
                        e = e17;
                    } catch (IOException e18) {
                        e = e18;
                    } catch (Throwable th5) {
                        th = th5;
                        i11 = 32768;
                        i14 = 131072;
                    }
                } else {
                    if ((i12 & 32) == 32) {
                        this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                    }
                    if ((i12 & 2048) == 2048) {
                        this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
                    }
                    if ((i12 & 256) == 256) {
                        this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                    }
                    if ((i12 & 512) == 512) {
                        this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                    }
                    if ((i12 & 65536) == 65536) {
                        this.annotation_ = Collections.unmodifiableList(this.annotation_);
                    }
                    if ((i12 & 1024) == 1024) {
                        this.contextParameter_ = Collections.unmodifiableList(this.contextParameter_);
                    }
                    if ((i12 & 8192) == 8192) {
                        this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    }
                    if ((i12 & 32768) == 32768) {
                        this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                    }
                    if ((i12 & 131072) == 131072) {
                        this.extensionReceiverAnnotation_ = Collections.unmodifiableList(this.extensionReceiverAnnotation_);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused2) {
                    } finally {
                        this.unknownFields = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    return;
                }
            }
        }
    }

    public interface FunctionOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public enum MemberKind implements Internal.EnumLite {
        DECLARATION(0, 0),
        FAKE_OVERRIDE(1, 1),
        DELEGATION(2, 2),
        SYNTHESIZED(3, 3);

        private static Internal.EnumLiteMap<MemberKind> internalValueMap = new Internal.EnumLiteMap<MemberKind>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.MemberKind.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
            public MemberKind findValueByNumber(int i11) {
                return MemberKind.valueOf(i11);
            }
        };
        private final int value;

        public static MemberKind valueOf(int i11) {
            if (i11 == 0) {
                return DECLARATION;
            }
            if (i11 == 1) {
                return FAKE_OVERRIDE;
            }
            if (i11 == 2) {
                return DELEGATION;
            }
            if (i11 != 3) {
                return null;
            }
            return SYNTHESIZED;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        MemberKind(int i11, int i12) {
            this.value = i12;
        }
    }

    public enum Modality implements Internal.EnumLite {
        FINAL(0, 0),
        OPEN(1, 1),
        ABSTRACT(2, 2),
        SEALED(3, 3);

        private static Internal.EnumLiteMap<Modality> internalValueMap = new Internal.EnumLiteMap<Modality>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
            public Modality findValueByNumber(int i11) {
                return Modality.valueOf(i11);
            }
        };
        private final int value;

        public static Modality valueOf(int i11) {
            if (i11 == 0) {
                return FINAL;
            }
            if (i11 == 1) {
                return OPEN;
            }
            if (i11 == 2) {
                return ABSTRACT;
            }
            if (i11 != 3) {
                return null;
            }
            return SEALED;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        Modality(int i11, int i12) {
            this.value = i12;
        }
    }

    public static final class Package extends GeneratedMessageLite.ExtendableMessage<Package> implements PackageOrBuilder {
        public static Parser<Package> PARSER = new AbstractParser<Package>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.1
            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public Package parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Package(codedInputStream, extensionRegistryLite);
            }
        };
        private static final Package defaultInstance;
        private int bitField0_;
        private List<Function> function_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List<Property> property_;
        private List<TypeAlias> typeAlias_;
        private TypeTable typeTable_;
        private final ByteString unknownFields;
        private VersionRequirementTable versionRequirementTable_;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Package, Builder> implements PackageOrBuilder {
            private int bitField0_;
            private List<Function> function_;
            private List<Property> property_;
            private List<TypeAlias> typeAlias_;
            private TypeTable typeTable_;
            private VersionRequirementTable versionRequirementTable_;

            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i11 = 0; i11 < getFunctionCount(); i11++) {
                    if (!getFunction(i11).isInitialized()) {
                        return false;
                    }
                }
                for (int i12 = 0; i12 < getPropertyCount(); i12++) {
                    if (!getProperty(i12).isInitialized()) {
                        return false;
                    }
                }
                for (int i13 = 0; i13 < getTypeAliasCount(); i13++) {
                    if (!getTypeAlias(i13).isInitialized()) {
                        return false;
                    }
                }
                return (!hasTypeTable() || getTypeTable().isInitialized()) && extensionsAreInitialized();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            private void ensureFunctionIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.function_ = new ArrayList(this.function_);
                    this.bitField0_ |= 1;
                }
            }

            private void ensurePropertyIsMutable() {
                if ((this.bitField0_ & 2) != 2) {
                    this.property_ = new ArrayList(this.property_);
                    this.bitField0_ |= 2;
                }
            }

            private void ensureTypeAliasIsMutable() {
                if ((this.bitField0_ & 4) != 4) {
                    this.typeAlias_ = new ArrayList(this.typeAlias_);
                    this.bitField0_ |= 4;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Package build() {
                Package packageBuildPartial = buildPartial();
                if (packageBuildPartial.isInitialized()) {
                    return packageBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(packageBuildPartial);
            }

            public Package buildPartial() {
                Package r11 = new Package(this);
                int i11 = this.bitField0_;
                if ((i11 & 1) == 1) {
                    this.function_ = Collections.unmodifiableList(this.function_);
                    this.bitField0_ &= -2;
                }
                r11.function_ = this.function_;
                if ((this.bitField0_ & 2) == 2) {
                    this.property_ = Collections.unmodifiableList(this.property_);
                    this.bitField0_ &= -3;
                }
                r11.property_ = this.property_;
                if ((this.bitField0_ & 4) == 4) {
                    this.typeAlias_ = Collections.unmodifiableList(this.typeAlias_);
                    this.bitField0_ &= -5;
                }
                r11.typeAlias_ = this.typeAlias_;
                int i12 = (i11 & 8) != 8 ? 0 : 1;
                r11.typeTable_ = this.typeTable_;
                if ((i11 & 16) == 16) {
                    i12 |= 2;
                }
                r11.versionRequirementTable_ = this.versionRequirementTable_;
                r11.bitField0_ = i12;
                return r11;
            }

            public Function getFunction(int i11) {
                return this.function_.get(i11);
            }

            public int getFunctionCount() {
                return this.function_.size();
            }

            public Property getProperty(int i11) {
                return this.property_.get(i11);
            }

            public int getPropertyCount() {
                return this.property_.size();
            }

            public TypeAlias getTypeAlias(int i11) {
                return this.typeAlias_.get(i11);
            }

            public int getTypeAliasCount() {
                return this.typeAlias_.size();
            }

            public TypeTable getTypeTable() {
                return this.typeTable_;
            }

            public boolean hasTypeTable() {
                return (this.bitField0_ & 8) == 8;
            }

            public Builder mergeTypeTable(TypeTable typeTable) {
                if ((this.bitField0_ & 8) != 8 || this.typeTable_ == TypeTable.getDefaultInstance()) {
                    this.typeTable_ = typeTable;
                } else {
                    this.typeTable_ = TypeTable.newBuilder(this.typeTable_).mergeFrom(typeTable).buildPartial();
                }
                this.bitField0_ |= 8;
                return this;
            }

            public Builder mergeVersionRequirementTable(VersionRequirementTable versionRequirementTable) {
                if ((this.bitField0_ & 16) != 16 || this.versionRequirementTable_ == VersionRequirementTable.getDefaultInstance()) {
                    this.versionRequirementTable_ = versionRequirementTable;
                } else {
                    this.versionRequirementTable_ = VersionRequirementTable.newBuilder(this.versionRequirementTable_).mergeFrom(versionRequirementTable).buildPartial();
                }
                this.bitField0_ |= 16;
                return this;
            }

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.function_ = list;
                this.property_ = list;
                this.typeAlias_ = list;
                this.typeTable_ = TypeTable.getDefaultInstance();
                this.versionRequirementTable_ = VersionRequirementTable.getDefaultInstance();
                maybeForceBuilderInitialization();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Package getDefaultInstanceForType() {
                return Package.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Package r11) {
                if (r11 == Package.getDefaultInstance()) {
                    return this;
                }
                if (!r11.function_.isEmpty()) {
                    if (this.function_.isEmpty()) {
                        this.function_ = r11.function_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureFunctionIsMutable();
                        this.function_.addAll(r11.function_);
                    }
                }
                if (!r11.property_.isEmpty()) {
                    if (this.property_.isEmpty()) {
                        this.property_ = r11.property_;
                        this.bitField0_ &= -3;
                    } else {
                        ensurePropertyIsMutable();
                        this.property_.addAll(r11.property_);
                    }
                }
                if (!r11.typeAlias_.isEmpty()) {
                    if (this.typeAlias_.isEmpty()) {
                        this.typeAlias_ = r11.typeAlias_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureTypeAliasIsMutable();
                        this.typeAlias_.addAll(r11.typeAlias_);
                    }
                }
                if (r11.hasTypeTable()) {
                    mergeTypeTable(r11.getTypeTable());
                }
                if (r11.hasVersionRequirementTable()) {
                    mergeVersionRequirementTable(r11.getVersionRequirementTable());
                }
                mergeExtensionFields(r11);
                setUnknownFields(getUnknownFields().concat(r11.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo105124clone() {
                return create().mergeFrom(buildPartial());
            }

            private void maybeForceBuilderInitialization() {
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Package r11 = null;
                try {
                    try {
                        Package partialFrom = Package.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        Package r12 = (Package) e11.getUnfinishedMessage();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            r11 = r12;
                            if (r11 != null) {
                                mergeFrom(r11);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (r11 != null) {
                        mergeFrom(r11);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        static {
            Package r11 = new Package(true);
            defaultInstance = r11;
            r11.initFields();
        }

        public static Package getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            List list = Collections.EMPTY_LIST;
            this.function_ = list;
            this.property_ = list;
            this.typeAlias_ = list;
            this.typeTable_ = TypeTable.getDefaultInstance();
            this.versionRequirementTable_ = VersionRequirementTable.getDefaultInstance();
        }

        public static Builder newBuilder(Package r11) {
            return newBuilder().mergeFrom(r11);
        }

        public static Package parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Package getDefaultInstanceForType() {
            return defaultInstance;
        }

        public Function getFunction(int i11) {
            return this.function_.get(i11);
        }

        public int getFunctionCount() {
            return this.function_.size();
        }

        public List<Function> getFunctionList() {
            return this.function_;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Package> getParserForType() {
            return PARSER;
        }

        public Property getProperty(int i11) {
            return this.property_.get(i11);
        }

        public int getPropertyCount() {
            return this.property_.size();
        }

        public List<Property> getPropertyList() {
            return this.property_;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i11 = this.memoizedSerializedSize;
            if (i11 != -1) {
                return i11;
            }
            int iComputeMessageSize = 0;
            for (int i12 = 0; i12 < this.function_.size(); i12++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, this.function_.get(i12));
            }
            for (int i13 = 0; i13 < this.property_.size(); i13++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, this.property_.get(i13));
            }
            for (int i14 = 0; i14 < this.typeAlias_.size(); i14++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, this.typeAlias_.get(i14));
            }
            if ((this.bitField0_ & 1) == 1) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(30, this.typeTable_);
            }
            if ((this.bitField0_ & 2) == 2) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(32, this.versionRequirementTable_);
            }
            int iExtensionsSerializedSize = iComputeMessageSize + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = iExtensionsSerializedSize;
            return iExtensionsSerializedSize;
        }

        public TypeAlias getTypeAlias(int i11) {
            return this.typeAlias_.get(i11);
        }

        public int getTypeAliasCount() {
            return this.typeAlias_.size();
        }

        public List<TypeAlias> getTypeAliasList() {
            return this.typeAlias_;
        }

        public TypeTable getTypeTable() {
            return this.typeTable_;
        }

        public VersionRequirementTable getVersionRequirementTable() {
            return this.versionRequirementTable_;
        }

        public boolean hasTypeTable() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasVersionRequirementTable() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b11 = this.memoizedIsInitialized;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            for (int i11 = 0; i11 < getFunctionCount(); i11++) {
                if (!getFunction(i11).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i12 = 0; i12 < getPropertyCount(); i12++) {
                if (!getProperty(i12).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i13 = 0; i13 < getTypeAliasCount(); i13++) {
                if (!getTypeAlias(i13).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasTypeTable() && !getTypeTable().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private Package(GeneratedMessageLite.ExtendableBuilder<Package, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            for (int i11 = 0; i11 < this.function_.size(); i11++) {
                codedOutputStream.writeMessage(3, this.function_.get(i11));
            }
            for (int i12 = 0; i12 < this.property_.size(); i12++) {
                codedOutputStream.writeMessage(4, this.property_.get(i12));
            }
            for (int i13 = 0; i13 < this.typeAlias_.size(); i13++) {
                codedOutputStream.writeMessage(5, this.typeAlias_.get(i13));
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeMessage(30, this.typeTable_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeMessage(32, this.versionRequirementTable_);
            }
            extensionWriterNewExtensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        private Package(boolean z11) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        private Package(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z11 = false;
            int i11 = 0;
            while (!z11) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 26) {
                                int i12 = (i11 == true ? 1 : 0) & 1;
                                i11 = i11;
                                if (i12 != 1) {
                                    this.function_ = new ArrayList();
                                    i11 = (i11 == true ? 1 : 0) | 1;
                                }
                                this.function_.add((Function) codedInputStream.readMessage(Function.PARSER, extensionRegistryLite));
                            } else if (tag == 34) {
                                int i13 = (i11 == true ? 1 : 0) & 2;
                                i11 = i11;
                                if (i13 != 2) {
                                    this.property_ = new ArrayList();
                                    i11 = (i11 == true ? 1 : 0) | 2;
                                }
                                this.property_.add((Property) codedInputStream.readMessage(Property.PARSER, extensionRegistryLite));
                            } else if (tag != 42) {
                                if (tag == 242) {
                                    TypeTable.Builder builder = (this.bitField0_ & 1) == 1 ? this.typeTable_.toBuilder() : null;
                                    TypeTable typeTable = (TypeTable) codedInputStream.readMessage(TypeTable.PARSER, extensionRegistryLite);
                                    this.typeTable_ = typeTable;
                                    if (builder != null) {
                                        builder.mergeFrom(typeTable);
                                        this.typeTable_ = builder.buildPartial();
                                    }
                                    this.bitField0_ |= 1;
                                } else if (tag != 258) {
                                    if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    VersionRequirementTable.Builder builder2 = (this.bitField0_ & 2) == 2 ? this.versionRequirementTable_.toBuilder() : null;
                                    VersionRequirementTable versionRequirementTable = (VersionRequirementTable) codedInputStream.readMessage(VersionRequirementTable.PARSER, extensionRegistryLite);
                                    this.versionRequirementTable_ = versionRequirementTable;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(versionRequirementTable);
                                        this.versionRequirementTable_ = builder2.buildPartial();
                                    }
                                    this.bitField0_ |= 2;
                                }
                            } else {
                                int i14 = (i11 == true ? 1 : 0) & 4;
                                i11 = i11;
                                if (i14 != 4) {
                                    this.typeAlias_ = new ArrayList();
                                    i11 = (i11 == true ? 1 : 0) | 4;
                                }
                                this.typeAlias_.add((TypeAlias) codedInputStream.readMessage(TypeAlias.PARSER, extensionRegistryLite));
                            }
                        }
                        z11 = true;
                    } catch (Throwable th2) {
                        if (((i11 == true ? 1 : 0) & 1) == 1) {
                            this.function_ = Collections.unmodifiableList(this.function_);
                        }
                        if (((i11 == true ? 1 : 0) & 2) == 2) {
                            this.property_ = Collections.unmodifiableList(this.property_);
                        }
                        if (((i11 == true ? 1 : 0) & 4) == 4) {
                            this.typeAlias_ = Collections.unmodifiableList(this.typeAlias_);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.unknownFields = outputNewOutput.toByteString();
                        }
                        makeExtensionsImmutable();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.setUnfinishedMessage(this);
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                }
            }
            if (((i11 == true ? 1 : 0) & 1) == 1) {
                this.function_ = Collections.unmodifiableList(this.function_);
            }
            if (((i11 == true ? 1 : 0) & 2) == 2) {
                this.property_ = Collections.unmodifiableList(this.property_);
            }
            if (((i11 == true ? 1 : 0) & 4) == 4) {
                this.typeAlias_ = Collections.unmodifiableList(this.typeAlias_);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public static final class PackageFragment extends GeneratedMessageLite.ExtendableMessage<PackageFragment> implements PackageFragmentOrBuilder {
        public static Parser<PackageFragment> PARSER = new AbstractParser<PackageFragment>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.1
            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public PackageFragment parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new PackageFragment(codedInputStream, extensionRegistryLite);
            }
        };
        private static final PackageFragment defaultInstance;
        private int bitField0_;
        private List<Class> class__;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Package package_;
        private QualifiedNameTable qualifiedNames_;
        private StringTable strings_;
        private final ByteString unknownFields;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<PackageFragment, Builder> implements PackageFragmentOrBuilder {
            private int bitField0_;
            private StringTable strings_ = StringTable.getDefaultInstance();
            private QualifiedNameTable qualifiedNames_ = QualifiedNameTable.getDefaultInstance();
            private Package package_ = Package.getDefaultInstance();
            private List<Class> class__ = Collections.EMPTY_LIST;

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            private void ensureClass_IsMutable() {
                if ((this.bitField0_ & 8) != 8) {
                    this.class__ = new ArrayList(this.class__);
                    this.bitField0_ |= 8;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public PackageFragment build() {
                PackageFragment packageFragmentBuildPartial = buildPartial();
                if (packageFragmentBuildPartial.isInitialized()) {
                    return packageFragmentBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(packageFragmentBuildPartial);
            }

            public PackageFragment buildPartial() {
                PackageFragment packageFragment = new PackageFragment(this);
                int i11 = this.bitField0_;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                packageFragment.strings_ = this.strings_;
                if ((i11 & 2) == 2) {
                    i12 |= 2;
                }
                packageFragment.qualifiedNames_ = this.qualifiedNames_;
                if ((i11 & 4) == 4) {
                    i12 |= 4;
                }
                packageFragment.package_ = this.package_;
                if ((this.bitField0_ & 8) == 8) {
                    this.class__ = Collections.unmodifiableList(this.class__);
                    this.bitField0_ &= -9;
                }
                packageFragment.class__ = this.class__;
                packageFragment.bitField0_ = i12;
                return packageFragment;
            }

            public Class getClass_(int i11) {
                return this.class__.get(i11);
            }

            public int getClass_Count() {
                return this.class__.size();
            }

            public Package getPackage() {
                return this.package_;
            }

            public QualifiedNameTable getQualifiedNames() {
                return this.qualifiedNames_;
            }

            public boolean hasPackage() {
                return (this.bitField0_ & 4) == 4;
            }

            public boolean hasQualifiedNames() {
                return (this.bitField0_ & 2) == 2;
            }

            public Builder mergePackage(Package r11) {
                if ((this.bitField0_ & 4) != 4 || this.package_ == Package.getDefaultInstance()) {
                    this.package_ = r11;
                } else {
                    this.package_ = Package.newBuilder(this.package_).mergeFrom(r11).buildPartial();
                }
                this.bitField0_ |= 4;
                return this;
            }

            public Builder mergeQualifiedNames(QualifiedNameTable qualifiedNameTable) {
                if ((this.bitField0_ & 2) != 2 || this.qualifiedNames_ == QualifiedNameTable.getDefaultInstance()) {
                    this.qualifiedNames_ = qualifiedNameTable;
                } else {
                    this.qualifiedNames_ = QualifiedNameTable.newBuilder(this.qualifiedNames_).mergeFrom(qualifiedNameTable).buildPartial();
                }
                this.bitField0_ |= 2;
                return this;
            }

            public Builder mergeStrings(StringTable stringTable) {
                if ((this.bitField0_ & 1) != 1 || this.strings_ == StringTable.getDefaultInstance()) {
                    this.strings_ = stringTable;
                } else {
                    this.strings_ = StringTable.newBuilder(this.strings_).mergeFrom(stringTable).buildPartial();
                }
                this.bitField0_ |= 1;
                return this;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public PackageFragment getDefaultInstanceForType() {
                return PackageFragment.getDefaultInstance();
            }

            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasQualifiedNames() && !getQualifiedNames().isInitialized()) {
                    return false;
                }
                if (hasPackage() && !getPackage().isInitialized()) {
                    return false;
                }
                for (int i11 = 0; i11 < getClass_Count(); i11++) {
                    if (!getClass_(i11).isInitialized()) {
                        return false;
                    }
                }
                if (!extensionsAreInitialized()) {
                    return false;
                }
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(PackageFragment packageFragment) {
                if (packageFragment == PackageFragment.getDefaultInstance()) {
                    return this;
                }
                if (packageFragment.hasStrings()) {
                    mergeStrings(packageFragment.getStrings());
                }
                if (packageFragment.hasQualifiedNames()) {
                    mergeQualifiedNames(packageFragment.getQualifiedNames());
                }
                if (packageFragment.hasPackage()) {
                    mergePackage(packageFragment.getPackage());
                }
                if (!packageFragment.class__.isEmpty()) {
                    if (this.class__.isEmpty()) {
                        this.class__ = packageFragment.class__;
                        this.bitField0_ &= -9;
                    } else {
                        ensureClass_IsMutable();
                        this.class__.addAll(packageFragment.class__);
                    }
                }
                mergeExtensionFields(packageFragment);
                setUnknownFields(getUnknownFields().concat(packageFragment.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo105124clone() {
                return create().mergeFrom(buildPartial());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                PackageFragment packageFragment = null;
                try {
                    try {
                        PackageFragment partialFrom = PackageFragment.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        PackageFragment packageFragment2 = (PackageFragment) e11.getUnfinishedMessage();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            packageFragment = packageFragment2;
                            if (packageFragment != null) {
                                mergeFrom(packageFragment);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (packageFragment != null) {
                        mergeFrom(packageFragment);
                    }
                    throw th;
                }
            }

            private void maybeForceBuilderInitialization() {
            }
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        static {
            PackageFragment packageFragment = new PackageFragment(true);
            defaultInstance = packageFragment;
            packageFragment.initFields();
        }

        public static PackageFragment getDefaultInstance() {
            return defaultInstance;
        }

        public static Builder newBuilder(PackageFragment packageFragment) {
            return newBuilder().mergeFrom(packageFragment);
        }

        public static PackageFragment parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public Class getClass_(int i11) {
            return this.class__.get(i11);
        }

        public int getClass_Count() {
            return this.class__.size();
        }

        public List<Class> getClass_List() {
            return this.class__;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public PackageFragment getDefaultInstanceForType() {
            return defaultInstance;
        }

        public Package getPackage() {
            return this.package_;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<PackageFragment> getParserForType() {
            return PARSER;
        }

        public QualifiedNameTable getQualifiedNames() {
            return this.qualifiedNames_;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i11 = this.memoizedSerializedSize;
            if (i11 != -1) {
                return i11;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeMessageSize(1, this.strings_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, this.qualifiedNames_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, this.package_);
            }
            for (int i12 = 0; i12 < this.class__.size(); i12++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, this.class__.get(i12));
            }
            int iExtensionsSerializedSize = iComputeMessageSize + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = iExtensionsSerializedSize;
            return iExtensionsSerializedSize;
        }

        public StringTable getStrings() {
            return this.strings_;
        }

        public boolean hasPackage() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean hasQualifiedNames() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasStrings() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b11 = this.memoizedIsInitialized;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            if (hasQualifiedNames() && !getQualifiedNames().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasPackage() && !getPackage().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i11 = 0; i11 < getClass_Count(); i11++) {
                if (!getClass_(i11).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private PackageFragment(GeneratedMessageLite.ExtendableBuilder<PackageFragment, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        private void initFields() {
            this.strings_ = StringTable.getDefaultInstance();
            this.qualifiedNames_ = QualifiedNameTable.getDefaultInstance();
            this.package_ = Package.getDefaultInstance();
            this.class__ = Collections.EMPTY_LIST;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeMessage(1, this.strings_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeMessage(2, this.qualifiedNames_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeMessage(3, this.package_);
            }
            for (int i11 = 0; i11 < this.class__.size(); i11++) {
                codedOutputStream.writeMessage(4, this.class__.get(i11));
            }
            extensionWriterNewExtensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        private PackageFragment(boolean z11) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        private PackageFragment(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z11 = false;
            char c11 = 0;
            while (!z11) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                StringTable.Builder builder = (this.bitField0_ & 1) == 1 ? this.strings_.toBuilder() : null;
                                StringTable stringTable = (StringTable) codedInputStream.readMessage(StringTable.PARSER, extensionRegistryLite);
                                this.strings_ = stringTable;
                                if (builder != null) {
                                    builder.mergeFrom(stringTable);
                                    this.strings_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 1;
                            } else if (tag == 18) {
                                QualifiedNameTable.Builder builder2 = (this.bitField0_ & 2) == 2 ? this.qualifiedNames_.toBuilder() : null;
                                QualifiedNameTable qualifiedNameTable = (QualifiedNameTable) codedInputStream.readMessage(QualifiedNameTable.PARSER, extensionRegistryLite);
                                this.qualifiedNames_ = qualifiedNameTable;
                                if (builder2 != null) {
                                    builder2.mergeFrom(qualifiedNameTable);
                                    this.qualifiedNames_ = builder2.buildPartial();
                                }
                                this.bitField0_ |= 2;
                            } else if (tag == 26) {
                                Package.Builder builder3 = (this.bitField0_ & 4) == 4 ? this.package_.toBuilder() : null;
                                Package r11 = (Package) codedInputStream.readMessage(Package.PARSER, extensionRegistryLite);
                                this.package_ = r11;
                                if (builder3 != null) {
                                    builder3.mergeFrom(r11);
                                    this.package_ = builder3.buildPartial();
                                }
                                this.bitField0_ |= 4;
                            } else if (tag != 34) {
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                int i11 = (c11 == true ? 1 : 0) & '\b';
                                c11 = c11;
                                if (i11 != 8) {
                                    this.class__ = new ArrayList();
                                    c11 = '\b';
                                }
                                this.class__.add((Class) codedInputStream.readMessage(Class.PARSER, extensionRegistryLite));
                            }
                        }
                        z11 = true;
                    } catch (Throwable th2) {
                        if (((c11 == true ? 1 : 0) & '\b') == 8) {
                            this.class__ = Collections.unmodifiableList(this.class__);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.unknownFields = outputNewOutput.toByteString();
                        }
                        makeExtensionsImmutable();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.setUnfinishedMessage(this);
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                }
            }
            if (((c11 == true ? 1 : 0) & '\b') == 8) {
                this.class__ = Collections.unmodifiableList(this.class__);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface PackageFragmentOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface PackageOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class Property extends GeneratedMessageLite.ExtendableMessage<Property> implements PropertyOrBuilder {
        public static Parser<Property> PARSER = new AbstractParser<Property>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.1
            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public Property parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Property(codedInputStream, extensionRegistryLite);
            }
        };
        private static final Property defaultInstance;
        private List<Annotation> annotation_;
        private List<Annotation> backingFieldAnnotation_;
        private int bitField0_;
        private List<CompilerPluginData> compilerPluginData_;
        private List<ValueParameter> contextParameter_;
        private int contextReceiverTypeIdMemoizedSerializedSize;
        private List<Integer> contextReceiverTypeId_;
        private List<Type> contextReceiverType_;
        private List<Annotation> delegateFieldAnnotation_;
        private List<Annotation> extensionReceiverAnnotation_;
        private int flags_;
        private List<Annotation> getterAnnotation_;
        private int getterFlags_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int name_;
        private int oldFlags_;
        private int receiverTypeId_;
        private Type receiverType_;
        private int returnTypeId_;
        private Type returnType_;
        private List<Annotation> setterAnnotation_;
        private int setterFlags_;
        private ValueParameter setterValueParameter_;
        private List<TypeParameter> typeParameter_;
        private final ByteString unknownFields;
        private List<Integer> versionRequirement_;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Property, Builder> implements PropertyOrBuilder {
            private List<Annotation> annotation_;
            private List<Annotation> backingFieldAnnotation_;
            private int bitField0_;
            private List<CompilerPluginData> compilerPluginData_;
            private List<ValueParameter> contextParameter_;
            private List<Integer> contextReceiverTypeId_;
            private List<Type> contextReceiverType_;
            private List<Annotation> delegateFieldAnnotation_;
            private List<Annotation> extensionReceiverAnnotation_;
            private List<Annotation> getterAnnotation_;
            private int getterFlags_;
            private int name_;
            private int receiverTypeId_;
            private Type receiverType_;
            private int returnTypeId_;
            private List<Annotation> setterAnnotation_;
            private int setterFlags_;
            private ValueParameter setterValueParameter_;
            private List<TypeParameter> typeParameter_;
            private List<Integer> versionRequirement_;
            private int flags_ = 518;
            private int oldFlags_ = 2054;
            private Type returnType_ = Type.getDefaultInstance();

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            private void ensureAnnotationIsMutable() {
                if ((this.bitField0_ & 65536) != 65536) {
                    this.annotation_ = new ArrayList(this.annotation_);
                    this.bitField0_ |= 65536;
                }
            }

            private void ensureBackingFieldAnnotationIsMutable() {
                if ((this.bitField0_ & 1048576) != 1048576) {
                    this.backingFieldAnnotation_ = new ArrayList(this.backingFieldAnnotation_);
                    this.bitField0_ |= 1048576;
                }
            }

            private void ensureCompilerPluginDataIsMutable() {
                if ((this.bitField0_ & 32768) != 32768) {
                    this.compilerPluginData_ = new ArrayList(this.compilerPluginData_);
                    this.bitField0_ |= 32768;
                }
            }

            private void ensureContextParameterIsMutable() {
                if ((this.bitField0_ & 1024) != 1024) {
                    this.contextParameter_ = new ArrayList(this.contextParameter_);
                    this.bitField0_ |= 1024;
                }
            }

            private void ensureContextReceiverTypeIdIsMutable() {
                if ((this.bitField0_ & 512) != 512) {
                    this.contextReceiverTypeId_ = new ArrayList(this.contextReceiverTypeId_);
                    this.bitField0_ |= 512;
                }
            }

            private void ensureContextReceiverTypeIsMutable() {
                if ((this.bitField0_ & 256) != 256) {
                    this.contextReceiverType_ = new ArrayList(this.contextReceiverType_);
                    this.bitField0_ |= 256;
                }
            }

            private void ensureDelegateFieldAnnotationIsMutable() {
                if ((this.bitField0_ & 2097152) != 2097152) {
                    this.delegateFieldAnnotation_ = new ArrayList(this.delegateFieldAnnotation_);
                    this.bitField0_ |= 2097152;
                }
            }

            private void ensureExtensionReceiverAnnotationIsMutable() {
                if ((this.bitField0_ & 524288) != 524288) {
                    this.extensionReceiverAnnotation_ = new ArrayList(this.extensionReceiverAnnotation_);
                    this.bitField0_ |= 524288;
                }
            }

            private void ensureGetterAnnotationIsMutable() {
                if ((this.bitField0_ & 131072) != 131072) {
                    this.getterAnnotation_ = new ArrayList(this.getterAnnotation_);
                    this.bitField0_ |= 131072;
                }
            }

            private void ensureSetterAnnotationIsMutable() {
                if ((this.bitField0_ & 262144) != 262144) {
                    this.setterAnnotation_ = new ArrayList(this.setterAnnotation_);
                    this.bitField0_ |= 262144;
                }
            }

            private void ensureTypeParameterIsMutable() {
                if ((this.bitField0_ & 32) != 32) {
                    this.typeParameter_ = new ArrayList(this.typeParameter_);
                    this.bitField0_ |= 32;
                }
            }

            private void ensureVersionRequirementIsMutable() {
                if ((this.bitField0_ & 16384) != 16384) {
                    this.versionRequirement_ = new ArrayList(this.versionRequirement_);
                    this.bitField0_ |= 16384;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Property build() {
                Property propertyBuildPartial = buildPartial();
                if (propertyBuildPartial.isInitialized()) {
                    return propertyBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(propertyBuildPartial);
            }

            public Property buildPartial() {
                Property property = new Property(this);
                int i11 = this.bitField0_;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                property.flags_ = this.flags_;
                if ((i11 & 2) == 2) {
                    i12 |= 2;
                }
                property.oldFlags_ = this.oldFlags_;
                if ((i11 & 4) == 4) {
                    i12 |= 4;
                }
                property.name_ = this.name_;
                if ((i11 & 8) == 8) {
                    i12 |= 8;
                }
                property.returnType_ = this.returnType_;
                if ((i11 & 16) == 16) {
                    i12 |= 16;
                }
                property.returnTypeId_ = this.returnTypeId_;
                if ((this.bitField0_ & 32) == 32) {
                    this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                    this.bitField0_ &= -33;
                }
                property.typeParameter_ = this.typeParameter_;
                if ((i11 & 64) == 64) {
                    i12 |= 32;
                }
                property.receiverType_ = this.receiverType_;
                if ((i11 & 128) == 128) {
                    i12 |= 64;
                }
                property.receiverTypeId_ = this.receiverTypeId_;
                if ((this.bitField0_ & 256) == 256) {
                    this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                    this.bitField0_ &= -257;
                }
                property.contextReceiverType_ = this.contextReceiverType_;
                if ((this.bitField0_ & 512) == 512) {
                    this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                    this.bitField0_ &= -513;
                }
                property.contextReceiverTypeId_ = this.contextReceiverTypeId_;
                if ((this.bitField0_ & 1024) == 1024) {
                    this.contextParameter_ = Collections.unmodifiableList(this.contextParameter_);
                    this.bitField0_ &= -1025;
                }
                property.contextParameter_ = this.contextParameter_;
                if ((i11 & 2048) == 2048) {
                    i12 |= 128;
                }
                property.setterValueParameter_ = this.setterValueParameter_;
                if ((i11 & 4096) == 4096) {
                    i12 |= 256;
                }
                property.getterFlags_ = this.getterFlags_;
                if ((i11 & 8192) == 8192) {
                    i12 |= 512;
                }
                property.setterFlags_ = this.setterFlags_;
                if ((this.bitField0_ & 16384) == 16384) {
                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    this.bitField0_ &= -16385;
                }
                property.versionRequirement_ = this.versionRequirement_;
                if ((this.bitField0_ & 32768) == 32768) {
                    this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                    this.bitField0_ &= -32769;
                }
                property.compilerPluginData_ = this.compilerPluginData_;
                if ((this.bitField0_ & 65536) == 65536) {
                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
                    this.bitField0_ &= -65537;
                }
                property.annotation_ = this.annotation_;
                if ((this.bitField0_ & 131072) == 131072) {
                    this.getterAnnotation_ = Collections.unmodifiableList(this.getterAnnotation_);
                    this.bitField0_ &= -131073;
                }
                property.getterAnnotation_ = this.getterAnnotation_;
                if ((this.bitField0_ & 262144) == 262144) {
                    this.setterAnnotation_ = Collections.unmodifiableList(this.setterAnnotation_);
                    this.bitField0_ &= -262145;
                }
                property.setterAnnotation_ = this.setterAnnotation_;
                if ((this.bitField0_ & 524288) == 524288) {
                    this.extensionReceiverAnnotation_ = Collections.unmodifiableList(this.extensionReceiverAnnotation_);
                    this.bitField0_ &= -524289;
                }
                property.extensionReceiverAnnotation_ = this.extensionReceiverAnnotation_;
                if ((this.bitField0_ & 1048576) == 1048576) {
                    this.backingFieldAnnotation_ = Collections.unmodifiableList(this.backingFieldAnnotation_);
                    this.bitField0_ &= -1048577;
                }
                property.backingFieldAnnotation_ = this.backingFieldAnnotation_;
                if ((this.bitField0_ & 2097152) == 2097152) {
                    this.delegateFieldAnnotation_ = Collections.unmodifiableList(this.delegateFieldAnnotation_);
                    this.bitField0_ &= -2097153;
                }
                property.delegateFieldAnnotation_ = this.delegateFieldAnnotation_;
                property.bitField0_ = i12;
                return property;
            }

            public Annotation getAnnotation(int i11) {
                return this.annotation_.get(i11);
            }

            public int getAnnotationCount() {
                return this.annotation_.size();
            }

            public Annotation getBackingFieldAnnotation(int i11) {
                return this.backingFieldAnnotation_.get(i11);
            }

            public int getBackingFieldAnnotationCount() {
                return this.backingFieldAnnotation_.size();
            }

            public CompilerPluginData getCompilerPluginData(int i11) {
                return this.compilerPluginData_.get(i11);
            }

            public int getCompilerPluginDataCount() {
                return this.compilerPluginData_.size();
            }

            public ValueParameter getContextParameter(int i11) {
                return this.contextParameter_.get(i11);
            }

            public int getContextParameterCount() {
                return this.contextParameter_.size();
            }

            public Type getContextReceiverType(int i11) {
                return this.contextReceiverType_.get(i11);
            }

            public int getContextReceiverTypeCount() {
                return this.contextReceiverType_.size();
            }

            public Annotation getDelegateFieldAnnotation(int i11) {
                return this.delegateFieldAnnotation_.get(i11);
            }

            public int getDelegateFieldAnnotationCount() {
                return this.delegateFieldAnnotation_.size();
            }

            public Annotation getExtensionReceiverAnnotation(int i11) {
                return this.extensionReceiverAnnotation_.get(i11);
            }

            public int getExtensionReceiverAnnotationCount() {
                return this.extensionReceiverAnnotation_.size();
            }

            public Annotation getGetterAnnotation(int i11) {
                return this.getterAnnotation_.get(i11);
            }

            public int getGetterAnnotationCount() {
                return this.getterAnnotation_.size();
            }

            public Type getReceiverType() {
                return this.receiverType_;
            }

            public Type getReturnType() {
                return this.returnType_;
            }

            public Annotation getSetterAnnotation(int i11) {
                return this.setterAnnotation_.get(i11);
            }

            public int getSetterAnnotationCount() {
                return this.setterAnnotation_.size();
            }

            public ValueParameter getSetterValueParameter() {
                return this.setterValueParameter_;
            }

            public TypeParameter getTypeParameter(int i11) {
                return this.typeParameter_.get(i11);
            }

            public int getTypeParameterCount() {
                return this.typeParameter_.size();
            }

            public boolean hasName() {
                return (this.bitField0_ & 4) == 4;
            }

            public boolean hasReceiverType() {
                return (this.bitField0_ & 64) == 64;
            }

            public boolean hasReturnType() {
                return (this.bitField0_ & 8) == 8;
            }

            public boolean hasSetterValueParameter() {
                return (this.bitField0_ & 2048) == 2048;
            }

            public Builder mergeReceiverType(Type type) {
                if ((this.bitField0_ & 64) != 64 || this.receiverType_ == Type.getDefaultInstance()) {
                    this.receiverType_ = type;
                } else {
                    this.receiverType_ = Type.newBuilder(this.receiverType_).mergeFrom(type).buildPartial();
                }
                this.bitField0_ |= 64;
                return this;
            }

            public Builder mergeReturnType(Type type) {
                if ((this.bitField0_ & 8) != 8 || this.returnType_ == Type.getDefaultInstance()) {
                    this.returnType_ = type;
                } else {
                    this.returnType_ = Type.newBuilder(this.returnType_).mergeFrom(type).buildPartial();
                }
                this.bitField0_ |= 8;
                return this;
            }

            public Builder mergeSetterValueParameter(ValueParameter valueParameter) {
                if ((this.bitField0_ & 2048) != 2048 || this.setterValueParameter_ == ValueParameter.getDefaultInstance()) {
                    this.setterValueParameter_ = valueParameter;
                } else {
                    this.setterValueParameter_ = ValueParameter.newBuilder(this.setterValueParameter_).mergeFrom(valueParameter).buildPartial();
                }
                this.bitField0_ |= 2048;
                return this;
            }

            public Builder setFlags(int i11) {
                this.bitField0_ |= 1;
                this.flags_ = i11;
                return this;
            }

            public Builder setGetterFlags(int i11) {
                this.bitField0_ |= 4096;
                this.getterFlags_ = i11;
                return this;
            }

            public Builder setName(int i11) {
                this.bitField0_ |= 4;
                this.name_ = i11;
                return this;
            }

            public Builder setOldFlags(int i11) {
                this.bitField0_ |= 2;
                this.oldFlags_ = i11;
                return this;
            }

            public Builder setReceiverTypeId(int i11) {
                this.bitField0_ |= 128;
                this.receiverTypeId_ = i11;
                return this;
            }

            public Builder setReturnTypeId(int i11) {
                this.bitField0_ |= 16;
                this.returnTypeId_ = i11;
                return this;
            }

            public Builder setSetterFlags(int i11) {
                this.bitField0_ |= 8192;
                this.setterFlags_ = i11;
                return this;
            }

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.typeParameter_ = list;
                this.receiverType_ = Type.getDefaultInstance();
                this.contextReceiverType_ = list;
                this.contextReceiverTypeId_ = list;
                this.contextParameter_ = list;
                this.setterValueParameter_ = ValueParameter.getDefaultInstance();
                this.versionRequirement_ = list;
                this.compilerPluginData_ = list;
                this.annotation_ = list;
                this.getterAnnotation_ = list;
                this.setterAnnotation_ = list;
                this.extensionReceiverAnnotation_ = list;
                this.backingFieldAnnotation_ = list;
                this.delegateFieldAnnotation_ = list;
                maybeForceBuilderInitialization();
            }

            public Builder addAllAnnotation(Iterable<? extends Annotation> iterable) {
                ensureAnnotationIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.annotation_);
                return this;
            }

            public Builder addAllBackingFieldAnnotation(Iterable<? extends Annotation> iterable) {
                ensureBackingFieldAnnotationIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.backingFieldAnnotation_);
                return this;
            }

            public Builder addAllContextReceiverType(Iterable<? extends Type> iterable) {
                ensureContextReceiverTypeIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.contextReceiverType_);
                return this;
            }

            public Builder addAllDelegateFieldAnnotation(Iterable<? extends Annotation> iterable) {
                ensureDelegateFieldAnnotationIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.delegateFieldAnnotation_);
                return this;
            }

            public Builder addAllExtensionReceiverAnnotation(Iterable<? extends Annotation> iterable) {
                ensureExtensionReceiverAnnotationIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.extensionReceiverAnnotation_);
                return this;
            }

            public Builder addAllGetterAnnotation(Iterable<? extends Annotation> iterable) {
                ensureGetterAnnotationIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.getterAnnotation_);
                return this;
            }

            public Builder addAllSetterAnnotation(Iterable<? extends Annotation> iterable) {
                ensureSetterAnnotationIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.setterAnnotation_);
                return this;
            }

            public Builder addAllVersionRequirement(Iterable<? extends Integer> iterable) {
                ensureVersionRequirementIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.versionRequirement_);
                return this;
            }

            public Builder addTypeParameter(TypeParameter typeParameter) {
                typeParameter.getClass();
                ensureTypeParameterIsMutable();
                this.typeParameter_.add(typeParameter);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Property getDefaultInstanceForType() {
                return Property.getDefaultInstance();
            }

            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                if (hasReturnType() && !getReturnType().isInitialized()) {
                    return false;
                }
                for (int i11 = 0; i11 < getTypeParameterCount(); i11++) {
                    if (!getTypeParameter(i11).isInitialized()) {
                        return false;
                    }
                }
                if (hasReceiverType() && !getReceiverType().isInitialized()) {
                    return false;
                }
                for (int i12 = 0; i12 < getContextReceiverTypeCount(); i12++) {
                    if (!getContextReceiverType(i12).isInitialized()) {
                        return false;
                    }
                }
                for (int i13 = 0; i13 < getContextParameterCount(); i13++) {
                    if (!getContextParameter(i13).isInitialized()) {
                        return false;
                    }
                }
                if (hasSetterValueParameter() && !getSetterValueParameter().isInitialized()) {
                    return false;
                }
                for (int i14 = 0; i14 < getCompilerPluginDataCount(); i14++) {
                    if (!getCompilerPluginData(i14).isInitialized()) {
                        return false;
                    }
                }
                for (int i15 = 0; i15 < getAnnotationCount(); i15++) {
                    if (!getAnnotation(i15).isInitialized()) {
                        return false;
                    }
                }
                for (int i16 = 0; i16 < getGetterAnnotationCount(); i16++) {
                    if (!getGetterAnnotation(i16).isInitialized()) {
                        return false;
                    }
                }
                for (int i17 = 0; i17 < getSetterAnnotationCount(); i17++) {
                    if (!getSetterAnnotation(i17).isInitialized()) {
                        return false;
                    }
                }
                for (int i18 = 0; i18 < getExtensionReceiverAnnotationCount(); i18++) {
                    if (!getExtensionReceiverAnnotation(i18).isInitialized()) {
                        return false;
                    }
                }
                for (int i19 = 0; i19 < getBackingFieldAnnotationCount(); i19++) {
                    if (!getBackingFieldAnnotation(i19).isInitialized()) {
                        return false;
                    }
                }
                for (int i21 = 0; i21 < getDelegateFieldAnnotationCount(); i21++) {
                    if (!getDelegateFieldAnnotation(i21).isInitialized()) {
                        return false;
                    }
                }
                if (!extensionsAreInitialized()) {
                    return false;
                }
                return true;
            }

            public Builder setReceiverType(Type type) {
                type.getClass();
                this.receiverType_ = type;
                this.bitField0_ |= 64;
                return this;
            }

            public Builder setReturnType(Type type) {
                type.getClass();
                this.returnType_ = type;
                this.bitField0_ |= 8;
                return this;
            }

            public Builder setSetterValueParameter(ValueParameter valueParameter) {
                valueParameter.getClass();
                this.setterValueParameter_ = valueParameter;
                this.bitField0_ |= 2048;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Property property) {
                if (property == Property.getDefaultInstance()) {
                    return this;
                }
                if (property.hasFlags()) {
                    setFlags(property.getFlags());
                }
                if (property.hasOldFlags()) {
                    setOldFlags(property.getOldFlags());
                }
                if (property.hasName()) {
                    setName(property.getName());
                }
                if (property.hasReturnType()) {
                    mergeReturnType(property.getReturnType());
                }
                if (property.hasReturnTypeId()) {
                    setReturnTypeId(property.getReturnTypeId());
                }
                if (!property.typeParameter_.isEmpty()) {
                    if (this.typeParameter_.isEmpty()) {
                        this.typeParameter_ = property.typeParameter_;
                        this.bitField0_ &= -33;
                    } else {
                        ensureTypeParameterIsMutable();
                        this.typeParameter_.addAll(property.typeParameter_);
                    }
                }
                if (property.hasReceiverType()) {
                    mergeReceiverType(property.getReceiverType());
                }
                if (property.hasReceiverTypeId()) {
                    setReceiverTypeId(property.getReceiverTypeId());
                }
                if (!property.contextReceiverType_.isEmpty()) {
                    if (this.contextReceiverType_.isEmpty()) {
                        this.contextReceiverType_ = property.contextReceiverType_;
                        this.bitField0_ &= -257;
                    } else {
                        ensureContextReceiverTypeIsMutable();
                        this.contextReceiverType_.addAll(property.contextReceiverType_);
                    }
                }
                if (!property.contextReceiverTypeId_.isEmpty()) {
                    if (this.contextReceiverTypeId_.isEmpty()) {
                        this.contextReceiverTypeId_ = property.contextReceiverTypeId_;
                        this.bitField0_ &= -513;
                    } else {
                        ensureContextReceiverTypeIdIsMutable();
                        this.contextReceiverTypeId_.addAll(property.contextReceiverTypeId_);
                    }
                }
                if (!property.contextParameter_.isEmpty()) {
                    if (this.contextParameter_.isEmpty()) {
                        this.contextParameter_ = property.contextParameter_;
                        this.bitField0_ &= -1025;
                    } else {
                        ensureContextParameterIsMutable();
                        this.contextParameter_.addAll(property.contextParameter_);
                    }
                }
                if (property.hasSetterValueParameter()) {
                    mergeSetterValueParameter(property.getSetterValueParameter());
                }
                if (property.hasGetterFlags()) {
                    setGetterFlags(property.getGetterFlags());
                }
                if (property.hasSetterFlags()) {
                    setSetterFlags(property.getSetterFlags());
                }
                if (!property.versionRequirement_.isEmpty()) {
                    if (this.versionRequirement_.isEmpty()) {
                        this.versionRequirement_ = property.versionRequirement_;
                        this.bitField0_ &= -16385;
                    } else {
                        ensureVersionRequirementIsMutable();
                        this.versionRequirement_.addAll(property.versionRequirement_);
                    }
                }
                if (!property.compilerPluginData_.isEmpty()) {
                    if (this.compilerPluginData_.isEmpty()) {
                        this.compilerPluginData_ = property.compilerPluginData_;
                        this.bitField0_ &= -32769;
                    } else {
                        ensureCompilerPluginDataIsMutable();
                        this.compilerPluginData_.addAll(property.compilerPluginData_);
                    }
                }
                if (!property.annotation_.isEmpty()) {
                    if (this.annotation_.isEmpty()) {
                        this.annotation_ = property.annotation_;
                        this.bitField0_ &= -65537;
                    } else {
                        ensureAnnotationIsMutable();
                        this.annotation_.addAll(property.annotation_);
                    }
                }
                if (!property.getterAnnotation_.isEmpty()) {
                    if (this.getterAnnotation_.isEmpty()) {
                        this.getterAnnotation_ = property.getterAnnotation_;
                        this.bitField0_ &= -131073;
                    } else {
                        ensureGetterAnnotationIsMutable();
                        this.getterAnnotation_.addAll(property.getterAnnotation_);
                    }
                }
                if (!property.setterAnnotation_.isEmpty()) {
                    if (this.setterAnnotation_.isEmpty()) {
                        this.setterAnnotation_ = property.setterAnnotation_;
                        this.bitField0_ &= -262145;
                    } else {
                        ensureSetterAnnotationIsMutable();
                        this.setterAnnotation_.addAll(property.setterAnnotation_);
                    }
                }
                if (!property.extensionReceiverAnnotation_.isEmpty()) {
                    if (this.extensionReceiverAnnotation_.isEmpty()) {
                        this.extensionReceiverAnnotation_ = property.extensionReceiverAnnotation_;
                        this.bitField0_ &= -524289;
                    } else {
                        ensureExtensionReceiverAnnotationIsMutable();
                        this.extensionReceiverAnnotation_.addAll(property.extensionReceiverAnnotation_);
                    }
                }
                if (!property.backingFieldAnnotation_.isEmpty()) {
                    if (this.backingFieldAnnotation_.isEmpty()) {
                        this.backingFieldAnnotation_ = property.backingFieldAnnotation_;
                        this.bitField0_ &= -1048577;
                    } else {
                        ensureBackingFieldAnnotationIsMutable();
                        this.backingFieldAnnotation_.addAll(property.backingFieldAnnotation_);
                    }
                }
                if (!property.delegateFieldAnnotation_.isEmpty()) {
                    if (this.delegateFieldAnnotation_.isEmpty()) {
                        this.delegateFieldAnnotation_ = property.delegateFieldAnnotation_;
                        this.bitField0_ &= -2097153;
                    } else {
                        ensureDelegateFieldAnnotationIsMutable();
                        this.delegateFieldAnnotation_.addAll(property.delegateFieldAnnotation_);
                    }
                }
                mergeExtensionFields(property);
                setUnknownFields(getUnknownFields().concat(property.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo105124clone() {
                return create().mergeFrom(buildPartial());
            }

            private void maybeForceBuilderInitialization() {
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Property property = null;
                try {
                    try {
                        Property partialFrom = Property.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        Property property2 = (Property) e11.getUnfinishedMessage();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            property = property2;
                            if (property != null) {
                                mergeFrom(property);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (property != null) {
                        mergeFrom(property);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        static {
            Property property = new Property(true);
            defaultInstance = property;
            property.initFields();
        }

        public static Property getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.flags_ = 518;
            this.oldFlags_ = 2054;
            this.name_ = 0;
            this.returnType_ = Type.getDefaultInstance();
            this.returnTypeId_ = 0;
            List list = Collections.EMPTY_LIST;
            this.typeParameter_ = list;
            this.receiverType_ = Type.getDefaultInstance();
            this.receiverTypeId_ = 0;
            this.contextReceiverType_ = list;
            this.contextReceiverTypeId_ = list;
            this.contextParameter_ = list;
            this.setterValueParameter_ = ValueParameter.getDefaultInstance();
            this.getterFlags_ = 0;
            this.setterFlags_ = 0;
            this.versionRequirement_ = list;
            this.compilerPluginData_ = list;
            this.annotation_ = list;
            this.getterAnnotation_ = list;
            this.setterAnnotation_ = list;
            this.extensionReceiverAnnotation_ = list;
            this.backingFieldAnnotation_ = list;
            this.delegateFieldAnnotation_ = list;
        }

        public static Builder newBuilder(Property property) {
            return newBuilder().mergeFrom(property);
        }

        public Annotation getAnnotation(int i11) {
            return this.annotation_.get(i11);
        }

        public int getAnnotationCount() {
            return this.annotation_.size();
        }

        public List<Annotation> getAnnotationList() {
            return this.annotation_;
        }

        public Annotation getBackingFieldAnnotation(int i11) {
            return this.backingFieldAnnotation_.get(i11);
        }

        public int getBackingFieldAnnotationCount() {
            return this.backingFieldAnnotation_.size();
        }

        public List<Annotation> getBackingFieldAnnotationList() {
            return this.backingFieldAnnotation_;
        }

        public CompilerPluginData getCompilerPluginData(int i11) {
            return this.compilerPluginData_.get(i11);
        }

        public int getCompilerPluginDataCount() {
            return this.compilerPluginData_.size();
        }

        public ValueParameter getContextParameter(int i11) {
            return this.contextParameter_.get(i11);
        }

        public int getContextParameterCount() {
            return this.contextParameter_.size();
        }

        public Type getContextReceiverType(int i11) {
            return this.contextReceiverType_.get(i11);
        }

        public int getContextReceiverTypeCount() {
            return this.contextReceiverType_.size();
        }

        public List<Integer> getContextReceiverTypeIdList() {
            return this.contextReceiverTypeId_;
        }

        public List<Type> getContextReceiverTypeList() {
            return this.contextReceiverType_;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Property getDefaultInstanceForType() {
            return defaultInstance;
        }

        public Annotation getDelegateFieldAnnotation(int i11) {
            return this.delegateFieldAnnotation_.get(i11);
        }

        public int getDelegateFieldAnnotationCount() {
            return this.delegateFieldAnnotation_.size();
        }

        public List<Annotation> getDelegateFieldAnnotationList() {
            return this.delegateFieldAnnotation_;
        }

        public Annotation getExtensionReceiverAnnotation(int i11) {
            return this.extensionReceiverAnnotation_.get(i11);
        }

        public int getExtensionReceiverAnnotationCount() {
            return this.extensionReceiverAnnotation_.size();
        }

        public List<Annotation> getExtensionReceiverAnnotationList() {
            return this.extensionReceiverAnnotation_;
        }

        public int getFlags() {
            return this.flags_;
        }

        public Annotation getGetterAnnotation(int i11) {
            return this.getterAnnotation_.get(i11);
        }

        public int getGetterAnnotationCount() {
            return this.getterAnnotation_.size();
        }

        public List<Annotation> getGetterAnnotationList() {
            return this.getterAnnotation_;
        }

        public int getGetterFlags() {
            return this.getterFlags_;
        }

        public int getName() {
            return this.name_;
        }

        public int getOldFlags() {
            return this.oldFlags_;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Property> getParserForType() {
            return PARSER;
        }

        public Type getReceiverType() {
            return this.receiverType_;
        }

        public int getReceiverTypeId() {
            return this.receiverTypeId_;
        }

        public Type getReturnType() {
            return this.returnType_;
        }

        public int getReturnTypeId() {
            return this.returnTypeId_;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i11 = this.memoizedSerializedSize;
            if (i11 != -1) {
                return i11;
            }
            int iComputeInt32Size = (this.bitField0_ & 2) == 2 ? CodedOutputStream.computeInt32Size(1, this.oldFlags_) : 0;
            if ((this.bitField0_ & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.name_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(3, this.returnType_);
            }
            for (int i12 = 0; i12 < this.typeParameter_.size(); i12++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(4, this.typeParameter_.get(i12));
            }
            if ((this.bitField0_ & 32) == 32) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(5, this.receiverType_);
            }
            if ((this.bitField0_ & 128) == 128) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(6, this.setterValueParameter_);
            }
            if ((this.bitField0_ & 256) == 256) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(7, this.getterFlags_);
            }
            if ((this.bitField0_ & 512) == 512) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(8, this.setterFlags_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(9, this.returnTypeId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(10, this.receiverTypeId_);
            }
            if ((this.bitField0_ & 1) == 1) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(11, this.flags_);
            }
            for (int i13 = 0; i13 < this.contextReceiverType_.size(); i13++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(12, this.contextReceiverType_.get(i13));
            }
            int iComputeInt32SizeNoTag = 0;
            for (int i14 = 0; i14 < this.contextReceiverTypeId_.size(); i14++) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(this.contextReceiverTypeId_.get(i14).intValue());
            }
            int iComputeMessageSize = iComputeInt32Size + iComputeInt32SizeNoTag;
            if (!getContextReceiverTypeIdList().isEmpty()) {
                iComputeMessageSize = iComputeMessageSize + 1 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag);
            }
            this.contextReceiverTypeIdMemoizedSerializedSize = iComputeInt32SizeNoTag;
            for (int i15 = 0; i15 < this.annotation_.size(); i15++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(14, this.annotation_.get(i15));
            }
            for (int i16 = 0; i16 < this.getterAnnotation_.size(); i16++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(15, this.getterAnnotation_.get(i16));
            }
            for (int i17 = 0; i17 < this.setterAnnotation_.size(); i17++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(16, this.setterAnnotation_.get(i17));
            }
            for (int i18 = 0; i18 < this.contextParameter_.size(); i18++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(17, this.contextParameter_.get(i18));
            }
            int iComputeInt32SizeNoTag2 = 0;
            for (int i19 = 0; i19 < this.versionRequirement_.size(); i19++) {
                iComputeInt32SizeNoTag2 += CodedOutputStream.computeInt32SizeNoTag(this.versionRequirement_.get(i19).intValue());
            }
            int size = iComputeMessageSize + iComputeInt32SizeNoTag2 + (getVersionRequirementList().size() * 2);
            for (int i21 = 0; i21 < this.compilerPluginData_.size(); i21++) {
                size += CodedOutputStream.computeMessageSize(32, this.compilerPluginData_.get(i21));
            }
            for (int i22 = 0; i22 < this.extensionReceiverAnnotation_.size(); i22++) {
                size += CodedOutputStream.computeMessageSize(33, this.extensionReceiverAnnotation_.get(i22));
            }
            for (int i23 = 0; i23 < this.backingFieldAnnotation_.size(); i23++) {
                size += CodedOutputStream.computeMessageSize(34, this.backingFieldAnnotation_.get(i23));
            }
            for (int i24 = 0; i24 < this.delegateFieldAnnotation_.size(); i24++) {
                size += CodedOutputStream.computeMessageSize(35, this.delegateFieldAnnotation_.get(i24));
            }
            int iExtensionsSerializedSize = size + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = iExtensionsSerializedSize;
            return iExtensionsSerializedSize;
        }

        public Annotation getSetterAnnotation(int i11) {
            return this.setterAnnotation_.get(i11);
        }

        public int getSetterAnnotationCount() {
            return this.setterAnnotation_.size();
        }

        public List<Annotation> getSetterAnnotationList() {
            return this.setterAnnotation_;
        }

        public int getSetterFlags() {
            return this.setterFlags_;
        }

        public ValueParameter getSetterValueParameter() {
            return this.setterValueParameter_;
        }

        public TypeParameter getTypeParameter(int i11) {
            return this.typeParameter_.get(i11);
        }

        public int getTypeParameterCount() {
            return this.typeParameter_.size();
        }

        public List<TypeParameter> getTypeParameterList() {
            return this.typeParameter_;
        }

        public List<Integer> getVersionRequirementList() {
            return this.versionRequirement_;
        }

        public boolean hasFlags() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasGetterFlags() {
            return (this.bitField0_ & 256) == 256;
        }

        public boolean hasName() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean hasOldFlags() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasReceiverType() {
            return (this.bitField0_ & 32) == 32;
        }

        public boolean hasReceiverTypeId() {
            return (this.bitField0_ & 64) == 64;
        }

        public boolean hasReturnType() {
            return (this.bitField0_ & 8) == 8;
        }

        public boolean hasReturnTypeId() {
            return (this.bitField0_ & 16) == 16;
        }

        public boolean hasSetterFlags() {
            return (this.bitField0_ & 512) == 512;
        }

        public boolean hasSetterValueParameter() {
            return (this.bitField0_ & 128) == 128;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b11 = this.memoizedIsInitialized;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            if (!hasName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasReturnType() && !getReturnType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i11 = 0; i11 < getTypeParameterCount(); i11++) {
                if (!getTypeParameter(i11).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasReceiverType() && !getReceiverType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i12 = 0; i12 < getContextReceiverTypeCount(); i12++) {
                if (!getContextReceiverType(i12).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i13 = 0; i13 < getContextParameterCount(); i13++) {
                if (!getContextParameter(i13).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasSetterValueParameter() && !getSetterValueParameter().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i14 = 0; i14 < getCompilerPluginDataCount(); i14++) {
                if (!getCompilerPluginData(i14).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i15 = 0; i15 < getAnnotationCount(); i15++) {
                if (!getAnnotation(i15).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i16 = 0; i16 < getGetterAnnotationCount(); i16++) {
                if (!getGetterAnnotation(i16).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i17 = 0; i17 < getSetterAnnotationCount(); i17++) {
                if (!getSetterAnnotation(i17).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i18 = 0; i18 < getExtensionReceiverAnnotationCount(); i18++) {
                if (!getExtensionReceiverAnnotation(i18).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i19 = 0; i19 < getBackingFieldAnnotationCount(); i19++) {
                if (!getBackingFieldAnnotation(i19).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i21 = 0; i21 < getDelegateFieldAnnotationCount(); i21++) {
                if (!getDelegateFieldAnnotation(i21).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private Property(GeneratedMessageLite.ExtendableBuilder<Property, ?> extendableBuilder) {
            super(extendableBuilder);
            this.contextReceiverTypeIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(1, this.oldFlags_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeInt32(2, this.name_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeMessage(3, this.returnType_);
            }
            for (int i11 = 0; i11 < this.typeParameter_.size(); i11++) {
                codedOutputStream.writeMessage(4, this.typeParameter_.get(i11));
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeMessage(5, this.receiverType_);
            }
            if ((this.bitField0_ & 128) == 128) {
                codedOutputStream.writeMessage(6, this.setterValueParameter_);
            }
            if ((this.bitField0_ & 256) == 256) {
                codedOutputStream.writeInt32(7, this.getterFlags_);
            }
            if ((this.bitField0_ & 512) == 512) {
                codedOutputStream.writeInt32(8, this.setterFlags_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeInt32(9, this.returnTypeId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.writeInt32(10, this.receiverTypeId_);
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(11, this.flags_);
            }
            for (int i12 = 0; i12 < this.contextReceiverType_.size(); i12++) {
                codedOutputStream.writeMessage(12, this.contextReceiverType_.get(i12));
            }
            if (getContextReceiverTypeIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(106);
                codedOutputStream.writeRawVarint32(this.contextReceiverTypeIdMemoizedSerializedSize);
            }
            for (int i13 = 0; i13 < this.contextReceiverTypeId_.size(); i13++) {
                codedOutputStream.writeInt32NoTag(this.contextReceiverTypeId_.get(i13).intValue());
            }
            for (int i14 = 0; i14 < this.annotation_.size(); i14++) {
                codedOutputStream.writeMessage(14, this.annotation_.get(i14));
            }
            for (int i15 = 0; i15 < this.getterAnnotation_.size(); i15++) {
                codedOutputStream.writeMessage(15, this.getterAnnotation_.get(i15));
            }
            for (int i16 = 0; i16 < this.setterAnnotation_.size(); i16++) {
                codedOutputStream.writeMessage(16, this.setterAnnotation_.get(i16));
            }
            for (int i17 = 0; i17 < this.contextParameter_.size(); i17++) {
                codedOutputStream.writeMessage(17, this.contextParameter_.get(i17));
            }
            for (int i18 = 0; i18 < this.versionRequirement_.size(); i18++) {
                codedOutputStream.writeInt32(31, this.versionRequirement_.get(i18).intValue());
            }
            for (int i19 = 0; i19 < this.compilerPluginData_.size(); i19++) {
                codedOutputStream.writeMessage(32, this.compilerPluginData_.get(i19));
            }
            for (int i21 = 0; i21 < this.extensionReceiverAnnotation_.size(); i21++) {
                codedOutputStream.writeMessage(33, this.extensionReceiverAnnotation_.get(i21));
            }
            for (int i22 = 0; i22 < this.backingFieldAnnotation_.size(); i22++) {
                codedOutputStream.writeMessage(34, this.backingFieldAnnotation_.get(i22));
            }
            for (int i23 = 0; i23 < this.delegateFieldAnnotation_.size(); i23++) {
                codedOutputStream.writeMessage(35, this.delegateFieldAnnotation_.get(i23));
            }
            extensionWriterNewExtensionWriter.writeUntil(19000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        private Property(boolean z11) {
            this.contextReceiverTypeIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:140:0x0387  */
        /* JADX WARN: Code duplicated, block: B:143:0x0395  */
        /* JADX WARN: Code duplicated, block: B:146:0x03a3  */
        /* JADX WARN: Code duplicated, block: B:149:0x03b1  */
        /* JADX WARN: Code duplicated, block: B:152:0x03bd  */
        /* JADX WARN: Code duplicated, block: B:155:0x03c9  */
        /* JADX WARN: Code duplicated, block: B:158:0x03d5  */
        /* JADX WARN: Code duplicated, block: B:161:0x03e1  */
        /* JADX WARN: Code duplicated, block: B:164:0x03ed  */
        /* JADX WARN: Code duplicated, block: B:167:0x03f9  */
        /* JADX WARN: Code duplicated, block: B:170:0x0407  */
        /* JADX WARN: Code duplicated, block: B:173:0x0415  */
        /* JADX WARN: Code duplicated, block: B:9:0x0046  */
        /* JADX WARN: Multi-variable type inference failed */
        private Property(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            int i11;
            this.contextReceiverTypeIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            boolean z11 = true;
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z12 = false;
            int i12 = 0;
            while (true) {
                int i13 = 1048576;
                int i14 = 2097152;
                boolean z13 = z11;
                if (!z12) {
                    try {
                        int tag = codedInputStream.readTag();
                        switch (tag) {
                            case 0:
                                z12 = z13;
                                z11 = z13;
                                break;
                            case 8:
                                this.bitField0_ |= 2;
                                this.oldFlags_ = codedInputStream.readInt32();
                                z11 = z13;
                                break;
                            case 16:
                                this.bitField0_ |= 4;
                                this.name_ = codedInputStream.readInt32();
                                z11 = z13;
                                break;
                            case 26:
                                Type.Builder builder = (this.bitField0_ & 8) == 8 ? this.returnType_.toBuilder() : null;
                                Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                this.returnType_ = type;
                                if (builder != 0) {
                                    builder.mergeFrom(type);
                                    this.returnType_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 8;
                                z11 = z13;
                                break;
                            case 34:
                                if ((i12 & 32) != 32) {
                                    this.typeParameter_ = new ArrayList();
                                    i12 |= 32;
                                }
                                this.typeParameter_.add((TypeParameter) codedInputStream.readMessage(TypeParameter.PARSER, extensionRegistryLite));
                                z11 = z13;
                                break;
                            case 42:
                                Type.Builder builder2 = (this.bitField0_ & 32) == 32 ? this.receiverType_.toBuilder() : null;
                                Type type2 = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                this.receiverType_ = type2;
                                if (builder2 != 0) {
                                    builder2.mergeFrom(type2);
                                    this.receiverType_ = builder2.buildPartial();
                                }
                                this.bitField0_ |= 32;
                                z11 = z13;
                                break;
                            case 50:
                                ValueParameter.Builder builder3 = (this.bitField0_ & 128) == 128 ? this.setterValueParameter_.toBuilder() : null;
                                ValueParameter valueParameter = (ValueParameter) codedInputStream.readMessage(ValueParameter.PARSER, extensionRegistryLite);
                                this.setterValueParameter_ = valueParameter;
                                if (builder3 != 0) {
                                    builder3.mergeFrom(valueParameter);
                                    this.setterValueParameter_ = builder3.buildPartial();
                                }
                                this.bitField0_ |= 128;
                                z11 = z13;
                                break;
                            case 56:
                                this.bitField0_ |= 256;
                                this.getterFlags_ = codedInputStream.readInt32();
                                z11 = z13;
                                break;
                            case 64:
                                this.bitField0_ |= 512;
                                this.setterFlags_ = codedInputStream.readInt32();
                                z11 = z13;
                                break;
                            case 72:
                                this.bitField0_ |= 16;
                                this.returnTypeId_ = codedInputStream.readInt32();
                                z11 = z13;
                                break;
                            case 80:
                                this.bitField0_ |= 64;
                                this.receiverTypeId_ = codedInputStream.readInt32();
                                z11 = z13;
                                break;
                            case 88:
                                this.bitField0_ |= 1;
                                this.flags_ = codedInputStream.readInt32();
                                z11 = z13;
                                break;
                            case 98:
                                if ((i12 & 256) != 256) {
                                    this.contextReceiverType_ = new ArrayList();
                                    i12 |= 256;
                                }
                                this.contextReceiverType_.add((Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite));
                                z11 = z13;
                                break;
                            case 104:
                                if ((i12 & 512) != 512) {
                                    this.contextReceiverTypeId_ = new ArrayList();
                                    i12 |= 512;
                                }
                                this.contextReceiverTypeId_.add(Integer.valueOf(codedInputStream.readInt32()));
                                z11 = z13;
                                break;
                            case 106:
                                int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i12 & 512) != 512 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.contextReceiverTypeId_ = new ArrayList();
                                    i12 |= 512;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.contextReceiverTypeId_.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit);
                                z11 = z13;
                                break;
                            case 114:
                                if ((i12 & 65536) != 65536) {
                                    this.annotation_ = new ArrayList();
                                    i12 |= 65536;
                                }
                                this.annotation_.add((Annotation) codedInputStream.readMessage(Annotation.PARSER, extensionRegistryLite));
                                z11 = z13;
                                break;
                            case 122:
                                if ((i12 & 131072) != 131072) {
                                    this.getterAnnotation_ = new ArrayList();
                                    i12 |= 131072;
                                }
                                this.getterAnnotation_.add((Annotation) codedInputStream.readMessage(Annotation.PARSER, extensionRegistryLite));
                                z11 = z13;
                                break;
                            case 130:
                                if ((i12 & 262144) != 262144) {
                                    this.setterAnnotation_ = new ArrayList();
                                    i12 |= 262144;
                                }
                                this.setterAnnotation_.add((Annotation) codedInputStream.readMessage(Annotation.PARSER, extensionRegistryLite));
                                z11 = z13;
                                break;
                            case 138:
                                if ((i12 & 1024) != 1024) {
                                    this.contextParameter_ = new ArrayList();
                                    i12 |= 1024;
                                }
                                this.contextParameter_.add((ValueParameter) codedInputStream.readMessage(ValueParameter.PARSER, extensionRegistryLite));
                                z11 = z13;
                                break;
                            case 248:
                                if ((i12 & 16384) != 16384) {
                                    this.versionRequirement_ = new ArrayList();
                                    i12 |= 16384;
                                }
                                this.versionRequirement_.add(Integer.valueOf(codedInputStream.readInt32()));
                                z11 = z13;
                                break;
                            case 250:
                                i14 = 2097152;
                                int iPushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i12 & 16384) != 16384 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.versionRequirement_ = new ArrayList();
                                    i12 |= 16384;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    i11 = i13;
                                    try {
                                        try {
                                            this.versionRequirement_.add(Integer.valueOf(codedInputStream.readInt32()));
                                            i13 = i11;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            if ((i12 & 32) == 32) {
                                                this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                                            }
                                            if ((i12 & 256) == 256) {
                                                this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                                            }
                                            if ((i12 & 512) == 512) {
                                                this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                                            }
                                            if ((i12 & 65536) == 65536) {
                                                this.annotation_ = Collections.unmodifiableList(this.annotation_);
                                            }
                                            if ((i12 & 131072) == 131072) {
                                                this.getterAnnotation_ = Collections.unmodifiableList(this.getterAnnotation_);
                                            }
                                            if ((i12 & 262144) == 262144) {
                                                this.setterAnnotation_ = Collections.unmodifiableList(this.setterAnnotation_);
                                            }
                                            if ((i12 & 1024) == 1024) {
                                                this.contextParameter_ = Collections.unmodifiableList(this.contextParameter_);
                                            }
                                            if ((i12 & 16384) == 16384) {
                                                this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                                            }
                                            if ((i12 & 32768) == 32768) {
                                                this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                                            }
                                            if ((i12 & 524288) == 524288) {
                                                this.extensionReceiverAnnotation_ = Collections.unmodifiableList(this.extensionReceiverAnnotation_);
                                            }
                                            if ((i12 & i11) == i11) {
                                                this.backingFieldAnnotation_ = Collections.unmodifiableList(this.backingFieldAnnotation_);
                                            }
                                            if ((i12 & i14) == i14) {
                                                this.delegateFieldAnnotation_ = Collections.unmodifiableList(this.delegateFieldAnnotation_);
                                            }
                                            try {
                                                codedOutputStreamNewInstance.flush();
                                                break;
                                            } catch (IOException unused) {
                                            } finally {
                                                this.unknownFields = outputNewOutput.toByteString();
                                            }
                                            makeExtensionsImmutable();
                                            throw th;
                                        }
                                    } catch (InvalidProtocolBufferException e11) {
                                        e = e11;
                                        throw e.setUnfinishedMessage(this);
                                    } catch (IOException e12) {
                                        e = e12;
                                        throw new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
                                    }
                                }
                                codedInputStream.popLimit(iPushLimit2);
                                z11 = z13;
                                break;
                            case 258:
                                if ((i12 & 32768) != 32768) {
                                    this.compilerPluginData_ = new ArrayList();
                                    i12 |= 32768;
                                }
                                this.compilerPluginData_.add((CompilerPluginData) codedInputStream.readMessage(CompilerPluginData.PARSER, extensionRegistryLite));
                                z11 = z13;
                                break;
                            case 266:
                                if ((i12 & 524288) != 524288) {
                                    this.extensionReceiverAnnotation_ = new ArrayList();
                                    i12 |= 524288;
                                }
                                this.extensionReceiverAnnotation_.add((Annotation) codedInputStream.readMessage(Annotation.PARSER, extensionRegistryLite));
                                z11 = z13;
                                break;
                            case 274:
                                if ((i12 & 1048576) != 1048576) {
                                    this.backingFieldAnnotation_ = new ArrayList();
                                    i12 |= 1048576;
                                }
                                this.backingFieldAnnotation_.add((Annotation) codedInputStream.readMessage(Annotation.PARSER, extensionRegistryLite));
                                z11 = z13;
                                break;
                            case 282:
                                if ((i12 & 2097152) != 2097152) {
                                    this.delegateFieldAnnotation_ = new ArrayList();
                                    i12 |= 2097152;
                                }
                                try {
                                    try {
                                        this.delegateFieldAnnotation_.add((Annotation) codedInputStream.readMessage(Annotation.PARSER, extensionRegistryLite));
                                        z11 = z13;
                                    } catch (InvalidProtocolBufferException e13) {
                                        e = e13;
                                        throw e.setUnfinishedMessage(this);
                                    } catch (IOException e14) {
                                        e = e14;
                                        throw new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        i11 = 1048576;
                                        if ((i12 & 32) == 32) {
                                            this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                                        }
                                        if ((i12 & 256) == 256) {
                                            this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                                        }
                                        if ((i12 & 512) == 512) {
                                            this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                                        }
                                        if ((i12 & 65536) == 65536) {
                                            this.annotation_ = Collections.unmodifiableList(this.annotation_);
                                        }
                                        if ((i12 & 131072) == 131072) {
                                            this.getterAnnotation_ = Collections.unmodifiableList(this.getterAnnotation_);
                                        }
                                        if ((i12 & 262144) == 262144) {
                                            this.setterAnnotation_ = Collections.unmodifiableList(this.setterAnnotation_);
                                        }
                                        if ((i12 & 1024) == 1024) {
                                            this.contextParameter_ = Collections.unmodifiableList(this.contextParameter_);
                                        }
                                        if ((i12 & 16384) == 16384) {
                                            this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                                        }
                                        if ((i12 & 32768) == 32768) {
                                            this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                                        }
                                        if ((i12 & 524288) == 524288) {
                                            this.extensionReceiverAnnotation_ = Collections.unmodifiableList(this.extensionReceiverAnnotation_);
                                        }
                                        if ((i12 & i11) == i11) {
                                            this.backingFieldAnnotation_ = Collections.unmodifiableList(this.backingFieldAnnotation_);
                                        }
                                        if ((i12 & i14) == i14) {
                                            this.delegateFieldAnnotation_ = Collections.unmodifiableList(this.delegateFieldAnnotation_);
                                        }
                                        codedOutputStreamNewInstance.flush();
                                        makeExtensionsImmutable();
                                        throw th;
                                    }
                                } catch (InvalidProtocolBufferException e15) {
                                    e = e15;
                                } catch (IOException e16) {
                                    e = e16;
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                                break;
                            default:
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    z12 = z13;
                                }
                                z11 = z13;
                                break;
                        }
                    } catch (InvalidProtocolBufferException e17) {
                        e = e17;
                    } catch (IOException e18) {
                        e = e18;
                    } catch (Throwable th5) {
                        th = th5;
                        i11 = 1048576;
                        i14 = 2097152;
                    }
                } else {
                    if ((i12 & 32) == 32) {
                        this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                    }
                    if ((i12 & 256) == 256) {
                        this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                    }
                    if ((i12 & 512) == 512) {
                        this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                    }
                    if ((i12 & 65536) == 65536) {
                        this.annotation_ = Collections.unmodifiableList(this.annotation_);
                    }
                    if ((i12 & 131072) == 131072) {
                        this.getterAnnotation_ = Collections.unmodifiableList(this.getterAnnotation_);
                    }
                    if ((i12 & 262144) == 262144) {
                        this.setterAnnotation_ = Collections.unmodifiableList(this.setterAnnotation_);
                    }
                    if ((i12 & 1024) == 1024) {
                        this.contextParameter_ = Collections.unmodifiableList(this.contextParameter_);
                    }
                    if ((i12 & 16384) == 16384) {
                        this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    }
                    if ((i12 & 32768) == 32768) {
                        this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                    }
                    if ((i12 & 524288) == 524288) {
                        this.extensionReceiverAnnotation_ = Collections.unmodifiableList(this.extensionReceiverAnnotation_);
                    }
                    if ((i12 & 1048576) == 1048576) {
                        this.backingFieldAnnotation_ = Collections.unmodifiableList(this.backingFieldAnnotation_);
                    }
                    if ((i12 & 2097152) == 2097152) {
                        this.delegateFieldAnnotation_ = Collections.unmodifiableList(this.delegateFieldAnnotation_);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused2) {
                    } finally {
                        this.unknownFields = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    return;
                }
            }
        }
    }

    public interface PropertyOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class QualifiedNameTable extends GeneratedMessageLite implements QualifiedNameTableOrBuilder {
        public static Parser<QualifiedNameTable> PARSER = new AbstractParser<QualifiedNameTable>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.1
            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public QualifiedNameTable parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new QualifiedNameTable(codedInputStream, extensionRegistryLite);
            }
        };
        private static final QualifiedNameTable defaultInstance;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List<QualifiedName> qualifiedName_;
        private final ByteString unknownFields;

        public static final class Builder extends GeneratedMessageLite.Builder<QualifiedNameTable, Builder> implements QualifiedNameTableOrBuilder {
            private int bitField0_;
            private List<QualifiedName> qualifiedName_ = Collections.EMPTY_LIST;

            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i11 = 0; i11 < getQualifiedNameCount(); i11++) {
                    if (!getQualifiedName(i11).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            private void ensureQualifiedNameIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.qualifiedName_ = new ArrayList(this.qualifiedName_);
                    this.bitField0_ |= 1;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public QualifiedNameTable build() {
                QualifiedNameTable qualifiedNameTableBuildPartial = buildPartial();
                if (qualifiedNameTableBuildPartial.isInitialized()) {
                    return qualifiedNameTableBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(qualifiedNameTableBuildPartial);
            }

            public QualifiedNameTable buildPartial() {
                QualifiedNameTable qualifiedNameTable = new QualifiedNameTable(this);
                if ((this.bitField0_ & 1) == 1) {
                    this.qualifiedName_ = Collections.unmodifiableList(this.qualifiedName_);
                    this.bitField0_ &= -2;
                }
                qualifiedNameTable.qualifiedName_ = this.qualifiedName_;
                return qualifiedNameTable;
            }

            public QualifiedName getQualifiedName(int i11) {
                return this.qualifiedName_.get(i11);
            }

            public int getQualifiedNameCount() {
                return this.qualifiedName_.size();
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public QualifiedNameTable getDefaultInstanceForType() {
                return QualifiedNameTable.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo105124clone() {
                return create().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(QualifiedNameTable qualifiedNameTable) {
                if (qualifiedNameTable == QualifiedNameTable.getDefaultInstance()) {
                    return this;
                }
                if (!qualifiedNameTable.qualifiedName_.isEmpty()) {
                    if (this.qualifiedName_.isEmpty()) {
                        this.qualifiedName_ = qualifiedNameTable.qualifiedName_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureQualifiedNameIsMutable();
                        this.qualifiedName_.addAll(qualifiedNameTable.qualifiedName_);
                    }
                }
                setUnknownFields(getUnknownFields().concat(qualifiedNameTable.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                QualifiedNameTable qualifiedNameTable = null;
                try {
                    try {
                        QualifiedNameTable partialFrom = QualifiedNameTable.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        QualifiedNameTable qualifiedNameTable2 = (QualifiedNameTable) e11.getUnfinishedMessage();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            qualifiedNameTable = qualifiedNameTable2;
                            if (qualifiedNameTable != null) {
                                mergeFrom(qualifiedNameTable);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (qualifiedNameTable != null) {
                        mergeFrom(qualifiedNameTable);
                    }
                    throw th;
                }
            }

            private void maybeForceBuilderInitialization() {
            }
        }

        public static final class QualifiedName extends GeneratedMessageLite implements QualifiedNameOrBuilder {
            public static Parser<QualifiedName> PARSER = new AbstractParser<QualifiedName>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.1
                @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.Parser
                public QualifiedName parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new QualifiedName(codedInputStream, extensionRegistryLite);
                }
            };
            private static final QualifiedName defaultInstance;
            private int bitField0_;
            private Kind kind_;
            private byte memoizedIsInitialized;
            private int memoizedSerializedSize;
            private int parentQualifiedName_;
            private int shortName_;
            private final ByteString unknownFields;

            public static final class Builder extends GeneratedMessageLite.Builder<QualifiedName, Builder> implements QualifiedNameOrBuilder {
                private int bitField0_;
                private int shortName_;
                private int parentQualifiedName_ = -1;
                private Kind kind_ = Kind.PACKAGE;

                /* JADX INFO: Access modifiers changed from: private */
                public static Builder create() {
                    return new Builder();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public QualifiedName build() {
                    QualifiedName qualifiedNameBuildPartial = buildPartial();
                    if (qualifiedNameBuildPartial.isInitialized()) {
                        return qualifiedNameBuildPartial;
                    }
                    throw AbstractMessageLite.Builder.newUninitializedMessageException(qualifiedNameBuildPartial);
                }

                public QualifiedName buildPartial() {
                    QualifiedName qualifiedName = new QualifiedName(this);
                    int i11 = this.bitField0_;
                    int i12 = (i11 & 1) != 1 ? 0 : 1;
                    qualifiedName.parentQualifiedName_ = this.parentQualifiedName_;
                    if ((i11 & 2) == 2) {
                        i12 |= 2;
                    }
                    qualifiedName.shortName_ = this.shortName_;
                    if ((i11 & 4) == 4) {
                        i12 |= 4;
                    }
                    qualifiedName.kind_ = this.kind_;
                    qualifiedName.bitField0_ = i12;
                    return qualifiedName;
                }

                public boolean hasShortName() {
                    return (this.bitField0_ & 2) == 2;
                }

                public Builder setParentQualifiedName(int i11) {
                    this.bitField0_ |= 1;
                    this.parentQualifiedName_ = i11;
                    return this;
                }

                public Builder setShortName(int i11) {
                    this.bitField0_ |= 2;
                    this.shortName_ = i11;
                    return this;
                }

                private Builder() {
                    maybeForceBuilderInitialization();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public QualifiedName getDefaultInstanceForType() {
                    return QualifiedName.getDefaultInstance();
                }

                @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    if (!hasShortName()) {
                        return false;
                    }
                    return true;
                }

                public Builder setKind(Kind kind) {
                    kind.getClass();
                    this.bitField0_ |= 4;
                    this.kind_ = kind;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo105124clone() {
                    return create().mergeFrom(buildPartial());
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                public Builder mergeFrom(QualifiedName qualifiedName) {
                    if (qualifiedName == QualifiedName.getDefaultInstance()) {
                        return this;
                    }
                    if (qualifiedName.hasParentQualifiedName()) {
                        setParentQualifiedName(qualifiedName.getParentQualifiedName());
                    }
                    if (qualifiedName.hasShortName()) {
                        setShortName(qualifiedName.getShortName());
                    }
                    if (qualifiedName.hasKind()) {
                        setKind(qualifiedName.getKind());
                    }
                    setUnknownFields(getUnknownFields().concat(qualifiedName.unknownFields));
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    QualifiedName qualifiedName = null;
                    try {
                        try {
                            QualifiedName partialFrom = QualifiedName.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (partialFrom != null) {
                                mergeFrom(partialFrom);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e11) {
                            QualifiedName qualifiedName2 = (QualifiedName) e11.getUnfinishedMessage();
                            try {
                                throw e11;
                            } catch (Throwable th2) {
                                th = th2;
                                qualifiedName = qualifiedName2;
                                if (qualifiedName != null) {
                                    mergeFrom(qualifiedName);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (qualifiedName != null) {
                            mergeFrom(qualifiedName);
                        }
                        throw th;
                    }
                }

                private void maybeForceBuilderInitialization() {
                }
            }

            public enum Kind implements Internal.EnumLite {
                CLASS(0, 0),
                PACKAGE(1, 1),
                LOCAL(2, 2);

                private static Internal.EnumLiteMap<Kind> internalValueMap = new Internal.EnumLiteMap<Kind>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind.1
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                    public Kind findValueByNumber(int i11) {
                        return Kind.valueOf(i11);
                    }
                };
                private final int value;

                public static Kind valueOf(int i11) {
                    if (i11 == 0) {
                        return CLASS;
                    }
                    if (i11 == 1) {
                        return PACKAGE;
                    }
                    if (i11 != 2) {
                        return null;
                    }
                    return LOCAL;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.value;
                }

                Kind(int i11, int i12) {
                    this.value = i12;
                }
            }

            private void initFields() {
                this.parentQualifiedName_ = -1;
                this.shortName_ = 0;
                this.kind_ = Kind.PACKAGE;
            }

            public static Builder newBuilder() {
                return Builder.create();
            }

            static {
                QualifiedName qualifiedName = new QualifiedName(true);
                defaultInstance = qualifiedName;
                qualifiedName.initFields();
            }

            public static QualifiedName getDefaultInstance() {
                return defaultInstance;
            }

            public static Builder newBuilder(QualifiedName qualifiedName) {
                return newBuilder().mergeFrom(qualifiedName);
            }

            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public QualifiedName getDefaultInstanceForType() {
                return defaultInstance;
            }

            public Kind getKind() {
                return this.kind_;
            }

            public int getParentQualifiedName() {
                return this.parentQualifiedName_;
            }

            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Parser<QualifiedName> getParserForType() {
                return PARSER;
            }

            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int getSerializedSize() {
                int i11 = this.memoizedSerializedSize;
                if (i11 != -1) {
                    return i11;
                }
                int iComputeInt32Size = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.parentQualifiedName_) : 0;
                if ((this.bitField0_ & 2) == 2) {
                    iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.shortName_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    iComputeInt32Size += CodedOutputStream.computeEnumSize(3, this.kind_.getNumber());
                }
                int size = iComputeInt32Size + this.unknownFields.size();
                this.memoizedSerializedSize = size;
                return size;
            }

            public int getShortName() {
                return this.shortName_;
            }

            public boolean hasKind() {
                return (this.bitField0_ & 4) == 4;
            }

            public boolean hasParentQualifiedName() {
                return (this.bitField0_ & 1) == 1;
            }

            public boolean hasShortName() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b11 = this.memoizedIsInitialized;
                if (b11 == 1) {
                    return true;
                }
                if (b11 == 0) {
                    return false;
                }
                if (hasShortName()) {
                    this.memoizedIsInitialized = (byte) 1;
                    return true;
                }
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }

            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder newBuilderForType() {
                return newBuilder();
            }

            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder toBuilder() {
                return newBuilder(this);
            }

            private QualifiedName(GeneratedMessageLite.Builder builder) {
                super(builder);
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = builder.getUnknownFields();
            }

            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if ((this.bitField0_ & 1) == 1) {
                    codedOutputStream.writeInt32(1, this.parentQualifiedName_);
                }
                if ((this.bitField0_ & 2) == 2) {
                    codedOutputStream.writeInt32(2, this.shortName_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    codedOutputStream.writeEnum(3, this.kind_.getNumber());
                }
                codedOutputStream.writeRawBytes(this.unknownFields);
            }

            private QualifiedName(boolean z11) {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = ByteString.EMPTY;
            }

            private QualifiedName(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                initFields();
                ByteString.Output outputNewOutput = ByteString.newOutput();
                CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
                boolean z11 = false;
                while (!z11) {
                    try {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 8) {
                                        this.bitField0_ |= 1;
                                        this.parentQualifiedName_ = codedInputStream.readInt32();
                                    } else if (tag == 16) {
                                        this.bitField0_ |= 2;
                                        this.shortName_ = codedInputStream.readInt32();
                                    } else if (tag != 24) {
                                        if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                        }
                                    } else {
                                        int i11 = codedInputStream.readEnum();
                                        Kind kindValueOf = Kind.valueOf(i11);
                                        if (kindValueOf == null) {
                                            codedOutputStreamNewInstance.writeRawVarint32(tag);
                                            codedOutputStreamNewInstance.writeRawVarint32(i11);
                                        } else {
                                            this.bitField0_ |= 4;
                                            this.kind_ = kindValueOf;
                                        }
                                    }
                                }
                                z11 = true;
                            } catch (InvalidProtocolBufferException e11) {
                                throw e11.setUnfinishedMessage(this);
                            }
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                        }
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.unknownFields = outputNewOutput.toByteString();
                        }
                        makeExtensionsImmutable();
                        throw th2;
                    }
                }
                try {
                    codedOutputStreamNewInstance.flush();
                } catch (IOException unused2) {
                } finally {
                    this.unknownFields = outputNewOutput.toByteString();
                }
                makeExtensionsImmutable();
            }
        }

        public interface QualifiedNameOrBuilder extends MessageLiteOrBuilder {
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        static {
            QualifiedNameTable qualifiedNameTable = new QualifiedNameTable(true);
            defaultInstance = qualifiedNameTable;
            qualifiedNameTable.initFields();
        }

        public static QualifiedNameTable getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.qualifiedName_ = Collections.EMPTY_LIST;
        }

        public static Builder newBuilder(QualifiedNameTable qualifiedNameTable) {
            return newBuilder().mergeFrom(qualifiedNameTable);
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public QualifiedNameTable getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<QualifiedNameTable> getParserForType() {
            return PARSER;
        }

        public QualifiedName getQualifiedName(int i11) {
            return this.qualifiedName_.get(i11);
        }

        public int getQualifiedNameCount() {
            return this.qualifiedName_.size();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i11 = this.memoizedSerializedSize;
            if (i11 != -1) {
                return i11;
            }
            int iComputeMessageSize = 0;
            for (int i12 = 0; i12 < this.qualifiedName_.size(); i12++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.qualifiedName_.get(i12));
            }
            int size = iComputeMessageSize + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b11 = this.memoizedIsInitialized;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            for (int i11 = 0; i11 < getQualifiedNameCount(); i11++) {
                if (!getQualifiedName(i11).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private QualifiedNameTable(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i11 = 0; i11 < this.qualifiedName_.size(); i11++) {
                codedOutputStream.writeMessage(1, this.qualifiedName_.get(i11));
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        private QualifiedNameTable(boolean z11) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        private QualifiedNameTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z11 = false;
            boolean z12 = false;
            while (!z11) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag != 10) {
                                    if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    if (!z12) {
                                        this.qualifiedName_ = new ArrayList();
                                        z12 = true;
                                    }
                                    this.qualifiedName_.add((QualifiedName) codedInputStream.readMessage(QualifiedName.PARSER, extensionRegistryLite));
                                }
                            }
                            z11 = true;
                        } catch (InvalidProtocolBufferException e11) {
                            throw e11.setUnfinishedMessage(this);
                        }
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if (z12) {
                        this.qualifiedName_ = Collections.unmodifiableList(this.qualifiedName_);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.unknownFields = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (z12) {
                this.qualifiedName_ = Collections.unmodifiableList(this.qualifiedName_);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface QualifiedNameTableOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class StringTable extends GeneratedMessageLite implements StringTableOrBuilder {
        public static Parser<StringTable> PARSER = new AbstractParser<StringTable>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.1
            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public StringTable parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new StringTable(codedInputStream, extensionRegistryLite);
            }
        };
        private static final StringTable defaultInstance;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private LazyStringList string_;
        private final ByteString unknownFields;

        public static final class Builder extends GeneratedMessageLite.Builder<StringTable, Builder> implements StringTableOrBuilder {
            private int bitField0_;
            private LazyStringList string_ = LazyStringArrayList.EMPTY;

            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            private void ensureStringIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.string_ = new LazyStringArrayList(this.string_);
                    this.bitField0_ |= 1;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public StringTable build() {
                StringTable stringTableBuildPartial = buildPartial();
                if (stringTableBuildPartial.isInitialized()) {
                    return stringTableBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(stringTableBuildPartial);
            }

            public StringTable buildPartial() {
                StringTable stringTable = new StringTable(this);
                if ((this.bitField0_ & 1) == 1) {
                    this.string_ = this.string_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                stringTable.string_ = this.string_;
                return stringTable;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public StringTable getDefaultInstanceForType() {
                return StringTable.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo105124clone() {
                return create().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(StringTable stringTable) {
                if (stringTable == StringTable.getDefaultInstance()) {
                    return this;
                }
                if (!stringTable.string_.isEmpty()) {
                    if (this.string_.isEmpty()) {
                        this.string_ = stringTable.string_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureStringIsMutable();
                        this.string_.addAll(stringTable.string_);
                    }
                }
                setUnknownFields(getUnknownFields().concat(stringTable.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                StringTable stringTable = null;
                try {
                    try {
                        StringTable partialFrom = StringTable.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        StringTable stringTable2 = (StringTable) e11.getUnfinishedMessage();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            stringTable = stringTable2;
                            if (stringTable != null) {
                                mergeFrom(stringTable);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (stringTable != null) {
                        mergeFrom(stringTable);
                    }
                    throw th;
                }
            }

            private void maybeForceBuilderInitialization() {
            }
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        static {
            StringTable stringTable = new StringTable(true);
            defaultInstance = stringTable;
            stringTable.initFields();
        }

        public static StringTable getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.string_ = LazyStringArrayList.EMPTY;
        }

        public static Builder newBuilder(StringTable stringTable) {
            return newBuilder().mergeFrom(stringTable);
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public StringTable getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<StringTable> getParserForType() {
            return PARSER;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i11 = this.memoizedSerializedSize;
            if (i11 != -1) {
                return i11;
            }
            int iComputeBytesSizeNoTag = 0;
            for (int i12 = 0; i12 < this.string_.size(); i12++) {
                iComputeBytesSizeNoTag += CodedOutputStream.computeBytesSizeNoTag(this.string_.getByteString(i12));
            }
            int size = iComputeBytesSizeNoTag + getStringList().size() + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public String getString(int i11) {
            return this.string_.get(i11);
        }

        public ProtocolStringList getStringList() {
            return this.string_;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b11 = this.memoizedIsInitialized;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private StringTable(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i11 = 0; i11 < this.string_.size(); i11++) {
                codedOutputStream.writeBytes(1, this.string_.getByteString(i11));
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        private StringTable(boolean z11) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        private StringTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z11 = false;
            boolean z12 = false;
            while (!z11) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag != 10) {
                                    if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    ByteString bytes = codedInputStream.readBytes();
                                    if (!z12) {
                                        this.string_ = new LazyStringArrayList();
                                        z12 = true;
                                    }
                                    this.string_.add(bytes);
                                }
                            }
                            z11 = true;
                        } catch (InvalidProtocolBufferException e11) {
                            throw e11.setUnfinishedMessage(this);
                        }
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if (z12) {
                        this.string_ = this.string_.getUnmodifiableView();
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.unknownFields = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (z12) {
                this.string_ = this.string_.getUnmodifiableView();
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface StringTableOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Type extends GeneratedMessageLite.ExtendableMessage<Type> implements TypeOrBuilder {
        public static Parser<Type> PARSER = new AbstractParser<Type>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.1
            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public Type parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Type(codedInputStream, extensionRegistryLite);
            }
        };
        private static final Type defaultInstance;
        private int abbreviatedTypeId_;
        private Type abbreviatedType_;
        private List<Argument> argument_;
        private int bitField0_;
        private int className_;
        private int flags_;
        private int flexibleTypeCapabilitiesId_;
        private int flexibleUpperBoundId_;
        private Type flexibleUpperBound_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private boolean nullable_;
        private int outerTypeId_;
        private Type outerType_;
        private int typeAliasName_;
        private int typeParameterName_;
        private int typeParameter_;
        private final ByteString unknownFields;

        public static final class Argument extends GeneratedMessageLite implements ArgumentOrBuilder {
            public static Parser<Argument> PARSER = new AbstractParser<Argument>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.1
                @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.Parser
                public Argument parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new Argument(codedInputStream, extensionRegistryLite);
                }
            };
            private static final Argument defaultInstance;
            private int bitField0_;
            private byte memoizedIsInitialized;
            private int memoizedSerializedSize;
            private Projection projection_;
            private int typeId_;
            private Type type_;
            private final ByteString unknownFields;

            public static final class Builder extends GeneratedMessageLite.Builder<Argument, Builder> implements ArgumentOrBuilder {
                private int bitField0_;
                private int typeId_;
                private Projection projection_ = Projection.INV;
                private Type type_ = Type.getDefaultInstance();

                /* JADX INFO: Access modifiers changed from: private */
                public static Builder create() {
                    return new Builder();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public Argument build() {
                    Argument argumentBuildPartial = buildPartial();
                    if (argumentBuildPartial.isInitialized()) {
                        return argumentBuildPartial;
                    }
                    throw AbstractMessageLite.Builder.newUninitializedMessageException(argumentBuildPartial);
                }

                public Argument buildPartial() {
                    Argument argument = new Argument(this);
                    int i11 = this.bitField0_;
                    int i12 = (i11 & 1) != 1 ? 0 : 1;
                    argument.projection_ = this.projection_;
                    if ((i11 & 2) == 2) {
                        i12 |= 2;
                    }
                    argument.type_ = this.type_;
                    if ((i11 & 4) == 4) {
                        i12 |= 4;
                    }
                    argument.typeId_ = this.typeId_;
                    argument.bitField0_ = i12;
                    return argument;
                }

                public Type getType() {
                    return this.type_;
                }

                public boolean hasType() {
                    return (this.bitField0_ & 2) == 2;
                }

                public Builder mergeType(Type type) {
                    if ((this.bitField0_ & 2) != 2 || this.type_ == Type.getDefaultInstance()) {
                        this.type_ = type;
                    } else {
                        this.type_ = Type.newBuilder(this.type_).mergeFrom(type).buildPartial();
                    }
                    this.bitField0_ |= 2;
                    return this;
                }

                public Builder setTypeId(int i11) {
                    this.bitField0_ |= 4;
                    this.typeId_ = i11;
                    return this;
                }

                private Builder() {
                    maybeForceBuilderInitialization();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public Argument getDefaultInstanceForType() {
                    return Argument.getDefaultInstance();
                }

                @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    if (hasType() && !getType().isInitialized()) {
                        return false;
                    }
                    return true;
                }

                public Builder setProjection(Projection projection) {
                    projection.getClass();
                    this.bitField0_ |= 1;
                    this.projection_ = projection;
                    return this;
                }

                public Builder setType(Type type) {
                    type.getClass();
                    this.type_ = type;
                    this.bitField0_ |= 2;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo105124clone() {
                    return create().mergeFrom(buildPartial());
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                public Builder mergeFrom(Argument argument) {
                    if (argument == Argument.getDefaultInstance()) {
                        return this;
                    }
                    if (argument.hasProjection()) {
                        setProjection(argument.getProjection());
                    }
                    if (argument.hasType()) {
                        mergeType(argument.getType());
                    }
                    if (argument.hasTypeId()) {
                        setTypeId(argument.getTypeId());
                    }
                    setUnknownFields(getUnknownFields().concat(argument.unknownFields));
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    Argument argument = null;
                    try {
                        try {
                            Argument partialFrom = Argument.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (partialFrom != null) {
                                mergeFrom(partialFrom);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e11) {
                            Argument argument2 = (Argument) e11.getUnfinishedMessage();
                            try {
                                throw e11;
                            } catch (Throwable th2) {
                                th = th2;
                                argument = argument2;
                                if (argument != null) {
                                    mergeFrom(argument);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (argument != null) {
                            mergeFrom(argument);
                        }
                        throw th;
                    }
                }

                private void maybeForceBuilderInitialization() {
                }
            }

            public enum Projection implements Internal.EnumLite {
                IN(0, 0),
                OUT(1, 1),
                INV(2, 2),
                STAR(3, 3);

                private static Internal.EnumLiteMap<Projection> internalValueMap = new Internal.EnumLiteMap<Projection>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection.1
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                    public Projection findValueByNumber(int i11) {
                        return Projection.valueOf(i11);
                    }
                };
                private final int value;

                public static Projection valueOf(int i11) {
                    if (i11 == 0) {
                        return IN;
                    }
                    if (i11 == 1) {
                        return OUT;
                    }
                    if (i11 == 2) {
                        return INV;
                    }
                    if (i11 != 3) {
                        return null;
                    }
                    return STAR;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.value;
                }

                Projection(int i11, int i12) {
                    this.value = i12;
                }
            }

            public static Builder newBuilder() {
                return Builder.create();
            }

            static {
                Argument argument = new Argument(true);
                defaultInstance = argument;
                argument.initFields();
            }

            public static Argument getDefaultInstance() {
                return defaultInstance;
            }

            private void initFields() {
                this.projection_ = Projection.INV;
                this.type_ = Type.getDefaultInstance();
                this.typeId_ = 0;
            }

            public static Builder newBuilder(Argument argument) {
                return newBuilder().mergeFrom(argument);
            }

            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Argument getDefaultInstanceForType() {
                return defaultInstance;
            }

            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Parser<Argument> getParserForType() {
                return PARSER;
            }

            public Projection getProjection() {
                return this.projection_;
            }

            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int getSerializedSize() {
                int i11 = this.memoizedSerializedSize;
                if (i11 != -1) {
                    return i11;
                }
                int iComputeEnumSize = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeEnumSize(1, this.projection_.getNumber()) : 0;
                if ((this.bitField0_ & 2) == 2) {
                    iComputeEnumSize += CodedOutputStream.computeMessageSize(2, this.type_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    iComputeEnumSize += CodedOutputStream.computeInt32Size(3, this.typeId_);
                }
                int size = iComputeEnumSize + this.unknownFields.size();
                this.memoizedSerializedSize = size;
                return size;
            }

            public Type getType() {
                return this.type_;
            }

            public int getTypeId() {
                return this.typeId_;
            }

            public boolean hasProjection() {
                return (this.bitField0_ & 1) == 1;
            }

            public boolean hasType() {
                return (this.bitField0_ & 2) == 2;
            }

            public boolean hasTypeId() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b11 = this.memoizedIsInitialized;
                if (b11 == 1) {
                    return true;
                }
                if (b11 == 0) {
                    return false;
                }
                if (!hasType() || getType().isInitialized()) {
                    this.memoizedIsInitialized = (byte) 1;
                    return true;
                }
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }

            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder newBuilderForType() {
                return newBuilder();
            }

            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder toBuilder() {
                return newBuilder(this);
            }

            private Argument(GeneratedMessageLite.Builder builder) {
                super(builder);
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = builder.getUnknownFields();
            }

            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if ((this.bitField0_ & 1) == 1) {
                    codedOutputStream.writeEnum(1, this.projection_.getNumber());
                }
                if ((this.bitField0_ & 2) == 2) {
                    codedOutputStream.writeMessage(2, this.type_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    codedOutputStream.writeInt32(3, this.typeId_);
                }
                codedOutputStream.writeRawBytes(this.unknownFields);
            }

            private Argument(boolean z11) {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = ByteString.EMPTY;
            }

            private Argument(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                initFields();
                ByteString.Output outputNewOutput = ByteString.newOutput();
                CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
                boolean z11 = false;
                while (!z11) {
                    try {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 8) {
                                        int i11 = codedInputStream.readEnum();
                                        Projection projectionValueOf = Projection.valueOf(i11);
                                        if (projectionValueOf == null) {
                                            codedOutputStreamNewInstance.writeRawVarint32(tag);
                                            codedOutputStreamNewInstance.writeRawVarint32(i11);
                                        } else {
                                            this.bitField0_ |= 1;
                                            this.projection_ = projectionValueOf;
                                        }
                                    } else if (tag == 18) {
                                        Builder builder = (this.bitField0_ & 2) == 2 ? this.type_.toBuilder() : null;
                                        Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                        this.type_ = type;
                                        if (builder != null) {
                                            builder.mergeFrom(type);
                                            this.type_ = builder.buildPartial();
                                        }
                                        this.bitField0_ |= 2;
                                    } else if (tag != 24) {
                                        if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                        }
                                    } else {
                                        this.bitField0_ |= 4;
                                        this.typeId_ = codedInputStream.readInt32();
                                    }
                                }
                                z11 = true;
                            } catch (InvalidProtocolBufferException e11) {
                                throw e11.setUnfinishedMessage(this);
                            }
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                        }
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.unknownFields = outputNewOutput.toByteString();
                        }
                        makeExtensionsImmutable();
                        throw th2;
                    }
                }
                try {
                    codedOutputStreamNewInstance.flush();
                } catch (IOException unused2) {
                } finally {
                    this.unknownFields = outputNewOutput.toByteString();
                }
                makeExtensionsImmutable();
            }
        }

        public interface ArgumentOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Type, Builder> implements TypeOrBuilder {
            private int abbreviatedTypeId_;
            private int bitField0_;
            private int className_;
            private int flags_;
            private int flexibleTypeCapabilitiesId_;
            private int flexibleUpperBoundId_;
            private boolean nullable_;
            private int outerTypeId_;
            private int typeAliasName_;
            private int typeParameterName_;
            private int typeParameter_;
            private List<Argument> argument_ = Collections.EMPTY_LIST;
            private Type flexibleUpperBound_ = Type.getDefaultInstance();
            private Type outerType_ = Type.getDefaultInstance();
            private Type abbreviatedType_ = Type.getDefaultInstance();

            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i11 = 0; i11 < getArgumentCount(); i11++) {
                    if (!getArgument(i11).isInitialized()) {
                        return false;
                    }
                }
                if (hasFlexibleUpperBound() && !getFlexibleUpperBound().isInitialized()) {
                    return false;
                }
                if (!hasOuterType() || getOuterType().isInitialized()) {
                    return (!hasAbbreviatedType() || getAbbreviatedType().isInitialized()) && extensionsAreInitialized();
                }
                return false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            private void ensureArgumentIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.argument_ = new ArrayList(this.argument_);
                    this.bitField0_ |= 1;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Type build() {
                Type typeBuildPartial = buildPartial();
                if (typeBuildPartial.isInitialized()) {
                    return typeBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(typeBuildPartial);
            }

            public Type buildPartial() {
                Type type = new Type(this);
                int i11 = this.bitField0_;
                if ((i11 & 1) == 1) {
                    this.argument_ = Collections.unmodifiableList(this.argument_);
                    this.bitField0_ &= -2;
                }
                type.argument_ = this.argument_;
                int i12 = (i11 & 2) != 2 ? 0 : 1;
                type.nullable_ = this.nullable_;
                if ((i11 & 4) == 4) {
                    i12 |= 2;
                }
                type.flexibleTypeCapabilitiesId_ = this.flexibleTypeCapabilitiesId_;
                if ((i11 & 8) == 8) {
                    i12 |= 4;
                }
                type.flexibleUpperBound_ = this.flexibleUpperBound_;
                if ((i11 & 16) == 16) {
                    i12 |= 8;
                }
                type.flexibleUpperBoundId_ = this.flexibleUpperBoundId_;
                if ((i11 & 32) == 32) {
                    i12 |= 16;
                }
                type.className_ = this.className_;
                if ((i11 & 64) == 64) {
                    i12 |= 32;
                }
                type.typeParameter_ = this.typeParameter_;
                if ((i11 & 128) == 128) {
                    i12 |= 64;
                }
                type.typeParameterName_ = this.typeParameterName_;
                if ((i11 & 256) == 256) {
                    i12 |= 128;
                }
                type.typeAliasName_ = this.typeAliasName_;
                if ((i11 & 512) == 512) {
                    i12 |= 256;
                }
                type.outerType_ = this.outerType_;
                if ((i11 & 1024) == 1024) {
                    i12 |= 512;
                }
                type.outerTypeId_ = this.outerTypeId_;
                if ((i11 & 2048) == 2048) {
                    i12 |= 1024;
                }
                type.abbreviatedType_ = this.abbreviatedType_;
                if ((i11 & 4096) == 4096) {
                    i12 |= 2048;
                }
                type.abbreviatedTypeId_ = this.abbreviatedTypeId_;
                if ((i11 & 8192) == 8192) {
                    i12 |= 4096;
                }
                type.flags_ = this.flags_;
                type.bitField0_ = i12;
                return type;
            }

            public Type getAbbreviatedType() {
                return this.abbreviatedType_;
            }

            public Argument getArgument(int i11) {
                return this.argument_.get(i11);
            }

            public int getArgumentCount() {
                return this.argument_.size();
            }

            public Type getFlexibleUpperBound() {
                return this.flexibleUpperBound_;
            }

            public Type getOuterType() {
                return this.outerType_;
            }

            public boolean hasAbbreviatedType() {
                return (this.bitField0_ & 2048) == 2048;
            }

            public boolean hasFlexibleUpperBound() {
                return (this.bitField0_ & 8) == 8;
            }

            public boolean hasOuterType() {
                return (this.bitField0_ & 512) == 512;
            }

            public Builder mergeAbbreviatedType(Type type) {
                if ((this.bitField0_ & 2048) != 2048 || this.abbreviatedType_ == Type.getDefaultInstance()) {
                    this.abbreviatedType_ = type;
                } else {
                    this.abbreviatedType_ = Type.newBuilder(this.abbreviatedType_).mergeFrom(type).buildPartial();
                }
                this.bitField0_ |= 2048;
                return this;
            }

            public Builder mergeFlexibleUpperBound(Type type) {
                if ((this.bitField0_ & 8) != 8 || this.flexibleUpperBound_ == Type.getDefaultInstance()) {
                    this.flexibleUpperBound_ = type;
                } else {
                    this.flexibleUpperBound_ = Type.newBuilder(this.flexibleUpperBound_).mergeFrom(type).buildPartial();
                }
                this.bitField0_ |= 8;
                return this;
            }

            public Builder mergeOuterType(Type type) {
                if ((this.bitField0_ & 512) != 512 || this.outerType_ == Type.getDefaultInstance()) {
                    this.outerType_ = type;
                } else {
                    this.outerType_ = Type.newBuilder(this.outerType_).mergeFrom(type).buildPartial();
                }
                this.bitField0_ |= 512;
                return this;
            }

            public Builder setAbbreviatedTypeId(int i11) {
                this.bitField0_ |= 4096;
                this.abbreviatedTypeId_ = i11;
                return this;
            }

            public Builder setClassName(int i11) {
                this.bitField0_ |= 32;
                this.className_ = i11;
                return this;
            }

            public Builder setFlags(int i11) {
                this.bitField0_ |= 8192;
                this.flags_ = i11;
                return this;
            }

            public Builder setFlexibleTypeCapabilitiesId(int i11) {
                this.bitField0_ |= 4;
                this.flexibleTypeCapabilitiesId_ = i11;
                return this;
            }

            public Builder setFlexibleUpperBoundId(int i11) {
                this.bitField0_ |= 16;
                this.flexibleUpperBoundId_ = i11;
                return this;
            }

            public Builder setNullable(boolean z11) {
                this.bitField0_ |= 2;
                this.nullable_ = z11;
                return this;
            }

            public Builder setOuterTypeId(int i11) {
                this.bitField0_ |= 1024;
                this.outerTypeId_ = i11;
                return this;
            }

            public Builder setTypeAliasName(int i11) {
                this.bitField0_ |= 256;
                this.typeAliasName_ = i11;
                return this;
            }

            public Builder setTypeParameter(int i11) {
                this.bitField0_ |= 64;
                this.typeParameter_ = i11;
                return this;
            }

            public Builder setTypeParameterName(int i11) {
                this.bitField0_ |= 128;
                this.typeParameterName_ = i11;
                return this;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            public Builder addArgument(Argument.Builder builder) {
                ensureArgumentIsMutable();
                this.argument_.add(builder.build());
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Type getDefaultInstanceForType() {
                return Type.getDefaultInstance();
            }

            public Builder setAbbreviatedType(Type type) {
                type.getClass();
                this.abbreviatedType_ = type;
                this.bitField0_ |= 2048;
                return this;
            }

            public Builder setFlexibleUpperBound(Type type) {
                type.getClass();
                this.flexibleUpperBound_ = type;
                this.bitField0_ |= 8;
                return this;
            }

            public Builder setOuterType(Type type) {
                type.getClass();
                this.outerType_ = type;
                this.bitField0_ |= 512;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Type type) {
                if (type == Type.getDefaultInstance()) {
                    return this;
                }
                if (!type.argument_.isEmpty()) {
                    if (this.argument_.isEmpty()) {
                        this.argument_ = type.argument_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureArgumentIsMutable();
                        this.argument_.addAll(type.argument_);
                    }
                }
                if (type.hasNullable()) {
                    setNullable(type.getNullable());
                }
                if (type.hasFlexibleTypeCapabilitiesId()) {
                    setFlexibleTypeCapabilitiesId(type.getFlexibleTypeCapabilitiesId());
                }
                if (type.hasFlexibleUpperBound()) {
                    mergeFlexibleUpperBound(type.getFlexibleUpperBound());
                }
                if (type.hasFlexibleUpperBoundId()) {
                    setFlexibleUpperBoundId(type.getFlexibleUpperBoundId());
                }
                if (type.hasClassName()) {
                    setClassName(type.getClassName());
                }
                if (type.hasTypeParameter()) {
                    setTypeParameter(type.getTypeParameter());
                }
                if (type.hasTypeParameterName()) {
                    setTypeParameterName(type.getTypeParameterName());
                }
                if (type.hasTypeAliasName()) {
                    setTypeAliasName(type.getTypeAliasName());
                }
                if (type.hasOuterType()) {
                    mergeOuterType(type.getOuterType());
                }
                if (type.hasOuterTypeId()) {
                    setOuterTypeId(type.getOuterTypeId());
                }
                if (type.hasAbbreviatedType()) {
                    mergeAbbreviatedType(type.getAbbreviatedType());
                }
                if (type.hasAbbreviatedTypeId()) {
                    setAbbreviatedTypeId(type.getAbbreviatedTypeId());
                }
                if (type.hasFlags()) {
                    setFlags(type.getFlags());
                }
                mergeExtensionFields(type);
                setUnknownFields(getUnknownFields().concat(type.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo105124clone() {
                return create().mergeFrom(buildPartial());
            }

            private void maybeForceBuilderInitialization() {
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Type type = null;
                try {
                    try {
                        Type partialFrom = Type.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        Type type2 = (Type) e11.getUnfinishedMessage();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            type = type2;
                            if (type != null) {
                                mergeFrom(type);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (type != null) {
                        mergeFrom(type);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        static {
            Type type = new Type(true);
            defaultInstance = type;
            type.initFields();
        }

        public static Type getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.argument_ = Collections.EMPTY_LIST;
            this.nullable_ = false;
            this.flexibleTypeCapabilitiesId_ = 0;
            this.flexibleUpperBound_ = getDefaultInstance();
            this.flexibleUpperBoundId_ = 0;
            this.className_ = 0;
            this.typeParameter_ = 0;
            this.typeParameterName_ = 0;
            this.typeAliasName_ = 0;
            this.outerType_ = getDefaultInstance();
            this.outerTypeId_ = 0;
            this.abbreviatedType_ = getDefaultInstance();
            this.abbreviatedTypeId_ = 0;
            this.flags_ = 0;
        }

        public static Builder newBuilder(Type type) {
            return newBuilder().mergeFrom(type);
        }

        public Type getAbbreviatedType() {
            return this.abbreviatedType_;
        }

        public int getAbbreviatedTypeId() {
            return this.abbreviatedTypeId_;
        }

        public Argument getArgument(int i11) {
            return this.argument_.get(i11);
        }

        public int getArgumentCount() {
            return this.argument_.size();
        }

        public List<Argument> getArgumentList() {
            return this.argument_;
        }

        public int getClassName() {
            return this.className_;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Type getDefaultInstanceForType() {
            return defaultInstance;
        }

        public int getFlags() {
            return this.flags_;
        }

        public int getFlexibleTypeCapabilitiesId() {
            return this.flexibleTypeCapabilitiesId_;
        }

        public Type getFlexibleUpperBound() {
            return this.flexibleUpperBound_;
        }

        public int getFlexibleUpperBoundId() {
            return this.flexibleUpperBoundId_;
        }

        public boolean getNullable() {
            return this.nullable_;
        }

        public Type getOuterType() {
            return this.outerType_;
        }

        public int getOuterTypeId() {
            return this.outerTypeId_;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Type> getParserForType() {
            return PARSER;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i11 = this.memoizedSerializedSize;
            if (i11 != -1) {
                return i11;
            }
            int iComputeInt32Size = (this.bitField0_ & 4096) == 4096 ? CodedOutputStream.computeInt32Size(1, this.flags_) : 0;
            for (int i12 = 0; i12 < this.argument_.size(); i12++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(2, this.argument_.get(i12));
            }
            if ((this.bitField0_ & 1) == 1) {
                iComputeInt32Size += CodedOutputStream.computeBoolSize(3, this.nullable_);
            }
            if ((this.bitField0_ & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(4, this.flexibleTypeCapabilitiesId_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(5, this.flexibleUpperBound_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(6, this.className_);
            }
            if ((this.bitField0_ & 32) == 32) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(7, this.typeParameter_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(8, this.flexibleUpperBoundId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(9, this.typeParameterName_);
            }
            if ((this.bitField0_ & 256) == 256) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(10, this.outerType_);
            }
            if ((this.bitField0_ & 512) == 512) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(11, this.outerTypeId_);
            }
            if ((this.bitField0_ & 128) == 128) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(12, this.typeAliasName_);
            }
            if ((this.bitField0_ & 1024) == 1024) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(13, this.abbreviatedType_);
            }
            if ((this.bitField0_ & 2048) == 2048) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(14, this.abbreviatedTypeId_);
            }
            int iExtensionsSerializedSize = iComputeInt32Size + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = iExtensionsSerializedSize;
            return iExtensionsSerializedSize;
        }

        public int getTypeAliasName() {
            return this.typeAliasName_;
        }

        public int getTypeParameter() {
            return this.typeParameter_;
        }

        public int getTypeParameterName() {
            return this.typeParameterName_;
        }

        public boolean hasAbbreviatedType() {
            return (this.bitField0_ & 1024) == 1024;
        }

        public boolean hasAbbreviatedTypeId() {
            return (this.bitField0_ & 2048) == 2048;
        }

        public boolean hasClassName() {
            return (this.bitField0_ & 16) == 16;
        }

        public boolean hasFlags() {
            return (this.bitField0_ & 4096) == 4096;
        }

        public boolean hasFlexibleTypeCapabilitiesId() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasFlexibleUpperBound() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean hasFlexibleUpperBoundId() {
            return (this.bitField0_ & 8) == 8;
        }

        public boolean hasNullable() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasOuterType() {
            return (this.bitField0_ & 256) == 256;
        }

        public boolean hasOuterTypeId() {
            return (this.bitField0_ & 512) == 512;
        }

        public boolean hasTypeAliasName() {
            return (this.bitField0_ & 128) == 128;
        }

        public boolean hasTypeParameter() {
            return (this.bitField0_ & 32) == 32;
        }

        public boolean hasTypeParameterName() {
            return (this.bitField0_ & 64) == 64;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b11 = this.memoizedIsInitialized;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            for (int i11 = 0; i11 < getArgumentCount(); i11++) {
                if (!getArgument(i11).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasFlexibleUpperBound() && !getFlexibleUpperBound().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasOuterType() && !getOuterType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasAbbreviatedType() && !getAbbreviatedType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private Type(GeneratedMessageLite.ExtendableBuilder<Type, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 4096) == 4096) {
                codedOutputStream.writeInt32(1, this.flags_);
            }
            for (int i11 = 0; i11 < this.argument_.size(); i11++) {
                codedOutputStream.writeMessage(2, this.argument_.get(i11));
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeBool(3, this.nullable_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(4, this.flexibleTypeCapabilitiesId_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeMessage(5, this.flexibleUpperBound_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeInt32(6, this.className_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeInt32(7, this.typeParameter_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeInt32(8, this.flexibleUpperBoundId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.writeInt32(9, this.typeParameterName_);
            }
            if ((this.bitField0_ & 256) == 256) {
                codedOutputStream.writeMessage(10, this.outerType_);
            }
            if ((this.bitField0_ & 512) == 512) {
                codedOutputStream.writeInt32(11, this.outerTypeId_);
            }
            if ((this.bitField0_ & 128) == 128) {
                codedOutputStream.writeInt32(12, this.typeAliasName_);
            }
            if ((this.bitField0_ & 1024) == 1024) {
                codedOutputStream.writeMessage(13, this.abbreviatedType_);
            }
            if ((this.bitField0_ & 2048) == 2048) {
                codedOutputStream.writeInt32(14, this.abbreviatedTypeId_);
            }
            extensionWriterNewExtensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        private Type(boolean z11) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        private Type(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builder;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z11 = false;
            boolean z12 = false;
            while (!z11) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            switch (tag) {
                                case 0:
                                    break;
                                case 8:
                                    this.bitField0_ |= 4096;
                                    this.flags_ = codedInputStream.readInt32();
                                    continue;
                                case 18:
                                    if (!z12) {
                                        this.argument_ = new ArrayList();
                                        z12 = true;
                                    }
                                    this.argument_.add((Argument) codedInputStream.readMessage(Argument.PARSER, extensionRegistryLite));
                                    continue;
                                case 24:
                                    this.bitField0_ |= 1;
                                    this.nullable_ = codedInputStream.readBool();
                                    continue;
                                case 32:
                                    this.bitField0_ |= 2;
                                    this.flexibleTypeCapabilitiesId_ = codedInputStream.readInt32();
                                    continue;
                                case 42:
                                    builder = (this.bitField0_ & 4) == 4 ? this.flexibleUpperBound_.toBuilder() : null;
                                    Type type = (Type) codedInputStream.readMessage(PARSER, extensionRegistryLite);
                                    this.flexibleUpperBound_ = type;
                                    if (builder != null) {
                                        builder.mergeFrom(type);
                                        this.flexibleUpperBound_ = builder.buildPartial();
                                    }
                                    this.bitField0_ |= 4;
                                    continue;
                                case 48:
                                    this.bitField0_ |= 16;
                                    this.className_ = codedInputStream.readInt32();
                                    continue;
                                case 56:
                                    this.bitField0_ |= 32;
                                    this.typeParameter_ = codedInputStream.readInt32();
                                    continue;
                                case 64:
                                    this.bitField0_ |= 8;
                                    this.flexibleUpperBoundId_ = codedInputStream.readInt32();
                                    continue;
                                case 72:
                                    this.bitField0_ |= 64;
                                    this.typeParameterName_ = codedInputStream.readInt32();
                                    continue;
                                case 82:
                                    builder = (this.bitField0_ & 256) == 256 ? this.outerType_.toBuilder() : null;
                                    Type type2 = (Type) codedInputStream.readMessage(PARSER, extensionRegistryLite);
                                    this.outerType_ = type2;
                                    if (builder != null) {
                                        builder.mergeFrom(type2);
                                        this.outerType_ = builder.buildPartial();
                                    }
                                    this.bitField0_ |= 256;
                                    continue;
                                case 88:
                                    this.bitField0_ |= 512;
                                    this.outerTypeId_ = codedInputStream.readInt32();
                                    continue;
                                case 96:
                                    this.bitField0_ |= 128;
                                    this.typeAliasName_ = codedInputStream.readInt32();
                                    continue;
                                case 106:
                                    builder = (this.bitField0_ & 1024) == 1024 ? this.abbreviatedType_.toBuilder() : null;
                                    Type type3 = (Type) codedInputStream.readMessage(PARSER, extensionRegistryLite);
                                    this.abbreviatedType_ = type3;
                                    if (builder != null) {
                                        builder.mergeFrom(type3);
                                        this.abbreviatedType_ = builder.buildPartial();
                                    }
                                    this.bitField0_ |= 1024;
                                    continue;
                                case 112:
                                    this.bitField0_ |= 2048;
                                    this.abbreviatedTypeId_ = codedInputStream.readInt32();
                                    continue;
                                default:
                                    if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                        break;
                                    }
                                    break;
                            }
                            z11 = true;
                        } catch (InvalidProtocolBufferException e11) {
                            throw e11.setUnfinishedMessage(this);
                        }
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if (z12) {
                        this.argument_ = Collections.unmodifiableList(this.argument_);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.unknownFields = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (z12) {
                this.argument_ = Collections.unmodifiableList(this.argument_);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public static final class TypeAlias extends GeneratedMessageLite.ExtendableMessage<TypeAlias> implements TypeAliasOrBuilder {
        public static Parser<TypeAlias> PARSER = new AbstractParser<TypeAlias>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.1
            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public TypeAlias parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new TypeAlias(codedInputStream, extensionRegistryLite);
            }
        };
        private static final TypeAlias defaultInstance;
        private List<Annotation> annotation_;
        private int bitField0_;
        private List<CompilerPluginData> compilerPluginData_;
        private int expandedTypeId_;
        private Type expandedType_;
        private int flags_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int name_;
        private List<TypeParameter> typeParameter_;
        private int underlyingTypeId_;
        private Type underlyingType_;
        private final ByteString unknownFields;
        private List<Integer> versionRequirement_;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<TypeAlias, Builder> implements TypeAliasOrBuilder {
            private List<Annotation> annotation_;
            private int bitField0_;
            private List<CompilerPluginData> compilerPluginData_;
            private int expandedTypeId_;
            private Type expandedType_;
            private int flags_ = 6;
            private int name_;
            private List<TypeParameter> typeParameter_;
            private int underlyingTypeId_;
            private Type underlyingType_;
            private List<Integer> versionRequirement_;

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            private void ensureAnnotationIsMutable() {
                if ((this.bitField0_ & 128) != 128) {
                    this.annotation_ = new ArrayList(this.annotation_);
                    this.bitField0_ |= 128;
                }
            }

            private void ensureCompilerPluginDataIsMutable() {
                if ((this.bitField0_ & 512) != 512) {
                    this.compilerPluginData_ = new ArrayList(this.compilerPluginData_);
                    this.bitField0_ |= 512;
                }
            }

            private void ensureTypeParameterIsMutable() {
                if ((this.bitField0_ & 4) != 4) {
                    this.typeParameter_ = new ArrayList(this.typeParameter_);
                    this.bitField0_ |= 4;
                }
            }

            private void ensureVersionRequirementIsMutable() {
                if ((this.bitField0_ & 256) != 256) {
                    this.versionRequirement_ = new ArrayList(this.versionRequirement_);
                    this.bitField0_ |= 256;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public TypeAlias build() {
                TypeAlias typeAliasBuildPartial = buildPartial();
                if (typeAliasBuildPartial.isInitialized()) {
                    return typeAliasBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(typeAliasBuildPartial);
            }

            public TypeAlias buildPartial() {
                TypeAlias typeAlias = new TypeAlias(this);
                int i11 = this.bitField0_;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                typeAlias.flags_ = this.flags_;
                if ((i11 & 2) == 2) {
                    i12 |= 2;
                }
                typeAlias.name_ = this.name_;
                if ((this.bitField0_ & 4) == 4) {
                    this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                    this.bitField0_ &= -5;
                }
                typeAlias.typeParameter_ = this.typeParameter_;
                if ((i11 & 8) == 8) {
                    i12 |= 4;
                }
                typeAlias.underlyingType_ = this.underlyingType_;
                if ((i11 & 16) == 16) {
                    i12 |= 8;
                }
                typeAlias.underlyingTypeId_ = this.underlyingTypeId_;
                if ((i11 & 32) == 32) {
                    i12 |= 16;
                }
                typeAlias.expandedType_ = this.expandedType_;
                if ((i11 & 64) == 64) {
                    i12 |= 32;
                }
                typeAlias.expandedTypeId_ = this.expandedTypeId_;
                if ((this.bitField0_ & 128) == 128) {
                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
                    this.bitField0_ &= -129;
                }
                typeAlias.annotation_ = this.annotation_;
                if ((this.bitField0_ & 256) == 256) {
                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    this.bitField0_ &= -257;
                }
                typeAlias.versionRequirement_ = this.versionRequirement_;
                if ((this.bitField0_ & 512) == 512) {
                    this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                    this.bitField0_ &= -513;
                }
                typeAlias.compilerPluginData_ = this.compilerPluginData_;
                typeAlias.bitField0_ = i12;
                return typeAlias;
            }

            public Annotation getAnnotation(int i11) {
                return this.annotation_.get(i11);
            }

            public int getAnnotationCount() {
                return this.annotation_.size();
            }

            public CompilerPluginData getCompilerPluginData(int i11) {
                return this.compilerPluginData_.get(i11);
            }

            public int getCompilerPluginDataCount() {
                return this.compilerPluginData_.size();
            }

            public Type getExpandedType() {
                return this.expandedType_;
            }

            public TypeParameter getTypeParameter(int i11) {
                return this.typeParameter_.get(i11);
            }

            public int getTypeParameterCount() {
                return this.typeParameter_.size();
            }

            public Type getUnderlyingType() {
                return this.underlyingType_;
            }

            public boolean hasExpandedType() {
                return (this.bitField0_ & 32) == 32;
            }

            public boolean hasName() {
                return (this.bitField0_ & 2) == 2;
            }

            public boolean hasUnderlyingType() {
                return (this.bitField0_ & 8) == 8;
            }

            public Builder mergeExpandedType(Type type) {
                if ((this.bitField0_ & 32) != 32 || this.expandedType_ == Type.getDefaultInstance()) {
                    this.expandedType_ = type;
                } else {
                    this.expandedType_ = Type.newBuilder(this.expandedType_).mergeFrom(type).buildPartial();
                }
                this.bitField0_ |= 32;
                return this;
            }

            public Builder mergeUnderlyingType(Type type) {
                if ((this.bitField0_ & 8) != 8 || this.underlyingType_ == Type.getDefaultInstance()) {
                    this.underlyingType_ = type;
                } else {
                    this.underlyingType_ = Type.newBuilder(this.underlyingType_).mergeFrom(type).buildPartial();
                }
                this.bitField0_ |= 8;
                return this;
            }

            public Builder setExpandedTypeId(int i11) {
                this.bitField0_ |= 64;
                this.expandedTypeId_ = i11;
                return this;
            }

            public Builder setFlags(int i11) {
                this.bitField0_ |= 1;
                this.flags_ = i11;
                return this;
            }

            public Builder setName(int i11) {
                this.bitField0_ |= 2;
                this.name_ = i11;
                return this;
            }

            public Builder setUnderlyingTypeId(int i11) {
                this.bitField0_ |= 16;
                this.underlyingTypeId_ = i11;
                return this;
            }

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.typeParameter_ = list;
                this.underlyingType_ = Type.getDefaultInstance();
                this.expandedType_ = Type.getDefaultInstance();
                this.annotation_ = list;
                this.versionRequirement_ = list;
                this.compilerPluginData_ = list;
                maybeForceBuilderInitialization();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public TypeAlias getDefaultInstanceForType() {
                return TypeAlias.getDefaultInstance();
            }

            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                for (int i11 = 0; i11 < getTypeParameterCount(); i11++) {
                    if (!getTypeParameter(i11).isInitialized()) {
                        return false;
                    }
                }
                if (hasUnderlyingType() && !getUnderlyingType().isInitialized()) {
                    return false;
                }
                if (hasExpandedType() && !getExpandedType().isInitialized()) {
                    return false;
                }
                for (int i12 = 0; i12 < getAnnotationCount(); i12++) {
                    if (!getAnnotation(i12).isInitialized()) {
                        return false;
                    }
                }
                for (int i13 = 0; i13 < getCompilerPluginDataCount(); i13++) {
                    if (!getCompilerPluginData(i13).isInitialized()) {
                        return false;
                    }
                }
                if (!extensionsAreInitialized()) {
                    return false;
                }
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(TypeAlias typeAlias) {
                if (typeAlias == TypeAlias.getDefaultInstance()) {
                    return this;
                }
                if (typeAlias.hasFlags()) {
                    setFlags(typeAlias.getFlags());
                }
                if (typeAlias.hasName()) {
                    setName(typeAlias.getName());
                }
                if (!typeAlias.typeParameter_.isEmpty()) {
                    if (this.typeParameter_.isEmpty()) {
                        this.typeParameter_ = typeAlias.typeParameter_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureTypeParameterIsMutable();
                        this.typeParameter_.addAll(typeAlias.typeParameter_);
                    }
                }
                if (typeAlias.hasUnderlyingType()) {
                    mergeUnderlyingType(typeAlias.getUnderlyingType());
                }
                if (typeAlias.hasUnderlyingTypeId()) {
                    setUnderlyingTypeId(typeAlias.getUnderlyingTypeId());
                }
                if (typeAlias.hasExpandedType()) {
                    mergeExpandedType(typeAlias.getExpandedType());
                }
                if (typeAlias.hasExpandedTypeId()) {
                    setExpandedTypeId(typeAlias.getExpandedTypeId());
                }
                if (!typeAlias.annotation_.isEmpty()) {
                    if (this.annotation_.isEmpty()) {
                        this.annotation_ = typeAlias.annotation_;
                        this.bitField0_ &= -129;
                    } else {
                        ensureAnnotationIsMutable();
                        this.annotation_.addAll(typeAlias.annotation_);
                    }
                }
                if (!typeAlias.versionRequirement_.isEmpty()) {
                    if (this.versionRequirement_.isEmpty()) {
                        this.versionRequirement_ = typeAlias.versionRequirement_;
                        this.bitField0_ &= -257;
                    } else {
                        ensureVersionRequirementIsMutable();
                        this.versionRequirement_.addAll(typeAlias.versionRequirement_);
                    }
                }
                if (!typeAlias.compilerPluginData_.isEmpty()) {
                    if (this.compilerPluginData_.isEmpty()) {
                        this.compilerPluginData_ = typeAlias.compilerPluginData_;
                        this.bitField0_ &= -513;
                    } else {
                        ensureCompilerPluginDataIsMutable();
                        this.compilerPluginData_.addAll(typeAlias.compilerPluginData_);
                    }
                }
                mergeExtensionFields(typeAlias);
                setUnknownFields(getUnknownFields().concat(typeAlias.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo105124clone() {
                return create().mergeFrom(buildPartial());
            }

            private void maybeForceBuilderInitialization() {
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                TypeAlias typeAlias = null;
                try {
                    try {
                        TypeAlias partialFrom = TypeAlias.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        TypeAlias typeAlias2 = (TypeAlias) e11.getUnfinishedMessage();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            typeAlias = typeAlias2;
                            if (typeAlias != null) {
                                mergeFrom(typeAlias);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (typeAlias != null) {
                        mergeFrom(typeAlias);
                    }
                    throw th;
                }
            }
        }

        private void initFields() {
            this.flags_ = 6;
            this.name_ = 0;
            List list = Collections.EMPTY_LIST;
            this.typeParameter_ = list;
            this.underlyingType_ = Type.getDefaultInstance();
            this.underlyingTypeId_ = 0;
            this.expandedType_ = Type.getDefaultInstance();
            this.expandedTypeId_ = 0;
            this.annotation_ = list;
            this.versionRequirement_ = list;
            this.compilerPluginData_ = list;
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        static {
            TypeAlias typeAlias = new TypeAlias(true);
            defaultInstance = typeAlias;
            typeAlias.initFields();
        }

        public static TypeAlias getDefaultInstance() {
            return defaultInstance;
        }

        public static Builder newBuilder(TypeAlias typeAlias) {
            return newBuilder().mergeFrom(typeAlias);
        }

        public static TypeAlias parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public Annotation getAnnotation(int i11) {
            return this.annotation_.get(i11);
        }

        public int getAnnotationCount() {
            return this.annotation_.size();
        }

        public List<Annotation> getAnnotationList() {
            return this.annotation_;
        }

        public CompilerPluginData getCompilerPluginData(int i11) {
            return this.compilerPluginData_.get(i11);
        }

        public int getCompilerPluginDataCount() {
            return this.compilerPluginData_.size();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public TypeAlias getDefaultInstanceForType() {
            return defaultInstance;
        }

        public Type getExpandedType() {
            return this.expandedType_;
        }

        public int getExpandedTypeId() {
            return this.expandedTypeId_;
        }

        public int getFlags() {
            return this.flags_;
        }

        public int getName() {
            return this.name_;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<TypeAlias> getParserForType() {
            return PARSER;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i11 = this.memoizedSerializedSize;
            if (i11 != -1) {
                return i11;
            }
            int iComputeInt32Size = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.flags_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.name_);
            }
            for (int i12 = 0; i12 < this.typeParameter_.size(); i12++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(3, this.typeParameter_.get(i12));
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(4, this.underlyingType_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(5, this.underlyingTypeId_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(6, this.expandedType_);
            }
            if ((this.bitField0_ & 32) == 32) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(7, this.expandedTypeId_);
            }
            for (int i13 = 0; i13 < this.annotation_.size(); i13++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(8, this.annotation_.get(i13));
            }
            int iComputeInt32SizeNoTag = 0;
            for (int i14 = 0; i14 < this.versionRequirement_.size(); i14++) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(this.versionRequirement_.get(i14).intValue());
            }
            int size = iComputeInt32Size + iComputeInt32SizeNoTag + (getVersionRequirementList().size() * 2);
            for (int i15 = 0; i15 < this.compilerPluginData_.size(); i15++) {
                size += CodedOutputStream.computeMessageSize(32, this.compilerPluginData_.get(i15));
            }
            int iExtensionsSerializedSize = size + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = iExtensionsSerializedSize;
            return iExtensionsSerializedSize;
        }

        public TypeParameter getTypeParameter(int i11) {
            return this.typeParameter_.get(i11);
        }

        public int getTypeParameterCount() {
            return this.typeParameter_.size();
        }

        public List<TypeParameter> getTypeParameterList() {
            return this.typeParameter_;
        }

        public Type getUnderlyingType() {
            return this.underlyingType_;
        }

        public int getUnderlyingTypeId() {
            return this.underlyingTypeId_;
        }

        public List<Integer> getVersionRequirementList() {
            return this.versionRequirement_;
        }

        public boolean hasExpandedType() {
            return (this.bitField0_ & 16) == 16;
        }

        public boolean hasExpandedTypeId() {
            return (this.bitField0_ & 32) == 32;
        }

        public boolean hasFlags() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasName() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasUnderlyingType() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean hasUnderlyingTypeId() {
            return (this.bitField0_ & 8) == 8;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b11 = this.memoizedIsInitialized;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            if (!hasName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i11 = 0; i11 < getTypeParameterCount(); i11++) {
                if (!getTypeParameter(i11).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasUnderlyingType() && !getUnderlyingType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasExpandedType() && !getExpandedType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i12 = 0; i12 < getAnnotationCount(); i12++) {
                if (!getAnnotation(i12).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i13 = 0; i13 < getCompilerPluginDataCount(); i13++) {
                if (!getCompilerPluginData(i13).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private TypeAlias(GeneratedMessageLite.ExtendableBuilder<TypeAlias, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.flags_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(2, this.name_);
            }
            for (int i11 = 0; i11 < this.typeParameter_.size(); i11++) {
                codedOutputStream.writeMessage(3, this.typeParameter_.get(i11));
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeMessage(4, this.underlyingType_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeInt32(5, this.underlyingTypeId_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeMessage(6, this.expandedType_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeInt32(7, this.expandedTypeId_);
            }
            for (int i12 = 0; i12 < this.annotation_.size(); i12++) {
                codedOutputStream.writeMessage(8, this.annotation_.get(i12));
            }
            for (int i13 = 0; i13 < this.versionRequirement_.size(); i13++) {
                codedOutputStream.writeInt32(31, this.versionRequirement_.get(i13).intValue());
            }
            for (int i14 = 0; i14 < this.compilerPluginData_.size(); i14++) {
                codedOutputStream.writeMessage(32, this.compilerPluginData_.get(i14));
            }
            extensionWriterNewExtensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        private TypeAlias(boolean z11) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        private TypeAlias(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Type.Builder builder;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z11 = false;
            int i11 = 0;
            while (!z11) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        switch (tag) {
                            case 0:
                                break;
                            case 8:
                                this.bitField0_ |= 1;
                                this.flags_ = codedInputStream.readInt32();
                                continue;
                            case 16:
                                this.bitField0_ |= 2;
                                this.name_ = codedInputStream.readInt32();
                                continue;
                            case 26:
                                if ((i11 & 4) != 4) {
                                    this.typeParameter_ = new ArrayList();
                                    i11 |= 4;
                                }
                                this.typeParameter_.add((TypeParameter) codedInputStream.readMessage(TypeParameter.PARSER, extensionRegistryLite));
                                continue;
                            case 34:
                                builder = (this.bitField0_ & 4) == 4 ? this.underlyingType_.toBuilder() : null;
                                Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                this.underlyingType_ = type;
                                if (builder != null) {
                                    builder.mergeFrom(type);
                                    this.underlyingType_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 4;
                                continue;
                            case 40:
                                this.bitField0_ |= 8;
                                this.underlyingTypeId_ = codedInputStream.readInt32();
                                continue;
                            case 50:
                                builder = (this.bitField0_ & 16) == 16 ? this.expandedType_.toBuilder() : null;
                                Type type2 = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                this.expandedType_ = type2;
                                if (builder != null) {
                                    builder.mergeFrom(type2);
                                    this.expandedType_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 16;
                                continue;
                            case 56:
                                this.bitField0_ |= 32;
                                this.expandedTypeId_ = codedInputStream.readInt32();
                                continue;
                            case 66:
                                if ((i11 & 128) != 128) {
                                    this.annotation_ = new ArrayList();
                                    i11 |= 128;
                                }
                                this.annotation_.add((Annotation) codedInputStream.readMessage(Annotation.PARSER, extensionRegistryLite));
                                continue;
                            case 248:
                                if ((i11 & 256) != 256) {
                                    this.versionRequirement_ = new ArrayList();
                                    i11 |= 256;
                                }
                                this.versionRequirement_.add(Integer.valueOf(codedInputStream.readInt32()));
                                continue;
                            case 250:
                                int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i11 & 256) != 256 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.versionRequirement_ = new ArrayList();
                                    i11 |= 256;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.versionRequirement_.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit);
                                continue;
                            case 258:
                                if ((i11 & 512) != 512) {
                                    this.compilerPluginData_ = new ArrayList();
                                    i11 |= 512;
                                }
                                this.compilerPluginData_.add((CompilerPluginData) codedInputStream.readMessage(CompilerPluginData.PARSER, extensionRegistryLite));
                                continue;
                            default:
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    break;
                                }
                                break;
                        }
                        z11 = true;
                    } catch (Throwable th2) {
                        if ((i11 & 4) == 4) {
                            this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                        }
                        if ((i11 & 128) == 128) {
                            this.annotation_ = Collections.unmodifiableList(this.annotation_);
                        }
                        if ((i11 & 256) == 256) {
                            this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                        }
                        if ((i11 & 512) == 512) {
                            this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.unknownFields = outputNewOutput.toByteString();
                        }
                        makeExtensionsImmutable();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.setUnfinishedMessage(this);
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                }
            }
            if ((i11 & 4) == 4) {
                this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
            }
            if ((i11 & 128) == 128) {
                this.annotation_ = Collections.unmodifiableList(this.annotation_);
            }
            if ((i11 & 256) == 256) {
                this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
            }
            if ((i11 & 512) == 512) {
                this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface TypeAliasOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface TypeOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class TypeParameter extends GeneratedMessageLite.ExtendableMessage<TypeParameter> implements TypeParameterOrBuilder {
        public static Parser<TypeParameter> PARSER = new AbstractParser<TypeParameter>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.1
            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public TypeParameter parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new TypeParameter(codedInputStream, extensionRegistryLite);
            }
        };
        private static final TypeParameter defaultInstance;
        private int bitField0_;
        private int id_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int name_;
        private boolean reified_;
        private final ByteString unknownFields;
        private int upperBoundIdMemoizedSerializedSize;
        private List<Integer> upperBoundId_;
        private List<Type> upperBound_;
        private Variance variance_;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<TypeParameter, Builder> implements TypeParameterOrBuilder {
            private int bitField0_;
            private int id_;
            private int name_;
            private boolean reified_;
            private List<Integer> upperBoundId_;
            private List<Type> upperBound_;
            private Variance variance_ = Variance.INV;

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            private void ensureUpperBoundIdIsMutable() {
                if ((this.bitField0_ & 32) != 32) {
                    this.upperBoundId_ = new ArrayList(this.upperBoundId_);
                    this.bitField0_ |= 32;
                }
            }

            private void ensureUpperBoundIsMutable() {
                if ((this.bitField0_ & 16) != 16) {
                    this.upperBound_ = new ArrayList(this.upperBound_);
                    this.bitField0_ |= 16;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public TypeParameter build() {
                TypeParameter typeParameterBuildPartial = buildPartial();
                if (typeParameterBuildPartial.isInitialized()) {
                    return typeParameterBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(typeParameterBuildPartial);
            }

            public TypeParameter buildPartial() {
                TypeParameter typeParameter = new TypeParameter(this);
                int i11 = this.bitField0_;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                typeParameter.id_ = this.id_;
                if ((i11 & 2) == 2) {
                    i12 |= 2;
                }
                typeParameter.name_ = this.name_;
                if ((i11 & 4) == 4) {
                    i12 |= 4;
                }
                typeParameter.reified_ = this.reified_;
                if ((i11 & 8) == 8) {
                    i12 |= 8;
                }
                typeParameter.variance_ = this.variance_;
                if ((this.bitField0_ & 16) == 16) {
                    this.upperBound_ = Collections.unmodifiableList(this.upperBound_);
                    this.bitField0_ &= -17;
                }
                typeParameter.upperBound_ = this.upperBound_;
                if ((this.bitField0_ & 32) == 32) {
                    this.upperBoundId_ = Collections.unmodifiableList(this.upperBoundId_);
                    this.bitField0_ &= -33;
                }
                typeParameter.upperBoundId_ = this.upperBoundId_;
                typeParameter.bitField0_ = i12;
                return typeParameter;
            }

            public Type getUpperBound(int i11) {
                return this.upperBound_.get(i11);
            }

            public int getUpperBoundCount() {
                return this.upperBound_.size();
            }

            public boolean hasId() {
                return (this.bitField0_ & 1) == 1;
            }

            public boolean hasName() {
                return (this.bitField0_ & 2) == 2;
            }

            public Builder setId(int i11) {
                this.bitField0_ |= 1;
                this.id_ = i11;
                return this;
            }

            public Builder setName(int i11) {
                this.bitField0_ |= 2;
                this.name_ = i11;
                return this;
            }

            public Builder setReified(boolean z11) {
                this.bitField0_ |= 4;
                this.reified_ = z11;
                return this;
            }

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.upperBound_ = list;
                this.upperBoundId_ = list;
                maybeForceBuilderInitialization();
            }

            public Builder addUpperBound(Type type) {
                type.getClass();
                ensureUpperBoundIsMutable();
                this.upperBound_.add(type);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public TypeParameter getDefaultInstanceForType() {
                return TypeParameter.getDefaultInstance();
            }

            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasId() || !hasName()) {
                    return false;
                }
                for (int i11 = 0; i11 < getUpperBoundCount(); i11++) {
                    if (!getUpperBound(i11).isInitialized()) {
                        return false;
                    }
                }
                if (!extensionsAreInitialized()) {
                    return false;
                }
                return true;
            }

            public Builder setVariance(Variance variance) {
                variance.getClass();
                this.bitField0_ |= 8;
                this.variance_ = variance;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(TypeParameter typeParameter) {
                if (typeParameter == TypeParameter.getDefaultInstance()) {
                    return this;
                }
                if (typeParameter.hasId()) {
                    setId(typeParameter.getId());
                }
                if (typeParameter.hasName()) {
                    setName(typeParameter.getName());
                }
                if (typeParameter.hasReified()) {
                    setReified(typeParameter.getReified());
                }
                if (typeParameter.hasVariance()) {
                    setVariance(typeParameter.getVariance());
                }
                if (!typeParameter.upperBound_.isEmpty()) {
                    if (this.upperBound_.isEmpty()) {
                        this.upperBound_ = typeParameter.upperBound_;
                        this.bitField0_ &= -17;
                    } else {
                        ensureUpperBoundIsMutable();
                        this.upperBound_.addAll(typeParameter.upperBound_);
                    }
                }
                if (!typeParameter.upperBoundId_.isEmpty()) {
                    if (this.upperBoundId_.isEmpty()) {
                        this.upperBoundId_ = typeParameter.upperBoundId_;
                        this.bitField0_ &= -33;
                    } else {
                        ensureUpperBoundIdIsMutable();
                        this.upperBoundId_.addAll(typeParameter.upperBoundId_);
                    }
                }
                mergeExtensionFields(typeParameter);
                setUnknownFields(getUnknownFields().concat(typeParameter.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo105124clone() {
                return create().mergeFrom(buildPartial());
            }

            private void maybeForceBuilderInitialization() {
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                TypeParameter typeParameter = null;
                try {
                    try {
                        TypeParameter partialFrom = TypeParameter.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        TypeParameter typeParameter2 = (TypeParameter) e11.getUnfinishedMessage();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            typeParameter = typeParameter2;
                            if (typeParameter != null) {
                                mergeFrom(typeParameter);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (typeParameter != null) {
                        mergeFrom(typeParameter);
                    }
                    throw th;
                }
            }
        }

        public enum Variance implements Internal.EnumLite {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2);

            private static Internal.EnumLiteMap<Variance> internalValueMap = new Internal.EnumLiteMap<Variance>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance.1
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                public Variance findValueByNumber(int i11) {
                    return Variance.valueOf(i11);
                }
            };
            private final int value;

            public static Variance valueOf(int i11) {
                if (i11 == 0) {
                    return IN;
                }
                if (i11 == 1) {
                    return OUT;
                }
                if (i11 != 2) {
                    return null;
                }
                return INV;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            Variance(int i11, int i12) {
                this.value = i12;
            }
        }

        private void initFields() {
            this.id_ = 0;
            this.name_ = 0;
            this.reified_ = false;
            this.variance_ = Variance.INV;
            List list = Collections.EMPTY_LIST;
            this.upperBound_ = list;
            this.upperBoundId_ = list;
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        static {
            TypeParameter typeParameter = new TypeParameter(true);
            defaultInstance = typeParameter;
            typeParameter.initFields();
        }

        public static TypeParameter getDefaultInstance() {
            return defaultInstance;
        }

        public static Builder newBuilder(TypeParameter typeParameter) {
            return newBuilder().mergeFrom(typeParameter);
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public TypeParameter getDefaultInstanceForType() {
            return defaultInstance;
        }

        public int getId() {
            return this.id_;
        }

        public int getName() {
            return this.name_;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<TypeParameter> getParserForType() {
            return PARSER;
        }

        public boolean getReified() {
            return this.reified_;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i11 = this.memoizedSerializedSize;
            if (i11 != -1) {
                return i11;
            }
            int iComputeInt32Size = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.id_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.name_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeBoolSize(3, this.reified_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeEnumSize(4, this.variance_.getNumber());
            }
            for (int i12 = 0; i12 < this.upperBound_.size(); i12++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(5, this.upperBound_.get(i12));
            }
            int iComputeInt32SizeNoTag = 0;
            for (int i13 = 0; i13 < this.upperBoundId_.size(); i13++) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(this.upperBoundId_.get(i13).intValue());
            }
            int iComputeInt32SizeNoTag2 = iComputeInt32Size + iComputeInt32SizeNoTag;
            if (!getUpperBoundIdList().isEmpty()) {
                iComputeInt32SizeNoTag2 = iComputeInt32SizeNoTag2 + 1 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag);
            }
            this.upperBoundIdMemoizedSerializedSize = iComputeInt32SizeNoTag;
            int iExtensionsSerializedSize = iComputeInt32SizeNoTag2 + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = iExtensionsSerializedSize;
            return iExtensionsSerializedSize;
        }

        public Type getUpperBound(int i11) {
            return this.upperBound_.get(i11);
        }

        public int getUpperBoundCount() {
            return this.upperBound_.size();
        }

        public List<Integer> getUpperBoundIdList() {
            return this.upperBoundId_;
        }

        public List<Type> getUpperBoundList() {
            return this.upperBound_;
        }

        public Variance getVariance() {
            return this.variance_;
        }

        public boolean hasId() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasName() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasReified() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean hasVariance() {
            return (this.bitField0_ & 8) == 8;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b11 = this.memoizedIsInitialized;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            if (!hasId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i11 = 0; i11 < getUpperBoundCount(); i11++) {
                if (!getUpperBound(i11).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private TypeParameter(GeneratedMessageLite.ExtendableBuilder<TypeParameter, ?> extendableBuilder) {
            super(extendableBuilder);
            this.upperBoundIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.id_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(2, this.name_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeBool(3, this.reified_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeEnum(4, this.variance_.getNumber());
            }
            for (int i11 = 0; i11 < this.upperBound_.size(); i11++) {
                codedOutputStream.writeMessage(5, this.upperBound_.get(i11));
            }
            if (getUpperBoundIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(50);
                codedOutputStream.writeRawVarint32(this.upperBoundIdMemoizedSerializedSize);
            }
            for (int i12 = 0; i12 < this.upperBoundId_.size(); i12++) {
                codedOutputStream.writeInt32NoTag(this.upperBoundId_.get(i12).intValue());
            }
            extensionWriterNewExtensionWriter.writeUntil(1000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        private TypeParameter(boolean z11) {
            this.upperBoundIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        private TypeParameter(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.upperBoundIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z11 = false;
            int i11 = 0;
            while (!z11) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.bitField0_ |= 1;
                                this.id_ = codedInputStream.readInt32();
                            } else if (tag == 16) {
                                this.bitField0_ |= 2;
                                this.name_ = codedInputStream.readInt32();
                            } else if (tag == 24) {
                                this.bitField0_ |= 4;
                                this.reified_ = codedInputStream.readBool();
                            } else if (tag == 32) {
                                int i12 = codedInputStream.readEnum();
                                Variance varianceValueOf = Variance.valueOf(i12);
                                if (varianceValueOf == null) {
                                    codedOutputStreamNewInstance.writeRawVarint32(tag);
                                    codedOutputStreamNewInstance.writeRawVarint32(i12);
                                } else {
                                    this.bitField0_ |= 8;
                                    this.variance_ = varianceValueOf;
                                }
                            } else if (tag == 42) {
                                if ((i11 & 16) != 16) {
                                    this.upperBound_ = new ArrayList();
                                    i11 |= 16;
                                }
                                this.upperBound_.add((Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite));
                            } else if (tag == 48) {
                                if ((i11 & 32) != 32) {
                                    this.upperBoundId_ = new ArrayList();
                                    i11 |= 32;
                                }
                                this.upperBoundId_.add(Integer.valueOf(codedInputStream.readInt32()));
                            } else if (tag != 50) {
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i11 & 32) != 32 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.upperBoundId_ = new ArrayList();
                                    i11 |= 32;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.upperBoundId_.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit);
                            }
                        }
                        z11 = true;
                    } catch (InvalidProtocolBufferException e11) {
                        throw e11.setUnfinishedMessage(this);
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if ((i11 & 16) == 16) {
                        this.upperBound_ = Collections.unmodifiableList(this.upperBound_);
                    }
                    if ((i11 & 32) == 32) {
                        this.upperBoundId_ = Collections.unmodifiableList(this.upperBoundId_);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.unknownFields = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if ((i11 & 16) == 16) {
                this.upperBound_ = Collections.unmodifiableList(this.upperBound_);
            }
            if ((i11 & 32) == 32) {
                this.upperBoundId_ = Collections.unmodifiableList(this.upperBoundId_);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface TypeParameterOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class TypeTable extends GeneratedMessageLite implements TypeTableOrBuilder {
        public static Parser<TypeTable> PARSER = new AbstractParser<TypeTable>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.1
            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public TypeTable parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new TypeTable(codedInputStream, extensionRegistryLite);
            }
        };
        private static final TypeTable defaultInstance;
        private int bitField0_;
        private int firstNullable_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List<Type> type_;
        private final ByteString unknownFields;

        public static final class Builder extends GeneratedMessageLite.Builder<TypeTable, Builder> implements TypeTableOrBuilder {
            private int bitField0_;
            private List<Type> type_ = Collections.EMPTY_LIST;
            private int firstNullable_ = -1;

            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i11 = 0; i11 < getTypeCount(); i11++) {
                    if (!getType(i11).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            private void ensureTypeIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.type_ = new ArrayList(this.type_);
                    this.bitField0_ |= 1;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public TypeTable build() {
                TypeTable typeTableBuildPartial = buildPartial();
                if (typeTableBuildPartial.isInitialized()) {
                    return typeTableBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(typeTableBuildPartial);
            }

            public TypeTable buildPartial() {
                TypeTable typeTable = new TypeTable(this);
                int i11 = this.bitField0_;
                if ((i11 & 1) == 1) {
                    this.type_ = Collections.unmodifiableList(this.type_);
                    this.bitField0_ &= -2;
                }
                typeTable.type_ = this.type_;
                int i12 = (i11 & 2) != 2 ? 0 : 1;
                typeTable.firstNullable_ = this.firstNullable_;
                typeTable.bitField0_ = i12;
                return typeTable;
            }

            public Type getType(int i11) {
                return this.type_.get(i11);
            }

            public int getTypeCount() {
                return this.type_.size();
            }

            public Builder setFirstNullable(int i11) {
                this.bitField0_ |= 2;
                this.firstNullable_ = i11;
                return this;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public TypeTable getDefaultInstanceForType() {
                return TypeTable.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo105124clone() {
                return create().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(TypeTable typeTable) {
                if (typeTable == TypeTable.getDefaultInstance()) {
                    return this;
                }
                if (!typeTable.type_.isEmpty()) {
                    if (this.type_.isEmpty()) {
                        this.type_ = typeTable.type_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureTypeIsMutable();
                        this.type_.addAll(typeTable.type_);
                    }
                }
                if (typeTable.hasFirstNullable()) {
                    setFirstNullable(typeTable.getFirstNullable());
                }
                setUnknownFields(getUnknownFields().concat(typeTable.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                TypeTable typeTable = null;
                try {
                    try {
                        TypeTable partialFrom = TypeTable.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        TypeTable typeTable2 = (TypeTable) e11.getUnfinishedMessage();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            typeTable = typeTable2;
                            if (typeTable != null) {
                                mergeFrom(typeTable);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (typeTable != null) {
                        mergeFrom(typeTable);
                    }
                    throw th;
                }
            }

            private void maybeForceBuilderInitialization() {
            }
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        static {
            TypeTable typeTable = new TypeTable(true);
            defaultInstance = typeTable;
            typeTable.initFields();
        }

        public static TypeTable getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.type_ = Collections.EMPTY_LIST;
            this.firstNullable_ = -1;
        }

        public static Builder newBuilder(TypeTable typeTable) {
            return newBuilder().mergeFrom(typeTable);
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public TypeTable getDefaultInstanceForType() {
            return defaultInstance;
        }

        public int getFirstNullable() {
            return this.firstNullable_;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<TypeTable> getParserForType() {
            return PARSER;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i11 = this.memoizedSerializedSize;
            if (i11 != -1) {
                return i11;
            }
            int iComputeInt32Size = 0;
            for (int i12 = 0; i12 < this.type_.size(); i12++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(1, this.type_.get(i12));
            }
            if ((this.bitField0_ & 1) == 1) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.firstNullable_);
            }
            int size = iComputeInt32Size + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public Type getType(int i11) {
            return this.type_.get(i11);
        }

        public int getTypeCount() {
            return this.type_.size();
        }

        public List<Type> getTypeList() {
            return this.type_;
        }

        public boolean hasFirstNullable() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b11 = this.memoizedIsInitialized;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            for (int i11 = 0; i11 < getTypeCount(); i11++) {
                if (!getType(i11).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private TypeTable(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i11 = 0; i11 < this.type_.size(); i11++) {
                codedOutputStream.writeMessage(1, this.type_.get(i11));
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(2, this.firstNullable_);
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        private TypeTable(boolean z11) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        private TypeTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z11 = false;
            boolean z12 = false;
            while (!z11) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                if (!z12) {
                                    this.type_ = new ArrayList();
                                    z12 = true;
                                }
                                this.type_.add((Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite));
                            } else if (tag != 16) {
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.bitField0_ |= 1;
                                this.firstNullable_ = codedInputStream.readInt32();
                            }
                        }
                        z11 = true;
                    } catch (Throwable th2) {
                        if (z12) {
                            this.type_ = Collections.unmodifiableList(this.type_);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.unknownFields = outputNewOutput.toByteString();
                        }
                        makeExtensionsImmutable();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.setUnfinishedMessage(this);
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                }
            }
            if (z12) {
                this.type_ = Collections.unmodifiableList(this.type_);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface TypeTableOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class ValueParameter extends GeneratedMessageLite.ExtendableMessage<ValueParameter> implements ValueParameterOrBuilder {
        public static Parser<ValueParameter> PARSER = new AbstractParser<ValueParameter>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.1
            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public ValueParameter parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new ValueParameter(codedInputStream, extensionRegistryLite);
            }
        };
        private static final ValueParameter defaultInstance;
        private Annotation.Argument.Value annotationParameterDefaultValue_;
        private List<Annotation> annotation_;
        private int bitField0_;
        private int flags_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int name_;
        private int typeId_;
        private Type type_;
        private final ByteString unknownFields;
        private int varargElementTypeId_;
        private Type varargElementType_;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<ValueParameter, Builder> implements ValueParameterOrBuilder {
            private int bitField0_;
            private int flags_;
            private int name_;
            private int typeId_;
            private int varargElementTypeId_;
            private Type type_ = Type.getDefaultInstance();
            private Type varargElementType_ = Type.getDefaultInstance();
            private List<Annotation> annotation_ = Collections.EMPTY_LIST;
            private Annotation.Argument.Value annotationParameterDefaultValue_ = Annotation.Argument.Value.getDefaultInstance();

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            private void ensureAnnotationIsMutable() {
                if ((this.bitField0_ & 64) != 64) {
                    this.annotation_ = new ArrayList(this.annotation_);
                    this.bitField0_ |= 64;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public ValueParameter build() {
                ValueParameter valueParameterBuildPartial = buildPartial();
                if (valueParameterBuildPartial.isInitialized()) {
                    return valueParameterBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(valueParameterBuildPartial);
            }

            public ValueParameter buildPartial() {
                ValueParameter valueParameter = new ValueParameter(this);
                int i11 = this.bitField0_;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                valueParameter.flags_ = this.flags_;
                if ((i11 & 2) == 2) {
                    i12 |= 2;
                }
                valueParameter.name_ = this.name_;
                if ((i11 & 4) == 4) {
                    i12 |= 4;
                }
                valueParameter.type_ = this.type_;
                if ((i11 & 8) == 8) {
                    i12 |= 8;
                }
                valueParameter.typeId_ = this.typeId_;
                if ((i11 & 16) == 16) {
                    i12 |= 16;
                }
                valueParameter.varargElementType_ = this.varargElementType_;
                if ((i11 & 32) == 32) {
                    i12 |= 32;
                }
                valueParameter.varargElementTypeId_ = this.varargElementTypeId_;
                if ((this.bitField0_ & 64) == 64) {
                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
                    this.bitField0_ &= -65;
                }
                valueParameter.annotation_ = this.annotation_;
                if ((i11 & 128) == 128) {
                    i12 |= 64;
                }
                valueParameter.annotationParameterDefaultValue_ = this.annotationParameterDefaultValue_;
                valueParameter.bitField0_ = i12;
                return valueParameter;
            }

            public Annotation getAnnotation(int i11) {
                return this.annotation_.get(i11);
            }

            public int getAnnotationCount() {
                return this.annotation_.size();
            }

            public Annotation.Argument.Value getAnnotationParameterDefaultValue() {
                return this.annotationParameterDefaultValue_;
            }

            public Type getType() {
                return this.type_;
            }

            public Type getVarargElementType() {
                return this.varargElementType_;
            }

            public boolean hasAnnotationParameterDefaultValue() {
                return (this.bitField0_ & 128) == 128;
            }

            public boolean hasName() {
                return (this.bitField0_ & 2) == 2;
            }

            public boolean hasType() {
                return (this.bitField0_ & 4) == 4;
            }

            public boolean hasVarargElementType() {
                return (this.bitField0_ & 16) == 16;
            }

            public Builder mergeAnnotationParameterDefaultValue(Annotation.Argument.Value value) {
                if ((this.bitField0_ & 128) != 128 || this.annotationParameterDefaultValue_ == Annotation.Argument.Value.getDefaultInstance()) {
                    this.annotationParameterDefaultValue_ = value;
                } else {
                    this.annotationParameterDefaultValue_ = Annotation.Argument.Value.newBuilder(this.annotationParameterDefaultValue_).mergeFrom(value).buildPartial();
                }
                this.bitField0_ |= 128;
                return this;
            }

            public Builder mergeType(Type type) {
                if ((this.bitField0_ & 4) != 4 || this.type_ == Type.getDefaultInstance()) {
                    this.type_ = type;
                } else {
                    this.type_ = Type.newBuilder(this.type_).mergeFrom(type).buildPartial();
                }
                this.bitField0_ |= 4;
                return this;
            }

            public Builder mergeVarargElementType(Type type) {
                if ((this.bitField0_ & 16) != 16 || this.varargElementType_ == Type.getDefaultInstance()) {
                    this.varargElementType_ = type;
                } else {
                    this.varargElementType_ = Type.newBuilder(this.varargElementType_).mergeFrom(type).buildPartial();
                }
                this.bitField0_ |= 16;
                return this;
            }

            public Builder setFlags(int i11) {
                this.bitField0_ |= 1;
                this.flags_ = i11;
                return this;
            }

            public Builder setName(int i11) {
                this.bitField0_ |= 2;
                this.name_ = i11;
                return this;
            }

            public Builder setTypeId(int i11) {
                this.bitField0_ |= 8;
                this.typeId_ = i11;
                return this;
            }

            public Builder setVarargElementTypeId(int i11) {
                this.bitField0_ |= 32;
                this.varargElementTypeId_ = i11;
                return this;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            public Builder addAllAnnotation(Iterable<? extends Annotation> iterable) {
                ensureAnnotationIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.annotation_);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public ValueParameter getDefaultInstanceForType() {
                return ValueParameter.getDefaultInstance();
            }

            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                if (hasType() && !getType().isInitialized()) {
                    return false;
                }
                if (hasVarargElementType() && !getVarargElementType().isInitialized()) {
                    return false;
                }
                for (int i11 = 0; i11 < getAnnotationCount(); i11++) {
                    if (!getAnnotation(i11).isInitialized()) {
                        return false;
                    }
                }
                if ((hasAnnotationParameterDefaultValue() && !getAnnotationParameterDefaultValue().isInitialized()) || !extensionsAreInitialized()) {
                    return false;
                }
                return true;
            }

            public Builder setAnnotationParameterDefaultValue(Annotation.Argument.Value value) {
                value.getClass();
                this.annotationParameterDefaultValue_ = value;
                this.bitField0_ |= 128;
                return this;
            }

            public Builder setType(Type type) {
                type.getClass();
                this.type_ = type;
                this.bitField0_ |= 4;
                return this;
            }

            public Builder setVarargElementType(Type type) {
                type.getClass();
                this.varargElementType_ = type;
                this.bitField0_ |= 16;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(ValueParameter valueParameter) {
                if (valueParameter == ValueParameter.getDefaultInstance()) {
                    return this;
                }
                if (valueParameter.hasFlags()) {
                    setFlags(valueParameter.getFlags());
                }
                if (valueParameter.hasName()) {
                    setName(valueParameter.getName());
                }
                if (valueParameter.hasType()) {
                    mergeType(valueParameter.getType());
                }
                if (valueParameter.hasTypeId()) {
                    setTypeId(valueParameter.getTypeId());
                }
                if (valueParameter.hasVarargElementType()) {
                    mergeVarargElementType(valueParameter.getVarargElementType());
                }
                if (valueParameter.hasVarargElementTypeId()) {
                    setVarargElementTypeId(valueParameter.getVarargElementTypeId());
                }
                if (!valueParameter.annotation_.isEmpty()) {
                    if (this.annotation_.isEmpty()) {
                        this.annotation_ = valueParameter.annotation_;
                        this.bitField0_ &= -65;
                    } else {
                        ensureAnnotationIsMutable();
                        this.annotation_.addAll(valueParameter.annotation_);
                    }
                }
                if (valueParameter.hasAnnotationParameterDefaultValue()) {
                    mergeAnnotationParameterDefaultValue(valueParameter.getAnnotationParameterDefaultValue());
                }
                mergeExtensionFields(valueParameter);
                setUnknownFields(getUnknownFields().concat(valueParameter.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo105124clone() {
                return create().mergeFrom(buildPartial());
            }

            private void maybeForceBuilderInitialization() {
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                ValueParameter valueParameter = null;
                try {
                    try {
                        ValueParameter partialFrom = ValueParameter.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        ValueParameter valueParameter2 = (ValueParameter) e11.getUnfinishedMessage();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            valueParameter = valueParameter2;
                            if (valueParameter != null) {
                                mergeFrom(valueParameter);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (valueParameter != null) {
                        mergeFrom(valueParameter);
                    }
                    throw th;
                }
            }
        }

        private void initFields() {
            this.flags_ = 0;
            this.name_ = 0;
            this.type_ = Type.getDefaultInstance();
            this.typeId_ = 0;
            this.varargElementType_ = Type.getDefaultInstance();
            this.varargElementTypeId_ = 0;
            this.annotation_ = Collections.EMPTY_LIST;
            this.annotationParameterDefaultValue_ = Annotation.Argument.Value.getDefaultInstance();
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        static {
            ValueParameter valueParameter = new ValueParameter(true);
            defaultInstance = valueParameter;
            valueParameter.initFields();
        }

        public static ValueParameter getDefaultInstance() {
            return defaultInstance;
        }

        public static Builder newBuilder(ValueParameter valueParameter) {
            return newBuilder().mergeFrom(valueParameter);
        }

        public Annotation getAnnotation(int i11) {
            return this.annotation_.get(i11);
        }

        public int getAnnotationCount() {
            return this.annotation_.size();
        }

        public List<Annotation> getAnnotationList() {
            return this.annotation_;
        }

        public Annotation.Argument.Value getAnnotationParameterDefaultValue() {
            return this.annotationParameterDefaultValue_;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public ValueParameter getDefaultInstanceForType() {
            return defaultInstance;
        }

        public int getFlags() {
            return this.flags_;
        }

        public int getName() {
            return this.name_;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<ValueParameter> getParserForType() {
            return PARSER;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i11 = this.memoizedSerializedSize;
            if (i11 != -1) {
                return i11;
            }
            int iComputeInt32Size = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.flags_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.name_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(3, this.type_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(4, this.varargElementType_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(5, this.typeId_);
            }
            if ((this.bitField0_ & 32) == 32) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(6, this.varargElementTypeId_);
            }
            for (int i12 = 0; i12 < this.annotation_.size(); i12++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(7, this.annotation_.get(i12));
            }
            if ((this.bitField0_ & 64) == 64) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(8, this.annotationParameterDefaultValue_);
            }
            int iExtensionsSerializedSize = iComputeInt32Size + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = iExtensionsSerializedSize;
            return iExtensionsSerializedSize;
        }

        public Type getType() {
            return this.type_;
        }

        public int getTypeId() {
            return this.typeId_;
        }

        public Type getVarargElementType() {
            return this.varargElementType_;
        }

        public int getVarargElementTypeId() {
            return this.varargElementTypeId_;
        }

        public boolean hasAnnotationParameterDefaultValue() {
            return (this.bitField0_ & 64) == 64;
        }

        public boolean hasFlags() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasName() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasType() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean hasTypeId() {
            return (this.bitField0_ & 8) == 8;
        }

        public boolean hasVarargElementType() {
            return (this.bitField0_ & 16) == 16;
        }

        public boolean hasVarargElementTypeId() {
            return (this.bitField0_ & 32) == 32;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b11 = this.memoizedIsInitialized;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            if (!hasName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasType() && !getType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasVarargElementType() && !getVarargElementType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i11 = 0; i11 < getAnnotationCount(); i11++) {
                if (!getAnnotation(i11).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasAnnotationParameterDefaultValue() && !getAnnotationParameterDefaultValue().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private ValueParameter(GeneratedMessageLite.ExtendableBuilder<ValueParameter, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.flags_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(2, this.name_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeMessage(3, this.type_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeMessage(4, this.varargElementType_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeInt32(5, this.typeId_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeInt32(6, this.varargElementTypeId_);
            }
            for (int i11 = 0; i11 < this.annotation_.size(); i11++) {
                codedOutputStream.writeMessage(7, this.annotation_.get(i11));
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.writeMessage(8, this.annotationParameterDefaultValue_);
            }
            extensionWriterNewExtensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        private ValueParameter(boolean z11) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        private ValueParameter(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z11 = false;
            char c11 = 0;
            while (!z11) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.bitField0_ |= 1;
                                this.flags_ = codedInputStream.readInt32();
                            } else if (tag != 16) {
                                if (tag == 26) {
                                    Type.Builder builder = (this.bitField0_ & 4) == 4 ? this.type_.toBuilder() : null;
                                    Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                    this.type_ = type;
                                    if (builder != null) {
                                        builder.mergeFrom(type);
                                        this.type_ = builder.buildPartial();
                                    }
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    Type.Builder builder2 = (this.bitField0_ & 16) == 16 ? this.varargElementType_.toBuilder() : null;
                                    Type type2 = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                    this.varargElementType_ = type2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(type2);
                                        this.varargElementType_ = builder2.buildPartial();
                                    }
                                    this.bitField0_ |= 16;
                                } else if (tag == 40) {
                                    this.bitField0_ |= 8;
                                    this.typeId_ = codedInputStream.readInt32();
                                } else if (tag == 48) {
                                    this.bitField0_ |= 32;
                                    this.varargElementTypeId_ = codedInputStream.readInt32();
                                } else if (tag == 58) {
                                    int i11 = (c11 == true ? 1 : 0) & '@';
                                    c11 = c11;
                                    if (i11 != 64) {
                                        this.annotation_ = new ArrayList();
                                        c11 = '@';
                                    }
                                    this.annotation_.add((Annotation) codedInputStream.readMessage(Annotation.PARSER, extensionRegistryLite));
                                } else if (tag != 66) {
                                    if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    Annotation.Argument.Value.Builder builder3 = (this.bitField0_ & 64) == 64 ? this.annotationParameterDefaultValue_.toBuilder() : null;
                                    Annotation.Argument.Value value = (Annotation.Argument.Value) codedInputStream.readMessage(Annotation.Argument.Value.PARSER, extensionRegistryLite);
                                    this.annotationParameterDefaultValue_ = value;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(value);
                                        this.annotationParameterDefaultValue_ = builder3.buildPartial();
                                    }
                                    this.bitField0_ |= 64;
                                }
                            } else {
                                this.bitField0_ |= 2;
                                this.name_ = codedInputStream.readInt32();
                            }
                        }
                        z11 = true;
                    } catch (Throwable th2) {
                        if (((c11 == true ? 1 : 0) & '@') == 64) {
                            this.annotation_ = Collections.unmodifiableList(this.annotation_);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.unknownFields = outputNewOutput.toByteString();
                        }
                        makeExtensionsImmutable();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.setUnfinishedMessage(this);
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                }
            }
            if (((c11 == true ? 1 : 0) & '@') == 64) {
                this.annotation_ = Collections.unmodifiableList(this.annotation_);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface ValueParameterOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class VersionRequirement extends GeneratedMessageLite implements VersionRequirementOrBuilder {
        public static Parser<VersionRequirement> PARSER = new AbstractParser<VersionRequirement>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.1
            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public VersionRequirement parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new VersionRequirement(codedInputStream, extensionRegistryLite);
            }
        };
        private static final VersionRequirement defaultInstance;
        private int bitField0_;
        private int errorCode_;
        private Level level_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int message_;
        private final ByteString unknownFields;
        private int versionFull_;
        private VersionKind versionKind_;
        private int version_;

        public static final class Builder extends GeneratedMessageLite.Builder<VersionRequirement, Builder> implements VersionRequirementOrBuilder {
            private int bitField0_;
            private int errorCode_;
            private int message_;
            private int versionFull_;
            private int version_;
            private Level level_ = Level.ERROR;
            private VersionKind versionKind_ = VersionKind.LANGUAGE_VERSION;

            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public VersionRequirement build() {
                VersionRequirement versionRequirementBuildPartial = buildPartial();
                if (versionRequirementBuildPartial.isInitialized()) {
                    return versionRequirementBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(versionRequirementBuildPartial);
            }

            public VersionRequirement buildPartial() {
                VersionRequirement versionRequirement = new VersionRequirement(this);
                int i11 = this.bitField0_;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                versionRequirement.version_ = this.version_;
                if ((i11 & 2) == 2) {
                    i12 |= 2;
                }
                versionRequirement.versionFull_ = this.versionFull_;
                if ((i11 & 4) == 4) {
                    i12 |= 4;
                }
                versionRequirement.level_ = this.level_;
                if ((i11 & 8) == 8) {
                    i12 |= 8;
                }
                versionRequirement.errorCode_ = this.errorCode_;
                if ((i11 & 16) == 16) {
                    i12 |= 16;
                }
                versionRequirement.message_ = this.message_;
                if ((i11 & 32) == 32) {
                    i12 |= 32;
                }
                versionRequirement.versionKind_ = this.versionKind_;
                versionRequirement.bitField0_ = i12;
                return versionRequirement;
            }

            public Builder setErrorCode(int i11) {
                this.bitField0_ |= 8;
                this.errorCode_ = i11;
                return this;
            }

            public Builder setMessage(int i11) {
                this.bitField0_ |= 16;
                this.message_ = i11;
                return this;
            }

            public Builder setVersion(int i11) {
                this.bitField0_ |= 1;
                this.version_ = i11;
                return this;
            }

            public Builder setVersionFull(int i11) {
                this.bitField0_ |= 2;
                this.versionFull_ = i11;
                return this;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public VersionRequirement getDefaultInstanceForType() {
                return VersionRequirement.getDefaultInstance();
            }

            public Builder setLevel(Level level) {
                level.getClass();
                this.bitField0_ |= 4;
                this.level_ = level;
                return this;
            }

            public Builder setVersionKind(VersionKind versionKind) {
                versionKind.getClass();
                this.bitField0_ |= 32;
                this.versionKind_ = versionKind;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo105124clone() {
                return create().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(VersionRequirement versionRequirement) {
                if (versionRequirement == VersionRequirement.getDefaultInstance()) {
                    return this;
                }
                if (versionRequirement.hasVersion()) {
                    setVersion(versionRequirement.getVersion());
                }
                if (versionRequirement.hasVersionFull()) {
                    setVersionFull(versionRequirement.getVersionFull());
                }
                if (versionRequirement.hasLevel()) {
                    setLevel(versionRequirement.getLevel());
                }
                if (versionRequirement.hasErrorCode()) {
                    setErrorCode(versionRequirement.getErrorCode());
                }
                if (versionRequirement.hasMessage()) {
                    setMessage(versionRequirement.getMessage());
                }
                if (versionRequirement.hasVersionKind()) {
                    setVersionKind(versionRequirement.getVersionKind());
                }
                setUnknownFields(getUnknownFields().concat(versionRequirement.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                VersionRequirement versionRequirement = null;
                try {
                    try {
                        VersionRequirement partialFrom = VersionRequirement.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        VersionRequirement versionRequirement2 = (VersionRequirement) e11.getUnfinishedMessage();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            versionRequirement = versionRequirement2;
                            if (versionRequirement != null) {
                                mergeFrom(versionRequirement);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (versionRequirement != null) {
                        mergeFrom(versionRequirement);
                    }
                    throw th;
                }
            }

            private void maybeForceBuilderInitialization() {
            }
        }

        public enum Level implements Internal.EnumLite {
            WARNING(0, 0),
            ERROR(1, 1),
            HIDDEN(2, 2);

            private static Internal.EnumLiteMap<Level> internalValueMap = new Internal.EnumLiteMap<Level>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level.1
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                public Level findValueByNumber(int i11) {
                    return Level.valueOf(i11);
                }
            };
            private final int value;

            public static Level valueOf(int i11) {
                if (i11 == 0) {
                    return WARNING;
                }
                if (i11 == 1) {
                    return ERROR;
                }
                if (i11 != 2) {
                    return null;
                }
                return HIDDEN;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            Level(int i11, int i12) {
                this.value = i12;
            }
        }

        public enum VersionKind implements Internal.EnumLite {
            LANGUAGE_VERSION(0, 0),
            COMPILER_VERSION(1, 1),
            API_VERSION(2, 2);

            private static Internal.EnumLiteMap<VersionKind> internalValueMap = new Internal.EnumLiteMap<VersionKind>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind.1
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                public VersionKind findValueByNumber(int i11) {
                    return VersionKind.valueOf(i11);
                }
            };
            private final int value;

            public static VersionKind valueOf(int i11) {
                if (i11 == 0) {
                    return LANGUAGE_VERSION;
                }
                if (i11 == 1) {
                    return COMPILER_VERSION;
                }
                if (i11 != 2) {
                    return null;
                }
                return API_VERSION;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            VersionKind(int i11, int i12) {
                this.value = i12;
            }
        }

        private void initFields() {
            this.version_ = 0;
            this.versionFull_ = 0;
            this.level_ = Level.ERROR;
            this.errorCode_ = 0;
            this.message_ = 0;
            this.versionKind_ = VersionKind.LANGUAGE_VERSION;
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        static {
            VersionRequirement versionRequirement = new VersionRequirement(true);
            defaultInstance = versionRequirement;
            versionRequirement.initFields();
        }

        public static VersionRequirement getDefaultInstance() {
            return defaultInstance;
        }

        public static Builder newBuilder(VersionRequirement versionRequirement) {
            return newBuilder().mergeFrom(versionRequirement);
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public VersionRequirement getDefaultInstanceForType() {
            return defaultInstance;
        }

        public int getErrorCode() {
            return this.errorCode_;
        }

        public Level getLevel() {
            return this.level_;
        }

        public int getMessage() {
            return this.message_;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<VersionRequirement> getParserForType() {
            return PARSER;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i11 = this.memoizedSerializedSize;
            if (i11 != -1) {
                return i11;
            }
            int iComputeInt32Size = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.version_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.versionFull_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeEnumSize(3, this.level_.getNumber());
            }
            if ((this.bitField0_ & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(4, this.errorCode_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(5, this.message_);
            }
            if ((this.bitField0_ & 32) == 32) {
                iComputeInt32Size += CodedOutputStream.computeEnumSize(6, this.versionKind_.getNumber());
            }
            int size = iComputeInt32Size + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public int getVersion() {
            return this.version_;
        }

        public int getVersionFull() {
            return this.versionFull_;
        }

        public VersionKind getVersionKind() {
            return this.versionKind_;
        }

        public boolean hasErrorCode() {
            return (this.bitField0_ & 8) == 8;
        }

        public boolean hasLevel() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean hasMessage() {
            return (this.bitField0_ & 16) == 16;
        }

        public boolean hasVersion() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasVersionFull() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasVersionKind() {
            return (this.bitField0_ & 32) == 32;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b11 = this.memoizedIsInitialized;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private VersionRequirement(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.version_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(2, this.versionFull_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeEnum(3, this.level_.getNumber());
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeInt32(4, this.errorCode_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeInt32(5, this.message_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeEnum(6, this.versionKind_.getNumber());
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        private VersionRequirement(boolean z11) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        private VersionRequirement(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z11 = false;
            while (!z11) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.bitField0_ |= 1;
                                this.version_ = codedInputStream.readInt32();
                            } else if (tag == 16) {
                                this.bitField0_ |= 2;
                                this.versionFull_ = codedInputStream.readInt32();
                            } else if (tag == 24) {
                                int i11 = codedInputStream.readEnum();
                                Level levelValueOf = Level.valueOf(i11);
                                if (levelValueOf == null) {
                                    codedOutputStreamNewInstance.writeRawVarint32(tag);
                                    codedOutputStreamNewInstance.writeRawVarint32(i11);
                                } else {
                                    this.bitField0_ |= 4;
                                    this.level_ = levelValueOf;
                                }
                            } else if (tag == 32) {
                                this.bitField0_ |= 8;
                                this.errorCode_ = codedInputStream.readInt32();
                            } else if (tag == 40) {
                                this.bitField0_ |= 16;
                                this.message_ = codedInputStream.readInt32();
                            } else if (tag != 48) {
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                int i12 = codedInputStream.readEnum();
                                VersionKind versionKindValueOf = VersionKind.valueOf(i12);
                                if (versionKindValueOf == null) {
                                    codedOutputStreamNewInstance.writeRawVarint32(tag);
                                    codedOutputStreamNewInstance.writeRawVarint32(i12);
                                } else {
                                    this.bitField0_ |= 32;
                                    this.versionKind_ = versionKindValueOf;
                                }
                            }
                        }
                        z11 = true;
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.unknownFields = outputNewOutput.toByteString();
                        }
                        makeExtensionsImmutable();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.setUnfinishedMessage(this);
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                }
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface VersionRequirementOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class VersionRequirementTable extends GeneratedMessageLite implements VersionRequirementTableOrBuilder {
        public static Parser<VersionRequirementTable> PARSER = new AbstractParser<VersionRequirementTable>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.1
            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public VersionRequirementTable parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new VersionRequirementTable(codedInputStream, extensionRegistryLite);
            }
        };
        private static final VersionRequirementTable defaultInstance;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List<VersionRequirement> requirement_;
        private final ByteString unknownFields;

        public static final class Builder extends GeneratedMessageLite.Builder<VersionRequirementTable, Builder> implements VersionRequirementTableOrBuilder {
            private int bitField0_;
            private List<VersionRequirement> requirement_ = Collections.EMPTY_LIST;

            @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            private void ensureRequirementIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.requirement_ = new ArrayList(this.requirement_);
                    this.bitField0_ |= 1;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public VersionRequirementTable build() {
                VersionRequirementTable versionRequirementTableBuildPartial = buildPartial();
                if (versionRequirementTableBuildPartial.isInitialized()) {
                    return versionRequirementTableBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(versionRequirementTableBuildPartial);
            }

            public VersionRequirementTable buildPartial() {
                VersionRequirementTable versionRequirementTable = new VersionRequirementTable(this);
                if ((this.bitField0_ & 1) == 1) {
                    this.requirement_ = Collections.unmodifiableList(this.requirement_);
                    this.bitField0_ &= -2;
                }
                versionRequirementTable.requirement_ = this.requirement_;
                return versionRequirementTable;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public VersionRequirementTable getDefaultInstanceForType() {
                return VersionRequirementTable.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo105124clone() {
                return create().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(VersionRequirementTable versionRequirementTable) {
                if (versionRequirementTable == VersionRequirementTable.getDefaultInstance()) {
                    return this;
                }
                if (!versionRequirementTable.requirement_.isEmpty()) {
                    if (this.requirement_.isEmpty()) {
                        this.requirement_ = versionRequirementTable.requirement_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureRequirementIsMutable();
                        this.requirement_.addAll(versionRequirementTable.requirement_);
                    }
                }
                setUnknownFields(getUnknownFields().concat(versionRequirementTable.unknownFields));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                VersionRequirementTable versionRequirementTable = null;
                try {
                    try {
                        VersionRequirementTable partialFrom = VersionRequirementTable.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        VersionRequirementTable versionRequirementTable2 = (VersionRequirementTable) e11.getUnfinishedMessage();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            versionRequirementTable = versionRequirementTable2;
                            if (versionRequirementTable != null) {
                                mergeFrom(versionRequirementTable);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (versionRequirementTable != null) {
                        mergeFrom(versionRequirementTable);
                    }
                    throw th;
                }
            }

            private void maybeForceBuilderInitialization() {
            }
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        static {
            VersionRequirementTable versionRequirementTable = new VersionRequirementTable(true);
            defaultInstance = versionRequirementTable;
            versionRequirementTable.initFields();
        }

        public static VersionRequirementTable getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.requirement_ = Collections.EMPTY_LIST;
        }

        public static Builder newBuilder(VersionRequirementTable versionRequirementTable) {
            return newBuilder().mergeFrom(versionRequirementTable);
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public VersionRequirementTable getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<VersionRequirementTable> getParserForType() {
            return PARSER;
        }

        public int getRequirementCount() {
            return this.requirement_.size();
        }

        public List<VersionRequirement> getRequirementList() {
            return this.requirement_;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i11 = this.memoizedSerializedSize;
            if (i11 != -1) {
                return i11;
            }
            int iComputeMessageSize = 0;
            for (int i12 = 0; i12 < this.requirement_.size(); i12++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.requirement_.get(i12));
            }
            int size = iComputeMessageSize + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b11 = this.memoizedIsInitialized;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private VersionRequirementTable(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i11 = 0; i11 < this.requirement_.size(); i11++) {
                codedOutputStream.writeMessage(1, this.requirement_.get(i11));
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        private VersionRequirementTable(boolean z11) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        private VersionRequirementTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z11 = false;
            boolean z12 = false;
            while (!z11) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag != 10) {
                                    if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    if (!z12) {
                                        this.requirement_ = new ArrayList();
                                        z12 = true;
                                    }
                                    this.requirement_.add((VersionRequirement) codedInputStream.readMessage(VersionRequirement.PARSER, extensionRegistryLite));
                                }
                            }
                            z11 = true;
                        } catch (InvalidProtocolBufferException e11) {
                            throw e11.setUnfinishedMessage(this);
                        }
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if (z12) {
                        this.requirement_ = Collections.unmodifiableList(this.requirement_);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.unknownFields = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (z12) {
                this.requirement_ = Collections.unmodifiableList(this.requirement_);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface VersionRequirementTableOrBuilder extends MessageLiteOrBuilder {
    }

    public enum Visibility implements Internal.EnumLite {
        INTERNAL(0, 0),
        PRIVATE(1, 1),
        PROTECTED(2, 2),
        PUBLIC(3, 3),
        PRIVATE_TO_THIS(4, 4),
        LOCAL(5, 5);

        private static Internal.EnumLiteMap<Visibility> internalValueMap = new Internal.EnumLiteMap<Visibility>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
            public Visibility findValueByNumber(int i11) {
                return Visibility.valueOf(i11);
            }
        };
        private final int value;

        public static Visibility valueOf(int i11) {
            if (i11 == 0) {
                return INTERNAL;
            }
            if (i11 == 1) {
                return PRIVATE;
            }
            if (i11 == 2) {
                return PROTECTED;
            }
            if (i11 == 3) {
                return PUBLIC;
            }
            if (i11 == 4) {
                return PRIVATE_TO_THIS;
            }
            if (i11 != 5) {
                return null;
            }
            return LOCAL;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        Visibility(int i11, int i12) {
            this.value = i12;
        }
    }
}
