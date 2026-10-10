package com.google.firebase.perf.p070v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidApplicationInfo extends GeneratedMessageLite<AndroidApplicationInfo, Builder> implements AndroidApplicationInfoOrBuilder {
    private static final AndroidApplicationInfo DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile Parser<AndroidApplicationInfo> PARSER = null;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    public static final int VERSION_NAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private String packageName_ = "";
    private String sdkVersion_ = "";
    private String versionName_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<AndroidApplicationInfo, Builder> implements AndroidApplicationInfoOrBuilder {
        public /* synthetic */ Builder(C88151 c88151) {
            this();
        }

        private Builder() {
            super(AndroidApplicationInfo.DEFAULT_INSTANCE);
        }

        @Override // com.google.firebase.perf.p070v1.AndroidApplicationInfoOrBuilder
        public String getPackageName() {
            return ((AndroidApplicationInfo) this.instance).getPackageName();
        }

        @Override // com.google.firebase.perf.p070v1.AndroidApplicationInfoOrBuilder
        public ByteString getPackageNameBytes() {
            return ((AndroidApplicationInfo) this.instance).getPackageNameBytes();
        }

        @Override // com.google.firebase.perf.p070v1.AndroidApplicationInfoOrBuilder
        public String getSdkVersion() {
            return ((AndroidApplicationInfo) this.instance).getSdkVersion();
        }

        @Override // com.google.firebase.perf.p070v1.AndroidApplicationInfoOrBuilder
        public ByteString getSdkVersionBytes() {
            return ((AndroidApplicationInfo) this.instance).getSdkVersionBytes();
        }

        @Override // com.google.firebase.perf.p070v1.AndroidApplicationInfoOrBuilder
        public String getVersionName() {
            return ((AndroidApplicationInfo) this.instance).getVersionName();
        }

        @Override // com.google.firebase.perf.p070v1.AndroidApplicationInfoOrBuilder
        public ByteString getVersionNameBytes() {
            return ((AndroidApplicationInfo) this.instance).getVersionNameBytes();
        }

        @Override // com.google.firebase.perf.p070v1.AndroidApplicationInfoOrBuilder
        public boolean hasPackageName() {
            return ((AndroidApplicationInfo) this.instance).hasPackageName();
        }

        @Override // com.google.firebase.perf.p070v1.AndroidApplicationInfoOrBuilder
        public boolean hasSdkVersion() {
            return ((AndroidApplicationInfo) this.instance).hasSdkVersion();
        }

        @Override // com.google.firebase.perf.p070v1.AndroidApplicationInfoOrBuilder
        public boolean hasVersionName() {
            return ((AndroidApplicationInfo) this.instance).hasVersionName();
        }

        public Builder clearPackageName() {
            copyOnWrite();
            ((AndroidApplicationInfo) this.instance).clearPackageName();
            return this;
        }

        public Builder clearSdkVersion() {
            copyOnWrite();
            ((AndroidApplicationInfo) this.instance).clearSdkVersion();
            return this;
        }

        public Builder clearVersionName() {
            copyOnWrite();
            ((AndroidApplicationInfo) this.instance).clearVersionName();
            return this;
        }

        public Builder setPackageName(String str) {
            copyOnWrite();
            ((AndroidApplicationInfo) this.instance).setPackageName(str);
            return this;
        }

        public Builder setPackageNameBytes(ByteString byteString) {
            copyOnWrite();
            ((AndroidApplicationInfo) this.instance).setPackageNameBytes(byteString);
            return this;
        }

        public Builder setSdkVersion(String str) {
            copyOnWrite();
            ((AndroidApplicationInfo) this.instance).setSdkVersion(str);
            return this;
        }

        public Builder setSdkVersionBytes(ByteString byteString) {
            copyOnWrite();
            ((AndroidApplicationInfo) this.instance).setSdkVersionBytes(byteString);
            return this;
        }

        public Builder setVersionName(String str) {
            copyOnWrite();
            ((AndroidApplicationInfo) this.instance).setVersionName(str);
            return this;
        }

        public Builder setVersionNameBytes(ByteString byteString) {
            copyOnWrite();
            ((AndroidApplicationInfo) this.instance).setVersionNameBytes(byteString);
            return this;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static AndroidApplicationInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AndroidApplicationInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AndroidApplicationInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AndroidApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.google.firebase.perf.v1.AndroidApplicationInfo$1 */
    public static /* synthetic */ class C88151 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f12634xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f12634xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12634xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12634xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12634xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12634xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12634xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12634xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        AndroidApplicationInfo androidApplicationInfo = new AndroidApplicationInfo();
        DEFAULT_INSTANCE = androidApplicationInfo;
        GeneratedMessageLite.registerDefaultInstance(AndroidApplicationInfo.class, androidApplicationInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPackageName() {
        this.bitField0_ &= -2;
        this.packageName_ = getDefaultInstance().getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSdkVersion() {
        this.bitField0_ &= -3;
        this.sdkVersion_ = getDefaultInstance().getSdkVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersionName() {
        this.bitField0_ &= -5;
        this.versionName_ = getDefaultInstance().getVersionName();
    }

    public static AndroidApplicationInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder(AndroidApplicationInfo androidApplicationInfo) {
        return DEFAULT_INSTANCE.createBuilder(androidApplicationInfo);
    }

    public static AndroidApplicationInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AndroidApplicationInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AndroidApplicationInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AndroidApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<AndroidApplicationInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C88151 c88151 = null;
        switch (C88151.f12634xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new AndroidApplicationInfo();
            case 2:
                return new Builder(c88151);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "packageName_", "sdkVersion_", "versionName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AndroidApplicationInfo> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (AndroidApplicationInfo.class) {
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

    @Override // com.google.firebase.perf.p070v1.AndroidApplicationInfoOrBuilder
    public String getPackageName() {
        return this.packageName_;
    }

    @Override // com.google.firebase.perf.p070v1.AndroidApplicationInfoOrBuilder
    public ByteString getPackageNameBytes() {
        return ByteString.copyFromUtf8(this.packageName_);
    }

    @Override // com.google.firebase.perf.p070v1.AndroidApplicationInfoOrBuilder
    public String getSdkVersion() {
        return this.sdkVersion_;
    }

    @Override // com.google.firebase.perf.p070v1.AndroidApplicationInfoOrBuilder
    public ByteString getSdkVersionBytes() {
        return ByteString.copyFromUtf8(this.sdkVersion_);
    }

    @Override // com.google.firebase.perf.p070v1.AndroidApplicationInfoOrBuilder
    public String getVersionName() {
        return this.versionName_;
    }

    @Override // com.google.firebase.perf.p070v1.AndroidApplicationInfoOrBuilder
    public ByteString getVersionNameBytes() {
        return ByteString.copyFromUtf8(this.versionName_);
    }

    @Override // com.google.firebase.perf.p070v1.AndroidApplicationInfoOrBuilder
    public boolean hasPackageName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.firebase.perf.p070v1.AndroidApplicationInfoOrBuilder
    public boolean hasSdkVersion() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.firebase.perf.p070v1.AndroidApplicationInfoOrBuilder
    public boolean hasVersionName() {
        return (this.bitField0_ & 4) != 0;
    }

    private AndroidApplicationInfo() {
    }

    public static AndroidApplicationInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AndroidApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPackageName(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.packageName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPackageNameBytes(ByteString byteString) {
        this.packageName_ = byteString.toStringUtf8();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkVersion(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.sdkVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkVersionBytes(ByteString byteString) {
        this.sdkVersion_ = byteString.toStringUtf8();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersionName(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.versionName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersionNameBytes(ByteString byteString) {
        this.versionName_ = byteString.toStringUtf8();
        this.bitField0_ |= 4;
    }

    public static AndroidApplicationInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AndroidApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AndroidApplicationInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AndroidApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AndroidApplicationInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AndroidApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static AndroidApplicationInfo parseFrom(InputStream inputStream) throws IOException {
        return (AndroidApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AndroidApplicationInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AndroidApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AndroidApplicationInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AndroidApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AndroidApplicationInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AndroidApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
