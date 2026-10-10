package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.ArraySet;
import androidx.core.content.LocusIdCompat;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
class NotificationCompatBuilder implements NotificationBuilderWithBuilderAccessor {
    private RemoteViews mBigContentView;
    private final Notification.Builder mBuilder;
    private final NotificationCompat.Builder mBuilderCompat;
    private RemoteViews mContentView;
    private final Context mContext;
    private int mGroupAlertBehavior;
    private RemoteViews mHeadsUpContentView;
    private final List<Bundle> mActionExtrasList = new ArrayList();
    private final Bundle mExtras = new Bundle();

    @RequiresApi(20)
    public static class Api20Impl {
        public static Notification.Action.Builder createBuilder(int i11, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i11, charSequence, pendingIntent);
        }

        private Api20Impl() {
        }

        public static Notification.Builder addAction(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        public static Notification.Action.Builder addExtras(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        public static Notification.Action.Builder addRemoteInput(Notification.Action.Builder builder, android.app.RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        public static Notification.Action build(Notification.Action.Builder builder) {
            return builder.build();
        }

        public static String getGroup(Notification notification) {
            return notification.getGroup();
        }

        public static Notification.Builder setGroup(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        public static Notification.Builder setGroupSummary(Notification.Builder builder, boolean z11) {
            return builder.setGroupSummary(z11);
        }

        public static Notification.Builder setLocalOnly(Notification.Builder builder, boolean z11) {
            return builder.setLocalOnly(z11);
        }

        public static Notification.Builder setSortKey(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    @RequiresApi(21)
    public static class Api21Impl {
        public static Notification.Builder setSound(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        private Api21Impl() {
        }

        public static Notification.Builder addPerson(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        public static Notification.Builder setCategory(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        public static Notification.Builder setColor(Notification.Builder builder, int i11) {
            return builder.setColor(i11);
        }

        public static Notification.Builder setPublicVersion(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        public static Notification.Builder setVisibility(Notification.Builder builder, int i11) {
            return builder.setVisibility(i11);
        }
    }

    @RequiresApi(23)
    public static class Api23Impl {
        public static Notification.Action.Builder createBuilder(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        public static Notification.Builder setSmallIcon(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }

        private Api23Impl() {
        }

        public static Notification.Builder setLargeIcon(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }
    }

    @RequiresApi(26)
    public static class Api26Impl {
        public static Notification.Builder createBuilder(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        private Api26Impl() {
        }

        public static Notification.Builder setBadgeIconType(Notification.Builder builder, int i11) {
            return builder.setBadgeIconType(i11);
        }

        public static Notification.Builder setColorized(Notification.Builder builder, boolean z11) {
            return builder.setColorized(z11);
        }

        public static Notification.Builder setGroupAlertBehavior(Notification.Builder builder, int i11) {
            return builder.setGroupAlertBehavior(i11);
        }

        public static Notification.Builder setSettingsText(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        public static Notification.Builder setShortcutId(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        public static Notification.Builder setTimeoutAfter(Notification.Builder builder, long j11) {
            return builder.setTimeoutAfter(j11);
        }
    }

    @RequiresApi(29)
    public static class Api29Impl {
        public static Notification.Builder setLocusId(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }

        private Api29Impl() {
        }

        public static Notification.Builder setAllowSystemGeneratedContextualActions(Notification.Builder builder, boolean z11) {
            return builder.setAllowSystemGeneratedContextualActions(z11);
        }

        public static Notification.Builder setBubbleMetadata(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        public static Notification.Action.Builder setContextual(Notification.Action.Builder builder, boolean z11) {
            return builder.setContextual(z11);
        }
    }

    private void removeSoundAndVibration(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    @RequiresApi(24)
    public static class Api24Impl {
        private Api24Impl() {
        }

        public static Notification.Action.Builder setAllowGeneratedReplies(Notification.Action.Builder builder, boolean z11) {
            return builder.setAllowGeneratedReplies(z11);
        }

        public static Notification.Builder setCustomBigContentView(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        public static Notification.Builder setCustomContentView(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        public static Notification.Builder setCustomHeadsUpContentView(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        public static Notification.Builder setRemoteInputHistory(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    @RequiresApi(28)
    public static class Api28Impl {
        private Api28Impl() {
        }

        public static Notification.Builder addPerson(Notification.Builder builder, android.app.Person person) {
            return builder.addPerson(person);
        }

        public static Notification.Action.Builder setSemanticAction(Notification.Action.Builder builder, int i11) {
            return builder.setSemanticAction(i11);
        }
    }

    @RequiresApi(31)
    public static class Api31Impl {
        private Api31Impl() {
        }

        public static Notification.Action.Builder setAuthenticationRequired(Notification.Action.Builder builder, boolean z11) {
            return builder.setAuthenticationRequired(z11);
        }

        public static Notification.Builder setForegroundServiceBehavior(Notification.Builder builder, int i11) {
            return builder.setForegroundServiceBehavior(i11);
        }
    }

    @Nullable
    private static List<String> combineLists(@Nullable List<String> list, @Nullable List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        ArraySet arraySet = new ArraySet(list.size() + list2.size());
        arraySet.addAll(list);
        arraySet.addAll(list2);
        return new ArrayList(arraySet);
    }

    @Nullable
    private static List<String> getPeople(@Nullable List<Person> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<Person> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().resolveToLegacyUri());
        }
        return arrayList;
    }

    public Notification build() {
        Bundle extras;
        RemoteViews remoteViewsMakeHeadsUpContentView;
        RemoteViews remoteViewsMakeBigContentView;
        NotificationCompat.Style style = this.mBuilderCompat.mStyle;
        if (style != null) {
            style.apply(this);
        }
        RemoteViews remoteViewsMakeContentView = style != null ? style.makeContentView(this) : null;
        Notification notificationBuildInternal = buildInternal();
        if (remoteViewsMakeContentView != null) {
            notificationBuildInternal.contentView = remoteViewsMakeContentView;
        } else {
            RemoteViews remoteViews = this.mBuilderCompat.mContentView;
            if (remoteViews != null) {
                notificationBuildInternal.contentView = remoteViews;
            }
        }
        if (style != null && (remoteViewsMakeBigContentView = style.makeBigContentView(this)) != null) {
            notificationBuildInternal.bigContentView = remoteViewsMakeBigContentView;
        }
        if (style != null && (remoteViewsMakeHeadsUpContentView = this.mBuilderCompat.mStyle.makeHeadsUpContentView(this)) != null) {
            notificationBuildInternal.headsUpContentView = remoteViewsMakeHeadsUpContentView;
        }
        if (style != null && (extras = NotificationCompat.getExtras(notificationBuildInternal)) != null) {
            style.addCompatExtras(extras);
        }
        return notificationBuildInternal;
    }

    public Notification buildInternal() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.mBuilder.build();
        }
        Notification notificationBuild = this.mBuilder.build();
        if (this.mGroupAlertBehavior != 0) {
            if (Api20Impl.getGroup(notificationBuild) != null && (notificationBuild.flags & 512) != 0 && this.mGroupAlertBehavior == 2) {
                removeSoundAndVibration(notificationBuild);
            }
            if (Api20Impl.getGroup(notificationBuild) != null && (notificationBuild.flags & 512) == 0 && this.mGroupAlertBehavior == 1) {
                removeSoundAndVibration(notificationBuild);
            }
        }
        return notificationBuild;
    }

    @Override // androidx.core.app.NotificationBuilderWithBuilderAccessor
    public Notification.Builder getBuilder() {
        return this.mBuilder;
    }

    public Context getContext() {
        return this.mContext;
    }

    public NotificationCompatBuilder(NotificationCompat.Builder builder) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        Icon icon;
        List listCombineLists;
        int i11;
        this.mBuilderCompat = builder;
        Context context = builder.mContext;
        this.mContext = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.mBuilder = Api26Impl.createBuilder(context, builder.mChannelId);
        } else {
            this.mBuilder = new Notification.Builder(builder.mContext);
        }
        Notification notification = builder.mNotification;
        Notification.Builder lights = this.mBuilder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, builder.mTickerView).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        if ((notification.flags & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z11);
        if ((notification.flags & 8) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z12);
        if ((notification.flags & 16) != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        Notification.Builder deleteIntent = onlyAlertOnce.setAutoCancel(z13).setDefaults(notification.defaults).setContentTitle(builder.mContentTitle).setContentText(builder.mContentText).setContentInfo(builder.mContentInfo).setContentIntent(builder.mContentIntent).setDeleteIntent(notification.deleteIntent);
        PendingIntent pendingIntent = builder.mFullScreenIntent;
        if ((notification.flags & 128) != 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        deleteIntent.setFullScreenIntent(pendingIntent, z14).setNumber(builder.mNumber).setProgress(builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate);
        Notification.Builder builder2 = this.mBuilder;
        IconCompat iconCompat = builder.mLargeIcon;
        if (iconCompat == null) {
            icon = null;
        } else {
            icon = iconCompat.toIcon(context);
        }
        Api23Impl.setLargeIcon(builder2, icon);
        this.mBuilder.setSubText(builder.mSubText).setUsesChronometer(builder.mUseChronometer).setPriority(builder.mPriority);
        NotificationCompat.Style style = builder.mStyle;
        if (style instanceof NotificationCompat.CallStyle) {
            Iterator<NotificationCompat.Action> it = ((NotificationCompat.CallStyle) style).getActionsListWithSystemActions().iterator();
            while (it.hasNext()) {
                addAction(it.next());
            }
        } else {
            Iterator<NotificationCompat.Action> it2 = builder.mActions.iterator();
            while (it2.hasNext()) {
                addAction(it2.next());
            }
        }
        Bundle bundle = builder.mExtras;
        if (bundle != null) {
            this.mExtras.putAll(bundle);
        }
        int i12 = Build.VERSION.SDK_INT;
        this.mContentView = builder.mContentView;
        this.mBigContentView = builder.mBigContentView;
        this.mBuilder.setShowWhen(builder.mShowWhen);
        Api20Impl.setLocalOnly(this.mBuilder, builder.mLocalOnly);
        Api20Impl.setGroup(this.mBuilder, builder.mGroupKey);
        Api20Impl.setSortKey(this.mBuilder, builder.mSortKey);
        Api20Impl.setGroupSummary(this.mBuilder, builder.mGroupSummary);
        this.mGroupAlertBehavior = builder.mGroupAlertBehavior;
        Api21Impl.setCategory(this.mBuilder, builder.mCategory);
        Api21Impl.setColor(this.mBuilder, builder.mColor);
        Api21Impl.setVisibility(this.mBuilder, builder.mVisibility);
        Api21Impl.setPublicVersion(this.mBuilder, builder.mPublicVersion);
        Api21Impl.setSound(this.mBuilder, notification.sound, notification.audioAttributes);
        if (i12 < 28) {
            listCombineLists = combineLists(getPeople(builder.mPersonList), builder.mPeople);
        } else {
            listCombineLists = builder.mPeople;
        }
        if (listCombineLists != null && !listCombineLists.isEmpty()) {
            Iterator it3 = listCombineLists.iterator();
            while (it3.hasNext()) {
                Api21Impl.addPerson(this.mBuilder, (String) it3.next());
            }
        }
        this.mHeadsUpContentView = builder.mHeadsUpContentView;
        if (builder.mInvisibleActions.size() > 0) {
            Bundle bundle2 = builder.getExtras().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i13 = 0; i13 < builder.mInvisibleActions.size(); i13++) {
                bundle4.putBundle(Integer.toString(i13), NotificationCompatJellybean.getBundleForAction(builder.mInvisibleActions.get(i13)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            builder.getExtras().putBundle("android.car.EXTENSIONS", bundle2);
            this.mExtras.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i14 = Build.VERSION.SDK_INT;
        Object obj = builder.mSmallIcon;
        if (obj != null) {
            Api23Impl.setSmallIcon(this.mBuilder, obj);
        }
        this.mBuilder.setExtras(builder.mExtras);
        Api24Impl.setRemoteInputHistory(this.mBuilder, builder.mRemoteInputHistory);
        RemoteViews remoteViews = builder.mContentView;
        if (remoteViews != null) {
            Api24Impl.setCustomContentView(this.mBuilder, remoteViews);
        }
        RemoteViews remoteViews2 = builder.mBigContentView;
        if (remoteViews2 != null) {
            Api24Impl.setCustomBigContentView(this.mBuilder, remoteViews2);
        }
        RemoteViews remoteViews3 = builder.mHeadsUpContentView;
        if (remoteViews3 != null) {
            Api24Impl.setCustomHeadsUpContentView(this.mBuilder, remoteViews3);
        }
        if (i14 >= 26) {
            Api26Impl.setBadgeIconType(this.mBuilder, builder.mBadgeIcon);
            Api26Impl.setSettingsText(this.mBuilder, builder.mSettingsText);
            Api26Impl.setShortcutId(this.mBuilder, builder.mShortcutId);
            Api26Impl.setTimeoutAfter(this.mBuilder, builder.mTimeout);
            Api26Impl.setGroupAlertBehavior(this.mBuilder, builder.mGroupAlertBehavior);
            if (builder.mColorizedSet) {
                Api26Impl.setColorized(this.mBuilder, builder.mColorized);
            }
            if (!TextUtils.isEmpty(builder.mChannelId)) {
                this.mBuilder.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i14 >= 28) {
            Iterator<Person> it4 = builder.mPersonList.iterator();
            while (it4.hasNext()) {
                Api28Impl.addPerson(this.mBuilder, it4.next().toAndroidPerson());
            }
        }
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 29) {
            Api29Impl.setAllowSystemGeneratedContextualActions(this.mBuilder, builder.mAllowSystemGeneratedContextualActions);
            Api29Impl.setBubbleMetadata(this.mBuilder, NotificationCompat.BubbleMetadata.toPlatform(builder.mBubbleMetadata));
            LocusIdCompat locusIdCompat = builder.mLocusId;
            if (locusIdCompat != null) {
                Api29Impl.setLocusId(this.mBuilder, locusIdCompat.toLocusId());
            }
        }
        if (i15 >= 31 && (i11 = builder.mFgsDeferBehavior) != 0) {
            Api31Impl.setForegroundServiceBehavior(this.mBuilder, i11);
        }
        if (builder.mSilent) {
            if (this.mBuilderCompat.mGroupSummary) {
                this.mGroupAlertBehavior = 2;
            } else {
                this.mGroupAlertBehavior = 1;
            }
            this.mBuilder.setVibrate(null);
            this.mBuilder.setSound(null);
            int i16 = notification.defaults & (-4);
            notification.defaults = i16;
            this.mBuilder.setDefaults(i16);
            if (i15 >= 26) {
                if (TextUtils.isEmpty(this.mBuilderCompat.mGroupKey)) {
                    Api20Impl.setGroup(this.mBuilder, NotificationCompat.GROUP_KEY_SILENT);
                }
                Api26Impl.setGroupAlertBehavior(this.mBuilder, this.mGroupAlertBehavior);
            }
        }
    }

    private void addAction(NotificationCompat.Action action) {
        Icon icon;
        Bundle bundle;
        IconCompat iconCompat = action.getIconCompat();
        if (iconCompat != null) {
            icon = iconCompat.toIcon();
        } else {
            icon = null;
        }
        Notification.Action.Builder builderCreateBuilder = Api23Impl.createBuilder(icon, action.getTitle(), action.getActionIntent());
        if (action.getRemoteInputs() != null) {
            for (android.app.RemoteInput remoteInput : RemoteInput.fromCompat(action.getRemoteInputs())) {
                Api20Impl.addRemoteInput(builderCreateBuilder, remoteInput);
            }
        }
        if (action.getExtras() != null) {
            bundle = new Bundle(action.getExtras());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
        int i11 = Build.VERSION.SDK_INT;
        Api24Impl.setAllowGeneratedReplies(builderCreateBuilder, action.getAllowGeneratedReplies());
        bundle.putInt("android.support.action.semanticAction", action.getSemanticAction());
        if (i11 >= 28) {
            Api28Impl.setSemanticAction(builderCreateBuilder, action.getSemanticAction());
        }
        if (i11 >= 29) {
            Api29Impl.setContextual(builderCreateBuilder, action.isContextual());
        }
        if (i11 >= 31) {
            Api31Impl.setAuthenticationRequired(builderCreateBuilder, action.isAuthenticationRequired());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", action.getShowsUserInterface());
        Api20Impl.addExtras(builderCreateBuilder, bundle);
        Api20Impl.addAction(this.mBuilder, Api20Impl.build(builderCreateBuilder));
    }
}
