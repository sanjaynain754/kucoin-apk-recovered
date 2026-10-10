package com.kubi.flutter.proto.kline;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p312hg.InterfaceC38195b;

/* JADX INFO: loaded from: classes13.dex */
public final class VolumeConfig extends GeneratedMessageLite<VolumeConfig, C12735b> implements MessageLiteOrBuilder {
    private static final VolumeConfig DEFAULT_INSTANCE;
    public static final int MA_FIELD_NUMBER = 2;
    private static volatile Parser<VolumeConfig> PARSER = null;
    public static final int VOLTEXT_FIELD_NUMBER = 3;
    private Internal.ProtobufList<IndexItemConfig> ma_ = GeneratedMessageLite.emptyProtobufList();
    private int volText_;

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.VolumeConfig$b */
    public static final class C12735b extends GeneratedMessageLite.Builder<VolumeConfig, C12735b> implements MessageLiteOrBuilder {
        public /* synthetic */ C12735b(C12734a c12734a) {
            this();
        }

        public C12735b() {
            super(VolumeConfig.DEFAULT_INSTANCE);
        }

        /* JADX INFO: renamed from: a */
        public C12735b m24061a(SwitchType switchType) {
            copyOnWrite();
            ((VolumeConfig) this.instance).setVolText(switchType);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMa(IndexItemConfig indexItemConfig) {
        indexItemConfig.getClass();
        ensureMaIsMutable();
        this.ma_.add(indexItemConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVolText() {
        this.volText_ = 0;
    }

    public static C12735b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static VolumeConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (VolumeConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VolumeConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (VolumeConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.VolumeConfig$a */
    public static /* synthetic */ class C12734a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22219a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22219a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22219a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22219a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22219a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22219a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22219a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22219a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        VolumeConfig volumeConfig = new VolumeConfig();
        DEFAULT_INSTANCE = volumeConfig;
        GeneratedMessageLite.registerDefaultInstance(VolumeConfig.class, volumeConfig);
    }

    private void ensureMaIsMutable() {
        Internal.ProtobufList<IndexItemConfig> protobufList = this.ma_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.ma_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static VolumeConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12735b newBuilder(VolumeConfig volumeConfig) {
        return DEFAULT_INSTANCE.createBuilder(volumeConfig);
    }

    public static VolumeConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VolumeConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VolumeConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VolumeConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<VolumeConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVolTextValue(int i11) {
        this.volText_ = i11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C12734a c12734a = null;
        switch (C12734a.f22219a[methodToInvoke.ordinal()]) {
            case 1:
                return new VolumeConfig();
            case 2:
                return new C12735b(c12734a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0001\u0000\u0002\u001b\u0003\f", new Object[]{"ma_", IndexItemConfig.class, "volText_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<VolumeConfig> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (VolumeConfig.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public IndexItemConfig getMa(int i11) {
        return this.ma_.get(i11);
    }

    public int getMaCount() {
        return this.ma_.size();
    }

    public List<IndexItemConfig> getMaList() {
        return this.ma_;
    }

    public InterfaceC38195b getMaOrBuilder(int i11) {
        return this.ma_.get(i11);
    }

    public List<? extends InterfaceC38195b> getMaOrBuilderList() {
        return this.ma_;
    }

    public SwitchType getVolText() {
        SwitchType switchTypeForNumber = SwitchType.forNumber(this.volText_);
        return switchTypeForNumber == null ? SwitchType.UNRECOGNIZED : switchTypeForNumber;
    }

    public int getVolTextValue() {
        return this.volText_;
    }

    private VolumeConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMa(Iterable<? extends IndexItemConfig> iterable) {
        ensureMaIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.ma_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMa() {
        this.ma_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static VolumeConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (VolumeConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMa(int i11) {
        ensureMaIsMutable();
        this.ma_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMa(int i11, IndexItemConfig indexItemConfig) {
        indexItemConfig.getClass();
        ensureMaIsMutable();
        this.ma_.set(i11, indexItemConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVolText(SwitchType switchType) {
        this.volText_ = switchType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMa(int i11, IndexItemConfig indexItemConfig) {
        indexItemConfig.getClass();
        ensureMaIsMutable();
        this.ma_.add(i11, indexItemConfig);
    }

    public static VolumeConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VolumeConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static VolumeConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (VolumeConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static VolumeConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VolumeConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static VolumeConfig parseFrom(InputStream inputStream) throws IOException {
        return (VolumeConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VolumeConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VolumeConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VolumeConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (VolumeConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static VolumeConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VolumeConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
