package io.flutter.plugins.videoplayer;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tencent.bugly.proguard.C33978va;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes60.dex */
public class Messages {

    /* JADX INFO: loaded from: classes23.dex */
    public interface AndroidVideoPlayerApi {
        static void setUp(@NonNull BinaryMessenger binaryMessenger, @Nullable AndroidVideoPlayerApi androidVideoPlayerApi) {
            setUp(binaryMessenger, "", androidVideoPlayerApi);
        }

        @NonNull
        Long createForPlatformView(@NonNull CreationOptions creationOptions);

        @NonNull
        TexturePlayerIds createForTextureView(@NonNull CreationOptions creationOptions);

        void dispose(@NonNull Long l11);

        @NonNull
        String getLookupKeyForAsset(@NonNull String str, @Nullable String str2);

        void initialize();

        void setMixWithOthers(@NonNull Boolean bool);

        /* JADX INFO: renamed from: a */
        static /* synthetic */ void m87618a(AndroidVideoPlayerApi androidVideoPlayerApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, androidVideoPlayerApi.getLookupKeyForAsset((String) arrayList2.get(0), (String) arrayList2.get(1)));
            } catch (Throwable th2) {
                arrayList = Messages.wrapError(th2);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: b */
        static /* synthetic */ void m87619b(AndroidVideoPlayerApi androidVideoPlayerApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, androidVideoPlayerApi.createForTextureView((CreationOptions) ((ArrayList) obj).get(0)));
            } catch (Throwable th2) {
                arrayList = Messages.wrapError(th2);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: c */
        static /* synthetic */ void m87620c(AndroidVideoPlayerApi androidVideoPlayerApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                androidVideoPlayerApi.dispose((Long) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Messages.wrapError(th2);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: d */
        static /* synthetic */ void m87621d(AndroidVideoPlayerApi androidVideoPlayerApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                androidVideoPlayerApi.setMixWithOthers((Boolean) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Messages.wrapError(th2);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: e */
        static /* synthetic */ void m87622e(AndroidVideoPlayerApi androidVideoPlayerApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                androidVideoPlayerApi.initialize();
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Messages.wrapError(th2);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: f */
        static /* synthetic */ void m87623f(AndroidVideoPlayerApi androidVideoPlayerApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, androidVideoPlayerApi.createForPlatformView((CreationOptions) ((ArrayList) obj).get(0)));
            } catch (Throwable th2) {
                arrayList = Messages.wrapError(th2);
            }
            reply.reply(arrayList);
        }

        @NonNull
        static MessageCodec<Object> getCodec() {
            return PigeonCodec.INSTANCE;
        }

        static void setUp(@NonNull BinaryMessenger binaryMessenger, @NonNull String str, @Nullable final AndroidVideoPlayerApi androidVideoPlayerApi) {
            String str2;
            if (str.isEmpty()) {
                str2 = "";
            } else {
                str2 = C33978va.f72339h + str;
            }
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.initialize" + str2, getCodec());
            if (androidVideoPlayerApi != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.videoplayer.a
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.AndroidVideoPlayerApi.m87622e(this.f86846a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.createForPlatformView" + str2, getCodec());
            if (androidVideoPlayerApi != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.videoplayer.b
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.AndroidVideoPlayerApi.m87623f(this.f86847a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.createForTextureView" + str2, getCodec());
            if (androidVideoPlayerApi != null) {
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.videoplayer.c
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.AndroidVideoPlayerApi.m87619b(this.f86848a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.dispose" + str2, getCodec());
            if (androidVideoPlayerApi != null) {
                basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.videoplayer.d
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.AndroidVideoPlayerApi.m87620c(this.f86849a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.setMixWithOthers" + str2, getCodec());
            if (androidVideoPlayerApi != null) {
                basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.videoplayer.e
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.AndroidVideoPlayerApi.m87621d(this.f86850a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.getLookupKeyForAsset" + str2, getCodec());
            if (androidVideoPlayerApi != null) {
                basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.videoplayer.f
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.AndroidVideoPlayerApi.m87618a(this.f86851a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
        }
    }

    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.CLASS)
    public @interface CanIgnoreReturnValue {
    }

    public static final class CreationOptions {

        @Nullable
        private PlatformVideoFormat formatHint;

        @NonNull
        private Map<String, String> httpHeaders;

        @NonNull
        private String uri;

        @Nullable
        private String userAgent;

        public static final class Builder {

            @Nullable
            private PlatformVideoFormat formatHint;

            @Nullable
            private Map<String, String> httpHeaders;

            @Nullable
            private String uri;

            @Nullable
            private String userAgent;

            @NonNull
            public CreationOptions build() {
                CreationOptions creationOptions = new CreationOptions();
                creationOptions.setUri(this.uri);
                creationOptions.setFormatHint(this.formatHint);
                creationOptions.setHttpHeaders(this.httpHeaders);
                creationOptions.setUserAgent(this.userAgent);
                return creationOptions;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setFormatHint(@Nullable PlatformVideoFormat platformVideoFormat) {
                this.formatHint = platformVideoFormat;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setHttpHeaders(@NonNull Map<String, String> map) {
                this.httpHeaders = map;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setUri(@NonNull String str) {
                this.uri = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setUserAgent(@Nullable String str) {
                this.userAgent = str;
                return this;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && CreationOptions.class == obj.getClass()) {
                CreationOptions creationOptions = (CreationOptions) obj;
                if (this.uri.equals(creationOptions.uri) && Objects.equals(this.formatHint, creationOptions.formatHint) && this.httpHeaders.equals(creationOptions.httpHeaders) && Objects.equals(this.userAgent, creationOptions.userAgent)) {
                    return true;
                }
            }
            return false;
        }

        @NonNull
        public static CreationOptions fromList(@NonNull ArrayList<Object> arrayList) {
            CreationOptions creationOptions = new CreationOptions();
            creationOptions.setUri((String) arrayList.get(0));
            creationOptions.setFormatHint((PlatformVideoFormat) arrayList.get(1));
            creationOptions.setHttpHeaders((Map) arrayList.get(2));
            creationOptions.setUserAgent((String) arrayList.get(3));
            return creationOptions;
        }

        @Nullable
        public PlatformVideoFormat getFormatHint() {
            return this.formatHint;
        }

        @NonNull
        public Map<String, String> getHttpHeaders() {
            return this.httpHeaders;
        }

        @NonNull
        public String getUri() {
            return this.uri;
        }

        @Nullable
        public String getUserAgent() {
            return this.userAgent;
        }

        public int hashCode() {
            return Objects.hash(this.uri, this.formatHint, this.httpHeaders, this.userAgent);
        }

        public void setFormatHint(@Nullable PlatformVideoFormat platformVideoFormat) {
            this.formatHint = platformVideoFormat;
        }

        public void setHttpHeaders(@NonNull Map<String, String> map) {
            if (map == null) {
                throw new IllegalStateException("Nonnull field \"httpHeaders\" is null.");
            }
            this.httpHeaders = map;
        }

        public void setUri(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"uri\" is null.");
            }
            this.uri = str;
        }

        public void setUserAgent(@Nullable String str) {
            this.userAgent = str;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(4);
            arrayList.add(this.uri);
            arrayList.add(this.formatHint);
            arrayList.add(this.httpHeaders);
            arrayList.add(this.userAgent);
            return arrayList;
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static class PigeonCodec extends StandardMessageCodec {
        public static final PigeonCodec INSTANCE = new PigeonCodec();

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(@NonNull ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof PlatformVideoFormat) {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, obj == null ? null : Integer.valueOf(((PlatformVideoFormat) obj).index));
                return;
            }
            if (obj instanceof PlatformVideoViewCreationParams) {
                byteArrayOutputStream.write(130);
                writeValue(byteArrayOutputStream, ((PlatformVideoViewCreationParams) obj).toList());
                return;
            }
            if (obj instanceof CreationOptions) {
                byteArrayOutputStream.write(131);
                writeValue(byteArrayOutputStream, ((CreationOptions) obj).toList());
            } else if (obj instanceof TexturePlayerIds) {
                byteArrayOutputStream.write(132);
                writeValue(byteArrayOutputStream, ((TexturePlayerIds) obj).toList());
            } else if (!(obj instanceof PlaybackState)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(133);
                writeValue(byteArrayOutputStream, ((PlaybackState) obj).toList());
            }
        }

        private PigeonCodec() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b11, @NonNull ByteBuffer byteBuffer) {
            switch (b11) {
                case -127:
                    Object value = readValue(byteBuffer);
                    if (value == null) {
                        return null;
                    }
                    return PlatformVideoFormat.values()[((Long) value).intValue()];
                case -126:
                    return PlatformVideoViewCreationParams.fromList((ArrayList) readValue(byteBuffer));
                case -125:
                    return CreationOptions.fromList((ArrayList) readValue(byteBuffer));
                case -124:
                    return TexturePlayerIds.fromList((ArrayList) readValue(byteBuffer));
                case -123:
                    return PlaybackState.fromList((ArrayList) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b11, byteBuffer);
            }
        }
    }

    public static final class PlatformVideoViewCreationParams {

        @NonNull
        private Long playerId;

        public static final class Builder {

            @Nullable
            private Long playerId;

            @NonNull
            public PlatformVideoViewCreationParams build() {
                PlatformVideoViewCreationParams platformVideoViewCreationParams = new PlatformVideoViewCreationParams();
                platformVideoViewCreationParams.setPlayerId(this.playerId);
                return platformVideoViewCreationParams;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setPlayerId(@NonNull Long l11) {
                this.playerId = l11;
                return this;
            }
        }

        @NonNull
        public static PlatformVideoViewCreationParams fromList(@NonNull ArrayList<Object> arrayList) {
            PlatformVideoViewCreationParams platformVideoViewCreationParams = new PlatformVideoViewCreationParams();
            platformVideoViewCreationParams.setPlayerId((Long) arrayList.get(0));
            return platformVideoViewCreationParams;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || PlatformVideoViewCreationParams.class != obj.getClass()) {
                return false;
            }
            return this.playerId.equals(((PlatformVideoViewCreationParams) obj).playerId);
        }

        @NonNull
        public Long getPlayerId() {
            return this.playerId;
        }

        public int hashCode() {
            return Objects.hash(this.playerId);
        }

        public void setPlayerId(@NonNull Long l11) {
            if (l11 == null) {
                throw new IllegalStateException("Nonnull field \"playerId\" is null.");
            }
            this.playerId = l11;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.playerId);
            return arrayList;
        }
    }

    public static final class PlaybackState {

        @NonNull
        private Long bufferPosition;

        @NonNull
        private Long playPosition;

        public static final class Builder {

            @Nullable
            private Long bufferPosition;

            @Nullable
            private Long playPosition;

            @NonNull
            public PlaybackState build() {
                PlaybackState playbackState = new PlaybackState();
                playbackState.setPlayPosition(this.playPosition);
                playbackState.setBufferPosition(this.bufferPosition);
                return playbackState;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setBufferPosition(@NonNull Long l11) {
                this.bufferPosition = l11;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setPlayPosition(@NonNull Long l11) {
                this.playPosition = l11;
                return this;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlaybackState.class == obj.getClass()) {
                PlaybackState playbackState = (PlaybackState) obj;
                if (this.playPosition.equals(playbackState.playPosition) && this.bufferPosition.equals(playbackState.bufferPosition)) {
                    return true;
                }
            }
            return false;
        }

        @NonNull
        public static PlaybackState fromList(@NonNull ArrayList<Object> arrayList) {
            PlaybackState playbackState = new PlaybackState();
            playbackState.setPlayPosition((Long) arrayList.get(0));
            playbackState.setBufferPosition((Long) arrayList.get(1));
            return playbackState;
        }

        @NonNull
        public Long getBufferPosition() {
            return this.bufferPosition;
        }

        @NonNull
        public Long getPlayPosition() {
            return this.playPosition;
        }

        public int hashCode() {
            return Objects.hash(this.playPosition, this.bufferPosition);
        }

        public void setBufferPosition(@NonNull Long l11) {
            if (l11 == null) {
                throw new IllegalStateException("Nonnull field \"bufferPosition\" is null.");
            }
            this.bufferPosition = l11;
        }

        public void setPlayPosition(@NonNull Long l11) {
            if (l11 == null) {
                throw new IllegalStateException("Nonnull field \"playPosition\" is null.");
            }
            this.playPosition = l11;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.playPosition);
            arrayList.add(this.bufferPosition);
            return arrayList;
        }
    }

    public static final class TexturePlayerIds {

        @NonNull
        private Long playerId;

        @NonNull
        private Long textureId;

        public static final class Builder {

            @Nullable
            private Long playerId;

            @Nullable
            private Long textureId;

            @NonNull
            public TexturePlayerIds build() {
                TexturePlayerIds texturePlayerIds = new TexturePlayerIds();
                texturePlayerIds.setPlayerId(this.playerId);
                texturePlayerIds.setTextureId(this.textureId);
                return texturePlayerIds;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setPlayerId(@NonNull Long l11) {
                this.playerId = l11;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setTextureId(@NonNull Long l11) {
                this.textureId = l11;
                return this;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && TexturePlayerIds.class == obj.getClass()) {
                TexturePlayerIds texturePlayerIds = (TexturePlayerIds) obj;
                if (this.playerId.equals(texturePlayerIds.playerId) && this.textureId.equals(texturePlayerIds.textureId)) {
                    return true;
                }
            }
            return false;
        }

        @NonNull
        public static TexturePlayerIds fromList(@NonNull ArrayList<Object> arrayList) {
            TexturePlayerIds texturePlayerIds = new TexturePlayerIds();
            texturePlayerIds.setPlayerId((Long) arrayList.get(0));
            texturePlayerIds.setTextureId((Long) arrayList.get(1));
            return texturePlayerIds;
        }

        @NonNull
        public Long getPlayerId() {
            return this.playerId;
        }

        @NonNull
        public Long getTextureId() {
            return this.textureId;
        }

        public int hashCode() {
            return Objects.hash(this.playerId, this.textureId);
        }

        public void setPlayerId(@NonNull Long l11) {
            if (l11 == null) {
                throw new IllegalStateException("Nonnull field \"playerId\" is null.");
            }
            this.playerId = l11;
        }

        public void setTextureId(@NonNull Long l11) {
            if (l11 == null) {
                throw new IllegalStateException("Nonnull field \"textureId\" is null.");
            }
            this.textureId = l11;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.playerId);
            arrayList.add(this.textureId);
            return arrayList;
        }
    }

    public interface VideoPlayerInstanceApi {
        static void setUp(@NonNull BinaryMessenger binaryMessenger, @Nullable VideoPlayerInstanceApi videoPlayerInstanceApi) {
            setUp(binaryMessenger, "", videoPlayerInstanceApi);
        }

        @NonNull
        PlaybackState getPlaybackState();

        void pause();

        void play();

        void seekTo(@NonNull Long l11);

        void setLooping(@NonNull Boolean bool);

        void setPlaybackSpeed(@NonNull Double d11);

        void setVolume(@NonNull Double d11);

        /* JADX INFO: renamed from: a */
        static /* synthetic */ void m87624a(VideoPlayerInstanceApi videoPlayerInstanceApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                videoPlayerInstanceApi.setVolume((Double) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Messages.wrapError(th2);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: b */
        static /* synthetic */ void m87625b(VideoPlayerInstanceApi videoPlayerInstanceApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                videoPlayerInstanceApi.setPlaybackSpeed((Double) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Messages.wrapError(th2);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: c */
        static /* synthetic */ void m87626c(VideoPlayerInstanceApi videoPlayerInstanceApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                videoPlayerInstanceApi.pause();
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Messages.wrapError(th2);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: d */
        static /* synthetic */ void m87627d(VideoPlayerInstanceApi videoPlayerInstanceApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                videoPlayerInstanceApi.seekTo((Long) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Messages.wrapError(th2);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: e */
        static /* synthetic */ void m87628e(VideoPlayerInstanceApi videoPlayerInstanceApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                videoPlayerInstanceApi.setLooping((Boolean) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Messages.wrapError(th2);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: f */
        static /* synthetic */ void m87629f(VideoPlayerInstanceApi videoPlayerInstanceApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                videoPlayerInstanceApi.play();
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Messages.wrapError(th2);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: g */
        static /* synthetic */ void m87630g(VideoPlayerInstanceApi videoPlayerInstanceApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, videoPlayerInstanceApi.getPlaybackState());
            } catch (Throwable th2) {
                arrayList = Messages.wrapError(th2);
            }
            reply.reply(arrayList);
        }

        @NonNull
        static MessageCodec<Object> getCodec() {
            return PigeonCodec.INSTANCE;
        }

        static void setUp(@NonNull BinaryMessenger binaryMessenger, @NonNull String str, @Nullable final VideoPlayerInstanceApi videoPlayerInstanceApi) {
            String str2;
            if (str.isEmpty()) {
                str2 = "";
            } else {
                str2 = C33978va.f72339h + str;
            }
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.setLooping" + str2, getCodec());
            if (videoPlayerInstanceApi != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.videoplayer.g
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.VideoPlayerInstanceApi.m87628e(this.f86852a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.setVolume" + str2, getCodec());
            if (videoPlayerInstanceApi != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.videoplayer.h
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.VideoPlayerInstanceApi.m87624a(this.f86853a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.setPlaybackSpeed" + str2, getCodec());
            if (videoPlayerInstanceApi != null) {
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.videoplayer.i
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.VideoPlayerInstanceApi.m87625b(this.f86854a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.play" + str2, getCodec());
            if (videoPlayerInstanceApi != null) {
                basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.videoplayer.j
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.VideoPlayerInstanceApi.m87629f(this.f86855a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.pause" + str2, getCodec());
            if (videoPlayerInstanceApi != null) {
                basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.videoplayer.k
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.VideoPlayerInstanceApi.m87626c(this.f86856a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.seekTo" + str2, getCodec());
            if (videoPlayerInstanceApi != null) {
                basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.videoplayer.l
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.VideoPlayerInstanceApi.m87627d(this.f86857a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.getPlaybackState" + str2, getCodec());
            if (videoPlayerInstanceApi != null) {
                basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.videoplayer.m
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.VideoPlayerInstanceApi.m87630g(this.f86858a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel7.setMessageHandler(null);
            }
        }
    }

    public static class FlutterError extends RuntimeException {
        public final String code;
        public final Object details;

        public FlutterError(@NonNull String str, @Nullable String str2, @Nullable Object obj) {
            super(str2);
            this.code = str;
            this.details = obj;
        }
    }

    public enum PlatformVideoFormat {
        DASH(0),
        HLS(1),
        SS(2);

        final int index;

        PlatformVideoFormat(int i11) {
            this.index = i11;
        }
    }

    @NonNull
    public static ArrayList<Object> wrapError(@NonNull Throwable th2) {
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th2 instanceof FlutterError) {
            FlutterError flutterError = (FlutterError) th2;
            arrayList.add(flutterError.code);
            arrayList.add(flutterError.getMessage());
            arrayList.add(flutterError.details);
            return arrayList;
        }
        arrayList.add(th2.toString());
        arrayList.add(th2.getClass().getSimpleName());
        arrayList.add("Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
        return arrayList;
    }
}
