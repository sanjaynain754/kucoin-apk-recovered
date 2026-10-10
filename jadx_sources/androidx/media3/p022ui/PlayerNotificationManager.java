package androidx.media3.p022ui;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.media.session.MediaSession;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationBuilderWithBuilderAccessor;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.media3.common.C2711C;
import androidx.media3.common.Player;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.NotificationUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public class PlayerNotificationManager {
    private static final String ACTION_DISMISS = "androidx.media3.ui.notification.dismiss";
    public static final String ACTION_FAST_FORWARD = "androidx.media3.ui.notification.ffwd";
    public static final String ACTION_NEXT = "androidx.media3.ui.notification.next";
    public static final String ACTION_PAUSE = "androidx.media3.ui.notification.pause";
    public static final String ACTION_PLAY = "androidx.media3.ui.notification.play";
    public static final String ACTION_PREVIOUS = "androidx.media3.ui.notification.prev";
    public static final String ACTION_REWIND = "androidx.media3.ui.notification.rewind";
    public static final String ACTION_STOP = "androidx.media3.ui.notification.stop";
    public static final String EXTRA_INSTANCE_ID = "INSTANCE_ID";
    private static final int MSG_START_OR_UPDATE_NOTIFICATION = 1;
    private static final int MSG_UPDATE_NOTIFICATION_BITMAP = 2;
    private static int instanceIdCounter;
    private int badgeIconType;

    @Nullable
    private NotificationCompat.Builder builder;

    @Nullable
    private List<NotificationCompat.Action> builderActions;
    private final String channelId;
    private int color;
    private boolean colorized;
    private final Context context;
    private int currentNotificationTag;

    @Nullable
    private final CustomActionReceiver customActionReceiver;
    private final Map<String, NotificationCompat.Action> customActions;
    private int defaults;
    private final PendingIntent dismissPendingIntent;

    @Nullable
    private String groupKey;
    private final int instanceId;
    private final IntentFilter intentFilter;
    private boolean isNotificationStarted;
    private final Handler mainHandler;
    private final MediaDescriptionAdapter mediaDescriptionAdapter;

    @Nullable
    private MediaSession.Token mediaSessionToken;
    private final NotificationBroadcastReceiver notificationBroadcastReceiver;
    private final int notificationId;

    @Nullable
    private final NotificationListener notificationListener;
    private final NotificationManagerCompat notificationManager;
    private final Map<String, NotificationCompat.Action> playbackActions;

    @Nullable
    private Player player;
    private final Player.Listener playerListener;
    private int priority;
    private boolean showPlayButtonIfSuppressed;

    @DrawableRes
    private int smallIconResourceId;
    private boolean useChronometer;
    private boolean useFastForwardAction;
    private boolean useFastForwardActionInCompactView;
    private boolean useNextAction;
    private boolean useNextActionInCompactView;
    private boolean usePlayPauseActions;
    private boolean usePreviousAction;
    private boolean usePreviousActionInCompactView;
    private boolean useRewindAction;
    private boolean useRewindActionInCompactView;
    private boolean useStopAction;
    private int visibility;

    public final class BitmapCallback {
        private final int notificationTag;

        private BitmapCallback(int i11) {
            this.notificationTag = i11;
        }

        public void onBitmap(Bitmap bitmap) {
            if (bitmap != null) {
                PlayerNotificationManager.this.postUpdateNotificationBitmap(bitmap, this.notificationTag);
            }
        }
    }

    public static class Builder {
        protected int channelDescriptionResourceId;
        protected final String channelId;
        protected int channelImportance;
        protected int channelNameResourceId;
        protected final Context context;

        @Nullable
        protected CustomActionReceiver customActionReceiver;
        protected int fastForwardActionIconResourceId;

        @Nullable
        protected String groupKey;
        protected MediaDescriptionAdapter mediaDescriptionAdapter;
        protected int nextActionIconResourceId;
        protected final int notificationId;

        @Nullable
        protected NotificationListener notificationListener;
        protected int pauseActionIconResourceId;
        protected int playActionIconResourceId;
        protected int previousActionIconResourceId;
        protected int rewindActionIconResourceId;
        protected int smallIconResourceId;
        protected int stopActionIconResourceId;

        @Deprecated
        public Builder(Context context, int i11, String str, MediaDescriptionAdapter mediaDescriptionAdapter) {
            this(context, i11, str);
            this.mediaDescriptionAdapter = mediaDescriptionAdapter;
        }

        public PlayerNotificationManager build() {
            int i11 = this.channelNameResourceId;
            if (i11 != 0) {
                NotificationUtil.createNotificationChannel(this.context, this.channelId, i11, this.channelDescriptionResourceId, this.channelImportance);
            }
            return new PlayerNotificationManager(this.context, this.channelId, this.notificationId, this.mediaDescriptionAdapter, this.notificationListener, this.customActionReceiver, this.smallIconResourceId, this.playActionIconResourceId, this.pauseActionIconResourceId, this.stopActionIconResourceId, this.rewindActionIconResourceId, this.fastForwardActionIconResourceId, this.previousActionIconResourceId, this.nextActionIconResourceId, this.groupKey);
        }

        public Builder setChannelDescriptionResourceId(int i11) {
            this.channelDescriptionResourceId = i11;
            return this;
        }

        public Builder setChannelImportance(int i11) {
            this.channelImportance = i11;
            return this;
        }

        public Builder setChannelNameResourceId(int i11) {
            this.channelNameResourceId = i11;
            return this;
        }

        public Builder setCustomActionReceiver(CustomActionReceiver customActionReceiver) {
            this.customActionReceiver = customActionReceiver;
            return this;
        }

        public Builder setFastForwardActionIconResourceId(int i11) {
            this.fastForwardActionIconResourceId = i11;
            return this;
        }

        public Builder setGroup(String str) {
            this.groupKey = str;
            return this;
        }

        public Builder setMediaDescriptionAdapter(MediaDescriptionAdapter mediaDescriptionAdapter) {
            this.mediaDescriptionAdapter = mediaDescriptionAdapter;
            return this;
        }

        public Builder setNextActionIconResourceId(int i11) {
            this.nextActionIconResourceId = i11;
            return this;
        }

        public Builder setNotificationListener(NotificationListener notificationListener) {
            this.notificationListener = notificationListener;
            return this;
        }

        public Builder setPauseActionIconResourceId(int i11) {
            this.pauseActionIconResourceId = i11;
            return this;
        }

        public Builder setPlayActionIconResourceId(int i11) {
            this.playActionIconResourceId = i11;
            return this;
        }

        public Builder setPreviousActionIconResourceId(int i11) {
            this.previousActionIconResourceId = i11;
            return this;
        }

        public Builder setRewindActionIconResourceId(int i11) {
            this.rewindActionIconResourceId = i11;
            return this;
        }

        public Builder setSmallIconResourceId(int i11) {
            this.smallIconResourceId = i11;
            return this;
        }

        public Builder setStopActionIconResourceId(int i11) {
            this.stopActionIconResourceId = i11;
            return this;
        }

        public Builder(Context context, @IntRange(from = 1) int i11, String str) {
            Assertions.checkArgument(i11 > 0);
            this.context = context;
            this.notificationId = i11;
            this.channelId = str;
            this.channelImportance = 2;
            this.mediaDescriptionAdapter = new DefaultMediaDescriptionAdapter(null);
            this.smallIconResourceId = C3627R.drawable.exo_notification_small_icon;
            this.playActionIconResourceId = C3627R.drawable.exo_notification_play;
            this.pauseActionIconResourceId = C3627R.drawable.exo_notification_pause;
            this.stopActionIconResourceId = C3627R.drawable.exo_notification_stop;
            this.rewindActionIconResourceId = C3627R.drawable.exo_notification_rewind;
            this.fastForwardActionIconResourceId = C3627R.drawable.exo_notification_fastforward;
            this.previousActionIconResourceId = C3627R.drawable.exo_notification_previous;
            this.nextActionIconResourceId = C3627R.drawable.exo_notification_next;
        }
    }

    public interface CustomActionReceiver {
        Map<String, NotificationCompat.Action> createCustomActions(Context context, int i11);

        List<String> getCustomActions(Player player);

        void onCustomAction(Player player, String str, Intent intent);
    }

    public interface MediaDescriptionAdapter {
        @Nullable
        PendingIntent createCurrentContentIntent(Player player);

        @Nullable
        CharSequence getCurrentContentText(Player player);

        CharSequence getCurrentContentTitle(Player player);

        @Nullable
        Bitmap getCurrentLargeIcon(Player player, BitmapCallback bitmapCallback);

        @Nullable
        default CharSequence getCurrentSubText(Player player) {
            return null;
        }
    }

    public static final class MediaStyle extends NotificationCompat.Style {
        private final int[] actionsToShowInCompact;

        @Nullable
        private final MediaSession.Token token;

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Notification.MediaStyle mediaStyle = new Notification.MediaStyle();
            mediaStyle.setShowActionsInCompactView(this.actionsToShowInCompact);
            MediaSession.Token token = this.token;
            if (token != null) {
                mediaStyle.setMediaSession(token);
            }
            notificationBuilderWithBuilderAccessor.getBuilder().setStyle(mediaStyle);
        }

        public MediaStyle(@Nullable MediaSession.Token token, int[] iArr) {
            this.token = token;
            this.actionsToShowInCompact = iArr;
        }
    }

    public class NotificationBroadcastReceiver extends BroadcastReceiver {
        private NotificationBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Player player = PlayerNotificationManager.this.player;
            if (player != null && PlayerNotificationManager.this.isNotificationStarted && intent.getIntExtra(PlayerNotificationManager.EXTRA_INSTANCE_ID, PlayerNotificationManager.this.instanceId) == PlayerNotificationManager.this.instanceId) {
                String action = intent.getAction();
                if (PlayerNotificationManager.ACTION_PLAY.equals(action)) {
                    Util.handlePlayButtonAction(player);
                    return;
                }
                if (PlayerNotificationManager.ACTION_PAUSE.equals(action)) {
                    Util.handlePauseButtonAction(player);
                    return;
                }
                if (PlayerNotificationManager.ACTION_PREVIOUS.equals(action)) {
                    if (player.isCommandAvailable(7)) {
                        player.seekToPrevious();
                        return;
                    }
                    return;
                }
                if (PlayerNotificationManager.ACTION_REWIND.equals(action)) {
                    if (player.isCommandAvailable(11)) {
                        player.seekBack();
                        return;
                    }
                    return;
                }
                if (PlayerNotificationManager.ACTION_FAST_FORWARD.equals(action)) {
                    if (player.isCommandAvailable(12)) {
                        player.seekForward();
                        return;
                    }
                    return;
                }
                if (PlayerNotificationManager.ACTION_NEXT.equals(action)) {
                    if (player.isCommandAvailable(9)) {
                        player.seekToNext();
                        return;
                    }
                    return;
                }
                if (PlayerNotificationManager.ACTION_STOP.equals(action)) {
                    if (player.isCommandAvailable(3)) {
                        player.stop();
                    }
                    if (player.isCommandAvailable(20)) {
                        player.clearMediaItems();
                        return;
                    }
                    return;
                }
                if (PlayerNotificationManager.ACTION_DISMISS.equals(action)) {
                    PlayerNotificationManager.this.stopNotification(true);
                } else {
                    if (action == null || PlayerNotificationManager.this.customActionReceiver == null || !PlayerNotificationManager.this.customActions.containsKey(action)) {
                        return;
                    }
                    PlayerNotificationManager.this.customActionReceiver.onCustomAction(player, action, intent);
                }
            }
        }
    }

    public class PlayerListener implements Player.Listener {
        private PlayerListener() {
        }

        @Override // androidx.media3.common.Player.Listener
        public void onEvents(Player player, Player.Events events) {
            if (events.containsAny(4, 5, 7, 0, 12, 11, 8, 9, 14)) {
                PlayerNotificationManager.this.postStartOrUpdateNotification();
            }
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Priority {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Visibility {
    }

    public PlayerNotificationManager(Context context, String str, int i11, MediaDescriptionAdapter mediaDescriptionAdapter, @Nullable NotificationListener notificationListener, @Nullable CustomActionReceiver customActionReceiver, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, @Nullable String str2) {
        Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        this.channelId = str;
        this.notificationId = i11;
        this.mediaDescriptionAdapter = mediaDescriptionAdapter;
        this.notificationListener = notificationListener;
        this.customActionReceiver = customActionReceiver;
        this.smallIconResourceId = i12;
        this.groupKey = str2;
        int i21 = instanceIdCounter;
        instanceIdCounter = i21 + 1;
        this.instanceId = i21;
        this.mainHandler = Util.createHandler(Looper.getMainLooper(), new Handler.Callback() { // from class: androidx.media3.ui.b0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f3548b.handleMessage(message);
            }
        });
        this.notificationManager = NotificationManagerCompat.from(applicationContext);
        this.playerListener = new PlayerListener();
        this.notificationBroadcastReceiver = new NotificationBroadcastReceiver();
        this.intentFilter = new IntentFilter();
        this.usePreviousAction = true;
        this.useNextAction = true;
        this.usePlayPauseActions = true;
        this.showPlayButtonIfSuppressed = true;
        this.useRewindAction = true;
        this.useFastForwardAction = true;
        this.colorized = true;
        this.useChronometer = true;
        this.color = 0;
        this.defaults = 0;
        this.priority = -1;
        this.badgeIconType = 1;
        this.visibility = 1;
        Map<String, NotificationCompat.Action> mapCreatePlaybackActions = createPlaybackActions(applicationContext, i21, i13, i14, i15, i16, i17, i18, i19);
        this.playbackActions = mapCreatePlaybackActions;
        Iterator<String> it = mapCreatePlaybackActions.keySet().iterator();
        while (it.hasNext()) {
            this.intentFilter.addAction(it.next());
        }
        Map<String, NotificationCompat.Action> mapCreateCustomActions = customActionReceiver != null ? customActionReceiver.createCustomActions(applicationContext, this.instanceId) : Collections.EMPTY_MAP;
        this.customActions = mapCreateCustomActions;
        Iterator<String> it2 = mapCreateCustomActions.keySet().iterator();
        while (it2.hasNext()) {
            this.intentFilter.addAction(it2.next());
        }
        this.dismissPendingIntent = createBroadcastIntent(ACTION_DISMISS, applicationContext, this.instanceId);
        this.intentFilter.addAction(ACTION_DISMISS);
    }

    public List<String> getActions(Player player) {
        boolean zIsCommandAvailable = player.isCommandAvailable(7);
        boolean zIsCommandAvailable2 = player.isCommandAvailable(11);
        boolean zIsCommandAvailable3 = player.isCommandAvailable(12);
        boolean zIsCommandAvailable4 = player.isCommandAvailable(9);
        ArrayList arrayList = new ArrayList();
        if (this.usePreviousAction && zIsCommandAvailable) {
            arrayList.add(ACTION_PREVIOUS);
        }
        if (this.useRewindAction && zIsCommandAvailable2) {
            arrayList.add(ACTION_REWIND);
        }
        if (this.usePlayPauseActions) {
            if (Util.shouldShowPlayButton(player, this.showPlayButtonIfSuppressed)) {
                arrayList.add(ACTION_PLAY);
            } else {
                arrayList.add(ACTION_PAUSE);
            }
        }
        if (this.useFastForwardAction && zIsCommandAvailable3) {
            arrayList.add(ACTION_FAST_FORWARD);
        }
        if (this.useNextAction && zIsCommandAvailable4) {
            arrayList.add(ACTION_NEXT);
        }
        CustomActionReceiver customActionReceiver = this.customActionReceiver;
        if (customActionReceiver != null) {
            arrayList.addAll(customActionReceiver.getCustomActions(player));
        }
        if (this.useStopAction) {
            arrayList.add(ACTION_STOP);
        }
        return arrayList;
    }

    @Deprecated
    public final void setMediaSessionToken(MediaSessionCompat.Token token) {
        setMediaSessionToken((MediaSession.Token) token.getToken());
    }

    private static PendingIntent createBroadcastIntent(String str, Context context, int i11) {
        Intent intent = new Intent(str).setPackage(context.getPackageName());
        intent.putExtra(EXTRA_INSTANCE_ID, i11);
        return PendingIntent.getBroadcast(context, i11, intent, Util.SDK_INT >= 23 ? 201326592 : C2711C.BUFFER_FLAG_FIRST_SAMPLE);
    }

    private static Map<String, NotificationCompat.Action> createPlaybackActions(Context context, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        HashMap map = new HashMap();
        map.put(ACTION_PLAY, new NotificationCompat.Action(i12, context.getString(C3627R.string.exo_controls_play_description), createBroadcastIntent(ACTION_PLAY, context, i11)));
        map.put(ACTION_PAUSE, new NotificationCompat.Action(i13, context.getString(C3627R.string.exo_controls_pause_description), createBroadcastIntent(ACTION_PAUSE, context, i11)));
        map.put(ACTION_STOP, new NotificationCompat.Action(i14, context.getString(C3627R.string.exo_controls_stop_description), createBroadcastIntent(ACTION_STOP, context, i11)));
        map.put(ACTION_REWIND, new NotificationCompat.Action(i15, context.getString(C3627R.string.exo_controls_rewind_description), createBroadcastIntent(ACTION_REWIND, context, i11)));
        map.put(ACTION_FAST_FORWARD, new NotificationCompat.Action(i16, context.getString(C3627R.string.exo_controls_fastforward_description), createBroadcastIntent(ACTION_FAST_FORWARD, context, i11)));
        map.put(ACTION_PREVIOUS, new NotificationCompat.Action(i17, context.getString(C3627R.string.exo_controls_previous_description), createBroadcastIntent(ACTION_PREVIOUS, context, i11)));
        map.put(ACTION_NEXT, new NotificationCompat.Action(i18, context.getString(C3627R.string.exo_controls_next_description), createBroadcastIntent(ACTION_NEXT, context, i11)));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleMessage(Message message) {
        int i11 = message.what;
        if (i11 == 1) {
            Player player = this.player;
            if (player != null) {
                startOrUpdateNotification(player, null);
            }
        } else {
            if (i11 != 2) {
                return false;
            }
            Player player2 = this.player;
            if (player2 != null && this.isNotificationStarted && this.currentNotificationTag == message.arg1) {
                startOrUpdateNotification(player2, (Bitmap) message.obj);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postStartOrUpdateNotification() {
        if (this.mainHandler.hasMessages(1)) {
            return;
        }
        this.mainHandler.sendEmptyMessage(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postUpdateNotificationBitmap(Bitmap bitmap, int i11) {
        this.mainHandler.obtainMessage(2, i11, -1, bitmap).sendToTarget();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopNotification(boolean z11) {
        if (this.isNotificationStarted) {
            this.isNotificationStarted = false;
            this.mainHandler.removeMessages(1);
            this.notificationManager.cancel(this.notificationId);
            this.context.unregisterReceiver(this.notificationBroadcastReceiver);
            NotificationListener notificationListener = this.notificationListener;
            if (notificationListener != null) {
                notificationListener.onNotificationCancelled(this.notificationId, z11);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    public int[] getActionIndicesForCompactView(List<String> list, Player player) {
        int iIndexOf;
        int iIndexOf2;
        int i11;
        int iIndexOf3 = list.indexOf(ACTION_PAUSE);
        int iIndexOf4 = list.indexOf(ACTION_PLAY);
        if (this.usePreviousActionInCompactView) {
            iIndexOf = list.indexOf(ACTION_PREVIOUS);
        } else {
            iIndexOf = this.useRewindActionInCompactView ? list.indexOf(ACTION_REWIND) : -1;
        }
        if (this.useNextActionInCompactView) {
            iIndexOf2 = list.indexOf(ACTION_NEXT);
        } else {
            iIndexOf2 = this.useFastForwardActionInCompactView ? list.indexOf(ACTION_FAST_FORWARD) : -1;
        }
        int[] iArr = new int[3];
        int i12 = 0;
        if (iIndexOf != -1) {
            iArr[0] = iIndexOf;
            i12 = 1;
        }
        boolean zShouldShowPlayButton = Util.shouldShowPlayButton(player, this.showPlayButtonIfSuppressed);
        if (iIndexOf3 == -1 || zShouldShowPlayButton) {
            if (iIndexOf4 != -1 && zShouldShowPlayButton) {
                i11 = i12 + 1;
                iArr[i12] = iIndexOf4;
            }
            if (iIndexOf2 != -1) {
                iArr[i12] = iIndexOf2;
                i12++;
            }
            return Arrays.copyOf(iArr, i12);
        }
        i11 = i12 + 1;
        iArr[i12] = iIndexOf3;
        i12 = i11;
        if (iIndexOf2 != -1) {
            iArr[i12] = iIndexOf2;
            i12++;
        }
        return Arrays.copyOf(iArr, i12);
    }

    public final void invalidate() {
        if (this.isNotificationStarted) {
            postStartOrUpdateNotification();
        }
    }

    public final void setBadgeIconType(int i11) {
        if (this.badgeIconType == i11) {
            return;
        }
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException();
        }
        this.badgeIconType = i11;
        invalidate();
    }

    public final void setColor(int i11) {
        if (this.color != i11) {
            this.color = i11;
            invalidate();
        }
    }

    public final void setColorized(boolean z11) {
        if (this.colorized != z11) {
            this.colorized = z11;
            invalidate();
        }
    }

    public final void setDefaults(int i11) {
        if (this.defaults != i11) {
            this.defaults = i11;
            invalidate();
        }
    }

    public final void setMediaSessionToken(MediaSession.Token token) {
        if (Util.areEqual(this.mediaSessionToken, token)) {
            return;
        }
        this.mediaSessionToken = token;
        invalidate();
    }

    public final void setPriority(int i11) {
        if (this.priority == i11) {
            return;
        }
        if (i11 != -2 && i11 != -1 && i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException();
        }
        this.priority = i11;
        invalidate();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z11) {
        if (this.showPlayButtonIfSuppressed != z11) {
            this.showPlayButtonIfSuppressed = z11;
            invalidate();
        }
    }

    public final void setSmallIcon(@DrawableRes int i11) {
        if (this.smallIconResourceId != i11) {
            this.smallIconResourceId = i11;
            invalidate();
        }
    }

    public final void setUseChronometer(boolean z11) {
        if (this.useChronometer != z11) {
            this.useChronometer = z11;
            invalidate();
        }
    }

    public final void setUseFastForwardAction(boolean z11) {
        if (this.useFastForwardAction != z11) {
            this.useFastForwardAction = z11;
            invalidate();
        }
    }

    public final void setUseFastForwardActionInCompactView(boolean z11) {
        if (this.useFastForwardActionInCompactView != z11) {
            this.useFastForwardActionInCompactView = z11;
            if (z11) {
                this.useNextActionInCompactView = false;
            }
            invalidate();
        }
    }

    public final void setUseNextAction(boolean z11) {
        if (this.useNextAction != z11) {
            this.useNextAction = z11;
            invalidate();
        }
    }

    public final void setUseNextActionInCompactView(boolean z11) {
        if (this.useNextActionInCompactView != z11) {
            this.useNextActionInCompactView = z11;
            if (z11) {
                this.useFastForwardActionInCompactView = false;
            }
            invalidate();
        }
    }

    public final void setUsePlayPauseActions(boolean z11) {
        if (this.usePlayPauseActions != z11) {
            this.usePlayPauseActions = z11;
            invalidate();
        }
    }

    public final void setUsePreviousAction(boolean z11) {
        if (this.usePreviousAction != z11) {
            this.usePreviousAction = z11;
            invalidate();
        }
    }

    public final void setUsePreviousActionInCompactView(boolean z11) {
        if (this.usePreviousActionInCompactView != z11) {
            this.usePreviousActionInCompactView = z11;
            if (z11) {
                this.useRewindActionInCompactView = false;
            }
            invalidate();
        }
    }

    public final void setUseRewindAction(boolean z11) {
        if (this.useRewindAction != z11) {
            this.useRewindAction = z11;
            invalidate();
        }
    }

    public final void setUseRewindActionInCompactView(boolean z11) {
        if (this.useRewindActionInCompactView != z11) {
            this.useRewindActionInCompactView = z11;
            if (z11) {
                this.usePreviousActionInCompactView = false;
            }
            invalidate();
        }
    }

    public final void setUseStopAction(boolean z11) {
        if (this.useStopAction == z11) {
            return;
        }
        this.useStopAction = z11;
        invalidate();
    }

    public final void setVisibility(int i11) {
        if (this.visibility == i11) {
            return;
        }
        if (i11 != -1 && i11 != 0 && i11 != 1) {
            throw new IllegalStateException();
        }
        this.visibility = i11;
        invalidate();
    }

    private static void setLargeIcon(NotificationCompat.Builder builder, @Nullable Bitmap bitmap) {
        builder.setLargeIcon(bitmap);
    }

    @SuppressLint({"MissingPermission"})
    private void startOrUpdateNotification(Player player, @Nullable Bitmap bitmap) {
        boolean ongoing = getOngoing(player);
        NotificationCompat.Builder builderCreateNotification = createNotification(player, this.builder, ongoing, bitmap);
        this.builder = builderCreateNotification;
        boolean z11 = false;
        if (builderCreateNotification == null) {
            stopNotification(false);
            return;
        }
        Notification notificationBuild = builderCreateNotification.build();
        this.notificationManager.notify(this.notificationId, notificationBuild);
        if (!this.isNotificationStarted) {
            Util.registerReceiverNotExported(this.context, this.notificationBroadcastReceiver, this.intentFilter);
        }
        NotificationListener notificationListener = this.notificationListener;
        if (notificationListener != null) {
            int i11 = this.notificationId;
            if (ongoing || !this.isNotificationStarted) {
                z11 = true;
            }
            notificationListener.onNotificationPosted(i11, notificationBuild, z11);
        }
        this.isNotificationStarted = true;
    }

    @Nullable
    public NotificationCompat.Builder createNotification(Player player, @Nullable NotificationCompat.Builder builder, boolean z11, @Nullable Bitmap bitmap) {
        NotificationCompat.Action action;
        if (player.getPlaybackState() == 1 && player.isCommandAvailable(17) && player.getCurrentTimeline().isEmpty()) {
            this.builderActions = null;
            return null;
        }
        List<String> actions = getActions(player);
        ArrayList arrayList = new ArrayList(actions.size());
        for (int i11 = 0; i11 < actions.size(); i11++) {
            String str = actions.get(i11);
            if (this.playbackActions.containsKey(str)) {
                action = this.playbackActions.get(str);
            } else {
                action = this.customActions.get(str);
            }
            if (action != null) {
                arrayList.add(action);
            }
        }
        if (builder == null || !arrayList.equals(this.builderActions)) {
            builder = new NotificationCompat.Builder(this.context, this.channelId);
            this.builderActions = arrayList;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                builder.addAction((NotificationCompat.Action) arrayList.get(i12));
            }
        }
        builder.setStyle(new MediaStyle(this.mediaSessionToken, getActionIndicesForCompactView(actions, player)));
        builder.setDeleteIntent(this.dismissPendingIntent);
        builder.setBadgeIconType(this.badgeIconType).setOngoing(z11).setColor(this.color).setColorized(this.colorized).setSmallIcon(this.smallIconResourceId).setVisibility(this.visibility).setPriority(this.priority).setDefaults(this.defaults);
        if (this.useChronometer && player.isCommandAvailable(16) && player.isPlaying() && !player.isPlayingAd() && !player.isCurrentMediaItemDynamic() && player.getPlaybackParameters().speed == 1.0f) {
            builder.setWhen(System.currentTimeMillis() - player.getContentPosition()).setShowWhen(true).setUsesChronometer(true);
        } else {
            builder.setShowWhen(false).setUsesChronometer(false);
        }
        builder.setContentTitle(this.mediaDescriptionAdapter.getCurrentContentTitle(player));
        builder.setContentText(this.mediaDescriptionAdapter.getCurrentContentText(player));
        builder.setSubText(this.mediaDescriptionAdapter.getCurrentSubText(player));
        if (bitmap == null) {
            MediaDescriptionAdapter mediaDescriptionAdapter = this.mediaDescriptionAdapter;
            int i13 = this.currentNotificationTag + 1;
            this.currentNotificationTag = i13;
            bitmap = mediaDescriptionAdapter.getCurrentLargeIcon(player, new BitmapCallback(i13));
        }
        setLargeIcon(builder, bitmap);
        builder.setContentIntent(this.mediaDescriptionAdapter.createCurrentContentIntent(player));
        String str2 = this.groupKey;
        if (str2 != null) {
            builder.setGroup(str2);
        }
        builder.setOnlyAlertOnce(true);
        return builder;
    }

    public boolean getOngoing(Player player) {
        int playbackState = player.getPlaybackState();
        if ((playbackState == 2 || playbackState == 3) && player.getPlayWhenReady()) {
            return true;
        }
        return false;
    }

    public final void setPlayer(@Nullable Player player) {
        boolean z11;
        boolean z12 = true;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z11 = true;
        } else {
            z11 = false;
        }
        Assertions.checkState(z11);
        if (player != null && player.getApplicationLooper() != Looper.getMainLooper()) {
            z12 = false;
        }
        Assertions.checkArgument(z12);
        Player player2 = this.player;
        if (player2 != player) {
            if (player2 != null) {
                player2.removeListener(this.playerListener);
                if (player == null) {
                    stopNotification(false);
                }
            }
            this.player = player;
            if (player != null) {
                player.addListener(this.playerListener);
                postStartOrUpdateNotification();
            }
        }
    }

    public interface NotificationListener {
        default void onNotificationCancelled(int i11, boolean z11) {
        }

        default void onNotificationPosted(int i11, Notification notification, boolean z11) {
        }
    }
}
