package androidx.media.app;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationBuilderWithBuilderAccessor;
import androidx.media.C2696R;

/* JADX INFO: loaded from: classes34.dex */
public class NotificationCompat {

    @RequiresApi(21)
    public static class Api21Impl {
        @DoNotInline
        public static Notification.MediaStyle createMediaStyle() {
            return new Notification.MediaStyle();
        }

        @DoNotInline
        public static Notification.MediaStyle fillInMediaStyle(Notification.MediaStyle mediaStyle, int[] iArr, MediaSessionCompat.Token token) {
            if (iArr != null) {
                setShowActionsInCompactView(mediaStyle, iArr);
            }
            if (token != null) {
                setMediaSession(mediaStyle, (MediaSession.Token) token.getToken());
            }
            return mediaStyle;
        }

        private Api21Impl() {
        }

        @DoNotInline
        public static void setMediaSession(Notification.MediaStyle mediaStyle, MediaSession.Token token) {
            mediaStyle.setMediaSession(token);
        }

        @DoNotInline
        public static void setMediaStyle(Notification.Builder builder, Notification.MediaStyle mediaStyle) {
            builder.setStyle(mediaStyle);
        }

        @DoNotInline
        public static void setShowActionsInCompactView(Notification.MediaStyle mediaStyle, int... iArr) {
            mediaStyle.setShowActionsInCompactView(iArr);
        }
    }

    @RequiresApi(24)
    public static class Api24Impl {
        @DoNotInline
        public static Notification.MediaStyle createDecoratedMediaCustomViewStyle() {
            return new Notification.DecoratedMediaCustomViewStyle();
        }

        private Api24Impl() {
        }
    }

    public static class DecoratedMediaCustomViewStyle extends MediaStyle {
        @Override // androidx.media.app.NotificationCompat.MediaStyle
        public int getBigContentViewLayoutResource(int i11) {
            return i11 <= 3 ? C2696R.layout.notification_template_big_media_narrow_custom : C2696R.layout.notification_template_big_media_custom;
        }

        @Override // androidx.media.app.NotificationCompat.MediaStyle, androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @Override // androidx.media.app.NotificationCompat.MediaStyle, androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public RemoteViews makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        private void setBackgroundColor(RemoteViews remoteViews) {
            remoteViews.setInt(C2696R.id.status_bar_latest_event_content, "setBackgroundColor", this.mBuilder.getColor() != 0 ? this.mBuilder.getColor() : this.mBuilder.mContext.getResources().getColor(C2696R.color.notification_material_background_media_default_color));
        }

