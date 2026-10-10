package androidx.media3.exoplayer.rtsp;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.common.base.Joiner;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import com.tencent.bugly.proguard.C33627eb;
import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.SocketFactory;

/* JADX INFO: loaded from: classes34.dex */
final class RtspClient implements Closeable {
    private static final int DEFAULT_RTSP_KEEP_ALIVE_INTERVAL_DIVISOR = 2;
    public static final int RTSP_STATE_INIT = 0;
    public static final int RTSP_STATE_PLAYING = 2;
    public static final int RTSP_STATE_READY = 1;
    public static final int RTSP_STATE_UNINITIALIZED = -1;
    private static final String TAG = "RtspClient";
    private final boolean debugLoggingEnabled;
    private boolean hasPendingPauseRequest;
    private boolean hasUpdatedTimelineAndTracks;

    @Nullable
    private KeepAliveMonitor keepAliveMonitor;
    private final PlaybackEventListener playbackEventListener;
    private boolean receivedAuthorizationRequest;

    @Nullable
    private RtspMessageUtil.RtspAuthUserInfo rtspAuthUserInfo;

    @Nullable
    private RtspAuthenticationInfo rtspAuthenticationInfo;

    @Nullable
    private String sessionId;
    private final SessionInfoListener sessionInfoListener;
    private final SocketFactory socketFactory;
    private Uri uri;
    private final String userAgent;
    private final ArrayDeque<RtspMediaPeriod.RtpLoadInfo> pendingSetupRtpLoadInfos = new ArrayDeque<>();
    private final SparseArray<RtspRequest> pendingRequests = new SparseArray<>();
    private final MessageSender messageSender = new MessageSender();
    private RtspMessageChannel messageChannel = new RtspMessageChannel(new MessageListener());
    private long sessionTimeoutMs = 60000;
    private long pendingSeekPositionUs = C2711C.TIME_UNSET;
    private int rtspState = -1;

    public final class KeepAliveMonitor implements Runnable, Closeable {
        private final long intervalMs;
        private boolean isStarted;
        private final Handler keepAliveHandler = Util.createHandlerForCurrentLooper();

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.isStarted = false;
            this.keepAliveHandler.removeCallbacks(this);
        }

        public KeepAliveMonitor(long j11) {
            this.intervalMs = j11;
        }

        @Override // java.lang.Runnable
        public void run() {
            RtspClient.this.messageSender.sendOptionsRequest(RtspClient.this.uri, RtspClient.this.sessionId);
            this.keepAliveHandler.postDelayed(this, this.intervalMs);
        }

