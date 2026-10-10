package com.google.cloud.audit;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes56.dex */
public final class AuthorizationInfo extends GeneratedMessageLite<AuthorizationInfo, Builder> implements AuthorizationInfoOrBuilder {
    private static final AuthorizationInfo DEFAULT_INSTANCE;
    public static final int GRANTED_FIELD_NUMBER = 3;
    private static volatile Parser<AuthorizationInfo> PARSER = null;
    public static final int PERMISSION_FIELD_NUMBER = 2;
    public static final int RESOURCE_FIELD_NUMBER = 1;
    private boolean granted_;
    private String resource_ = "";
    private String permission_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<AuthorizationInfo, Builder> implements AuthorizationInfoOrBuilder {
        public /* synthetic */ Builder(C79641 c79641) {
            this();
        }

        private Builder() {
            super(AuthorizationInfo.DEFAULT_INSTANCE);
        }

        @Override // com.google.cloud.audit.AuthorizationInfoOrBuilder
        public boolean getGranted() {
            return ((AuthorizationInfo) this.instance).getGranted();
        }

        @Override // com.google.cloud.audit.AuthorizationInfoOrBuilder
        public String getPermission() {
            return ((AuthorizationInfo) this.instance).getPermission();
        }

        @Override // com.google.cloud.audit.AuthorizationInfoOrBuilder
        public ByteString getPermissionBytes() {
            return ((AuthorizationInfo) this.instance).getPermissionBytes();
        }

        @Override // com.google.cloud.audit.AuthorizationInfoOrBuilder
        public String getResource() {
            return ((AuthorizationInfo) this.instance).getResource();
        }

        @Override // com.google.cloud.audit.AuthorizationInfoOrBuilder
        public ByteString getResourceBytes() {
            return ((AuthorizationInfo) this.instance).getResourceBytes();
        }

        public Builder clearGranted() {
            copyOnWrite();
            ((AuthorizationInfo) this.instance).clearGranted();
            return this;
        }

        public Builder clearPermission() {
            copyOnWrite();
            ((AuthorizationInfo) this.instance).clearPermission();
            return this;
        }

        public Builder clearResource() {
            copyOnWrite();
            ((AuthorizationInfo) this.instance).clearResource();
            return this;
        }

        public Builder setGranted(boolean z11) {
            copyOnWrite();
            ((AuthorizationInfo) this.instance).setGranted(z11);
            return this;
        }

        public Builder setPermission(String str) {
            copyOnWrite();
            ((AuthorizationInfo) this.instance).setPermission(str);
            return this;
        }

        public Builder setPermissionBytes(ByteString byteString) {
            copyOnWrite();
            ((AuthorizationInfo) this.instance).setPermissionBytes(byteString);
            return this;
        }

        public Builder setResource(String str) {
            copyOnWrite();
            ((AuthorizationInfo) this.instance).setResource(str);
            return this;
        }

        public Builder setResourceBytes(ByteString byteString) {
            copyOnWrite();
            ((AuthorizationInfo) this.instance).setResourceBytes(byteString);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGranted() {
        this.granted_ = false;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static AuthorizationInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AuthorizationInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthorizationInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AuthorizationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.google.cloud.audit.AuthorizationInfo$1 */
    public static /* synthetic */ class C79641 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f12202xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f12202xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12202xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12202xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12202xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12202xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12202xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12202xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        AuthorizationInfo authorizationInfo = new AuthorizationInfo();
        DEFAULT_INSTANCE = authorizationInfo;
        GeneratedMessageLite.registerDefaultInstance(AuthorizationInfo.class, authorizationInfo);
    }

    public static AuthorizationInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder(AuthorizationInfo authorizationInfo) {
        return DEFAULT_INSTANCE.createBuilder(authorizationInfo);
    }

    public static AuthorizationInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthorizationInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AuthorizationInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AuthorizationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<AuthorizationInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGranted(boolean z11) {
        this.granted_ = z11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C79641 c79641 = null;
        switch (C79641.f12202xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new AuthorizationInfo();
            case 2:
                return new Builder(c79641);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007", new Object[]{"resource_", "permission_", "granted_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AuthorizationInfo> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (AuthorizationInfo.class) {
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

    @Override // com.google.cloud.audit.AuthorizationInfoOrBuilder
    public boolean getGranted() {
        return this.granted_;
    }

    @Override // com.google.cloud.audit.AuthorizationInfoOrBuilder
    public String getPermission() {
        return this.permission_;
    }

    @Override // com.google.cloud.audit.AuthorizationInfoOrBuilder
    public ByteString getPermissionBytes() {
        return ByteString.copyFromUtf8(this.permission_);
    }

    @Override // com.google.cloud.audit.AuthorizationInfoOrBuilder
    public String getResource() {
        return this.resource_;
    }

    @Override // com.google.cloud.audit.AuthorizationInfoOrBuilder
    public ByteString getResourceBytes() {
        return ByteString.copyFromUtf8(this.resource_);
    }

    private AuthorizationInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPermission() {
        this.permission_ = getDefaultInstance().getPermission();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResource() {
        this.resource_ = getDefaultInstance().getResource();
    }

    public static AuthorizationInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AuthorizationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPermission(String str) {
        str.getClass();
        this.permission_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPermissionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.permission_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResource(String str) {
        str.getClass();
        this.resource_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResourceBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.resource_ = byteString.toStringUtf8();
    }

    public static AuthorizationInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AuthorizationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AuthorizationInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AuthorizationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AuthorizationInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AuthorizationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static AuthorizationInfo parseFrom(InputStream inputStream) throws IOException {
        return (AuthorizationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthorizationInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthorizationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AuthorizationInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AuthorizationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AuthorizationInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthorizationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