        @Override // androidx.media.app.NotificationCompat.MediaStyle, androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            if (Build.VERSION.SDK_INT >= 34) {
                Api21Impl.setMediaStyle(notificationBuilderWithBuilderAccessor.getBuilder(), Api21Impl.fillInMediaStyle(Api34Impl.setRemotePlaybackInfo(Api24Impl.createDecoratedMediaCustomViewStyle(), this.mDeviceName, this.mDeviceIcon, this.mDeviceIntent, Boolean.valueOf(this.mShowRemotePlaybackInfo)), this.mActionsToShowInCompact, this.mToken));
            } else {
                Api21Impl.setMediaStyle(notificationBuilderWithBuilderAccessor.getBuilder(), Api21Impl.fillInMediaStyle(Api24Impl.createDecoratedMediaCustomViewStyle(), this.mActionsToShowInCompact, this.mToken));
            }
        }

        @Override // androidx.media.app.NotificationCompat.MediaStyle
        public int getContentViewLayoutResource() {
            return this.mBuilder.getContentView() != null ? C2696R.layout.notification_template_media_custom : super.getContentViewLayoutResource();
        }
    }

    public static class MediaStyle extends androidx.core.app.NotificationCompat.Style {
        private static final int MAX_MEDIA_BUTTONS = 5;
        private static final int MAX_MEDIA_BUTTONS_IN_COMPACT = 3;
        PendingIntent mCancelButtonIntent;
        int mDeviceIcon;
        PendingIntent mDeviceIntent;
        CharSequence mDeviceName;
        boolean mShowCancelButton;
        MediaSessionCompat.Token mToken;
        int[] mActionsToShowInCompact = null;
        boolean mShowRemotePlaybackInfo = false;

        public MediaStyle() {
        }

        public int getBigContentViewLayoutResource(int i11) {
            return i11 <= 3 ? C2696R.layout.notification_template_big_media_narrow : C2696R.layout.notification_template_big_media;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            if (Build.VERSION.SDK_INT >= 34) {
                Api21Impl.setMediaStyle(notificationBuilderWithBuilderAccessor.getBuilder(), Api21Impl.fillInMediaStyle(Api34Impl.setRemotePlaybackInfo(Api21Impl.createMediaStyle(), this.mDeviceName, this.mDeviceIcon, this.mDeviceIntent, Boolean.valueOf(this.mShowRemotePlaybackInfo)), this.mActionsToShowInCompact, this.mToken));
            } else {
                Api21Impl.setMediaStyle(notificationBuilderWithBuilderAccessor.getBuilder(), Api21Impl.fillInMediaStyle(Api21Impl.createMediaStyle(), this.mActionsToShowInCompact, this.mToken));
            }
        }

        public RemoteViews generateBigContentView() {
            int iMin = Math.min(this.mBuilder.mActions.size(), 5);
            RemoteViews remoteViewsApplyStandardTemplate = applyStandardTemplate(false, getBigContentViewLayoutResource(iMin), false);
            remoteViewsApplyStandardTemplate.removeAllViews(C2696R.id.media_actions);
            if (iMin > 0) {
                for (int i11 = 0; i11 < iMin; i11++) {
                    remoteViewsApplyStandardTemplate.addView(C2696R.id.media_actions, generateMediaActionButton(this.mBuilder.mActions.get(i11)));
                }
            }
            if (!this.mShowCancelButton) {
                remoteViewsApplyStandardTemplate.setViewVisibility(C2696R.id.cancel_action, 8);
                return remoteViewsApplyStandardTemplate;
            }
            int i12 = C2696R.id.cancel_action;
            remoteViewsApplyStandardTemplate.setViewVisibility(i12, 0);
            remoteViewsApplyStandardTemplate.setInt(i12, "setAlpha", this.mBuilder.mContext.getResources().getInteger(C2696R.integer.cancel_button_image_alpha));
            remoteViewsApplyStandardTemplate.setOnClickPendingIntent(i12, this.mCancelButtonIntent);
            return remoteViewsApplyStandardTemplate;
        }

        public int getContentViewLayoutResource() {
            return C2696R.layout.notification_template_media;
        }

        public MediaStyle setCancelButtonIntent(PendingIntent pendingIntent) {
            this.mCancelButtonIntent = pendingIntent;
            return this;
        }

        public MediaStyle setMediaSession(MediaSessionCompat.Token token) {
            this.mToken = token;
            return this;
        }

        @NonNull
        @RequiresPermission("android.permission.MEDIA_CONTENT_CONTROL")
        public MediaStyle setRemotePlaybackInfo(@NonNull CharSequence charSequence, @DrawableRes int i11, @Nullable PendingIntent pendingIntent) {
            this.mDeviceName = charSequence;
            this.mDeviceIcon = i11;
            this.mDeviceIntent = pendingIntent;
            this.mShowRemotePlaybackInfo = true;
            return this;
        }

        public MediaStyle setShowActionsInCompactView(int... iArr) {
            this.mActionsToShowInCompact = iArr;
            return this;
        }

        private RemoteViews generateMediaActionButton(androidx.core.app.NotificationCompat.Action action) {
            boolean z11;
            if (action.getActionIntent() == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            RemoteViews remoteViews = new RemoteViews(this.mBuilder.mContext.getPackageName(), C2696R.layout.notification_media_action);
            int i11 = C2696R.id.action0;
            remoteViews.setImageViewResource(i11, action.getIcon());
            if (!z11) {
                remoteViews.setOnClickPendingIntent(i11, action.getActionIntent());
            }
            Api15Impl.setContentDescription(remoteViews, i11, action.getTitle());
            return remoteViews;
        }

        public static MediaSessionCompat.Token getMediaSession(Notification notification) {
            Parcelable parcelable;
            Bundle extras = androidx.core.app.NotificationCompat.getExtras(notification);
            if (extras != null && (parcelable = extras.getParcelable(androidx.core.app.NotificationCompat.EXTRA_MEDIA_SESSION)) != null) {
                return MediaSessionCompat.Token.fromToken(parcelable);
            }
            return null;
        }

        public RemoteViews generateContentView() {
            int iMin;
            RemoteViews remoteViewsApplyStandardTemplate = applyStandardTemplate(false, getContentViewLayoutResource(), true);
            int size = this.mBuilder.mActions.size();
            int[] iArr = this.mActionsToShowInCompact;
            if (iArr == null) {
                iMin = 0;
            } else {
                iMin = Math.min(iArr.length, 3);
            }
            remoteViewsApplyStandardTemplate.removeAllViews(C2696R.id.media_actions);
            if (iMin > 0) {
                for (int i11 = 0; i11 < iMin; i11++) {
                    if (i11 < size) {
                        remoteViewsApplyStandardTemplate.addView(C2696R.id.media_actions, generateMediaActionButton(this.mBuilder.mActions.get(this.mActionsToShowInCompact[i11])));
                    } else {
                        throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", Integer.valueOf(i11), Integer.valueOf(size - 1)));
                    }
                }
            }
            if (this.mShowCancelButton) {
                remoteViewsApplyStandardTemplate.setViewVisibility(C2696R.id.end_padder, 8);
                int i12 = C2696R.id.cancel_action;
                remoteViewsApplyStandardTemplate.setViewVisibility(i12, 0);
                remoteViewsApplyStandardTemplate.setOnClickPendingIntent(i12, this.mCancelButtonIntent);
                remoteViewsApplyStandardTemplate.setInt(i12, "setAlpha", this.mBuilder.mContext.getResources().getInteger(C2696R.integer.cancel_button_image_alpha));
                return remoteViewsApplyStandardTemplate;
            }
            remoteViewsApplyStandardTemplate.setViewVisibility(C2696R.id.end_padder, 0);
            remoteViewsApplyStandardTemplate.setViewVisibility(C2696R.id.cancel_action, 8);
            return remoteViewsApplyStandardTemplate;
        }

        public MediaStyle(androidx.core.app.NotificationCompat.Builder builder) {
            setBuilder(builder);
        }

        public MediaStyle setShowCancelButton(boolean z11) {
            return this;
        }
    }

    @RequiresApi(15)
    public static class Api15Impl {
        private Api15Impl() {
        }

        @DoNotInline
        public static void setContentDescription(RemoteViews remoteViews, int i11, CharSequence charSequence) {
            remoteViews.setContentDescription(i11, charSequence);
        }
    }

    @RequiresApi(34)
    public static class Api34Impl {
        private Api34Impl() {
        }

        @DoNotInline
        @SuppressLint({"MissingPermission"})
        public static Notification.MediaStyle setRemotePlaybackInfo(Notification.MediaStyle mediaStyle, @NonNull CharSequence charSequence, @DrawableRes int i11, @Nullable PendingIntent pendingIntent, Boolean bool) {
            if (bool.booleanValue()) {
                mediaStyle.setRemotePlaybackInfo(charSequence, i11, pendingIntent);
            }
            return mediaStyle;
        }
    }

    private NotificationCompat() {
    }
}