        public void start() {
            if (this.isStarted) {
                return;
            }
            this.isStarted = true;
            this.keepAliveHandler.postDelayed(this, this.intervalMs);
        }
    }

    public final class MessageListener implements RtspMessageChannel.MessageListener {
        private final Handler messageHandler = Util.createHandlerForCurrentLooper();

        public MessageListener() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void handleRtspMessage(List<String> list) {
            RtspClient.this.maybeLogMessage(list);
            if (RtspMessageUtil.isRtspResponse(list)) {
                handleRtspResponse(list);
            } else {
                handleRtspRequest(list);
            }
        }

        private void handleRtspRequest(List<String> list) {
            RtspClient.this.messageSender.sendMethodNotAllowedResponse(Integer.parseInt((String) Assertions.checkNotNull(RtspMessageUtil.parseRequest(list).headers.get(RtspHeaders.CSEQ))));
        }

        private void onDescribeResponseReceived(RtspDescribeResponse rtspDescribeResponse) {
            RtspSessionTiming timing = RtspSessionTiming.DEFAULT;
            String str = rtspDescribeResponse.sessionDescription.attributes.get(SessionDescription.ATTR_RANGE);
            if (str != null) {
                try {
                    timing = RtspSessionTiming.parseTiming(str);
                } catch (ParserException e11) {
                    RtspClient.this.sessionInfoListener.onSessionTimelineRequestFailed("SDP format error.", e11);
                    return;
                }
            }
            ImmutableList<RtspMediaTrack> immutableListBuildTrackList = RtspClient.buildTrackList(rtspDescribeResponse, RtspClient.this.uri);
            if (immutableListBuildTrackList.isEmpty()) {
                RtspClient.this.sessionInfoListener.onSessionTimelineRequestFailed("No playable track.", null);
            } else {
                RtspClient.this.sessionInfoListener.onSessionTimelineUpdated(timing, immutableListBuildTrackList);
                RtspClient.this.hasUpdatedTimelineAndTracks = true;
            }
        }

        private void onOptionsResponseReceived(RtspOptionsResponse rtspOptionsResponse) {
            if (RtspClient.this.keepAliveMonitor != null) {
                return;
            }
            if (RtspClient.serverSupportsDescribe(rtspOptionsResponse.supportedMethods)) {
                RtspClient.this.messageSender.sendDescribeRequest(RtspClient.this.uri, RtspClient.this.sessionId);
            } else {
                RtspClient.this.sessionInfoListener.onSessionTimelineRequestFailed("DESCRIBE not supported.", null);
            }
        }

        private void onPauseResponseReceived() {
            Assertions.checkState(RtspClient.this.rtspState == 2);
            RtspClient.this.rtspState = 1;
            RtspClient.this.hasPendingPauseRequest = false;
            if (RtspClient.this.pendingSeekPositionUs != C2711C.TIME_UNSET) {
                RtspClient rtspClient = RtspClient.this;
                rtspClient.startPlayback(Util.usToMs(rtspClient.pendingSeekPositionUs));
            }
        }

        private void onPlayResponseReceived(RtspPlayResponse rtspPlayResponse) {
            boolean z11 = true;
            if (RtspClient.this.rtspState != 1 && RtspClient.this.rtspState != 2) {
                z11 = false;
            }
            Assertions.checkState(z11);
            RtspClient.this.rtspState = 2;
            if (RtspClient.this.keepAliveMonitor == null) {
                RtspClient rtspClient = RtspClient.this;
                rtspClient.keepAliveMonitor = rtspClient.new KeepAliveMonitor(rtspClient.sessionTimeoutMs / 2);
                RtspClient.this.keepAliveMonitor.start();
            }
            RtspClient.this.pendingSeekPositionUs = C2711C.TIME_UNSET;
            RtspClient.this.playbackEventListener.onPlaybackStarted(Util.msToUs(rtspPlayResponse.sessionTiming.startTimeMs), rtspPlayResponse.trackTimingList);
        }

        private void onSetupResponseReceived(RtspSetupResponse rtspSetupResponse) {
            Assertions.checkState(RtspClient.this.rtspState != -1);
            RtspClient.this.rtspState = 1;
            RtspClient.this.sessionId = rtspSetupResponse.sessionHeader.sessionId;
            RtspClient.this.sessionTimeoutMs = rtspSetupResponse.sessionHeader.timeoutMs;
            RtspClient.this.continueSetupRtspTrack();
        }

        @Override // androidx.media3.exoplayer.rtsp.RtspMessageChannel.MessageListener
        public void onRtspMessageReceived(final List<String> list) {
            this.messageHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.rtsp.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3307b.handleRtspMessage(list);
                }
            });
        }

        private void handleRtspResponse(List<String> list) {
            RtspSessionTiming timing;
            ImmutableList<RtspTrackTiming> immutableListM13439of;
            Throwable rtspPlaybackException;
            RtspResponse response = RtspMessageUtil.parseResponse(list);
            int i11 = Integer.parseInt((String) Assertions.checkNotNull(response.headers.get(RtspHeaders.CSEQ)));
            RtspRequest rtspRequest = (RtspRequest) RtspClient.this.pendingRequests.get(i11);
            if (rtspRequest != null) {
                RtspClient.this.pendingRequests.remove(i11);
                int i12 = rtspRequest.method;
                try {
                    try {
                        int i13 = response.status;
                        if (i13 != 200) {
                            if (i13 != 401) {
                                if (i13 != 461) {
                                    if (i13 != 301 && i13 != 302) {
                                        RtspClient.this.dispatchRtspError(new RtspMediaSource.RtspPlaybackException(RtspMessageUtil.toMethodString(i12) + C33627eb.f69716f + response.status));
                                        return;
                                    }
                                    if (RtspClient.this.rtspState != -1) {
                                        RtspClient.this.rtspState = 0;
                                    }
                                    String str = response.headers.get("Location");
                                    if (str == null) {
                                        RtspClient.this.sessionInfoListener.onSessionTimelineRequestFailed("Redirection without new location.", null);
                                        return;
                                    }
                                    Uri uri = Uri.parse(str);
                                    RtspClient.this.uri = RtspMessageUtil.removeUserInfo(uri);
                                    RtspClient.this.rtspAuthUserInfo = RtspMessageUtil.parseUserInfo(uri);
                                    RtspClient.this.messageSender.sendDescribeRequest(RtspClient.this.uri, RtspClient.this.sessionId);
                                    return;
                                }
                                String str2 = RtspMessageUtil.toMethodString(i12) + C33627eb.f69716f + response.status;
                                String str3 = (String) Assertions.checkNotNull(rtspRequest.headers.get(RtspHeaders.TRANSPORT));
                                RtspClient rtspClient = RtspClient.this;
                                if (i12 == 10 && !str3.contains("TCP")) {
                                    rtspPlaybackException = new RtspMediaSource.RtspUdpUnsupportedTransportException(str2);
                                } else {
                                    rtspPlaybackException = new RtspMediaSource.RtspPlaybackException(str2);
                                }
                                rtspClient.dispatchRtspError(rtspPlaybackException);
                                return;
                            }
                            if (RtspClient.this.rtspAuthUserInfo != null && !RtspClient.this.receivedAuthorizationRequest) {
                                ImmutableList<String> immutableListValues = response.headers.values("WWW-Authenticate");
                                if (!immutableListValues.isEmpty()) {
                                    for (int i14 = 0; i14 < immutableListValues.size(); i14++) {
                                        RtspClient.this.rtspAuthenticationInfo = RtspMessageUtil.parseWwwAuthenticateHeader(immutableListValues.get(i14));
                                        if (RtspClient.this.rtspAuthenticationInfo.authenticationMechanism == 2) {
                                            break;
                                        }
                                    }
                                    RtspClient.this.messageSender.retryLastRequest();
                                    RtspClient.this.receivedAuthorizationRequest = true;
                                    return;
                                }
                                throw ParserException.createForMalformedManifest("Missing WWW-Authenticate header in a 401 response.", null);
                            }
                            RtspClient.this.dispatchRtspError(new RtspMediaSource.RtspPlaybackException(RtspMessageUtil.toMethodString(i12) + C33627eb.f69716f + response.status));
                            return;
                        }
                        switch (i12) {
                            case 1:
                            case 3:
                            case 7:
                            case 8:
                            case 9:
                            case 11:
                            case 12:
                                return;
                            case 2:
                                onDescribeResponseReceived(new RtspDescribeResponse(response.headers, i13, SessionDescriptionParser.parse(response.messageBody)));
                                return;
                            case 4:
                                onOptionsResponseReceived(new RtspOptionsResponse(i13, RtspMessageUtil.parsePublicHeader(response.headers.get("Public"))));
                                return;
                            case 5:
                                onPauseResponseReceived();
                                return;
                            case 6:
                                String str4 = response.headers.get("Range");
                                if (str4 == null) {
                                    timing = RtspSessionTiming.DEFAULT;
                                } else {
                                    timing = RtspSessionTiming.parseTiming(str4);
                                }
                                try {
                                    String str5 = response.headers.get(RtspHeaders.RTP_INFO);
                                    if (str5 == null) {
                                        immutableListM13439of = ImmutableList.m13439of();
                                    } else {
                                        immutableListM13439of = RtspTrackTiming.parseTrackTiming(str5, RtspClient.this.uri);
                                    }
                                } catch (ParserException unused) {
                                    immutableListM13439of = ImmutableList.m13439of();
                                }
                                onPlayResponseReceived(new RtspPlayResponse(response.status, timing, immutableListM13439of));
                                return;
                            case 10:
                                String str6 = response.headers.get(RtspHeaders.SESSION);
                                String str7 = response.headers.get(RtspHeaders.TRANSPORT);
                                if (str6 != null && str7 != null) {
                                    onSetupResponseReceived(new RtspSetupResponse(response.status, RtspMessageUtil.parseSessionHeader(str6), str7));
                                    return;
                                }
                                throw ParserException.createForMalformedManifest("Missing mandatory session or transport header", null);
                            default:
                                throw new IllegalStateException();
                        }
                    } catch (IllegalArgumentException e11) {
                        e = e11;
                        RtspClient.this.dispatchRtspError(new RtspMediaSource.RtspPlaybackException(e));
                    }
                } catch (ParserException e12) {
                    e = e12;
                    RtspClient.this.dispatchRtspError(new RtspMediaSource.RtspPlaybackException(e));
                }
            }
        }
    }

    public final class MessageSender {
        private int cSeq;
        private RtspRequest lastRequest;

        private MessageSender() {
        }

        public void sendOptionsRequest(Uri uri, @Nullable String str) {
            sendRequest(getRequestWithCommonHeaders(4, str, ImmutableMap.m13458of(), uri));
        }

        private RtspRequest getRequestWithCommonHeaders(int i11, @Nullable String str, Map<String, String> map, Uri uri) {
            String str2 = RtspClient.this.userAgent;
            int i12 = this.cSeq;
            this.cSeq = i12 + 1;
            RtspHeaders.Builder builder = new RtspHeaders.Builder(str2, str, i12);
            if (RtspClient.this.rtspAuthenticationInfo != null) {
                Assertions.checkStateNotNull(RtspClient.this.rtspAuthUserInfo);
                try {
                    builder.add("Authorization", RtspClient.this.rtspAuthenticationInfo.getAuthorizationHeaderValue(RtspClient.this.rtspAuthUserInfo, uri, i11));
                } catch (ParserException e11) {
                    RtspClient.this.dispatchRtspError(new RtspMediaSource.RtspPlaybackException(e11));
                }
            }
            builder.addAll(map);
            return new RtspRequest(uri, i11, builder.build(), "");
        }

        private void sendRequest(RtspRequest rtspRequest) {
            int i11 = Integer.parseInt((String) Assertions.checkNotNull(rtspRequest.headers.get(RtspHeaders.CSEQ)));
            Assertions.checkState(RtspClient.this.pendingRequests.get(i11) == null);
            RtspClient.this.pendingRequests.append(i11, rtspRequest);
            ImmutableList<String> immutableListSerializeRequest = RtspMessageUtil.serializeRequest(rtspRequest);
            RtspClient.this.maybeLogMessage(immutableListSerializeRequest);
            RtspClient.this.messageChannel.send(immutableListSerializeRequest);
            this.lastRequest = rtspRequest;
        }

        public void retryLastRequest() {
            Assertions.checkStateNotNull(this.lastRequest);
            ImmutableListMultimap<String, String> immutableListMultimapAsMultiMap = this.lastRequest.headers.asMultiMap();
            HashMap map = new HashMap();
            for (String str : immutableListMultimapAsMultiMap.keySet()) {
                if (!str.equals(RtspHeaders.CSEQ) && !str.equals("User-Agent") && !str.equals(RtspHeaders.SESSION) && !str.equals("Authorization")) {
                    map.put(str, (String) Iterables.getLast(immutableListMultimapAsMultiMap.get(str)));
                }
            }
            sendRequest(getRequestWithCommonHeaders(this.lastRequest.method, RtspClient.this.sessionId, map, this.lastRequest.uri));
        }

        public void sendDescribeRequest(Uri uri, @Nullable String str) {
            sendRequest(getRequestWithCommonHeaders(2, str, ImmutableMap.m13459of("Accept", MimeTypes.APPLICATION_SDP), uri));
        }

        public void sendMethodNotAllowedResponse(int i11) {
            sendResponse(new RtspResponse(405, new RtspHeaders.Builder(RtspClient.this.userAgent, RtspClient.this.sessionId, i11).build()));
            this.cSeq = Math.max(this.cSeq, i11 + 1);
        }

        public void sendPauseRequest(Uri uri, String str) {
            Assertions.checkState(RtspClient.this.rtspState == 2);
            sendRequest(getRequestWithCommonHeaders(5, str, ImmutableMap.m13458of(), uri));
            RtspClient.this.hasPendingPauseRequest = true;
        }

        public void sendPlayRequest(Uri uri, long j11, String str) {
            boolean z11 = true;
            if (RtspClient.this.rtspState != 1 && RtspClient.this.rtspState != 2) {
                z11 = false;
            }
            Assertions.checkState(z11);
            sendRequest(getRequestWithCommonHeaders(6, str, ImmutableMap.m13459of("Range", RtspSessionTiming.getOffsetStartTimeTiming(j11)), uri));
        }

        public void sendSetupRequest(Uri uri, String str, @Nullable String str2) {
            RtspClient.this.rtspState = 0;
            sendRequest(getRequestWithCommonHeaders(10, str2, ImmutableMap.m13459of(RtspHeaders.TRANSPORT, str), uri));
        }

        public void sendTeardownRequest(Uri uri, String str) {
            if (RtspClient.this.rtspState == -1 || RtspClient.this.rtspState == 0) {
                return;
            }
            RtspClient.this.rtspState = 0;
            sendRequest(getRequestWithCommonHeaders(12, str, ImmutableMap.m13458of(), uri));
        }

        private void sendResponse(RtspResponse rtspResponse) {
            ImmutableList<String> immutableListSerializeResponse = RtspMessageUtil.serializeResponse(rtspResponse);
            RtspClient.this.maybeLogMessage(immutableListSerializeResponse);
            RtspClient.this.messageChannel.send(immutableListSerializeResponse);
        }
    }

    public interface PlaybackEventListener {
        void onPlaybackError(RtspMediaSource.RtspPlaybackException rtspPlaybackException);

        void onPlaybackStarted(long j11, ImmutableList<RtspTrackTiming> immutableList);

        void onRtspSetupCompleted();
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface RtspState {
    }

    public interface SessionInfoListener {
        void onSessionTimelineRequestFailed(String str, @Nullable Throwable th2);

        void onSessionTimelineUpdated(RtspSessionTiming rtspSessionTiming, ImmutableList<RtspMediaTrack> immutableList);
    }

    public void signalPlaybackEnded() {
        this.rtspState = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ImmutableList<RtspMediaTrack> buildTrackList(RtspDescribeResponse rtspDescribeResponse, Uri uri) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (int i11 = 0; i11 < rtspDescribeResponse.sessionDescription.mediaDescriptionList.size(); i11++) {
            MediaDescription mediaDescription = rtspDescribeResponse.sessionDescription.mediaDescriptionList.get(i11);
            if (RtpPayloadFormat.isFormatSupported(mediaDescription)) {
                builder.add(new RtspMediaTrack(rtspDescribeResponse.headers, mediaDescription, uri));
            }
        }
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void continueSetupRtspTrack() {
        RtspMediaPeriod.RtpLoadInfo rtpLoadInfoPollFirst = this.pendingSetupRtpLoadInfos.pollFirst();
        if (rtpLoadInfoPollFirst == null) {
            this.playbackEventListener.onRtspSetupCompleted();
        } else {
            this.messageSender.sendSetupRequest(rtpLoadInfoPollFirst.getTrackUri(), rtpLoadInfoPollFirst.getTransport(), this.sessionId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchRtspError(Throwable th2) {
        RtspMediaSource.RtspPlaybackException rtspPlaybackException = th2 instanceof RtspMediaSource.RtspPlaybackException ? (RtspMediaSource.RtspPlaybackException) th2 : new RtspMediaSource.RtspPlaybackException(th2);
        if (this.hasUpdatedTimelineAndTracks) {
            this.playbackEventListener.onPlaybackError(rtspPlaybackException);
        } else {
            this.sessionInfoListener.onSessionTimelineRequestFailed(Strings.nullToEmpty(th2.getMessage()), th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeLogMessage(List<String> list) {
        if (this.debugLoggingEnabled) {
            Log.m2955d(TAG, Joiner.m13373on(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE).join(list));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        KeepAliveMonitor keepAliveMonitor = this.keepAliveMonitor;
        if (keepAliveMonitor != null) {
            keepAliveMonitor.close();
            this.keepAliveMonitor = null;
            this.messageSender.sendTeardownRequest(this.uri, (String) Assertions.checkNotNull(this.sessionId));
        }
        this.messageChannel.close();
    }

    public int getState() {
        return this.rtspState;
    }

    public void registerInterleavedDataChannel(int i11, RtspMessageChannel.InterleavedBinaryDataListener interleavedBinaryDataListener) {
        this.messageChannel.registerInterleavedBinaryDataListener(i11, interleavedBinaryDataListener);
    }

    public void seekToUs(long j11) {
        if (this.rtspState == 2 && !this.hasPendingPauseRequest) {
            this.messageSender.sendPauseRequest(this.uri, (String) Assertions.checkNotNull(this.sessionId));
        }
        this.pendingSeekPositionUs = j11;
    }

    public void setupSelectedTracks(List<RtspMediaPeriod.RtpLoadInfo> list) {
        this.pendingSetupRtpLoadInfos.addAll(list);
        continueSetupRtspTrack();
    }

    public void start() throws IOException {
        try {
            this.messageChannel.open(getSocket(this.uri));
            this.messageSender.sendOptionsRequest(this.uri, this.sessionId);
        } catch (IOException e11) {
            Util.closeQuietly(this.messageChannel);
            throw e11;
        }
    }

    public void startPlayback(long j11) {
        this.messageSender.sendPlayRequest(this.uri, j11, (String) Assertions.checkNotNull(this.sessionId));
    }

    public RtspClient(SessionInfoListener sessionInfoListener, PlaybackEventListener playbackEventListener, String str, Uri uri, SocketFactory socketFactory, boolean z11) {
        this.sessionInfoListener = sessionInfoListener;
        this.playbackEventListener = playbackEventListener;
        this.userAgent = str;
        this.socketFactory = socketFactory;
        this.debugLoggingEnabled = z11;
        this.uri = RtspMessageUtil.removeUserInfo(uri);
        this.rtspAuthUserInfo = RtspMessageUtil.parseUserInfo(uri);
    }

    private Socket getSocket(Uri uri) throws IOException {
        boolean z11;
        int port;
        if (uri.getHost() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        Assertions.checkArgument(z11);
        if (uri.getPort() > 0) {
            port = uri.getPort();
        } else {
            port = RtspMessageChannel.DEFAULT_RTSP_PORT;
        }
        return this.socketFactory.createSocket((String) Assertions.checkNotNull(uri.getHost()), port);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean serverSupportsDescribe(List<Integer> list) {
        if (!list.isEmpty() && !list.contains(2)) {
            return false;
        }
        return true;
    }

    public void retryWithRtpTcp() {
        try {
            close();
            RtspMessageChannel rtspMessageChannel = new RtspMessageChannel(new MessageListener());
            this.messageChannel = rtspMessageChannel;
            rtspMessageChannel.open(getSocket(this.uri));
            this.sessionId = null;
            this.receivedAuthorizationRequest = false;
            this.rtspAuthenticationInfo = null;
        } catch (IOException e11) {
            this.playbackEventListener.onPlaybackError(new RtspMediaSource.RtspPlaybackException(e11));
        }
    }
}
