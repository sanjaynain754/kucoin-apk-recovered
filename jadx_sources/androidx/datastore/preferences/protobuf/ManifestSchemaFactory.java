package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
final class ManifestSchemaFactory implements SchemaFactory {
    private static final MessageInfoFactory EMPTY_FACTORY = new MessageInfoFactory() { // from class: androidx.datastore.preferences.protobuf.ManifestSchemaFactory.1
        @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
        public boolean isSupported(Class<?> cls) {
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
        public MessageInfo messageInfoFor(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    };
    private final MessageInfoFactory messageInfoFactory;

    public static class CompositeMessageInfoFactory implements MessageInfoFactory {
        private MessageInfoFactory[] factories;

        @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
        public boolean isSupported(Class<?> cls) {
            for (MessageInfoFactory messageInfoFactory : this.factories) {
                if (messageInfoFactory.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
        public MessageInfo messageInfoFor(Class<?> cls) {
            for (MessageInfoFactory messageInfoFactory : this.factories) {
                if (messageInfoFactory.isSupported(cls)) {
                    return messageInfoFactory.messageInfoFor(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        public CompositeMessageInfoFactory(MessageInfoFactory... messageInfoFactoryArr) {
            this.factories = messageInfoFactoryArr;
        }
    }

    public ManifestSchemaFactory() {
        this(getDefaultMessageInfoFactory());
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ManifestSchemaFactory$2 */
    public static /* synthetic */ class C24342 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$ProtoSyntax;

        static {
            int[] iArr = new int[ProtoSyntax.values().length];
            $SwitchMap$com$google$protobuf$ProtoSyntax = iArr;
            try {
                iArr[ProtoSyntax.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private ManifestSchemaFactory(MessageInfoFactory messageInfoFactory) {
        this.messageInfoFactory = (MessageInfoFactory) Internal.checkNotNull(messageInfoFactory, "messageInfoFactory");
    }

    private static boolean allowExtensions(MessageInfo messageInfo) {
        return C24342.$SwitchMap$com$google$protobuf$ProtoSyntax[messageInfo.getSyntax().ordinal()] != 1;
    }

    private static MessageInfoFactory getDefaultMessageInfoFactory() {
        return new CompositeMessageInfoFactory(GeneratedMessageInfoFactory.getInstance(), getDescriptorMessageInfoFactory());
    }

    private static MessageInfoFactory getDescriptorMessageInfoFactory() {
        if (Protobuf.assumeLiteRuntime) {
            return EMPTY_FACTORY;
        }
        try {
            return (MessageInfoFactory) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return EMPTY_FACTORY;
        }
    }

    private static boolean useLiteRuntime(Class<?> cls) {
        return Protobuf.assumeLiteRuntime || GeneratedMessageLite.class.isAssignableFrom(cls);
    }

    private static <T> Schema<T> newSchema(Class<T> cls, MessageInfo messageInfo) {
        ExtensionSchema<?> extensionSchemaLite = null;
        if (useLiteRuntime(cls)) {
            NewInstanceSchema newInstanceSchemaLite = NewInstanceSchemas.lite();
            ListFieldSchema listFieldSchemaLite = ListFieldSchemas.lite();
            UnknownFieldSchema<?, ?> unknownFieldSchemaUnknownFieldSetLiteSchema = SchemaUtil.unknownFieldSetLiteSchema();
            if (allowExtensions(messageInfo)) {
                extensionSchemaLite = ExtensionSchemas.lite();
            }
            return MessageSchema.newSchema(cls, messageInfo, newInstanceSchemaLite, listFieldSchemaLite, unknownFieldSchemaUnknownFieldSetLiteSchema, extensionSchemaLite, MapFieldSchemas.lite());
        }
        NewInstanceSchema newInstanceSchemaFull = NewInstanceSchemas.full();
        ExtensionSchema<?> extensionSchemaFull = null;
        ListFieldSchema listFieldSchemaFull = ListFieldSchemas.full();
        UnknownFieldSchema<?, ?> unknownFieldSchemaUnknownFieldSetFullSchema = SchemaUtil.unknownFieldSetFullSchema();
        if (allowExtensions(messageInfo)) {
            extensionSchemaFull = ExtensionSchemas.full();
        }
        return MessageSchema.newSchema(cls, messageInfo, newInstanceSchemaFull, listFieldSchemaFull, unknownFieldSchemaUnknownFieldSetFullSchema, extensionSchemaFull, MapFieldSchemas.full());
    }

    @Override // androidx.datastore.preferences.protobuf.SchemaFactory
    public <T> Schema<T> createSchema(Class<T> cls) {
        SchemaUtil.requireGeneratedMessage(cls);
        MessageInfo messageInfoMessageInfoFor = this.messageInfoFactory.messageInfoFor(cls);
        if (messageInfoMessageInfoFor.isMessageSetWireFormat()) {
            if (useLiteRuntime(cls)) {
                return MessageSetSchema.newSchema(SchemaUtil.unknownFieldSetLiteSchema(), ExtensionSchemas.lite(), messageInfoMessageInfoFor.getDefaultInstance());
            }
            return MessageSetSchema.newSchema(SchemaUtil.unknownFieldSetFullSchema(), ExtensionSchemas.full(), messageInfoMessageInfoFor.getDefaultInstance());
        }
        return newSchema(cls, messageInfoMessageInfoFor);
    }
}
