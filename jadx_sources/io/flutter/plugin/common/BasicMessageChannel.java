package io.flutter.plugin.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.facebook.react.uimanager.ViewProps;
import io.flutter.Log;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes23.dex */
public final class BasicMessageChannel<T> {
    public static final String CHANNEL_BUFFERS_CHANNEL = "dev.flutter/channel-buffers";
    private static final String TAG = "BasicMessageChannel#";

    @NonNull
    private final MessageCodec<T> codec;

    @NonNull
    private final BinaryMessenger messenger;

    @NonNull
    private final String name;

    @Nullable
    private final BinaryMessenger.TaskQueue taskQueue;

    public final class IncomingMessageHandler implements BinaryMessenger.BinaryMessageHandler {
        private final MessageHandler<T> handler;

        private IncomingMessageHandler(MessageHandler<T> messageHandler) {
            this.handler = messageHandler;
        }

        @Override // io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler
        public void onMessage(@Nullable ByteBuffer byteBuffer, @NonNull final BinaryMessenger.BinaryReply binaryReply) {
            try {
                this.handler.onMessage((T) BasicMessageChannel.this.codec.decodeMessage(byteBuffer), new Reply<T>() { // from class: io.flutter.plugin.common.BasicMessageChannel.IncomingMessageHandler.1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                    public void reply(T t11) {
                        binaryReply.reply(BasicMessageChannel.this.codec.encodeMessage(t11));
                    }
                });
            } catch (RuntimeException e11) {
                Log.m87478e(BasicMessageChannel.TAG + BasicMessageChannel.this.name, "Failed to handle message", e11);
                binaryReply.reply(null);
            }
        }
    }

    /* JADX INFO: loaded from: classes60.dex */
    public final class IncomingReplyHandler implements BinaryMessenger.BinaryReply {
        private final Reply<T> callback;

        private IncomingReplyHandler(Reply<T> reply) {
            this.callback = reply;
        }

        @Override // io.flutter.plugin.common.BinaryMessenger.BinaryReply
        public void reply(@Nullable ByteBuffer byteBuffer) {
            try {
                this.callback.reply((T) BasicMessageChannel.this.codec.decodeMessage(byteBuffer));
            } catch (RuntimeException e11) {
                Log.m87478e(BasicMessageChannel.TAG + BasicMessageChannel.this.name, "Failed to handle message reply", e11);
            }
        }
    }

    public interface MessageHandler<T> {
        void onMessage(@Nullable T t11, @NonNull Reply<T> reply);
    }

    public interface Reply<T> {
        void reply(@Nullable T t11);
    }

    public BasicMessageChannel(@NonNull BinaryMessenger binaryMessenger, @NonNull String str, @NonNull MessageCodec<T> messageCodec) {
        this(binaryMessenger, str, messageCodec, null);
    }

    public void resizeChannelBuffer(int i11) {
        resizeChannelBuffer(this.messenger, this.name, i11);
    }

    public void send(@Nullable T t11) {
        send(t11, null);
    }

    public void setWarnsOnChannelOverflow(boolean z11) {
        setWarnsOnChannelOverflow(this.messenger, this.name, z11);
    }

    public BasicMessageChannel(@NonNull BinaryMessenger binaryMessenger, @NonNull String str, @NonNull MessageCodec<T> messageCodec, BinaryMessenger.TaskQueue taskQueue) {
        this.messenger = binaryMessenger;
        this.name = str;
        this.codec = messageCodec;
        this.taskQueue = taskQueue;
    }

    public static void resizeChannelBuffer(@NonNull BinaryMessenger binaryMessenger, @NonNull String str, int i11) {
        binaryMessenger.send(CHANNEL_BUFFERS_CHANNEL, packetFromEncodedMessage(StandardMethodCodec.INSTANCE.encodeMethodCall(new MethodCall("resize", Arrays.asList(str, Integer.valueOf(i11))))));
    }

    public static void setWarnsOnChannelOverflow(@NonNull BinaryMessenger binaryMessenger, @NonNull String str, boolean z11) {
        binaryMessenger.send(CHANNEL_BUFFERS_CHANNEL, packetFromEncodedMessage(StandardMethodCodec.INSTANCE.encodeMethodCall(new MethodCall(ViewProps.OVERFLOW, Arrays.asList(str, Boolean.valueOf(!z11))))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @UiThread
    public void send(@Nullable T t11, @Nullable Reply<T> reply) {
        this.messenger.send(this.name, this.codec.encodeMessage(t11), reply != null ? new IncomingReplyHandler(reply) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [io.flutter.plugin.common.BinaryMessenger] */
    /* JADX WARN: Type inference failed for: r1v0, types: [io.flutter.plugin.common.BasicMessageChannel$1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [io.flutter.plugin.common.BinaryMessenger$BinaryMessageHandler] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @UiThread
    public void setMessageHandler(@Nullable MessageHandler<T> messageHandler) {
        ?? r11 = 0;
        if (this.taskQueue != null) {
            this.messenger.setMessageHandler(this.name, messageHandler != null ? new IncomingMessageHandler(messageHandler) : null, this.taskQueue);
        } else {
            this.messenger.setMessageHandler(this.name, messageHandler != null ? new IncomingMessageHandler(messageHandler) : 0);
        }
    }

    private static ByteBuffer packetFromEncodedMessage(ByteBuffer byteBuffer) {
        byteBuffer.flip();
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.get(bArr);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(iRemaining);
        byteBufferAllocateDirect.put(bArr);
        return byteBufferAllocateDirect;
    }
}
